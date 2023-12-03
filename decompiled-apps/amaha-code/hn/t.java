package hn;

import android.net.Uri;
import android.os.Bundle;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.service.PostLoginNotificationWorkManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import lg.f;
import nf.c;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$fetchRemoteConfigData$1", f = "LoginSignupReworkViewModel.kt", l = {1467, 1470, 1471}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17938u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17939v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar, ls.d<? super t> dVar) {
        super(2, dVar);
        this.f17939v = qVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new t(this.f17939v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((t) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:53|(1:145)|57|(3:58|59|(1:61)(1:142))|(2:63|(8:65|66|67|(1:69)(9:73|(12:75|76|77|78|79|80|81|82|83|(2:85|(5:87|88|89|90|91))|129|91)(1:136)|92|93|(1:125)(3:97|(1:99)|100)|101|(3:104|(5:107|(1:109)(1:119)|(2:114|115)(1:117)|116|105)|120)|(1:122)|123)|70|(1:72)|40|(0)(0)))|141|66|67|(0)(0)|70|(0)|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x033e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x033f, code lost:
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0341, code lost:
        r22 = "status";
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135 A[Catch: Exception -> 0x033e, TRY_ENTER, TryCatch #0 {Exception -> 0x033e, blocks: (B:54:0x0135, B:55:0x01b1, B:57:0x01c1, B:59:0x01cd), top: B:160:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1 A[Catch: Exception -> 0x033e, TryCatch #0 {Exception -> 0x033e, blocks: (B:54:0x0135, B:55:0x01b1, B:57:0x01c1, B:59:0x01cd), top: B:160:0x0133 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object b10;
        hs.f fVar;
        String str3;
        String str4;
        String str5;
        q qVar;
        String str6;
        String str7;
        String str8;
        Object b11;
        String str9;
        boolean z10;
        boolean z11;
        String str10;
        List<String> campaignsList;
        String str11;
        User user;
        String str12;
        User user2;
        boolean z12;
        q qVar2;
        String str13;
        ArrayList<MiniCourse> miniCourses;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17938u;
        q qVar3 = this.f17939v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        str5 = "auth_status";
                        qVar = qVar3;
                        str6 = "type";
                        str7 = "status";
                        str = "signup";
                        str2 = "login";
                        str8 = "auth_type";
                        qVar.getClass();
                        user = FirebasePersistence.getInstance().getUser();
                        if (user == null) {
                            str12 = user.getCurrentCourseName();
                        } else {
                            str12 = null;
                        }
                        user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 == null && (miniCourses = user2.getMiniCourses()) != null && (!miniCourses.isEmpty())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            ApplicationPersistence.getInstance().setIntValue(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT, 0);
                        }
                        qVar2 = qVar;
                        androidx.lifecycle.w<String> wVar = qVar2.X;
                        androidx.lifecycle.w<LoginLoading> wVar2 = qVar2.F;
                        if (str12 == null) {
                            CourseApiUtil courseApiUtil = new CourseApiUtil();
                            courseApiUtil.setCourseApiListener(new z(qVar2));
                            if (is.k.Q1(str12, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                                wVar2.i(LoginLoading.HIDE_LOADING);
                                wVar.i(Constants.SCREEN_DASHBOARD);
                            } else {
                                CourseApiUtil.sendCourseApiRequest$default(courseApiUtil, str12, null, 2, null);
                            }
                        } else {
                            wVar2.i(LoginLoading.HIDE_LOADING);
                            wVar.i("condition_selection");
                        }
                        wVar2.i(LoginLoading.HIDE_LOADING);
                        String str14 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        if (!qVar2.l()) {
                            str13 = str;
                        } else {
                            str13 = str2;
                        }
                        bundle.putString(str8, str13);
                        bundle.putString(str7, "success");
                        bundle.putString(str6, qVar2.Z.getAnalyticsString());
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, str5);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
                b11 = obj;
                str5 = "auth_status";
                qVar = qVar3;
                str4 = "fail";
                str6 = "type";
                str7 = "status";
                str = "signup";
                str2 = "login";
                str8 = "auth_type";
                if (((Boolean) b11).booleanValue()) {
                    this.f17938u = 3;
                    if (ca.a.P(500L, this) == aVar) {
                        return aVar;
                    }
                    qVar.getClass();
                    user = FirebasePersistence.getInstance().getUser();
                    if (user == null) {
                    }
                    user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 == null) {
                    }
                    z12 = false;
                    if (z12) {
                    }
                    qVar2 = qVar;
                    androidx.lifecycle.w<String> wVar3 = qVar2.X;
                    androidx.lifecycle.w<LoginLoading> wVar22 = qVar2.F;
                    if (str12 == null) {
                    }
                    wVar22.i(LoginLoading.HIDE_LOADING);
                    String str142 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    if (!qVar2.l()) {
                    }
                    bundle2.putString(str8, str13);
                    bundle2.putString(str7, "success");
                    bundle2.putString(str6, qVar2.Z.getAnalyticsString());
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, str5);
                    return hs.k.f19476a;
                }
                String str15 = str5;
                String str16 = str6;
                String str17 = str7;
                String str18 = str8;
                q qVar4 = qVar;
                qVar4.H.i(qVar4.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                qVar4.F.i(LoginLoading.HIDE_LOADING);
                String str19 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                if (qVar4.l()) {
                    str11 = str;
                } else {
                    str11 = str2;
                }
                bundle3.putString(str18, str11);
                bundle3.putString(str17, str4);
                bundle3.putString(str16, qVar4.Z.getAnalyticsString());
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, str15);
                return hs.k.f19476a;
            }
            sp.b.d0(obj);
            b10 = obj;
            str = "signup";
            str2 = "login";
        } else {
            sp.b.d0(obj);
            b bVar = qVar3.C;
            this.f17938u = 1;
            bVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            try {
            } catch (Exception e10) {
                e = e10;
                str = "signup";
            }
            try {
                if (!(!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient"))) {
                    str = "signup";
                    try {
                        str2 = "login";
                        hVar.resumeWith(new hs.f(Boolean.TRUE, null));
                    } catch (Exception e11) {
                        e = e11;
                        str2 = "login";
                        LogHelper.INSTANCE.e(bVar.f17789a, "exception", e);
                        hVar.resumeWith(new hs.f(Boolean.FALSE, null));
                        b10 = hVar.b();
                        if (b10 == aVar) {
                        }
                        fVar = (hs.f) b10;
                        if (((Boolean) fVar.f19464u).booleanValue()) {
                        }
                    }
                } else {
                    str = "signup";
                    str2 = "login";
                    ((or.k) nr.b.a(or.k.class)).b("https://api.theinnerhour.com/v1/org/org-offering").I(new f(hVar));
                }
            } catch (Exception e12) {
                e = e12;
                LogHelper.INSTANCE.e(bVar.f17789a, "exception", e);
                hVar.resumeWith(new hs.f(Boolean.FALSE, null));
                b10 = hVar.b();
                if (b10 == aVar) {
                }
                fVar = (hs.f) b10;
                if (((Boolean) fVar.f19464u).booleanValue()) {
                }
            }
            b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
        }
        fVar = (hs.f) b10;
        if (((Boolean) fVar.f19464u).booleanValue()) {
            HashMap hashMap = (HashMap) fVar.f19465v;
            hashMap = (hashMap == null || hashMap.keySet().isEmpty()) ? null : null;
            b bVar2 = qVar3.C;
            this.f17938u = 2;
            bVar2.getClass();
            str4 = "fail";
            ls.h hVar2 = new ls.h(ca.a.G0(this));
            try {
                User user3 = FirebasePersistence.getInstance().getUser();
                if (user3 != null) {
                    str9 = user3.getVersion();
                } else {
                    str9 = null;
                }
            } catch (Exception e13) {
                e = e13;
                str5 = "auth_status";
                qVar = qVar3;
                str6 = "type";
            }
            if (str9 != null) {
                if (str9.length() != 0) {
                    str5 = "auth_status";
                    z10 = false;
                    str6 = "type";
                    if (!z10) {
                        nf.b e14 = nf.b.e();
                        kotlin.jvm.internal.i.f(e14, "getInstance()");
                        e14.g(new nf.c(new c.a()));
                        HashMap hashMap2 = new HashMap();
                        Boolean bool = Boolean.FALSE;
                        hashMap2.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, bool);
                        hashMap2.put(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT, "default");
                        hashMap2.put(Constants.IH_RESOURCES_EXPERIMENT, bool);
                        hashMap2.put(Constants.TELE_ENTRY_POINT_EXPERIMENT, "d");
                        hashMap2.put(Constants.LIBRARY_EXPERIMENT_V3, "default");
                        hashMap2.put(Constants.A3_ONBOARDING_REVAMP, "default");
                        hashMap2.put(Constants.DASHBOARD_LIBRARY_EXPERIMENT, "default");
                        hashMap2.put(Constants.NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4, bool);
                        hashMap2.put(Constants.JOURNAL_EXPERIMENT, "default");
                        hashMap2.put(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT, "variant_a");
                        hashMap2.put(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT, "variant_a");
                        hashMap2.put(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT, "variant_b");
                        hashMap2.put(Constants.NEW_COURSES_EXPERIMENT, "default");
                        hashMap2.put(Constants.APP_PROMPTS_EXPERIMENT, "default");
                        e14.h(hashMap2);
                        e14.b().addOnCompleteListener(new e(hVar2, bVar2, e14, hashMap));
                        qVar = qVar3;
                        str7 = "status";
                        str8 = "auth_type";
                    } else {
                        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK), "")) {
                            f.b bVar3 = MyApplication.V.a().d().f;
                            Uri parse = Uri.parse(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_UTM_LINK));
                            str7 = "status";
                            try {
                                campaignsList = parse.getQueryParameters("utm_campaign");
                                str8 = "auth_type";
                            } catch (Exception e15) {
                                e = e15;
                                qVar = qVar3;
                                str8 = "auth_type";
                                LogHelper.INSTANCE.e(bVar2.f17789a, "exception", e);
                                hVar2.resumeWith(Boolean.FALSE);
                                b11 = hVar2.b();
                                if (b11 == aVar) {
                                }
                                if (((Boolean) b11).booleanValue()) {
                                }
                            }
                            try {
                                List<String> contentList = parse.getQueryParameters("utm_content");
                                kotlin.jvm.internal.i.f(campaignsList, "campaignsList");
                                if (!campaignsList.isEmpty()) {
                                    kotlin.jvm.internal.i.f(contentList, "contentList");
                                    if (!contentList.isEmpty()) {
                                        qVar = qVar3;
                                        try {
                                            bVar3.a(campaignsList.get(0), "UTM Campaigns");
                                            bVar3.a(contentList.get(0), "UTM Content");
                                            ApplicationPersistence.getInstance().deleteKey(Constants.DYNAMIC_UTM_LINK);
                                        } catch (Exception e16) {
                                            e = e16;
                                            LogHelper.INSTANCE.e(bVar2.f17789a, "exception", e);
                                            hVar2.resumeWith(Boolean.FALSE);
                                            b11 = hVar2.b();
                                            if (b11 == aVar) {
                                            }
                                            if (((Boolean) b11).booleanValue()) {
                                            }
                                        }
                                    }
                                }
                                qVar = qVar3;
                                ApplicationPersistence.getInstance().deleteKey(Constants.DYNAMIC_UTM_LINK);
                            } catch (Exception e17) {
                                e = e17;
                                qVar = qVar3;
                                LogHelper.INSTANCE.e(bVar2.f17789a, "exception", e);
                                hVar2.resumeWith(Boolean.FALSE);
                                b11 = hVar2.b();
                                if (b11 == aVar) {
                                }
                                if (((Boolean) b11).booleanValue()) {
                                }
                            }
                        } else {
                            qVar = qVar3;
                            str7 = "status";
                            str8 = "auth_type";
                        }
                        ApplicationPersistence.getInstance().setStringValue(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                        if (!FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP) && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
                            kotlin.jvm.internal.i.f(appConfig, "getInstance().user.appConfig");
                            appConfig.put(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, Boolean.valueOf(ApplicationPersistence.getInstance().getBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, false)));
                            if (ApplicationPersistence.getInstance().getBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP, false)) {
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXISTING_TOOL, true);
                            }
                            String str20 = gk.a.f16573a;
                            Bundle bundle4 = new Bundle();
                            Object obj2 = FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP);
                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                            bundle4.putBoolean("value", ((Boolean) obj2).booleanValue());
                            hs.k kVar4 = hs.k.f19476a;
                            gk.a.b(bundle4, Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && hashMap != null) {
                            Set<String> keySet = hashMap.keySet();
                            kotlin.jvm.internal.i.f(keySet, "overrideData.keys");
                            for (String str21 : keySet) {
                                Object obj3 = FirebasePersistence.getInstance().getUser().getAppConfig().get(str21);
                                if (obj3 instanceof String) {
                                    str10 = (String) obj3;
                                } else {
                                    str10 = null;
                                }
                                if (str10 == null || kotlin.jvm.internal.i.b(str10, "default")) {
                                    HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                                    kotlin.jvm.internal.i.f(appConfig2, "getInstance().user.appConfig");
                                    appConfig2.put(str21, hashMap.get(str21));
                                    z11 = true;
                                }
                            }
                        }
                        if (z11) {
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                        hVar2.resumeWith(Boolean.TRUE);
                    }
                    b11 = hVar2.b();
                    if (b11 == aVar) {
                        return aVar;
                    }
                    if (((Boolean) b11).booleanValue()) {
                    }
                }
            }
            str5 = "auth_status";
            z10 = true;
            str6 = "type";
            if (!z10) {
            }
            b11 = hVar2.b();
            if (b11 == aVar) {
            }
            if (((Boolean) b11).booleanValue()) {
            }
        } else {
            qVar3.H.i(qVar3.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
            qVar3.F.i(LoginLoading.HIDE_LOADING);
            String str22 = gk.a.f16573a;
            Bundle bundle5 = new Bundle();
            if (qVar3.l()) {
                str3 = str;
            } else {
                str3 = str2;
            }
            bundle5.putString("auth_type", str3);
            bundle5.putString("status", "fail");
            bundle5.putString("type", qVar3.Z.getAnalyticsString());
            hs.k kVar5 = hs.k.f19476a;
            gk.a.b(bundle5, "auth_status");
            return hs.k.f19476a;
        }
    }
}
