# นายสุทธิภัทร รสหอม 663380241-1 sec.1

from flask import Flask, request
from flask_restful import Resource, Api
from flasgger import Swagger

app = Flask(__name__)
api = Api(app)
swagger = Swagger(app)

# Initial data
MoviePortal = [
    {
        "playlist_id": 1,
        "playlist_name": "datenight",
        "movie_list": ["The Notebook", "50 First Dates", "A Walk to Remember"]
    },
    {
        "playlist_id": 2,
        "playlist_name": "action",
        "movie_list": ["Die Hard", "Mad Max: Fury Road", "John Wick"]
    },
    {
        "playlist_id": 3,
        "playlist_name": "comedy",
        "movie_list": ["Superbad", "Step Brothers", "The Hangover"]
    }
]

class MovieService(Resource):
    def get(self):
        """
        Get all movie playlists
        ---
        responses:
          200:
            description: A list of movie playlists
        """
        return MoviePortal, 200

    def post(self):
        """
        Add a new movie playlist
        ---
        parameters:
          - in: body
            name: playlist
            required: true
            schema:
              id: Playlist
              required:
                - playlist_name
                - movie_list
              properties:
                playlist_name:
                  type: string
                  description: Name of the playlist
                movie_list:
                  type: array
                  items:
                    type: string
                  description: List of movies in the playlist
        responses:
          201:
            description: Playlist created
          400:
            description: Invalid input
        """

        new_id = MoviePortal[-1]['playlist_id'] + 1 
        data = request.get_json()
        new_playlist = {
            'playlist_id': new_id,
            'playlist_name': data['playlist_name'],
            'movie_list': data['movie_list']
        }
        MoviePortal.append(new_playlist)
        return new_playlist, 201

class PlayListByName(Resource):
    def get(self, name):
        """
        Get a playlist by name
        ---
        parameters:
          - name: name
            in: path
            type: string
            required: true
            description: The name of the playlist to search
        responses:
          200:
            description: Found the playlist
          404:
            description: Playlist not found
        """
        for playlist in MoviePortal:
            if playlist['playlist_name'].lower() == name.lower():
                return playlist, 200

        return {'message': 'Playlist not found'}, 404


# Routes
api.add_resource(MovieService, '/playlists')
api.add_resource(PlayListByName, '/playlists/<string:playlist_name>')

# Run the app
if __name__ == '__main__':
    app.run(debug=True)
