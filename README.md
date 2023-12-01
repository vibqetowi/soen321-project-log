# Writeups for our Android app analysis for SOEN 321 

# Broken Apps
- [Dream AI](https://play.google.com/store/apps/details?id=com.dreamai.virtual.girlfriend)
- [AI Girlfriend](https://play.google.com/store/apps/details?id=ai.girlfriend)
- [AI Anna](https://play.google.com/store/apps/details?id=com.aigirlfriend.anna)


# Dismissed Apps
- [LoveGPT](https://play.google.com/store/apps/details?id=com.kodrak.aidreamgirls)
  - Reason: It requires a Google account, which needs a phone number, and we refuse to use our own as Google can detect fakes.
- [Wysa](https://play.google.com/store/apps/details?id=bot.touchkin&hl=en&gl=US)
  - Reason: Attampts to connect to google playstore constantly, can't run with current emulator setup, will still attempt static analysis using mobsf though.

# Working Apps
## [Replika AI](https://play.google.com/store/apps/details?id=ai.replika.app)
### Static Analysis: 
- Virus total returns clean on every vendor
## [EVA AI](https://play.google.com/store/apps/details?id=com.ifriend.app)
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


### General Observations
## ???
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

## [SuperBetter](https://play.google.com/store/apps/details?id=com.superbetter.paid)


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
- **MobSF Instructions with Docker (Minh)**:
  1. Install Docker `winget/brew/apt install docker`
  2. Verify Docker with `docker --version`.
  3. Run `docker pull opensecurity/mobile-security-framework-mobsf:latest` to create a container.
  4. Run `emulator -writable-system -avd Pixel_2_XL_API_28` to launch the AVD.
  5. Run `adb devices` to get the ID of the AVD (in the form of "emulator-[number]").
  6. Run `docker run -it --rm -p 8000:8000 -p 1337:1337 -e MOBSF_ANALYZER_IDENTIFIER=<emulator_id> opensecurity/mobile-security-framework-mobsf:latest`.
     (Emulator_id was obtained in step 5)
  7. MobSF will launch at `localhost:8000`, and static and dynamic analyzers should work.
