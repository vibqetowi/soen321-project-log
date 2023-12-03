package zo;

import a3.t;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.viewpager.widget.ViewPager;
import androidx.work.u;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedPhysicalActivityGifTips;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
/* compiled from: RecommendedActivityGifFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lzo/i;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f39715j0 = 0;
    public int A;
    public boolean B;
    public RecommendedActivitiesPlaybackActivity C;
    public boolean F;
    public AudioHelper G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public float L;
    public long M;
    public int N;
    public boolean O;
    public a0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean X;
    public zo.j c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f39718d0;
    public boolean e0;

    /* renamed from: v  reason: collision with root package name */
    public ObjectAnimator f39724v;

    /* renamed from: w  reason: collision with root package name */
    public RecommendedActivityModel f39725w;

    /* renamed from: x  reason: collision with root package name */
    public String f39726x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39727y;

    /* renamed from: z  reason: collision with root package name */
    public AudioFocusRequest f39728z;

    /* renamed from: i0  reason: collision with root package name */
    public final LinkedHashMap f39722i0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f39723u = LogHelper.INSTANCE.makeLogTag("RAGifFragment");
    public boolean D = true;
    public String E = "";
    public String W = "0";
    public final HashMap<String, String> Y = new HashMap<>();
    public ArrayList<RecommendedPhysicalActivityGifTips> Z = new ArrayList<>();

    /* renamed from: a0  reason: collision with root package name */
    public final int f39716a0 = 5000;

    /* renamed from: b0  reason: collision with root package name */
    public final Handler f39717b0 = new Handler();

    /* renamed from: f0  reason: collision with root package name */
    public final yn.a f39719f0 = new yn.a();

    /* renamed from: g0  reason: collision with root package name */
    public final m0 f39720g0 = b0.j(this, y.a(ap.a.class), new h(this), new C0680i(this), new j(this));

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f39721h0 = sp.b.K();

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f39729c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<RecommendedPhysicalActivityGifTips> f39730d;

        public a(androidx.fragment.app.p pVar, ArrayList tipsList) {
            kotlin.jvm.internal.i.g(tipsList, "tipsList");
            this.f39729c = pVar;
            this.f39730d = new ArrayList<>();
            this.f39730d = tipsList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f39730d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f39729c).inflate(R.layout.row_ra_gif_tips_pager, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.activityTips);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(this.f39730d.get(i6).getContent());
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

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            Float f;
            Integer it = num;
            i iVar = i.this;
            if (iVar.isAdded()) {
                kotlin.jvm.internal.i.f(it, "it");
                if (it.intValue() > 0) {
                    CircularProgressBar circularProgressBar = (CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress);
                    if (circularProgressBar != null) {
                        f = Float.valueOf(circularProgressBar.getProgress());
                    } else {
                        f = null;
                    }
                    if (kotlin.jvm.internal.i.a(f, 0.0f)) {
                        CircularProgressBar circularProgressBar2 = (CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress);
                        if (circularProgressBar2 != null) {
                            circularProgressBar2.setVisibility(0);
                        }
                        RobertoTextView robertoTextView = (RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress);
                        if (robertoTextView != null) {
                            robertoTextView.setVisibility(0);
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                        if (appCompatImageView != null) {
                            appCompatImageView.setVisibility(8);
                        }
                    }
                }
                CircularProgressBar circularProgressBar3 = (CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress);
                if (circularProgressBar3 != null) {
                    circularProgressBar3.setProgress(it.intValue());
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress);
                if (robertoTextView2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(it);
                    sb2.append('%');
                    robertoTextView2.setText(sb2.toString());
                }
                if (it.intValue() >= 100) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_ra_downloaded);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                    ((RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                    iVar.B = true;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f39735b;

        public d(int i6) {
            this.f39735b = i6;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            i iVar = i.this;
            int i6 = iVar.N + 1;
            iVar.N = i6;
            if (i6 >= this.f39735b) {
                iVar.N = 0;
                iVar.b0(true);
                iVar.R = true;
                a0 a0Var = iVar.P;
                if (a0Var != null) {
                    a0Var.B(0);
                    a0 a0Var2 = iVar.P;
                    if (a0Var2 != null) {
                        a0Var2.z(false);
                        iVar.H = true;
                        ((LottieAnimationView) iVar._$_findCachedViewById(R.id.lavRAAnimation)).setProgress(0.0f);
                        ((LottieAnimationView) iVar._$_findCachedViewById(R.id.lavRAAnimation)).d();
                        ((AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_replay);
                        iVar.V = true;
                        if (iVar.Q && iVar.R) {
                            ((RobertoButton) iVar._$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                            ((RobertoButton) iVar._$_findCachedViewById(R.id.btnRASolid)).setOnClickListener(new zo.h(iVar, 7));
                            ((MotionLayout) iVar._$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                        }
                        iVar.X(false);
                        if (iVar.X) {
                            ((RobertoButton) iVar._$_findCachedViewById(R.id.btnRAStroke)).setVisibility(8);
                            ((RobertoButton) iVar._$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("simpleExoplayer");
                    throw null;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f39737v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39738w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FirestoreGoal firestoreGoal, x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f39737v = firestoreGoal;
            this.f39738w = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i6 = i.f39715j0;
                i.this.h0(this.f39737v, null);
            }
            com.google.android.material.bottomsheet.f fVar = this.f39738w.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends FirestoreGoal>, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends FirestoreGoal> singleUseEvent) {
            hs.k kVar;
            FirestoreGoal contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            i iVar = i.this;
            if (contentIfNotHandled != null) {
                int i6 = i.f39715j0;
                iVar.Z(contentIfNotHandled);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                Toast.makeText(iVar.requireContext(), iVar.getString(R.string.loginSomethingWentWrong), 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<u.a, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(u.a aVar) {
            boolean z10;
            String str;
            String str2;
            String str3;
            u.a status = aVar;
            kotlin.jvm.internal.i.g(status, "status");
            if (status == u.a.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
            i iVar = i.this;
            iVar.I = z10;
            int ordinal = status.ordinal();
            HashMap<String, String> hashMap = iVar.Y;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    iVar.isAdded();
                                }
                            } else if (iVar.isAdded() && (str3 = hashMap.get("download_failed_toast")) != null) {
                                Utils.INSTANCE.showCustomToast(iVar.requireActivity(), str3);
                            }
                        } else {
                            if (iVar.isAdded() && (str2 = hashMap.get("download_failed_toast")) != null) {
                                Utils.INSTANCE.showCustomToast(iVar.requireActivity(), str2);
                            }
                            ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                            ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                            ((RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            iVar.I = false;
                            Bundle bundle = new Bundle();
                            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle.putString("activity_id", iVar.S().getGoalId());
                            bundle.putString("activity_name", iVar.S().getTitle());
                            String lowerCase = iVar.S().getTemplateType().toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                            bundle.putString("type", lowerCase);
                            bundle.putString("source", iVar.P().f11610y);
                            bundle.putBoolean("goal_added", iVar.X);
                            gk.a.b(bundle, "activity_download_fail");
                        }
                    }
                } else if (iVar.isAdded() && (str = hashMap.get("download_progress_toast")) != null) {
                    Utils.INSTANCE.showCustomToast(iVar.requireActivity(), str);
                }
                return hs.k.f19476a;
            }
            if (iVar.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String Q = iVar.Q();
                Context requireContext = iVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                if (utils.getAudioFilePath(Q, requireContext) != null) {
                    String str4 = hashMap.get("download_complete_toast");
                    if (str4 != null) {
                        utils.showCustomToast(iVar.requireActivity(), str4);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_ra_downloaded);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                    ((RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                    iVar.B = true;
                    a0 a0Var = iVar.P;
                    if (a0Var != null && a0Var.isPlaying()) {
                        iVar.J = true;
                    }
                    iVar.X(true);
                } else {
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) iVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(0);
                    ((RobertoTextView) iVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(0);
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) iVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("activity_id", iVar.S().getGoalId());
                bundle2.putString("activity_name", iVar.S().getTitle());
                String lowerCase2 = iVar.S().getTemplateType().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                bundle2.putString("type", lowerCase2);
                bundle2.putString("source", iVar.P().f11610y);
                bundle2.putBoolean("goal_added", iVar.X);
                gk.a.b(bundle2, "activity_audio_download_finish");
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39741u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f39741u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f39741u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: zo.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0680i extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39742u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0680i(Fragment fragment) {
            super(0);
            this.f39742u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f39742u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39743u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f39743u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f39743u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J() {
        AudioManager audioManager;
        Object systemService = P().getSystemService("audio");
        if (systemService instanceof AudioManager) {
            audioManager = (AudioManager) systemService;
        } else {
            audioManager = null;
        }
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f39728z;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this);
        }
    }

    public final void K(int i6, int i10) {
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

    public final void M() {
        try {
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            AudioHelper audioHelper = new AudioHelper(requireContext, Q());
            this.G = audioHelper;
            audioHelper.registerDownloadReceivers();
            AudioHelper audioHelper2 = this.G;
            if (audioHelper2 != null) {
                audioHelper2.getProgressLiveData().k(requireActivity());
                AudioHelper audioHelper3 = this.G;
                if (audioHelper3 != null) {
                    audioHelper3.getProgressLiveData().e(requireActivity(), new so.b0(14, new c()));
                    return;
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("audioHelper");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    public final void O() {
        HashMap<String, String> hashMap = this.Y;
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(hashMap.get("cta_goal_added"));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setText(hashMap.get("cta_goal_track"));
        this.X = true;
        Context requireContext = requireContext();
        Object obj = g0.a.f16164a;
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setBackground(a.c.b(requireContext, R.drawable.button_disabled));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setAlpha(0.2f);
        ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setBackground(a.c.b(requireContext(), R.drawable.button_border_peach));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setTextColor(g0.a.b(requireContext(), R.color.white));
        ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setOnClickListener(new zo.h(this, 6));
    }

    public final RecommendedActivitiesPlaybackActivity P() {
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = this.C;
        if (recommendedActivitiesPlaybackActivity != null) {
            return recommendedActivitiesPlaybackActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final String Q() {
        String str = this.f39726x;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("audioUrl");
        throw null;
    }

    public final RecommendedActivityModel S() {
        RecommendedActivityModel recommendedActivityModel = this.f39725w;
        if (recommendedActivityModel != null) {
            return recommendedActivityModel;
        }
        kotlin.jvm.internal.i.q("recommendedActivityModel");
        throw null;
    }

    public final ap.a U() {
        return (ap.a) this.f39720g0.getValue();
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        try {
            if (i6 != 2) {
                if (i6 == 3) {
                    ((LottieAnimationView) _$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setVisibility(0);
                    ((ProgressBar) _$_findCachedViewById(R.id.sbRASeek)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setClickable(true);
                    return;
                }
                return;
            }
            ((LottieAnimationView) _$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(0);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(8);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.g();
            }
            ObjectAnimator objectAnimator = this.f39724v;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.f39724v;
                if (objectAnimator2 != null) {
                    objectAnimator2.pause();
                } else {
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    public final void X(boolean z10) {
        String Q;
        a0 a0Var;
        try {
            if (ConnectionStatusReceiver.isConnected() || this.B) {
                if (z10 && (a0Var = this.P) != null) {
                    this.K = a0Var.getCurrentPosition();
                    ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
                    this.L = ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).getProgress();
                    ObjectAnimator objectAnimator = this.f39724v;
                    if (objectAnimator != null) {
                        this.M = objectAnimator.getCurrentPlayTime();
                        ObjectAnimator objectAnimator2 = this.f39724v;
                        if (objectAnimator2 != null) {
                            objectAnimator2.pause();
                        } else {
                            kotlin.jvm.internal.i.q("progressAnimator");
                            throw null;
                        }
                    }
                    a0 a0Var2 = this.P;
                    if (a0Var2 != null) {
                        a0Var2.a();
                    } else {
                        kotlin.jvm.internal.i.q("simpleExoplayer");
                        throw null;
                    }
                }
                this.P = new j.b(requireContext()).a();
                if (this.B) {
                    Utils utils = Utils.INSTANCE;
                    String Q2 = Q();
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    Q = utils.getAudioFilePath(Q2, requireContext);
                } else {
                    Q = Q();
                }
                com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(Uri.parse(Q));
                a0 a0Var3 = this.P;
                if (a0Var3 != null) {
                    a0Var3.h0(b10);
                    a0 a0Var4 = this.P;
                    if (a0Var4 != null) {
                        a0Var4.E(this);
                        a0 a0Var5 = this.P;
                        if (a0Var5 != null) {
                            a0Var5.l();
                            a0 a0Var6 = this.P;
                            if (a0Var6 != null) {
                                a0Var6.B(1);
                                ObjectAnimator objectAnimator3 = this.f39724v;
                                if (objectAnimator3 != null && this.J) {
                                    objectAnimator3.cancel();
                                }
                                if (this.J) {
                                    a0 a0Var7 = this.P;
                                    if (a0Var7 != null) {
                                        a0Var7.f0(this.K);
                                        Y(this.E);
                                        ObjectAnimator objectAnimator4 = this.f39724v;
                                        if (objectAnimator4 != null) {
                                            objectAnimator4.setCurrentPlayTime(this.M);
                                            ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).setProgress(this.L);
                                            a0(true);
                                            this.R = false;
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressAnimator");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("simpleExoplayer");
                                    throw null;
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("simpleExoplayer");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("simpleExoplayer");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("simpleExoplayer");
                    throw null;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "error in initialising audio", e10);
        }
    }

    public final void Y(String str) {
        int parseInt = Integer.parseInt(gv.r.i1(str).toString());
        ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).setRepeatCount(-1);
        ((ProgressBar) _$_findCachedViewById(R.id.sbRASeek)).setMax(500);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.sbRASeek), Constants.SCREEN_PROGRESS, 25, 500);
        kotlin.jvm.internal.i.f(ofInt, "ofInt(sbRASeek, \"progress\", 25, 500)");
        this.f39724v = ofInt;
        ofInt.setDuration(((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).getDuration() * parseInt);
        ObjectAnimator objectAnimator = this.f39724v;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimator2 = this.f39724v;
            if (objectAnimator2 != null) {
                objectAnimator2.setAutoCancel(true);
                ObjectAnimator objectAnimator3 = this.f39724v;
                if (objectAnimator3 != null) {
                    objectAnimator3.start();
                    ObjectAnimator objectAnimator4 = this.f39724v;
                    if (objectAnimator4 != null) {
                        objectAnimator4.pause();
                        ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).i();
                        ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).c(new d(parseInt));
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
                kotlin.jvm.internal.i.q("progressAnimator");
                throw null;
            }
            kotlin.jvm.internal.i.q("progressAnimator");
            throw null;
        }
        kotlin.jvm.internal.i.q("progressAnimator");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    public final void Z(FirestoreGoal firestoreGoal) {
        yn.a aVar = this.f39719f0;
        aVar.getClass();
        if (yn.a.b()) {
            h0(firestoreGoal, null);
        } else {
            x xVar = new x();
            ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_gif", aVar.a(true), "goals", this.f39719f0, new e(firestoreGoal, xVar));
            xVar.f23469u = notificationPermissionBottomSheet;
            notificationPermissionBottomSheet.show(requireActivity().getSupportFragmentManager(), "permission");
        }
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", S().getGoalId());
        bundle.putString("activity_name", S().getTitle());
        String templateType = S().getTemplateType();
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
        String lowerCase = templateType.toLowerCase(ENGLISH);
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        bundle.putString("type", lowerCase);
        bundle.putString("source", P().f11610y);
        bundle.putString("played_progress", this.W);
        gk.a.b(bundle, "activity_add_goal_click");
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39722i0;
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
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("activity_id", S().getGoalId());
            bundle.putString("activity_name", S().getTitle());
            String lowerCase = S().getTemplateType().toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            bundle.putString("type", lowerCase);
            bundle.putString("source", P().f11610y);
            bundle.putBoolean("goal_added", this.X);
            a0 a0Var = this.P;
            Handler handler = this.f39717b0;
            if (a0Var != null && a0Var.isPlaying()) {
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                this.S = false;
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                this.V = false;
                a0 a0Var2 = this.P;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    if (z10) {
                        J();
                    }
                    zo.j jVar = this.c0;
                    if (jVar != null) {
                        handler.removeCallbacks(jVar);
                    }
                    bundle.putString("action_source", "screen");
                    bundle.putString("played_progress", this.W);
                    gk.a.b(bundle, "activity_pause_click");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (this.P != null && c0()) {
                if (!this.e0) {
                    this.e0 = true;
                    androidx.fragment.app.p requireActivity = requireActivity();
                    if (requireActivity instanceof RecommendedActivitiesPlaybackActivity) {
                        recommendedActivitiesPlaybackActivity = (RecommendedActivitiesPlaybackActivity) requireActivity;
                    } else {
                        recommendedActivitiesPlaybackActivity = null;
                    }
                    if (recommendedActivitiesPlaybackActivity != null) {
                        recommendedActivitiesPlaybackActivity.A = true;
                    }
                }
                if (this.R) {
                    b0(true);
                }
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).A();
                b0(false);
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_pause);
                a0 a0Var3 = this.P;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    zo.j jVar2 = this.c0;
                    if (jVar2 != null) {
                        handler.postDelayed(jVar2, this.f39716a0);
                    }
                    if (this.V) {
                        gk.a.b(bundle, "activity_redo_click");
                        return;
                    }
                    bundle.putString("action_source", "screen");
                    gk.a.b(bundle, "activity_play_click");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "error in playing audio", e10);
        }
    }

    public final void b0(boolean z10) {
        if (z10) {
            this.S = false;
            ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
            try {
                Object systemService = requireActivity().getSystemService("notification");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f39723u, "exception", e10);
                return;
            }
        }
        this.S = true;
        if (!this.T) {
            Handler handler = new Handler();
            handler.post(new k(this, handler));
        }
        this.T = true;
        ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).j();
    }

    public final boolean c0() {
        int requestAudioFocus;
        try {
            Object systemService = P().getSystemService("audio");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                builder2.setUsage(1);
                builder2.setContentType(2);
                builder.setAudioAttributes(builder2.build());
                builder.setAcceptsDelayedFocusGain(false);
                builder.setOnAudioFocusChangeListener(this);
                AudioFocusRequest build = builder.build();
                this.f39728z = build;
                kotlin.jvm.internal.i.d(build);
                requestAudioFocus = audioManager.requestAudioFocus(build);
            } else {
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, 1);
            }
            if (requestAudioFocus != 1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "Exception", e10);
            return false;
        }
    }

    public final void g0() {
        AppCompatImageView appCompatImageView;
        try {
            if (ConnectionStatusReceiver.isConnected() && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta)) != null) {
                appCompatImageView.setVisibility(0);
            }
            M();
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new zo.h(this, 0));
            }
            this.F = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    public final void h0(FirestoreGoal firestoreGoal, Goal goal) {
        String str;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 9);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar.setTimeInMillis(calendar2.getTimeInMillis());
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerThemeDark, new zo.a(calendar, firestoreGoal, this, goal, 1), calendar.get(11), calendar.get(12), false);
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
    }

    public final void j0(boolean z10) {
        String str;
        try {
            if (isAdded()) {
                this.H = z10;
                if (z10) {
                    ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).setProgress(0.0f);
                    ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).d();
                    Utils utils = Utils.INSTANCE;
                    if (utils.checkConnectivity(requireActivity()) && (str = this.Y.get("gif_failed_toast")) != null) {
                        utils.showCustomToast(requireActivity(), str);
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_replay);
                    this.V = true;
                    return;
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                this.V = false;
                if (!this.F && !this.B) {
                    g0();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "exception", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10 && !isAdded()) {
            a0 a0Var = this.P;
            if (a0Var != null) {
                a0Var.z(false);
                a0 a0Var2 = this.P;
                if (a0Var2 != null) {
                    a0Var2.a();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("simpleExoplayer");
            throw null;
        } else if (z10) {
            this.J = false;
            this.K = 0L;
            this.M = 0L;
            this.L = 0.0f;
            ObjectAnimator objectAnimator = this.f39724v;
            if (objectAnimator != null) {
                objectAnimator.resume();
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.j();
            }
        } else {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.g();
            }
            ObjectAnimator objectAnimator2 = this.f39724v;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                ObjectAnimator objectAnimator3 = this.f39724v;
                if (objectAnimator3 != null) {
                    objectAnimator3.pause();
                } else {
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        AudioManager audioManager;
        a0 a0Var;
        try {
            Object systemService = P().getSystemService("audio");
            if (systemService instanceof AudioManager) {
                audioManager = (AudioManager) systemService;
            } else {
                audioManager = null;
            }
            if (audioManager != null) {
                if (i6 != -3) {
                    if (i6 != -2) {
                        if (i6 != -1) {
                            if (i6 == 1) {
                                if (this.f39727y && (a0Var = this.P) != null && !a0Var.isPlaying()) {
                                    a0(true);
                                } else {
                                    a0 a0Var2 = this.P;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.A, 0);
                                    }
                                }
                                this.f39727y = false;
                                return;
                            }
                            return;
                        }
                        this.f39727y = false;
                        a0(true);
                        this.O = true;
                        return;
                    }
                    a0 a0Var3 = this.P;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.f39727y = true;
                        a0(false);
                        return;
                    }
                    return;
                }
                this.A = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_recommended_activity_gif, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        try {
            AudioHelper audioHelper = this.G;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.G;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            }
            this.f39717b0.removeCallbacksAndMessages(null);
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            a0 a0Var = this.P;
            if (a0Var != null) {
                a0Var.a();
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.d();
            }
            ObjectAnimator objectAnimator = this.f39724v;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, "error in unregistering listener", e10);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39722i0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        long j10;
        super.onPause();
        try {
            this.U = false;
            if (this.f39724v != null) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
                this.L = ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).getProgress();
                ObjectAnimator objectAnimator = this.f39724v;
                if (objectAnimator != null) {
                    if (objectAnimator.isRunning()) {
                        ObjectAnimator objectAnimator2 = this.f39724v;
                        if (objectAnimator2 != null) {
                            objectAnimator2.pause();
                        } else {
                            kotlin.jvm.internal.i.q("progressAnimator");
                            throw null;
                        }
                    }
                    ObjectAnimator objectAnimator3 = this.f39724v;
                    if (objectAnimator3 != null) {
                        this.M = objectAnimator3.getCurrentPlayTime();
                        a0 a0Var = this.P;
                        if (a0Var != null) {
                            j10 = a0Var.getCurrentPosition();
                        } else {
                            j10 = 0;
                        }
                        this.K = j10;
                        a0 a0Var2 = this.P;
                        if (a0Var2 != null && a0Var2.isPlaying()) {
                            this.f39718d0 = true;
                            a0(true);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
                kotlin.jvm.internal.i.q("progressAnimator");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        super.onResume();
        try {
            this.U = true;
            if (this.f39724v != null && !this.R) {
                if (!ConnectionStatusReceiver.isConnected() && !this.B) {
                    j0(true);
                    Utils utils = Utils.INSTANCE;
                    if (utils.checkConnectivity(requireActivity()) && (str = this.Y.get("gif_failed_toast")) != null) {
                        utils.showCustomToast(requireActivity(), str);
                        return;
                    }
                    return;
                }
                if (this.f39718d0) {
                    ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).j();
                    ObjectAnimator objectAnimator = this.f39724v;
                    if (objectAnimator != null) {
                        if (!objectAnimator.isRunning()) {
                            ObjectAnimator objectAnimator2 = this.f39724v;
                            if (objectAnimator2 != null) {
                                objectAnimator2.resume();
                            } else {
                                kotlin.jvm.internal.i.q("progressAnimator");
                                throw null;
                            }
                        }
                        a0(true);
                        this.f39718d0 = false;
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:119|120|(1:225)(1:124)|125|(1:127)(1:224)|128|(1:223)(1:132)|133|(2:135|(1:197)(1:139))|(4:199|(1:201)|202|(1:208)(1:206))|209|(1:222)(1:213)|(3:215|(1:217)(1:220)|218)|221|149|(3:151|(1:153)(1:194)|(7:155|156|(3:158|(1:160)|(9:162|163|(1:165)(2:175|176)|166|(2:169|167)|170|171|172|173))|183|184|185|(2:187|188)(1:190)))|195|156|(0)|183|184|185|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025f, code lost:
        if (r2 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028e, code lost:
        if (r2 == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b9, code lost:
        if (kotlin.jvm.internal.i.b(r2, "goals") != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bb, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnRAStroke)).setVisibility(0);
        O();
        r17.Q = false;
        r2 = P().getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d1, code lost:
        if (r2 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d3, code lost:
        r2 = r2.getStringExtra("source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d8, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02dd, code lost:
        if (kotlin.jvm.internal.i.b(r2, "goals") == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02df, code lost:
        r0 = (androidx.appcompat.widget.AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivRABackCta);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e8, code lost:
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ea, code lost:
        r0.setImageResource(com.theinnerhour.b2b.R.drawable.ic_close_icon);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0479, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x047a, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r7, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        RecommendedActivityModel recommendedActivityModel;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        String lottieUrl;
        String str2;
        BufferedReader bufferedReader;
        boolean z14;
        boolean z15;
        boolean z16;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT < 25) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.setRenderMode(t.SOFTWARE);
            }
        } else {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setRenderMode(t.HARDWARE);
            }
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity");
        this.C = (RecommendedActivitiesPlaybackActivity) requireActivity;
        Bundle arguments = getArguments();
        if (arguments != null) {
            recommendedActivityModel = (RecommendedActivityModel) arguments.getParcelable("model");
        } else {
            recommendedActivityModel = null;
        }
        kotlin.jvm.internal.i.d(recommendedActivityModel);
        this.f39725w = recommendedActivityModel;
        String audioUrl = S().getAudioUrl();
        if (audioUrl == null) {
            audioUrl = "";
        }
        this.f39726x = audioUrl;
        Iterator<RecommendedActivityContentModel> it = S().getActivityContent().iterator();
        while (it.hasNext()) {
            RecommendedActivityContentModel next = it.next();
            if (kotlin.jvm.internal.i.b(next.getLabel(), "no_of_loops")) {
                this.E = String.valueOf(next.getLoops());
            }
        }
        Utils utils = Utils.INSTANCE;
        String Q = Q();
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        String audioFilePath = utils.getAudioFilePath(Q, requireContext);
        boolean z17 = false;
        if (audioFilePath != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
        ArrayList<RecommendedActivityContentModel> activityContent = S().getActivityContent();
        kotlin.jvm.internal.i.d(activityContent);
        Iterator<RecommendedActivityContentModel> it2 = activityContent.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            HashMap<String, String> hashMap = this.Y;
            if (hasNext) {
                RecommendedActivityContentModel next2 = it2.next();
                String label = next2.getLabel();
                switch (label.hashCode()) {
                    case -2135825746:
                        if (!label.equals("cta_goal_track")) {
                            break;
                        } else {
                            String ctaGoalTrack = next2.getCtaGoalTrack();
                            kotlin.jvm.internal.i.d(ctaGoalTrack);
                            hashMap.put("cta_goal_track", ctaGoalTrack);
                            break;
                        }
                    case -1811715588:
                        if (!label.equals("download_failed_toast")) {
                            break;
                        } else {
                            String downloadFailedToast = next2.getDownloadFailedToast();
                            kotlin.jvm.internal.i.d(downloadFailedToast);
                            hashMap.put("download_failed_toast", downloadFailedToast);
                            break;
                        }
                    case -1500298176:
                        if (!label.equals("gif_failed_toast")) {
                            break;
                        } else {
                            String gifFailedToast = next2.getGifFailedToast();
                            kotlin.jvm.internal.i.d(gifFailedToast);
                            hashMap.put("gif_failed_toast", gifFailedToast);
                            break;
                        }
                    case -816372655:
                        if (!label.equals("cta_done")) {
                            break;
                        } else {
                            String ctaDone = next2.getCtaDone();
                            kotlin.jvm.internal.i.d(ctaDone);
                            hashMap.put("cta_done", ctaDone);
                            break;
                        }
                    case -677645572:
                        if (!label.equals("goal_added_toast")) {
                            break;
                        } else {
                            String goalAddedToast = next2.getGoalAddedToast();
                            kotlin.jvm.internal.i.d(goalAddedToast);
                            hashMap.put("goal_added_toast", goalAddedToast);
                            break;
                        }
                    case 213459000:
                        if (!label.equals("download_complete_toast")) {
                            break;
                        } else {
                            String downloadCompleteToast = next2.getDownloadCompleteToast();
                            kotlin.jvm.internal.i.d(downloadCompleteToast);
                            hashMap.put("download_complete_toast", downloadCompleteToast);
                            break;
                        }
                    case 830912211:
                        if (!label.equals("gif_tips")) {
                            break;
                        } else {
                            ArrayList<RecommendedPhysicalActivityGifTips> gifTipsList = next2.getGifTipsList();
                            if (gifTipsList != null && !gifTipsList.isEmpty()) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (!z16) {
                                ArrayList<RecommendedPhysicalActivityGifTips> gifTipsList2 = next2.getGifTipsList();
                                kotlin.jvm.internal.i.d(gifTipsList2);
                                this.Z = gifTipsList2;
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 1267918190:
                        if (!label.equals("audio_failed_toast")) {
                            break;
                        } else {
                            String audioFailedToast = next2.getAudioFailedToast();
                            kotlin.jvm.internal.i.d(audioFailedToast);
                            hashMap.put("audio_failed_toast", audioFailedToast);
                            break;
                        }
                    case 1515006508:
                        if (!label.equals("download_progress_toast")) {
                            break;
                        } else {
                            String downloadProgressToast = next2.getDownloadProgressToast();
                            kotlin.jvm.internal.i.d(downloadProgressToast);
                            hashMap.put("download_progress_toast", downloadProgressToast);
                            break;
                        }
                    case 1839097540:
                        if (!label.equals("cta_goal_add")) {
                            break;
                        } else {
                            String ctaGoalAdd = next2.getCtaGoalAdd();
                            kotlin.jvm.internal.i.d(ctaGoalAdd);
                            hashMap.put("cta_goal_add", ctaGoalAdd);
                            break;
                        }
                    case 2141180515:
                        if (!label.equals("cta_goal_added")) {
                            break;
                        } else {
                            String ctaGoalAdded = next2.getCtaGoalAdded();
                            kotlin.jvm.internal.i.d(ctaGoalAdded);
                            hashMap.put("cta_goal_added", ctaGoalAdded);
                            break;
                        }
                }
            } else {
                ArrayList<RecommendedPhysicalActivityGifTips> arrayList = this.Z;
                if (arrayList != null && !arrayList.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    androidx.fragment.app.p requireActivity2 = requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                    ((ViewPager) _$_findCachedViewById(R.id.viewpager)).setAdapter(new a(requireActivity2, this.Z));
                    ((ViewPager) _$_findCachedViewById(R.id.viewpager)).b(new b(this.Z.size()));
                    K(0, this.Z.size());
                    this.c0 = new zo.j(this);
                } else {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.clTipsViewPager)).setVisibility(8);
                }
                if (!ConnectionStatusReceiver.isConnected() && !this.B) {
                    j0(true);
                } else {
                    X(false);
                    j0(false);
                }
                boolean z18 = this.f39721h0;
                if (z18) {
                    FirestoreGoal firestoreGoal = U().C;
                    if (firestoreGoal != null && firestoreGoal.isVisible()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (!z18) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    String goalId = S().getGoalId();
                    String domain = S().getDomain();
                    if (domain == null) {
                        domain = "";
                    }
                    Goal goalById = firebasePersistence.getGoalById(goalId, UtilsKt.getCourseId(domain));
                    if (goalById != null && goalById.isVisible()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                Intent intent = P().getIntent();
                if (intent != null && intent.hasExtra("source")) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    Intent intent2 = P().getIntent();
                    if (intent2 != null) {
                        str = intent2.getStringExtra("source");
                    } else {
                        str = null;
                    }
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
                this.Q = true;
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(hashMap.get("cta_goal_add"));
                ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setText(hashMap.get("cta_done"));
                this.X = false;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRATitle)).setText(S().getTitle());
                if (!this.B) {
                    if (Q().length() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        g0();
                        lottieUrl = S().getLottieUrl();
                        String str3 = this.f39723u;
                        if (lottieUrl != null) {
                            if (lottieUrl.length() > 0) {
                                z17 = true;
                            }
                            if (z17) {
                                try {
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
                                    Iterator it3 = fv.k.v0(new rs.b(bufferedReader)).iterator();
                                    while (it3.hasNext()) {
                                        xVar.f23469u = ((String) xVar.f23469u) + ((String) it3.next());
                                    }
                                    hs.k kVar = hs.k.f19476a;
                                    ca.a.z(bufferedReader, null);
                                    fileInputStream.close();
                                    a3.d.d((String) xVar.f23469u).b(new pl.i(this, xVar, 4));
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(str3, "error in initialising audio", e10);
                                    Utils utils3 = Utils.INSTANCE;
                                    if (utils3.checkConnectivity(requireActivity()) && (str2 = hashMap.get("gif_failed_toast")) != null) {
                                        utils3.showCustomToast(requireActivity(), str2);
                                    }
                                }
                            }
                        }
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new zo.h(this, 1));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new zo.h(this, 2));
                        ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new zo.h(this, 3));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new zo.h(this, 4));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new zo.h(this, 5));
                        ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new m(this));
                        if (!z18) {
                            U().D.e(getViewLifecycleOwner(), new so.b0(13, new f()));
                            return;
                        }
                        return;
                    }
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta)).setVisibility(8);
                lottieUrl = S().getLottieUrl();
                String str32 = this.f39723u;
                if (lottieUrl != null) {
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new zo.h(this, 1));
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new zo.h(this, 2));
                ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new zo.h(this, 3));
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new zo.h(this, 4));
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new zo.h(this, 5));
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new m(this));
                if (!z18) {
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        long j10;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            this.L = ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).getProgress();
            ObjectAnimator objectAnimator = this.f39724v;
            long j11 = 0;
            if (objectAnimator != null) {
                j10 = objectAnimator.getCurrentPlayTime();
            } else {
                j10 = 0;
            }
            this.M = j10;
            a0 a0Var = this.P;
            if (a0Var != null) {
                j11 = a0Var.getCurrentPosition();
            }
            this.K = j11;
            j0(true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39723u, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void T() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void b() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void d0() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void f() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void i() {
    }

    /* compiled from: RecommendedActivityGifFragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f39731a;

        public b(int i6) {
            this.f39731a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = i.f39715j0;
            i.this.K(i6, this.f39731a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void A(com.google.android.exoplayer2.r rVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void L(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void a(g8.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void c(d9.q qVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void f0(v vVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void h(List list) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void i0(q7.d dVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void r(f0 f0Var) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void s(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void t(w.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void w(float f2) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void x(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void y(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(w wVar, w.c cVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void G(o8.p pVar, z8.h hVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void e0(int i6, int i10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void v(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
    }
}
