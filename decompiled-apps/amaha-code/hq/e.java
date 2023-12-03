package hq;

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
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.u;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AudioTempActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CircularSliderGreyBg;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import f0.t;
import gv.r;
import hs.k;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.l;
import ss.p;
import ta.v;
import tl.o;
/* compiled from: DepressionPleasurableAudioFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhq/e;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {
    public static final /* synthetic */ int Q = 0;
    public AudioFocusRequest A;
    public int B;
    public GoalNotificationContent C;
    public t D;
    public AudioHelper F;
    public long G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean L;
    public a0 M;

    /* renamed from: v  reason: collision with root package name */
    public String f18105v;

    /* renamed from: w  reason: collision with root package name */
    public String f18106w;

    /* renamed from: x  reason: collision with root package name */
    public String f18107x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f18108y;

    /* renamed from: z  reason: collision with root package name */
    public GoalType f18109z;
    public final LinkedHashMap P = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18104u = LogHelper.INSTANCE.makeLogTag(e.class);
    public final Handler E = new Handler();
    public double K = 0.001d;
    public final b N = new b();
    public final o O = new o(20, this);

    /* compiled from: DepressionPleasurableAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CircularSliderGreyBg.a {
        public a() {
        }

        @Override // com.theinnerhour.b2b.widgets.CircularSliderGreyBg.a
        public final void a(float f) {
            e eVar = e.this;
            a0 a0Var = eVar.M;
            if (a0Var != null) {
                float f2 = f / 360;
                a0Var.f0(((float) eVar.G) * f2);
                StringBuilder sb2 = new StringBuilder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                sb2.append(timeUnit.toMinutes(((float) eVar.G) * f2));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(((float) eVar.G) * f2);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(f2 * ((float) eVar.G))))}, 1));
                i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(eVar.G));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(eVar.G) - timeUnit2.toSeconds(timeUnit.toMinutes(eVar.G)))}, 1));
                i.f(format2, "format(format, *args)");
                sb2.append(format2);
                ((RobertoTextView) eVar._$_findCachedViewById(R.id.audioPlayProgress)).setText(sb2.toString());
            }
        }
    }

    /* compiled from: DepressionPleasurableAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a0 a0Var;
            i.g(context, "context");
            i.g(intent, "intent");
            LogHelper logHelper = LogHelper.INSTANCE;
            e eVar = e.this;
            String str = eVar.f18104u;
            String action = intent.getAction();
            i.d(action);
            logHelper.i(str, "onrecieve intent action ".concat(action));
            if (i.b(intent.getAction(), "PLAY_PAUSE") && eVar.isAdded()) {
                if (!eVar.J && (((a0Var = eVar.M) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || eVar.H))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        eVar.b0(true);
                        return;
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        eVar.b0(false);
                        eVar.Q(false);
                        return;
                    } else {
                        return;
                    }
                }
                eVar.U(true);
            }
        }
    }

    /* compiled from: DepressionPleasurableAudioFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.fragment.assessmentActivities.DepressionPleasurableAudioFragment$setupDownload$1", f = "DepressionPleasurableAudioFragment.kt", l = {174, 175}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f18112u;

        /* compiled from: DepressionPleasurableAudioFragment.kt */
        @ns.e(c = "com.theinnerhour.b2b.fragment.assessmentActivities.DepressionPleasurableAudioFragment$setupDownload$1$1", f = "DepressionPleasurableAudioFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f18114u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f18115v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, int i6, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f18114u = eVar;
                this.f18115v = i6;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f18114u, this.f18115v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                int i6;
                sp.b.d0(obj);
                e eVar = this.f18114u;
                if (eVar.isAdded() && ((RobertoTextView) eVar._$_findCachedViewById(R.id.downloadSize)) != null && (i6 = this.f18115v) > 0) {
                    RobertoTextView robertoTextView = (RobertoTextView) eVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) eVar._$_findCachedViewById(R.id.downloadSize);
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
            int i6 = this.f18112u;
            e eVar = e.this;
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
                String str = eVar.f18105v;
                i.d(str);
                this.f18112u = 1;
                obj = e.K(eVar, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            int intValue = ((Number) obj).intValue();
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(eVar, intValue, null);
            this.f18112u = 2;
            if (v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
            return k.f19476a;
        }
    }

    /* compiled from: DepressionPleasurableAudioFragment.kt */
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
            e eVar = e.this;
            eVar.I = z10;
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5 && eVar.isAdded()) {
                                    Utils.INSTANCE.showCustomToast(eVar.getContext(), "Download Cancelled");
                                }
                            } else if (eVar.isAdded()) {
                                Utils.INSTANCE.showCustomToast(eVar.getContext(), "Download Failed");
                            }
                        } else {
                            if (eVar.isAdded()) {
                                Utils.INSTANCE.showCustomToast(eVar.getContext(), "Download failed. Please check your internet connection.");
                            }
                            ProgressBar progressBar = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar != null) {
                                progressBar.setProgress(0);
                            }
                            ProgressBar progressBar2 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            eVar.I = false;
                        }
                    }
                } else if (eVar.isAdded()) {
                    Utils.INSTANCE.showCustomToast(eVar.getContext(), "Download Started");
                }
                return k.f19476a;
            }
            if (eVar.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String str = eVar.f18105v;
                i.d(str);
                Context context = eVar.getContext();
                i.d(context);
                if (utils.getAudioFilePath(str, context) != null) {
                    utils.showCustomToast(eVar.getContext(), "Download Completed");
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) eVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ProgressBar progressBar3 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    eVar.J = true;
                    eVar.Q(true);
                } else {
                    ProgressBar progressBar4 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(0);
                    }
                    ProgressBar progressBar5 = (ProgressBar) eVar._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar5 != null) {
                        progressBar5.setProgress(0);
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.downloadBtn);
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
    public static final Object K(e eVar, String str, ls.d dVar) {
        hq.b bVar;
        int i6;
        kotlin.jvm.internal.v vVar;
        eVar.getClass();
        if (dVar instanceof hq.b) {
            bVar = (hq.b) dVar;
            int i10 = bVar.f18100x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f18100x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f18098v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = bVar.f18100x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        vVar = bVar.f18097u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f23467u = -1;
                    kotlinx.coroutines.scheduling.b bVar2 = o0.f23642c;
                    hq.c cVar = new hq.c(str, vVar2, null);
                    bVar.f18097u = vVar2;
                    bVar.f18100x = 1;
                    if (v.S(bVar2, cVar, bVar) != aVar) {
                        vVar = vVar2;
                    } else {
                        return aVar;
                    }
                }
                return new Integer(vVar.f23467u);
            }
        }
        bVar = new hq.b(eVar, dVar);
        Object obj2 = bVar.f18098v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = bVar.f18100x;
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
                AudioFocusRequest audioFocusRequest = this.A;
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
            if (isAdded()) {
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
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "Exception in animate play button", e10);
        }
    }

    public final void O() {
        float f = getResources().getDisplayMetrics().density * 8;
        ViewGroup.LayoutParams layoutParams = ((AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn)).getLayoutParams();
        i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, (int) (f + 0), 0, 0);
        ((AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn)).setLayoutParams(marginLayoutParams);
        ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setLayoutParams(marginLayoutParams);
    }

    public final void P() {
        boolean z10;
        try {
            Utils utils = Utils.INSTANCE;
            String str = this.f18105v;
            i.d(str);
            Context context = getContext();
            i.d(context);
            if (utils.getAudioFilePath(str, context) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.J = z10;
            if (!z10) {
                if (ConnectionStatusReceiver.isConnected()) {
                    Y();
                }
            } else {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
            Q(false);
            ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setOnClickListener(new hq.a(this, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "Exception in check audio", e10);
        }
    }

    public final void Q(boolean z10) {
        String str;
        boolean z11;
        try {
            if (!ConnectionStatusReceiver.isConnected() && !this.J) {
                b0(true);
                return;
            }
            a0 a0Var = this.M;
            if (a0Var == null) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.anim_play_to_pause);
                ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.audioPlayCTA)).setVisibility(0);
                ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText("");
                ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setVisibility(0);
            } else if (z10) {
                a0Var.a();
            }
            this.M = new j.b(requireContext()).a();
            if (this.J) {
                Utils utils = Utils.INSTANCE;
                String str2 = this.f18105v;
                i.d(str2);
                Context context = getContext();
                i.d(context);
                str = utils.getAudioFilePath(str2, context);
            } else {
                str = this.f18105v;
            }
            q b10 = q.b(Uri.parse(str));
            a0 a0Var2 = this.M;
            if (a0Var2 != null) {
                a0Var2.h0(b10);
                a0 a0Var3 = this.M;
                if (a0Var3 != null) {
                    a0Var3.E(this);
                    a0 a0Var4 = this.M;
                    if (a0Var4 != null) {
                        a0Var4.l();
                        ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setDisableTouch(false);
                        ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setOnSliderMovedListener(new a());
                        a0 a0Var5 = this.M;
                        if (a0Var5 != null) {
                            double d10 = this.K;
                            if (d10 > 0.001d && d10 < 1.0d) {
                                a0Var5.f0((long) (d10 * this.G));
                                U(true);
                                CircularSliderGreyBg circularSliderGreyBg = (CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress);
                                circularSliderGreyBg.f11832u = true;
                                circularSliderGreyBg.invalidate();
                                return;
                            }
                        }
                        if (this.K == 0.001d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            S(false);
                        }
                        CircularSliderGreyBg circularSliderGreyBg2 = (CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress);
                        circularSliderGreyBg2.f11832u = true;
                        circularSliderGreyBg2.invalidate();
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
            LogHelper.INSTANCE.e(this.f18104u, "error in initialising audio", e10);
        }
    }

    public final void S(boolean z10) {
        if (z10) {
            try {
                J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f18104u, "exception", e10);
                return;
            }
        }
        M(false);
        this.E.removeCallbacksAndMessages(null);
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        }
        GoalNotificationContent goalNotificationContent = this.C;
        if (goalNotificationContent != null) {
            bundle.putString("experiment_type", Constants.SCREEN_ACTIVITY);
            bundle.putString("experiment", goalNotificationContent.getExperiment());
            bundle.putString("experiment_key", goalNotificationContent.getKey());
        }
        gk.a.b(bundle, "activity_audio_pause");
    }

    public final void U(boolean z10) {
        try {
            a0 a0Var = this.M;
            if (a0Var != null && a0Var.isPlaying()) {
                a0 a0Var2 = this.M;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    S(z10);
                    Z(false);
                    return;
                }
                i.q("simpleExoplayer");
                throw null;
            } else if (X()) {
                a0 a0Var3 = this.M;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    Z(true);
                    M(true);
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    GoalType goalType = this.f18109z;
                    if (goalType != null) {
                        bundle.putString(Constants.GOAL_ID, goalType.getGoalId());
                        bundle.putString(Constants.GOAL_NAME, goalType.getGoalName());
                    }
                    bundle.putBoolean("isStreaming", true ^ this.J);
                    gk.a.b(bundle, "activity_audio_play");
                    return;
                }
                i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "error in playing audio", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        a0();
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    this.K = 0.001d;
                    Q(false);
                    Z(false);
                    Z(false);
                    return;
                }
                return;
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            a0 a0Var = this.M;
            if (a0Var != null) {
                this.G = a0Var.getDuration();
                CircularSliderGreyBg circularSliderGreyBg = (CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress);
                if (circularSliderGreyBg != null) {
                    circularSliderGreyBg.setVisibility(0);
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
                CircularSliderGreyBg circularSliderGreyBg2 = (CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress);
                if (circularSliderGreyBg2 != null) {
                    circularSliderGreyBg2.setDisableTouch(false);
                    return;
                }
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

    public final boolean X() {
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
                this.A = build;
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
            LogHelper.INSTANCE.e(this.f18104u, "Exception", e10);
            return false;
        }
    }

    public final void Y() {
        if (ConnectionStatusReceiver.isConnected() && this.f18105v != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            v.H(h.c(o0.f23640a), null, 0, new c(null), 3);
        }
        Context context = getContext();
        i.d(context);
        String str = this.f18105v;
        i.d(str);
        AudioHelper audioHelper = new AudioHelper(context, str);
        this.F = audioHelper;
        audioHelper.registerDownloadReceivers();
        AudioHelper audioHelper2 = this.F;
        if (audioHelper2 != null) {
            audioHelper2.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.F;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new pp.b(6, new hq.d(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new hq.a(this, 1));
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

    public final void Z(boolean z10) {
        int i6;
        int i10;
        try {
            Intent intent = new Intent();
            intent.setAction("PLAY_PAUSE");
            androidx.fragment.app.p activity = getActivity();
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 134217728;
            if (i11 >= 23) {
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
            if (i11 >= 23) {
                i12 = 201326592;
            }
            PendingIntent activity3 = PendingIntent.getActivity(activity2, 0, intent2, i12);
            androidx.fragment.app.p activity4 = getActivity();
            i.d(activity4);
            Object systemService = activity4.getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i11 >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("audio_channel", "Audio", 2);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Context context = getContext();
            i.d(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_custom_audio);
            GoalType goalType = this.f18109z;
            i.d(goalType);
            remoteViews.setTextViewText(R.id.notificationCustomCourse, goalType.getGoalName());
            int i13 = R.drawable.ic_play_png;
            if (z10) {
                i10 = R.drawable.ic_pause_png;
            } else {
                i10 = R.drawable.ic_play_png;
            }
            remoteViews.setImageViewResource(R.id.notificationCustomButton, i10);
            remoteViews.setOnClickPendingIntent(R.id.notificationCustomButton, broadcast);
            androidx.fragment.app.p activity5 = getActivity();
            i.d(activity5);
            t tVar = new t(activity5.getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            androidx.fragment.app.p activity6 = getActivity();
            i.d(activity6);
            tVar.h(BitmapFactory.decodeResource(activity6.getResources(), R.drawable.ic_amaha_logo));
            a0 a0Var = this.M;
            if (a0Var != null && a0Var.isPlaying()) {
                i13 = R.drawable.ic_pause_png;
            }
            tVar.a(i13, "", broadcast);
            GoalType goalType2 = this.f18109z;
            i.d(goalType2);
            tVar.e(goalType2.getGoalName());
            tVar.g(16, false);
            tVar.f(2);
            tVar.f14665j = 2;
            tVar.g(8, true);
            tVar.f14679y = remoteViews;
            tVar.f14662g = activity3;
            this.D = tVar;
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
            if (!r.J0(lowerCase, "huawei") || i11 > 22) {
                t tVar2 = this.D;
                i.d(tVar2);
                p1.b bVar = new p1.b();
                bVar.f27867e = new int[]{0};
                tVar2.j(bVar);
            }
            t tVar3 = this.D;
            i.d(tVar3);
            Notification b10 = tVar3.b();
            i.f(b10, "notificationBuilder!!.build()");
            notificationManager.notify(Constants.AUDIO_NOTIFICATION_ID, b10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.P;
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
        int i6;
        long j10;
        if (isAdded()) {
            a0 a0Var = this.M;
            if (a0Var != null) {
                j10 = a0Var.getCurrentPosition();
            } else {
                j10 = 0;
            }
            double d10 = j10 / this.G;
            if (d10 <= 0.0d) {
                d10 = 0.001d;
            }
            this.K = d10;
            if (!((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).Q) {
                if (this.K >= 1.0d) {
                    ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setPercentage(0.001d);
                } else {
                    ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setPercentage(this.K);
                }
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
                sb2.append(timeUnit.toMinutes(this.G));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(this.G) - timeUnit2.toSeconds(timeUnit.toMinutes(this.G)))}, 1));
                i.f(format2, "format(format, *args)");
                sb2.append(format2);
                ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText(sb2.toString());
            }
        }
        Handler handler = this.E;
        o oVar = this.O;
        handler.removeCallbacks(oVar);
        a0 a0Var2 = this.M;
        if (a0Var2 != null) {
            i6 = a0Var2.p();
        } else {
            i6 = 1;
        }
        if (i6 != 1 && i6 != 4) {
            handler.postDelayed(oVar, 200L);
        }
    }

    public final void b0(boolean z10) {
        try {
            if (isAdded()) {
                ((ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(8);
                this.H = z10;
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = getActivity();
                    i.d(activity);
                    String string = getString(R.string.no_internet_msg);
                    i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(activity, string);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setImageResource(R.drawable.ic_replay_black_24dp);
                    if (this.K <= 0.001d) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setText("Retry");
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.play)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setVisibility(0);
                } else if (!this.L && !this.J) {
                    Y();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "exception", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10) {
            Z(true);
            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).j();
            return;
        }
        Z(false);
        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        Object obj;
        a0 a0Var;
        String str = this.f18104u;
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
                LogHelper.INSTANCE.i(str, "on audio focus change");
                if (i6 != -3) {
                    if (i6 != -2) {
                        if (i6 != -1) {
                            if (i6 == 1) {
                                if (this.f18108y && (a0Var = this.M) != null && !a0Var.isPlaying()) {
                                    U(true);
                                } else {
                                    a0 a0Var2 = this.M;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.B, 0);
                                    }
                                }
                                this.f18108y = false;
                                return;
                            }
                            return;
                        }
                        this.f18108y = false;
                        U(true);
                        return;
                    }
                    a0 a0Var3 = this.M;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.f18108y = true;
                        U(false);
                        return;
                    }
                    return;
                }
                this.B = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("PLAY_PAUSE");
            androidx.fragment.app.p activity = getActivity();
            i.d(activity);
            activity.registerReceiver(this.N, intentFilter);
            MyApplication.V.a().F = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_a17, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            MyApplication.V.a().F = false;
            AudioHelper audioHelper = this.F;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.F;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    i.q("audioHelper");
                    throw null;
                }
            }
            androidx.fragment.app.p activity = getActivity();
            i.d(activity);
            activity.unregisterReceiver(this.N);
            androidx.fragment.app.p activity2 = getActivity();
            i.d(activity2);
            Object systemService = activity2.getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            a0 a0Var = this.M;
            if (a0Var != null) {
                a0Var.a();
            }
            this.E.removeCallbacksAndMessages(null);
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.P.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            a0 a0Var = this.M;
            if (a0Var != null && a0Var.isPlaying()) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "error in onPause", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            a0 a0Var = this.M;
            if (a0Var != null && a0Var.isPlaying()) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).j();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18104u, "error in onResume", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f18104u;
        i.g(view, "view");
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
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView title = (RobertoTextView) _$_findCachedViewById(R.id.title);
            i.f(title, "title");
            insetsUtils.addStatusBarHeight(title);
            androidx.fragment.app.p activity = getActivity();
            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            DepressionPleasurableActivity depressionPleasurableActivity = (DepressionPleasurableActivity) activity;
            O();
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(getString(R.string.depressionPleasurableAudioIntroHeader));
            this.f18106w = Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY;
            this.f18107x = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            ((RobertoButton) _$_findCachedViewById(R.id.audioPlayCTA)).setOnClickListener(new hq.a(this, 0));
            if (!i.b(this.f18106w, "")) {
                Iterator<GoalType> it = Constants.getActivities(this.f18107x).iterator();
                while (it.hasNext()) {
                    GoalType next = it.next();
                    if (i.b(next.getGoalId(), this.f18106w)) {
                        this.f18109z = next;
                    }
                }
                if (this.f18109z == null) {
                    Iterator<GoalType> it2 = Constants.getCopingActivities(this.f18107x).iterator();
                    while (it2.hasNext()) {
                        GoalType next2 = it2.next();
                        if (i.b(next2.getGoalId(), this.f18106w)) {
                            this.f18109z = next2;
                        }
                    }
                }
                if (isAdded()) {
                    GoalType goalType = this.f18109z;
                    i.d(goalType);
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(goalType.getGoalName());
                    ((CircularSliderGreyBg) _$_findCachedViewById(R.id.audioProgress)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.audioPlayProgress)).setVisibility(0);
                }
                Utils utils = Utils.INSTANCE;
                String str2 = this.f18106w;
                i.d(str2);
                this.C = utils.getGoalNotificationContent(str2);
                try {
                    this.f18105v = CourseUtilKt.getAudioUrls("").get(Constants.PRIORITY_GUIDED_IMAGERY);
                    ((ConstraintLayout) _$_findCachedViewById(R.id.container)).setBackgroundColor(g0.a.b(requireContext(), R.color.pastel_blue));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, "exception", e10);
                }
                P();
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "Exception", e11);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        i.g(error, "error");
        b0(true);
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
