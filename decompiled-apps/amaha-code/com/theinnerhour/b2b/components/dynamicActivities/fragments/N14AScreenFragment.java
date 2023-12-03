package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import b9.l;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityScreenDataClass;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import gv.r;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import pl.m;
import pl.s;
import pl.v0;
import ql.i;
import ql.o;
import ql.q;
import ql.t;
import ta.v;
/* compiled from: N14AScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N14AScreenFragment;", "Lrr/d;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N14AScreenFragment extends rr.d {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f10947b0 = 0;
    public String A;
    public long B;
    public long C;
    public String E;
    public i.a F;
    public v0 G;
    public HashMap<String, Object> H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean N;
    public boolean O;
    public String P;
    public AudioHelper Q;
    public String R;
    public long S;
    public a T;
    public boolean U;
    public long V;
    public String W;
    public final m0 Y;
    public final c Z;

    /* renamed from: y  reason: collision with root package name */
    public CountDownTimer f10951y;

    /* renamed from: a0  reason: collision with root package name */
    public final LinkedHashMap f10948a0 = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10949w = LogHelper.INSTANCE.makeLogTag("N14AScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final m0 f10950x = b0.j(this, y.a(t.class), new e(this), new f(this), new g(this));

    /* renamed from: z  reason: collision with root package name */
    public String f10952z = "";
    public String D = "";
    public boolean M = true;
    public final hs.i X = sp.b.O(new l());

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f10953a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10954b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10955c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10956d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10957e;
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public final String f10958g;

        /* renamed from: h  reason: collision with root package name */
        public final String f10959h;

        /* renamed from: i  reason: collision with root package name */
        public final String f10960i;

        /* renamed from: j  reason: collision with root package name */
        public final String f10961j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f10962k;

        public a(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
            this.f10953a = j10;
            this.f10954b = str;
            this.f10955c = str2;
            this.f10956d = str3;
            this.f10957e = str4;
            this.f = str5;
            this.f10958g = str6;
            this.f10959h = str7;
            this.f10960i = str8;
            this.f10961j = str9;
            this.f10962k = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10953a == aVar.f10953a && kotlin.jvm.internal.i.b(this.f10954b, aVar.f10954b) && kotlin.jvm.internal.i.b(this.f10955c, aVar.f10955c) && kotlin.jvm.internal.i.b(this.f10956d, aVar.f10956d) && kotlin.jvm.internal.i.b(this.f10957e, aVar.f10957e) && kotlin.jvm.internal.i.b(this.f, aVar.f) && kotlin.jvm.internal.i.b(this.f10958g, aVar.f10958g) && kotlin.jvm.internal.i.b(this.f10959h, aVar.f10959h) && kotlin.jvm.internal.i.b(this.f10960i, aVar.f10960i) && kotlin.jvm.internal.i.b(this.f10961j, aVar.f10961j) && this.f10962k == aVar.f10962k) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            long j10 = this.f10953a;
            int c10 = pl.a.c(this.f10961j, pl.a.c(this.f10960i, pl.a.c(this.f10959h, pl.a.c(this.f10958g, pl.a.c(this.f, pl.a.c(this.f10957e, pl.a.c(this.f10956d, pl.a.c(this.f10955c, pl.a.c(this.f10954b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
            boolean z10 = this.f10962k;
            int i6 = z10;
            if (z10 != 0) {
                i6 = 1;
            }
            return c10 + i6;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActivityData(duration=");
            sb2.append(this.f10953a);
            sb2.append(", contentType=");
            sb2.append(this.f10954b);
            sb2.append(", audioUrl=");
            sb2.append(this.f10955c);
            sb2.append(", title=");
            sb2.append(this.f10956d);
            sb2.append(", videoUrl=");
            sb2.append(this.f10957e);
            sb2.append(", lottieUrl=");
            sb2.append(this.f);
            sb2.append(", fallbackImageUrl=");
            sb2.append(this.f10958g);
            sb2.append(", audioDownloadError=");
            sb2.append(this.f10959h);
            sb2.append(", internetError=");
            sb2.append(this.f10960i);
            sb2.append(", genericError=");
            sb2.append(this.f10961j);
            sb2.append(", showInfo=");
            return defpackage.c.t(sb2, this.f10962k, ')');
        }
    }

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<o0.b> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final o0.b invoke() {
            Context requireContext = N14AScreenFragment.this.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            Context applicationContext = requireContext.getApplicationContext();
            kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
            q.a aVar = q.f29765i;
            ComponentName componentName = new ComponentName(applicationContext, MusicService.class);
            q qVar = q.f29766j;
            if (qVar == null) {
                synchronized (aVar) {
                    qVar = q.f29766j;
                    if (qVar == null) {
                        qVar = new q(applicationContext, componentName);
                        q.f29766j = qVar;
                    }
                }
            }
            return new i.b((Application) applicationContext, qVar);
        }
    }

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(intent, "intent");
            if (intent.getAction() != null) {
                boolean b10 = kotlin.jvm.internal.i.b(intent.getAction(), "com.google.android.exoplayer.play");
                N14AScreenFragment n14AScreenFragment = N14AScreenFragment.this;
                if (b10) {
                    int i6 = N14AScreenFragment.f10947b0;
                    n14AScreenFragment.a0("notification");
                    return;
                }
                int i10 = N14AScreenFragment.f10947b0;
                n14AScreenFragment.Z("notification", true);
            }
        }
    }

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements z4.e<Drawable> {
        public d() {
        }

        @Override // z4.e
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            Drawable drawable = (Drawable) obj;
        }

        @Override // z4.e
        public final void b(GlideException glideException) {
            N14AScreenFragment n14AScreenFragment = N14AScreenFragment.this;
            if (n14AScreenFragment.isAdded()) {
                try {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenBg);
                    if (appCompatImageView != null) {
                        Context requireContext = n14AScreenFragment.requireContext();
                        Object obj = g0.a.f16164a;
                        appCompatImageView.setImageDrawable(a.c.b(requireContext, R.drawable.ir_dynamic_connectivity_issues));
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenBg);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenBg);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setBackgroundColor(g0.a.b(n14AScreenFragment.requireContext(), R.color.white));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(n14AScreenFragment.f10949w, e10);
                }
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10966u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f10966u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f10966u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10967u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f10967u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10967u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10968u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f10968u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10968u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<Fragment> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10969u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f10969u = fragment;
        }

        @Override // ss.a
        public final Fragment invoke() {
            return this.f10969u;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<r0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.a f10970u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f10970u = hVar;
        }

        @Override // ss.a
        public final r0 invoke() {
            return (r0) this.f10970u.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ hs.d f10971u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(hs.d dVar) {
            super(0);
            this.f10971u = dVar;
        }

        @Override // ss.a
        public final q0 invoke() {
            q0 viewModelStore = ((r0) this.f10971u.getValue()).getViewModelStore();
            kotlin.jvm.internal.i.f(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ hs.d f10972u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(hs.d dVar) {
            super(0);
            this.f10972u = dVar;
        }

        @Override // ss.a
        public final k1.a invoke() {
            androidx.lifecycle.h hVar;
            r0 r0Var = (r0) this.f10972u.getValue();
            k1.a aVar = null;
            if (r0Var instanceof androidx.lifecycle.h) {
                hVar = (androidx.lifecycle.h) r0Var;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                aVar = hVar.getDefaultViewModelCreationExtras();
            }
            if (aVar == null) {
                return a.C0350a.f22766b;
            }
            return aVar;
        }
    }

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<com.theinnerhour.b2b.components.dynamicActivities.fragments.b> {
        public l() {
            super(0);
        }

        @Override // ss.a
        public final com.theinnerhour.b2b.components.dynamicActivities.fragments.b invoke() {
            return new com.theinnerhour.b2b.components.dynamicActivities.fragments.b(N14AScreenFragment.this);
        }
    }

    public N14AScreenFragment() {
        b bVar = new b();
        hs.d N = sp.b.N(3, new i(new h(this)));
        this.Y = b0.j(this, y.a(ql.i.class), new j(N), new k(N), bVar);
        this.Z = new c();
    }

    public static final void P(N14AScreenFragment n14AScreenFragment) {
        w wVar;
        n14AScreenFragment.K = true;
        n14AScreenFragment.L = true;
        ((RobertoButton) n14AScreenFragment._$_findCachedViewById(R.id.btnN14AScreenNextButton)).setVisibility(0);
        PlayerView playerView = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
        if (playerView != null) {
            wVar = playerView.getPlayer();
        } else {
            wVar = null;
        }
        if (wVar != null) {
            wVar.z(false);
        }
        ((AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setImageResource(R.drawable.ic_nda_replay);
        v0 v0Var = n14AScreenFragment.G;
        if (v0Var != null) {
            v0Var.I(false, n14AScreenFragment.K);
        }
        CountDownTimer countDownTimer = n14AScreenFragment.f10951y;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((MotionLayout) n14AScreenFragment._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
        ((LottieAnimationView) n14AScreenFragment._$_findCachedViewById(R.id.lavN14ScreenLottie)).d();
        n14AScreenFragment.C = 0L;
        n14AScreenFragment.J = false;
    }

    public static final void Q(N14AScreenFragment n14AScreenFragment, int i6) {
        boolean z10;
        if (n14AScreenFragment.J) {
            long max = (long) ((i6 / ((AppCompatSeekBar) n14AScreenFragment._$_findCachedViewById(R.id.sbN14AScreenSeek)).getMax()) * 100);
            n14AScreenFragment.S = max;
            boolean z11 = true;
            if (max > 90) {
                n14AScreenFragment.X().U = true;
            }
            if (n14AScreenFragment.S < 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            n14AScreenFragment.M = z10;
            if (i6 <= 0) {
                z11 = false;
            }
            n14AScreenFragment.N = z11;
        }
    }

    @Override // rr.d
    public final void J() {
        v0 v0Var = this.G;
        if (v0Var != null) {
            v0Var.dismiss();
        }
    }

    @Override // rr.d
    public final void O() {
        NewDynamicParentActivity newDynamicParentActivity;
        S().I.a().f876a.stop();
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            newDynamicParentActivity.N0(true, 500L);
        }
    }

    public final ql.i S() {
        return (ql.i) this.Y.getValue();
    }

    public final String U() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("audioUrl");
        throw null;
    }

    public final t X() {
        return (t) this.f10950x.getValue();
    }

    public final void Y(String str) {
        boolean z10;
        if (this.K) {
            this.V = 0L;
            Bundle bundle = new Bundle();
            defpackage.d.m(bundle, "course");
            bundle.putString("activity_name", this.f10952z);
            bundle.putBoolean("main_activity", X().K);
            bundle.putBoolean("is_revamped", true);
            bundle.putString("source", "template_activity");
            bundle.putString("action_source", str);
            gk.a.b(bundle, "activity_redo_click");
        } else {
            Integer d10 = S().E.d();
            if (d10 != null && d10.intValue() == 3) {
                Z(str, false);
            } else {
                a0(str);
            }
        }
        if (this.F != null) {
            ql.i S = S();
            i.a aVar = this.F;
            kotlin.jvm.internal.i.d(aVar);
            if (!this.K && this.C != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j10 = this.C;
            S.getClass();
            v.H(kc.f.H(S), null, 0, new ql.j(S, aVar, z10, j10, true, null), 3);
        }
    }

    public final void Z(String str, boolean z10) {
        String str2;
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        bundle.putString("activity_name", this.f10952z);
        bundle.putBoolean("main_activity", X().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("source", "template_activity");
        bundle.putString("action_source", str);
        if (z10) {
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            PlaybackStateCompat playbackStateCompat = S().f29729z;
            int i6 = playbackStateCompat.f915u;
            long j10 = playbackStateCompat.f916v;
            if (i6 == 3) {
                j10 = (((float) (SystemClock.elapsedRealtime() - playbackStateCompat.B)) * playbackStateCompat.f918x) + ((float) j10);
            }
            str2 = i.a.C0504a.a(requireContext, j10);
        } else {
            str2 = this.E;
        }
        bundle.putString("played_progress", str2);
        gk.a.b(bundle, "activity_pause_click");
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.f10948a0.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f10948a0;
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

    public final void a0(String str) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        bundle.putString("activity_name", this.f10952z);
        bundle.putBoolean("main_activity", X().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("source", "template_activity");
        bundle.putString("action_source", str);
        gk.a.b(bundle, "activity_play_click");
    }

    public final void b0(String str) {
        Bundle bundle = new Bundle();
        defpackage.d.m(bundle, "course");
        bundle.putString("activity_name", this.f10952z);
        bundle.putBoolean("main_activity", X().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("action_source", "screen");
        bundle.putString("source", "template_activity");
        bundle.putString("progress_direction", str);
        gk.a.b(bundle, "activity_playtime_move");
    }

    public final void c0(Bundle bundle) {
        defpackage.d.m(bundle, "course");
        bundle.putString("activity_name", this.f10952z);
        bundle.putBoolean("main_activity", X().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("source", "template_activity");
    }

    public final void g0(String str) {
        o oVar = new o("n14a_audio", this.f10952z, str, this.D, 1L, 1L, this.B, 1052);
        ql.i S = S();
        Bundle bundle = new Bundle();
        bundle.putString("activity_name", this.f10952z);
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("source", "template_activity");
        bundle.putBoolean("main_activity", X().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("event_name", "activity_media_notif_click");
        hs.k kVar = hs.k.f19476a;
        S.getClass();
        v.H(kc.f.H(S), null, 0, new ql.k(S, oVar, bundle, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
    public final void h0(String str) {
        BufferedReader bufferedReader;
        String[] fileList;
        try {
            boolean z10 = true;
            if ((!n.B0(str)) && getActivity() != null) {
                p activity = getActivity();
                if (activity == null || (fileList = activity.fileList()) == null || !is.k.Q1(str, fileList)) {
                    z10 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT < 25) {
                        ((LottieAnimationView) _$_findCachedViewById(R.id.lavN14ScreenLottie)).setRenderMode(a3.t.SOFTWARE);
                    } else {
                        ((LottieAnimationView) _$_findCachedViewById(R.id.lavN14ScreenLottie)).setRenderMode(a3.t.HARDWARE);
                    }
                    x xVar = new x();
                    xVar.f23469u = "";
                    FileInputStream openFileInput = requireContext().openFileInput(str);
                    kotlin.jvm.internal.i.f(openFileInput, "requireContext().openFileInput(fileName)");
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
                    a3.d.d((String) xVar.f23469u).b(new pl.i(this, xVar, 0));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10949w, e10);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
    }

    public final void j0(String str) {
        File file = new File(requireContext().getFilesDir(), str);
        if (file.exists() && !n.B0(str)) {
            Uri parse = Uri.parse(file.getPath());
            PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView != null) {
                a0 a10 = new j.b(requireContext()).a();
                boolean z10 = false;
                a10.q0(new q7.d(3, 0, 1, 1), false);
                a10.t0(0.0f);
                l.a aVar = new l.a(requireContext());
                f0.b bVar = new f0.b(19, new u7.f());
                com.google.android.exoplayer2.drm.a aVar2 = new com.google.android.exoplayer2.drm.a();
                com.google.android.exoplayer2.upstream.a aVar3 = new com.google.android.exoplayer2.upstream.a();
                com.google.android.exoplayer2.q b10 = com.google.android.exoplayer2.q.b(parse);
                b10.f6685v.getClass();
                com.google.android.exoplayer2.source.n nVar = new com.google.android.exoplayer2.source.n(b10, aVar, bVar, aVar2.a(b10), aVar3, 1048576);
                a10.v0();
                com.google.android.exoplayer2.k kVar = a10.f6168d;
                kVar.getClass();
                kVar.w0(Collections.singletonList(nVar), -1, -9223372036854775807L, true);
                a10.l();
                Integer d10 = S().E.d();
                if (d10 != null && d10.intValue() == 3) {
                    z10 = true;
                }
                a10.z(z10);
                a10.B(1);
                a10.E((com.theinnerhour.b2b.components.dynamicActivities.fragments.b) this.X.getValue());
                playerView.setPlayer(a10);
            }
            PlayerView playerView2 = (PlayerView) _$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView2 != null) {
                playerView2.setResizeMode(4);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
        }
    }

    public final void k0() {
        String str;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
            if (appCompatImageView != null) {
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
            boolean z10 = false;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            a aVar = this.T;
            hs.k kVar = null;
            if (aVar != null && (str = aVar.f10958g) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (z10) {
                    str = null;
                }
                if (str != null) {
                    if (isAdded()) {
                        com.bumptech.glide.e<Drawable> p10 = Glide.h(this).p(str);
                        p10.w(new d());
                        p10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg));
                    }
                    kVar = hs.k.f19476a;
                }
            }
            if (kVar == null && isAdded()) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
                if (appCompatImageView3 != null) {
                    Context requireContext = requireContext();
                    Object obj = g0.a.f16164a;
                    appCompatImageView3.setImageDrawable(a.c.b(requireContext, R.drawable.ir_dynamic_connectivity_issues));
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBg);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setBackgroundColor(g0.a.b(requireContext(), R.color.white));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10949w, e10);
        }
    }

    public final void m0() {
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN14AScreenStartTime);
        if (robertoTextView != null) {
            robertoTextView.setText(this.E);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n14_a_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        w player;
        super.onDestroy();
        PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.v((com.theinnerhour.b2b.components.dynamicActivities.fragments.b) this.X.getValue());
            player.a();
        }
        S().f(0L);
        S().I.a().f876a.stop();
        MyApplication.V.a().unregisterReceiver(this.Z);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x034b, code lost:
        if (r2 == null) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0623  */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        a aVar;
        NewDynamicParentActivity newDynamicParentActivity;
        Long l2;
        String str2;
        boolean z10;
        long j10;
        final int i6;
        a aVar2;
        boolean z11;
        Object obj;
        String str3;
        Object obj2;
        String str4;
        String U;
        String str5;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        String str6;
        String str7;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        boolean z18;
        boolean z19;
        String[] strArr;
        HashMap<String, Object> data;
        HashMap<String, Object> data2;
        Object obj3;
        String str8;
        AudioHelper audioHelper;
        AppCompatImageView appCompatImageView;
        long parseLong;
        Boolean bool;
        boolean z20;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        t X = X();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("slug");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
        } else {
            num = null;
        }
        HashMap<String, Object> m10 = X.m(num, str);
        this.H = m10;
        if (m10 != null) {
            Object obj4 = m10.get("audio_duration");
            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
            if (n.B0((String) obj4)) {
                parseLong = 0;
            } else {
                Object obj5 = m10.get("audio_duration");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                parseLong = Long.parseLong((String) obj5);
            }
            Object obj6 = m10.get("activity_type");
            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
            String str9 = (String) obj6;
            Object obj7 = m10.get("audio_url");
            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
            String str10 = (String) obj7;
            Object obj8 = m10.get("heading");
            kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
            String str11 = (String) obj8;
            Object obj9 = m10.get("video_url");
            kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
            String str12 = (String) obj9;
            Object obj10 = m10.get("lottie_url");
            kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.String");
            String str13 = (String) obj10;
            Object obj11 = m10.get("fallback_image_url");
            kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.String");
            String str14 = (String) obj11;
            Object obj12 = m10.get("download_error");
            kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.String");
            String str15 = (String) obj12;
            Object obj13 = m10.get("internet_error");
            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type kotlin.String");
            String str16 = (String) obj13;
            Object obj14 = m10.get("generic_error");
            kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.String");
            String str17 = (String) obj14;
            Object obj15 = m10.get("show_info");
            if (obj15 instanceof Boolean) {
                bool = (Boolean) obj15;
            } else {
                bool = null;
            }
            if (bool != null) {
                z20 = bool.booleanValue();
            } else {
                z20 = false;
            }
            aVar = new a(parseLong, str9, str10, str11, str12, str13, str14, str15, str16, str17, z20);
        } else {
            aVar = null;
        }
        this.T = aVar;
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            int i12 = NewDynamicParentActivity.F;
            newDynamicParentActivity.N0(false, null);
        }
        v0 v0Var = new v0();
        Bundle bundle2 = new Bundle();
        a aVar3 = this.T;
        if (aVar3 != null) {
            l2 = Long.valueOf(aVar3.f10953a);
        } else {
            l2 = null;
        }
        bundle2.putString("duration", String.valueOf(l2));
        bundle2.putBoolean("isAudioCompleted", this.K);
        v0Var.setArguments(bundle2);
        this.G = v0Var;
        a aVar4 = this.T;
        if (aVar4 != null) {
            str2 = aVar4.f10954b;
        } else {
            str2 = null;
        }
        this.R = str2;
        String str18 = "";
        this.P = (aVar4 == null || (r0 = aVar4.f10955c) == null) ? "" : "";
        Utils utils = Utils.INSTANCE;
        String U2 = U();
        Context requireContext = requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        if (utils.getAudioFilePath(U2, requireContext) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        a aVar5 = this.T;
        this.f10952z = (aVar5 == null || (r10 = aVar5.f10956d) == null) ? "Audio" : "Audio";
        if (aVar5 != null) {
            j10 = aVar5.f10953a;
        } else {
            j10 = 0;
        }
        this.B = j10;
        if (!z10 && (!n.B0(U()))) {
            if (ConnectionStatusReceiver.isConnected() && (appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenDownloadButton)) != null) {
                appCompatImageView.setVisibility(0);
            }
            try {
                Context requireContext2 = requireContext();
                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                AudioHelper audioHelper2 = new AudioHelper(requireContext2, U());
                this.Q = audioHelper2;
                audioHelper2.registerDownloadReceivers();
                audioHelper = this.Q;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10949w, e10);
            }
            if (audioHelper != null) {
                audioHelper.getProgressLiveData().k(requireActivity());
                AudioHelper audioHelper3 = this.Q;
                if (audioHelper3 != null) {
                    audioHelper3.getProgressLiveData().e(requireActivity(), new hl.p(19, new pl.j(this)));
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ N14AScreenFragment f28600v;

                            {
                                this.f28600v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                N14AScreenFragment.a aVar6;
                                int i13 = r2;
                                NewDynamicParentActivity newDynamicParentActivity2 = null;
                                boolean z21 = false;
                                N14AScreenFragment this$0 = this.f28600v;
                                switch (i13) {
                                    case 0:
                                        int i14 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                            z21 = true;
                                        }
                                        if (z21) {
                                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                            CountDownTimer countDownTimer = this$0.f10951y;
                                            if (countDownTimer != null) {
                                                countDownTimer.start();
                                                return;
                                            }
                                            return;
                                        }
                                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                        return;
                                    case 1:
                                        int i15 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.Y("screen");
                                        return;
                                    case 2:
                                        int i16 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (this$0.N) {
                                            this$0.S().e(false);
                                            this$0.b0("back");
                                            return;
                                        }
                                        return;
                                    case 3:
                                        int i17 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (this$0.M) {
                                            this$0.S().e(true);
                                            this$0.b0("forward");
                                            return;
                                        }
                                        return;
                                    case 4:
                                        int i18 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        v0 v0Var2 = this$0.G;
                                        if (v0Var2 != null) {
                                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                            return;
                                        }
                                        return;
                                    case 5:
                                        int i19 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.U = true;
                                        Bundle bundle3 = new Bundle();
                                        defpackage.d.m(bundle3, "course");
                                        bundle3.putString("activity_name", this$0.f10952z);
                                        bundle3.putBoolean("main_activity", this$0.X().K);
                                        bundle3.putBoolean("is_revamped", true);
                                        bundle3.putString("source", "template_activity");
                                        gk.a.b(bundle3, "activity_done_click");
                                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                        }
                                        if (newDynamicParentActivity2 != null) {
                                            int i20 = NewDynamicParentActivity.F;
                                            newDynamicParentActivity2.L0(false);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        int i21 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                        }
                                        if (newDynamicParentActivity2 != null) {
                                            newDynamicParentActivity2.onBackPressed();
                                            return;
                                        }
                                        return;
                                    default:
                                        int i22 = N14AScreenFragment.f10947b0;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                            r rVar = new r(this$0);
                                            AudioHelper audioHelper4 = this$0.Q;
                                            if (audioHelper4 != null) {
                                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                                Bundle bundle4 = new Bundle();
                                                defpackage.d.m(bundle4, "course");
                                                bundle4.putString("activity_name", this$0.f10952z);
                                                bundle4.putBoolean("main_activity", this$0.X().K);
                                                bundle4.putBoolean("is_revamped", true);
                                                bundle4.putString("source", "template_activity");
                                                gk.a.b(bundle4, "activity_audio_download_start");
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("audioHelper");
                                            throw null;
                                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar6 = this$0.T) != null) {
                                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar6.f10960i);
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                    }
                } else {
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.i.q("audioHelper");
                throw null;
            }
        } else {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setImageResource(R.drawable.ic_nda_downloaded);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenDownloadButton);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setVisibility(0);
            }
        }
        if (!n.B0(U())) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN14AScreenHeader);
            if (robertoTextView != null) {
                robertoTextView.setText(this.f10952z);
            }
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnN14AScreenNextButton);
            if (robertoButton != null) {
                HashMap<String, Object> hashMap = this.H;
                if (hashMap != null) {
                    obj3 = hashMap.get("cta1");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str8 = (String) obj3;
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = getString(R.string.next);
                }
                robertoButton.setText(str8);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN14AScreenEndTime);
            if (robertoTextView2 != null) {
                Context requireContext3 = requireContext();
                kotlin.jvm.internal.i.f(requireContext3, "requireContext()");
                robertoTextView2.setText(i.a.C0504a.a(requireContext3, this.B * 1000));
            }
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbN14AScreenSeek)).setMax((int) (this.B * 1000));
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) _$_findCachedViewById(R.id.sbN14AScreenSeek);
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setOnSeekBarChangeListener(new s(this));
            }
            Context requireContext4 = requireContext();
            kotlin.jvm.internal.i.f(requireContext4, "requireContext()");
            this.E = i.a.C0504a.a(requireContext4, 0L);
            m0();
            NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = X().N;
            if (newDynamicActivityScreenDataClass != null && (data2 = newDynamicActivityScreenDataClass.getData()) != null) {
                obj = data2.get("image");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String uri = Uri.parse(str3).toString();
            kotlin.jvm.internal.i.f(uri, "parse(viewModel.infoMode… String ?: \"\").toString()");
            this.D = uri;
            NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass2 = X().N;
            if (newDynamicActivityScreenDataClass2 != null && (data = newDynamicActivityScreenDataClass2.getData()) != null) {
                obj2 = data.get("image");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str4 = (String) obj2;
            } else {
                str4 = null;
            }
            if (str4 != null) {
                str18 = str4;
            }
            Uri parse = Uri.parse(str18);
            kotlin.jvm.internal.i.f(parse, "parse(viewModel.infoMode…image\") as? String ?: \"\")");
            this.F = new i.a("n14a_audio", parse, this.f10952z, "", String.valueOf(this.B), false);
            ql.i S = S();
            if (this.I) {
                Utils utils2 = Utils.INSTANCE;
                String U3 = U();
                Context requireContext5 = requireContext();
                kotlin.jvm.internal.i.f(requireContext5, "requireContext()");
                U = utils2.getAudioFilePath(U3, requireContext5);
            }
            U = U();
            g0(U);
            S.B.e(getViewLifecycleOwner(), new hl.p(13, new m(this)));
            S.J.e(getViewLifecycleOwner(), new hl.p(14, new pl.n(this, S)));
            S.E.e(getViewLifecycleOwner(), new hl.p(15, new pl.p(this)));
            S.C.e(getViewLifecycleOwner(), new hl.p(16, new pl.q(this)));
            boolean A0 = n.A0(this.R, "video", true);
            t.a aVar6 = t.a.COMPLETED;
            if (A0) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavN14ScreenLottie);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(8);
                }
                a aVar7 = this.T;
                if (aVar7 != null) {
                    str6 = aVar7.f10957e;
                } else {
                    str6 = null;
                }
                if (str6 != null && (strArr = (String[]) r.a1(str6, new String[]{"/"}, 0, 6).toArray(new String[0])) != null) {
                    str7 = (String) is.k.b2(strArr);
                } else {
                    str7 = null;
                }
                if (str6 != null && !n.B0(str6)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (!z15) {
                    if (str7 != null && !n.B0(str7)) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (!z16) {
                        this.W = str7;
                        if (new File(requireContext().getFilesDir(), str7).exists()) {
                            ArrayList<hs.f<String, t.a>> d10 = X().f29786j0.d();
                            if (d10 != null) {
                                if (!d10.isEmpty()) {
                                    Iterator<T> it = d10.iterator();
                                    while (it.hasNext()) {
                                        hs.f fVar = (hs.f) it.next();
                                        if (kotlin.jvm.internal.i.b(fVar.f19464u, str7) && fVar.f19465v == aVar6) {
                                            z19 = true;
                                            continue;
                                        } else {
                                            z19 = false;
                                            continue;
                                        }
                                        if (z19) {
                                            z18 = true;
                                            break;
                                        }
                                    }
                                }
                                z18 = false;
                                if (z18) {
                                    z17 = true;
                                    if (z17) {
                                        j0(str7);
                                    }
                                }
                            }
                            z17 = false;
                            if (z17) {
                            }
                        }
                        androidx.lifecycle.w<ArrayList<hs.f<String, t.a>>> wVar = X().f29786j0;
                        ArrayList<hs.f<String, t.a>> d11 = wVar.d();
                        if (d11 != null) {
                            i11 = 0;
                            for (hs.f<String, t.a> fVar2 : d11) {
                                if (kotlin.jvm.internal.i.b(fVar2.f19464u, str7)) {
                                    break;
                                }
                                i11++;
                            }
                        }
                        i11 = -1;
                        if (i11 == -1) {
                            X().v(ca.a.k(new hs.f(str6, str7)));
                        }
                        wVar.e(getViewLifecycleOwner(), new hl.p(17, new pl.k(this, str7)));
                        k0();
                    }
                }
                k0();
            } else {
                ((PlayerView) _$_findCachedViewById(R.id.pvN14ScreenVideoPlayer)).setVisibility(8);
                ((LottieAnimationView) _$_findCachedViewById(R.id.lavN14ScreenLottie)).setVisibility(0);
                a aVar8 = this.T;
                if (aVar8 != null) {
                    str5 = aVar8.f;
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    String[] strArr2 = (String[]) r.a1(str5, new String[]{"/"}, 0, 6).toArray(new String[0]);
                    String str19 = strArr2[strArr2.length - 1];
                    if (new File(requireContext().getFilesDir(), str19).exists()) {
                        ArrayList<hs.f<String, t.a>> d12 = X().f29786j0.d();
                        if (d12 != null) {
                            if (!d12.isEmpty()) {
                                Iterator<T> it2 = d12.iterator();
                                while (it2.hasNext()) {
                                    hs.f fVar3 = (hs.f) it2.next();
                                    if (kotlin.jvm.internal.i.b(fVar3.f19464u, str19) && fVar3.f19465v == aVar6) {
                                        z14 = true;
                                        continue;
                                    } else {
                                        z14 = false;
                                        continue;
                                    }
                                    if (z14) {
                                        z13 = false;
                                        break;
                                    }
                                }
                            }
                            z13 = true;
                            if (z13) {
                                z12 = true;
                                if (z12) {
                                    h0(str19);
                                }
                            }
                        }
                        z12 = false;
                        if (z12) {
                        }
                    }
                    androidx.lifecycle.w<ArrayList<hs.f<String, t.a>>> wVar2 = X().f29786j0;
                    ArrayList<hs.f<String, t.a>> d13 = wVar2.d();
                    if (d13 != null) {
                        i10 = 0;
                        for (hs.f<String, t.a> fVar4 : d13) {
                            if (kotlin.jvm.internal.i.b(fVar4.f19464u, str19)) {
                                break;
                            }
                            i10++;
                        }
                    }
                    i10 = -1;
                    if (i10 == -1) {
                        X().v(ca.a.k(new hs.f(str5, str19)));
                    }
                    wVar2.e(getViewLifecycleOwner(), new hl.p(18, new pl.l(this, str19)));
                    k0();
                } else {
                    k0();
                }
            }
            if (this.L) {
                i6 = 0;
                ((RobertoButton) _$_findCachedViewById(R.id.btnN14AScreenNextButton)).setVisibility(0);
                _$_findCachedViewById(R.id.viewN14AScreenClicker).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenPrevious10Sec)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenNext10Sec)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                aVar2 = this.T;
                if (aVar2 == null && aVar2.f10962k) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenInfoButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ N14AScreenFragment f28600v;

                        {
                            this.f28600v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            N14AScreenFragment.a aVar62;
                            int i13 = i6;
                            NewDynamicParentActivity newDynamicParentActivity2 = null;
                            boolean z21 = false;
                            N14AScreenFragment this$0 = this.f28600v;
                            switch (i13) {
                                case 0:
                                    int i14 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                        z21 = true;
                                    }
                                    if (z21) {
                                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                        CountDownTimer countDownTimer = this$0.f10951y;
                                        if (countDownTimer != null) {
                                            countDownTimer.start();
                                            return;
                                        }
                                        return;
                                    }
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                    return;
                                case 1:
                                    int i15 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.Y("screen");
                                    return;
                                case 2:
                                    int i16 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (this$0.N) {
                                        this$0.S().e(false);
                                        this$0.b0("back");
                                        return;
                                    }
                                    return;
                                case 3:
                                    int i17 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (this$0.M) {
                                        this$0.S().e(true);
                                        this$0.b0("forward");
                                        return;
                                    }
                                    return;
                                case 4:
                                    int i18 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    v0 v0Var2 = this$0.G;
                                    if (v0Var2 != null) {
                                        v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i19 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.U = true;
                                    Bundle bundle3 = new Bundle();
                                    defpackage.d.m(bundle3, "course");
                                    bundle3.putString("activity_name", this$0.f10952z);
                                    bundle3.putBoolean("main_activity", this$0.X().K);
                                    bundle3.putBoolean("is_revamped", true);
                                    bundle3.putString("source", "template_activity");
                                    gk.a.b(bundle3, "activity_done_click");
                                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                    if (requireActivity2 instanceof NewDynamicParentActivity) {
                                        newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                    }
                                    if (newDynamicParentActivity2 != null) {
                                        int i20 = NewDynamicParentActivity.F;
                                        newDynamicParentActivity2.L0(false);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i21 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                    if (requireActivity3 instanceof NewDynamicParentActivity) {
                                        newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                    }
                                    if (newDynamicParentActivity2 != null) {
                                        newDynamicParentActivity2.onBackPressed();
                                        return;
                                    }
                                    return;
                                default:
                                    int i22 = N14AScreenFragment.f10947b0;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                        ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                        r rVar = new r(this$0);
                                        AudioHelper audioHelper4 = this$0.Q;
                                        if (audioHelper4 != null) {
                                            audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                            Bundle bundle4 = new Bundle();
                                            defpackage.d.m(bundle4, "course");
                                            bundle4.putString("activity_name", this$0.f10952z);
                                            bundle4.putBoolean("main_activity", this$0.X().K);
                                            bundle4.putBoolean("is_revamped", true);
                                            bundle4.putString("source", "template_activity");
                                            gk.a.b(bundle4, "activity_audio_download_start");
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("audioHelper");
                                        throw null;
                                    } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                        Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                        return;
                                    } else {
                                        return;
                                    }
                            }
                        }
                    });
                } else {
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenInfoButton);
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setVisibility(8);
                    }
                }
                ((RobertoButton) _$_findCachedViewById(R.id.btnN14AScreenNextButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14AScreenFragment f28600v;

                    {
                        this.f28600v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        N14AScreenFragment.a aVar62;
                        int i13 = i6;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        boolean z21 = false;
                        N14AScreenFragment this$0 = this.f28600v;
                        switch (i13) {
                            case 0:
                                int i14 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                                    z21 = true;
                                }
                                if (z21) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                                    CountDownTimer countDownTimer = this$0.f10951y;
                                    if (countDownTimer != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                                return;
                            case 1:
                                int i15 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.Y("screen");
                                return;
                            case 2:
                                int i16 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.N) {
                                    this$0.S().e(false);
                                    this$0.b0("back");
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.M) {
                                    this$0.S().e(true);
                                    this$0.b0("forward");
                                    return;
                                }
                                return;
                            case 4:
                                int i18 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                v0 v0Var2 = this$0.G;
                                if (v0Var2 != null) {
                                    v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                                    return;
                                }
                                return;
                            case 5:
                                int i19 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.U = true;
                                Bundle bundle3 = new Bundle();
                                defpackage.d.m(bundle3, "course");
                                bundle3.putString("activity_name", this$0.f10952z);
                                bundle3.putBoolean("main_activity", this$0.X().K);
                                bundle3.putBoolean("is_revamped", true);
                                bundle3.putString("source", "template_activity");
                                gk.a.b(bundle3, "activity_done_click");
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    int i20 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity2.L0(false);
                                    return;
                                }
                                return;
                            case 6:
                                int i21 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                            default:
                                int i22 = N14AScreenFragment.f10947b0;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                                    ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                                    r rVar = new r(this$0);
                                    AudioHelper audioHelper4 = this$0.Q;
                                    if (audioHelper4 != null) {
                                        audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                        Bundle bundle4 = new Bundle();
                                        defpackage.d.m(bundle4, "course");
                                        bundle4.putString("activity_name", this$0.f10952z);
                                        bundle4.putBoolean("main_activity", this$0.X().K);
                                        bundle4.putBoolean("is_revamped", true);
                                        bundle4.putString("source", "template_activity");
                                        gk.a.b(bundle4, "activity_audio_download_start");
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("audioHelper");
                                    throw null;
                                } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                                    Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                MyApplication a10 = MyApplication.V.a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.exoplayer.play");
                intentFilter.addAction("com.google.android.exoplayer.pause");
                hs.k kVar = hs.k.f19476a;
                a10.registerReceiver(this.Z, intentFilter);
            }
        }
        i6 = 0;
        _$_findCachedViewById(R.id.viewN14AScreenClicker).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenPrevious10Sec)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenNext10Sec)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        aVar2 = this.T;
        if (aVar2 == null) {
        }
        z11 = false;
        if (!z11) {
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnN14AScreenNextButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14AScreenBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14AScreenFragment f28600v;

            {
                this.f28600v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                N14AScreenFragment.a aVar62;
                int i13 = i6;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                boolean z21 = false;
                N14AScreenFragment this$0 = this.f28600v;
                switch (i13) {
                    case 0:
                        int i14 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).getProgress() == 1.0f) {
                            z21 = true;
                        }
                        if (z21) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).m(0.0f);
                            CountDownTimer countDownTimer = this$0.f10951y;
                            if (countDownTimer != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14AParentContainer)).A();
                        return;
                    case 1:
                        int i15 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.Y("screen");
                        return;
                    case 2:
                        int i16 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.N) {
                            this$0.S().e(false);
                            this$0.b0("back");
                            return;
                        }
                        return;
                    case 3:
                        int i17 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (this$0.M) {
                            this$0.S().e(true);
                            this$0.b0("forward");
                            return;
                        }
                        return;
                    case 4:
                        int i18 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        v0 v0Var2 = this$0.G;
                        if (v0Var2 != null) {
                            v0Var2.show(this$0.requireActivity().getSupportFragmentManager(), "infoDialog");
                            return;
                        }
                        return;
                    case 5:
                        int i19 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.U = true;
                        Bundle bundle3 = new Bundle();
                        defpackage.d.m(bundle3, "course");
                        bundle3.putString("activity_name", this$0.f10952z);
                        bundle3.putBoolean("main_activity", this$0.X().K);
                        bundle3.putBoolean("is_revamped", true);
                        bundle3.putString("source", "template_activity");
                        gk.a.b(bundle3, "activity_done_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity2 != null) {
                            int i20 = NewDynamicParentActivity.F;
                            newDynamicParentActivity2.L0(false);
                            return;
                        }
                        return;
                    case 6:
                        int i21 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i22 = N14AScreenFragment.f10947b0;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (ConnectionStatusReceiver.isConnected() && !this$0.O) {
                            ((CircularProgressBar) this$0._$_findCachedViewById(R.id.pbN14AScreenDownloadProgress)).setProgress(0.0f);
                            r rVar = new r(this$0);
                            AudioHelper audioHelper4 = this$0.Q;
                            if (audioHelper4 != null) {
                                audioHelper4.downloadAudioFile(this$0.U(), rVar);
                                Bundle bundle4 = new Bundle();
                                defpackage.d.m(bundle4, "course");
                                bundle4.putString("activity_name", this$0.f10952z);
                                bundle4.putBoolean("main_activity", this$0.X().K);
                                bundle4.putBoolean("is_revamped", true);
                                bundle4.putString("source", "template_activity");
                                gk.a.b(bundle4, "activity_audio_download_start");
                                return;
                            }
                            kotlin.jvm.internal.i.q("audioHelper");
                            throw null;
                        } else if (!ConnectionStatusReceiver.isConnected() && (aVar62 = this$0.T) != null) {
                            Utils.INSTANCE.showCustomToast(this$0.requireContext(), aVar62.f10960i);
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        MyApplication a102 = MyApplication.V.a();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.exoplayer.play");
        intentFilter2.addAction("com.google.android.exoplayer.pause");
        hs.k kVar2 = hs.k.f19476a;
        a102.registerReceiver(this.Z, intentFilter2);
    }

    @Override // rr.d
    public final void K() {
    }

    @Override // rr.d
    public final void M() {
    }
}
