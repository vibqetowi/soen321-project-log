package com.theinnerhour.b2b.persistence;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.LoginInterface;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import fd.f;
import g9.a;
import gk.e;
import gv.n;
import hs.d;
import hs.k;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.scheduling.c;
import lg.f;
import org.json.JSONObject;
import sp.b;
import ta.v;
/* compiled from: FirebasePersistenceUtils.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/theinnerhour/b2b/persistence/FirebasePersistenceUtils;", "", "Lcom/theinnerhour/b2b/model/User;", "user", "Lhs/k;", "updateForCourse", "updateCourseInfo", "(Lcom/theinnerhour/b2b/model/User;Lls/d;)Ljava/lang/Object;", "checkAndSetAppsFlyerInfo", "updateMixpanelProperties", "updateUserAppVersion", "getGAIDTask", "parsedUser", "setUserPreferencesValue", "Lcom/google/firebase/database/DataSnapshot;", "userData", "Lcom/theinnerhour/b2b/model/LoginInterface;", "loginInterface", "parseUserData", "Lcom/theinnerhour/b2b/persistence/FirebasePersistence;", "persistence", "Lcom/theinnerhour/b2b/persistence/FirebasePersistence;", "Lsf/i;", "gson$delegate", "Lhs/d;", "getGson", "()Lsf/i;", "gson", "", "TAG", "Ljava/lang/String;", "Lgk/e;", "mixpanelUtils", "Lgk/e;", "<init>", "(Lcom/theinnerhour/b2b/persistence/FirebasePersistence;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirebasePersistenceUtils {
    private final String TAG;
    private final d gson$delegate;
    private final e mixpanelUtils;
    private final FirebasePersistence persistence;

    public FirebasePersistenceUtils(FirebasePersistence persistence) {
        i.g(persistence, "persistence");
        this.persistence = persistence;
        this.gson$delegate = b.O(FirebasePersistenceUtils$gson$2.INSTANCE);
        this.TAG = LogHelper.INSTANCE.makeLogTag("FirebasePersistenceUtils");
        this.mixpanelUtils = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndSetAppsFlyerInfo() {
        boolean z10;
        try {
            if (this.mixpanelUtils.a()) {
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                this.persistence.getUser().setAppsFlyerID(appsFlyerLib.getAppsFlyerUID(MyApplication.V.a()));
                if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) != null) {
                    String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
                    i.f(string, "getInstance().getString(…erProperties.APP_USER_ID)");
                    if (string.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return;
                    }
                }
                f fVar = FirebaseAuth.getInstance().f;
                Objects.requireNonNull(fVar);
                appsFlyerLib.setCustomerUserId(fVar.j0());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getGAIDTask() {
        String str;
        try {
            s9.e eVar = s9.e.f31337d;
            MyApplication.a aVar = MyApplication.V;
            if (eVar.c(aVar.a()) == 0) {
                a.C0248a a10 = g9.a.a(aVar.a());
                if (!a10.f16387b && (str = a10.f16386a) != null) {
                    this.persistence.getUser().setGAID(str);
                }
            }
        } catch (Exception unused) {
        }
    }

    private final sf.i getGson() {
        return (sf.i) this.gson$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setUserPreferencesValue(User user, ls.d<? super k> dVar) {
        FirebasePersistenceUtils$setUserPreferencesValue$1 firebasePersistenceUtils$setUserPreferencesValue$1;
        int i6;
        FirebasePersistenceUtils firebasePersistenceUtils;
        boolean z10;
        if (dVar instanceof FirebasePersistenceUtils$setUserPreferencesValue$1) {
            firebasePersistenceUtils$setUserPreferencesValue$1 = (FirebasePersistenceUtils$setUserPreferencesValue$1) dVar;
            int i10 = firebasePersistenceUtils$setUserPreferencesValue$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                firebasePersistenceUtils$setUserPreferencesValue$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = firebasePersistenceUtils$setUserPreferencesValue$1.result;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = firebasePersistenceUtils$setUserPreferencesValue$1.label;
                if (i6 == 0) {
                    if (i6 == 1) {
                        firebasePersistenceUtils = (FirebasePersistenceUtils) firebasePersistenceUtils$setUserPreferencesValue$1.L$0;
                        try {
                            b.d0(obj);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(firebasePersistenceUtils.TAG, e);
                            return k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b.d0(obj);
                    try {
                        String userString = getGson().g(user);
                        i.f(userString, "userString");
                        if (userString.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            try {
                                c cVar = o0.f23640a;
                                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                                FirebasePersistenceUtils$setUserPreferencesValue$2 firebasePersistenceUtils$setUserPreferencesValue$2 = new FirebasePersistenceUtils$setUserPreferencesValue$2(userString, null);
                                firebasePersistenceUtils$setUserPreferencesValue$1.L$0 = this;
                                firebasePersistenceUtils$setUserPreferencesValue$1.label = 1;
                                if (v.S(k1Var, firebasePersistenceUtils$setUserPreferencesValue$2, firebasePersistenceUtils$setUserPreferencesValue$1) == aVar) {
                                    return aVar;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                firebasePersistenceUtils = this;
                                LogHelper.INSTANCE.e(firebasePersistenceUtils.TAG, e);
                                return k.f19476a;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                }
                return k.f19476a;
            }
        }
        firebasePersistenceUtils$setUserPreferencesValue$1 = new FirebasePersistenceUtils$setUserPreferencesValue$1(this, dVar);
        Object obj2 = firebasePersistenceUtils$setUserPreferencesValue$1.result;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = firebasePersistenceUtils$setUserPreferencesValue$1.label;
        if (i6 == 0) {
        }
        return k.f19476a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCourseInfo(User user, ls.d<? super k> dVar) {
        FirebasePersistenceUtils$updateCourseInfo$1 firebasePersistenceUtils$updateCourseInfo$1;
        int i6;
        FirebasePersistenceUtils firebasePersistenceUtils;
        boolean z10;
        Integer num;
        ArrayList<CourseDayModelV1> planV3;
        Integer num2;
        ArrayList<SuggestedActivityModel> planSuggested;
        if (dVar instanceof FirebasePersistenceUtils$updateCourseInfo$1) {
            firebasePersistenceUtils$updateCourseInfo$1 = (FirebasePersistenceUtils$updateCourseInfo$1) dVar;
            int i10 = firebasePersistenceUtils$updateCourseInfo$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                firebasePersistenceUtils$updateCourseInfo$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = firebasePersistenceUtils$updateCourseInfo$1.result;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = firebasePersistenceUtils$updateCourseInfo$1.label;
                if (i6 == 0) {
                    if (i6 != 1 && i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    firebasePersistenceUtils = (FirebasePersistenceUtils) firebasePersistenceUtils$updateCourseInfo$1.L$0;
                    try {
                        b.d0(obj);
                    } catch (Exception e10) {
                        e = e10;
                        LogHelper.INSTANCE.e(firebasePersistenceUtils.TAG, e);
                        return k.f19476a;
                    }
                } else {
                    b.d0(obj);
                    try {
                        Course courseById = this.persistence.getCourseById(user.getCurrentCourse());
                        if (user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (courseById != null && (planSuggested = courseById.getPlanSuggested()) != null) {
                                num2 = new Integer(planSuggested.size());
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                if (num2.intValue() != this.persistence.courseSize) {
                                    int intValue = num2.intValue();
                                    FirebasePersistence firebasePersistence = this.persistence;
                                    if (intValue > firebasePersistence.courseSize) {
                                        firebasePersistence.courseSize = num2.intValue();
                                        String str = gk.a.f16573a;
                                        Bundle bundle = new Bundle();
                                        ApplicationPersistence.getInstance().deleteKey("asst_request_sent");
                                        bundle.putString("variant", "suggested");
                                        bundle.putLong("algo_delay_millis", Calendar.getInstance().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue("asst_request_sent", -1L));
                                        bundle.putString(Constants.CURRENT_COURSE, user.getCurrentCourseName());
                                        bundle.putString("set", courseById.getSet());
                                        k kVar = k.f19476a;
                                        gk.a.b(bundle, "algo_fetch_complete");
                                    }
                                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                                    applicationPersistence.setIntValue(user.getCurrentCourseName() + "CourseSize", this.persistence.courseSize);
                                    c cVar = o0.f23640a;
                                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                                    FirebasePersistenceUtils$updateCourseInfo$3 firebasePersistenceUtils$updateCourseInfo$3 = new FirebasePersistenceUtils$updateCourseInfo$3(this, null);
                                    firebasePersistenceUtils$updateCourseInfo$1.L$0 = this;
                                    firebasePersistenceUtils$updateCourseInfo$1.label = 1;
                                    if (v.S(k1Var, firebasePersistenceUtils$updateCourseInfo$3, firebasePersistenceUtils$updateCourseInfo$1) == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                        } else {
                            if (courseById != null && (planV3 = courseById.getPlanV3()) != null) {
                                num = new Integer(planV3.size());
                            } else {
                                num = null;
                            }
                            if (num != null) {
                                if (num.intValue() != this.persistence.courseSize) {
                                    u uVar = new u();
                                    int intValue2 = num.intValue();
                                    FirebasePersistence firebasePersistence2 = this.persistence;
                                    if (intValue2 > firebasePersistence2.courseSize) {
                                        firebasePersistence2.courseSize = num.intValue();
                                        uVar.f23466u = true;
                                        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                                        applicationPersistence2.setIntValue(user.getCurrentCourseName() + "CourseSize", num.intValue());
                                        CourseApiUtil courseApiUtil = this.persistence.courseApiUtil;
                                        if (courseApiUtil != null) {
                                            courseApiUtil.fetchNotificationData();
                                            courseApiUtil.updateNotifications();
                                        }
                                        if (ApplicationPersistence.getInstance().getLongValue("asst_request_sent", -1L) != -1) {
                                            ApplicationPersistence.getInstance().deleteKey("asst_request_sent");
                                            String str2 = gk.a.f16573a;
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("variant", Constants.USER_VERSION);
                                            bundle2.putLong("algo_delay_millis", Calendar.getInstance().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue("asst_request_sent", -1L));
                                            bundle2.putString(Constants.CURRENT_COURSE, user.getCurrentCourseName());
                                            k kVar2 = k.f19476a;
                                            gk.a.b(bundle2, "algo_fetch_complete");
                                        }
                                    }
                                    c cVar2 = o0.f23640a;
                                    k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                                    FirebasePersistenceUtils$updateCourseInfo$6 firebasePersistenceUtils$updateCourseInfo$6 = new FirebasePersistenceUtils$updateCourseInfo$6(this, uVar, null);
                                    firebasePersistenceUtils$updateCourseInfo$1.L$0 = this;
                                    firebasePersistenceUtils$updateCourseInfo$1.label = 2;
                                    if (v.S(k1Var2, firebasePersistenceUtils$updateCourseInfo$6, firebasePersistenceUtils$updateCourseInfo$1) == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        firebasePersistenceUtils = this;
                        LogHelper.INSTANCE.e(firebasePersistenceUtils.TAG, e);
                        return k.f19476a;
                    }
                }
                return k.f19476a;
            }
        }
        firebasePersistenceUtils$updateCourseInfo$1 = new FirebasePersistenceUtils$updateCourseInfo$1(this, dVar);
        Object obj2 = firebasePersistenceUtils$updateCourseInfo$1.result;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = firebasePersistenceUtils$updateCourseInfo$1.label;
        if (i6 == 0) {
        }
        return k.f19476a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:2:0x0000, B:4:0x0006, B:10:0x0012), top: B:15:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateForCourse(User user) {
        boolean z10;
        try {
            String currentCourseName = user.getCurrentCourseName();
            if (currentCourseName != null && !n.B0(currentCourseName)) {
                z10 = false;
                if (z10) {
                    ApplicationPersistence.getInstance().setStringValueAsync(Constants.CURRENT_COURSE, currentCourseName);
                    lg.f d10 = MyApplication.V.a().d();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("domain", currentCourseName);
                    d10.k(jSONObject);
                    return;
                }
                return;
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMixpanelProperties() {
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
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserAppVersion() {
        try {
            if (this.persistence.getUser().getAppVersion() != 214 || !i.b(this.persistence.getUser().getPlatform(), "android")) {
                this.persistence.getUser().setPlatform("android");
                this.persistence.getUser().setAppVersion(214);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void parseUserData(DataSnapshot userData, LoginInterface loginInterface) {
        i.g(userData, "userData");
        v.H(h.c(o0.f23642c), null, 0, new FirebasePersistenceUtils$parseUserData$1(userData, this, loginInterface, null), 3);
    }
}
