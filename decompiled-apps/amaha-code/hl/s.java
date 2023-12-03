package hl;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CommunityOnBoardingWelcomeActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedCardItem;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.journal.model.Questions;
import com.theinnerhour.b2b.components.monetization.models.CampaignElementModel;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.AssessmentResponse;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.AssessmentResponseCategory;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.a1;
import fm.j1;
import fm.y0;
import g0.a;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import jl.c1;
import jl.d1;
import jl.e1;
import jl.f1;
import kotlin.Metadata;
import kotlinx.coroutines.o0;
import li.a;
import mi.i1;
import nn.x0;
import nn.z0;
/* compiled from: NotV4DashboardFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhl/s;", "Landroidx/fragment/app/Fragment;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "Lxk/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends Fragment implements SubscriptionPersistence.SubscriptionInitialiseListener, xk.a {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f17728g0 = 0;
    public il.d A;
    public boolean B;
    public SubscriptionModel E;
    public ArrayList<Integer> F;
    public boolean G;
    public boolean H;
    public xj.b I;
    public boolean J;
    public final boolean K;
    public boolean L;
    public final boolean M;
    public final yn.a N;
    public final String O;
    public boolean P;
    public a1 Q;
    public boolean R;
    public final androidx.activity.result.c<Intent> S;
    public final androidx.activity.result.c<Intent> T;
    public final androidx.activity.result.c<Intent> U;
    public final androidx.activity.result.c<Intent> V;
    public final androidx.activity.result.c<Intent> W;
    public final androidx.activity.result.c<Intent> X;
    public final androidx.activity.result.c<Intent> Y;
    public final androidx.activity.result.c<Intent> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f17729a0;

    /* renamed from: b0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f17730b0;
    public final androidx.activity.result.c<Intent> c0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f17731d0;
    public final hl.o e0;

    /* renamed from: v  reason: collision with root package name */
    public NotV4DashboardViewModel f17734v;

    /* renamed from: w  reason: collision with root package name */
    public MonetizationViewModel f17735w;

    /* renamed from: x  reason: collision with root package name */
    public Dialog f17736x;

    /* renamed from: y  reason: collision with root package name */
    public int f17737y;

    /* renamed from: z  reason: collision with root package name */
    public Timer f17738z;

    /* renamed from: f0  reason: collision with root package name */
    public final LinkedHashMap f17732f0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17733u = LogHelper.INSTANCE.makeLogTag("NotV4DashboardFragment");
    public List<String> C = is.w.f20676u;
    public final s5 D = new s5(12);

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17739a;

        static {
            int[] iArr = new int[SuggestedCardItem.values().length];
            try {
                iArr[SuggestedCardItem.ASSESSMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuggestedCardItem.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuggestedCardItem.SUGGESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17739a = iArr;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean bool;
            Boolean contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null && contentIfNotHandled.booleanValue()) {
                boolean b10 = kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "");
                s sVar = s.this;
                if (!b10) {
                    il.d dVar = sVar.A;
                    if (dVar != null) {
                        dVar.x();
                    }
                } else {
                    androidx.activity.result.c<Intent> cVar = sVar.f17730b0;
                    androidx.fragment.app.p requireActivity = sVar.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    Intent putExtra = tr.r.s(requireActivity, false).putExtra("source", "assessment").putExtra("tutorial", true);
                    Intent intent = sVar.requireActivity().getIntent();
                    if (intent != null) {
                        bool = Boolean.valueOf(intent.getBooleanExtra("onboarding_flow_new_user", false));
                    } else {
                        bool = null;
                    }
                    cVar.a(putExtra.putExtra("onboarding_flow_new_user", bool));
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
            String contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                Toast.makeText(s.this.requireContext(), contentIfNotHandled, 1).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<JournalModel, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(JournalModel journalModel) {
            JournalModel journalModel2 = journalModel;
            if (journalModel2 != null) {
                ApplicationPersistence.getInstance().setStringValue("journal_last_entry_date", new il.a().b(journalModel2.getLastUpdated()));
                int i6 = s.f17728g0;
                s.this.a0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            s sVar = s.this;
            sVar.N.getClass();
            if (!yn.a.b()) {
                sVar.N.f38694a.getClass();
                if (kotlin.jvm.internal.i.b(df.b.p(), "variant_a")) {
                    sVar.m0("post_assessment", "assessment");
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<RoutingIntentHandler, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f17745v;

        /* compiled from: NotV4DashboardFragment.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17746a;

            static {
                int[] iArr = new int[RoutingType.values().length];
                try {
                    iArr[RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RoutingType.JOURNAL_ROUTE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f17746a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(NotV4DashboardViewModel notV4DashboardViewModel) {
            super(1);
            this.f17745v = notV4DashboardViewModel;
        }

        @Override // ss.l
        public final hs.k invoke(RoutingIntentHandler routingIntentHandler) {
            RoutingIntentHandler routingIntentHandler2 = routingIntentHandler;
            s sVar = s.this;
            NestedScrollView nestedScrollView = (NestedScrollView) sVar._$_findCachedViewById(R.id.nsvNotV4Db);
            if (nestedScrollView != null) {
                nestedScrollView.post(new ni.c(6, sVar, routingIntentHandler2, this.f17745v));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                int i6 = s.f17728g0;
                s sVar = s.this;
                sVar.getClass();
                FeedBackUtils feedBackUtils = new FeedBackUtils();
                androidx.fragment.app.p requireActivity = sVar.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                feedBackUtils.setActivity(requireActivity);
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_show");
                Dialog dialog = UiUtils.Companion.getDialog(R.layout.dialog_topical_remove, sVar.requireContext());
                Window window = dialog.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
                ((RobertoTextView) dialog.findViewById(R.id.btnTopicalCancel)).setOnClickListener(new hl.e(dialog, feedBackUtils, 1));
                ((RobertoTextView) dialog.findViewById(R.id.btnTopicalPositive)).setOnClickListener(new dk.t(dialog, sVar, feedBackUtils, 16));
                dialog.setCancelable(false);
                dialog.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                s sVar = s.this;
                if (sVar.f17734v != null) {
                    sVar.Q();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
                int i6 = s.f17728g0;
                s.this.X();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<List<? extends NotV4RecentModel>, hs.k> {
        public j() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends NotV4RecentModel> list) {
            RecyclerView.e eVar;
            ViewTreeObserver viewTreeObserver;
            List<? extends NotV4RecentModel> list2 = list;
            if (list2 != null) {
                int i6 = s.f17728g0;
                s sVar = s.this;
                sVar.getClass();
                try {
                    if (!list2.isEmpty()) {
                        RecyclerView recyclerView = (RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler);
                        RecyclerView.e eVar2 = null;
                        if (recyclerView != null) {
                            eVar = recyclerView.getAdapter();
                        } else {
                            eVar = null;
                        }
                        if (eVar == null) {
                            RecyclerView recyclerView2 = (RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler);
                            if (recyclerView2 != null) {
                                recyclerView2.setLayoutManager(new LinearLayoutManager(sVar.requireContext(), 0, false));
                            }
                            sVar._$_findCachedViewById(R.id.layoutNotV4DbRecent).setVisibility(0);
                            sVar._$_findCachedViewById(R.id.viewDividerSection3).setVisibility(0);
                            RecyclerView recyclerView3 = (RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler);
                            if (recyclerView3 != null) {
                                Context requireContext = sVar.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                recyclerView3.setAdapter(new gl.b(list2, requireContext, new f0(sVar)));
                            }
                            RecyclerView recyclerView4 = (RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler);
                            if (recyclerView4 != null && (viewTreeObserver = recyclerView4.getViewTreeObserver()) != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(new g0(sVar));
                            }
                        } else {
                            RecyclerView recyclerView5 = (RecyclerView) sVar._$_findCachedViewById(R.id.rvNotV4DashboardRecentRecycler);
                            if (recyclerView5 != null) {
                                eVar2 = recyclerView5.getAdapter();
                            }
                            kotlin.jvm.internal.i.e(eVar2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.experiment.adapter.NotV4RecentAdapter");
                            gl.b bVar = (gl.b) eVar2;
                            bVar.f16589x = list2;
                            bVar.i();
                        }
                    } else {
                        sVar._$_findCachedViewById(R.id.layoutNotV4DbRecent).setVisibility(8);
                        sVar._$_findCachedViewById(R.id.viewDividerSection3).setVisibility(8);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(sVar.f17733u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String string;
            String str2 = str;
            if (str2 != null) {
                s sVar = s.this;
                ((RobertoTextView) sVar._$_findCachedViewById(R.id.ivNotV4DbWelcomeHeader)).setText(sVar.getString(R.string.notV4DbWelcomeHeader, str2));
                RobertoTextView robertoTextView = (RobertoTextView) sVar._$_findCachedViewById(R.id.tvJournalSubHeader);
                if (!gv.n.B0(str2) && !kotlin.jvm.internal.i.b(str2, "null")) {
                    string = sVar.getString(R.string.your_journal_name, str2);
                } else {
                    string = sVar.getString(R.string.your_journal_generic);
                }
                robertoTextView.setText(string);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {
        public l() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String str2;
            boolean z10;
            String concat;
            String str3 = str;
            if (str3 != null) {
                s sVar = s.this;
                com.bumptech.glide.f i6 = Glide.i(sVar.requireActivity());
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str2 = user.getProfile_path();
                } else {
                    str2 = null;
                }
                if (str2 != null && !gv.n.B0(str2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    concat = "https://assets.theinnerhour.com/avatar/avatar_flower_1.png";
                } else {
                    concat = "https://".concat(str3);
                }
                i6.p(concat).B((CircleImageView) sVar._$_findCachedViewById(R.id.ivNotV4DbProfileLogo));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.l<SuggestedCardItem, hs.k> {
        public m() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SuggestedCardItem suggestedCardItem) {
            boolean z10;
            ArrayList<MiniCourse> miniCourses;
            SuggestedCardItem suggestedCardItem2 = suggestedCardItem;
            if (suggestedCardItem2 != null) {
                int i6 = s.f17728g0;
                s sVar = s.this;
                sVar.getClass();
                try {
                    int i10 = a.f17739a[suggestedCardItem2.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sVar.g0();
                                ((CardView) sVar._$_findCachedViewById(R.id.cvNewDbSuggestedActivity)).setVisibility(0);
                                ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentDetails)).setVisibility(0);
                                ((HorizontalScrollView) sVar._$_findCachedViewById(R.id.hsvNewDbAssessmentInfo)).setVisibility(8);
                                ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentCTA)).setVisibility(8);
                                ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentInfo1CompletionOverlay)).setVisibility(8);
                                ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentRetryText)).setVisibility(8);
                                ((RobertoButton) sVar._$_findCachedViewById(R.id.rbNewDbStartAssessmentRetryCta)).setVisibility(8);
                                User user = FirebasePersistence.getInstance().getUser();
                                if (user != null && (miniCourses = user.getMiniCourses()) != null && miniCourses.isEmpty()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && !ApplicationPersistence.getInstance().getBooleanValue("new_user", false)) {
                                    il.d dVar = sVar.A;
                                    if (dVar != null) {
                                        dVar.D();
                                    }
                                }
                                if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("notV4HomeCoachMarkStep"), "two")) {
                                    if (!sVar.H) {
                                        sVar.H = true;
                                        androidx.fragment.app.p requireActivity = sVar.requireActivity();
                                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                        new il.j(requireActivity, sVar.getView(), new d0(sVar), new e0(sVar));
                                    }
                                } else {
                                    il.d dVar2 = sVar.A;
                                    if (dVar2 != null) {
                                        dVar2.D();
                                    }
                                }
                            }
                        } else {
                            ((CardView) sVar._$_findCachedViewById(R.id.cvNewDbSuggestedActivity)).setVisibility(8);
                            ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentDetails)).setVisibility(8);
                            ((HorizontalScrollView) sVar._$_findCachedViewById(R.id.hsvNewDbAssessmentInfo)).setVisibility(0);
                            ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentCTA)).setVisibility(8);
                            ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentInfo1CompletionOverlay)).setVisibility(0);
                            ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentRetryText)).setVisibility(0);
                            RobertoTextView robertoTextView = (RobertoTextView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentDescription1);
                            if (robertoTextView != null) {
                                robertoTextView.setText(sVar.getString(R.string.notV4DbAssessmentInfo4));
                            }
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.rbNewDbStartAssessmentRetryCta)).setVisibility(0);
                        }
                    } else {
                        ((CardView) sVar._$_findCachedViewById(R.id.cvNewDbSuggestedActivity)).setVisibility(8);
                        ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentDetails)).setVisibility(8);
                        ((HorizontalScrollView) sVar._$_findCachedViewById(R.id.hsvNewDbAssessmentInfo)).setVisibility(0);
                        ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentCTA)).setVisibility(0);
                        ((AppCompatImageView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentInfo1CompletionOverlay)).setVisibility(8);
                        ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNewDbStartAssessmentRetryText)).setVisibility(8);
                        ((RobertoButton) sVar._$_findCachedViewById(R.id.rbNewDbStartAssessmentRetryCta)).setVisibility(8);
                        RobertoTextView robertoTextView2 = (RobertoTextView) sVar._$_findCachedViewById(R.id.ivNewDbAssessmentDescription1);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(sVar.getString(R.string.notV4DbAssessmentInfo1));
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(sVar.f17733u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.l<ArrayList<TherapistPackagesModel>, hs.k> {
        public n() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<TherapistPackagesModel> arrayList) {
            boolean z10;
            Object obj;
            RecyclerView.e eVar;
            qp.b bVar;
            RoutingType routingType;
            final RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            RecyclerView recyclerView4;
            RecyclerView.e eVar2;
            qp.d dVar;
            final RecyclerView recyclerView5;
            String str;
            String str2;
            RecyclerView recyclerView6;
            RecyclerView recyclerView7;
            RecyclerView recyclerView8;
            boolean z11;
            HashMap<String, Object> appConfig;
            ArrayList<TherapistPackagesModel> arrayList2 = arrayList;
            boolean z12 = false;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                int i6 = s.f17728g0;
                final s sVar = s.this;
                sVar.getClass();
                if (arrayList2 != null) {
                    try {
                        sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).setVisibility(0);
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (appConfig = user.getAppConfig()) != null) {
                            obj = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                        } else {
                            obj = null;
                        }
                        if (kotlin.jvm.internal.i.b(obj, "e")) {
                            int i10 = 0;
                            for (Object obj2 : arrayList2) {
                                int i11 = i10 + 1;
                                if (i10 >= 0) {
                                    TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) obj2;
                                    if (i10 == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    therapistPackagesModel.setIs_recommended(z11);
                                    i10 = i11;
                                } else {
                                    ca.a.t1();
                                    throw null;
                                }
                            }
                            View _$_findCachedViewById = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                            if (_$_findCachedViewById != null && (recyclerView8 = (RecyclerView) _$_findCachedViewById.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                eVar2 = recyclerView8.getAdapter();
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 instanceof qp.d) {
                                dVar = (qp.d) eVar2;
                            } else {
                                dVar = null;
                            }
                            s5 s5Var = sVar.D;
                            if (dVar != null) {
                                Timer timer = sVar.f17738z;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                sVar.f17738z = null;
                                dVar.f29998x = arrayList2;
                                dVar.i();
                                RobertoTextView robertoTextView = (RobertoTextView) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardTitle);
                                Object[] objArr = new Object[1];
                                User user2 = FirebasePersistence.getInstance().getUser();
                                if (user2 != null) {
                                    str2 = user2.getCurrentCourseName();
                                } else {
                                    str2 = null;
                                }
                                s5Var.getClass();
                                objArr[0] = s5.j(str2);
                                robertoTextView.setText(sVar.getString(R.string.teleEntryCardVarEHeader, objArr));
                                View _$_findCachedViewById2 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById2 != null && (recyclerView7 = (RecyclerView) _$_findCachedViewById2.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView7.h0(5000);
                                }
                                View _$_findCachedViewById3 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById3 != null && (recyclerView6 = (RecyclerView) _$_findCachedViewById3.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView6.k0(10, 0, false);
                                }
                                Timer timer2 = new Timer();
                                sVar.f17738z = timer2;
                                timer2.scheduleAtFixedRate(new hl.t(sVar), 8000L, 5000L);
                            } else {
                                View _$_findCachedViewById4 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById4 != null && (recyclerView5 = (RecyclerView) _$_findCachedViewById4.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView5.setLayoutManager(new CenterZoomLayoutManager(sVar.requireActivity(), 0, false, 0.0f, 1.5f, null, 32, null));
                                    androidx.fragment.app.p requireActivity = sVar.requireActivity();
                                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                    recyclerView5.setAdapter(new qp.d(requireActivity, arrayList2, new hl.u(sVar), new hl.v(sVar), new hl.w(sVar)));
                                    recyclerView5.post(new Runnable() { // from class: hl.r
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = r4;
                                            s this$0 = sVar;
                                            s this_run = sVar;
                                            RecyclerView this_apply = recyclerView5;
                                            switch (i12) {
                                                case 0:
                                                    int i13 = s.f17728g0;
                                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                                    kotlin.jvm.internal.i.g(this_run, "$this_run");
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    this_apply.h0(5000);
                                                    this_apply.k0(10, 0, false);
                                                    Timer timer3 = new Timer();
                                                    this_run.f17738z = timer3;
                                                    timer3.scheduleAtFixedRate(new x(this$0, this_run), 8000L, 5000L);
                                                    this_apply.h(new y(this_run));
                                                    return;
                                                default:
                                                    int i14 = s.f17728g0;
                                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                                    kotlin.jvm.internal.i.g(this_run, "$this_run");
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    this_apply.h0(5000);
                                                    this_apply.k0(10, 0, false);
                                                    Timer timer4 = new Timer();
                                                    this_run.f17738z = timer4;
                                                    timer4.scheduleAtFixedRate(new b0(this$0, this_run), 8000L, 5000L);
                                                    this_apply.h(new c0(this_run));
                                                    return;
                                            }
                                        }
                                    });
                                }
                            }
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setText(sVar.getString(R.string.teleEntryCardVarECTA));
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(sVar.requireActivity(), R.color.campaignLightBlue)));
                            ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCtaDescription)).setVisibility(0);
                            RobertoTextView robertoTextView2 = (RobertoTextView) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardTitle);
                            Object[] objArr2 = new Object[1];
                            User user3 = FirebasePersistence.getInstance().getUser();
                            if (user3 != null) {
                                str = user3.getCurrentCourseName();
                            } else {
                                str = null;
                            }
                            s5Var.getClass();
                            objArr2[0] = s5.j(str);
                            robertoTextView2.setText(sVar.getString(R.string.teleEntryCardVarEHeader, objArr2));
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setOnClickListener(new hl.m(sVar, 24));
                            routingType = null;
                        } else {
                            View _$_findCachedViewById5 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                            if (_$_findCachedViewById5 != null && (recyclerView4 = (RecyclerView) _$_findCachedViewById5.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                eVar = recyclerView4.getAdapter();
                            } else {
                                eVar = null;
                            }
                            if (eVar instanceof qp.b) {
                                bVar = (qp.b) eVar;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                Timer timer3 = sVar.f17738z;
                                if (timer3 != null) {
                                    timer3.cancel();
                                }
                                routingType = null;
                                sVar.f17738z = null;
                                bVar.f29985x = arrayList2;
                                bVar.i();
                                View _$_findCachedViewById6 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById6 != null && (recyclerView3 = (RecyclerView) _$_findCachedViewById6.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView3.h0(5000);
                                }
                                View _$_findCachedViewById7 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById7 != null && (recyclerView2 = (RecyclerView) _$_findCachedViewById7.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView2.k0(10, 0, false);
                                }
                                Timer timer4 = new Timer();
                                sVar.f17738z = timer4;
                                timer4.scheduleAtFixedRate(new z(sVar), 8000L, 5000L);
                            } else {
                                routingType = null;
                                View _$_findCachedViewById8 = sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint);
                                if (_$_findCachedViewById8 != null && (recyclerView = (RecyclerView) _$_findCachedViewById8.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                                    recyclerView.setAdapter(new qp.b(arrayList2, true, false, new a0(sVar)));
                                    recyclerView.post(new Runnable() { // from class: hl.r
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = r4;
                                            s this$0 = sVar;
                                            s this_run = sVar;
                                            RecyclerView this_apply = recyclerView;
                                            switch (i12) {
                                                case 0:
                                                    int i13 = s.f17728g0;
                                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                                    kotlin.jvm.internal.i.g(this_run, "$this_run");
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    this_apply.h0(5000);
                                                    this_apply.k0(10, 0, false);
                                                    Timer timer32 = new Timer();
                                                    this_run.f17738z = timer32;
                                                    timer32.scheduleAtFixedRate(new x(this$0, this_run), 8000L, 5000L);
                                                    this_apply.h(new y(this_run));
                                                    return;
                                                default:
                                                    int i14 = s.f17728g0;
                                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                                    kotlin.jvm.internal.i.g(this_run, "$this_run");
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    this_apply.h0(5000);
                                                    this_apply.k0(10, 0, false);
                                                    Timer timer42 = new Timer();
                                                    this_run.f17738z = timer42;
                                                    timer42.scheduleAtFixedRate(new b0(this$0, this_run), 8000L, 5000L);
                                                    this_apply.h(new c0(this_run));
                                                    return;
                                            }
                                        }
                                    });
                                }
                            }
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setText(sVar.getString(R.string.teleEntryCardVarDCTA));
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(sVar.requireActivity(), R.color.sea)));
                            ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCtaDescription)).setVisibility(8);
                            ((RobertoButton) sVar._$_findCachedViewById(R.id.tvProviderEntryVar2CardCTA)).setOnClickListener(new hl.m(sVar, 25));
                        }
                        RoutingIntentHandler d10 = sVar.O().T.d();
                        if (d10 != null) {
                            routingType = d10.getRoutingType();
                        }
                        if (routingType == RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL) {
                            RoutingIntentHandler d11 = sVar.O().T.d();
                            if (d11 != null && !d11.isRoutingCompleted()) {
                                z12 = true;
                            }
                            if (z12) {
                                new Handler(Looper.getMainLooper()).postDelayed(new hl.n(sVar, 4), 300L);
                            }
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(sVar.f17733u, "exception", e10);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public o() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[Catch: Exception -> 0x0159, TryCatch #0 {Exception -> 0x0159, blocks: (B:5:0x0016, B:9:0x002b, B:11:0x0033, B:15:0x0048, B:18:0x0058, B:20:0x005e, B:25:0x0068, B:27:0x0074, B:29:0x007a, B:38:0x008c, B:41:0x0092, B:45:0x009e, B:46:0x00a3, B:50:0x00b9, B:52:0x00bf, B:54:0x00ce, B:56:0x00d4, B:58:0x00e1, B:60:0x00e7, B:61:0x00ed, B:65:0x00f8, B:67:0x010e, B:71:0x0121, B:72:0x0149, B:73:0x0151), top: B:82:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Boolean bool) {
            boolean z10;
            boolean z11;
            String stringValue;
            boolean z12;
            String stringValue2;
            boolean z13;
            String str;
            boolean z14;
            float f;
            HashMap<String, Object> appConfig;
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                int i6 = s.f17728g0;
                s sVar = s.this;
                sVar.getClass();
                try {
                    if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                    if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(sVar.f17733u, "exception", e10);
                }
                if (stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) {
                    z12 = false;
                    stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                    if (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")) {
                        z13 = false;
                        if (z10 || !z12 || !z13) {
                            if (!sVar.M) {
                                if (!z11 && (LocationPersistence.INSTANCE.isIndianUser() || !z12 || !z13)) {
                                    sVar.P();
                                }
                            } else {
                                LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
                                if ((!gv.n.B0(locationPersistence.getCurrentCountry())) && !z11 && z12) {
                                    if (locationPersistence.isIndianUser()) {
                                        NotV4DashboardViewModel O = sVar.O();
                                        User user = FirebasePersistence.getInstance().getUser();
                                        Object obj = null;
                                        if (user != null) {
                                            str = user.getCurrentCourseName();
                                        } else {
                                            str = null;
                                        }
                                        O.o(str);
                                        User user2 = FirebasePersistence.getInstance().getUser();
                                        if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                                            obj = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                                        }
                                        if (!kotlin.jvm.internal.i.b(obj, "e")) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).setVisibility(0);
                                        RecyclerView recyclerView = (RecyclerView) sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).findViewById(R.id.tvProviderEntryVar2CardRecycler);
                                        if (recyclerView != null) {
                                            Context requireContext = sVar.requireContext();
                                            if (z14) {
                                                f = 0.2f;
                                            } else {
                                                f = 0.0f;
                                            }
                                            recyclerView.setLayoutManager(new CenterZoomLayoutManager(requireContext, 0, false, f, 1.5f, null, 32, null));
                                            recyclerView.setAdapter(new qp.a(z14));
                                            new androidx.recyclerview.widget.r().a(recyclerView);
                                            recyclerView.post(new ne.u(recyclerView, 25, sVar));
                                        }
                                    } else {
                                        sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).setVisibility(8);
                                    }
                                } else {
                                    sVar._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).setVisibility(8);
                                }
                            }
                        }
                        sVar.J(false);
                        sVar.h0(true);
                        if (sVar.B) {
                            sVar.j0();
                            sVar.B = false;
                        }
                    }
                    z13 = true;
                    if (z10) {
                    }
                    if (!sVar.M) {
                    }
                    sVar.J(false);
                    sVar.h0(true);
                    if (sVar.B) {
                    }
                }
                z12 = true;
                stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                if (stringValue2 != null) {
                    z13 = false;
                    if (z10) {
                    }
                    if (!sVar.M) {
                    }
                    sVar.J(false);
                    sVar.h0(true);
                    if (sVar.B) {
                    }
                }
                z13 = true;
                if (z10) {
                }
                if (!sVar.M) {
                }
                sVar.J(false);
                sVar.h0(true);
                if (sVar.B) {
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.l<ProCoachModel, hs.k> {
        public p() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ProCoachModel proCoachModel) {
            String str;
            ProCoachModel proCoachModel2 = proCoachModel;
            int i6 = s.f17728g0;
            s sVar = s.this;
            sVar.getClass();
            try {
                if (proCoachModel2 != null) {
                    boolean z10 = true;
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardTitle)).setText(sVar.getString(R.string.notV4DbProCardForCoachTitle, proCoachModel2.getFirstname() + ' ' + proCoachModel2.getLastname()));
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardDescription)).setText(sVar.getString(R.string.notV4DbProCardForCoachDescription));
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardCta)).setText(sVar.getString(R.string.notV4DbProCardForCoachCta));
                    com.bumptech.glide.f i10 = Glide.i(sVar.requireActivity());
                    String image = proCoachModel2.getImage();
                    if (image == null || !gv.r.J0(image, "https:")) {
                        z10 = false;
                    }
                    if (z10) {
                        str = proCoachModel2.getImage();
                    } else {
                        str = "https:" + proCoachModel2.getImage();
                    }
                    i10.p(str).B((CircleImageView) sVar._$_findCachedViewById(R.id.ivNotV4DbProCardTherapist));
                } else {
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardTitle)).setText(sVar.getString(R.string.notV4DbProCardNoCoachTitle));
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardDescription)).setText(sVar.getString(R.string.notV4DbProCardNoCoachDescription));
                    ((RobertoTextView) sVar._$_findCachedViewById(R.id.tvNotV4DbProCardCta)).setText(sVar.getString(R.string.notV4DbProCardNoCoachCta));
                    androidx.fragment.app.p requireActivity = sVar.requireActivity();
                    Object obj = g0.a.f16164a;
                    ((CircleImageView) sVar._$_findCachedViewById(R.id.ivNotV4DbProCardTherapist)).setImageDrawable(a.c.b(requireActivity, R.drawable.ic_not_v4_pro_card_coach_not_assigned));
                }
                sVar._$_findCachedViewById(R.id.layoutNotV4DbProCard).setVisibility(0);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(sVar.f17733u, "exception", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends ArrayList<String>>, hs.k> {
        public q() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends ArrayList<String>> fVar) {
            tk.c cVar;
            boolean z10;
            boolean z11;
            tk.c cVar2;
            hs.f<? extends Boolean, ? extends ArrayList<String>> fVar2 = fVar;
            if (fVar2 != null) {
                B b10 = fVar2.f19465v;
                int i6 = s.f17728g0;
                s sVar = s.this;
                sVar.getClass();
                try {
                    if (sVar.isAdded()) {
                        FrameLayout frameLayout = (FrameLayout) sVar._$_findCachedViewById(R.id.llNotV4NewCommunityEntryPoint);
                        boolean z12 = false;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
                        }
                        boolean z13 = sVar.P;
                        A a10 = fVar2.f19464u;
                        RoutingType routingType = null;
                        if (!z13) {
                            sVar.P = true;
                            androidx.fragment.app.y childFragmentManager = sVar.getChildFragmentManager();
                            childFragmentManager.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                            tk.c cVar3 = new tk.c();
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("communities_joined_list", (ArrayList) b10);
                            Boolean bool = (Boolean) a10;
                            if (bool != null) {
                                z11 = bool.booleanValue();
                            } else {
                                z11 = false;
                            }
                            bundle.putBoolean("onboarding_complete", z11);
                            bundle.putBoolean("isNotV4User", true);
                            hs.k kVar = hs.k.f19476a;
                            aVar.f(R.id.llNotV4NewCommunityEntryPoint, UtilsKt.withArgs(cVar3, bundle), "communities_fragment");
                            aVar.m();
                            Fragment F = sVar.getChildFragmentManager().F("communities_fragment");
                            if (F instanceof tk.c) {
                                cVar2 = (tk.c) F;
                            } else {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                cVar2.H = sVar;
                            }
                        } else {
                            Fragment F2 = sVar.getChildFragmentManager().F("communities_fragment");
                            if (F2 instanceof tk.c) {
                                cVar = (tk.c) F2;
                            } else {
                                cVar = null;
                            }
                            if (cVar != null) {
                                Boolean bool2 = (Boolean) a10;
                                if (bool2 != null) {
                                    z10 = bool2.booleanValue();
                                } else {
                                    z10 = false;
                                }
                                cVar.P(z10);
                                cVar.O((ArrayList) b10);
                            }
                        }
                        if (sVar.J && (!((Collection) b10).isEmpty())) {
                            sVar.m0(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY);
                        }
                        sVar.J = false;
                        RoutingIntentHandler d10 = sVar.O().T.d();
                        if (d10 != null) {
                            routingType = d10.getRoutingType();
                        }
                        if (routingType == RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL) {
                            RoutingIntentHandler d11 = sVar.O().T.d();
                            if (d11 != null && !d11.isRoutingCompleted()) {
                                z12 = true;
                            }
                            if (z12) {
                                new Handler(Looper.getMainLooper()).postDelayed(new hl.n(sVar, 3), 300L);
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(sVar.f17733u, "exception", e10);
                }
                sVar.C = (List) b10;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public r() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            String courseName;
            Integer D;
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                s sVar = s.this;
                if (booleanValue) {
                    int i6 = s.f17728g0;
                    sVar.getClass();
                    try {
                        sVar.f17737y = 0;
                        Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_plan_loading, sVar.requireContext());
                        sVar.f17736x = dialog;
                        if (dialog != null) {
                            dialog.setCanceledOnTouchOutside(false);
                            Dialog dialog2 = sVar.f17736x;
                            if (dialog2 != null) {
                                dialog2.setCancelable(false);
                                Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                                Dialog dialog3 = sVar.f17736x;
                                if (dialog3 != null) {
                                    CardView cardView = (CardView) dialog3.findViewById(R.id.planLoadingDialogCardView);
                                    if (courseById != null && (courseName = courseById.getCourseName()) != null && (D = hc.d.D(courseName)) != null) {
                                        cardView.setCardBackgroundColor(g0.a.b(sVar.requireContext(), D.intValue()));
                                    }
                                    Dialog dialog4 = sVar.f17736x;
                                    if (dialog4 != null) {
                                        RobertoTextView robertoTextView = (RobertoTextView) dialog4.findViewById(R.id.loadingTitle);
                                        if (robertoTextView != null) {
                                            robertoTextView.setText(sVar.getString(R.string.planLoadingDialogTitle));
                                            robertoTextView.setTextColor(g0.a.b(sVar.requireContext(), R.color.title_high_contrast));
                                        }
                                        Dialog dialog5 = sVar.f17736x;
                                        if (dialog5 != null) {
                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) dialog5.findViewById(R.id.loadingAnimationView);
                                            if (Build.VERSION.SDK_INT < 25) {
                                                if (lottieAnimationView != null) {
                                                    lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                                                }
                                            } else if (lottieAnimationView != null) {
                                                lottieAnimationView.setRenderMode(a3.t.HARDWARE);
                                            }
                                            lottieAnimationView.setAnimation(R.raw.expt_plan_loading);
                                            lottieAnimationView.c(new h0(lottieAnimationView, sVar, courseById));
                                            Dialog dialog6 = sVar.f17736x;
                                            if (dialog6 != null) {
                                                dialog6.show();
                                                lottieAnimationView.h();
                                            } else {
                                                kotlin.jvm.internal.i.q("planLoadingDialog");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("planLoadingDialog");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("planLoadingDialog");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("planLoadingDialog");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("planLoadingDialog");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("planLoadingDialog");
                            throw null;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(sVar.f17733u, e10);
                    }
                } else {
                    Dialog dialog7 = sVar.f17736x;
                    if (dialog7 != null && dialog7.isShowing()) {
                        Dialog dialog8 = sVar.f17736x;
                        if (dialog8 != null) {
                            dialog8.dismiss();
                        } else {
                            kotlin.jvm.internal.i.q("planLoadingDialog");
                            throw null;
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* renamed from: hl.s$s  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0282s extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends y0>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a1 f17759u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ s f17760v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0282s(a1 a1Var, s sVar) {
            super(1);
            this.f17759u = a1Var;
            this.f17760v = sVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends y0> singleUseEvent) {
            y0 contentIfNotHandled;
            SingleUseEvent<? extends y0> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                if (sp.b.K() && contentIfNotHandled == y0.MIGRATION_SUCCESS) {
                    this.f17759u.l();
                } else {
                    this.f17760v.R = true;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
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
                s.this.R = z10;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public u() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            View _$_findCachedViewById;
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue() && (_$_findCachedViewById = s.this._$_findCachedViewById(R.id.layoutNotV4DbMoodTrackCard)) != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class v extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public v() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            s sVar;
            MonetizationViewModel monetizationViewModel;
            ArrayList<CampaignElementModel> arrayList;
            CampaignElementModel campaignElementModel;
            Object obj;
            Object obj2;
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue() && (monetizationViewModel = (sVar = s.this).f17735w) != null) {
                CampaignModel campaignModel = monetizationViewModel.B;
                if (campaignModel != null) {
                    arrayList = campaignModel.getDashboardCard();
                } else {
                    arrayList = null;
                }
                if (arrayList != null && (campaignElementModel = (CampaignElementModel) is.u.j2(0, arrayList)) != null) {
                    try {
                        FrameLayout frameLayout = (FrameLayout) sVar._$_findCachedViewById(R.id.layoutNotV4DbCampaignCard);
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
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
                                            obj2 = it3.next();
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
                                androidx.fragment.app.y childFragmentManager = sVar.getChildFragmentManager();
                                childFragmentManager.getClass();
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                                aVar.f(R.id.layoutNotV4DbCampaignCard, x0Var, "dynamicDbFrag");
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
                                androidx.fragment.app.y childFragmentManager2 = sVar.getChildFragmentManager();
                                childFragmentManager2.getClass();
                                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager2);
                                aVar2.f(R.id.layoutNotV4DbCampaignCard, z0Var, "dynamicDbFrag");
                                aVar2.k();
                            }
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(sVar.f17733u, e10);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class w extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f17764u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f17764u = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            bool.booleanValue();
            com.google.android.material.bottomsheet.f fVar = this.f17764u.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    public s() {
        Object obj;
        String str;
        boolean z10;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        User user = FirebasePersistence.getInstance().getUser();
        Object obj2 = null;
        if (user != null && (appConfig2 = user.getAppConfig()) != null) {
            obj = appConfig2.get(Constants.JOURNAL_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.K = !kotlin.jvm.internal.i.b(str == null ? "default" : str, "default");
        User user2 = FirebasePersistence.getInstance().getUser();
        if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
            obj2 = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
        }
        this.M = kotlin.jvm.internal.i.b(obj2, "f");
        this.N = new yn.a();
        this.O = kotlinx.coroutines.e0.n();
        if (sp.b.K()) {
            wn.b.f36765a.getClass();
            if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                z10 = false;
                this.R = z10;
                androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new hl.o(this, 0));
                kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ivityResult(result)\n    }");
                this.S = registerForActivityResult;
                androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new hl.o(this, 4));
                kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…ivityResult(result)\n    }");
                this.T = registerForActivityResult2;
                androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new hl.o(this, 5));
                kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…ation\", \"bookings\")\n    }");
                this.U = registerForActivityResult3;
                androidx.activity.result.c<Intent> registerForActivityResult4 = registerForActivityResult(new e.d(), new hl.o(this, 6));
                kotlin.jvm.internal.i.f(registerForActivityResult4, "registerForActivityResul…ation\", \"bookings\")\n    }");
                this.V = registerForActivityResult4;
                androidx.activity.result.c<Intent> registerForActivityResult5 = registerForActivityResult(new e.d(), new hl.o(this, 7));
                kotlin.jvm.internal.i.f(registerForActivityResult5, "registerForActivityResul…ookings\")\n        }\n    }");
                this.W = registerForActivityResult5;
                androidx.activity.result.c<Intent> registerForActivityResult6 = registerForActivityResult(new e.d(), new hl.o(this, 8));
                kotlin.jvm.internal.i.f(registerForActivityResult6, "registerForActivityResul…nDeeplinkCodeFlow()\n    }");
                this.X = registerForActivityResult6;
                androidx.activity.result.c<Intent> registerForActivityResult7 = registerForActivityResult(new e.d(), new hl.o(this, 9));
                kotlin.jvm.internal.i.f(registerForActivityResult7, "registerForActivityResul…ivityResult(result)\n    }");
                this.Y = registerForActivityResult7;
                androidx.activity.result.c<Intent> registerForActivityResult8 = registerForActivityResult(new e.d(), new hl.o(this, 10));
                kotlin.jvm.internal.i.f(registerForActivityResult8, "registerForActivityResul…ivityResult(result)\n    }");
                this.Z = registerForActivityResult8;
                androidx.activity.result.c<Intent> registerForActivityResult9 = registerForActivityResult(new e.d(), new hl.o(this, 11));
                kotlin.jvm.internal.i.f(registerForActivityResult9, "registerForActivityResul…eedback()\n        }\n    }");
                this.f17729a0 = registerForActivityResult9;
                androidx.activity.result.c<Intent> registerForActivityResult10 = registerForActivityResult(new e.d(), new hl.o(this, 12));
                kotlin.jvm.internal.i.f(registerForActivityResult10, "registerForActivityResul…eedback()\n        }\n    }");
                this.f17730b0 = registerForActivityResult10;
                androidx.activity.result.c<Intent> registerForActivityResult11 = registerForActivityResult(new e.d(), new hl.o(this, 1));
                kotlin.jvm.internal.i.f(registerForActivityResult11, "registerForActivityResul….checkForFeedback()\n    }");
                this.c0 = registerForActivityResult11;
                androidx.activity.result.c<Intent> registerForActivityResult12 = registerForActivityResult(new e.d(), new hl.o(this, 2));
                kotlin.jvm.internal.i.f(registerForActivityResult12, "registerForActivityResul…teJournalCard()\n        }");
                this.f17731d0 = registerForActivityResult12;
                this.e0 = new hl.o(this, 3);
            }
        }
        z10 = true;
        this.R = z10;
        androidx.activity.result.c<Intent> registerForActivityResult13 = registerForActivityResult(new e.d(), new hl.o(this, 0));
        kotlin.jvm.internal.i.f(registerForActivityResult13, "registerForActivityResul…ivityResult(result)\n    }");
        this.S = registerForActivityResult13;
        androidx.activity.result.c<Intent> registerForActivityResult22 = registerForActivityResult(new e.d(), new hl.o(this, 4));
        kotlin.jvm.internal.i.f(registerForActivityResult22, "registerForActivityResul…ivityResult(result)\n    }");
        this.T = registerForActivityResult22;
        androidx.activity.result.c<Intent> registerForActivityResult32 = registerForActivityResult(new e.d(), new hl.o(this, 5));
        kotlin.jvm.internal.i.f(registerForActivityResult32, "registerForActivityResul…ation\", \"bookings\")\n    }");
        this.U = registerForActivityResult32;
        androidx.activity.result.c<Intent> registerForActivityResult42 = registerForActivityResult(new e.d(), new hl.o(this, 6));
        kotlin.jvm.internal.i.f(registerForActivityResult42, "registerForActivityResul…ation\", \"bookings\")\n    }");
        this.V = registerForActivityResult42;
        androidx.activity.result.c<Intent> registerForActivityResult52 = registerForActivityResult(new e.d(), new hl.o(this, 7));
        kotlin.jvm.internal.i.f(registerForActivityResult52, "registerForActivityResul…ookings\")\n        }\n    }");
        this.W = registerForActivityResult52;
        androidx.activity.result.c<Intent> registerForActivityResult62 = registerForActivityResult(new e.d(), new hl.o(this, 8));
        kotlin.jvm.internal.i.f(registerForActivityResult62, "registerForActivityResul…nDeeplinkCodeFlow()\n    }");
        this.X = registerForActivityResult62;
        androidx.activity.result.c<Intent> registerForActivityResult72 = registerForActivityResult(new e.d(), new hl.o(this, 9));
        kotlin.jvm.internal.i.f(registerForActivityResult72, "registerForActivityResul…ivityResult(result)\n    }");
        this.Y = registerForActivityResult72;
        androidx.activity.result.c<Intent> registerForActivityResult82 = registerForActivityResult(new e.d(), new hl.o(this, 10));
        kotlin.jvm.internal.i.f(registerForActivityResult82, "registerForActivityResul…ivityResult(result)\n    }");
        this.Z = registerForActivityResult82;
        androidx.activity.result.c<Intent> registerForActivityResult92 = registerForActivityResult(new e.d(), new hl.o(this, 11));
        kotlin.jvm.internal.i.f(registerForActivityResult92, "registerForActivityResul…eedback()\n        }\n    }");
        this.f17729a0 = registerForActivityResult92;
        androidx.activity.result.c<Intent> registerForActivityResult102 = registerForActivityResult(new e.d(), new hl.o(this, 12));
        kotlin.jvm.internal.i.f(registerForActivityResult102, "registerForActivityResul…eedback()\n        }\n    }");
        this.f17730b0 = registerForActivityResult102;
        androidx.activity.result.c<Intent> registerForActivityResult112 = registerForActivityResult(new e.d(), new hl.o(this, 1));
        kotlin.jvm.internal.i.f(registerForActivityResult112, "registerForActivityResul….checkForFeedback()\n    }");
        this.c0 = registerForActivityResult112;
        androidx.activity.result.c<Intent> registerForActivityResult122 = registerForActivityResult(new e.d(), new hl.o(this, 2));
        kotlin.jvm.internal.i.f(registerForActivityResult122, "registerForActivityResul…teJournalCard()\n        }");
        this.f17731d0 = registerForActivityResult122;
        this.e0 = new hl.o(this, 3);
    }

    public static void F(s sVar, CourseDayModelV1 courseDayModelV1, boolean z10, Bundle bundle, int i6) {
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        if ((i6 & 4) != 0) {
            bundle = null;
        }
        sVar.getClass();
        if (courseDayModelV1 != null) {
            try {
                if (kotlin.jvm.internal.i.b(courseDayModelV1.isAssessment(), Boolean.TRUE)) {
                    androidx.fragment.app.p requireActivity = sVar.requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    Intent s10 = kotlinx.coroutines.e0.s(requireActivity);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    s10.putExtras(bundle);
                    s10.putExtra(Constants.API_COURSE_LINK, courseDayModelV1.getContent_id());
                    s10.putExtra(Constants.NEW_COURSE_FLAG, z10);
                    s10.putExtra(Constants.COURSE_TITLE, courseDayModelV1.getContent_label());
                    s10.putExtra(Constants.DAYMODEL_POSITION, courseDayModelV1.getPosition());
                    sVar.X.a(s10);
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    courseDayModelV1.setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                    firebasePersistence.updateUserOnFirebase();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(sVar.f17733u, "exception", e10);
            }
        }
    }

    @Override // xk.a
    public final void E(Bundle bundle, String str) {
        boolean z10;
        Intent putExtra = new Intent(requireActivity(), CommunitiesPwaActivity.class).putExtra("redirect_url", str);
        kotlin.jvm.internal.i.f(putExtra, "Intent(requireActivity()…direct_url\", overrideUrl)");
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
        this.Y.a(putExtra);
    }

    public final void I() {
        try {
            Menu menu = ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu();
            kotlin.jvm.internal.i.f(menu, "bnvNotV4DbNavigation.menu");
            Typeface font = Typeface.createFromAsset(requireActivity().getAssets(), "fonts/Lato-Bold.ttf");
            int size = menu.size();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItem mi2 = menu.getItem(i6);
                kotlin.jvm.internal.i.f(mi2, "mi");
                kotlin.jvm.internal.i.f(font, "font");
                UtilsKt.applyFontToMenuItem(mi2, font, -1);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    public final void J(boolean z10) {
        int i6;
        try {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.gpaDashboardLayout);
            if (_$_findCachedViewById != null) {
                if (LocationPersistence.INSTANCE.isIndianUser() && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                _$_findCachedViewById.setVisibility(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    public final void K() {
        try {
            if (ApplicationPersistence.getInstance().getBooleanValue(Constants.COMMUNITIES_ENABLED, false)) {
                NotV4DashboardViewModel O = O();
                try {
                    ta.v.H(kc.f.H(O), o0.f23642c, 0, new f1(O, null), 2);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(O.A, e10);
                }
            } else {
                ((FrameLayout) _$_findCachedViewById(R.id.llNotV4NewCommunityEntryPoint)).setVisibility(8);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e11);
        }
    }

    public final void M() {
        ((NestedScrollView) _$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) ((FrameLayout) _$_findCachedViewById(R.id.llNotV4NewCommunityEntryPoint)).getY()) - 300, 800);
        RoutingIntentHandler d10 = O().T.d();
        if (d10 != null) {
            d10.setRoutingCompleted(true);
        }
    }

    public final NotV4DashboardViewModel O() {
        NotV4DashboardViewModel notV4DashboardViewModel = this.f17734v;
        if (notV4DashboardViewModel != null) {
            return notV4DashboardViewModel;
        }
        kotlin.jvm.internal.i.q("notV4DashboardViewModel");
        throw null;
    }

    public final void P() {
        boolean z10;
        androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
        RoutingType routingType = null;
        l2.f(R.id.flExpertCareContainer, new tl.d(), null);
        l2.j();
        RoutingIntentHandler d10 = O().T.d();
        if (d10 != null) {
            routingType = d10.getRoutingType();
        }
        if (routingType == RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL) {
            RoutingIntentHandler d11 = O().T.d();
            if (d11 != null && !d11.isRoutingCompleted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !isDetached() && isAdded() && getView() != null) {
                try {
                    ((NestedScrollView) _$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) ((FrameLayout) _$_findCachedViewById(R.id.flExpertCareContainer)).getY()) - 300, 800);
                    RoutingIntentHandler d12 = O().T.d();
                    if (d12 != null) {
                        d12.setRoutingCompleted(true);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f17733u, "routing exception", e10);
                }
            }
        }
    }

    public final void Q() {
        try {
            NotV4DashboardViewModel O = O();
            try {
                ta.v.H(kc.f.H(O), null, 0, new e1(O, null), 3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(O.A, "exception", e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f17733u, e11);
        }
    }

    public final void S() {
        int i6;
        try {
            if (!kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "")) {
                j0();
            } else {
                this.B = true;
            }
            Q();
            c0();
            b0();
            K();
            if (this.K) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivTrackMood)).setImageResource(R.drawable.ic_notv4_db_journal);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvTrackMood)).setText(getString(R.string.notV4DbShortcutsJournal));
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layoutNotV4DbMoodTrackCard);
            if (_$_findCachedViewById != null) {
                wn.b.f36765a.getClass();
                if (wn.b.f36769e != wn.j.COMPLETED) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                _$_findCachedViewById.setVisibility(i6);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    public final void U() {
        String str;
        try {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            l0 a10 = new androidx.lifecycle.o0(requireActivity).a(NotV4DashboardViewModel.class);
            NotV4DashboardViewModel notV4DashboardViewModel = (NotV4DashboardViewModel) a10;
            ((androidx.lifecycle.w) notV4DashboardViewModel.J.getValue()).e(getViewLifecycleOwner(), new fl.k(22, new j()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.G.getValue()).e(getViewLifecycleOwner(), new hl.p(0, new k()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.H.getValue()).e(getViewLifecycleOwner(), new hl.p(1, new l()));
            notV4DashboardViewModel.q().e(getViewLifecycleOwner(), new hl.p(2, new m()));
            notV4DashboardViewModel.f10862k0.e(getViewLifecycleOwner(), new hl.p(3, new n()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.E.getValue()).e(getViewLifecycleOwner(), new hl.p(4, new o()));
            notV4DashboardViewModel.U.e(getViewLifecycleOwner(), new hl.p(5, new p()));
            notV4DashboardViewModel.V.e(requireActivity(), new hl.p(6, new q()));
            notV4DashboardViewModel.p().e(getViewLifecycleOwner(), new hl.p(7, new r()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.W.getValue()).e(getViewLifecycleOwner(), new hl.p(8, new b()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.Z.getValue()).e(getViewLifecycleOwner(), new fl.k(23, new c()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.f10858g0.getValue()).e(getViewLifecycleOwner(), new fl.k(24, new d()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.F.getValue()).e(getViewLifecycleOwner(), new fl.k(25, new e()));
            notV4DashboardViewModel.T.e(getViewLifecycleOwner(), new fl.k(26, new f(notV4DashboardViewModel)));
            notV4DashboardViewModel.f10863l0.e(getViewLifecycleOwner(), new fl.k(27, new g()));
            notV4DashboardViewModel.f10864m0.e(getViewLifecycleOwner(), new fl.k(28, new h()));
            ((androidx.lifecycle.w) notV4DashboardViewModel.f10865n0.getValue()).e(getViewLifecycleOwner(), new fl.k(29, new i()));
            NotV4DashboardViewModel notV4DashboardViewModel2 = (NotV4DashboardViewModel) a10;
            kotlin.jvm.internal.i.g(notV4DashboardViewModel2, "<set-?>");
            this.f17734v = notV4DashboardViewModel2;
            ap.f fVar = new ap.f();
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.i.f(application, "requireActivity().application");
            ap.h hVar = (ap.h) new androidx.lifecycle.o0(this, new kk.c(application, fVar)).a(ap.h.class);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            ap.h.e(hVar, str, false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    @Override // xk.a
    public final void W() {
        this.Y.a(new Intent(requireActivity(), CommunityOnBoardingWelcomeActivity.class));
    }

    public final void X() {
        boolean z10;
        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
        if (userGoals != null && !userGoals.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
            this.R = false;
            if (this.Q == null) {
                this.Q = (a1) new androidx.lifecycle.o0(this, new kk.c(new j1(), MyApplication.V.a())).a(a1.class);
            }
            a1 a1Var = this.Q;
            if (a1Var != null) {
                a1Var.m();
                a1Var.B.e(getViewLifecycleOwner(), new fl.k(20, new C0282s(a1Var, this)));
                a1Var.A.e(getViewLifecycleOwner(), new fl.k(21, new t()));
            }
        }
    }

    public final void Y() {
        boolean z10;
        String str;
        tk.c cVar = null;
        try {
            this.F = null;
            c0();
            if (this.f17734v != null) {
                O().k();
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                boolean z11 = true;
                if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                if (stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) {
                    z11 = false;
                }
                if (O().D && LocationPersistence.INSTANCE.isIndianUser() && !z10 && z11) {
                    NotV4DashboardViewModel O = O();
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                    O.o(str);
                }
            }
            if (isAdded()) {
                Fragment F = getChildFragmentManager().F("communities_fragment");
                if (F instanceof tk.c) {
                    cVar = (tk.c) F;
                }
                if (cVar != null) {
                    cVar.M();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    public final void Z(int i6) {
        String str;
        try {
            this.Z.a(new Intent(requireActivity(), MultiTrackerActivity.class).putExtra("mood", i6));
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putInt("mood", i6);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            bundle.putString("course", str);
            bundle.putString("source", Constants.SCREEN_DASHBOARD);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "new_tracker_mood_click");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17732f0;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01de A[Catch: Exception -> 0x02ce, TryCatch #0 {Exception -> 0x02ce, blocks: (B:3:0x0007, B:7:0x0012, B:9:0x0023, B:33:0x006b, B:34:0x00dc, B:35:0x00e8, B:37:0x00f6, B:39:0x00fe, B:40:0x0106, B:42:0x010c, B:43:0x011a, B:45:0x013d, B:47:0x0147, B:49:0x014e, B:51:0x0152, B:60:0x0172, B:81:0x0267, B:83:0x0281, B:85:0x0287, B:87:0x028b, B:89:0x0299, B:91:0x029f, B:93:0x02a3, B:95:0x02b1, B:99:0x02ba, B:53:0x015c, B:56:0x0167, B:58:0x016e, B:61:0x01bf, B:62:0x01c5, B:63:0x01c6, B:65:0x01d2, B:71:0x01de, B:73:0x01ea, B:76:0x01f1, B:78:0x0206, B:79:0x022f, B:6:0x000f), top: B:104:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f A[Catch: Exception -> 0x02ce, TryCatch #0 {Exception -> 0x02ce, blocks: (B:3:0x0007, B:7:0x0012, B:9:0x0023, B:33:0x006b, B:34:0x00dc, B:35:0x00e8, B:37:0x00f6, B:39:0x00fe, B:40:0x0106, B:42:0x010c, B:43:0x011a, B:45:0x013d, B:47:0x0147, B:49:0x014e, B:51:0x0152, B:60:0x0172, B:81:0x0267, B:83:0x0281, B:85:0x0287, B:87:0x028b, B:89:0x0299, B:91:0x029f, B:93:0x02a3, B:95:0x02b1, B:99:0x02ba, B:53:0x015c, B:56:0x0167, B:58:0x016e, B:61:0x01bf, B:62:0x01c5, B:63:0x01c6, B:65:0x01d2, B:71:0x01de, B:73:0x01ea, B:76:0x01f1, B:78:0x0206, B:79:0x022f, B:6:0x000f), top: B:104:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0() {
        boolean z10;
        RoutingType routingType;
        int i6;
        String j02;
        RoutingType routingType2;
        RoutingType routingType3;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        try {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layoutNotV4DbJournalCard);
            boolean z14 = false;
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            if (this.f17734v != null) {
                O().l();
                O();
                int i11 = Calendar.getInstance().get(11);
                if (5 <= i11 && i11 < 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i10 = R.drawable.ic_journal_cover_dawn;
                } else {
                    if (11 <= i11 && i11 < 17) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i10 = R.drawable.ic_journal_cover_day;
                    } else {
                        if (17 <= i11 && i11 < 23) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            i10 = R.drawable.ic_journal_cover_dusk;
                        } else {
                            i10 = R.drawable.ic_journal_cover_dark;
                        }
                    }
                }
                if (i10 != R.drawable.ic_journal_cover_day) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setTextColor(g0.a.b(requireContext(), R.color.white));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setTextColor(g0.a.b(requireContext(), R.color.white));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setTextColor(g0.a.b(requireContext(), R.color.white));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setTextColor(g0.a.b(requireContext(), R.color.white));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalSubHeader)).setTextColor(g0.a.b(requireContext(), R.color.white));
                    ((AppCompatImageView) _$_findCachedViewById(R.id.tvJournalHeader)).setColorFilter(g0.a.b(requireContext(), R.color.white), PorterDuff.Mode.SRC_ATOP);
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournal)).setImageResource(i10);
            }
            ArrayList arrayList = new ArrayList();
            if (!this.L) {
                JournalQuestionModel journalQuestionModel = O().f10860i0;
                if (journalQuestionModel != null) {
                    Iterator<Questions> it = journalQuestionModel.getQuestions().iterator();
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
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setText(getString(R.string.journal_todays_question));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_begin));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setText((CharSequence) arrayList.get(intValue2));
                    i6 = R.id.layoutNotV4DbJournalCard;
                    routingType = null;
                } else {
                    kotlin.jvm.internal.i.q("questionData");
                    throw null;
                }
            } else {
                String stringValue = ApplicationPersistence.getInstance().getStringValue("journal_last_entry_date");
                if (stringValue != null && !gv.n.B0(stringValue)) {
                    z10 = false;
                    if (!z10) {
                        NotV4DashboardViewModel O = O();
                        fd.f fVar = FirebaseAuth.getInstance().f;
                        if (fVar != null && (j02 = fVar.j0()) != null) {
                            routingType = null;
                            ta.v.H(kc.f.H(O), null, 0, new c1(new pm.a(), j02, O, null), 3);
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(0);
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_begin));
                        }
                        routingType = null;
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_begin));
                    } else {
                        routingType = null;
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDescription)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalLastEntryText)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalDate)).setText(stringValue);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalCta)).setText(getString(R.string.journal_tap_to_view));
                    }
                    i6 = R.id.layoutNotV4DbJournalCard;
                }
                z10 = true;
                if (!z10) {
                }
                i6 = R.id.layoutNotV4DbJournalCard;
            }
            _$_findCachedViewById(i6).setOnClickListener(new hl.m(this, 1));
            RoutingIntentHandler d10 = O().T.d();
            if (d10 != null) {
                routingType2 = d10.getRoutingType();
            } else {
                routingType2 = routingType;
            }
            if (routingType2 != RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL) {
                RoutingIntentHandler d11 = O().T.d();
                if (d11 != null) {
                    routingType3 = d11.getRoutingType();
                } else {
                    routingType3 = routingType;
                }
                if (routingType3 != RoutingType.JOURNAL_ROUTE) {
                    return;
                }
            }
            RoutingIntentHandler d12 = O().T.d();
            if (d12 != null && !d12.isRoutingCompleted()) {
                z14 = true;
            }
            if (z14) {
                new Handler(Looper.getMainLooper()).postDelayed(new hl.n(this, 1), 300L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    public final void b0() {
        try {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                NotV4DashboardViewModel O = O();
                try {
                    ta.v.H(kc.f.H(O), null, 0, new d1(O, null), 3);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(O.A, "exception", e10);
                }
                _$_findCachedViewById(R.id.layoutNotV4DbProCard).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 0)));
                return;
            }
            _$_findCachedViewById(R.id.layoutNotV4DbProCard).setVisibility(8);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e11);
        }
    }

    public final void c0() {
        String str;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvNewDbDomainTitle);
            if (robertoTextView != null) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                robertoTextView.setText(Constants.getCourseDisplayName(str));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    public final void g0() {
        String str;
        int i6;
        int i10;
        int i11;
        AssessmentResponseCategory symptom;
        ArrayList<AssessmentResponse> values;
        s5 s5Var = this.D;
        try {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            String str2 = null;
            if (user != null) {
                str = user.getCurrentCourse();
            } else {
                str = null;
            }
            Course courseById = firebasePersistence.getCourseById(str);
            if (courseById == null) {
                return;
            }
            ArrayList<Integer> arrayList = this.F;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            String str3 = "";
            if (arrayList.isEmpty()) {
                hc.d dVar = new hc.d();
                for (SuggestedActivityModel suggestedActivityModel : courseById.getPlanSuggested()) {
                    NotV4DashboardViewModel O = O();
                    String courseName = courseById.getCourseName();
                    if (courseName == null) {
                        courseName = "";
                    }
                    String symptom2 = suggestedActivityModel.getSymptom();
                    if (symptom2 == null) {
                        symptom2 = "";
                    }
                    Integer r10 = O.r(courseName, symptom2, dVar);
                    if (r10 != null && !kotlin.jvm.internal.i.b(is.u.p2(arrayList), r10)) {
                        arrayList.add(r10);
                    }
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
                this.F = arrayList;
            }
            ((RecyclerView) _$_findCachedViewById(R.id.rvSaSymptoms)).setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvSaSymptoms);
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            for (Number number : arrayList) {
                String string = getString(number.intValue());
                kotlin.jvm.internal.i.f(string, "getString(tt)");
                arrayList2.add(string);
            }
            recyclerView.setAdapter(new gl.g(arrayList2));
            AssessmentResponseAll assessmentResponseAll = (AssessmentResponseAll) is.u.i2(courseById.getAssessments());
            if (assessmentResponseAll != null && (symptom = assessmentResponseAll.getSymptom()) != null && (values = symptom.getValues()) != null) {
                i6 = values.size();
            } else {
                i6 = 0;
            }
            int i12 = i6 - 3;
            if (i12 > 0) {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvSaRemainingSymptomsDescription);
                if (robertoTextView != null) {
                    robertoTextView.setText(getString(R.string.notV4DbSuggestedActivityCardSymptomsMore, Integer.valueOf(i12)));
                }
            } else {
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvSaRemainingSymptomsDescription);
                if (robertoTextView2 != null) {
                    robertoTextView2.setVisibility(8);
                }
            }
            ArrayList<SuggestedActivityModel> planSuggested = courseById.getPlanSuggested();
            String courseName2 = courseById.getCourseName();
            s5Var.getClass();
            hs.f h10 = s5.h(courseName2, planSuggested);
            B b10 = h10.f19465v;
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.pbSaProgress);
            A a10 = h10.f19464u;
            if (progressBar != null) {
                progressBar.setMax(courseById.getPlanSuggested().size());
                progressBar.setProgress(((Number) a10).intValue());
            }
            long longValue = (((Number) a10).longValue() * 100) / courseById.getPlanSuggested().size();
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvSaProgressPercentage);
            if (robertoTextView3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(longValue);
                sb2.append('%');
                robertoTextView3.setText(sb2.toString());
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvSaTitle);
            if (robertoTextView4 != null) {
                if (((Number) b10).intValue() == -1) {
                    str2 = getString(R.string.newDbSuggestedActivitiesAllDone);
                } else {
                    SuggestedActivityModel suggestedActivityModel2 = (SuggestedActivityModel) is.u.j2(((Number) b10).intValue(), courseById.getPlanSuggested());
                    if (suggestedActivityModel2 != null) {
                        str2 = suggestedActivityModel2.getContent_label();
                    }
                }
                robertoTextView4.setText(str2);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivSaVisual);
            if (appCompatImageView != null) {
                String courseName3 = courseById.getCourseName();
                if (courseName3 == null) {
                    courseName3 = "";
                }
                Integer i13 = s5.i(courseName3);
                if (i13 != null) {
                    i11 = i13.intValue();
                } else {
                    i11 = R.drawable.ic_new_db_anxiety_banner;
                }
                appCompatImageView.setImageResource(i11);
            }
            Context requireContext = requireContext();
            String courseName4 = courseById.getCourseName();
            if (courseName4 == null) {
                courseName4 = "";
            }
            Integer f2 = s5.f(courseName4);
            int i14 = R.color.newDbDomainDepression;
            if (f2 != null) {
                i10 = f2.intValue();
            } else {
                i10 = R.color.newDbDomainDepression;
            }
            int b11 = g0.a.b(requireContext, i10);
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvSaSymptomsHeader);
            if (robertoTextView5 != null) {
                robertoTextView5.setTextColor(b11);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivSaSymptomsHeader);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(b11));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clNewDbSuggestedActivityContainer);
            if (constraintLayout != null) {
                Context requireContext2 = requireContext();
                String courseName5 = courseById.getCourseName();
                if (courseName5 != null) {
                    str3 = courseName5;
                }
                Integer e10 = s5.e(str3);
                if (e10 != null) {
                    i14 = e10.intValue();
                }
                constraintLayout.setBackgroundColor(g0.a.b(requireContext2, i14));
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewSuggestedActivityCardClicker);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new hl.q(this, longValue, courseById, h10));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clSuggestedActivityCardBottomFooter);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new hl.q(this, courseById, h10, longValue));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f17733u, e11);
        }
    }

    public final void h0(boolean z10) {
        Fragment F;
        try {
            if (this.f17735w != null && !z10) {
                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (F = getChildFragmentManager().F("dynamicDbFrag")) != null) {
                    androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.o(F);
                    aVar.k();
                }
            }
            qn.c cVar = new qn.c();
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.i.f(application, "requireActivity().application");
            l0 a10 = new androidx.lifecycle.o0(this, new jl.q(application, (String) null, cVar)).a(MonetizationViewModel.class);
            MonetizationViewModel monetizationViewModel = (MonetizationViewModel) a10;
            monetizationViewModel.f();
            monetizationViewModel.C.e(getViewLifecycleOwner(), new fl.k(19, new v()));
            this.f17735w = (MonetizationViewModel) a10;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(2:8|(2:10|(2:12|(2:14|(3:16|17|(1:26)(2:23|24)))(2:29|30)))(2:31|32))|33|34|35|17|(2:19|27)(1:28)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r11, r2);
     */
    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialiseComplete(boolean z10) {
        String str = this.f17733u;
        try {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            SubscriptionModel currentSubscriptionModel = subscriptionPersistence.getCurrentSubscriptionModel();
            String status = currentSubscriptionModel.getStatus();
            SubscriptionModel subscriptionModel = this.E;
            if (subscriptionModel != null) {
                if (kotlin.jvm.internal.i.b(status, subscriptionModel.getStatus())) {
                    long expiryTime = currentSubscriptionModel.getExpiryTime();
                    SubscriptionModel subscriptionModel2 = this.E;
                    if (subscriptionModel2 != null) {
                        if (expiryTime == subscriptionModel2.getExpiryTime()) {
                            String plan = currentSubscriptionModel.getPlan();
                            SubscriptionModel subscriptionModel3 = this.E;
                            if (subscriptionModel3 != null) {
                                if (kotlin.jvm.internal.i.b(plan, subscriptionModel3.getPlan())) {
                                    this.E = currentSubscriptionModel;
                                    if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(currentSubscriptionModel.getPlan(), Constants.PR_COUPON_CODE_SKU) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, false)) {
                                        n0(currentSubscriptionModel.getExpiryTime());
                                        return;
                                    }
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
                this.E = currentSubscriptionModel;
                h0(false);
                b0();
                J(subscriptionPersistence.getSubscriptionEnabled());
                if (subscriptionPersistence.getSubscriptionEnabled()) {
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("previousSubscriptionModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
        }
    }

    public final void j0() {
        try {
            ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu().getItem(0).setChecked(true);
            if (LocationPersistence.INSTANCE.isIndianUser()) {
                MenuItem item = ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu().getItem(3);
                androidx.fragment.app.p requireActivity = requireActivity();
                Object obj = g0.a.f16164a;
                item.setIcon(a.c.b(requireActivity, R.drawable.ic_consult));
                ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu().getItem(3).setTitle("Consult");
            } else {
                MenuItem item2 = ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu().getItem(3);
                androidx.fragment.app.p requireActivity2 = requireActivity();
                Object obj2 = g0.a.f16164a;
                item2.setIcon(a.c.b(requireActivity2, R.drawable.ic_premium));
                ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).getMenu().getItem(3).setTitle("Premium");
            }
            I();
            ((BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation)).setOnNavigationItemSelectedListener(this.e0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    public final void k0() {
        try {
            ((CircleImageView) _$_findCachedViewById(R.id.ivNotV4DbProfileLogo)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 2)));
            ((LinearLayoutCompat) _$_findCachedViewById(R.id.clTrackMoodView)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 13)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.trackerMoodOne)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 16)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.trackerMoodTwo)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 17)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.trackerMoodThree)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 18)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.trackerMoodFour)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 19)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.trackerMoodFive)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 20)));
            _$_findCachedViewById(R.id.layoutNotV4DbLibraryCard).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 21)));
            ((LinearLayoutCompat) _$_findCachedViewById(R.id.clDailyGoalsView)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 22)));
            ((LinearLayoutCompat) _$_findCachedViewById(R.id.clSavedItemsView)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 23)));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivNotV4DbAllieBot)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 3)));
            _$_findCachedViewById(R.id.viewReliefBotCard).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 4)));
            ((ConstraintLayout) _$_findCachedViewById(R.id.clNotV4DbLogMood)).setOnClickListener(DebouncedOnClickListener.wrap(new hl.m(this, 5)));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvNotV4DashboardRecentViewAll)).setOnClickListener(new hl.m(this, 6));
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewNewDbDomainSelectionClicker);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new hl.m(this, 7));
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvNewDbStartAssessmentCTA);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new hl.m(this, 8));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivNotV4DbMenu);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new hl.m(this, 9));
            }
            ((RobertoButton) _$_findCachedViewById(R.id.rbNewDbStartAssessmentRetryCta)).setOnClickListener(new hl.m(this, 10));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivNewDbAssessmentDetails)).setOnClickListener(new hl.m(this, 11));
            ((ConstraintLayout) _$_findCachedViewById(R.id.appReviewShareButton)).setOnClickListener(new hl.m(this, 12));
            ((RobertoButton) _$_findCachedViewById(R.id.appReviewRateButton)).setOnClickListener(new hl.m(this, 14));
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.gpaDashboardButton);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new hl.m(this, 15));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    public final void m0(String str, String str2) {
        yn.a aVar = this.N;
        aVar.getClass();
        if (!yn.a.b()) {
            hs.f<Boolean, Boolean> a10 = aVar.a(false);
            if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = new NotificationPermissionBottomSheet(str2, a10, str, this.N, new w(xVar));
                androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
                l2.f2205p = true;
                l2.e(0, (Fragment) xVar.f23469u, "permission", 1);
                l2.k();
            }
        }
    }

    public final void n0(long j10) {
        WindowManager.LayoutParams layoutParams;
        try {
            String format = LocalDateTime.ofEpochSecond(j10 / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10))).format(DateTimeFormatter.ofPattern("MMMM dd, yyyy").withLocale(Locale.ENGLISH));
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_subscription_expired, requireContext(), R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            TextView textView = (TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogMessage);
            if (textView != null) {
                textView.setText(getString(R.string.subscription_expire_popup_description, format));
            }
            ((TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogCancel)).setOnClickListener(new dk.n(styledDialog, 15));
            ((ConstraintLayout) styledDialog.findViewById(R.id.clSubscriptionExpireDialogPurchaseNow)).setOnClickListener(new ik.j1(this, 19, styledDialog));
            ApplicationPersistence.getInstance().setBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, true);
            styledDialog.show();
            gk.a.b(null, "pr_app_sub_repurchase_popup_show");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    public final void o0() {
        String str;
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> planV3;
        try {
            Y();
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            User user = firebasePersistence.getUser();
            if (user != null) {
                str = user.getCurrentCourse();
            } else {
                str = null;
            }
            Course courseById = firebasePersistence.getCourseById(str);
            if (courseById != null && (planV3 = courseById.getPlanV3()) != null) {
                courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3);
            } else {
                courseDayModelV1 = null;
            }
            F(this, courseDayModelV1, true, null, 4);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof il.d) {
            this.A = (il.d) context;
        }
        SubscriptionPersistence.INSTANCE.fetchData(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_not_v4_dashboard, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17732f0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        try {
            Timer timer = this.f17738z;
            if (timer != null) {
                timer.cancel();
            }
            SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        MenuItem menuItem;
        Menu menu;
        super.onResume();
        try {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) _$_findCachedViewById(R.id.bnvNotV4DbNavigation);
            if (bottomNavigationView != null && (menu = bottomNavigationView.getMenu()) != null) {
                menuItem = menu.getItem(0);
            } else {
                menuItem = null;
            }
            if (menuItem != null) {
                menuItem.setChecked(true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, "exception", e10);
        }
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            li.a a10 = a.C0384a.a();
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            a10.a(requireContext);
            a.C0384a.a();
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            fk.b bVar = new fk.b(requireActivity);
            ih.p pVar = qg.g0.f29558c;
            if (pVar != null) {
                i1.f25206a.getClass();
                i1.a(pVar).f35171c = bVar;
            }
            a.C0384a.a();
            fk.a aVar2 = new fk.a();
            ih.p pVar2 = qg.g0.f29558c;
            if (pVar2 != null) {
                i1.f25206a.getClass();
                i1.a(pVar2).f35172d.add(aVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003f, B:15:0x0047, B:20:0x0056, B:22:0x0068, B:24:0x006c, B:25:0x006f, B:27:0x0073, B:32:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0093, B:40:0x0099, B:42:0x00a1, B:43:0x00a5, B:45:0x00b8, B:47:0x00be, B:49:0x00cd, B:50:0x00d1, B:52:0x00db, B:53:0x00ed, B:55:0x00f4, B:57:0x00fa, B:58:0x010d, B:60:0x0138, B:62:0x014a, B:64:0x0162), top: B:69:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003f, B:15:0x0047, B:20:0x0056, B:22:0x0068, B:24:0x006c, B:25:0x006f, B:27:0x0073, B:32:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0093, B:40:0x0099, B:42:0x00a1, B:43:0x00a5, B:45:0x00b8, B:47:0x00be, B:49:0x00cd, B:50:0x00d1, B:52:0x00db, B:53:0x00ed, B:55:0x00f4, B:57:0x00fa, B:58:0x010d, B:60:0x0138, B:62:0x014a, B:64:0x0162), top: B:69:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003f, B:15:0x0047, B:20:0x0056, B:22:0x0068, B:24:0x006c, B:25:0x006f, B:27:0x0073, B:32:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0093, B:40:0x0099, B:42:0x00a1, B:43:0x00a5, B:45:0x00b8, B:47:0x00be, B:49:0x00cd, B:50:0x00d1, B:52:0x00db, B:53:0x00ed, B:55:0x00f4, B:57:0x00fa, B:58:0x010d, B:60:0x0138, B:62:0x014a, B:64:0x0162), top: B:69:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:3:0x000a, B:5:0x0027, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003f, B:15:0x0047, B:20:0x0056, B:22:0x0068, B:24:0x006c, B:25:0x006f, B:27:0x0073, B:32:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0093, B:40:0x0099, B:42:0x00a1, B:43:0x00a5, B:45:0x00b8, B:47:0x00be, B:49:0x00cd, B:50:0x00d1, B:52:0x00db, B:53:0x00ed, B:55:0x00f4, B:57:0x00fa, B:58:0x010d, B:60:0x0138, B:62:0x014a, B:64:0x0162), top: B:69:0x000a }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        il.d dVar;
        User user;
        String str;
        User user2;
        String str2;
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> planV3;
        il.d dVar2;
        String str3;
        ArrayList<CourseDayModelV1> planV32;
        CourseDayModelV1 courseDayModelV12;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            this.E = subscriptionPersistence.previousSubscriptionModel();
            subscriptionPersistence.previousSubscriptionModel();
            U();
            S();
            k0();
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            String str4 = null;
            boolean z11 = true;
            if (firebasePersistence != null) {
                User user3 = firebasePersistence.getUser();
                if (user3 != null) {
                    str3 = user3.getCurrentCourse();
                } else {
                    str3 = null;
                }
                Course courseById = firebasePersistence.getCourseById(str3);
                if (courseById != null && (planV32 = courseById.getPlanV3()) != null && (courseDayModelV12 = (CourseDayModelV1) is.u.j2(0, planV32)) != null && courseDayModelV12.getStart_date() == 0) {
                    z10 = true;
                    if (!z10 && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.PR_COUPON_CODE), "") && (dVar2 = this.A) != null) {
                        dVar2.x();
                    }
                    dVar = this.A;
                    if (dVar != null || !dVar.z()) {
                        z11 = false;
                    }
                    if (z11) {
                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                        User user4 = firebasePersistence2.getUser();
                        if (user4 != null) {
                            str2 = user4.getCurrentCourse();
                        } else {
                            str2 = null;
                        }
                        Course courseById2 = firebasePersistence2.getCourseById(str2);
                        if (courseById2 != null && (planV3 = courseById2.getPlanV3()) != null) {
                            courseDayModelV1 = (CourseDayModelV1) is.u.j2(0, planV3);
                        } else {
                            courseDayModelV1 = null;
                        }
                        F(this, courseDayModelV1, false, null, 6);
                    }
                    Bundle bundle2 = new Bundle();
                    user = FirebasePersistence.getInstance().getUser();
                    if (user == null) {
                        str = user.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                    bundle2.putString("course", str);
                    user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null) {
                        str4 = user2.getVersion();
                    }
                    bundle2.putString("version", str4);
                    UtilsKt.fireAnalytics("dashboard_view", bundle2);
                    if (this.K) {
                        a0();
                        ApplicationPersistence.getInstance().setLongValue("journal_question_time", Utils.INSTANCE.getTodayTimeInSeconds());
                    }
                    if (this.N.f38698e == 2 && !yn.a.b()) {
                        new Handler(Looper.getMainLooper()).postDelayed(new hl.n(this, 0), 3000L);
                    }
                    wn.k kVar = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
                    kVar.e();
                    kVar.f36804y.e(getViewLifecycleOwner(), new fl.k(18, new u()));
                    if (!sp.b.K() || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                        X();
                    }
                    return;
                }
            }
            z10 = false;
            if (!z10) {
                dVar2.x();
            }
            dVar = this.A;
            if (dVar != null) {
            }
            z11 = false;
            if (z11) {
            }
            Bundle bundle22 = new Bundle();
            user = FirebasePersistence.getInstance().getUser();
            if (user == null) {
            }
            bundle22.putString("course", str);
            user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
            }
            bundle22.putString("version", str4);
            UtilsKt.fireAnalytics("dashboard_view", bundle22);
            if (this.K) {
            }
            if (this.N.f38698e == 2) {
                new Handler(Looper.getMainLooper()).postDelayed(new hl.n(this, 0), 3000L);
            }
            wn.k kVar2 = (wn.k) new androidx.lifecycle.o0(this).a(wn.k.class);
            kVar2.e();
            kVar2.f36804y.e(getViewLifecycleOwner(), new fl.k(18, new u()));
            if (!sp.b.K()) {
            }
            X();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17733u, e10);
        }
    }

    @Override // xk.a
    public final void B(int i6) {
    }
}
