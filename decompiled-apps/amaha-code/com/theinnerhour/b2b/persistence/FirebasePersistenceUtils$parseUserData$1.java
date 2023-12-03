package com.theinnerhour.b2b.persistence;

import com.appsflyer.R;
import com.google.firebase.database.DataSnapshot;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LoginInterface;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
/* compiled from: FirebasePersistenceUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.persistence.FirebasePersistenceUtils$parseUserData$1", f = "FirebasePersistenceUtils.kt", l = {R.styleable.AppCompatTheme_checkboxStyle, R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FirebasePersistenceUtils$parseUserData$1 extends i implements p<d0, d<? super k>, Object> {
    final /* synthetic */ LoginInterface $loginInterface;
    final /* synthetic */ DataSnapshot $userData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FirebasePersistenceUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePersistenceUtils$parseUserData$1(DataSnapshot dataSnapshot, FirebasePersistenceUtils firebasePersistenceUtils, LoginInterface loginInterface, d<? super FirebasePersistenceUtils$parseUserData$1> dVar) {
        super(2, dVar);
        this.$userData = dataSnapshot;
        this.this$0 = firebasePersistenceUtils;
        this.$loginInterface = loginInterface;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new FirebasePersistenceUtils$parseUserData$1(this.$userData, this.this$0, this.$loginInterface, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:7:0x0021, B:35:0x00e3, B:37:0x00f5, B:41:0x00fe, B:42:0x0103, B:44:0x0108, B:12:0x0042, B:31:0x00a3, B:15:0x0049, B:17:0x0056, B:19:0x0068, B:21:0x0075, B:24:0x007e, B:28:0x0089), top: B:53:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: Exception -> 0x010c, TRY_LEAVE, TryCatch #0 {Exception -> 0x010c, blocks: (B:7:0x0021, B:35:0x00e3, B:37:0x00f5, B:41:0x00fe, B:42:0x0103, B:44:0x0108, B:12:0x0042, B:31:0x00a3, B:15:0x0049, B:17:0x0056, B:19:0x0068, B:21:0x0075, B:24:0x007e, B:28:0x0089), top: B:53:0x0007 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        User user;
        FirebasePersistence firebasePersistence;
        FirebasePersistenceUtils firebasePersistenceUtils;
        LoginInterface loginInterface;
        Object userPreferencesValue;
        FirebasePersistence firebasePersistence2;
        Object updateCourseInfo;
        FirebasePersistence firebasePersistence3;
        LoginInterface loginInterface2;
        FirebasePersistenceUtils firebasePersistenceUtils2;
        User user2;
        ArrayList<Goal> userGoals;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        boolean z10 = false;
        try {
        } catch (Exception e10) {
            LoginInterface loginInterface3 = this.$loginInterface;
            if (loginInterface3 != null) {
                loginInterface3.firebaseFailure();
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            str = this.this$0.TAG;
            logHelper.e(str, e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    firebasePersistence3 = (FirebasePersistence) this.L$4;
                    loginInterface2 = (LoginInterface) this.L$3;
                    firebasePersistenceUtils2 = (FirebasePersistenceUtils) this.L$2;
                    FirebasePersistence firebasePersistence4 = (FirebasePersistence) this.L$1;
                    user2 = (User) this.L$0;
                    b.d0(obj);
                    firebasePersistenceUtils2.checkAndSetAppsFlyerInfo();
                    firebasePersistenceUtils2.updateMixpanelProperties();
                    firebasePersistenceUtils2.updateUserAppVersion();
                    firebasePersistenceUtils2.getGAIDTask();
                    userGoals = user2.getUserGoals();
                    if ((userGoals != null || userGoals.isEmpty()) ? true : true) {
                        wn.b.f36765a.getClass();
                    }
                    firebasePersistence3.checkAndInitOnboardingExperimentFirebase();
                    if (loginInterface2 != null) {
                        loginInterface2.firebaseSuccess();
                    }
                    return k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            firebasePersistence = (FirebasePersistence) this.L$4;
            loginInterface = (LoginInterface) this.L$3;
            firebasePersistenceUtils = (FirebasePersistenceUtils) this.L$2;
            firebasePersistence2 = (FirebasePersistence) this.L$1;
            user = (User) this.L$0;
            b.d0(obj);
        } else {
            b.d0(obj);
            user = (User) this.$userData.getValue(User.class);
            if (user != null) {
                firebasePersistence = this.this$0.persistence;
                firebasePersistenceUtils = this.this$0;
                loginInterface = this.$loginInterface;
                if (firebasePersistence.pendingUpdate.booleanValue()) {
                    Boolean pendingUpdate = firebasePersistence.pendingUpdate;
                    kotlin.jvm.internal.i.f(pendingUpdate, "pendingUpdate");
                    if (pendingUpdate.booleanValue()) {
                        Long l2 = firebasePersistence.pendingTimestamp;
                        long timestamp = user.getTimestamp();
                        if (l2 != null && l2.longValue() == timestamp) {
                        }
                    }
                    firebasePersistence2 = firebasePersistence;
                }
                firebasePersistence.pendingUpdate = Boolean.FALSE;
                firebasePersistence.setUser(user);
                this.L$0 = user;
                this.L$1 = firebasePersistence;
                this.L$2 = firebasePersistenceUtils;
                this.L$3 = loginInterface;
                this.L$4 = firebasePersistence;
                this.label = 1;
                userPreferencesValue = firebasePersistenceUtils.setUserPreferencesValue(user, this);
                if (userPreferencesValue == aVar) {
                    return aVar;
                }
                firebasePersistence2 = firebasePersistence;
            }
            return k.f19476a;
        }
        firebasePersistence.triggerUserDataChanged(true);
        firebasePersistenceUtils.updateForCourse(user);
        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
        firebasePersistence.courseSize = applicationPersistence.getIntValue(firebasePersistence.getUser().getCurrentCourseName() + "CourseSize", 0);
        this.L$0 = user;
        this.L$1 = firebasePersistence2;
        this.L$2 = firebasePersistenceUtils;
        this.L$3 = loginInterface;
        this.L$4 = firebasePersistence;
        this.label = 2;
        updateCourseInfo = firebasePersistenceUtils.updateCourseInfo(user, this);
        if (updateCourseInfo == aVar) {
            return aVar;
        }
        firebasePersistence3 = firebasePersistence;
        loginInterface2 = loginInterface;
        firebasePersistenceUtils2 = firebasePersistenceUtils;
        user2 = user;
        firebasePersistenceUtils2.checkAndSetAppsFlyerInfo();
        firebasePersistenceUtils2.updateMixpanelProperties();
        firebasePersistenceUtils2.updateUserAppVersion();
        firebasePersistenceUtils2.getGAIDTask();
        userGoals = user2.getUserGoals();
        if ((userGoals != null || userGoals.isEmpty()) ? true : true) {
        }
        firebasePersistence3.checkAndInitOnboardingExperimentFirebase();
        if (loginInterface2 != null) {
        }
        return k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((FirebasePersistenceUtils$parseUserData$1) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
