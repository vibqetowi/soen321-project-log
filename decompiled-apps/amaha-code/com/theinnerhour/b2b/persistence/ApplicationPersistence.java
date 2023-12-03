package com.theinnerhour.b2b.persistence;

import android.content.SharedPreferences;
import android.webkit.WebStorage;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.model.Article;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.NotificationModel;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import fk.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lv.c;
import sf.i;
/* loaded from: classes2.dex */
public class ApplicationPersistence {
    public static final String FCM_ID = "fcm_id";
    private static ApplicationPersistence ourInstance = new ApplicationPersistence();
    private String TAG = LogHelper.INSTANCE.makeLogTag(getClass());
    private SharedPreferences sharedPreferences = null;
    private String applicationPersistence = "application_persistence";
    private String goalsSp = "goals_sp";
    private String notificationsSp = "notifications_sp";
    private String articlesSp = "articles_sp";
    private String offlineAssetsSP = "offline_assets_sp";
    private String courseAssetsSP = "course_assets_sp";
    private String campaignAssetsSP = "campaign_assets_sp";
    private String matchingTherapistsSP = "matching_therapists_sp";
    private String profileAssetsSP = "profile_assets_sp";
    private ArrayList<OfflineAsset> offlineAssets = new ArrayList<>();
    private Boolean isOfflineAssetsCheckComplete = Boolean.FALSE;
    public HashMap<String, AssetPair> assetMap = new HashMap<>();
    ApplicationPersistenceUtils applicationPersistenceUtils = new ApplicationPersistenceUtils(this);

    /* loaded from: classes2.dex */
    public class AssetPair {
        private String[] assetArray;

        public AssetPair(String str, String str2, String str3) {
            String[] strArr = {"", "", ""};
            this.assetArray = strArr;
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
        }

        public String getColor() {
            return this.assetArray[0];
        }

        public String getFilename() {
            return this.assetArray[1];
        }

        public String getTextColor() {
            return this.assetArray[2];
        }
    }

    private ApplicationPersistence() {
    }

    public static ApplicationPersistence getInstance() {
        return ourInstance;
    }

    private void initOfflineAssets() {
        i iVar = new i();
        String string = getSharedPreferences().getString(this.offlineAssetsSP, null);
        if (string != null && !string.equals("")) {
            this.offlineAssets = (ArrayList) iVar.c(string, new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.1
            }.getType());
        }
    }

    private void updateArticlesSP(HashMap<String, ArrayList<Article>> hashMap) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (hashMap.size() > 0) {
            edit.putString(this.articlesSp, new i().h(hashMap, new TypeToken<HashMap<String, ArrayList<Article>>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.5
            }.getType()));
        } else {
            edit.remove(this.articlesSp);
        }
        edit.apply();
    }

    private void updateGoalTypeSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getGoalTypes().size() > 0) {
            edit.putString(this.goalsSp, new i().h(getGoalTypes(), new TypeToken<ArrayList<GoalType>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.2
            }.getType()));
        } else {
            edit.remove(this.goalsSp);
        }
        edit.apply();
    }

    private void updateNotificationSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getNotifiationsMap().size() > 0) {
            edit.putString(this.notificationsSp, new i().h(getNotifiationsMap(), new TypeToken<HashMap<String, ArrayList<NotificationModel>>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.3
            }.getType()));
        } else {
            edit.remove(this.notificationsSp);
        }
        edit.apply();
    }

    public void addAllGoalType(ArrayList<GoalType> arrayList) {
        HashSet<String> goalIds = getGoalIds();
        Iterator<GoalType> it = arrayList.iterator();
        while (it.hasNext()) {
            GoalType next = it.next();
            if (!goalIds.contains(next.getGoalId())) {
                getGoalTypes().add(next);
            }
        }
        updateGoalTypeSP();
    }

    public void addArticles(String str, ArrayList<Article> arrayList) {
        try {
            HashMap<String, ArrayList<Article>> articlesMap = getArticlesMap();
            articlesMap.put(str, arrayList);
            updateArticlesSP(articlesMap);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public void addCourseNotification(String str, ArrayList<NotificationModel> arrayList) {
        if (getNotifiationsMap().get(str) == null) {
            getNotifiationsMap().put(str, arrayList);
            updateNotificationSP();
        }
    }

    public void addNewOfflineAsset(OfflineAsset offlineAsset) {
        ArrayList<OfflineAsset> offlineAssets = getOfflineAssets();
        offlineAssets.add(offlineAsset);
        updateOfflineAssetsSP(offlineAssets);
    }

    public void clearData() {
        try {
            String stringValue = getStringValue(Constants.DYNAMIC_SIGNUP_LINK);
            String stringValue2 = getStringValue(Constants.ONBOARDING_EXPERIMENT);
            String stringValue3 = getStringValue(Constants.DYNAMIC_UTM_LINK);
            String stringValue4 = getStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL);
            String stringValue5 = getStringValue(Constants.LOGIN_SCREEN_EXPERIMENT);
            boolean booleanValue = getBooleanValue(Constants.USE_VARIANT_A, false);
            boolean booleanValue2 = getBooleanValue(Constants.A3_ONBOARDING_EXPERIMENT, false);
            boolean booleanValue3 = getBooleanValue(Constants.COMMUNITIES_ENABLED, false);
            boolean booleanValue4 = getBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, false);
            boolean booleanValue5 = getBooleanValue(Constants.PROVIDER_INITIAL_DISCOUNT, false);
            ArrayList<String> arrayList = g.f15127b;
            boolean booleanValue6 = getBooleanValue("moengage_status_set", false);
            boolean booleanValue7 = getBooleanValue(Constants.FIRST_APP_OPEN, false);
            int intValue = getIntValue(Constants.APP_OPEN_DAY, 0);
            int intValue2 = getIntValue(Constants.NOTIFICATION_ASK_DAY, 0);
            int intValue3 = getIntValue(Constants.NOTIFICATION_ASK_COUNT, 0);
            int intValue4 = getIntValue(Constants.APP_SESSION_COUNT, 0);
            int intValue5 = getIntValue(Constants.NOTIFICATION_DIALOG_SHOW_COUNT, 0);
            int intValue6 = getIntValue(Constants.NOTIFICATION_DIALOG_DENY_COUNT, 0);
            int intValue7 = getIntValue(Constants.NOTIFICATION_DIALOG_DISMISS_COUNT, 0);
            getSharedPreferences().edit().clear().apply();
            setStringValue(Constants.DYNAMIC_SIGNUP_LINK, stringValue);
            setStringValue(Constants.ONBOARDING_EXPERIMENT, stringValue2);
            setStringValue(Constants.DYNAMIC_UTM_LINK, stringValue3);
            setStringValue(Constants.LOGIN_SCREEN_EXPERIMENT, stringValue5);
            setBooleanValue(Constants.USE_VARIANT_A, booleanValue);
            setBooleanValue(Constants.A3_ONBOARDING_EXPERIMENT, booleanValue2);
            setBooleanValue(Constants.COMMUNITIES_ENABLED, booleanValue3);
            setBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, booleanValue4);
            setBooleanValue(Constants.PROVIDER_INITIAL_DISCOUNT, booleanValue5);
            setBooleanValue("moengage_status_set", booleanValue6);
            setBooleanValue(Constants.FIRST_APP_OPEN, booleanValue7);
            setStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL, stringValue4);
            setIntValue(Constants.APP_OPEN_DAY, intValue);
            setIntValue(Constants.NOTIFICATION_ASK_DAY, intValue2);
            setIntValue(Constants.NOTIFICATION_ASK_COUNT, intValue3);
            setIntValue(Constants.APP_SESSION_COUNT, intValue4);
            setIntValue(Constants.NOTIFICATION_DIALOG_SHOW_COUNT, intValue5);
            setIntValue(Constants.NOTIFICATION_DIALOG_DENY_COUNT, intValue6);
            setIntValue(Constants.NOTIFICATION_DIALOG_DISMISS_COUNT, intValue7);
            WebStorage.getInstance().deleteAllData();
            try {
                MyApplication.a aVar = MyApplication.V;
                if (((c) aVar.a().L.getValue()) != null) {
                    ((c) aVar.a().L.getValue()).a();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.TAG, e11);
        }
    }

    public boolean containsKey(String str) {
        return getSharedPreferences().contains(str);
    }

    public void deleteKey(String str) {
        getSharedPreferences().edit().remove(str).apply();
    }

    public ArrayList<Article> getArticlesByCourse(String str) {
        ArrayList<Article> arrayList = new ArrayList<>();
        try {
            HashMap<String, ArrayList<Article>> articlesMap = getArticlesMap();
            if (articlesMap != null && articlesMap.get(str) != null) {
                return articlesMap.get(str);
            }
            return arrayList;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return arrayList;
        }
    }

    public HashMap<String, ArrayList<Article>> getArticlesMap() {
        HashMap<String, ArrayList<Article>> hashMap = new HashMap<>();
        try {
            i iVar = new i();
            String string = getSharedPreferences().getString(this.articlesSp, null);
            if (string != null && !string.equals("")) {
                return (HashMap) iVar.c(string, new TypeToken<HashMap<String, ArrayList<Article>>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.4
                }.getType());
            }
            return hashMap;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return hashMap;
        }
    }

    public boolean getBooleanValue(String str) {
        return getSharedPreferences().getBoolean(str, true);
    }

    public ArrayList<OfflineAsset> getCampaignAssets() {
        return this.applicationPersistenceUtils.getCampaignAssets();
    }

    public String getCampaignAssetsSP() {
        return this.campaignAssetsSP;
    }

    public ArrayList<OfflineAsset> getCourseAssets() {
        return this.applicationPersistenceUtils.getCourseAssets();
    }

    public String getCourseAssetsSP() {
        return this.courseAssetsSP;
    }

    public HashSet<String> getGoalIds() {
        HashSet<String> hashSet = new HashSet<>();
        try {
            Iterator<GoalType> it = getGoalTypes().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getGoalId());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
        return hashSet;
    }

    public ArrayList<GoalType> getGoalTypes() {
        return this.applicationPersistenceUtils.getGoalTypes();
    }

    public String getGoalsSp() {
        return this.goalsSp;
    }

    public int getIntValue(String str) {
        return getSharedPreferences().getInt(str, 0);
    }

    public long getLongValue(String str) {
        return getSharedPreferences().getLong(str, 0L);
    }

    public ArrayList<ProviderListModel> getMatchingTherapists() {
        return this.applicationPersistenceUtils.getMatchingTherapists();
    }

    public String getMatchingTherapistsSP() {
        return this.matchingTherapistsSP;
    }

    public HashMap<String, ArrayList<NotificationModel>> getNotifiationsMap() {
        return this.applicationPersistenceUtils.getNotificationsMap();
    }

    public String getNotificationSp() {
        return this.notificationsSp;
    }

    public ArrayList<OfflineAsset> getOfflineAssets() {
        if (!this.isOfflineAssetsCheckComplete.booleanValue()) {
            initOfflineAssets();
            this.isOfflineAssetsCheckComplete = Boolean.TRUE;
        }
        return this.offlineAssets;
    }

    public HashMap<String, OfflineAsset> getOfflineAssetsMap(String str) {
        HashMap<String, OfflineAsset> hashMap = new HashMap<>();
        Iterator<OfflineAsset> it = getOfflineAssets().iterator();
        while (it.hasNext()) {
            OfflineAsset next = it.next();
            if (next.getCourseId().equals(str)) {
                hashMap.put(next.getFileUrl(), next);
            }
        }
        return hashMap;
    }

    public ArrayList<OfflineAsset> getProfileAssets() {
        return this.applicationPersistenceUtils.getProfileAssets();
    }

    public String getProfileAssetsSP() {
        return this.profileAssetsSP;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.sharedPreferences == null) {
            this.sharedPreferences = MyApplication.V.a().getSharedPreferences(this.applicationPersistence, 0);
        }
        return this.sharedPreferences;
    }

    public Set<String> getStringSetValue(String str) {
        return getSharedPreferences().getStringSet(str, new HashSet());
    }

    public String getStringValue(String str) {
        return getSharedPreferences().getString(str, "");
    }

    public void resetSubscriptionPrefs(Boolean bool) {
        if (bool.booleanValue()) {
            setLongValue("subscription_start", Calendar.getInstance().getTimeInMillis());
        }
        setBooleanValue(Constants.FFM_TRACKER, false);
        setBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, false);
        setBooleanValue(Constants.FFM_LEARNING_HUB, false);
        setBooleanValue(Constants.FFM_MINICOURSES, false);
    }

    public void setBooleanValue(String str, boolean z10) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public void setBooleanValueAsync(String str, boolean z10) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    public void setIntValue(String str, int i6) {
        getSharedPreferences().edit().putInt(str, i6).apply();
    }

    public void setLongValue(String str, long j10) {
        getSharedPreferences().edit().putLong(str, j10).apply();
    }

    public void setLongValueAsync(String str, long j10) {
        getSharedPreferences().edit().putLong(str, j10).apply();
    }

    public void setMatchingTherapistsSP(ArrayList<ProviderListModel> arrayList) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (arrayList.size() > 0) {
            edit.putString(this.matchingTherapistsSP, new i().h(arrayList, new TypeToken<ArrayList<ProviderListModel>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.11
            }.getType()));
        }
        edit.apply();
    }

    public void setOfflineAssets(ArrayList<OfflineAsset> arrayList) {
        this.offlineAssets = arrayList;
        updateOfflineAssetsSP();
    }

    public void setStringSetValue(String str, Set<String> set) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public void setStringValue(String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void setStringValueAsync(String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public void updateCampaignAssetsSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getCampaignAssets().size() > 0) {
            edit.putString(this.campaignAssetsSP, new i().h(getCampaignAssets(), new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.8
            }.getType()));
        } else {
            edit.remove(this.campaignAssetsSP);
        }
        edit.apply();
    }

    public void updateCourseAssetsSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getCourseAssets().size() > 0) {
            edit.putString(this.courseAssetsSP, new i().h(getCourseAssets(), new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.7
            }.getType()));
        } else {
            edit.remove(this.courseAssetsSP);
        }
        edit.apply();
    }

    public void updateOfflineAssetsSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getOfflineAssets().size() > 0) {
            edit.putString(this.offlineAssetsSP, new i().h(getOfflineAssets(), new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.6
            }.getType()));
        } else {
            edit.remove(this.offlineAssetsSP);
        }
        edit.apply();
    }

    public void updateProfileAssetsSP() {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (getProfileAssets().size() > 0) {
            edit.putString(this.profileAssetsSP, new i().h(getProfileAssets(), new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.9
            }.getType()));
        } else {
            edit.remove(this.profileAssetsSP);
        }
        edit.apply();
    }

    public boolean getBooleanValue(String str, boolean z10) {
        return getSharedPreferences().getBoolean(str, z10);
    }

    public int getIntValue(String str, int i6) {
        return getSharedPreferences().getInt(str, i6);
    }

    public long getLongValue(String str, long j10) {
        return getSharedPreferences().getLong(str, j10);
    }

    public ArrayList<OfflineAsset> getOfflineAssets(String str) {
        ArrayList<OfflineAsset> arrayList = new ArrayList<>();
        ArrayList<OfflineAsset> offlineAssets = getOfflineAssets();
        if (offlineAssets != null) {
            Iterator<OfflineAsset> it = offlineAssets.iterator();
            while (it.hasNext()) {
                OfflineAsset next = it.next();
                if (next.getCourseId() != null && next.getCourseId().equals(str)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public HashMap<String, OfflineAsset> getOfflineAssetsMap() {
        HashMap<String, OfflineAsset> hashMap = new HashMap<>();
        Iterator<OfflineAsset> it = getOfflineAssets().iterator();
        while (it.hasNext()) {
            OfflineAsset next = it.next();
            hashMap.put(next.getFileUrl(), next);
        }
        return hashMap;
    }

    public void updateOfflineAssetsSP(ArrayList<OfflineAsset> arrayList) {
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        if (arrayList.size() > 0) {
            edit.putString(this.offlineAssetsSP, new i().h(arrayList, new TypeToken<ArrayList<OfflineAsset>>() { // from class: com.theinnerhour.b2b.persistence.ApplicationPersistence.10
            }.getType()));
        } else {
            edit.remove(this.offlineAssetsSP);
        }
        edit.apply();
    }
}
