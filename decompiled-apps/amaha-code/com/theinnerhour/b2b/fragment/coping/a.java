package com.theinnerhour.b2b.fragment.coping;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
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
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import androidx.work.u;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.w;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivitiesActivity;
import com.theinnerhour.b2b.activity.AudioTempActivity;
import com.theinnerhour.b2b.activity.CopingActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MascotAnimationUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import com.theinnerhour.b2b.widgets.TemplateCircularSlider;
import f0.t;
import fm.j0;
import fq.s;
import g0.a;
import gv.n;
import gv.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.l;
import ta.v;
import tl.o;
/* compiled from: StressRelaxingActivityFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/fragment/coping/a;", "Lrr/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Lcom/google/android/exoplayer2/w$d;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "c", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends rr.b implements AudioManager.OnAudioFocusChangeListener, w.d {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f11685k0 = 0;
    public String A;
    public TemplateCircularSlider B;
    public boolean C;
    public boolean D;
    public AudioFocusRequest E;
    public int F;
    public boolean I;
    public boolean J;
    public GoalNotificationContent K;
    public AppCompatImageView L;
    public RobertoTextView M;
    public AudioHelper O;
    public long P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public a0 X;
    public long Y;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public fm.a f11689f0;

    /* renamed from: v  reason: collision with root package name */
    public String f11695v;

    /* renamed from: w  reason: collision with root package name */
    public String f11696w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f11697x;

    /* renamed from: y  reason: collision with root package name */
    public ViewPager f11698y;

    /* renamed from: z  reason: collision with root package name */
    public GoalType f11699z;

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashMap f11693j0 = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f11694u = LogHelper.INSTANCE.makeLogTag(a.class);
    public final ArrayList<AnimatorSet> G = new ArrayList<>();
    public final ArrayList<Animator> H = new ArrayList<>();
    public String N = "";
    public double W = 0.001d;
    public final Handler Z = new Handler();

    /* renamed from: a0  reason: collision with root package name */
    public final int f11686a0 = 5000;

    /* renamed from: b0  reason: collision with root package name */
    public final Handler f11687b0 = new Handler();
    public final j c0 = new j();

    /* renamed from: d0  reason: collision with root package name */
    public final yn.a f11688d0 = new yn.a();

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f11690g0 = sp.b.K();

    /* renamed from: h0  reason: collision with root package name */
    public final g f11691h0 = new g();

    /* renamed from: i0  reason: collision with root package name */
    public final o f11692i0 = new o(21, this);

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* renamed from: com.theinnerhour.b2b.fragment.coping.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class AsyncTaskC0167a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final String f11700a;

        public AsyncTaskC0167a(String str) {
            this.f11700a = str;
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            Void[] voids = voidArr;
            String str = this.f11700a;
            kotlin.jvm.internal.i.g(voids, "voids");
            try {
                sf.i iVar = new sf.i();
                kotlin.jvm.internal.i.d(str);
                String concat = "interacted_thrice_goal_id_".concat(str);
                String concat2 = "interaction_timestamps_".concat(str);
                if (!ApplicationPersistence.getInstance().getBooleanValue(concat, false)) {
                    String stringValue = ApplicationPersistence.getInstance().getStringValue(concat2);
                    HashSet hashSet = new HashSet();
                    if (!kotlin.jvm.internal.i.b(stringValue, "")) {
                        Object c10 = iVar.c(stringValue, new TypeToken<HashSet<Long>>() { // from class: com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment$AppFeedbackAsyncTask$doInBackground$1
                        }.getType());
                        kotlin.jvm.internal.i.f(c10, "gson.fromJson(temp, obje…                  }.type)");
                        hashSet = (HashSet) c10;
                    }
                    hashSet.add(Long.valueOf(Utils.INSTANCE.getTodayCalendar().getTimeInMillis()));
                    ApplicationPersistence.getInstance().setStringValue(concat2, iVar.g(hashSet));
                    if (hashSet.size() >= 2) {
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, true);
                        ApplicationPersistence.getInstance().setStringValue(Constants.APP_FEEDBACK_TRIGGER, "single_habit_goal");
                        ApplicationPersistence.getInstance().setBooleanValue(concat, true);
                    }
                }
                if (!ApplicationPersistence.getInstance().getBooleanValue("interacted_five_goals_shown", false)) {
                    String stringValue2 = ApplicationPersistence.getInstance().getStringValue("interaction_goal_ids");
                    HashSet hashSet2 = new HashSet();
                    if (!kotlin.jvm.internal.i.b(stringValue2, "")) {
                        Object c11 = iVar.c(stringValue2, new TypeToken<HashSet<String>>() { // from class: com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment$AppFeedbackAsyncTask$doInBackground$2
                        }.getType());
                        kotlin.jvm.internal.i.f(c11, "gson.fromJson(temp, obje…                  }.type)");
                        hashSet2 = (HashSet) c11;
                    }
                    hashSet2.add(str);
                    ApplicationPersistence.getInstance().setStringValue("interaction_goal_ids", iVar.g(hashSet2));
                    if (hashSet2.size() >= 3) {
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, true);
                        ApplicationPersistence.getInstance().setStringValue(Constants.APP_FEEDBACK_TRIGGER, "three_habit_goals");
                        ApplicationPersistence.getInstance().setBooleanValue("interacted_five_goals_shown", true);
                        return null;
                    }
                    return null;
                }
                return null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(Constants.COURSE_STRESS, "exception", e10);
                return null;
            }
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public final class b extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f11701c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f11702d;

        public b(p pVar, ArrayList arrayList) {
            this.f11701c = pVar;
            this.f11702d = new ArrayList<>();
            this.f11702d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f11702d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f11701c).inflate(R.layout.row_relaxation_activity_pager, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.activityTips);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(this.f11702d.get(i6));
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

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements TemplateCircularSlider.a {
        public d() {
        }

        @Override // com.theinnerhour.b2b.widgets.TemplateCircularSlider.a
        public final void a(float f) {
            String str;
            a aVar = a.this;
            a0 a0Var = aVar.X;
            if (a0Var != null) {
                float f2 = f / 360;
                a0Var.f0(((float) aVar.P) * f2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long minutes = timeUnit.toMinutes(((float) aVar.P) * f2);
                RobertoTextView S = aVar.S();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(timeUnit.toMinutes(((float) aVar.P) * f2));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(((float) aVar.P) * f2);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(f2 * ((float) aVar.P))))}, 1));
                kotlin.jvm.internal.i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(aVar.P));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(aVar.P) - timeUnit2.toSeconds(timeUnit.toMinutes(aVar.P)))}, 1));
                kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                sb2.append(format2);
                S.setText(sb2.toString());
                long j10 = aVar.Y;
                if (minutes > j10) {
                    long j11 = minutes - j10;
                    aVar.Y = minutes;
                    StatPersistence statPersistence = StatPersistence.INSTANCE;
                    String str2 = aVar.A;
                    RobertoTextView robertoTextView = aVar.M;
                    if (robertoTextView != null) {
                        CharSequence text = robertoTextView.getText();
                        if (text != null) {
                            str = text.toString();
                        } else {
                            str = null;
                        }
                    } else {
                        str = "";
                    }
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                    statPersistence.addOrIncrementAudioMinutes(str2, str, j11, currentCourseName);
                }
            }
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            Intent intent;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) fVar2.f19465v;
                boolean z11 = true;
                if (firestoreGoal != null && firestoreGoal.isVisible()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a aVar = a.this;
                aVar.e0 = z10;
                if (!z10) {
                    p activity = aVar.getActivity();
                    if (!((activity == null || (intent = activity.getIntent()) == null || !intent.hasExtra("source")) ? false : false)) {
                        ((RobertoButton) aVar._$_findCachedViewById(R.id.btnSubmitLogin)).setText("ADD GOAL");
                        ((RobertoButton) aVar._$_findCachedViewById(R.id.btnSubmitLogin)).setOnClickListener(new kq.d(aVar, 9));
                    }
                }
                ((RobertoButton) aVar._$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(0);
                ((RobertoButton) aVar._$_findCachedViewById(R.id.btnSubmitLogin)).setText("DONE");
                ((RobertoButton) aVar._$_findCachedViewById(R.id.btnSubmitLogin)).setOnClickListener(new kq.d(aVar, 9));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ x<Goal> f11708v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x<com.google.android.material.bottomsheet.f> f11709w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x<Goal> xVar, x<com.google.android.material.bottomsheet.f> xVar2) {
            super(1);
            this.f11708v = xVar;
            this.f11709w = xVar2;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i6 = a.f11685k0;
                a.this.r0(null, this.f11708v.f23469u);
            }
            com.google.android.material.bottomsheet.f fVar = this.f11709w.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            a0 a0Var;
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            if (kotlin.jvm.internal.i.b(intent.getAction(), "PLAY_PAUSE")) {
                a aVar = a.this;
                if (aVar.isAdded()) {
                    if (!aVar.I && (((a0Var = aVar.X) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || aVar.Q))) {
                        if (!ConnectionStatusReceiver.isConnected()) {
                            if (!aVar.J) {
                                aVar.w0(true);
                                return;
                            }
                            return;
                        } else if (ConnectionStatusReceiver.isConnected()) {
                            aVar.w0(false);
                            aVar.a0(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    aVar.h0(true);
                }
            }
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment$setupDownload$1", f = "StressRelaxingActivityFragment.kt", l = {591, 592}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11711u;

        /* compiled from: StressRelaxingActivityFragment.kt */
        @ns.e(c = "com.theinnerhour.b2b.fragment.coping.StressRelaxingActivityFragment$setupDownload$1$1", f = "StressRelaxingActivityFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.theinnerhour.b2b.fragment.coping.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0168a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f11713u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ int f11714v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0168a(a aVar, int i6, ls.d<? super C0168a> dVar) {
                super(2, dVar);
                this.f11713u = aVar;
                this.f11714v = i6;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0168a(this.f11713u, this.f11714v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0168a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                int i6;
                sp.b.d0(obj);
                a aVar = this.f11713u;
                if (aVar.isAdded() && ((ProgressBar) aVar._$_findCachedViewById(R.id.downloadBtnProgress)) != null && ((ProgressBar) aVar._$_findCachedViewById(R.id.downloadBtnProgress)).getProgress() < 100 && ((RobertoTextView) aVar._$_findCachedViewById(R.id.downloadSize)) != null && (i6 = this.f11714v) > 0) {
                    RobertoTextView robertoTextView = (RobertoTextView) aVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) aVar._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView2 != null) {
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{new Double(i6 * 9.5367432E-7d)}, 1));
                        kotlin.jvm.internal.i.f(format, "format(format, *args)");
                        robertoTextView2.setText(format.concat("MB"));
                    }
                }
                return hs.k.f19476a;
            }
        }

        public h(ls.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new h(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11711u;
            a aVar2 = a.this;
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
                String str = aVar2.A;
                kotlin.jvm.internal.i.d(str);
                this.f11711u = 1;
                obj = a.K(aVar2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            int intValue = ((Number) obj).intValue();
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            C0168a c0168a = new C0168a(aVar2, intValue, null);
            this.f11711u = 2;
            if (v.S(k1Var, c0168a, this) == aVar) {
                return aVar;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends k implements l<u.a, hs.k> {
        public i() {
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
            a aVar2 = a.this;
            aVar2.R = z10;
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5 && aVar2.isAdded()) {
                                    Utils.INSTANCE.showCustomToast(aVar2.getContext(), "Download Cancelled");
                                }
                            } else if (aVar2.isAdded()) {
                                Utils.INSTANCE.showCustomToast(aVar2.getContext(), "Download Failed");
                            }
                        } else {
                            if (aVar2.isAdded()) {
                                Utils.INSTANCE.showCustomToast(aVar2.getContext(), "Download failed. Please check your internet connection.");
                            }
                            ProgressBar progressBar = (ProgressBar) aVar2._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar != null) {
                                progressBar.setProgress(0);
                            }
                            ProgressBar progressBar2 = (ProgressBar) aVar2._$_findCachedViewById(R.id.downloadBtnProgress);
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(8);
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) aVar2._$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView != null) {
                                appCompatImageView.setVisibility(0);
                            }
                            aVar2.R = false;
                        }
                    }
                } else if (aVar2.isAdded()) {
                    Utils.INSTANCE.showCustomToast(aVar2.getContext(), "Download Started");
                }
                return hs.k.f19476a;
            }
            if (aVar2.isAdded()) {
                Utils utils = Utils.INSTANCE;
                String str = aVar2.A;
                kotlin.jvm.internal.i.d(str);
                Context requireContext = aVar2.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                if (utils.getAudioFilePath(str, requireContext) != null) {
                    utils.showCustomToast(aVar2.getContext(), "Download Completed");
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) aVar2._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_cloud_download_done);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) aVar2._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setOnClickListener(null);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) aVar2._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) aVar2._$_findCachedViewById(R.id.downloadSize);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ProgressBar progressBar3 = (ProgressBar) aVar2._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(8);
                    }
                    aVar2.I = true;
                    aVar2.a0(true);
                } else {
                    ProgressBar progressBar4 = (ProgressBar) aVar2._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar4 != null) {
                        progressBar4.setVisibility(0);
                    }
                    ProgressBar progressBar5 = (ProgressBar) aVar2._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar5 != null) {
                        progressBar5.setProgress(0);
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) aVar2._$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            int currentItem = aVar.Z().getCurrentItem();
            k2.a adapter = aVar.Z().getAdapter();
            kotlin.jvm.internal.i.d(adapter);
            if (currentItem == adapter.g() - 1) {
                aVar.Z().v(0);
            } else {
                aVar.Z().v(aVar.Z().getCurrentItem() + 1);
            }
            aVar.f11687b0.postDelayed(this, aVar.f11686a0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(a aVar, String str, ls.d dVar) {
        kq.e eVar;
        int i6;
        kotlin.jvm.internal.v vVar;
        aVar.getClass();
        if (dVar instanceof kq.e) {
            eVar = (kq.e) dVar;
            int i10 = eVar.f23799x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f23799x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f23797v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = eVar.f23799x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        vVar = eVar.f23796u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f23467u = -1;
                    kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                    kq.f fVar = new kq.f(str, vVar2, null);
                    eVar.f23796u = vVar2;
                    eVar.f23799x = 1;
                    if (v.S(bVar, fVar, eVar) != aVar2) {
                        vVar = vVar2;
                    } else {
                        return aVar2;
                    }
                }
                return new Integer(vVar.f23467u);
            }
        }
        eVar = new kq.e(aVar, dVar);
        Object obj2 = eVar.f23797v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = eVar.f23799x;
        if (i6 == 0) {
        }
        return new Integer(vVar.f23467u);
    }

    @Override // rr.b
    public final rr.b F() {
        if (getActivity() instanceof CopingActivity) {
            kq.k kVar = new kq.k();
            kVar.setArguments(getArguments());
            return kVar;
        } else if (getActivity() instanceof ActivitiesActivity) {
            cq.b bVar = new cq.b();
            bVar.setArguments(getArguments());
            return bVar;
        } else {
            return null;
        }
    }

    public final void J() {
        Object obj;
        p activity = getActivity();
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
                AudioFocusRequest audioFocusRequest = this.E;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this);
        }
    }

    public final void M(int i6, int i10) {
        try {
            View[] viewArr = new View[i10];
            ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).removeAllViews();
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)), false);
                viewArr[i11] = inflate;
                kotlin.jvm.internal.i.d(inflate);
                p requireActivity = requireActivity();
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(requireActivity, R.drawable.circle_filled_grey));
                ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).addView(viewArr[i11]);
            }
            if (i10 == 0) {
                z10 = true;
            }
            if (!z10) {
                View view = viewArr[i6];
                kotlin.jvm.internal.i.d(view);
                p requireActivity2 = requireActivity();
                Object obj2 = g0.a.f16164a;
                view.setBackground(a.c.b(requireActivity2, R.drawable.thumb));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void O(boolean z10) {
        try {
            if (isAdded()) {
                if (z10) {
                    AppCompatImageView appCompatImageView = this.L;
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(R.drawable.anim_play_to_pause);
                    } else {
                        kotlin.jvm.internal.i.q("play");
                        throw null;
                    }
                } else {
                    AppCompatImageView appCompatImageView2 = this.L;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.anim_pause_to_play);
                    } else {
                        kotlin.jvm.internal.i.q("play");
                        throw null;
                    }
                }
                AppCompatImageView appCompatImageView3 = this.L;
                if (appCompatImageView3 != null) {
                    if (appCompatImageView3.getDrawable() instanceof Animatable) {
                        AppCompatImageView appCompatImageView4 = this.L;
                        if (appCompatImageView4 != null) {
                            Drawable drawable = appCompatImageView4.getDrawable();
                            kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                            ((Animatable) drawable).start();
                            return;
                        }
                        kotlin.jvm.internal.i.q("play");
                        throw null;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("play");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "Exception in animate play button", e10);
        }
    }

    public final void P(AppCompatImageView appCompatImageView) {
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
        this.G.add(animatorSet);
    }

    public final void Q() {
        if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.RECOMMENDED_ACTIVITIES_FEEDBACK_SHOWN, false)) {
            int intValue = ApplicationPersistence.getInstance().getIntValue(Constants.RECOMMENDED_ACTIVITIES_PLAYBACK_COUNTER, 0) + 1;
            ApplicationPersistence.getInstance().setIntValue(Constants.RECOMMENDED_ACTIVITIES_PLAYBACK_COUNTER, intValue);
            if (intValue >= 5 && ApplicationPersistence.getInstance().getLongValue("dc_v2_app_open_seq", 1L) >= 3) {
                if (ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE) == 0) {
                    ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                }
                if (TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - ApplicationPersistence.getInstance().getLongValue(Constants.APP_FEEDBACK_DATE), TimeUnit.MILLISECONDS) > 1) {
                    this.T = true;
                }
            }
        }
    }

    public final RobertoTextView S() {
        RobertoTextView robertoTextView = this.f11697x;
        if (robertoTextView != null) {
            return robertoTextView;
        }
        kotlin.jvm.internal.i.q("audioPlayProgress");
        throw null;
    }

    public final TemplateCircularSlider U() {
        TemplateCircularSlider templateCircularSlider = this.B;
        if (templateCircularSlider != null) {
            return templateCircularSlider;
        }
        kotlin.jvm.internal.i.q("audioProgress");
        throw null;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        v0();
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    this.Y = 0L;
                    this.W = 0.001d;
                    a0(false);
                    u0(false);
                    u0(false);
                    if (this.T && this.U) {
                        a0 a0Var = this.X;
                        if (a0Var != null && a0Var.isPlaying()) {
                            a0 a0Var2 = this.X;
                            if (a0Var2 != null) {
                                a0Var2.z(false);
                            } else {
                                kotlin.jvm.internal.i.q("simpleExoplayer");
                                throw null;
                            }
                        }
                        q0();
                        return;
                    }
                    return;
                }
                return;
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            a0 a0Var3 = this.X;
            if (a0Var3 != null) {
                this.P = a0Var3.getDuration();
                U().setVisibility(0);
                S().setVisibility(0);
                AppCompatImageView appCompatImageView = this.L;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                    AppCompatImageView appCompatImageView2 = this.L;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setClickable(true);
                        U().setDisableTouch(false);
                        return;
                    }
                    kotlin.jvm.internal.i.q("play");
                    throw null;
                }
                kotlin.jvm.internal.i.q("play");
                throw null;
            }
            kotlin.jvm.internal.i.q("simpleExoplayer");
            throw null;
        }
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar);
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = this.L;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        } else {
            kotlin.jvm.internal.i.q("play");
            throw null;
        }
    }

    public final String X() {
        String str = this.f11696w;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("courseId");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0230, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_WORRY_GOOD_LAUGH) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0234, code lost:
        defpackage.c.B(r1, "Watch a short, funny video on YouTube or a comedy show on TV.", "Read a comic book.", "Call and talk to someone who often makes you laugh and talk to them about anything you might want.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b8, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_WORRY_CYCLING) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d9, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_DEPRESSION_SPEND_TIME_IN_NATURE) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02dd, code lost:
        defpackage.c.B(r1, "Go for a walk in a nearby park or garden.", "Avoid using your phone or any other gadget.", "Try to focus on your immediate surroundings.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0314, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_WORRY_WALKING) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_GET_ORGANISED) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0337, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_TALK_TO_A_FRIEND) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0375, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_SKIPPING_ROPE) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0379, code lost:
        defpackage.c.B(r1, "Spend at least ten minutes skipping rope when you are feeling stressed.", "You can listen to upbeat music while engaging in this activity.", "Try engaging in this activity in a natural, outdoor space like a park.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0388, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_DEPRESSION_TALK_TO_A_FRIEND) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x038c, code lost:
        defpackage.d.p(r1, "Call a friend or close family member and talk through your concerns with them.", r3, "You can use text messaging to reach out to someone as well.", "Call a friend whom you haven't spoken to in a while and catch up with them.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0435, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_STRESS_CLIMBING_STAIRS) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0438, code lost:
        r1.add("When stressed, take a short break and climb up and down four flights of stairs in ten minutes.");
        r1.add("Try climbing up to your apartment on a daily basis so you can do it more easily in times of stress to feel better.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0449, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_CYCLING) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x044c, code lost:
        r1.add("Try cycling in an open area - like a garden or an empty street.");
        r1.add("Ask a friend to join you - exercise is always more fun when you have company.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0473, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_WALKING) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0476, code lost:
        defpackage.d.p(r1, r5, r4, r10, r3);
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_DEPRESSION_GET_ORGANISED) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
        defpackage.c.B(r1, "Start small. Try organising your wallet or bag, placing things in order.", "Clean the kitchen or your bike/car.", "Don't give yourself an unrealistic deadline (such as organising your whole wardrobe in an hour).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_GOOD_LAUGH) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b8, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_STRESS_SKIPPING_ROPE) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021c, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_SPEND_TIME_IN_NATURE) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0226, code lost:
        if (r30.equals(com.theinnerhour.b2b.utils.Constants.ACTIVITY_ID_ANGER_CLIMBING_STAIRS) == false) goto L163;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList<String> Y(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList<String> arrayList = new ArrayList<>();
        switch (str.hashCode()) {
            case -2101990989:
                str2 = "Take a colleague along for a short break.";
                str3 = "Avoid using any gadget when you go for a walk. Instead, focus on your surroundings.";
                str4 = "Listen to soothing music as it can help you feel calmer.";
                str5 = "If you are at work, get up from your desk and go for a walk.";
                str6 = "Walk in a nearby park or garden for ten minutes.";
                break;
            case -2088363465:
                if (str.equals(Constants.ACTIVITY_ID_HAPPINESS_JOGGING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case -1993377699:
                break;
            case -1947842319:
                break;
            case -1943631912:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_TALKING_ABOUT_IT)) {
                    defpackage.c.B(arrayList, "Call a friend or a close family member and talk through your stress with them.", "If you can, meet someone in person.", "You can use text messaging to reach out to someone as well.");
                    break;
                }
                break;
            case -1839790496:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_WALKING)) {
                    defpackage.d.p(arrayList, "Walk in a nearby park or garden for ten minutes.", "If you are at work, get up from your desk and go for a walk.", "Take a colleague along for a short break.", "Avoid using any gadget when you go for a walk and focus on your surroundings.");
                    arrayList.add("Listen to soothing music as it can help you feel calmer.");
                    break;
                }
                break;
            case -1787371166:
                if (str.equals(Constants.ACTIVITY_ID_WORRY_SKIPPING_ROPE)) {
                    defpackage.c.B(arrayList, "Spend at least ten minutes skipping rope when you are feeling worried.", "You can listen to upbeat music while engaging in this activity.", "Try engaging in this activity in a natural, outdoor space like a park.");
                    break;
                }
                break;
            case -1731177206:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_CYCLING)) {
                    arrayList.add("Try cycling in an open area - like a garden or an empty street.");
                    arrayList.add("Ask a friend to join you - exercise is always more fun when you have company.");
                    break;
                }
                break;
            case -1670022663:
                if (str.equals(Constants.ACTIVITY_ID_ANGER_RUNNING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case -1511172490:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_JOGGING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case -1407822170:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_RUNNING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case -1356448718:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_LEND_HELPING_HAND)) {
                    defpackage.c.B(arrayList, "Give someone you know a compliment.", "Give someone a small gift.", "Share your lunch with a coworker.");
                    break;
                }
                break;
            case -1023515774:
                str7 = "If you can, meet someone in person.";
                break;
            case -1014242680:
                break;
            case -1009741699:
                if (str.equals(Constants.ACTIVITY_ID_WORRY_ENGAGE_IN_ENJOYABLE_ACTIVITIES)) {
                    arrayList.add("Try engaging in an activity that has proven to be enjoyable for you in the past.");
                    arrayList.add("The activity need not be elaborate - you can engage in a simple hobby like dancing, singing, swimming.");
                    break;
                }
                break;
            case -949536861:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS)) {
                    arrayList.add("When feeling low, take a short break and climb up and down four flights of stairs in ten minutes.");
                    break;
                }
                break;
            case -779972233:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_HUMOUR_DISTRACTION)) {
                    defpackage.c.B(arrayList, "Watch a short, funny video on YouTube or a comedy show on TV.", "Read a comic book.", "Call and talk to someone who often makes you laugh and talk to them about anything you might want.");
                    break;
                }
                break;
            case -685152767:
                str7 = "If you can, meet someone in person.";
                break;
            case -582152011:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_FRESH_AIR)) {
                    defpackage.d.p(arrayList, "Walking around your house can be as helpful as walking in a nearby park or garden.", "If going outside is not possible, walk around your home/office.", "Try and avoid using your cellphone or any other gadget.", "Try to walk for at least ten minutes.");
                    break;
                }
                break;
            case -451423219:
                str2 = "Take a colleague along for a short break.";
                str3 = "Avoid using any gadget when you go for a walk. Instead, focus on your surroundings.";
                str4 = "Listen to soothing music as it can help you feel calmer.";
                str5 = "If you are at work, get up from your desk and go for a walk.";
                str6 = "Walk in a nearby park or garden for ten minutes.";
                break;
            case -432598909:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_WALKING)) {
                    defpackage.d.p(arrayList, "Walk in a nearby park or garden for ten minutes.", "If you are at work, get up from your desk and go for a walk.", "Take a colleague along for a short break.", "Avoid using any gadget when you go for a walk and focus on your surroundings.");
                    arrayList.add("Listen to soothing music as it can help you feel calmer.");
                    break;
                }
                break;
            case -389303643:
                break;
            case -372549553:
                if (str.equals(Constants.ACTIVITY_ID_ANGER_COUNT_TO_TEN)) {
                    defpackage.d.p(arrayList, "Count either out loud or in your mind.", "Think of something positive while counting to ten.", "Focus on your breathing while counting.", "Try counting backwards, from 10 to 1.");
                    break;
                }
                break;
            case -342809929:
                break;
            case -323985619:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_CYCLING)) {
                    arrayList.add("Try cycling in an open area - like a garden or an empty street.");
                    arrayList.add("Ask a friend to join you - exercise is always more fun when you have company.");
                    break;
                }
                break;
            case -243826668:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_CLIMBING_STAIRS)) {
                    arrayList.add("Take a short break and climb up and down four flights of stairs, if that is physically comfortable.");
                    arrayList.add("Try climbing to your apartment on a daily basis so you can do it more easily, thereby improving the quality of your sleep.");
                    break;
                }
                break;
            case -96365116:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_JOGGING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case -29381434:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_REACH_OUT_TO_PETS)) {
                    arrayList.add("Avoid being on your phone or using any other gadget while spending time with your pet.");
                    arrayList.add("Take your pet for a walk.");
                    break;
                }
                break;
            case -19454893:
                if (str.equals(Constants.ACTIVITY_ID_WORRY_RUNNING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case 21431122:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_FRESH_AIR)) {
                    defpackage.d.p(arrayList, "Walking around your house can be as helpful as walking in a nearby park or garden.", "If going outside is not possible, walk around your home/office.", "Try and avoid using your cellphone or any other gadget.", "Try to walk for at least ten minutes.");
                    break;
                }
                break;
            case 99390045:
                break;
            case 240191969:
                break;
            case 312696228:
                break;
            case 463178451:
                if (str.equals(Constants.ACTIVITY_ID_HAPPINESS_WALKING)) {
                    defpackage.d.p(arrayList, "Walk in a nearby park or garden for ten minutes.", "If you are at work, get up from your desk and go for a walk.", "Take a colleague or friend along for a short break.", "Avoid using any gadget when you go for a walk. Instead, focus on your surroundings.");
                    arrayList.add("Listen to soothing music as it can help you feel calmer.");
                    break;
                }
                break;
            case 571791741:
                if (str.equals(Constants.ACTIVITY_ID_HAPPINESS_CYCLING)) {
                    arrayList.add("Try cycling in an open area - like a garden or an empty street.");
                    arrayList.add("Ask a friend to join you - exercise is always more fun when you have company.");
                    break;
                }
                break;
            case 594699610:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_LISTEN_SOOTHING_MUSIC)) {
                    arrayList.add("Don't try and think about whether you are feeling better. Just focus on the music and try to enjoy it.");
                    arrayList.add("Go for a walk in an outdoor space, so that you can enjoy the added benefit of getting some fresh air.");
                    break;
                }
                break;
            case 620006250:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_GIVE_SOMEONE_HUG)) {
                    arrayList.add("Give a close friend or family member a hug.");
                    arrayList.add("Spend time with a loved one doing something you enjoy.");
                    break;
                }
                break;
            case 900581749:
                break;
            case 1040369426:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_WALKING)) {
                    defpackage.d.p(arrayList, "Walk in a nearby park or garden for ten minutes.", "If you are at work, get up from your desk and go for a walk.", "Take a colleague or friend along for a short break.", "Avoid using any gadget when you go for a walk. Instead, focus on your surroundings.");
                    arrayList.add("Listen to soothing music as it can help you feel calmer.");
                    break;
                }
                break;
            case 1066457755:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_TALKING_ABOUT_IT)) {
                    defpackage.c.B(arrayList, "Call a friend or a close family member and talk through your stress with them.", "If you can, meet someone in person.", "You can use text messaging to reach out to someone as well.");
                    break;
                }
                break;
            case 1115525879:
                break;
            case 1148982716:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_CYCLING)) {
                    arrayList.add("Try cycling in an open area - like a garden or an empty street.");
                    arrayList.add("Ask a friend to join you - exercise is always more fun when you have company.");
                    break;
                }
                break;
            case 1193933721:
                if (str.equals(Constants.ACTIVITY_ID_ANGER_LISTEN_SOOTHING_MUSIC)) {
                    arrayList.add("Try listening to upbeat, energetic music that will match your mood.");
                    arrayList.add("You could also listen to soothing music that will help calm you down.");
                    break;
                }
                break;
            case 1232152247:
                if (str.equals(Constants.ACTIVITY_ID_WORRY_GET_ORGANISED)) {
                    defpackage.c.B(arrayList, "Start small. Try organising your wallet or bag, placing things in order.", "Don't give yourself an unrealistic deadline (such as organising your whole wardrobe in an hour).", "Clear any clutter on your work desk or at home.");
                    break;
                }
                break;
            case 1258321100:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_TRY_SMILING)) {
                    arrayList.add("Turn the corners of your mouth up into a smile and then give a laugh, even if it feels a little forced. ");
                    arrayList.add("Talk to a friend or family member about any pleasant event.");
                    break;
                }
                break;
            case 1310826471:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_JOGGING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery.");
                    break;
                }
                break;
            case 1403207546:
                if (str.equals(Constants.ACTIVITY_ID_STRESS_HUMOUR_DISTRACTION)) {
                    defpackage.c.B(arrayList, "Watch a short, funny video on YouTube or a comedy show on TV.", "Read a comic book.", "Call and talk to someone who often makes you laugh and talk to them about anything you might want.");
                    break;
                }
                break;
            case 1472337752:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_RUNNING)) {
                    arrayList.add("Ask a friend to join you.");
                    arrayList.add("Try running in a park or garden, so you can enjoy the benefits of greenery while you jog your stress away.");
                    break;
                }
                break;
            case 1532521816:
                if (str.equals(Constants.ACTIVITY_ID_SLEEP_SKIPPING_ROPE)) {
                    defpackage.c.B(arrayList, "Spend at least ten minutes skipping rope during the day.", "You can listen to upbeat music while engaging in this activity.", "Try engaging in this activity in a natural, outdoor space like a park.");
                    break;
                }
                break;
            case 1570308604:
                break;
            case 1634883578:
                if (str.equals(Constants.ACTIVITY_ID_WORRY_DISTRACT_YOURSELF)) {
                    arrayList.add("Think about something that is completely unrelated to the situation that is worrying you.");
                    arrayList.add("Engage in an activity that will help take your mind off of your worry, like playing with your pet or watching a TV show.");
                    break;
                }
                break;
            case 1645480491:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_VIEW_OLD_PHOTO)) {
                    arrayList.add("When looking at these photos, try to think of pleasant memories from the past.");
                    arrayList.add("If possible, try and reconnect with someone from the past whom you haven't spoken to in a while.");
                    break;
                }
                break;
            case 1965337188:
                if (str.equals(Constants.ACTIVITY_ID_HAPPINESS_CLIMBING_STAIRS)) {
                    arrayList.add("When feeling low, take a short break and climb up and down four flights of stairs in ten minutes.");
                    arrayList.add("Try climbing to your apartment on a daily basis so you can do it more easily in times of stress to feel better.");
                    break;
                }
                break;
            case 2005280733:
                break;
            case 2067465528:
                if (str.equals(Constants.ACTIVITY_ID_DEPRESSION_GOOD_LAUGH)) {
                    defpackage.c.B(arrayList, "Watch a short, funny video on YouTube or a comedy show on TV.", "Read a comic book.", "Call and talk to someone who often makes you laugh and talk to them about anything you might want.");
                    break;
                }
                break;
            case 2132245334:
                if (str.equals(Constants.ACTIVITY_ID_ANGER_WRITE_DOWN)) {
                    defpackage.d.p(arrayList, "Give yourself a time limit; write for 5 or 10 minutes only.", "You can write on a piece of paper or on your phone.", "You don't have to show what you have written to anybody - this is just for you.", "Don't try and censor your thoughts - write whatever comes to your mind.");
                    arrayList.add("After you have written something on paper, you can try tearing the page or throwing it to feel even better.");
                    break;
                }
                break;
        }
        return arrayList;
    }

    public final ViewPager Z() {
        ViewPager viewPager = this.f11698y;
        if (viewPager != null) {
            return viewPager;
        }
        kotlin.jvm.internal.i.q("viewPager");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f11693j0;
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
        String str;
        boolean z11;
        try {
            U().setVisibility(0);
            S().setText("");
            S().setVisibility(0);
            if (!ConnectionStatusReceiver.isConnected() && !this.I) {
                w0(true);
                return;
            }
            a0 a0Var = this.X;
            if (a0Var == null) {
                AppCompatImageView appCompatImageView = this.L;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.anim_play_to_pause);
                    AppCompatImageView appCompatImageView2 = this.L;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(0);
                    } else {
                        kotlin.jvm.internal.i.q("play");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("play");
                    throw null;
                }
            } else if (z10) {
                a0Var.a();
            }
            this.X = new j.b(requireContext()).a();
            if (this.I) {
                Utils utils = Utils.INSTANCE;
                String str2 = this.A;
                kotlin.jvm.internal.i.d(str2);
                Context requireContext = requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                str = utils.getAudioFilePath(str2, requireContext);
            } else {
                str = this.A;
            }
            q b10 = q.b(Uri.parse(str));
            a0 a0Var2 = this.X;
            if (a0Var2 != null) {
                a0Var2.h0(b10);
                a0 a0Var3 = this.X;
                if (a0Var3 != null) {
                    a0Var3.E(this);
                    a0 a0Var4 = this.X;
                    if (a0Var4 != null) {
                        a0Var4.l();
                        U().setDisableTouch(true);
                        U().setOnSliderMovedListener(new d());
                        a0 a0Var5 = this.X;
                        if (a0Var5 != null) {
                            double d10 = this.W;
                            if (d10 > 0.001d && d10 < 1.0d) {
                                a0Var5.f0((long) (d10 * this.P));
                                h0(true);
                                TemplateCircularSlider U = U();
                                U.f11848u = true;
                                U.invalidate();
                                return;
                            }
                        }
                        if (this.W == 0.001d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            g0(false);
                        }
                        TemplateCircularSlider U2 = U();
                        U2.f11848u = true;
                        U2.invalidate();
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
            LogHelper.INSTANCE.e("stressrelaxing", "error in initialising audio", e10);
        }
    }

    public final void c0(AppCompatImageView appCompatImageView) {
        appCompatImageView.setPivotY(appCompatImageView.getWidth() * 3.0f);
        ArrayList<Animator> arrayList = this.H;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, "rotation", appCompatImageView.getRotation(), appCompatImageView.getRotation() + 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration((new Random().nextInt(3) * 1000) + 2000);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        arrayList.add(ofFloat);
    }

    public final void g0(boolean z10) {
        if (z10) {
            try {
                J();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
                return;
            }
        }
        O(false);
        this.Z.removeCallbacksAndMessages(null);
        Bundle bundle = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        }
        GoalType goalType = this.f11699z;
        if (goalType != null) {
            bundle.putString(Constants.GOAL_ID, goalType.getGoalId());
            bundle.putString(Constants.GOAL_NAME, goalType.getGoalName());
            bundle.putString(Constants.GOAL_TYPE, goalType.getType());
        }
        GoalNotificationContent goalNotificationContent = this.K;
        if (goalNotificationContent != null) {
            bundle.putString("experiment_type", Constants.SCREEN_ACTIVITY);
            bundle.putString("experiment", goalNotificationContent.getExperiment());
            bundle.putString("experiment_key", goalNotificationContent.getKey());
        }
        bundle.putBoolean("isStreaming", !this.I);
        gk.a.b(bundle, "activity_audio_pause");
    }

    public final void h0(boolean z10) {
        try {
            a0 a0Var = this.X;
            if (a0Var != null && a0Var.isPlaying()) {
                a0 a0Var2 = this.X;
                if (a0Var2 != null) {
                    a0Var2.z(false);
                    g0(z10);
                    u0(false);
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            } else if (j0()) {
                if (!this.S) {
                    this.S = true;
                    Q();
                }
                a0 a0Var3 = this.X;
                if (a0Var3 != null) {
                    a0Var3.z(true);
                    u0(true);
                    O(true);
                    Bundle bundle = new Bundle();
                    if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    }
                    GoalType goalType = this.f11699z;
                    if (goalType != null) {
                        bundle.putString(Constants.GOAL_ID, goalType.getGoalId());
                        bundle.putString(Constants.GOAL_NAME, goalType.getGoalName());
                        bundle.putString(Constants.GOAL_TYPE, goalType.getType());
                    }
                    GoalNotificationContent goalNotificationContent = this.K;
                    if (goalNotificationContent != null) {
                        bundle.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                        bundle.putString("experiment", goalNotificationContent.getExperiment());
                        bundle.putString("experiment_key", goalNotificationContent.getKey());
                    }
                    bundle.putBoolean("isStreaming", true ^ this.I);
                    gk.a.b(bundle, "activity_audio_play");
                    return;
                }
                kotlin.jvm.internal.i.q("simpleExoplayer");
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "error in playing audio", e10);
        }
    }

    public final boolean j0() {
        Object obj;
        int requestAudioFocus;
        try {
            p activity = getActivity();
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
                this.E = build;
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
            LogHelper.INSTANCE.e(this.f11694u, "Exception", e10);
            return false;
        }
    }

    public final void k0(RobertoTextView robertoTextView) {
        this.f11697x = robertoTextView;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        if (z10) {
            u0(true);
            s0();
            return;
        }
        u0(false);
        t0();
    }

    public final void m0(TemplateCircularSlider templateCircularSlider) {
        this.B = templateCircularSlider;
    }

    public final void n0(String str) {
        this.f11696w = str;
    }

    public final void o0(ViewPager viewPager) {
        this.f11698y = viewPager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i6) {
        Object obj;
        a0 a0Var;
        try {
            p activity = getActivity();
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
                                if (this.D && (a0Var = this.X) != null && !a0Var.isPlaying()) {
                                    h0(true);
                                } else {
                                    a0 a0Var2 = this.X;
                                    if (a0Var2 != null && a0Var2.isPlaying()) {
                                        audioManager.setStreamVolume(3, this.F, 0);
                                    }
                                }
                                this.D = false;
                                return;
                            }
                            return;
                        }
                        this.D = false;
                        h0(true);
                        return;
                    }
                    a0 a0Var3 = this.X;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        this.D = true;
                        h0(false);
                        return;
                    }
                    return;
                }
                this.F = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 20, 0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        MyApplication.a aVar = MyApplication.V;
        this.f11689f0 = (fm.a) new androidx.lifecycle.o0(requireActivity, new kk.c(aVar.a(), new j0())).a(fm.a.class);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PLAY_PAUSE");
        requireActivity().registerReceiver(this.f11691h0, intentFilter);
        aVar.a().F = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_stress_relaxing_activity, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            MyApplication.V.a().F = false;
            AudioHelper audioHelper = this.O;
            if (audioHelper != null) {
                audioHelper.destroy();
                AudioHelper audioHelper2 = this.O;
                if (audioHelper2 != null) {
                    audioHelper2.getProgressLiveData().k(requireActivity());
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            }
            requireActivity().unregisterReceiver(this.f11691h0);
            Object systemService = requireActivity().getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
            a0 a0Var = this.X;
            if (a0Var != null) {
                a0Var.a();
            }
            this.Z.removeCallbacksAndMessages(null);
            J();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in unregistering listener", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a aVar = this.f11689f0;
        if (aVar != null) {
            aVar.f15178l0.k(getViewLifecycleOwner());
            aVar.w();
            super.onDestroyView();
            this.f11693j0.clear();
            return;
        }
        kotlin.jvm.internal.i.q("firestoreGoalsViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            GoalType goalType = this.f11699z;
            if (goalType != null) {
                if (kotlin.jvm.internal.i.b(goalType.getType(), "physical_activity")) {
                    this.f11687b0.removeCallbacksAndMessages(null);
                } else {
                    a0 a0Var = this.X;
                    if (a0Var != null && a0Var.isPlaying()) {
                        t0();
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onpause", e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            GoalType goalType = this.f11699z;
            if (goalType != null) {
                if (kotlin.jvm.internal.i.b(goalType.getType(), "physical_activity")) {
                    this.f11687b0.postDelayed(this.c0, this.f11686a0);
                } else {
                    a0 a0Var = this.X;
                    if (a0Var != null && a0Var.isPlaying()) {
                        s0();
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("stressrelaxing", "error in onResume", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01af, code lost:
        if (r2 != false) goto L265;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0643 A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x066c A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x068a A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06a0 A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06d3 A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06e4 A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06ee A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0714 A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014f A[Catch: Exception -> 0x0729, TryCatch #0 {Exception -> 0x0729, blocks: (B:17:0x00cf, B:19:0x00d5, B:21:0x00df, B:23:0x0121, B:25:0x0143, B:31:0x014f, B:33:0x0154, B:35:0x0158, B:53:0x01d5, B:55:0x01db, B:57:0x01e1, B:62:0x01ec, B:64:0x01f9, B:65:0x01fd, B:67:0x0203, B:69:0x0215, B:70:0x0218, B:72:0x021c, B:73:0x0228, B:75:0x022e, B:77:0x0240, B:78:0x0243, B:81:0x024b, B:83:0x024f, B:85:0x0285, B:86:0x02f3, B:87:0x0378, B:88:0x037d, B:89:0x037e, B:228:0x063f, B:230:0x0643, B:232:0x064d, B:236:0x0666, B:237:0x0668, B:239:0x066c, B:241:0x0676, B:243:0x067a, B:245:0x067e, B:251:0x068a, B:253:0x0690, B:258:0x06a5, B:260:0x06d3, B:262:0x06dd, B:264:0x06e4, B:265:0x06ee, B:266:0x06f3, B:267:0x06f4, B:254:0x0694, B:257:0x06a0, B:227:0x0638, B:63:0x01f1, B:36:0x0177, B:37:0x017c, B:38:0x017d, B:40:0x0194, B:51:0x01b1, B:52:0x01c5, B:42:0x019a, B:44:0x01a0, B:46:0x01a6, B:268:0x0703, B:271:0x070b, B:275:0x0714, B:276:0x071e, B:22:0x00ea, B:90:0x038b, B:92:0x0399, B:94:0x03a3, B:96:0x03ad, B:98:0x03b7, B:100:0x03c1, B:103:0x03cd, B:105:0x03d7, B:107:0x03e1, B:109:0x03eb, B:111:0x03f5, B:113:0x03ff, B:116:0x040b, B:118:0x0415, B:120:0x041f, B:122:0x0429, B:124:0x0433, B:126:0x043d, B:129:0x0449, B:131:0x0453, B:133:0x045d, B:135:0x0467, B:137:0x0471, B:139:0x047b, B:142:0x0487, B:144:0x0491, B:146:0x049b, B:148:0x04a5, B:150:0x04af, B:152:0x04b9, B:155:0x04c5, B:157:0x04cf, B:159:0x04d9, B:161:0x04e3, B:163:0x04ed, B:165:0x04f7, B:168:0x0503, B:170:0x050d, B:172:0x0517, B:174:0x0521, B:176:0x052b, B:178:0x0535, B:181:0x0540, B:183:0x054a, B:185:0x0554, B:187:0x055e, B:189:0x0568, B:191:0x0572, B:193:0x057c, B:195:0x0584, B:196:0x0588, B:197:0x0594, B:199:0x059c, B:200:0x05a0, B:201:0x05ac, B:203:0x05b4, B:204:0x05b8, B:205:0x05c4, B:207:0x05cc, B:208:0x05d0, B:209:0x05db, B:211:0x05e3, B:212:0x05e7, B:213:0x05f2, B:215:0x05fa, B:216:0x05fe, B:217:0x0609, B:219:0x0611, B:220:0x0615, B:221:0x0620, B:223:0x0628, B:224:0x062c), top: B:281:0x00cf, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.theinnerhour.b2b.model.Goal] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        boolean z11;
        Bundle arguments;
        boolean z12;
        Intent intent;
        boolean z13;
        ArrayList<GoalType> activities;
        GoalType goalType;
        GoalType goalType2;
        AppCompatImageView appCompatImageView;
        GoalType goalType3;
        AppCompatImageView appCompatImageView2;
        String str;
        boolean z14;
        Utils utils;
        String str2;
        Context requireContext;
        boolean z15;
        LinkedHashMap<String, String> audioUrls;
        Intent intent2;
        Intent intent3;
        String str3 = this.f11694u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        boolean booleanExtra = requireActivity().getIntent().getBooleanExtra("enable_schedule", true);
        this.C = booleanExtra;
        if (!booleanExtra) {
            ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setText("Proceed");
        }
        View findViewById = view.findViewById(R.id.audioProgress);
        kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.audioProgress)");
        m0((TemplateCircularSlider) findViewById);
        View findViewById2 = view.findViewById(R.id.audioPlayProgress);
        kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.audioPlayProgress)");
        k0((RobertoTextView) findViewById2);
        View findViewById3 = view.findViewById(R.id.viewpager);
        kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.viewpager)");
        o0((ViewPager) findViewById3);
        View findViewById4 = view.findViewById(R.id.play);
        kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.play)");
        this.L = (AppCompatImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.title);
        kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.title)");
        this.M = (RobertoTextView) findViewById5;
        p activity = getActivity();
        boolean z16 = false;
        if (activity != null && (intent3 = activity.getIntent()) != null && intent3.hasExtra("source")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setImageResource(R.drawable.ic_wrong);
        }
        ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new kq.d(this, 0));
        ((RobertoTextView) _$_findCachedViewById(R.id.tap)).setOnClickListener(new kq.d(this, 1));
        try {
            if (getArguments() != null && requireArguments().containsKey("activity_id")) {
                this.f11695v = requireArguments().getString("activity_id");
            } else {
                this.f11695v = FirebasePersistence.getInstance().getUser().getCurrentCourseName() + '-' + requireArguments().getString(Constants.LINK_ID);
                String string = requireArguments().getString(Constants.LINK_ID);
                kotlin.jvm.internal.i.d(string);
                this.N = string;
            }
            String string2 = requireArguments().getString(Constants.COURSE_ID, FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(string2, "requireArguments().getSt…nce().user.currentCourse)");
            n0(string2);
            String str4 = this.f11695v;
            if (str4 != null && !n.B0(str4)) {
                z11 = false;
                if (!z11) {
                    if (this.f11690g0) {
                        fm.a aVar = this.f11689f0;
                        if (aVar != null) {
                            String str5 = this.f11695v;
                            kotlin.jvm.internal.i.d(str5);
                            aVar.l(str5);
                            aVar.q().e(getViewLifecycleOwner(), new pp.b(7, new e()));
                        } else {
                            kotlin.jvm.internal.i.q("firestoreGoalsViewModel");
                            throw null;
                        }
                    } else {
                        x xVar = new x();
                        ?? goalById = FirebasePersistence.getInstance().getGoalById(this.f11695v, X());
                        xVar.f23469u = goalById;
                        if (goalById == 0 || !goalById.isVisible()) {
                            p activity2 = getActivity();
                            if (activity2 != null && (intent = activity2.getIntent()) != null && intent.hasExtra("source")) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setText("DONE");
                        ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setOnClickListener(new ho.o(this, 18, xVar));
                    }
                    p activity3 = getActivity();
                    if (activity3 != null && (intent2 = activity3.getIntent()) != null && intent2.hasExtra("source")) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        activities = Constants.getActivities();
                    } else {
                        activities = Constants.getActivities(X());
                    }
                    Iterator<GoalType> it = activities.iterator();
                    while (it.hasNext()) {
                        GoalType next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getGoalId(), this.f11695v)) {
                            this.f11699z = next;
                        }
                    }
                    if (this.f11699z == null) {
                        Iterator<GoalType> it2 = Constants.getCopingActivities(X()).iterator();
                        while (it2.hasNext()) {
                            GoalType next2 = it2.next();
                            if (kotlin.jvm.internal.i.b(next2.getGoalId(), this.f11695v)) {
                                this.f11699z = next2;
                            }
                        }
                    }
                    if (isAdded()) {
                        RobertoTextView robertoTextView = this.M;
                        if (robertoTextView != null) {
                            GoalType goalType4 = this.f11699z;
                            kotlin.jvm.internal.i.d(goalType4);
                            robertoTextView.setText(goalType4.getGoalName());
                            Glide.h(this).o(Integer.valueOf((int) R.drawable.audio_background)).B((AppCompatImageView) _$_findCachedViewById(R.id.relaxationBackground));
                            GoalType goalType5 = this.f11699z;
                            kotlin.jvm.internal.i.d(goalType5);
                            if (kotlin.jvm.internal.i.b(goalType5.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView1)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView2)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView3)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView4)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView5)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView6)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView7)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView8)).setVisibility(0);
                                ((AppCompatImageView) _$_findCachedViewById(R.id.imageView9)).setVisibility(0);
                            } else {
                                ((ImageView) _$_findCachedViewById(R.id.act_img_bk_physical)).setVisibility(0);
                                ((ImageView) _$_findCachedViewById(R.id.act_img)).setVisibility(0);
                                Z().setVisibility(0);
                                ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                                ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(0);
                                GoalType goalType6 = this.f11699z;
                                kotlin.jvm.internal.i.d(goalType6);
                                ((ImageView) _$_findCachedViewById(R.id.act_img)).setImageResource(goalType6.getOffline_icon());
                                GoalType goalType7 = this.f11699z;
                                kotlin.jvm.internal.i.d(goalType7);
                                String goalId = goalType7.getGoalId();
                                kotlin.jvm.internal.i.f(goalId, "goalType!!.goalId");
                                ArrayList<String> Y = Y(goalId);
                                ViewPager Z = Z();
                                p requireActivity = requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                Z.setAdapter(new b(requireActivity, Y));
                                Z().b(new c(Y.size()));
                                M(0, Y.size());
                            }
                        } else {
                            kotlin.jvm.internal.i.q("title");
                            throw null;
                        }
                    }
                    Utils utils2 = Utils.INSTANCE;
                    String str6 = this.f11695v;
                    kotlin.jvm.internal.i.d(str6);
                    this.K = utils2.getGoalNotificationContent(str6);
                    try {
                        audioUrls = CourseUtilKt.getAudioUrls("");
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str3, "exception", e10);
                    }
                    if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_DEEP_BREATHING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_DEEP_BREATHING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_DEEP_BREATHING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_DEEP_BREATHING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_DEEP_BREATHING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_DEEP_BREATHING)) {
                        if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_GUIDED_IMAGERY) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_GUIDED_IMAGERY) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_GUIDED_IMAGERY) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_GUIDED_IMAGERY) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_GUIDED_IMAGERY)) {
                            if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_PROGRESSIVE_MUSCLE_RELAXATION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_PROGRESSIVE_MUSCLE_RELAXATION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_PROGRESSIVE_MUSCLE_RELAXATION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_PROGRESSIVE_MUSCLE_RELAXATION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_PROGRESSIVE_MUSCLE_RELAXATION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_PROGRESSIVE_MUSCLE_RELAXATION)) {
                                if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_GENTLE_MASSAGES) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_GENTLE_MASSAGES) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_GENTLE_MASSAGES) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_GENTLE_MASSAGES) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_GENTLE_MASSAGES)) {
                                    if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_MINDFUL_WALKING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_MINDFUL_WALKING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_MINDFUL_WALKING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_MINDFUL_WALKING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_MINDFUL_WALKING) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_MINDFUL_WALKING)) {
                                        if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_THOUGHT_DEFUSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_THOUGHT_DEFUSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_THOUGHT_DEFUSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_THOUGHT_DEFUSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_THOUGHT_DEFUSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_THOUGHT_DEFUSION)) {
                                            if (!kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_SELF_COMPASSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_SELF_COMPASSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_SELF_COMPASSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_SELF_COMPASSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_SELF_COMPASSION) && !kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_SELF_COMPASSION)) {
                                                if (kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_STRESS_BEACH_VISUALISATION) || kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_SLEEP_BEACH_VISUALISATION) || kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_DEPRESSION_BEACH_VISUALISATION) || kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_HAPPINESS_BEACH_VISUALISATION) || kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_ANGER_BEACH_VISUALISATION) || kotlin.jvm.internal.i.b(this.f11695v, Constants.ACTIVITY_ID_WORRY_BEACH_VISUALISATION)) {
                                                    if (kotlin.jvm.internal.i.b(this.N, "")) {
                                                        this.N = Constants.BEACH_VISUALISATION_ID;
                                                    }
                                                    this.A = audioUrls.get("beach_walking");
                                                }
                                                goalType = this.f11699z;
                                                if (goalType != null && kotlin.jvm.internal.i.b(goalType.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                                    utils = Utils.INSTANCE;
                                                    str2 = this.A;
                                                    kotlin.jvm.internal.i.d(str2);
                                                    requireContext = requireContext();
                                                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                                    if (utils.getAudioFilePath(str2, requireContext) == null) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    this.I = z15;
                                                }
                                                goalType2 = this.f11699z;
                                                if (goalType2 != null && kotlin.jvm.internal.i.b(goalType2.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY) && !this.I) {
                                                    str = this.A;
                                                    if (str != null && str.length() != 0) {
                                                        z14 = false;
                                                        if (!z14) {
                                                            if (ConnectionStatusReceiver.isConnected()) {
                                                                p0();
                                                            }
                                                            Boolean initMascot = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                                            kotlin.jvm.internal.i.f(initMascot, "mascotAnimationUtils.ini…= false\n                }");
                                                            this.J = initMascot.booleanValue();
                                                            goalType3 = this.f11699z;
                                                            if (goalType3 != null && kotlin.jvm.internal.i.b(goalType3.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                                                a0(false);
                                                                appCompatImageView2 = this.L;
                                                                if (appCompatImageView2 == null) {
                                                                    appCompatImageView2.setOnClickListener(new kq.d(this, 2));
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("play");
                                                                    throw null;
                                                                }
                                                            }
                                                            String str7 = this.f11695v;
                                                            kotlin.jvm.internal.i.d(str7);
                                                            new AsyncTaskC0167a(str7).execute(new Void[0]);
                                                        }
                                                    }
                                                    z14 = true;
                                                    if (!z14) {
                                                    }
                                                }
                                                appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                                                if (appCompatImageView == null) {
                                                    appCompatImageView.setVisibility(8);
                                                }
                                                Boolean initMascot2 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                                kotlin.jvm.internal.i.f(initMascot2, "mascotAnimationUtils.ini…= false\n                }");
                                                this.J = initMascot2.booleanValue();
                                                goalType3 = this.f11699z;
                                                if (goalType3 != null) {
                                                    a0(false);
                                                    appCompatImageView2 = this.L;
                                                    if (appCompatImageView2 == null) {
                                                    }
                                                }
                                                String str72 = this.f11695v;
                                                kotlin.jvm.internal.i.d(str72);
                                                new AsyncTaskC0167a(str72).execute(new Void[0]);
                                            }
                                            if (kotlin.jvm.internal.i.b(this.N, "")) {
                                                this.N = Constants.SELF_COMPASSION_ID;
                                            }
                                            this.A = audioUrls.get("self_compassion");
                                            goalType = this.f11699z;
                                            if (goalType != null) {
                                                utils = Utils.INSTANCE;
                                                str2 = this.A;
                                                kotlin.jvm.internal.i.d(str2);
                                                requireContext = requireContext();
                                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                                if (utils.getAudioFilePath(str2, requireContext) == null) {
                                                }
                                                this.I = z15;
                                            }
                                            goalType2 = this.f11699z;
                                            if (goalType2 != null) {
                                                str = this.A;
                                                if (str != null) {
                                                    z14 = false;
                                                    if (!z14) {
                                                    }
                                                }
                                                z14 = true;
                                                if (!z14) {
                                                }
                                            }
                                            appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                                            if (appCompatImageView == null) {
                                            }
                                            Boolean initMascot22 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                            kotlin.jvm.internal.i.f(initMascot22, "mascotAnimationUtils.ini…= false\n                }");
                                            this.J = initMascot22.booleanValue();
                                            goalType3 = this.f11699z;
                                            if (goalType3 != null) {
                                            }
                                            String str722 = this.f11695v;
                                            kotlin.jvm.internal.i.d(str722);
                                            new AsyncTaskC0167a(str722).execute(new Void[0]);
                                        }
                                        if (kotlin.jvm.internal.i.b(this.N, "")) {
                                            this.N = Constants.THOUGHT_DEFUSION_ID;
                                        }
                                        this.A = audioUrls.get("thought_diffusion");
                                        goalType = this.f11699z;
                                        if (goalType != null) {
                                        }
                                        goalType2 = this.f11699z;
                                        if (goalType2 != null) {
                                        }
                                        appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                                        if (appCompatImageView == null) {
                                        }
                                        Boolean initMascot222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                        kotlin.jvm.internal.i.f(initMascot222, "mascotAnimationUtils.ini…= false\n                }");
                                        this.J = initMascot222.booleanValue();
                                        goalType3 = this.f11699z;
                                        if (goalType3 != null) {
                                        }
                                        String str7222 = this.f11695v;
                                        kotlin.jvm.internal.i.d(str7222);
                                        new AsyncTaskC0167a(str7222).execute(new Void[0]);
                                    }
                                    if (kotlin.jvm.internal.i.b(this.N, "")) {
                                        this.N = Constants.MINDFUL_WALKING_ID;
                                    }
                                    this.A = audioUrls.get("mindful_walking");
                                    goalType = this.f11699z;
                                    if (goalType != null) {
                                    }
                                    goalType2 = this.f11699z;
                                    if (goalType2 != null) {
                                    }
                                    appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                                    if (appCompatImageView == null) {
                                    }
                                    Boolean initMascot2222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                    kotlin.jvm.internal.i.f(initMascot2222, "mascotAnimationUtils.ini…= false\n                }");
                                    this.J = initMascot2222.booleanValue();
                                    goalType3 = this.f11699z;
                                    if (goalType3 != null) {
                                    }
                                    String str72222 = this.f11695v;
                                    kotlin.jvm.internal.i.d(str72222);
                                    new AsyncTaskC0167a(str72222).execute(new Void[0]);
                                }
                                if (kotlin.jvm.internal.i.b(this.N, "")) {
                                    this.N = Constants.GENTLE_MASSAGE_ID;
                                }
                                this.A = audioUrls.get("self_message");
                                goalType = this.f11699z;
                                if (goalType != null) {
                                }
                                goalType2 = this.f11699z;
                                if (goalType2 != null) {
                                }
                                appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                                if (appCompatImageView == null) {
                                }
                                Boolean initMascot22222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                                kotlin.jvm.internal.i.f(initMascot22222, "mascotAnimationUtils.ini…= false\n                }");
                                this.J = initMascot22222.booleanValue();
                                goalType3 = this.f11699z;
                                if (goalType3 != null) {
                                }
                                String str722222 = this.f11695v;
                                kotlin.jvm.internal.i.d(str722222);
                                new AsyncTaskC0167a(str722222).execute(new Void[0]);
                            }
                            if (kotlin.jvm.internal.i.b(this.N, "")) {
                                this.N = Constants.PMR_ID;
                            }
                            this.A = audioUrls.get("pmr");
                            goalType = this.f11699z;
                            if (goalType != null) {
                            }
                            goalType2 = this.f11699z;
                            if (goalType2 != null) {
                            }
                            appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                            if (appCompatImageView == null) {
                            }
                            Boolean initMascot222222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                            kotlin.jvm.internal.i.f(initMascot222222, "mascotAnimationUtils.ini…= false\n                }");
                            this.J = initMascot222222.booleanValue();
                            goalType3 = this.f11699z;
                            if (goalType3 != null) {
                            }
                            String str7222222 = this.f11695v;
                            kotlin.jvm.internal.i.d(str7222222);
                            new AsyncTaskC0167a(str7222222).execute(new Void[0]);
                        }
                        if (kotlin.jvm.internal.i.b(this.N, "")) {
                            this.N = Constants.GUIDED_IMAGERY_ID;
                        }
                        this.A = audioUrls.get(Constants.PRIORITY_GUIDED_IMAGERY);
                        goalType = this.f11699z;
                        if (goalType != null) {
                        }
                        goalType2 = this.f11699z;
                        if (goalType2 != null) {
                        }
                        appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                        if (appCompatImageView == null) {
                        }
                        Boolean initMascot2222222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                        kotlin.jvm.internal.i.f(initMascot2222222, "mascotAnimationUtils.ini…= false\n                }");
                        this.J = initMascot2222222.booleanValue();
                        goalType3 = this.f11699z;
                        if (goalType3 != null) {
                        }
                        String str72222222 = this.f11695v;
                        kotlin.jvm.internal.i.d(str72222222);
                        new AsyncTaskC0167a(str72222222).execute(new Void[0]);
                    }
                    if (kotlin.jvm.internal.i.b(this.N, "")) {
                        this.N = Constants.DEEP_BREATHING_ID;
                    }
                    this.A = audioUrls.get("deep_breathing");
                    goalType = this.f11699z;
                    if (goalType != null) {
                    }
                    goalType2 = this.f11699z;
                    if (goalType2 != null) {
                    }
                    appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                    if (appCompatImageView == null) {
                    }
                    Boolean initMascot22222222 = new MascotAnimationUtils().initMascot(view, a.class.getSimpleName(), Constants.SCREEN_COPING, "Hey!", "It's great to see you try some of our activities! Have fun!", "OK, GOT IT", new s(this, 4));
                    kotlin.jvm.internal.i.f(initMascot22222222, "mascotAnimationUtils.ini…= false\n                }");
                    this.J = initMascot22222222.booleanValue();
                    goalType3 = this.f11699z;
                    if (goalType3 != null) {
                    }
                    String str722222222 = this.f11695v;
                    kotlin.jvm.internal.i.d(str722222222);
                    new AsyncTaskC0167a(str722222222).execute(new Void[0]);
                }
                arguments = getArguments();
                if (arguments != null && arguments.containsKey("showFeedback")) {
                    z16 = true;
                }
                if (z16) {
                    this.U = requireArguments().getBoolean("showFeedback");
                }
                new cg.a(1).a(this.f11695v);
            }
            z11 = true;
            if (!z11) {
            }
            arguments = getArguments();
            if (arguments != null) {
                z16 = true;
            }
            if (z16) {
            }
            new cg.a(1).a(this.f11695v);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str3, "Exception", e11);
        }
    }

    public final void p0() {
        if (ConnectionStatusReceiver.isConnected()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new h(null), 3);
        }
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        String str = this.A;
        kotlin.jvm.internal.i.d(str);
        AudioHelper audioHelper = new AudioHelper(requireContext, str);
        this.O = audioHelper;
        audioHelper.registerDownloadReceivers();
        AudioHelper audioHelper2 = this.O;
        if (audioHelper2 != null) {
            audioHelper2.getProgressLiveData().k(requireActivity());
            AudioHelper audioHelper3 = this.O;
            if (audioHelper3 != null) {
                audioHelper3.getProgressLiveData().e(requireActivity(), new pp.b(8, new kq.g(this)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setOnClickListener(new kq.d(this, 3));
                }
                this.V = true;
                return;
            }
            kotlin.jvm.internal.i.q("audioHelper");
            throw null;
        }
        kotlin.jvm.internal.i.q("audioHelper");
        throw null;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        kotlin.jvm.internal.i.g(error, "error");
        w0(true);
    }

    public final void q0() {
        UtilsKt.fireAnalytics("ra_feedback_show", UtilsKt.getAnalyticsBundle());
        this.T = false;
        ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
        ((ConstraintLayout) _$_findCachedViewById(R.id.playBackLayout)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.btnSubmitLogin)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView1)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView2)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView3)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView4)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView5)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView6)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView7)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView8)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.imageView9)).setVisibility(8);
        ((AppCompatImageView) _$_findCachedViewById(R.id.downloadBtn)).setVisibility(8);
        Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_fade_in_right);
        ApplicationPersistence.getInstance().setBooleanValue(Constants.RECOMMENDED_ACTIVITIES_FEEDBACK_SHOWN, true);
        ((ConstraintLayout) _$_findCachedViewById(R.id.feedbackQuestionLayout)).startAnimation(loadAnimation);
        ((ConstraintLayout) _$_findCachedViewById(R.id.feedbackQuestionLayout)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.feedbackYesButton)).setOnClickListener(new kq.d(this, 4));
        ((RobertoButton) _$_findCachedViewById(R.id.feedbackNoButton)).setOnClickListener(new kq.d(this, 5));
        NpsPersistence.INSTANCE.updateNpsSlot(true);
    }

    public final void r0(FirestoreGoal firestoreGoal, Goal goal) {
        boolean z10;
        CharSequence charSequence;
        CustomDate scheduledDate;
        CustomDate scheduledDate2;
        boolean z11 = true;
        if (goal != null && (scheduledDate2 = goal.getScheduledDate()) != null && scheduledDate2.getTime() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            goal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
        }
        if ((firestoreGoal == null || (scheduledDate = firestoreGoal.getScheduledDate()) == null || scheduledDate.getTime() != 0) ? false : false) {
            firestoreGoal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
        }
        Calendar calendar = Calendar.getInstance();
        if (goal != null) {
            calendar.setTimeInMillis(goal.getScheduledDate().getTime() * 1000);
        }
        if (firestoreGoal != null) {
            calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * 1000);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), R.style.myTimePickerTheme, new zo.a(calendar, this, goal, firestoreGoal), calendar.get(11), calendar.get(12), false);
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.i.f(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.row_text_view_new, (ViewGroup) null);
        ((RobertoTextView) inflate.findViewById(R.id.textViewMain)).setText("Set a time for this activity so we can send you a reminder");
        timePickerDialog.setCustomTitle(inflate);
        if (requireArguments().getBoolean("proceed_on_schedule", false)) {
            charSequence = "Proceed";
        } else {
            charSequence = "Ok";
        }
        timePickerDialog.setButton(-1, charSequence, timePickerDialog);
        timePickerDialog.show();
    }

    public final void s0() {
        try {
            this.G.clear();
            AppCompatImageView imageView1 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView1);
            kotlin.jvm.internal.i.f(imageView1, "imageView1");
            P(imageView1);
            AppCompatImageView imageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView2);
            kotlin.jvm.internal.i.f(imageView2, "imageView2");
            P(imageView2);
            AppCompatImageView imageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView3);
            kotlin.jvm.internal.i.f(imageView3, "imageView3");
            P(imageView3);
            this.H.clear();
            AppCompatImageView imageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView4);
            kotlin.jvm.internal.i.f(imageView4, "imageView4");
            c0(imageView4);
            AppCompatImageView imageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView5);
            kotlin.jvm.internal.i.f(imageView5, "imageView5");
            c0(imageView5);
            AppCompatImageView imageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView6);
            kotlin.jvm.internal.i.f(imageView6, "imageView6");
            c0(imageView6);
            AppCompatImageView imageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView7);
            kotlin.jvm.internal.i.f(imageView7, "imageView7");
            c0(imageView7);
            AppCompatImageView imageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView8);
            kotlin.jvm.internal.i.f(imageView8, "imageView8");
            c0(imageView8);
            AppCompatImageView imageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.imageView9);
            kotlin.jvm.internal.i.f(imageView9, "imageView9");
            c0(imageView9);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
        }
    }

    public final void t0() {
        try {
            for (AnimatorSet animatorSet : this.G) {
                animatorSet.cancel();
            }
            for (Animator animator : this.H) {
                animator.cancel();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
        }
    }

    public final void u0(boolean z10) {
        int i6;
        int i10;
        int i11;
        try {
            Intent intent = new Intent();
            intent.setAction("PLAY_PAUSE");
            p activity = getActivity();
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
            p activity2 = getActivity();
            if (i12 >= 23) {
                i13 = 201326592;
            }
            PendingIntent activity3 = PendingIntent.getActivity(activity2, 0, intent2, i13);
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
            RemoteViews remoteViews = new RemoteViews(requireContext().getPackageName(), (int) R.layout.notification_custom_audio);
            GoalType goalType = this.f11699z;
            kotlin.jvm.internal.i.d(goalType);
            remoteViews.setTextViewText(R.id.notificationCustomCourse, goalType.getGoalName());
            int i14 = R.drawable.ic_play_png;
            if (z10) {
                i11 = R.drawable.ic_pause_png;
            } else {
                i11 = R.drawable.ic_play_png;
            }
            remoteViews.setImageViewResource(R.id.notificationCustomButton, i11);
            remoteViews.setOnClickPendingIntent(R.id.notificationCustomButton, broadcast);
            t tVar = new t(requireActivity().getApplicationContext(), "audio_channel");
            tVar.f14677w = 1;
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            tVar.h(BitmapFactory.decodeResource(requireActivity().getResources(), R.drawable.ic_amaha_logo));
            a0 a0Var = this.X;
            if (a0Var != null && a0Var.isPlaying()) {
                i14 = R.drawable.ic_pause_png;
            }
            tVar.a(i14, "", broadcast);
            GoalType goalType2 = this.f11699z;
            kotlin.jvm.internal.i.d(goalType2);
            tVar.e(goalType2.getGoalName());
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
            if (!r.J0(lowerCase, "huawei") || i12 > 22) {
                p1.b bVar = new p1.b();
                bVar.f27867e = new int[]{0};
                tVar.j(bVar);
            }
            Notification b10 = tVar.b();
            kotlin.jvm.internal.i.f(b10, "notificationBuilder.build()");
            ApplicationPersistence.getInstance().setIntValue(Constants.RA_GOAL_ID, Constants.AUDIO_NOTIFICATION_ID);
            notificationManager.notify(Constants.AUDIO_NOTIFICATION_ID, b10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
        }
    }

    public final void v0() {
        int i6;
        long j10;
        String str;
        if (isAdded()) {
            a0 a0Var = this.X;
            if (a0Var != null) {
                j10 = a0Var.getCurrentPosition();
            } else {
                j10 = 0;
            }
            double d10 = j10 / this.P;
            if (d10 <= 0.0d) {
                d10 = 0.001d;
            }
            this.W = d10;
            if (!U().Q) {
                if (this.W >= 1.0d) {
                    U().setPercentage(0.001d);
                } else {
                    U().setPercentage(this.W);
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long minutes = timeUnit.toMinutes(j10);
                RobertoTextView S = S();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(timeUnit.toMinutes(j10));
                sb2.append(':');
                long seconds = timeUnit.toSeconds(j10);
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds - timeUnit2.toSeconds(timeUnit.toMinutes(j10)))}, 1));
                kotlin.jvm.internal.i.f(format, "format(format, *args)");
                sb2.append(format);
                sb2.append('/');
                sb2.append(timeUnit.toMinutes(this.P));
                sb2.append(':');
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(this.P) - timeUnit2.toSeconds(timeUnit.toMinutes(this.P)))}, 1));
                kotlin.jvm.internal.i.f(format2, "format(format, *args)");
                sb2.append(format2);
                S.setText(sb2.toString());
                long j11 = this.Y;
                if (minutes > j11) {
                    long j12 = minutes - j11;
                    this.Y = minutes;
                    StatPersistence statPersistence = StatPersistence.INSTANCE;
                    String str2 = this.A;
                    RobertoTextView robertoTextView = this.M;
                    if (robertoTextView != null) {
                        CharSequence text = robertoTextView.getText();
                        if (text != null) {
                            str = text.toString();
                        } else {
                            str = null;
                        }
                    } else {
                        str = "";
                    }
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                    statPersistence.addOrIncrementAudioMinutes(str2, str, j12, currentCourseName);
                }
            }
        }
        Handler handler = this.Z;
        o oVar = this.f11692i0;
        handler.removeCallbacks(oVar);
        a0 a0Var2 = this.X;
        if (a0Var2 != null) {
            i6 = a0Var2.p();
        } else {
            i6 = 1;
        }
        if (i6 != 1 && i6 != 4) {
            handler.postDelayed(oVar, 200L);
        }
    }

    public final void w0(boolean z10) {
        try {
            if (isAdded()) {
                ((ProgressBar) _$_findCachedViewById(R.id.bufferProgressBar)).setVisibility(8);
                this.Q = z10;
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    p requireActivity = requireActivity();
                    String string = getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                    utils.showCustomToast(requireActivity, string);
                    AppCompatImageView appCompatImageView = this.L;
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(R.drawable.ic_replay_black_24dp);
                        if (this.W <= 0.001d) {
                            S().setText("Retry");
                        }
                        AppCompatImageView appCompatImageView2 = this.L;
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setVisibility(0);
                            S().setVisibility(0);
                            return;
                        }
                        kotlin.jvm.internal.i.q("play");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("play");
                    throw null;
                } else if (!this.V && !this.I) {
                    p0();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11694u, "exception", e10);
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

    /* compiled from: StressRelaxingActivityFragment.kt */
    /* loaded from: classes2.dex */
    public final class c implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f11703a;

        public c(int i6) {
            this.f11703a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = a.f11685k0;
            a.this.M(i6, this.f11703a);
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
