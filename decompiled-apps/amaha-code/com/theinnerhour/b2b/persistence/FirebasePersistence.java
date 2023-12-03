package com.theinnerhour.b2b.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.o;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import com.theinnerhour.b2b.model.ContentFeedbackModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.FirebaseCourseUpdateListener;
import com.theinnerhour.b2b.model.FirebaseInitialiseListener;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LoginInterface;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import fd.f;
import fk.g;
import gk.e;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import lg.f;
import og.b;
import sf.i;
import ya.d;
import ya.h;
import ya.k;
/* loaded from: classes2.dex */
public class FirebasePersistence {
    public static final String FIREBASE_PERSISTENCE_USER_PREFERENCES = "firebase_user_preferences";
    private static FirebasePersistence ourInstance = new FirebasePersistence();
    private Context context;
    public CourseApiUtil courseApiUtil;
    private DatabaseReference databaseReference;
    private User user;
    private String TAG = getClass().getSimpleName();
    private ArrayList<FirebaseInitialiseListener> firebaseInitialiseListeners = new ArrayList<>();
    private ArrayList<FirebaseCourseUpdateListener> firebaseCourseUpdateListeners = new ArrayList<>();
    public int courseSize = 0;
    private FirebasePersistenceUtils fbUtils = new FirebasePersistenceUtils(this);
    public Boolean pendingUpdate = Boolean.FALSE;
    public Long pendingTimestamp = 0L;
    private Boolean onboardingExperimentFirebaseInitPending = Boolean.TRUE;
    private UserOnboardingModel userOnboardingModel = new UserOnboardingModel();

    /* loaded from: classes2.dex */
    public class AddGoalAsync extends AsyncTask<String, Void, Void> {
        boolean isVisible;

        public AddGoalAsync(boolean z10) {
            this.isVisible = z10;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            FirebasePersistence.this.addNewGoalToFirebase(strArr[0], strArr[1], this.isVisible);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class UpdateGoalAsync extends AsyncTask<Goal, Void, Void> {
        private UpdateGoalAsync() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Goal... goalArr) {
            FirebasePersistence.this.updateUserGoal(goalArr[0]);
            return null;
        }
    }

    private FirebasePersistence() {
        try {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception", e10);
        }
    }

    private void addGoalToList(Goal goal) {
        getUserGoals().add(goal);
        updateUserOnFirebase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNewGoalToFirebase(String str, String str2, boolean z10) {
        boolean z11;
        try {
            Iterator<Goal> it = this.user.getUserGoals().iterator();
            while (it.hasNext()) {
                Goal next = it.next();
                if (next.getGoalId().equals(str) && next.getCourseId().equals(str2)) {
                    if (next.getSource() != null) {
                        if (!next.getSource().equals("daily_plan")) {
                        }
                    } else {
                        next.setSource("daily_plan");
                    }
                    next.setVisible(z10);
                    next.setmLastAdded(Calendar.getInstance().getTime());
                    updateUserOnFirebase();
                    z11 = false;
                    fireAnalytics(next, false, true);
                    break;
                }
            }
            z11 = true;
            if (z11) {
                Goal goal = new Goal(str2, str);
                goal.setType(Constants.getGoalType(str).getType());
                goal.setVisible(z10);
                goal.setSource("daily_plan");
                addGoalToList(goal);
                checkAndUpdateGamificationScore(str);
                fireAnalytics(goal, z11, true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    private void addTopicalGoalToList(Goal goal) {
        getTopicalGoals().add(goal);
        updateUserOnFirebase();
    }

    private void clearUserSharedPreference() {
        ApplicationPersistence.getInstance().clearData();
        ApplicationPersistence.getInstance().setStringValue(FIREBASE_PERSISTENCE_USER_PREFERENCES, "");
        SharedPreferences sharedPreferences = pn.a.f28723a;
        pn.a.f28723a.edit().clear().apply();
    }

    private void fireAnalytics(Goal goal, boolean z10, boolean z11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("course", goal.getCourseName());
            bundle.putString(Constants.GOAL_ID, goal.getGoalId());
            bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
            bundle.putString("type", goal.getType());
            if (z11) {
                bundle.putBoolean("rescheduled", z10);
                gk.a.b(bundle, "add_goal");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("course", goal.getCourseName());
            hashMap.put(Constants.GOAL_ID, goal.getGoalId());
            hashMap.put(Constants.GOAL_NAME, goal.getGoalName());
            hashMap.put("type", goal.getType());
            if (z11) {
                hashMap.put("rescheduled", Boolean.valueOf(z10));
                if (new e().a()) {
                    AppsFlyerLib.getInstance().logEvent(this.context.getApplicationContext(), "add_goal", hashMap);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public static FirebasePersistence getInstance() {
        if (ourInstance == null) {
            ourInstance = new FirebasePersistence();
        }
        return ourInstance;
    }

    private User getUserSharedPreference() {
        try {
            String stringValue = ApplicationPersistence.getInstance().getStringValue(FIREBASE_PERSISTENCE_USER_PREFERENCES);
            if (stringValue == null || stringValue.equals("")) {
                return null;
            }
            return (User) new i().b(User.class, stringValue);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in get user shared preference", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createNewUser$0(int i6, LoginInterface loginInterface, h hVar) {
        if (!hVar.isSuccessful()) {
            if (i6 < 3) {
                createNewUser(loginInterface, i6 + 1);
            } else if (loginInterface != null) {
                loginInterface.firebaseFailure();
            }
        }
    }

    private void updateGamificationPointsOnFirebase() {
        this.databaseReference.setValue(this.user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUserGoal(Goal goal) {
        int i6 = 0;
        while (true) {
            try {
                if (i6 >= this.user.getUserGoals().size()) {
                    break;
                }
                Goal goal2 = this.user.getUserGoals().get(i6);
                if (goal2.getGoalId().equals(goal.getGoalId()) && goal2.getCourseId().equals(goal.getCourseId())) {
                    this.user.getUserGoals().set(i6, goal);
                    break;
                }
                i6++;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, "exception", e10);
                return;
            }
        }
        updateUserOnFirebase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void userDataChanged(boolean z10) {
        try {
            Iterator<FirebaseInitialiseListener> it = this.firebaseInitialiseListeners.iterator();
            while (it.hasNext()) {
                FirebaseInitialiseListener next = it.next();
                if (next != null) {
                    next.initiliseComplete(z10);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception user data changed", e10);
        }
    }

    public void addNewGoal(String str, String str2, boolean z10) {
        if (z10) {
            new AddGoalAsync(true).execute(str, str2);
        } else {
            addNewGoalToFirebase(str, str2, true);
        }
    }

    public void addNewGoalBasic(String str, String str2, String str3, String str4, boolean z10, String str5, String str6) {
        boolean z11;
        Goal next;
        Iterator<Goal> it = this.user.getUserGoals().iterator();
        while (true) {
            z11 = true;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (Objects.equals(next.getGoalId(), str) && Objects.equals(next.getCourseName(), str4)) {
                if (next.getSource() != null) {
                    if (next.getSource().equals(str6)) {
                        break;
                    }
                } else {
                    next.setSource(str6);
                    break;
                }
            }
        }
        if (!z10 && !next.isVisible()) {
            z11 = false;
        }
        next.setVisible(z11);
        next.setmLastAdded(Calendar.getInstance().getTime());
        updateUserOnFirebase();
        fireAnalytics(next, false, z10);
        z11 = false;
        if (z11) {
            Goal goal = new Goal(str2, str);
            if (str5 != null) {
                goal.setType(str5);
            } else {
                goal.setType(Constants.getGoalType(str).getType());
            }
            goal.setCourseName(str4);
            goal.setCourseId(str2);
            goal.setGoalName(str3);
            goal.setVisible(z10);
            goal.setSource(str6);
            addGoalToList(goal);
            if (z10) {
                checkAndUpdateGamificationScore(str);
            }
            fireAnalytics(goal, z11, z10);
        }
    }

    public void addNewGoalTopical(String str, String str2, String str3, String str4, boolean z10, String str5, String str6) {
        boolean z11;
        Goal next;
        Iterator<Goal> it = this.user.getTopicalGoals().iterator();
        while (true) {
            z11 = true;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (next.getGoalId().equals(str) && next.getCourseName().equals(str4)) {
                if (next.getSource() != null) {
                    if (next.getSource().equals(str6)) {
                        break;
                    }
                } else {
                    next.setSource(str6);
                    break;
                }
            }
        }
        if (!z10 && !next.isVisible()) {
            z11 = false;
        }
        next.setVisible(z11);
        next.setmLastAdded(Calendar.getInstance().getTime());
        updateUserOnFirebase();
        fireAnalytics(next, false, z10);
        z11 = false;
        if (z11) {
            Goal goal = new Goal(str2, str);
            if (str5 != null) {
                goal.setType(str5);
            } else {
                goal.setType(Constants.getGoalType(str).getType());
            }
            goal.setCourseName(str4);
            goal.setCourseId(str2);
            goal.setGoalName(str3);
            goal.setVisible(z10);
            goal.setSource(str6);
            addTopicalGoalToList(goal);
            if (z10) {
                checkAndUpdateGamificationScore(str);
            }
            fireAnalytics(goal, z11, z10);
        }
    }

    public void addUserGamificationPointsToFirebase(GamificationModel gamificationModel) {
        addUserGamificationPointsToFirebaseWithoutUserUpdate(gamificationModel);
        updateGamificationPointsOnFirebase();
    }

    public void addUserGamificationPointsToFirebaseWithoutUserUpdate(GamificationModel gamificationModel) {
        this.user.getUserGamificationModel().setTotalGamificationPoints(gamificationModel.getPoints() + this.user.getUserGamificationModel().getTotalGamificationPoints());
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 100 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_100_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_100_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 500 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_500_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_500_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 1000 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_1000_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_1000_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
    }

    public void checkAndInitOnboardingExperimentFirebase() {
        User user;
        if (this.onboardingExperimentFirebaseInitPending.booleanValue() && (user = this.user) != null && user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT) != null && Objects.equals(this.user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT), "variant_a") && FirebaseAuth.getInstance().a() != null) {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference reference = firebaseDatabase.getReference(Constants.FIREBASE_USER_COURSES_NODE + FirebaseAuth.getInstance().a());
            reference.keepSynced(true);
            reference.addValueEventListener(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.FirebasePersistence.4
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    UserOnboardingModel userOnboardingModel = (UserOnboardingModel) dataSnapshot.getValue(UserOnboardingModel.class);
                    if (userOnboardingModel != null) {
                        FirebasePersistence.this.userOnboardingModel = userOnboardingModel;
                    }
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                }
            });
            this.onboardingExperimentFirebaseInitPending = Boolean.FALSE;
        }
    }

    public void checkAndUpdateGamificationScore(String str) {
        addUserGamificationPointsToFirebase(new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, b.g(), Constants.getGoalName(str)));
    }

    public void createNewUser(final LoginInterface loginInterface, final int i6) {
        try {
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
            User user = new User();
            user.setUserName(SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            user.setOrganisationName(SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_NAME));
            user.setFirstName(SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME));
            user.setLastName(SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME));
            f fVar = FirebaseAuth.getInstance().f;
            Objects.requireNonNull(fVar);
            reference.child(fVar.j0()).setValue(user).addOnCompleteListener(new d() { // from class: com.theinnerhour.b2b.persistence.a
                @Override // ya.d
                public final void a(h hVar) {
                    FirebasePersistence.this.lambda$createNewUser$0(i6, loginInterface, hVar);
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
            if (i6 < 3) {
                createNewUser(loginInterface, i6 + 1);
            } else if (loginInterface != null) {
                loginInterface.firebaseFailure();
            }
        }
    }

    public Course getCourseById(String str) {
        if (getUserCourseMap().containsKey(str)) {
            return getUserCourseMap().get(str);
        }
        return null;
    }

    public Course getCourseByName(String str) {
        if (this.user == null) {
            return null;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    c10 = 1;
                    break;
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    c10 = 2;
                    break;
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    c10 = 3;
                    break;
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    c10 = 4;
                    break;
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.user.getHappiness();
            case 1:
                return this.user.getDepression();
            case 2:
                return this.user.getStress();
            case 3:
                return this.user.getAnger();
            case 4:
                return this.user.getSleep();
            case 5:
                return this.user.getWorry();
            default:
                return null;
        }
    }

    public ArrayList<Course> getCourses() {
        return new ArrayList<>(getUserCourseMap().values());
    }

    public Goal getGoalById(String str, String str2) {
        if (this.user != null) {
            for (Goal goal : getUserGoals()) {
                if (Objects.equals(goal.getGoalId(), str) && (Objects.equals(goal.getCourseId(), str2) || Objects.equals(goal.getCourseId(), "independent") || Objects.equals(goal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID))) {
                    return goal;
                }
            }
            return null;
        }
        return null;
    }

    public Boolean getIsAdhdCourseActive() {
        if (this.userOnboardingModel.getAdhdCourse() != null) {
            return Boolean.valueOf(this.userOnboardingModel.getAdhdCourse().isCourseStarted());
        }
        return Boolean.FALSE;
    }

    public Boolean getIsGenericExpertCareCourseActive() {
        if (this.userOnboardingModel.getExpertCareCourse() != null) {
            return Boolean.valueOf(this.userOnboardingModel.getExpertCareCourse().isCourseStarted());
        }
        return Boolean.FALSE;
    }

    public Boolean getIsOcdCourseActive() {
        if (this.userOnboardingModel.getOcdCourse() != null) {
            return Boolean.valueOf(this.userOnboardingModel.getOcdCourse().isCourseStarted());
        }
        return Boolean.FALSE;
    }

    public Goal getTopicalGoalById(String str) {
        if (this.user != null) {
            for (Goal goal : getTopicalGoals()) {
                if (Objects.equals(goal.getGoalId(), str)) {
                    return goal;
                }
            }
            return null;
        }
        return null;
    }

    public List<Goal> getTopicalGoals() {
        User user = this.user;
        if (user != null) {
            return user.getTopicalGoals();
        }
        return new ArrayList();
    }

    public User getUser() {
        if (this.user == null) {
            this.user = getUserSharedPreference();
        }
        return this.user;
    }

    public HashSet<String> getUserCourse() {
        HashSet<String> hashSet = new HashSet<>();
        for (String str : getUserCourseMap().keySet()) {
            hashSet.add(str);
        }
        return hashSet;
    }

    public HashMap<String, Course> getUserCourseMap() {
        User user = this.user;
        if (user != null) {
            return user.getCourseMap();
        }
        return new HashMap<>();
    }

    public HashMap<String, Course> getUserCourseNameMap() {
        User user = this.user;
        if (user != null) {
            return user.getCourseNameMap();
        }
        return new HashMap<>();
    }

    public List<Goal> getUserGoals(String str) {
        ArrayList arrayList = new ArrayList();
        for (Goal goal : getUserGoals()) {
            if (goal.getCourseId() != null && goal.getCourseId().equals(str)) {
                arrayList.add(goal);
            }
        }
        return arrayList;
    }

    public UserOnboardingModel getUserOnboardingModel() {
        return this.userOnboardingModel;
    }

    public User getUserWithoutPreference() {
        return this.user;
    }

    public void initFirebase(final LoginInterface loginInterface) {
        try {
            f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && this.user == null) {
                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                DatabaseReference reference = firebaseDatabase.getReference("users/" + fVar.j0());
                this.databaseReference = reference;
                reference.keepSynced(true);
                this.databaseReference.addValueEventListener(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.FirebasePersistence.1
                    @Override // com.google.firebase.database.ValueEventListener
                    public void onCancelled(DatabaseError databaseError) {
                        FirebasePersistence.this.userDataChanged(false);
                    }

                    @Override // com.google.firebase.database.ValueEventListener
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        try {
                            if (dataSnapshot.exists()) {
                                FirebasePersistence.this.fbUtils.parseUserData(dataSnapshot, loginInterface);
                            } else {
                                FirebasePersistence.this.createNewUser(loginInterface, 0);
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(FirebasePersistence.this.TAG, e10.toString());
                            LoginInterface loginInterface2 = loginInterface;
                            if (loginInterface2 != null) {
                                loginInterface2.firebaseFailure();
                            }
                        }
                    }
                });
            } else if (loginInterface != null) {
                loginInterface.firebaseFailure();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
            if (loginInterface != null) {
                loginInterface.firebaseFailure();
            }
        }
    }

    public void logout() {
        FirebaseMessaging firebaseMessaging;
        this.user = null;
        this.userOnboardingModel = new UserOnboardingModel();
        clearUserSharedPreference();
        MyApplication.V.a().O = "";
        FirebaseAuth.getInstance().f();
        c0 c0Var = FirebaseMessaging.f9641m;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(sc.e.e());
        }
        if (firebaseMessaging.f9645b != null) {
            firebaseMessaging.f9650h.execute(new o(firebaseMessaging, new ya.i(), 0));
        } else if (firebaseMessaging.e() == null) {
            k.e(null);
        } else {
            Executors.newSingleThreadExecutor(new ba.a("Firebase-Messaging-Network-Io")).execute(new o(firebaseMessaging, new ya.i(), 1));
        }
        StatPersistence.INSTANCE.onLogout();
    }

    public void pushContentFeedback(ContentFeedbackModel contentFeedbackModel) {
        try {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            firebaseDatabase.getReference("users_additional_data/" + FirebaseAuth.getInstance().a() + "/content_feedback").push().setValue(contentFeedbackModel);
        } catch (Exception unused) {
            LogHelper.INSTANCE.e(this.TAG, "exception in pushing content feedback");
        }
    }

    public void removeFirebaseCourseUpdateListener(FirebaseCourseUpdateListener firebaseCourseUpdateListener) {
        this.firebaseCourseUpdateListeners.remove(firebaseCourseUpdateListener);
    }

    public void removeFirebaseInitialiseListener(FirebaseInitialiseListener firebaseInitialiseListener) {
        this.firebaseInitialiseListeners.remove(firebaseInitialiseListener);
    }

    public Goal removeGoalById(String str, String str2) {
        boolean z10;
        Iterator<Goal> it = getUserGoals().iterator();
        Goal goal = null;
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            goal = it.next();
            if (goal.getGoalId().equals(str) && goal.getCourseId().equals(str2)) {
                goal.setVisible(false);
                goal.setNotificationScheduled(false);
                fireAnalytics(goal, false, false);
                z10 = true;
                break;
            }
        }
        if (z10) {
            updateUserOnFirebase();
        }
        return goal;
    }

    public Goal removeTopicalGoalById(String str) {
        boolean z10;
        Iterator<Goal> it = getTopicalGoals().iterator();
        Goal goal = null;
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            goal = it.next();
            if (goal.getGoalId().equals(str)) {
                goal.setVisible(false);
                fireAnalytics(goal, false, false);
                z10 = true;
                break;
            }
        }
        if (z10) {
            updateUserOnFirebase();
        }
        return goal;
    }

    public void removeUserGamificationPointsFromFirebase() {
        this.user.getUserGamificationModel().setTotalGamificationPoints(this.user.getUserGamificationModel().getTotalGamificationPoints() - 10);
        updateGamificationPointsOnFirebase();
    }

    public void setContext(Context context) {
        this.context = context;
        initFirebase(null);
    }

    public void setFirebaseCourseUpdateListener(FirebaseCourseUpdateListener firebaseCourseUpdateListener) {
        this.firebaseCourseUpdateListeners.add(firebaseCourseUpdateListener);
    }

    public void setFirebaseInitialiseListener(FirebaseInitialiseListener firebaseInitialiseListener) {
        this.firebaseInitialiseListeners.add(firebaseInitialiseListener);
    }

    public void setIsAdhdCourseActive() {
        User user = this.user;
        if (user != null && user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT) != null && this.user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT).equals("variant_a") && FirebaseAuth.getInstance().a() != null) {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            final DatabaseReference reference = firebaseDatabase.getReference(Constants.FIREBASE_USER_COURSES_NODE + FirebaseAuth.getInstance().a());
            reference.addListenerForSingleValueEvent(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.FirebasePersistence.2
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    UserOnboardingModel userOnboardingModel = (UserOnboardingModel) dataSnapshot.getValue(UserOnboardingModel.class);
                    if (userOnboardingModel != null) {
                        if (userOnboardingModel.getAdhdCourse() == null) {
                            Course course = new Course();
                            course.set_id(UtilsKt.getCourseId(Constants.COURSE_ADHD));
                            course.setCourseName(Constants.COURSE_ADHD);
                            userOnboardingModel.setAdhdCourse(course);
                        }
                        userOnboardingModel.getAdhdCourse().setIsCourseStarted(true);
                        userOnboardingModel.getAdhdCourse().getStartDate().setTime(Utils.INSTANCE.getTodayTimeInSeconds());
                        reference.setValue(userOnboardingModel);
                        return;
                    }
                    Course course2 = new Course();
                    course2.set_id(UtilsKt.getCourseId(Constants.COURSE_ADHD));
                    course2.setCourseName(Constants.COURSE_ADHD);
                    course2.setIsCourseStarted(true);
                    course2.getStartDate().setTime(Utils.INSTANCE.getTodayTimeInSeconds());
                    reference.setValue(new UserOnboardingModel(course2, null, null));
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
    }

    public void setIsOcdCourseActive() {
        User user = this.user;
        if (user != null && user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT) != null && this.user.getAppConfig().get(Constants.NEW_COURSES_EXPERIMENT).equals("variant_a") && FirebaseAuth.getInstance().a() != null) {
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            final DatabaseReference reference = firebaseDatabase.getReference(Constants.FIREBASE_USER_COURSES_NODE + FirebaseAuth.getInstance().a());
            reference.addListenerForSingleValueEvent(new ValueEventListener() { // from class: com.theinnerhour.b2b.persistence.FirebasePersistence.3
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    UserOnboardingModel userOnboardingModel = (UserOnboardingModel) dataSnapshot.getValue(UserOnboardingModel.class);
                    if (userOnboardingModel != null) {
                        if (userOnboardingModel.getOcdCourse() == null) {
                            Course course = new Course();
                            course.set_id(UtilsKt.getCourseId(Constants.COURSE_OCD));
                            course.setCourseName(Constants.COURSE_OCD);
                            userOnboardingModel.setOcdCourse(course);
                        }
                        userOnboardingModel.getOcdCourse().setIsCourseStarted(true);
                        userOnboardingModel.getOcdCourse().getStartDate().setTime(Utils.INSTANCE.getTodayTimeInSeconds());
                        reference.setValue(userOnboardingModel);
                        return;
                    }
                    Course course2 = new Course();
                    course2.set_id(UtilsKt.getCourseId(Constants.COURSE_OCD));
                    course2.setCourseName(Constants.COURSE_OCD);
                    course2.setIsCourseStarted(true);
                    course2.getStartDate().setTime(Utils.INSTANCE.getTodayTimeInSeconds());
                    reference.setValue(new UserOnboardingModel(null, course2, null));
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void triggerNewItemsAdded(boolean z10) {
        Iterator<FirebaseCourseUpdateListener> it = this.firebaseCourseUpdateListeners.iterator();
        while (it.hasNext()) {
            FirebaseCourseUpdateListener next = it.next();
            if (next != null) {
                next.newItemsAdded(z10);
            }
        }
    }

    public void triggerUserDataChanged(boolean z10) {
        userDataChanged(z10);
    }

    public void updateGoal(Goal goal, Boolean bool) {
        if (bool.booleanValue()) {
            new UpdateGoalAsync().execute(goal);
        } else {
            updateUserGoal(goal);
        }
    }

    public void updateMixpanelProperties() {
        try {
            f.b bVar = MyApplication.V.a().d().f;
            fd.f fVar = FirebaseAuth.getInstance().f;
            Objects.requireNonNull(fVar);
            bVar.f(fVar.j0(), "Firebase ID");
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE);
            Objects.requireNonNull(stringValue);
            bVar.f(stringValue, "User Type");
            bVar.f(ApplicationPersistence.getInstance().getStringValue(ApplicationPersistence.FCM_ID), "FCM Token");
            bVar.f(SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID), "Organisation ID");
        } catch (Exception e10) {
            LogHelper.INSTANCE.d(e10.toString(), new Object[0]);
        }
    }

    public void updateMoEngageUserProperties() {
        try {
            MyApplication.a aVar = MyApplication.V;
            if (aVar.a().Q && aVar.a().P) {
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                ArrayList<String> arrayList = g.f15127b;
                String stringValue = applicationPersistence.getStringValue("moengage_user_saved_organisation_id");
                String str = "";
                if (SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID) != null) {
                    str = SessionManager.getInstance().getStringValue(SessionManager.KEY_ORGANISATION_ID);
                }
                if (!ApplicationPersistence.getInstance().getBooleanValue("moengage_user_attributes_updated", false) || !stringValue.equalsIgnoreCase(str)) {
                    MyApplication a10 = aVar.a();
                    String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE);
                    Objects.requireNonNull(stringValue2);
                    b.b(a10, stringValue2, "User Type");
                    b.b(aVar.a(), str, "Organisation ID");
                    ApplicationPersistence.getInstance().setBooleanValue("moengage_user_attributes_updated", true);
                    ApplicationPersistence.getInstance().setStringValue("moengage_user_saved_organisation_id", str);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.d(e10.toString(), new Object[0]);
        }
    }

    public void updateTopicalGoal(Goal goal) {
        int i6 = 0;
        while (true) {
            try {
                if (i6 >= this.user.getTopicalGoals().size()) {
                    break;
                }
                Goal goal2 = this.user.getTopicalGoals().get(i6);
                if (goal2.getGoalId().equals(goal.getGoalId()) && goal2.getCourseId().equals(goal.getCourseId())) {
                    this.user.getTopicalGoals().set(i6, goal);
                    break;
                }
                i6++;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, "exception", e10);
                return;
            }
        }
        updateUserOnFirebase();
    }

    public void updateUserOnFirebase() {
        if (this.user != null) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            this.pendingUpdate = Boolean.TRUE;
            this.pendingTimestamp = Long.valueOf(timeInMillis);
            this.user.setTimestamp(timeInMillis);
            DatabaseReference databaseReference = this.databaseReference;
            if (databaseReference != null) {
                databaseReference.setValue(this.user);
            }
        }
    }

    public void addNewGoal(String str, String str2, boolean z10, boolean z11) {
        if (z10) {
            new AddGoalAsync(z11).execute(str, str2);
        } else {
            addNewGoalToFirebase(str, str2, z11);
        }
    }

    public void addUserGamificationPointsToFirebase(ArrayList<GamificationModel> arrayList) {
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.user.getUserGamificationModel().setTotalGamificationPoints(arrayList.get(i6).getPoints() + this.user.getUserGamificationModel().getTotalGamificationPoints());
        }
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 100 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_100_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_100_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 500 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_500_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_500_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
        if (this.user.getUserGamificationModel().getTotalGamificationPoints() >= 1000 && !this.user.getUserGamificationModel().getBadges().containsKey(Constants.REACHED_1000_POINTS_BADGE)) {
            this.user.getUserGamificationModel().getBadges().put(Constants.REACHED_1000_POINTS_BADGE, Constants.BADGE_ATTAINED);
        }
        updateGamificationPointsOnFirebase();
        updateUserOnFirebase();
    }

    public List<Goal> getUserGoals() {
        User user = this.user;
        if (user != null) {
            return user.getUserGoals();
        }
        return new ArrayList();
    }

    public void addNewGoalToFirebase(String str, String str2, String str3, String str4, String str5, boolean z10) {
        boolean z11;
        try {
            Iterator<Goal> it = this.user.getUserGoals().iterator();
            while (it.hasNext()) {
                Goal next = it.next();
                if (Objects.equals(next.getGoalId(), str) && Objects.equals(next.getCourseId(), str2)) {
                    if (next.getSource() != null) {
                        if (!next.getSource().equals("daily_plan")) {
                        }
                    } else {
                        next.setSource("daily_plan");
                    }
                    next.setVisible(z10);
                    next.setmLastAdded(Calendar.getInstance().getTime());
                    updateUserOnFirebase();
                    z11 = false;
                    fireAnalytics(next, false, true);
                    break;
                }
            }
            z11 = true;
            if (z11) {
                Goal goal = new Goal();
                goal.setCourseId(str2);
                goal.setCourseName(str3);
                goal.setGoalId(str);
                goal.setType(str4);
                goal.setGoalName(str5);
                goal.setVisible(z10);
                goal.setSource("daily_plan");
                Utils utils = Utils.INSTANCE;
                goal.setmStartDate(utils.getTodayCalendar().getTime());
                goal.setmEndDate(utils.getTodayCalendar().getTime());
                addGoalToList(goal);
                checkAndUpdateGamificationScore(str);
                fireAnalytics(goal, z11, true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public void addNewGoalBasic(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, boolean z11, long j10) {
        boolean z12;
        Goal next;
        Iterator<Goal> it = this.user.getUserGoals().iterator();
        while (true) {
            z12 = true;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (next.getGoalId() != null && next.getCourseName() != null && next.getGoalId().equals(str) && next.getCourseName().equals(str4)) {
                if (next.getSource() != null) {
                    if (next.getSource().equals(str6)) {
                        break;
                    }
                } else {
                    next.setSource(str6);
                    break;
                }
            }
        }
        if (!z10 && !next.isVisible()) {
            z12 = false;
        }
        next.setVisible(z12);
        next.setmLastAdded(Calendar.getInstance().getTime());
        updateUserOnFirebase();
        fireAnalytics(next, false, z10);
        z12 = false;
        if (z12) {
            Goal goal = new Goal(str2, str);
            if (str5 != null) {
                goal.setType(str5);
            } else {
                goal.setType(Constants.getGoalType(str).getType());
            }
            goal.setCourseName(str4);
            goal.setCourseId(str2);
            goal.setGoalName(str3);
            goal.setVisible(z10);
            goal.setSource(str6);
            goal.setNotificationScheduled(z11);
            goal.getScheduledDate().setTime(j10 / 1000);
            addGoalToList(goal);
            if (z10) {
                checkAndUpdateGamificationScore(str);
            }
            fireAnalytics(goal, z12, z10);
        }
    }
}
