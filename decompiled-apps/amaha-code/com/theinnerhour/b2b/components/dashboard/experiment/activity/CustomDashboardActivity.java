package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.google.android.material.navigation.NavigationView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenOptionsActivity;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.h0;
import dl.w;
import e.d;
import hl.g;
import hs.f;
import il.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import jl.e;
import jl.m;
import jl.n;
import jl.o;
import jl.q;
import jl.u;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
import tr.r;
import ya.j;
/* compiled from: CustomDashboardActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/CustomDashboardActivity;", "Landroidx/appcompat/app/c;", "Lcom/google/android/material/navigation/NavigationView$a;", "Lil/b;", "Lxk/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomDashboardActivity extends c implements NavigationView.a, b, xk.a {
    public static final /* synthetic */ int C = 0;
    public v.c A;
    public final androidx.activity.result.c<Intent> B;

    /* renamed from: v  reason: collision with root package name */
    public final String f10807v;

    /* renamed from: w  reason: collision with root package name */
    public e f10808w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10809x;

    /* renamed from: y  reason: collision with root package name */
    public final FeedBackUtils f10810y;

    /* renamed from: z  reason: collision with root package name */
    public final df.b f10811z;

    /* compiled from: CustomDashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<Boolean, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                int i6 = CustomDashboardActivity.C;
                CustomDashboardActivity.this.p0();
            }
            return hs.k.f19476a;
        }
    }

    public CustomDashboardActivity() {
        new LinkedHashMap();
        this.f10807v = LogHelper.INSTANCE.makeLogTag("CustomDashboardActivity");
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new d(), new androidx.activity.result.b(this) { // from class: fl.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ CustomDashboardActivity f15132v;

            {
                this.f15132v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                hl.g gVar;
                jl.e eVar;
                int i6 = r2;
                hl.g gVar2 = null;
                CustomDashboardActivity this$0 = this.f15132v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = CustomDashboardActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment F = this$0.getSupportFragmentManager().F("dashboard_fragment");
                        if (F instanceof hl.g) {
                            gVar = (hl.g) F;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null && kotlin.jvm.internal.i.b(gVar.F, Boolean.FALSE) && (eVar = gVar.f17678v) != null) {
                            ta.v.H(kc.f.H(eVar), null, 0, new jl.g(eVar, null), 3);
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = CustomDashboardActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment F2 = this$0.getSupportFragmentManager().F("dashboard_fragment");
                        if (F2 instanceof hl.g) {
                            gVar2 = (hl.g) F2;
                        }
                        if (gVar2 != null) {
                            gVar2.K();
                            return;
                        }
                        return;
                }
            }
        });
        i.f(registerForActivityResult, "registerForActivityResul…derAssignedStatus()\n    }");
        this.f10809x = registerForActivityResult;
        this.f10810y = new FeedBackUtils();
        new yn.a();
        this.f10811z = new df.b(25);
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new d(), new androidx.activity.result.b(this) { // from class: fl.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ CustomDashboardActivity f15132v;

            {
                this.f15132v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                hl.g gVar;
                jl.e eVar;
                int i6 = r2;
                hl.g gVar2 = null;
                CustomDashboardActivity this$0 = this.f15132v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = CustomDashboardActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment F = this$0.getSupportFragmentManager().F("dashboard_fragment");
                        if (F instanceof hl.g) {
                            gVar = (hl.g) F;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null && kotlin.jvm.internal.i.b(gVar.F, Boolean.FALSE) && (eVar = gVar.f17678v) != null) {
                            ta.v.H(kc.f.H(eVar), null, 0, new jl.g(eVar, null), 3);
                            return;
                        }
                        return;
                    default:
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                        int i11 = CustomDashboardActivity.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Fragment F2 = this$0.getSupportFragmentManager().F("dashboard_fragment");
                        if (F2 instanceof hl.g) {
                            gVar2 = (hl.g) F2;
                        }
                        if (gVar2 != null) {
                            gVar2.K();
                            return;
                        }
                        return;
                }
            }
        });
        i.f(registerForActivityResult2, "registerForActivityResul…CommunityOnReturn()\n    }");
        this.B = registerForActivityResult2;
    }

    @Override // xk.a
    public final void E(Bundle bundle, String str) {
        this.B.a(new Intent(this, CommunitiesPwaActivity.class));
    }

    @Override // il.b
    public final void O() {
        getSupportFragmentManager().W();
    }

    @Override // il.b
    public final void R() {
        DrawerLayout drawerLayout;
        v.c cVar = this.A;
        if (cVar != null && (drawerLayout = (DrawerLayout) cVar.f34634y) != null) {
            drawerLayout.p();
        }
    }

    @Override // il.b
    public final boolean Y() {
        g gVar;
        Fragment F = getSupportFragmentManager().F("dashboard_fragment");
        if (F instanceof g) {
            gVar = (g) F;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar.U();
        }
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationView.a
    public final void c(MenuItem item) {
        DrawerLayout drawerLayout;
        MenuItem menuItem;
        CharSequence title;
        NavigationView navigationView;
        Menu menu;
        HashMap<String, Object> appConfig;
        i.g(item, "item");
        boolean z10 = false;
        String str = null;
        boolean z11 = true;
        switch (item.getItemId()) {
            case R.id.nav_dashboard_lock /* 2131365036 */:
                startActivity(new Intent(this, LockScreenOptionsActivity.class));
                Bundle bundle = new Bundle();
                bundle.putString("source", "side_menu");
                UtilsKt.fireAnalytics("dashboard_security_pin_click", bundle);
                break;
            case R.id.nav_dashboard_logs /* 2131365037 */:
                UtilsKt.fireAnalytics("dashboard_logs_click", UtilsKt.getAnalyticsBundle());
                v.c cVar = this.A;
                if (cVar != null && (navigationView = (NavigationView) cVar.f34633x) != null && (menu = navigationView.getMenu()) != null) {
                    menuItem = menu.findItem(R.id.nav_dashboard_logs);
                } else {
                    menuItem = null;
                }
                Intent intent = new Intent(this, ScreenLogsActivity.class);
                if (menuItem != null && (title = menuItem.getTitle()) != null) {
                    str = title.toString();
                }
                intent.putExtra("title", str);
                startActivity(intent);
                break;
            case R.id.nav_dashboard_logs_additional /* 2131365038 */:
                Intent intent2 = new Intent(this, ScreenLogsActivity.class);
                intent2.putExtra("logType", a.EnumC0358a.ADDITIONAL_LOGS);
                startActivity(intent2);
                break;
            case R.id.nav_dashboard_logs_library /* 2131365039 */:
                startActivity(new Intent(this, LibraryScreenLogsActivity.class));
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "side_menu");
                UtilsKt.fireAnalytics("dashboard_library_logs_click", bundle2);
                break;
            case R.id.nav_dashboard_logs_main /* 2131365040 */:
                Intent intent3 = new Intent(this, ScreenLogsActivity.class);
                intent3.putExtra("logType", a.EnumC0358a.MAIN_PLAN_LOGS);
                startActivity(intent3);
                break;
            case R.id.nav_dashboard_premium /* 2131365041 */:
                String str2 = gk.a.f16573a;
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("source", "side_menu");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(analyticsBundle, "premium_click ");
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if (subscriptionPersistence.getSubscriptionEnabled() && i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                    Extensions.INSTANCE.toast(this, "Congrats, you already have a subscription", 1);
                    break;
                } else {
                    startActivity(r.s(this, false).putExtra("source", "side_menu"));
                    break;
                }
                break;
            case R.id.nav_dashboard_rate_us /* 2131365042 */:
                Dialog showFeedbackPopup = this.f10810y.showFeedbackPopup(Constants.FEEDBACK_TOP_MENU);
                if (showFeedbackPopup != null) {
                    showFeedbackPopup.show();
                }
                UtilsKt.fireAnalytics("dashboard_feedback_menu_click", UtilsKt.getAnalyticsBundle());
                break;
            case R.id.nav_dashboard_saved_item /* 2131365043 */:
                new Intent(this, BookmarkingActivity.class).putExtra("source", "side_menu");
                break;
            case R.id.nav_dashboard_settings /* 2131365044 */:
                UtilsKt.fireAnalytics("dashboard_settings_click", UtilsKt.getAnalyticsBundle());
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.nav_dashboard_therapy /* 2131365045 */:
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                analyticsBundle2.putBoolean("therapist_assigned", (stringValue == null || i.b(stringValue, "null") || i.b(stringValue, "")) ? false : false);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    z10 = i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                }
                analyticsBundle2.putBoolean("disclaimer_consent", z10);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getVersion();
                }
                analyticsBundle2.putString("version", str);
                analyticsBundle2.putString("source", "side_menu");
                UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle2);
                this.f10809x.a(new Intent(this, TelecommunicationsPWAActivity.class));
                break;
            case R.id.nav_dashboard_tracker_logs /* 2131365046 */:
                Intent intent4 = new Intent(this, MultiTrackerInsightsActivity.class);
                intent4.putExtra("show_logs", true);
                startActivity(intent4);
                Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                analyticsBundle3.putString("source", Constants.SCREEN_DASHBOARD);
                UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle3);
                break;
        }
        v.c cVar2 = this.A;
        if (cVar2 != null && (drawerLayout = (DrawerLayout) cVar2.f34634y) != null) {
            drawerLayout.c();
        }
    }

    @Override // il.b
    public final void e() {
        g gVar;
        Fragment F = getSupportFragmentManager().F("dashboard_fragment");
        if (F instanceof g) {
            gVar = (g) F;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.P();
        }
    }

    @Override // il.b
    public final void m() {
        g gVar;
        Fragment F = getSupportFragmentManager().F("dashboard_fragment");
        if (F instanceof g) {
            gVar = (g) F;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.H.a(new Intent(gVar.requireActivity(), ExperimentProfileActivity.class));
        }
    }

    public final void n0(String str) {
        String stringExtra;
        String str2;
        boolean b10 = i.b(str, "professional");
        pp.c cVar = pp.c.DB_FILTER_APPLIED;
        String str3 = null;
        if (b10) {
            Intent putExtra = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str3 = user.getCurrentCourseName();
            }
            putExtra.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        } else if (i.b(str, "professional_profile")) {
            Intent intent = getIntent();
            if (intent != null && (stringExtra = intent.getStringExtra(SessionManager.KEY_UUID)) != null) {
                Intent putExtra2 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.A3_FILTER_APPLIED_PROFILE).putExtra(SessionManager.KEY_UUID, stringExtra);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                if (putExtra2.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str2)) != null) {
                    return;
                }
            }
            Intent putExtra3 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user3 = FirebasePersistence.getInstance().getUser();
            if (user3 != null) {
                str3 = user3.getCurrentCourseName();
            }
            putExtra3.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        } else {
            Intent putExtra4 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
            User user4 = FirebasePersistence.getInstance().getUser();
            if (user4 != null) {
                str3 = user4.getCurrentCourseName();
            }
            putExtra4.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[Catch: Exception -> 0x0117, TryCatch #0 {Exception -> 0x0117, blocks: (B:4:0x0003, B:7:0x000b, B:11:0x0015, B:17:0x0026, B:19:0x0032, B:21:0x0037, B:67:0x00e3, B:72:0x00ee, B:74:0x00f4, B:76:0x00f9, B:80:0x0104, B:82:0x010b, B:84:0x0113, B:25:0x0040, B:27:0x0051, B:29:0x0057, B:30:0x005c, B:31:0x0064, B:33:0x006a, B:37:0x0080, B:39:0x008d, B:40:0x0094, B:42:0x009a, B:44:0x00a6, B:51:0x00b3, B:52:0x00ba, B:55:0x00c0, B:60:0x00cb, B:62:0x00d7, B:64:0x00dc, B:35:0x007a, B:48:0x00ac), top: B:89:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: Exception -> 0x0117, TryCatch #0 {Exception -> 0x0117, blocks: (B:4:0x0003, B:7:0x000b, B:11:0x0015, B:17:0x0026, B:19:0x0032, B:21:0x0037, B:67:0x00e3, B:72:0x00ee, B:74:0x00f4, B:76:0x00f9, B:80:0x0104, B:82:0x010b, B:84:0x0113, B:25:0x0040, B:27:0x0051, B:29:0x0057, B:30:0x005c, B:31:0x0064, B:33:0x006a, B:37:0x0080, B:39:0x008d, B:40:0x0094, B:42:0x009a, B:44:0x00a6, B:51:0x00b3, B:52:0x00ba, B:55:0x00c0, B:60:0x00cb, B:62:0x00d7, B:64:0x00dc, B:35:0x007a, B:48:0x00ac), top: B:89:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(Intent intent) {
        Bundle extras;
        Uri uri;
        boolean z10;
        String str;
        RoutingIntentHandler q10;
        boolean z11;
        g gVar;
        boolean z12;
        String stringExtra;
        g gVar2 = null;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10807v, e10);
                return;
            }
        } else {
            extras = null;
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        boolean z13 = false;
        if (extras != null && extras.getBoolean("switch_programme")) {
            z10 = true;
        } else {
            z10 = false;
        }
        df.b bVar = this.f10811z;
        if (z10) {
            Fragment F = getSupportFragmentManager().F("dashboard_fragment");
            if (F instanceof g) {
                gVar2 = (g) F;
            }
            if (gVar2 != null) {
                gVar2.M();
            }
        } else {
            if (uri != null) {
                String uri2 = uri.toString();
                i.f(uri2, "uri.toString()");
                if (!gv.r.J0(uri2, "appointment")) {
                    str = uri.getLastPathSegment();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    for (String str2 : uri.getQueryParameterNames()) {
                        extras.putString(str2, uri.getQueryParameter(str2));
                    }
                    bVar.getClass();
                    q10 = df.b.q(str, extras, intent, this);
                    if (q10.getIntent() != null) {
                        startActivity(q10.getIntent());
                    }
                    if (q10.getRoutingType() != null) {
                        Fragment F2 = getSupportFragmentManager().F("dashboard_fragment");
                        if (F2 instanceof g) {
                            gVar = (g) F2;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            try {
                                gVar.C = q10;
                                gVar.S();
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(gVar.f17677u, e11);
                            }
                        }
                    }
                    if (hs.k.f19476a == null) {
                        if (extras != null && extras.containsKey(Constants.API_COURSE_LINK)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Fragment F3 = getSupportFragmentManager().F("dashboard_fragment");
                            if (F3 instanceof g) {
                                gVar2 = (g) F3;
                            }
                            if (gVar2 != null) {
                                gVar2.M();
                            }
                        }
                    }
                }
            }
            if (extras != null) {
                str = extras.getString(Constants.API_COURSE_LINK);
            } else {
                str = null;
            }
            bVar.getClass();
            q10 = df.b.q(str, extras, intent, this);
            if (q10.getIntent() != null) {
            }
            if (q10.getRoutingType() != null) {
            }
            if (hs.k.f19476a == null) {
            }
        }
        if (extras != null && extras.containsKey(Constants.NOTIFICATION_INTENT)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && extras.getBoolean(Constants.NOTIFICATION_INTENT)) {
            bVar.t(extras);
        }
        if (intent != null && intent.getBooleanExtra("login_activity_new", false)) {
            z13 = true;
        }
        if (z13) {
            Utils.INSTANCE.setActivityNotification(true);
        }
        if (intent != null && (stringExtra = intent.getStringExtra(Constants.A3_VAR_B_FLOW_FLAG)) != null) {
            n0(stringExtra);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DrawerLayout drawerLayout;
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        View view;
        View view2;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        MenuItem menuItem7;
        MenuItem menuItem8;
        MenuItem menuItem9;
        Menu menu;
        int i6;
        boolean z10;
        g gVar;
        ArrayList<MiniCourse> arrayList;
        boolean z11;
        yp.c cVar;
        RobertoEditText robertoEditText;
        yp.c cVar2;
        ConstraintLayout constraintLayout;
        e eVar;
        MenuItem item;
        NavigationView navigationView;
        NavigationView navigationView2;
        boolean z12;
        NavigationView navigationView3;
        Menu menu2;
        NavigationView navigationView4;
        Menu menu3;
        NavigationView navigationView5;
        Menu menu4;
        NavigationView navigationView6;
        Menu menu5;
        NavigationView navigationView7;
        Menu menu6;
        NavigationView navigationView8;
        Menu menu7;
        NavigationView navigationView9;
        Menu menu8;
        MenuItem findItem;
        View actionView;
        NavigationView navigationView10;
        Menu menu9;
        MenuItem findItem2;
        View actionView2;
        NavigationView navigationView11;
        Menu menu10;
        NavigationView navigationView12;
        Menu menu11;
        NavigationView navigationView13;
        Menu menu12;
        NavigationView navigationView14;
        View d10;
        AppCompatImageView appCompatImageView;
        RobertoTextView robertoTextView;
        String str;
        boolean z13;
        String str2;
        String str3;
        String string;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String lastName;
        String firstName;
        NavigationView navigationView15;
        View d11;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_custom_dashboard, (ViewGroup) null, false);
        int i10 = R.id.customContentView;
        View w10 = hc.d.w(R.id.customContentView, inflate);
        if (w10 != null) {
            int i11 = R.id.clNPSBottomSheet;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheet, w10);
            if (constraintLayout2 != null) {
                i11 = R.id.clNPSBottomSheetView1;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheetView1, w10);
                if (constraintLayout3 != null) {
                    i11 = R.id.clNPSBottomSheetView2;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) hc.d.w(R.id.clNPSBottomSheetView2, w10);
                    if (constraintLayout4 != null) {
                        i11 = R.id.cvNPSRatingImage;
                        if (((CardView) hc.d.w(R.id.cvNPSRatingImage, w10)) != null) {
                            i11 = R.id.etNPSBottomSheetFeedback;
                            RobertoEditText robertoEditText2 = (RobertoEditText) hc.d.w(R.id.etNPSBottomSheetFeedback, w10);
                            if (robertoEditText2 != null) {
                                i11 = R.id.flCustomDashboardMain;
                                if (((FrameLayout) hc.d.w(R.id.flCustomDashboardMain, w10)) != null) {
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivNPSBottomSheetClose, w10);
                                    if (appCompatImageView2 != null) {
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.ivNPSBottomSheetFeedbackClose, w10);
                                        if (appCompatImageView3 != null) {
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) hc.d.w(R.id.ivNPSRatingImage, w10);
                                            if (appCompatImageView4 != null) {
                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) hc.d.w(R.id.ivNPSSeekSelector, w10);
                                                if (appCompatImageView5 != null) {
                                                    RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.rbNPSSubmit1, w10);
                                                    if (robertoButton != null) {
                                                        RobertoButton robertoButton2 = (RobertoButton) hc.d.w(R.id.rbNPSSubmit2, w10);
                                                        if (robertoButton2 != null) {
                                                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) hc.d.w(R.id.sbNPSSelector, w10);
                                                            if (appCompatSeekBar != null) {
                                                                if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetFeedbackQuestion, w10)) != null) {
                                                                    if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetFeedbackQuestionSubtext, w10)) != null) {
                                                                        if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetQuestion, w10)) != null) {
                                                                            if (((RobertoTextView) hc.d.w(R.id.tvNPSBottomSheetQuestionSubtext, w10)) != null) {
                                                                                RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvNPSFooterPrompt, w10);
                                                                                if (robertoTextView2 != null) {
                                                                                    if (((RobertoTextView) hc.d.w(R.id.tvNPSHighIndicator, w10)) != null) {
                                                                                        if (((RobertoTextView) hc.d.w(R.id.tvNPSLowIndicator, w10)) != null) {
                                                                                            RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel0, w10);
                                                                                            if (robertoTextView3 != null) {
                                                                                                RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel1, w10);
                                                                                                if (robertoTextView4 != null) {
                                                                                                    RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel10, w10);
                                                                                                    if (robertoTextView5 != null) {
                                                                                                        RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel2, w10);
                                                                                                        if (robertoTextView6 != null) {
                                                                                                            RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel3, w10);
                                                                                                            if (robertoTextView7 != null) {
                                                                                                                RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel4, w10);
                                                                                                                if (robertoTextView8 != null) {
                                                                                                                    RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel5, w10);
                                                                                                                    if (robertoTextView9 != null) {
                                                                                                                        RobertoTextView robertoTextView10 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel6, w10);
                                                                                                                        if (robertoTextView10 != null) {
                                                                                                                            RobertoTextView robertoTextView11 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel7, w10);
                                                                                                                            if (robertoTextView11 != null) {
                                                                                                                                RobertoTextView robertoTextView12 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel8, w10);
                                                                                                                                if (robertoTextView12 != null) {
                                                                                                                                    RobertoTextView robertoTextView13 = (RobertoTextView) hc.d.w(R.id.tvNPSSeekLevel9, w10);
                                                                                                                                    if (robertoTextView13 != null) {
                                                                                                                                        View w11 = hc.d.w(R.id.viewDashboardBlanketForeground, w10);
                                                                                                                                        if (w11 != null) {
                                                                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) w10;
                                                                                                                                            yp.c cVar3 = new yp.c(constraintLayout2, constraintLayout3, constraintLayout4, robertoEditText2, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, robertoButton, robertoButton2, appCompatSeekBar, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, robertoTextView8, robertoTextView9, robertoTextView10, robertoTextView11, robertoTextView12, robertoTextView13, w11);
                                                                                                                                            NavigationView navigationView16 = (NavigationView) hc.d.w(R.id.customNavigationView, inflate);
                                                                                                                                            if (navigationView16 != null) {
                                                                                                                                                DrawerLayout drawerLayout2 = (DrawerLayout) inflate;
                                                                                                                                                v.c cVar4 = new v.c(drawerLayout2, cVar3, navigationView16, drawerLayout2, 15);
                                                                                                                                                this.A = cVar4;
                                                                                                                                                switch (15) {
                                                                                                                                                    case 15:
                                                                                                                                                        drawerLayout = (DrawerLayout) cVar4.f34631v;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        drawerLayout = (DrawerLayout) cVar4.f34631v;
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                setContentView(drawerLayout);
                                                                                                                                                getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
                                                                                                                                                e eVar2 = (e) new o0(this, new q(new u(), new rp.a(0), MyApplication.V.a())).a(e.class);
                                                                                                                                                eVar2.getClass();
                                                                                                                                                ll.a aVar = new ll.a();
                                                                                                                                                f<String, Boolean> a10 = aVar.a();
                                                                                                                                                f<String, Boolean> b10 = aVar.b();
                                                                                                                                                i.b(a10.f19464u, "default");
                                                                                                                                                String str9 = b10.f19464u;
                                                                                                                                                if (a10.f19465v.booleanValue() || b10.f19465v.booleanValue()) {
                                                                                                                                                    v.H(kc.f.H(eVar2), null, 0, new jl.f(eVar2, null), 3);
                                                                                                                                                }
                                                                                                                                                v.H(kc.f.H(eVar2), kotlinx.coroutines.o0.f23642c, 0, new jl.b(eVar2, null), 2);
                                                                                                                                                this.f10808w = eVar2;
                                                                                                                                                try {
                                                                                                                                                    v.c cVar5 = this.A;
                                                                                                                                                    if (cVar5 != null && (navigationView15 = (NavigationView) cVar5.f34633x) != null && (d11 = navigationView15.d()) != null) {
                                                                                                                                                        robertoTextView = (RobertoTextView) d11.findViewById(R.id.dashboardMenuName);
                                                                                                                                                    } else {
                                                                                                                                                        robertoTextView = null;
                                                                                                                                                    }
                                                                                                                                                    if (robertoTextView != null) {
                                                                                                                                                        Object[] objArr = new Object[1];
                                                                                                                                                        User user = FirebasePersistence.getInstance().getUser();
                                                                                                                                                        if (user != null) {
                                                                                                                                                            str = user.getFirstName();
                                                                                                                                                        } else {
                                                                                                                                                            str = null;
                                                                                                                                                        }
                                                                                                                                                        if (str != null && str.length() != 0) {
                                                                                                                                                            z13 = false;
                                                                                                                                                        } else {
                                                                                                                                                            z13 = true;
                                                                                                                                                        }
                                                                                                                                                        if (!z13) {
                                                                                                                                                            User user2 = FirebasePersistence.getInstance().getUser();
                                                                                                                                                            if (user2 != null && (firstName = user2.getFirstName()) != null) {
                                                                                                                                                                str4 = gv.r.i1(firstName).toString();
                                                                                                                                                            } else {
                                                                                                                                                                str4 = null;
                                                                                                                                                            }
                                                                                                                                                            if (!i.b(str4, "null")) {
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
                                                                                                                                                                    if (!i.b(str8, "null")) {
                                                                                                                                                                        str7 = " " + FirebasePersistence.getInstance().getUser().getLastName();
                                                                                                                                                                        sb2.append(str7);
                                                                                                                                                                        string = sb2.toString();
                                                                                                                                                                        objArr[0] = string;
                                                                                                                                                                        robertoTextView.setText(getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                str7 = "";
                                                                                                                                                                sb2.append(str7);
                                                                                                                                                                string = sb2.toString();
                                                                                                                                                                objArr[0] = string;
                                                                                                                                                                robertoTextView.setText(getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        Object[] objArr2 = new Object[2];
                                                                                                                                                        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                                                                                                                                                        i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
                                                                                                                                                        if (i.b(gv.r.i1(stringValue).toString(), "null")) {
                                                                                                                                                            str2 = "";
                                                                                                                                                        } else {
                                                                                                                                                            str2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
                                                                                                                                                        }
                                                                                                                                                        objArr2[0] = str2;
                                                                                                                                                        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                                                                                                                                                        i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
                                                                                                                                                        if (i.b(gv.r.i1(stringValue2).toString(), "null")) {
                                                                                                                                                            str3 = "";
                                                                                                                                                        } else {
                                                                                                                                                            str3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
                                                                                                                                                        }
                                                                                                                                                        objArr2[1] = str3;
                                                                                                                                                        string = getString(R.string.profileNewSessionsName, objArr2);
                                                                                                                                                        i.f(string, "{\n                    ge…      )\n                }");
                                                                                                                                                        objArr[0] = string;
                                                                                                                                                        robertoTextView.setText(getString(R.string.left_menu_dashboard_rate_us_title, objArr));
                                                                                                                                                    }
                                                                                                                                                } catch (Exception e10) {
                                                                                                                                                    LogHelper.INSTANCE.e(this.f10807v, "Error setting name in Nav Drawer", e10);
                                                                                                                                                }
                                                                                                                                                v.c cVar6 = this.A;
                                                                                                                                                if (cVar6 != null && (navigationView14 = (NavigationView) cVar6.f34633x) != null && (d10 = navigationView14.d()) != null && (appCompatImageView = (AppCompatImageView) d10.findViewById(R.id.dashboardMenNewBackArrow)) != null) {
                                                                                                                                                    appCompatImageView.setOnClickListener(new fl.c(this, 0));
                                                                                                                                                }
                                                                                                                                                v.c cVar7 = this.A;
                                                                                                                                                if (cVar7 != null && (navigationView13 = (NavigationView) cVar7.f34633x) != null && (menu12 = navigationView13.getMenu()) != null) {
                                                                                                                                                    menuItem = menu12.findItem(R.id.nav_dashboard_lock);
                                                                                                                                                } else {
                                                                                                                                                    menuItem = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem != null) {
                                                                                                                                                    menuItem.setVisible(true);
                                                                                                                                                }
                                                                                                                                                v.c cVar8 = this.A;
                                                                                                                                                if (cVar8 != null && (navigationView12 = (NavigationView) cVar8.f34633x) != null && (menu11 = navigationView12.getMenu()) != null) {
                                                                                                                                                    menuItem2 = menu11.findItem(R.id.nav_dashboard_premium);
                                                                                                                                                } else {
                                                                                                                                                    menuItem2 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem2 != null) {
                                                                                                                                                    menuItem2.setVisible(true);
                                                                                                                                                }
                                                                                                                                                v.c cVar9 = this.A;
                                                                                                                                                if (cVar9 != null && (navigationView11 = (NavigationView) cVar9.f34633x) != null && (menu10 = navigationView11.getMenu()) != null) {
                                                                                                                                                    menuItem3 = menu10.findItem(R.id.nav_dashboard_therapy);
                                                                                                                                                } else {
                                                                                                                                                    menuItem3 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem3 != null) {
                                                                                                                                                    menuItem3.setVisible(true);
                                                                                                                                                }
                                                                                                                                                v.c cVar10 = this.A;
                                                                                                                                                if (cVar10 != null && (navigationView10 = (NavigationView) cVar10.f34633x) != null && (menu9 = navigationView10.getMenu()) != null && (findItem2 = menu9.findItem(R.id.nav_dashboard_therapy)) != null && (actionView2 = findItem2.getActionView()) != null) {
                                                                                                                                                    view = actionView2.findViewById(R.id.newTag);
                                                                                                                                                } else {
                                                                                                                                                    view = null;
                                                                                                                                                }
                                                                                                                                                if (view != null) {
                                                                                                                                                    view.setVisibility(8);
                                                                                                                                                }
                                                                                                                                                v.c cVar11 = this.A;
                                                                                                                                                if (cVar11 != null && (navigationView9 = (NavigationView) cVar11.f34633x) != null && (menu8 = navigationView9.getMenu()) != null && (findItem = menu8.findItem(R.id.nav_dashboard_therapy)) != null && (actionView = findItem.getActionView()) != null) {
                                                                                                                                                    view2 = actionView.findViewById(R.id.subheader);
                                                                                                                                                } else {
                                                                                                                                                    view2 = null;
                                                                                                                                                }
                                                                                                                                                if (view2 != null) {
                                                                                                                                                    view2.setVisibility(8);
                                                                                                                                                }
                                                                                                                                                v.c cVar12 = this.A;
                                                                                                                                                if (cVar12 != null && (navigationView8 = (NavigationView) cVar12.f34633x) != null && (menu7 = navigationView8.getMenu()) != null) {
                                                                                                                                                    menuItem4 = menu7.findItem(R.id.nav_dashboard_logs);
                                                                                                                                                } else {
                                                                                                                                                    menuItem4 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem4 != null) {
                                                                                                                                                    menuItem4.setVisible(false);
                                                                                                                                                }
                                                                                                                                                v.c cVar13 = this.A;
                                                                                                                                                if (cVar13 != null && (navigationView7 = (NavigationView) cVar13.f34633x) != null && (menu6 = navigationView7.getMenu()) != null) {
                                                                                                                                                    menuItem5 = menu6.findItem(R.id.nav_dashboard_logs_main);
                                                                                                                                                } else {
                                                                                                                                                    menuItem5 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem5 != null) {
                                                                                                                                                    menuItem5.setVisible(false);
                                                                                                                                                }
                                                                                                                                                v.c cVar14 = this.A;
                                                                                                                                                if (cVar14 != null && (navigationView6 = (NavigationView) cVar14.f34633x) != null && (menu5 = navigationView6.getMenu()) != null) {
                                                                                                                                                    menuItem6 = menu5.findItem(R.id.nav_dashboard_logs_main);
                                                                                                                                                } else {
                                                                                                                                                    menuItem6 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem6 != null) {
                                                                                                                                                    menuItem6.setVisible(false);
                                                                                                                                                }
                                                                                                                                                v.c cVar15 = this.A;
                                                                                                                                                if (cVar15 != null && (navigationView5 = (NavigationView) cVar15.f34633x) != null && (menu4 = navigationView5.getMenu()) != null) {
                                                                                                                                                    menuItem7 = menu4.findItem(R.id.nav_dashboard_saved_item);
                                                                                                                                                } else {
                                                                                                                                                    menuItem7 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem7 != null) {
                                                                                                                                                    menuItem7.setVisible(false);
                                                                                                                                                }
                                                                                                                                                v.c cVar16 = this.A;
                                                                                                                                                if (cVar16 != null && (navigationView4 = (NavigationView) cVar16.f34633x) != null && (menu3 = navigationView4.getMenu()) != null) {
                                                                                                                                                    menuItem8 = menu3.findItem(R.id.nav_dashboard_logs_library);
                                                                                                                                                } else {
                                                                                                                                                    menuItem8 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem8 != null) {
                                                                                                                                                    menuItem8.setVisible(true);
                                                                                                                                                }
                                                                                                                                                v.c cVar17 = this.A;
                                                                                                                                                if (cVar17 != null && (navigationView3 = (NavigationView) cVar17.f34633x) != null && (menu2 = navigationView3.getMenu()) != null) {
                                                                                                                                                    menuItem9 = menu2.findItem(R.id.nav_dashboard_tracker_logs);
                                                                                                                                                } else {
                                                                                                                                                    menuItem9 = null;
                                                                                                                                                }
                                                                                                                                                if (menuItem9 != null) {
                                                                                                                                                    User user6 = FirebasePersistence.getInstance().getUser();
                                                                                                                                                    if (user6.getUserMoodList().isEmpty() && user6.getUserMoodListV1().isEmpty()) {
                                                                                                                                                        z12 = true;
                                                                                                                                                    } else {
                                                                                                                                                        z12 = false;
                                                                                                                                                    }
                                                                                                                                                    menuItem9.setVisible(z12);
                                                                                                                                                }
                                                                                                                                                v.c cVar18 = this.A;
                                                                                                                                                if (cVar18 != null && (navigationView2 = (NavigationView) cVar18.f34633x) != null) {
                                                                                                                                                    navigationView2.setNavigationItemSelectedListener(this);
                                                                                                                                                }
                                                                                                                                                v.c cVar19 = this.A;
                                                                                                                                                if (cVar19 != null && (navigationView = (NavigationView) cVar19.f34633x) != null) {
                                                                                                                                                    menu = navigationView.getMenu();
                                                                                                                                                } else {
                                                                                                                                                    menu = null;
                                                                                                                                                }
                                                                                                                                                Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
                                                                                                                                                int b11 = g0.a.b(this, R.color.title_high_contrast);
                                                                                                                                                if (menu != null) {
                                                                                                                                                    i6 = menu.size();
                                                                                                                                                } else {
                                                                                                                                                    i6 = 0;
                                                                                                                                                }
                                                                                                                                                for (int i12 = 0; i12 < i6; i12++) {
                                                                                                                                                    if (menu != null && (item = menu.getItem(i12)) != null) {
                                                                                                                                                        i.f(font, "font");
                                                                                                                                                        UtilsKt.applyFontToMenuItem(item, font, b11);
                                                                                                                                                        if (item.hasSubMenu()) {
                                                                                                                                                            SubMenu subMenu = item.getSubMenu();
                                                                                                                                                            i.d(subMenu);
                                                                                                                                                            int size = subMenu.size();
                                                                                                                                                            for (int i13 = 0; i13 < size; i13++) {
                                                                                                                                                                SubMenu subMenu2 = item.getSubMenu();
                                                                                                                                                                i.d(subMenu2);
                                                                                                                                                                MenuItem subMenuItem = subMenu2.getItem(i13);
                                                                                                                                                                i.f(subMenuItem, "subMenuItem");
                                                                                                                                                                UtilsKt.applyFontToMenuItem(subMenuItem, font, b11);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                y supportFragmentManager = getSupportFragmentManager();
                                                                                                                                                androidx.fragment.app.a l2 = e.l(supportFragmentManager, supportFragmentManager);
                                                                                                                                                l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                                                                                                                                                Bundle extras = getIntent().getExtras();
                                                                                                                                                if (extras != null && extras.isEmpty()) {
                                                                                                                                                    z10 = true;
                                                                                                                                                } else {
                                                                                                                                                    z10 = false;
                                                                                                                                                }
                                                                                                                                                if (!z10) {
                                                                                                                                                    gVar = new g();
                                                                                                                                                    gVar.setArguments(getIntent().getExtras());
                                                                                                                                                } else {
                                                                                                                                                    gVar = new g();
                                                                                                                                                }
                                                                                                                                                l2.f(R.id.flCustomDashboardMain, gVar, "dashboard_fragment");
                                                                                                                                                l2.j();
                                                                                                                                                User user7 = FirebasePersistence.getInstance().getUser();
                                                                                                                                                if (user7 != null) {
                                                                                                                                                    arrayList = user7.getMiniCourses();
                                                                                                                                                } else {
                                                                                                                                                    arrayList = null;
                                                                                                                                                }
                                                                                                                                                if (arrayList != null && !arrayList.isEmpty()) {
                                                                                                                                                    z11 = false;
                                                                                                                                                } else {
                                                                                                                                                    z11 = true;
                                                                                                                                                }
                                                                                                                                                if (z11 && (eVar = this.f10808w) != null) {
                                                                                                                                                    ((CourseApiUtil) eVar.J.getValue()).setMiniCourseFetchListener(new n(eVar));
                                                                                                                                                    v.H(kc.f.H(eVar), null, 0, new jl.d(eVar, null), 3);
                                                                                                                                                    eVar.M.e(this, new h0(26, new fl.d(this)));
                                                                                                                                                }
                                                                                                                                                v.c cVar20 = this.A;
                                                                                                                                                if (cVar20 != null && (cVar2 = (yp.c) cVar20.f34632w) != null && (constraintLayout = cVar2.f38734a) != null) {
                                                                                                                                                    constraintLayout.setOnTouchListener(new w5.h0(6));
                                                                                                                                                }
                                                                                                                                                v.c cVar21 = this.A;
                                                                                                                                                if (cVar21 != null && (cVar = (yp.c) cVar21.f34632w) != null && (robertoEditText = cVar.f38737d) != null) {
                                                                                                                                                    robertoEditText.setOnEditorActionListener(new w(1, this));
                                                                                                                                                }
                                                                                                                                                e eVar3 = this.f10808w;
                                                                                                                                                if (eVar3 != null) {
                                                                                                                                                    eVar3.E.e(this, new h0(27, new fl.e(this)));
                                                                                                                                                    e eVar4 = this.f10808w;
                                                                                                                                                    if (eVar4 != null) {
                                                                                                                                                        eVar4.F.e(this, new h0(28, new fl.f(this)));
                                                                                                                                                        e eVar5 = this.f10808w;
                                                                                                                                                        if (eVar5 != null) {
                                                                                                                                                            if (!NpsPersistence.INSTANCE.getNpsInitComplete()) {
                                                                                                                                                                v.H(kc.f.H(eVar5), null, 0, new m(eVar5, null), 3);
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i.q("dashboardViewModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i.q("dashboardViewModel");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                StatPersistence.INSTANCE.initialise();
                                                                                                                                                o0(getIntent());
                                                                                                                                                e eVar6 = this.f10808w;
                                                                                                                                                if (eVar6 != null) {
                                                                                                                                                    v.H(kc.f.H(eVar6), null, 0, new o(null), 3);
                                                                                                                                                    e eVar7 = this.f10808w;
                                                                                                                                                    if (eVar7 != null) {
                                                                                                                                                        eVar7.G.e(this, new h0(25, new a()));
                                                                                                                                                        if (!i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                                                                                                                                                            startActivity(new Intent(this, DeeplinkCodeActivationActivity.class));
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    i.q("dashboardViewModel");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                i.q("dashboardViewModel");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            i10 = R.id.customNavigationView;
                                                                                                                                        } else {
                                                                                                                                            i11 = R.id.viewDashboardBlanketForeground;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i11 = R.id.tvNPSSeekLevel9;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i11 = R.id.tvNPSSeekLevel8;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i11 = R.id.tvNPSSeekLevel7;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i11 = R.id.tvNPSSeekLevel6;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i11 = R.id.tvNPSSeekLevel5;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i11 = R.id.tvNPSSeekLevel4;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i11 = R.id.tvNPSSeekLevel3;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i11 = R.id.tvNPSSeekLevel2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i11 = R.id.tvNPSSeekLevel10;
                                                                                                    }
                                                                                                } else {
                                                                                                    i11 = R.id.tvNPSSeekLevel1;
                                                                                                }
                                                                                            } else {
                                                                                                i11 = R.id.tvNPSSeekLevel0;
                                                                                            }
                                                                                        } else {
                                                                                            i11 = R.id.tvNPSLowIndicator;
                                                                                        }
                                                                                    } else {
                                                                                        i11 = R.id.tvNPSHighIndicator;
                                                                                    }
                                                                                } else {
                                                                                    i11 = R.id.tvNPSFooterPrompt;
                                                                                }
                                                                            } else {
                                                                                i11 = R.id.tvNPSBottomSheetQuestionSubtext;
                                                                            }
                                                                        } else {
                                                                            i11 = R.id.tvNPSBottomSheetQuestion;
                                                                        }
                                                                    } else {
                                                                        i11 = R.id.tvNPSBottomSheetFeedbackQuestionSubtext;
                                                                    }
                                                                } else {
                                                                    i11 = R.id.tvNPSBottomSheetFeedbackQuestion;
                                                                }
                                                            } else {
                                                                i11 = R.id.sbNPSSelector;
                                                            }
                                                        } else {
                                                            i11 = R.id.rbNPSSubmit2;
                                                        }
                                                    } else {
                                                        i11 = R.id.rbNPSSubmit1;
                                                    }
                                                } else {
                                                    i11 = R.id.ivNPSSeekSelector;
                                                }
                                            } else {
                                                i11 = R.id.ivNPSRatingImage;
                                            }
                                        } else {
                                            i11 = R.id.ivNPSBottomSheetFeedbackClose;
                                        }
                                    } else {
                                        i11 = R.id.ivNPSBottomSheetClose;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(w10.getResources().getResourceName(i11)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        this.A = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        g gVar;
        Fragment F = getSupportFragmentManager().F("dashboard_fragment");
        if (F instanceof g) {
            gVar = (g) F;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.F();
        }
        super.onNewIntent(intent);
        o0(intent);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            p0();
            e eVar = this.f10808w;
            if (eVar != null) {
                Intent intent = getIntent();
                i.f(intent, "intent");
                ya.v a10 = wd.a.b().a(intent);
                rk.b bVar = new rk.b(4, new jl.l(eVar));
                a10.getClass();
                a10.addOnSuccessListener(j.f38393a, bVar);
                a10.addOnFailureListener(new dl.j(2));
                return;
            }
            i.q("dashboardViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10807v, e10);
        }
    }

    public final void p0() {
        if (!i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
            startActivity(new Intent(this, DeepLinkActivationActivity.class));
        }
    }

    @Override // xk.a
    public final void W() {
    }

    @Override // xk.a
    public final void B(int i6) {
    }
}
