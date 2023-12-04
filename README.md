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
- Virus Total returns clean from all vendors
- MobSF 
  -  returns a security score of 34: ![Alt text](images/image-3.png)
  - It has 7 trackers but they seem to be fairly standard, I've seen these before ![Alt text](images/image-5.png)
  - AndroidManifest.xml, some lines are potentially concerning
    - line 42: `android:usesCleartextTraffic="true" ` 
    - a total of 14 elements have `android:exported="true`, some are theming elements, others were flagged as suspicious
    ![Alt text](images/image-4.png)
 - MobSF flags this element of the code: The App uses the encryption mode CBC with PKCS5/PKCS7 padding. Using `grep` on the decompiled code, I found the responsible [file](/decompiled-apps/amaha-code/qk/c.java) and code. The code is a function for handling messages so at least they appear to encrypt messages in thransit though with vulnerabilities. 
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

  I found R.java by running `grep -r {fieldName}`. It appears that the hex values in R.java don't directly decode to the strings, which raises uncertainty about where MobSF obtained this value. I'm not sure what it is

    - `firebase_database_url` : `https://gcpinnerhour.firebaseio.com`
      - This URL redirected to a Google login page, which indicates that it's working as expected probably.
  - In [w5/j.java](decompiled-apps/amaha-code/w5/j.java ): I found this file after running `grep -r` on hashes identified by MobSF. It contains an array of hashes and the code file leads me to believe they are SHA1: `if (is.u.Z1(hashSet, e0.u("SHA-1", byteArray)))`. I submitted a request for decryptions at [hashes.com](https://hashes.com/en/decrypt/hash) but who knows if they'll be decrypted. I have listed them below: 

    - 8a3c4b262d721acd49a4bf97d5213199c86fa2b9
    - cc2751449a350f668590264ed76692694a80308a
    - a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc
    - df6b721c8b4d3b6eb44c861d4415007e5a35fc95
    - 9b8f518b086098de3d77736f9458a3d2f6f95a37
    - 2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3
    - c56fb7d591ba6704df047fd98f535372fea00211
  - Another set of hashes points me to [com/google/android/gms/internal/p000firebaseauthapi/bc.java](/decompiled-apps/amaha-code/com/google/android/gms/internal/p000firebaseauthapi/bc.java) where some ECC parameters seem to be hardcoded but I'm not sure if that's dangerous or not
  - MobSF also identifies this hash which appears to be some default encryption key (dek) in [df/b.java](/decompiled-apps/amaha-code/df/b.java). This could be an exploit if you sent a packet without key and the app doesn't check signature or something but honestly I'm not sure what it means and the file is way too long and obfuscated to be read reasonably especiaylly jsut for a school project 
  ```java
        HashSet O5 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("src_ext"), false);
        String optString9 = jSONObject.optString("d_e_k", "28caa46a6e9c77fbe291287e4fec061f");
        i.f(optString9, "configJson.optString(\n  …RYPTION_KEY\n            )");
  ```
### Dynamic Analysis
- MobSF: First it kept crashing so this may be not entirely accurate but it is what it is
  - Suspected Anti-VM code: MobSF flags this but a quick look with `grep` doesn't return any files where they check for Virtualbox or Genymotion or whatever but I didnt check thoroughly and I also dont know what specifically to loook for. but i did see some checks for samsung, amazon xiaomi and huawei, not vm checks
  ![Alt text](images/image6.png)
  - It is also revealed that all the main APIs go to India. The ones going to the EU and US are either stuff like Google, Facebook, Apple or standard analytics like the 7 trackers identified. This could be a concern considering the laws in india regarding privacy. This is further compounded by the fact that when the app sends data to the indian api and identifies users by `uid = email`
  ![Alt text](images/image7.png)
  - In the [firebaseio](data/data/com.theinnerhour.b2b/databases/gcpinnerhour.firebaseio.com_default&hash=4f1ee70e900c25d0954e36b48f88472e&type=db) file, the app sends mental health data to firebase, an example below. I'm not sure that's entirely legal to put it nicely.
  ![Alt text](images/image8.png)

## [Replika AI](https://play.google.com/store/apps/details?id=ai.replika.app) - MH
### Static Analysis: 
- Virus total returns clean on every vendor
## [EVA AI](https://play.google.com/store/apps/details?id=com.ifriend.app) - MH
### Static Analysis:
- VirusTotal returns clean from all vendors
## [iGirl](https://play.google.com/store/apps/details?id=ai.girlfriend.virtual.dating.lover.igirl)
## [HER ai](https://play.google.com/store/apps/details?id=com.herchatgpt.herchatgpt)
## [Audyn AI](https://play.google.com/store/apps/details?id=com.cognital.audyn&hl=en&gl=US)
## [MyPossibleSelf](https://play.google.com/store/apps/details?id=com.mypossibleself.app&hl=en&gl=US)
## [Breeze: Mental Health](https://play.google.com/store/apps/details?id=com.basenjiapps.breeze&hl=en&gl=US)
## [Moodfit](https://play.google.com/store/apps/details?id=com.robleridge.Moodfit&hl=en&gl=US)
## [BetterHelp](https://play.google.com/store/apps/details?id=com.betterhelp&hl=en&gl=US)

### Static Analysis:
 gave a low score of 34 and found 3 trackers, this app had a high number of unprotected activites found during the manifest analysis, most related to the video feature. It also discloses IP addresses and has permission issues relating to bluetooth settings.
### Burp Suite:
 found that it calls almost exclusively to a website titled static.betterhelp.com which is presumably owned by the app developer given the shared name, although these calls include very high amounts of data being sent to this website which caused the data records to baloon to much larger sizes then the other apps.

## [Anima: AI Friend & Companion](https://anima-anima-tech-inc.en.aptoide.com/app)

### General Observations
- It seems to process on the device as chatting generates no Burp traffic.
- Interesting behavior: it completely refuses naughty talks instead of prompting you to pay like most apps.

## Audyn
- Static analysis via mobsf gave a low score of 43 and found 2 trackers, it also gave several warnings in regards to permissions issues, a janus vulerability and mutiple high severity issues from shared device activities.
- Looking through burpsuit its http calls are made to a website with the same name as the app, graphs.facebook which would be used either for data gathering to tie to facebook profiles and revenuecat which is used to manage subscriptions.

## MyPossibleSelf
- Static analysis gave a terrible score of 30 and found 7 trackers, it brought up many dangerous permissions that the app used and had a severe network security issue where the domain allowed clear text traffic to sane.org.uk
- Burp Suite showed a high number of calls to graph.facebook for data collection, but otherise only called firebase to double check installations and perform startup for backend connections and used vimeo to grab videos to present in the app.

## Breeze
- Static analysis gave a very bad score of 39 and found 7 trackers, the most alraming finding was found in the manifest analysis where along with many shared activities between applications, it was found that clear text traffic was enabled for the app, which is very bad for security. It also found many issues with the brodcast receiver and found coding issues with its hashes and random number generator which were not strong enough accoridng to mobsf's analysis.
- Burp Suite found calls to graphs.facebook, startup.mobile.yandex.net, sso.basenjiapps.com (owned by developer), cdn.jsdelivr.net, cloudfare.com and many others, making a large number of connections to many different areas is quite concerning, though most of these calls were during the sign up process, only the free version of the application was ran through.

## Moodfit
- Static Analysis gave a very low score of 37 and found 4 trackers, a decent number of permissions were not protected with others needing checks to their permissions to ensure secutiry, this application also allows clear text traffic which is quite worrying.
- Burp Suite found that the only https calls that were made were to firebase or to dschloss.net, a site thought to be run by the devoloper but still unclear, it seems to be the main backend for the site and takes down info relating to what the user gives as input.


## Wysa
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
