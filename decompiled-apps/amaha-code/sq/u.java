package sq;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.google.android.material.snackbar.Snackbar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DepressionTimeoutTimerFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsq/u;", "Lrr/b;", "Lcom/google/android/exoplayer2/w$d;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b implements w.d, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int K = 0;
    public String A;
    public boolean B;
    public a0 C;
    public AudioFocusRequest D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: v  reason: collision with root package name */
    public a f31920v;

    /* renamed from: z  reason: collision with root package name */
    public int f31924z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31919u = LogHelper.INSTANCE.makeLogTag(u.class);

    /* renamed from: w  reason: collision with root package name */
    public long f31921w = 180000;

    /* renamed from: x  reason: collision with root package name */
    public int f31922x = 44;

    /* renamed from: y  reason: collision with root package name */
    public int f31923y = -1;

    /* compiled from: DepressionTimeoutTimerFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f31925b = 0;

        public a(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            u uVar = u.this;
            uVar.f31921w = 0L;
            ((AppCompatImageView) uVar._$_findCachedViewById(R.id.checkmark)).setVisibility(0);
            ((RobertoButton) uVar._$_findCachedViewById(R.id.startCTA)).setVisibility(0);
            ((RobertoButton) uVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
            ((RobertoTextView) uVar._$_findCachedViewById(R.id.timer)).setVisibility(8);
            ((RobertoTextView) uVar._$_findCachedViewById(R.id.skipPrompt)).setVisibility(8);
            ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).setVisibility(8);
            ((RobertoTextView) uVar._$_findCachedViewById(R.id.header)).setText(uVar.getString(R.string.depressionTimeoutTimerCompletionState));
            ((RobertoButton) uVar._$_findCachedViewById(R.id.startCTA)).setText(uVar.getString(R.string.depressionTimeoutTimerCTA2));
            ((RobertoButton) uVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new s(uVar, 3));
            uVar.O(true);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            u uVar = u.this;
            if (uVar.isAdded()) {
                uVar.f31921w = j10;
                int i6 = uVar.f31922x + 1;
                uVar.f31922x = i6;
                if (i6 == 45) {
                    int i10 = uVar.f31924z;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    String string = uVar.getString(R.string.depressionTimeoutTimerText4);
                                    kotlin.jvm.internal.i.f(string, "getString(R.string.depressionTimeoutTimerText4)");
                                    u.K(uVar, string);
                                    uVar.f31924z = 0;
                                }
                            } else {
                                String string2 = uVar.getString(R.string.depressionTimeoutTimerText3);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.depressionTimeoutTimerText3)");
                                u.K(uVar, string2);
                            }
                        } else {
                            String string3 = uVar.getString(R.string.depressionTimeoutTimerText2);
                            kotlin.jvm.internal.i.f(string3, "getString(R.string.depressionTimeoutTimerText2)");
                            u.K(uVar, string3);
                        }
                    } else {
                        String string4 = uVar.getString(R.string.depressionTimeoutTimerText1);
                        kotlin.jvm.internal.i.f(string4, "getString(R.string.depressionTimeoutTimerText1)");
                        u.K(uVar, string4);
                    }
                    uVar.f31924z++;
                    uVar.f31922x = 0;
                    uVar.f31923y = 10;
                }
                int i11 = uVar.f31923y;
                if (i11 > 0) {
                    uVar.f31923y = i11 - 1;
                }
                if (uVar.f31923y == 0) {
                    uVar.getClass();
                    try {
                        if (uVar.isAdded()) {
                            ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).animate().alpha(0.0f).setDuration(200L).start();
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(uVar.f31919u, e10);
                    }
                }
                long j11 = uVar.f31921w;
                String f = defpackage.d.f(defpackage.b.o(new Object[]{Long.valueOf(j11 / 60000)}, 1, "%02d", "format(format, *args)"), " : ", defpackage.b.o(new Object[]{Long.valueOf((j11 / 1000) % 60)}, 1, "%02d", "format(format, *args)"));
                RobertoTextView robertoTextView = (RobertoTextView) uVar._$_findCachedViewById(R.id.timer);
                if (robertoTextView != null) {
                    robertoTextView.setText(f);
                }
            }
        }
    }

    public static final void K(u uVar, String str) {
        uVar.getClass();
        try {
            if (uVar.isAdded()) {
                ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).setVisibility(0);
                ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).setText(str);
                ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).setAlpha(0.0f);
                ((RobertoTextView) uVar._$_findCachedViewById(R.id.tipText)).animate().alpha(1.0f).setDuration(2000L).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(uVar.f31919u, e10);
        }
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
                AudioFocusRequest audioFocusRequest = this.D;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this);
        }
    }

    public final void M() {
        ((AppCompatImageView) _$_findCachedViewById(R.id.checkmark)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(R.id.skipPrompt)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(R.id.timer)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText(getString(R.string.depressionTimeoutTimerCTA1));
        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionTimeoutTimerHead));
    }

    public final void O(boolean z10) {
        try {
            a0 a0Var = this.C;
            if (a0Var != null && a0Var.isPlaying()) {
                a0 a0Var2 = this.C;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    if (z10) {
                        J();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (P()) {
                a0 a0Var3 = this.C;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                } else {
                    kotlin.jvm.internal.i.q("simpleExoplayer");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31919u, "error in playing audio", e10);
        }
    }

    public final boolean P() {
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
                this.D = build;
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
            LogHelper.INSTANCE.e(this.f31919u, "Exception", e10);
            return false;
        }
    }

    public final void Q() {
        a aVar = new a(this.f31921w);
        this.f31920v = aVar;
        aVar.start();
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        if (i6 != 2) {
            if (i6 == 3 && this.H) {
                this.H = false;
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.loadingProgressBar);
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                Q();
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                if (lottieAnimationView != null) {
                    lottieAnimationView.j();
                    return;
                }
                return;
            }
            return;
        }
        this.H = true;
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(R.id.loadingProgressBar);
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
        a aVar = this.f31920v;
        if (aVar != null) {
            aVar.cancel();
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.g();
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        Object obj;
        a0 a0Var;
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
                                if (this.E && (a0Var = this.C) != null && !a0Var.isPlaying()) {
                                    O(true);
                                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).j();
                                    Q();
                                } else {
                                    a0 a0Var2 = this.C;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.F, 0);
                                    }
                                }
                                this.E = false;
                                return;
                            }
                            return;
                        }
                        this.E = false;
                        this.I = true;
                        O(true);
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
                        a aVar = this.f31920v;
                        if (aVar != null) {
                            aVar.cancel();
                        }
                        ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setVisibility(8);
                        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new s(this, 1));
                        return;
                    }
                    a0 a0Var3 = this.C;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.E = true;
                        O(false);
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
                        a aVar2 = this.f31920v;
                        if (aVar2 != null) {
                            aVar2.cancel();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.F = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31919u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_a30, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            a aVar = this.f31920v;
            if (aVar != null) {
                aVar.cancel();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31919u, "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
        a aVar = this.f31920v;
        if (aVar != null) {
            aVar.cancel();
        }
        a0 a0Var = this.C;
        if (a0Var != null && a0Var.isPlaying()) {
            a0 a0Var2 = this.C;
            if (a0Var2 != null) {
                a0Var2.z(false);
                J();
                return;
            }
            kotlin.jvm.internal.i.q("simpleExoplayer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.G && P() && !this.I) {
            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).j();
            a0 a0Var = this.C;
            if (a0Var != null) {
                a0Var.z(true);
                Q();
                return;
            }
            kotlin.jvm.internal.i.q("simpleExoplayer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.skipPrompt)).setText(getString(R.string.depressionTimeoutTimerSkipCTA));
            M();
            String str = CourseUtilKt.getAudioUrls("").get("timeout_timer");
            this.A = str;
            Utils utils = Utils.INSTANCE;
            kotlin.jvm.internal.i.d(str);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            if (utils.getAudioFilePath(str, context) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B = z10;
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
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setOnClickListener(new s(this, 0));
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            RobertoTextView skipPrompt = (RobertoTextView) _$_findCachedViewById(R.id.skipPrompt);
            kotlin.jvm.internal.i.f(skipPrompt, "skipPrompt");
            insetsUtils.addStatusBarHeight(skipPrompt);
            RobertoTextView tipText = (RobertoTextView) _$_findCachedViewById(R.id.tipText);
            kotlin.jvm.internal.i.f(tipText, "tipText");
            insetsUtils.addStatusBarHeight(tipText);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31919u, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        kotlin.jvm.internal.i.g(error, "error");
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText("RETRY");
        Snackbar.h((ConstraintLayout) _$_findCachedViewById(R.id.a30parent), "Something went wrong. Try again after ensuring you are connected to a fast network and have enough memory on your phone.", -1).i();
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
    public final /* synthetic */ void l0(boolean z10) {
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
    public final /* synthetic */ void w(float f) {
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
