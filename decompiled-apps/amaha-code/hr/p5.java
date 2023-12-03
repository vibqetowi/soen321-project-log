package hr;

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
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AudioTempActivity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.service.AudioNotificationDismissService;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import com.theinnerhour.b2b.widgets.TemplateCircularSlider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ScreenS13AudioFileFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhr/p5;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p5 extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {
    public static final /* synthetic */ int P = 0;
    public AudioHelper D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public com.google.android.exoplayer2.a0 L;

    /* renamed from: v  reason: collision with root package name */
    public String f18960v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18961w;

    /* renamed from: x  reason: collision with root package name */
    public AudioFocusRequest f18962x;

    /* renamed from: y  reason: collision with root package name */
    public int f18963y;
    public final LinkedHashMap O = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18959u = LogHelper.INSTANCE.makeLogTag(p5.class);

    /* renamed from: z  reason: collision with root package name */
    public String f18964z = "";
    public final ArrayList<AnimatorSet> A = new ArrayList<>();
    public final ArrayList<Animator> B = new ArrayList<>();
    public final Handler C = new Handler();
    public double K = 0.001d;
    public final b M = new b();
    public final tl.o N = new tl.o(26, this);

    /* compiled from: ScreenS13AudioFileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TemplateCircularSlider.a {
        public a() {
        }

        @Override // com.theinnerhour.b2b.widgets.TemplateCircularSlider.a
        public final void a(float f) {
            CharSequence charSequence;
            String str;
            String str2;
            CharSequence text;
            p5 p5Var = p5.this;
            com.google.android.exoplayer2.a0 a0Var = p5Var.L;
            if (a0Var != null) {
                float f2 = f / 360;
                a0Var.f0(((float) p5Var.E) * f2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long minutes = timeUnit.toMinutes(((float) p5Var.E) * f2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(timeUnit.toMinutes(((float) p5Var.E) * f2));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(((float) p5Var.E) * f2);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(f2 * ((float) p5Var.E))))}, 1));
                kotlin.jvm.internal.i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(p5Var.E));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(p5Var.E) - timeUnit2.toSeconds(timeUnit.toMinutes(p5Var.E)))}, 1));
                kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                sb2.append(format2);
                ((RobertoTextView) p5Var._$_findCachedViewById(R.id.audioPlayProgress)).setText(sb2.toString());
                long j10 = p5Var.J;
                if (minutes > j10) {
                    long j11 = minutes - j10;
                    p5Var.J = minutes;
                    StatPersistence statPersistence = StatPersistence.INSTANCE;
                    String str3 = p5Var.f18960v;
                    RobertoTextView robertoTextView = (RobertoTextView) p5Var._$_findCachedViewById(R.id.title);
                    if (robertoTextView != null) {
                        charSequence = robertoTextView.getText();
                    } else {
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        RobertoTextView robertoTextView2 = (RobertoTextView) p5Var._$_findCachedViewById(R.id.title);
                        if (robertoTextView2 != null && (text = robertoTextView2.getText()) != null) {
                            str = text.toString();
                        } else {
                            str2 = null;
                            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                            statPersistence.addOrIncrementAudioMinutes(str3, str2, j11, currentCourseName);
                        }
                    } else {
                        str = "";
                    }
                    str2 = str;
                    String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName2, "getInstance().user.currentCourseName");
                    statPersistence.addOrIncrementAudioMinutes(str3, str2, j11, currentCourseName2);
                }
            }
        }
    }

    /* compiled from: ScreenS13AudioFileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            com.google.android.exoplayer2.a0 a0Var;
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            if (kotlin.jvm.internal.i.b(intent.getAction(), "PLAY_PAUSE")) {
                p5 p5Var = p5.this;
                if (p5Var.isAdded()) {
                    if (!p5Var.H && (((a0Var = p5Var.L) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || p5Var.F))) {
                        if (!ConnectionStatusReceiver.isConnected()) {
                            p5Var.h0(true);
                            return;
                        } else if (ConnectionStatusReceiver.isConnected()) {
                            p5Var.h0(false);
                            ((ProgressBar) p5Var._$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(0);
                            p5Var.Q(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    p5Var.X(true);
                }
            }
        }
    }

    /* compiled from: ScreenS13AudioFileFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS13AudioFileFragment$setupDownload$1", f = "ScreenS13AudioFileFragment.kt", l = {162, 163}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f18967u;

        /* compiled from: ScreenS13AudioFileFragment.kt */
        @ns.e(c = "com.theinnerhour.b2b.fragment.templateScreens.ScreenS13AudioFileFragment$setupDownload$1$1", f = "ScreenS13AudioFileFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ p5 f18969u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f18970v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p5 p5Var, int i6, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f18969u = p5Var;
                this.f18970v = i6;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f18969u, this.f18970v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                int i6;
                sp.b.d0(obj);
                p5 p5Var = this.f18969u;
                if (p5Var.isAdded() && ((RobertoTextView) p5Var._$_findCachedViewById(R.id.downloadSize)) != null && (i6 = this.f18970v) > 0) {
                    RobertoTextView robertoTextView = (RobertoTextView) p5Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) p5Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView2 != null) {
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{new Double(i6 * 9.5367432E-7d)}, 1));
                        kotlin.jvm.internal.i.f(format, "format(format, *args)");
                        robertoTextView2.setText(format.concat("MB"));
                    }
                }
                return hs.k.f19476a;
            }
        }

        public c(ls.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f18967u;
            p5 p5Var = p5.this;
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
                String str = p5Var.f18960v;
                kotlin.jvm.internal.i.d(str);
                this.f18967u = 1;
                obj = p5.K(p5Var, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            int intValue = ((Number) obj).intValue();
            kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
            kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(p5Var, intValue, null);
            this.f18967u = 2;
            if (ta.v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ScreenS13AudioFileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<u.a, hs.k> {
        public d() {
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
            p5 p5Var = p5.this;
            p5Var.G = z10;
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5 && p5Var.isAdded()) {
                                    Utils.INSTANCE.showCustomToast(p5Var.getContext(), "Download Cancelled");
                                }
                            } else if (p5Var.isAdded()) {
                                Utils.INSTANCE.showCustomToast(p5Var.getContext(), "Download Failed");
                            }
                        } else {
                            if (p5Var.isAdded()) {
                                Utils.INSTANCE.showCustomToast(p5Var.getContext(), "Download failed. Please check your internet connection.");
                            }
                            ProgressBar progressBar = (ProgressBar) p5Var._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar != null) {
                                progressBar.setProgress(0);
                            }
                            ProgressBar progressBar2 = (ProgressBar) p5Var._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) p5Var._$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            p5Var.G = false;
                        }
                    }
                } else if (p5Var.isAdded()) {
                    Utils.INSTANCE.showCustomToast(p5Var.getContext(), "Download Started");
                }
                return hs.k.f19476a;
            }
            if (p5Var.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String str = p5Var.f18960v;
                kotlin.jvm.internal.i.d(str);
                Context context = p5Var.getContext();
                kotlin.jvm.internal.i.d(context);
                if (utils.getAudioFilePath(str, context) != null) {
                    utils.showCustomToast(p5Var.getContext(), "Download Completed");
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) p5Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) p5Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) p5Var._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) p5Var._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ProgressBar progressBar3 = (ProgressBar) p5Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    p5Var.H = true;
                    p5Var.Q(true);
                } else {
                    ProgressBar progressBar4 = (ProgressBar) p5Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(0);
                    }
                    ProgressBar progressBar5 = (ProgressBar) p5Var._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar5 != null) {
                        progressBar5.setProgress(0);
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) p5Var._$_findCachedViewById(R.id.downloadBtn);
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
    public static final Object K(p5 p5Var, String str, ls.d dVar) {
        m5 m5Var;
        int i6;
        kotlin.jvm.internal.v vVar;
        p5Var.getClass();
        if (dVar instanceof m5) {
            m5Var = (m5) dVar;
            int i10 = m5Var.f18840x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m5Var.f18840x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = m5Var.f18838v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = m5Var.f18840x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        vVar = m5Var.f18837u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f23467u = -1;
                    kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                    n5 n5Var = new n5(str, vVar2, null);
                    m5Var.f18837u = vVar2;
                    m5Var.f18840x = 1;
                    if (ta.v.S(bVar, n5Var, m5Var) != aVar) {
                        vVar = vVar2;
                    } else {
                        return aVar;
                    }
                }
                return new Integer(vVar.f23467u);
            }
        }
        m5Var = new m5(p5Var, dVar);
        Object obj2 = m5Var.f18838v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = m5Var.f18840x;
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
                AudioFocusRequest audioFocusRequest = this.f18962x;
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
                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable) drawable).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "Exception in animate play button", e10);
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
        this.A.add(animatorSet);
    }

    public final void P() {
        boolean z10;
        try {
            Utils utils = Utils.INSTANCE;
            String str = this.f18960v;
            kotlin.jvm.internal.i.d(str);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            if (utils.getAudioFilePath(str, context) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            if (!z10) {
                if (ConnectionStatusReceiver.isConnected()) {
                    Z();
                }
            } else {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
            Q(false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "Exception in check audio", e10);
        }
    }

    public final void Q(boolean z10) {
        String str;
        boolean z11;
        try {
            ((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText("");
            ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setVisibility(0);
            if (!ConnectionStatusReceiver.isConnected() && !this.H) {
                h0(true);
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setOnClickListener(new l5(this, 0));
                return;
            }
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var == null) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.anim_play_to_pause);
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.btnS13Button)).setVisibility(0);
            } else if (z10) {
                a0Var.a();
            }
            this.L = new j.b(requireContext()).a();
            if (this.H) {
                Utils utils = Utils.INSTANCE;
                String str2 = this.f18960v;
                kotlin.jvm.internal.i.d(str2);
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                str = utils.getAudioFilePath(str2, requireContext);
            } else {
                str = this.f18960v;
            }
            com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(Uri.parse(str));
            com.google.android.exoplayer2.a0 a0Var2 = this.L;
            if (a0Var2 != null) {
                a0Var2.h0(b10);
                com.google.android.exoplayer2.a0 a0Var3 = this.L;
                if (a0Var3 != null) {
                    a0Var3.E(this);
                    com.google.android.exoplayer2.a0 a0Var4 = this.L;
                    if (a0Var4 != null) {
                        a0Var4.l();
                        ((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).setDisableTouch(false);
                        ((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).setOnSliderMovedListener(new a());
                        com.google.android.exoplayer2.a0 a0Var5 = this.L;
                        if (a0Var5 != null) {
                            double d10 = this.K;
                            if (d10 > 0.001d && d10 < 1.0d) {
                                a0Var5.f0((long) (d10 * this.E));
                                X(true);
                                UiUtils.Companion companion = UiUtils.Companion;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                                kotlin.jvm.internal.i.e(appCompatImageView, "null cannot be cast to non-null type android.widget.ImageView");
                                companion.increaseImageClickArea(appCompatImageView);
                                TemplateCircularSlider templateCircularSlider = (TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading);
                                templateCircularSlider.f11848u = true;
                                templateCircularSlider.invalidate();
                                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setOnClickListener(new l5(this, 0));
                                return;
                            }
                        }
                        if (this.K == 0.001d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            U(false);
                        }
                        UiUtils.Companion companion2 = UiUtils.Companion;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                        kotlin.jvm.internal.i.e(appCompatImageView2, "null cannot be cast to non-null type android.widget.ImageView");
                        companion2.increaseImageClickArea(appCompatImageView2);
                        TemplateCircularSlider templateCircularSlider2 = (TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading);
                        templateCircularSlider2.f11848u = true;
                        templateCircularSlider2.invalidate();
                        ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setOnClickListener(new l5(this, 0));
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "error in initialising audio", e10);
        }
    }

    public final void S(AppCompatImageView appCompatImageView) {
        appCompatImageView.setPivotY(appCompatImageView.getWidth() * 3.0f);
        ArrayList<Animator> arrayList = this.B;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "rotation", appCompatImageView.getRotation(), appCompatImageView.getRotation() + 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration((new Random().nextInt(3) * 1000) + 2000);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        arrayList.add(ofFloat);
    }

    public final void U(boolean z10) {
        if (z10) {
            try {
                J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
                return;
            }
        }
        M(false);
        this.C.removeCallbacksAndMessages(null);
        b0();
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        }
        bundle.putBoolean("isStreaming", !this.H);
        gk.a.b(bundle, "activity_audio_pause");
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        g0();
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    this.J = 0L;
                    this.K = 0.001d;
                    Q(false);
                    c0(false);
                    c0(false);
                    return;
                }
                return;
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null) {
                this.E = a0Var.getDuration();
                TemplateCircularSlider templateCircularSlider = (TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading);
                if (templateCircularSlider != null) {
                    templateCircularSlider.setVisibility(0);
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.play);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setClickable(true);
                }
                TemplateCircularSlider templateCircularSlider2 = (TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading);
                if (templateCircularSlider2 != null) {
                    templateCircularSlider2.setDisableTouch(false);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.q("simpleExoplayer");
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

    public final void X(boolean z10) {
        try {
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null && a0Var.isPlaying()) {
                com.google.android.exoplayer2.a0 a0Var2 = this.L;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    U(z10);
                    c0(false);
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (Y()) {
                com.google.android.exoplayer2.a0 a0Var3 = this.L;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    c0(true);
                    M(true);
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    bundle.putBoolean("isStreaming", true ^ this.H);
                    gk.a.b(bundle, "activity_audio_play");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "error in playing audio", e10);
        }
    }

    public final boolean Y() {
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
                this.f18962x = build;
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
            LogHelper.INSTANCE.e(this.f18959u, "Exception", e10);
            return false;
        }
    }

    public final void Z() {
        if (ConnectionStatusReceiver.isConnected() && this.f18960v != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new c(null), 3);
        }
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        String str = this.f18960v;
        kotlin.jvm.internal.i.d(str);
        AudioHelper audioHelper = new AudioHelper(context, str);
        this.D = audioHelper;
        audioHelper.registerDownloadReceivers();
        AudioHelper audioHelper2 = this.D;
        if (audioHelper2 != null) {
            audioHelper2.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.D;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new r3(15, new o5(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new l5(this, 1));
                }
                this.I = true;
                return;
            }
            kotlin.jvm.internal.i.q("audioHelper");
            throw null;
        }
        kotlin.jvm.internal.i.q("audioHelper");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.O;
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

    public final void a0() {
        try {
            this.A.clear();
            AppCompatImageView imageView1 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView1);
            kotlin.jvm.internal.i.f(imageView1, "imageView1");
            O(imageView1);
            AppCompatImageView imageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView2);
            kotlin.jvm.internal.i.f(imageView2, "imageView2");
            O(imageView2);
            AppCompatImageView imageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView3);
            kotlin.jvm.internal.i.f(imageView3, "imageView3");
            O(imageView3);
            this.B.clear();
            AppCompatImageView imageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView4);
            kotlin.jvm.internal.i.f(imageView4, "imageView4");
            S(imageView4);
            AppCompatImageView imageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView5);
            kotlin.jvm.internal.i.f(imageView5, "imageView5");
            S(imageView5);
            AppCompatImageView imageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView6);
            kotlin.jvm.internal.i.f(imageView6, "imageView6");
            S(imageView6);
            AppCompatImageView imageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView7);
            kotlin.jvm.internal.i.f(imageView7, "imageView7");
            S(imageView7);
            AppCompatImageView imageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView8);
            kotlin.jvm.internal.i.f(imageView8, "imageView8");
            S(imageView8);
            AppCompatImageView imageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView9);
            kotlin.jvm.internal.i.f(imageView9, "imageView9");
            S(imageView9);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
        }
    }

    public final void b0() {
        try {
            for (AnimatorSet animatorSet : this.A) {
                animatorSet.cancel();
            }
            for (Animator animator : this.B) {
                animator.cancel();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
        }
    }

    public final void c0(boolean z10) {
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
            intent2.setAction(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            androidx.fragment.app.p activity2 = getActivity();
            if (i12 >= 23) {
                i13 = 201326592;
            }
            PendingIntent activity3 = PendingIntent.getActivity(activity2, 0, intent2, i13);
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.d(activity4);
            Object systemService = activity4.getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
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
            kotlin.jvm.internal.i.d(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_custom_audio);
            remoteViews.setTextViewText(R.id.notificationCustomCourse, this.f18964z);
            int i14 = R.drawable.ic_play_png;
            if (z10) {
                i11 = R.drawable.ic_pause_png;
            } else {
                i11 = R.drawable.ic_play_png;
            }
            remoteViews.setImageViewResource(R.id.notificationCustomButton, i11);
            remoteViews.setOnClickPendingIntent(R.id.notificationCustomButton, broadcast);
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.d(activity5);
            f0.t tVar = new f0.t(activity5.getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            androidx.fragment.app.p activity6 = getActivity();
            kotlin.jvm.internal.i.d(activity6);
            tVar.h(BitmapFactory.decodeResource(activity6.getResources(), R.drawable.ic_amaha_logo));
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null && a0Var.isPlaying()) {
                i14 = R.drawable.ic_pause_png;
            }
            tVar.a(i14, "", broadcast);
            tVar.e(this.f18964z);
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
            kotlin.jvm.internal.i.f(MANUFACTURER, "MANUFACTURER");
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.i.f(locale, "getDefault()");
            String lowerCase = MANUFACTURER.toLowerCase(locale);
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!gv.r.J0(lowerCase, "huawei") || i12 > 22) {
                p1.b bVar = new p1.b();
                bVar.f27867e = new int[]{0};
                tVar.j(bVar);
            }
            Notification b10 = tVar.b();
            kotlin.jvm.internal.i.f(b10, "notificationBuilder.build()");
            notificationManager.notify(Constants.AUDIO_NOTIFICATION_ID, b10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
        }
    }

    public final void g0() {
        int i6;
        long j10;
        CharSequence charSequence;
        String str;
        String str2;
        CharSequence text;
        if (isAdded()) {
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null) {
                j10 = a0Var.getCurrentPosition();
            } else {
                j10 = 0;
            }
            double d10 = j10 / this.E;
            if (d10 <= 0.0d) {
                d10 = 0.001d;
            }
            this.K = d10;
            if (!((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).Q) {
                if (this.K >= 1.0d) {
                    ((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).setPercentage(0.001d);
                } else {
                    ((TemplateCircularSlider) _$_findCachedViewById(R.id.ringProgressDownloading)).setPercentage(this.K);
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long minutes = timeUnit.toMinutes(j10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(timeUnit.toMinutes(j10));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(j10);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(j10)))}, 1));
                kotlin.jvm.internal.i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(this.E));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(this.E) - timeUnit2.toSeconds(timeUnit.toMinutes(this.E)))}, 1));
                kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                sb2.append(format2);
                ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText(sb2.toString());
                long j11 = this.J;
                if (minutes > j11) {
                    long j12 = minutes - j11;
                    this.J = minutes;
                    StatPersistence statPersistence = StatPersistence.INSTANCE;
                    String str3 = this.f18960v;
                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.title);
                    if (robertoTextView != null) {
                        charSequence = robertoTextView.getText();
                    } else {
                        charSequence = null;
                    }
                    if (charSequence != null) {
                        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.title);
                        if (robertoTextView2 != null && (text = robertoTextView2.getText()) != null) {
                            str = text.toString();
                        } else {
                            str2 = null;
                            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                            kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                            statPersistence.addOrIncrementAudioMinutes(str3, str2, j12, currentCourseName);
                        }
                    } else {
                        str = "";
                    }
                    str2 = str;
                    String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName2, "getInstance().user.currentCourseName");
                    statPersistence.addOrIncrementAudioMinutes(str3, str2, j12, currentCourseName2);
                }
            }
        }
        Handler handler = this.C;
        tl.o oVar = this.N;
        handler.removeCallbacks(oVar);
        com.google.android.exoplayer2.a0 a0Var2 = this.L;
        if (a0Var2 != null) {
            i6 = a0Var2.p();
        } else {
            i6 = 1;
        }
        if (i6 != 1 && i6 != 4) {
            handler.postDelayed(oVar, 200L);
        }
    }

    public final void h0(boolean z10) {
        try {
            if (isAdded()) {
                this.F = z10;
                ((ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(8);
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p requireActivity = requireActivity();
                    String string = getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireActivity, string);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.ic_replay_black_24dp);
                    if (this.K <= 0.001d) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText("Retry");
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setVisibility(0);
                } else if (!this.I && !this.H) {
                    Z();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10) {
            c0(true);
            a0();
            return;
        }
        c0(false);
        b0();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        Object obj;
        com.google.android.exoplayer2.a0 a0Var;
        try {
            if (isAdded()) {
                androidx.fragment.app.p activity = getActivity();
                if (activity != null) {
                    obj = activity.getSystemService("audio");
                } else {
                    obj = null;
                }
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type android.media.AudioManager");
                AudioManager audioManager = (AudioManager) obj;
                if (i6 != -3) {
                    if (i6 != -2) {
                        if (i6 != -1) {
                            if (i6 == 1) {
                                if (this.f18961w && (a0Var = this.L) != null && !a0Var.isPlaying()) {
                                    X(true);
                                } else {
                                    com.google.android.exoplayer2.a0 a0Var2 = this.L;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.f18963y, 0);
                                    }
                                }
                                this.f18961w = false;
                                return;
                            }
                            return;
                        }
                        this.f18961w = false;
                        X(true);
                        return;
                    }
                    com.google.android.exoplayer2.a0 a0Var3 = this.L;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.f18961w = true;
                        X(false);
                        return;
                    }
                    return;
                }
                this.f18963y = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PLAY_PAUSE");
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        activity.registerReceiver(this.M, intentFilter);
        MyApplication.V.a().F = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s13_audio_file, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            MyApplication.V.a().F = false;
            AudioHelper audioHelper = this.D;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.D;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            activity.unregisterReceiver(this.M);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            Object systemService = activity2.getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null) {
                a0Var.a();
            }
            Intent intent = new Intent(getActivity(), AudioNotificationDismissService.class);
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            activity3.stopService(intent);
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.O.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null && a0Var.isPlaying()) {
                b0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onpause", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            com.google.android.exoplayer2.a0 a0Var = this.L;
            if (a0Var != null && a0Var.isPlaying()) {
                a0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onResume", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s13")) {
                if (A0.containsKey("s13_error_1")) {
                    UtilFunKt.paramsMapToString(A0.get("s13_error_1"));
                }
                if (A0.containsKey("s13_error_2")) {
                    UtilFunKt.paramsMapToString(A0.get("s13_error_2"));
                }
                if (A0.containsKey("s13_audio_url")) {
                    String paramsMapToString2 = UtilFunKt.paramsMapToString(A0.get("s13_audio_url"));
                    this.f18960v = paramsMapToString2;
                    if (paramsMapToString2 != null) {
                        gv.n.F0(paramsMapToString2, " ", "%20");
                    }
                    P();
                }
                this.f18964z = UtilFunKt.paramsMapToString(A0.get("s13_notify_text"));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS13Header)).setText(UtilFunKt.paramsMapToString(A0.get("s13_heading")));
                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnS13Button);
                if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                    paramsMapToString = "DONE";
                } else {
                    paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s13_btn_text"));
                }
                robertoButton.setText(paramsMapToString);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS13Button)).setOnClickListener(new i4(templateActivity, 12));
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 13));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18959u, "Exception in on view created", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        kotlin.jvm.internal.i.g(error, "error");
        h0(true);
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
