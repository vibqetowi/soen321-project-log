package com.theinnerhour.b2b.model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
@IgnoreExtraProperties
/* loaded from: classes2.dex */
public class User {
    private AngerCourse anger;
    private int appVersion;
    private String currentCourse;
    private String currentCourseName;
    private String currentMiniCourse;
    private DepressionCourse depression;
    private String firstName;
    private HappinessCourse happiness;
    private String lastName;
    private String organisationName;
    private String platform;
    private SleepCourse sleep;
    private String source;
    private StressCourse stress;
    private MiniCourse topicalCourse;
    private String userName;
    private String version;
    private WorryCourse worry;
    private String instanceId = "";
    private String profile_path = "";
    private ArrayList<Goal> userGoals = new ArrayList<>();
    private ArrayList<Goal> topicalGoals = new ArrayList<>();
    private UserGamificationModel userGamificationModel = new UserGamificationModel();
    private long timestamp = 0;
    private ArrayList<Coping> userCopingList = new ArrayList<>();
    private ArrayList<UserMood> userMoodList = new ArrayList<>();
    private ArrayList<UserMood> userMoodListV1 = new ArrayList<>();
    private ArrayList<MultiTrackerModel> userMoodListV3 = new ArrayList<>();
    private AppFeedback appFeedback = new AppFeedback();
    private HashMap<String, Object> appConfig = new HashMap<>();
    private long courseReminderTime = 0;
    private boolean courseReminderSet = true;
    private boolean courseReminderUpdated = false;
    private ArrayList<PostsRead> postsRead = new ArrayList<>();
    private ArrayList<PostsDisplayed> postsDisplayed = new ArrayList<>();
    private String passCodeHash = null;
    private CoachModelInfo coachModelInfo = new CoachModelInfo();
    private ArrayList<MiniCourse> miniCourses = new ArrayList<>();
    private ArrayList<MiniCourse> topicalCourseList = new ArrayList<>();
    private String appsFlyerID = null;
    private String GAID = null;
    private UserLibraryModel library = new UserLibraryModel();

    public User() {
    }

    public AngerCourse getAnger() {
        return this.anger;
    }

    public HashMap<String, Object> getAppConfig() {
        return this.appConfig;
    }

    public AppFeedback getAppFeedback() {
        return this.appFeedback;
    }

    public int getAppVersion() {
        return this.appVersion;
    }

    public String getAppsFlyerID() {
        return this.appsFlyerID;
    }

    public CoachModelInfo getCoachModelInfo() {
        return this.coachModelInfo;
    }

    @Exclude
    public HashMap<String, Course> getCourseMap() {
        HashMap<String, Course> hashMap = new HashMap<>();
        if (getSleep() != null) {
            hashMap.put(getSleep().get_id(), getSleep());
        }
        if (getStress() != null) {
            hashMap.put(getStress().get_id(), getStress());
        }
        if (getDepression() != null) {
            hashMap.put(getDepression().get_id(), getDepression());
        }
        if (getHappiness() != null) {
            hashMap.put(getHappiness().get_id(), getHappiness());
        }
        if (getWorry() != null) {
            hashMap.put(getWorry().get_id(), getWorry());
        }
        if (getAnger() != null) {
            hashMap.put(getAnger().get_id(), getAnger());
        }
        return hashMap;
    }

    @Exclude
    public HashMap<String, Course> getCourseNameMap() {
        HashMap<String, Course> hashMap = new HashMap<>();
        if (getSleep() != null) {
            hashMap.put(getSleep().getCourseName(), getSleep());
        }
        if (getStress() != null) {
            hashMap.put(getStress().getCourseName(), getStress());
        }
        if (getDepression() != null) {
            hashMap.put(getDepression().getCourseName(), getDepression());
        }
        if (getHappiness() != null) {
            hashMap.put(getHappiness().getCourseName(), getHappiness());
        }
        if (getWorry() != null) {
            hashMap.put(getWorry().getCourseName(), getWorry());
        }
        if (getAnger() != null) {
            hashMap.put(getAnger().getCourseName(), getAnger());
        }
        return hashMap;
    }

    public long getCourseReminderTime() {
        if (this.courseReminderTime == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 9);
            calendar.set(12, 0);
            this.courseReminderTime = calendar.getTimeInMillis() / 1000;
        }
        return this.courseReminderTime;
    }

    public synchronized String getCurrentCourse() {
        return this.currentCourse;
    }

    public String getCurrentCourseName() {
        return this.currentCourseName;
    }

    public String getCurrentMiniCourse() {
        return this.currentMiniCourse;
    }

    public DepressionCourse getDepression() {
        return this.depression;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGAID() {
        return this.GAID;
    }

    public HappinessCourse getHappiness() {
        return this.happiness;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getLastName() {
        return this.lastName;
    }

    public UserLibraryModel getLibrary() {
        return this.library;
    }

    public ArrayList<MiniCourse> getMiniCourses() {
        return this.miniCourses;
    }

    public String getOrganisationName() {
        return this.organisationName;
    }

    public String getPassCodeHash() {
        return this.passCodeHash;
    }

    public String getPlatform() {
        return this.platform;
    }

    public ArrayList<PostsDisplayed> getPostsDisplayed() {
        return this.postsDisplayed;
    }

    public ArrayList<PostsRead> getPostsRead() {
        return this.postsRead;
    }

    public String getProfile_path() {
        return this.profile_path;
    }

    public SleepCourse getSleep() {
        return this.sleep;
    }

    public String getSource() {
        return this.source;
    }

    public StressCourse getStress() {
        return this.stress;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public MiniCourse getTopicalCourse() {
        return this.topicalCourse;
    }

    public ArrayList<MiniCourse> getTopicalCourseList() {
        return this.topicalCourseList;
    }

    public ArrayList<Goal> getTopicalGoals() {
        return this.topicalGoals;
    }

    public ArrayList<Coping> getUserCopingList() {
        return this.userCopingList;
    }

    public UserGamificationModel getUserGamificationModel() {
        return this.userGamificationModel;
    }

    public ArrayList<Goal> getUserGoals() {
        return this.userGoals;
    }

    public ArrayList<UserMood> getUserMoodList() {
        return this.userMoodList;
    }

    public ArrayList<UserMood> getUserMoodListV1() {
        return this.userMoodListV1;
    }

    public ArrayList<MultiTrackerModel> getUserMoodListV3() {
        return this.userMoodListV3;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getVersion() {
        return this.version;
    }

    public WorryCourse getWorry() {
        return this.worry;
    }

    public boolean isCourseReminderSet() {
        return this.courseReminderSet;
    }

    public boolean isCourseReminderUpdated() {
        return this.courseReminderUpdated;
    }

    public void setAnger(AngerCourse angerCourse) {
        this.anger = angerCourse;
    }

    public void setAppConfig(HashMap<String, Object> hashMap) {
        this.appConfig = hashMap;
    }

    public void setAppFeedback(AppFeedback appFeedback) {
        this.appFeedback = appFeedback;
    }

    public void setAppVersion(int i6) {
        this.appVersion = i6;
    }

    public void setAppsFlyerID(String str) {
        this.appsFlyerID = str;
    }

    public void setCoachModelInfo(CoachModelInfo coachModelInfo) {
        this.coachModelInfo = coachModelInfo;
    }

    public void setCourseReminderSet(boolean z10) {
        this.courseReminderSet = z10;
    }

    public void setCourseReminderTime(long j10) {
        this.courseReminderTime = j10;
    }

    public void setCourseReminderUpdated(boolean z10) {
        this.courseReminderUpdated = z10;
    }

    public synchronized void setCurrentCourse(String str) {
        this.currentCourse = str;
    }

    public void setCurrentCourseName(String str) {
        this.currentCourseName = str;
    }

    public void setCurrentMiniCourse(String str) {
        this.currentMiniCourse = str;
    }

    public void setDepression(DepressionCourse depressionCourse) {
        this.depression = depressionCourse;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setGAID(String str) {
        this.GAID = str;
    }

    public void setHappiness(HappinessCourse happinessCourse) {
        this.happiness = happinessCourse;
    }

    public void setInstanceId(String str) {
        this.instanceId = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setMiniCourses(ArrayList<MiniCourse> arrayList) {
        this.miniCourses = arrayList;
    }

    public void setOrganisationName(String str) {
        this.organisationName = str;
    }

    public void setPassCodeHash(String str) {
        this.passCodeHash = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPostsDisplayed(ArrayList<PostsDisplayed> arrayList) {
        this.postsDisplayed = arrayList;
    }

    public void setPostsRead(ArrayList<PostsRead> arrayList) {
        this.postsRead = arrayList;
    }

    public void setProfile_path(String str) {
        this.profile_path = str;
    }

    public void setSleep(SleepCourse sleepCourse) {
        this.sleep = sleepCourse;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStress(StressCourse stressCourse) {
        this.stress = stressCourse;
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public void setTopicalCourse(MiniCourse miniCourse) {
        this.topicalCourse = miniCourse;
    }

    public void setTopicalCourseList(ArrayList<MiniCourse> arrayList) {
        this.topicalCourseList = arrayList;
    }

    public void setTopicalGoals(ArrayList<Goal> arrayList) {
        this.topicalGoals = arrayList;
    }

    public void setUserCopingList(ArrayList<Coping> arrayList) {
        this.userCopingList = arrayList;
    }

    public void setUserGamificationModel(UserGamificationModel userGamificationModel) {
        this.userGamificationModel = userGamificationModel;
    }

    public void setUserGoals(ArrayList<Goal> arrayList) {
        this.userGoals = arrayList;
    }

    public void setUserMoodList(ArrayList<UserMood> arrayList) {
        this.userMoodList = arrayList;
    }

    public void setUserMoodListV1(ArrayList<UserMood> arrayList) {
        this.userMoodListV1 = arrayList;
    }

    public void setUserMoodListV3(ArrayList<MultiTrackerModel> arrayList) {
        this.userMoodListV3 = arrayList;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWorry(WorryCourse worryCourse) {
        this.worry = worryCourse;
    }

    public User(String str) {
        this.userName = str;
    }
}
