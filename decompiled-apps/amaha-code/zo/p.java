package zo;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedPhysicalActivityGifTips;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import f0.t;
import g0.a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import ta.v;
/* compiled from: RecommendedActivityPhysicalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lzo/p;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public boolean B;
    public MediaSessionCompat C;
    public Bitmap D;
    public c L;

    /* renamed from: v  reason: collision with root package name */
    public RecommendedActivityModel f39757v;

    /* renamed from: w  reason: collision with root package name */
    public RecommendedActivitiesPlaybackActivity f39758w;

    /* renamed from: x  reason: collision with root package name */
    public int f39759x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39760y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f39761z;
    public final LinkedHashMap Q = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f39756u = LogHelper.INSTANCE.makeLogTag("RAPhysicalFragment");
    public String E = "0";
    public final HashMap<String, String> F = new HashMap<>();
    public boolean G = true;
    public ArrayList<RecommendedPhysicalActivityGifTips> H = new ArrayList<>();
    public final int I = 5000;
    public final Handler J = new Handler();
    public final Handler K = new Handler();
    public final yn.a M = new yn.a();
    public final m0 N = b0.j(this, y.a(ap.a.class), new h(this), new i(this), new j(this));
    public final boolean O = sp.b.K();
    public final f P = new f();

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f39762c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<RecommendedPhysicalActivityGifTips> f39763d;

        public a(androidx.fragment.app.p pVar, ArrayList tipsList) {
            kotlin.jvm.internal.i.g(tipsList, "tipsList");
            this.f39762c = pVar;
            this.f39763d = new ArrayList<>();
            this.f39763d = tipsList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f39763d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f39762c).inflate(R.layout.row_ra_gif_tips_pager, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.activityTips);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(this.f39763d.get(i6).getContent());
            collection.addView(viewGroup);
            return viewGroup;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            int currentItem = ((ViewPager) pVar._$_findCachedViewById(R.id.viewpager)).getCurrentItem();
            k2.a adapter = ((ViewPager) pVar._$_findCachedViewById(R.id.viewpager)).getAdapter();
            kotlin.jvm.internal.i.d(adapter);
            if (currentItem == adapter.g() - 1) {
                ((ViewPager) pVar._$_findCachedViewById(R.id.viewpager)).v(0);
            } else {
                ((ViewPager) pVar._$_findCachedViewById(R.id.viewpager)).v(((ViewPager) pVar._$_findCachedViewById(R.id.viewpager)).getCurrentItem() + 1);
            }
            pVar.J.postDelayed(this, pVar.I);
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f39768v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39769w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FirestoreGoal firestoreGoal, x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f39768v = firestoreGoal;
            this.f39769w = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i6 = p.R;
                p.this.Z(this.f39768v, null);
            }
            com.google.android.material.bottomsheet.f fVar = this.f39769w.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends FirestoreGoal>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends FirestoreGoal> singleUseEvent) {
            hs.k kVar;
            FirestoreGoal contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            p pVar = p.this;
            if (contentIfNotHandled != null) {
                int i6 = p.R;
                pVar.U(contentIfNotHandled);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                Toast.makeText(pVar.requireContext(), pVar.getString(R.string.loginSomethingWentWrong), 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            p pVar = p.this;
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            try {
                if (pVar.isAdded()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putString("activity_id", pVar.P().getGoalId());
                    bundle.putString("activity_name", pVar.P().getTitle());
                    String lowerCase = pVar.P().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                    bundle.putString("type", lowerCase);
                    bundle.putString("source", pVar.O().f11610y);
                    bundle.putBoolean("goal_added", pVar.f39761z);
                    bundle.putString("action_source", "notification");
                    if (kotlin.jvm.internal.i.b(intent.getAction(), "PLAY_PAUSE")) {
                        pVar.X(false);
                        if (pVar.f39760y) {
                            gk.a.b(bundle, "activity_play_click");
                        } else {
                            bundle.putString("played_progress", pVar.E);
                            gk.a.b(bundle, "activity_pause_click");
                        }
                    } else if (kotlin.jvm.internal.i.b(intent.getAction(), "STOP")) {
                        gk.a.b(bundle, "activity_stop_click");
                        pVar.X(true);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar.f39756u, e10);
            }
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            int i6 = pVar.f39759x;
            String format = String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf((i6 % 3600) / 60), Integer.valueOf(i6 % 60));
            kotlin.jvm.internal.i.f(format, "format(\n                …                        )");
            if (pVar.f39760y) {
                if (pVar.B) {
                    ((RobertoTextView) pVar._$_findCachedViewById(R.id.tvRAProgress)).setText(format);
                    pVar.E = String.valueOf(pVar.f39759x);
                }
                pVar.f39759x++;
            }
            pVar.K.postDelayed(this, 1000L);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39773u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f39773u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f39773u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39774u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f39774u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f39774u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39775u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f39775u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f39775u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).removeAllViews();
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)), false);
                viewArr[i11] = inflate;
                kotlin.jvm.internal.i.d(inflate);
                androidx.fragment.app.p requireActivity = requireActivity();
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(requireActivity, R.drawable.circle_filled_white));
                ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).addView(viewArr[i11]);
            }
            if (i10 == 0) {
                z10 = true;
            }
            if (!z10) {
                View view = viewArr[i6];
                kotlin.jvm.internal.i.d(view);
                androidx.fragment.app.p requireActivity2 = requireActivity();
                Object obj2 = g0.a.f16164a;
                view.setBackground(a.c.b(requireActivity2, R.drawable.ra_seekbar_thumb));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void K() {
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(this.F.get("cta_goal_added"));
        Context requireContext = requireContext();
        Object obj = g0.a.f16164a;
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setBackground(a.c.b(requireContext, R.drawable.button_disabled));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(null);
    }

    public final void M() {
        try {
            Iterator<RecommendedActivityContentModel> it = P().getActivityContent().iterator();
            while (it.hasNext()) {
                RecommendedActivityContentModel next = it.next();
                if (kotlin.jvm.internal.i.b(next.getLabel(), "cta_goal_track")) {
                    ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(next.getCtaGoalTrack());
                }
            }
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setBackground(a.c.b(requireContext, R.drawable.button_border_peach));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new o(this, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    public final RecommendedActivitiesPlaybackActivity O() {
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = this.f39758w;
        if (recommendedActivitiesPlaybackActivity != null) {
            return recommendedActivitiesPlaybackActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final RecommendedActivityModel P() {
        RecommendedActivityModel recommendedActivityModel = this.f39757v;
        if (recommendedActivityModel != null) {
            return recommendedActivityModel;
        }
        kotlin.jvm.internal.i.q("recommendedActivityModel");
        throw null;
    }

    public final ap.a Q() {
        return (ap.a) this.N.getValue();
    }

    public final void S() {
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        ((ViewPager) _$_findCachedViewById(R.id.viewpager)).setAdapter(new a(requireActivity, this.H));
        ((ViewPager) _$_findCachedViewById(R.id.viewpager)).b(new b(this.H.size()));
        J(0, this.H.size());
        this.L = new c();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    public final void U(FirestoreGoal firestoreGoal) {
        yn.a aVar = this.M;
        aVar.getClass();
        if (yn.a.b()) {
            Z(firestoreGoal, null);
        } else {
            x xVar = new x();
            ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_physical", aVar.a(true), "goals", this.M, new d(firestoreGoal, xVar));
            xVar.f23469u = notificationPermissionBottomSheet;
            notificationPermissionBottomSheet.show(requireActivity().getSupportFragmentManager(), "permission");
        }
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", P().getGoalId());
        bundle.putString("activity_name", P().getTitle());
        String lowerCase = P().getTemplateType().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", O().f11610y);
        bundle.putString("played_progress", this.E);
        gk.a.b(bundle, "activity_add_goal_click");
    }

    public final void X(boolean z10) {
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity;
        Handler handler = this.J;
        String str = this.f39756u;
        try {
            if (z10) {
                this.f39760y = false;
                this.f39759x = 0;
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setText("00:00");
                if (this.f39761z) {
                    M();
                }
                c cVar = this.L;
                if (cVar != null) {
                    handler.removeCallbacks(cVar);
                }
                try {
                    Object systemService = requireActivity().getSystemService("notification");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, "exception", e10);
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("activity_id", P().getGoalId());
            bundle.putString("activity_name", P().getTitle());
            String lowerCase = P().getTemplateType().toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            bundle.putString("type", lowerCase);
            bundle.putString("source", O().f11610y);
            bundle.putBoolean("goal_added", this.f39761z);
            bundle.putString("action_source", "screen");
            if (this.f39760y) {
                this.f39760y = false;
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAStop)).setVisibility(0);
                a0(false);
                bundle.putString("played_progress", this.E);
                gk.a.b(bundle, "activity_pause_click");
                c cVar2 = this.L;
                if (cVar2 != null) {
                    handler.removeCallbacks(cVar2);
                    return;
                }
                return;
            }
            this.f39760y = true;
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_pause);
            ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).A();
            if (!this.A) {
                Y(false);
            }
            this.A = true;
            androidx.fragment.app.p requireActivity = requireActivity();
            if (requireActivity instanceof RecommendedActivitiesPlaybackActivity) {
                recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity;
            } else {
                recommendedActivitiesPlaybackActivity = null;
            }
            if (recommendedActivitiesPlaybackActivity != null) {
                recommendedActivitiesPlaybackActivity.A = true;
            }
            ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).j();
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAStop)).setVisibility(8);
            a0(true);
            gk.a.b(bundle, "activity_play_click");
            c cVar3 = this.L;
            if (cVar3 != null) {
                handler.postDelayed(cVar3, this.I);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final void Y(boolean z10) {
        try {
            g gVar = new g();
            Handler handler = this.K;
            if (!z10) {
                handler.post(gVar);
            } else if (this.A) {
                handler.removeCallbacks(gVar);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    public final void Z(FirestoreGoal firestoreGoal, Goal goal) {
        String str;
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 9);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerThemeDark, new zo.a(calendar, firestoreGoal, this, goal, 2), calendar.get(11), calendar.get(12), false);
            timePickerDialog.updateTime(9, 0);
            LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
            kotlin.jvm.internal.i.f(layoutInflater, "requireActivity().layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.row_text_view_new, (ViewGroup) null);
            ((RobertoTextView) inflate.findViewById(R.id.textViewMain)).setText("Set a time for this activity so we can send you a reminder");
            timePickerDialog.setCustomTitle(inflate);
            if (requireArguments().getBoolean("proceed_on_schedule", false)) {
                str = "Proceed";
            } else {
                str = "Ok";
            }
            timePickerDialog.show();
            timePickerDialog.getButton(-1).setText(str);
            timePickerDialog.getButton(-1).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast));
            timePickerDialog.getButton(-2).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.Q;
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

    public final void a0(boolean z10) {
        int i6;
        int i10;
        try {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(requireActivity(), "PlayAudio", null, null);
            this.C = mediaSessionCompat;
            MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
            bVar.d("android.media.metadata.TITLE", P().getTitle());
            bVar.d("android.media.metadata.ARTIST", P().getTemplateType());
            mediaSessionCompat.g(bVar.a());
            Intent intent = new Intent(O(), RecommendedActivitiesPlaybackActivity.class);
            intent.setFlags(536870912);
            intent.putExtra("audio_click", true);
            intent.setAction(Long.toString(Calendar.getInstance().getTimeInMillis()));
            RecommendedActivitiesPlaybackActivity O = O();
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 201326592;
            int i13 = 134217728;
            if (i11 >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            PendingIntent activity = PendingIntent.getActivity(O, 0, intent, i6);
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i11 >= 26) {
                i10 = 4;
                NotificationChannel notificationChannel = new NotificationChannel("audio_channel", "Audio", 4);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                i10 = 2;
            }
            t tVar = new t(requireActivity().getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            tVar.e(P().getTitle());
            tVar.g(16, false);
            tVar.f(2);
            tVar.f14665j = i10;
            tVar.g(8, true);
            tVar.f14662g = activity;
            if (z10) {
                tVar.g(2, true);
            } else {
                tVar.g(2, false);
            }
            if (this.f39760y) {
                Intent intent2 = new Intent();
                intent2.setAction("PLAY_PAUSE");
                RecommendedActivitiesPlaybackActivity O2 = O();
                if (i11 < 23) {
                    i12 = 134217728;
                }
                tVar.a(R.drawable.ic_pause_circle_filled, "pause", PendingIntent.getBroadcast(O2, 13130, intent2, i12));
            } else {
                Intent intent3 = new Intent();
                intent3.setAction("PLAY_PAUSE");
                RecommendedActivitiesPlaybackActivity O3 = O();
                if (i11 < 23) {
                    i12 = 134217728;
                }
                tVar.a(R.drawable.ic_play_circle_filled, "play", PendingIntent.getBroadcast(O3, 13130, intent3, i12));
                Intent intent4 = new Intent();
                intent4.setAction("STOP");
                RecommendedActivitiesPlaybackActivity O4 = O();
                if (i11 >= 23) {
                    i13 = 1140850688;
                }
                tVar.a(R.drawable.ic_stop_circle, "stop", PendingIntent.getBroadcast(O4, 13130, intent4, i13));
            }
            Bitmap bitmap = this.D;
            if (bitmap != null) {
                tVar.h(bitmap);
                String MANUFACTURER = Build.MANUFACTURER;
                kotlin.jvm.internal.i.f(MANUFACTURER, "MANUFACTURER");
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.i.f(locale, "getDefault()");
                String lowerCase = MANUFACTURER.toLowerCase(locale);
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!gv.r.J0(lowerCase, "huawei") || i11 > 22) {
                    if (i11 < 30) {
                        p1.b bVar2 = new p1.b();
                        MediaSessionCompat mediaSessionCompat2 = this.C;
                        if (mediaSessionCompat2 != null) {
                            bVar2.f = mediaSessionCompat2.f879a.f898b;
                            bVar2.f27867e = new int[]{0};
                            tVar.j(bVar2);
                        } else {
                            kotlin.jvm.internal.i.q("mediaSessionCompat");
                            throw null;
                        }
                    } else {
                        p1.b bVar3 = new p1.b();
                        bVar3.f27867e = new int[]{0};
                        tVar.j(bVar3);
                    }
                }
                Notification b10 = tVar.b();
                kotlin.jvm.internal.i.f(b10, "notificationBuilder.build()");
                notificationManager.notify(Constants.AUDIO_NOTIFICATION_ID, b10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_recommended_activity_physical, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        try {
            super.onDestroy();
            requireActivity().unregisterReceiver(this.P);
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            Y(true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.J.removeCallbacksAndMessages(null);
        this.K.removeCallbacksAndMessages(null);
        super.onDestroyView();
        this.Q.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        try {
            super.onPause();
            this.B = false;
            if (this.f39760y) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            super.onResume();
            this.B = true;
            if (this.f39760y) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).j();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        try {
            super.onStop();
            MediaSessionCompat mediaSessionCompat = this.C;
            if (mediaSessionCompat != null) {
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.e(false);
                } else {
                    kotlin.jvm.internal.i.q("mediaSessionCompat");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39756u, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d3, code lost:
        if (r10 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0303, code lost:
        if (r9 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032f, code lost:
        if (kotlin.jvm.internal.i.b(r9, "goals") != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0331, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnRAStroke)).setVisibility(0);
        K();
        r19.f39761z = true;
        r6 = O().getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x034b, code lost:
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x034d, code lost:
        r6 = r6.getStringExtra("source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0352, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0357, code lost:
        if (kotlin.jvm.internal.i.b(r6, "goals") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0359, code lost:
        r0 = (androidx.appcompat.widget.AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivRABackCta);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0362, code lost:
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0364, code lost:
        r0.setImageResource(com.theinnerhour.b2b.R.drawable.ic_close_icon);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c1 A[Catch: Exception -> 0x03ac, TRY_ENTER, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d7 A[Catch: Exception -> 0x03ac, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031b A[Catch: Exception -> 0x03ac, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6 A[Catch: Exception -> 0x03ac, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da A[Catch: Exception -> 0x03ac, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f4 A[Catch: Exception -> 0x03ac, TRY_ENTER, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230 A[Catch: Exception -> 0x03ac, TRY_ENTER, TryCatch #3 {Exception -> 0x03ac, blocks: (B:12:0x00dd, B:13:0x00ec, B:16:0x00f6, B:17:0x0104, B:19:0x0109, B:22:0x0111, B:23:0x011d, B:26:0x0125, B:27:0x0131, B:30:0x013b, B:31:0x0146, B:34:0x014e, B:35:0x0159, B:38:0x0160, B:39:0x016b, B:42:0x0172, B:43:0x017d, B:46:0x0184, B:47:0x018f, B:50:0x0196, B:51:0x01a1, B:54:0x01a8, B:56:0x01bb, B:58:0x01ca, B:64:0x01d6, B:66:0x01e8, B:69:0x01f4, B:74:0x01ff, B:75:0x0224, B:78:0x0230, B:83:0x023b, B:85:0x025f, B:93:0x029b, B:86:0x0262, B:104:0x02c1, B:106:0x02c9, B:136:0x0331, B:138:0x034d, B:140:0x0353, B:142:0x0359, B:144:0x0364, B:146:0x0388, B:112:0x02d7, B:116:0x02ef, B:118:0x02f9, B:123:0x0305, B:125:0x030f, B:130:0x031b, B:132:0x0325, B:134:0x032b, B:145:0x036b, B:65:0x01da, B:88:0x026a, B:89:0x0277, B:91:0x027d, B:92:0x0299), top: B:155:0x00dd }] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        RecommendedActivityModel recommendedActivityModel;
        Iterator<RecommendedActivityContentModel> it;
        boolean z10;
        String backgroundUrl;
        String lottieUrl;
        Intent intent;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        BufferedReader bufferedReader;
        boolean z15;
        boolean z16 = this.O;
        String str2 = this.f39756u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            recommendedActivityModel = (RecommendedActivityModel) arguments.getParcelable("model");
        } else {
            recommendedActivityModel = null;
        }
        kotlin.jvm.internal.i.d(recommendedActivityModel);
        this.f39757v = recommendedActivityModel;
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity");
        this.f39758w = (RecommendedActivitiesPlaybackActivity) requireActivity;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PLAY_PAUSE");
        intentFilter.addAction("STOP");
        requireActivity().registerReceiver(this.P, intentFilter);
        try {
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new o(this, 1));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new o(this, 2));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new o(this, 3));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAStop)).setOnClickListener(new o(this, 4));
            ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new o(this, 5));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new o(this, 6));
            ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new s(this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str2, e10);
        }
        try {
            ArrayList<RecommendedActivityContentModel> activityContent = P().getActivityContent();
            kotlin.jvm.internal.i.d(activityContent);
            it = activityContent.iterator();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap<String, String> hashMap = this.F;
            if (hasNext) {
                RecommendedActivityContentModel next = it.next();
                String label = next.getLabel();
                switch (label.hashCode()) {
                    case -2135825746:
                        if (!label.equals("cta_goal_track")) {
                            break;
                        } else {
                            String ctaGoalTrack = next.getCtaGoalTrack();
                            kotlin.jvm.internal.i.d(ctaGoalTrack);
                            hashMap.put("cta_goal_track", ctaGoalTrack);
                            break;
                        }
                    case -1242863452:
                        if (!label.equals("stop_dialog_positive_cta")) {
                            break;
                        } else {
                            String stopDialogPositiveCta = next.getStopDialogPositiveCta();
                            kotlin.jvm.internal.i.d(stopDialogPositiveCta);
                            hashMap.put("stop_dialog_positive_cta", stopDialogPositiveCta);
                            break;
                        }
                    case -1073455904:
                        if (!label.equals("stop_dialog_negative_cta")) {
                            break;
                        } else {
                            String stopDialogNegativeCta = next.getStopDialogNegativeCta();
                            kotlin.jvm.internal.i.d(stopDialogNegativeCta);
                            hashMap.put("stop_dialog_negative_cta", stopDialogNegativeCta);
                            break;
                        }
                    case -816372655:
                        if (!label.equals("cta_done")) {
                            break;
                        } else {
                            String ctaDone = next.getCtaDone();
                            kotlin.jvm.internal.i.d(ctaDone);
                            hashMap.put("cta_done", ctaDone);
                            break;
                        }
                    case -677645572:
                        if (!label.equals("goal_added_toast")) {
                            break;
                        } else {
                            String goalAddedToast = next.getGoalAddedToast();
                            kotlin.jvm.internal.i.d(goalAddedToast);
                            hashMap.put("goal_added_toast", goalAddedToast);
                            break;
                        }
                    case 818315527:
                        if (!label.equals("stop_dialog_text")) {
                            break;
                        } else {
                            String stopDialogText = next.getStopDialogText();
                            kotlin.jvm.internal.i.d(stopDialogText);
                            hashMap.put("stop_dialog_text", stopDialogText);
                            break;
                        }
                    case 830912211:
                        if (!label.equals("gif_tips")) {
                            break;
                        } else {
                            ArrayList<RecommendedPhysicalActivityGifTips> gifTipsList = next.getGifTipsList();
                            kotlin.jvm.internal.i.d(gifTipsList);
                            this.H = gifTipsList;
                            break;
                        }
                    case 1839097540:
                        if (!label.equals("cta_goal_add")) {
                            break;
                        } else {
                            String ctaGoalAdd = next.getCtaGoalAdd();
                            kotlin.jvm.internal.i.d(ctaGoalAdd);
                            hashMap.put("cta_goal_add", ctaGoalAdd);
                            break;
                        }
                    case 2141180515:
                        if (!label.equals("cta_goal_added")) {
                            break;
                        } else {
                            String ctaGoalAdded = next.getCtaGoalAdded();
                            kotlin.jvm.internal.i.d(ctaGoalAdded);
                            hashMap.put("cta_goal_added", ctaGoalAdded);
                            break;
                        }
                }
            } else {
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                ArrayList<RecommendedPhysicalActivityGifTips> arrayList = this.H;
                if (arrayList != null && !arrayList.isEmpty()) {
                    z10 = false;
                    if (z10) {
                        S();
                    } else {
                        ((ConstraintLayout) _$_findCachedViewById(R.id.clTipsViewPager)).setVisibility(8);
                    }
                    backgroundUrl = P().getBackgroundUrl();
                    if (backgroundUrl != null) {
                        if (backgroundUrl.length() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            com.bumptech.glide.f i6 = Glide.i(requireActivity());
                            Utils utils = Utils.INSTANCE;
                            Context requireContext = requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            i6.p(utils.getAudioFilePath(backgroundUrl, requireContext)).B((AppCompatImageView) _$_findCachedViewById(R.id.ivRAbg));
                        }
                    }
                    lottieUrl = P().getLottieUrl();
                    String str3 = "";
                    if (lottieUrl != null) {
                        if (lottieUrl.length() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            x xVar = new x();
                            xVar.f23469u = "";
                            Utils utils2 = Utils.INSTANCE;
                            Context requireContext2 = requireContext();
                            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                            FileInputStream fileInputStream = new FileInputStream(utils2.getAudioFilePath(lottieUrl, requireContext2));
                            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, gv.a.f16927b);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            Iterator it2 = fv.k.v0(new rs.b(bufferedReader)).iterator();
                            while (it2.hasNext()) {
                                xVar.f23469u = ((String) xVar.f23469u) + ((String) it2.next());
                            }
                            hs.k kVar = hs.k.f19476a;
                            ca.a.z(bufferedReader, null);
                            fileInputStream.close();
                            a3.d.d((String) xVar.f23469u).b(new pl.i(this, xVar, 5));
                        }
                    }
                    if (z16) {
                        FirestoreGoal firestoreGoal = Q().C;
                        if (firestoreGoal != null && firestoreGoal.isVisible()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (!z16) {
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        String goalId = P().getGoalId();
                        String domain = P().getDomain();
                        if (domain != null) {
                            str3 = domain;
                        }
                        Goal goalById = firebasePersistence.getGoalById(goalId, UtilsKt.getCourseId(str3));
                        if (goalById != null && goalById.isVisible()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    intent = O().getIntent();
                    if (intent == null && intent.hasExtra("source")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Intent intent2 = O().getIntent();
                        if (intent2 != null) {
                            str = intent2.getStringExtra("source");
                        } else {
                            str = null;
                        }
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
                    this.f39761z = false;
                    ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(hashMap.get("cta_goal_add"));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvRATitle)).setText(P().getTitle());
                    v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new q(this, null), 3);
                    if (!z16) {
                        Q().D.e(getViewLifecycleOwner(), new so.b0(15, new e()));
                        return;
                    }
                    return;
                }
                z10 = true;
                if (z10) {
                }
                backgroundUrl = P().getBackgroundUrl();
                if (backgroundUrl != null) {
                }
                lottieUrl = P().getLottieUrl();
                String str32 = "";
                if (lottieUrl != null) {
                }
                if (z16) {
                }
                if (!z16) {
                }
                intent = O().getIntent();
                if (intent == null) {
                }
                z11 = false;
                if (z11) {
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
                this.f39761z = false;
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(hashMap.get("cta_goal_add"));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRATitle)).setText(P().getTitle());
                v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new q(this, null), 3);
                if (!z16) {
                }
            }
        }
    }

    /* compiled from: RecommendedActivityPhysicalFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f39764a;

        public b(int i6) {
            this.f39764a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = p.R;
            p.this.J(i6, this.f39764a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
