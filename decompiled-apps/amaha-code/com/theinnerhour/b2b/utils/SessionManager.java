package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.components.login.model.EmailLoginResponseDataModel;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class SessionManager {
    public static final String ALIAS = "alias";
    private static final String IS_LOGIN = "IsLoggedIn";
    public static final String KEY_ACCESS = "accessToken";
    public static final String KEY_ARTICLE = "articleId";
    public static final String KEY_AUDIO_FILES = "audio_files";
    public static final String KEY_B2B_IS_VERIFIED = "is_verified";
    public static final String KEY_CLIENT = "client";
    public static final String KEY_COMMUNITY_PROFILE = "community_profile";
    public static final String KEY_COMPONENT_VISIBILITY = "component_visibility";
    public static final String KEY_CONTENTTYPE = "contentType";
    public static final String KEY_COUNTRY_CODE = "country_code";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_EXPIRY = "expiry";
    public static final String KEY_FB_TOKEN = "fb_token";
    public static final String KEY_FIRSTNAME = "firstName";
    public static final String KEY_ISONLINE = "isOnline";
    public static final String KEY_LASTNAME = "lastName";
    public static final String KEY_MOBILE = "mobile";
    public static final String KEY_MOBILE_VERIFIED = "mobile_verified";
    public static final String KEY_MYCOUPLESTHERAPIST = "my_couple_therapist";
    public static final String KEY_MYPSYCHIATRIST = "mypsychiatrist";
    public static final String KEY_MYTHERAPIST = "myTherapist";
    public static final String KEY_NAME = "name";
    public static final String KEY_NICKNAME = "nickname";
    public static final String KEY_ORGANISATION_ID = "organization_id";
    public static final String KEY_ORGANISATION_NAME = "organisation_name";
    public static final String KEY_PARTNER_ID = "partner_id";
    public static final String KEY_PASS = "password";
    public static final String KEY_PROFILEPIC = "profilePic";
    public static final String KEY_UID = "uid";
    public static final String KEY_USERID = "userId";
    public static final String KEY_USERTYPE = "userType";
    public static final String KEY_UUID = "uuid";
    private static final String PREF_NAME = "loginPrefs";
    public static SessionManager ourInstance = new SessionManager();
    private String accessToken;
    private String client;
    private String contentType;
    private String expiry;
    private String fbToken;
    private String uid;
    int PRIVATE_MODE = 0;
    private SessionManagerUtils utils = new SessionManagerUtils(this);

    private SessionManager() {
    }

    public static SessionManager getInstance() {
        return ourInstance;
    }

    private void initHeaders() {
        this.accessToken = getStringValue(KEY_ACCESS);
        this.client = getStringValue(KEY_CLIENT);
        this.contentType = getStringValue(KEY_CONTENTTYPE);
        this.expiry = getStringValue(KEY_EXPIRY);
        this.uid = getStringValue(KEY_UID);
        this.fbToken = getStringValue(KEY_FB_TOKEN);
    }

    public void clearData() {
        deleteKey(KEY_EMAIL);
        deleteKey(KEY_PASS);
        deleteKey(IS_LOGIN);
        deleteKey(KEY_ACCESS);
        deleteKey(KEY_CLIENT);
        deleteKey(KEY_CONTENTTYPE);
        deleteKey(KEY_EXPIRY);
        deleteKey(KEY_UID);
        deleteKey(KEY_USERID);
        this.utils.getEditor().clear().apply();
        this.accessToken = null;
        this.client = null;
        this.contentType = null;
        this.expiry = null;
        this.uid = null;
    }

    public void createLoginSession(Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
        this.utils.getEditor().putBoolean(IS_LOGIN, true);
        this.utils.getEditor().putLong(KEY_USERID, l2.longValue());
        this.utils.getEditor().putString(KEY_ISONLINE, str7);
        this.utils.getEditor().putString(KEY_UID, str);
        this.utils.getEditor().putString(KEY_UUID, str2);
        this.utils.getEditor().putString(KEY_PROFILEPIC, str3);
        this.utils.getEditor().putString(KEY_USERTYPE, str6);
        this.utils.getEditor().putString(KEY_FIRSTNAME, str4);
        this.utils.getEditor().putString(KEY_LASTNAME, str5);
        this.utils.getEditor().putString(KEY_NICKNAME, str8);
        this.utils.getEditor().putString(KEY_MOBILE, str9);
        if (!str10.equals("null")) {
            this.utils.getEditor().putString(KEY_COUNTRY_CODE, str10);
        }
        this.utils.getEditor().putBoolean(KEY_MOBILE_VERIFIED, bool.booleanValue());
        this.utils.getEditor().putBoolean(KEY_B2B_IS_VERIFIED, bool2.booleanValue());
        this.utils.getEditor().apply();
    }

    public void deleteKey(String str) {
        this.utils.getEditor().remove(str).apply();
    }

    public HashMap<String, String> fetchHeaders() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("access-token", this.accessToken);
        hashMap.put(KEY_CLIENT, this.client);
        hashMap.put("Content-Type", this.contentType);
        hashMap.put(KEY_UID, this.uid);
        hashMap.put(KEY_EXPIRY, this.expiry);
        hashMap.put(KEY_FB_TOKEN, this.fbToken);
        hashMap.put("Android-Version", this.utils.getVersionCode());
        return hashMap;
    }

    public Boolean getBooleanValue(String str) {
        return Boolean.valueOf(this.utils.getPref().getBoolean(str, false));
    }

    public Long getLongValue(String str) {
        return Long.valueOf(this.utils.getPref().getLong(str, 0L));
    }

    public String getOnline() {
        return this.utils.getPref().getString(KEY_ARTICLE, null);
    }

    public String getPrefName() {
        return PREF_NAME;
    }

    public String getStringValue(String str) {
        return this.utils.getPref().getString(str, "");
    }

    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(KEY_NAME, this.utils.getPref().getString(KEY_NAME, null));
        hashMap.put(KEY_PROFILEPIC, this.utils.getPref().getString(KEY_PROFILEPIC, null));
        return hashMap;
    }

    public boolean isLoggedIn() {
        return this.utils.getPref().getBoolean(IS_LOGIN, false);
    }

    public void parseSessionManagerValues(EmailLoginResponseDataModel emailLoginResponseDataModel) {
        if (emailLoginResponseDataModel != null) {
            this.utils.parseLoginResponse(emailLoginResponseDataModel);
        }
    }

    public void saveArticleId(String str) {
        this.utils.getEditor().putBoolean(IS_LOGIN, true);
        this.utils.getEditor().putString(KEY_ARTICLE, str);
        this.utils.getEditor().apply();
    }

    public void saveHeaders(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str != null && !str.equals("null") && !str.equals("") && str2 != null && !str2.isEmpty()) {
            if (str6 != null) {
                this.fbToken = str6;
                this.utils.getEditor().putString(KEY_FB_TOKEN, str6);
            }
            this.accessToken = str;
            this.utils.getEditor().putString(KEY_ACCESS, str);
            this.utils.getEditor().putBoolean(IS_LOGIN, true);
            this.client = str2;
            this.utils.getEditor().putString(KEY_CLIENT, str2);
            if (str3 != null && !str3.isEmpty()) {
                this.contentType = str3;
                this.utils.getEditor().putString(KEY_CONTENTTYPE, str3);
            }
            if (str4 != null && !str4.isEmpty()) {
                this.expiry = str4;
                this.utils.getEditor().putString(KEY_EXPIRY, str4);
            }
            if (str5 != null && !str5.isEmpty()) {
                this.uid = str5;
                this.utils.getEditor().putString(KEY_UID, str5);
            }
            this.utils.getEditor().apply();
        }
    }

    public void setBooleanValue(String str, Boolean bool) {
        this.utils.getEditor().putBoolean(str, bool.booleanValue());
        this.utils.getEditor().apply();
    }

    public void setLongValue(String str, Long l2) {
        this.utils.getEditor().putLong(str, l2.longValue());
        this.utils.getEditor().apply();
    }

    public void setStringValue(String str, String str2) {
        if (str.equals(KEY_ACCESS) && str2 != null) {
            this.utils.getEditor().putString(str, str2);
            this.utils.getEditor().apply();
            initHeaders();
        } else if (str.equals(KEY_FB_TOKEN) && str2 != null) {
            this.utils.getEditor().putString(str, str2);
            this.utils.getEditor().apply();
            initHeaders();
        } else {
            this.utils.getEditor().putString(str, str2);
            this.utils.getEditor().apply();
        }
    }

    public void setUserLoggedIn(boolean z10) {
        this.utils.getEditor().putBoolean(IS_LOGIN, z10);
        this.utils.getEditor().apply();
    }

    public void setupSessionManager() {
        if (getStringValue(KEY_UUID) != null || !getStringValue(KEY_UUID).equals("")) {
            jd.e.a().c(getStringValue(KEY_UUID));
        }
        initHeaders();
    }
}
