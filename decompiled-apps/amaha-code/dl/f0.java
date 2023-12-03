package dl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements androidx.activity.result.b, BottomNavigationView.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13015u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13016v;

    public /* synthetic */ f0(V3DashboardActivity v3DashboardActivity, int i6) {
        this.f13015u = i6;
        this.f13016v = v3DashboardActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0341 A[Catch: Exception -> 0x0436, TryCatch #2 {Exception -> 0x0436, blocks: (B:163:0x0320, B:165:0x032a, B:168:0x0333, B:174:0x0341, B:176:0x034b, B:178:0x0351, B:180:0x035d, B:182:0x0363, B:184:0x0372, B:186:0x0378, B:188:0x0385, B:191:0x038d, B:193:0x0397, B:195:0x039d, B:197:0x03a7, B:199:0x03ad, B:201:0x03c8, B:202:0x03d0, B:204:0x03f3, B:206:0x03fe, B:208:0x041b, B:210:0x0426), top: B:243:0x0320 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f3 A[Catch: Exception -> 0x0436, TryCatch #2 {Exception -> 0x0436, blocks: (B:163:0x0320, B:165:0x032a, B:168:0x0333, B:174:0x0341, B:176:0x034b, B:178:0x0351, B:180:0x035d, B:182:0x0363, B:184:0x0372, B:186:0x0378, B:188:0x0385, B:191:0x038d, B:193:0x0397, B:195:0x039d, B:197:0x03a7, B:199:0x03ad, B:201:0x03c8, B:202:0x03d0, B:204:0x03f3, B:206:0x03fe, B:208:0x041b, B:210:0x0426), top: B:243:0x0320 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041b A[Catch: Exception -> 0x0436, TryCatch #2 {Exception -> 0x0436, blocks: (B:163:0x0320, B:165:0x032a, B:168:0x0333, B:174:0x0341, B:176:0x034b, B:178:0x0351, B:180:0x035d, B:182:0x0363, B:184:0x0372, B:186:0x0378, B:188:0x0385, B:191:0x038d, B:193:0x0397, B:195:0x039d, B:197:0x03a7, B:199:0x03ad, B:201:0x03c8, B:202:0x03d0, B:204:0x03f3, B:206:0x03fe, B:208:0x041b, B:210:0x0426), top: B:243:0x0320 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0424  */
    @Override // androidx.activity.result.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        boolean z10;
        boolean z11;
        tl.d dVar;
        String str;
        boolean z12;
        String stringValue;
        String str2;
        String stringValue2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String lastName;
        String firstName;
        String string;
        boolean z13;
        CourseDayModelV1 dayPlanForDateV3;
        ProviderDetailHolderModel providerDetailHolderModel;
        pp.c cVar;
        String str9;
        androidx.lifecycle.w<hs.f<String, ProviderDetailHolderModel>> wVar;
        hs.f<String, ProviderDetailHolderModel> d10;
        km.d dVar2;
        String str10;
        androidx.lifecycle.w<hs.f<String, ProviderDetailHolderModel>> wVar2;
        hs.f<String, ProviderDetailHolderModel> d11;
        hs.f<String, ProviderDetailHolderModel> d12;
        Intent intent;
        int i6 = this.f13015u;
        boolean z14 = false;
        V3DashboardActivity this$0 = this.f13016v;
        String str11 = null;
        r12 = null;
        r12 = null;
        ProviderDetailHolderModel providerDetailHolderModel2 = null;
        tl.d dVar3 = null;
        tl.d dVar4 = null;
        switch (i6) {
            case 0:
                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result, "result");
                try {
                    if (result.f976u == -1) {
                        this$0.f10751w0 = true;
                        ml.c0 P0 = this$0.P0();
                        try {
                            ta.v.H(kc.f.H(P0), kotlinx.coroutines.o0.f23642c, 0, new ml.k0(P0, null), 2);
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(P0.A, e10);
                        }
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e11);
                    return;
                }
            case 1:
            default:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.r1();
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                    ((FrameLayout) this$0.n0(R.id.flDynamicCards)).removeAllViews();
                    ((FrameLayout) this$0.n0(R.id.flDynamicCards)).setVisibility(8);
                }
                if (aVar != null && aVar.f976u == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Intent intent2 = aVar.f977v;
                    if (intent2 != null && intent2.getBooleanExtra("launch_today_plan", false)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 && (dayPlanForDateV3 = CourseUtilKt.getDayPlanForDateV3(this$0.N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds())) != null) {
                        this$0.t0(dayPlanForDateV3);
                    }
                }
                if (this$0.J0 != null) {
                    String l2 = this$0.P0().l();
                    RobertoTextView robertoTextView = (RobertoTextView) this$0.n0(R.id.tvJournalSubHeader);
                    if (robertoTextView != null) {
                        if (!gv.n.B0(l2) && !kotlin.jvm.internal.i.b(l2, "null")) {
                            string = this$0.getString(R.string.your_journal_name, l2);
                        } else {
                            string = this$0.getString(R.string.your_journal_generic);
                        }
                        robertoTextView.setText(string);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) ((NavigationView) this$0.n0(R.id.dashboardv2NavView)).d().findViewById(R.id.dashboardMenuName);
                    Object[] objArr = new Object[1];
                    ml.c0 P02 = this$0.P0();
                    Object obj2 = "";
                    try {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str = user.getFirstName();
                        } else {
                            str = null;
                        }
                    } catch (Exception unused) {
                    }
                    if (str != null && str.length() != 0) {
                        z12 = false;
                        if (!z12) {
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (firstName = user2.getFirstName()) != null) {
                                str4 = gv.r.i1(firstName).toString();
                            } else {
                                str4 = null;
                            }
                            if (!kotlin.jvm.internal.i.b(str4, "null")) {
                                StringBuilder sb2 = new StringBuilder();
                                User user3 = FirebasePersistence.getInstance().getUser();
                                if (user3 != null) {
                                    str5 = user3.getFirstName();
                                } else {
                                    str5 = null;
                                }
                                sb2.append(str5);
                                User user4 = FirebasePersistence.getInstance().getUser();
                                if (user4 != null) {
                                    str6 = user4.getLastName();
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    User user5 = FirebasePersistence.getInstance().getUser();
                                    if (user5 != null && (lastName = user5.getLastName()) != null) {
                                        str8 = gv.r.i1(lastName).toString();
                                    } else {
                                        str8 = null;
                                    }
                                    if (!kotlin.jvm.internal.i.b(str8, "null")) {
                                        str7 = " " + FirebasePersistence.getInstance().getUser().getLastName();
                                        sb2.append(str7);
                                        obj2 = sb2.toString();
                                        objArr[0] = obj2;
                                        robertoTextView2.setText(this$0.getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                                    }
                                }
                                str7 = "";
                                sb2.append(str7);
                                obj2 = sb2.toString();
                                objArr[0] = obj2;
                                robertoTextView2.setText(this$0.getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                            }
                        }
                        Context applicationContext = P02.f2382x.getApplicationContext();
                        Object[] objArr2 = new Object[2];
                        stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                        kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                        if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
                            str2 = "";
                        } else {
                            str2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                        }
                        objArr2[0] = str2;
                        stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                        kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                        if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue2).toString(), "null")) {
                            str3 = "";
                        } else {
                            str3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                        }
                        objArr2[1] = str3;
                        Object string2 = applicationContext.getString(R.string.profileNewSessionsName, objArr2);
                        kotlin.jvm.internal.i.f(string2, "{\n                getApp…          )\n            }");
                        obj2 = string2;
                        objArr[0] = obj2;
                        robertoTextView2.setText(this$0.getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    Context applicationContext2 = P02.f2382x.getApplicationContext();
                    Object[] objArr22 = new Object[2];
                    stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                    kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                    if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
                    }
                    objArr22[0] = str2;
                    stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                    kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                    if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue2).toString(), "null")) {
                    }
                    objArr22[1] = str3;
                    Object string22 = applicationContext2.getString(R.string.profileNewSessionsName, objArr22);
                    kotlin.jvm.internal.i.f(string22, "{\n                getApp…          )\n            }");
                    obj2 = string22;
                    objArr[0] = obj2;
                    robertoTextView2.setText(this$0.getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                }
                if (this$0.Q0 && this$0.S0) {
                    this$0.S0 = false;
                    Fragment E = this$0.getSupportFragmentManager().E(R.id.flExpertCareContainer);
                    if (E instanceof tl.d) {
                        dVar = (tl.d) E;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.m0();
                    }
                }
                if (aVar != null && aVar.f976u == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    Intent intent3 = aVar.f977v;
                    if (intent3 != null && intent3.getBooleanExtra("tele_flow_launched", false)) {
                        z14 = true;
                    }
                    if (z14) {
                        this$0.H1("teleconsultation", "bookings");
                        return;
                    }
                    return;
                }
                return;
            case 2:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Dialog dialog = this$0.f10734l1;
                if (dialog != null) {
                    dialog.dismiss();
                }
                this$0.f10734l1 = null;
                return;
            case 3:
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    km.d dVar5 = this$0.Y0;
                    if (dVar5 != null && (wVar = dVar5.D) != null && (d10 = wVar.d()) != null) {
                        providerDetailHolderModel = d10.f19465v;
                    } else {
                        providerDetailHolderModel = null;
                    }
                    if (providerDetailHolderModel != null) {
                        Intent intent4 = new Intent(this$0, TelecommunicationsPWAActivity.class);
                        String providerType = providerDetailHolderModel.getProviderType();
                        if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
                            cVar = pp.c.PROFILE;
                        } else if (kotlin.jvm.internal.i.b(providerType, "psychiatrist")) {
                            cVar = pp.c.PROFILE_PSYCHIATRIST;
                        } else {
                            cVar = pp.c.PROFILE_COUPLES_THERAPIST;
                        }
                        this$0.startActivity(intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid()).putExtra("is_prevent_recording", true));
                        String str12 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                            bundle.putString("psychiatrist_name", providerDetailHolderModel.getName());
                            bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                        } else {
                            bundle.putString("therapist_name", providerDetailHolderModel.getName());
                            bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                        }
                        bundle.putString("source", "in_app_provider_video");
                        String providerType2 = providerDetailHolderModel.getProviderType();
                        if (kotlin.jvm.internal.i.b(providerType2, "couplestherapist")) {
                            str9 = "couples";
                        } else if (kotlin.jvm.internal.i.b(providerType2, "therapist")) {
                            str9 = "therapy";
                        } else {
                            str9 = "psychiatry";
                        }
                        bundle.putString("flow", str9);
                        User user6 = FirebasePersistence.getInstance().getUser();
                        if (user6 != null) {
                            str11 = user6.getCurrentCourseName();
                        }
                        bundle.putString("domain", str11);
                        bundle.putString("platform", "android_app");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "therapy_psychiatry_video_exit");
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e12);
                    return;
                }
            case 4:
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f((androidx.activity.result.a) obj, "result");
                try {
                    this$0.L1(true);
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e13);
                    return;
                }
            case 5:
                androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                int i15 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result2, "result");
                if (result2.f976u == -1) {
                    this$0.D1();
                    return;
                }
                return;
            case 6:
                androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                int i16 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.S0) {
                    this$0.S0 = false;
                    Fragment E2 = this$0.getSupportFragmentManager().E(R.id.flExpertCareContainer);
                    if (E2 instanceof tl.d) {
                        dVar4 = (tl.d) E2;
                    }
                    if (dVar4 != null) {
                        dVar4.m0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                androidx.activity.result.a aVar5 = (androidx.activity.result.a) obj;
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.S0) {
                    this$0.S0 = false;
                    Fragment E3 = this$0.getSupportFragmentManager().E(R.id.flExpertCareContainer);
                    if (E3 instanceof tl.d) {
                        dVar3 = (tl.d) E3;
                    }
                    if (dVar3 != null) {
                        dVar3.m0();
                    }
                }
                this$0.H1("teleconsultation", "bookings");
                return;
            case 8:
                androidx.activity.result.a aVar6 = (androidx.activity.result.a) obj;
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (aVar6.f976u == -1) {
                    Intent intent5 = aVar6.f977v;
                    if (intent5 != null && intent5.getBooleanExtra("expert_payment_done", false)) {
                        z14 = true;
                    }
                    if (z14 && (dVar2 = this$0.Y0) != null) {
                        String[] strArr = {"pending", "active"};
                        androidx.lifecycle.w<hs.f<String, ProviderDetailHolderModel>> wVar3 = dVar2.f23395z;
                        if (wVar3 != null && (d12 = wVar3.d()) != null) {
                            str10 = d12.f19464u;
                        } else {
                            str10 = null;
                        }
                        if (is.k.Q1(str10, strArr)) {
                            km.d dVar6 = this$0.Y0;
                            if (dVar6 != null && (wVar2 = dVar6.f23395z) != null && (d11 = wVar2.d()) != null) {
                                providerDetailHolderModel2 = d11.f19465v;
                            }
                            if (providerDetailHolderModel2 != null) {
                                this$0.G0();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                androidx.activity.result.a aVar7 = (androidx.activity.result.a) obj;
                int i19 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.k1();
                return;
            case 10:
                androidx.activity.result.a aVar8 = (androidx.activity.result.a) obj;
                int i20 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (aVar8 != null && (intent = aVar8.f977v) != null && intent.getBooleanExtra("time_over_return", false)) {
                    z14 = true;
                }
                if (z14) {
                    this$0.f10744r0 = true;
                    ym.c cVar2 = this$0.W;
                    if (cVar2 != null) {
                        cVar2.f();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("learningHubViewModel");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // sb.g.b
    public final boolean c(MenuItem item) {
        Intent putExtra;
        boolean z10;
        boolean z11;
        String str;
        HashMap<String, Object> appConfig;
        Intent putExtra2;
        Intent putExtra3;
        boolean z12;
        boolean z13;
        String str2;
        HashMap<String, Object> appConfig2;
        int i6 = this.f13015u;
        V3DashboardActivity this$0 = this.f13016v;
        switch (i6) {
            case 1:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(item, "item");
                item.setChecked(true);
                try {
                    int itemId = item.getItemId();
                    androidx.activity.result.c<Intent> cVar = this$0.F0;
                    switch (itemId) {
                        case R.id.navigation_item_2 /* 2131365061 */:
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            analyticsBundle.putString("source", "bottom_nav");
                            UtilsKt.fireAnalytics("dashboard_lib_explore_click", analyticsBundle);
                            this$0.startActivity(new Intent(this$0, LibraryActivity.class));
                            break;
                        case R.id.navigation_item_4 /* 2131365063 */:
                            if (LocationPersistence.INSTANCE.isIndianUser()) {
                                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                                if (stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                analyticsBundle2.putBoolean("therapist_assigned", z10);
                                User user = FirebasePersistence.getInstance().getUser();
                                if (user != null && (appConfig = user.getAppConfig()) != null) {
                                    z11 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                                } else {
                                    z11 = false;
                                }
                                analyticsBundle2.putBoolean("disclaimer_consent", z11);
                                User user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 != null) {
                                    str = user2.getVersion();
                                } else {
                                    str = null;
                                }
                                analyticsBundle2.putString("version", str);
                                analyticsBundle2.putString("source", "bottom_nav");
                                UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle2);
                                if (this$0.T0) {
                                    cVar.a(new Intent(this$0, ExpertCareInfoActivity.class).putExtra("source", "bottom_nav"));
                                } else if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                    this$0.G0.a(new Intent(this$0, TelecommunicationsPWAActivity.class));
                                }
                                if (this$0.Q0) {
                                    this$0.S0 = true;
                                    break;
                                }
                            } else if (this$0.f10715a0) {
                                if (sp.b.K()) {
                                    putExtra = new Intent(this$0, FirestoreGoalsActivity.class).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                                } else {
                                    putExtra = new Intent(this$0, V3GoalsActivity.class).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                                }
                                cVar.a(putExtra);
                                break;
                            } else {
                                Extensions extensions = Extensions.INSTANCE;
                                String string = this$0.getString(R.string.goalMigrationProgress);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                                extensions.toast(this$0, string, 1);
                                break;
                            }
                            break;
                        case R.id.navigation_item_5 /* 2131365064 */:
                            if (LocationPersistence.INSTANCE.isIndianUser()) {
                                if (this$0.f10715a0) {
                                    if (sp.b.K()) {
                                        putExtra2 = new Intent(this$0, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                                    } else {
                                        putExtra2 = new Intent(this$0, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                                    }
                                    cVar.a(putExtra2);
                                    break;
                                } else {
                                    Extensions extensions2 = Extensions.INSTANCE;
                                    String string2 = this$0.getString(R.string.goalMigrationProgress);
                                    kotlin.jvm.internal.i.f(string2, "getString(R.string.goalMigrationProgress)");
                                    extensions2.toast(this$0, string2, 1);
                                    break;
                                }
                            } else if (Utils.INSTANCE.checkConnectivity(this$0)) {
                                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                                if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                                    Extensions.INSTANCE.toast(this$0, "Congrats, you already have a subscription", 1);
                                    break;
                                } else {
                                    cVar.a(tr.r.s(this$0, false).putExtra("source", "bottom_nav"));
                                    break;
                                }
                            }
                            break;
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e10);
                }
                return false;
            default:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(item, "item");
                item.setChecked(true);
                int itemId2 = item.getItemId();
                int i12 = this$0.N;
                switch (itemId2) {
                    case R.id.navigation_goals /* 2131365057 */:
                        if (this$0.f10715a0) {
                            UtilsKt.fireAnalytics("dashboard_goals_click", UtilsKt.getAnalyticsBundle());
                            if (sp.b.K()) {
                                putExtra3 = new Intent(this$0, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                            } else {
                                putExtra3 = new Intent(this$0, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD).putExtra("entry_point_click", Constants.SCREEN_DASHBOARD);
                            }
                            this$0.startActivityForResult(putExtra3, i12);
                            break;
                        } else {
                            Extensions extensions3 = Extensions.INSTANCE;
                            String string3 = this$0.getString(R.string.goalMigrationProgress);
                            kotlin.jvm.internal.i.f(string3, "getString(R.string.goalMigrationProgress)");
                            extensions3.toast(this$0, string3, 1);
                            break;
                        }
                    case R.id.navigation_home /* 2131365059 */:
                        return true;
                    case R.id.navigation_profile /* 2131365065 */:
                        UtilsKt.fireAnalytics("dashboard_profile_click", UtilsKt.getAnalyticsBundle());
                        this$0.f10730j1.a(new Intent(this$0, ExperimentProfileActivity.class));
                        if (this$0.Q0) {
                            this$0.S0 = true;
                        }
                        this$0.n0(R.id.layoutProfileBottomToolTip).setVisibility(8);
                        break;
                    case R.id.navigation_therapist /* 2131365066 */:
                        if (Utils.INSTANCE.checkConnectivity(this$0)) {
                            if (!defpackage.b.u(SessionManager.KEY_USERTYPE, "patient")) {
                                Boolean booleanValue = SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED);
                                Boolean bool = Boolean.TRUE;
                                if (kotlin.jvm.internal.i.b(booleanValue, bool) && LocationPersistence.INSTANCE.isIndianUser()) {
                                    Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                                    String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                                    if (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    analyticsBundle3.putBoolean("therapist_assigned", z12);
                                    User user3 = FirebasePersistence.getInstance().getUser();
                                    if (user3 != null && (appConfig2 = user3.getAppConfig()) != null) {
                                        z13 = kotlin.jvm.internal.i.b(appConfig2.get(Constants.TELECOMMUNICATION_CONSENT), bool);
                                    } else {
                                        z13 = false;
                                    }
                                    analyticsBundle3.putBoolean("disclaimer_consent", z13);
                                    User user4 = FirebasePersistence.getInstance().getUser();
                                    if (user4 != null) {
                                        str2 = user4.getVersion();
                                    } else {
                                        str2 = null;
                                    }
                                    analyticsBundle3.putString("version", str2);
                                    analyticsBundle3.putString("source", "bottom_nav");
                                    UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle3);
                                    this$0.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), this$0.P);
                                    break;
                                }
                            }
                            Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                            kotlin.jvm.internal.i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                            if (SKIP_MONETIZATION.booleanValue()) {
                                this$0.startActivityForResult(new Intent(this$0, ProInitialAssessmentActivity.class).putExtra("source", "bottom_nav"), i12);
                            } else {
                                SubscriptionPersistence subscriptionPersistence2 = SubscriptionPersistence.INSTANCE;
                                if (subscriptionPersistence2.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence2.getSubscriptionType()), "plus")) {
                                    Extensions.INSTANCE.toast(this$0, "Congrats, you already have a subscription", 1);
                                } else {
                                    this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "bottom_nav").putExtra(Constants.CAMPAIGN_ID, this$0.C0), i12);
                                }
                            }
                            gk.a.b(new Bundle(), "premium_click");
                            break;
                        }
                        break;
                }
                return false;
        }
    }
}
