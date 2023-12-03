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
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.work.u;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityContentModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
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
import f0.t;
import g0.a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import ta.v;
/* compiled from: RecommendedActivityAudioFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzo/e;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {
    public static final /* synthetic */ int e0 = 0;
    public RecommendedActivitiesPlaybackActivity A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public AudioHelper H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public a0 R;
    public MediaSessionCompat S;
    public Bitmap T;
    public long V;

    /* renamed from: v  reason: collision with root package name */
    public RecommendedActivityModel f39694v;

    /* renamed from: w  reason: collision with root package name */
    public String f39695w;

    /* renamed from: x  reason: collision with root package name */
    public AudioFocusRequest f39696x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f39697y;

    /* renamed from: z  reason: collision with root package name */
    public int f39698z;

    /* renamed from: d0  reason: collision with root package name */
    public final LinkedHashMap f39692d0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f39693u = LogHelper.INSTANCE.makeLogTag("RAAudioFragment");
    public final Handler G = new Handler();
    public double Q = 0.001d;
    public String U = "0";
    public final HashMap<String, String> W = new HashMap<>();
    public boolean X = true;
    public final yn.a Y = new yn.a();
    public final m0 Z = b0.j(this, y.a(ap.a.class), new f(this), new g(this), new h(this));

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f39690a0 = sp.b.K();

    /* renamed from: b0  reason: collision with root package name */
    public final d f39691b0 = new d();
    public final tl.o c0 = new tl.o(14, this);

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            if (z10) {
                e eVar = e.this;
                a0 a0Var = eVar.R;
                if (a0Var != null) {
                    long j10 = i6;
                    long j11 = (long) Constants.TIMEOUT_MS;
                    a0Var.f0((eVar.I * j10) / j11);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long minutes = timeUnit.toMinutes((eVar.I * j10) / j11);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(timeUnit.toMinutes((eVar.I * j10) / j11));
                    sb2.append(':');
                    long seconds = timeUnit.toSeconds((eVar.I * j10) / j11);
                    TimeUnit timeUnit2 = TimeUnit.MINUTES;
                    String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes((eVar.I * j10) / j11)))}, 1));
                    kotlin.jvm.internal.i.f(format, "format(format, *args)");
                    sb2.append(format);
                    sb2.append('/');
                    sb2.append(timeUnit.toMinutes(eVar.I));
                    sb2.append(':');
                    String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(eVar.I) - timeUnit2.toSeconds(timeUnit.toMinutes(eVar.I)))}, 1));
                    kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                    sb2.append(format2);
                    ((RobertoTextView) eVar._$_findCachedViewById(R.id.tvRAProgress)).setText(sb2.toString());
                    long seconds2 = timeUnit.toSeconds((eVar.I * j10) / j11);
                    eVar.U = String.valueOf(timeUnit.toSeconds((eVar.I * j10) / j11));
                    long j12 = eVar.P;
                    if (minutes > j12) {
                        eVar.P = minutes;
                        StatPersistence statPersistence = StatPersistence.INSTANCE;
                        String P = eVar.P();
                        String title = eVar.Q().getTitle();
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        statPersistence.addOrIncrementAudioMinutes(P, title, minutes - j12, currentCourseName);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putString("activity_id", eVar.Q().getGoalId());
                    bundle.putString("activity_name", eVar.Q().getTitle());
                    String lowerCase = eVar.Q().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                    bundle.putString("type", lowerCase);
                    bundle.putString("source", eVar.O().f11610y);
                    bundle.putBoolean("goal_added", eVar.C);
                    int i10 = (seconds2 > eVar.V ? 1 : (seconds2 == eVar.V ? 0 : -1));
                    if (i10 > 0) {
                        bundle.putString("progress_direction", "forward");
                    } else if (i10 < 0) {
                        bundle.putString("progress_direction", "backward");
                    }
                    gk.a.b(bundle, "activity_playtime_move");
                    eVar.V = seconds2;
                }
                boolean z11 = eVar.D;
                if (z11 && eVar.E) {
                    eVar.E = false;
                    ((RobertoButton) eVar._$_findCachedViewById(R.id.btnRASolid)).setVisibility(8);
                    ((AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                } else if (!z11 && eVar.E && eVar.C) {
                    eVar.E = false;
                    ((RobertoButton) eVar._$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
                    ((RobertoButton) eVar._$_findCachedViewById(R.id.btnRASolid)).setVisibility(8);
                    ((AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            e.this.K = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            e.this.K = false;
        }
    }

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f39701v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f39702w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FirestoreGoal firestoreGoal, x<com.google.android.material.bottomsheet.f> xVar) {
            super(1);
            this.f39701v = firestoreGoal;
            this.f39702w = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i6 = e.e0;
                e.this.c0(this.f39701v, null);
            }
            com.google.android.material.bottomsheet.f fVar = this.f39702w.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends FirestoreGoal>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends FirestoreGoal> singleUseEvent) {
            hs.k kVar;
            FirestoreGoal contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            e eVar = e.this;
            if (contentIfNotHandled != null) {
                int i6 = e.e0;
                eVar.X(contentIfNotHandled);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                Toast.makeText(eVar.requireContext(), eVar.getString(R.string.loginSomethingWentWrong), 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:3:0x000c, B:5:0x0018, B:7:0x001e, B:9:0x0023, B:11:0x0027, B:13:0x002d, B:15:0x0033, B:18:0x0038, B:20:0x003e, B:25:0x005f, B:27:0x00c2, B:28:0x00c8, B:21:0x0042, B:23:0x0048, B:24:0x005c), top: B:33:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c8 A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d5, blocks: (B:3:0x000c, B:5:0x0018, B:7:0x001e, B:9:0x0023, B:11:0x0027, B:13:0x002d, B:15:0x0033, B:18:0x0038, B:20:0x003e, B:25:0x005f, B:27:0x00c2, B:28:0x00c8, B:21:0x0042, B:23:0x0048, B:24:0x005c), top: B:33:0x000c }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            a0 a0Var;
            e eVar = e.this;
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            try {
                if (kotlin.jvm.internal.i.b(intent.getAction(), "PLAY_PAUSE") && eVar.isAdded()) {
                    if (!eVar.N && (((a0Var = eVar.R) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || eVar.L))) {
                        if (!ConnectionStatusReceiver.isConnected()) {
                            eVar.j0(true);
                        } else if (ConnectionStatusReceiver.isConnected()) {
                            eVar.j0(false);
                            ((LottieAnimationView) eVar._$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(0);
                            eVar.U(false);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putString("activity_id", eVar.Q().getGoalId());
                        bundle.putString("activity_name", eVar.Q().getTitle());
                        String lowerCase = eVar.Q().getTemplateType().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                        bundle.putString("type", lowerCase);
                        bundle.putString("source", eVar.O().f11610y);
                        bundle.putBoolean("goal_added", eVar.C);
                        bundle.putString("action_source", "notification");
                        if (!eVar.B) {
                            gk.a.b(bundle, "activity_play_click");
                            return;
                        }
                        bundle.putString("played_progress", eVar.U);
                        gk.a.b(bundle, "activity_pause_click");
                        return;
                    }
                    eVar.Z(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putString("activity_id", eVar.Q().getGoalId());
                    bundle2.putString("activity_name", eVar.Q().getTitle());
                    String lowerCase2 = eVar.Q().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    bundle2.putString("type", lowerCase2);
                    bundle2.putString("source", eVar.O().f11610y);
                    bundle2.putBoolean("goal_added", eVar.C);
                    bundle2.putString("action_source", "notification");
                    if (!eVar.B) {
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(eVar.f39693u, e10);
            }
        }
    }

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* renamed from: zo.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0679e extends kotlin.jvm.internal.k implements ss.l<u.a, hs.k> {
        public C0679e() {
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
            e eVar = e.this;
            eVar.M = z10;
            int ordinal = status.ordinal();
            HashMap<String, String> hashMap = eVar.W;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    eVar.isAdded();
                                }
                            } else if (eVar.isAdded() && (str3 = hashMap.get("download_failed_toast")) != null) {
                                Utils.INSTANCE.showCustomToast(eVar.requireActivity(), str3);
                            }
                        } else {
                            if (eVar.isAdded() && (str2 = hashMap.get("download_failed_toast")) != null) {
                                Utils.INSTANCE.showCustomToast(eVar.requireActivity(), str2);
                            }
                            ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                            ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                            ((RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            eVar.M = false;
                            Bundle bundle = new Bundle();
                            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle.putString("activity_id", eVar.Q().getGoalId());
                            bundle.putString("activity_name", eVar.Q().getTitle());
                            String lowerCase = eVar.Q().getTemplateType().toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                            bundle.putString("type", lowerCase);
                            bundle.putString("source", eVar.O().f11610y);
                            bundle.putBoolean("goal_added", eVar.C);
                            gk.a.b(bundle, "activity_download_fail");
                        }
                    }
                } else if (eVar.isAdded() && (str = hashMap.get("download_progress_toast")) != null) {
                    Utils.INSTANCE.showCustomToast(eVar.requireActivity(), str);
                }
                return hs.k.f19476a;
            }
            if (eVar.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String P = eVar.P();
                Context requireContext = eVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                if (utils.getAudioFilePath(P, requireContext) != null) {
                    String str4 = hashMap.get("download_complete_toast");
                    if (str4 != null) {
                        utils.showCustomToast(eVar.requireActivity(), str4);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_ra_downloaded);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(8);
                    ((RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(8);
                    eVar.N = true;
                    eVar.U(true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putString("activity_id", eVar.Q().getGoalId());
                    bundle2.putString("activity_name", eVar.Q().getTitle());
                    String lowerCase2 = eVar.Q().getTemplateType().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    bundle2.putString("type", lowerCase2);
                    bundle2.putString("source", eVar.O().f11610y);
                    bundle2.putBoolean("goal_added", eVar.C);
                    bundle2.putString(Constants.NOTIFICATION_URL, eVar.P());
                    gk.a.b(bundle2, "activity_audio_download_finish");
                } else {
                    ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setProgress(0.0f);
                    ((CircularProgressBar) eVar._$_findCachedViewById(R.id.pbRADownloadProgress)).setVisibility(0);
                    ((RobertoTextView) eVar._$_findCachedViewById(R.id.tvRADownloadProgress)).setVisibility(0);
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) eVar._$_findCachedViewById(R.id.ivRADownloadCta);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39706u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f39706u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f39706u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39707u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f39707u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f39707u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f39708u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f39708u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f39708u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final void J() {
        AudioManager audioManager;
        try {
            Object systemService = O().getSystemService("audio");
            if (systemService instanceof AudioManager) {
                audioManager = (AudioManager) systemService;
            } else {
                audioManager = null;
            }
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f39696x;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                audioManager.abandonAudioFocus(this);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    public final void K(boolean z10) {
        try {
            if (isAdded()) {
                if (z10) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_pause);
                } else {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_play);
                    this.F = false;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, "Exception in animate play button", e10);
        }
    }

    public final void M() {
        try {
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnRAStroke);
            HashMap<String, String> hashMap = this.W;
            robertoButton.setText(hashMap.get("cta_goal_added"));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setText(hashMap.get("cta_goal_track"));
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setBackground(a.c.b(requireContext, R.drawable.button_disabled));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast_35_opacity));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setAlpha(0.2f);
            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setBackground(a.c.b(requireContext(), R.drawable.button_border_peach));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setTextColor(g0.a.b(requireContext(), R.color.white));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setOnClickListener(new zo.b(this, 6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    public final RecommendedActivitiesPlaybackActivity O() {
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = this.A;
        if (recommendedActivitiesPlaybackActivity != null) {
            return recommendedActivitiesPlaybackActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final String P() {
        String str = this.f39695w;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("audioUrl");
        throw null;
    }

    public final RecommendedActivityModel Q() {
        RecommendedActivityModel recommendedActivityModel = this.f39694v;
        if (recommendedActivityModel != null) {
            return recommendedActivityModel;
        }
        kotlin.jvm.internal.i.q("recommendedActivityModel");
        throw null;
    }

    public final ap.a S() {
        return (ap.a) this.Z.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:3:0x0003, B:5:0x002b, B:8:0x0030, B:9:0x0035, B:13:0x003f, B:21:0x0074, B:23:0x0087, B:25:0x009f, B:27:0x00ab, B:29:0x00b2, B:31:0x00b9, B:33:0x00de, B:37:0x00ea, B:40:0x00f7, B:47:0x0109, B:41:0x00fb, B:46:0x0106, B:48:0x0113, B:49:0x0116, B:50:0x0117, B:51:0x011a, B:52:0x011b, B:53:0x011e, B:24:0x009b, B:15:0x0063, B:17:0x006b, B:18:0x006f, B:19:0x0072), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:3:0x0003, B:5:0x002b, B:8:0x0030, B:9:0x0035, B:13:0x003f, B:21:0x0074, B:23:0x0087, B:25:0x009f, B:27:0x00ab, B:29:0x00b2, B:31:0x00b9, B:33:0x00de, B:37:0x00ea, B:40:0x00f7, B:47:0x0109, B:41:0x00fb, B:46:0x0106, B:48:0x0113, B:49:0x0116, B:50:0x0117, B:51:0x011a, B:52:0x011b, B:53:0x011e, B:24:0x009b, B:15:0x0063, B:17:0x006b, B:18:0x006f, B:19:0x0072), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:3:0x0003, B:5:0x002b, B:8:0x0030, B:9:0x0035, B:13:0x003f, B:21:0x0074, B:23:0x0087, B:25:0x009f, B:27:0x00ab, B:29:0x00b2, B:31:0x00b9, B:33:0x00de, B:37:0x00ea, B:40:0x00f7, B:47:0x0109, B:41:0x00fb, B:46:0x0106, B:48:0x0113, B:49:0x0116, B:50:0x0117, B:51:0x011a, B:52:0x011b, B:53:0x011e, B:24:0x009b, B:15:0x0063, B:17:0x006b, B:18:0x006f, B:19:0x0072), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:3:0x0003, B:5:0x002b, B:8:0x0030, B:9:0x0035, B:13:0x003f, B:21:0x0074, B:23:0x0087, B:25:0x009f, B:27:0x00ab, B:29:0x00b2, B:31:0x00b9, B:33:0x00de, B:37:0x00ea, B:40:0x00f7, B:47:0x0109, B:41:0x00fb, B:46:0x0106, B:48:0x0113, B:49:0x0116, B:50:0x0117, B:51:0x011a, B:52:0x011b, B:53:0x011e, B:24:0x009b, B:15:0x0063, B:17:0x006b, B:18:0x006f, B:19:0x0072), top: B:57:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(boolean z10) {
        boolean isPlaying;
        String P;
        a0 a0Var;
        boolean z11;
        try {
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setText("");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setVisibility(0);
            if (!ConnectionStatusReceiver.isConnected() && !this.N) {
                j0(true);
                return;
            }
            a0 a0Var2 = this.R;
            if (a0Var2 == null) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_pause);
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setVisibility(0);
            } else if (z10) {
                isPlaying = a0Var2.isPlaying();
                a0 a0Var3 = this.R;
                if (a0Var3 != null) {
                    a0Var3.a();
                    this.R = new j.b(requireContext()).a();
                    if (!this.N) {
                        Utils utils = Utils.INSTANCE;
                        String P2 = P();
                        Context requireContext = requireContext();
                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                        P = utils.getAudioFilePath(P2, requireContext);
                    } else {
                        P = P();
                    }
                    com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(Uri.parse(P));
                    a0Var = this.R;
                    if (a0Var == null) {
                        a0Var.h0(b10);
                        a0 a0Var4 = this.R;
                        if (a0Var4 != null) {
                            a0Var4.E(this);
                            a0 a0Var5 = this.R;
                            if (a0Var5 != null) {
                                a0Var5.l();
                                ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setMax(Constants.TIMEOUT_MS);
                                ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setOnSeekBarChangeListener(new a());
                                a0 a0Var6 = this.R;
                                if (a0Var6 != null) {
                                    double d10 = this.Q;
                                    if (d10 > 0.001d && d10 < 1.0d) {
                                        a0Var6.f0((long) (d10 * this.I));
                                        if (z10 && isPlaying) {
                                            Z(true);
                                        }
                                        ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setEnabled(true);
                                        return;
                                    }
                                }
                                if (this.Q == 0.001d) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    Y(false);
                                }
                                ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setEnabled(true);
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
            isPlaying = false;
            this.R = new j.b(requireContext()).a();
            if (!this.N) {
            }
            com.google.android.exoplayer2.q b102 = com.google.android.exoplayer2.q.b(Uri.parse(P));
            a0Var = this.R;
            if (a0Var == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in initialising audio", e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        try {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        this.P = 0L;
                        this.Q = 0.001d;
                        a0 a0Var = this.R;
                        if (a0Var != null) {
                            a0Var.z(false);
                            this.B = false;
                        }
                        this.E = true;
                        this.F = true;
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_replay);
                        if (this.D && this.E) {
                            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setOnClickListener(new zo.b(this, 7));
                        }
                        ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                        g0(false);
                        if (this.C) {
                            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setVisibility(8);
                            ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ((LottieAnimationView) _$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(8);
                a0 a0Var2 = this.R;
                if (a0Var2 != null) {
                    this.I = a0Var2.getDuration();
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setVisibility(0);
                    ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setClickable(true);
                    ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setEnabled(true);
                    h0();
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
            ((LottieAnimationView) _$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(0);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    public final void X(FirestoreGoal firestoreGoal) {
        yn.a aVar = this.Y;
        aVar.getClass();
        if (yn.a.b()) {
            c0(firestoreGoal, null);
        } else {
            x xVar = new x();
            ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_new_audio", aVar.a(true), "goals", this.Y, new b(firestoreGoal, xVar));
            xVar.f23469u = notificationPermissionBottomSheet;
            notificationPermissionBottomSheet.show(requireActivity().getSupportFragmentManager(), "permission");
        }
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", Q().getGoalId());
        bundle.putString("activity_name", Q().getTitle());
        String templateType = Q().getTemplateType();
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
        String lowerCase = templateType.toLowerCase(ENGLISH);
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        bundle.putString("type", lowerCase);
        bundle.putString("source", O().f11610y);
        bundle.putString("played_progress", this.U);
        gk.a.b(bundle, "activity_add_goal_click");
    }

    public final void Y(boolean z10) {
        if (z10) {
            try {
                J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f39693u, "exception", e10);
                return;
            }
        }
        K(false);
        this.G.removeCallbacksAndMessages(null);
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        }
        bundle.putBoolean("isStreaming", !this.N);
        gk.a.b(bundle, "activity_audio_pause");
    }

    public final void Z(boolean z10) {
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity;
        try {
            a0 a0Var = this.R;
            boolean z11 = true;
            boolean z12 = false;
            if (a0Var != null && a0Var.isPlaying()) {
                a0 a0Var2 = this.R;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    Y(z10);
                    if (((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).getProgress() != 0.0f) {
                        z11 = false;
                    }
                    if (!z11) {
                        ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).m(0.0f);
                    }
                    g0(false);
                    ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
                    this.B = false;
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (a0()) {
                if (!this.J) {
                    this.J = true;
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
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).h();
                if (((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).getProgress() == 0.0f) {
                    z12 = true;
                }
                if (z12) {
                    ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).A();
                }
                a0 a0Var3 = this.R;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    g0(true);
                    K(true);
                    this.B = true;
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    bundle.putBoolean("isStreaming", true ^ this.N);
                    gk.a.b(bundle, "activity_audio_play");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, "error in playing audio", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39692d0;
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
        int requestAudioFocus;
        try {
            Object systemService = O().getSystemService("audio");
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
                this.f39696x = build;
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
            LogHelper.INSTANCE.e(this.f39693u, "Exception", e10);
            return false;
        }
    }

    public final void b0() {
        AudioHelper audioHelper;
        AppCompatImageView appCompatImageView;
        if (ConnectionStatusReceiver.isConnected() && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta)) != null) {
            appCompatImageView.setVisibility(0);
        }
        try {
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            AudioHelper audioHelper2 = new AudioHelper(requireContext, P());
            this.H = audioHelper2;
            audioHelper2.registerDownloadReceivers();
            audioHelper = this.H;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
        if (audioHelper != null) {
            audioHelper.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.H;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new so.b0(12, new zo.c(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new zo.b(this, 5));
                }
                this.O = true;
                return;
            }
            kotlin.jvm.internal.i.q("audioHelper");
            throw null;
        }
        kotlin.jvm.internal.i.q("audioHelper");
        throw null;
    }

    public final void c0(FirestoreGoal firestoreGoal, Goal goal) {
        String str;
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 9);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerThemeDark, new zo.a(calendar, firestoreGoal, this, goal, 0), calendar.get(11), calendar.get(12), false);
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
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    public final void g0(boolean z10) {
        int i6;
        int i10;
        int i11;
        try {
            Intent intent = new Intent();
            intent.setAction("PLAY_PAUSE");
            RecommendedActivitiesPlaybackActivity O = O();
            int i12 = Build.VERSION.SDK_INT;
            int i13 = 134217728;
            if (i12 >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(O, 13130, intent, i6);
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(requireActivity(), "PlayAudio", null, null);
            this.S = mediaSessionCompat;
            MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
            bVar.d("android.media.metadata.TITLE", Q().getTitle());
            bVar.d("android.media.metadata.ARTIST", Q().getTemplateType());
            mediaSessionCompat.g(bVar.a());
            Intent intent2 = new Intent(O(), RecommendedActivitiesPlaybackActivity.class);
            intent2.setFlags(536870912);
            intent2.putExtra("audio_click", true);
            intent2.setAction(String.valueOf(Calendar.getInstance().getTimeInMillis()));
            RecommendedActivitiesPlaybackActivity O2 = O();
            if (i12 >= 23) {
                i13 = 201326592;
            }
            PendingIntent activity = PendingIntent.getActivity(O2, 0, intent2, i13);
            Object systemService = requireActivity().getSystemService("notification");
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
            t tVar = new t(requireActivity().getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            a0 a0Var = this.R;
            if (a0Var != null && a0Var.isPlaying()) {
                i11 = R.drawable.ic_pause_circle_filled;
            } else {
                i11 = R.drawable.ic_play_circle_filled;
            }
            tVar.a(i11, "", broadcast);
            tVar.e(Q().getTitle());
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
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                tVar.h(bitmap);
                String MANUFACTURER = Build.MANUFACTURER;
                kotlin.jvm.internal.i.f(MANUFACTURER, "MANUFACTURER");
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.i.f(locale, "getDefault()");
                String lowerCase = MANUFACTURER.toLowerCase(locale);
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!gv.r.J0(lowerCase, "huawei") || i12 > 22) {
                    if (i12 < 30) {
                        p1.b bVar2 = new p1.b();
                        MediaSessionCompat mediaSessionCompat2 = this.S;
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
            LogHelper.INSTANCE.e(this.f39693u, "exception", e10);
        }
    }

    public final void h0() {
        int i6;
        int i10;
        long j10;
        try {
            if (isAdded()) {
                a0 a0Var = this.R;
                if (a0Var != null) {
                    j10 = a0Var.getCurrentPosition();
                } else {
                    j10 = 0;
                }
                double d10 = j10 / this.I;
                if (d10 <= 0.0d) {
                    d10 = 0.001d;
                }
                this.Q = d10;
                if (!this.K) {
                    ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbRASeek)).setProgress((int) (this.Q * ((double) Constants.TIMEOUT_MS)));
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
                    sb2.append(timeUnit.toMinutes(this.I));
                    sb2.append(':');
                    long j11 = j10;
                    String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(this.I) - timeUnit2.toSeconds(timeUnit.toMinutes(this.I)))}, 1));
                    kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                    sb2.append(format2);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setText(sb2.toString());
                    this.V = timeUnit.toSeconds(j11);
                    this.U = String.valueOf(timeUnit.toSeconds(j11));
                    long j12 = this.P;
                    if (minutes > j12) {
                        this.P = minutes;
                        StatPersistence statPersistence = StatPersistence.INSTANCE;
                        String P = P();
                        String title = Q().getTitle();
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        statPersistence.addOrIncrementAudioMinutes(P, title, minutes - j12, currentCourseName);
                    }
                }
            }
            Handler handler = this.G;
            tl.o oVar = this.c0;
            handler.removeCallbacks(oVar);
            a0 a0Var2 = this.R;
            if (a0Var2 != null) {
                i10 = a0Var2.p();
                i6 = 1;
            } else {
                i6 = 1;
                i10 = 1;
            }
            if (i10 != i6 && i10 != 4) {
                handler.postDelayed(oVar, 200L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    public final void j0(boolean z10) {
        String str;
        try {
            if (isAdded()) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.pbRAPlayBuffer)).setVisibility(8);
                this.L = z10;
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    if (utils.checkConnectivity(requireActivity()) && (str = this.W.get("audio_failed_toast")) != null) {
                        utils.showCustomToast(requireActivity(), str);
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setImageResource(R.drawable.ic_ra_replay);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvRAProgress)).setVisibility(0);
                } else if (!this.O && !this.N) {
                    b0();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, "exception", e10);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        AudioManager audioManager;
        a0 a0Var;
        try {
            Object systemService = O().getSystemService("audio");
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
                                if (this.f39697y && (a0Var = this.R) != null && !a0Var.isPlaying()) {
                                    Z(true);
                                } else {
                                    a0 a0Var2 = this.R;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.f39698z, 0);
                                    }
                                }
                                this.f39697y = false;
                                return;
                            }
                            return;
                        }
                        this.f39697y = false;
                        Z(true);
                        return;
                    }
                    a0 a0Var3 = this.R;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.f39697y = true;
                        Z(false);
                        return;
                    }
                    return;
                }
                this.f39698z = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_recommended_activity_audio, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            MyApplication.V.a().F = false;
            AudioHelper audioHelper = this.H;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.H;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            }
            requireActivity().unregisterReceiver(this.f39691b0);
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            a0 a0Var = this.R;
            if (a0Var != null) {
                a0Var.a();
            }
            this.G.removeCallbacksAndMessages(null);
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39692d0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            a0 a0Var = this.R;
            if (a0Var != null && a0Var.isPlaying()) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).g();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onpause", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            a0 a0Var = this.R;
            if (a0Var != null && a0Var.isPlaying()) {
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavRAAnimation)).j();
            }
            MediaSessionCompat mediaSessionCompat = this.S;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.e(true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onResume", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        try {
            super.onStop();
            MediaSessionCompat mediaSessionCompat = this.S;
            if (mediaSessionCompat != null) {
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.e(false);
                } else {
                    kotlin.jvm.internal.i.q("mediaSessionCompat");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39693u, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|21|(4:23|24|25|28)(28:102|103|104|(1:106)|107|108|(2:110|(1:176)(1:114))|(4:178|(1:180)|181|(1:187)(1:185))|188|(1:201)(1:192)|(3:194|(1:196)(1:199)|197)|200|124|(1:126)(1:174)|127|(3:129|(1:131)(1:169)|(11:133|134|(3:136|(1:138)(1:145)|(3:140|(1:142)(1:144)|143))|146|(3:148|(1:150)(1:165)|(8:152|(1:154)(2:163|164)|155|(2:158|156)|159|160|161|162))|166|167|91|92|93|(2:95|96)(1:98)))|170|(1:172)(1:173)|134|(0)|146|(0)|166|167|91|92|93|(0)(0))|89|90|91|92|93|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0210, code lost:
        if (kotlin.jvm.internal.i.b(r6, "goals") != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0212, code lost:
        ((com.theinnerhour.b2b.widgets.RobertoButton) _$_findCachedViewById(com.theinnerhour.b2b.R.id.btnRAStroke)).setVisibility(0);
        M();
        r19.D = false;
        r19.C = true;
        r3 = O().getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022f, code lost:
        if (r3 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0231, code lost:
        r3 = r3.getStringExtra("source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023b, code lost:
        if (kotlin.jvm.internal.i.b(r3, "goals") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023d, code lost:
        r0 = (androidx.appcompat.widget.AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivRABackCta);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0246, code lost:
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0248, code lost:
        r0.setImageResource(com.theinnerhour.b2b.R.drawable.ic_close_icon);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x043d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x043e, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
        if (r6 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
        if (r6 == false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d9 A[Catch: Exception -> 0x03c5, TryCatch #4 {Exception -> 0x03c5, blocks: (B:27:0x0081, B:28:0x0091, B:30:0x0096, B:33:0x009e, B:34:0x00aa, B:37:0x00b2, B:38:0x00be, B:41:0x00c6, B:42:0x00d2, B:45:0x00da, B:46:0x00e6, B:49:0x00ee, B:50:0x00f9, B:53:0x0100, B:54:0x010b, B:57:0x0112, B:58:0x011d, B:61:0x0124, B:62:0x012f, B:65:0x0136, B:66:0x0141, B:69:0x0148, B:71:0x0158, B:75:0x0165, B:78:0x01a3, B:80:0x01ab, B:109:0x0212, B:111:0x0231, B:113:0x0237, B:115:0x023d, B:117:0x0248, B:119:0x0279, B:123:0x02a3, B:125:0x02a7, B:130:0x02b6, B:135:0x02cb, B:137:0x02d9, B:142:0x02e4, B:146:0x02fb, B:147:0x030b, B:149:0x0315, B:154:0x0320, B:156:0x0342, B:165:0x037f, B:157:0x0345, B:174:0x03a0, B:131:0x02ba, B:134:0x02c6, B:86:0x01b9, B:89:0x01d0, B:91:0x01da, B:96:0x01e6, B:98:0x01f0, B:103:0x01fc, B:105:0x0206, B:107:0x020c, B:118:0x024f, B:159:0x034d, B:160:0x035a, B:162:0x0360, B:163:0x037c), top: B:193:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315 A[Catch: Exception -> 0x03c5, TryCatch #4 {Exception -> 0x03c5, blocks: (B:27:0x0081, B:28:0x0091, B:30:0x0096, B:33:0x009e, B:34:0x00aa, B:37:0x00b2, B:38:0x00be, B:41:0x00c6, B:42:0x00d2, B:45:0x00da, B:46:0x00e6, B:49:0x00ee, B:50:0x00f9, B:53:0x0100, B:54:0x010b, B:57:0x0112, B:58:0x011d, B:61:0x0124, B:62:0x012f, B:65:0x0136, B:66:0x0141, B:69:0x0148, B:71:0x0158, B:75:0x0165, B:78:0x01a3, B:80:0x01ab, B:109:0x0212, B:111:0x0231, B:113:0x0237, B:115:0x023d, B:117:0x0248, B:119:0x0279, B:123:0x02a3, B:125:0x02a7, B:130:0x02b6, B:135:0x02cb, B:137:0x02d9, B:142:0x02e4, B:146:0x02fb, B:147:0x030b, B:149:0x0315, B:154:0x0320, B:156:0x0342, B:165:0x037f, B:157:0x0345, B:174:0x03a0, B:131:0x02ba, B:134:0x02c6, B:86:0x01b9, B:89:0x01d0, B:91:0x01da, B:96:0x01e6, B:98:0x01f0, B:103:0x01fc, B:105:0x0206, B:107:0x020c, B:118:0x024f, B:159:0x034d, B:160:0x035a, B:162:0x0360, B:163:0x037c), top: B:193:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v26, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        RecommendedActivityModel recommendedActivityModel;
        hs.k kVar;
        HashMap<String, String> hashMap;
        Iterator<RecommendedActivityContentModel> it;
        boolean z10;
        String str3;
        boolean z11;
        boolean z12;
        String backgroundUrl;
        String lottieUrl;
        boolean z13;
        BufferedReader bufferedReader;
        boolean z14;
        boolean z15;
        boolean z16;
        String str4;
        boolean z17 = this.f39690a0;
        String str5 = this.f39693u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                recommendedActivityModel = (RecommendedActivityModel) arguments.getParcelable("model");
            } else {
                recommendedActivityModel = null;
            }
            if (!(recommendedActivityModel instanceof RecommendedActivityModel)) {
                recommendedActivityModel = null;
            }
            if (recommendedActivityModel != null) {
                this.f39694v = recommendedActivityModel;
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            hashMap = this.W;
            if (kVar == null) {
                Utils utils = Utils.INSTANCE;
                if (utils.checkConnectivity(requireActivity()) && (str4 = hashMap.get("audio_failed_toast")) != null) {
                    utils.showCustomToast(requireActivity(), str4);
                }
                requireActivity().finish();
            }
            ArrayList<RecommendedActivityContentModel> activityContent = Q().getActivityContent();
            kotlin.jvm.internal.i.d(activityContent);
            it = activityContent.iterator();
        } catch (Exception e10) {
            e = e10;
            str = str5;
        }
        while (true) {
            str = str5;
            if (it.hasNext()) {
                try {
                    RecommendedActivityContentModel next = it.next();
                    Iterator<RecommendedActivityContentModel> it2 = it;
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
                        case -1811715588:
                            if (!label.equals("download_failed_toast")) {
                                break;
                            } else {
                                String downloadFailedToast = next.getDownloadFailedToast();
                                kotlin.jvm.internal.i.d(downloadFailedToast);
                                hashMap.put("download_failed_toast", downloadFailedToast);
                                break;
                            }
                        case -1500298176:
                            if (!label.equals("gif_failed_toast")) {
                                break;
                            } else {
                                String gifFailedToast = next.getGifFailedToast();
                                kotlin.jvm.internal.i.d(gifFailedToast);
                                hashMap.put("gif_failed_toast", gifFailedToast);
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
                        case 213459000:
                            if (!label.equals("download_complete_toast")) {
                                break;
                            } else {
                                String downloadCompleteToast = next.getDownloadCompleteToast();
                                kotlin.jvm.internal.i.d(downloadCompleteToast);
                                hashMap.put("download_complete_toast", downloadCompleteToast);
                                break;
                            }
                        case 1267918190:
                            if (!label.equals("audio_failed_toast")) {
                                break;
                            } else {
                                String audioFailedToast = next.getAudioFailedToast();
                                kotlin.jvm.internal.i.d(audioFailedToast);
                                hashMap.put("audio_failed_toast", audioFailedToast);
                                break;
                            }
                        case 1515006508:
                            if (!label.equals("download_progress_toast")) {
                                break;
                            } else {
                                String downloadProgressToast = next.getDownloadProgressToast();
                                kotlin.jvm.internal.i.d(downloadProgressToast);
                                hashMap.put("download_progress_toast", downloadProgressToast);
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
                    str5 = str;
                    it = it2;
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                String audioUrl = Q().getAudioUrl();
                if (audioUrl == null) {
                    audioUrl = "";
                }
                this.f39695w = audioUrl;
                kotlin.jvm.internal.i.b(Q().getTemplateType(), "Audio");
                androidx.fragment.app.p requireActivity = requireActivity();
                kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity");
                this.A = (RecommendedActivitiesPlaybackActivity) requireActivity;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("PLAY_PAUSE");
                requireActivity().registerReceiver(this.f39691b0, intentFilter);
                MyApplication.V.a().F = true;
                if (z17) {
                    FirestoreGoal firestoreGoal = S().C;
                    if (firestoreGoal != null && firestoreGoal.isVisible()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                if (!z17) {
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    String goalId = Q().getGoalId();
                    String domain = Q().getDomain();
                    if (domain == null) {
                        domain = "";
                    }
                    Goal goalById = firebasePersistence.getGoalById(goalId, UtilsKt.getCourseId(domain));
                    if (goalById != null && goalById.isVisible()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                Intent intent = O().getIntent();
                if (intent != null && intent.hasExtra("source")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Intent intent2 = O().getIntent();
                    if (intent2 != null) {
                        str3 = intent2.getStringExtra("source");
                    } else {
                        str3 = null;
                    }
                }
                this.D = true;
                this.C = false;
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setText(hashMap.get("cta_goal_add"));
                ((RobertoButton) _$_findCachedViewById(R.id.btnRASolid)).setText(hashMap.get("cta_done"));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvRATitle)).setText(Q().getTitle());
                Utils utils2 = Utils.INSTANCE;
                String P = P();
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                if (utils2.getAudioFilePath(P, requireContext) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.N = z12;
                if (!z12) {
                    if (P().length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        b0();
                        U(false);
                        backgroundUrl = Q().getBackgroundUrl();
                        if (backgroundUrl != null) {
                            if (backgroundUrl.length() > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                com.bumptech.glide.f i6 = Glide.i(requireActivity());
                                Context requireContext2 = requireContext();
                                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                                String audioFilePath = utils2.getAudioFilePath(backgroundUrl, requireContext2);
                                if (audioFilePath != null) {
                                    backgroundUrl = audioFilePath;
                                }
                                i6.p(backgroundUrl).B((AppCompatImageView) _$_findCachedViewById(R.id.ivRAbg));
                            }
                        }
                        lottieUrl = Q().getLottieUrl();
                        if (lottieUrl != null) {
                            if (lottieUrl.length() > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                x xVar = new x();
                                xVar.f23469u = "";
                                Context requireContext3 = requireContext();
                                kotlin.jvm.internal.i.f(requireContext3, "requireContext()");
                                FileInputStream fileInputStream = new FileInputStream(utils2.getAudioFilePath(lottieUrl, requireContext3));
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
                                hs.k kVar2 = hs.k.f19476a;
                                ca.a.z(bufferedReader, null);
                                fileInputStream.close();
                                a3.d.d((String) xVar.f23469u).b(new pl.i(this, xVar, 3));
                            }
                        }
                        new cg.a(1).a(Q().getGoalId());
                        v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new zo.d(this, null), 3);
                        str2 = str;
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new zo.b(this, 0));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new zo.b(this, 1));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new zo.b(this, 2));
                        ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new zo.b(this, 3));
                        ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new zo.b(this, 4));
                        ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new zo.g(this));
                        if (z17) {
                            S().D.e(getViewLifecycleOwner(), new so.b0(11, new c()));
                            return;
                        }
                        return;
                    }
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivRADownloadCta);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
                U(false);
                backgroundUrl = Q().getBackgroundUrl();
                if (backgroundUrl != null) {
                }
                lottieUrl = Q().getLottieUrl();
                if (lottieUrl != null) {
                }
                new cg.a(1).a(Q().getGoalId());
                v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new zo.d(this, null), 3);
                str2 = str;
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new zo.b(this, 0));
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new zo.b(this, 1));
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new zo.b(this, 2));
                ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new zo.b(this, 3));
                ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new zo.b(this, 4));
                ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new zo.g(this));
                if (z17) {
                }
            }
            e = e11;
            str2 = str;
            LogHelper.INSTANCE.e(str2, e);
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRABackCta)).setOnClickListener(new zo.b(this, 0));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAHintCta)).setOnClickListener(new zo.b(this, 1));
            ((AppCompatImageView) _$_findCachedViewById(R.id.ivRAPlayPause)).setOnClickListener(new zo.b(this, 2));
            ((RobertoButton) _$_findCachedViewById(R.id.btnRAStroke)).setOnClickListener(new zo.b(this, 3));
            ((ConstraintLayout) _$_findCachedViewById(R.id.clRAClickableArea)).setOnClickListener(new zo.b(this, 4));
            ((MotionLayout) _$_findCachedViewById(R.id.mlRAMain)).setTransitionListener(new zo.g(this));
            if (z17) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        kotlin.jvm.internal.i.g(error, "error");
        j0(true);
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
