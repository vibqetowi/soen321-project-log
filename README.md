# Not Working
- Dream AI
- AI Girlfriend
- AI Anna

# Working
## EVA AAI
## iGirl
## HER ai
- General observations
    - seems to process on device as chatting generates no burp traffic
    - interesting behaviour: completely refuses naughty talks instead of prompting you to pay like most apps
## SuperBetter
- VirusTotal:
    - every security vendor returns clean except one, this could be a false positive ![Alt text](images/image-2.png)
- Burp Suite:
    - this app sends verything including password in plaintext during registration 
    ![Alt text](/images/image.png)
## ???
- Burp Suite:
    -  this app sends chat queries and responses in plaintext
    ![Alt text](/images/image-1.png)
# Dismissed:
- LoveGPT
    - Reason: need Google account, which requires a phone number, we refuse to use our own and google can detect fakes
____________

# Resources:
## Burp Suite:
- Working Pixel 7 Pro and API 30: https://blog.yarsalabs.com/setting-up-burp-for-android-application-testing/ 
- Working Pixel 2XL API 28: https://archive.is/dUpPZ 
## MobSF 
- ### docs: https://mobsf.github.io/docs/#/ 
- ###  MobSF instructions with Genymotion:
    1. Run Docker Desktop.

    2. Clone the MobSF docker image with the following command in your terminal:
    
        ```
        docker pull opensecurity/mobile-security-framework-mobsf:latest
        ```

    3. Install Genymotion (with VirtualBox) from [https://www.genymotion.com/download/](https://www.genymotion.com/download/).

    4. Create an account for personal use on Genymotion.

    5. Create a virtual device in Genymotion with Android 9.0 as the OS. You can allocate more memory to it for better performance.

    6. When the device is built, run it, and a new window should appear.

    7. Find the IP address on the window's title (e.g., 192.168.119.101:5555).

    8. Run the MobSF Docker image with this command in your terminal, replacing `<adb device identifier>` with the IP address from Step 7:

        ```
        docker run -it --rm -p 8000:8000 -p 1337:1337 -e MOBSF_ANALYZER_IDENTIFIER=<adb device identifier> opensecurity/mobile-security-framework-mobsf:latest
        ```

    9. Once ready, open your browser and go to localhost:8000 to open MobSF.

    10. Head to the Static Analyzer tab to upload an APK for static analysis, generating a lengthy report that you can export as a PDF.

    11. In the left sidebar of the static analysis report, navigate to Scan Options (second link) and you should see a green START DYNAMIC ANALYSIS button.

    12. Press the START DYNAMIC ANALYSIS button, and MobSF will prepare the virtual device's environment and install the APK on it.

    13. You will then see a copy of the device on your browser. To mirror what's happening on the virtual device to your browser, press SHOW SCREEN.

    14. To start analyzing, press START EXPORTED ACTIVITY TESTER. MobSF will automatically perform actions on the virtual device as if someone were using it.

    15. Once done, also perform TLS/SSL Security Tester.

    16. Export your report when done.