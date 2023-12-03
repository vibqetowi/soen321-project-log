package hr;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.u;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ScreenS15Fragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhr/c6;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c6 extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public TemplateActivity C;
    public boolean F;
    public AudioHelper G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public float M;
    public long N;
    public boolean O;
    public com.google.android.exoplayer2.a0 P;

    /* renamed from: v  reason: collision with root package name */
    public ObjectAnimator f18243v;

    /* renamed from: w  reason: collision with root package name */
    public String f18244w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18245x;

    /* renamed from: y  reason: collision with root package name */
    public AudioFocusRequest f18246y;

    /* renamed from: z  reason: collision with root package name */
    public int f18247z;
    public final LinkedHashMap Q = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18242u = LogHelper.INSTANCE.makeLogTag(c6.class);
    public String B = "";
    public HashMap<String, Object> D = new HashMap<>();
    public String E = "";

    /* compiled from: ScreenS15Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            c6 c6Var = c6.this;
            if (c6Var.isAdded()) {
                c6Var.J = true;
                ((RobertoTextView) c6Var._$_findCachedViewById(R.id.s15SkipButton)).setVisibility(8);
                ((RobertoButton) c6Var._$_findCachedViewById(R.id.btnS15EndButton)).setVisibility(0);
                ((RobertoButton) c6Var._$_findCachedViewById(R.id.btnS15EndButton)).setText(UtilFunKt.paramsMapToString(c6Var.D.get("s15_end_cta")));
            }
            int i6 = c6.R;
            com.google.android.exoplayer2.a0 a0Var = c6Var.P;
            if (a0Var != null) {
                a0Var.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            c6.this.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: ScreenS15Fragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS15Fragment$setupDownload$1", f = "ScreenS15Fragment.kt", l = {206, 207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f18249u;

        /* compiled from: ScreenS15Fragment.kt */
        @ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS15Fragment$setupDownload$1$1", f = "ScreenS15Fragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c6 f18251u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f18252v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c6 c6Var, int i6, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f18251u = c6Var;
                this.f18252v = i6;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f18251u, this.f18252v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                int i6;
                sp.b.d0(obj);
                c6 c6Var = this.f18251u;
                if (c6Var.isAdded() && ((RobertoTextView) c6Var._$_findCachedViewById(R.id.downloadSize)) != null && (i6 = this.f18252v) > 0) {
                    RobertoTextView robertoTextView = (RobertoTextView) c6Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) c6Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView2 != null) {
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{new Double(i6 * 9.5367432E-7d)}, 1));
                        kotlin.jvm.internal.i.f(format, "format(format, *args)");
                        robertoTextView2.setText(format.concat("MB"));
                    }
                }
                return hs.k.f19476a;
            }
        }

        public b(ls.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f18249u;
            c6 c6Var = c6.this;
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
                String str = c6Var.f18244w;
                kotlin.jvm.internal.i.d(str);
                this.f18249u = 1;
                obj = c6.K(c6Var, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            int intValue = ((Number) obj).intValue();
            kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
            kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(c6Var, intValue, null);
            this.f18249u = 2;
            if (ta.v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS15Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<u.a, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(u.a aVar) {
            boolean z10;
            u.a status = aVar;
            kotlin.jvm.internal.i.g(status, "status");
            if (status == u.a.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
            c6 c6Var = c6.this;
            c6Var.I = z10;
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5 && c6Var.isAdded()) {
                                    Utils.INSTANCE.showCustomToast(c6Var.getContext(), "Download Cancelled");
                                }
                            } else if (c6Var.isAdded()) {
                                Utils.INSTANCE.showCustomToast(c6Var.getContext(), "Download Failed");
                            }
                        } else {
                            if (c6Var.isAdded()) {
                                Utils.INSTANCE.showCustomToast(c6Var.getContext(), "Download failed. Please check your internet connection.");
                            }
                            ProgressBar progressBar = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar != null) {
                                progressBar.setProgress(0);
                            }
                            ProgressBar progressBar2 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            c6Var.I = false;
                        }
                    }
                } else if (c6Var.isAdded()) {
                    Utils.INSTANCE.showCustomToast(c6Var.getContext(), "Download Started");
                }
                return hs.k.f19476a;
            }
            if (c6Var.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String str = c6Var.f18244w;
                kotlin.jvm.internal.i.d(str);
                Context requireContext = c6Var.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                if (utils.getAudioFilePath(str, requireContext) != null) {
                    utils.showCustomToast(c6Var.getContext(), "Download Completed");
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) c6Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ProgressBar progressBar3 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    c6Var.A = true;
                    com.google.android.exoplayer2.a0 a0Var = c6Var.P;
                    if (a0Var != null && a0Var.isPlaying()) {
                        c6Var.K = true;
                    }
                    c6Var.O(true);
                } else {
                    ProgressBar progressBar4 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(0);
                    }
                    ProgressBar progressBar5 = (ProgressBar) c6Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar5 != null) {
                        progressBar5.setProgress(0);
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) c6Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(c6 c6Var, String str, ls.d dVar) {
        z5 z5Var;
        int i6;
        kotlin.jvm.internal.v vVar;
        c6Var.getClass();
        if (dVar instanceof z5) {
            z5Var = (z5) dVar;
            int i10 = z5Var.f19443x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                z5Var.f19443x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = z5Var.f19441v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = z5Var.f19443x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        vVar = z5Var.f19440u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f23467u = -1;
                    kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                    a6 a6Var = new a6(str, vVar2, null);
                    z5Var.f19440u = vVar2;
                    z5Var.f19443x = 1;
                    if (ta.v.S(bVar, a6Var, z5Var) != aVar) {
                        vVar = vVar2;
                    } else {
                        return aVar;
                    }
                }
                return new Integer(vVar.f23467u);
            }
        }
        z5Var = new z5(c6Var, dVar);
        Object obj2 = z5Var.f19441v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = z5Var.f19443x;
        if (i6 == 0) {
        }
        return new Integer(vVar.f23467u);
    }

    public final void J() {
        Object obj;
        androidx.fragment.app.p activity = getActivity();
        AudioManager audioManager = null;
        if (activity != null) {
            obj = activity.getSystemService("audio");
        } else {
            obj = null;
        }
        if (obj instanceof AudioManager) {
            audioManager = (AudioManager) obj;
        }
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f18246y;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this);
        }
    }

    public final TemplateActivity M() {
        TemplateActivity templateActivity = this.C;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void O(boolean z10) {
        String str;
        com.google.android.exoplayer2.a0 a0Var;
        try {
            if (ConnectionStatusReceiver.isConnected() || this.A) {
                if (z10 && (a0Var = this.P) != null) {
                    this.L = a0Var.getCurrentPosition();
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
                    this.M = ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).getProgress();
                    ObjectAnimator objectAnimator = this.f18243v;
                    if (objectAnimator != null) {
                        this.N = objectAnimator.getCurrentPlayTime();
                        ObjectAnimator objectAnimator2 = this.f18243v;
                        if (objectAnimator2 != null) {
                            objectAnimator2.pause();
                        } else {
                            kotlin.jvm.internal.i.q("progressAnimator");
                            throw null;
                        }
                    }
                    com.google.android.exoplayer2.a0 a0Var2 = this.P;
                    if (a0Var2 != null) {
                        a0Var2.a();
                    } else {
                        kotlin.jvm.internal.i.q("simpleExoplayer");
                        throw null;
                    }
                }
                this.P = new j.b(requireContext()).a();
                if (this.A) {
                    Utils utils = Utils.INSTANCE;
                    String str2 = this.f18244w;
                    kotlin.jvm.internal.i.d(str2);
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    str = utils.getAudioFilePath(str2, requireContext);
                } else {
                    str = this.f18244w;
                }
                com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(Uri.parse(str));
                com.google.android.exoplayer2.a0 a0Var3 = this.P;
                if (a0Var3 != null) {
                    a0Var3.h0(b10);
                    com.google.android.exoplayer2.a0 a0Var4 = this.P;
                    if (a0Var4 != null) {
                        a0Var4.l();
                        com.google.android.exoplayer2.a0 a0Var5 = this.P;
                        if (a0Var5 != null) {
                            a0Var5.E(this);
                            com.google.android.exoplayer2.a0 a0Var6 = this.P;
                            if (a0Var6 != null) {
                                a0Var6.B(1);
                                ObjectAnimator objectAnimator3 = this.f18243v;
                                if (objectAnimator3 != null && this.K) {
                                    objectAnimator3.cancel();
                                }
                                if (this.K) {
                                    com.google.android.exoplayer2.a0 a0Var7 = this.P;
                                    if (a0Var7 != null) {
                                        a0Var7.f0(this.L);
                                        P(this.B);
                                        ObjectAnimator objectAnimator4 = this.f18243v;
                                        if (objectAnimator4 != null) {
                                            objectAnimator4.setCurrentPlayTime(this.N);
                                            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setProgress(this.M);
                                            Q(true);
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
            LogHelper.INSTANCE.e(this.f18242u, "error in initialising audio", e10);
        }
    }

    public final void P(String str) {
        int parseInt = Integer.parseInt(gv.r.i1(str).toString());
        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setRepeatCount(parseInt - 1);
        ((ProgressBar) _$_findCachedViewById(R.id.animProgress)).setMax(500);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.animProgress), Constants.SCREEN_PROGRESS, 25, 500);
        kotlin.jvm.internal.i.f(ofInt, "ofInt(animProgress, \"progress\", 25, 500)");
        this.f18243v = ofInt;
        ofInt.setDuration(((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).getDuration() * parseInt);
        ObjectAnimator objectAnimator = this.f18243v;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimator2 = this.f18243v;
            if (objectAnimator2 != null) {
                objectAnimator2.setAutoCancel(true);
                ObjectAnimator objectAnimator3 = this.f18243v;
                if (objectAnimator3 != null) {
                    objectAnimator3.start();
                    ObjectAnimator objectAnimator4 = this.f18243v;
                    if (objectAnimator4 != null) {
                        objectAnimator4.pause();
                        ((RobertoTextView) _$_findCachedViewById(R.id.s15SkipButton)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.s15SkipButton)).setText(UtilFunKt.paramsMapToString(this.D.get("s15_skip_cta")));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setVisibility(8);
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).c(new a());
                        ((RobertoTextView) _$_findCachedViewById(R.id.s15SkipButton)).setOnClickListener(new x5(this, 4));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS15EndButton)).setOnClickListener(new x5(this, 5));
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

    public final void Q(boolean z10) {
        try {
            com.google.android.exoplayer2.a0 a0Var = this.P;
            if (a0Var != null && a0Var.isPlaying()) {
                com.google.android.exoplayer2.a0 a0Var2 = this.P;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    if (z10) {
                        J();
                    }
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    bundle.putBoolean("isStreaming", !this.A);
                    gk.a.b(bundle, "activity_audio_pause");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (this.P != null && S()) {
                com.google.android.exoplayer2.a0 a0Var3 = this.P;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    Bundle bundle2 = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    bundle2.putBoolean("isStreaming", !this.A);
                    gk.a.b(bundle2, "activity_audio_play");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18242u, "error in playing audio", e10);
        }
    }

    public final boolean S() {
        Object obj;
        int requestAudioFocus;
        try {
            androidx.fragment.app.p activity = getActivity();
            if (activity != null) {
                obj = activity.getSystemService("audio");
            } else {
                obj = null;
            }
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) obj;
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                builder2.setUsage(1);
                builder2.setContentType(2);
                builder.setAudioAttributes(builder2.build());
                builder.setAcceptsDelayedFocusGain(false);
                builder.setOnAudioFocusChangeListener(this);
                AudioFocusRequest build = builder.build();
                this.f18246y = build;
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
            LogHelper.INSTANCE.e(this.f18242u, "Exception", e10);
            return false;
        }
    }

    public final void U() {
        if (ConnectionStatusReceiver.isConnected() && this.f18244w != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new b(null), 3);
        }
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        String str = this.f18244w;
        kotlin.jvm.internal.i.d(str);
        AudioHelper audioHelper = new AudioHelper(requireContext, str);
        this.G = audioHelper;
        audioHelper.registerDownloadReceivers();
        AudioHelper audioHelper2 = this.G;
        if (audioHelper2 != null) {
            audioHelper2.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.G;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new r3(16, new b6(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new x5(this, 0));
                }
                this.F = true;
                return;
            }
            kotlin.jvm.internal.i.q("audioHelper");
            throw null;
        }
        kotlin.jvm.internal.i.q("audioHelper");
        throw null;
    }

    public final void X(boolean z10) {
        try {
            if (isAdded()) {
                this.H = z10;
                if (z10) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setProgress(0.0f);
                    }
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.d();
                    }
                    Utils utils = Utils.INSTANCE;
                    Context requireContext = requireContext();
                    String string = getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireContext, string);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.s15RetryImg)).setVisibility(0);
                    return;
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.s15RetryImg)).setVisibility(8);
                if (!this.F && !this.A) {
                    U();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18242u, "exception", e10);
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

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10 && !isAdded()) {
            com.google.android.exoplayer2.a0 a0Var = this.P;
            if (a0Var != null) {
                a0Var.z(false);
            } else {
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } else if (z10) {
            this.K = false;
            this.L = 0L;
            this.N = 0L;
            this.M = 0.0f;
            ObjectAnimator objectAnimator = this.f18243v;
            if (objectAnimator != null) {
                objectAnimator.resume();
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
            if (lottieAnimationView != null) {
                lottieAnimationView.j();
            }
        } else {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.g();
            }
            ObjectAnimator objectAnimator2 = this.f18243v;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                ObjectAnimator objectAnimator3 = this.f18243v;
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
        Object obj;
        com.google.android.exoplayer2.a0 a0Var;
        try {
            androidx.fragment.app.p activity = getActivity();
            AudioManager audioManager = null;
            if (activity != null) {
                obj = activity.getSystemService("audio");
            } else {
                obj = null;
            }
            if (obj instanceof AudioManager) {
                audioManager = (AudioManager) obj;
            }
            if (audioManager != null) {
                if (i6 != -3) {
                    if (i6 != -2) {
                        if (i6 != -1) {
                            if (i6 == 1) {
                                if (this.f18245x && (a0Var = this.P) != null && !a0Var.isPlaying()) {
                                    Q(true);
                                } else {
                                    com.google.android.exoplayer2.a0 a0Var2 = this.P;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.f18247z, 0);
                                    }
                                }
                                this.f18245x = false;
                                return;
                            }
                            return;
                        }
                        this.f18245x = false;
                        Q(true);
                        this.O = true;
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setText("CONTINUE ACTIVITY");
                        ((RobertoTextView) _$_findCachedViewById(R.id.s15SkipButton)).setVisibility(8);
                        return;
                    }
                    com.google.android.exoplayer2.a0 a0Var3 = this.P;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.f18245x = true;
                        Q(false);
                        return;
                    }
                    return;
                }
                this.f18247z = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18242u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s15, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
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
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            com.google.android.exoplayer2.a0 a0Var = this.P;
            if (a0Var != null) {
                a0Var.a();
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
            if (lottieAnimationView != null) {
                lottieAnimationView.d();
            }
            ObjectAnimator objectAnimator = this.f18243v;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18242u, "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        long j10;
        super.onPause();
        if (this.f18243v != null) {
            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
            this.M = ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).getProgress();
            ObjectAnimator objectAnimator = this.f18243v;
            if (objectAnimator != null) {
                if (objectAnimator.isRunning()) {
                    ObjectAnimator objectAnimator2 = this.f18243v;
                    if (objectAnimator2 != null) {
                        objectAnimator2.pause();
                    } else {
                        kotlin.jvm.internal.i.q("progressAnimator");
                        throw null;
                    }
                }
                ObjectAnimator objectAnimator3 = this.f18243v;
                if (objectAnimator3 != null) {
                    this.N = objectAnimator3.getCurrentPlayTime();
                    com.google.android.exoplayer2.a0 a0Var = this.P;
                    if (a0Var != null) {
                        j10 = a0Var.getCurrentPosition();
                    } else {
                        j10 = 0;
                    }
                    this.L = j10;
                    Q(true);
                    return;
                }
                kotlin.jvm.internal.i.q("progressAnimator");
                throw null;
            }
            kotlin.jvm.internal.i.q("progressAnimator");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f18243v != null && !this.J) {
            if (!ConnectionStatusReceiver.isConnected() && !this.A) {
                X(true);
                Utils utils = Utils.INSTANCE;
                Context requireContext = requireContext();
                String string = getString(R.string.no_internet_msg);
                kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                utils.showCustomToast(requireContext, string);
                return;
            }
            this.K = true;
            X(false);
            O(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        BufferedReader bufferedReader;
        String[] fileList;
        boolean z11;
        BufferedReader bufferedReader2;
        String[] fileList2;
        boolean z12;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Build.VERSION.SDK_INT < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(a3.t.HARDWARE);
                }
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.D = ((TemplateActivity) activity).A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS15Header)).setText(UtilFunKt.paramsMapToString(this.D.get("s15_heading")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setText(UtilFunKt.paramsMapToString(this.D.get("s15_start_cta")));
            this.E = UtilFunKt.paramsMapToString(this.D.get("s15_audio_link"));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new x5(this, 1));
            kotlin.jvm.internal.i.g(UtilFunKt.paramsMapToList(this.D.get("s19_timer_loop_list")), "<set-?>");
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.C = (TemplateActivity) activity2;
            if (M().F.containsKey("loops")) {
                Object obj = M().F.get("loops");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                this.B = (String) obj;
            }
            LinkedHashMap<String, String> audioUrls = CourseUtilKt.getAudioUrls("");
            String str = this.E;
            String str2 = null;
            switch (str.hashCode()) {
                case -1044021868:
                    if (!str.equals("https://assets.theinnerhour.com/audio/4-2-6.mp3")) {
                        break;
                    } else {
                        this.f18244w = audioUrls.get("breathing_426");
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.breathing_426_resilience);
                        break;
                    }
                case 425365289:
                    if (!str.equals("https://assets.theinnerhour.com/meta_audios/happiness_5555.mp3")) {
                        break;
                    } else {
                        this.f18244w = audioUrls.get("5555_happiness");
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity3).M, "")) {
                            Context context = getContext();
                            if (context != null && (fileList = context.fileList()) != null && is.k.Q1("happiness_5555.json", fileList)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                                xVar.f23469u = "";
                                FileInputStream openFileInput = requireContext().openFileInput("happiness_5555.json");
                                kotlin.jvm.internal.i.f(openFileInput, "requireContext().openFil…ut(\"happiness_5555.json\")");
                                InputStreamReader inputStreamReader = new InputStreamReader(openFileInput, gv.a.f16927b);
                                if (inputStreamReader instanceof BufferedReader) {
                                    bufferedReader = (BufferedReader) inputStreamReader;
                                } else {
                                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                                }
                                Iterator it = fv.k.v0(new rs.b(bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    xVar.f23469u = ((String) xVar.f23469u) + ((String) it.next());
                                }
                                hs.k kVar = hs.k.f19476a;
                                ca.a.z(bufferedReader, null);
                                a3.d.d((String) xVar.f23469u).b(new a3.m(this) { // from class: hr.y5

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ c6 f19415b;

                                    {
                                        this.f19415b = this;
                                    }

                                    @Override // a3.m
                                    public final void onResult(Object obj2) {
                                        int i6 = r3;
                                        kotlin.jvm.internal.x jsonString = xVar;
                                        c6 this$0 = this.f19415b;
                                        switch (i6) {
                                            case 0:
                                                int i10 = c6.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                                                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).setComposition((a3.c) obj2);
                                                jsonString.f23469u = "";
                                                return;
                                            default:
                                                int i11 = c6.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                                                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).setComposition((a3.c) obj2);
                                                jsonString.f23469u = "";
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.happiness_5555);
                        break;
                    }
                    break;
                case 999823775:
                    if (!str.equals("https://assets.theinnerhour.com/appv2audio/flower_breathing.mp3")) {
                        break;
                    } else {
                        this.f18244w = audioUrls.get("flower_breathing");
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.breathing_self_love_meditation);
                        break;
                    }
                case 1492246677:
                    if (!str.equals("https://assets.theinnerhour.com/meta_audios/4-2-6.mp3")) {
                        break;
                    } else {
                        this.f18244w = audioUrls.get("cue_controlled_relaxation");
                        if (this.C != null) {
                            Goal y02 = M().y0();
                            if (y02 != null) {
                                str2 = y02.getGoalId();
                            }
                            if (kotlin.jvm.internal.i.b(str2, "sXrLIb3AaZVsY12oSMw4")) {
                                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.breathing_426_resilience);
                                break;
                            }
                        }
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.breathing_426);
                        break;
                    }
                case 1636644828:
                    if (!str.equals("https://assets.theinnerhour.com/meta_audios/4-7-8.mp3")) {
                        break;
                    } else {
                        this.f18244w = audioUrls.get("breathing_478");
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.breathing_478);
                        break;
                    }
                case 2060465897:
                    if (str.equals("https://assets.theinnerhour.com/meta_audios/happiness_4444.mp3")) {
                        this.f18244w = audioUrls.get("4444_happiness");
                        androidx.fragment.app.p activity4 = getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!kotlin.jvm.internal.i.b(((TemplateActivity) activity4).M, "")) {
                            Context context2 = getContext();
                            if (context2 != null && (fileList2 = context2.fileList()) != null && is.k.Q1("happiness_4444.json", fileList2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                final kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                                xVar2.f23469u = "";
                                FileInputStream openFileInput2 = requireContext().openFileInput("happiness_4444.json");
                                kotlin.jvm.internal.i.f(openFileInput2, "requireContext().openFil…ut(\"happiness_4444.json\")");
                                InputStreamReader inputStreamReader2 = new InputStreamReader(openFileInput2, gv.a.f16927b);
                                if (inputStreamReader2 instanceof BufferedReader) {
                                    bufferedReader2 = (BufferedReader) inputStreamReader2;
                                } else {
                                    bufferedReader2 = new BufferedReader(inputStreamReader2, 8192);
                                }
                                Iterator it2 = fv.k.v0(new rs.b(bufferedReader2)).iterator();
                                while (it2.hasNext()) {
                                    xVar2.f23469u = ((String) xVar2.f23469u) + ((String) it2.next());
                                }
                                hs.k kVar2 = hs.k.f19476a;
                                ca.a.z(bufferedReader2, null);
                                a3.d.d((String) xVar2.f23469u).b(new a3.m(this) { // from class: hr.y5

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ c6 f19415b;

                                    {
                                        this.f19415b = this;
                                    }

                                    @Override // a3.m
                                    public final void onResult(Object obj2) {
                                        int i6 = r3;
                                        kotlin.jvm.internal.x jsonString = xVar2;
                                        c6 this$0 = this.f19415b;
                                        switch (i6) {
                                            case 0:
                                                int i10 = c6.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                                                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).setComposition((a3.c) obj2);
                                                jsonString.f23469u = "";
                                                return;
                                            default:
                                                int i11 = c6.R;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(jsonString, "$jsonString");
                                                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).setComposition((a3.c) obj2);
                                                jsonString.f23469u = "";
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.happiness_4444);
                        break;
                    }
                    break;
            }
            Utils utils = Utils.INSTANCE;
            String str3 = this.f18244w;
            kotlin.jvm.internal.i.d(str3);
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            if (utils.getAudioFilePath(str3, requireContext) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.A = z12;
            if (!z12) {
                if (ConnectionStatusReceiver.isConnected()) {
                    U();
                }
            } else {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
            if (!ConnectionStatusReceiver.isConnected() && !this.A) {
                X(true);
                ((AppCompatImageView) _$_findCachedViewById(R.id.s15RetryImg)).setOnClickListener(new x5(this, 2));
                ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setOnClickListener(new x5(this, 3));
            }
            O(false);
            X(false);
            ((AppCompatImageView) _$_findCachedViewById(R.id.s15RetryImg)).setOnClickListener(new x5(this, 2));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS15Button)).setOnClickListener(new x5(this, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18242u, "exception", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        long j10;
        kotlin.jvm.internal.i.g(error, "error");
        this.M = ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).getProgress();
        ObjectAnimator objectAnimator = this.f18243v;
        long j11 = 0;
        if (objectAnimator != null) {
            j10 = objectAnimator.getCurrentPlayTime();
        } else {
            j10 = 0;
        }
        this.N = j10;
        com.google.android.exoplayer2.a0 a0Var = this.P;
        if (a0Var != null) {
            j11 = a0Var.getCurrentPosition();
        }
        this.L = j11;
        X(true);
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
    public final /* synthetic */ void f0(com.google.android.exoplayer2.v vVar) {
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
    public final /* synthetic */ void r(com.google.android.exoplayer2.f0 f0Var) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void s(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void t(w.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void w(float f) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void x(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void y(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(com.google.android.exoplayer2.w wVar, w.c cVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void G(o8.p pVar, z8.h hVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void V(int i6, boolean z10) {
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
