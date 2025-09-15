*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${CHROME_BROWSER_PATH}    ${EXECDIR}${/}ChromeForTesting${/}chrome-win64${/}chrome.exe
${CHROME_DRIVER_PATH}     ${EXECDIR}${/}ChromeForTesting${/}chromedriver-win64${/}chromedriver.exe
${URL}                    http://localhost:7272/Lab10/Registration.html

*** Test Cases ***
Register Success:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม
    Input Text    name=firstname     Somsri
    Input Text    name=lastname      Sodsai
    Input Text    name=organization  CS KKU
    Input Text    name=email         somsri@kkumail.com
    Input Text    name=phone         081-001-1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Success

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Success
    Page Should Contain    Thank you for participating in our event

    # ปิด browser
    Close Browser

Register Success No Organization Info:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น Organization
    Input Text    name=firstname     Somsri
    Input Text    name=lastname      Sodsai
    Input Text    name=email         somsri@kkumail.com
    Input Text    name=phone         081-001-1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบข้อความบนหน้า
    Title Should Be    Success
    Page Should Contain    Success
    Page Should Contain    Thank you for participating in our event

    # ปิด browser
    Close Browser

Empty First Name:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น First Name
    Input Text    name=lastname      Sodsai
    Input Text    name=organization  CS KKU
    Input Text    name=email         somsri@kkumail.com
    Input Text    name=phone         081-001-1234
    Set Selenium Speed    0.2s

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter your first name!!

    # ปิด browser
    Close Browser

Empty Last Name:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น Last Name
    Input Text    name=firstname     Somsri
    Input Text    name=organization  CS KKU
    Input Text    name=email         somsri@kkumail.com
    Input Text    name=phone         081-001-1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter your last name!!

    # ปิด browser
    Close Browser

Empty First Name and Last Name
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น First Name & Last Name
    Input Text    name=organization   CS KKU
    Input Text    name=email          somsri@kkumail.com
    Input Text    name=phone          081-001-1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter your name!!

    # ปิด browser
    Close Browser

Empty Email:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น Email
    Input Text    name=firstname     Somsri
    Input Text    name=lastname      Sodsai
    Input Text    name=organization  CS KKU
    Input Text    name=phone         081-001-1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter your email!!

    # ปิด browser
    Close Browser

Empty Phone Number:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม ยกเว้น Phone Number
    Input Text    name=firstname     Somsri
    Input Text    name=lastname      Sodsai
    Input Text    name=organization  CS KKU
    Input Text    name=email         somsri@kkumail.com

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter your phone number!!

    # ปิด browser
    Close Browser

Invalid Phone Number:
    # ตั้งค่า Chrome Options
    ${chrome_options}    Evaluate    sys.modules['selenium.webdriver'].ChromeOptions()    sys
    ${chrome_options.binary_location}    Set Variable    ${CHROME_BROWSER_PATH}
    ${service}    Evaluate    sys.modules["selenium.webdriver.chrome.service"].Service(executable_path=r"${CHROME_DRIVER_PATH}")
    Set Selenium Speed    0.2s
    
    # เปิด Browser
    Create Webdriver    Chrome    options=${chrome_options}    service=${service}
    Go To    ${URL}

    # กรอกฟอร์ม แต่ใส่เบอร์โทรผิดรูปแบบ
    Input Text    name=firstname     Somsri
    Input Text    name=lastname      Sodsai
    Input Text    name=organization  CS KKU
    Input Text    name=email         somsri@kkumail.com
    Input Text    name=phone         1234

    # กดปุ่ม Register
    Click Button    Register

    # ตรวจสอบ Title
    Title Should Be    Event Registration

    # ตรวจสอบข้อความบนหน้า
    Page Should Contain    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678)

    # ปิด browser
    Close Browser
