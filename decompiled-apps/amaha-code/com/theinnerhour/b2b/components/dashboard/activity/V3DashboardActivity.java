package com.theinnerhour.b2b.components.dashboard.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.activity.DailyPlanOverviewV3;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.PlanExpiryInfoActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.chat.model.ChatMessage;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.LibraryScreenLogsActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.Questions;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
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
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.CustomCoachMark;
import com.theinnerhour.b2b.model.FirebaseCourseUpdateListener;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.ProCard;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.AddonProfileDetails;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.network.model.Testimonials;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationInterface;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.DownloadUtil;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.TherapistDataCacheUtil;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.a2;
import dl.b2;
import dl.c2;
import dl.d2;
import dl.e2;
import dl.f2;
import dl.k2;
import dl.l0;
import dl.l2;
import dl.m0;
import dl.n0;
import dl.p0;
import dl.q0;
import dl.r0;
import dl.r1;
import dl.s1;
import dl.t0;
import dl.t1;
import dl.u0;
import dl.u1;
import dl.v0;
import dl.v1;
import dl.w0;
import dl.w1;
import dl.x1;
import dl.y1;
import dl.z1;
import ek.h1;
import ek.i1;
import fm.a1;
import fm.y0;
import g0.a;
import ik.j1;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import kn.a;
import kotlin.Metadata;
import lg.f;
import li.a;
import ml.s0;
import nn.x0;
import nn.z0;
import org.json.JSONObject;
import tn.b;
/* compiled from: V3DashboardActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/activity/V3DashboardActivity;", "Landroidx/appcompat/app/c;", "Lcom/google/android/material/navigation/NavigationView$a;", "Lcom/theinnerhour/b2b/model/FirebaseCourseUpdateListener;", "Lul/a;", "Lxk/a;", "Ltn/b$a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class V3DashboardActivity extends androidx.appcompat.app.c implements NavigationView.a, FirebaseCourseUpdateListener, ul.a, xk.a, b.a {

    /* renamed from: r1  reason: collision with root package name */
    public static final /* synthetic */ int f10714r1 = 0;
    public long A;
    public final boolean A0;
    public MonetizationViewModel B0;
    public CourseDayModelV1 C;
    public String C0;
    public boolean D;
    public boolean D0;
    public h1 E;
    public final androidx.activity.result.c<Intent> E0;
    public MiniCoursesViewModel F;
    public final androidx.activity.result.c<Intent> F0;
    public List<MiniCourse> G;
    public final androidx.activity.result.c<Intent> G0;
    public final androidx.activity.result.c<Intent> H0;
    public lp.a I;
    public final boolean I0;
    public ml.c0 J0;
    public ap.h K0;
    public String L0;
    public rp.v M0;
    public Timer N0;
    public boolean O0;
    public boolean P0;
    public final boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U;
    public int U0;
    public final String V0;
    public ym.c W;
    public boolean W0;
    public final boolean X0;
    public int Y;
    public km.d Y0;
    public hs.f<Boolean, Boolean> Z;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10715a0;

    /* renamed from: a1  reason: collision with root package name */
    public final hs.i f10716a1;

    /* renamed from: b0  reason: collision with root package name */
    public CourseDayModelV1 f10717b0;
    public a1 b1;
    public boolean c0;

    /* renamed from: c1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10718c1;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10719d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f10720d1;
    public final ArrayList<CustomCoachMark> e0;

    /* renamed from: e1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10721e1;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f10722f0;

    /* renamed from: f1  reason: collision with root package name */
    public final b f10723f1;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f10724g0;
    public final a g1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10725h0;

    /* renamed from: h1  reason: collision with root package name */
    public final h f10726h1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10727i0;

    /* renamed from: i1  reason: collision with root package name */
    public final dl.f0 f10728i1;

    /* renamed from: j0  reason: collision with root package name */
    public Dialog f10729j0;

    /* renamed from: j1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10730j1;

    /* renamed from: k0  reason: collision with root package name */
    public int f10731k0;

    /* renamed from: k1  reason: collision with root package name */
    public final dl.f0 f10732k1;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f10733l0;

    /* renamed from: l1  reason: collision with root package name */
    public Dialog f10734l1;

    /* renamed from: m0  reason: collision with root package name */
    public final HashMap<String, hs.f<String, String>> f10735m0;

    /* renamed from: m1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10736m1;

    /* renamed from: n0  reason: collision with root package name */
    public AnimatorSet f10737n0;

    /* renamed from: n1  reason: collision with root package name */
    public Boolean f10738n1;

    /* renamed from: o0  reason: collision with root package name */
    public ml.p f10739o0;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f10740o1;

    /* renamed from: p0  reason: collision with root package name */
    public final Boolean[] f10741p0;

    /* renamed from: p1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10742p1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f10743q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f10744r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f10745s0;

    /* renamed from: t0  reason: collision with root package name */
    public Boolean f10746t0;

    /* renamed from: u0  reason: collision with root package name */
    public final long f10747u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f10749v0;

    /* renamed from: w  reason: collision with root package name */
    public ProgressDialog f10750w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f10751w0;

    /* renamed from: x  reason: collision with root package name */
    public Course f10752x;

    /* renamed from: x0  reason: collision with root package name */
    public final yn.a f10753x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f10755y0;

    /* renamed from: z0  reason: collision with root package name */
    public final boolean f10757z0;
    public final LinkedHashMap q1 = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10748v = LogHelper.INSTANCE.makeLogTag(V3DashboardActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public int f10754y = 1;

    /* renamed from: z  reason: collision with root package name */
    public int f10756z = 1;
    public final V3DashboardUtils B = new V3DashboardUtils();
    public final FeedBackUtils H = new FeedBackUtils();
    public final int J = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    public final int K = 12322;
    public final int L = 100;
    public final int M = 5555;
    public final int N = 1248;
    public final int O = 2456;
    public final int P = 4924;
    public final int Q = 1001;
    public final int R = 5648;
    public final int S = 6161;
    public final int T = 246;
    public ArrayList<LearningHubModel> V = new ArrayList<>();
    public final hs.i X = sp.b.O(new k0());

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z10;
            kotlin.jvm.internal.i.d(intent);
            Bundle extras = intent.getExtras();
            kotlin.jvm.internal.i.e(extras, "null cannot be cast to non-null type android.os.Bundle");
            if (is.k.Q1(Integer.valueOf(extras.getInt("asset_download_status")), new Integer[]{100, Integer.valueOf((int) R.styleable.AppCompatTheme_switchStyle)})) {
                int i6 = V3DashboardActivity.f10714r1;
                V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
                v3DashboardActivity.getClass();
                ArrayList<OfflineAsset> courseAssets = ApplicationPersistence.getInstance().getCourseAssets();
                kotlin.jvm.internal.i.f(courseAssets, "getInstance().courseAssets");
                if (!courseAssets.isEmpty()) {
                    ArrayList<OfflineAsset> courseAssets2 = ApplicationPersistence.getInstance().getCourseAssets();
                    kotlin.jvm.internal.i.f(courseAssets2, "getInstance().courseAssets");
                    if (!courseAssets2.isEmpty()) {
                        for (OfflineAsset offlineAsset : courseAssets2) {
                            if (!offlineAsset.isDownloaded()) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10 && CourseUtilKt.checkOfflineAssets("")) {
                        LogHelper.INSTANCE.i(v3DashboardActivity.f10748v, "initilising offline download");
                        n1.a.a(v3DashboardActivity).b(v3DashboardActivity.f10726h1, new IntentFilter(DownloadUtil.DOWNLOAD_SERVICE_BROADCAST));
                        MyApplication.V.a().g();
                    }
                }
            }
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a0 extends kotlin.jvm.internal.k implements ss.l<ArrayList<RecommendedActivityModel>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3DashboardActivity f10759u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ap.h hVar, V3DashboardActivity v3DashboardActivity) {
            super(1);
            this.f10759u = v3DashboardActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x003e, B:10:0x0052, B:17:0x0061, B:19:0x0092, B:21:0x0098, B:25:0x00b0, B:27:0x00c3, B:31:0x0111, B:28:0x00ee, B:30:0x00f4, B:18:0x006f), top: B:41:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x003e, B:10:0x0052, B:17:0x0061, B:19:0x0092, B:21:0x0098, B:25:0x00b0, B:27:0x00c3, B:31:0x0111, B:28:0x00ee, B:30:0x00f4, B:18:0x006f), top: B:41:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x003e, B:10:0x0052, B:17:0x0061, B:19:0x0092, B:21:0x0098, B:25:0x00b0, B:27:0x00c3, B:31:0x0111, B:28:0x00ee, B:30:0x00f4, B:18:0x006f), top: B:41:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x003e, B:10:0x0052, B:17:0x0061, B:19:0x0092, B:21:0x0098, B:25:0x00b0, B:27:0x00c3, B:31:0x0111, B:28:0x00ee, B:30:0x00f4, B:18:0x006f), top: B:41:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:8:0x003e, B:10:0x0052, B:17:0x0061, B:19:0x0092, B:21:0x0098, B:25:0x00b0, B:27:0x00c3, B:31:0x0111, B:28:0x00ee, B:30:0x00f4, B:18:0x006f), top: B:41:0x003e }] */
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
            V3DashboardActivity v3DashboardActivity = this.f10759u;
            if (arrayList2 != null) {
                for (RecommendedActivityModel model : arrayList2) {
                    View row = v3DashboardActivity.getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_recommended_activities_dashboard_experiment, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)), false);
                    kotlin.jvm.internal.i.f(row, "row");
                    V3DashboardUtils v3DashboardUtils = v3DashboardActivity.B;
                    v3DashboardUtils.getClass();
                    kotlin.jvm.internal.i.g(model, "model");
                    try {
                        ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvTitleCard)).setText(model.getTitle());
                        duration = model.getDuration();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(v3DashboardUtils.f10899a, "exception", e10);
                    }
                    if (duration != null && duration.length() != 0) {
                        z10 = false;
                        if (!z10) {
                            ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvActivityType)).setText(model.getTemplateTypeText());
                        } else {
                            ((RobertoTextView) row.findViewById(com.theinnerhour.b2b.R.id.tvActivityType)).setText(v3DashboardUtils.f().getString(com.theinnerhour.b2b.R.string.dbRaExperimentSubHeader, model.getTemplateTypeText(), model.getDuration()));
                        }
                        thumbUrl = model.getThumbUrl();
                        if (thumbUrl == null) {
                            str = (String) is.u.p2(gv.r.a1(thumbUrl, new String[]{"/"}, 0, 6));
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String[] fileList = v3DashboardUtils.f().fileList();
                            kotlin.jvm.internal.i.f(fileList, "activity.fileList()");
                            if (is.k.Q1(str, fileList)) {
                                Glide.g(v3DashboardUtils.f().getApplicationContext()).d(new File(v3DashboardUtils.f().getApplicationContext().getFilesDir(), str)).B((AppCompatImageView) row.findViewById(com.theinnerhour.b2b.R.id.ivTitleCard));
                                row.setOnClickListener(new j1(v3DashboardUtils, 23, model));
                                ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
                            }
                        }
                        if (model.getThumbUrl() != null) {
                            Glide.g(v3DashboardUtils.f().getApplicationContext()).p(model.getThumbUrl()).B((AppCompatImageView) row.findViewById(com.theinnerhour.b2b.R.id.ivTitleCard));
                        }
                        row.setOnClickListener(new j1(v3DashboardUtils, 23, model));
                        ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
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
                    row.setOnClickListener(new j1(v3DashboardUtils, 23, model));
                    ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llRAExperiment)).addView(row);
                }
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                Toast.makeText(v3DashboardActivity, "Error in fetching tools to unwind.", 0).show();
            }
            ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.dbRAExperimentViewAllCTA)).setOnClickListener(new dl.j0(v3DashboardActivity, 19));
            v3DashboardActivity.F1(false);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
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
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.getClass();
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
                            h1 h1Var = v3DashboardActivity.E;
                            if (h1Var != null && h1Var.w(string)) {
                                h1 h1Var2 = v3DashboardActivity.E;
                                if (h1Var2 != null) {
                                    String str2 = next.getMetaInfo().get(1);
                                    kotlin.jvm.internal.i.f(str2, "asset.metaInfo[1]");
                                    h1Var2.v(string, str2);
                                    h1 h1Var3 = v3DashboardActivity.E;
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
                    LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
                }
            }
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b0 implements ValueEventListener {
        public b0() {
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            Extensions extensions = Extensions.INSTANCE;
            CardView cvPro = (CardView) V3DashboardActivity.this.n0(com.theinnerhour.b2b.R.id.cvPro);
            kotlin.jvm.internal.i.f(cvPro, "cvPro");
            extensions.gone(cvPro);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [com.theinnerhour.b2b.components.chat.model.ChatMessage, T] */
        /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.Object] */
        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            boolean exists = p02.exists();
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            if (exists && p02.hasChildren()) {
                long j10 = 1000;
                long timeInMillis = Calendar.getInstance().getTimeInMillis() / j10;
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
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
                    ProCard proCardForDate = new UiUtils().getProCardForDate(timeInMillis, v3DashboardActivity);
                    if (!kotlin.jvm.internal.i.b(proCardForDate.getTitle(), "")) {
                        Extensions extensions = Extensions.INSTANCE;
                        CardView cvPro = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                        kotlin.jvm.internal.i.f(cvPro, "cvPro");
                        extensions.visible(cvPro);
                        ((CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro)).setOnClickListener(new j1(v3DashboardActivity, 14, xVar));
                        ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardTitle)).setText(proCardForDate.getTitle());
                        ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardSubtitle)).setText(proCardForDate.getSubtitle());
                        ((AppCompatImageView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.ivProCard)).setImageResource(proCardForDate.getIllustration());
                        ((ConstraintLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.clPro)).setBackgroundColor(g0.a.b(v3DashboardActivity, proCardForDate.getBackgroundColor()));
                        ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardTitle)).setTextColor(g0.a.b(v3DashboardActivity, proCardForDate.getTextColor()));
                        ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvProCardSubtitle)).setTextColor(g0.a.b(v3DashboardActivity, proCardForDate.getTextColor()));
                        return;
                    }
                    Extensions extensions2 = Extensions.INSTANCE;
                    CardView cvPro2 = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                    kotlin.jvm.internal.i.f(cvPro2, "cvPro");
                    extensions2.gone(cvPro2);
                    return;
                }
                Extensions extensions3 = Extensions.INSTANCE;
                CardView cvPro3 = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
                kotlin.jvm.internal.i.f(cvPro3, "cvPro");
                extensions3.gone(cvPro3);
                return;
            }
            Extensions extensions4 = Extensions.INSTANCE;
            CardView cvPro4 = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvPro);
            kotlin.jvm.internal.i.f(cvPro4, "cvPro");
            extensions4.gone(cvPro4);
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel>, hs.k> {
        public c0() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar) {
            Integer num;
            Integer num2;
            String stringValue;
            TherapistPackagesModel therapistPackagesModel;
            String stringValue2;
            Integer num3;
            TherapistPackagesModel therapistPackagesModel2;
            hs.f<? extends TherapistPackagesModel, ? extends TherapistPackagesModel> fVar2 = fVar;
            Integer num4 = null;
            if (fVar2 != null && (therapistPackagesModel2 = (TherapistPackagesModel) fVar2.f19464u) != null) {
                num = Integer.valueOf(therapistPackagesModel2.getId());
            } else {
                num = null;
            }
            if (num != null && ((stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST)) == null || kotlin.jvm.internal.i.b(stringValue2, "null") || kotlin.jvm.internal.i.b(stringValue2, ""))) {
                SessionManager sessionManager = SessionManager.getInstance();
                TherapistPackagesModel therapistPackagesModel3 = (TherapistPackagesModel) fVar2.f19464u;
                if (therapistPackagesModel3 != null) {
                    num3 = Integer.valueOf(therapistPackagesModel3.getId());
                } else {
                    num3 = null;
                }
                sessionManager.setStringValue(SessionManager.KEY_MYTHERAPIST, String.valueOf(num3));
            }
            if (fVar2 != null && (therapistPackagesModel = (TherapistPackagesModel) fVar2.f19465v) != null) {
                num2 = Integer.valueOf(therapistPackagesModel.getId());
            } else {
                num2 = null;
            }
            if (num2 != null && ((stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST)) == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, ""))) {
                SessionManager sessionManager2 = SessionManager.getInstance();
                TherapistPackagesModel therapistPackagesModel4 = (TherapistPackagesModel) fVar2.f19465v;
                if (therapistPackagesModel4 != null) {
                    num4 = Integer.valueOf(therapistPackagesModel4.getId());
                }
                sessionManager2.setStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST, String.valueOf(num4));
            }
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.f10741p0[0] = Boolean.TRUE;
            V3DashboardActivity.p0(v3DashboardActivity);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10765a;

        public d(View view) {
            this.f10765a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10765a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10765a.setVisibility(8);
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

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d0 extends kotlin.jvm.internal.k implements ss.l<TherapistPackagesModel, hs.k> {
        public d0() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(TherapistPackagesModel therapistPackagesModel) {
            Integer num;
            String stringValue;
            TherapistPackagesModel therapistPackagesModel2 = therapistPackagesModel;
            if (therapistPackagesModel2 != null) {
                num = Integer.valueOf(therapistPackagesModel2.getId());
            } else {
                num = null;
            }
            if (num != null && ((stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST)) == null || kotlin.jvm.internal.i.b(stringValue, "null") || kotlin.jvm.internal.i.b(stringValue, ""))) {
                SessionManager.getInstance().setStringValue(SessionManager.KEY_MYPSYCHIATRIST, String.valueOf(therapistPackagesModel2.getId()));
            }
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.f10741p0[1] = Boolean.TRUE;
            V3DashboardActivity.p0(v3DashboardActivity);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e0 implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10768a;

        public e0(View view) {
            this.f10768a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10768a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10768a.setVisibility(8);
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

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public f0() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r16v4 */
        /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Object] */
        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            V3DashboardActivity v3DashboardActivity;
            MonetizationViewModel monetizationViewModel;
            ArrayList<CampaignElementModel> arrayList;
            CampaignElementModel campaignElementModel;
            int i6;
            Object obj;
            ?? r16;
            int i10;
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue() && (monetizationViewModel = (v3DashboardActivity = V3DashboardActivity.this).B0) != null) {
                CampaignModel campaignModel = monetizationViewModel.B;
                if (campaignModel != null) {
                    arrayList = campaignModel.getDashboardCard();
                } else {
                    arrayList = null;
                }
                if (arrayList != null && (campaignElementModel = (CampaignElementModel) is.u.j2(0, arrayList)) != null) {
                    int i11 = com.theinnerhour.b2b.R.id.campaignDbCard;
                    FrameLayout frameLayout = (FrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.campaignDbCard);
                    int i12 = 8;
                    if (frameLayout != null) {
                        if (v3DashboardActivity.f10755y0) {
                            i10 = 8;
                        } else {
                            i10 = 0;
                        }
                        frameLayout.setVisibility(i10);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.campaignDbCardExperiment);
                    if (frameLayout2 != null) {
                        if (v3DashboardActivity.f10755y0) {
                            i12 = 0;
                        }
                        frameLayout2.setVisibility(i12);
                    }
                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC1")) {
                            ArrayList k10 = ca.a.k("dbc1_title", "dbc1_title_color", "dbc1_description", "dbc1_description_color", "dbc1_cta", "dbc1_cta_text_color", "dbc1_cta_bg_color", "dbc1_image");
                            x0 x0Var = new x0();
                            Bundle bundle = new Bundle();
                            Iterator<HashMap<String, Object>> it2 = campaignElementModel.getAttributes().iterator();
                            while (it2.hasNext()) {
                                HashMap<String, Object> next = it2.next();
                                Iterator it3 = k10.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        r16 = it3.next();
                                        if (next.containsKey((String) r16)) {
                                            break;
                                        }
                                    } else {
                                        r16 = 0;
                                        break;
                                    }
                                }
                                String str = r16;
                                if (str != null) {
                                    if (gv.r.J0(str, "image")) {
                                        Object obj2 = next.get(str);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                        bundle.putString(str, (String) is.k.a2(new gv.e("/").c((String) obj2).toArray(new String[0])));
                                    } else {
                                        Object obj3 = next.get(str);
                                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                        bundle.putString(str, (String) obj3);
                                    }
                                    k10.remove(str);
                                }
                            }
                            x0Var.setArguments(bundle);
                            androidx.fragment.app.y supportFragmentManager = v3DashboardActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                            if (v3DashboardActivity.f10755y0) {
                                i11 = com.theinnerhour.b2b.R.id.campaignDbCardExperiment;
                            }
                            aVar.f(i11, x0Var, "dynamicDbFrag");
                            aVar.k();
                        } else if (kotlin.jvm.internal.i.b(campaignElementModel.getName(), "DBC2")) {
                            ArrayList k11 = ca.a.k("dbc2_question", "dbc2_question_color", "dbc2_answer1", "dbc2_answer2", "dbc2_answer_text_color", "dbc2_answer_bg_color", "dbc2_question_image", "dbc2_option1_title", "dbc2_option1_description", "dbc2_option1_cta", "dbc2_option2_title", "dbc2_option2_description", "dbc2_option2_cta", "dbc2_option_image", "dbc2_option_cta_text_color", "dbc2_option_cta_bg_color", "dbc2_option_title_color", "dbc2_option_description_color", "dbc2_option0_title", "dbc2_option0_description");
                            z0 z0Var = new z0();
                            Bundle bundle2 = new Bundle();
                            Iterator<HashMap<String, Object>> it4 = campaignElementModel.getAttributes().iterator();
                            while (it4.hasNext()) {
                                HashMap<String, Object> next2 = it4.next();
                                Iterator it5 = k11.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj = it5.next();
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
                                        Object obj4 = next2.get(str2);
                                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                        bundle2.putString(str2, (String) is.k.a2(new gv.e("/").c((String) obj4).toArray(new String[0])));
                                    } else {
                                        Object obj5 = next2.get(str2);
                                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                                        bundle2.putString(str2, (String) obj5);
                                    }
                                    k11.remove(str2);
                                }
                            }
                            z0Var.setArguments(bundle2);
                            androidx.fragment.app.y supportFragmentManager2 = v3DashboardActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                            if (v3DashboardActivity.f10755y0) {
                                i6 = com.theinnerhour.b2b.R.id.campaignDbCardExperiment;
                            } else {
                                i6 = com.theinnerhour.b2b.R.id.campaignDbCard;
                            }
                            aVar2.f(i6, z0Var, "dynamicDbFrag");
                            aVar2.k();
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g implements CustomRetrofitCallback<CourseResetResult> {
        public g() {
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<CourseResetResult> call, Throwable t3) {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            try {
                ProgressDialog progressDialog = v3DashboardActivity.f10750w;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    Extensions extensions = Extensions.INSTANCE;
                    ConstraintLayout retryCl = (ConstraintLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.retryCl);
                    kotlin.jvm.internal.i.f(retryCl, "retryCl");
                    extensions.visible(retryCl);
                    String string = v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.toastRetryErrorDashboard);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorDashboard)");
                    extensions.toast(v3DashboardActivity, string, 1);
                    return;
                }
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<CourseResetResult> call, dw.z<CourseResetResult> response) {
            HashMap<String, Object> appConfig;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            boolean z10 = true;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            if (a10) {
                try {
                    ProgressDialog progressDialog = v3DashboardActivity.f10750w;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user == null || (appConfig = user.getAppConfig()) == null || !appConfig.containsKey(Constants.ONBOARDING_EXPERIMENT)) {
                            z10 = false;
                        }
                        if (z10) {
                            if (kotlin.jvm.internal.i.b((String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT), "a")) {
                                V3DashboardActivity.s0(v3DashboardActivity);
                                return;
                            } else {
                                V3DashboardActivity.r0(v3DashboardActivity);
                                return;
                            }
                        }
                        V3DashboardActivity.s0(v3DashboardActivity);
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
                    return;
                }
            }
            try {
                ProgressDialog progressDialog2 = v3DashboardActivity.f10750w;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                    Extensions extensions = Extensions.INSTANCE;
                    ConstraintLayout retryCl = (ConstraintLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.retryCl);
                    kotlin.jvm.internal.i.f(retryCl, "retryCl");
                    extensions.visible(retryCl);
                    String string = v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.toastRetryErrorDashboard);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorDashboard)");
                    extensions.toast(v3DashboardActivity, string, 1);
                    return;
                }
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e11);
            }
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g0 implements LocationInterface {
        public g0() {
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity.this.C1();
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity.this.C1();
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            int intExtra = intent.getIntExtra(DownloadUtil.DOWNLOAD_STATUS, 1);
            LogHelper logHelper = LogHelper.INSTANCE;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            logHelper.i(v3DashboardActivity.f10748v, defpackage.c.p("broadcast call back ", intExtra));
            if (intExtra == 100) {
                n1.a.a(v3DashboardActivity).d(this);
                v3DashboardActivity.r1();
            }
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i6 = V3DashboardActivity.f10714r1;
                V3DashboardActivity.this.J0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f10776u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f10776u = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            bool.booleanValue();
            com.google.android.material.bottomsheet.f fVar = this.f10776u.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j0 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public j0() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
            if (r0 > 0) goto L13;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Boolean bool) {
            boolean z10;
            boolean z11;
            androidx.lifecycle.w<TherapistPackagesModel> wVar;
            androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar2;
            HashMap<String, Object> appConfig;
            V3DashboardActivity v3DashboardActivity;
            String str;
            View childAt;
            View findViewById;
            String str2;
            Object obj;
            float f;
            HashMap<String, Object> appConfig2;
            int i6;
            androidx.lifecycle.w<ArrayList<String>> wVar3;
            ArrayList<String> d10;
            boolean booleanValue = bool.booleanValue();
            final V3DashboardActivity v3DashboardActivity2 = V3DashboardActivity.this;
            if (booleanValue) {
                if (v3DashboardActivity2.X0) {
                    km.d dVar = v3DashboardActivity2.Y0;
                    if (dVar != null && (wVar3 = dVar.A) != null && (d10 = wVar3.d()) != null) {
                        i6 = d10.size();
                    } else {
                        i6 = 0;
                    }
                }
                if (v3DashboardActivity2.f10757z0 && LocationPersistence.INSTANCE.isIndianUser()) {
                    LinearLayout linearLayout = (LinearLayout) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment);
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    View n02 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperimentFooter);
                    if (n02 != null) {
                        n02.setVisibility(0);
                    }
                    if (!v3DashboardActivity2.f10720d1) {
                        v3DashboardActivity2.f10720d1 = true;
                        View inflate = v3DashboardActivity2.getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.dashboard_provider_entry_layout_variant_2, (ViewGroup) v3DashboardActivity2.findViewById(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment), false);
                        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvProviderEntryVar2CardRecycler);
                        if (recyclerView != null) {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                                obj = appConfig2.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                            } else {
                                obj = null;
                            }
                            boolean b10 = true ^ kotlin.jvm.internal.i.b(obj, "e");
                            if (b10) {
                                f = 0.2f;
                            } else {
                                f = 0.0f;
                            }
                            v3DashboardActivity = v3DashboardActivity2;
                            recyclerView.setLayoutManager(new CenterZoomLayoutManager(v3DashboardActivity2, 0, false, f, 1.5f, null, 32, null));
                            recyclerView.setAdapter(new qp.a(b10));
                            new androidx.recyclerview.widget.r().a(recyclerView);
                            recyclerView.post(new ne.u(recyclerView, 21, v3DashboardActivity));
                        } else {
                            v3DashboardActivity = v3DashboardActivity2;
                        }
                        ((LinearLayout) v3DashboardActivity.findViewById(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment)).addView(inflate, 0);
                    } else {
                        v3DashboardActivity = v3DashboardActivity2;
                    }
                    rp.v vVar = v3DashboardActivity.M0;
                    if (vVar != null) {
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str2 = user2.getCurrentCourseName();
                        } else {
                            str2 = null;
                        }
                        vVar.e(str2);
                    } else {
                        rp.v vVar2 = (rp.v) new o0(v3DashboardActivity, new rp.w(new rp.s())).a(rp.v.class);
                        vVar2.f30910y.e(v3DashboardActivity, new dl.h0(4, new e2(v3DashboardActivity)));
                        User user3 = FirebasePersistence.getInstance().getUser();
                        if (user3 != null) {
                            str = user3.getCurrentCourseName();
                        } else {
                            str = null;
                        }
                        vVar2.e(str);
                        v3DashboardActivity.M0 = vVar2;
                        LinearLayout linearLayout2 = (LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(0)) != null && (findViewById = childAt.findViewById(com.theinnerhour.b2b.R.id.tvProviderEntryVar2CardCTA)) != null) {
                            findViewById.setOnClickListener(new dl.e0(v3DashboardActivity, 23));
                        }
                    }
                    v3DashboardActivity.s1();
                }
            } else {
                LinearLayout linearLayout3 = (LinearLayout) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment);
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                View n03 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperimentFooter);
                if (n03 != null) {
                    n03.setVisibility(8);
                }
                v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.viewLeftMenuBG).setVisibility(8);
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null && (appConfig = user4.getAppConfig()) != null) {
                    z11 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP), Boolean.TRUE);
                } else {
                    z11 = false;
                }
                if (z11 && LocationPersistence.INSTANCE.isIndianUser() && z10) {
                    if (!v3DashboardActivity2.f10749v0) {
                        v3DashboardActivity2.f10749v0 = true;
                        ml.p pVar = v3DashboardActivity2.f10739o0;
                        if (pVar != null && (wVar2 = pVar.A) != null) {
                            wVar2.k(v3DashboardActivity2);
                        }
                        ml.p pVar2 = v3DashboardActivity2.f10739o0;
                        if (pVar2 != null && (wVar = pVar2.B) != null) {
                            wVar.k(v3DashboardActivity2);
                        }
                        v3DashboardActivity2.f10739o0 = null;
                    }
                    ml.p pVar3 = v3DashboardActivity2.f10739o0;
                    if (pVar3 != null) {
                        Boolean bool2 = Boolean.FALSE;
                        Boolean[] boolArr = v3DashboardActivity2.f10741p0;
                        boolArr[0] = bool2;
                        boolArr[1] = bool2;
                        ta.v.H(kc.f.H(pVar3), null, 0, new ml.g(pVar3, null), 3);
                    } else {
                        View n04 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedEntry);
                        if (n04 != null) {
                            n04.setVisibility(0);
                        }
                        ((ShimmerFrameLayout) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderImage)).b();
                        ((ShimmerFrameLayout) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderTitle)).b();
                        ((ShimmerFrameLayout) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderName)).b();
                        ml.p pVar4 = (ml.p) new o0(v3DashboardActivity2, new ml.q(new rp.a(0), MyApplication.V.a(), 0)).a(ml.p.class);
                        pVar4.A.e(v3DashboardActivity2, new dl.h0(0, new n0(v3DashboardActivity2, v3DashboardActivity2)));
                        pVar4.B.e(v3DashboardActivity2, new dl.h0(1, new dl.o0(v3DashboardActivity2, v3DashboardActivity2)));
                        pVar4.C.e(v3DashboardActivity2, new dl.h0(2, new p0(v3DashboardActivity2, pVar4)));
                        pVar4.S.e(v3DashboardActivity2, new dl.h0(3, new q0(v3DashboardActivity2, pVar4)));
                        ta.v.H(kc.f.H(pVar4), null, 0, new ml.g(pVar4, null), 3);
                        v3DashboardActivity2.f10739o0 = pVar4;
                        View n05 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.viewDashboardProviderAssignedTherapistBlanket);
                        if (n05 != null) {
                            n05.setOnClickListener(new View.OnClickListener() { // from class: dl.i0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    TherapistPackagesModel therapistPackagesModel;
                                    boolean z12;
                                    TherapistPackagesModel therapistPackagesModel2;
                                    boolean z13;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar4;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
                                    androidx.lifecycle.w<TherapistPackagesModel> wVar5;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar6;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d12;
                                    int i10 = r3;
                                    V3DashboardActivity this$0 = v3DashboardActivity2;
                                    V3DashboardActivity this_run = v3DashboardActivity2;
                                    boolean z14 = true;
                                    switch (i10) {
                                        case 0:
                                            int i11 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY), this_run.P);
                                            String str3 = gk.a.f16573a;
                                            Bundle f2 = defpackage.e.f("flow", "therapy", "source", "home");
                                            f2.putBoolean("assigned", true);
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_flow_select");
                                            return;
                                        case 1:
                                            int i12 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY), this_run.P);
                                            String str4 = gk.a.f16573a;
                                            Bundle f10 = defpackage.e.f("flow", "psychiatry", "source", "home");
                                            f10.putBoolean("assigned", true);
                                            hs.k kVar2 = hs.k.f19476a;
                                            gk.a.b(f10, "therapy_psychiatry_flow_select");
                                            return;
                                        case 2:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES), this_run.P);
                                            String str5 = gk.a.f16573a;
                                            Bundle f11 = defpackage.e.f("flow", "couples", "source", "home");
                                            f11.putBoolean("assigned", true);
                                            hs.k kVar3 = hs.k.f19476a;
                                            gk.a.b(f11, "therapy_psychiatry_flow_select");
                                            return;
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), this_run.P);
                                            String str6 = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            ml.p pVar5 = this_run.f10739o0;
                                            TherapistPackagesModel therapistPackagesModel3 = null;
                                            if (pVar5 != null && (wVar6 = pVar5.A) != null && (d12 = wVar6.d()) != null) {
                                                therapistPackagesModel = d12.f19464u;
                                            } else {
                                                therapistPackagesModel = null;
                                            }
                                            if (therapistPackagesModel != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            bundle.putBoolean("therapist_exist", z12);
                                            ml.p pVar6 = this_run.f10739o0;
                                            if (pVar6 != null && (wVar5 = pVar6.B) != null) {
                                                therapistPackagesModel2 = wVar5.d();
                                            } else {
                                                therapistPackagesModel2 = null;
                                            }
                                            if (therapistPackagesModel2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            bundle.putBoolean("psychiatrist_exist", z13);
                                            ml.p pVar7 = this_run.f10739o0;
                                            if (pVar7 != null && (wVar4 = pVar7.A) != null && (d11 = wVar4.d()) != null) {
                                                therapistPackagesModel3 = d11.f19465v;
                                            }
                                            if (therapistPackagesModel3 == null) {
                                                z14 = false;
                                            }
                                            bundle.putBoolean("couples_therapist_exist", z14);
                                            hs.k kVar4 = hs.k.f19476a;
                                            gk.a.b(bundle, "therapy_psychiatry_see_all_click");
                                            return;
                                    }
                                }
                            });
                        }
                        View n06 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.viewDashboardProviderAssignedPsychiatristBlanket);
                        if (n06 != null) {
                            n06.setOnClickListener(new View.OnClickListener() { // from class: dl.i0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    TherapistPackagesModel therapistPackagesModel;
                                    boolean z12;
                                    TherapistPackagesModel therapistPackagesModel2;
                                    boolean z13;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar4;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
                                    androidx.lifecycle.w<TherapistPackagesModel> wVar5;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar6;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d12;
                                    int i10 = r3;
                                    V3DashboardActivity this$0 = v3DashboardActivity2;
                                    V3DashboardActivity this_run = v3DashboardActivity2;
                                    boolean z14 = true;
                                    switch (i10) {
                                        case 0:
                                            int i11 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY), this_run.P);
                                            String str3 = gk.a.f16573a;
                                            Bundle f2 = defpackage.e.f("flow", "therapy", "source", "home");
                                            f2.putBoolean("assigned", true);
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_flow_select");
                                            return;
                                        case 1:
                                            int i12 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY), this_run.P);
                                            String str4 = gk.a.f16573a;
                                            Bundle f10 = defpackage.e.f("flow", "psychiatry", "source", "home");
                                            f10.putBoolean("assigned", true);
                                            hs.k kVar2 = hs.k.f19476a;
                                            gk.a.b(f10, "therapy_psychiatry_flow_select");
                                            return;
                                        case 2:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES), this_run.P);
                                            String str5 = gk.a.f16573a;
                                            Bundle f11 = defpackage.e.f("flow", "couples", "source", "home");
                                            f11.putBoolean("assigned", true);
                                            hs.k kVar3 = hs.k.f19476a;
                                            gk.a.b(f11, "therapy_psychiatry_flow_select");
                                            return;
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), this_run.P);
                                            String str6 = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            ml.p pVar5 = this_run.f10739o0;
                                            TherapistPackagesModel therapistPackagesModel3 = null;
                                            if (pVar5 != null && (wVar6 = pVar5.A) != null && (d12 = wVar6.d()) != null) {
                                                therapistPackagesModel = d12.f19464u;
                                            } else {
                                                therapistPackagesModel = null;
                                            }
                                            if (therapistPackagesModel != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            bundle.putBoolean("therapist_exist", z12);
                                            ml.p pVar6 = this_run.f10739o0;
                                            if (pVar6 != null && (wVar5 = pVar6.B) != null) {
                                                therapistPackagesModel2 = wVar5.d();
                                            } else {
                                                therapistPackagesModel2 = null;
                                            }
                                            if (therapistPackagesModel2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            bundle.putBoolean("psychiatrist_exist", z13);
                                            ml.p pVar7 = this_run.f10739o0;
                                            if (pVar7 != null && (wVar4 = pVar7.A) != null && (d11 = wVar4.d()) != null) {
                                                therapistPackagesModel3 = d11.f19465v;
                                            }
                                            if (therapistPackagesModel3 == null) {
                                                z14 = false;
                                            }
                                            bundle.putBoolean("couples_therapist_exist", z14);
                                            hs.k kVar4 = hs.k.f19476a;
                                            gk.a.b(bundle, "therapy_psychiatry_see_all_click");
                                            return;
                                    }
                                }
                            });
                        }
                        View n07 = v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.viewDashboardProviderAssignedCouplesTherapistBlanket);
                        if (n07 != null) {
                            n07.setOnClickListener(new View.OnClickListener() { // from class: dl.i0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    TherapistPackagesModel therapistPackagesModel;
                                    boolean z12;
                                    TherapistPackagesModel therapistPackagesModel2;
                                    boolean z13;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar4;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
                                    androidx.lifecycle.w<TherapistPackagesModel> wVar5;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar6;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d12;
                                    int i10 = r3;
                                    V3DashboardActivity this$0 = v3DashboardActivity2;
                                    V3DashboardActivity this_run = v3DashboardActivity2;
                                    boolean z14 = true;
                                    switch (i10) {
                                        case 0:
                                            int i11 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY), this_run.P);
                                            String str3 = gk.a.f16573a;
                                            Bundle f2 = defpackage.e.f("flow", "therapy", "source", "home");
                                            f2.putBoolean("assigned", true);
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_flow_select");
                                            return;
                                        case 1:
                                            int i12 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY), this_run.P);
                                            String str4 = gk.a.f16573a;
                                            Bundle f10 = defpackage.e.f("flow", "psychiatry", "source", "home");
                                            f10.putBoolean("assigned", true);
                                            hs.k kVar2 = hs.k.f19476a;
                                            gk.a.b(f10, "therapy_psychiatry_flow_select");
                                            return;
                                        case 2:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES), this_run.P);
                                            String str5 = gk.a.f16573a;
                                            Bundle f11 = defpackage.e.f("flow", "couples", "source", "home");
                                            f11.putBoolean("assigned", true);
                                            hs.k kVar3 = hs.k.f19476a;
                                            gk.a.b(f11, "therapy_psychiatry_flow_select");
                                            return;
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), this_run.P);
                                            String str6 = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            ml.p pVar5 = this_run.f10739o0;
                                            TherapistPackagesModel therapistPackagesModel3 = null;
                                            if (pVar5 != null && (wVar6 = pVar5.A) != null && (d12 = wVar6.d()) != null) {
                                                therapistPackagesModel = d12.f19464u;
                                            } else {
                                                therapistPackagesModel = null;
                                            }
                                            if (therapistPackagesModel != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            bundle.putBoolean("therapist_exist", z12);
                                            ml.p pVar6 = this_run.f10739o0;
                                            if (pVar6 != null && (wVar5 = pVar6.B) != null) {
                                                therapistPackagesModel2 = wVar5.d();
                                            } else {
                                                therapistPackagesModel2 = null;
                                            }
                                            if (therapistPackagesModel2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            bundle.putBoolean("psychiatrist_exist", z13);
                                            ml.p pVar7 = this_run.f10739o0;
                                            if (pVar7 != null && (wVar4 = pVar7.A) != null && (d11 = wVar4.d()) != null) {
                                                therapistPackagesModel3 = d11.f19465v;
                                            }
                                            if (therapistPackagesModel3 == null) {
                                                z14 = false;
                                            }
                                            bundle.putBoolean("couples_therapist_exist", z14);
                                            hs.k kVar4 = hs.k.f19476a;
                                            gk.a.b(bundle, "therapy_psychiatry_see_all_click");
                                            return;
                                    }
                                }
                            });
                        }
                        RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity2.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedSeeAll);
                        if (robertoTextView != null) {
                            robertoTextView.setOnClickListener(new View.OnClickListener() { // from class: dl.i0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    TherapistPackagesModel therapistPackagesModel;
                                    boolean z12;
                                    TherapistPackagesModel therapistPackagesModel2;
                                    boolean z13;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar4;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
                                    androidx.lifecycle.w<TherapistPackagesModel> wVar5;
                                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar6;
                                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d12;
                                    int i10 = r3;
                                    V3DashboardActivity this$0 = v3DashboardActivity2;
                                    V3DashboardActivity this_run = v3DashboardActivity2;
                                    boolean z14 = true;
                                    switch (i10) {
                                        case 0:
                                            int i11 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY), this_run.P);
                                            String str3 = gk.a.f16573a;
                                            Bundle f2 = defpackage.e.f("flow", "therapy", "source", "home");
                                            f2.putBoolean("assigned", true);
                                            hs.k kVar = hs.k.f19476a;
                                            gk.a.b(f2, "therapy_psychiatry_flow_select");
                                            return;
                                        case 1:
                                            int i12 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY), this_run.P);
                                            String str4 = gk.a.f16573a;
                                            Bundle f10 = defpackage.e.f("flow", "psychiatry", "source", "home");
                                            f10.putBoolean("assigned", true);
                                            hs.k kVar2 = hs.k.f19476a;
                                            gk.a.b(f10, "therapy_psychiatry_flow_select");
                                            return;
                                        case 2:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES), this_run.P);
                                            String str5 = gk.a.f16573a;
                                            Bundle f11 = defpackage.e.f("flow", "couples", "source", "home");
                                            f11.putBoolean("assigned", true);
                                            hs.k kVar3 = hs.k.f19476a;
                                            gk.a.b(f11, "therapy_psychiatry_flow_select");
                                            return;
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this_run.startActivityForResult(new Intent(this$0, TelecommunicationsPWAActivity.class), this_run.P);
                                            String str6 = gk.a.f16573a;
                                            Bundle bundle = new Bundle();
                                            ml.p pVar5 = this_run.f10739o0;
                                            TherapistPackagesModel therapistPackagesModel3 = null;
                                            if (pVar5 != null && (wVar6 = pVar5.A) != null && (d12 = wVar6.d()) != null) {
                                                therapistPackagesModel = d12.f19464u;
                                            } else {
                                                therapistPackagesModel = null;
                                            }
                                            if (therapistPackagesModel != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            bundle.putBoolean("therapist_exist", z12);
                                            ml.p pVar6 = this_run.f10739o0;
                                            if (pVar6 != null && (wVar5 = pVar6.B) != null) {
                                                therapistPackagesModel2 = wVar5.d();
                                            } else {
                                                therapistPackagesModel2 = null;
                                            }
                                            if (therapistPackagesModel2 != null) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            bundle.putBoolean("psychiatrist_exist", z13);
                                            ml.p pVar7 = this_run.f10739o0;
                                            if (pVar7 != null && (wVar4 = pVar7.A) != null && (d11 = wVar4.d()) != null) {
                                                therapistPackagesModel3 = d11.f19465v;
                                            }
                                            if (therapistPackagesModel3 == null) {
                                                z14 = false;
                                            }
                                            bundle.putBoolean("couples_therapist_exist", z14);
                                            hs.k kVar4 = hs.k.f19476a;
                                            gk.a.b(bundle, "therapy_psychiatry_see_all_click");
                                            return;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<jm.c> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final jm.c invoke() {
            return new jm.c(V3DashboardActivity.this);
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k0 extends kotlin.jvm.internal.k implements ss.a<xn.a> {
        public k0() {
            super(0);
        }

        @Override // ss.a
        public final xn.a invoke() {
            return (xn.a) new o0(V3DashboardActivity.this).a(xn.a.class);
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l implements LocationInterface {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f10782b;

        public l(boolean z10) {
            this.f10782b = z10;
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.z1(true);
            if (this.f10782b) {
                v3DashboardActivity.x1();
            }
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.D = true;
            v3DashboardActivity.z1(true);
            if (this.f10782b) {
                v3DashboardActivity.x1();
            }
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ xn.a f10784v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(xn.a aVar) {
            super(1);
            this.f10784v = aVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                boolean booleanValue = contentIfNotHandled.booleanValue();
                V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
                if (booleanValue) {
                    gk.a.b(null, "moodtracker_data_backup_done");
                    int i6 = V3DashboardActivity.f10714r1;
                    v3DashboardActivity.G1(true);
                    gk.a.b(null, "new_moodtracker_assigned");
                } else {
                    int i10 = v3DashboardActivity.Y;
                    if (i10 < 3) {
                        v3DashboardActivity.Y = i10 + 1;
                        this.f10784v.e();
                        gk.a.b(null, "moodtracker_data_backup_retry");
                    } else {
                        gk.a.b(null, "moodtracker_data_backup_fail");
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.l<ArrayList<LearningHubModel>, hs.k> {
        public n() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<LearningHubModel> arrayList) {
            ArrayList<LearningHubModel> arrayList2 = arrayList;
            int size = arrayList2.size();
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            if (size > 0) {
                v3DashboardActivity.getClass();
                v3DashboardActivity.V = arrayList2;
                if (kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default")) {
                    if (v3DashboardActivity.I0) {
                        v3DashboardActivity.m1();
                    } else {
                        v3DashboardActivity.l1();
                    }
                }
                v3DashboardActivity.f10743q0 = true;
                if (v3DashboardActivity.f10744r0) {
                    v3DashboardActivity.c1(null);
                }
            } else {
                v3DashboardActivity.E1(true);
            }
            if (v3DashboardActivity.J0 != null && v3DashboardActivity.P0().c0 == null) {
                ml.c0 P0 = v3DashboardActivity.P0();
                ta.v.H(kc.f.H(P0), null, 0, new s0(P0, arrayList2, null), 3);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.p<CourseDayModelV1, Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ V3DashboardActivity f10787v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(V3DashboardActivity v3DashboardActivity) {
            super(2);
            this.f10787v = v3DashboardActivity;
        }

        @Override // ss.p
        public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Boolean bool) {
            boolean z10;
            boolean z11;
            String str;
            CourseDayModelV1 model = courseDayModelV1;
            boolean booleanValue = bool.booleanValue();
            kotlin.jvm.internal.i.g(model, "model");
            V3DashboardActivity v3DashboardActivity = this.f10787v;
            V3DashboardActivity v3DashboardActivity2 = V3DashboardActivity.this;
            if (booleanValue) {
                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    v3DashboardActivity2.f10721e1.a(new Intent(v3DashboardActivity, SneakPeekForPlanActivity.class).putExtra("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName()).putExtra("planModel", model).putExtra("variant", "multi").putExtra(Constants.DAYMODEL_POSITION, model.getPosition()));
                } else {
                    v3DashboardActivity2.startActivity(new Intent(v3DashboardActivity, MonetizationActivity.class).putExtra("source", "dbMultiCardVariant"));
                }
                z10 = true;
                z11 = true;
            } else {
                if (!booleanValue && (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || model.getStart_date() != 0)) {
                    v3DashboardActivity2.t0(model);
                } else {
                    v3DashboardActivity2.startActivity(new Intent(v3DashboardActivity, MonetizationActivity.class).putExtra("source", "dbMultiCardVariant"));
                }
                z10 = false;
                z11 = false;
            }
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putString("plan_card_variant", "multi");
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            bundle.putString("course", str);
            bundle.putBoolean("subscriptionEnabled", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
            bundle.putInt(Constants.DAYMODEL_POSITION, model.getPosition());
            bundle.putBoolean("future_card_click", z10);
            bundle.putBoolean("sneak_peak_preview", z11);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "my_plan_click");
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class p extends androidx.recyclerview.widget.r {
        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.c0
        public final int[] b(RecyclerView.m layoutManager, View targetView) {
            kotlin.jvm.internal.i.g(layoutManager, "layoutManager");
            kotlin.jvm.internal.i.g(targetView, "targetView");
            int[] iArr = new int[2];
            if (layoutManager.canScrollHorizontally()) {
                new Rect();
                iArr[0] = (layoutManager.getDecoratedLeft(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).leftMargin) - layoutManager.getPaddingLeft();
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.canScrollVertically()) {
                new Rect();
                iArr[1] = (layoutManager.getDecoratedTop(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).topMargin) - layoutManager.getPaddingTop();
            } else {
                iArr[1] = 0;
            }
            return iArr;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.p<Boolean, HashMap<String, String>, hs.k> {
        public q() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, HashMap<String, String> hashMap) {
            RecyclerView.e eVar;
            HashMap<String, String> hashMap2 = hashMap;
            if (bool.booleanValue() && hashMap2 != null) {
                RecyclerView recyclerView = (RecyclerView) V3DashboardActivity.this.n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                el.d dVar = null;
                if (recyclerView != null) {
                    eVar = recyclerView.getAdapter();
                } else {
                    eVar = null;
                }
                if (eVar instanceof el.d) {
                    dVar = (el.d) eVar;
                }
                if (dVar != null) {
                    dVar.H = hashMap2;
                    dVar.i();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends y0>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a1 f10791u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ V3DashboardActivity f10792v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a1 a1Var, V3DashboardActivity v3DashboardActivity) {
            super(1);
            this.f10791u = a1Var;
            this.f10792v = v3DashboardActivity;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends y0> singleUseEvent) {
            y0 contentIfNotHandled;
            boolean z10;
            HashMap<String, Object> appConfig;
            SingleUseEvent<? extends y0> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                boolean K = sp.b.K();
                V3DashboardActivity v3DashboardActivity = this.f10792v;
                if (K && contentIfNotHandled == y0.MIGRATION_SUCCESS) {
                    this.f10791u.l();
                } else {
                    v3DashboardActivity.f10715a0 = true;
                }
                if (kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default")) {
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (appConfig = user.getAppConfig()) != null) {
                        z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.TRUE);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        UtilsKt.fireAnalytics("new_ra_received_by_user", new Bundle());
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class t extends kotlin.jvm.internal.k implements ss.l<y0, hs.k> {
        public t() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(y0 y0Var) {
            boolean z10;
            y0 y0Var2 = y0Var;
            if (y0Var2 != null) {
                if (y0Var2 == y0.MIGRATION_SUCCESS) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                V3DashboardActivity.this.f10715a0 = z10;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public u() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
                if (v3DashboardActivity.Z.f19464u.booleanValue()) {
                    v3DashboardActivity.G1(v3DashboardActivity.Z.f19465v.booleanValue());
                    Boolean bool2 = Boolean.FALSE;
                    v3DashboardActivity.Z = new hs.f<>(bool2, bool2);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.l<wd.b, hs.k> {
        public v() {
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
                V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
                if (contains) {
                    Bundle bundle = new Bundle();
                    for (String str2 : a10.getQueryParameterNames()) {
                        bundle.putString(str2, a10.getQueryParameter(str2));
                    }
                    V3DashboardUtils v3DashboardUtils = v3DashboardActivity.B;
                    v3DashboardUtils.getClass();
                    v3DashboardUtils.f10900b = v3DashboardActivity;
                    v3DashboardActivity.B.k(a10.getQueryParameter(Constants.API_COURSE_LINK), bundle, null);
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
                        int i6 = V3DashboardActivity.f10714r1;
                        v3DashboardActivity.q1();
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class w implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10796a;

        public w(View view) {
            this.f10796a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10796a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            this.f10796a.setVisibility(8);
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

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class x<T> implements Comparator {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList f10797u;

        public x(ArrayList arrayList) {
            this.f10797u = arrayList;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            boolean z10;
            LearningHubModel learningHubModel = (LearningHubModel) t3;
            ArrayList<PostsRead> postsRead = this.f10797u;
            kotlin.jvm.internal.i.f(postsRead, "postsRead");
            boolean z11 = true;
            if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
                for (PostsRead postsRead2 : postsRead) {
                    if (kotlin.jvm.internal.i.b(postsRead2.getPostId(), learningHubModel.getId())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            Boolean valueOf = Boolean.valueOf(z10);
            LearningHubModel learningHubModel2 = (LearningHubModel) t10;
            kotlin.jvm.internal.i.f(postsRead, "postsRead");
            if (!(postsRead instanceof Collection) || !postsRead.isEmpty()) {
                for (PostsRead postsRead3 : postsRead) {
                    if (kotlin.jvm.internal.i.b(postsRead3.getPostId(), learningHubModel2.getId())) {
                        break;
                    }
                }
            }
            z11 = false;
            return sp.b.g(valueOf, Boolean.valueOf(z11));
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class y extends kotlin.jvm.internal.k implements ss.p<MiniCourse, CardView, hs.k> {
        public y() {
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
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            if (J0) {
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                UtilsKt.fireAnalytics("basic_dashboard_click", bundle);
                v3DashboardActivity.startActivityForResult(new Intent(v3DashboardActivity, MiniCourseActivity.class).putExtra("mccourse", miniCourse2.getDomain()).putExtra(Constants.CAMPAIGN_ID, v3DashboardActivity.C0), v3DashboardActivity.L, f0.c.a(v3DashboardActivity, new s0.c(imgView, imgView.getTransitionName())).b());
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("miniCourse", miniCourse2.getDomain());
                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                UtilsKt.fireAnalytics("mini_dashboard_click", bundle2);
                v3DashboardActivity.startActivity(new Intent(v3DashboardActivity, MiniCourseActivity.class).putExtra("mccourse", miniCourse2.getDomain()).putExtra(Constants.CAMPAIGN_ID, v3DashboardActivity.C0), f0.c.a(v3DashboardActivity, new s0.c(imgView, imgView.getTransitionName())).b());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class z implements ViewTreeObserver.OnGlobalLayoutListener {
        public z() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            ((RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.loadingText)).setVisibility(8);
            ((RecyclerView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x027d, code lost:
        if (r5 != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V3DashboardActivity() {
        boolean z10;
        User user;
        boolean z11;
        boolean z12;
        User user2;
        Object obj;
        Object obj2;
        User user3;
        boolean z13;
        User user4;
        boolean z14;
        User user5;
        HashMap<String, Object> appConfig;
        boolean z15;
        boolean z16;
        HashMap<String, Object> appConfig2;
        HashMap<String, Object> appConfig3;
        HashMap<String, Object> appConfig4;
        HashMap<String, Object> appConfig5;
        HashMap<String, Object> appConfig6;
        HashMap<String, Object> appConfig7;
        Boolean bool = Boolean.FALSE;
        this.Z = new hs.f<>(bool, bool);
        boolean z17 = false;
        if (sp.b.K()) {
            wn.b.f36765a.getClass();
            if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                z10 = false;
                this.f10715a0 = z10;
                this.e0 = new ArrayList<>();
                this.f10735m0 = new HashMap<>();
                this.f10741p0 = new Boolean[]{bool, bool};
                this.f10747u0 = Utils.INSTANCE.getTodayTimeInSeconds();
                this.f10753x0 = new yn.a();
                user = FirebasePersistence.getInstance().getUser();
                if (user == null && (appConfig7 = user.getAppConfig()) != null) {
                    z11 = kotlin.jvm.internal.i.b(appConfig7.get(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP), Boolean.TRUE);
                } else {
                    z11 = false;
                }
                if (!z11 && LocationPersistence.INSTANCE.isIndianUser() && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f10755y0 = z12;
                ArrayList k10 = ca.a.k("a", Constants.ONBOARDING_VARIANT, "c", "d", "e");
                User user6 = FirebasePersistence.getInstance().getUser();
                this.f10757z0 = is.u.Z1(k10, (user6 != null || (appConfig6 = user6.getAppConfig()) == null || (r5 = appConfig6.get(Constants.TELE_ENTRY_POINT_EXPERIMENT)) == null) ? "d" : "d");
                user2 = FirebasePersistence.getInstance().getUser();
                obj = null;
                if (user2 == null && (appConfig5 = user2.getAppConfig()) != null) {
                    obj2 = appConfig5.get(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT);
                } else {
                    obj2 = null;
                }
                this.A0 = !kotlin.jvm.internal.i.b(obj2, "multi");
                androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new dl.f0(this, 0));
                kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
                this.E0 = registerForActivityResult;
                kotlin.jvm.internal.i.f(registerForActivityResult(new e.d(), new dl.f0(this, 4)), "registerForActivityResul…ivityResult(result)\n    }");
                kotlin.jvm.internal.i.f(registerForActivityResult(new e.d(), new dl.f0(this, 5)), "registerForActivityResul…ivityResult(result)\n    }");
                androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new dl.f0(this, 6));
                kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…shState()\n        }\n    }");
                this.F0 = registerForActivityResult2;
                androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new dl.f0(this, 7));
                kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…ation\", \"bookings\")\n    }");
                this.G0 = registerForActivityResult3;
                androidx.activity.result.c<Intent> registerForActivityResult4 = registerForActivityResult(new e.d(), new dl.f0(this, 8));
                kotlin.jvm.internal.i.f(registerForActivityResult4, "registerForActivityResul…        }\n        }\n    }");
                this.H0 = registerForActivityResult4;
                user3 = FirebasePersistence.getInstance().getUser();
                if (user3 == null && (appConfig4 = user3.getAppConfig()) != null) {
                    z13 = kotlin.jvm.internal.i.b(appConfig4.get(Constants.IH_RESOURCES_EXPERIMENT), Boolean.TRUE);
                } else {
                    z13 = false;
                }
                this.I0 = z13;
                L1(false);
                this.L0 = "default";
                user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null && (appConfig3 = user4.getAppConfig()) != null) {
                    obj = appConfig3.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                }
                if (!kotlin.jvm.internal.i.b(obj, "f")) {
                    User user7 = FirebasePersistence.getInstance().getUser();
                    if (user7 != null && (appConfig2 = user7.getAppConfig()) != null && kotlin.jvm.internal.i.b(appConfig2.get(Constants.TELE_ENTRY_POINT_EXPERIMENT), "d") && kotlin.jvm.internal.i.b(appConfig2.get(Constants.NEW_COURSES_EXPERIMENT), "variant_a")) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        SessionManager sessionManager = SessionManager.getInstance();
                        String stringValue = sessionManager.getStringValue(SessionManager.KEY_MYTHERAPIST);
                        String stringValue2 = sessionManager.getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                        String stringValue3 = sessionManager.getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                        if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    z14 = false;
                    this.Q0 = z14;
                    this.R0 = true;
                    this.V0 = kotlinx.coroutines.e0.n();
                    user5 = FirebasePersistence.getInstance().getUser();
                    if (user5 != null && (appConfig = user5.getAppConfig()) != null && appConfig.containsKey(Constants.APP_PROMPTS_EXPERIMENT) && !kotlin.jvm.internal.i.b(appConfig.get(Constants.APP_PROMPTS_EXPERIMENT), "default")) {
                        z17 = true;
                    }
                    this.X0 = z17;
                    this.Z0 = true;
                    this.f10716a1 = sp.b.O(new k());
                    androidx.activity.result.c<Intent> registerForActivityResult5 = registerForActivityResult(new e.d(), new dl.f0(this, 9));
                    kotlin.jvm.internal.i.f(registerForActivityResult5, "registerForActivityResul…teJournalCard()\n        }");
                    this.f10718c1 = registerForActivityResult5;
                    androidx.activity.result.c<Intent> registerForActivityResult6 = registerForActivityResult(new e.d(), new dl.f0(this, 10));
                    kotlin.jvm.internal.i.f(registerForActivityResult6, "registerForActivityResul…tchData()\n        }\n    }");
                    this.f10721e1 = registerForActivityResult6;
                    this.f10723f1 = new b();
                    this.g1 = new a();
                    this.f10726h1 = new h();
                    this.f10728i1 = new dl.f0(this, 11);
                    androidx.activity.result.c<Intent> registerForActivityResult7 = registerForActivityResult(new e.d(), new dl.f0(this, 12));
                    kotlin.jvm.internal.i.f(registerForActivityResult7, "registerForActivityResul…ookings\")\n        }\n    }");
                    this.f10730j1 = registerForActivityResult7;
                    this.f10732k1 = new dl.f0(this, 1);
                    androidx.activity.result.c<Intent> registerForActivityResult8 = registerForActivityResult(new e.d(), new dl.f0(this, 2));
                    kotlin.jvm.internal.i.f(registerForActivityResult8, "registerForActivityResul…ardingDialog = null\n    }");
                    this.f10736m1 = registerForActivityResult8;
                    this.f10738n1 = bool;
                    this.f10740o1 = true;
                    androidx.activity.result.c<Intent> registerForActivityResult9 = registerForActivityResult(new e.d(), new dl.f0(this, 3));
                    kotlin.jvm.internal.i.f(registerForActivityResult9, "registerForActivityResul…e(TAG, e)\n        }\n    }");
                    this.f10742p1 = registerForActivityResult9;
                }
                z14 = true;
                this.Q0 = z14;
                this.R0 = true;
                this.V0 = kotlinx.coroutines.e0.n();
                user5 = FirebasePersistence.getInstance().getUser();
                if (user5 != null) {
                    z17 = true;
                }
                this.X0 = z17;
                this.Z0 = true;
                this.f10716a1 = sp.b.O(new k());
                androidx.activity.result.c<Intent> registerForActivityResult52 = registerForActivityResult(new e.d(), new dl.f0(this, 9));
                kotlin.jvm.internal.i.f(registerForActivityResult52, "registerForActivityResul…teJournalCard()\n        }");
                this.f10718c1 = registerForActivityResult52;
                androidx.activity.result.c<Intent> registerForActivityResult62 = registerForActivityResult(new e.d(), new dl.f0(this, 10));
                kotlin.jvm.internal.i.f(registerForActivityResult62, "registerForActivityResul…tchData()\n        }\n    }");
                this.f10721e1 = registerForActivityResult62;
                this.f10723f1 = new b();
                this.g1 = new a();
                this.f10726h1 = new h();
                this.f10728i1 = new dl.f0(this, 11);
                androidx.activity.result.c<Intent> registerForActivityResult72 = registerForActivityResult(new e.d(), new dl.f0(this, 12));
                kotlin.jvm.internal.i.f(registerForActivityResult72, "registerForActivityResul…ookings\")\n        }\n    }");
                this.f10730j1 = registerForActivityResult72;
                this.f10732k1 = new dl.f0(this, 1);
                androidx.activity.result.c<Intent> registerForActivityResult82 = registerForActivityResult(new e.d(), new dl.f0(this, 2));
                kotlin.jvm.internal.i.f(registerForActivityResult82, "registerForActivityResul…ardingDialog = null\n    }");
                this.f10736m1 = registerForActivityResult82;
                this.f10738n1 = bool;
                this.f10740o1 = true;
                androidx.activity.result.c<Intent> registerForActivityResult92 = registerForActivityResult(new e.d(), new dl.f0(this, 3));
                kotlin.jvm.internal.i.f(registerForActivityResult92, "registerForActivityResul…e(TAG, e)\n        }\n    }");
                this.f10742p1 = registerForActivityResult92;
            }
        }
        z10 = true;
        this.f10715a0 = z10;
        this.e0 = new ArrayList<>();
        this.f10735m0 = new HashMap<>();
        this.f10741p0 = new Boolean[]{bool, bool};
        this.f10747u0 = Utils.INSTANCE.getTodayTimeInSeconds();
        this.f10753x0 = new yn.a();
        user = FirebasePersistence.getInstance().getUser();
        if (user == null) {
        }
        z11 = false;
        if (!z11) {
        }
        z12 = false;
        this.f10755y0 = z12;
        ArrayList k102 = ca.a.k("a", Constants.ONBOARDING_VARIANT, "c", "d", "e");
        User user62 = FirebasePersistence.getInstance().getUser();
        this.f10757z0 = is.u.Z1(k102, (user62 != null || (appConfig6 = user62.getAppConfig()) == null || (r5 = appConfig6.get(Constants.TELE_ENTRY_POINT_EXPERIMENT)) == null) ? "d" : "d");
        user2 = FirebasePersistence.getInstance().getUser();
        obj = null;
        if (user2 == null) {
        }
        obj2 = null;
        this.A0 = !kotlin.jvm.internal.i.b(obj2, "multi");
        androidx.activity.result.c<Intent> registerForActivityResult10 = registerForActivityResult(new e.d(), new dl.f0(this, 0));
        kotlin.jvm.internal.i.f(registerForActivityResult10, "registerForActivityResul…ivityResult(result)\n    }");
        this.E0 = registerForActivityResult10;
        kotlin.jvm.internal.i.f(registerForActivityResult(new e.d(), new dl.f0(this, 4)), "registerForActivityResul…ivityResult(result)\n    }");
        kotlin.jvm.internal.i.f(registerForActivityResult(new e.d(), new dl.f0(this, 5)), "registerForActivityResul…ivityResult(result)\n    }");
        androidx.activity.result.c<Intent> registerForActivityResult22 = registerForActivityResult(new e.d(), new dl.f0(this, 6));
        kotlin.jvm.internal.i.f(registerForActivityResult22, "registerForActivityResul…shState()\n        }\n    }");
        this.F0 = registerForActivityResult22;
        androidx.activity.result.c<Intent> registerForActivityResult32 = registerForActivityResult(new e.d(), new dl.f0(this, 7));
        kotlin.jvm.internal.i.f(registerForActivityResult32, "registerForActivityResul…ation\", \"bookings\")\n    }");
        this.G0 = registerForActivityResult32;
        androidx.activity.result.c<Intent> registerForActivityResult42 = registerForActivityResult(new e.d(), new dl.f0(this, 8));
        kotlin.jvm.internal.i.f(registerForActivityResult42, "registerForActivityResul…        }\n        }\n    }");
        this.H0 = registerForActivityResult42;
        user3 = FirebasePersistence.getInstance().getUser();
        if (user3 == null) {
        }
        z13 = false;
        this.I0 = z13;
        L1(false);
        this.L0 = "default";
        user4 = FirebasePersistence.getInstance().getUser();
        if (user4 != null) {
            obj = appConfig3.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
        }
        if (!kotlin.jvm.internal.i.b(obj, "f")) {
        }
        z14 = true;
        this.Q0 = z14;
        this.R0 = true;
        this.V0 = kotlinx.coroutines.e0.n();
        user5 = FirebasePersistence.getInstance().getUser();
        if (user5 != null) {
        }
        this.X0 = z17;
        this.Z0 = true;
        this.f10716a1 = sp.b.O(new k());
        androidx.activity.result.c<Intent> registerForActivityResult522 = registerForActivityResult(new e.d(), new dl.f0(this, 9));
        kotlin.jvm.internal.i.f(registerForActivityResult522, "registerForActivityResul…teJournalCard()\n        }");
        this.f10718c1 = registerForActivityResult522;
        androidx.activity.result.c<Intent> registerForActivityResult622 = registerForActivityResult(new e.d(), new dl.f0(this, 10));
        kotlin.jvm.internal.i.f(registerForActivityResult622, "registerForActivityResul…tchData()\n        }\n    }");
        this.f10721e1 = registerForActivityResult622;
        this.f10723f1 = new b();
        this.g1 = new a();
        this.f10726h1 = new h();
        this.f10728i1 = new dl.f0(this, 11);
        androidx.activity.result.c<Intent> registerForActivityResult722 = registerForActivityResult(new e.d(), new dl.f0(this, 12));
        kotlin.jvm.internal.i.f(registerForActivityResult722, "registerForActivityResul…ookings\")\n        }\n    }");
        this.f10730j1 = registerForActivityResult722;
        this.f10732k1 = new dl.f0(this, 1);
        androidx.activity.result.c<Intent> registerForActivityResult822 = registerForActivityResult(new e.d(), new dl.f0(this, 2));
        kotlin.jvm.internal.i.f(registerForActivityResult822, "registerForActivityResul…ardingDialog = null\n    }");
        this.f10736m1 = registerForActivityResult822;
        this.f10738n1 = bool;
        this.f10740o1 = true;
        androidx.activity.result.c<Intent> registerForActivityResult922 = registerForActivityResult(new e.d(), new dl.f0(this, 3));
        kotlin.jvm.internal.i.f(registerForActivityResult922, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.f10742p1 = registerForActivityResult922;
    }

    public static void C0(V3DashboardActivity v3DashboardActivity) {
        ArrayList<Goal> arrayList;
        boolean z10;
        Menu menu;
        User user = FirebasePersistence.getInstance().getUser();
        MenuItem menuItem = null;
        if (user != null) {
            arrayList = user.getUserGoals();
        } else {
            arrayList = null;
        }
        NavigationView navigationView = (NavigationView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.dashboardv2NavView);
        if (navigationView != null && (menu = navigationView.getMenu()) != null) {
            menuItem = menu.findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs);
        }
        if (menuItem != null) {
            boolean z11 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
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
            menuItem.setVisible(z11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r21.equals("bse_tips") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        if (r21.equals("bse_prep") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
        r1 = android.view.LayoutInflater.from(r20).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (android.view.ViewGroup) ((android.widget.LinearLayout) r20.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
        r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
        r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
        r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime).setVisibility(8);
        r1.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession).setVisibility(8);
        ((androidx.cardview.widget.CardView) r1.findViewById(com.theinnerhour.b2b.R.id.cvIntegratedDashboardCard)).setCardBackgroundColor(g0.a.b(r20, com.theinnerhour.b2b.R.color.campaignLightBlue));
        ((com.theinnerhour.b2b.widgets.RobertoTextView) r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setTextColor(g0.a.b(r20, com.theinnerhour.b2b.R.color.white));
        ((com.theinnerhour.b2b.widgets.RobertoTextView) r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setFont("Lato-Medium.ttf");
        r3 = (com.theinnerhour.b2b.widgets.RobertoTextView) r1.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
        if (kotlin.jvm.internal.i.b(r21, "bse_tips") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014f, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoButton) r1.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(r20.getString(com.theinnerhour.b2b.R.string.readNow));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0162, code lost:
        if (r23 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0164, code lost:
        r4 = r20.getString(com.theinnerhour.b2b.R.string.SessionTipsTherapySession);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x016c, code lost:
        r4 = r20.getString(com.theinnerhour.b2b.R.string.SessionTipsPsychiatrySession);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0174, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoButton) r1.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(r20.getString(com.theinnerhour.b2b.R.string.open));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0187, code lost:
        if (r23 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0189, code lost:
        r4 = r20.getString(com.theinnerhour.b2b.R.string.PreparationThingsTherapySession);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0191, code lost:
        r4 = r20.getString(com.theinnerhour.b2b.R.string.PreparationThingsPsychiatrySession);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0198, code lost:
        r3.setText(r4);
        r3 = new dl.l0(2, (java.lang.Object) r20, (java.lang.Object) r21, r23);
        ((com.theinnerhour.b2b.widgets.RobertoButton) r1.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(r3);
        r1.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(r3);
        ((android.widget.LinearLayout) r20.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o0(V3DashboardActivity v3DashboardActivity, String str, Object obj, boolean z10) {
        String str2;
        TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel;
        int i6;
        UpcomingBooking upcomingBooking;
        String str3;
        int i10;
        SuggestedBooking suggestedBooking;
        androidx.lifecycle.w<TherapistPackagesModel> wVar;
        TherapistPackagesModel d10;
        String uuid;
        int hashCode;
        int i11;
        int i12;
        RobertoTextView robertoTextView;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar2;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
        TherapistPackagesModel therapistPackagesModel;
        TelecommunicationHomeworkNotification telecommunicationHomeworkNotification;
        String str4;
        int i13;
        CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel;
        boolean z11;
        LinearLayout linearLayout;
        ml.p pVar = v3DashboardActivity.f10739o0;
        if (pVar != null) {
            str2 = pVar.W;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            switch (str.hashCode()) {
                case -2032942435:
                    if (str.equals("initial_assessment")) {
                        if (obj instanceof TelecommunicationsHomeworkResponseModel.HomeworkModel) {
                            homeworkModel = (TelecommunicationsHomeworkResponseModel.HomeworkModel) obj;
                        } else {
                            homeworkModel = null;
                        }
                        if (homeworkModel != null) {
                            View inflate = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                            inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
                            inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
                            inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime).setVisibility(8);
                            inflate.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession).setVisibility(8);
                            ((CardView) inflate.findViewById(com.theinnerhour.b2b.R.id.cvIntegratedDashboardCard)).setCardBackgroundColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.campaignLightBlue));
                            ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setTextColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.white));
                            RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                            if (z10) {
                                i6 = com.theinnerhour.b2b.R.string.providerTherapyAssessmentNotification;
                            } else {
                                i6 = com.theinnerhour.b2b.R.string.providerPsychiatryAssessmentNotification;
                            }
                            robertoTextView2.setText(v3DashboardActivity.getString(i6));
                            ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setFont("Lato-Medium.ttf");
                            ((RobertoButton) inflate.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.depressionExercisesExercisePlayStartCTA));
                            m0 m0Var = new m0(v3DashboardActivity, z10);
                            View findViewById = inflate.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                            if (findViewById != null) {
                                findViewById.setOnClickListener(m0Var);
                            }
                            View findViewById2 = inflate.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout);
                            if (findViewById2 != null) {
                                findViewById2.setOnClickListener(m0Var);
                            }
                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate);
                            break;
                        }
                    }
                    break;
                case -1457570687:
                    if (str.equals("join_session")) {
                        if (obj instanceof UpcomingBooking) {
                            upcomingBooking = (UpcomingBooking) obj;
                        } else {
                            upcomingBooking = null;
                        }
                        if (upcomingBooking != null) {
                            View inflate2 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                            inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
                            inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
                            ((CardView) inflate2.findViewById(com.theinnerhour.b2b.R.id.cvIntegratedDashboardCard)).setCardBackgroundColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.login_grey_background));
                            RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                            ml.p pVar2 = v3DashboardActivity.f10739o0;
                            robertoTextView3.setText((pVar2 == null || (r8 = pVar2.n(upcomingBooking.getDatetimeAtCustomerTimezone().getDate())) == null) ? "" : "");
                            RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                            StringBuilder sb2 = new StringBuilder();
                            ml.p pVar3 = v3DashboardActivity.f10739o0;
                            sb2.append((pVar3 == null || (r10 = pVar3.m(upcomingBooking.getDatetimeAtCustomerTimezone().getSlot())) == null) ? "" : "");
                            sb2.append(" | ");
                            sb2.append(upcomingBooking.getDuration() / 60);
                            sb2.append(" mins");
                            robertoTextView4.setText(sb2.toString());
                            ((RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertHeader)).setVisibility(0);
                            RobertoTextView robertoTextView5 = (RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertHeader);
                            if (z10) {
                                str3 = "my therapist";
                            } else {
                                str3 = "my psychiatrist";
                            }
                            robertoTextView5.setText(str3);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate2.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession);
                            String typeofsession = upcomingBooking.getTypeofsession();
                            int hashCode2 = typeofsession.hashCode();
                            if (hashCode2 != -1548612125) {
                                if (hashCode2 != 3322092) {
                                    if (hashCode2 == 112386354 && typeofsession.equals("voice")) {
                                        i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_call;
                                        appCompatImageView.setImageResource(i10);
                                        RobertoButton robertoButton = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                        if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                            robertoButton.setVisibility(8);
                                        } else {
                                            robertoButton.setText("JOIN");
                                        }
                                        l0 l0Var = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                        ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var);
                                        inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var);
                                        ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                                        break;
                                    }
                                    i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat;
                                    appCompatImageView.setImageResource(i10);
                                    RobertoButton robertoButton2 = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                    if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                    }
                                    l0 l0Var2 = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                    ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var2);
                                    inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var2);
                                    ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                                } else {
                                    if (typeofsession.equals("live")) {
                                        i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_video;
                                        appCompatImageView.setImageResource(i10);
                                        RobertoButton robertoButton22 = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                        if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                        }
                                        l0 l0Var22 = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                        ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var22);
                                        inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var22);
                                        ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                                    }
                                    i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat;
                                    appCompatImageView.setImageResource(i10);
                                    RobertoButton robertoButton222 = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                    if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                    }
                                    l0 l0Var222 = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                    ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var222);
                                    inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var222);
                                    ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                                }
                            } else {
                                if (typeofsession.equals("offline")) {
                                    i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_offline;
                                    appCompatImageView.setImageResource(i10);
                                    RobertoButton robertoButton2222 = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                    if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                    }
                                    l0 l0Var2222 = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                    ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var2222);
                                    inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var2222);
                                    ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                                }
                                i10 = com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat;
                                appCompatImageView.setImageResource(i10);
                                RobertoButton robertoButton22222 = (RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                                if (!kotlin.jvm.internal.i.b(upcomingBooking.getTypeofsession(), "offline")) {
                                }
                                l0 l0Var22222 = new l0(1, v3DashboardActivity, (Object) upcomingBooking, z10);
                                ((RobertoButton) inflate2.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var22222);
                                inflate2.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var22222);
                                ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate2);
                            }
                        }
                    }
                    break;
                case -1059122870:
                    if (str.equals("next_session")) {
                        if (obj instanceof SuggestedBooking) {
                            suggestedBooking = (SuggestedBooking) obj;
                        } else {
                            suggestedBooking = null;
                        }
                        if (suggestedBooking != null) {
                            if (z10) {
                                ml.p pVar4 = v3DashboardActivity.f10739o0;
                                if (pVar4 != null && (wVar2 = pVar4.A) != null && (d11 = wVar2.d()) != null && (therapistPackagesModel = d11.f19464u) != null) {
                                    uuid = therapistPackagesModel.getUuid();
                                    View inflate3 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                                    String mode = suggestedBooking.getMode();
                                    hashCode = mode.hashCode();
                                    if (hashCode == -1548612125) {
                                        if (hashCode != 3322092) {
                                            if (hashCode != 112386354 || !mode.equals("voice")) {
                                                i11 = com.theinnerhour.b2b.R.id.ivRowSuggestedSession;
                                                ((AppCompatImageView) inflate3.findViewById(i11)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat);
                                                RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                                ml.p pVar5 = v3DashboardActivity.f10739o0;
                                                robertoTextView6.setText((pVar5 != null || (r10 = pVar5.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                                RobertoTextView robertoTextView7 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                                StringBuilder sb3 = new StringBuilder();
                                                ml.p pVar6 = v3DashboardActivity.f10739o0;
                                                sb3.append((pVar6 != null || (r12 = pVar6.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                                sb3.append(" | ");
                                                sb3.append(suggestedBooking.getDuration() / 60);
                                                sb3.append(" mins");
                                                robertoTextView7.setText(sb3.toString());
                                                zk.k kVar = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                                ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar);
                                                inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar);
                                                RobertoTextView robertoTextView8 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                                if (!z10) {
                                                }
                                                robertoTextView8.setText(v3DashboardActivity.getString(i12));
                                                robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                                if (robertoTextView != null) {
                                                }
                                                ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                            } else {
                                                ((AppCompatImageView) inflate3.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_call);
                                                RobertoTextView robertoTextView62 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                                ml.p pVar52 = v3DashboardActivity.f10739o0;
                                                robertoTextView62.setText((pVar52 != null || (r10 = pVar52.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                                RobertoTextView robertoTextView72 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                                StringBuilder sb32 = new StringBuilder();
                                                ml.p pVar62 = v3DashboardActivity.f10739o0;
                                                sb32.append((pVar62 != null || (r12 = pVar62.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                                sb32.append(" | ");
                                                sb32.append(suggestedBooking.getDuration() / 60);
                                                sb32.append(" mins");
                                                robertoTextView72.setText(sb32.toString());
                                                zk.k kVar2 = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                                ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar2);
                                                inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar2);
                                                RobertoTextView robertoTextView82 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                                if (!z10) {
                                                    i12 = com.theinnerhour.b2b.R.string.therapistSuggestedSessionHeader;
                                                } else {
                                                    i12 = com.theinnerhour.b2b.R.string.psychiatristSuggestedSessionHeader;
                                                }
                                                robertoTextView82.setText(v3DashboardActivity.getString(i12));
                                                robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                                if (robertoTextView != null) {
                                                    robertoTextView.setText(suggestedBooking.getExpiryDisplayText());
                                                }
                                                ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                            }
                                        } else {
                                            i11 = com.theinnerhour.b2b.R.id.ivRowSuggestedSession;
                                            if (mode.equals("live")) {
                                                ((AppCompatImageView) inflate3.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_video);
                                                RobertoTextView robertoTextView622 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                                ml.p pVar522 = v3DashboardActivity.f10739o0;
                                                robertoTextView622.setText((pVar522 != null || (r10 = pVar522.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                                RobertoTextView robertoTextView722 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                                StringBuilder sb322 = new StringBuilder();
                                                ml.p pVar622 = v3DashboardActivity.f10739o0;
                                                sb322.append((pVar622 != null || (r12 = pVar622.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                                sb322.append(" | ");
                                                sb322.append(suggestedBooking.getDuration() / 60);
                                                sb322.append(" mins");
                                                robertoTextView722.setText(sb322.toString());
                                                zk.k kVar22 = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                                ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar22);
                                                inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar22);
                                                RobertoTextView robertoTextView822 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                                if (!z10) {
                                                }
                                                robertoTextView822.setText(v3DashboardActivity.getString(i12));
                                                robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                                if (robertoTextView != null) {
                                                }
                                                ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                            }
                                            ((AppCompatImageView) inflate3.findViewById(i11)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat);
                                            RobertoTextView robertoTextView6222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                            ml.p pVar5222 = v3DashboardActivity.f10739o0;
                                            robertoTextView6222.setText((pVar5222 != null || (r10 = pVar5222.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                            RobertoTextView robertoTextView7222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                            StringBuilder sb3222 = new StringBuilder();
                                            ml.p pVar6222 = v3DashboardActivity.f10739o0;
                                            sb3222.append((pVar6222 != null || (r12 = pVar6222.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                            sb3222.append(" | ");
                                            sb3222.append(suggestedBooking.getDuration() / 60);
                                            sb3222.append(" mins");
                                            robertoTextView7222.setText(sb3222.toString());
                                            zk.k kVar222 = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                            ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar222);
                                            inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar222);
                                            RobertoTextView robertoTextView8222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                            if (!z10) {
                                            }
                                            robertoTextView8222.setText(v3DashboardActivity.getString(i12));
                                            robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                            if (robertoTextView != null) {
                                            }
                                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                        }
                                    } else {
                                        i11 = com.theinnerhour.b2b.R.id.ivRowSuggestedSession;
                                        if (mode.equals("offline")) {
                                            ((AppCompatImageView) inflate3.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_offline);
                                            RobertoTextView robertoTextView62222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                            ml.p pVar52222 = v3DashboardActivity.f10739o0;
                                            robertoTextView62222.setText((pVar52222 != null || (r10 = pVar52222.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                            RobertoTextView robertoTextView72222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                            StringBuilder sb32222 = new StringBuilder();
                                            ml.p pVar62222 = v3DashboardActivity.f10739o0;
                                            sb32222.append((pVar62222 != null || (r12 = pVar62222.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                            sb32222.append(" | ");
                                            sb32222.append(suggestedBooking.getDuration() / 60);
                                            sb32222.append(" mins");
                                            robertoTextView72222.setText(sb32222.toString());
                                            zk.k kVar2222 = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                            ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar2222);
                                            inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar2222);
                                            RobertoTextView robertoTextView82222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                            if (!z10) {
                                            }
                                            robertoTextView82222.setText(v3DashboardActivity.getString(i12));
                                            robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                            if (robertoTextView != null) {
                                            }
                                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                        }
                                        ((AppCompatImageView) inflate3.findViewById(i11)).setImageResource(com.theinnerhour.b2b.R.drawable.ir_provider_medium_chat);
                                        RobertoTextView robertoTextView622222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                                        ml.p pVar522222 = v3DashboardActivity.f10739o0;
                                        robertoTextView622222.setText((pVar522222 != null || (r10 = pVar522222.n(suggestedBooking.getCustomerTimezoneDate().getDate())) == null) ? "" : "");
                                        RobertoTextView robertoTextView722222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime);
                                        StringBuilder sb322222 = new StringBuilder();
                                        ml.p pVar622222 = v3DashboardActivity.f10739o0;
                                        sb322222.append((pVar622222 != null || (r12 = pVar622222.m(suggestedBooking.getCustomerTimezoneDate().getSlot())) == null) ? "" : "");
                                        sb322222.append(" | ");
                                        sb322222.append(suggestedBooking.getDuration() / 60);
                                        sb322222.append(" mins");
                                        robertoTextView722222.setText(sb322222.toString());
                                        zk.k kVar22222 = new zk.k(v3DashboardActivity, z10, suggestedBooking, uuid);
                                        ((RobertoButton) inflate3.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar22222);
                                        inflate3.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar22222);
                                        RobertoTextView robertoTextView822222 = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader);
                                        if (!z10) {
                                        }
                                        robertoTextView822222.setText(v3DashboardActivity.getString(i12));
                                        robertoTextView = (RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter);
                                        if (robertoTextView != null) {
                                        }
                                        ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate3);
                                    }
                                }
                                uuid = null;
                                View inflate32 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                                String mode2 = suggestedBooking.getMode();
                                hashCode = mode2.hashCode();
                                if (hashCode == -1548612125) {
                                }
                            } else {
                                ml.p pVar7 = v3DashboardActivity.f10739o0;
                                if (pVar7 != null && (wVar = pVar7.B) != null && (d10 = wVar.d()) != null) {
                                    uuid = d10.getUuid();
                                    View inflate322 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                                    String mode22 = suggestedBooking.getMode();
                                    hashCode = mode22.hashCode();
                                    if (hashCode == -1548612125) {
                                    }
                                }
                                uuid = null;
                                View inflate3222 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                                String mode222 = suggestedBooking.getMode();
                                hashCode = mode222.hashCode();
                                if (hashCode == -1548612125) {
                                }
                            }
                        }
                    }
                    break;
                case -485149584:
                    if (str.equals("homework")) {
                        if (obj instanceof TelecommunicationHomeworkNotification) {
                            telecommunicationHomeworkNotification = (TelecommunicationHomeworkNotification) obj;
                        } else {
                            telecommunicationHomeworkNotification = null;
                        }
                        if (telecommunicationHomeworkNotification != null) {
                            View inflate4 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                            inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
                            inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
                            inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime).setVisibility(8);
                            inflate4.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession).setVisibility(8);
                            ((CardView) inflate4.findViewById(com.theinnerhour.b2b.R.id.cvIntegratedDashboardCard)).setCardBackgroundColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.campaignLightBlue));
                            ((RobertoTextView) inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setTextColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.white));
                            ((RobertoTextView) inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setText(telecommunicationHomeworkNotification.getDisplayText());
                            ((RobertoButton) inflate4.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(telecommunicationHomeworkNotification.getDisplayCtaText());
                            ((RobertoTextView) inflate4.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setFont("Lato-Medium.ttf");
                            zk.k kVar3 = new zk.k(z10, v3DashboardActivity, telecommunicationHomeworkNotification, inflate4, 1);
                            View findViewById3 = inflate4.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert);
                            if (findViewById3 != null) {
                                findViewById3.setOnClickListener(kVar3);
                            }
                            View findViewById4 = inflate4.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout);
                            if (findViewById4 != null) {
                                findViewById4.setOnClickListener(kVar3);
                            }
                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate4);
                        }
                    }
                    break;
                case -191501435:
                    if (str.equals("feedback")) {
                        if (obj instanceof String) {
                            str4 = (String) obj;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            View inflate5 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                            inflate5.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
                            inflate5.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
                            inflate5.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime).setVisibility(8);
                            inflate5.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession).setVisibility(8);
                            List a12 = gv.r.a1(str4, new String[]{"/"}, 0, 6);
                            String str5 = (String) is.u.j2(a12.size() - 2, a12);
                            RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert);
                            if (kotlin.jvm.internal.i.b(str5, "1")) {
                                i13 = com.theinnerhour.b2b.R.string.providerDashboardFeedbackFirstSession;
                            } else {
                                i13 = com.theinnerhour.b2b.R.string.providerDashboardFeedback;
                            }
                            robertoTextView9.setText(v3DashboardActivity.getString(i13));
                            ((RobertoTextView) inflate5.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setFont("Lato-Medium.ttf");
                            ((RobertoButton) inflate5.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.depressionExercisesExercisePlayStartCTA));
                            zk.k kVar4 = new zk.k(z10, (Object) v3DashboardActivity, str4, (Serializable) str5, 3);
                            ((RobertoButton) inflate5.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(kVar4);
                            inflate5.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(kVar4);
                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate5);
                        }
                    }
                    break;
                case 963157336:
                    break;
                case 963268195:
                    break;
                case 1332209424:
                    if (str.equals("cross_provider")) {
                        if (obj instanceof CrossProviderRecommendationNotificationModel) {
                            crossProviderRecommendationNotificationModel = (CrossProviderRecommendationNotificationModel) obj;
                        } else {
                            crossProviderRecommendationNotificationModel = null;
                        }
                        if (crossProviderRecommendationNotificationModel != null) {
                            View inflate6 = LayoutInflater.from(v3DashboardActivity).inflate(com.theinnerhour.b2b.R.layout.row_db_tc_notification, (ViewGroup) ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)), false);
                            inflate6.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardHeader).setVisibility(8);
                            inflate6.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardFooter).setVisibility(8);
                            inflate6.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlertTime).setVisibility(8);
                            inflate6.findViewById(com.theinnerhour.b2b.R.id.ivRowSuggestedSession).setVisibility(8);
                            ((RobertoTextView) inflate6.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setText(crossProviderRecommendationNotificationModel.getMessage());
                            ((RobertoTextView) inflate6.findViewById(com.theinnerhour.b2b.R.id.tvIntegratedDashboardAlert)).setFont("Lato-Medium.ttf");
                            ((RobertoButton) inflate6.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setText(crossProviderRecommendationNotificationModel.getCta());
                            l0 l0Var3 = new l0(0, v3DashboardActivity, (Object) crossProviderRecommendationNotificationModel, z10);
                            ((RobertoButton) inflate6.findViewById(com.theinnerhour.b2b.R.id.rbIntegratedDashboardAlert)).setOnClickListener(l0Var3);
                            inflate6.findViewById(com.theinnerhour.b2b.R.id.clIntegratedDashboardParentLayout).setOnClickListener(l0Var3);
                            ((LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)).addView(inflate6);
                        }
                    }
                    break;
            }
            LinearLayout linearLayout2 = (LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications);
            if (linearLayout2 != null && linearLayout2.getVisibility() == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (linearLayout = (LinearLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.llDashboardProviderAssignedNotifications)) != null) {
                linearLayout.setVisibility(0);
            }
        }
    }

    public static final void p0(V3DashboardActivity v3DashboardActivity) {
        Boolean[] boolArr = v3DashboardActivity.f10741p0;
        if (boolArr[0].booleanValue() && boolArr[1].booleanValue()) {
            Boolean bool = Boolean.FALSE;
            boolArr[0] = bool;
            boolArr[1] = bool;
            v3DashboardActivity.I1();
        }
    }

    public static final void q0(V3DashboardActivity v3DashboardActivity) {
        TherapistPackagesModel therapistPackagesModel;
        boolean z10;
        TherapistPackagesModel therapistPackagesModel2;
        boolean z11;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d10;
        androidx.lifecycle.w<TherapistPackagesModel> wVar2;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar3;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
        Boolean[] boolArr = v3DashboardActivity.f10741p0;
        if (boolArr[0].booleanValue()) {
            boolean z12 = true;
            if (boolArr[1].booleanValue()) {
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderImage)).c();
                int i18 = 8;
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderImage)).setVisibility(8);
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderTitle)).c();
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderTitle)).setVisibility(8);
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderName)).c();
                ((ShimmerFrameLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.shimmerDashboardProviderName)).setVisibility(8);
                ml.p pVar = v3DashboardActivity.f10739o0;
                TherapistPackagesModel therapistPackagesModel3 = null;
                if (pVar != null && (wVar3 = pVar.A) != null && (d11 = wVar3.d()) != null) {
                    therapistPackagesModel = d11.f19464u;
                } else {
                    therapistPackagesModel = null;
                }
                if (therapistPackagesModel != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ml.p pVar2 = v3DashboardActivity.f10739o0;
                if (pVar2 != null && (wVar2 = pVar2.B) != null) {
                    therapistPackagesModel2 = wVar2.d();
                } else {
                    therapistPackagesModel2 = null;
                }
                if (therapistPackagesModel2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ml.p pVar3 = v3DashboardActivity.f10739o0;
                if (pVar3 != null && (wVar = pVar3.A) != null && (d10 = wVar.d()) != null) {
                    therapistPackagesModel3 = d10.f19465v;
                }
                if (therapistPackagesModel3 == null) {
                    z12 = false;
                }
                CardView cardView = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedTherapist);
                if (cardView != null) {
                    if (z10) {
                        i17 = 0;
                    } else {
                        i17 = 8;
                    }
                    cardView.setVisibility(i17);
                }
                RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedTherapist);
                if (robertoTextView != null) {
                    if (z10) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    robertoTextView.setVisibility(i16);
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedTherapistName);
                if (robertoTextView2 != null) {
                    if (z10) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    robertoTextView2.setVisibility(i15);
                }
                CardView cardView2 = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedPsychiatrist);
                if (cardView2 != null) {
                    if (z11) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    cardView2.setVisibility(i14);
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedPsychiatrist);
                if (robertoTextView3 != null) {
                    if (z11) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    robertoTextView3.setVisibility(i13);
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedPsychiatristName);
                if (robertoTextView4 != null) {
                    if (z11) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    robertoTextView4.setVisibility(i12);
                }
                CardView cardView3 = (CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedCouplesTherapist);
                if (cardView3 != null) {
                    if (z12) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    cardView3.setVisibility(i11);
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedCouplesTherapist);
                if (robertoTextView5 != null) {
                    if (z12) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    robertoTextView5.setVisibility(i10);
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedCouplesTherapistName);
                if (robertoTextView6 != null) {
                    if (z12) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    robertoTextView6.setVisibility(i6);
                }
                RobertoTextView robertoTextView7 = (RobertoTextView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.tvDashboardProviderAssignedSeeAll);
                if (robertoTextView7 != null) {
                    robertoTextView7.setVisibility((z10 && z11 && z12) ? 0 : 0);
                }
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXISTING_TOOL, false)) {
                    ApplicationPersistence.getInstance().deleteKey(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXISTING_TOOL);
                    ((CardView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedExistingToolTip)).setVisibility(0);
                    ((AppCompatImageView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.ivDashboardProviderAssignedExistingToolTip)).setVisibility(0);
                }
            }
        }
    }

    public static final void r0(V3DashboardActivity v3DashboardActivity) {
        Integer D;
        v3DashboardActivity.f10731k0 = 0;
        Dialog dialog = UiUtils.Companion.getDialog(com.theinnerhour.b2b.R.layout.popup_plan_loading, v3DashboardActivity);
        v3DashboardActivity.f10729j0 = dialog;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
            Dialog dialog2 = v3DashboardActivity.f10729j0;
            if (dialog2 != null) {
                dialog2.setCancelable(false);
                Dialog dialog3 = v3DashboardActivity.f10729j0;
                if (dialog3 != null) {
                    CardView cardView = (CardView) dialog3.findViewById(com.theinnerhour.b2b.R.id.planLoadingDialogCardView);
                    String courseName = v3DashboardActivity.N0().getCourseName();
                    if (courseName != null && (D = hc.d.D(courseName)) != null) {
                        cardView.setCardBackgroundColor(g0.a.b(v3DashboardActivity, D.intValue()));
                    }
                    Dialog dialog4 = v3DashboardActivity.f10729j0;
                    if (dialog4 != null) {
                        RobertoTextView robertoTextView = (RobertoTextView) dialog4.findViewById(com.theinnerhour.b2b.R.id.loadingTitle);
                        if (robertoTextView != null) {
                            robertoTextView.setText(v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.planLoadingDialogTitle));
                            robertoTextView.setTextColor(g0.a.b(v3DashboardActivity, com.theinnerhour.b2b.R.color.title_high_contrast));
                        }
                        Dialog dialog5 = v3DashboardActivity.f10729j0;
                        if (dialog5 != null) {
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) dialog5.findViewById(com.theinnerhour.b2b.R.id.loadingAnimationView);
                            if (Build.VERSION.SDK_INT < 25) {
                                if (lottieAnimationView != null) {
                                    lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                                }
                            } else if (lottieAnimationView != null) {
                                lottieAnimationView.setRenderMode(a3.t.HARDWARE);
                            }
                            lottieAnimationView.setAnimation(com.theinnerhour.b2b.R.raw.expt_plan_loading);
                            lottieAnimationView.c(new f2(lottieAnimationView, v3DashboardActivity));
                            Dialog dialog6 = v3DashboardActivity.f10729j0;
                            if (dialog6 != null) {
                                dialog6.show();
                                lottieAnimationView.h();
                                return;
                            }
                            kotlin.jvm.internal.i.q("planLoadingDialog");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("planLoadingDialog");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("planLoadingDialog");
                    throw null;
                }
                kotlin.jvm.internal.i.q("planLoadingDialog");
                throw null;
            }
            kotlin.jvm.internal.i.q("planLoadingDialog");
            throw null;
        }
        kotlin.jvm.internal.i.q("planLoadingDialog");
        throw null;
    }

    public static final void s0(V3DashboardActivity v3DashboardActivity) {
        v3DashboardActivity.f10731k0 = 0;
        Dialog dialog = UiUtils.Companion.getDialog(com.theinnerhour.b2b.R.layout.popup_plan_loading, v3DashboardActivity);
        v3DashboardActivity.f10729j0 = dialog;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
            Dialog dialog2 = v3DashboardActivity.f10729j0;
            if (dialog2 != null) {
                dialog2.setCancelable(false);
                Dialog dialog3 = v3DashboardActivity.f10729j0;
                if (dialog3 != null) {
                    ((RobertoTextView) dialog3.findViewById(com.theinnerhour.b2b.R.id.loadingTitle)).setText(v3DashboardActivity.getString(com.theinnerhour.b2b.R.string.planLoadingDialogTitle));
                    Dialog dialog4 = v3DashboardActivity.f10729j0;
                    if (dialog4 != null) {
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) dialog4.findViewById(com.theinnerhour.b2b.R.id.loadingAnimationView);
                        if (Build.VERSION.SDK_INT < 25) {
                            if (lottieAnimationView != null) {
                                lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                            }
                        } else if (lottieAnimationView != null) {
                            lottieAnimationView.setRenderMode(a3.t.HARDWARE);
                        }
                        lottieAnimationView.setAnimation(com.theinnerhour.b2b.R.raw.plan_loading_loop);
                        lottieAnimationView.c(new k2(lottieAnimationView, v3DashboardActivity));
                        Dialog dialog5 = v3DashboardActivity.f10729j0;
                        if (dialog5 != null) {
                            dialog5.show();
                            lottieAnimationView.h();
                            return;
                        }
                        kotlin.jvm.internal.i.q("planLoadingDialog");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("planLoadingDialog");
                    throw null;
                }
                kotlin.jvm.internal.i.q("planLoadingDialog");
                throw null;
            }
            kotlin.jvm.internal.i.q("planLoadingDialog");
            throw null;
        }
        kotlin.jvm.internal.i.q("planLoadingDialog");
        throw null;
    }

    public static void u0(V3DashboardActivity v3DashboardActivity) {
        Menu menu = ((BottomNavigationView) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.navigation)).getMenu();
        kotlin.jvm.internal.i.f(menu, "navigation.menu");
        Typeface typeface = AssetProviderSingleton.INSTANCE.getTypeface(v3DashboardActivity, "Lato-Bold.ttf");
        int size = menu.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem mi2 = menu.getItem(i6);
            kotlin.jvm.internal.i.f(mi2, "mi");
            UtilsKt.applyFontToMenuItem(mi2, typeface, -1);
        }
    }

    public final void A0() {
        try {
            new Handler().postDelayed(new dl.v(this, 1), 1500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void A1() {
        lp.a aVar = this.I;
        if (aVar != null) {
            String f2 = aVar.f();
            if (kotlin.jvm.internal.i.b(SubscriptionPersistence.INSTANCE.getSubscriptionState(), Constants.STATE_ON_HOLD) && ca.a.k(Constants.HOLD_DIALOG_2_SHOWN, Constants.HOLD_DIALOG_3_SHOWN).contains(f2)) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(0);
                Bundle bundle = new Bundle();
                lp.a aVar2 = this.I;
                if (aVar2 != null) {
                    bundle.putLong("day", aVar2.e());
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
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA1)).setOnClickListener(new j1(this, 12, bundle));
                    ((RobertoButton) n0(com.theinnerhour.b2b.R.id.btnDashboardSubscriptionMessagingCTA2)).setOnClickListener(new dk.t(this, f2, bundle));
                    return;
                }
                kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
                throw null;
            }
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clSubscriptionMessaging)).setVisibility(8);
            return;
        }
        kotlin.jvm.internal.i.q("subscriptionMessagingViewModel");
        throw null;
    }

    @Override // xk.a
    public final void B(int i6) {
        this.U0 = i6;
    }

    public final void B0() {
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false)) {
                if (!this.f10727i0) {
                    if (this.I0) {
                        Extensions extensions = Extensions.INSTANCE;
                        ShimmerFrameLayout learningHubExperimentTag = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubExperimentTag);
                        kotlin.jvm.internal.i.f(learningHubExperimentTag, "learningHubExperimentTag");
                        extensions.visible(learningHubExperimentTag);
                        ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubExperimentTag)).b();
                        return;
                    }
                    Extensions extensions2 = Extensions.INSTANCE;
                    ShimmerFrameLayout learningHubTag = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
                    kotlin.jvm.internal.i.f(learningHubTag, "learningHubTag");
                    extensions2.visible(learningHubTag);
                    ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag)).b();
                    return;
                }
                return;
            }
            Extensions extensions3 = Extensions.INSTANCE;
            ShimmerFrameLayout learningHubTag2 = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
            kotlin.jvm.internal.i.f(learningHubTag2, "learningHubTag");
            extensions3.gone(learningHubTag2);
            return;
        }
        Extensions extensions4 = Extensions.INSTANCE;
        ShimmerFrameLayout learningHubTag3 = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.learningHubTag);
        kotlin.jvm.internal.i.f(learningHubTag3, "learningHubTag");
        extensions4.gone(learningHubTag3);
    }

    public final void B1() {
        String str;
        boolean z10;
        String str2;
        String sb2;
        n0(com.theinnerhour.b2b.R.id.cvDBLibraryCard).setVisibility(0);
        ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setVisibility(8);
        ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_allie_bot);
        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvFloatingActionButton)).setText(getString(com.theinnerhour.b2b.R.string.libraryBottomNavBot));
        ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).setVisibility(0);
        if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
            ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_premium).setVisible(true);
        }
        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clLearningHub)).setVisibility(8);
        LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
        if (!kotlin.jvm.internal.i.b(locationPersistence.getCurrentCountry(), "")) {
            C1();
        } else {
            locationPersistence.fetchLocationInfo(new g0());
        }
        n0(com.theinnerhour.b2b.R.id.cvDBLibraryCard).setOnClickListener(new dl.e0(this, 20));
        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setImageTintList(null);
        com.bumptech.glide.f d10 = Glide.c(this).d(this);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getProfile_path();
        } else {
            str = null;
        }
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            sb2 = "https://assets.theinnerhour.com/avatar/avatar_flower_1.png";
        } else {
            StringBuilder sb3 = new StringBuilder("https://");
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
                str2 = user2.getProfile_path();
            } else {
                str2 = null;
            }
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        d10.p(sb2).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification));
        if (ApplicationPersistence.getInstance().getBooleanValue(Constants.IS_OLD_PROFILE, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
            n0(com.theinnerhour.b2b.R.id.layoutProfileToolTip).setVisibility(0);
            n0(com.theinnerhour.b2b.R.id.layoutProfileToolTip).setOnClickListener(new dl.e0(this, 21));
            ApplicationPersistence.getInstance().setBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, true);
            gk.a.b(null, "new_profile_db_pop_shown");
        }
        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.e0(this, 22));
    }

    public final void C1() {
        try {
            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(0).setChecked(true);
            if (LocationPersistence.INSTANCE.isIndianUser()) {
                MenuItem item = ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(3);
                Object obj = g0.a.f16164a;
                item.setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_consult));
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(3).setTitle("Experts");
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(4).setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_goals));
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(4).setTitle("Goals");
            } else {
                MenuItem item2 = ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(3);
                Object obj2 = g0.a.f16164a;
                item2.setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_goals));
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(3).setTitle("Goals");
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(4).setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_premium));
                ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu().getItem(4).setTitle("Premium");
            }
            v0();
            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).setOnNavigationItemSelectedListener(this.f10732k1);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void D0() {
        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
        if (subscriptionPersistence.getSubscriptionEnabled() && !ApplicationPersistence.getInstance().containsKey("subscription_start")) {
            ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
        } else if (!subscriptionPersistence.getSubscriptionEnabled()) {
            if (ApplicationPersistence.getInstance().containsKey("subscription_start")) {
                if (Calendar.getInstance().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue("subscription_start") > 604800000) {
                    startActivity(new Intent(this, PlanExpiryInfoActivity.class));
                }
                ApplicationPersistence.getInstance().deleteKey("subscription_start");
                ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.FALSE);
            }
            B0();
        }
    }

    public final void D1() {
        try {
            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
            ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanWeek)).setLayoutManager(new LinearLayoutManager(this, 1, false));
            g1();
            dl.e0 e0Var = new dl.e0(this, 27);
            RobertoTextView robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardWeek);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(e0Var);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanMultiCardWeek);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(e0Var);
            }
            View n02 = n0(com.theinnerhour.b2b.R.id.viewSwitchAssessmentAndWeekBG);
            if (n02 != null) {
                n02.setOnClickListener(e0Var);
            }
            BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanExperimentWeekSwitcherLayout));
            from.setPeekHeight(0);
            from.setState(4);
            from.addBottomSheetCallback(new h0());
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeekContainer)).setOnClickListener(new dl.e0(this, 28));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    @Override // xk.a
    public final void E(Bundle bundle, String str) {
        boolean z10;
        Intent putExtra = new Intent(this, CommunitiesPwaActivity.class).putExtra("redirect_url", str);
        kotlin.jvm.internal.i.f(putExtra, "Intent(this@V3DashboardA…direct_url\", overrideUrl)");
        if (bundle != null) {
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                putExtra.putExtras(bundle);
            }
        }
        this.E0.a(putExtra);
    }

    public final void E0() {
        try {
            V3DashboardUtils v3DashboardUtils = this.B;
            FrameLayout flDynamicCards = (FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards);
            kotlin.jvm.internal.i.f(flDynamicCards, "flDynamicCards");
            v3DashboardUtils.h(flDynamicCards, N0(), this.N);
            km.d dVar = this.Y0;
            if (dVar != null) {
                dVar.k(false);
            }
            w0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Exception", e10);
        }
    }

    public final void E1(boolean z10) {
        if (kotlin.jvm.internal.i.b(this.L0, "default")) {
            if (this.I0) {
                if (z10) {
                    Extensions extensions = Extensions.INSTANCE;
                    ProgressBar learningHubExperimentProgress = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubExperimentProgress);
                    kotlin.jvm.internal.i.f(learningHubExperimentProgress, "learningHubExperimentProgress");
                    extensions.visible(learningHubExperimentProgress);
                    RobertoTextView tvLearningHubExperiment = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHubExperiment);
                    kotlin.jvm.internal.i.f(tvLearningHubExperiment, "tvLearningHubExperiment");
                    extensions.gone(tvLearningHubExperiment);
                    HorizontalScrollView hsLearningHubExperiment = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHubExperiment);
                    kotlin.jvm.internal.i.f(hsLearningHubExperiment, "hsLearningHubExperiment");
                    extensions.gone(hsLearningHubExperiment);
                    RobertoButton buttonLearningHubExperiment = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHubExperiment);
                    kotlin.jvm.internal.i.f(buttonLearningHubExperiment, "buttonLearningHubExperiment");
                    extensions.gone(buttonLearningHubExperiment);
                    return;
                }
                Extensions extensions2 = Extensions.INSTANCE;
                ProgressBar learningHubExperimentProgress2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubExperimentProgress);
                kotlin.jvm.internal.i.f(learningHubExperimentProgress2, "learningHubExperimentProgress");
                extensions2.gone(learningHubExperimentProgress2);
                RobertoTextView tvLearningHubExperiment2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHubExperiment);
                kotlin.jvm.internal.i.f(tvLearningHubExperiment2, "tvLearningHubExperiment");
                extensions2.visible(tvLearningHubExperiment2);
                HorizontalScrollView hsLearningHubExperiment2 = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHubExperiment);
                kotlin.jvm.internal.i.f(hsLearningHubExperiment2, "hsLearningHubExperiment");
                extensions2.visible(hsLearningHubExperiment2);
                RobertoButton buttonLearningHubExperiment2 = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHubExperiment);
                kotlin.jvm.internal.i.f(buttonLearningHubExperiment2, "buttonLearningHubExperiment");
                extensions2.visible(buttonLearningHubExperiment2);
            } else if (z10) {
                Extensions extensions3 = Extensions.INSTANCE;
                ProgressBar learningHubProgress = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubProgress);
                kotlin.jvm.internal.i.f(learningHubProgress, "learningHubProgress");
                extensions3.visible(learningHubProgress);
                RobertoTextView tvLearningHub = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHub);
                kotlin.jvm.internal.i.f(tvLearningHub, "tvLearningHub");
                extensions3.gone(tvLearningHub);
                HorizontalScrollView hsLearningHub = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHub);
                kotlin.jvm.internal.i.f(hsLearningHub, "hsLearningHub");
                extensions3.gone(hsLearningHub);
                RobertoButton buttonLearningHub = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub);
                kotlin.jvm.internal.i.f(buttonLearningHub, "buttonLearningHub");
                extensions3.gone(buttonLearningHub);
            } else {
                Extensions extensions4 = Extensions.INSTANCE;
                ProgressBar learningHubProgress2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.learningHubProgress);
                kotlin.jvm.internal.i.f(learningHubProgress2, "learningHubProgress");
                extensions4.gone(learningHubProgress2);
                RobertoTextView tvLearningHub2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvLearningHub);
                kotlin.jvm.internal.i.f(tvLearningHub2, "tvLearningHub");
                extensions4.visible(tvLearningHub2);
                HorizontalScrollView hsLearningHub2 = (HorizontalScrollView) n0(com.theinnerhour.b2b.R.id.hsLearningHub);
                kotlin.jvm.internal.i.f(hsLearningHub2, "hsLearningHub");
                extensions4.visible(hsLearningHub2);
                RobertoButton buttonLearningHub2 = (RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub);
                kotlin.jvm.internal.i.f(buttonLearningHub2, "buttonLearningHub");
                extensions4.visible(buttonLearningHub2);
            }
        }
    }

    public final void F0(ConstraintLayout constraintLayout, Integer num) {
        try {
            constraintLayout.setOnClickListener(DebouncedOnClickListener.wrap(new j1(this, 13, num)));
            constraintLayout.setAlpha(0.34f);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "exception in load course data", e10);
        }
    }

    public final void F1(boolean z10) {
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

    public final void G0() {
        ConstraintLayout constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.providerBookBottomSheet);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        km.d dVar = this.Y0;
        if (dVar != null) {
            ta.v.H(kc.f.H(dVar), null, 0, new km.b(dVar, null), 3);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.innerContainer);
        if (constraintLayout2 != null) {
            constraintLayout2.setPaddingRelative(0, 0, 0, 0);
        }
    }

    public final void G1(boolean z10) {
        wn.b.f36765a.getClass();
        if (wn.b.f36769e != wn.j.COMPLETED) {
            this.Z = new hs.f<>(Boolean.TRUE, Boolean.valueOf(z10));
            return;
        }
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs).isVisible();
        boolean z11 = false;
        ((FrameLayout) n0(com.theinnerhour.b2b.R.id.containerFrame)).setVisibility(0);
        tn.b bVar = new tn.b();
        androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        RoutingType routingType = null;
        aVar.f(com.theinnerhour.b2b.R.id.containerFrame, bVar, null);
        aVar.k();
        bVar.f33331v = this;
        if (z10) {
            gk.a.b(null, "new_moodtracker_dashboard_popup_shown");
            n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setVisibility(0);
            n0(com.theinnerhour.b2b.R.id.cvDailyPlanBookmarkingToolTip).setOnTouchListener(new w5.h0(3));
            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMoodToolTipCancel)).setOnClickListener(new dl.e0(this, 29));
            new Handler(Looper.getMainLooper()).postDelayed(new dl.v(this, 5), 500L);
            return;
        }
        RoutingIntentHandler d10 = P0().X.d();
        if (d10 != null) {
            routingType = d10.getRoutingType();
        }
        if (routingType == RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL) {
            RoutingIntentHandler d11 = P0().X.d();
            if (d11 != null && !d11.isRoutingCompleted()) {
                z11 = true;
            }
            if (z11) {
                ((ScrollView) n0(com.theinnerhour.b2b.R.id.scrollView2)).post(new dl.v(this, 6));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103 A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117 A[Catch: Exception -> 0x0173, TRY_ENTER, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164 A[Catch: Exception -> 0x0173, TryCatch #0 {Exception -> 0x0173, blocks: (B:3:0x0003, B:5:0x001d, B:8:0x0023, B:10:0x0027, B:23:0x0050, B:30:0x0075, B:32:0x0086, B:35:0x00d9, B:37:0x00e1, B:39:0x00e7, B:44:0x00f4, B:45:0x00f7, B:47:0x0103, B:49:0x0109, B:52:0x0117, B:61:0x0136, B:63:0x013c, B:65:0x0142, B:69:0x014c, B:71:0x015f, B:73:0x0164, B:74:0x0168, B:75:0x016d, B:53:0x011d, B:55:0x0123, B:57:0x0129, B:60:0x0131, B:33:0x00af, B:26:0x0068, B:13:0x0037, B:15:0x003d, B:17:0x0043), top: B:80:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0(ProviderDetailHolderModel providerDetailHolderModel, boolean z10) {
        int i6;
        String str;
        ArrayList<Testimonials> testimonials;
        Bundle bundle;
        String providerType;
        String str2;
        User user;
        String str3;
        int i10;
        ArrayList<Testimonials> testimonials2;
        AddonProfileDetails addonProfileDetails;
        int i11;
        RecyclerView.m layoutManager;
        ArrayList<Testimonials> testimonials3;
        int i12;
        String str4;
        ArrayList<Testimonials> testimonials4;
        km.d dVar;
        try {
            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clProviderVideoViewParentContainer)).setState(4);
            ConstraintLayout constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.innerContainer);
            int i13 = 0;
            if (constraintLayout != null) {
                constraintLayout.setPaddingRelative(0, 0, 0, 0);
            }
            LinearLayoutManager linearLayoutManager = null;
            if (!z10 && (dVar = this.Y0) != null) {
                ta.v.H(kc.f.H(dVar), null, 0, new km.c(dVar, null), 3);
            }
            if (!z10) {
                AddonProfileDetails addonProfileDetails2 = providerDetailHolderModel.getAddonProfileDetails();
                if (addonProfileDetails2 != null && (testimonials = addonProfileDetails2.getTestimonials()) != null) {
                    i6 = testimonials.size();
                } else {
                    i6 = 0;
                }
                if (i6 > 0) {
                    str = "provider_testimonial_dialog_dismiss";
                    String str5 = gk.a.f16573a;
                    bundle = new Bundle();
                    providerType = providerDetailHolderModel.getProviderType();
                    if (!kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
                        str2 = "couples";
                    } else if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
                        str2 = "therapy";
                    } else {
                        str2 = "psychiatry";
                    }
                    bundle.putString("flow", str2);
                    if (!kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                        bundle.putString("psychiatrist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
                        bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                    } else {
                        bundle.putString("therapist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
                        bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                    }
                    if (!z10) {
                        AddonProfileDetails addonProfileDetails3 = providerDetailHolderModel.getAddonProfileDetails();
                        if (addonProfileDetails3 != null && (testimonials4 = addonProfileDetails3.getTestimonials()) != null) {
                            i12 = testimonials4.size();
                        } else {
                            i12 = 0;
                        }
                        if (i12 > 0) {
                            str4 = "in_app_testimonial";
                        } else {
                            str4 = "in_app_video_testimonial_fallback";
                        }
                        bundle.putString("source", str4);
                    }
                    user = FirebasePersistence.getInstance().getUser();
                    if (user == null) {
                        str3 = user.getCurrentCourseName();
                    } else {
                        str3 = null;
                    }
                    bundle.putString("domain", str3);
                    bundle.putString("platform", "android_app");
                    if (!z10) {
                        bundle.putString("reason", "video");
                    } else {
                        AddonProfileDetails addonProfileDetails4 = providerDetailHolderModel.getAddonProfileDetails();
                        if (addonProfileDetails4 != null && (testimonials2 = addonProfileDetails4.getTestimonials()) != null) {
                            i10 = testimonials2.size();
                        } else {
                            i10 = 0;
                        }
                        if (i10 <= 0) {
                            bundle.putString("reason", "testimonial");
                        }
                    }
                    addonProfileDetails = providerDetailHolderModel.getAddonProfileDetails();
                    if (addonProfileDetails == null && (testimonials3 = addonProfileDetails.getTestimonials()) != null) {
                        i11 = testimonials3.size();
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0 && !z10) {
                        layoutManager = ((RecyclerView) findViewById(com.theinnerhour.b2b.R.id.rvProviderVideoViewTestimonial)).getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                        }
                        if (linearLayoutManager != null) {
                            i13 = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        }
                        bundle.putInt(Constants.DAYMODEL_POSITION, i13 + 1);
                    }
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, str);
                }
            }
            str = "in_app_fallback_sheet_dismiss";
            String str52 = gk.a.f16573a;
            bundle = new Bundle();
            providerType = providerDetailHolderModel.getProviderType();
            if (!kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
            }
            bundle.putString("flow", str2);
            if (!kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
            }
            if (!z10) {
            }
            user = FirebasePersistence.getInstance().getUser();
            if (user == null) {
            }
            bundle.putString("domain", str3);
            bundle.putString("platform", "android_app");
            if (!z10) {
            }
            addonProfileDetails = providerDetailHolderModel.getAddonProfileDetails();
            if (addonProfileDetails == null) {
            }
            i11 = 0;
            if (i11 > 0) {
                layoutManager = ((RecyclerView) findViewById(com.theinnerhour.b2b.R.id.rvProviderVideoViewTestimonial)).getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                }
                if (linearLayoutManager != null) {
                }
                bundle.putInt(Constants.DAYMODEL_POSITION, i13 + 1);
            }
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle, str);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    public final void H1(String str, String str2) {
        yn.a aVar = this.f10753x0;
        aVar.getClass();
        if (!yn.a.b()) {
            hs.f<Boolean, Boolean> a10 = aVar.a(false);
            if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = new NotificationPermissionBottomSheet(str2, a10, str, this.f10753x0, new i0(xVar));
                androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                l2.f2205p = true;
                l2.e(0, (Fragment) xVar.f23469u, "permission", 1);
                l2.k();
            }
        }
    }

    public final void I0() {
        ArrayList<CustomCoachMark> arrayList = this.e0;
        try {
            if (arrayList.size() == 0) {
                return;
            }
            arrayList.get(0).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "error in displayCoachMark", e10);
        }
    }

    public final void I1() {
        boolean z10;
        if (this.f10755y0 && this.J0 != null) {
            ml.c0 P0 = P0();
            j0 j0Var = new j0();
            try {
                boolean z11 = true;
                if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
                    j0Var.invoke(Boolean.FALSE);
                    return;
                }
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = false;
                }
                j0Var.invoke(Boolean.valueOf(z11));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(P0.A, e10);
            }
        }
    }

    public final void J0() {
        if (kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), "")) {
            if (this.J0 != null) {
                P0().S = true;
                P0().V = new i();
            }
            if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clMiniCourses)).setVisibility(0);
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setAdapter(new i1(this));
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                return;
            }
            return;
        }
        if (this.J0 != null) {
            P0().S = false;
        }
        MiniCoursesViewModel miniCoursesViewModel = this.F;
        if (miniCoursesViewModel != null) {
            V0().f(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        } else if (miniCoursesViewModel != null) {
            J0();
        } else {
            MiniCoursesViewModel miniCoursesViewModel2 = (MiniCoursesViewModel) new o0(this).a(MiniCoursesViewModel.class);
            kotlin.jvm.internal.i.g(miniCoursesViewModel2, "<set-?>");
            this.F = miniCoursesViewModel2;
            V0().f11379z.e(this, new dk.a(24, new r1(this)));
            J0();
        }
    }

    public final void J1(int i6) {
        try {
            this.f10754y = i6;
            c1(null);
            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
            h1(Integer.valueOf(i6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "exception in load course data", e10);
        }
    }

    public final boolean K0() {
        return this.f10715a0;
    }

    public final void K1() {
        String stringExtra = getIntent().getStringExtra(Constants.LINK_TYPE);
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1182791039) {
                if (hashCode != -643221994) {
                    if (hashCode == -503392131 && stringExtra.equals(Constants.APP_PSYCH_APPOINTMENT)) {
                        startActivity(new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, getIntent().getStringExtra(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_PSYCHIATRY));
                    }
                } else if (stringExtra.equals(Constants.SELLING_SCREEN_TEST)) {
                    this.C0 = getIntent().getStringExtra(Constants.LINK_ID);
                    z1(true);
                }
            } else if (stringExtra.equals(Constants.APP_APPOINTMENT)) {
                startActivity(new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, getIntent().getStringExtra(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_THERAPY));
            }
        }
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

    public final int L0() {
        return this.L;
    }

    public final void L1(boolean z10) {
        String str;
        int i6;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            String str2 = null;
            if (user != null) {
                str = user.getCurrentCourse();
            } else {
                str = null;
            }
            if (str == null) {
                startActivity(tr.r.r(this));
                finish();
                return;
            }
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
                str2 = user2.getCurrentCourse();
            }
            Course courseById = firebasePersistence.getCourseById(str2);
            if (courseById != null) {
                this.f10752x = courseById;
                Integer dayPlanPositionForDateV3 = CourseUtilKt.getDayPlanPositionForDateV3(N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                V3DashboardUtils v3DashboardUtils = this.B;
                kotlin.jvm.internal.i.d(dayPlanPositionForDateV3);
                int intValue = dayPlanPositionForDateV3.intValue();
                v3DashboardUtils.getClass();
                if (intValue < 8) {
                    i6 = 1;
                } else if (intValue < 15) {
                    i6 = 2;
                } else if (intValue < 23) {
                    i6 = 3;
                } else {
                    i6 = 4;
                }
                this.f10756z = i6;
                this.f10754y = i6;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Exception", e10);
        }
    }

    public final int M0() {
        return this.J;
    }

    public final Course N0() {
        Course course = this.f10752x;
        if (course != null) {
            return course;
        }
        kotlin.jvm.internal.i.q("course");
        throw null;
    }

    public final CourseDayModelV1 O0() {
        return this.C;
    }

    public final ml.c0 P0() {
        ml.c0 c0Var = this.J0;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.i.q("dashboardViewModel");
        throw null;
    }

    public final FeedBackUtils Q0() {
        return this.H;
    }

    public final int R0() {
        return this.N;
    }

    public final jm.c S0() {
        return (jm.c) this.f10716a1.getValue();
    }

    public final ArrayList<LearningHubModel> T0() {
        return this.V;
    }

    public final List<MiniCourse> U0() {
        List<MiniCourse> list = this.G;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("miniCourseList");
        throw null;
    }

    public final MiniCoursesViewModel V0() {
        MiniCoursesViewModel miniCoursesViewModel = this.F;
        if (miniCoursesViewModel != null) {
            return miniCoursesViewModel;
        }
        kotlin.jvm.internal.i.q("miniCourseViewModel");
        throw null;
    }

    public final String W0() {
        return this.f10748v;
    }

    public final void X0(String str) {
        FirebasePersistence firebasePersistence;
        Course course;
        ArrayList<CourseDayModelV1> planV3;
        CourseDayModelV1 courseDayModelV1;
        String currentCourse;
        try {
            int hashCode = str.hashCode();
            pp.c cVar = pp.c.CROSS_PROVIDER;
            int i6 = this.P;
            if (hashCode != -1349555095) {
                if (hashCode != -1060898616) {
                    if (hashCode == 3444122 && str.equals("plus") && (firebasePersistence = FirebasePersistence.getInstance()) != null) {
                        User user = firebasePersistence.getUser();
                        if (user != null && (currentCourse = user.getCurrentCourse()) != null) {
                            course = firebasePersistence.getCourseById(currentCourse);
                        } else {
                            course = null;
                        }
                        if (course != null && (planV3 = course.getPlanV3()) != null && (courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3)) != null) {
                            t0(courseDayModelV1);
                        }
                    }
                } else if (str.equals("psychiatry")) {
                    Intent intent = new Intent(this, TelecommunicationsPWAActivity.class);
                    intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                    intent.putExtra("providerType", "psychiatrist");
                    startActivityForResult(intent, i6);
                }
            } else if (str.equals("therapy")) {
                Intent intent2 = new Intent(this, TelecommunicationsPWAActivity.class);
                intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                intent2.putExtra("providerType", "therapist");
                startActivityForResult(intent2, i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void Y0(String str) {
        FirebasePersistence firebasePersistence;
        ArrayList<CourseDayModelV1> planV3;
        CourseDayModelV1 courseDayModelV1;
        String currentCourse;
        hs.k kVar;
        String stringExtra;
        String str2;
        int hashCode = str.hashCode();
        Course course = null;
        String str3 = null;
        String str4 = null;
        course = null;
        if (hashCode != -1691391916) {
            pp.c cVar = pp.c.DB_FILTER_APPLIED;
            int i6 = this.P;
            if (hashCode != -650791023) {
                if (hashCode == 875077159 && str.equals("professional")) {
                    Intent putExtra = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str3 = user.getCurrentCourseName();
                    }
                    startActivityForResult(putExtra.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str3)), i6);
                }
            } else if (str.equals("professional_profile")) {
                Intent intent = getIntent();
                if (intent != null && (stringExtra = intent.getStringExtra(SessionManager.KEY_UUID)) != null) {
                    Intent putExtra2 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.A3_FILTER_APPLIED_PROFILE).putExtra(SessionManager.KEY_UUID, stringExtra);
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str2 = user2.getCurrentCourseName();
                    } else {
                        str2 = null;
                    }
                    startActivityForResult(putExtra2.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str2)), i6);
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    Intent putExtra3 = new Intent(this, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str4 = user3.getCurrentCourseName();
                    }
                    startActivityForResult(putExtra3.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str4)), i6);
                }
            }
        } else if (str.equals("self_help") && (firebasePersistence = FirebasePersistence.getInstance()) != null) {
            User user4 = firebasePersistence.getUser();
            if (user4 != null && (currentCourse = user4.getCurrentCourse()) != null) {
                course = firebasePersistence.getCourseById(currentCourse);
            }
            if (course != null && (planV3 = course.getPlanV3()) != null && (courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3)) != null) {
                t0(courseDayModelV1);
            }
        }
    }

    public final void Z0() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, com.theinnerhour.b2b.R.anim.slide_fade_out_right);
            loadAnimation.setAnimationListener(new j());
            ConstraintLayout constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.dayPlanContainer);
            if (constraintLayout != null) {
                constraintLayout.startAnimation(loadAnimation);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:45|(1:47)(1:110)|48|(1:50)|51|(1:55)|56|(1:60)|61|(18:68|69|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)(1:108)|85|(1:87)(1:107)|88|(3:90|(1:92)|93)|94|95|96|97|(2:99|101)(1:103))|109|69|(3:71|73|75)|76|(0)|79|(0)|82|(0)(0)|85|(0)(0)|88|(0)|94|95|96|97|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03bd, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r3.A, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0376 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c8 A[Catch: Exception -> 0x03db, TRY_LEAVE, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118 A[Catch: Exception -> 0x0120, TRY_LEAVE, TryCatch #0 {Exception -> 0x0120, blocks: (B:45:0x0114, B:47:0x0118), top: B:117:0x0114, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c3 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d8 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033c A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369 A[Catch: Exception -> 0x03db, TryCatch #2 {Exception -> 0x03db, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001c, B:9:0x0022, B:12:0x002a, B:14:0x0030, B:16:0x0038, B:21:0x0044, B:23:0x0054, B:24:0x005e, B:26:0x0080, B:27:0x008c, B:29:0x00ab, B:30:0x00bc, B:32:0x00c3, B:40:0x00ec, B:42:0x0100, B:50:0x0121, B:52:0x0128, B:54:0x0151, B:56:0x0168, B:58:0x0170, B:59:0x0173, B:61:0x017c, B:63:0x0184, B:64:0x0187, B:66:0x018d, B:68:0x0195, B:69:0x0198, B:71:0x01e7, B:73:0x01f9, B:76:0x0202, B:78:0x0247, B:80:0x025a, B:82:0x0266, B:84:0x0270, B:85:0x0294, B:87:0x02c3, B:88:0x02cd, B:90:0x02d8, B:91:0x02e2, B:95:0x033f, B:97:0x0369, B:99:0x036f, B:101:0x0376, B:103:0x0394, B:104:0x0397, B:105:0x03a9, B:110:0x03c4, B:112:0x03c8, B:109:0x03bd, B:94:0x033c, B:77:0x0231, B:55:0x0165, B:35:0x00d4, B:36:0x00dc, B:39:0x00e5, B:45:0x0114, B:47:0x0118, B:106:0x03ad), top: B:121:0x000c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(boolean z10) {
        long j10;
        RobertoTextView robertoTextView;
        AppCompatImageView appCompatImageView;
        View n02;
        ArrayList k10;
        User user;
        String str;
        String stringExtra;
        String stringExtra2;
        Course course;
        ArrayList<CourseDayModelV1> planV3;
        CourseDayModelV1 courseDayModelV1;
        String currentCourse;
        hs.i iVar = this.X;
        String str2 = this.f10748v;
        try {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            if (firebasePersistence != null) {
                User user2 = firebasePersistence.getUser();
                if (user2 != null && (currentCourse = user2.getCurrentCourse()) != null) {
                    course = firebasePersistence.getCourseById(currentCourse);
                } else {
                    course = null;
                }
                if (course != null && (planV3 = course.getPlanV3()) != null && (courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3)) != null) {
                    j10 = courseDayModelV1.getStart_date();
                    if (j10 != 0 && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                        startActivity(new Intent(this, DeeplinkCodeActivationActivity.class));
                    }
                    V3DashboardUtils v3DashboardUtils = this.B;
                    v3DashboardUtils.getClass();
                    v3DashboardUtils.f10900b = this;
                    this.H.setActivity(this);
                    L1(true);
                    if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
                        this.C0 = getIntent().getStringExtra(Constants.LINK_ID);
                    }
                    LocationPersistence.INSTANCE.fetchLocationInfo(new l(z10));
                    b1();
                    e1();
                    E0();
                    d1();
                    if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.imgDbNotification)).setOnClickListener(new dl.e0(this, 4));
                    }
                    if (this.f10752x == null) {
                        String courseName = N0().getCourseName();
                        RobertoTextView robertoTextView2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(Constants.getCourseDisplayName(courseName));
                        }
                    } else {
                        RobertoTextView robertoTextView3 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setText(Constants.getCourseDisplayName(""));
                        }
                    }
                    A0();
                    J0();
                    w1();
                    o1();
                    if (!kotlin.jvm.internal.i.b(this.L0, "default") && ApplicationPersistence.getInstance().getLongValue(Constants.FETCH_LIBRARY_CONTENT_ON_DB_TIME) < Utils.INSTANCE.getTodayTimeInSeconds()) {
                        try {
                            if (this.J0 != null) {
                                P0().i();
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(str2, e10);
                        }
                    }
                    if (!z10) {
                        y1();
                        xn.a aVar = (xn.a) iVar.getValue();
                        aVar.f37863x.e(this, new dk.a(25, new m(aVar)));
                        ((xn.a) iVar.getValue()).getClass();
                        if (xn.a.f()) {
                            this.Y++;
                            ((xn.a) iVar.getValue()).e();
                            gk.a.b(null, "moodtracker_data_backup_start");
                        } else {
                            G1(false);
                        }
                        if (!kotlin.jvm.internal.i.b(this.L0, "default")) {
                            B1();
                        }
                        B0();
                        Intent intent = getIntent();
                        if (intent != null && (stringExtra2 = intent.getStringExtra(Constants.OFFERING_FLOW_FLAG)) != null) {
                            X0(stringExtra2);
                        }
                        Intent intent2 = getIntent();
                        if (intent2 != null && (stringExtra = intent2.getStringExtra(Constants.A3_OFFERING_FLOW_FLAG)) != null) {
                            Y0(stringExtra);
                        }
                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewShareButton)).setOnClickListener(new dl.e0(this, 9));
                        ((RobertoButton) n0(com.theinnerhour.b2b.R.id.appReviewRateButton)).setOnClickListener(new dl.e0(this, 10));
                        ((FloatingActionButton) n0(com.theinnerhour.b2b.R.id.floatingActionButton)).setOnClickListener(new dl.e0(this, 11));
                        if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE) && LocationPersistence.INSTANCE.isIndianUser()) {
                            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3).setIcon(a.c.b(this, com.theinnerhour.b2b.R.drawable.ic_experts_b2b));
                            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3).setTitle("Experts");
                            u0(this);
                            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.f10728i1);
                            if (kotlin.jvm.internal.i.b(this.L0, "default") && ApplicationPersistence.getInstance().getBooleanValue(Constants.IS_OLD_PROFILE, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
                                n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setVisibility(0);
                                n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setOnClickListener(new dl.e0(this, 12));
                                ApplicationPersistence.getInstance().setBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, true);
                                gk.a.b(null, "new_profile_db_pop_shown");
                            }
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.e0(this, 13));
                            n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.e0(this, 14));
                            robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardWeek);
                            if (robertoTextView != null) {
                                robertoTextView.setOnClickListener(new dl.e0(this, 15));
                            }
                            appCompatImageView = (AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanMultiCardWeek);
                            if (appCompatImageView != null) {
                                appCompatImageView.setOnClickListener(new dl.e0(this, 16));
                            }
                            ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.e0(this, 5));
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.e0(this, 6));
                            n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.e0(this, 7));
                            Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
                            n02 = n0(com.theinnerhour.b2b.R.id.PlanExperimentWeekSwitcherLayout);
                            if (n02 == null) {
                                n02.setVisibility(0);
                            }
                            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
                            k10 = ca.a.k("v2.2", "v2.21", "v2.3", Constants.USER_VERSION);
                            user = FirebasePersistence.getInstance().getUser();
                            if (user == null) {
                                str = user.getVersion();
                            } else {
                                str = null;
                            }
                            if (is.u.Z1(k10, str)) {
                                dl.e0 e0Var = new dl.e0(this, 8);
                                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCard)).setOnClickListener(e0Var);
                                ConstraintLayout constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clTopicalCardContainerB2B);
                                if (constraintLayout != null) {
                                    constraintLayout.setOnClickListener(e0Var);
                                }
                                ml.c0 P0 = P0();
                                ta.v.H(kc.f.H(P0), kotlinx.coroutines.o0.f23642c, 0, new ml.i0(P0, null), 2);
                            }
                            ml.c0 P02 = P0();
                            ta.v.H(kc.f.H(P02), kotlinx.coroutines.o0.f23642c, 0, new ml.k0(P02, null), 2);
                            if (!this.O0) {
                                k1();
                                ApplicationPersistence.getInstance().setLongValue("journal_question_time", Utils.INSTANCE.getTodayTimeInSeconds());
                                return;
                            }
                            return;
                        }
                        ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(3).setTitle("Premium");
                        u0(this);
                        ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).setOnNavigationItemSelectedListener(this.f10728i1);
                        if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                            n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setVisibility(0);
                            n0(com.theinnerhour.b2b.R.id.layoutProfileBottomToolTip).setOnClickListener(new dl.e0(this, 12));
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, true);
                            gk.a.b(null, "new_profile_db_pop_shown");
                        }
                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.weekSwitcherLayout)).setOnClickListener(new dl.e0(this, 13));
                        n0(com.theinnerhour.b2b.R.id.viewSwitchWeekBG).setOnClickListener(new dl.e0(this, 14));
                        robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardWeek);
                        if (robertoTextView != null) {
                        }
                        appCompatImageView = (AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanMultiCardWeek);
                        if (appCompatImageView != null) {
                        }
                        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse)).setOnClickListener(new dl.e0(this, 5));
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivSwitchCourse)).setOnClickListener(new dl.e0(this, 6));
                        n0(com.theinnerhour.b2b.R.id.viewSwitchCourseBG).setOnClickListener(new dl.e0(this, 7));
                        Glide.c(this).d(this).o(Integer.valueOf((int) com.theinnerhour.b2b.R.drawable.ic_dashboard_activities_bg)).B((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivMyPlan));
                        n02 = n0(com.theinnerhour.b2b.R.id.PlanExperimentWeekSwitcherLayout);
                        if (n02 == null) {
                        }
                        BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanExperimentWeekSwitcherLayout)).setState(4);
                        k10 = ca.a.k("v2.2", "v2.21", "v2.3", Constants.USER_VERSION);
                        user = FirebasePersistence.getInstance().getUser();
                        if (user == null) {
                        }
                        if (is.u.Z1(k10, str)) {
                        }
                        ml.c0 P022 = P0();
                        ta.v.H(kc.f.H(P022), kotlinx.coroutines.o0.f23642c, 0, new ml.k0(P022, null), 2);
                        if (!this.O0) {
                        }
                    } else {
                        return;
                    }
                }
            }
            j10 = 0;
            if (j10 != 0) {
                startActivity(new Intent(this, DeeplinkCodeActivationActivity.class));
            }
            V3DashboardUtils v3DashboardUtils2 = this.B;
            v3DashboardUtils2.getClass();
            v3DashboardUtils2.f10900b = this;
            this.H.setActivity(this);
            L1(true);
            if (kotlin.jvm.internal.i.b(getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
            }
            LocationPersistence.INSTANCE.fetchLocationInfo(new l(z10));
            b1();
            e1();
            E0();
            d1();
            if (kotlin.jvm.internal.i.b(this.L0, "default")) {
            }
            if (this.f10752x == null) {
            }
            A0();
            J0();
            w1();
            o1();
            if (!kotlin.jvm.internal.i.b(this.L0, "default")) {
                if (this.J0 != null) {
                }
            }
            if (!z10) {
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }

    public final void b1() {
        try {
            ym.c cVar = (ym.c) new o0(this, new kk.c(N0())).a(ym.c.class);
            this.W = cVar;
            if (cVar != null) {
                cVar.f();
                E1(true);
                ym.c cVar2 = this.W;
                if (cVar2 != null) {
                    cVar2.f38687y.e(this, new dk.a(29, new n()));
                    return;
                } else {
                    kotlin.jvm.internal.i.q("learningHubViewModel");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("learningHubViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.a
    public final void c(MenuItem p02) {
        boolean z10;
        String str;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(p02, "p0");
        int itemId = p02.getItemId();
        boolean z11 = false;
        int i6 = this.N;
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
            case com.theinnerhour.b2b.R.id.nav_dashboard_logs_library /* 2131365039 */:
                startActivity(new Intent(this, LibraryScreenLogsActivity.class));
                Bundle bundle = new Bundle();
                bundle.putString("source", "side_menu");
                UtilsKt.fireAnalytics("dashboard_library_logs_click", bundle);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_logs_main /* 2131365040 */:
                Intent intent3 = new Intent(this, ScreenLogsActivity.class);
                intent3.putExtra("logType", a.EnumC0358a.MAIN_PLAN_LOGS);
                startActivity(intent3);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_premium /* 2131365041 */:
                String str2 = gk.a.f16573a;
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("source", "side_menu");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(analyticsBundle, "premium_click ");
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "plus")) {
                    Extensions.INSTANCE.toast(this, "Congrats, you already have a subscription", 1);
                    break;
                } else {
                    startActivityForResult(tr.r.s(this, false).putExtra("source", "side_menu").putExtra(Constants.CAMPAIGN_ID, this.C0), i6);
                    break;
                }
            case com.theinnerhour.b2b.R.id.nav_dashboard_rate_us /* 2131365042 */:
                Dialog showFeedbackPopup = this.H.showFeedbackPopup(Constants.FEEDBACK_TOP_MENU);
                if (showFeedbackPopup != null) {
                    showFeedbackPopup.show();
                }
                UtilsKt.fireAnalytics("dashboard_feedback_menu_click", UtilsKt.getAnalyticsBundle());
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_saved_item /* 2131365043 */:
                this.f10730j1.a(new Intent(this, BookmarkingActivity.class).putExtra("source", "side_menu"));
                AnimatorSet animatorSet = this.f10737n0;
                if (animatorSet != null) {
                    animatorSet.end();
                    animatorSet.removeAllListeners();
                    break;
                }
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_settings /* 2131365044 */:
                UtilsKt.fireAnalytics("dashboard_settings_click", UtilsKt.getAnalyticsBundle());
                startActivityForResult(new Intent(this, SettingsActivity.class), i6);
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_therapy /* 2131365045 */:
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
                }
                analyticsBundle2.putBoolean("disclaimer_consent", z11);
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getVersion();
                } else {
                    str = null;
                }
                analyticsBundle2.putString("version", str);
                analyticsBundle2.putString("source", "side_menu");
                UtilsKt.fireAnalytics("dashboard_chat_click", analyticsBundle2);
                if (this.T0) {
                    startActivityForResult(new Intent(this, ExpertCareInfoActivity.class).putExtra("source", "side_nav"), i6);
                } else {
                    startActivityForResult(new Intent(this, TelecommunicationsPWAActivity.class), this.P);
                    if (ApplicationPersistence.getInstance().containsKey("offering_sessions_alert")) {
                        ApplicationPersistence.getInstance().deleteKey("offering_sessions_alert");
                        w1();
                    }
                }
                if (this.Q0) {
                    this.S0 = true;
                    break;
                }
                break;
            case com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs /* 2131365046 */:
                Intent intent4 = new Intent(this, MultiTrackerInsightsActivity.class);
                intent4.putExtra("show_logs", true);
                startActivity(intent4);
                Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                analyticsBundle3.putString("source", Constants.SCREEN_DASHBOARD);
                UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle3);
                break;
        }
        ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0442  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(Integer num) {
        boolean z10;
        Boolean bool;
        hs.f<Integer, Boolean> dayPlanPositionForDateV3SneakPeek;
        int i6;
        int i10;
        RecyclerView.e eVar;
        el.d dVar;
        Boolean bool2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        hs.f fVar;
        int size;
        B b10;
        int intValue;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i16;
        RecyclerView recyclerView;
        ProgressBar progressBar;
        int i17;
        ProgressBar progressBar2;
        int i18;
        String str;
        String string;
        String string2;
        String string3;
        int i19;
        if (this.f10752x != null) {
            if (this.f10754y != this.f10756z) {
                z10 = true;
            } else if (this.J0 != null && (bool = P0().c0) != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            if (num != null) {
                int intValue2 = num.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 15) {
                        i19 = 4;
                    } else {
                        i19 = 3;
                    }
                } else {
                    i19 = 1;
                }
                this.f10754y = i19;
                dayPlanPositionForDateV3SneakPeek = new hs.f<>(num, Boolean.FALSE);
            } else {
                int i20 = this.f10754y;
                if (i20 != this.f10756z) {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            if (i20 != 3) {
                                i6 = 29;
                            } else {
                                i6 = 22;
                            }
                        } else {
                            i6 = 14;
                        }
                    } else {
                        i6 = 7;
                    }
                    dayPlanPositionForDateV3SneakPeek = new hs.f<>(Integer.valueOf(i6), Boolean.FALSE);
                } else {
                    dayPlanPositionForDateV3SneakPeek = CourseUtilKt.getDayPlanPositionForDateV3SneakPeek(z10, N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                }
            }
            hs.f<Integer, Boolean> fVar2 = dayPlanPositionForDateV3SneakPeek;
            if (this.f10743q0) {
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                Integer E = hc.d.E(currentCourseName);
                if (E != null) {
                    i10 = E.intValue();
                } else {
                    i10 = com.theinnerhour.b2b.R.color.onboardingAssessmentDepression;
                }
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardAssessment);
                if (shimmerFrameLayout != null) {
                    shimmerFrameLayout.setVisibility(8);
                }
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardLoader);
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.setVisibility(8);
                }
                boolean Q1 = is.k.Q1(fVar2.f19464u, new Integer[]{0, 15, 30});
                Object obj = null;
                Integer num2 = fVar2.f19464u;
                if (Q1) {
                    Integer num3 = num2;
                    int intValue3 = num3.intValue();
                    if (intValue3 != 0) {
                        if (intValue3 != 15) {
                            str = "3";
                        } else {
                            str = "2";
                        }
                    } else {
                        str = "1";
                    }
                    CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.j2(num3.intValue(), N0().getPlanV3());
                    if (courseDayModelV1 != null) {
                        obj = Boolean.valueOf(courseDayModelV1.isCompleted());
                    }
                    Object obj2 = obj;
                    RobertoTextView robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardWeek);
                    if (robertoTextView != null) {
                        robertoTextView.setText("Assessment ".concat(str));
                    }
                    ((ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress)).setVisibility(8);
                    RecyclerView recyclerView2 = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    CardView cardView = (CardView) n0(com.theinnerhour.b2b.R.id.cvPlanMultiCardAssessment);
                    if (cardView != null) {
                        cardView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardAssessmentHeader);
                    if (robertoTextView2 != null) {
                        if (kotlin.jvm.internal.i.b(obj2, Boolean.TRUE)) {
                            string3 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessmentCompletedHeader);
                        } else if (num3.intValue() == 0) {
                            string3 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessment1Header);
                        } else {
                            string3 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessment2Header);
                        }
                        robertoTextView2.setText(string3);
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardAssessmentBody);
                    if (robertoTextView3 != null) {
                        if (kotlin.jvm.internal.i.b(obj2, Boolean.TRUE)) {
                            string2 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessmentCompletedBody);
                        } else {
                            int intValue4 = num3.intValue();
                            if (intValue4 != 0) {
                                if (intValue4 != 15) {
                                    string2 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessment3Body);
                                } else {
                                    string2 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessment2Body);
                                }
                            } else {
                                string2 = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessment1Body);
                            }
                        }
                        robertoTextView3.setText(string2);
                    }
                    RobertoButton robertoButton = (RobertoButton) n0(com.theinnerhour.b2b.R.id.rbPlanMultiCardAssessmentButton);
                    if (robertoButton != null) {
                        if (kotlin.jvm.internal.i.b(obj2, Boolean.TRUE)) {
                            string = getString(com.theinnerhour.b2b.R.string.dbMultiCardVariantAssessmentCompletedCta);
                        } else {
                            string = getString(com.theinnerhour.b2b.R.string.begin);
                        }
                        robertoButton.setText(string);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanMultiCardAssessment);
                    if (constraintLayout != null) {
                        constraintLayout.setBackgroundColor(g0.a.b(this, i10));
                    }
                    dl.g0 g0Var = new dl.g0(0, this, fVar2);
                    RobertoButton robertoButton2 = (RobertoButton) n0(com.theinnerhour.b2b.R.id.rbPlanMultiCardAssessmentButton);
                    if (robertoButton2 != null) {
                        robertoButton2.setOnClickListener(g0Var);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanMultiCardAssessment);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setOnClickListener(g0Var);
                    }
                } else {
                    RobertoTextView robertoTextView4 = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvPlanMultiCardWeek);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText("Week " + this.f10754y);
                    }
                    this.f10745s0 = false;
                    ProgressBar progressBar3 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(0);
                    }
                    RecyclerView recyclerView3 = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                    }
                    CardView cardView2 = (CardView) n0(com.theinnerhour.b2b.R.id.cvPlanMultiCardAssessment);
                    if (cardView2 != null) {
                        cardView2.setVisibility(8);
                    }
                    RecyclerView recyclerView4 = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                    if (recyclerView4 != null) {
                        eVar = recyclerView4.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof el.d) {
                        dVar = (el.d) eVar;
                    } else {
                        dVar = null;
                    }
                    Boolean bool3 = fVar2.f19465v;
                    if (dVar != null) {
                        int intValue5 = num2.intValue();
                        boolean booleanValue = bool3.booleanValue();
                        ArrayList<CourseDayModelV1> plan = N0().getPlanV3();
                        int i21 = this.f10754y;
                        kotlin.jvm.internal.i.g(plan, "plan");
                        dVar.f14380x = intValue5;
                        dVar.f14381y = booleanValue;
                        dVar.f14382z = z10;
                        dVar.A = plan;
                        dVar.B = i21;
                        dVar.C = i10;
                        dVar.i();
                        obj = hs.k.f19476a;
                    }
                    if (obj == null) {
                        new p().a((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler));
                        RecyclerView recyclerView5 = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                        if (recyclerView5 != null) {
                            recyclerView5.setLayoutManager(new LinearLayoutManager(this, 0, false));
                        }
                        RecyclerView recyclerView6 = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                        if (recyclerView6 != null) {
                            i13 = 30;
                            i11 = 8;
                            int i22 = i10;
                            bool2 = bool3;
                            i12 = 3;
                            recyclerView6.setAdapter(new el.d(num2.intValue(), bool3.booleanValue(), z10, N0().getPlanV3(), this.f10754y, i22, new o(this)));
                            i14 = this.f10754y;
                            if (i14 == 1) {
                                i15 = 2;
                                if (i14 != 2) {
                                    if (i14 != i12) {
                                        fVar = new hs.f(23, Integer.valueOf(i13));
                                    } else {
                                        fVar = new hs.f(16, 22);
                                    }
                                } else {
                                    fVar = new hs.f(Integer.valueOf(i11), 14);
                                }
                            } else {
                                i15 = 2;
                                fVar = new hs.f(1, 7);
                            }
                            size = N0().getPlanV3().size();
                            b10 = fVar.f19465v;
                            if (size > ((Number) b10).intValue()) {
                                List<CourseDayModelV1> B2 = is.u.B2(N0().getPlanV3(), new xs.f(((Number) fVar.f19464u).intValue(), ((Number) b10).intValue()));
                                ArrayList arrayList = new ArrayList();
                                for (CourseDayModelV1 courseDayModelV12 : B2) {
                                    String content_id = courseDayModelV12.getContent_id();
                                    if (content_id != null) {
                                        arrayList.add(content_id);
                                    }
                                }
                                FireStoreUtilsKt.fetchCourseContentDurationV3(arrayList, new q());
                            }
                            Integer num4 = num2;
                            intValue = num4.intValue();
                            if (1 > intValue && intValue < 8) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                i16 = num4.intValue() - 1;
                            } else {
                                if (8 <= intValue && intValue < 15) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    i16 = num4.intValue() - 8;
                                } else {
                                    if (16 <= intValue && intValue < 23) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i16 = num4.intValue() - 16;
                                    } else {
                                        if (23 <= intValue && intValue < 30) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            i16 = num4.intValue() - 23;
                                        } else {
                                            i16 = 0;
                                        }
                                    }
                                }
                            }
                            recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                            if (recyclerView != null) {
                                recyclerView.post(new s7.b(this, i16, fVar2, i12));
                            }
                            progressBar = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                            i17 = 70;
                            if (progressBar != null) {
                                progressBar.setMax(70);
                            }
                            if (this.f10754y == this.f10756z) {
                                i17 = (i16 + (!bool2.booleanValue())) * 10;
                            }
                            progressBar2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                            if (progressBar2 == null) {
                                i18 = progressBar2.getProgress();
                            } else {
                                i18 = 0;
                            }
                            if (i18 < i17) {
                                ProgressBar progressBar4 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                                if (progressBar4 != null) {
                                    progressBar4.setProgress(i17);
                                }
                                int[] iArr = new int[i15];
                                iArr[0] = 0;
                                iArr[1] = i17;
                                ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress), Constants.SCREEN_PROGRESS, iArr);
                                ofInt.setDuration(500L);
                                ofInt.setInterpolator(new LinearInterpolator());
                                ofInt.start();
                            }
                        }
                    }
                    bool2 = bool3;
                    i11 = 8;
                    i12 = 3;
                    i13 = 30;
                    i14 = this.f10754y;
                    if (i14 == 1) {
                    }
                    size = N0().getPlanV3().size();
                    b10 = fVar.f19465v;
                    if (size > ((Number) b10).intValue()) {
                    }
                    Integer num42 = num2;
                    intValue = num42.intValue();
                    if (1 > intValue) {
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvPlanMultiCardRecycler);
                    if (recyclerView != null) {
                    }
                    progressBar = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                    i17 = 70;
                    if (progressBar != null) {
                    }
                    if (this.f10754y == this.f10756z) {
                    }
                    progressBar2 = (ProgressBar) n0(com.theinnerhour.b2b.R.id.pbPlanMultiCardProgress);
                    if (progressBar2 == null) {
                    }
                    if (i18 < i17) {
                    }
                }
                this.f10744r0 = false;
                this.f10746t0 = Boolean.valueOf(SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                return;
            }
            if (is.k.Q1(fVar2.f19464u, new Integer[]{0, 15, 30})) {
                ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardLoader)).setVisibility(8);
                ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardAssessment)).setVisibility(0);
            } else {
                ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardLoader)).setVisibility(0);
                ((ShimmerFrameLayout) n0(com.theinnerhour.b2b.R.id.shimmerPlanMultiCardAssessment)).setVisibility(8);
            }
            this.f10744r0 = true;
        }
    }

    public final void d1() {
        try {
            n0(com.theinnerhour.b2b.R.id.experimentMultiCardPlanView).setVisibility(0);
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clPlanView)).setVisibility(8);
            c1(null);
            D1();
            if (this.A0) {
                n0(com.theinnerhour.b2b.R.id.planCardToolTipLayout).setVisibility(0);
                n0(com.theinnerhour.b2b.R.id.viewTransparentBG).setVisibility(0);
                n0(com.theinnerhour.b2b.R.id.planCardToolTipLayout).setOnClickListener(DebouncedOnClickListener.wrap(new dl.e0(this, 17)));
                n0(com.theinnerhour.b2b.R.id.viewTransparentBG).setOnClickListener(DebouncedOnClickListener.wrap(new dl.e0(this, 18)));
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                HashMap<String, Object> appConfig = firebasePersistence.getUser().getAppConfig();
                kotlin.jvm.internal.i.f(appConfig, "this.user.appConfig");
                appConfig.put(Constants.DASHBOARD_PLAN_CARD_EXPERIMENT, "multi");
                firebasePersistence.updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).getVisibility() == 0) {
            Rect rect = new Rect();
            n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).getGlobalVisibleRect(rect);
            kotlin.jvm.internal.i.d(motionEvent);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).setVisibility(8);
                n0(com.theinnerhour.b2b.R.id.viewLeftMenuBG).setVisibility(8);
                ApplicationPersistence.getInstance().setBooleanValue("show_bookmarking_tool_tip", false);
                return true;
            }
        }
        if (((CardView) n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedExistingToolTip)).getVisibility() == 0) {
            Rect rect2 = new Rect();
            ((CardView) n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedExistingToolTip)).getGlobalVisibleRect(rect2);
            kotlin.jvm.internal.i.d(motionEvent);
            if (!rect2.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                ((CardView) n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedExistingToolTip)).setVisibility(8);
                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivDashboardProviderAssignedExistingToolTip)).setVisibility(8);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.theinnerhour.b2b.utils.CourseApiUtil] */
    public final void e1() {
        int i6;
        Object obj;
        String firstName;
        HashMap<String, Object> appConfig;
        try {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? courseApiUtil = new CourseApiUtil();
            xVar.f23469u = courseApiUtil;
            courseApiUtil.setCourseApiListener(new r(xVar));
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).removeAllViews();
            Iterator<Course> it = FirebasePersistence.getInstance().getCourses().iterator();
            while (true) {
                i6 = 9;
                if (!it.hasNext()) {
                    break;
                }
                Course next = it.next();
                if (!kotlin.jvm.internal.i.b(N0().getCourseName(), next.getCourseName())) {
                    View inflate = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                    ((RobertoTextView) inflate.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(next.getCourseName()));
                    inflate.setOnClickListener(new dk.t(9, this, xVar, next));
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate);
                }
            }
            User user = FirebasePersistence.getInstance().getUser();
            String str = null;
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
            } else {
                obj = null;
            }
            boolean b10 = kotlin.jvm.internal.i.b(obj, "variant_a");
            if (b10) {
                Boolean isAdhdCourseActive = FirebasePersistence.getInstance().getIsAdhdCourseActive();
                kotlin.jvm.internal.i.f(isAdhdCourseActive, "getInstance().isAdhdCourseActive");
                if (isAdhdCourseActive.booleanValue()) {
                    View inflate2 = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                    ((RobertoTextView) inflate2.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(Constants.COURSE_ADHD));
                    inflate2.setOnClickListener(new dl.j0(this, 0));
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate2);
                }
                Boolean isOcdCourseActive = FirebasePersistence.getInstance().getIsOcdCourseActive();
                kotlin.jvm.internal.i.f(isOcdCourseActive, "getInstance().isOcdCourseActive");
                if (isOcdCourseActive.booleanValue()) {
                    View inflate3 = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                    ((RobertoTextView) inflate3.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(Constants.COURSE_OCD));
                    inflate3.setOnClickListener(new dl.j0(this, 1));
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate3);
                }
                Boolean isGenericExpertCareCourseActive = FirebasePersistence.getInstance().getIsGenericExpertCareCourseActive();
                kotlin.jvm.internal.i.f(isGenericExpertCareCourseActive, "getInstance().isGenericExpertCareCourseActive");
                if (isGenericExpertCareCourseActive.booleanValue()) {
                    View inflate4 = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate4.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName);
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (firstName = user2.getFirstName()) != null) {
                        if (!gv.n.B0(firstName)) {
                            str = firstName;
                        }
                        if (str != null && (r2 = getString(com.theinnerhour.b2b.R.string.expertCareDashboardHeader, str)) != null) {
                            robertoTextView.setText(r2);
                            inflate4.setOnClickListener(new dl.j0(this, 2));
                            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate4);
                        }
                    }
                    String str2 = Constants.COURSE_EXPERT_CARE_DN;
                    robertoTextView.setText(str2);
                    inflate4.setOnClickListener(new dl.j0(this, 2));
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate4);
                }
            }
            if (b10) {
                Boolean isGenericExpertCareCourseActive2 = FirebasePersistence.getInstance().getIsGenericExpertCareCourseActive();
                kotlin.jvm.internal.i.f(isGenericExpertCareCourseActive2, "getInstance().isGenericExpertCareCourseActive");
                if (!isGenericExpertCareCourseActive2.booleanValue()) {
                    i6 = 8;
                }
            } else {
                i6 = 6;
            }
            if (((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).getChildCount() < i6) {
                View inflate5 = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)), false);
                ((RobertoTextView) inflate5.findViewById(com.theinnerhour.b2b.R.id.tvSwitchCourseName)).setText("Add programme");
                ((AppCompatImageView) inflate5.findViewById(com.theinnerhour.b2b.R.id.ivSwitchCoursePlus)).setVisibility(0);
                inflate5.setOnClickListener(new dl.j0(this, 3));
                ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llSwitchCourse)).addView(inflate5);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "exception", e10);
        }
    }

    public final void f1(MiniCourse miniCourse, MiniCourseMetadata miniCourseMetadata) {
        Object obj;
        String str;
        String content_label;
        Object obj2;
        if (miniCourseMetadata == null) {
            return;
        }
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(com.theinnerhour.b2b.R.layout.dialog_course_welcome_monetized_library, this, com.theinnerhour.b2b.R.style.Theme_Dialog_Fullscreen);
        TextView textView = (TextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvLibraryMiniCourseTutorialHeader);
        if (textView != null) {
            textView.setText(getString(com.theinnerhour.b2b.R.string.onboardingBasicDialogHeader, FirebasePersistence.getInstance().getUser().getFirstName()));
        }
        HashMap<String, Object> libraryContent = miniCourseMetadata.getLibraryContent();
        String str2 = null;
        if (libraryContent != null) {
            obj = libraryContent.get("libraryBanner");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvRowScImage);
        if ((true ^ gv.n.B0(str)) && appCompatImageView != null) {
            Glide.c(this).d(this).p(str).B(appCompatImageView);
        }
        TextView textView2 = (TextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvRowScHeader);
        if (textView2 != null) {
            textView2.setText(miniCourseMetadata.getName());
        }
        TextView textView3 = (TextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvRowScSubHeader);
        if (textView3 != null) {
            HashMap<String, Object> libraryContent2 = miniCourseMetadata.getLibraryContent();
            if (libraryContent2 != null) {
                obj2 = libraryContent2.get("libraryCourseDescription");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            }
            if (str2 == null) {
                str2 = "";
            }
            textView3.setText(str2);
        }
        TextView textView4 = (TextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvRowShortCourseTitle1);
        if (textView4 != null) {
            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.i2(miniCourse.getPlan());
            if (courseDayModelV1 != null && (content_label = courseDayModelV1.getContent_label()) != null) {
                str3 = content_label;
            }
            textView4.setText(str3);
        }
        TextView textView5 = (TextView) styledDialog.findViewById(com.theinnerhour.b2b.R.id.tvRowScDescription);
        if (textView5 != null) {
            textView5.setText("Day 1 of " + miniCourse.getPlan().size());
        }
        View findViewById = styledDialog.findViewById(com.theinnerhour.b2b.R.id.cvLibraryMiniCourseTutorialCard);
        if (findViewById != null) {
            findViewById.setOnClickListener(new dk.t(8, this, miniCourse, miniCourseMetadata));
        }
        Window window = styledDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        styledDialog.show();
        this.f10734l1 = styledDialog;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List, T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, T, java.util.ArrayList] */
    public final void g1() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6 = 1;
        final int i10 = 1;
        while (i10 < 5) {
            V3DashboardUtils v3DashboardUtils = this.B;
            if (i10 != i6) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            try {
                                if (i10 > this.f10754y) {
                                    int i11 = i10 - 1;
                                    Course N0 = N0();
                                    v3DashboardUtils.getClass();
                                    if (!V3DashboardUtils.j(i11, N0)) {
                                        ConstraintLayout clWeek4Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container);
                                        kotlin.jvm.internal.i.f(clWeek4Container, "clWeek4Container");
                                        F0(clWeek4Container, Integer.valueOf(i10));
                                        ConstraintLayout clAssessment3Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment3Container);
                                        kotlin.jvm.internal.i.f(clAssessment3Container, "clAssessment3Container");
                                        F0(clAssessment3Container, null);
                                        int b10 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3Tick)).setColorFilter(b10);
                                        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.planExperimentAssessment3Title)).setTextColor(b10);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3DropDownArrow)).setColorFilter(b10);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3DropDownArrow)).setVisibility(8);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek4Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_lock);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek4DropDownArrow)).setVisibility(8);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_lock);
                                    }
                                }
                                final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                                Course N02 = N0();
                                v3DashboardUtils.getClass();
                                ?? b11 = V3DashboardUtils.b(i10, N02);
                                xVar.f23469u = b11;
                                CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) is.u.p2(b11);
                                if (courseDayModelV1 != null) {
                                    z12 = kotlin.jvm.internal.i.b(courseDayModelV1.isAssessment(), Boolean.TRUE);
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    CourseDayModelV1 courseDayModelV12 = (CourseDayModelV1) is.u.o2((List) xVar.f23469u);
                                    is.q.V1((List) xVar.f23469u);
                                    if (!((CourseDayModelV1) is.u.o2((List) xVar.f23469u)).isCompleted() && ((CourseDayModelV1) is.u.o2((List) xVar.f23469u)).getStart_date() == 0) {
                                        ConstraintLayout clAssessment3Container2 = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment3Container);
                                        kotlin.jvm.internal.i.f(clAssessment3Container2, "clAssessment3Container");
                                        F0(clAssessment3Container2, null);
                                    }
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment3Container)).setOnClickListener(new dl.j0(this, 18));
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment3Container)).setAlpha(1.0f);
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment3Container)).setClickable(true);
                                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3DropDownArrow)).setVisibility(0);
                                    if (courseDayModelV12.isCompleted()) {
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_tick_round);
                                        int b12 = g0.a.b(this, com.theinnerhour.b2b.R.color.sea);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3Tick)).setColorFilter(b12);
                                        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.planExperimentAssessment3Title)).setTextColor(b12);
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3DropDownArrow)).setColorFilter(b12);
                                    } else {
                                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment3Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                                    }
                                }
                                if (((ArrayList) xVar.f23469u).size() > 0) {
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container)).setAlpha(1.0f);
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container)).setClickable(true);
                                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek4Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek4DropDownArrow)).setVisibility(0);
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.x

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ V3DashboardActivity f13124v;

                                        {
                                            this.f13124v = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i12 = r4;
                                            int i13 = i10;
                                            kotlin.jvm.internal.x weekCourseList = xVar;
                                            V3DashboardActivity this$0 = this.f13124v;
                                            switch (i12) {
                                                case 0:
                                                    int i14 = V3DashboardActivity.f10714r1;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "1"));
                                                    ArrayList arrayList = (ArrayList) weekCourseList.f23469u;
                                                    this$0.J1(1);
                                                    this$0.h1(Integer.valueOf(i13));
                                                    return;
                                                case 1:
                                                    int i15 = V3DashboardActivity.f10714r1;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "2"));
                                                    ArrayList arrayList2 = (ArrayList) weekCourseList.f23469u;
                                                    this$0.J1(2);
                                                    this$0.h1(Integer.valueOf(i13));
                                                    return;
                                                case 2:
                                                    int i16 = V3DashboardActivity.f10714r1;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "3"));
                                                    ArrayList arrayList3 = (ArrayList) weekCourseList.f23469u;
                                                    this$0.J1(3);
                                                    this$0.h1(Integer.valueOf(i13));
                                                    return;
                                                default:
                                                    int i17 = V3DashboardActivity.f10714r1;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "4"));
                                                    ArrayList arrayList4 = (ArrayList) weekCourseList.f23469u;
                                                    this$0.J1(4);
                                                    this$0.h1(Integer.valueOf(i13));
                                                    return;
                                            }
                                        }
                                    });
                                } else {
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container)).setAlpha(0.34f);
                                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek4Container)).setClickable(false);
                                }
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this.f10748v, e10);
                                return;
                            }
                        }
                    } else if (i10 <= this.f10754y) {
                        final kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                        Course N03 = N0();
                        v3DashboardUtils.getClass();
                        ?? b13 = V3DashboardUtils.b(i10, N03);
                        xVar2.f23469u = b13;
                        CourseDayModelV1 courseDayModelV13 = (CourseDayModelV1) is.u.i2(b13);
                        if (courseDayModelV13 != null) {
                            z11 = kotlin.jvm.internal.i.b(courseDayModelV13.isAssessment(), Boolean.TRUE);
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Object obj = ((ArrayList) xVar2.f23469u).get(0);
                            kotlin.jvm.internal.i.f(obj, "weekCourseList[0]");
                            ((ArrayList) xVar2.f23469u).remove(0);
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment2Container)).setOnClickListener(new dl.j0(this, 17));
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment2Container)).setAlpha(1.0f);
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment2Container)).setClickable(true);
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2DropDownArrow)).setVisibility(0);
                            if (((CourseDayModelV1) obj).isCompleted()) {
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_tick_round);
                                int b14 = g0.a.b(this, com.theinnerhour.b2b.R.color.sea);
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2Tick)).setColorFilter(b14);
                                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.planExperimentAssessment2Title)).setTextColor(b14);
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2DropDownArrow)).setColorFilter(b14);
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2DropDownArrow)).setVisibility(0);
                            } else {
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                                int b15 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2Tick)).setColorFilter(b15);
                                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.planExperimentAssessment2Title)).setTextColor(b15);
                                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2DropDownArrow)).setColorFilter(b15);
                            }
                        }
                        if (((ArrayList) xVar2.f23469u).size() > 0) {
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setAlpha(1.0f);
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setClickable(true);
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek3Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek3DropDownArrow)).setVisibility(0);
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.x

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ V3DashboardActivity f13124v;

                                {
                                    this.f13124v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i12 = r4;
                                    int i13 = i10;
                                    kotlin.jvm.internal.x weekCourseList = xVar2;
                                    V3DashboardActivity this$0 = this.f13124v;
                                    switch (i12) {
                                        case 0:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                            ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "1"));
                                            ArrayList arrayList = (ArrayList) weekCourseList.f23469u;
                                            this$0.J1(1);
                                            this$0.h1(Integer.valueOf(i13));
                                            return;
                                        case 1:
                                            int i15 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                            ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "2"));
                                            ArrayList arrayList2 = (ArrayList) weekCourseList.f23469u;
                                            this$0.J1(2);
                                            this$0.h1(Integer.valueOf(i13));
                                            return;
                                        case 2:
                                            int i16 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                            ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "3"));
                                            ArrayList arrayList3 = (ArrayList) weekCourseList.f23469u;
                                            this$0.J1(3);
                                            this$0.h1(Integer.valueOf(i13));
                                            return;
                                        default:
                                            int i17 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                            ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "4"));
                                            ArrayList arrayList4 = (ArrayList) weekCourseList.f23469u;
                                            this$0.J1(4);
                                            this$0.h1(Integer.valueOf(i13));
                                            return;
                                    }
                                }
                            });
                        } else {
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setAlpha(0.34f);
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setClickable(false);
                        }
                    } else {
                        ConstraintLayout clWeek3Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container);
                        kotlin.jvm.internal.i.f(clWeek3Container, "clWeek3Container");
                        F0(clWeek3Container, Integer.valueOf(i10));
                        ConstraintLayout clAssessment2Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment2Container);
                        kotlin.jvm.internal.i.f(clAssessment2Container, "clAssessment2Container");
                        F0(clAssessment2Container, null);
                        int b16 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2Tick)).setColorFilter(b16);
                        ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.planExperimentAssessment2Title)).setTextColor(b16);
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentAssessment2DropDownArrow)).setVisibility(8);
                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek3Container)).setAlpha(0.34f);
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek3DropDownArrow)).setVisibility(8);
                    }
                } else {
                    if (i10 > this.f10754y) {
                        Course N04 = N0();
                        v3DashboardUtils.getClass();
                        if (!V3DashboardUtils.j(i10 - 1, N04)) {
                            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek2Container)).setAlpha(0.34f);
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek2DropDownArrow)).setVisibility(8);
                            ConstraintLayout clWeek2Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek2Container);
                            kotlin.jvm.internal.i.f(clWeek2Container, "clWeek2Container");
                            F0(clWeek2Container, Integer.valueOf(i10));
                            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek2Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_lock);
                        }
                    }
                    final kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
                    Course N05 = N0();
                    v3DashboardUtils.getClass();
                    ?? b17 = V3DashboardUtils.b(i10, N05);
                    xVar3.f23469u = b17;
                    if (b17.size() > 0) {
                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek2Container)).setAlpha(1.0f);
                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek2Container)).setClickable(true);
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek2Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek2DropDownArrow)).setVisibility(0);
                        ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek2Container)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.x

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ V3DashboardActivity f13124v;

                            {
                                this.f13124v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = r4;
                                int i13 = i10;
                                kotlin.jvm.internal.x weekCourseList = xVar3;
                                V3DashboardActivity this$0 = this.f13124v;
                                switch (i12) {
                                    case 0:
                                        int i14 = V3DashboardActivity.f10714r1;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                        ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "1"));
                                        ArrayList arrayList = (ArrayList) weekCourseList.f23469u;
                                        this$0.J1(1);
                                        this$0.h1(Integer.valueOf(i13));
                                        return;
                                    case 1:
                                        int i15 = V3DashboardActivity.f10714r1;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                        ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "2"));
                                        ArrayList arrayList2 = (ArrayList) weekCourseList.f23469u;
                                        this$0.J1(2);
                                        this$0.h1(Integer.valueOf(i13));
                                        return;
                                    case 2:
                                        int i16 = V3DashboardActivity.f10714r1;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                        ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "3"));
                                        ArrayList arrayList3 = (ArrayList) weekCourseList.f23469u;
                                        this$0.J1(3);
                                        this$0.h1(Integer.valueOf(i13));
                                        return;
                                    default:
                                        int i17 = V3DashboardActivity.f10714r1;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                        ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "4"));
                                        ArrayList arrayList4 = (ArrayList) weekCourseList.f23469u;
                                        this$0.J1(4);
                                        this$0.h1(Integer.valueOf(i13));
                                        return;
                                }
                            }
                        });
                    }
                }
            } else if (i10 <= this.f10754y) {
                final kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
                Course N06 = N0();
                v3DashboardUtils.getClass();
                ?? b18 = V3DashboardUtils.b(i10, N06);
                xVar4.f23469u = b18;
                CourseDayModelV1 courseDayModelV14 = (CourseDayModelV1) is.u.i2(b18);
                if (courseDayModelV14 != null) {
                    z10 = kotlin.jvm.internal.i.b(courseDayModelV14.isAssessment(), Boolean.TRUE);
                } else {
                    z10 = false;
                }
                if (z10) {
                    Object obj2 = ((ArrayList) xVar4.f23469u).get(0);
                    kotlin.jvm.internal.i.f(obj2, "weekCourseList[0]");
                    CourseDayModelV1 courseDayModelV15 = (CourseDayModelV1) obj2;
                    ((ArrayList) xVar4.f23469u).remove(0);
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clAssessment1Container)).setOnClickListener(new dl.j0(this, 16));
                }
                if (((ArrayList) xVar4.f23469u).size() > 0) {
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container)).setAlpha(1.0f);
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container)).setClickable(true);
                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek1DropDownArrow)).setVisibility(0);
                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek1Tick)).setImageResource(com.theinnerhour.b2b.R.drawable.ic_partial_lock);
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container)).setOnClickListener(new View.OnClickListener(this) { // from class: dl.x

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ V3DashboardActivity f13124v;

                        {
                            this.f13124v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i12 = r4;
                            int i13 = i10;
                            kotlin.jvm.internal.x weekCourseList = xVar4;
                            V3DashboardActivity this$0 = this.f13124v;
                            switch (i12) {
                                case 0:
                                    int i14 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "1"));
                                    ArrayList arrayList = (ArrayList) weekCourseList.f23469u;
                                    this$0.J1(1);
                                    this$0.h1(Integer.valueOf(i13));
                                    return;
                                case 1:
                                    int i15 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "2"));
                                    ArrayList arrayList2 = (ArrayList) weekCourseList.f23469u;
                                    this$0.J1(2);
                                    this$0.h1(Integer.valueOf(i13));
                                    return;
                                case 2:
                                    int i16 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "3"));
                                    ArrayList arrayList3 = (ArrayList) weekCourseList.f23469u;
                                    this$0.J1(3);
                                    this$0.h1(Integer.valueOf(i13));
                                    return;
                                default:
                                    int i17 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(weekCourseList, "$weekCourseList");
                                    ((RobertoTextView) this$0.n0(com.theinnerhour.b2b.R.id.planExperimentWeekTitle)).setText(this$0.getString(com.theinnerhour.b2b.R.string.planExperimentWeekX, "4"));
                                    ArrayList arrayList4 = (ArrayList) weekCourseList.f23469u;
                                    this$0.J1(4);
                                    this$0.h1(Integer.valueOf(i13));
                                    return;
                            }
                        }
                    });
                } else {
                    ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivPlanExperimentWeek1DropDownArrow)).setVisibility(8);
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container)).setAlpha(0.34f);
                    ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container)).setClickable(false);
                }
            } else {
                ConstraintLayout clWeek1Container = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clWeek1Container);
                kotlin.jvm.internal.i.f(clWeek1Container, "clWeek1Container");
                F0(clWeek1Container, Integer.valueOf(i10));
            }
            i10++;
            i6 = 1;
        }
    }

    public final void h1(Integer num) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("present_week", String.valueOf(this.f10754y));
            if (num != null) {
                bundle.putString("selected_week", num.toString());
            } else {
                bundle.putString("selected_week", "assessment");
            }
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("plan_card_variant", "multi");
            gk.a.b(bundle, "plan_weekly_view_week_click");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "exception in load course data", e10);
        }
    }

    public final void i1() {
        boolean z10;
        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
        if (userGoals != null && !userGoals.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
            this.f10715a0 = false;
            if (this.b1 == null) {
                this.b1 = (a1) new o0(this, new kk.c(new fm.j1(), MyApplication.V.a())).a(a1.class);
            }
            a1 a1Var = this.b1;
            if (a1Var != null) {
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) && !kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                    a1Var.l();
                } else {
                    a1Var.m();
                    a1Var.B.e(this, new dl.h0(17, new s(a1Var, this)));
                }
                a1Var.A.e(this, new dl.h0(18, new t()));
            }
        }
    }

    @Override // ul.a
    public final void j(boolean z10) {
        this.T0 = !z10;
    }

    public final void j1() {
        View actionView;
        View findViewById;
        ((DrawerLayout) n0(com.theinnerhour.b2b.R.id.dashboardNavigationDrawer)).p();
        MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
        if (findItem != null && (actionView = findItem.getActionView()) != null && (findViewById = actionView.findViewById(com.theinnerhour.b2b.R.id.bgView)) != null) {
            findViewById.setVisibility(0);
            AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 2, 8, null).addListener(new w(findViewById));
        }
    }

    public final void k1() {
        boolean z10;
        RoutingType routingType;
        int i6;
        String j02;
        RoutingType routingType2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        String string;
        JournalQuestionModel journalQuestionModel;
        BufferedReader bufferedReader;
        View n02 = n0(com.theinnerhour.b2b.R.id.layoutJournalCard);
        boolean z14 = false;
        if (n02 != null) {
            n02.setVisibility(0);
        }
        if (this.J0 != null) {
            ml.c0 P0 = P0();
            if (P0.O == null) {
                tm.a aVar = P0.N;
                aVar.f33281a = 1;
                try {
                    InputStream openRawResource = P0.f2382x.getResources().openRawResource(aVar.e());
                    kotlin.jvm.internal.i.f(openRawResource, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                    InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    String c12 = ca.a.c1(bufferedReader);
                    ca.a.z(bufferedReader, null);
                    Object b10 = new sf.i().b(JournalQuestionModel.class, c12);
                    kotlin.jvm.internal.i.f(b10, "{\n                val te…class.java)\n            }");
                    journalQuestionModel = (JournalQuestionModel) b10;
                } catch (Exception unused) {
                    journalQuestionModel = new JournalQuestionModel(null, null, null, null, 15, null);
                }
                P0.O = journalQuestionModel;
            }
            String l2 = P0().l();
            RobertoTextView robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalSubHeader);
            if (robertoTextView != null) {
                if (!gv.n.B0(l2) && !kotlin.jvm.internal.i.b(l2, "null")) {
                    string = getString(com.theinnerhour.b2b.R.string.your_journal_name, l2);
                } else {
                    string = getString(com.theinnerhour.b2b.R.string.your_journal_generic);
                }
                robertoTextView.setText(string);
            }
            P0();
            int i11 = Calendar.getInstance().get(11);
            if (5 <= i11 && i11 < 11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i10 = com.theinnerhour.b2b.R.drawable.ic_journal_cover_dawn;
            } else {
                if (11 <= i11 && i11 < 17) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i10 = com.theinnerhour.b2b.R.drawable.ic_journal_cover_day;
                } else {
                    if (17 <= i11 && i11 < 23) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        i10 = com.theinnerhour.b2b.R.drawable.ic_journal_cover_dusk;
                    } else {
                        i10 = com.theinnerhour.b2b.R.drawable.ic_journal_cover_dark;
                    }
                }
            }
            if (i10 != com.theinnerhour.b2b.R.drawable.ic_journal_cover_day) {
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDescription)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalCta)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalSubHeader)).setTextColor(g0.a.b(this, com.theinnerhour.b2b.R.color.white));
                ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.tvJournalHeader)).setColorFilter(g0.a.b(this, com.theinnerhour.b2b.R.color.white), PorterDuff.Mode.SRC_ATOP);
            }
            ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivJournal)).setImageResource(i10);
        }
        ArrayList arrayList = new ArrayList();
        if (!this.P0) {
            JournalQuestionModel journalQuestionModel2 = P0().O;
            if (journalQuestionModel2 != null) {
                Iterator<Questions> it = journalQuestionModel2.getQuestions().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getQuestion());
                }
                long longValue = ApplicationPersistence.getInstance().getLongValue("journal_question_time");
                int intValue = ApplicationPersistence.getInstance().getIntValue("journal_question_position", -1);
                int intValue2 = ApplicationPersistence.getInstance().getIntValue("journal_question_today_position", -1);
                int i12 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                if (i12 != 0 && longValue != Utils.INSTANCE.getTodayTimeInSeconds()) {
                    if (intValue2 < arrayList.size() - 1) {
                        intValue2++;
                    } else {
                        intValue2 = 0;
                    }
                    ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", intValue2);
                } else {
                    if (i12 == 0) {
                        ApplicationPersistence.getInstance().setIntValue("journal_question_today_position", 0);
                    } else if (intValue2 <= intValue) {
                        if (intValue < arrayList.size() - 1) {
                            intValue2 = intValue + 1;
                        }
                    }
                    intValue2 = 0;
                }
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setVisibility(0);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setVisibility(0);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDescription)).setVisibility(8);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setText(getString(com.theinnerhour.b2b.R.string.journal_todays_question));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalCta)).setText(getString(com.theinnerhour.b2b.R.string.journal_tap_to_begin));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setText((CharSequence) arrayList.get(intValue2));
                i6 = com.theinnerhour.b2b.R.id.layoutJournalCard;
                routingType = null;
            } else {
                kotlin.jvm.internal.i.q("questionData");
                throw null;
            }
        } else {
            String stringValue = ApplicationPersistence.getInstance().getStringValue("journal_last_entry_date");
            if (stringValue != null && !gv.n.B0(stringValue)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                ml.c0 P02 = P0();
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    routingType = null;
                    ta.v.H(kc.f.H(P02), null, 0, new ml.g0(new pm.a(), j02, P02, null), 3);
                } else {
                    routingType = null;
                }
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDescription)).setVisibility(0);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setVisibility(8);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setVisibility(8);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalCta)).setText(getString(com.theinnerhour.b2b.R.string.journal_tap_to_begin));
            } else {
                routingType = null;
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDescription)).setVisibility(8);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setVisibility(0);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setVisibility(0);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalLastEntryText)).setText(getString(com.theinnerhour.b2b.R.string.journal_last_entry_made_on));
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalDate)).setText(stringValue);
                ((RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvJournalCta)).setText(getString(com.theinnerhour.b2b.R.string.journal_tap_to_view));
            }
            i6 = com.theinnerhour.b2b.R.id.layoutJournalCard;
        }
        View n03 = n0(i6);
        if (n03 != null) {
            n03.setOnClickListener(new dl.e0(this, 19));
        }
        RoutingIntentHandler d10 = P0().X.d();
        if (d10 != null) {
            routingType2 = d10.getRoutingType();
        } else {
            routingType2 = routingType;
        }
        if (routingType2 == RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL) {
            RoutingIntentHandler d11 = P0().X.d();
            if (d11 != null && !d11.isRoutingCompleted()) {
                z14 = true;
            }
            if (z14) {
                ((ScrollView) n0(com.theinnerhour.b2b.R.id.scrollView2)).post(new dl.v(this, 4));
            }
        }
    }

    public final void l1() {
        Iterable<Object> iterable;
        try {
            n0(com.theinnerhour.b2b.R.id.ihResources).setVisibility(8);
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clLearningHub)).setVisibility(0);
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)).removeAllViews();
            E1(false);
            if (this.V.size() > 5) {
                iterable = new xs.f(0, 4);
            } else {
                iterable = this.V;
            }
            for (Object obj : iterable) {
                if (this.V.size() > 5) {
                    ArrayList<LearningHubModel> arrayList = this.V;
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj = arrayList.get(((Integer) obj).intValue());
                } else {
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.LearningHubModel");
                }
                LearningHubModel learningHubModel = (LearningHubModel) obj;
                kotlin.jvm.internal.i.f(learningHubModel, "if (learningHubList.size…lse i as LearningHubModel");
                View row = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_learning_hub_dashboard, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)), false);
                V3DashboardUtils v3DashboardUtils = this.B;
                kotlin.jvm.internal.i.f(row, "row");
                v3DashboardUtils.l(row, learningHubModel, this.I0);
                ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHub)).addView(row);
            }
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub)).setOnClickListener(new dl.e0(this, 1));
            if (this.U) {
                this.U = false;
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHub)).performClick();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Exception", e10);
        }
    }

    public final void m1() {
        boolean z10;
        boolean z11;
        ArrayList<LearningHubModel> arrayList;
        boolean z12;
        try {
            n0(com.theinnerhour.b2b.R.id.ihResources).setVisibility(0);
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clLearningHub)).setVisibility(8);
            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHubExperiment)).removeAllViews();
            E1(false);
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            Course courseById = firebasePersistence.getCourseById(firebasePersistence.getUser().getCurrentCourse());
            ArrayList<PostsRead> postsRead = FirebasePersistence.getInstance().getUser().getPostsRead();
            ArrayList<LearningHubModel> arrayList2 = this.V;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                for (LearningHubModel learningHubModel : arrayList2) {
                    if (learningHubModel.getDay() == ((int) courseById.getCourseOpenDay())) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                ArrayList<LearningHubModel> arrayList3 = this.V;
                arrayList = new ArrayList();
                for (Object obj : arrayList3) {
                    if (((LearningHubModel) obj).getDay() == ((int) courseById.getCourseOpenDay())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList.add(obj);
                    }
                }
            } else if (this.V.size() < 6) {
                arrayList = this.V;
            } else {
                arrayList = new ArrayList(this.V.subList(0, 4));
            }
            is.r.W1(arrayList);
            if (arrayList.size() > 1) {
                is.p.P1(arrayList, new x(postsRead));
            }
            for (LearningHubModel learningHubModel2 : arrayList) {
                View row = getLayoutInflater().inflate(com.theinnerhour.b2b.R.layout.row_learning_hub_dashboard_experiment, (ViewGroup) ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHubExperiment)), false);
                V3DashboardUtils v3DashboardUtils = this.B;
                kotlin.jvm.internal.i.f(row, "row");
                v3DashboardUtils.l(row, learningHubModel2, this.I0);
                ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llLearningHubExperiment)).addView(row);
            }
            ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHubExperiment)).setOnClickListener(new dl.e0(this, 2));
            if (this.U) {
                this.U = false;
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.buttonLearningHubExperiment)).performClick();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Exception", e10);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.q1;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
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
        if (this.G != null && (!U0().isEmpty()) && kotlin.jvm.internal.i.b(this.L0, "default")) {
            ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clMiniCourses)).setVisibility(0);
            this.c0 = true;
            this.E = new h1(this, U0(), V0().i(), this.f10735m0, new y());
            RecyclerView recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
            h1 h1Var = this.E;
            if (h1Var != null) {
                recyclerView.setAdapter(h1Var);
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).setLayoutManager(new LinearLayoutManager(this, 0, false));
                ((RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses)).getViewTreeObserver().addOnGlobalLayoutListener(new z());
                return;
            }
            kotlin.jvm.internal.i.q("miniCoursesDashboardAdapter");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r9 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: Exception -> 0x00ee, TRY_ENTER, TryCatch #0 {Exception -> 0x00ee, blocks: (B:5:0x0008, B:7:0x0033, B:9:0x0041, B:20:0x0079, B:22:0x007d, B:23:0x0092, B:26:0x0099, B:28:0x009f, B:30:0x00a3, B:31:0x00a7, B:32:0x00aa, B:33:0x00ab, B:37:0x00b3, B:39:0x00b9, B:41:0x00bd, B:42:0x00c1, B:43:0x00c4, B:44:0x00c5, B:45:0x00c8, B:46:0x00c9, B:47:0x00db, B:48:0x00de, B:11:0x0051, B:13:0x0060, B:49:0x00df), top: B:54:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:5:0x0008, B:7:0x0033, B:9:0x0041, B:20:0x0079, B:22:0x007d, B:23:0x0092, B:26:0x0099, B:28:0x009f, B:30:0x00a3, B:31:0x00a7, B:32:0x00aa, B:33:0x00ab, B:37:0x00b3, B:39:0x00b9, B:41:0x00bd, B:42:0x00c1, B:43:0x00c4, B:44:0x00c5, B:45:0x00c8, B:46:0x00c9, B:47:0x00db, B:48:0x00de, B:11:0x0051, B:13:0x0060, B:49:0x00df), top: B:54:0x0005 }] */
    @Override // com.theinnerhour.b2b.model.FirebaseCourseUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void newItemsAdded(boolean z10) {
        ProgressDialog progressDialog;
        try {
            if (z10) {
                boolean z11 = true;
                this.f10722f0 = true;
                Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
                this.f10752x = courseById;
                if (N0().getAssessments().size() != 1 || N0().getPlanV3().size() <= 1 || N0().getPlanV3().size() == 16) {
                    if (N0().getAssessments().size() == 2) {
                        int size = N0().getPlanV3().size();
                        if (17 > size || size >= 31) {
                            z11 = false;
                        }
                    }
                    progressDialog = this.f10750w;
                    if (progressDialog == null) {
                        if (progressDialog.isShowing()) {
                            ProgressDialog progressDialog2 = this.f10750w;
                            if (progressDialog2 != null) {
                                progressDialog2.dismiss();
                            } else {
                                kotlin.jvm.internal.i.q("progressDialog");
                                throw null;
                            }
                        }
                        Dialog dialog = this.f10729j0;
                        if (dialog != null) {
                            if (dialog != null) {
                                if (dialog.isShowing()) {
                                    Dialog dialog2 = this.f10729j0;
                                    if (dialog2 != null) {
                                        dialog2.dismiss();
                                    } else {
                                        kotlin.jvm.internal.i.q("planLoadingDialog");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.i.q("planLoadingDialog");
                                throw null;
                            }
                        }
                        r1();
                        Extensions extensions = Extensions.INSTANCE;
                        ConstraintLayout retryCl = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.retryCl);
                        kotlin.jvm.internal.i.f(retryCl, "retryCl");
                        extensions.gone(retryCl);
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
                if (this.f10733l0) {
                    Extensions extensions2 = Extensions.INSTANCE;
                    String string = getString(com.theinnerhour.b2b.R.string.planLoadingDialogSuccess);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.planLoadingDialogSuccess)");
                    Extensions.toast$default(extensions2, this, string, 0, 2, null);
                }
                progressDialog = this.f10750w;
                if (progressDialog == null) {
                }
            } else {
                Extensions extensions3 = Extensions.INSTANCE;
                ConstraintLayout retryCl2 = (ConstraintLayout) n0(com.theinnerhour.b2b.R.id.retryCl);
                kotlin.jvm.internal.i.f(retryCl2, "retryCl");
                extensions3.visible(retryCl2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void o1() {
        HashMap<String, Object> appConfig;
        boolean z10;
        HashMap<String, Object> appConfig2;
        try {
            boolean z11 = false;
            if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig2 = user.getAppConfig()) != null) {
                    z10 = kotlin.jvm.internal.i.b(appConfig2.get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.TRUE);
                } else {
                    z10 = false;
                }
                if (z10) {
                    n0(com.theinnerhour.b2b.R.id.dashboardRecommendedActivitiesExperiment).setVisibility(0);
                    ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llRAExperiment)).removeAllViews();
                    F1(true);
                }
            }
            ap.h hVar = this.K0;
            String str = null;
            if (hVar != null) {
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str = user2.getCurrentCourseName();
                }
                ap.h.e(hVar, str, true);
                return;
            }
            ap.f fVar = new ap.f();
            Application application = getApplication();
            kotlin.jvm.internal.i.f(application, "application");
            ap.h hVar2 = (ap.h) new o0(this, new kk.c(application, fVar)).a(ap.h.class);
            this.K0 = hVar2;
            if (hVar2 != null) {
                if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null && (appConfig = user3.getAppConfig()) != null) {
                        z11 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.TRUE);
                    }
                    if (z11) {
                        hVar2.f3410z.e(this, new dk.a(28, new a0(hVar2, this)));
                    }
                }
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null) {
                    str = user4.getCurrentCourseName();
                }
                ap.h.e(hVar2, str, true);
                return;
            }
            kotlin.jvm.internal.i.q("recommendedActivityViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Exception", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0242, code lost:
        if (r0.getPosition() == 29) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0424, code lost:
        r2 = false;
        r24.getBooleanExtra("tutorial", false);
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035d A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038f A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f5 A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0408 A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x041d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0435 A[Catch: Exception -> 0x02f9, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x044f A[Catch: Exception -> 0x02f9, TRY_LEAVE, TryCatch #0 {Exception -> 0x02f9, blocks: (B:174:0x0359, B:176:0x035d, B:178:0x0371, B:183:0x037e, B:186:0x0387, B:188:0x038f, B:190:0x0399, B:192:0x039f, B:193:0x03a3, B:195:0x03a9, B:197:0x03b6, B:199:0x03c2, B:201:0x03c9, B:208:0x03d7, B:210:0x03db, B:215:0x03ea, B:217:0x03f5, B:218:0x03f9, B:220:0x0408, B:221:0x0418, B:230:0x042e, B:232:0x0435, B:236:0x043f, B:242:0x044f, B:227:0x0424, B:229:0x042c, B:140:0x02b7, B:142:0x02c1, B:144:0x02c5, B:153:0x02de, B:155:0x02e9, B:159:0x02fe, B:161:0x030a, B:163:0x031e, B:164:0x0335, B:166:0x0339, B:168:0x033d, B:170:0x034f, B:173:0x0356, B:145:0x02c9), top: B:248:0x02b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b A[Catch: Exception -> 0x0453, TryCatch #2 {Exception -> 0x0453, blocks: (B:3:0x0011, B:7:0x001a, B:10:0x0022, B:11:0x0027, B:14:0x0043, B:16:0x0052, B:18:0x007f, B:20:0x0092, B:22:0x0098, B:24:0x00a5, B:25:0x00ae, B:30:0x00bb, B:32:0x00c4, B:34:0x00cd, B:36:0x00de, B:37:0x00e5, B:41:0x00ec, B:43:0x00f4, B:52:0x012d, B:78:0x01ed, B:80:0x01f1, B:44:0x00f8, B:46:0x00ff, B:48:0x0115, B:51:0x0121, B:53:0x0141, B:55:0x014c, B:56:0x0158, B:58:0x015e, B:60:0x0168, B:66:0x017b, B:68:0x018d, B:69:0x0198, B:71:0x01ae, B:72:0x01c1, B:74:0x01c7, B:75:0x01cc, B:77:0x01e3, B:90:0x020b, B:92:0x020f, B:95:0x021b, B:96:0x022b, B:98:0x022f, B:100:0x0237, B:102:0x0244, B:103:0x0247, B:106:0x0251, B:107:0x0255, B:89:0x0206, B:116:0x026c, B:118:0x0270, B:123:0x027d, B:125:0x0284, B:126:0x0289, B:128:0x028d, B:130:0x029b, B:132:0x02a2, B:135:0x02ac, B:85:0x0200), top: B:252:0x0011, inners: #1 }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i6, int i10, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList<MiniCourse> miniCourses;
        Object obj;
        boolean z13;
        Iterator<CourseDayModelV1> it;
        boolean z14;
        String str7 = this.f10748v;
        yn.a aVar = this.f10753x0;
        super.onActivityResult(i6, i10, intent);
        try {
            if (i6 == this.R && i10 == -1) {
                Bundle extras = intent != null ? intent.getExtras() : null;
                if (extras != null) {
                    extras.getBoolean("removeRecommendedFFM");
                }
            }
            B0();
            A0();
            x0(false);
            int i11 = this.J;
            int i12 = this.L;
            int i13 = this.M;
            V3DashboardUtils v3DashboardUtils = this.B;
            if (i6 == i11) {
                Bundle bundle = new Bundle();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    Calendar calendar = Calendar.getInstance();
                    str2 = "bookings";
                    str3 = "teleconsultation";
                    calendar.setTimeInMillis(1000 * user.getCourseReminderTime());
                    bundle.putString("reminder_time", new SimpleDateFormat("hh:mm").format(calendar.getTime()));
                } else {
                    str2 = "bookings";
                    str3 = "teleconsultation";
                }
                bundle.putString("course", N0().getCourseName());
                CourseDayModelV1 courseDayModelV1 = this.C;
                bundle.putString(Constants.API_COURSE_LINK, courseDayModelV1 != null ? courseDayModelV1.getContent_id() : null);
                bundle.putBoolean("isNewActivities", false);
                CourseDayModelV1 courseDayModelV12 = this.C;
                if (courseDayModelV12 != null) {
                    bundle.putInt(Constants.DAYMODEL_POSITION, courseDayModelV12.getPosition());
                }
                L1(true);
                if (i10 == -1) {
                    if (intent != null && intent.getBooleanExtra("new_assessment_completed", false)) {
                        aVar.getClass();
                        if (!yn.a.b()) {
                            aVar.f38694a.getClass();
                            if (kotlin.jvm.internal.i.b(df.b.p(), "variant_a")) {
                                H1("post_assessment", "assessment");
                            }
                        }
                        if (!this.f10722f0 && intent.getIntExtra("new_assessment_pos", -1) != 30) {
                            A0();
                        } else if (intent.getIntExtra("new_assessment_pos", -1) != -1) {
                            CourseDayModelV1 courseDayModelV13 = N0().getPlanV3().get(intent.getIntExtra("new_assessment_pos", -1));
                            this.C = courseDayModelV13;
                            if ((courseDayModelV13 != null ? Integer.valueOf(courseDayModelV13.getPosition()) : null) != null) {
                                CourseDayModelV1 courseDayModelV14 = this.C;
                                kotlin.jvm.internal.i.d(courseDayModelV14);
                                v3DashboardUtils.a(courseDayModelV14.getPosition());
                            }
                        }
                        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        UtilsKt.fireAnalytics("dashboard_component_finish", bundle);
                    } else {
                        CourseDayModelV1 courseDayModelV15 = this.C;
                        kotlin.jvm.internal.i.d(courseDayModelV15);
                        if (!courseDayModelV15.isCompleted()) {
                            Iterator<CourseDayModelV1> it2 = N0().getPlanV3().iterator();
                            while (it2.hasNext()) {
                                CourseDayModelV1 next = it2.next();
                                CourseDayModelV1 courseDayModelV16 = this.C;
                                if (courseDayModelV16 != null) {
                                    it = it2;
                                    if (courseDayModelV16.getPosition() == next.getPosition()) {
                                        z14 = true;
                                        if (!z14) {
                                            next.setCompleted(true);
                                            if (next.getPosition() > N0().getCoursePosition()) {
                                                N0().setCoursePosition(next.getPosition());
                                            }
                                            FirebasePersistence.getInstance().updateUserOnFirebase();
                                            CourseDayModelV1 courseDayModelV17 = this.C;
                                            kotlin.jvm.internal.i.d(courseDayModelV17);
                                            v3DashboardUtils.a(courseDayModelV17.getPosition());
                                        }
                                        it2 = it;
                                    }
                                } else {
                                    it = it2;
                                }
                                z14 = false;
                                if (!z14) {
                                }
                                it2 = it;
                            }
                        }
                        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        UtilsKt.fireAnalytics("dashboard_component_finish", bundle);
                    }
                } else {
                    Intent intent2 = getIntent();
                    if (intent2 != null) {
                        intent2.removeExtra("onboarding_flow_new_user");
                    }
                    UtilsKt.fireAnalytics("dashboard_component_incomplete", bundle);
                    if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "")) {
                        startActivity(new Intent(this, DeeplinkCodeActivationActivity.class));
                    }
                }
                if (this.f10745s0) {
                    c1(null);
                }
            } else {
                str2 = "bookings";
                str3 = "teleconsultation";
                boolean z15 = this.I0;
                if (i6 == i13) {
                    try {
                        L1(true);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str7, e10);
                    }
                    CourseDayModelV1 courseDayModelV18 = this.C;
                    if ((courseDayModelV18 != null ? Integer.valueOf(courseDayModelV18.getPosition()) : null) != null) {
                        CourseDayModelV1 courseDayModelV19 = this.C;
                        kotlin.jvm.internal.i.d(courseDayModelV19);
                        v3DashboardUtils.a(courseDayModelV19.getPosition());
                        c1(null);
                    }
                    CourseDayModelV1 courseDayModelV110 = this.C;
                    if (courseDayModelV110 != null) {
                        if (courseDayModelV110.getPosition() != 14) {
                            CourseDayModelV1 courseDayModelV111 = this.C;
                            kotlin.jvm.internal.i.d(courseDayModelV111);
                        }
                        w0();
                    }
                    if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                        if (z15) {
                            m1();
                        } else {
                            l1();
                        }
                    }
                } else {
                    int i14 = this.K;
                    int i15 = this.N;
                    int i16 = this.P;
                    int i17 = this.O;
                    if (i6 != i12 && i6 != i15 && i6 != i14 && i6 != i17 && i6 != i16) {
                        if (i6 == this.T) {
                            if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false))) {
                                x0(true);
                            }
                        } else if (i6 == this.S) {
                            c1(null);
                            str = str7;
                            str4 = null;
                        }
                    } else {
                        str4 = null;
                        r1();
                        if (i6 == i14 && kotlin.jvm.internal.i.b(this.L0, "default")) {
                            Bundle extras2 = intent != null ? intent.getExtras() : null;
                            if (extras2 != null) {
                                str = str7;
                                try {
                                    z10 = extras2.getBoolean("removeLearningHubFFM");
                                } catch (Exception e11) {
                                    e = e11;
                                    LogHelper.INSTANCE.e(str, e);
                                }
                            } else {
                                str = str7;
                                z10 = false;
                            }
                            this.f10727i0 = z10;
                            if (z15) {
                                m1();
                            } else {
                                l1();
                            }
                        } else {
                            str = str7;
                        }
                        if (i6 != i15) {
                            if (i6 != i17) {
                                if (i6 == i16) {
                                }
                            }
                        }
                        if (i6 == i17 && !ApplicationPersistence.getInstance().getBooleanValue(Constants.NOTIFICATION_ALLIE_INTERACTION_SHOWED, false)) {
                            H1("post_allie", "allie");
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.NOTIFICATION_ALLIE_INTERACTION_SHOWED, true);
                        }
                        if (i6 == i16) {
                            str5 = str2;
                            str6 = str3;
                            H1(str6, str5);
                        } else {
                            str5 = str2;
                            str6 = str3;
                        }
                        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).removeAllViews();
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flDynamicCards)).setVisibility(8);
                        }
                        if (this.Q0 && this.S0) {
                            this.S0 = false;
                            Fragment E = getSupportFragmentManager().E(com.theinnerhour.b2b.R.id.flExpertCareContainer);
                            tl.d dVar = E instanceof tl.d ? (tl.d) E : null;
                            if (dVar != null) {
                                dVar.m0();
                            }
                        }
                        if (i6 == this.Q && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (i10 != -1 || intent == null || !intent.getBooleanExtra("purchase_successful", false))) {
                                if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                                    User user2 = FirebasePersistence.getInstance().getUser();
                                    if (user2 == null || (miniCourses = user2.getMiniCourses()) == null) {
                                        return;
                                    }
                                    Iterator<T> it3 = miniCourses.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj = str4;
                                            break;
                                        }
                                        obj = it3.next();
                                        MiniCourse miniCourse = (MiniCourse) obj;
                                        if (miniCourse.getDomain() != null) {
                                            String domain = miniCourse.getDomain();
                                            MiniCourseMetadata miniCourseMetadata = P0().U;
                                            if (kotlin.jvm.internal.i.b(domain, miniCourseMetadata != null ? miniCourseMetadata.getSlug() : str4)) {
                                                z13 = true;
                                                continue;
                                                if (z13) {
                                                    break;
                                                }
                                            }
                                        }
                                        z13 = false;
                                        continue;
                                        if (z13) {
                                        }
                                    }
                                    MiniCourse miniCourse2 = (MiniCourse) obj;
                                    if (miniCourse2 == null) {
                                        return;
                                    }
                                    if (miniCourse2.getPlan().isEmpty()) {
                                        miniCourse2 = str4;
                                    }
                                    if (miniCourse2 == null) {
                                        return;
                                    }
                                    f1(miniCourse2, P0().U);
                                } else {
                                    v3DashboardUtils.o();
                                }
                            }
                            if (N0().getPlanV3().size() > 1) {
                                this.f10717b0 = N0().getPlanV3().get(1);
                            }
                            v3DashboardUtils.p();
                        }
                        if (i6 != i13 && i6 != i12) {
                            z11 = false;
                            C0(this);
                            if (this.D0) {
                                D0();
                                this.D0 = z11;
                            }
                            if (i10 != -1) {
                                return;
                            }
                            if (intent != null && intent.getBooleanExtra("expert_payment_not_completed", false)) {
                                z12 = true;
                                if (z12) {
                                    return;
                                }
                                H1(str6, str5);
                                return;
                            }
                            z12 = false;
                            if (z12) {
                            }
                        }
                        z11 = false;
                        this.f10719d0 = z11;
                        C0(this);
                        if (this.D0) {
                        }
                        if (i10 != -1) {
                        }
                    }
                    str5 = str2;
                    str6 = str3;
                    if (i6 == this.Q) {
                        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            if (kotlin.jvm.internal.i.b(this.L0, "default")) {
                            }
                        }
                        if (N0().getPlanV3().size() > 1) {
                        }
                        v3DashboardUtils.p();
                    }
                    if (i6 != i13) {
                        z11 = false;
                        C0(this);
                        if (this.D0) {
                        }
                        if (i10 != -1) {
                        }
                    }
                    z11 = false;
                    this.f10719d0 = z11;
                    C0(this);
                    if (this.D0) {
                    }
                    if (i10 != -1) {
                    }
                }
            }
            str = str7;
            str4 = null;
            str5 = str2;
            str6 = str3;
            if (i6 == this.Q) {
            }
            if (i6 != i13) {
            }
            z11 = false;
            this.f10719d0 = z11;
            C0(this);
            if (this.D0) {
            }
            if (i10 != -1) {
            }
        } catch (Exception e12) {
            e = e12;
            str = str7;
            LogHelper.INSTANCE.e(str, e);
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
            this.B.e();
        } else if (BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).getState() == 3) {
            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clNPSBottomSheet)).setState(4);
        } else if (BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clProviderVideoViewParentContainer)).getState() == 3) {
            BottomSheetBehavior.from((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.clProviderVideoViewParentContainer)).setState(4);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:7:0x005b, B:9:0x0069, B:15:0x0075, B:16:0x0089, B:18:0x0097, B:24:0x00a3), top: B:62:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: Exception -> 0x00ad, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ad, blocks: (B:7:0x005b, B:9:0x0069, B:15:0x0075, B:16:0x0089, B:18:0x0097, B:24:0x00a3), top: B:62:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0380  */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        cn.t tVar;
        hs.f<String, Boolean> a10;
        RobertoTextView robertoTextView;
        String version;
        boolean z10;
        ArrayList<MiniCourse> miniCourses;
        boolean z11;
        super.onCreate(bundle);
        setContentView(com.theinnerhour.b2b.R.layout.activity_v2_dash_board);
        getWindow().setStatusBarColor(g0.a.b(this, com.theinnerhour.b2b.R.color.v1_status_bar_dark));
        Context applicationContext = getApplication().getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "application.applicationContext");
        ml.u uVar = new ml.u(applicationContext);
        if (!kotlin.jvm.internal.i.b(this.L0, "default")) {
            tVar = new cn.t();
        } else {
            tVar = null;
        }
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "application");
        ml.c0 c0Var = (ml.c0) new o0(this, new jl.q(application, uVar, tVar)).a(ml.c0.class);
        c0Var.getClass();
        try {
            version = FirebasePersistence.getInstance().getUser().getVersion();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.A, e10);
        }
        if (version != null && version.length() != 0) {
            z10 = false;
            if (z10) {
                FirebasePersistence.getInstance().getUser().setVersion(Constants.USER_VERSION);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
            if (miniCourses != null && !miniCourses.isEmpty()) {
                z11 = false;
                if (z11) {
                    ApplicationPersistence.getInstance().setBooleanValue("new_user", true);
                }
                c0Var.B.e(this, new dl.h0(5, new v1(this)));
                c0Var.C.e(this, new dl.h0(8, new w1(this)));
                ((androidx.lifecycle.w) c0Var.f25365b0.getValue()).e(this, new dl.h0(9, new x1(this)));
                c0Var.J.e(this, new dl.h0(10, y1.f13136u));
                ((androidx.lifecycle.w) c0Var.M.getValue()).e(this, new dl.h0(11, new z1(this)));
                c0Var.f25366d0.e(this, new dl.h0(12, new a2(this)));
                c0Var.e0.e(this, new dl.h0(13, new b2(this)));
                c0Var.W.e(this, new dl.h0(14, new c2(this)));
                c0Var.X.e(this, new dl.h0(15, new d2(this)));
                c0Var.D.e(this, new dl.h0(16, new s1(this)));
                c0Var.E.e(this, new dl.h0(6, new t1(this)));
                c0Var.K.e(this, new dl.h0(7, new u1(this)));
                ta.v.H(kc.f.H(c0Var), null, 0, new ml.e0(c0Var, null), 3);
                this.J0 = c0Var;
                if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("profile_experiment") || kotlin.jvm.internal.i.b(ri.e.d("profile_experiment"), Boolean.FALSE)) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, true);
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false);
                    }
                }
                ll.a aVar = new ll.a();
                a10 = aVar.a();
                hs.f<String, Boolean> b10 = aVar.b();
                this.O0 = !kotlin.jvm.internal.i.b(a10.f19464u, "default");
                this.L0 = b10.f19464u;
                if (!a10.f19465v.booleanValue() || b10.f19465v.booleanValue()) {
                    ml.c0 P0 = P0();
                    ta.v.H(kc.f.H(P0), null, 0, new ml.f0(P0, null), 3);
                }
                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(false);
                this.f10750w = progressDialog;
                this.A = Utils.INSTANCE.getTodayTimeInSeconds();
                n1.a a11 = n1.a.a(this);
                a11.b(this.f10723f1, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
                a11.b(this.g1, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
                u0(this);
                FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
                a1(true);
                ml.c0 P02 = P0();
                ta.v.H(kc.f.H(P02), kotlinx.coroutines.o0.f23642c, 0, new ml.m0(P02, getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false), null), 2);
                if (MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("update_lock", true);
                    Intent intent = new Intent(this, LockScreenActivity.class);
                    intent.putExtras(bundle2);
                    startActivity(intent);
                }
                Intent intent2 = getIntent();
                kotlin.jvm.internal.i.f(intent2, "intent");
                onNewIntent(intent2);
                if (this.f10753x0.f38698e == 2 && !yn.a.b()) {
                    try {
                        new Handler(Looper.getMainLooper()).postDelayed(new dl.v(this, 3), 3000L);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this.f10748v, e11);
                    }
                }
                robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
                if (robertoTextView != null) {
                    robertoTextView.setTextSize(2, 20.0f);
                }
                km.d dVar = (km.d) new o0(this).a(km.d.class);
                dVar.f23395z.e(this, new dl.h0(19, new r0(this)));
                dVar.A.e(this, new dl.h0(20, new dl.s0(this)));
                dVar.B.e(this, new dl.h0(21, new t0(this)));
                dVar.C.e(this, new dl.h0(22, new u0(this)));
                dVar.D.e(this, new dl.h0(23, new v0(this)));
                ((androidx.lifecycle.w) dVar.E.getValue()).e(this, new dl.h0(24, new w0(this)));
                this.Y0 = dVar;
                wn.k kVar = (wn.k) new o0(this).a(wn.k.class);
                kVar.e();
                kVar.f36804y.e(this, new dk.a(27, new u()));
                if (!sp.b.K() || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                    i1();
                }
                return;
            }
            z11 = true;
            if (z11) {
            }
            c0Var.B.e(this, new dl.h0(5, new v1(this)));
            c0Var.C.e(this, new dl.h0(8, new w1(this)));
            ((androidx.lifecycle.w) c0Var.f25365b0.getValue()).e(this, new dl.h0(9, new x1(this)));
            c0Var.J.e(this, new dl.h0(10, y1.f13136u));
            ((androidx.lifecycle.w) c0Var.M.getValue()).e(this, new dl.h0(11, new z1(this)));
            c0Var.f25366d0.e(this, new dl.h0(12, new a2(this)));
            c0Var.e0.e(this, new dl.h0(13, new b2(this)));
            c0Var.W.e(this, new dl.h0(14, new c2(this)));
            c0Var.X.e(this, new dl.h0(15, new d2(this)));
            c0Var.D.e(this, new dl.h0(16, new s1(this)));
            c0Var.E.e(this, new dl.h0(6, new t1(this)));
            c0Var.K.e(this, new dl.h0(7, new u1(this)));
            ta.v.H(kc.f.H(c0Var), null, 0, new ml.e0(c0Var, null), 3);
            this.J0 = c0Var;
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("profile_experiment")) {
            }
            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, true);
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
            }
            ll.a aVar2 = new ll.a();
            a10 = aVar2.a();
            hs.f<String, Boolean> b102 = aVar2.b();
            this.O0 = !kotlin.jvm.internal.i.b(a10.f19464u, "default");
            this.L0 = b102.f19464u;
            if (!a10.f19465v.booleanValue()) {
            }
            ml.c0 P03 = P0();
            ta.v.H(kc.f.H(P03), null, 0, new ml.f0(P03, null), 3);
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            progressDialog2.setMessage("Loading...");
            progressDialog2.setCancelable(false);
            this.f10750w = progressDialog2;
            this.A = Utils.INSTANCE.getTodayTimeInSeconds();
            n1.a a112 = n1.a.a(this);
            a112.b(this.f10723f1, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
            a112.b(this.g1, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
            u0(this);
            FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
            a1(true);
            ml.c0 P022 = P0();
            ta.v.H(kc.f.H(P022), kotlinx.coroutines.o0.f23642c, 0, new ml.m0(P022, getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false), null), 2);
            if (MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
            }
            Intent intent22 = getIntent();
            kotlin.jvm.internal.i.f(intent22, "intent");
            onNewIntent(intent22);
            if (this.f10753x0.f38698e == 2) {
                new Handler(Looper.getMainLooper()).postDelayed(new dl.v(this, 3), 3000L);
            }
            robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
            if (robertoTextView != null) {
            }
            km.d dVar2 = (km.d) new o0(this).a(km.d.class);
            dVar2.f23395z.e(this, new dl.h0(19, new r0(this)));
            dVar2.A.e(this, new dl.h0(20, new dl.s0(this)));
            dVar2.B.e(this, new dl.h0(21, new t0(this)));
            dVar2.C.e(this, new dl.h0(22, new u0(this)));
            dVar2.D.e(this, new dl.h0(23, new v0(this)));
            ((androidx.lifecycle.w) dVar2.E.getValue()).e(this, new dl.h0(24, new w0(this)));
            this.Y0 = dVar2;
            wn.k kVar2 = (wn.k) new o0(this).a(wn.k.class);
            kVar2.e();
            kVar2.f36804y.e(this, new dk.a(27, new u()));
            if (!sp.b.K()) {
            }
            i1();
        }
        z10 = true;
        if (z10) {
        }
        miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
        if (miniCourses != null) {
            z11 = false;
            if (z11) {
            }
            c0Var.B.e(this, new dl.h0(5, new v1(this)));
            c0Var.C.e(this, new dl.h0(8, new w1(this)));
            ((androidx.lifecycle.w) c0Var.f25365b0.getValue()).e(this, new dl.h0(9, new x1(this)));
            c0Var.J.e(this, new dl.h0(10, y1.f13136u));
            ((androidx.lifecycle.w) c0Var.M.getValue()).e(this, new dl.h0(11, new z1(this)));
            c0Var.f25366d0.e(this, new dl.h0(12, new a2(this)));
            c0Var.e0.e(this, new dl.h0(13, new b2(this)));
            c0Var.W.e(this, new dl.h0(14, new c2(this)));
            c0Var.X.e(this, new dl.h0(15, new d2(this)));
            c0Var.D.e(this, new dl.h0(16, new s1(this)));
            c0Var.E.e(this, new dl.h0(6, new t1(this)));
            c0Var.K.e(this, new dl.h0(7, new u1(this)));
            ta.v.H(kc.f.H(c0Var), null, 0, new ml.e0(c0Var, null), 3);
            this.J0 = c0Var;
            if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("profile_experiment")) {
            }
            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, true);
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
            }
            ll.a aVar22 = new ll.a();
            a10 = aVar22.a();
            hs.f<String, Boolean> b1022 = aVar22.b();
            this.O0 = !kotlin.jvm.internal.i.b(a10.f19464u, "default");
            this.L0 = b1022.f19464u;
            if (!a10.f19465v.booleanValue()) {
            }
            ml.c0 P032 = P0();
            ta.v.H(kc.f.H(P032), null, 0, new ml.f0(P032, null), 3);
            ProgressDialog progressDialog22 = new ProgressDialog(this);
            progressDialog22.setMessage("Loading...");
            progressDialog22.setCancelable(false);
            this.f10750w = progressDialog22;
            this.A = Utils.INSTANCE.getTodayTimeInSeconds();
            n1.a a1122 = n1.a.a(this);
            a1122.b(this.f10723f1, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
            a1122.b(this.g1, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
            u0(this);
            FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
            a1(true);
            ml.c0 P0222 = P0();
            ta.v.H(kc.f.H(P0222), kotlinx.coroutines.o0.f23642c, 0, new ml.m0(P0222, getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false), null), 2);
            if (MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
            }
            Intent intent222 = getIntent();
            kotlin.jvm.internal.i.f(intent222, "intent");
            onNewIntent(intent222);
            if (this.f10753x0.f38698e == 2) {
            }
            robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
            if (robertoTextView != null) {
            }
            km.d dVar22 = (km.d) new o0(this).a(km.d.class);
            dVar22.f23395z.e(this, new dl.h0(19, new r0(this)));
            dVar22.A.e(this, new dl.h0(20, new dl.s0(this)));
            dVar22.B.e(this, new dl.h0(21, new t0(this)));
            dVar22.C.e(this, new dl.h0(22, new u0(this)));
            dVar22.D.e(this, new dl.h0(23, new v0(this)));
            ((androidx.lifecycle.w) dVar22.E.getValue()).e(this, new dl.h0(24, new w0(this)));
            this.Y0 = dVar22;
            wn.k kVar22 = (wn.k) new o0(this).a(wn.k.class);
            kVar22.e();
            kVar22.f36804y.e(this, new dk.a(27, new u()));
            if (!sp.b.K()) {
            }
            i1();
        }
        z11 = true;
        if (z11) {
        }
        c0Var.B.e(this, new dl.h0(5, new v1(this)));
        c0Var.C.e(this, new dl.h0(8, new w1(this)));
        ((androidx.lifecycle.w) c0Var.f25365b0.getValue()).e(this, new dl.h0(9, new x1(this)));
        c0Var.J.e(this, new dl.h0(10, y1.f13136u));
        ((androidx.lifecycle.w) c0Var.M.getValue()).e(this, new dl.h0(11, new z1(this)));
        c0Var.f25366d0.e(this, new dl.h0(12, new a2(this)));
        c0Var.e0.e(this, new dl.h0(13, new b2(this)));
        c0Var.W.e(this, new dl.h0(14, new c2(this)));
        c0Var.X.e(this, new dl.h0(15, new d2(this)));
        c0Var.D.e(this, new dl.h0(16, new s1(this)));
        c0Var.E.e(this, new dl.h0(6, new t1(this)));
        c0Var.K.e(this, new dl.h0(7, new u1(this)));
        ta.v.H(kc.f.H(c0Var), null, 0, new ml.e0(c0Var, null), 3);
        this.J0 = c0Var;
        if (FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("profile_experiment")) {
        }
        ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_OLD_PROFILE, true);
        if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.NEW_PROFILE_TOOLTIP_SHOWN, false)) {
        }
        ll.a aVar222 = new ll.a();
        a10 = aVar222.a();
        hs.f<String, Boolean> b10222 = aVar222.b();
        this.O0 = !kotlin.jvm.internal.i.b(a10.f19464u, "default");
        this.L0 = b10222.f19464u;
        if (!a10.f19465v.booleanValue()) {
        }
        ml.c0 P0322 = P0();
        ta.v.H(kc.f.H(P0322), null, 0, new ml.f0(P0322, null), 3);
        ProgressDialog progressDialog222 = new ProgressDialog(this);
        progressDialog222.setMessage("Loading...");
        progressDialog222.setCancelable(false);
        this.f10750w = progressDialog222;
        this.A = Utils.INSTANCE.getTodayTimeInSeconds();
        n1.a a11222 = n1.a.a(this);
        a11222.b(this.f10723f1, new IntentFilter("com.theinnerhour.b2b.assetFileDownloadBroadcast"));
        a11222.b(this.g1, new IntentFilter("com.theinnerhour.b2b.allAssetDownloadBroadcast"));
        u0(this);
        FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
        a1(true);
        ml.c0 P02222 = P0();
        ta.v.H(kc.f.H(P02222), kotlinx.coroutines.o0.f23642c, 0, new ml.m0(P02222, getIntent().getBooleanExtra(Constants.NEW_COURSE_FLAG, false), null), 2);
        if (MyApplication.V.a().getSharedPreferences("lock_code", 0).getBoolean("set_lock_code", false)) {
        }
        Intent intent2222 = getIntent();
        kotlin.jvm.internal.i.f(intent2222, "intent");
        onNewIntent(intent2222);
        if (this.f10753x0.f38698e == 2) {
        }
        robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.tvCurrentCourse);
        if (robertoTextView != null) {
        }
        km.d dVar222 = (km.d) new o0(this).a(km.d.class);
        dVar222.f23395z.e(this, new dl.h0(19, new r0(this)));
        dVar222.A.e(this, new dl.h0(20, new dl.s0(this)));
        dVar222.B.e(this, new dl.h0(21, new t0(this)));
        dVar222.C.e(this, new dl.h0(22, new u0(this)));
        dVar222.D.e(this, new dl.h0(23, new v0(this)));
        ((androidx.lifecycle.w) dVar222.E.getValue()).e(this, new dl.h0(24, new w0(this)));
        this.Y0 = dVar222;
        wn.k kVar222 = (wn.k) new o0(this).a(wn.k.class);
        kVar222.e();
        kVar222.f36804y.e(this, new dk.a(27, new u()));
        if (!sp.b.K()) {
        }
        i1();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        androidx.lifecycle.w<Boolean> wVar;
        super.onDestroy();
        FirebasePersistence.getInstance().removeFirebaseCourseUpdateListener(this);
        if (this.F != null) {
            V0().f11379z.k(this);
        }
        lp.a aVar = this.I;
        if (aVar != null) {
            if (aVar != null) {
                aVar.f24482x.k(this);
                lp.a aVar2 = this.I;
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
        MonetizationViewModel monetizationViewModel = this.B0;
        if (monetizationViewModel != null && (wVar = monetizationViewModel.C) != null) {
            wVar.k(this);
        }
        n1.a a10 = n1.a.a(this);
        a10.d(this.f10726h1);
        a10.d(this.g1);
        a10.d(this.f10723f1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        int i6;
        String str = this.f10748v;
        kotlin.jvm.internal.i.g(intent, "intent");
        try {
            super.onNewIntent(intent);
            setIntent(intent);
            Bundle extras = intent.getExtras();
            K1();
            Uri data = intent.getData();
            V3DashboardUtils v3DashboardUtils = this.B;
            if (extras != null && extras.containsKey(Constants.API_COURSE_LINK)) {
                v3DashboardUtils.getClass();
                v3DashboardUtils.f10900b = this;
                if (kotlin.jvm.internal.i.b(extras.getString(Constants.NOTIFICATION_TYPE), "miniCourse")) {
                    this.f10724g0 = true;
                } else if (kotlin.jvm.internal.i.b(extras.getString(Constants.API_COURSE_LINK), Constants.SCREEN_SLIDER_ASSESSMENT)) {
                    int size = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().size();
                    if (size != 1) {
                        if (size != 16) {
                            if (size != 31) {
                                i6 = -1;
                            } else {
                                i6 = 30;
                            }
                        } else {
                            i6 = 15;
                        }
                    } else {
                        i6 = 0;
                    }
                    extras.putInt(Constants.DAYMODEL_POSITION, i6);
                    ArrayList<CourseDayModelV1> planV3 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3();
                    if (extras.getInt(Constants.DAYMODEL_POSITION, -1) != -1 && planV3.size() > extras.getInt(Constants.DAYMODEL_POSITION, -1)) {
                        L1(true);
                        CourseDayModelV1 courseDayModelV1 = planV3.get(extras.getInt(Constants.DAYMODEL_POSITION, -1));
                        kotlin.jvm.internal.i.f(courseDayModelV1, "currCoursePlan[bundle.getInt(\"position\", -1)]");
                        t0(courseDayModelV1);
                    }
                } else {
                    v3DashboardUtils.k(extras.getString(Constants.API_COURSE_LINK), extras, null);
                }
            } else if (data != null) {
                String uri = data.toString();
                kotlin.jvm.internal.i.f(uri, "uri.toString()");
                if (!gv.r.J0(uri, "appointment")) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.i(str, "uri " + data);
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    for (String str2 : data.getQueryParameterNames()) {
                        extras.putString(str2, data.getQueryParameter(str2));
                    }
                    v3DashboardUtils.getClass();
                    v3DashboardUtils.f10900b = this;
                    v3DashboardUtils.k(data.getLastPathSegment(), extras, null);
                }
            }
            if (intent.getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                a1(false);
                CourseDayModelV1 courseDayModelV12 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanV3().get(0);
                kotlin.jvm.internal.i.f(courseDayModelV12, "FirebasePersistence.getI….currentCourse).planV3[0]");
                t0(courseDayModelV12);
            } else if (intent.getBooleanExtra("vD_show_monetization", false)) {
                startActivity(tr.r.s(this, false).putExtra("source", "vD_explore"));
                intent.removeExtra("onboarding_flow_new_user");
            } else if (intent.getBooleanExtra("switch_programme", false)) {
                a1(false);
            }
            if (extras != null && extras.containsKey(Constants.NOTIFICATION_INTENT) && extras.getBoolean(Constants.NOTIFICATION_INTENT)) {
                Bundle bundle = new Bundle();
                if (extras.containsKey(Constants.NOTIFICATION_TYPE) && kotlin.jvm.internal.i.b(extras.getString(Constants.NOTIFICATION_TYPE), Constants.SCREEN_ACTIVITY)) {
                    String string = extras.getString(Constants.GOAL_ID);
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    logHelper2.i(str, "notification goal id " + string);
                    extras.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    extras.putString("experiment", applicationPersistence.getStringValue("an-experiment-" + string));
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    extras.putString("experiment_key", applicationPersistence2.getStringValue("an-experiment-key-" + string));
                    bundle = extras;
                }
                if (extras.containsKey("campaign")) {
                    bundle.putString("campaign", extras.getString("campaign"));
                }
                if (is.u.Z1(ca.a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), extras.getString(Constants.API_COURSE_LINK))) {
                    bundle.putBoolean("community_notif", true);
                } else {
                    bundle.putBoolean("community_notif", false);
                }
                bundle.putString(Constants.API_COURSE_LINK, extras.getString(Constants.API_COURSE_LINK));
                UtilsKt.fireAnalytics("notification_click", bundle);
                if (intent.hasExtra("login_activity_new") && intent.getBooleanExtra("login_activity_new", false) && this.J0 != null) {
                    P0().j();
                }
            }
            if (extras == null && data == null) {
                D0();
            } else {
                this.D0 = true;
            }
            String stringExtra = intent.getStringExtra(Constants.A3_VAR_B_FLOW_FLAG);
            if (stringExtra != null) {
                Y0(stringExtra);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        this.f10733l0 = false;
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (getIntent().getBooleanExtra("login_flag", false) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115 A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x000f, B:8:0x0015, B:9:0x001a, B:15:0x0026, B:17:0x002a, B:18:0x003b, B:20:0x0047, B:21:0x0053, B:23:0x0057, B:25:0x0061, B:27:0x006b, B:32:0x0076, B:34:0x0082, B:35:0x0087, B:37:0x00b8, B:39:0x00c2, B:41:0x00c8, B:57:0x0107, B:59:0x0115, B:60:0x0118, B:62:0x0122, B:64:0x0132, B:70:0x014d, B:72:0x015a, B:74:0x0165, B:76:0x016b, B:79:0x0172, B:80:0x0175, B:82:0x0179, B:65:0x0136, B:67:0x0142, B:69:0x0146, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:14:0x0021, B:11:0x001c), top: B:89:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a A[Catch: Exception -> 0x017d, TryCatch #1 {Exception -> 0x017d, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x000f, B:8:0x0015, B:9:0x001a, B:15:0x0026, B:17:0x002a, B:18:0x003b, B:20:0x0047, B:21:0x0053, B:23:0x0057, B:25:0x0061, B:27:0x006b, B:32:0x0076, B:34:0x0082, B:35:0x0087, B:37:0x00b8, B:39:0x00c2, B:41:0x00c8, B:57:0x0107, B:59:0x0115, B:60:0x0118, B:62:0x0122, B:64:0x0132, B:70:0x014d, B:72:0x015a, B:74:0x0165, B:76:0x016b, B:79:0x0172, B:80:0x0175, B:82:0x0179, B:65:0x0136, B:67:0x0142, B:69:0x0146, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:14:0x0021, B:11:0x001c), top: B:89:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179 A[Catch: Exception -> 0x017d, TRY_LEAVE, TryCatch #1 {Exception -> 0x017d, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x000f, B:8:0x0015, B:9:0x001a, B:15:0x0026, B:17:0x002a, B:18:0x003b, B:20:0x0047, B:21:0x0053, B:23:0x0057, B:25:0x0061, B:27:0x006b, B:32:0x0076, B:34:0x0082, B:35:0x0087, B:37:0x00b8, B:39:0x00c2, B:41:0x00c8, B:57:0x0107, B:59:0x0115, B:60:0x0118, B:62:0x0122, B:64:0x0132, B:70:0x014d, B:72:0x015a, B:74:0x0165, B:76:0x016b, B:79:0x0172, B:80:0x0175, B:82:0x0179, B:65:0x0136, B:67:0x0142, B:69:0x0146, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:14:0x0021, B:11:0x001c), top: B:89:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.p, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        int i6;
        RecyclerView recyclerView;
        Boolean bool;
        ym.c cVar;
        km.d dVar;
        Menu menu;
        boolean z10;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z11;
        boolean z12;
        String str = this.f10748v;
        super.onResume();
        try {
            MenuItem menuItem = null;
            if (this.f10722f0) {
                ProgressDialog progressDialog = this.f10750w;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    this.f10722f0 = false;
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
            try {
                L1(true);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            if (this.J0 != null) {
                ml.c0 P0 = P0();
                ta.v.H(kc.f.H(P0), null, 0, new ml.h0(P0, null), 3);
            }
            long j10 = this.A;
            Utils utils = Utils.INSTANCE;
            if (j10 != utils.getTodayTimeInSeconds()) {
                this.A = utils.getTodayTimeInSeconds();
                r1();
                E0();
            }
            if (!this.f10724g0) {
                if (getIntent().getExtras() != null) {
                    Bundle extras = getIntent().getExtras();
                    if (extras != null && extras.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                    }
                }
                this.B.m();
            }
            ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.navigation)).getMenu().getItem(0).setChecked(true);
            J0();
            p1();
            this.f10733l0 = true;
            RobertoTextView robertoTextView = (RobertoTextView) n0(com.theinnerhour.b2b.R.id.clTopicalCardNewTag);
            if (!ApplicationPersistence.getInstance().getBooleanValue("topical_card_clicked", false)) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                    if (!topicalCourseList.isEmpty()) {
                        for (MiniCourse miniCourse : topicalCourseList) {
                            if (is.k.Q1(miniCourse.getDomain(), new String[]{Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID})) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        z10 = true;
                        if (z10) {
                            i6 = 0;
                            robertoTextView.setVisibility(i6);
                            recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
                            if (recyclerView != null) {
                                recyclerView.h0(0);
                            }
                            x1();
                            z0();
                            bool = this.f10746t0;
                            if (bool == null && !kotlin.jvm.internal.i.b(bool, Boolean.valueOf(SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()))) {
                                c1(null);
                            } else if (this.f10747u0 != Utils.INSTANCE.getTodayTimeInSeconds() && (cVar = this.W) != null) {
                                this.f10743q0 = false;
                                this.f10744r0 = true;
                                cVar.f();
                            }
                            y0();
                            if (!kotlin.jvm.internal.i.b(this.L0, "default")) {
                                BottomNavigationView bottomNavigationView = (BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation);
                                if (bottomNavigationView != null && (menu = bottomNavigationView.getMenu()) != null) {
                                    menuItem = menu.getItem(0);
                                }
                                if (menuItem != null) {
                                    menuItem.setChecked(true);
                                }
                            }
                            dVar = this.Y0;
                            if (dVar == null) {
                                dVar.k(false);
                                return;
                            }
                            return;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            i6 = 8;
            robertoTextView.setVisibility(i6);
            recyclerView = (RecyclerView) n0(com.theinnerhour.b2b.R.id.rvMiniCourses);
            if (recyclerView != null) {
            }
            x1();
            z0();
            bool = this.f10746t0;
            if (bool == null) {
            }
            if (this.f10747u0 != Utils.INSTANCE.getTodayTimeInSeconds()) {
                this.f10743q0 = false;
                this.f10744r0 = true;
                cVar.f();
            }
            y0();
            if (!kotlin.jvm.internal.i.b(this.L0, "default")) {
            }
            dVar = this.Y0;
            if (dVar == null) {
            }
        } catch (Exception e11) {
            super.onResume();
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        q1();
        ya.v a10 = wd.a.b().a(getIntent());
        a10.addOnSuccessListener(this, new rk.b(3, new v()));
        a10.addOnFailureListener(this, new dl.j(1));
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            a.C0384a.a().a(this);
            a.C0384a.a();
            fk.b bVar = new fk.b(this);
            ih.p pVar = qg.g0.f29558c;
            if (pVar != null) {
                mi.i1.f25206a.getClass();
                mi.i1.a(pVar).f35171c = bVar;
            }
            a.C0384a.a();
            fk.a aVar2 = new fk.a();
            ih.p pVar2 = qg.g0.f29558c;
            if (pVar2 != null) {
                mi.i1.f25206a.getClass();
                mi.i1.a(pVar2).f35172d.add(aVar2);
            }
        }
    }

    public final void p1() {
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
                kotlin.jvm.internal.i.f(reference, "getInstance()\n          …ST_ID)}/unread_messages\")");
                reference.addListenerForSingleValueEvent(new b0());
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

    public final void q1() {
        if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
            startActivity(new Intent(this, DeepLinkActivationActivity.class));
        }
    }

    public final void r1() {
        try {
            A0();
            L1(true);
            if (this.J0 != null) {
                ml.c0 P0 = P0();
                ta.v.H(kc.f.H(P0), null, 0, new ml.t0(P0, null), 3);
            } else {
                c1(null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void s1() {
        RoutingType routingType;
        RoutingIntentHandler d10 = P0().X.d();
        if (d10 != null) {
            routingType = d10.getRoutingType();
        } else {
            routingType = null;
        }
        if (routingType == RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL) {
            RoutingIntentHandler d11 = P0().X.d();
            boolean z10 = false;
            if (d11 != null && !d11.isRoutingCompleted()) {
                z10 = true;
            }
            if (z10) {
                Extensions extensions = Extensions.INSTANCE;
                LinearLayout llDashboardProviderEntryPointExperiment = (LinearLayout) n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment);
                kotlin.jvm.internal.i.f(llDashboardProviderEntryPointExperiment, "llDashboardProviderEntryPointExperiment");
                if (extensions.isVisible(llDashboardProviderEntryPointExperiment)) {
                    ((ScrollView) n0(com.theinnerhour.b2b.R.id.scrollView2)).post(new dl.v(this, 7));
                }
            }
        }
    }

    public final void t0(CourseDayModelV1 dayModel) {
        int i6;
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        try {
            int i10 = this.f10754y;
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        i6 = -1;
                    } else {
                        i6 = 30;
                    }
                } else {
                    i6 = 15;
                }
            } else {
                i6 = 0;
            }
            Boolean ACTIVITY_UNLOCK = Constants.ACTIVITY_UNLOCK;
            kotlin.jvm.internal.i.f(ACTIVITY_UNLOCK, "ACTIVITY_UNLOCK");
            if (!ACTIVITY_UNLOCK.booleanValue() && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION) && dayModel.getPosition() != i6) {
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if ((!subscriptionPersistence.getSubscriptionEnabled() || kotlin.jvm.internal.i.b(subscriptionPersistence.getSubscriptionType(), Constants.SUBSCRIPTION_NONE)) && dayModel.getStart_date() == 0) {
                    Boolean SKIP_MONETIZATION = Constants.SKIP_MONETIZATION;
                    kotlin.jvm.internal.i.f(SKIP_MONETIZATION, "SKIP_MONETIZATION");
                    if (SKIP_MONETIZATION.booleanValue()) {
                        startActivity(new Intent(this, ProInitialAssessmentActivity.class).putExtra("source", "locked_card"));
                        return;
                    } else {
                        startActivity(tr.r.s(this, false).putExtra("source", "locked_card").putExtra(Constants.CAMPAIGN_ID, this.C0));
                        return;
                    }
                }
            }
            this.C = dayModel;
            if (dayModel.getPosition() == i6) {
                Bundle bundle = new Bundle();
                bundle.putString(Constants.COURSE_TITLE, dayModel.getContent_label());
                bundle.putString(Constants.API_COURSE_LINK, dayModel.getContent_id());
                bundle.putInt(Constants.DAYMODEL_POSITION, dayModel.getPosition());
                this.B.k(dayModel.getContent_id(), bundle, Integer.valueOf(dayModel.getPosition()));
                if (dayModel.getStart_date() == 0) {
                    L1(true);
                    Iterator<CourseDayModelV1> it = N0().getPlanV3().iterator();
                    while (it.hasNext()) {
                        CourseDayModelV1 next = it.next();
                        if (dayModel.getPosition() == next.getPosition()) {
                            next.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    }
                }
                this.f10745s0 = true;
                f.b bVar = MyApplication.V.a().d().f;
                StringBuilder sb2 = new StringBuilder();
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                sb2.append(gv.n.y0(currentCourseName));
                sb2.append(" Plan Day");
                bVar.f(Integer.valueOf(dayModel.getPosition()), sb2.toString());
                return;
            }
            Intent intent = new Intent(this, DailyPlanOverviewV3.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString(Constants.COURSE_TITLE, dayModel.getContent_label());
            bundle2.putString(Constants.API_COURSE_LINK, dayModel.getContent_id());
            bundle2.putInt(Constants.DAYMODEL_POSITION, dayModel.getPosition());
            if (dayModel.getPosition() == 1 && dayModel.getStart_date() == 0) {
                z10 = true;
            }
            bundle2.putBoolean("showPlanFirstScreen", z10);
            if (this.f10719d0) {
                bundle2.putBoolean("tutorial", true);
            }
            intent.putExtras(bundle2);
            startActivityForResult(intent, this.M);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "exception", e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void t1(String str) {
        MenuItem menuItem;
        String str2;
        Menu menu;
        NavigationView navigationView = (NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView);
        if (navigationView != null && (menu = navigationView.getMenu()) != null) {
            menuItem = menu.findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -2114782937:
                        if (str.equals(Constants.COURSE_HAPPINESS)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.happinessLogsMenuTitle);
                            break;
                        }
                        break;
                    case -1617042330:
                        if (str.equals(Constants.COURSE_DEPRESSION)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.depressionLogsMenuTitle);
                            break;
                        }
                        break;
                    case -891989580:
                        if (str.equals(Constants.COURSE_STRESS)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.stressLogsMenuTitle);
                            break;
                        }
                        break;
                    case 92960775:
                        if (str.equals(Constants.COURSE_ANGER)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.angerLogsMenuTitle);
                            break;
                        }
                        break;
                    case 109522647:
                        if (str.equals(Constants.COURSE_SLEEP)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.sleepLogsMenuTitle);
                            break;
                        }
                        break;
                    case 113319009:
                        if (str.equals(Constants.COURSE_WORRY)) {
                            str2 = getString(com.theinnerhour.b2b.R.string.worryLogsMenuTitle);
                            break;
                        }
                        break;
                }
                menuItem.setTitle(str2);
            }
            str2 = "";
            menuItem.setTitle(str2);
        }
    }

    public final void u1() {
        this.U = true;
    }

    public final void v0() {
        try {
            Menu menu = ((BottomNavigationView) n0(com.theinnerhour.b2b.R.id.bnvLibraryNavigation)).getMenu();
            kotlin.jvm.internal.i.f(menu, "bnvLibraryNavigation.menu");
            Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
            int size = menu.size();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItem mi2 = menu.getItem(i6);
                kotlin.jvm.internal.i.f(mi2, "mi");
                kotlin.jvm.internal.i.f(font, "font");
                UtilsKt.applyFontToMenuItem(mi2, font, -1);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void v1() {
        boolean z10;
        boolean z11 = !defpackage.b.u(SessionManager.KEY_USERTYPE, "patient");
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
        String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
        if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            I1();
        } else if (z11) {
        } else {
            ml.p pVar = this.f10739o0;
            if (pVar != null) {
                Boolean bool = Boolean.FALSE;
                Boolean[] boolArr = this.f10741p0;
                boolArr[0] = bool;
                boolArr[1] = bool;
                ta.v.H(kc.f.H(pVar), null, 0, new ml.l(pVar, null), 3);
                return;
            }
            ml.p pVar2 = (ml.p) new o0(this, new ml.q(new rp.a(0), MyApplication.V.a(), 0)).a(ml.p.class);
            pVar2.A.e(this, new dk.a(22, new c0()));
            pVar2.B.e(this, new dk.a(23, new d0()));
            ta.v.H(kc.f.H(pVar2), null, 0, new ml.l(pVar2, null), 3);
            this.f10739o0 = pVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.theinnerhour.b2b.utils.CourseApiUtil] */
    public final void w0() {
        if (N0().getPlanV3().size() == 0 || ((N0().getPlanV3().size() == 15 && N0().getPlanV3().get(14).getStart_date() != 0) || (N0().getPlanV3().size() == 30 && N0().getPlanV3().get(29).getStart_date() != 0))) {
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            ?? courseApiUtil = new CourseApiUtil();
            xVar.f23469u = courseApiUtil;
            courseApiUtil.setCourseApiListener(new c(xVar));
            CourseApiUtil courseApiUtil2 = (CourseApiUtil) xVar.f23469u;
            if (courseApiUtil2 != null) {
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                CourseApiUtil.addAssessment$default(courseApiUtil2, currentCourseName, null, 2, null);
            }
            if (this.J0 != null) {
                P0().j();
            }
        }
    }

    public final void w1() {
        View actionView;
        View findViewById;
        try {
            int i6 = 8;
            if (ApplicationPersistence.getInstance().containsKey("offering_sessions_alert")) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivLeftMenuAlert);
                if (appCompatImageView != null) {
                    if (ApplicationPersistence.getInstance().getBooleanValue("offering_sessions_alert", false)) {
                        i6 = 0;
                    }
                    appCompatImageView.setVisibility(i6);
                }
                MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy);
                if (findItem != null && (actionView = findItem.getActionView()) != null && (findViewById = actionView.findViewById(com.theinnerhour.b2b.R.id.bgView)) != null) {
                    findViewById.setVisibility(0);
                    if (this.f10737n0 == null) {
                        AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 0, 24, null);
                        showPulseEffect$default.addListener(new e0(findViewById));
                        this.f10737n0 = showPulseEffect$default;
                        return;
                    }
                    return;
                }
                return;
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivLeftMenuAlert);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
            AnimatorSet animatorSet = this.f10737n0;
            if (animatorSet != null) {
                animatorSet.end();
                animatorSet.removeAllListeners();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void x0(boolean z10) {
        try {
            if (z10) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.gpaDashboardLayout)).setVisibility(8);
            } else if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && ((kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) && LocationPersistence.INSTANCE.isIndianUser())) {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.gpaDashboardLayout)).setVisibility(0);
                ((RobertoButton) n0(com.theinnerhour.b2b.R.id.gpaDashboardButton)).setOnClickListener(new dl.e0(this, 0));
            } else {
                ((ConstraintLayout) n0(com.theinnerhour.b2b.R.id.gpaDashboardLayout)).setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, e10);
        }
    }

    public final void x1() {
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
        if ((defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) && LocationPersistence.INSTANCE.isIndianUser()) {
            boolean z11 = true;
            ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_therapy).setVisible(true);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.TELECOMMUNICATION_CONSENT), Boolean.TRUE);
            } else {
                z10 = false;
            }
            View view5 = null;
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

    public final void y0() {
        View actionView;
        View findViewById;
        if (ApplicationPersistence.getInstance().containsKey("show_bookmarking_tool_tip") && ApplicationPersistence.getInstance().getBooleanValue("show_bookmarking_tool_tip", false)) {
            new e().start();
            n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).setVisibility(0);
            Bundle bundle = new Bundle();
            bundle.putString("course", N0().getCourseName());
            if (this.J0 != null) {
                bundle.putInt("bookmarked_activity_count", P0().k());
            }
            gk.a.b(bundle, "bookmark_repository_tooltip_display");
            n0(com.theinnerhour.b2b.R.id.viewLeftMenuBG).setVisibility(0);
            n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).setOnClickListener(DebouncedOnClickListener.wrap(new dl.e0(this, 3)));
            MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_saved_item);
            if (findItem != null && (actionView = findItem.getActionView()) != null && (findViewById = actionView.findViewById(com.theinnerhour.b2b.R.id.bookmarkingBgView)) != null) {
                findViewById.setVisibility(0);
                if (this.f10737n0 == null) {
                    AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 3, 8, null);
                    showPulseEffect$default.addListener(new d(findViewById));
                    this.f10737n0 = showPulseEffect$default;
                    return;
                }
                return;
            }
            return;
        }
        n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip).setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1() {
        int size;
        int i6;
        RobertoTextView robertoTextView;
        Object[] objArr;
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        String string;
        String str5;
        String str6;
        String str7;
        String str8;
        String lastName;
        String firstName;
        ((AppCompatImageView) n0(com.theinnerhour.b2b.R.id.ivLeftMenu)).setOnClickListener(new dl.e0(this, 25));
        try {
            robertoTextView = (RobertoTextView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenuName);
            objArr = new Object[1];
            User user = FirebasePersistence.getInstance().getUser();
            str = null;
            if (user != null) {
                str2 = user.getFirstName();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10748v, "Error setting name in Nav Drawer", e10);
        }
        if (!z10) {
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (firstName = user2.getFirstName()) != null) {
                str5 = gv.r.i1(firstName).toString();
            } else {
                str5 = null;
            }
            if (!kotlin.jvm.internal.i.b(str5, "null")) {
                StringBuilder sb2 = new StringBuilder();
                User user3 = FirebasePersistence.getInstance().getUser();
                if (user3 != null) {
                    str6 = user3.getFirstName();
                } else {
                    str6 = null;
                }
                sb2.append(str6);
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null) {
                    str7 = user4.getLastName();
                } else {
                    str7 = null;
                }
                if (str7 != null) {
                    User user5 = FirebasePersistence.getInstance().getUser();
                    if (user5 != null && (lastName = user5.getLastName()) != null) {
                        str = gv.r.i1(lastName).toString();
                    }
                    if (!kotlin.jvm.internal.i.b(str, "null")) {
                        str8 = " " + FirebasePersistence.getInstance().getUser().getLastName();
                        sb2.append(str8);
                        string = sb2.toString();
                        objArr[0] = string;
                        robertoTextView.setText(getString(com.theinnerhour.b2b.R.string.left_menu_dashboard_rate_us_title, objArr));
                        ((AppCompatImageView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenNewBackArrow)).setOnClickListener(new dl.e0(this, 26));
                        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_lock).setVisible(true);
                        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_saved_item).setVisible(true);
                        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs_library).setVisible(!kotlin.jvm.internal.i.b(this.L0, "default"));
                        if (this.f10752x != null) {
                            t1(N0().getCourseName());
                        } else {
                            t1("");
                        }
                        C0(this);
                        MenuItem findItem = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs);
                        ((xn.a) this.X.getValue()).getClass();
                        findItem.setVisible(!xn.a.f());
                        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).setNavigationItemSelectedListener(this);
                        Menu menu = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu();
                        kotlin.jvm.internal.i.f(menu, "dashboardv2NavView.menu");
                        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
                        int b10 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
                        size = menu.size();
                        for (i6 = 0; i6 < size; i6++) {
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
                    }
                }
                str8 = "";
                sb2.append(str8);
                string = sb2.toString();
                objArr[0] = string;
                robertoTextView.setText(getString(com.theinnerhour.b2b.R.string.left_menu_dashboard_rate_us_title, objArr));
                ((AppCompatImageView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenNewBackArrow)).setOnClickListener(new dl.e0(this, 26));
                ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_lock).setVisible(true);
                ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_saved_item).setVisible(true);
                ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs_library).setVisible(!kotlin.jvm.internal.i.b(this.L0, "default"));
                if (this.f10752x != null) {
                }
                C0(this);
                MenuItem findItem2 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs);
                ((xn.a) this.X.getValue()).getClass();
                findItem2.setVisible(!xn.a.f());
                ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).setNavigationItemSelectedListener(this);
                Menu menu2 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu();
                kotlin.jvm.internal.i.f(menu2, "dashboardv2NavView.menu");
                Typeface font2 = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
                int b102 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
                size = menu2.size();
                while (i6 < size) {
                }
            }
        }
        Object[] objArr2 = new Object[2];
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
        kotlin.jvm.internal.i.f(stringValue, "getInstance()\n          …ionManager.KEY_FIRSTNAME)");
        if (kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
            str3 = "";
        } else {
            str3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
        }
        objArr2[0] = str3;
        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
        kotlin.jvm.internal.i.f(stringValue2, "getInstance()\n          …sionManager.KEY_LASTNAME)");
        if (kotlin.jvm.internal.i.b(gv.r.i1(stringValue2).toString(), "null")) {
            str4 = "";
        } else {
            str4 = SessionManager.getInstance().getStringValue(SessionManager.KEY_LASTNAME);
        }
        objArr2[1] = str4;
        string = getString(com.theinnerhour.b2b.R.string.profileNewSessionsName, objArr2);
        kotlin.jvm.internal.i.f(string, "{\n                    ge…      )\n                }");
        objArr[0] = string;
        robertoTextView.setText(getString(com.theinnerhour.b2b.R.string.left_menu_dashboard_rate_us_title, objArr));
        ((AppCompatImageView) ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).d().findViewById(com.theinnerhour.b2b.R.id.dashboardMenNewBackArrow)).setOnClickListener(new dl.e0(this, 26));
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_lock).setVisible(true);
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_saved_item).setVisible(true);
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_logs_library).setVisible(!kotlin.jvm.internal.i.b(this.L0, "default"));
        if (this.f10752x != null) {
        }
        C0(this);
        MenuItem findItem22 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu().findItem(com.theinnerhour.b2b.R.id.nav_dashboard_tracker_logs);
        ((xn.a) this.X.getValue()).getClass();
        findItem22.setVisible(!xn.a.f());
        ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).setNavigationItemSelectedListener(this);
        Menu menu22 = ((NavigationView) n0(com.theinnerhour.b2b.R.id.dashboardv2NavView)).getMenu();
        kotlin.jvm.internal.i.f(menu22, "dashboardv2NavView.menu");
        Typeface font22 = Typeface.createFromAsset(getAssets(), "fonts/Lato-Bold.ttf");
        int b1022 = g0.a.b(this, com.theinnerhour.b2b.R.color.title_high_contrast);
        size = menu22.size();
        while (i6 < size) {
        }
    }

    public final void z0() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        androidx.lifecycle.w<ArrayList<String>> wVar;
        ArrayList<String> d10;
        boolean z13;
        androidx.lifecycle.w<ArrayList<String>> wVar2;
        ArrayList<String> d11;
        boolean z14 = this.X0;
        RoutingType routingType = null;
        String str = this.f10748v;
        boolean z15 = true;
        if (z14) {
            km.d dVar = this.Y0;
            if (dVar != null && (wVar2 = dVar.A) != null && (d11 = wVar2.d()) != null) {
                i6 = d11.size();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                km.d dVar2 = this.Y0;
                if (dVar2 != null && (wVar = dVar2.A) != null && (d10 = wVar.d()) != null) {
                    try {
                        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                        String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                        if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (this.Z0 && !z13) {
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flPWAMatchedProvidersContainer)).setVisibility(0);
                            ((FrameLayout) n0(com.theinnerhour.b2b.R.id.flExpertCareContainer)).setVisibility(8);
                            ((LinearLayout) n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperiment)).setVisibility(8);
                            n0(com.theinnerhour.b2b.R.id.llDashboardProviderEntryPointExperimentFooter).setVisibility(8);
                            n0(com.theinnerhour.b2b.R.id.cvDashboardProviderAssignedEntry).setVisibility(8);
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("uuids", d10);
                            hm.a aVar = new hm.a();
                            aVar.setArguments(bundle);
                            androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar2.f(com.theinnerhour.b2b.R.id.flPWAMatchedProvidersContainer, aVar, null);
                            aVar2.j();
                            this.Z0 = false;
                            RoutingIntentHandler d12 = P0().X.d();
                            if (d12 != null) {
                                routingType = d12.getRoutingType();
                            }
                            if (routingType == RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL) {
                                RoutingIntentHandler d13 = P0().X.d();
                                if ((d13 == null || d13.isRoutingCompleted()) ? false : false) {
                                    try {
                                        ((ScrollView) n0(com.theinnerhour.b2b.R.id.scrollView2)).post(new dl.v(this, 0));
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(str, e10);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(str, e11);
                        return;
                    }
                }
                return;
            }
        }
        if (this.Q0) {
            boolean z16 = !defpackage.b.u(SessionManager.KEY_USERTYPE, "patient");
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                z10 = true;
            } else {
                z10 = false;
            }
            String stringValue4 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
            if (stringValue4 != null && !kotlin.jvm.internal.i.b(stringValue4, "null") && !kotlin.jvm.internal.i.b(stringValue4, "")) {
                z11 = false;
            } else {
                z11 = true;
            }
            String stringValue5 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
            if (stringValue5 != null && !kotlin.jvm.internal.i.b(stringValue5, "null") && !kotlin.jvm.internal.i.b(stringValue5, "")) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((!z16 || !z11 || !z12) && !z10) {
                if (LocationPersistence.INSTANCE.isIndianUser() || !z11 || !z12) {
                    try {
                        if (this.R0) {
                            androidx.fragment.app.y supportFragmentManager2 = getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                            aVar3.f(com.theinnerhour.b2b.R.id.flExpertCareContainer, new tl.d(), null);
                            aVar3.j();
                            this.R0 = false;
                            RoutingIntentHandler d14 = P0().X.d();
                            if (d14 != null) {
                                routingType = d14.getRoutingType();
                            }
                            if (routingType == RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL) {
                                RoutingIntentHandler d15 = P0().X.d();
                                if ((d15 == null || d15.isRoutingCompleted()) ? false : false) {
                                    try {
                                        ((ScrollView) n0(com.theinnerhour.b2b.R.id.scrollView2)).post(new dl.v(this, 2));
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(str, e12);
                                    }
                                }
                            }
                        }
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e(str, e13);
                    }
                }
            }
        } else if (this.D) {
            v1();
        } else {
            LocationPersistence.INSTANCE.fetchLocationInfo(new f());
        }
    }

    public final void z1(boolean z10) {
        Fragment F;
        if (this.B0 != null && !z10) {
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
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new o0(this, new jl.q(application, this.C0, cVar)).a(MonetizationViewModel.class);
        monetizationViewModel.f();
        monetizationViewModel.C.e(this, new dk.a(26, new f0()));
        this.B0 = monetizationViewModel;
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements CourseApiUtil.CourseApiUtilInterface {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<CourseApiUtil> f10763v;

        public c(kotlin.jvm.internal.x<CourseApiUtil> xVar) {
            this.f10763v = xVar;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            int i6 = V3DashboardActivity.f10714r1;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.r1();
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            v3DashboardActivity.getClass();
            v3DashboardActivity.f10752x = courseById;
            kotlin.jvm.internal.x<CourseApiUtil> xVar = this.f10763v;
            CourseApiUtil courseApiUtil = xVar.f23469u;
            if (courseApiUtil != null) {
                courseApiUtil.removeCourseApiListener();
            }
            xVar.f23469u = null;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception error) {
            kotlin.jvm.internal.i.g(error, "error");
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f implements LocationInterface {
        public f() {
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            boolean z10;
            HashMap<String, Object> appConfig;
            User user = FirebasePersistence.getInstance().getUser();
            boolean z11 = false;
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.DASHBOARD_INTEGRATED_TELECONSULTATION_EXP), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (z10 && LocationPersistence.INSTANCE.isIndianUser() && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                z11 = true;
            }
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            v3DashboardActivity.f10755y0 = z11;
            v3DashboardActivity.D = true;
            v3DashboardActivity.v1();
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class r implements CourseApiUtil.CourseApiUtilInterface {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<CourseApiUtil> f10790v;

        public r(kotlin.jvm.internal.x<CourseApiUtil> xVar) {
            this.f10790v = xVar;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void courseApiComplete(boolean z10) {
            tk.c cVar;
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            ProgressDialog progressDialog = v3DashboardActivity.f10750w;
            if (progressDialog != null) {
                progressDialog.dismiss();
                v3DashboardActivity.B.d();
                v3DashboardActivity.a1(false);
                if (v3DashboardActivity.J0 != null) {
                    v3DashboardActivity.P0().j();
                }
                v3DashboardActivity.z0();
                Fragment F = v3DashboardActivity.getSupportFragmentManager().F("communities_fragment");
                if (F instanceof tk.c) {
                    cVar = (tk.c) F;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.M();
                }
                kotlin.jvm.internal.x<CourseApiUtil> xVar = this.f10790v;
                CourseApiUtil courseApiUtil = xVar.f23469u;
                if (courseApiUtil != null) {
                    courseApiUtil.removeCourseApiListener();
                }
                xVar.f23469u = null;
                return;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void errorLoadingData(Exception error) {
            kotlin.jvm.internal.i.g(error, "error");
            Extensions.toast$default(Extensions.INSTANCE, V3DashboardActivity.this, "Error, Please try again", 0, 2, null);
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void audioDownloadComplete() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
        public final void notificationFetchComplete(boolean z10) {
        }
    }

    @Override // xk.a
    public final void W() {
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends CountDownTimer {
        public e() {
            super(5000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            try {
                if (!v3DashboardActivity.isFinishing()) {
                    View n02 = v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.cvDashboardBookmarkingToolTip);
                    if (n02 != null) {
                        n02.setVisibility(8);
                    }
                    View n03 = v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.viewLeftMenuBG);
                    if (n03 != null) {
                        n03.setVisibility(8);
                    }
                }
                ApplicationPersistence.getInstance().setBooleanValue("show_bookmarking_tool_tip", false);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h0 extends BottomSheetBehavior.f {
        public h0() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            if (i6 != 1 && i6 != 3) {
                if (i6 == 4) {
                    v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.viewSwitchAssessmentAndWeekBG).setVisibility(8);
                    return;
                }
                return;
            }
            v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.viewSwitchAssessmentAndWeekBG).setVisibility(0);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }

    /* compiled from: V3DashboardActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j implements Animation.AnimationListener {
        public j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            V3DashboardActivity v3DashboardActivity = V3DashboardActivity.this;
            ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.dayPlanContainer);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
            v3DashboardActivity.getClass();
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(v3DashboardActivity, com.theinnerhour.b2b.R.anim.slide_fade_in_left);
                loadAnimation.setAnimationListener(new l2(v3DashboardActivity));
                ((ConstraintLayout) v3DashboardActivity.n0(com.theinnerhour.b2b.R.id.weeksAndAssessmentContainer)).startAnimation(loadAnimation);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
