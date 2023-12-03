package hl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CommunityOnBoardingWelcomeActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import jl.g1;
import jl.h1;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements androidx.activity.result.b, BottomNavigationView.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17715u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f17716v;

    public /* synthetic */ o(s sVar, int i6) {
        this.f17715u = i6;
        this.f17716v = sVar;
    }

    @Override // androidx.activity.result.b
    public final void b(Object obj) {
        boolean z10;
        il.d dVar;
        Intent intent;
        boolean z11;
        boolean b10;
        hs.i iVar;
        tl.d dVar2 = null;
        Bundle bundle = null;
        tl.d dVar3 = null;
        int i6 = this.f17715u;
        boolean z12 = true;
        s this$0 = this.f17716v;
        switch (i6) {
            case 0:
                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                int i10 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result, "result");
                return;
            case 1:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i11 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.f17734v != null) {
                        this$0.O().k();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f17733u, e10);
                }
                this$0.G = false;
                if (this$0.f17734v != null) {
                    this$0.O().j();
                    return;
                }
                return;
            case 2:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                int i12 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.a0();
                return;
            case 3:
            default:
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                int i13 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if (subscriptionPersistence.getSubscriptionEnabled()) {
                    try {
                        this$0.h0(false);
                        this$0.b0();
                        this$0.J(subscriptionPersistence.getSubscriptionEnabled());
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$0.f17733u, e11);
                    }
                    this$0.O().j();
                    return;
                }
                return;
            case 4:
                androidx.activity.result.a result2 = (androidx.activity.result.a) obj;
                int i14 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NOTIFICATION_ALLIE_INTERACTION_SHOWED, false)) {
                    this$0.m0("post_allie", "allie");
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.NOTIFICATION_ALLIE_INTERACTION_SHOWED, true);
                }
                kotlin.jvm.internal.i.f(result2, "result");
                return;
            case 5:
                androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                int i15 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Fragment E = this$0.getChildFragmentManager().E(R.id.flExpertCareContainer);
                if (E instanceof tl.d) {
                    dVar2 = (tl.d) E;
                }
                if (dVar2 != null) {
                    dVar2.m0();
                }
                this$0.m0("teleconsultation", "bookings");
                return;
            case 6:
                androidx.activity.result.a aVar5 = (androidx.activity.result.a) obj;
                int i16 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.m0("teleconsultation", "bookings");
                return;
            case 7:
                androidx.activity.result.a result3 = (androidx.activity.result.a) obj;
                int i17 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result3, "result");
                int i18 = result3.f976u;
                if (i18 == -1) {
                    try {
                        if (this$0.f17734v != null) {
                            NotV4DashboardViewModel O = this$0.O();
                            ta.v.H(kc.f.H(O), null, 0, new g1(O, null), 3);
                            NotV4DashboardViewModel O2 = this$0.O();
                            ta.v.H(kc.f.H(O2), null, 0, new h1(O2, null), 3);
                        }
                        il.d dVar4 = this$0.A;
                        if (dVar4 != null) {
                            dVar4.o();
                        }
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(this$0.f17733u, e12);
                    }
                }
                Fragment E2 = this$0.getChildFragmentManager().E(R.id.flExpertCareContainer);
                if (E2 instanceof tl.d) {
                    dVar3 = (tl.d) E2;
                }
                if (dVar3 != null) {
                    dVar3.m0();
                }
                if (i18 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Intent intent2 = result3.f977v;
                    if ((intent2 == null || !intent2.getBooleanExtra("tele_flow_launched", false)) ? false : false) {
                        this$0.m0("teleconsultation", "bookings");
                        return;
                    }
                    return;
                }
                return;
            case 8:
                androidx.activity.result.a result4 = (androidx.activity.result.a) obj;
                int i19 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f17734v != null) {
                    NotV4DashboardViewModel O3 = this$0.O();
                    kotlin.jvm.internal.i.f(result4, "result");
                    try {
                        intent = result4.f977v;
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e("Exception when setting up onboarding tutorial", e13);
                    }
                    if (intent != null && intent.getBooleanExtra("new_assessment_completed", false)) {
                        ((androidx.lifecycle.w) O3.F.getValue()).i(Boolean.TRUE);
                        if (intent.getIntExtra("new_assessment_pos", -1) != -1) {
                            z11 = true;
                            b10 = kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION);
                            iVar = O3.W;
                            if (!b10 && FirebasePersistence.getInstance().getUserCourse().size() == 1 && z11 && !ApplicationPersistence.getInstance().getBooleanValue("onboarding_complete", false)) {
                                if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanSuggested().size() > 0) {
                                    ApplicationPersistence.getInstance().setBooleanValue("onboarding_complete", true);
                                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                        ((androidx.lifecycle.w) iVar.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                                    }
                                }
                            } else if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && z11 && FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size() > 1) {
                                ((androidx.lifecycle.w) iVar.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                            }
                            this$0.O().k();
                        }
                    }
                    z11 = false;
                    b10 = kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION);
                    iVar = O3.W;
                    if (!b10) {
                    }
                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        ((androidx.lifecycle.w) iVar.getValue()).l(new SingleUseEvent(Boolean.TRUE));
                    }
                    this$0.O().k();
                }
                if (!((result4 == null || result4.f976u != -1) ? false : false) && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "") && (dVar = this$0.A) != null) {
                    dVar.x();
                    return;
                }
                return;
            case 9:
                androidx.activity.result.a result5 = (androidx.activity.result.a) obj;
                int i20 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result5, "result");
                try {
                    if (result5.f976u == -1) {
                        this$0.J = true;
                        this$0.K();
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$0.f17733u, "exception", e14);
                    return;
                }
            case 10:
                androidx.activity.result.a result6 = (androidx.activity.result.a) obj;
                int i21 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(result6, "result");
                try {
                    if (result6.f976u == -1) {
                        Intent intent3 = result6.f977v;
                        if (intent3 != null) {
                            bundle = intent3.getExtras();
                        }
                        if (bundle != null) {
                            int intValue = Integer.valueOf(bundle.getInt("mood")).intValue();
                            Context requireContext = this$0.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            wn.u.a(intValue, requireContext).show();
                            this$0.N.getClass();
                            if (!yn.a.b()) {
                                new Handler(Looper.getMainLooper()).postDelayed(new n(this$0, 2), 2000L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(this$0.f17733u, "exception", e15);
                    return;
                }
            case 11:
                androidx.activity.result.a aVar6 = (androidx.activity.result.a) obj;
                int i22 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f17734v != null) {
                    this$0.Q();
                    this$0.O().j();
                    return;
                }
                return;
        }
    }

    @Override // sb.g.b
    public final boolean c(MenuItem item) {
        boolean z10;
        boolean z11;
        HashMap<String, Object> appConfig;
        String str;
        boolean z12;
        Intent intent;
        hs.f<Boolean, ArrayList<String>> d10;
        Boolean bool;
        int i6 = s.f17728g0;
        s this$0 = this.f17716v;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(item, "item");
        boolean z13 = true;
        item.setChecked(true);
        try {
            String str2 = null;
            switch (item.getItemId()) {
                case R.id.navigation_item_2 /* 2131365061 */:
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putString("source", "bottom_nav");
                    UtilsKt.fireAnalytics("dashboard_lib_explore_click", analyticsBundle);
                    this$0.f17729a0.a(new Intent(this$0.requireActivity(), LibraryActivity.class));
                    break;
                case R.id.navigation_item_3 /* 2131365062 */:
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                        analyticsBundle2.putString("source", "bottom_nav");
                        UtilsKt.fireAnalytics("dashboard_cope_click", analyticsBundle2);
                        this$0.T.a(new Intent(this$0.requireActivity(), BotPwaActivity.class));
                        break;
                    }
                    break;
                case R.id.navigation_item_4 /* 2131365063 */:
                    if (LocationPersistence.INSTANCE.isIndianUser()) {
                        Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                        if (stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        analyticsBundle3.putBoolean("therapist_assigned", z10);
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (appConfig = user.getAppConfig()) != null) {
                            z11 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                        } else {
                            z11 = false;
                        }
                        analyticsBundle3.putBoolean("disclaimer_consent", z11);
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str2 = user2.getVersion();
                        }
                        analyticsBundle3.putString("version", str2);
                        analyticsBundle3.putString("source", "bottom_nav");
                        UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle3);
                        il.d dVar = this$0.A;
                        z13 = (dVar == null || !dVar.d0()) ? false : false;
                        androidx.activity.result.c<Intent> cVar = this$0.U;
                        if (z13) {
                            cVar.a(new Intent(this$0.requireActivity(), ExpertCareInfoActivity.class).putExtra("source", "bottom_nav"));
                            break;
                        } else if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                            cVar.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class));
                            break;
                        }
                    } else {
                        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                        if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                            Extensions extensions = Extensions.INSTANCE;
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            extensions.toast(requireActivity, "Congrats, you already have a subscription", 1);
                            break;
                        } else {
                            androidx.activity.result.c<Intent> cVar2 = this$0.f17730b0;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                            cVar2.a(tr.r.s(requireActivity2, false).putExtra("source", "bottom_nav"));
                            break;
                        }
                    }
                    break;
                case R.id.navigation_item_5 /* 2131365064 */:
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("group_joined", ApplicationPersistence.getInstance().getBooleanValue(Constants.USER_JOINED_COMMUNITIES, false));
                            UtilsKt.fireAnalytics("dashboard_community_click", bundle);
                            if (this$0.C.isEmpty()) {
                                intent = new Intent(this$0.requireActivity(), CommunityOnBoardingWelcomeActivity.class);
                            } else {
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.USER_JOINED_COMMUNITIES, true);
                                intent = new Intent(this$0.requireActivity(), CommunitiesPwaActivity.class);
                            }
                        } else {
                            String str3 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", this$0.O);
                            bundle2.putString("experiment", "comm_acquisition");
                            bundle2.putString("platform", "android_app");
                            User user3 = FirebasePersistence.getInstance().getUser();
                            if (user3 != null) {
                                str = user3.getCurrentCourseName();
                            } else {
                                str = null;
                            }
                            bundle2.putString("domain", str);
                            User user4 = FirebasePersistence.getInstance().getUser();
                            if (user4 != null) {
                                str2 = user4.getCurrentCourseName();
                            }
                            bundle2.putString("course", str2);
                            if (!this$0.C.isEmpty()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bundle2.putBoolean("group_joined", z12);
                            if (this$0.f17734v != null && (d10 = this$0.O().V.d()) != null && (bool = d10.f19464u) != null) {
                                boolean booleanValue = bool.booleanValue();
                                bundle2.putBoolean("onboarding_completed", booleanValue);
                                if (booleanValue && (!this$0.C.isEmpty())) {
                                    bundle2.putStringArray("channel_joined_name", (String[]) this$0.C.toArray(new String[0]));
                                }
                            }
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle2, "dashboard_community_click");
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.USER_JOINED_COMMUNITIES, true);
                            intent = new Intent(this$0.requireActivity(), CommunitiesPwaActivity.class);
                        }
                        this$0.Y.a(intent);
                        break;
                    }
                    break;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f17733u, "exception", e10);
        }
        return false;
    }
}
