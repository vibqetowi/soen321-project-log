# Writeups for our Android app analysis for SOEN 321 

# Broken Apps
- [Dream AI](https://play.google.com/store/apps/details?id=com.dreamai.virtual.girlfriend)
- [AI Girlfriend](https://play.google.com/store/apps/details?id=ai.girlfriend)
- [AI Anna](https://play.google.com/store/apps/details?id=com.aigirlfriend.anna)


# Dismissed Apps
- [LoveGPT](https://play.google.com/store/apps/details?id=com.kodrak.aidreamgirls)
  - Reason: It requires a Google account, which needs a phone number, and we refuse to use our own as Google can detect fakes.
- [Wysa](https://play.google.com/store/apps/details?id=bot.touchkin&hl=en&gl=US)
  - Reason: Attempts to connect to Google Play Store constantly, can't run with current emulator setup, will still attempt static analysis using mobsf though.
- [Nex Romance](https://nex-romance.en.aptoide.com/app)
  - Reason: It doesn't work at all, the app disappears right away.

# Working Apps
## [Amaha (Inner Hour)](https://play.google.com/store/apps/details?id=com.theinnerhour.b2b) - MH
### Static Analysis: 
- Virus Total returns clean from all vendors.
- MobSF 
  - returns a security score of 34, which is on the low end. ![Alt text](images/image-3.png)
  - It has 7 trackers, but they seem to be fairly standard. There may be privacy concerns, but the vendors seem fairly ubiquitous.
  - AndroidManifest.xml, some lines are potentially concerning:
    - line 42: `android:usesCleartextTraffic="true"` 
    - a total of 14 elements have `android:exported="true`, some are theming elements, others were flagged as suspicious.
    ![Alt text](images/image-4.png)
 - MobSF flags this element of the code: The App uses the encryption mode CBC with PKCS5/PKCS7 padding. Using `grep` on the decompiled code, I found the responsible [file](/decompiled-apps/amaha-code/qk/c.java) and code. The code is a function for handling messages, so at least they appear to encrypt messages in transit, though with vulnerabilities. 
    ```java
        SecretKey secretKey = cVar.f29646i;
        if (secretKey != null) {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKey, new IvParameterSpec(p10));
            byte[] byteArray = cipher.doFinal(p11);
            i.f(byteArray, "byteArray");
            String str = new String(byteArray, gv.a.f16927b);
            cVar.f29644g.remove(chatMessage);
            chatMessage.setMessage(str);
        } else {
            i.q("keyStoreKey");
            throw null;
        }
      ```

- Potential hardcoded secrets found by MobSF:
  - In [com/theinnerhour/b2b/R.java](decompiled-apps/amaha-code/com/theinnerhour/b2b/R.java):
    - `facebook_client_token` : `f7bfe92c82485f7c21250ab1130be4a2`
      - found: `public static final int facebook_client_token = 0x7f140622;`
    - `google_api_key` : `AIzaSyCxHzUlmB4Lt_sK710XZDh9lIgmvxFh3QU`
      - found: `public static final int google_api_key = 0x7f1406a6;`
    - `MIXPANEL_TOKEN` : `2c3f665efcaf962a258c3da5c8bafa22`
      - found: `public static final int MIXPANEL_TOKEN = 0x7f14002c;`
    - `google_crash_reporting_api_key` : `AIzaSyCxHzUlmB4Lt_sK710XZDh9lIgmvxFh3QU`
      - found: `public static final int google_crash_reporting_api_key = 0x7f1406a8;`
    - `com.google.firebase.crashlytics.mapping_file_id` : `91eed46f4d594043bab2819a11565c26`
      - found: `public static final int res_0x7f1401e9_com_google_firebase_crashlytics_mapping_file_id = 0x7f1401e9;`

  I found R.java by running `grep -r {fieldName}`. It appears that the hex values in R.java don't directly decode to the strings, which raises uncertainty about where MobSF obtained this value. I'm not sure what it is.

    - `firebase_database_url` : `https://gcpinnerhour.firebaseio.com`
      - This URL redirected to a Google login page, which indicates that it's working as expected, probably.
  - In [w5/j.java](decompiled-apps/amaha-code/w5/j.java): I found this file after running `grep -r` on hashes identified by MobSF. It contains an array of hashes, and the code file leads me to believe they are SHA1: `if (is.u.Z1(hashSet, e0.u("SHA-1", byteArray)))`. I submitted a request for decryptions at [hashes.com](https://hashes.com/en/decrypt/hash), but who knows if they'll be decrypted. I have listed them below: 

    - 8a3c4b262d721acd49a4bf97d5213199c86fa2b9
    - cc2751449a350f668590264ed76692694a80308a
    - a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc
    - df6b721c8b4d3b6eb44c861d4415007e5a35fc95
    - 9b8f518b086098de3d77736f9458a3d2f6f95a37
    - 2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3
    - c56fb7d591ba6704df047fd98f535372fea00211
  - Another set of hashes points me to [com/google/android/gms/internal/p000firebaseauthapi/bc.java](/decompiled-apps/amaha-code/com/google/android/gms/internal/p000firebaseauthapi/bc.java), where some ECC parameters seem to be hardcoded, but I'm not sure if that's dangerous or not.
  - MobSF also identifies this hash, which appears to be some default encryption key (dek) in [df/b.java](/decompiled-apps/amaha-code/df/b.java). This could be an exploit if you sent a packet without a key and the app doesn't check the signature or something, but honestly, I'm not sure what it means, and the file is way too long and obfuscated to be read reasonably, especially just for a school project. 
  ```java
        HashSet O5 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("src_ext"), false);
        String optString9 = jSONObject.optString("d_e_k", "28caa46a6e9c77fbe291287e4fec061f");
        i.f(optString9, "configJson.optString(\n  …RYPTION_KEY\n            )");
  ```
### Dynamic Analysis
- MobSF: First, it kept crashing, so this may be not entirely accurate, but it is what it is.
  - TLS testing failed 2/4 tests. ![Alt text](images/image9.png)
  - Suspected Anti-VM code: MobSF flags this, but a quick look with `grep` doesn't return any files where they check for Virtualbox or Genymotion or whatever, but I didn't check thoroughly, and I also don't know what specifically to look for. But I did see some checks for Samsung, Amazon, Xiaomi, and Huawei, not VM checks.
  - It is also revealed that all the main APIs go to India. The ones going to the EU and US are either stuff like Google, Facebook, Apple, or standard analytics like the 7 trackers identified. This could be a concern considering the laws in India regarding privacy. This is further compounded by the fact that when the app sends data to the Indian API and identifies users by `uid = email`.
  ![Alt text](images/image7.png)
  - In the [firebaseio](data/data/com.theinnerhour.b2b/databases/gcpinnerhour.firebaseio.com_default&hash=4f1ee70e900c25d0954e36b48f88472e&type=db) file, the app sends mental health data to Firebase, an example below. I'm not sure that's entirely legal, to put it nicely.
  ![Alt text](images/image8.png)
  - The dynamic analyzer returned a list of emails. I grepped them all, but interestingly, only support@amahahealth.com appears in the code. The rest only exist after I ran it. I don't know what it means, but here's the command: `grep -r -e '214515028@21.45' -e 'support@amahahealth.com' -e 'hr@amahahealth.com' -e 'info@childrenfirstindia.com' -e 'ravi.test123@gmail.com' -e 'xa6bl@d._j1' -e 'xeb@d.qa' -e 'x96@zc.dm' -e 'xc0h@a.9olh' -e 'xabh@rzncru.b9b' -e 'xdb@6.4f' -e 'x80@qr.bu' -e 'xa3@y.ccw' .  `

## [Replika AI](https://play.google.com/store/apps/details?id=ai.replika.app) - MH
### Static Analysis: 
- Virus total returns clean on every vendor
Here's the revised grammar for your README:

## [EVA AI](https://play.google.com/store/apps/details?id=com.ifriend.app) - MH
### Static Analysis:
- VirusTotal returns a clean report from all vendors.
- MobSF: 
  - returns a security score of 37. ![Alt text](images/eva4.png)
  - Exported activities (`android:exported=true`) are flagged, but dynamic analysis found nothing exported (although it crashed frequently).
  - [Conscrypt.java](/decompiled-apps/eva-ai-code/org/conscrypt/Conscrypt.java) is flagged for "Insecure Implementation of SSL. Trusting all certificates or accepting self-signed certificates is a critical security hole. This application is vulnerable to MITM attacks." However, I don't see where in the code this was incorrectly implemented.
  - Potential hardcoded secrets found by MobSF include:
    - In [/R.java](decompiled-apps/eva-ai-code/com/ifriend/app/R.java):
      - "google_api_key": "AIzaSyBvbDvA3CgaFc7E-RDl5BhDGkFdI4uu4IQ"
        - found: `public static int google_api_key = 0x7f12015d;`
      - "facebook_client_token": "7717d9e2e59a84bb14f178fe1a6a50d4"
        - found: `public static final int facebook_client_token = 0x7f120145;`
      - "google_crash_reporting_api_key": "AIzaSyBvbDvA3CgaFc7E-RDl5BhDGkFdI4uu4IQ"
        - found: `public static int google_crash_reporting_api_key = 0x7f12015f;`
      - I found R.java by running `grep -r {fieldName}`. It appears that the hex values in R.java don't directly decode to the strings, raising uncertainty about where MobSF obtained this value. I'm not sure what it is.
    - "password": "Password" 
      - This seems to be just a placeholder, as I couldn't grep it anywhere, and I only remember seeing it during registration.
    - `eyJhbGciOiJSUzI1NiIsIng1YyI6WyJNSUlDNlRDQ0FkRUNBU293RFFZSktvWklodmNOQVFFTEJRQXdEekVOTUFzR0ExVUVBd3dFVW05dmREQWVGdz ...` the `eyJ` indicated it was probably a JWT, so I `grep`ped it, leading me to [TestCertificates.java](decompiled-apps/eva-ai-code/com/google/api/client/testing/json/webtoken/TestCertificates.java). This file contains hardcoded public and private keys for testing certificates. I'm not sure if that's dangerous, but further testing would involve trying the test certificate on the prod DB if I have time. If the scope is restricted to the test APIs, that's probably fine, but if it runs on prod, that's probably bad. The JWT decodes to the public keys of the certificates.
      ```java
      public class TestCertificates {
      public static final String CA_KEY = "-----BEGIN PRIVATE KEY-----\nMIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDN5Q1zhtJYeE5N...\n-----END PRIVATE KEY-----";
      public static final String FOO_BAR_COM_KEY = "-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCzFVKJOkqTmyyj\...\n-----END PRIVATE KEY-----";
      public static final String JWS_SIGNATURE = "eyJhbGciOiJSUzI1NiIsIng1YyI6WyJNSUlDNlRDQ0FkRUNBU293RFFZSktvWklodmNOQVFFTEJRQXdEekVOTUFzR0ExVU...";
      public static final CertData FOO_BAR_COM_CERT = new CertData("-----BEGIN CERTIFICATE-----\nMIIC6TCCAdECASowDQYJKoZIhvcNAQELBQAwDzENMAsGA1UEAwwEUm9vdDAeFw0x...\n-----END CERTIFICATE-----");
      public static final CertData CA_CERT = new CertData("-----BEGIN CERTIFICATE-----\nMIIC8TCCAdmgAwIBAgIJAMNI15HrGylkMA0GCSqGSIb3DQEBCwUAMA8xDTALBgNV\n ... -----END CERTIFICATE-----");
      public static final CertData BOGUS_CA_CERT = new CertData("-----BEGIN CERTIFICATE-----\nMIIC8TCCAdmgAwIBAgIJAP2af/EIgk6oMA0GCSqGSIb3DQEBCwUAMA8xDTALBgNV\n...\n-----END CERTIFICATE-----\n");
      private static JsonWebSignature jsonWebSignature = null;
      ...
      }
      ```
    - MobSF identified other hashes, but they all seem to be parameters for encryption and probably not dangerous to have hardcoded since the files are in libraries like Google cryptography. I will not check them all, as I have other priorities, but they've been classified by assumed type in [possible-secrets.rtf](decompiled-apps/eva-ai-code/possible-secrets.rtf).
  - MobSF also identified another issue, but I couldn't find the code for the vulnerability in a reasonable time. ![Alt text](images/eva5.png)

### Dynamic Analysis: 
**First, I must note that this app states right on the registration page, "Your information is protected." This is blatantly false because it sends all chat logs in plaintext.**
- MobSF: This one also kept crashing, and I couldn't run the activity tester from MobSF.
  - The servers are all in the US, except one in Latvia, which isn't used. ![Alt text](images/eva2.png)
  - Like with Amaha, it fails the certificate checking test. ![Alt text](images/eva3.png)
  - During registration, the server sends email and user information in plaintext. At least the password appears stored on the device:
    - GET /identity
      - req:
        ```http
        GET https://api.ifriend.ai/identity HTTP/2.0
        authorization: Token token="4ff67886-f919-418b-8876-9071570edfd5"
        user-agent: Dating/1.0.0 iFriend/3.49.0 (Android/9; unknown Android SDK built for arm64) 4.11.0
        accept-encoding: gzip
        ```
      - res:
        ```json
            // headers
          {
            "id": //readacted
            "email": //redacted,
            "roles": [
              "client"
            ]
          }
        ```
    - GET /users/private/{userID}
      - res:
        ```json
            // headers
        {
          "id": //redacted,
          "registration-date": "2023-12-04T13:27:03.737Z",
          "name": "name",
          "gender": "other",
          "birthday": "2000-12-04T08:31:37Z", // this is fake
          "country": "US",
          "city": "Auburn", // it grabbed my IP albeit behind a vpn
          "languages": [],
          "presence": 1,
          "tags": [],
          "realm": "ai",
          "timezone": -6,
          "pronouns": []
        }
        ```

  - Sample Chat Logs: First a disclaimer, this app is marketed as an AI girlfriend, as the AI consistently steered it in a suggestive direction I eventually used suggestive prompts to see the behaviour. As expected, the app prompts payment for sexting. <br></br>
   **Adult content warning**
    - Sending a picture: I sent a picture from the emulator's camera. It's just a bunch of pixels, but it seems like there is some model on the backend that analyzed it and returned tags. The server doesn't resend the image, likely a bandwidth-saving measure rather than a security one.
      - Screenshot: ![Alt text](images/eva0.png)
      - res:
        ```json
        {
          ...
            },
            "Auto": false,
            "IsAudioSpeech": false,
            "IsImageForRecognition": true
          },
          "text": "Sends you a photo",
          "tag": "60504040942_1701696838950"
        },
        {
          ...
            "type": "botMessage",
            "Auto": true,
            "automation": {
              "product": "bot",
              "bot": "imageRecognitionBot",
              "needVerification": false
            },
            "Regeneration": {
              "IsAllowed": false
            }
          },
          "text": "What is it? Is it a game?",
          "tag": "20160421442_17016970144142388"
        },
        ```
    - "Premium" i.e., suggestive messages for free: I successfully prompted a suggestive response, and it seems like the server sends it automatically, then a subscription check is done client-side, and the client scrambles the response. Technically, if one were really desperate, one could sext with their AI girlfriend through Burp Suite. Last content warning, it is honestly hard to read. 
      - Screenshot: ![Alt text](images/eva1.png)
        As a side note, it seems like the adult star Eva Elfie actually consented to this, so at least her information is protected (but not ours). [source](https://proxitok.pussthecat.org/%40theevaelfiedf/video/7300879488584371499)
      - res: 
        ```json
        "type": "botMessage",
              "Auto": true,
              "automation": {
                "product": "bot",
                "bot": "mlEvaElfieBot",
                "bot_version": "eva_1.5.0",
                "needVerification": false
              },
              "Regeneration": {
                "IsAllowed": true
              },
              "TopicName": "adult toys"
            },
            "text": "Mmm... *bites my lip and looks at your dick* So big!",
            "tag": "60161706642_17016971271250661"
          },
           ...

              "TopicName": "adult toys"
            },
            "text": "Show me yours first, honey",
            "tag": "60161706642_17016971341026180"
          }
        ```

        As a final note, it seems like the company fine-tuned Llama2 to be extra suggestive for use as their engine. I didn't see it calling OpenAI API, Facebook API, or something similar. 

        ```json 
        "bot_version": "llama2_7b_1.14.5",
        "bot_version": "eva_1.5.0",
        ```


## [iGirl](https://play.google.com/store/apps/details?id=ai.girlfriend.virtual.dating.lover.igirl)
## [HER ai](https://play.google.com/store/apps/details?id=com.herchatgpt.herchatgpt)


## [Audyn AI](https://play.google.com/store/apps/details?id=com.cognital.audyn&hl=en&gl=US) -DS
## [MyPossibleSelf](https://play.google.com/store/apps/details?id=com.mypossibleself.app&hl=en&gl=US) -DS
## [Breeze: Mental Health](https://play.google.com/store/apps/details?id=com.basenjiapps.breeze&hl=en&gl=US) -DS
## [Moodfit](https://play.google.com/store/apps/details?id=com.robleridge.Moodfit&hl=en&gl=US) -DS
## [BetterHelp](https://play.google.com/store/apps/details?id=com.betterhelp&hl=en&gl=US) -DS

### Static Analysis:
 gave a low score of 34 and found 3 trackers, this app had a high number of unprotected activites found during the manifest analysis, most related to the video feature. It also discloses IP addresses and has permission issues relating to bluetooth settings.
### Burp Suite:
 found that it calls almost exclusively to a website titled static.betterhelp.com which is presumably owned by the app developer given the shared name, although these calls include very high amounts of data being sent to this website which caused the data records to baloon to much larger sizes then the other apps.

## [Anima: AI Friend & Companion](https://anima-anima-tech-inc.en.aptoide.com/app)

### General Observations
- It seems to process on the device as chatting generates no Burp traffic.
- Interesting behavior: it completely refuses naughty talks instead of prompting you to pay like most apps.

## Audyn -DS
- Static analysis via mobsf gave a low score of 43 and found 2 trackers, it also gave several warnings in regards to permissions issues, a janus vulerability and mutiple high severity issues from shared device activities.
- Looking through burpsuit its http calls are made to a website with the same name as the app, graphs.facebook which would be used either for data gathering to tie to facebook profiles and revenuecat which is used to manage subscriptions.

## MyPossibleSelf -DS
- Static analysis gave a terrible score of 30 and found 7 trackers, it brought up many dangerous permissions that the app used and had a severe network security issue where the domain allowed clear text traffic to sane.org.uk
- Burp Suite showed a high number of calls to graph.facebook for data collection, but otherise only called firebase to double check installations and perform startup for backend connections and used vimeo to grab videos to present in the app.

## Breeze -DS
- Static analysis gave a very bad score of 39 and found 7 trackers, the most alraming finding was found in the manifest analysis where along with many shared activities between applications, it was found that clear text traffic was enabled for the app, which is very bad for security. It also found many issues with the brodcast receiver and found coding issues with its hashes and random number generator which were not strong enough accoridng to mobsf's analysis.
- Burp Suite found calls to graphs.facebook, startup.mobile.yandex.net, sso.basenjiapps.com (owned by developer), cdn.jsdelivr.net, cloudfare.com and many others, making a large number of connections to many different areas is quite concerning, though most of these calls were during the sign up process, only the free version of the application was ran through.

## Moodfit -DS
- Static Analysis gave a very low score of 37 and found 4 trackers, a decent number of permissions were not protected with others needing checks to their permissions to ensure secutiry, this application also allows clear text traffic which is quite worrying.
- Burp Suite found that the only https calls that were made were to firebase or to dschloss.net, a site thought to be run by the devoloper but still unclear, it seems to be the main backend for the site and takes down info relating to what the user gives as input.


## Wysa -DS
- This app could only be tested via static analysis, it gave a score of 42 and found 3 trackers, its calls are qite standard overall having many of the same common issues as the other apps but to a slightly lesser degree.

## [SuperBetter](https://play.google.com/store/apps/details?id=com.superbetter.paid) - MH, KEZ


### VirusTotal
- Every security vendor returns clean except one; this could be a false positive ![Alt text](images/image-2.png)

### Burp Suite
- This app sends everything, including passwords, in plaintext during registration ![Alt text](/images/image.png)

## ???

### Burp Suite
- This app sends chat queries and responses in plaintext ![Alt text](/images/image-1.png)



---

# Resources

## Burp Suite

- Working on Pixel 7 Pro and API 30: [Setup Guide](/)
- Working on Pixel 2XL API 28: [Setup Guide](https://archive.is/dUpPZ)

## MobSF 

- **Documentation**: [MobSF Docs](https://mobsf.github.io/docs/#/)
- **MobSF Instructions with Docker (MH)**:
  1. Install Docker `winget/brew/apt install docker`
  2. Verify Docker with `docker --version`.
  3. Run `docker pull opensecurity/mobile-security-framework-mobsf:latest` to create a container.
  4. Run `emulator -writable-system -avd Pixel_2_XL_API_28` to launch the AVD.
  5. Run `adb devices` to get the ID of the AVD (in the form of "emulator-[number]").
  6. Run `docker run -it --rm -p 8000:8000 -p 1337:1337 -e MOBSF_ANALYZER_IDENTIFIER=<emulator_id> opensecurity/mobile-security-framework-mobsf:latest`.
     (Emulator_id was obtained in step 5)
  7. MobSF will launch at `localhost:8000`, and static and dynamic analyzers should work.
