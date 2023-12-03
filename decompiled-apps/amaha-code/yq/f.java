package yq;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
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
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AudioTempActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.MindfullnessModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import com.theinnerhour.b2b.widgets.TemplateCircularSlider;
import f0.t;
import gv.r;
import hs.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.l;
import ss.p;
import ta.v;
import tl.o;
/* compiled from: HappinessMindfulnessDetailFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyq/f;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public AudioFocusRequest B;
    public int C;
    public AudioHelper G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public a0 N;

    /* renamed from: v  reason: collision with root package name */
    public String f38900v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f38901w;

    /* renamed from: x  reason: collision with root package name */
    public MindfullnessModel f38902x;

    /* renamed from: y  reason: collision with root package name */
    public String f38903y;

    /* renamed from: z  reason: collision with root package name */
    public TemplateCircularSlider f38904z;
    public final LinkedHashMap Q = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f38899u = LogHelper.INSTANCE.makeLogTag(f.class);
    public final ArrayList<AnimatorSet> D = new ArrayList<>();
    public final ArrayList<Animator> E = new ArrayList<>();
    public final Handler F = new Handler();
    public double M = 0.001d;
    public final b O = new b();
    public final o P = new o(23, this);

    /* compiled from: HappinessMindfulnessDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TemplateCircularSlider.a {
        public a() {
        }

        @Override // com.theinnerhour.b2b.widgets.TemplateCircularSlider.a
        public final void a(float f) {
            f fVar = f.this;
            a0 a0Var = fVar.N;
            if (a0Var != null) {
                float f2 = f / 360;
                a0Var.f0(((float) fVar.H) * f2);
                RobertoTextView Q = fVar.Q();
                StringBuilder sb2 = new StringBuilder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                sb2.append(timeUnit.toMinutes(((float) fVar.H) * f2));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(((float) fVar.H) * f2);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(f2 * ((float) fVar.H))))}, 1));
                i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(fVar.H));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(fVar.H) - timeUnit2.toSeconds(timeUnit.toMinutes(fVar.H)))}, 1));
                i.f(format2, "format(format, *args)");
                sb2.append(format2);
                Q.setText(sb2.toString());
            }
        }
    }

    /* compiled from: HappinessMindfulnessDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a0 a0Var;
            i.g(context, "context");
            i.g(intent, "intent");
            if (i.b(intent.getAction(), "PLAY_PAUSE")) {
                f fVar = f.this;
                if (fVar.isAdded()) {
                    if (!fVar.K && (((a0Var = fVar.N) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || fVar.I))) {
                        if (!ConnectionStatusReceiver.isConnected()) {
                            fVar.k0(true);
                            return;
                        } else if (ConnectionStatusReceiver.isConnected()) {
                            fVar.k0(false);
                            fVar.U(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    fVar.Z(true);
                }
            }
        }
    }

    /* compiled from: HappinessMindfulnessDetailFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.fragment.mindfulness.HappinessMindfulnessDetailFragment$setupDownload$1", f = "HappinessMindfulnessDetailFragment.kt", l = {511, 512}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f38907u;

        /* compiled from: HappinessMindfulnessDetailFragment.kt */
        @ns.e(c = "com.theinnerhour.b2b.fragment.mindfulness.HappinessMindfulnessDetailFragment$setupDownload$1$1", f = "HappinessMindfulnessDetailFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ f f38909u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f38910v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, int i6, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f38909u = fVar;
                this.f38910v = i6;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f38909u, this.f38910v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                int i6;
                sp.b.d0(obj);
                f fVar = this.f38909u;
                if (fVar.isAdded() && ((RobertoTextView) fVar._$_findCachedViewById(R.id.downloadSize)) != null && (i6 = this.f38910v) > 0) {
                    RobertoTextView robertoTextView = (RobertoTextView) fVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) fVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView2 != null) {
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{new Double(i6 * 9.5367432E-7d)}, 1));
                        i.f(format, "format(format, *args)");
                        robertoTextView2.setText(format.concat("MB"));
                    }
                }
                return k.f19476a;
            }
        }

        public c(ls.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f38907u;
            f fVar = f.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                String str = fVar.f38903y;
                i.d(str);
                this.f38907u = 1;
                obj = f.K(fVar, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            int intValue = ((Number) obj).intValue();
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(fVar, intValue, null);
            this.f38907u = 2;
            if (v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
            return k.f19476a;
        }
    }

    /* compiled from: HappinessMindfulnessDetailFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements l<u.a, k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final k invoke(u.a aVar) {
            boolean z10;
            u.a status = aVar;
            i.g(status, "status");
            if (status == u.a.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
            f fVar = f.this;
            fVar.J = z10;
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5 && fVar.isAdded()) {
                                    Utils.INSTANCE.showCustomToast(fVar.getContext(), "Download Cancelled");
                                }
                            } else if (fVar.isAdded()) {
                                Utils.INSTANCE.showCustomToast(fVar.getContext(), "Download Failed");
                            }
                        } else {
                            if (fVar.isAdded()) {
                                Utils.INSTANCE.showCustomToast(fVar.getContext(), "Download failed. Please check your internet connection.");
                            }
                            ProgressBar progressBar = (ProgressBar) fVar._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar != null) {
                                progressBar.setProgress(0);
                            }
                            ProgressBar progressBar2 = (ProgressBar) fVar._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) fVar._$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            fVar.J = false;
                        }
                    }
                } else if (fVar.isAdded()) {
                    Utils.INSTANCE.showCustomToast(fVar.getContext(), "Download Started");
                }
                return k.f19476a;
            }
            if (fVar.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String str = fVar.f38903y;
                i.d(str);
                Context context = fVar.getContext();
                i.d(context);
                if (utils.getAudioFilePath(str, context) != null) {
                    utils.showCustomToast(fVar.getContext(), "Download Completed");
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) fVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) fVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) fVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) fVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ProgressBar progressBar3 = (ProgressBar) fVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    fVar.K = true;
                    fVar.U(true);
                } else {
                    ProgressBar progressBar4 = (ProgressBar) fVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(0);
                    }
                    ProgressBar progressBar5 = (ProgressBar) fVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar5 != null) {
                        progressBar5.setProgress(0);
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) fVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(f fVar, String str, ls.d dVar) {
        yq.c cVar;
        int i6;
        kotlin.jvm.internal.v vVar;
        fVar.getClass();
        if (dVar instanceof yq.c) {
            cVar = (yq.c) dVar;
            int i10 = cVar.f38895x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f38895x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar.f38893v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = cVar.f38895x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        vVar = cVar.f38892u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f23467u = -1;
                    kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                    yq.d dVar2 = new yq.d(str, vVar2, null);
                    cVar.f38892u = vVar2;
                    cVar.f38895x = 1;
                    if (v.S(bVar, dVar2, cVar) != aVar) {
                        vVar = vVar2;
                    } else {
                        return aVar;
                    }
                }
                return new Integer(vVar.f23467u);
            }
        }
        cVar = new yq.c(fVar, dVar);
        Object obj2 = cVar.f38893v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = cVar.f38895x;
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
                AudioFocusRequest audioFocusRequest = this.B;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this);
        }
    }

    public final void M(boolean z10) {
        try {
            if (z10) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.anim_play_to_pause);
            } else {
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.anim_pause_to_play);
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.play)).getDrawable() instanceof Animatable) {
                Drawable drawable = ((AppCompatImageView) _$_findCachedViewById(R.id.play)).getDrawable();
                i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable) drawable).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "Exception in animate play button", e10);
        }
    }

    public final void O(AppCompatImageView appCompatImageView) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "rotation", appCompatImageView.getRotation(), appCompatImageView.getRotation() + 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(25000L);
        ofFloat.setRepeatCount(-1);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, "scaleX", appCompatImageView.getScaleX(), 1.1f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(6000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(appCompatImageView, "scaleY", appCompatImageView.getScaleY(), 1.1f);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setDuration(6000L);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(2);
        arrayList.add(ofFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.D.add(animatorSet);
    }

    public final void P() {
        boolean z10;
        try {
            Utils utils = Utils.INSTANCE;
            String str = this.f38903y;
            i.d(str);
            Context context = getContext();
            i.d(context);
            if (utils.getAudioFilePath(str, context) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.K = z10;
            if (!z10) {
                if (ConnectionStatusReceiver.isConnected()) {
                    b0();
                }
            } else {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
            U(false);
            ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setOnClickListener(new yq.b(this, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "Exception in check audio", e10);
        }
    }

    public final RobertoTextView Q() {
        RobertoTextView robertoTextView = this.f38901w;
        if (robertoTextView != null) {
            return robertoTextView;
        }
        i.q("audioPlayProgress");
        throw null;
    }

    public final TemplateCircularSlider S() {
        TemplateCircularSlider templateCircularSlider = this.f38904z;
        if (templateCircularSlider != null) {
            return templateCircularSlider;
        }
        i.q("audioProgress");
        throw null;
    }

    public final void U(boolean z10) {
        String str;
        boolean z11;
        try {
            S().setVisibility(0);
            Q().setText("");
            Q().setVisibility(0);
            if (!ConnectionStatusReceiver.isConnected() && !this.K) {
                k0(true);
                return;
            }
            a0 a0Var = this.N;
            if (a0Var == null) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.anim_play_to_pause);
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(0);
            } else if (z10) {
                a0Var.a();
            }
            this.N = new j.b(requireContext()).a();
            if (this.K) {
                Utils utils = Utils.INSTANCE;
                String str2 = this.f38903y;
                i.d(str2);
                Context requireContext = requireContext();
                i.f(requireContext, "requireContext()");
                str = utils.getAudioFilePath(str2, requireContext);
            } else {
                str = this.f38903y;
            }
            q b10 = q.b(Uri.parse(str));
            a0 a0Var2 = this.N;
            if (a0Var2 != null) {
                a0Var2.h0(b10);
                a0 a0Var3 = this.N;
                if (a0Var3 != null) {
                    a0Var3.E(this);
                    a0 a0Var4 = this.N;
                    if (a0Var4 != null) {
                        a0Var4.l();
                        S().setDisableTouch(false);
                        S().setOnSliderMovedListener(new a());
                        a0 a0Var5 = this.N;
                        if (a0Var5 != null) {
                            double d10 = this.M;
                            if (d10 > 0.001d && d10 < 1.0d) {
                                a0Var5.f0((long) (d10 * this.H));
                                Z(true);
                                TemplateCircularSlider S = S();
                                S.f11848u = true;
                                S.invalidate();
                                return;
                            }
                        }
                        if (this.M == 0.001d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Y(false);
                        }
                        TemplateCircularSlider S2 = S();
                        S2.f11848u = true;
                        S2.invalidate();
                        return;
                    }
                    i.q("simpleExoplayer");
                    throw null;
                }
                i.q("simpleExoplayer");
                throw null;
            }
            i.q("simpleExoplayer");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in initialising audio", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        j0();
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    this.M = 0.001d;
                    U(false);
                    h0(false);
                    h0(false);
                    return;
                }
                return;
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            a0 a0Var = this.N;
            if (a0Var != null) {
                this.H = a0Var.getDuration();
                S().setVisibility(0);
                Q().setVisibility(0);
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setClickable(true);
                }
                S().setDisableTouch(false);
                return;
            }
            i.q("simpleExoplayer");
            throw null;
        }
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.play);
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
    }

    public final void X(AppCompatImageView appCompatImageView) {
        appCompatImageView.setPivotY(appCompatImageView.getWidth() * 3.0f);
        ArrayList<Animator> arrayList = this.E;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "rotation", appCompatImageView.getRotation(), appCompatImageView.getRotation() + 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration((new Random().nextInt(3) * 1000) + 2000);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        arrayList.add(ofFloat);
    }

    public final void Y(boolean z10) {
        if (z10) {
            try {
                J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
                return;
            }
        }
        M(false);
        this.F.removeCallbacksAndMessages(null);
        g0();
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        }
        MindfullnessModel mindfullnessModel = this.f38902x;
        if (mindfullnessModel != null) {
            bundle.putString(Constants.GOAL_ID, mindfullnessModel.getId());
            bundle.putString(Constants.GOAL_NAME, mindfullnessModel.getTitle());
        }
        bundle.putBoolean("isStreaming", !this.K);
        gk.a.b(bundle, "activity_audio_pause");
    }

    public final void Z(boolean z10) {
        try {
            a0 a0Var = this.N;
            if (a0Var != null && a0Var.isPlaying()) {
                a0 a0Var2 = this.N;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    Y(z10);
                    h0(false);
                    return;
                }
                i.q("simpleExoplayer");
                throw null;
            } else if (a0()) {
                a0 a0Var3 = this.N;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    h0(true);
                    M(true);
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    MindfullnessModel mindfullnessModel = this.f38902x;
                    if (mindfullnessModel != null) {
                        bundle.putString(Constants.GOAL_ID, mindfullnessModel.getId());
                        bundle.putString(Constants.GOAL_NAME, mindfullnessModel.getTitle());
                    }
                    bundle.putBoolean("isStreaming", true ^ this.K);
                    gk.a.b(bundle, "activity_audio_play");
                    return;
                }
                i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "error in playing audio", e10);
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

    public final boolean a0() {
        Object obj;
        int requestAudioFocus;
        try {
            androidx.fragment.app.p activity = getActivity();
            if (activity != null) {
                obj = activity.getSystemService("audio");
            } else {
                obj = null;
            }
            i.e(obj, "null cannot be cast to non-null type android.media.AudioManager");
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
                this.B = build;
                i.d(build);
                requestAudioFocus = audioManager.requestAudioFocus(build);
            } else {
                requestAudioFocus = audioManager.requestAudioFocus(this, 3, 1);
            }
            if (requestAudioFocus != 1) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "Exception", e10);
            return false;
        }
    }

    public final void b0() {
        if (ConnectionStatusReceiver.isConnected() && this.f38903y != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new c(null), 3);
        }
        Context context = getContext();
        i.d(context);
        String str = this.f38903y;
        i.d(str);
        AudioHelper audioHelper = new AudioHelper(context, str);
        this.G = audioHelper;
        audioHelper.registerDownloadReceivers();
        AudioHelper audioHelper2 = this.G;
        if (audioHelper2 != null) {
            audioHelper2.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.G;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new pp.b(9, new e(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new yq.b(this, 3));
                }
                this.L = true;
                return;
            }
            i.q("audioHelper");
            throw null;
        }
        i.q("audioHelper");
        throw null;
    }

    public final void c0() {
        try {
            this.D.clear();
            AppCompatImageView imageView1 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView1);
            i.f(imageView1, "imageView1");
            O(imageView1);
            AppCompatImageView imageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView2);
            i.f(imageView2, "imageView2");
            O(imageView2);
            AppCompatImageView imageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView3);
            i.f(imageView3, "imageView3");
            O(imageView3);
            this.E.clear();
            AppCompatImageView imageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView4);
            i.f(imageView4, "imageView4");
            X(imageView4);
            AppCompatImageView imageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView5);
            i.f(imageView5, "imageView5");
            X(imageView5);
            AppCompatImageView imageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView6);
            i.f(imageView6, "imageView6");
            X(imageView6);
            AppCompatImageView imageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView7);
            i.f(imageView7, "imageView7");
            X(imageView7);
            AppCompatImageView imageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView8);
            i.f(imageView8, "imageView8");
            X(imageView8);
            AppCompatImageView imageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView9);
            i.f(imageView9, "imageView9");
            X(imageView9);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
        }
    }

    public final void g0() {
        try {
            for (AnimatorSet animatorSet : this.D) {
                animatorSet.cancel();
            }
            for (Animator animator : this.E) {
                animator.cancel();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
        }
    }

    public final void h0(boolean z10) {
        int i6;
        int i10;
        int i11;
        try {
            Intent intent = new Intent();
            intent.setAction("PLAY_PAUSE");
            androidx.fragment.app.p activity = getActivity();
            int i12 = Build.VERSION.SDK_INT;
            int i13 = 134217728;
            if (i12 >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(activity, 13130, intent, i6);
            Intent intent2 = new Intent(getActivity(), AudioTempActivity.class);
            intent2.setFlags(4194304);
            intent2.putExtra("audio_click", true);
            intent2.setAction(Long.toString(Calendar.getInstance().getTimeInMillis()));
            androidx.fragment.app.p activity2 = getActivity();
            if (i12 >= 23) {
                i13 = 201326592;
            }
            PendingIntent activity3 = PendingIntent.getActivity(activity2, 0, intent2, i13);
            androidx.fragment.app.p activity4 = getActivity();
            i.d(activity4);
            Object systemService = activity4.getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i12 >= 26) {
                i10 = 4;
                NotificationChannel notificationChannel = new NotificationChannel("audio_channel", "Audio", 4);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                i10 = 2;
            }
            Context context = getContext();
            i.d(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_custom_audio);
            MindfullnessModel mindfullnessModel = this.f38902x;
            i.d(mindfullnessModel);
            remoteViews.setTextViewText(R.id.notificationCustomCourse, mindfullnessModel.getTitle());
            int i14 = R.drawable.ic_play_png;
            if (z10) {
                i11 = R.drawable.ic_pause_png;
            } else {
                i11 = R.drawable.ic_play_png;
            }
            remoteViews.setImageViewResource(R.id.notificationCustomButton, i11);
            remoteViews.setOnClickPendingIntent(R.id.notificationCustomButton, broadcast);
            androidx.fragment.app.p activity5 = getActivity();
            i.d(activity5);
            t tVar = new t(activity5.getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            androidx.fragment.app.p activity6 = getActivity();
            i.d(activity6);
            tVar.h(BitmapFactory.decodeResource(activity6.getResources(), R.drawable.ic_amaha_logo));
            a0 a0Var = this.N;
            if (a0Var != null && a0Var.isPlaying()) {
                i14 = R.drawable.ic_pause_png;
            }
            tVar.a(i14, "", broadcast);
            MindfullnessModel mindfullnessModel2 = this.f38902x;
            i.d(mindfullnessModel2);
            tVar.e(mindfullnessModel2.getTitle());
            tVar.g(16, false);
            tVar.f(2);
            tVar.f14665j = i10;
            tVar.g(8, true);
            tVar.f14679y = remoteViews;
            tVar.f14662g = activity3;
            if (z10) {
                tVar.g(2, true);
            } else {
                tVar.g(2, false);
            }
            String MANUFACTURER = Build.MANUFACTURER;
            i.f(MANUFACTURER, "MANUFACTURER");
            Locale locale = Locale.getDefault();
            i.f(locale, "getDefault()");
            String lowerCase = MANUFACTURER.toLowerCase(locale);
            i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!r.J0(lowerCase, "huawei") || i12 > 22) {
                p1.b bVar = new p1.b();
                bVar.f27867e = new int[]{0};
                tVar.j(bVar);
            }
            Notification b10 = tVar.b();
            i.f(b10, "notificationBuilder.build()");
            notificationManager.notify(Constants.AUDIO_NOTIFICATION_ID, b10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
        }
    }

    public final void j0() {
        int i6;
        long j10;
        if (isAdded()) {
            a0 a0Var = this.N;
            if (a0Var != null) {
                j10 = a0Var.getCurrentPosition();
            } else {
                j10 = 0;
            }
            double d10 = j10 / this.H;
            if (d10 <= 0.0d) {
                d10 = 0.001d;
            }
            this.M = d10;
            if (!S().Q) {
                if (this.M >= 1.0d) {
                    S().setPercentage(0.001d);
                } else {
                    S().setPercentage(this.M);
                }
                RobertoTextView Q = Q();
                StringBuilder sb2 = new StringBuilder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                sb2.append(timeUnit.toMinutes(j10));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(j10);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(j10)))}, 1));
                i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(this.H));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(this.H) - timeUnit2.toSeconds(timeUnit.toMinutes(this.H)))}, 1));
                i.f(format2, "format(format, *args)");
                sb2.append(format2);
                Q.setText(sb2.toString());
            }
        }
        Handler handler = this.F;
        o oVar = this.P;
        handler.removeCallbacks(oVar);
        a0 a0Var2 = this.N;
        if (a0Var2 != null) {
            i6 = a0Var2.p();
        } else {
            i6 = 1;
        }
        if (i6 != 1 && i6 != 4) {
            handler.postDelayed(oVar, 200L);
        }
    }

    public final void k0(boolean z10) {
        try {
            if (isAdded()) {
                ((ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(8);
                this.I = z10;
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = getActivity();
                    i.d(activity);
                    String string = getString(R.string.no_internet_msg);
                    i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(activity, string);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.ic_replay_black_24dp);
                    if (this.M <= 0.001d) {
                        Q().setText("Retry");
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                    Q().setVisibility(0);
                } else if (!this.L && !this.K) {
                    b0();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10) {
            h0(true);
            c0();
            return;
        }
        h0(false);
        g0();
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
                                if (this.A && (a0Var = this.N) != null && !a0Var.isPlaying()) {
                                    Z(true);
                                } else {
                                    a0 a0Var2 = this.N;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.C, 0);
                                    }
                                }
                                this.A = false;
                                return;
                            }
                            return;
                        }
                        this.A = false;
                        Z(true);
                        return;
                    }
                    a0 a0Var3 = this.N;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.A = true;
                        Z(false);
                        return;
                    }
                    return;
                }
                this.C = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f38899u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PLAY_PAUSE");
        androidx.fragment.app.p activity = getActivity();
        i.d(activity);
        activity.registerReceiver(this.O, intentFilter);
        MyApplication.V.a().F = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_happiness_mindfullness_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            MyApplication.V.a().F = false;
            AudioHelper audioHelper = this.G;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.G;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    i.q("audioHelper");
                    throw null;
                }
            }
            androidx.fragment.app.p activity = getActivity();
            i.d(activity);
            activity.unregisterReceiver(this.O);
            androidx.fragment.app.p activity2 = getActivity();
            i.d(activity2);
            Object systemService = activity2.getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            a0 a0Var = this.N;
            if (a0Var != null) {
                a0Var.a();
            }
            this.F.removeCallbacksAndMessages(null);
            J();
        } catch (Exception e10) {
            e10.printStackTrace();
            LogHelper.INSTANCE.e("stressrelaxing", "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            a0 a0Var = this.N;
            if (a0Var != null && a0Var.isPlaying()) {
                g0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onpause", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            a0 a0Var = this.N;
            if (a0Var != null && a0Var.isPlaying()) {
                c0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onResume", e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(2:4|(2:6|(2:8|9))(1:130))|10|11|(2:13|(14:15|16|(3:91|92|(2:97|(2:102|(2:107|(2:112|(13:117|(2:123|(11:125|(1:127)(1:128)|22|(1:90)(1:26)|27|28|29|(2:31|32)|82|83|85))(1:121)|122|22|(1:24)|90|27|28|29|(0)|82|83|85)(1:116))(1:111))(1:106))(1:101))(1:96))(1:20)|21|22|(0)|90|27|28|29|(0)|82|83|85))|129|22|(0)|90|27|28|29|(0)|82|83|85) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0358, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0359, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0254 A[Catch: Exception -> 0x0362, TryCatch #1 {Exception -> 0x0362, blocks: (B:3:0x001b, B:4:0x007a, B:6:0x0080, B:8:0x0090, B:9:0x0092, B:12:0x00c8, B:14:0x00d5, B:17:0x0108, B:19:0x010e, B:60:0x0211, B:62:0x0254, B:66:0x025d, B:123:0x035e, B:122:0x0359, B:21:0x011d, B:24:0x012b, B:26:0x0131, B:27:0x013c, B:29:0x0148, B:31:0x0150, B:32:0x015b, B:34:0x0167, B:36:0x016f, B:37:0x017c, B:39:0x0186, B:41:0x018c, B:42:0x019c, B:44:0x01a6, B:46:0x01ae, B:47:0x01be, B:49:0x01ca, B:51:0x01d2, B:52:0x01e3, B:54:0x01f1, B:56:0x01f9, B:67:0x0260, B:69:0x0268, B:70:0x026c, B:72:0x0271, B:75:0x0279, B:76:0x0285, B:79:0x028f, B:80:0x029b, B:83:0x02a3, B:84:0x02ad, B:87:0x02b5, B:88:0x02c1, B:91:0x02cb, B:92:0x02d7, B:95:0x02e1, B:96:0x02ed, B:99:0x02f5, B:100:0x02fe, B:103:0x0305, B:104:0x0310, B:107:0x0317, B:108:0x0322, B:111:0x0329, B:112:0x0332, B:115:0x0339, B:116:0x0344, B:119:0x034d), top: B:131:0x001b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0268 A[Catch: Exception -> 0x0358, TryCatch #0 {Exception -> 0x0358, blocks: (B:67:0x0260, B:69:0x0268, B:70:0x026c, B:72:0x0271, B:75:0x0279, B:76:0x0285, B:79:0x028f, B:80:0x029b, B:83:0x02a3, B:84:0x02ad, B:87:0x02b5, B:88:0x02c1, B:91:0x02cb, B:92:0x02d7, B:95:0x02e1, B:96:0x02ed, B:99:0x02f5, B:100:0x02fe, B:103:0x0305, B:104:0x0310, B:107:0x0317, B:108:0x0322, B:111:0x0329, B:112:0x0332, B:115:0x0339, B:116:0x0344, B:119:0x034d), top: B:129:0x0260, outer: #1 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String str;
        String str2;
        MindfullnessModel mindfullnessModel;
        String str3;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            View findViewById = view.findViewById(R.id.audioProgress);
            i.f(findViewById, "view.findViewById(R.id.audioProgress)");
            this.f38904z = (TemplateCircularSlider) findViewById;
            View findViewById2 = view.findViewById(R.id.audioPlayProgress);
            i.f(findViewById2, "view.findViewById(R.id.audioPlayProgress)");
            this.f38901w = (RobertoTextView) findViewById2;
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setText("Proceed");
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setOnClickListener(new yq.b(this, 0));
            Bundle arguments = getArguments();
            i.d(arguments);
            i.f(arguments.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(TEMPLATE_TITLE_KEY,\"\")");
            Bundle arguments2 = getArguments();
            i.d(arguments2);
            String string = arguments2.getString("mindfulness_model", "walking-meditation");
            Iterator<MindfullnessModel> it = g.J().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MindfullnessModel next = it.next();
                if (i.b(next.getId(), string)) {
                    this.f38902x = next;
                    break;
                }
            }
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (getArguments() != null) {
                Bundle arguments3 = getArguments();
                i.d(arguments3);
                if (arguments3.containsKey(Constants.API_COURSE_LINK)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setVisibility(4);
                    Bundle arguments4 = getArguments();
                    i.d(arguments4);
                    String string2 = arguments4.getString(Constants.API_COURSE_LINK);
                    if (i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && i.b(string2, Constants.SCREEN_T2A)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION, "Focussed Meditation", R.drawable.deep_breathing, "Focussed Meditation");
                    } else if (i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && i.b(string2, Constants.SCREEN_T2A)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING, "Alternate Breathing", R.drawable.deep_breathing, "Alternate Breathing");
                    } else if (i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && i.b(string2, Constants.GROUNDING)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING, "Grounding", R.drawable.deep_breathing, "Grounding");
                    } else if (i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && i.b(string2, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING, "Breathing Space", R.drawable.deep_breathing, "Alternate Breathing");
                    } else if (i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && i.b(string2, Constants.HUMMING)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING, "Humming Meditation", R.drawable.deep_breathing, "Humming Meditation");
                    } else if (i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && i.b(string2, Constants.TOE_TENSING)) {
                        this.f38902x = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING, "Toe Tensing", R.drawable.deep_breathing, "Toe Tensing");
                    } else {
                        if (i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && i.b(string2, Constants.GROUNDING_LOWER_BODY)) {
                            str2 = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY;
                            this.f38902x = new MindfullnessModel(str2, "Lower Body Grounding", R.drawable.deep_breathing, "Lower Body Grounding");
                        } else {
                            str2 = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY;
                            if (i.b(courseById.getCourseName(), Constants.COURSE_WORRY)) {
                                obj = Constants.FOCUSSED_ATTENTION_MEDITATION;
                                if (i.b(string2, obj)) {
                                    str = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
                                    this.f38902x = new MindfullnessModel(str, "Focussed Meditation", R.drawable.deep_breathing, "Focussed Meditation");
                                } else {
                                    str = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
                                }
                                ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new yq.b(this, 1));
                                ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setOnClickListener(new nn.g(23, this, string, courseById));
                                Bundle arguments5 = getArguments();
                                i.d(arguments5);
                                this.f38900v = arguments5.getString("mindfulness_model");
                                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.title);
                                mindfullnessModel = this.f38902x;
                                if (mindfullnessModel != null || (r3 = mindfullnessModel.getTitle()) == null) {
                                    String str4 = "";
                                }
                                robertoTextView.setText(str4);
                                LinkedHashMap<String, String> audioUrls = CourseUtilKt.getAudioUrls("");
                                str3 = this.f38900v;
                                if (str3 != null) {
                                    switch (str3.hashCode()) {
                                        case -1585062350:
                                            if (!str3.equals("walking-meditation")) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("mindful_walking");
                                                break;
                                            }
                                        case -1436475358:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("grounding_meditation");
                                                break;
                                            }
                                        case -867453782:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get(obj);
                                                break;
                                            }
                                        case -832192788:
                                            if (!str3.equals(str2)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("lower_body_grounding");
                                                break;
                                            }
                                        case -776707106:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("breathing_space");
                                                break;
                                            }
                                        case -286686113:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get(Constants.HUMMING);
                                                break;
                                            }
                                        case -99498499:
                                            if (!str3.equals("thought-difusion")) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("thought_diffusion");
                                                break;
                                            }
                                        case 29957089:
                                            if (!str3.equals(Constants.DEEP_BREATHING_ID)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("deep_breathing");
                                                break;
                                            }
                                        case 281891913:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("alternate_nostril_breathing");
                                                break;
                                            }
                                        case 501768308:
                                            if (!str3.equals(str)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get(obj);
                                                break;
                                            }
                                        case 979756637:
                                            if (!str3.equals("mindful-appreciation")) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get("self_compassion");
                                                break;
                                            }
                                        case 2037692595:
                                            if (!str3.equals(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING)) {
                                                break;
                                            } else {
                                                this.f38903y = audioUrls.get(Constants.TOE_TENSING);
                                                break;
                                            }
                                    }
                                }
                                P();
                            }
                        }
                        str = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
                        obj = Constants.FOCUSSED_ATTENTION_MEDITATION;
                        ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new yq.b(this, 1));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setOnClickListener(new nn.g(23, this, string, courseById));
                        Bundle arguments52 = getArguments();
                        i.d(arguments52);
                        this.f38900v = arguments52.getString("mindfulness_model");
                        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.title);
                        mindfullnessModel = this.f38902x;
                        if (mindfullnessModel != null) {
                        }
                        String str42 = "";
                        robertoTextView2.setText(str42);
                        LinkedHashMap<String, String> audioUrls2 = CourseUtilKt.getAudioUrls("");
                        str3 = this.f38900v;
                        if (str3 != null) {
                        }
                        P();
                    }
                    str = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
                    obj = Constants.FOCUSSED_ATTENTION_MEDITATION;
                    str2 = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY;
                    ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new yq.b(this, 1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setOnClickListener(new nn.g(23, this, string, courseById));
                    Bundle arguments522 = getArguments();
                    i.d(arguments522);
                    this.f38900v = arguments522.getString("mindfulness_model");
                    RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.title);
                    mindfullnessModel = this.f38902x;
                    if (mindfullnessModel != null) {
                    }
                    String str422 = "";
                    robertoTextView22.setText(str422);
                    LinkedHashMap<String, String> audioUrls22 = CourseUtilKt.getAudioUrls("");
                    str3 = this.f38900v;
                    if (str3 != null) {
                    }
                    P();
                }
            }
            obj = Constants.FOCUSSED_ATTENTION_MEDITATION;
            str = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
            str2 = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY;
            ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new yq.b(this, 1));
            ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setOnClickListener(new nn.g(23, this, string, courseById));
            Bundle arguments5222 = getArguments();
            i.d(arguments5222);
            this.f38900v = arguments5222.getString("mindfulness_model");
            RobertoTextView robertoTextView222 = (RobertoTextView) _$_findCachedViewById(R.id.title);
            mindfullnessModel = this.f38902x;
            if (mindfullnessModel != null) {
            }
            String str4222 = "";
            robertoTextView222.setText(str4222);
            LinkedHashMap<String, String> audioUrls222 = CourseUtilKt.getAudioUrls("");
            str3 = this.f38900v;
            if (str3 != null) {
            }
            P();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        i.g(error, "error");
        k0(true);
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
    public final /* synthetic */ void R(q qVar, int i6) {
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
