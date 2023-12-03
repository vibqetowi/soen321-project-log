package com.theinnerhour.b2b.components.dashboard.activity;

import android.animation.Animator;
import android.app.Application;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.activity.DailyPlanOverview;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.PlanExpiryInfoActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.activity.SevenDayProgressActivity;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenOptionsActivity;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseHeroBannerModel;
import com.theinnerhour.b2b.model.CustomCoachMark;
import com.theinnerhour.b2b.model.DbDynamicCardsModel;
import com.theinnerhour.b2b.model.GamificationBadgesModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.ProCard;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.DownloadUtil;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.TherapistDataCacheUtil;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.h1;
import ek.i1;
import fm.a1;
import g0.a;
import ik.j1;
import java.io.File;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jl.t1;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ml.a0;
import ml.y;
import nd.z;
import nn.x0;
import nn.z0;
import org.json.JSONObject;
import tn.b;
import w5.h0;
/* compiled from: V2DashboardActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/activity/V2DashboardActivity;", "Landroidx/appcompat/app/c;", "Lcom/theinnerhour/b2b/utils/ConnectionStatusReceiver$ConnectivityListener;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "Lcom/google/android/material/navigation/NavigationView$a;", "Ltn/b$a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class V2DashboardActivity extends androidx.appcompat.app.c implements ConnectionStatusReceiver.ConnectivityListener, SubscriptionPersistence.SubscriptionInitialiseListener, NavigationView.a, b.a {
    public static final /* synthetic */ int F0 = 0;
    public final dl.k A0;
    public ek.c B;
    public final c B0;
    public LinearLayoutManager C;
    public final b C0;
    public ek.k D;
    public final a D0;
    public Course E;
    public CourseDayModel F;
    public boolean N;
    public boolean P;
    public boolean T;
    public SubscriptionModel U;
    public lp.a V;
    public ym.c W;
    public CourseDayModel X;
    public boolean Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public h1 f10655b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10656d0;
    public boolean e0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f10658g0;

    /* renamed from: h0  reason: collision with root package name */
    public MiniCoursesViewModel f10659h0;

    /* renamed from: i0  reason: collision with root package name */
    public List<MiniCourse> f10660i0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10662k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f10663l0;

    /* renamed from: n0  reason: collision with root package name */
    public MonetizationViewModel f10665n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f10666o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f10667p0;

    /* renamed from: q0  reason: collision with root package name */
    public y f10668q0;

    /* renamed from: t0  reason: collision with root package name */
    public int f10671t0;

    /* renamed from: u0  reason: collision with root package name */
    public hs.f<Boolean, Boolean> f10672u0;

    /* renamed from: v0  reason: collision with root package name */
    public a1 f10674v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f10676w0;

    /* renamed from: x  reason: collision with root package name */
    public String f10677x;

    /* renamed from: x0  reason: collision with root package name */
    public ap.h f10678x0;

    /* renamed from: y  reason: collision with root package name */
    public int f10679y;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10680y0;

    /* renamed from: z  reason: collision with root package name */
    public ProgressDialog f10681z;

    /* renamed from: z0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10682z0;
    public final LinkedHashMap E0 = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10673v = LogHelper.INSTANCE.makeLogTag(V2DashboardActivity.class);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<Object> f10675w = new ArrayList<>();
    public long A = Utils.INSTANCE.getTodayTimeInSeconds();
    public final int G = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    public final int H = 12322;
    public final int I = 100;
    public final int J = 5555;
    public final int K = 1248;
    public final int L = 5648;
    public final int M = 246;
    public ArrayList<LearningHubModel> O = new ArrayList<>();
    public int Q = 1;
    public int R = 1;
    public final ArrayList<CustomCoachMark> S = new ArrayList<>();

    /* renamed from: a0  reason: collision with root package name */
    public final int f10654a0 = 1001;

    /* renamed from: f0  reason: collision with root package name */
    public final hs.i f10657f0 = sp.b.O(new w());

    /* renamed from: j0  reason: collision with root package name */
    public final HashMap<String, hs.f<String, String>> f10661j0 = new HashMap<>();

    /* renamed from: m0  reason: collision with root package name */
    public final CourseApiUtil f10664m0 = new CourseApiUtil();

    /* renamed from: r0  reason: collision with root package name */
    public final z f10669r0 = new z(16);

    /* renamed from: s0  reason: collision with root package name */
    public final hs.i f10670s0 = sp.b.O(h.f10692u);

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.d(intent);
            Bundle extras = intent.getExtras();
            kotlin.jvm.internal.i.e(extras, "null cannot be cast to non-null type android.os.Bundle");
            if (is.k.Q1(Integer.valueOf(extras.getInt("asset_download_status")), new Integer[]{100, Integer.valueOf((int) R.styleable.AppCompatTheme_switchStyle)})) {
                int i6 = V2DashboardActivity.F0;
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                v2DashboardActivity.getClass();
                ta.v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new dl.n(v2DashboardActivity, null), 3);
            }
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.d(intent);
            Bundle extras = intent.getExtras();
            kotlin.jvm.internal.i.e(extras, "null cannot be cast to non-null type android.os.Bundle");
            String string = extras.getString("asset_file_url");
            int i6 = V2DashboardActivity.F0;
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            v2DashboardActivity.getClass();
            if (string != null) {
                try {
                    Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCourseAssets().iterator();
                    while (it.hasNext()) {
                        OfflineAsset next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getMetaInfo().get(0), string)) {
                            HashMap<String, ApplicationPersistence.AssetPair> hashMap = ApplicationPersistence.getInstance().assetMap;
                            kotlin.jvm.internal.i.f(hashMap, "getInstance().assetMap");
                            String str = next.getMetaInfo().get(0);
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            kotlin.jvm.internal.i.f(applicationPersistence, "getInstance()");
                            hashMap.put(str, new ApplicationPersistence.AssetPair(next.getMetaInfo().get(2), next.getMetaInfo().get(1), next.getMetaInfo().get(3)));
                            h1 h1Var = v2DashboardActivity.f10655b0;
                            if (h1Var != null && h1Var.w(string)) {
                                h1 h1Var2 = v2DashboardActivity.f10655b0;
                                if (h1Var2 != null) {
                                    String str2 = next.getMetaInfo().get(1);
                                    kotlin.jvm.internal.i.f(str2, "asset.metaInfo[1]");
                                    h1Var2.v(string, str2);
                                    h1 h1Var3 = v2DashboardActivity.f10655b0;
                                    if (h1Var3 != null) {
                                        h1Var3.i();
                                    } else {
                                        kotlin.jvm.internal.i.q("miniCoursesDashboardAdapter");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("miniCoursesDashboardAdapter");
                                    throw null;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(v2DashboardActivity.f10673v, e10);
                }
            }
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            int intExtra = intent.getIntExtra(DownloadUtil.DOWNLOAD_STATUS, 1);
            LogHelper logHelper = LogHelper.INSTANCE;
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            logHelper.i(v2DashboardActivity.f10673v, defpackage.c.p("broadcast call back ", intExtra));
            if (intExtra == 100) {
                n1.a.a(v2DashboardActivity).d(this);
                v2DashboardActivity.N = false;
                v2DashboardActivity.f1();
            }
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ xn.a f10687v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xn.a aVar) {
            super(1);
            this.f10687v = aVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                boolean booleanValue = contentIfNotHandled.booleanValue();
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                if (booleanValue) {
                    gk.a.b(null, "moodtracker_data_backup_done");
                    int i6 = V2DashboardActivity.F0;
                    v2DashboardActivity.A1(true);
                    gk.a.b(null, "new_moodtracker_assigned");
                } else {
                    int i10 = v2DashboardActivity.f10671t0;
                    if (i10 < 3) {
                        v2DashboardActivity.f10671t0 = i10 + 1;
                        this.f10687v.e();
                        gk.a.b(null, "moodtracker_data_backup_retry");
                    } else {
                        gk.a.b(null, "moodtracker_data_backup_fail");
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<CourseDayModel, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(CourseDayModel courseDayModel) {
            CourseDayModel dayModel = courseDayModel;
            kotlin.jvm.internal.i.g(dayModel, "dayModel");
            V2DashboardActivity.this.o0(dayModel);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g implements CustomCoachMark.OnVisibilityChange {
        public g() {
        }

        @Override // com.theinnerhour.b2b.model.CustomCoachMark.OnVisibilityChange
        public final void onChange(boolean z10) {
            if (!z10) {
                int i6 = V2DashboardActivity.F0;
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                v2DashboardActivity.getClass();
                try {
                    v2DashboardActivity.S.remove(0);
                    v2DashboardActivity.z0();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(v2DashboardActivity.f10673v, "exception in hidecoachmark", e10);
                }
            }
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<t1> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f10692u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final t1 invoke() {
            return new t1();
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i implements CourseApiUtil.MiniCourseFetchUtilInterface {
        public i() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseFetchUtilInterface
        public final void miniCourseFetchComplete(boolean z10) {
            if (z10) {
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                v2DashboardActivity.f10663l0 = true;
                if (v2DashboardActivity.f10662k0) {
                    v2DashboardActivity.D0();
                }
            }
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                if (v2DashboardActivity.f10672u0.f19464u.booleanValue()) {
                    v2DashboardActivity.A1(v2DashboardActivity.f10672u0.f19465v.booleanValue());
                    Boolean bool2 = Boolean.FALSE;
                    v2DashboardActivity.f10672u0 = new hs.f<>(bool2, bool2);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<wd.b, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(wd.b bVar) {
            String str;
            wd.b bVar2 = bVar;
            if (bVar2 != null) {
                Uri a10 = bVar2.a();
                kotlin.jvm.internal.i.d(a10);
                boolean contains = a10.getQueryParameterNames().contains(Constants.API_COURSE_LINK);
                V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
                if (contains) {
                    Bundle bundle = new Bundle();
                    for (String str2 : a10.getQueryParameterNames()) {
                        bundle.putString(str2, a10.getQueryParameter(str2));
                    }
                    v2DashboardActivity.f10669r0.i(a10.getQueryParameter(Constants.API_COURSE_LINK), bundle, null);
                }
                if (a10.getPathSegments().size() > 1) {
                    List<String> pathSegments = a10.getPathSegments();
                    boolean z10 = false;
                    if (pathSegments != null && (str = pathSegments.get(0)) != null && gv.r.J0(str, "linktype=")) {
                        z10 = true;
                    }
                    if (z10) {
                        ApplicationPersistence.getInstance().setStringValue(Constants.DYNAMIC_SIGNUP_LINK, a10.toString());
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.USE_VARIANT_A, true);
                        int i6 = V2DashboardActivity.F0;
                        v2DashboardActivity.e1();
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10696a;

        public l(View view) {
            this.f10696a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10696a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10696a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.p<MiniCourse, CardView, hs.k> {
        public m() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(MiniCourse miniCourse, CardView cardView) {
            MiniCourse miniCourse2 = miniCourse;
            CardView imgView = cardView;
            kotlin.jvm.internal.i.g(miniCourse2, "miniCourse");
            kotlin.jvm.internal.i.g(imgView, "imgView");
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            boolean J0 = gv.r.J0(domain, "basic");
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            if (J0) {
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                UtilsKt.fireAnalytics("basic_dashboard_click", bundle);
                v2DashboardActivity.startActivityForResult(new Intent(v2DashboardActivity, MiniCourseActivity.class).putExtra("mccourse", miniCourse2.getDomain()), v2DashboardActivity.I, f0.c.a(v2DashboardActivity, new s0.c(imgView, imgView.getTransitionName())).b());
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("miniCourse", miniCourse2.getDomain());
                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                UtilsKt.fireAnalytics("mini_dashboard_click", bundle2);
                v2DashboardActivity.startActivity(new Intent(v2DashboardActivity, MiniCourseActivity.class).putExtra("mccourse", miniCourse2.getDomain()), f0.c.a(v2DashboardActivity, new s0.c(imgView, imgView.getTransitionName())).b());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class n implements ViewTreeObserver.OnGlobalLayoutListener {
        public n() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ((RecyclerView) V2DashboardActivity.this.n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.l<ArrayList<RecommendedActivityModel>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V2DashboardActivity f10699u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ap.h hVar, V2DashboardActivity v2DashboardActivity) {
            super(1);
            this.f10699u = v2DashboardActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x0040, B:10:0x0054, B:17:0x0063, B:19:0x0094, B:21:0x009a, B:25:0x00b2, B:27:0x00c5, B:31:0x0113, B:28:0x00f0, B:30:0x00f6, B:18:0x0071), top: B:41:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x0040, B:10:0x0054, B:17:0x0063, B:19:0x0094, B:21:0x009a, B:25:0x00b2, B:27:0x00c5, B:31:0x0113, B:28:0x00f0, B:30:0x00f6, B:18:0x0071), top: B:41:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x0040, B:10:0x0054, B:17:0x0063, B:19:0x0094, B:21:0x009a, B:25:0x00b2, B:27:0x00c5, B:31:0x0113, B:28:0x00f0, B:30:0x00f6, B:18:0x0071), top: B:41:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x0040, B:10:0x0054, B:17:0x0063, B:19:0x0094, B:21:0x009a, B:25:0x00b2, B:27:0x00c5, B:31:0x0113, B:28:0x00f0, B:30:0x00f6, B:18:0x0071), top: B:41:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x0040, B:10:0x0054, B:17:0x0063, B:19:0x0094, B:21:0x009a, B:25:0x00b2, B:27:0x00c5, B:31:0x0113, B:28:0x00f0, B:30:0x00f6, B:18:0x0071), top: B:41:0x0040 }] */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(ArrayList<RecommendedActivityModel> arrayList) {
            String duration;
            boolean z10;
            String thumbUrl;
            String str;
            ArrayList<RecommendedActivityModel> arrayList2 = arrayList;
            hs.k kVar = null;
            V2DashboardActivity v2DashboardActivity = this.f10699u;
            if (arrayList2 != null) {
                for (RecommendedActivityModel model : arrayList2) {
                    View row = v2DashboardActivity.getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_recommended_activities_dashboard_experiment, (ViewGroup) ((LinearLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)), false);
                    kotlin.jvm.internal.i.f(row, "row");
                    z zVar = v2DashboardActivity.f10669r0;
                    zVar.getClass();
                    kotlin.jvm.internal.i.g(model, "model");
                    try {
                        ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvTitleCard)).setText(model.getTitle());
                        duration = model.getDuration();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e((String) zVar.f26148b, "exception", e10);
                    }
                    if (duration != null && duration.length() != 0) {
                        z10 = false;
                        if (!z10) {
                            ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvActivityType)).setText(model.getTemplateTypeText());
                        } else {
                            ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvActivityType)).setText(zVar.g().getString(com.theinnerhour.b2b.R.string.dbRaExperimentSubHeader, model.getTemplateTypeText(), model.getDuration()));
                        }
                        thumbUrl = model.getThumbUrl();
                        if (thumbUrl == null) {
                            str = (String) is.u.p2(gv.r.a1(thumbUrl, new String[]{"/"}, 0, 6));
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String[] fileList = zVar.g().fileList();
                            kotlin.jvm.internal.i.f(fileList, "activity.fileList()");
                            if (is.k.Q1(str, fileList)) {
                                Glide.g(zVar.g().getApplicationContext()).d(new File(zVar.g().getApplicationContext().getFilesDir(), str)).B((AppCompatImageView) row.findViewById(com.theinnerhour.b2b.R.id.ivTitleCard));
                                row.setOnClickListener(new j1(zVar, 22, model));
                                ((LinearLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
                            }
                        }
                        if (model.getThumbUrl() != null) {
                            Glide.g(zVar.g().getApplicationContext()).p(model.getThumbUrl()).B((AppCompatImageView) row.findViewById(com.theinnerhour.b2b.R.id.ivTitleCard));
                        }
                        row.setOnClickListener(new j1(zVar, 22, model));
                        ((LinearLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    thumbUrl = model.getThumbUrl();
                    if (thumbUrl == null) {
                    }
                    if (str != null) {
                    }
                    if (model.getThumbUrl() != null) {
                    }
                    row.setOnClickListener(new j1(zVar, 22, model));
                    ((LinearLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
                }
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                Toast.makeText(v2DashboardActivity, "Error in fetching tools to unwind.", 0).show();
            }
            ((RobertoTextView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.dbRAExperimentViewAllCTA)).setOnClickListener(new dl.l(v2DashboardActivity, 22));
            v2DashboardActivity.z1(false);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class p implements ValueEventListener {
        public p() {
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            Extensions extensions = Extensions.INSTANCE;
            CardView cvPro = (CardView) V2DashboardActivity.this.n0(com.theinnerhour.b2b.R.id.cvPro);
            kotlin.jvm.internal.i.f(cvPro, "cvPro");
            extensions.gone(cvPro);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [com.theinnerhour.b2b.components.chat.model.ChatMessage, T] */
        /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Object] */
        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            boolean exists = p02.exists();
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            if (exists && p02.hasChildren()) {
                long j10 = 1000;
                long timeInMillis = Calendar.getInstance().getTimeInMillis() / j10;
                x xVar = new x();
                xVar.f23469u = new ChatMessage();
                Iterable<DataSnapshot> children = p02.getChildren();
                kotlin.jvm.internal.i.f(children, "p0.children");
                for (DataSnapshot dataSnapshot : children) {
                    ?? value = dataSnapshot.getValue(ChatMessage.class);
                    kotlin.jvm.internal.i.d(value);
                    xVar.f23469u = value;
                    if (((ChatMessage) value).getTime_stamp() < timeInMillis) {
                        timeInMillis = ((ChatMessage) xVar.f23469u).getTime_stamp();
                    }
                }
                if (TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - (j10 * timeInMillis)) > 2) {
                    ProCard proCardForDate = new UiUtils().getProCardForDate(timeInMillis, v2DashboardActivity);
                    if (!kotlin.jvm.internal.i.b(proCardForDate.getTitle(), "")) {
                        Extensions extensions = Extensions.INSTANCE;
                        CardView cvPro = (CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                        kotlin.jvm.internal.i.f(cvPro, "cvPro");
                        extensions.visible(cvPro);
                        ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro)).setOnClickListener(new j1(v2DashboardActivity, 10, xVar));
                        ((RobertoTextView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardTitle)).setText(proCardForDate.getTitle());
                        ((RobertoTextView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardSubtitle)).setText(proCardForDate.getSubtitle());
                        ((AppCompatImageView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.ivProCard)).setImageResource(proCardForDate.getIllustration());
                        ((ConstraintLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.clPro)).setBackgroundColor(g0.a.b(v2DashboardActivity, proCardForDate.getBackgroundColor()));
                        ((RobertoTextView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardTitle)).setTextColor(g0.a.b(v2DashboardActivity, proCardForDate.getTextColor()));
                        ((RobertoTextView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardSubtitle)).setTextColor(g0.a.b(v2DashboardActivity, proCardForDate.getTextColor()));
                        return;
                    }
                    Extensions extensions2 = Extensions.INSTANCE;
                    CardView cvPro2 = (CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                    kotlin.jvm.internal.i.f(cvPro2, "cvPro");
                    extensions2.gone(cvPro2);
                    return;
                }
                Extensions extensions3 = Extensions.INSTANCE;
                CardView cvPro3 = (CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                kotlin.jvm.internal.i.f(cvPro3, "cvPro");
                extensions3.gone(cvPro3);
                return;
            }
            Extensions extensions4 = Extensions.INSTANCE;
            CardView cvPro4 = (CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
            kotlin.jvm.internal.i.f(cvPro4, "cvPro");
            extensions4.gone(cvPro4);
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$saveFeedbackPopup$1", f = "V2DashboardActivity.kt", l = {2597, 2602}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10701u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f10703w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f10704x;

        /* compiled from: V2DashboardActivity.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$saveFeedbackPopup$1$1$1", f = "V2DashboardActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ V2DashboardActivity f10705u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(V2DashboardActivity v2DashboardActivity, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f10705u = v2DashboardActivity;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f10705u, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                this.f10705u.O0().dismiss();
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i6, String str, ls.d<? super q> dVar) {
            super(2, dVar);
            this.f10703w = i6;
            this.f10704x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new q(this.f10703w, this.f10704x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((q) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10701u;
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v2DashboardActivity.f10673v, "https://api.theinnerhour.com/v1/employeefeedback", e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                int i10 = this.f10703w;
                String str = this.f10704x;
                this.f10701u = 1;
                obj = ((t1) v2DashboardActivity.f10670s0.getValue()).a(i10, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).booleanValue();
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(v2DashboardActivity, null);
            this.f10701u = 2;
            if (ta.v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ MonetizationViewModel f10706u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ V2DashboardActivity f10707v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(MonetizationViewModel monetizationViewModel, V2DashboardActivity v2DashboardActivity) {
            super(1);
            this.f10706u = monetizationViewModel;
            this.f10707v = v2DashboardActivity;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            ArrayList<CampaignElementModel> dashboardCard;
            CampaignElementModel campaignElementModel;
            Object obj;
            Object obj2;
            CampaignModel campaignModel = this.f10706u.B;
            if (campaignModel != null && (dashboardCard = campaignModel.getDashboardCard()) != null && (campaignElementModel = (CampaignElementModel) is.u.j2(0, dashboardCard)) != null) {
                V2DashboardActivity v2DashboardActivity = this.f10707v;
                v2DashboardActivity.getClass();
                FrameLayout frameLayout = (FrameLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.campaignDbCard);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                FrameLayout frameLayout2 = (FrameLayout) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.campaignDbCardExperiment);
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC1")) {
                        ArrayList k10 = ca.a.k("dbc1_title", "dbc1_title_color", "dbc1_description", "dbc1_description_color", "dbc1_cta", "dbc1_cta_text_color", "dbc1_cta_bg_color", "dbc1_image");
                        x0 x0Var = new x0();
                        Bundle bundle = new Bundle();
                        Iterator<HashMap<String, Object>> it = campaignElementModel.getAttributes().iterator();
                        while (it.hasNext()) {
                            HashMap<String, Object> next = it.next();
                            Iterator it2 = k10.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (next.containsKey((String) obj2)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            String str = (String) obj2;
                            if (str != null) {
                                if (gv.r.J0(str, "image")) {
                                    Object obj3 = next.get(str);
                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                    bundle.putString(str, (String) is.k.a2(new gv.e("/").c((String) obj3).toArray(new String[0])));
                                } else {
                                    Object obj4 = next.get(str);
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                    bundle.putString(str, (String) obj4);
                                }
                                k10.remove(str);
                            }
                        }
                        x0Var.setArguments(bundle);
                        androidx.fragment.app.y supportFragmentManager = v2DashboardActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.f(com.theinnerhour.b2b.R.id.campaignDbCard, x0Var, "dynamicDbFrag");
                        aVar.k();
                        v2DashboardActivity.getSupportFragmentManager().B();
                    } else if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC2")) {
                        ArrayList k11 = ca.a.k("dbc2_question", "dbc2_question_color", "dbc2_answer1", "dbc2_answer2", "dbc2_answer_text_color", "dbc2_answer_bg_color", "dbc2_question_image", "dbc2_option1_title", "dbc2_option1_description", "dbc2_option1_cta", "dbc2_option2_title", "dbc2_option2_description", "dbc2_option2_cta", "dbc2_option_image", "dbc2_option_cta_text_color", "dbc2_option_cta_bg_color", "dbc2_option_title_color", "dbc2_option_description_color", "dbc2_option0_title", "dbc2_option0_description");
                        z0 z0Var = new z0();
                        Bundle bundle2 = new Bundle();
                        Iterator<HashMap<String, Object>> it3 = campaignElementModel.getAttributes().iterator();
                        while (it3.hasNext()) {
                            HashMap<String, Object> next2 = it3.next();
                            Iterator it4 = k11.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj = it4.next();
                                    if (next2.containsKey((String) obj)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            String str2 = (String) obj;
                            if (str2 != null) {
                                if (gv.r.J0(str2, "image")) {
                                    Object obj5 = next2.get(str2);
                                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                                    bundle2.putString(str2, (String) is.k.a2(new gv.e("/").c((String) obj5).toArray(new String[0])));
                                } else {
                                    Object obj6 = next2.get(str2);
                                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                                    bundle2.putString(str2, (String) obj6);
                                }
                                k11.remove(str2);
                            }
                        }
                        z0Var.setArguments(bundle2);
                        androidx.fragment.app.y supportFragmentManager2 = v2DashboardActivity.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                        aVar2.f(com.theinnerhour.b2b.R.id.campaignDbCard, z0Var, "dynamicDbFrag");
                        aVar2.k();
                        v2DashboardActivity.getSupportFragmentManager().B();
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class s implements Animation.AnimationListener {
        public s() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).setVisibility(8);
            v2DashboardActivity.w1();
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
            FirebasePersistence.getInstance().updateUserOnFirebase();
            Bundle bundle = new Bundle();
            defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_negative");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class t implements Animation.AnimationListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Animation f10710v;

        public t(Animation animation) {
            this.f10710v = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(this.f10710v);
            ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).setVisibility(0);
            ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).setVisibility(8);
            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
            FirebasePersistence.getInstance().updateUserOnFirebase();
            Bundle bundle = new Bundle();
            defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_positive");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class u implements Animation.AnimationListener {
        public u() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ((CardView) V2DashboardActivity.this.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
            FirebasePersistence.getInstance().updateUserOnFirebase();
            Bundle bundle = new Bundle();
            defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_playstore_negative");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class v implements Animation.AnimationListener {
        public v() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            ((CardView) v2DashboardActivity.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
            FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
            FirebasePersistence.getInstance().updateUserOnFirebase();
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
            ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + v2DashboardActivity.getPackageName()));
            intent.addFlags(1208483840);
            try {
                v2DashboardActivity.startActivity(intent);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e10);
                v2DashboardActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + v2DashboardActivity.getPackageName())));
            }
            Bundle bundle = new Bundle();
            defpackage.b.s(bundle, "course", bundle, "feedback_dashboard_playstore_positive");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.a<xn.a> {
        public w() {
            super(0);
        }

        @Override // ss.a
        public final xn.a invoke() {
            return (xn.a) new androidx.lifecycle.o0(V2DashboardActivity.this).a(xn.a.class);
        }
    }

    public V2DashboardActivity() {
        Boolean bool = Boolean.FALSE;
        this.f10672u0 = new hs.f<>(bool, bool);
        this.f10676w0 = true;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new dl.k(this, 0));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
        this.f10680y0 = registerForActivityResult;
        G1(false);
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new dl.k(this, 1));
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…e().user.firstName)\n    }");
        this.f10682z0 = registerForActivityResult2;
        this.A0 = new dl.k(this, 2);
        this.B0 = new c();
        this.C0 = new b();
        this.D0 = new a();
    }

    public static boolean W0() {
        String g5 = defpackage.b.g();
        if (g5 != null) {
            switch (g5.hashCode()) {
                case -2114782937:
                    if (g5.equals(Constants.COURSE_HAPPINESS)) {
                        boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_HAPPY);
                        if (booleanValue) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_HAPPY, false);
                        }
                        return booleanValue;
                    }
                    break;
                case -1617042330:
                    if (g5.equals(Constants.COURSE_DEPRESSION)) {
                        boolean booleanValue2 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_MOOD);
                        if (booleanValue2) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_MOOD, false);
                        }
                        return booleanValue2;
                    }
                    break;
                case -891989580:
                    if (g5.equals(Constants.COURSE_STRESS)) {
                        boolean booleanValue3 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_STRESS);
                        if (booleanValue3) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_STRESS, false);
                        }
                        return booleanValue3;
                    }
                    break;
                case 92960775:
                    if (g5.equals(Constants.COURSE_ANGER)) {
                        boolean booleanValue4 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANGER);
                        if (booleanValue4) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANGER, false);
                        }
                        return booleanValue4;
                    }
                    break;
                case 109522647:
                    if (g5.equals(Constants.COURSE_SLEEP)) {
                        boolean booleanValue5 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_SLEEP);
                        if (booleanValue5) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_SLEEP, false);
                        }
                        return booleanValue5;
                    }
                    break;
                case 113319009:
                    if (g5.equals(Constants.COURSE_WORRY)) {
                        boolean booleanValue6 = ApplicationPersistence.getInstance().getBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANXIETY);
                        if (booleanValue6) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANXIETY, false);
                        }
                        return booleanValue6;
                    }
                    break;
            }
        }
        return false;
    }

    public final void A0() {
        ArrayList<Object> arrayList = this.f10675w;
        try {
            if (arrayList.size() == 0) {
                s0();
                return;
            }
            Object obj = arrayList.get(0);
            kotlin.jvm.internal.i.f(obj, "popupList[0]");
            if (obj instanceof Dialog) {
                ((Dialog) obj).setOnDismissListener(new hk.f(this, 1));
                ((Dialog) obj).show();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void A1(boolean z10) {
        try {
            ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs).setVisible(true);
            wn.b.f36765a.getClass();
            if (wn.b.f36769e != wn.j.COMPLETED) {
                this.f10672u0 = new hs.f<>(Boolean.TRUE, Boolean.valueOf(z10));
                return;
            }
            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.containerFrame)).setVisibility(0);
            tn.b bVar = new tn.b();
            androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(com.theinnerhour.b2b.R.id.containerFrame, bVar, null);
            aVar.k();
            bVar.f33331v = this;
            if (z10) {
                gk.a.b(null, "new_moodtracker_dashboard_popup_shown");
                n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setVisibility(0);
                n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setOnTouchListener(new h0(2));
                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMoodToolTipCancel)).setOnClickListener(new dl.l(this, 16));
                new Handler(Looper.getMainLooper()).postDelayed(new dl.e(this, 3), 500L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    public final void B0() {
        try {
            Extensions extensions = Extensions.INSTANCE;
            LinearLayout llSwitchCourse = (LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse);
            kotlin.jvm.internal.i.f(llSwitchCourse, "llSwitchCourse");
            if (extensions.isVisible(llSwitchCourse)) {
                Utils utils = Utils.INSTANCE;
                LinearLayout llSwitchCourse2 = (LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse);
                kotlin.jvm.internal.i.f(llSwitchCourse2, "llSwitchCourse");
                Utils.collapse$default(utils, llSwitchCourse2, 0L, 2, null);
                View viewSwitchCourseBG = n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG);
                kotlin.jvm.internal.i.f(viewSwitchCourseBG, "viewSwitchCourseBG");
                extensions.gone(viewSwitchCourseBG);
                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).startAnimation(utils.rotateBy180(180.0f, 360.0f));
            } else {
                Utils utils2 = Utils.INSTANCE;
                LinearLayout llSwitchCourse3 = (LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse);
                kotlin.jvm.internal.i.f(llSwitchCourse3, "llSwitchCourse");
                Utils.expand$default(utils2, llSwitchCourse3, 0L, 2, null);
                View viewSwitchCourseBG2 = n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG);
                kotlin.jvm.internal.i.f(viewSwitchCourseBG2, "viewSwitchCourseBG");
                extensions.visible(viewSwitchCourseBG2);
                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).startAnimation(utils2.rotateBy180(0.0f, 180.0f));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void B1() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_play_store_feedback, this, com.theinnerhour.b2b.R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogSlideInAndShrinkOut;
            View findViewById = styledDialog.findViewById(com.theinnerhour.b2b.R.id.yes);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setOnClickListener(new dl.f(this, styledDialog, 8));
            View findViewById2 = styledDialog.findViewById(com.theinnerhour.b2b.R.id.f39931no);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById2).setOnClickListener(new dk.n(styledDialog, 10));
            styledDialog.show();
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            gk.a.b(bundle, "af_playstore_dialog");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void C0() {
        try {
            Extensions extensions = Extensions.INSTANCE;
            LinearLayout switchWeekLayout = (LinearLayout) n0(com.theinnerhour.b2b.R.id.switchWeekLayout);
            kotlin.jvm.internal.i.f(switchWeekLayout, "switchWeekLayout");
            if (extensions.isVisible(switchWeekLayout)) {
                Utils utils = Utils.INSTANCE;
                LinearLayout switchWeekLayout2 = (LinearLayout) n0(com.theinnerhour.b2b.R.id.switchWeekLayout);
                kotlin.jvm.internal.i.f(switchWeekLayout2, "switchWeekLayout");
                Utils.collapse$default(utils, switchWeekLayout2, 0L, 2, null);
                View viewSwitchWeekBG = n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG);
                kotlin.jvm.internal.i.f(viewSwitchWeekBG, "viewSwitchWeekBG");
                extensions.gone(viewSwitchWeekBG);
            } else {
                Utils utils2 = Utils.INSTANCE;
                LinearLayout switchWeekLayout3 = (LinearLayout) n0(com.theinnerhour.b2b.R.id.switchWeekLayout);
                kotlin.jvm.internal.i.f(switchWeekLayout3, "switchWeekLayout");
                Utils.expand$default(utils2, switchWeekLayout3, 0L, 2, null);
                View viewSwitchWeekBG2 = n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG);
                kotlin.jvm.internal.i.f(viewSwitchWeekBG2, "viewSwitchWeekBG");
                extensions.visible(viewSwitchWeekBG2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1() {
        CourseDayModel courseDayModel;
        boolean z10;
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ArrayList<CourseDayModel> plan = I0().getPlan();
        long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
        CourseDayModel courseDayModel2 = null;
        try {
            int size = plan.size();
            courseDayModel = null;
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > todayTimeInSeconds)) {
                        if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                            int i10 = i6 - 1;
                            if (plan.get(i10).getStart_date() != 0) {
                                if (plan.get(i10).getStart_date() >= todayTimeInSeconds) {
                                }
                            }
                        }
                    }
                    courseDayModel = plan.get(i6);
                } catch (Exception e10) {
                    e = e10;
                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                    if (courseDayModel == null) {
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
            courseDayModel = null;
        }
        if (courseDayModel == null) {
            ArrayList<CourseDayModel> plan2 = I0().getPlan();
            long todayTimeInSeconds2 = Utils.INSTANCE.getTodayTimeInSeconds();
            try {
                int size2 = plan2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (plan2.get(i11).getPosition() != 1 && (plan2.get(i11).getStart_date() == 0 || plan2.get(i11).getStart_date() > todayTimeInSeconds2)) {
                        if (i11 > 0 && plan2.get(i11).getStart_date() == 0) {
                            int i12 = i11 - 1;
                            if (plan2.get(i12).getStart_date() != 0) {
                                if (plan2.get(i12).getStart_date() >= todayTimeInSeconds2) {
                                }
                            }
                        }
                    }
                    courseDayModel2 = plan2.get(i11);
                }
            } catch (Exception e12) {
                LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e12);
            }
            kotlin.jvm.internal.i.d(courseDayModel2);
            int position = courseDayModel2.getPosition();
            if ((ca.a.k("v2.2", "v2.21").contains(FirebasePersistence.getInstance().getUser().getVersion()) || (defpackage.d.q("v2.3") && SubscriptionPersistence.INSTANCE.getSubscriptionEnabled())) && position == 2) {
                CourseDayModel courseDayModel3 = (CourseDayModel) is.u.j2(position, I0().getPlan());
                if (courseDayModel3 != null && courseDayModel3.getStart_date() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && W0()) {
                    D1();
                    return;
                }
            }
            if (defpackage.d.q("v2.3") && !kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentMiniCourse(), "")) {
                ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
                ArrayList arrayList = new ArrayList();
                for (Object obj : miniCourses) {
                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), FirebasePersistence.getInstance().getUser().getCurrentMiniCourse())) {
                        arrayList.add(obj);
                    }
                }
                if ((!arrayList.isEmpty()) && ((MiniCourse) arrayList.get(0)).getPlan().size() >= 2 && ((MiniCourse) arrayList.get(0)).getPlan().get(1).getStart_date() == 0 && ((MiniCourse) arrayList.get(0)).getPlan().get(0).getStart_date() != 0 && ((MiniCourse) arrayList.get(0)).getPlan().get(0).getStart_date() < Utils.INSTANCE.getTodayTimeInSeconds() && W0()) {
                    D1();
                }
            }
        }
    }

    public final void D0() {
        User user = FirebasePersistence.getInstance().getUser();
        if (!is.k.Q1(user.getVersion(), new String[]{"v1", "v2"})) {
            if (kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), "")) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clMiniCourses)).setVisibility(0);
                this.f10662k0 = true;
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setAdapter(new i1(this));
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                return;
            }
            this.f10662k0 = false;
            if (this.f10659h0 != null) {
                if (kotlin.jvm.internal.i.b(user.getVersion(), "v2.3")) {
                    MiniCoursesViewModel miniCoursesViewModel = this.f10659h0;
                    if (miniCoursesViewModel != null) {
                        miniCoursesViewModel.f(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("miniCourseViewModel");
                        throw null;
                    }
                }
                MiniCoursesViewModel miniCoursesViewModel2 = this.f10659h0;
                if (miniCoursesViewModel2 != null) {
                    miniCoursesViewModel2.f(null);
                    return;
                } else {
                    kotlin.jvm.internal.i.q("miniCourseViewModel");
                    throw null;
                }
            }
            p1();
        }
    }

    public final void D1() {
        if (ApplicationPersistence.getInstance().getBooleanValue("welcome_popup_displayed", false)) {
            return;
        }
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.activity_welcome_back, this, com.theinnerhour.b2b.R.style.Theme_Dialog);
        ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.letsBegin)).setOnClickListener(new dl.f(styledDialog, this, 0));
        ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.go_home)).setOnClickListener(new dl.f(styledDialog, this, 1));
        styledDialog.show();
        ApplicationPersistence.getInstance().setBooleanValue("welcome_popup_displayed", true);
    }

    public final boolean E0() {
        return this.f10676w0;
    }

    public final void E1() {
        try {
            if (this.f10660i0 != null && !M0().isEmpty() && this.Y) {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_course_welcome_monetized, this, com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
                View findViewById = styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseWelcomeHeading);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                ((RobertoTextView) findViewById).setText(getString(com.theinnerhour.b2b.R.string.onboardingBasicDialogHeader, FirebasePersistence.getInstance().getUser().getFirstName()));
                ((ConstraintLayout) styledDialog.findViewById(com.theinnerhour.b2b.R.id.basicCourseContainer)).setVisibility(8);
                ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseCardPortrait)).setVisibility(0);
                ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseCard)).getLayoutParams().width = -2;
                ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseCard)).setBackgroundResource(com.theinnerhour.b2b.R.color.white);
                View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_db_mini_course_tall_onboarding, (ViewGroup) ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseCardPortrait)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvRowMiniCourseName);
                MiniCoursesViewModel miniCoursesViewModel = this.f10659h0;
                if (miniCoursesViewModel != null) {
                    String domain = M0().get(0).getDomain();
                    kotlin.jvm.internal.i.d(domain);
                    robertoTextView.setText(miniCoursesViewModel.h(domain));
                    ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvRowMiniCourseStatus)).setText(getString(com.theinnerhour.b2b.R.string.begin_today));
                    ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.lockedImg)).setVisibility(8);
                    ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvRowMiniCourseSessions)).setText(M0().get(0).getPlan().size() + " days");
                    String domain2 = M0().get(0).getDomain();
                    kotlin.jvm.internal.i.d(domain2);
                    String mcDrawable = MiniCourseUtilsKt.getMcDrawable(domain2);
                    if (!kotlin.jvm.internal.i.b(mcDrawable, "")) {
                        Glide.c(this).d(this).d(new File(getFilesDir(), mcDrawable)).B((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvRowMiniCourseBg));
                    }
                    String domain3 = M0().get(0).getDomain();
                    kotlin.jvm.internal.i.d(domain3);
                    ((AppCompatImageView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvRowMiniCourseBg)).setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain3)));
                    String domain4 = M0().get(0).getDomain();
                    kotlin.jvm.internal.i.d(domain4);
                    ((ConstraintLayout) inflate.findViewById(com.theinnerhour.b2b.R.id.parentLayout)).setBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain4)));
                    inflate.setOnClickListener(new dl.f(this, styledDialog, 2));
                    ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseCardPortrait)).addView(inflate);
                    String domain5 = M0().get(0).getDomain();
                    kotlin.jvm.internal.i.d(domain5);
                    ((CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.monetizedPulseBackground)).setCardBackgroundColor(Color.parseColor(MiniCourseUtilsKt.getMcColor(domain5)));
                    AnimUtils animUtils = AnimUtils.INSTANCE;
                    CardView cardView = (CardView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.monetizedPulseBackground);
                    kotlin.jvm.internal.i.f(cardView, "dialog.monetizedPulseBackground");
                    AnimUtils.showPulseEffect$default(animUtils, cardView, 2500L, 1.3f, 0.0f, 0, 24, null);
                    Window window = styledDialog.getWindow();
                    if (window != null) {
                        window.setLayout(-1, -1);
                    }
                    styledDialog.show();
                    Bundle bundle = new Bundle();
                    bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putBoolean("isMonetized", true);
                    gk.a.b(bundle, "plan_onboarding_start");
                    return;
                }
                kotlin.jvm.internal.i.q("miniCourseViewModel");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    public final long F0() {
        if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
            ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
        }
        return TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS);
    }

    public final void F1() {
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_mini_course_welcome_unmonetized, this, com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
        View findViewById = styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseWelcomeTitle);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) findViewById;
        CourseDayModel courseDayModel = this.X;
        if (courseDayModel != null) {
            CourseHeroBannerModel hero_banner = courseDayModel.getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner);
            robertoTextView.setText(hero_banner.getTitle());
            View findViewById2 = styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseWelcomeHeading);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById2).setText(getString(com.theinnerhour.b2b.R.string.onboardingDailyPlanDialogTitle, FirebasePersistence.getInstance().getUser().getFirstName()));
            styledDialog.findViewById(com.theinnerhour.b2b.R.id.miniCourseWelcomeImage).setOnClickListener(new dl.f(this, styledDialog, 4));
            AnimUtils animUtils = AnimUtils.INSTANCE;
            View findViewById3 = styledDialog.findViewById(com.theinnerhour.b2b.R.id.unmonetizedPulseBackground);
            kotlin.jvm.internal.i.f(findViewById3, "dialog.findViewById(R.id…monetizedPulseBackground)");
            AnimUtils.showPulseEffect$default(animUtils, findViewById3, 2500L, 0.0f, 0.0f, 0, 28, null);
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            styledDialog.show();
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putBoolean("isMonetized", false);
            gk.a.b(bundle, "plan_onboarding_start");
            return;
        }
        kotlin.jvm.internal.i.q("onboardingTutorialActivityTitle");
        throw null;
    }

    public final int G0() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[Catch: Exception -> 0x01a3, TRY_LEAVE, TryCatch #3 {Exception -> 0x01a3, blocks: (B:3:0x0004, B:5:0x0012, B:6:0x001e, B:33:0x00c3, B:54:0x0141, B:57:0x0171, B:65:0x0180, B:67:0x0186, B:68:0x018a, B:76:0x0199, B:78:0x019d, B:53:0x0138, B:31:0x00b8, B:34:0x00d1, B:36:0x00d7, B:38:0x00e3, B:40:0x00f1, B:43:0x0101, B:45:0x010f, B:47:0x011f, B:49:0x012d), top: B:89:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G1(boolean z10) {
        CourseDayModel courseDayModel;
        try {
            if (FirebasePersistence.getInstance().getUser().getCurrentCourse() == null) {
                startActivity(tr.r.r(this));
                finish();
                return;
            }
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            this.E = courseById;
            ArrayList<CourseDayModel> plan = I0().getPlan();
            long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
            int i6 = 1;
            CourseDayModel courseDayModel2 = null;
            try {
                int size = plan.size();
                courseDayModel = null;
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        if (plan.get(i10).getPosition() != 1 && (plan.get(i10).getStart_date() == 0 || plan.get(i10).getStart_date() > todayTimeInSeconds)) {
                            if (i10 > 0 && plan.get(i10).getStart_date() == 0) {
                                int i11 = i10 - 1;
                                if (plan.get(i11).getStart_date() != 0) {
                                    if (plan.get(i11).getStart_date() >= todayTimeInSeconds) {
                                    }
                                }
                            }
                        }
                        courseDayModel = plan.get(i10);
                    } catch (Exception e10) {
                        e = e10;
                        LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                        if (courseDayModel == null) {
                        }
                    }
                }
            } catch (Exception e11) {
                e = e11;
                courseDayModel = null;
            }
            if (courseDayModel == null) {
                ArrayList<CourseDayModel> plan2 = I0().getPlan();
                long todayTimeInSeconds2 = Utils.INSTANCE.getTodayTimeInSeconds();
                try {
                    int size2 = plan2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        if (plan2.get(i12).getPosition() != 1 && (plan2.get(i12).getStart_date() == 0 || plan2.get(i12).getStart_date() > todayTimeInSeconds2)) {
                            if (i12 > 0 && plan2.get(i12).getStart_date() == 0) {
                                int i13 = i12 - 1;
                                if (plan2.get(i13).getStart_date() != 0) {
                                    if (plan2.get(i13).getStart_date() >= todayTimeInSeconds2) {
                                    }
                                }
                            }
                        }
                        courseDayModel2 = plan2.get(i12);
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e12);
                }
                kotlin.jvm.internal.i.d(courseDayModel2);
                int position = courseDayModel2.getPosition();
                boolean contains = ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion());
                z zVar = this.f10669r0;
                if (contains) {
                    zVar.getClass();
                    if (position >= 8) {
                        if (position < 15) {
                            i6 = 2;
                        } else if (position < 22) {
                            i6 = 3;
                        } else {
                            i6 = 4;
                        }
                    }
                    this.R = i6;
                    this.Q = i6;
                    if (z10) {
                        q1(i6);
                        return;
                    }
                    return;
                }
                zVar.getClass();
                if (position >= 8) {
                    if (position < 15) {
                        i6 = 2;
                    } else if (position < 22) {
                        i6 = 3;
                    } else {
                        i6 = 4;
                    }
                }
                this.R = i6;
                if (z10) {
                    this.Q = i6;
                    q1(i6);
                }
            }
        } catch (Exception e13) {
            LogHelper.INSTANCE.e(this.f10673v, "Exception", e13);
        }
    }

    public final int H0() {
        return this.G;
    }

    public final Course I0() {
        Course course = this.E;
        if (course != null) {
            return course;
        }
        kotlin.jvm.internal.i.q("course");
        throw null;
    }

    public final CourseDayModel J0() {
        return this.F;
    }

    public final int K0() {
        return this.K;
    }

    @Override // tn.b.a
    public final void L() {
        Extensions extensions = Extensions.INSTANCE;
        View cvDailyPlanBookmarkingToolTip = n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip);
        kotlin.jvm.internal.i.f(cvDailyPlanBookmarkingToolTip, "cvDailyPlanBookmarkingToolTip");
        if (extensions.isVisible(cvDailyPlanBookmarkingToolTip)) {
            View cvDailyPlanBookmarkingToolTip2 = n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip);
            kotlin.jvm.internal.i.f(cvDailyPlanBookmarkingToolTip2, "cvDailyPlanBookmarkingToolTip");
            extensions.gone(cvDailyPlanBookmarkingToolTip2);
        }
    }

    public final ArrayList<LearningHubModel> L0() {
        return this.O;
    }

    public final List<MiniCourse> M0() {
        List<MiniCourse> list = this.f10660i0;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("miniCourseList");
        throw null;
    }

    public final ek.c N0() {
        ek.c cVar = this.B;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.i.q("myPlanAdapter");
        throw null;
    }

    public final ProgressDialog O0() {
        ProgressDialog progressDialog = this.f10681z;
        if (progressDialog != null) {
            return progressDialog;
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }

    public final String P0() {
        String str = this.f10677x;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("rating");
        throw null;
    }

    public final void Q0() {
        hs.i iVar = this.f10657f0;
        try {
            z zVar = this.f10669r0;
            zVar.getClass();
            zVar.f26149c = this;
            G1(true);
            if (this.E == null) {
                Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
                this.E = courseById;
            }
            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setText(Constants.getCourseDisplayName(I0().getCourseName()));
            V0();
            xn.a aVar = (xn.a) iVar.getValue();
            aVar.f37863x.e(this, new dk.a(16, new d(aVar)));
            ((xn.a) iVar.getValue()).getClass();
            if (xn.a.f()) {
                this.f10671t0++;
                ((xn.a) iVar.getValue()).e();
                gk.a.b(null, "moodtracker_data_backup_start");
            } else {
                A1(false);
            }
            s1();
            T0();
            u0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0235 A[Catch: Exception -> 0x02c1, TryCatch #1 {Exception -> 0x02c1, blocks: (B:58:0x0231, B:60:0x0235, B:61:0x0250, B:63:0x025c, B:65:0x0270, B:55:0x01f3, B:57:0x021e), top: B:75:0x01f3 }] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.theinnerhour.b2b.model.DbDynamicCardsModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0() {
        String str;
        boolean z10;
        sf.i iVar;
        String str2;
        final Type type;
        String str3;
        DbDynamicCardsModel dbDynamicCardsModel;
        DbDynamicCardsModel dbDynamicCardsModel2;
        String str4 = this.f10673v;
        try {
            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).removeAllViews();
            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(8);
            final x xVar = new x();
            xVar.f23469u = new ArrayList();
            Utils utils = Utils.INSTANCE;
            Calendar todayCalendar = utils.getTodayCalendar();
            String stringValue = ApplicationPersistence.getInstance().getStringValue("dynamic_cards_v2");
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.i(str4, "dynamic cards data " + stringValue);
            final sf.i iVar2 = new sf.i();
            Type type2 = new TypeToken<ArrayList<DbDynamicCardsModel>>() { // from class: com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$initDynamicCards$typeToken$1
            }.getType();
            if (stringValue != null && stringValue.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            long j10 = 1;
            if (z10) {
                DbDynamicCardsModel dbDynamicCardsModel3 = new DbDynamicCardsModel();
                dbDynamicCardsModel3.setType("db_day2");
                ((ArrayList) xVar.f23469u).add(dbDynamicCardsModel3);
                DbDynamicCardsModel dbDynamicCardsModel4 = new DbDynamicCardsModel();
                dbDynamicCardsModel4.setType("db_day3");
                ((ArrayList) xVar.f23469u).add(dbDynamicCardsModel4);
                ApplicationPersistence.getInstance().setStringValueAsync("dynamic_cards_v2", iVar2.h(xVar.f23469u, type2));
                ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_date", todayCalendar.getTimeInMillis());
                ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_seq", 1L);
            } else {
                ?? c10 = iVar2.c(stringValue, type2);
                kotlin.jvm.internal.i.f(c10, "gson.fromJson(dcStr, typeToken)");
                xVar.f23469u = c10;
                todayCalendar.setTimeInMillis(ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_date", utils.getTodayCalendar().getTimeInMillis()));
                long longValue = ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_seq", 1L);
                if (todayCalendar.getTimeInMillis() < utils.getTodayCalendar().getTimeInMillis()) {
                    todayCalendar.setTimeInMillis(utils.getTodayCalendar().getTimeInMillis());
                    j10 = longValue + 1;
                    ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_date", todayCalendar.getTimeInMillis());
                    ApplicationPersistence.getInstance().setLongValueAsync("dc_v2_app_open_seq", j10);
                } else {
                    j10 = longValue;
                }
            }
            int i6 = (j10 > 3L ? 1 : (j10 == 3L ? 0 : -1));
            if (i6 <= 0 || j10 >= 10) {
                final x xVar2 = new x();
                Iterator it = ((Iterable) xVar.f23469u).iterator();
                while (it.hasNext()) {
                    ?? r82 = (DbDynamicCardsModel) it.next();
                    Iterator it2 = it;
                    if (r82.getCard_status() < 2) {
                        if (kotlin.jvm.internal.i.b(r82.getType(), "db_day2") && j10 == 2) {
                            xVar2.f23469u = r82;
                            if (FirebasePersistence.getInstance().getUser().getUserGoals().size() > 0 && (dbDynamicCardsModel2 = (DbDynamicCardsModel) xVar2.f23469u) != null) {
                                dbDynamicCardsModel2.setCard_status(100);
                            }
                        } else if (kotlin.jvm.internal.i.b(r82.getType(), "db_day3") && i6 == 0) {
                            xVar2.f23469u = r82;
                            if (ApplicationPersistence.getInstance().getBooleanValue("relief_box_open", false) && (dbDynamicCardsModel = (DbDynamicCardsModel) xVar2.f23469u) != null) {
                                dbDynamicCardsModel.setCard_status(100);
                            }
                        }
                    }
                    it = it2;
                }
                final DbDynamicCardsModel dbDynamicCardsModel5 = (DbDynamicCardsModel) xVar2.f23469u;
                if (dbDynamicCardsModel5 != null) {
                    if (dbDynamicCardsModel5.getCard_status() < 2) {
                        final View card = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_dynamic_card, (ViewGroup) ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)), false);
                        kotlin.jvm.internal.i.f(card, "card");
                        final Intent dynamicCard = CourseUtilKt.setDynamicCard(dbDynamicCardsModel5, this, card);
                        str = str4;
                        str2 = "card";
                        str3 = "dynamic_cards_v2";
                        type = type2;
                        iVar = iVar2;
                        try {
                            ((CardView) card.findViewById(com.theinnerhour.b2b.R.id.dynamicCardContainer)).setOnClickListener(new View.OnClickListener() { // from class: dl.b
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    View view2 = card;
                                    Type type3 = type;
                                    int i10 = V2DashboardActivity.F0;
                                    kotlin.jvm.internal.x finalCardObj = kotlin.jvm.internal.x.this;
                                    kotlin.jvm.internal.i.g(finalCardObj, "$finalCardObj");
                                    V2DashboardActivity this$0 = this;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    DbDynamicCardsModel cardObj = dbDynamicCardsModel5;
                                    kotlin.jvm.internal.i.g(cardObj, "$cardObj");
                                    sf.i gson = iVar2;
                                    kotlin.jvm.internal.i.g(gson, "$gson");
                                    kotlin.jvm.internal.x dbCardList = xVar;
                                    kotlin.jvm.internal.i.g(dbCardList, "$dbCardList");
                                    try {
                                        T t3 = finalCardObj.f23469u;
                                        kotlin.jvm.internal.i.d(t3);
                                        if (kotlin.jvm.internal.i.b(((DbDynamicCardsModel) t3).getType(), "db_day2")) {
                                            ApplicationPersistence.getInstance().setBooleanValue("show_notification_cm", true);
                                        }
                                        ((FrameLayout) this$0.n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(8);
                                        ((FrameLayout) this$0.n0(com.theinnerhour.b2b.R.id.flDynamicCards)).removeView(view2);
                                        Intent intent = dynamicCard;
                                        if (intent != null) {
                                            this$0.startActivityForResult(intent, this$0.K);
                                        }
                                        cardObj.setCard_status(2);
                                        ApplicationPersistence.getInstance().setStringValueAsync("dynamic_cards_v2", gson.h(dbCardList.f23469u, type3));
                                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                        analyticsBundle.putString("type", cardObj.getType());
                                        UtilsKt.fireAnalytics("dashboard_dc_click", analyticsBundle);
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f10673v, "Exception", e10);
                                    }
                                }
                            });
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(8);
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).addView(card);
                            dbDynamicCardsModel5.setCard_status(1);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(str, "exception", e);
                            return;
                        }
                    } else {
                        iVar = iVar2;
                        str2 = "card";
                        type = type2;
                        str = str4;
                        str3 = "dynamic_cards_v2";
                    }
                    ApplicationPersistence.getInstance().setStringValueAsync(str3, iVar.h(xVar.f23469u, type));
                    if (this.E == null) {
                        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
                        this.E = courseById;
                    }
                    if (I0().getCourseOpenDay() < 10 && !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                        DbDynamicCardsModel dbDynamicCardsModel6 = new DbDynamicCardsModel();
                        dbDynamicCardsModel6.setType("db_day10");
                        View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_dynamic_card, (ViewGroup) ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)), false);
                        kotlin.jvm.internal.i.f(inflate, str2);
                        ((CardView) inflate.findViewById(com.theinnerhour.b2b.R.id.dynamicCardContainer)).setOnClickListener(new j1(CourseUtilKt.setDynamicCard(dbDynamicCardsModel6, this, inflate), 8, this));
                        ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(0);
                        ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).addView(inflate);
                        return;
                    }
                }
            }
            str2 = "card";
            str = str4;
            if (this.E == null) {
            }
            if (I0().getCourseOpenDay() < 10) {
            }
        } catch (Exception e11) {
            e = e11;
            str = str4;
        }
    }

    public final void S0() {
        try {
            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeViewAll)).setVisibility(8);
            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeAddNew)).setOnClickListener(new dl.l(this, 18));
            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeViewAll)).setOnClickListener(new dl.l(this, 19));
            this.D = new ek.k(this, (RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeAddNew), (RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeDefaultText), (RobertoTextView) n0(com.theinnerhour.b2b.R.id.gratitudeViewAll));
            ((RecyclerView) n0(com.theinnerhour.b2b.R.id.gratitude_recycler)).setLayoutManager(new LinearLayoutManager(this, 0, false));
            RecyclerView recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.gratitude_recycler);
            ek.k kVar = this.D;
            if (kVar != null) {
                recyclerView.setAdapter(kVar);
            } else {
                kotlin.jvm.internal.i.q("gratitudeAdapter");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void T0() {
        try {
            ym.c cVar = (ym.c) new androidx.lifecycle.o0(this, new kk.c(I0())).a(ym.c.class);
            this.W = cVar;
            if (cVar != null) {
                cVar.f();
                y1(true);
                ym.c cVar2 = this.W;
                if (cVar2 != null) {
                    cVar2.f38687y.e(this, new dl.g(this, 3));
                    return;
                } else {
                    kotlin.jvm.internal.i.q("learningHubViewModel");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("learningHubViewModel");
            throw null;
        } catch (Exception unused) {
        }
    }

    public final void U0() {
        try {
            this.B = new ek.c(this, I0(), this.Q, kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3"), SubscriptionPersistence.INSTANCE.getSubscriptionEnabled(), new e());
            this.C = new LinearLayoutManager(this, 0, false);
            RecyclerView recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMyPlan);
            LinearLayoutManager linearLayoutManager = this.C;
            if (linearLayoutManager != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMyPlan)).setAdapter(N0());
                N0().i();
                i1();
                if (!I0().getPlan().isEmpty()) {
                    CourseDayModel courseDayModel = I0().getPlan().get(1);
                    kotlin.jvm.internal.i.f(courseDayModel, "course.plan[1]");
                    this.X = courseDayModel;
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("myPlanLayoutManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void V0() {
        try {
            CourseApiUtil courseApiUtil = new CourseApiUtil();
            courseApiUtil.setCourseApiListener(new f(courseApiUtil));
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).removeAllViews();
            ArrayList<Course> courses = FirebasePersistence.getInstance().getCourses();
            Iterator<Course> it = courses.iterator();
            while (it.hasNext()) {
                Course next = it.next();
                if (!kotlin.jvm.internal.i.b(I0().getCourseName(), next.getCourseName())) {
                    View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                    ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(next.getCourseName()));
                    inflate.setOnClickListener(new dk.t(7, this, courseApiUtil, next));
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate);
                }
            }
            if (courses.size() < 6) {
                View inflate2 = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                ((RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText("Add programme");
                ((AppCompatImageView) inflate2.findViewById(com.theinnerhour.b2b.R.id.ivSwitchCoursePlus)).setVisibility(0);
                inflate2.setOnClickListener(new dl.l(this, 17));
                ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void X0() {
        boolean z10;
        try {
            if (this.c0 && ApplicationPersistence.getInstance().getBooleanValue("show_lock_cm", true)) {
                ApplicationPersistence.getInstance().setBooleanValue("show_lock_cm", false);
                String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
                kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
                if (stringValue.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && ca.a.k("v2.2", "v2.21", "v2.3").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                    View viewLockCM = n0(com.theinnerhour.b2b.R.id.viewLockCM);
                    kotlin.jvm.internal.i.f(viewLockCM, "viewLockCM");
                    View viewLockCM2 = n0(com.theinnerhour.b2b.R.id.viewLockCM);
                    kotlin.jvm.internal.i.f(viewLockCM2, "viewLockCM");
                    ConstraintLayout lockCMLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.lockCMLayout);
                    kotlin.jvm.internal.i.f(lockCMLayout, "lockCMLayout");
                    final CustomCoachMark customCoachMark = new CustomCoachMark(ca.a.k(viewLockCM, viewLockCM2, lockCMLayout), new g());
                    this.S.add(customCoachMark);
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.lockCMYesText)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.c

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ V2DashboardActivity f12986v;

                        {
                            this.f12986v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r3;
                            CustomCoachMark coachMark = customCoachMark;
                            V2DashboardActivity this$0 = this.f12986v;
                            switch (i6) {
                                case 0:
                                    int i10 = V2DashboardActivity.F0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                    this$0.startActivityForResult(new Intent(this$0, LockScreenOptionsActivity.class), this$0.K);
                                    coachMark.setVisibility(8);
                                    return;
                                default:
                                    int i11 = V2DashboardActivity.F0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                    Snackbar.h((CoordinatorLayout) this$0.n0(com.theinnerhour.b2b.R.id.mainContainer), "No problem. You can always access this feature later, from the Menu bar in the top left corner.", 0).i();
                                    coachMark.setVisibility(8);
                                    return;
                            }
                        }
                    });
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.lockCMNoText)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.c

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ V2DashboardActivity f12986v;

                        {
                            this.f12986v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r3;
                            CustomCoachMark coachMark = customCoachMark;
                            V2DashboardActivity this$0 = this.f12986v;
                            switch (i6) {
                                case 0:
                                    int i10 = V2DashboardActivity.F0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                    this$0.startActivityForResult(new Intent(this$0, LockScreenOptionsActivity.class), this$0.K);
                                    coachMark.setVisibility(8);
                                    return;
                                default:
                                    int i11 = V2DashboardActivity.F0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                    Snackbar.h((CoordinatorLayout) this$0.n0(com.theinnerhour.b2b.R.id.mainContainer), "No problem. You can always access this feature later, from the Menu bar in the top left corner.", 0).i();
                                    coachMark.setVisibility(8);
                                    return;
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void Y0() {
        if (ApplicationPersistence.getInstance().getBooleanValue(Constants.USER_SIGN_UP_SESSION, false)) {
            return;
        }
        Utils utils = Utils.INSTANCE;
        long todayTimeInSeconds = utils.getTodayTimeInSeconds();
        String appOpenDays = ApplicationPersistence.getInstance().getStringValue("new_mini_course");
        if (kotlin.jvm.internal.i.b(appOpenDays, "")) {
            User user = FirebasePersistence.getInstance().getUser();
            if (user.getMiniCourses().size() == 0) {
                ApplicationPersistence.getInstance().setStringValue("new_mini_course", "0");
                ApplicationPersistence.getInstance().setStringValue("new_mini_course_lastopen", String.valueOf(utils.getTodayTimeInSeconds()));
                if (kotlin.jvm.internal.i.b(user.getVersion(), "v2.2") || kotlin.jvm.internal.i.b(user.getVersion(), "v2.21")) {
                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_onboarding_intro_popup, this, com.theinnerhour.b2b.R.style.Theme_Dialog);
                    Window window = styledDialog.getWindow();
                    kotlin.jvm.internal.i.d(window);
                    window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndShrinkOut;
                    ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.dialogImage)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_minicourse_welcome);
                    ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.onboardingPopupTitle)).setText(getString(com.theinnerhour.b2b.R.string.additionalCoursesDialogHeader));
                    ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.onboardingPopupSubTitle)).setText(getString(com.theinnerhour.b2b.R.string.additionalCoursesDialogSubheader));
                    ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.popupCTA)).setText(getString(com.theinnerhour.b2b.R.string.additionalCoursesDialogCTA));
                    ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.popupCTA)).setOnClickListener(new dk.n(styledDialog, 8));
                    this.f10675w.add(styledDialog);
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvMiniCoursesNewNotif)).setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.i.f(appOpenDays, "appOpenDays");
        if (Float.parseFloat(appOpenDays) < 7.0f) {
            String stringValue = ApplicationPersistence.getInstance().getStringValue("new_mini_course_lastopen");
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringValue(mcLastOpenDate)");
            if (todayTimeInSeconds - Long.parseLong(stringValue) >= 86400) {
                int parseInt = Integer.parseInt(appOpenDays) + 1;
                ApplicationPersistence.getInstance().setStringValue("new_mini_course", String.valueOf(parseInt));
                ApplicationPersistence.getInstance().setStringValue("new_mini_course_lastopen", String.valueOf(utils.getTodayTimeInSeconds()));
                if (parseInt < 7 && (defpackage.d.q("v2.2") || defpackage.d.q("v2.21"))) {
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvMiniCoursesNewNotif)).setVisibility(0);
                } else {
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvMiniCoursesNewNotif)).setVisibility(8);
                }
            } else if (defpackage.d.q("v2.2") || defpackage.d.q("v2.21")) {
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvMiniCoursesNewNotif)).setVisibility(0);
            }
        }
    }

    public final void Z0() {
        View actionView;
        View findViewById;
        ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).p();
        MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
        if (findItem != null && (actionView = findItem.getActionView()) != null && (findViewById = actionView.findViewById(com.theinnerhour.b2b.R.id.bgView)) != null) {
            findViewById.setVisibility(0);
            AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 2, 8, null).addListener(new l(findViewById));
        }
    }

    public final void a1() {
        Iterable<Object> iterable;
        try {
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)).removeAllViews();
            y1(false);
            if (this.O.size() > 5) {
                iterable = new xs.f(0, 4);
            } else {
                iterable = this.O;
            }
            for (Object obj : iterable) {
                if (this.O.size() > 5) {
                    ArrayList<LearningHubModel> arrayList = this.O;
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj = arrayList.get(((Integer) obj).intValue());
                } else {
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
                }
                LearningHubModel learningHubModel = (LearningHubModel) obj;
                kotlin.jvm.internal.i.f(learningHubModel, "if (learningHubList.size…lse i as LearningHubModel");
                View row = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_learning_hub_dashboard, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)), false);
                z zVar = this.f10669r0;
                kotlin.jvm.internal.i.f(row, "row");
                zVar.n(row, learningHubModel);
                ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)).addView(row);
            }
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub)).setOnClickListener(new dl.l(this, 1));
            if (this.P) {
                this.P = false;
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub)).performClick();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "Exception", e10);
        }
    }

    public final void b1() {
        List<MiniCourse> M0;
        if (this.f10660i0 != null && (!M0().isEmpty())) {
            Extensions extensions = Extensions.INSTANCE;
            ConstraintLayout clMiniCourses = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clMiniCourses);
            kotlin.jvm.internal.i.f(clMiniCourses, "clMiniCourses");
            extensions.visible(clMiniCourses);
            User user = FirebasePersistence.getInstance().getUser();
            this.Y = true;
            if (!kotlin.jvm.internal.i.b(user.getVersion(), "v2.3")) {
                M0 = M0().subList(0, 2);
            } else {
                M0 = M0();
            }
            List<MiniCourse> list = M0;
            MiniCoursesViewModel miniCoursesViewModel = this.f10659h0;
            if (miniCoursesViewModel != null) {
                this.f10655b0 = new h1(this, list, miniCoursesViewModel.i(), this.f10661j0, new m());
                RecyclerView recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
                h1 h1Var = this.f10655b0;
                if (h1Var != null) {
                    recyclerView.setAdapter(h1Var);
                    ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                    ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).getViewTreeObserver().addOnGlobalLayoutListener(new n());
                    return;
                }
                kotlin.jvm.internal.i.q("miniCoursesDashboardAdapter");
                throw null;
            }
            kotlin.jvm.internal.i.q("miniCourseViewModel");
            throw null;
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.a
    public final void c(MenuItem p02) {
        String str;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(p02, "p0");
        int itemId = p02.getItemId();
        int i6 = this.K;
        boolean z10 = true;
        switch (itemId) {
            case com.theinnerhour.b2b.R.id.nav_dashboard_lock /* 2131365036 */:
                startActivityForResult(new Intent(this, LockScreenOptionsActivity.class), i6);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_logs /* 2131365037 */:
                UtilsKt.fireAnalytics("dashboard_logs_click", UtilsKt.getAnalyticsBundle());
                MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs);
                Intent intent = new Intent(this, ScreenLogsActivity.class);
                intent.putExtra("title", String.valueOf(findItem.getTitle()));
                startActivity(intent);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_logs_additional /* 2131365038 */:
                Intent intent2 = new Intent(this, ScreenLogsActivity.class);
                intent2.putExtra("logType", a.EnumC0358a.ADDITIONAL_LOGS);
                startActivity(intent2);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_logs_main /* 2131365040 */:
                Intent intent3 = new Intent(this, ScreenLogsActivity.class);
                intent3.putExtra("logType", a.EnumC0358a.MAIN_PLAN_LOGS);
                startActivity(intent3);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_rate_us /* 2131365042 */:
                x1(this);
                A0();
                UtilsKt.fireAnalytics("dashboard_feedback_menu_click", UtilsKt.getAnalyticsBundle());
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_settings /* 2131365044 */:
                UtilsKt.fireAnalytics("dashboard_settings_click", UtilsKt.getAnalyticsBundle());
                startActivityForResult(new Intent(this, SettingsActivity.class), i6);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_therapy /* 2131365045 */:
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                boolean z11 = false;
                analyticsBundle.putBoolean("therapist_assigned", (stringValue == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, "")) ? false : false);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    z11 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
                }
                analyticsBundle.putBoolean("disclaimer_consent", z11);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getVersion();
                } else {
                    str = null;
                }
                analyticsBundle.putString("version", str);
                UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle);
                startActivityForResult(new Intent(this, TelecommunicationsPWAActivity.class), i6);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs /* 2131365046 */:
                Intent intent4 = new Intent(this, MultiTrackerInsightsActivity.class);
                intent4.putExtra("show_logs", true);
                startActivity(intent4);
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                analyticsBundle2.putString("source", Constants.SCREEN_DASHBOARD);
                UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle2);
                break;
        }
        ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).c();
    }

    public final void c1() {
        try {
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llRAExperiment)).removeAllViews();
            z1(true);
            ap.h hVar = this.f10678x0;
            String str = null;
            if (hVar != null) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                }
                ap.h.e(hVar, str, true);
                return;
            }
            ap.f fVar = new ap.f();
            Application application = getApplication();
            kotlin.jvm.internal.i.f(application, "application");
            ap.h hVar2 = (ap.h) new androidx.lifecycle.o0(this, new kk.c(application, fVar)).a(ap.h.class);
            this.f10678x0 = hVar2;
            if (hVar2 != null) {
                hVar2.f3410z.e(this, new dk.a(21, new o(hVar2, this)));
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getCurrentCourseName();
                }
                ap.h.e(hVar2, str, true);
                return;
            }
            kotlin.jvm.internal.i.q("recommendedActivityViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "Exception", e10);
        }
    }

    public final void d1() {
        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
        if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
            if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PRO_THERAPIST_ID), "")) {
                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                StringBuilder sb2 = new StringBuilder("user_friend_map/");
                fd.f fVar = FirebaseAuth.getInstance().f;
                kotlin.jvm.internal.i.d(fVar);
                sb2.append(fVar.j0());
                sb2.append('/');
                sb2.append(ApplicationPersistence.getInstance().getStringValue(Constants.PRO_THERAPIST_ID));
                sb2.append("/unread_messages");
                DatabaseReference reference = firebaseDatabase.getReference(sb2.toString());
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…ST_ID)}/unread_messages\")");
                reference.addListenerForSingleValueEvent(new p());
                return;
            }
            Extensions extensions = Extensions.INSTANCE;
            CardView cvPro = (CardView) n0(com.theinnerhour.b2b.R.id.cvPro);
            kotlin.jvm.internal.i.f(cvPro, "cvPro");
            extensions.gone(cvPro);
            return;
        }
        Extensions extensions2 = Extensions.INSTANCE;
        CardView cvPro2 = (CardView) n0(com.theinnerhour.b2b.R.id.cvPro);
        kotlin.jvm.internal.i.f(cvPro2, "cvPro");
        extensions2.gone(cvPro2);
    }

    public final void e1() {
        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
            startActivity(new Intent(this, DeepLinkActivationActivity.class));
        }
    }

    public final void f1() {
        try {
            G1(true);
            N0().y(this.Q, I0());
            i1();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void g1() {
        CourseDayModel courseDayModel;
        try {
            if (!kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                ArrayList<CourseDayModel> plan = I0().getPlan();
                long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                try {
                    int size = plan.size();
                    courseDayModel = null;
                    for (int i6 = 0; i6 < size; i6++) {
                        try {
                            if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > todayTimeInSeconds)) {
                                if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                                    int i10 = i6 - 1;
                                    if (plan.get(i10).getStart_date() != 0) {
                                        if (plan.get(i10).getStart_date() >= todayTimeInSeconds) {
                                        }
                                    }
                                }
                            }
                            courseDayModel = plan.get(i6);
                        } catch (Exception e10) {
                            e = e10;
                            LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                            if (courseDayModel == null) {
                            }
                            ((RelativeLayout) n0(com.theinnerhour.b2b.R.id.rl_gratitude)).setVisibility(8);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    courseDayModel = null;
                }
                if (courseDayModel == null && courseDayModel.isShow_gratitude()) {
                    ((RelativeLayout) n0(com.theinnerhour.b2b.R.id.rl_gratitude)).setVisibility(0);
                    ek.k kVar = this.D;
                    if (kVar != null) {
                        kVar.v();
                        kVar.i();
                        return;
                    }
                    kotlin.jvm.internal.i.q("gratitudeAdapter");
                    throw null;
                }
                ((RelativeLayout) n0(com.theinnerhour.b2b.R.id.rl_gratitude)).setVisibility(8);
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e12);
        }
    }

    public final void h1(int i6, String str) {
        try {
            ta.v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new q(i6, str, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("rating", i6);
            jSONObject2.put(str, true);
            jSONObject.put("feedback", jSONObject2);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(e11);
        }
    }

    public final void i1() {
        ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMyPlan)).post(new dl.e(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialiseComplete(boolean z10) {
        SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
        String status = currentSubscriptionModel.getStatus();
        SubscriptionModel subscriptionModel = this.U;
        if (subscriptionModel != null) {
            if (kotlin.jvm.internal.i.b(status, subscriptionModel.getStatus())) {
                long expiryTime = currentSubscriptionModel.getExpiryTime();
                SubscriptionModel subscriptionModel2 = this.U;
                if (subscriptionModel2 != null) {
                    if (expiryTime == subscriptionModel2.getExpiryTime()) {
                        String plan = currentSubscriptionModel.getPlan();
                        SubscriptionModel subscriptionModel3 = this.U;
                        if (subscriptionModel3 != null) {
                            if (kotlin.jvm.internal.i.b(plan, subscriptionModel3.getPlan())) {
                                this.U = currentSubscriptionModel;
                                if (this.V != null) {
                                    lp.a aVar = (lp.a) new androidx.lifecycle.o0(this).a(lp.a.class);
                                    this.V = aVar;
                                    if (aVar != null) {
                                        aVar.g();
                                        aVar.f24482x.e(this, new dl.g(this, 0));
                                        aVar.f24483y.e(this, new dl.g(this, 1));
                                    } else {
                                        kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                                        throw null;
                                    }
                                } else {
                                    t1();
                                }
                                if (getIntent().getBooleanExtra("login_flag", false)) {
                                    C1();
                                }
                                q0(false);
                                return;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("previousSubscriptionModel");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("previousSubscriptionModel");
                    throw null;
                }
            }
            this.U = currentSubscriptionModel;
            if (!ca.a.k("v1", "v2", "v2.1").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                r1(false);
            }
            U0();
            u0();
            D0();
            d1();
            if (this.V != null) {
            }
            if (getIntent().getBooleanExtra("login_flag", false)) {
            }
            q0(false);
            return;
        }
        kotlin.jvm.internal.i.q("previousSubscriptionModel");
        throw null;
    }

    public final void j1() {
        ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMyPlan)).post(new dl.e(this, 2));
    }

    public final void k1() {
        this.T = true;
    }

    public final void l1(int i6, Dialog dialog, String str) {
        try {
            this.f10679y = i6;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                this.f10677x = "Most Likely";
                                ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackRatingMessage)).setText("I love it");
                                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                            }
                        } else {
                            this.f10677x = "Likely";
                            ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackRatingMessage)).setText("I like it");
                            ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                            ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                        }
                    } else {
                        this.f10677x = "Neutral";
                        ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackRatingMessage)).setText("It's okay");
                        ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                        ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                        ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                    }
                } else {
                    this.f10677x = "Maybe";
                    ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackRatingMessage)).setText("I don't like it");
                    ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                    ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                    ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                }
            } else {
                this.f10677x = "Never";
                ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackRatingMessage)).setText("I hate it");
                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_filled);
                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
                ((AppCompatImageView) dialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_star_empty);
            }
            new Handler().postDelayed(new ni.c(str, this, dialog, 5), 500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void m1() {
        String str;
        MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs);
        if (!defpackage.d.q("v2.3")) {
            findItem.setTitle(getString(com.theinnerhour.b2b.R.string.genericLogsMenuTitle));
        } else if (this.E != null) {
            String courseName = I0().getCourseName();
            if (courseName != null) {
                switch (courseName.hashCode()) {
                    case -2114782937:
                        if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                            str = getString(com.theinnerhour.b2b.R.string.happinessLogsMenuTitle);
                            break;
                        }
                        break;
                    case -1617042330:
                        if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                            str = getString(com.theinnerhour.b2b.R.string.depressionLogsMenuTitle);
                            break;
                        }
                        break;
                    case -891989580:
                        if (courseName.equals(Constants.COURSE_STRESS)) {
                            str = getString(com.theinnerhour.b2b.R.string.stressLogsMenuTitle);
                            break;
                        }
                        break;
                    case 92960775:
                        if (courseName.equals(Constants.COURSE_ANGER)) {
                            str = getString(com.theinnerhour.b2b.R.string.angerLogsMenuTitle);
                            break;
                        }
                        break;
                    case 109522647:
                        if (courseName.equals(Constants.COURSE_SLEEP)) {
                            str = getString(com.theinnerhour.b2b.R.string.sleepLogsMenuTitle);
                            break;
                        }
                        break;
                    case 113319009:
                        if (courseName.equals(Constants.COURSE_WORRY)) {
                            str = getString(com.theinnerhour.b2b.R.string.worryLogsMenuTitle);
                            break;
                        }
                        break;
                }
                findItem.setTitle(str);
            }
            str = "";
            findItem.setTitle(str);
        }
    }

    public final View n0(int i6) {
        Integer valueOf = Integer.valueOf(i6);
        LinkedHashMap linkedHashMap = this.E0;
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void n1() {
        this.P = true;
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkConnected() {
        LogHelper.INSTANCE.i(this.f10673v, "networkconnected");
        y yVar = this.f10668q0;
        if (yVar != null) {
            if (yVar != null) {
                try {
                    if (ApplicationPersistence.getInstance().getBooleanValue("old_user_notification_reset", false) || ApplicationPersistence.getInstance().getBooleanValue("fetch_notifications", false)) {
                        CourseApiUtil courseApiUtil = new CourseApiUtil();
                        courseApiUtil.setCourseApiListener(new kotlin.jvm.internal.h());
                        courseApiUtil.fetchNotificationData();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(yVar.f25610y, "exception", e10);
                }
            } else {
                kotlin.jvm.internal.i.q("dashboardViewModel");
                throw null;
            }
        }
        if (this.f10662k0 && !this.f10663l0) {
            this.f10664m0.checkMcSlugUpdate(0, this);
        }
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkDisconnected() {
        LogHelper.INSTANCE.i(this.f10673v, "networkDisconnected");
    }

    public final void o0(CourseDayModel dayModel) {
        int i6;
        String str = this.f10673v;
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        try {
            boolean z10 = false;
            if (ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            bundle.putBoolean("subscriptionEnabled", subscriptionPersistence.getSubscriptionEnabled());
            bundle.putInt(Constants.DAYMODEL_POSITION, dayModel.getPosition());
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "my_plan_click");
            Boolean ACTIVITY_UNLOCK = Constants.ACTIVITY_UNLOCK;
            kotlin.jvm.internal.i.f(ACTIVITY_UNLOCK, "ACTIVITY_UNLOCK");
            if (!ACTIVITY_UNLOCK.booleanValue() && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3") && dayModel.getPosition() != i6 && (!subscriptionPersistence.getSubscriptionEnabled() || kotlin.jvm.internal.i.b(subscriptionPersistence.getSubscriptionType(), Constants.SUBSCRIPTION_NONE))) {
                Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                kotlin.jvm.internal.i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                if (SKIP_MONETIZATION.booleanValue()) {
                    startActivity(new Intent(this, ProInitialAssessmentActivity.class).putExtra("source", "locked_card"));
                    return;
                } else {
                    startActivity(new Intent(this, MonetizationActivity.class).putExtra("source", "locked_card").putExtra(Constants.CAMPAIGN_ID, this.f10666o0));
                    return;
                }
            }
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.i(str, "activity card click " + dayModel.getPosition());
            this.F = dayModel;
            if (dayModel.getPosition() != i6 && dayModel.getPosition() != 28) {
                Intent intent = new Intent(this, DailyPlanOverview.class);
                Bundle bundle2 = new Bundle();
                CourseHeroBannerModel hero_banner = dayModel.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner);
                bundle2.putString(Constants.COURSE_TITLE, hero_banner.getTitle());
                CourseHeroBannerModel hero_banner2 = dayModel.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner2);
                bundle2.putString(Constants.API_COURSE_LINK, hero_banner2.getLink());
                bundle2.putInt(Constants.DAYMODEL_POSITION, dayModel.getPosition());
                if (this.Z) {
                    bundle2.putBoolean("tutorial", true);
                }
                if (dayModel.getPosition() == i6 + 1 && dayModel.getStart_date() == 0) {
                    z10 = true;
                }
                bundle2.putBoolean("showPlanFirstScreen", z10);
                intent.putExtras(bundle2);
                startActivityForResult(intent, this.J);
                return;
            }
            Bundle bundle3 = new Bundle();
            CourseHeroBannerModel hero_banner3 = dayModel.getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner3);
            bundle3.putString(Constants.COURSE_TITLE, hero_banner3.getTitle());
            CourseHeroBannerModel hero_banner4 = dayModel.getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner4);
            bundle3.putString(Constants.API_COURSE_LINK, hero_banner4.getLink());
            bundle3.putInt("daymodel_position", dayModel.getPosition());
            z zVar = this.f10669r0;
            CourseHeroBannerModel hero_banner5 = dayModel.getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner5);
            zVar.i(hero_banner5.getLink(), bundle3, Integer.valueOf(dayModel.getPosition()));
            if (dayModel.getStart_date() == 0) {
                G1(true);
                Iterator<CourseDayModel> it = I0().getPlan().iterator();
                while (it.hasNext()) {
                    CourseDayModel next = it.next();
                    if (dayModel.getPosition() == next.getPosition()) {
                        next.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
                        this.E = courseById;
                        N0().y(this.Q, I0());
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception", e10);
        }
    }

    public final void o1() {
        String str;
        boolean z10;
        View view;
        View actionView;
        View actionView2;
        View view2;
        View actionView3;
        View actionView4;
        View view3;
        View actionView5;
        View actionView6;
        View view4;
        View actionView7;
        View actionView8;
        HashMap<String, Object> appConfig;
        User user = FirebasePersistence.getInstance().getUser();
        View view5 = null;
        if (user != null) {
            str = user.getVersion();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.i.b(str, "v2.3") && ((defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) && LocationPersistence.INSTANCE.isIndianUser())) {
            boolean z11 = true;
            ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy).setVisible(true);
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (ApplicationPersistence.getInstance().containsKey(Constants.TELECOMMUNICATION_EXISTING_USER) && ApplicationPersistence.getInstance().getBooleanValue(Constants.TELECOMMUNICATION_EXISTING_USER, false)) {
                    MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                    if (findItem != null && (actionView8 = findItem.getActionView()) != null) {
                        view4 = actionView8.findViewById(com.theinnerhour.b2b.R.id.newTag);
                    } else {
                        view4 = null;
                    }
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                    MenuItem findItem2 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                    if (findItem2 != null && (actionView7 = findItem2.getActionView()) != null) {
                        view5 = actionView7.findViewById(com.theinnerhour.b2b.R.id.subheader);
                    }
                    if (view5 != null) {
                        view5.setVisibility(0);
                        return;
                    }
                    return;
                }
                String stringValue = ApplicationPersistence.getInstance().getStringValue("therapist_data_cache");
                if (stringValue != null && !gv.n.B0(stringValue)) {
                    z11 = false;
                }
                if (!z11 && new TherapistDataCacheUtil().parseResponse(new JSONObject(ApplicationPersistence.getInstance().getStringValue("therapist_data_cache"))) != null) {
                    MenuItem findItem3 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                    if (findItem3 != null && (actionView6 = findItem3.getActionView()) != null) {
                        view3 = actionView6.findViewById(com.theinnerhour.b2b.R.id.newTag);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    MenuItem findItem4 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                    if (findItem4 != null && (actionView5 = findItem4.getActionView()) != null) {
                        view5 = actionView5.findViewById(com.theinnerhour.b2b.R.id.subheader);
                    }
                    if (view5 != null) {
                        view5.setVisibility(0);
                        return;
                    }
                    return;
                }
                MenuItem findItem5 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                if (findItem5 != null && (actionView4 = findItem5.getActionView()) != null) {
                    view2 = actionView4.findViewById(com.theinnerhour.b2b.R.id.newTag);
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                MenuItem findItem6 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                if (findItem6 != null && (actionView3 = findItem6.getActionView()) != null) {
                    view5 = actionView3.findViewById(com.theinnerhour.b2b.R.id.subheader);
                }
                if (view5 != null) {
                    view5.setVisibility(8);
                    return;
                }
                return;
            }
            MenuItem findItem7 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
            if (findItem7 != null && (actionView2 = findItem7.getActionView()) != null) {
                view = actionView2.findViewById(com.theinnerhour.b2b.R.id.newTag);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            MenuItem findItem8 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
            if (findItem8 != null && (actionView = findItem8.getActionView()) != null) {
                view5 = actionView.findViewById(com.theinnerhour.b2b.R.id.subheader);
            }
            if (view5 != null) {
                view5.setVisibility(8);
                return;
            }
            return;
        }
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy).setVisible(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0277, code lost:
        r2 = false;
        r19.getBooleanExtra("tutorial", false);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0289 A[Catch: Exception -> 0x028e, TRY_LEAVE, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x000b, B:7:0x0015, B:10:0x001d, B:11:0x0022, B:14:0x0031, B:16:0x0049, B:17:0x004d, B:19:0x005b, B:20:0x0067, B:22:0x0071, B:23:0x0095, B:25:0x00ab, B:27:0x00bf, B:31:0x00cd, B:33:0x00d6, B:35:0x00e1, B:36:0x00ed, B:38:0x00f3, B:40:0x0108, B:42:0x011a, B:43:0x0125, B:44:0x0139, B:46:0x0165, B:50:0x018b, B:52:0x0199, B:82:0x023b, B:84:0x023f, B:86:0x0253, B:90:0x025f, B:93:0x0267, B:94:0x026b, B:103:0x0282, B:105:0x0289, B:100:0x0277, B:102:0x0280, B:47:0x017f, B:49:0x0183, B:54:0x01ad, B:61:0x01da, B:63:0x01de, B:67:0x01ea, B:69:0x01f1, B:70:0x01f6, B:73:0x01fd, B:75:0x0203, B:77:0x020b, B:79:0x0212, B:81:0x0226), top: B:108:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: Exception -> 0x028e, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x000b, B:7:0x0015, B:10:0x001d, B:11:0x0022, B:14:0x0031, B:16:0x0049, B:17:0x004d, B:19:0x005b, B:20:0x0067, B:22:0x0071, B:23:0x0095, B:25:0x00ab, B:27:0x00bf, B:31:0x00cd, B:33:0x00d6, B:35:0x00e1, B:36:0x00ed, B:38:0x00f3, B:40:0x0108, B:42:0x011a, B:43:0x0125, B:44:0x0139, B:46:0x0165, B:50:0x018b, B:52:0x0199, B:82:0x023b, B:84:0x023f, B:86:0x0253, B:90:0x025f, B:93:0x0267, B:94:0x026b, B:103:0x0282, B:105:0x0289, B:100:0x0277, B:102:0x0280, B:47:0x017f, B:49:0x0183, B:54:0x01ad, B:61:0x01da, B:63:0x01de, B:67:0x01ea, B:69:0x01f1, B:70:0x01f6, B:73:0x01fd, B:75:0x0203, B:77:0x020b, B:79:0x0212, B:81:0x0226), top: B:108:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f A[Catch: Exception -> 0x028e, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x000b, B:7:0x0015, B:10:0x001d, B:11:0x0022, B:14:0x0031, B:16:0x0049, B:17:0x004d, B:19:0x005b, B:20:0x0067, B:22:0x0071, B:23:0x0095, B:25:0x00ab, B:27:0x00bf, B:31:0x00cd, B:33:0x00d6, B:35:0x00e1, B:36:0x00ed, B:38:0x00f3, B:40:0x0108, B:42:0x011a, B:43:0x0125, B:44:0x0139, B:46:0x0165, B:50:0x018b, B:52:0x0199, B:82:0x023b, B:84:0x023f, B:86:0x0253, B:90:0x025f, B:93:0x0267, B:94:0x026b, B:103:0x0282, B:105:0x0289, B:100:0x0277, B:102:0x0280, B:47:0x017f, B:49:0x0183, B:54:0x01ad, B:61:0x01da, B:63:0x01de, B:67:0x01ea, B:69:0x01f1, B:70:0x01f6, B:73:0x01fd, B:75:0x0203, B:77:0x020b, B:79:0x0212, B:81:0x0226), top: B:108:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199 A[Catch: Exception -> 0x028e, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x000b, B:7:0x0015, B:10:0x001d, B:11:0x0022, B:14:0x0031, B:16:0x0049, B:17:0x004d, B:19:0x005b, B:20:0x0067, B:22:0x0071, B:23:0x0095, B:25:0x00ab, B:27:0x00bf, B:31:0x00cd, B:33:0x00d6, B:35:0x00e1, B:36:0x00ed, B:38:0x00f3, B:40:0x0108, B:42:0x011a, B:43:0x0125, B:44:0x0139, B:46:0x0165, B:50:0x018b, B:52:0x0199, B:82:0x023b, B:84:0x023f, B:86:0x0253, B:90:0x025f, B:93:0x0267, B:94:0x026b, B:103:0x0282, B:105:0x0289, B:100:0x0277, B:102:0x0280, B:47:0x017f, B:49:0x0183, B:54:0x01ad, B:61:0x01da, B:63:0x01de, B:67:0x01ea, B:69:0x01f1, B:70:0x01f6, B:73:0x01fd, B:75:0x0203, B:77:0x020b, B:79:0x0212, B:81:0x0226), top: B:108:0x000b }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i6, int i10, Intent intent) {
        boolean z10;
        boolean z11;
        boolean z12;
        CourseDayModel courseDayModel;
        Bundle bundle;
        super.onActivityResult(i6, i10, intent);
        try {
            Bundle bundle2 = null;
            CourseHeroBannerModel courseHeroBannerModel = null;
            if (i6 == this.L && i10 == -1) {
                if (intent != null) {
                    bundle = intent.getExtras();
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    bundle.getBoolean("removeRecommendedFFM");
                }
            }
            u0();
            int i11 = this.G;
            int i12 = this.I;
            int i13 = this.J;
            if (i6 == i11) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("course", I0().getCourseName());
                CourseDayModel courseDayModel2 = this.F;
                if (courseDayModel2 != null) {
                    courseHeroBannerModel = courseDayModel2.getHero_banner();
                }
                kotlin.jvm.internal.i.d(courseHeroBannerModel);
                bundle3.putString(Constants.API_COURSE_LINK, courseHeroBannerModel.getLink());
                CourseDayModel courseDayModel3 = this.F;
                if (courseDayModel3 != null) {
                    kotlin.jvm.internal.i.d(courseDayModel3);
                    bundle3.putInt(Constants.DAYMODEL_POSITION, courseDayModel3.getPosition());
                }
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(user.getCourseReminderTime() * 1000);
                    bundle3.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                }
                if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.21") && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_DEPRESSION)) {
                    CourseDayModel courseDayModel4 = this.F;
                    kotlin.jvm.internal.i.d(courseDayModel4);
                    if (courseDayModel4.getPosition() < 8) {
                        z12 = true;
                        bundle3.putBoolean("isNewActivities", z12);
                        G1(true);
                        if (i10 != -1) {
                            CourseDayModel courseDayModel5 = this.F;
                            kotlin.jvm.internal.i.d(courseDayModel5);
                            if (!courseDayModel5.isCompleted()) {
                                Iterator<CourseDayModel> it = I0().getPlan().iterator();
                                while (it.hasNext()) {
                                    CourseDayModel next = it.next();
                                    CourseDayModel courseDayModel6 = this.F;
                                    kotlin.jvm.internal.i.d(courseDayModel6);
                                    if (courseDayModel6.getPosition() == next.getPosition()) {
                                        next.setCompleted(true);
                                        if (next.getPosition() > I0().getCoursePosition()) {
                                            I0().setCoursePosition(next.getPosition());
                                        }
                                        FirebasePersistence.getInstance().updateUserOnFirebase();
                                        CourseDayModel courseDayModel7 = this.F;
                                        kotlin.jvm.internal.i.d(courseDayModel7);
                                        w0(courseDayModel7.getPosition());
                                    }
                                }
                            }
                            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
                            this.E = courseById;
                            N0().y(this.Q, I0());
                            if (this.T) {
                                this.T = false;
                                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                UtilsKt.fireAnalytics("dashboard_component_finish", bundle3);
                            }
                        } else if (this.T) {
                            this.T = false;
                            UtilsKt.fireAnalytics("dashboard_component_incomplete", bundle3);
                        }
                        r0();
                        courseDayModel = this.F;
                        kotlin.jvm.internal.i.d(courseDayModel);
                        if (courseDayModel.getPosition() == 0) {
                            new Handler().postDelayed(new dl.e(this, 1), 1000L);
                        }
                    }
                }
                z12 = false;
                bundle3.putBoolean("isNewActivities", z12);
                G1(true);
                if (i10 != -1) {
                }
                r0();
                courseDayModel = this.F;
                kotlin.jvm.internal.i.d(courseDayModel);
                if (courseDayModel.getPosition() == 0) {
                }
            } else if (i6 == i13) {
                G1(true);
                CourseDayModel courseDayModel8 = this.F;
                kotlin.jvm.internal.i.d(courseDayModel8);
                w0(courseDayModel8.getPosition());
                N0().y(this.Q, I0());
                r0();
            } else {
                int i14 = this.H;
                int i15 = this.K;
                if (i6 != i12 && i6 != i15 && i6 != i14) {
                    if (i6 == this.M && (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false)))) {
                        q0(true);
                    }
                } else {
                    r0();
                    if (i6 == i14) {
                        if (intent != null) {
                            bundle2 = intent.getExtras();
                        }
                        if (bundle2 != null) {
                            z10 = bundle2.getBoolean("removeLearningHubFFM");
                        } else {
                            z10 = false;
                        }
                        this.f10658g0 = z10;
                        a1();
                    }
                    if (i6 == i15 && FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                        ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).removeAllViews();
                        ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(8);
                    }
                }
            }
            if (i6 == this.f10654a0 && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (i10 != -1 || intent == null || !intent.getBooleanExtra("purchase_successful", false))) {
                    E1();
                }
                F1();
            }
            if (i6 != i13 && i6 != i12) {
                z11 = false;
                v0();
                if (!this.f10667p0) {
                    x0();
                    this.f10667p0 = z11;
                    return;
                }
                return;
            }
            z11 = false;
            this.Z = z11;
            v0();
            if (!this.f10667p0) {
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z10;
        View e10 = ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).e(8388611);
        if (e10 != null) {
            z10 = DrawerLayout.m(e10);
        } else {
            z10 = false;
        }
        if (z10) {
            ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).c();
            return;
        }
        Extensions extensions = Extensions.INSTANCE;
        LinearLayout switchWeekLayout = (LinearLayout) n0(com.theinnerhour.b2b.R.id.switchWeekLayout);
        kotlin.jvm.internal.i.f(switchWeekLayout, "switchWeekLayout");
        if (extensions.isVisible(switchWeekLayout)) {
            C0();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:1|(2:200|(1:202))|5|6|7|(1:197)(1:11)|12|(2:14|(1:16)(2:17|(1:19)(1:20)))|21|22|(7:24|(9:27|(7:30|31|32|33|(2:35|36)(1:38)|37|28)|143|144|(3:146|(8:149|150|151|152|(4:154|155|156|157)(1:166)|158|(1:1)(1:160)|147)|170)|171|172|164|25)|173|174|(2:177|175)|178|179)(1:196)|180|(4:182|183|(1:185)(1:187)|186)|188|(1:190)|191|(1:193)|44|45|46|(1:140)(1:50)|(1:52)|53|(2:55|(1:57))|58|59|60|61|(1:65)|66|(1:68)|69|(3:71|72|(2:74|(2:80|81)(3:76|77|78))(12:85|(1:87)|88|89|90|(3:94|(1:96)|97)|98|(1:104)|105|(1:107)|109|(2:114|(4:119|(1:121)|122|(2:124|(2:129|130)(1:128))(1:131))(1:118))(1:113)))|136|88|89|90|(4:92|94|(0)|97)|98|(3:100|102|104)|105|(0)|109|(1:111)|114|(1:116)|119|(0)|122|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0666, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0667, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e((java.lang.String) r4.f26148b, "exception", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0399 A[Catch: Exception -> 0x051e, TryCatch #0 {Exception -> 0x051e, blocks: (B:92:0x02de, B:94:0x036b, B:96:0x0371, B:99:0x037f, B:100:0x038d, B:102:0x0399, B:104:0x03a5, B:105:0x03cb), top: B:182:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d8 A[Catch: Exception -> 0x051c, TryCatch #4 {Exception -> 0x051c, blocks: (B:107:0x03d2, B:109:0x03d8, B:111:0x03e8, B:112:0x03ff, B:114:0x044a, B:115:0x0456, B:117:0x04b0, B:119:0x04d6, B:125:0x04f3, B:124:0x04eb, B:121:0x04da), top: B:190:0x03d2, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044a A[Catch: Exception -> 0x051c, TryCatch #4 {Exception -> 0x051c, blocks: (B:107:0x03d2, B:109:0x03d8, B:111:0x03e8, B:112:0x03ff, B:114:0x044a, B:115:0x0456, B:117:0x04b0, B:119:0x04d6, B:125:0x04f3, B:124:0x04eb, B:121:0x04da), top: B:190:0x03d2, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b0 A[Catch: Exception -> 0x051c, TryCatch #4 {Exception -> 0x051c, blocks: (B:107:0x03d2, B:109:0x03d8, B:111:0x03e8, B:112:0x03ff, B:114:0x044a, B:115:0x0456, B:117:0x04b0, B:119:0x04d6, B:125:0x04f3, B:124:0x04eb, B:121:0x04da), top: B:190:0x03d2, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05a6 A[Catch: Exception -> 0x0666, TryCatch #7 {Exception -> 0x0666, blocks: (B:142:0x0539, B:144:0x05a6, B:146:0x05b4, B:148:0x05f7, B:149:0x05fb, B:150:0x05fe, B:152:0x0612, B:154:0x061c, B:156:0x062a, B:157:0x0633, B:159:0x064d), top: B:194:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05f7 A[Catch: Exception -> 0x0666, TryCatch #7 {Exception -> 0x0666, blocks: (B:142:0x0539, B:144:0x05a6, B:146:0x05b4, B:148:0x05f7, B:149:0x05fb, B:150:0x05fe, B:152:0x0612, B:154:0x061c, B:156:0x062a, B:157:0x0633, B:159:0x064d), top: B:194:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0612 A[Catch: Exception -> 0x0666, TryCatch #7 {Exception -> 0x0666, blocks: (B:142:0x0539, B:144:0x05a6, B:146:0x05b4, B:148:0x05f7, B:149:0x05fb, B:150:0x05fe, B:152:0x0612, B:154:0x061c, B:156:0x062a, B:157:0x0633, B:159:0x064d), top: B:194:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x064d A[Catch: Exception -> 0x0666, TRY_LEAVE, TryCatch #7 {Exception -> 0x0666, blocks: (B:142:0x0539, B:144:0x05a6, B:146:0x05b4, B:148:0x05f7, B:149:0x05fb, B:150:0x05fe, B:152:0x0612, B:154:0x061c, B:156:0x062a, B:157:0x0633, B:159:0x064d), top: B:194:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036b A[Catch: Exception -> 0x051e, TryCatch #0 {Exception -> 0x051e, blocks: (B:92:0x02de, B:94:0x036b, B:96:0x0371, B:99:0x037f, B:100:0x038d, B:102:0x0399, B:104:0x03a5, B:105:0x03cb), top: B:182:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037f A[Catch: Exception -> 0x051e, TryCatch #0 {Exception -> 0x051e, blocks: (B:92:0x02de, B:94:0x036b, B:96:0x0371, B:99:0x037f, B:100:0x038d, B:102:0x0399, B:104:0x03a5, B:105:0x03cb), top: B:182:0x02de }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        MyApplication.a aVar;
        z zVar;
        a1 a1Var;
        Bundle bundle2;
        User user;
        User user2;
        boolean z10;
        HashMap<String, Object> appConfig;
        boolean z11;
        String str5 = Constants.NEW_COURSE_FLAG;
        String str6 = this.f10673v;
        super.onCreate(bundle);
        setContentView(com.theinnerhour.b2b.R.layout.activity_v2_dash_board);
        getWindow().setStatusBarColor(g0.a.b(this, com.theinnerhour.b2b.R.color.v1_status_bar_dark));
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "this.application");
        y yVar = (y) new androidx.lifecycle.o0(this, new ok.c(new ml.u(application))).a(y.class);
        yVar.f25611z.e(this, new dk.a(17, new dl.s(this)));
        yVar.A.e(this, new dk.a(18, new dl.t(this)));
        yVar.C.e(this, new dk.a(19, new dl.u(this)));
        this.f10668q0 = yVar;
        boolean containsKey = FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("profile_experiment");
        String str7 = Constants.IS_OLD_PROFILE;
        String str8 = Constants.NEW_PROFILE_TOOLTIP_SHOWN;
        boolean z12 = true;
        if (!containsKey || kotlin.jvm.internal.i.b(ri.e.d("profile_experiment"), Boolean.FALSE)) {
            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, true);
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
                ApplicationPersistence.getInstance().setBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false);
            }
        }
        try {
            User user3 = FirebasePersistence.getInstance().getUser();
            String version = user3.getVersion();
            if (version != null && version.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                Course courseByName = FirebasePersistence.getInstance().getCourseByName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                if (!courseByName.getPlan().isEmpty()) {
                    user3.setVersion("v1");
                } else if (!courseByName.getPlanV3().isEmpty()) {
                    user3.setVersion(Constants.USER_VERSION);
                } else {
                    user3.setVersion("v1");
                }
            }
            if (!user3.getAppConfig().containsKey("v1UserCheck")) {
                Iterator<Course> it = user3.getCourseMap().values().iterator();
                while (it.hasNext()) {
                    Course next = it.next();
                    Iterator<CourseDayModel> it2 = next.getPlan().iterator();
                    Iterator<Course> it3 = it;
                    int i6 = -1;
                    while (it2.hasNext()) {
                        str = str5;
                        try {
                            CourseDayModel next2 = it2.next();
                            next2.setShow_goals(z12);
                            if (next2.isCompleted()) {
                                i6 = next2.getPosition();
                            }
                            str5 = str;
                        } catch (Exception e10) {
                            e = e10;
                            str3 = str7;
                            str2 = str8;
                            LogHelper.INSTANCE.e(str6, "exception", e);
                            ProgressDialog progressDialog = new ProgressDialog(this);
                            progressDialog.setMessage("Loading...");
                            progressDialog.setCancelable(false);
                            this.f10681z = progressDialog;
                            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                            SubscriptionModel previousSubscriptionModel = subscriptionPersistence.previousSubscriptionModel();
                            kotlin.jvm.internal.i.g(previousSubscriptionModel, "<set-?>");
                            this.U = previousSubscriptionModel;
                            kotlin.jvm.internal.i.g(subscriptionPersistence.previousSubscriptionModel(), "<set-?>");
                            n1.a a10 = n1.a.a(this);
                            a10.b(this.C0, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
                            a10.b(this.D0, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
                            Q0();
                            LogHelper.INSTANCE.i(str6, "free space");
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.l(this, 5));
                            n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.l(this, 7));
                            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.l(this, 8));
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.l(this, 9));
                            n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.l(this, 10));
                            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.A0);
                            p0();
                            y0();
                            U0();
                            v1();
                            S0();
                            user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 == null) {
                            }
                            z10 = false;
                            if (z10) {
                            }
                            if (ApplicationPersistence.getInstance().getBooleanValue(str3, false)) {
                            }
                            str4 = str;
                            if (getIntent().getBooleanExtra(str4, false)) {
                            }
                            ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setOnClickListener(new dl.l(this, 12));
                            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewShareButton)).setOnClickListener(new dl.l(this, 13));
                            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewRateButton)).setOnClickListener(new dl.l(this, 14));
                            if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
                            }
                            Intent intent = getIntent();
                            kotlin.jvm.internal.i.f(intent, "intent");
                            onNewIntent(intent);
                            LocationPersistence.INSTANCE.fetchLocationInfo(new dl.o(this));
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.l(this, 15));
                            Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
                            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                            }
                            constraintLayout2 = null;
                            aVar = MyApplication.V;
                            aVar.a().a(this);
                            zVar = this.f10669r0;
                            zVar.getClass();
                            Utils utils = Utils.INSTANCE;
                            utils.updateFirebaseInstanceId();
                            utils.updateUserInfo();
                            FirebasePersistence.getInstance().updateMixpanelProperties();
                            FirebasePersistence.getInstance().updateMoEngageUserProperties();
                            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(aVar.a());
                            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                            com.google.android.gms.internal.measurement.j1 j1Var = firebaseAnalytics.f9535a;
                            j1Var.getClass();
                            j1Var.b(new com.google.android.gms.internal.measurement.x0(j1Var, stringValue, 0));
                            FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance(aVar.a());
                            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                            com.google.android.gms.internal.measurement.j1 j1Var2 = firebaseAnalytics2.f9535a;
                            j1Var2.getClass();
                            j1Var2.b(new com.google.android.gms.internal.measurement.a1(j1Var2, (String) null, "course", (Object) currentCourseName, false));
                            bundle2 = new Bundle();
                            if (FirebasePersistence.getInstance().getUser() != null) {
                            }
                            UtilsKt.fireAnalytics("dashboard_view", bundle2);
                            if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
                            }
                            utils.clearNotificationChannel();
                            V2DashboardActivity g5 = zVar.g();
                            if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                            }
                            CourseApiUtil courseApiUtil = this.f10664m0;
                            courseApiUtil.checkMcSlugUpdate(0, this);
                            courseApiUtil.setMiniCourseFetchListener(new i());
                            wn.k kVar = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                            kVar.e();
                            kVar.f36804y.e(this, new dk.a(15, new j()));
                            StatPersistence.INSTANCE.initialise();
                            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                            }
                            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                            }
                            this.f10676w0 = false;
                            if (this.f10674v0 == null) {
                            }
                            a1Var = this.f10674v0;
                            if (a1Var != null) {
                            }
                        }
                    }
                    str = str5;
                    if (i6 != -1) {
                        Iterator<CourseDayModel> it4 = next.getPlan().iterator();
                        while (it4.hasNext()) {
                            CourseDayModel next3 = it4.next();
                            Calendar calendar = Calendar.getInstance();
                            Iterator<CourseDayModel> it5 = it4;
                            str2 = str8;
                            try {
                                calendar.add(5, next3.getPosition() - i6);
                                if (next3.getStart_date() == 0) {
                                    long timeInMillis = calendar.getTimeInMillis();
                                    str3 = str7;
                                    try {
                                        next3.setStart_date(timeInMillis / 1000);
                                    } catch (Exception e11) {
                                        e = e11;
                                        LogHelper.INSTANCE.e(str6, "exception", e);
                                        ProgressDialog progressDialog2 = new ProgressDialog(this);
                                        progressDialog2.setMessage("Loading...");
                                        progressDialog2.setCancelable(false);
                                        this.f10681z = progressDialog2;
                                        SubscriptionPersistence subscriptionPersistence2 = SubscriptionPersistence.INSTANCE;
                                        SubscriptionModel previousSubscriptionModel2 = subscriptionPersistence2.previousSubscriptionModel();
                                        kotlin.jvm.internal.i.g(previousSubscriptionModel2, "<set-?>");
                                        this.U = previousSubscriptionModel2;
                                        kotlin.jvm.internal.i.g(subscriptionPersistence2.previousSubscriptionModel(), "<set-?>");
                                        n1.a a102 = n1.a.a(this);
                                        a102.b(this.C0, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
                                        a102.b(this.D0, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
                                        Q0();
                                        LogHelper.INSTANCE.i(str6, "free space");
                                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.l(this, 5));
                                        n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.l(this, 7));
                                        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.l(this, 8));
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.l(this, 9));
                                        n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.l(this, 10));
                                        ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.A0);
                                        p0();
                                        y0();
                                        U0();
                                        v1();
                                        S0();
                                        user2 = FirebasePersistence.getInstance().getUser();
                                        if (user2 == null) {
                                        }
                                        z10 = false;
                                        if (z10) {
                                        }
                                        if (ApplicationPersistence.getInstance().getBooleanValue(str3, false)) {
                                        }
                                        str4 = str;
                                        if (getIntent().getBooleanExtra(str4, false)) {
                                        }
                                        ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setOnClickListener(new dl.l(this, 12));
                                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewShareButton)).setOnClickListener(new dl.l(this, 13));
                                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewRateButton)).setOnClickListener(new dl.l(this, 14));
                                        if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
                                        }
                                        Intent intent2 = getIntent();
                                        kotlin.jvm.internal.i.f(intent2, "intent");
                                        onNewIntent(intent2);
                                        LocationPersistence.INSTANCE.fetchLocationInfo(new dl.o(this));
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.l(this, 15));
                                        Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
                                        if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                                        }
                                        constraintLayout2 = null;
                                        aVar = MyApplication.V;
                                        aVar.a().a(this);
                                        zVar = this.f10669r0;
                                        zVar.getClass();
                                        Utils utils2 = Utils.INSTANCE;
                                        utils2.updateFirebaseInstanceId();
                                        utils2.updateUserInfo();
                                        FirebasePersistence.getInstance().updateMixpanelProperties();
                                        FirebasePersistence.getInstance().updateMoEngageUserProperties();
                                        FirebaseAnalytics firebaseAnalytics3 = FirebaseAnalytics.getInstance(aVar.a());
                                        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                                        com.google.android.gms.internal.measurement.j1 j1Var3 = firebaseAnalytics3.f9535a;
                                        j1Var3.getClass();
                                        j1Var3.b(new com.google.android.gms.internal.measurement.x0(j1Var3, stringValue2, 0));
                                        FirebaseAnalytics firebaseAnalytics22 = FirebaseAnalytics.getInstance(aVar.a());
                                        String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                                        com.google.android.gms.internal.measurement.j1 j1Var22 = firebaseAnalytics22.f9535a;
                                        j1Var22.getClass();
                                        j1Var22.b(new com.google.android.gms.internal.measurement.a1(j1Var22, (String) null, "course", (Object) currentCourseName2, false));
                                        bundle2 = new Bundle();
                                        if (FirebasePersistence.getInstance().getUser() != null) {
                                        }
                                        UtilsKt.fireAnalytics("dashboard_view", bundle2);
                                        if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
                                        }
                                        utils2.clearNotificationChannel();
                                        V2DashboardActivity g52 = zVar.g();
                                        if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                                        }
                                        CourseApiUtil courseApiUtil2 = this.f10664m0;
                                        courseApiUtil2.checkMcSlugUpdate(0, this);
                                        courseApiUtil2.setMiniCourseFetchListener(new i());
                                        wn.k kVar2 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                                        kVar2.e();
                                        kVar2.f36804y.e(this, new dk.a(15, new j()));
                                        StatPersistence.INSTANCE.initialise();
                                        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                                        }
                                        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                                        }
                                        this.f10676w0 = false;
                                        if (this.f10674v0 == null) {
                                        }
                                        a1Var = this.f10674v0;
                                        if (a1Var != null) {
                                        }
                                    }
                                } else {
                                    str3 = str7;
                                }
                                if (next3.getPosition() >= i6) {
                                    break;
                                }
                                str7 = str3;
                                str8 = str2;
                                it4 = it5;
                            } catch (Exception e12) {
                                e = e12;
                                str3 = str7;
                                LogHelper.INSTANCE.e(str6, "exception", e);
                                ProgressDialog progressDialog22 = new ProgressDialog(this);
                                progressDialog22.setMessage("Loading...");
                                progressDialog22.setCancelable(false);
                                this.f10681z = progressDialog22;
                                SubscriptionPersistence subscriptionPersistence22 = SubscriptionPersistence.INSTANCE;
                                SubscriptionModel previousSubscriptionModel22 = subscriptionPersistence22.previousSubscriptionModel();
                                kotlin.jvm.internal.i.g(previousSubscriptionModel22, "<set-?>");
                                this.U = previousSubscriptionModel22;
                                kotlin.jvm.internal.i.g(subscriptionPersistence22.previousSubscriptionModel(), "<set-?>");
                                n1.a a1022 = n1.a.a(this);
                                a1022.b(this.C0, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
                                a1022.b(this.D0, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
                                Q0();
                                LogHelper.INSTANCE.i(str6, "free space");
                                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.l(this, 5));
                                n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.l(this, 7));
                                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.l(this, 8));
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.l(this, 9));
                                n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.l(this, 10));
                                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.A0);
                                p0();
                                y0();
                                U0();
                                v1();
                                S0();
                                user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 == null) {
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (ApplicationPersistence.getInstance().getBooleanValue(str3, false)) {
                                }
                                str4 = str;
                                if (getIntent().getBooleanExtra(str4, false)) {
                                    CourseDayModel courseDayModel = I0().getPlan().get(0);
                                    kotlin.jvm.internal.i.f(courseDayModel, "course.plan[0]");
                                    o0(courseDayModel);
                                }
                                ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setOnClickListener(new dl.l(this, 12));
                                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewShareButton)).setOnClickListener(new dl.l(this, 13));
                                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewRateButton)).setOnClickListener(new dl.l(this, 14));
                                if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
                                }
                                Intent intent22 = getIntent();
                                kotlin.jvm.internal.i.f(intent22, "intent");
                                onNewIntent(intent22);
                                LocationPersistence.INSTANCE.fetchLocationInfo(new dl.o(this));
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.l(this, 15));
                                Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
                                if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
                                }
                                constraintLayout2 = null;
                                aVar = MyApplication.V;
                                aVar.a().a(this);
                                zVar = this.f10669r0;
                                zVar.getClass();
                                Utils utils22 = Utils.INSTANCE;
                                utils22.updateFirebaseInstanceId();
                                utils22.updateUserInfo();
                                FirebasePersistence.getInstance().updateMixpanelProperties();
                                FirebasePersistence.getInstance().updateMoEngageUserProperties();
                                FirebaseAnalytics firebaseAnalytics32 = FirebaseAnalytics.getInstance(aVar.a());
                                String stringValue22 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                                com.google.android.gms.internal.measurement.j1 j1Var32 = firebaseAnalytics32.f9535a;
                                j1Var32.getClass();
                                j1Var32.b(new com.google.android.gms.internal.measurement.x0(j1Var32, stringValue22, 0));
                                FirebaseAnalytics firebaseAnalytics222 = FirebaseAnalytics.getInstance(aVar.a());
                                String currentCourseName22 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                                com.google.android.gms.internal.measurement.j1 j1Var222 = firebaseAnalytics222.f9535a;
                                j1Var222.getClass();
                                j1Var222.b(new com.google.android.gms.internal.measurement.a1(j1Var222, (String) null, "course", (Object) currentCourseName22, false));
                                bundle2 = new Bundle();
                                if (FirebasePersistence.getInstance().getUser() != null) {
                                }
                                UtilsKt.fireAnalytics("dashboard_view", bundle2);
                                if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
                                }
                                utils22.clearNotificationChannel();
                                V2DashboardActivity g522 = zVar.g();
                                if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                                }
                                CourseApiUtil courseApiUtil22 = this.f10664m0;
                                courseApiUtil22.checkMcSlugUpdate(0, this);
                                courseApiUtil22.setMiniCourseFetchListener(new i());
                                wn.k kVar22 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                                kVar22.e();
                                kVar22.f36804y.e(this, new dk.a(15, new j()));
                                StatPersistence.INSTANCE.initialise();
                                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                                }
                                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                                }
                                this.f10676w0 = false;
                                if (this.f10674v0 == null) {
                                }
                                a1Var = this.f10674v0;
                                if (a1Var != null) {
                                }
                            }
                        }
                    }
                    str3 = str7;
                    str2 = str8;
                    z12 = true;
                    it = it3;
                    str7 = str3;
                    str8 = str2;
                    str5 = str;
                }
                str = str5;
                str3 = str7;
                str2 = str8;
                Iterator<Goal> it6 = user3.getUserGoals().iterator();
                while (it6.hasNext()) {
                    Goal next4 = it6.next();
                    next4.setNotificationScheduled(next4.isVisible());
                }
                HashMap<String, Object> appConfig2 = user3.getAppConfig();
                kotlin.jvm.internal.i.f(appConfig2, "user.appConfig");
                appConfig2.put("v1UserCheck", Boolean.TRUE);
                CourseApiUtil courseApiUtil3 = new CourseApiUtil();
                courseApiUtil3.setCourseApiListener(new dl.q(this, courseApiUtil3));
                String currentCourseName3 = user3.getCurrentCourseName();
                kotlin.jvm.internal.i.f(currentCourseName3, "user.currentCourseName");
                CourseApiUtil.sendCourseApiRequest$default(courseApiUtil3, currentCourseName3, null, 2, null);
            } else {
                str = Constants.NEW_COURSE_FLAG;
                str3 = Constants.IS_OLD_PROFILE;
                str2 = Constants.NEW_PROFILE_TOOLTIP_SHOWN;
            }
            if (!user3.getAppConfig().containsKey("v2OldUserNotificationCheck")) {
                if (ca.a.k("v1").contains(user3.getVersion())) {
                    ApplicationPersistence.getInstance().setBooleanValue("old_user_notification_reset", true);
                } else {
                    ApplicationPersistence.getInstance().setBooleanValue("old_user_notification_reset", false);
                }
                HashMap<String, Object> appConfig3 = user3.getAppConfig();
                kotlin.jvm.internal.i.f(appConfig3, "user.appConfig");
                appConfig3.put("v2OldUserNotificationCheck", Boolean.TRUE);
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                startActivity(new ll.b().a(this, true));
                finish();
            }
            if (FirebasePersistence.getInstance().getCourses().size() > 0) {
                ApplicationPersistence.getInstance().setBooleanValue("existing_user", true);
            }
        } catch (Exception e13) {
            e = e13;
            str = str5;
        }
        ProgressDialog progressDialog222 = new ProgressDialog(this);
        progressDialog222.setMessage("Loading...");
        progressDialog222.setCancelable(false);
        this.f10681z = progressDialog222;
        SubscriptionPersistence subscriptionPersistence222 = SubscriptionPersistence.INSTANCE;
        SubscriptionModel previousSubscriptionModel222 = subscriptionPersistence222.previousSubscriptionModel();
        kotlin.jvm.internal.i.g(previousSubscriptionModel222, "<set-?>");
        this.U = previousSubscriptionModel222;
        kotlin.jvm.internal.i.g(subscriptionPersistence222.previousSubscriptionModel(), "<set-?>");
        n1.a a10222 = n1.a.a(this);
        a10222.b(this.C0, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
        a10222.b(this.D0, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
        Q0();
        try {
            LogHelper.INSTANCE.i(str6, "free space");
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.l(this, 5));
            n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.l(this, 7));
            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.l(this, 8));
            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.l(this, 9));
            n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.l(this, 10));
            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.A0);
            p0();
            y0();
            U0();
            v1();
            S0();
            user2 = FirebasePersistence.getInstance().getUser();
            if (user2 == null && (appConfig = user2.getAppConfig()) != null) {
                z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (z10) {
                n0(com.theinnerhour.b2b.R.id.dashboardRecommendedActivitiesExperiment).setVisibility(0);
                c1();
            }
            if (ApplicationPersistence.getInstance().getBooleanValue(str3, false)) {
                String str9 = str2;
                if (!ApplicationPersistence.getInstance().getBooleanValue(str9, false)) {
                    n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setVisibility(0);
                    n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setOnClickListener(new dl.l(this, 11));
                    ApplicationPersistence.getInstance().setBooleanValue(str9, true);
                    gk.a.b(null, "new_profile_db_pop_shown");
                }
            }
            str4 = str;
        } catch (Exception e14) {
            e = e14;
            str4 = str;
        }
        try {
            if (getIntent().getBooleanExtra(str4, false) && (!I0().getPlan().isEmpty())) {
                CourseDayModel courseDayModel2 = I0().getPlan().get(0);
                kotlin.jvm.internal.i.f(courseDayModel2, "course.plan[0]");
                o0(courseDayModel2);
            }
            ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setOnClickListener(new dl.l(this, 12));
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewShareButton)).setOnClickListener(new dl.l(this, 13));
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewRateButton)).setOnClickListener(new dl.l(this, 14));
            if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
                this.f10666o0 = getIntent().getStringExtra(Constants.LINK_ID);
            }
            Intent intent222 = getIntent();
            kotlin.jvm.internal.i.f(intent222, "intent");
            onNewIntent(intent222);
            LocationPersistence.INSTANCE.fetchLocationInfo(new dl.o(this));
            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.l(this, 15));
            Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
        } catch (Exception e15) {
            e = e15;
            constraintLayout = null;
            LogHelper.INSTANCE.e(str6, "Exception", e);
            constraintLayout2 = constraintLayout;
            aVar = MyApplication.V;
            aVar.a().a(this);
            zVar = this.f10669r0;
            zVar.getClass();
            Utils utils222 = Utils.INSTANCE;
            utils222.updateFirebaseInstanceId();
            utils222.updateUserInfo();
            FirebasePersistence.getInstance().updateMixpanelProperties();
            FirebasePersistence.getInstance().updateMoEngageUserProperties();
            FirebaseAnalytics firebaseAnalytics322 = FirebaseAnalytics.getInstance(aVar.a());
            String stringValue222 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
            com.google.android.gms.internal.measurement.j1 j1Var322 = firebaseAnalytics322.f9535a;
            j1Var322.getClass();
            j1Var322.b(new com.google.android.gms.internal.measurement.x0(j1Var322, stringValue222, 0));
            FirebaseAnalytics firebaseAnalytics2222 = FirebaseAnalytics.getInstance(aVar.a());
            String currentCourseName222 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            com.google.android.gms.internal.measurement.j1 j1Var2222 = firebaseAnalytics2222.f9535a;
            j1Var2222.getClass();
            j1Var2222.b(new com.google.android.gms.internal.measurement.a1(j1Var2222, (String) null, "course", (Object) currentCourseName222, false));
            bundle2 = new Bundle();
            if (FirebasePersistence.getInstance().getUser() != null) {
            }
            UtilsKt.fireAnalytics("dashboard_view", bundle2);
            if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
            }
            utils222.clearNotificationChannel();
            V2DashboardActivity g5222 = zVar.g();
            if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
            }
            CourseApiUtil courseApiUtil222 = this.f10664m0;
            courseApiUtil222.checkMcSlugUpdate(0, this);
            courseApiUtil222.setMiniCourseFetchListener(new i());
            wn.k kVar222 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
            kVar222.e();
            kVar222.f36804y.e(this, new dk.a(15, new j()));
            StatPersistence.INSTANCE.initialise();
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
            }
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
            }
            this.f10676w0 = false;
            if (this.f10674v0 == null) {
            }
            a1Var = this.f10674v0;
            if (a1Var != null) {
            }
        }
        if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3")) {
            dl.l lVar = new dl.l(this, 6);
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCard)).setOnClickListener(lVar);
            constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCardContainerB2B);
            constraintLayout.setOnClickListener(lVar);
            try {
            } catch (Exception e16) {
                e = e16;
                LogHelper.INSTANCE.e(str6, "Exception", e);
                constraintLayout2 = constraintLayout;
                aVar = MyApplication.V;
                aVar.a().a(this);
                zVar = this.f10669r0;
                zVar.getClass();
                Utils utils2222 = Utils.INSTANCE;
                utils2222.updateFirebaseInstanceId();
                utils2222.updateUserInfo();
                FirebasePersistence.getInstance().updateMixpanelProperties();
                FirebasePersistence.getInstance().updateMoEngageUserProperties();
                FirebaseAnalytics firebaseAnalytics3222 = FirebaseAnalytics.getInstance(aVar.a());
                String stringValue2222 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                com.google.android.gms.internal.measurement.j1 j1Var3222 = firebaseAnalytics3222.f9535a;
                j1Var3222.getClass();
                j1Var3222.b(new com.google.android.gms.internal.measurement.x0(j1Var3222, stringValue2222, 0));
                FirebaseAnalytics firebaseAnalytics22222 = FirebaseAnalytics.getInstance(aVar.a());
                String currentCourseName2222 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                com.google.android.gms.internal.measurement.j1 j1Var22222 = firebaseAnalytics22222.f9535a;
                j1Var22222.getClass();
                j1Var22222.b(new com.google.android.gms.internal.measurement.a1(j1Var22222, (String) null, "course", (Object) currentCourseName2222, false));
                bundle2 = new Bundle();
                if (FirebasePersistence.getInstance().getUser() != null) {
                }
                UtilsKt.fireAnalytics("dashboard_view", bundle2);
                if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
                }
                utils2222.clearNotificationChannel();
                V2DashboardActivity g52222 = zVar.g();
                if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                }
                CourseApiUtil courseApiUtil2222 = this.f10664m0;
                courseApiUtil2222.checkMcSlugUpdate(0, this);
                courseApiUtil2222.setMiniCourseFetchListener(new i());
                wn.k kVar2222 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                kVar2222.e();
                kVar2222.f36804y.e(this, new dk.a(15, new j()));
                StatPersistence.INSTANCE.initialise();
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                }
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
                }
                this.f10676w0 = false;
                if (this.f10674v0 == null) {
                }
                a1Var = this.f10674v0;
                if (a1Var != null) {
                }
            }
            if (Utils.INSTANCE.checkConnectivity(this)) {
                y yVar2 = this.f10668q0;
                if (yVar2 != null) {
                    try {
                        ta.v.H(kc.f.H(yVar2), null, 0, new a0(yVar2, null), 3);
                    } catch (Exception e17) {
                        LogHelper.INSTANCE.e(yVar2.f25610y, e17);
                    }
                } else {
                    kotlin.jvm.internal.i.q("dashboardViewModel");
                    throw null;
                }
            } else {
                constraintLayout2 = null;
                constraintLayout2 = null;
                ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                kotlin.jvm.internal.i.f(topicalCourseList, "getInstance().user.topicalCourseList");
                if (!topicalCourseList.isEmpty()) {
                    t0();
                }
                aVar = MyApplication.V;
                aVar.a().a(this);
                zVar = this.f10669r0;
                zVar.getClass();
                Utils utils22222 = Utils.INSTANCE;
                utils22222.updateFirebaseInstanceId();
                utils22222.updateUserInfo();
                FirebasePersistence.getInstance().updateMixpanelProperties();
                FirebasePersistence.getInstance().updateMoEngageUserProperties();
                FirebaseAnalytics firebaseAnalytics32222 = FirebaseAnalytics.getInstance(aVar.a());
                String stringValue22222 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
                com.google.android.gms.internal.measurement.j1 j1Var32222 = firebaseAnalytics32222.f9535a;
                j1Var32222.getClass();
                j1Var32222.b(new com.google.android.gms.internal.measurement.x0(j1Var32222, stringValue22222, 0));
                FirebaseAnalytics firebaseAnalytics222222 = FirebaseAnalytics.getInstance(aVar.a());
                String currentCourseName22222 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                com.google.android.gms.internal.measurement.j1 j1Var222222 = firebaseAnalytics222222.f9535a;
                j1Var222222.getClass();
                j1Var222222.b(new com.google.android.gms.internal.measurement.a1(j1Var222222, (String) null, "course", (Object) currentCourseName22222, false));
                bundle2 = new Bundle();
                if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    FirebaseAnalytics firebaseAnalytics4 = FirebaseAnalytics.getInstance(aVar.a());
                    String currentCourseName4 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    com.google.android.gms.internal.measurement.j1 j1Var4 = firebaseAnalytics4.f9535a;
                    j1Var4.getClass();
                    j1Var4.b(new com.google.android.gms.internal.measurement.a1(j1Var4, (String) null, "course", (Object) currentCourseName4, false));
                    user = FirebasePersistence.getInstance().getUser();
                    String str10 = constraintLayout2;
                    if (user != null) {
                        str10 = user.getVersion();
                    }
                    bundle2.putString("version", str10);
                }
                UtilsKt.fireAnalytics("dashboard_view", bundle2);
                if (zVar.g().getIntent().getBooleanExtra(str4, false) && FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                    UtilsKt.fireAnalytics("dashboard_view_condition_sel", UtilsKt.getAnalyticsBundle());
                }
                utils22222.clearNotificationChannel();
                V2DashboardActivity g522222 = zVar.g();
                if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("update_lock", true);
                    Intent intent3 = new Intent(g522222, LockScreenActivity.class);
                    intent3.putExtras(bundle3);
                    g522222.startActivity(intent3);
                }
                CourseApiUtil courseApiUtil22222 = this.f10664m0;
                courseApiUtil22222.checkMcSlugUpdate(0, this);
                courseApiUtil22222.setMiniCourseFetchListener(new i());
                wn.k kVar22222 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                kVar22222.e();
                kVar22222.f36804y.e(this, new dk.a(15, new j()));
                StatPersistence.INSTANCE.initialise();
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                    if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                        this.f10676w0 = false;
                        if (this.f10674v0 == null) {
                            this.f10674v0 = (a1) new androidx.lifecycle.o0(this, new kk.c(new fm.j1(), MyApplication.V.a())).a(a1.class);
                        }
                        a1Var = this.f10674v0;
                        if (a1Var != null) {
                            if (!FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                                a1Var.m();
                                a1Var.B.e(this, new dk.a(20, new dl.p(this)));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        constraintLayout2 = null;
        aVar = MyApplication.V;
        aVar.a().a(this);
        zVar = this.f10669r0;
        zVar.getClass();
        Utils utils222222 = Utils.INSTANCE;
        utils222222.updateFirebaseInstanceId();
        utils222222.updateUserInfo();
        FirebasePersistence.getInstance().updateMixpanelProperties();
        FirebasePersistence.getInstance().updateMoEngageUserProperties();
        FirebaseAnalytics firebaseAnalytics322222 = FirebaseAnalytics.getInstance(aVar.a());
        String stringValue222222 = SessionManager.getInstance().getStringValue(SessionManager.KEY_UID);
        com.google.android.gms.internal.measurement.j1 j1Var322222 = firebaseAnalytics322222.f9535a;
        j1Var322222.getClass();
        j1Var322222.b(new com.google.android.gms.internal.measurement.x0(j1Var322222, stringValue222222, 0));
        FirebaseAnalytics firebaseAnalytics2222222 = FirebaseAnalytics.getInstance(aVar.a());
        String currentCourseName222222 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        com.google.android.gms.internal.measurement.j1 j1Var2222222 = firebaseAnalytics2222222.f9535a;
        j1Var2222222.getClass();
        j1Var2222222.b(new com.google.android.gms.internal.measurement.a1(j1Var2222222, (String) null, "course", (Object) currentCourseName222222, false));
        bundle2 = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null) {
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            FirebaseAnalytics firebaseAnalytics42 = FirebaseAnalytics.getInstance(aVar.a());
            String currentCourseName42 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            com.google.android.gms.internal.measurement.j1 j1Var42 = firebaseAnalytics42.f9535a;
            j1Var42.getClass();
            j1Var42.b(new com.google.android.gms.internal.measurement.a1(j1Var42, (String) null, "course", (Object) currentCourseName42, false));
            user = FirebasePersistence.getInstance().getUser();
            String str102 = constraintLayout2;
            if (user != null) {
            }
            bundle2.putString("version", str102);
        }
        UtilsKt.fireAnalytics("dashboard_view", bundle2);
        if (zVar.g().getIntent().getBooleanExtra(str4, false)) {
            UtilsKt.fireAnalytics("dashboard_view_condition_sel", UtilsKt.getAnalyticsBundle());
        }
        utils222222.clearNotificationChannel();
        V2DashboardActivity g5222222 = zVar.g();
        if (aVar.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
        }
        CourseApiUtil courseApiUtil222222 = this.f10664m0;
        courseApiUtil222222.checkMcSlugUpdate(0, this);
        courseApiUtil222222.setMiniCourseFetchListener(new i());
        wn.k kVar222222 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
        kVar222222.e();
        kVar222222.f36804y.e(this, new dk.a(15, new j()));
        StatPersistence.INSTANCE.initialise();
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
        }
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT)) {
        }
        this.f10676w0 = false;
        if (this.f10674v0 == null) {
        }
        a1Var = this.f10674v0;
        if (a1Var != null) {
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        androidx.lifecycle.w<Boolean> wVar;
        super.onDestroy();
        MyApplication.V.a().i(this);
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        MiniCoursesViewModel miniCoursesViewModel = this.f10659h0;
        if (miniCoursesViewModel != null) {
            if (miniCoursesViewModel != null) {
                miniCoursesViewModel.f11379z.k(this);
            } else {
                kotlin.jvm.internal.i.q("miniCourseViewModel");
                throw null;
            }
        }
        lp.a aVar = this.V;
        if (aVar != null) {
            if (aVar != null) {
                aVar.f24482x.k(this);
                lp.a aVar2 = this.V;
                if (aVar2 != null) {
                    aVar2.f24483y.k(this);
                } else {
                    kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                throw null;
            }
        }
        MonetizationViewModel monetizationViewModel = this.f10665n0;
        if (monetizationViewModel != null && (wVar = monetizationViewModel.C) != null) {
            wVar.k(this);
        }
        n1.a a10 = n1.a.a(this);
        a10.d(this.B0);
        a10.d(this.D0);
        a10.d(this.C0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNewIntent(Intent intent) {
        Intent intent2;
        Uri data;
        Bundle bundle;
        String string;
        kotlin.jvm.internal.i.g(intent, "intent");
        super.onNewIntent(intent);
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = this.f10673v;
        logHelper.i(str, "on new intent");
        setIntent(intent);
        Bundle extras = intent.getExtras();
        String stringExtra = getIntent().getStringExtra(Constants.LINK_TYPE);
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1182791039) {
                if (hashCode != -643221994) {
                    if (hashCode == -503392131 && stringExtra.equals(Constants.APP_PSYCH_APPOINTMENT)) {
                        intent2 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, getIntent().getStringExtra(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_PSYCHIATRY);
                    }
                } else if (stringExtra.equals(Constants.SELLING_SCREEN_TEST)) {
                    this.f10666o0 = getIntent().getStringExtra(Constants.LINK_ID);
                    r1(true);
                }
            } else if (stringExtra.equals(Constants.APP_APPOINTMENT)) {
                intent2 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, getIntent().getStringExtra(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_THERAPY);
            }
            if (intent2 != null) {
                startActivity(intent2);
            }
            data = intent.getData();
            z zVar = this.f10669r0;
            if (extras == null && extras.containsKey(Constants.API_COURSE_LINK)) {
                if (kotlin.jvm.internal.i.b(extras.getString(Constants.NOTIFICATION_TYPE), "miniCourse")) {
                    this.f10656d0 = true;
                } else {
                    zVar.i(extras.getString(Constants.API_COURSE_LINK), extras, null);
                }
            } else if (data == null) {
                logHelper.i(str, "uri " + data.getQueryParameterNames());
                if (extras == null) {
                    extras = new Bundle();
                }
                for (String str2 : data.getQueryParameterNames()) {
                    extras.putString(str2, data.getQueryParameter(str2));
                }
                zVar.i(data.getLastPathSegment(), extras, null);
            } else if (intent.getBooleanExtra("switch_programme", false)) {
                O0().dismiss();
                Q0();
                f1();
                g1();
                this.f10664m0.fetchNotificationData();
                D0();
            }
            if (extras != null && extras.containsKey(Constants.NOTIFICATION_INTENT) && extras.getBoolean(Constants.NOTIFICATION_INTENT)) {
                bundle = new Bundle();
                if (extras.containsKey(Constants.NOTIFICATION_TYPE) && (string = extras.getString(Constants.NOTIFICATION_TYPE)) != null && string.hashCode() == -1655966961 && string.equals(Constants.SCREEN_ACTIVITY)) {
                    String string2 = extras.getString(Constants.GOAL_ID);
                    LogHelper.INSTANCE.i(str, defpackage.c.r("notification goal id ", string2));
                    extras.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                    extras.putString("experiment", ApplicationPersistence.getInstance().getStringValue("an-experiment-" + string2));
                    extras.putString("experiment_key", ApplicationPersistence.getInstance().getStringValue("an-experiment-key-" + string2));
                    bundle = extras;
                }
                if (extras.containsKey("campaign")) {
                    bundle.putString("campaign", extras.getString("campaign"));
                }
                if (!is.u.Z1(ca.a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), extras.getString(Constants.API_COURSE_LINK))) {
                    bundle.putBoolean("community_notif", true);
                } else {
                    bundle.putBoolean("community_notif", false);
                }
                bundle.putString(Constants.API_COURSE_LINK, extras.getString(Constants.API_COURSE_LINK));
                UtilsKt.fireAnalytics("notification_click", bundle);
            }
            if (extras != null && data == null) {
                x0();
                return;
            }
            this.f10667p0 = true;
        }
        intent2 = null;
        if (intent2 != null) {
        }
        data = intent.getData();
        z zVar2 = this.f10669r0;
        if (extras == null) {
        }
        if (data == null) {
        }
        if (extras != null) {
            bundle = new Bundle();
            if (extras.containsKey(Constants.NOTIFICATION_TYPE)) {
                String string22 = extras.getString(Constants.GOAL_ID);
                LogHelper.INSTANCE.i(str, defpackage.c.r("notification goal id ", string22));
                extras.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                extras.putString("experiment", ApplicationPersistence.getInstance().getStringValue("an-experiment-" + string22));
                extras.putString("experiment_key", ApplicationPersistence.getInstance().getStringValue("an-experiment-key-" + string22));
                bundle = extras;
            }
            if (extras.containsKey("campaign")) {
            }
            if (!is.u.Z1(ca.a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), extras.getString(Constants.API_COURSE_LINK))) {
            }
            bundle.putString(Constants.API_COURSE_LINK, extras.getString(Constants.API_COURSE_LINK));
            UtilsKt.fireAnalytics("notification_click", bundle);
        }
        if (extras != null) {
        }
        this.f10667p0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (getIntent().getBooleanExtra("login_flag", false) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac A[Catch: Exception -> 0x01b9, TryCatch #0 {Exception -> 0x01b9, blocks: (B:3:0x0001, B:5:0x0015, B:6:0x0021, B:8:0x0026, B:10:0x0030, B:12:0x003a, B:17:0x0045, B:19:0x0051, B:20:0x0054, B:23:0x0084, B:25:0x0094, B:27:0x00a4, B:29:0x00ac, B:35:0x0113, B:37:0x0117, B:38:0x011a, B:40:0x0150, B:42:0x015a, B:44:0x0160, B:60:0x019e, B:62:0x01ac, B:63:0x01af, B:47:0x0167, B:48:0x016b, B:50:0x0171, B:30:0x00c3, B:32:0x00d3, B:34:0x00e3), top: B:68:0x0001 }] */
    @Override // androidx.fragment.app.p, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        int i6;
        RecyclerView recyclerView;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z10;
        boolean z11;
        try {
            G1(false);
            SubscriptionPersistence.INSTANCE.fetchData(this);
            long j10 = this.A;
            Utils utils = Utils.INSTANCE;
            if (j10 != utils.getTodayTimeInSeconds()) {
                this.A = utils.getTodayTimeInSeconds();
                f1();
                y0();
            }
            boolean z12 = true;
            if (!this.f10656d0) {
                if (getIntent().getExtras() != null) {
                    Bundle extras = getIntent().getExtras();
                    if (extras != null && extras.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                    }
                }
                C1();
            }
            g1();
            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(0).setChecked(true);
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3") && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE) || !LocationPersistence.INSTANCE.isIndianUser())) {
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3).setTitle("Premium");
                p0();
            } else if (Constants.B2B_USER_TYPES.contains(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE)) && kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                MenuItem item = ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3);
                Object obj = g0.a.f16164a;
                item.setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_experts_b2b));
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3).setTitle("Experts");
                p0();
            }
            ym.c cVar = this.W;
            if (cVar != null) {
                cVar.f();
            }
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            this.E = courseById;
            d1();
            D0();
            RobertoTextView robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.clTopicalCardNewTag);
            if (!ApplicationPersistence.getInstance().getBooleanValue("topical_card_clicked", false)) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                    if (!topicalCourseList.isEmpty()) {
                        for (MiniCourse miniCourse : topicalCourseList) {
                            if (is.k.Q1(miniCourse.getDomain(), new String[]{Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID})) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        if (z12) {
                            i6 = 0;
                            robertoTextView.setVisibility(i6);
                            recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
                            if (recyclerView != null) {
                                recyclerView.h0(0);
                            }
                            q0(false);
                            o1();
                            super.onResume();
                        }
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            i6 = 8;
            robertoTextView.setVisibility(i6);
            recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
            if (recyclerView != null) {
            }
            q0(false);
            o1();
            super.onResume();
        } catch (Exception e10) {
            super.onResume();
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        e1();
        ya.v a10 = wd.a.b().a(getIntent());
        a10.addOnSuccessListener(this, new rk.b(2, new k()));
        a10.addOnFailureListener(this, new dl.j(0));
    }

    public final void p0() {
        Menu menu = ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu();
        kotlin.jvm.internal.i.f(menu, "navigation.menu");
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
        int size = menu.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem mi2 = menu.getItem(i6);
            kotlin.jvm.internal.i.f(mi2, "mi");
            kotlin.jvm.internal.i.f(font, "font");
            UtilsKt.applyFontToMenuItem(mi2, font, -1);
        }
    }

    public final void p1() {
        if (this.f10659h0 != null) {
            D0();
            return;
        }
        MiniCoursesViewModel miniCoursesViewModel = (MiniCoursesViewModel) new androidx.lifecycle.o0(this).a(MiniCoursesViewModel.class);
        this.f10659h0 = miniCoursesViewModel;
        if (miniCoursesViewModel != null) {
            miniCoursesViewModel.f11379z.e(this, new dl.g(this, 2));
            D0();
            return;
        }
        kotlin.jvm.internal.i.q("miniCourseViewModel");
        throw null;
    }

    public final void q0(boolean z10) {
        try {
            if (z10) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.gpaDashboardLayout)).setVisibility(8);
            } else if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                if ((kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) && LocationPersistence.INSTANCE.isIndianUser()) {
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.gpaDashboardLayout)).setVisibility(0);
                    if (ca.a.k("v1", "v2", "v2.1").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.gpaDashboardButton)).setVisibility(8);
                    } else {
                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.gpaDashboardButton)).setOnClickListener(new dl.l(this, 0));
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    public final void q1(int i6) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 < 5; i10++) {
            arrayList.add(findViewById(getResources().getIdentifier(defpackage.c.q("week", i10, "Text"), "id", getPackageName())));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 1; i11 < 5; i11++) {
            arrayList2.add(findViewById(getResources().getIdentifier(defpackage.c.q("week", i11, "Status"), "id", getPackageName())));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 1; i12 < 5; i12++) {
            arrayList3.add(findViewById(getResources().getIdentifier(defpackage.c.p("week", i12), "id", getPackageName())));
        }
        for (final int i13 = 1; i13 < 5; i13++) {
            int i14 = this.R;
            if (i13 == i14) {
                int i15 = i13 - 1;
                ((RobertoTextView) arrayList2.get(i15)).setText(getResources().getString(com.theinnerhour.b2b.R.string.ongoing).toString());
                ((RobertoTextView) arrayList.get(i15)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast));
                ((RobertoTextView) arrayList2.get(i15)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast));
                if (i13 == this.Q) {
                    ((RobertoTextView) arrayList2.get(i15)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.sea));
                }
                ((LinearLayout) arrayList3.get(i15)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ V2DashboardActivity f13072v;

                    {
                        this.f13072v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = r3;
                        int i17 = i13;
                        V2DashboardActivity this$0 = this.f13072v;
                        switch (i16) {
                            case 0:
                                int i18 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i17) {
                                    this$0.Q = i17;
                                    this$0.q1(i17);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i17 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle);
                                }
                                this$0.C0();
                                return;
                            case 1:
                                int i19 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i17) {
                                    this$0.Q = i17;
                                    this$0.q1(i17);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i17 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle2);
                                }
                                this$0.C0();
                                return;
                            default:
                                int i20 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Boolean WEEK_UNLOCK = Constants.WEEK_UNLOCK;
                                kotlin.jvm.internal.i.f(WEEK_UNLOCK, "WEEK_UNLOCK");
                                if (WEEK_UNLOCK.booleanValue()) {
                                    if (this$0.Q != i17) {
                                        this$0.Q = i17;
                                        this$0.q1(i17);
                                        this$0.N0().y(this$0.Q, this$0.I0());
                                        this$0.j1();
                                    }
                                    this$0.C0();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else if (i13 < i14) {
                int i16 = i13 - 1;
                ((RobertoTextView) arrayList2.get(i16)).setText(getResources().getString(com.theinnerhour.b2b.R.string.practise).toString());
                ((RobertoTextView) arrayList.get(i16)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast));
                ((RobertoTextView) arrayList2.get(i16)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast));
                if (i13 == this.Q) {
                    ((RobertoTextView) arrayList2.get(i16)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.sea));
                }
                ((LinearLayout) arrayList3.get(i16)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ V2DashboardActivity f13072v;

                    {
                        this.f13072v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = r3;
                        int i17 = i13;
                        V2DashboardActivity this$0 = this.f13072v;
                        switch (i162) {
                            case 0:
                                int i18 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i17) {
                                    this$0.Q = i17;
                                    this$0.q1(i17);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i17 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle);
                                }
                                this$0.C0();
                                return;
                            case 1:
                                int i19 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i17) {
                                    this$0.Q = i17;
                                    this$0.q1(i17);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i17 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle2);
                                }
                                this$0.C0();
                                return;
                            default:
                                int i20 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Boolean WEEK_UNLOCK = Constants.WEEK_UNLOCK;
                                kotlin.jvm.internal.i.f(WEEK_UNLOCK, "WEEK_UNLOCK");
                                if (WEEK_UNLOCK.booleanValue()) {
                                    if (this$0.Q != i17) {
                                        this$0.Q = i17;
                                        this$0.q1(i17);
                                        this$0.N0().y(this$0.Q, this$0.I0());
                                        this$0.j1();
                                    }
                                    this$0.C0();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                int i17 = i13 - 1;
                ((RobertoTextView) arrayList2.get(i17)).setText(getResources().getString(com.theinnerhour.b2b.R.string.locked).toString());
                ((RobertoTextView) arrayList.get(i17)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.grey_2));
                ((RobertoTextView) arrayList2.get(i17)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.grey_2));
                ((LinearLayout) arrayList3.get(i17)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ V2DashboardActivity f13072v;

                    {
                        this.f13072v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i162 = r3;
                        int i172 = i13;
                        V2DashboardActivity this$0 = this.f13072v;
                        switch (i162) {
                            case 0:
                                int i18 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i172) {
                                    this$0.Q = i172;
                                    this$0.q1(i172);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i172 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle);
                                }
                                this$0.C0();
                                return;
                            case 1:
                                int i19 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.Q != i172) {
                                    this$0.Q = i172;
                                    this$0.q1(i172);
                                    this$0.N0().y(this$0.Q, this$0.I0());
                                    if (i172 == this$0.R) {
                                        this$0.i1();
                                    } else {
                                        this$0.j1();
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", this$0.I0().getCourseName());
                                    UtilsKt.fireAnalytics("week_" + this$0.Q + "_click", bundle2);
                                }
                                this$0.C0();
                                return;
                            default:
                                int i20 = V2DashboardActivity.F0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Boolean WEEK_UNLOCK = Constants.WEEK_UNLOCK;
                                kotlin.jvm.internal.i.f(WEEK_UNLOCK, "WEEK_UNLOCK");
                                if (WEEK_UNLOCK.booleanValue()) {
                                    if (this$0.Q != i172) {
                                        this$0.Q = i172;
                                        this$0.q1(i172);
                                        this$0.N0().y(this$0.Q, this$0.I0());
                                        this$0.j1();
                                    }
                                    this$0.C0();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.weekSwitcherText)).setText(gv.n.F0(getResources().getString(com.theinnerhour.b2b.R.string.week_x).toString(), "x", String.valueOf(i6)));
    }

    public final void r0() {
        boolean z10 = false;
        try {
            long longValue = ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue == utils.getTodayCalendar().getTimeInMillis() && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DASHBOARD_GIVEN_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis() && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                u1();
            } else if ((F0() > 1 || ApplicationPersistence.getInstance().getBooleanValue("app_feedback_day_three", false)) && this.f10675w.size() == 0 && ApplicationPersistence.getInstance().getBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_GOAL_DATE, 0L) != utils.getTodayCalendar().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false);
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", false);
                x1(this);
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
                gk.a.b(analyticsBundle, "show_app_feedback");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "Exception in show app feedback popup", e10);
        }
        z zVar = this.f10669r0;
        zVar.getClass();
        if (FirebasePersistence.getInstance().getUser() != null && zVar.g().f10675w.size() == 0) {
            HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
            Iterator<GamificationBadgesModel> it = Constants.getGamificationBadges().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GamificationBadgesModel next = it.next();
                if (badges.containsKey(next.getId()) && kotlin.jvm.internal.i.b(badges.get(next.getId()), Constants.BADGE_ATTAINED)) {
                    Dialog dialog = UiUtils.Companion.getDialog(com.theinnerhour.b2b.R.layout.gamification_badges_popup, zVar.g());
                    View findViewById = dialog.findViewById(com.theinnerhour.b2b.R.id.title);
                    kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                    ((RobertoTextView) findViewById).setText(next.getName());
                    View findViewById2 = dialog.findViewById(com.theinnerhour.b2b.R.id.desc);
                    kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                    ((RobertoTextView) findViewById2).setVisibility(8);
                    View findViewById3 = dialog.findViewById(com.theinnerhour.b2b.R.id.badgeImage);
                    kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                    ((AppCompatImageView) findViewById3).setImageResource(next.getImage());
                    View findViewById4 = dialog.findViewById(com.theinnerhour.b2b.R.id.close);
                    kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                    ((AppCompatImageView) findViewById4).setOnClickListener(new dk.n(dialog, 16));
                    View findViewById5 = dialog.findViewById(com.theinnerhour.b2b.R.id.popupBadges);
                    kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                    ((RobertoButton) findViewById5).setOnClickListener(new dk.t(zVar, dialog, next, 17));
                    zVar.g().f10675w.add(dialog);
                    badges.put(next.getId(), Constants.BADGE_POPUP_DISPLAYED);
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
        }
        A0();
    }

    public final void r1(boolean z10) {
        Fragment F;
        if (this.f10665n0 != null && !z10) {
            if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (F = getSupportFragmentManager().F("dynamicDbFrag")) != null) {
                androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.o(F);
                aVar.k();
                return;
            }
            return;
        }
        qn.c cVar = new qn.c();
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "application");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new androidx.lifecycle.o0(this, new jl.q(application, this.f10666o0, cVar)).a(MonetizationViewModel.class);
        monetizationViewModel.f();
        monetizationViewModel.C.e(this, new dk.a(14, new r(monetizationViewModel, this)));
        this.f10665n0 = monetizationViewModel;
    }

    public final void s0() {
        try {
            boolean z10 = true;
            if (!ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                ArrayList<CourseDayModel> plan = I0().getPlan();
                long j10 = this.A;
                CourseDayModel courseDayModel = null;
                try {
                    int size = plan.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > j10)) {
                            if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                                int i10 = i6 - 1;
                                if (plan.get(i10).getStart_date() != 0) {
                                    if (plan.get(i10).getStart_date() >= j10) {
                                    }
                                }
                            }
                        }
                        courseDayModel = plan.get(i6);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e10);
                }
                if (courseDayModel != null && courseDayModel.getPosition() == 1 && courseDayModel.getStart_date() == 0) {
                    z10 = false;
                }
            }
            if (z10) {
                X0();
            }
            z0();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f10673v, "error in checkcoachmark", e11);
        }
    }

    public final void s1() {
        try {
            View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.communities_experiment_layout, (ViewGroup) findViewById(com.theinnerhour.b2b.R.id.llCommunitiesExperiment1), false);
            FrameLayout frameLayout = (FrameLayout) findViewById(com.theinnerhour.b2b.R.id.llCommunitiesExperiment1);
            if (frameLayout != null) {
                frameLayout.addView(inflate);
            }
            View findViewById = inflate.findViewById(com.theinnerhour.b2b.R.id.CommunitiesCard1View);
            if (findViewById != null) {
                findViewById.setOnClickListener(DebouncedOnClickListener.wrap(new dl.l(this, 3)));
            }
            View findViewById2 = inflate.findViewById(com.theinnerhour.b2b.R.id.CommunitiesCard2View);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(DebouncedOnClickListener.wrap(new dl.l(this, 4)));
            }
            y yVar = this.f10668q0;
            if (yVar != null) {
                yVar.e();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r2 == true) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        ConstraintLayout topicalView;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z10;
        if (ApplicationPersistence.getInstance().containsKey("2022_topical_fetch_end") && ApplicationPersistence.getInstance().containsKey("2022_topical_plan_end")) {
            if (!defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") && LocationPersistence.INSTANCE.isIndianUser()) {
                topicalView = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCardContainerB2B);
            } else {
                topicalView = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCardContainer);
            }
            boolean z11 = true;
            if (Calendar.getInstance().getTimeInMillis() < ApplicationPersistence.getInstance().getLongValue("2022_topical_fetch_end")) {
                if (ApplicationPersistence.getInstance().getBooleanValue("topical_2022_intro", true) && !ApplicationPersistence.getInstance().getBooleanValue("new_user", false)) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                        if (!topicalCourseList.isEmpty()) {
                            for (MiniCourse miniCourse : topicalCourseList) {
                                if (is.k.Q1(miniCourse.getDomain(), new String[]{Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID})) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        z10 = true;
                    }
                    z11 = false;
                    if (z11) {
                        ApplicationPersistence.getInstance().setBooleanValue("topical_2022_intro", false);
                        Dialog dialog = UiUtils.Companion.getDialog(com.theinnerhour.b2b.R.layout.dialog_topical_entry, this);
                        Window window = dialog.getWindow();
                        kotlin.jvm.internal.i.d(window);
                        window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndSlideOut;
                        ((RobertoTextView) dialog.findViewById(com.theinnerhour.b2b.R.id.btnTopicalEntryDialogCancelCTA)).setOnClickListener(new dk.n(dialog, 9));
                        ((RobertoButton) dialog.findViewById(com.theinnerhour.b2b.R.id.btnTopicalEntryDialogStartCTA)).setOnClickListener(new dl.f(this, dialog, 7));
                        dialog.setCancelable(false);
                        dialog.show();
                    }
                }
                Extensions extensions = Extensions.INSTANCE;
                kotlin.jvm.internal.i.f(topicalView, "topicalView");
                extensions.visible(topicalView);
            } else if (FirebasePersistence.getInstance().getUser().getTopicalCourseList() == null) {
                topicalView.setVisibility(8);
            } else if (Calendar.getInstance().getTimeInMillis() < ApplicationPersistence.getInstance().getLongValue("2022_topical_plan_end")) {
                topicalView.setVisibility(0);
            } else if (!ApplicationPersistence.getInstance().getBooleanValue("2022_topical_card_remove", true)) {
                topicalView.setVisibility(8);
                ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", true);
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_show");
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_topical_remove, this, com.theinnerhour.b2b.R.style.Theme_Dialog);
                Window window2 = styledDialog.getWindow();
                kotlin.jvm.internal.i.d(window2);
                window2.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndSlideOut;
                ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.btnTopicalCancel)).setOnClickListener(new dl.f(styledDialog, this, 5));
                ((RobertoTextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.btnTopicalPositive)).setOnClickListener(new dl.f(styledDialog, this, 6));
                styledDialog.setCancelable(false);
                styledDialog.show();
            }
        }
    }

    public final void t1() {
        lp.a aVar = this.V;
        if (aVar != null) {
            String f2 = aVar.f();
            if (kotlin.jvm.internal.i.b(SubscriptionPersistence.INSTANCE.getSubscriptionState(), Constants.STATE_ON_HOLD) && ca.a.k(Constants.HOLD_DIALOG_2_SHOWN, Constants.HOLD_DIALOG_3_SHOWN).contains(f2)) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(0);
                if (kotlin.jvm.internal.i.b(f2, Constants.HOLD_DIALOG_2_SHOWN)) {
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(0);
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvDashboardSubscriptionMessaging)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay11Text));
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA1)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay11CTA1));
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA2)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay11CTA2));
                } else if (kotlin.jvm.internal.i.b(f2, Constants.HOLD_DIALOG_3_SHOWN)) {
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(0);
                    ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvDashboardSubscriptionMessaging)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay21Text));
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA1)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay21CTA1));
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA2)).setText(getString(com.theinnerhour.b2b.R.string.messagingScreenHoldDay21CTA2));
                }
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA1)).setOnClickListener(new dl.l(this, 2));
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA2)).setOnClickListener(new j1(this, 9, f2));
                return;
            }
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(8);
            return;
        }
        kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
        throw null;
    }

    public final void u0() {
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false)) {
                if (!this.f10658g0) {
                    Extensions extensions = Extensions.INSTANCE;
                    ShimmerFrameLayout learningHubTag = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
                    kotlin.jvm.internal.i.f(learningHubTag, "learningHubTag");
                    extensions.visible(learningHubTag);
                    ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag)).b();
                    return;
                }
                return;
            }
            Extensions extensions2 = Extensions.INSTANCE;
            ShimmerFrameLayout learningHubTag2 = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
            kotlin.jvm.internal.i.f(learningHubTag2, "learningHubTag");
            extensions2.gone(learningHubTag2);
            return;
        }
        Extensions extensions3 = Extensions.INSTANCE;
        ShimmerFrameLayout learningHubTag3 = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
        kotlin.jvm.internal.i.f(learningHubTag3, "learningHubTag");
        extensions3.gone(learningHubTag3);
    }

    public final void u1() {
        ((CardView) n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).setVisibility(0);
        ((CardView) n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).setVisibility(8);
        final Animation loadAnimation = AnimationUtils.loadAnimation(this, com.theinnerhour.b2b.R.anim.shrink_and_fade);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, com.theinnerhour.b2b.R.anim.slide_fade_out_left);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this, com.theinnerhour.b2b.R.anim.slide_fade_in_right);
        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.dashBoardFeedbackNoButton)).setOnClickListener(new View.OnClickListener() { // from class: dl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                Animation animation = loadAnimation;
                V2DashboardActivity this$0 = this;
                switch (i6) {
                    case 0:
                        int i10 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.s());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).startAnimation(animation);
                        return;
                    case 1:
                        int i11 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.u());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                    default:
                        int i12 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.v());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                }
            }
        });
        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.dashBoardFeedbackYesButton)).setOnClickListener(new dk.t(6, loadAnimation2, this, loadAnimation3));
        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.dashBoardPlayStoreFeedbackNoButton)).setOnClickListener(new View.OnClickListener() { // from class: dl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                Animation animation = loadAnimation;
                V2DashboardActivity this$0 = this;
                switch (i6) {
                    case 0:
                        int i10 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.s());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).startAnimation(animation);
                        return;
                    case 1:
                        int i11 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.u());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                    default:
                        int i12 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.v());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                }
            }
        });
        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.dashBoardPlayStoreFeedbackYesButton)).setOnClickListener(new View.OnClickListener() { // from class: dl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r3;
                Animation animation = loadAnimation;
                V2DashboardActivity this$0 = this;
                switch (i6) {
                    case 0:
                        int i10 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.s());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardFeedback)).startAnimation(animation);
                        return;
                    case 1:
                        int i11 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.u());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                    default:
                        int i12 = V2DashboardActivity.F0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        animation.setAnimationListener(new V2DashboardActivity.v());
                        ((CardView) this$0.n0(com.theinnerhour.b2b.R.id.cardDashboardPlayStoreFeedback)).startAnimation(animation);
                        return;
                }
            }
        });
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
        gk.a.b(analyticsBundle, "feedback_dashboard_show");
    }

    public final void v0() {
        ArrayList<Goal> userGoals;
        boolean z10;
        MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs);
        User user = FirebasePersistence.getInstance().getUser();
        boolean z11 = false;
        if (user != null && (userGoals = user.getUserGoals()) != null && !userGoals.isEmpty()) {
            Iterator<T> it = userGoals.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String source = ((Goal) it.next()).getSource();
                if (source != null && source.length() != 0) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        findItem.setVisible(z11);
    }

    public final void v1() {
        try {
            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivLeftMenu)).setOnClickListener(new dl.l(this, 20));
            boolean z10 = true;
            ((RobertoTextView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenuName)).setText(getString(com.theinnerhour.b2b.R.string.left_menu_dashboard_rate_us_title, FirebasePersistence.getInstance().getUser().getFirstName()));
            ((AppCompatImageView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenNewBackArrow)).setOnClickListener(new dl.l(this, 21));
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (kotlin.jvm.internal.i.b(user.getVersion(), "v2.2") || kotlin.jvm.internal.i.b(user.getVersion(), "v2.21") || kotlin.jvm.internal.i.b(user.getVersion(), "v2.3"))) {
                ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_lock).setVisible(true);
            }
            MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs);
            ((xn.a) this.f10657f0.getValue()).getClass();
            if (xn.a.f()) {
                z10 = false;
            }
            findItem.setVisible(z10);
            m1();
            v0();
            ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).setNavigationItemSelectedListener(this);
            Menu menu = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu();
            kotlin.jvm.internal.i.f(menu, "dashboardv2NavView.menu");
            Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
            int b10 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
            int size = menu.size();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItem mi2 = menu.getItem(i6);
                kotlin.jvm.internal.i.f(mi2, "mi");
                kotlin.jvm.internal.i.f(font, "font");
                UtilsKt.applyFontToMenuItem(mi2, font, b10);
                if (mi2.hasSubMenu()) {
                    SubMenu subMenu = mi2.getSubMenu();
                    kotlin.jvm.internal.i.d(subMenu);
                    int size2 = subMenu.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        SubMenu subMenu2 = mi2.getSubMenu();
                        kotlin.jvm.internal.i.d(subMenu2);
                        MenuItem subMenuItem = subMenu2.getItem(i10);
                        kotlin.jvm.internal.i.f(subMenuItem, "subMenuItem");
                        UtilsKt.applyFontToMenuItem(subMenuItem, font, b10);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    public final void w0(int i6) {
        int i10 = this.R;
        if (i10 == 1 && i6 == 7) {
            startActivity(new Intent(this, SevenDayProgressActivity.class));
        } else if (i10 == 2 && i6 == 14) {
            startActivity(new Intent(this, SevenDayProgressActivity.class));
        } else if (i10 == 3 && i6 == 21) {
            startActivity(new Intent(this, SevenDayProgressActivity.class));
        } else if (i10 == 4 && i6 == 28) {
            startActivity(new Intent(this, SevenDayProgressActivity.class));
        }
        try {
            if (ca.a.k("v2.2", "v2.21", "v2.3").contains(FirebasePersistence.getInstance().getUser().getVersion()) && i6 == 0 && FirebasePersistence.getInstance().getUserCourse().size() == 1 && !ApplicationPersistence.getInstance().getBooleanValue("onboarding_complete", false)) {
                ApplicationPersistence.getInstance().setBooleanValue("onboarding_complete", true);
                if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3") && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    startActivityForResult(new Intent(this, MonetizationActivity.class).putExtra("source", "assessment").putExtra("tutorial", true), this.f10654a0);
                } else {
                    F1();
                }
            } else if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), "v2.3") && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && i6 == 0) {
                startActivityForResult(new Intent(this, MonetizationActivity.class).putExtra("source", "assessment"), this.K);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("Exception when setting up onboarding tutorial", e10);
        }
    }

    public final void w1() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_feedback, this, com.theinnerhour.b2b.R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogSlideInAndShrinkOut;
            View findViewById = styledDialog.findViewById(com.theinnerhour.b2b.R.id.btnSubmit);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setOnClickListener(new dl.f(styledDialog, this, 3));
            styledDialog.show();
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            gk.a.b(bundle, "af_negative_dialog");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "exception", e10);
        }
    }

    public final void x0() {
        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
        if (subscriptionPersistence.getSubscriptionEnabled() && !ApplicationPersistence.getInstance().containsKey("subscription_start")) {
            ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
        } else if (!subscriptionPersistence.getSubscriptionEnabled()) {
            if (ApplicationPersistence.getInstance().containsKey("subscription_start")) {
                if (Calendar.getInstance().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue("subscription_start") > 604800000 && defpackage.d.q("v2.3")) {
                    startActivity(new Intent(this, PlanExpiryInfoActivity.class));
                }
                ApplicationPersistence.getInstance().deleteKey("subscription_start");
                ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.FALSE);
            }
            u0();
        }
    }

    public final void x1(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            this.f10679y = 0;
            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.feedback_popup, context, com.theinnerhour.b2b.R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.getAttributes().windowAnimations = com.theinnerhour.b2b.R.style.DialogGrowInAndSlideOut;
            ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar1)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ V2DashboardActivity f13036v;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f13038x = Constants.FEEDBACK_TOP_MENU;

                {
                    this.f13036v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    String feedback = this.f13038x;
                    Dialog dialog = styledDialog;
                    V2DashboardActivity this$0 = this.f13036v;
                    switch (i6) {
                        case 0:
                            int i10 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(1, dialog, feedback);
                            return;
                        case 1:
                            int i11 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(2, dialog, feedback);
                            return;
                        case 2:
                            int i12 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(3, dialog, feedback);
                            return;
                        case 3:
                            int i13 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(4, dialog, feedback);
                            return;
                        default:
                            int i14 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(5, dialog, feedback);
                            return;
                    }
                }
            });
            ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar2)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ V2DashboardActivity f13036v;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f13038x = Constants.FEEDBACK_TOP_MENU;

                {
                    this.f13036v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    String feedback = this.f13038x;
                    Dialog dialog = styledDialog;
                    V2DashboardActivity this$0 = this.f13036v;
                    switch (i6) {
                        case 0:
                            int i10 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(1, dialog, feedback);
                            return;
                        case 1:
                            int i11 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(2, dialog, feedback);
                            return;
                        case 2:
                            int i12 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(3, dialog, feedback);
                            return;
                        case 3:
                            int i13 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(4, dialog, feedback);
                            return;
                        default:
                            int i14 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(5, dialog, feedback);
                            return;
                    }
                }
            });
            ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar3)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ V2DashboardActivity f13036v;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f13038x = Constants.FEEDBACK_TOP_MENU;

                {
                    this.f13036v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    String feedback = this.f13038x;
                    Dialog dialog = styledDialog;
                    V2DashboardActivity this$0 = this.f13036v;
                    switch (i6) {
                        case 0:
                            int i10 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(1, dialog, feedback);
                            return;
                        case 1:
                            int i11 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(2, dialog, feedback);
                            return;
                        case 2:
                            int i12 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(3, dialog, feedback);
                            return;
                        case 3:
                            int i13 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(4, dialog, feedback);
                            return;
                        default:
                            int i14 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(5, dialog, feedback);
                            return;
                    }
                }
            });
            ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar4)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ V2DashboardActivity f13036v;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f13038x = Constants.FEEDBACK_TOP_MENU;

                {
                    this.f13036v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    String feedback = this.f13038x;
                    Dialog dialog = styledDialog;
                    V2DashboardActivity this$0 = this.f13036v;
                    switch (i6) {
                        case 0:
                            int i10 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(1, dialog, feedback);
                            return;
                        case 1:
                            int i11 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(2, dialog, feedback);
                            return;
                        case 2:
                            int i12 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(3, dialog, feedback);
                            return;
                        case 3:
                            int i13 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(4, dialog, feedback);
                            return;
                        default:
                            int i14 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(5, dialog, feedback);
                            return;
                    }
                }
            });
            ((AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.feedbackStar5)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ V2DashboardActivity f13036v;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f13038x = Constants.FEEDBACK_TOP_MENU;

                {
                    this.f13036v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r3;
                    String feedback = this.f13038x;
                    Dialog dialog = styledDialog;
                    V2DashboardActivity this$0 = this.f13036v;
                    switch (i6) {
                        case 0:
                            int i10 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(1, dialog, feedback);
                            return;
                        case 1:
                            int i11 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(2, dialog, feedback);
                            return;
                        case 2:
                            int i12 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(3, dialog, feedback);
                            return;
                        case 3:
                            int i13 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(4, dialog, feedback);
                            return;
                        default:
                            int i14 = V2DashboardActivity.F0;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                            kotlin.jvm.internal.i.g(feedback, "$feedback");
                            this$0.l1(5, dialog, feedback);
                            return;
                    }
                }
            });
            this.f10675w.add(styledDialog);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, e10);
        }
    }

    public final void y0() {
        try {
            R0();
            Y0();
            if (ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_seq", 1L) == 2) {
                this.c0 = true;
            }
            r0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "Exception", e10);
        }
    }

    public final void y1(boolean z10) {
        if (z10) {
            Extensions extensions = Extensions.INSTANCE;
            ProgressBar learningHubProgress = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubProgress);
            kotlin.jvm.internal.i.f(learningHubProgress, "learningHubProgress");
            extensions.visible(learningHubProgress);
            RobertoTextView tvLearningHub = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHub);
            kotlin.jvm.internal.i.f(tvLearningHub, "tvLearningHub");
            extensions.gone(tvLearningHub);
            HorizontalScrollView hsLearningHub = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHub);
            kotlin.jvm.internal.i.f(hsLearningHub, "hsLearningHub");
            extensions.gone(hsLearningHub);
            RobertoButton buttonLearningHub = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub);
            kotlin.jvm.internal.i.f(buttonLearningHub, "buttonLearningHub");
            extensions.gone(buttonLearningHub);
            return;
        }
        Extensions extensions2 = Extensions.INSTANCE;
        ProgressBar learningHubProgress2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubProgress);
        kotlin.jvm.internal.i.f(learningHubProgress2, "learningHubProgress");
        extensions2.gone(learningHubProgress2);
        RobertoTextView tvLearningHub2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHub);
        kotlin.jvm.internal.i.f(tvLearningHub2, "tvLearningHub");
        extensions2.visible(tvLearningHub2);
        HorizontalScrollView hsLearningHub2 = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHub);
        kotlin.jvm.internal.i.f(hsLearningHub2, "hsLearningHub");
        extensions2.visible(hsLearningHub2);
        RobertoButton buttonLearningHub2 = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub);
        kotlin.jvm.internal.i.f(buttonLearningHub2, "buttonLearningHub");
        extensions2.visible(buttonLearningHub2);
    }

    public final void z0() {
        ArrayList<CustomCoachMark> arrayList = this.S;
        try {
            if (arrayList.size() == 0) {
                return;
            }
            arrayList.get(0).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10673v, "error in displaycoachmark", e10);
        }
    }

    public final void z1(boolean z10) {
        if (z10) {
            Extensions extensions = Extensions.INSTANCE;
            ProgressBar pbRAExperiment = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbRAExperiment);
            kotlin.jvm.internal.i.f(pbRAExperiment, "pbRAExperiment");
            extensions.visible(pbRAExperiment);
            RobertoTextView dbRAExperimentViewAllCTA = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.dbRAExperimentViewAllCTA);
            kotlin.jvm.internal.i.f(dbRAExperimentViewAllCTA, "dbRAExperimentViewAllCTA");
            extensions.gone(dbRAExperimentViewAllCTA);
            HorizontalScrollView hsRAExperiment = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsRAExperiment);
            kotlin.jvm.internal.i.f(hsRAExperiment, "hsRAExperiment");
            extensions.gone(hsRAExperiment);
            return;
        }
        Extensions extensions2 = Extensions.INSTANCE;
        ProgressBar pbRAExperiment2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbRAExperiment);
        kotlin.jvm.internal.i.f(pbRAExperiment2, "pbRAExperiment");
        extensions2.gone(pbRAExperiment2);
        RobertoTextView dbRAExperimentViewAllCTA2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.dbRAExperimentViewAllCTA);
        kotlin.jvm.internal.i.f(dbRAExperimentViewAllCTA2, "dbRAExperimentViewAllCTA");
        extensions2.visible(dbRAExperimentViewAllCTA2);
        HorizontalScrollView hsRAExperiment2 = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsRAExperiment);
        kotlin.jvm.internal.i.f(hsRAExperiment2, "hsRAExperiment");
        extensions2.visible(hsRAExperiment2);
    }

    /* compiled from: V2DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f implements CourseApiUtil.CourseApiUtilInterface {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ CourseApiUtil f10690v;

        public f(CourseApiUtil courseApiUtil) {
            this.f10690v = courseApiUtil;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            V2DashboardActivity v2DashboardActivity = V2DashboardActivity.this;
            v2DashboardActivity.O0().dismiss();
            v2DashboardActivity.B0();
            v2DashboardActivity.Q0();
            v2DashboardActivity.f1();
            v2DashboardActivity.g1();
            this.f10690v.fetchNotificationData();
            v2DashboardActivity.D0();
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception error) {
            kotlin.jvm.internal.i.g(error, "error");
            Extensions.toast$default(Extensions.INSTANCE, V2DashboardActivity.this, "Error, Please try again", 0, 2, null);
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }
}
