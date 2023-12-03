package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import b9.l;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14CScreenFragment;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import gv.n;
import gv.r;
import hs.i;
import is.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import o7.s;
import ql.t;
import v.g;
import w5.h0;
/* compiled from: N14CScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N14CScreenFragment;", "Lrr/d;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N14CScreenFragment extends rr.d {
    public static final /* synthetic */ int S = 0;
    public HashMap<String, Object> A;
    public a B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public long H;
    public long I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;

    /* renamed from: z  reason: collision with root package name */
    public CountDownTimer f10977z;
    public final LinkedHashMap R = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f10974w = LogHelper.INSTANCE.makeLogTag("N14CScreenFragment");

    /* renamed from: x  reason: collision with root package name */
    public final long f10975x = 100;

    /* renamed from: y  reason: collision with root package name */
    public final m0 f10976y = b0.j(this, y.a(t.class), new c(this), new d(this), new e(this));
    public String O = "";
    public final Handler P = new Handler(Looper.getMainLooper());
    public final i Q = sp.b.O(new f());

    /* compiled from: N14CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f10978a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10979b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10980c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10981d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10982e;
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public final String f10983g;

        /* renamed from: h  reason: collision with root package name */
        public final String f10984h;

        /* renamed from: i  reason: collision with root package name */
        public final String f10985i;

        /* renamed from: j  reason: collision with root package name */
        public final String f10986j;

        /* renamed from: k  reason: collision with root package name */
        public final String f10987k;

        /* renamed from: l  reason: collision with root package name */
        public final String f10988l;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f10978a = str;
            this.f10979b = str2;
            this.f10980c = str3;
            this.f10981d = str4;
            this.f10982e = str5;
            this.f = str6;
            this.f10983g = str7;
            this.f10984h = str8;
            this.f10985i = str9;
            this.f10986j = str10;
            this.f10987k = str11;
            this.f10988l = str12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f10978a, aVar.f10978a) && kotlin.jvm.internal.i.b(this.f10979b, aVar.f10979b) && kotlin.jvm.internal.i.b(this.f10980c, aVar.f10980c) && kotlin.jvm.internal.i.b(this.f10981d, aVar.f10981d) && kotlin.jvm.internal.i.b(this.f10982e, aVar.f10982e) && kotlin.jvm.internal.i.b(this.f, aVar.f) && kotlin.jvm.internal.i.b(this.f10983g, aVar.f10983g) && kotlin.jvm.internal.i.b(this.f10984h, aVar.f10984h) && kotlin.jvm.internal.i.b(this.f10985i, aVar.f10985i) && kotlin.jvm.internal.i.b(this.f10986j, aVar.f10986j) && kotlin.jvm.internal.i.b(this.f10987k, aVar.f10987k) && kotlin.jvm.internal.i.b(this.f10988l, aVar.f10988l)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f10988l.hashCode() + pl.a.c(this.f10987k, pl.a.c(this.f10986j, pl.a.c(this.f10985i, pl.a.c(this.f10984h, pl.a.c(this.f10983g, pl.a.c(this.f, pl.a.c(this.f10982e, pl.a.c(this.f10981d, pl.a.c(this.f10980c, pl.a.c(this.f10979b, this.f10978a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActivityData(heading=");
            sb2.append(this.f10978a);
            sb2.append(", videoUrl=");
            sb2.append(this.f10979b);
            sb2.append(", fallbackImageUrl=");
            sb2.append(this.f10980c);
            sb2.append(", cta1=");
            sb2.append(this.f10981d);
            sb2.append(", cta2=");
            sb2.append(this.f10982e);
            sb2.append(", cta3=");
            sb2.append(this.f);
            sb2.append(", cta4=");
            sb2.append(this.f10983g);
            sb2.append(", videoDownloadError=");
            sb2.append(this.f10984h);
            sb2.append(", internetError=");
            sb2.append(this.f10985i);
            sb2.append(", genericError=");
            sb2.append(this.f10986j);
            sb2.append(", waitingDownloadMessage=");
            sb2.append(this.f10987k);
            sb2.append(", downloadFailedAttempts=");
            return g.c(sb2, this.f10988l, ')');
        }
    }

    /* compiled from: N14CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements z4.e<Drawable> {
        public b() {
        }

        @Override // z4.e
        public final /* bridge */ /* synthetic */ void a(Object obj) {
            Drawable drawable = (Drawable) obj;
        }

        @Override // z4.e
        public final void b(GlideException glideException) {
            N14CScreenFragment n14CScreenFragment = N14CScreenFragment.this;
            if (n14CScreenFragment.isAdded()) {
                try {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) n14CScreenFragment._$_findCachedViewById(R.id.ivN14CScreenBg);
                    if (appCompatImageView != null) {
                        Context requireContext = n14CScreenFragment.requireContext();
                        Object obj = g0.a.f16164a;
                        appCompatImageView.setImageDrawable(a.c.b(requireContext, R.drawable.ir_dynamic_connectivity_issues));
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) n14CScreenFragment._$_findCachedViewById(R.id.ivN14CScreenBg);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) n14CScreenFragment._$_findCachedViewById(R.id.ivN14CScreenBg);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setBackgroundColor(g0.a.b(n14CScreenFragment.requireContext(), R.color.white));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(n14CScreenFragment.f10974w, e10);
                }
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10990u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f10990u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f10990u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10991u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f10991u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f10991u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f10992u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f10992u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f10992u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    /* compiled from: N14CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<com.theinnerhour.b2b.components.dynamicActivities.fragments.c> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final com.theinnerhour.b2b.components.dynamicActivities.fragments.c invoke() {
            return new com.theinnerhour.b2b.components.dynamicActivities.fragments.c(N14CScreenFragment.this);
        }
    }

    @Override // rr.d
    public final void O() {
        NewDynamicParentActivity newDynamicParentActivity;
        w player;
        PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.v((com.theinnerhour.b2b.components.dynamicActivities.fragments.c) this.Q.getValue());
            player.a();
        }
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

    public final void P(String str, String str2) {
        if (ConnectionStatusReceiver.isConnected()) {
            this.L++;
            Q().v(ca.a.k(new hs.f(str, str2)));
            return;
        }
        a aVar = this.B;
        if (aVar != null) {
            Toast.makeText(requireContext(), aVar.f10985i, 0).show();
        }
    }

    public final t Q() {
        return (t) this.f10976y.getValue();
    }

    public final void S() {
        this.M = true;
        this.F = false;
        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
        rbN14CScreenBottomButtonHeader.setVisibility(8);
        Group grpN14CScreenButtons = (Group) _$_findCachedViewById(R.id.grpN14CScreenButtons);
        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
        grpN14CScreenButtons.setVisibility(0);
        this.E = false;
        CountDownTimer countDownTimer = this.f10977z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((MotionLayout) _$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
    }

    public final void U(Bundle bundle) {
        defpackage.d.m(bundle, "course");
        bundle.putString("activity_name", this.O);
        bundle.putBoolean("main_activity", Q().K);
        bundle.putBoolean("is_revamped", true);
        bundle.putString("source", "template_activity");
    }

    public final void X(String str) {
        boolean z10;
        File file = new File(requireContext().getFilesDir(), str);
        if (file.exists() && !n.B0(str)) {
            Uri parse = Uri.parse(file.getPath());
            PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView != null) {
                a0 a10 = new j.b(requireContext()).a();
                a10.q0(new q7.d(3, 0, 1, 1), true);
                int i6 = this.K;
                if (1 <= i6) {
                    int i10 = 1;
                    while (true) {
                        l.a aVar = new l.a(requireContext());
                        f0.b bVar = new f0.b(19, new u7.f());
                        com.google.android.exoplayer2.drm.a aVar2 = new com.google.android.exoplayer2.drm.a();
                        com.google.android.exoplayer2.upstream.a aVar3 = new com.google.android.exoplayer2.upstream.a();
                        q b10 = q.b(parse);
                        b10.f6685v.getClass();
                        com.google.android.exoplayer2.source.n nVar = new com.google.android.exoplayer2.source.n(b10, aVar, bVar, aVar2.a(b10), aVar3, 1048576);
                        a10.v0();
                        com.google.android.exoplayer2.k kVar = a10.f6168d;
                        kVar.getClass();
                        List singletonList = Collections.singletonList(nVar);
                        ArrayList arrayList = kVar.f6542l;
                        int size = arrayList.size();
                        if (size >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        sc.b.q(z10);
                        e0 e0Var = kVar.E.f27235a;
                        kVar.f6552w++;
                        ArrayList j02 = kVar.j0(size, singletonList);
                        o7.t tVar = new o7.t(arrayList, kVar.A);
                        s t02 = kVar.t0(kVar.E, tVar, kVar.p0(e0Var, tVar));
                        o8.l lVar = kVar.A;
                        m mVar = kVar.f6538h;
                        mVar.getClass();
                        mVar.B.c(new m.a(j02, lVar, -1, -9223372036854775807L), 18, size, 0).a();
                        kVar.A0(t02, 0, 1, false, false, 5, -9223372036854775807L, -1);
                        if (i10 == i6) {
                            break;
                        }
                        i10++;
                    }
                }
                a10.l();
                a10.E((com.theinnerhour.b2b.components.dynamicActivities.fragments.c) this.Q.getValue());
                playerView.setPlayer(a10);
            }
            PlayerView playerView2 = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView2 != null) {
                playerView2.setResizeMode(4);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
        }
    }

    public final void Y() {
        String str;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
            if (appCompatImageView != null) {
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
            boolean z10 = false;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            a aVar = this.B;
            hs.k kVar = null;
            if (aVar != null && (str = aVar.f10980c) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (z10) {
                    str = null;
                }
                if (str != null) {
                    if (isAdded()) {
                        com.bumptech.glide.e<Drawable> p10 = Glide.h(this).p(str);
                        p10.w(new b());
                        p10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg));
                    }
                    kVar = hs.k.f19476a;
                }
            }
            if (kVar == null && isAdded()) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
                if (appCompatImageView3 != null) {
                    Context requireContext = requireContext();
                    Object obj = g0.a.f16164a;
                    appCompatImageView3.setImageDrawable(a.c.b(requireContext, R.drawable.ir_dynamic_connectivity_issues));
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBg);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setBackgroundColor(g0.a.b(requireContext(), R.color.white));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10974w, e10);
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.R.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.R;
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_n14_c_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w player;
        Window window;
        super.onDestroyView();
        p activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        this.I = 0L;
        this.J = 0L;
        this.E = false;
        PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.v((com.theinnerhour.b2b.components.dynamicActivities.fragments.c) this.Q.getValue());
            player.a();
        }
        this.P.removeCallbacksAndMessages(null);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        w player;
        super.onPause();
        if (this.E) {
            PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView != null && (player = playerView.getPlayer()) != null) {
                player.pause();
            }
            this.F = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        w player;
        w wVar;
        super.onResume();
        w wVar2 = null;
        if (this.F) {
            PlayerView playerView = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView != null) {
                wVar = playerView.getPlayer();
            } else {
                wVar = null;
            }
            if (wVar != null) {
                wVar.z(true);
            }
        }
        if (this.M) {
            PlayerView playerView2 = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                player.f(0, 0L);
            }
            PlayerView playerView3 = (PlayerView) _$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView3 != null) {
                wVar2 = playerView3.getPlayer();
            }
            if (wVar2 != null) {
                wVar2.z(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030c A[SYNTHETIC] */
    @Override // rr.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        a aVar;
        Object obj;
        ArrayList arrayList;
        HashMap hashMap;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Integer num2;
        int i6;
        NewDynamicParentActivity newDynamicParentActivity;
        String str5;
        boolean z10;
        String string;
        String string2;
        String str6;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        String[] strArr;
        String string3;
        String str7;
        HashMap hashMap2;
        Window window;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        p activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        t Q = Q();
        Bundle arguments = getArguments();
        String str8 = null;
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
        HashMap<String, Object> m10 = Q.m(num, str);
        this.A = m10;
        if (m10 != null) {
            Object obj5 = m10.get("heading");
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
            String str9 = (String) obj5;
            Object obj6 = m10.get("video_url");
            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
            String str10 = (String) obj6;
            Object obj7 = m10.get("fallback_image_url");
            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
            String str11 = (String) obj7;
            Object obj8 = m10.get("cta1");
            kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
            String str12 = (String) obj8;
            Object obj9 = m10.get("cta2");
            kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
            String str13 = (String) obj9;
            Object obj10 = m10.get("cta3");
            kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.String");
            String str14 = (String) obj10;
            Object obj11 = m10.get("cta4");
            kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.String");
            String str15 = (String) obj11;
            Object obj12 = m10.get("download_error");
            kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.String");
            String str16 = (String) obj12;
            Object obj13 = m10.get("internet_error");
            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type kotlin.String");
            String str17 = (String) obj13;
            Object obj14 = m10.get("generic_error");
            kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.String");
            String str18 = (String) obj14;
            Object obj15 = m10.get("download_waiting_message");
            kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type kotlin.String");
            Object obj16 = m10.get("download_retry_failed");
            kotlin.jvm.internal.i.e(obj16, "null cannot be cast to non-null type kotlin.String");
            aVar = new a(str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, (String) obj15, (String) obj16);
        } else {
            aVar = null;
        }
        this.B = aVar;
        HashMap<String, Object> hashMap3 = this.A;
        if (hashMap3 != null) {
            obj = hashMap3.get("local_data");
        } else {
            obj = null;
        }
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj17 : arrayList) {
                if (obj17 instanceof HashMap) {
                    hashMap2 = (HashMap) obj17;
                } else {
                    hashMap2 = null;
                }
                if (hashMap2 != null) {
                    arrayList2.add(hashMap2);
                }
            }
            hashMap = (HashMap) u.i2(arrayList2);
        } else {
            hashMap = null;
        }
        t Q2 = Q();
        if (hashMap != null) {
            obj2 = hashMap.get("screen_slug");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (hashMap != null) {
            obj3 = hashMap.get("screen_id");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        if (hashMap != null) {
            obj4 = hashMap.get("screen_data_key");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        Object o10 = Q2.o(str2, str3, str4);
        if (o10 instanceof Integer) {
            num2 = (Integer) o10;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            i6 = num2.intValue();
        } else {
            i6 = 1;
        }
        this.K = i6;
        p requireActivity = requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            int i11 = NewDynamicParentActivity.F;
            newDynamicParentActivity.N0(false, null);
        }
        a aVar2 = this.B;
        if (aVar2 != null && (str7 = aVar2.f10979b) != null) {
            Utils utils = Utils.INSTANCE;
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            str5 = utils.getAudioFilePath(str7, requireContext);
        } else {
            str5 = null;
        }
        if (str5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        ((AppCompatSeekBar) _$_findCachedViewById(R.id.sbN14CScreenSeek)).getThumb().mutate().setAlpha(0);
        a aVar3 = this.B;
        this.O = (aVar3 == null || (r5 = aVar3.f10978a) == null) ? "Exercise" : "Exercise";
        ((RobertoTextView) _$_findCachedViewById(R.id.tvN14CScreenHeader)).setText(this.O);
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton1);
        a aVar4 = this.B;
        if (aVar4 == null || (string = aVar4.f) == null) {
            string = getString(R.string.repeat);
        }
        robertoButton.setText(string);
        RobertoButton robertoButton2 = (RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton2);
        a aVar5 = this.B;
        if (aVar5 == null || (string2 = aVar5.f10983g) == null) {
            string2 = getString(R.string.done_label);
        }
        robertoButton2.setText(string2);
        RobertoButton robertoButton3 = (RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
        if (robertoButton3 != null) {
            a aVar6 = this.B;
            if (aVar6 == null || (string3 = aVar6.f10981d) == null) {
                string3 = getString(R.string.start);
            }
            robertoButton3.setText(string3);
            robertoButton3.setTextColor(g0.a.b(requireContext(), R.color.white));
            robertoButton3.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(requireContext(), R.color.amahaTerracota)));
            robertoButton3.setBackground(a.c.b(requireContext(), R.drawable.background_stroke_terracota_corner_24dp));
        }
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) _$_findCachedViewById(R.id.sbN14CScreenSeek);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setOnTouchListener(new h0(8));
        }
        this.M = false;
        a aVar7 = this.B;
        if (aVar7 != null) {
            str6 = aVar7.f10979b;
        } else {
            str6 = null;
        }
        if (str6 != null && (strArr = (String[]) r.a1(str6, new String[]{"/"}, 0, 6).toArray(new String[0])) != null) {
            str8 = (String) is.k.b2(strArr);
        }
        if (str6 != null && !n.B0(str6)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            if (str8 != null && !n.B0(str8)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12) {
                this.G = str8;
                if (new File(requireContext().getFilesDir(), str8).exists()) {
                    ArrayList<hs.f<String, t.a>> d10 = Q().f29786j0.d();
                    if (d10 != null) {
                        if (!d10.isEmpty()) {
                            Iterator<T> it = d10.iterator();
                            while (it.hasNext()) {
                                hs.f fVar = (hs.f) it.next();
                                if (kotlin.jvm.internal.i.b(fVar.f19464u, str8)) {
                                    if (fVar.f19465v == t.a.COMPLETED) {
                                        z15 = true;
                                        continue;
                                        if (z15) {
                                            z14 = true;
                                            break;
                                        }
                                    }
                                }
                                z15 = false;
                                continue;
                                if (z15) {
                                }
                            }
                        }
                        z14 = false;
                        if (z14) {
                            z13 = true;
                            if (z13) {
                                this.C = true;
                                X(str8);
                                _$_findCachedViewById(R.id.viewN14CScreenClicker).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ N14CScreenFragment f28633v;

                                    {
                                        this.f28633v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        CountDownTimer countDownTimer;
                                        String str19;
                                        String str20;
                                        String string4;
                                        com.google.android.exoplayer2.w wVar;
                                        String string5;
                                        com.google.android.exoplayer2.w player;
                                        int i12 = r2;
                                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                                        com.google.android.exoplayer2.w wVar2 = null;
                                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                                        com.google.android.exoplayer2.w wVar3 = null;
                                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                                        boolean z16 = true;
                                        N14CScreenFragment this$0 = this.f28633v;
                                        switch (i12) {
                                            case 0:
                                                int i13 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                                        countDownTimer.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                                return;
                                            case 1:
                                                int i14 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                                N14CScreenFragment.a aVar8 = this$0.B;
                                                if (aVar8 != null) {
                                                    str19 = aVar8.f10981d;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (text.equals(str19)) {
                                                    if (this$0.C) {
                                                        Bundle bundle2 = new Bundle();
                                                        this$0.U(bundle2);
                                                        bundle2.putString("action_source", "screen");
                                                        gk.a.b(bundle2, "activity_play_click");
                                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                        if (robertoButton4 != null) {
                                                            N14CScreenFragment.a aVar9 = this$0.B;
                                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                                string4 = this$0.getString(R.string.skip);
                                                            }
                                                            robertoButton4.setText(string4);
                                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                            robertoButton4.setBackground(null);
                                                        }
                                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                                        sbN14CScreenSeek.setVisibility(0);
                                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                        if (playerView != null) {
                                                            wVar3 = playerView.getPlayer();
                                                        }
                                                        if (wVar3 != null) {
                                                            wVar3.z(true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar10 = this$0.B;
                                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                                        if (ConnectionStatusReceiver.isConnected()) {
                                                            if (this$0.D) {
                                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                                if (aVar11 != null) {
                                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            N14CScreenFragment.a aVar12 = this$0.B;
                                                            if (aVar12 != null) {
                                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        N14CScreenFragment.a aVar13 = this$0.B;
                                                        if (aVar13 != null) {
                                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar14 = this$0.B;
                                                    if (aVar14 != null) {
                                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String str21 = gk.a.f16573a;
                                                Bundle bundle3 = new Bundle();
                                                this$0.U(bundle3);
                                                gk.a.b(bundle3, "activity_skip_click");
                                                this$0.S();
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                                }
                                                if (newDynamicParentActivity4 != null) {
                                                    int i15 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity4.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                int i16 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                String str22 = gk.a.f16573a;
                                                Bundle bundle4 = new Bundle();
                                                this$0.U(bundle4);
                                                gk.a.b(bundle4, "activity_done_click");
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                                }
                                                if (newDynamicParentActivity3 != null) {
                                                    int i17 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity3.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                int i18 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                Bundle bundle5 = new Bundle();
                                                this$0.U(bundle5);
                                                bundle5.putString("action_source", "screen");
                                                gk.a.b(bundle5, "activity_redo_click");
                                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                                    player.f(0, 0L);
                                                }
                                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView3 != null) {
                                                    wVar = playerView3.getPlayer();
                                                } else {
                                                    wVar = null;
                                                }
                                                if (wVar != null) {
                                                    wVar.z(false);
                                                }
                                                this$0.I = 0L;
                                                this$0.J = 0L;
                                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                                grpN14CScreenButtons.setVisibility(8);
                                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                if (robertoButton5 != null) {
                                                    N14CScreenFragment.a aVar15 = this$0.B;
                                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                                        string5 = this$0.getString(R.string.skip);
                                                    }
                                                    robertoButton5.setText(string5);
                                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                    robertoButton5.setBackground(null);
                                                }
                                                this$0.M = false;
                                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView4 != null) {
                                                    wVar2 = playerView4.getPlayer();
                                                }
                                                if (wVar2 != null) {
                                                    wVar2.z(true);
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i19 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                                }
                                                if (newDynamicParentActivity2 != null) {
                                                    newDynamicParentActivity2.onBackPressed();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ N14CScreenFragment f28633v;

                                    {
                                        this.f28633v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        CountDownTimer countDownTimer;
                                        String str19;
                                        String str20;
                                        String string4;
                                        com.google.android.exoplayer2.w wVar;
                                        String string5;
                                        com.google.android.exoplayer2.w player;
                                        int i12 = r2;
                                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                                        com.google.android.exoplayer2.w wVar2 = null;
                                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                                        com.google.android.exoplayer2.w wVar3 = null;
                                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                                        boolean z16 = true;
                                        N14CScreenFragment this$0 = this.f28633v;
                                        switch (i12) {
                                            case 0:
                                                int i13 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                                        countDownTimer.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                                return;
                                            case 1:
                                                int i14 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                                N14CScreenFragment.a aVar8 = this$0.B;
                                                if (aVar8 != null) {
                                                    str19 = aVar8.f10981d;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (text.equals(str19)) {
                                                    if (this$0.C) {
                                                        Bundle bundle2 = new Bundle();
                                                        this$0.U(bundle2);
                                                        bundle2.putString("action_source", "screen");
                                                        gk.a.b(bundle2, "activity_play_click");
                                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                        if (robertoButton4 != null) {
                                                            N14CScreenFragment.a aVar9 = this$0.B;
                                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                                string4 = this$0.getString(R.string.skip);
                                                            }
                                                            robertoButton4.setText(string4);
                                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                            robertoButton4.setBackground(null);
                                                        }
                                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                                        sbN14CScreenSeek.setVisibility(0);
                                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                        if (playerView != null) {
                                                            wVar3 = playerView.getPlayer();
                                                        }
                                                        if (wVar3 != null) {
                                                            wVar3.z(true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar10 = this$0.B;
                                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                                        if (ConnectionStatusReceiver.isConnected()) {
                                                            if (this$0.D) {
                                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                                if (aVar11 != null) {
                                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            N14CScreenFragment.a aVar12 = this$0.B;
                                                            if (aVar12 != null) {
                                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        N14CScreenFragment.a aVar13 = this$0.B;
                                                        if (aVar13 != null) {
                                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar14 = this$0.B;
                                                    if (aVar14 != null) {
                                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String str21 = gk.a.f16573a;
                                                Bundle bundle3 = new Bundle();
                                                this$0.U(bundle3);
                                                gk.a.b(bundle3, "activity_skip_click");
                                                this$0.S();
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                                }
                                                if (newDynamicParentActivity4 != null) {
                                                    int i15 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity4.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                int i16 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                String str22 = gk.a.f16573a;
                                                Bundle bundle4 = new Bundle();
                                                this$0.U(bundle4);
                                                gk.a.b(bundle4, "activity_done_click");
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                                }
                                                if (newDynamicParentActivity3 != null) {
                                                    int i17 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity3.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                int i18 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                Bundle bundle5 = new Bundle();
                                                this$0.U(bundle5);
                                                bundle5.putString("action_source", "screen");
                                                gk.a.b(bundle5, "activity_redo_click");
                                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                                    player.f(0, 0L);
                                                }
                                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView3 != null) {
                                                    wVar = playerView3.getPlayer();
                                                } else {
                                                    wVar = null;
                                                }
                                                if (wVar != null) {
                                                    wVar.z(false);
                                                }
                                                this$0.I = 0L;
                                                this$0.J = 0L;
                                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                                grpN14CScreenButtons.setVisibility(8);
                                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                if (robertoButton5 != null) {
                                                    N14CScreenFragment.a aVar15 = this$0.B;
                                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                                        string5 = this$0.getString(R.string.skip);
                                                    }
                                                    robertoButton5.setText(string5);
                                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                    robertoButton5.setBackground(null);
                                                }
                                                this$0.M = false;
                                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView4 != null) {
                                                    wVar2 = playerView4.getPlayer();
                                                }
                                                if (wVar2 != null) {
                                                    wVar2.z(true);
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i19 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                                }
                                                if (newDynamicParentActivity2 != null) {
                                                    newDynamicParentActivity2.onBackPressed();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton2)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ N14CScreenFragment f28633v;

                                    {
                                        this.f28633v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        CountDownTimer countDownTimer;
                                        String str19;
                                        String str20;
                                        String string4;
                                        com.google.android.exoplayer2.w wVar;
                                        String string5;
                                        com.google.android.exoplayer2.w player;
                                        int i12 = r2;
                                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                                        com.google.android.exoplayer2.w wVar2 = null;
                                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                                        com.google.android.exoplayer2.w wVar3 = null;
                                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                                        boolean z16 = true;
                                        N14CScreenFragment this$0 = this.f28633v;
                                        switch (i12) {
                                            case 0:
                                                int i13 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                                        countDownTimer.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                                return;
                                            case 1:
                                                int i14 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                                N14CScreenFragment.a aVar8 = this$0.B;
                                                if (aVar8 != null) {
                                                    str19 = aVar8.f10981d;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (text.equals(str19)) {
                                                    if (this$0.C) {
                                                        Bundle bundle2 = new Bundle();
                                                        this$0.U(bundle2);
                                                        bundle2.putString("action_source", "screen");
                                                        gk.a.b(bundle2, "activity_play_click");
                                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                        if (robertoButton4 != null) {
                                                            N14CScreenFragment.a aVar9 = this$0.B;
                                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                                string4 = this$0.getString(R.string.skip);
                                                            }
                                                            robertoButton4.setText(string4);
                                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                            robertoButton4.setBackground(null);
                                                        }
                                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                                        sbN14CScreenSeek.setVisibility(0);
                                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                        if (playerView != null) {
                                                            wVar3 = playerView.getPlayer();
                                                        }
                                                        if (wVar3 != null) {
                                                            wVar3.z(true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar10 = this$0.B;
                                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                                        if (ConnectionStatusReceiver.isConnected()) {
                                                            if (this$0.D) {
                                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                                if (aVar11 != null) {
                                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            N14CScreenFragment.a aVar12 = this$0.B;
                                                            if (aVar12 != null) {
                                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        N14CScreenFragment.a aVar13 = this$0.B;
                                                        if (aVar13 != null) {
                                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar14 = this$0.B;
                                                    if (aVar14 != null) {
                                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String str21 = gk.a.f16573a;
                                                Bundle bundle3 = new Bundle();
                                                this$0.U(bundle3);
                                                gk.a.b(bundle3, "activity_skip_click");
                                                this$0.S();
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                                }
                                                if (newDynamicParentActivity4 != null) {
                                                    int i15 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity4.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                int i16 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                String str22 = gk.a.f16573a;
                                                Bundle bundle4 = new Bundle();
                                                this$0.U(bundle4);
                                                gk.a.b(bundle4, "activity_done_click");
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                                }
                                                if (newDynamicParentActivity3 != null) {
                                                    int i17 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity3.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                int i18 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                Bundle bundle5 = new Bundle();
                                                this$0.U(bundle5);
                                                bundle5.putString("action_source", "screen");
                                                gk.a.b(bundle5, "activity_redo_click");
                                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                                    player.f(0, 0L);
                                                }
                                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView3 != null) {
                                                    wVar = playerView3.getPlayer();
                                                } else {
                                                    wVar = null;
                                                }
                                                if (wVar != null) {
                                                    wVar.z(false);
                                                }
                                                this$0.I = 0L;
                                                this$0.J = 0L;
                                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                                grpN14CScreenButtons.setVisibility(8);
                                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                if (robertoButton5 != null) {
                                                    N14CScreenFragment.a aVar15 = this$0.B;
                                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                                        string5 = this$0.getString(R.string.skip);
                                                    }
                                                    robertoButton5.setText(string5);
                                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                    robertoButton5.setBackground(null);
                                                }
                                                this$0.M = false;
                                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView4 != null) {
                                                    wVar2 = playerView4.getPlayer();
                                                }
                                                if (wVar2 != null) {
                                                    wVar2.z(true);
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i19 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                                }
                                                if (newDynamicParentActivity2 != null) {
                                                    newDynamicParentActivity2.onBackPressed();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton1)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ N14CScreenFragment f28633v;

                                    {
                                        this.f28633v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        CountDownTimer countDownTimer;
                                        String str19;
                                        String str20;
                                        String string4;
                                        com.google.android.exoplayer2.w wVar;
                                        String string5;
                                        com.google.android.exoplayer2.w player;
                                        int i12 = r2;
                                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                                        com.google.android.exoplayer2.w wVar2 = null;
                                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                                        com.google.android.exoplayer2.w wVar3 = null;
                                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                                        boolean z16 = true;
                                        N14CScreenFragment this$0 = this.f28633v;
                                        switch (i12) {
                                            case 0:
                                                int i13 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                                        countDownTimer.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                                return;
                                            case 1:
                                                int i14 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                                N14CScreenFragment.a aVar8 = this$0.B;
                                                if (aVar8 != null) {
                                                    str19 = aVar8.f10981d;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (text.equals(str19)) {
                                                    if (this$0.C) {
                                                        Bundle bundle2 = new Bundle();
                                                        this$0.U(bundle2);
                                                        bundle2.putString("action_source", "screen");
                                                        gk.a.b(bundle2, "activity_play_click");
                                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                        if (robertoButton4 != null) {
                                                            N14CScreenFragment.a aVar9 = this$0.B;
                                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                                string4 = this$0.getString(R.string.skip);
                                                            }
                                                            robertoButton4.setText(string4);
                                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                            robertoButton4.setBackground(null);
                                                        }
                                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                                        sbN14CScreenSeek.setVisibility(0);
                                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                        if (playerView != null) {
                                                            wVar3 = playerView.getPlayer();
                                                        }
                                                        if (wVar3 != null) {
                                                            wVar3.z(true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar10 = this$0.B;
                                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                                        if (ConnectionStatusReceiver.isConnected()) {
                                                            if (this$0.D) {
                                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                                if (aVar11 != null) {
                                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            N14CScreenFragment.a aVar12 = this$0.B;
                                                            if (aVar12 != null) {
                                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        N14CScreenFragment.a aVar13 = this$0.B;
                                                        if (aVar13 != null) {
                                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar14 = this$0.B;
                                                    if (aVar14 != null) {
                                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String str21 = gk.a.f16573a;
                                                Bundle bundle3 = new Bundle();
                                                this$0.U(bundle3);
                                                gk.a.b(bundle3, "activity_skip_click");
                                                this$0.S();
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                                }
                                                if (newDynamicParentActivity4 != null) {
                                                    int i15 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity4.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                int i16 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                String str22 = gk.a.f16573a;
                                                Bundle bundle4 = new Bundle();
                                                this$0.U(bundle4);
                                                gk.a.b(bundle4, "activity_done_click");
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                                }
                                                if (newDynamicParentActivity3 != null) {
                                                    int i17 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity3.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                int i18 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                Bundle bundle5 = new Bundle();
                                                this$0.U(bundle5);
                                                bundle5.putString("action_source", "screen");
                                                gk.a.b(bundle5, "activity_redo_click");
                                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                                    player.f(0, 0L);
                                                }
                                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView3 != null) {
                                                    wVar = playerView3.getPlayer();
                                                } else {
                                                    wVar = null;
                                                }
                                                if (wVar != null) {
                                                    wVar.z(false);
                                                }
                                                this$0.I = 0L;
                                                this$0.J = 0L;
                                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                                grpN14CScreenButtons.setVisibility(8);
                                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                if (robertoButton5 != null) {
                                                    N14CScreenFragment.a aVar15 = this$0.B;
                                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                                        string5 = this$0.getString(R.string.skip);
                                                    }
                                                    robertoButton5.setText(string5);
                                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                    robertoButton5.setBackground(null);
                                                }
                                                this$0.M = false;
                                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView4 != null) {
                                                    wVar2 = playerView4.getPlayer();
                                                }
                                                if (wVar2 != null) {
                                                    wVar2.z(true);
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i19 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                                }
                                                if (newDynamicParentActivity2 != null) {
                                                    newDynamicParentActivity2.onBackPressed();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ N14CScreenFragment f28633v;

                                    {
                                        this.f28633v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        CountDownTimer countDownTimer;
                                        String str19;
                                        String str20;
                                        String string4;
                                        com.google.android.exoplayer2.w wVar;
                                        String string5;
                                        com.google.android.exoplayer2.w player;
                                        int i12 = r2;
                                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                                        com.google.android.exoplayer2.w wVar2 = null;
                                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                                        com.google.android.exoplayer2.w wVar3 = null;
                                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                                        boolean z16 = true;
                                        N14CScreenFragment this$0 = this.f28633v;
                                        switch (i12) {
                                            case 0:
                                                int i13 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                                        countDownTimer.start();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                                return;
                                            case 1:
                                                int i14 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                                N14CScreenFragment.a aVar8 = this$0.B;
                                                if (aVar8 != null) {
                                                    str19 = aVar8.f10981d;
                                                } else {
                                                    str19 = null;
                                                }
                                                if (text.equals(str19)) {
                                                    if (this$0.C) {
                                                        Bundle bundle2 = new Bundle();
                                                        this$0.U(bundle2);
                                                        bundle2.putString("action_source", "screen");
                                                        gk.a.b(bundle2, "activity_play_click");
                                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                        if (robertoButton4 != null) {
                                                            N14CScreenFragment.a aVar9 = this$0.B;
                                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                                string4 = this$0.getString(R.string.skip);
                                                            }
                                                            robertoButton4.setText(string4);
                                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                            robertoButton4.setBackground(null);
                                                        }
                                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                                        sbN14CScreenSeek.setVisibility(0);
                                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                        if (playerView != null) {
                                                            wVar3 = playerView.getPlayer();
                                                        }
                                                        if (wVar3 != null) {
                                                            wVar3.z(true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar10 = this$0.B;
                                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                                        if (ConnectionStatusReceiver.isConnected()) {
                                                            if (this$0.D) {
                                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                                if (aVar11 != null) {
                                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            N14CScreenFragment.a aVar12 = this$0.B;
                                                            if (aVar12 != null) {
                                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        N14CScreenFragment.a aVar13 = this$0.B;
                                                        if (aVar13 != null) {
                                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    N14CScreenFragment.a aVar14 = this$0.B;
                                                    if (aVar14 != null) {
                                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String str21 = gk.a.f16573a;
                                                Bundle bundle3 = new Bundle();
                                                this$0.U(bundle3);
                                                gk.a.b(bundle3, "activity_skip_click");
                                                this$0.S();
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                                }
                                                if (newDynamicParentActivity4 != null) {
                                                    int i15 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity4.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                int i16 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                String str22 = gk.a.f16573a;
                                                Bundle bundle4 = new Bundle();
                                                this$0.U(bundle4);
                                                gk.a.b(bundle4, "activity_done_click");
                                                this$0.N = true;
                                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                                }
                                                if (newDynamicParentActivity3 != null) {
                                                    int i17 = NewDynamicParentActivity.F;
                                                    newDynamicParentActivity3.L0(false);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                int i18 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                Bundle bundle5 = new Bundle();
                                                this$0.U(bundle5);
                                                bundle5.putString("action_source", "screen");
                                                gk.a.b(bundle5, "activity_redo_click");
                                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                                    player.f(0, 0L);
                                                }
                                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView3 != null) {
                                                    wVar = playerView3.getPlayer();
                                                } else {
                                                    wVar = null;
                                                }
                                                if (wVar != null) {
                                                    wVar.z(false);
                                                }
                                                this$0.I = 0L;
                                                this$0.J = 0L;
                                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                                grpN14CScreenButtons.setVisibility(8);
                                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                                if (robertoButton5 != null) {
                                                    N14CScreenFragment.a aVar15 = this$0.B;
                                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                                        string5 = this$0.getString(R.string.skip);
                                                    }
                                                    robertoButton5.setText(string5);
                                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                                    robertoButton5.setBackground(null);
                                                }
                                                this$0.M = false;
                                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                                if (playerView4 != null) {
                                                    wVar2 = playerView4.getPlayer();
                                                }
                                                if (wVar2 != null) {
                                                    wVar2.z(true);
                                                    return;
                                                }
                                                return;
                                            default:
                                                int i19 = N14CScreenFragment.S;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                                }
                                                if (newDynamicParentActivity2 != null) {
                                                    newDynamicParentActivity2.onBackPressed();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                            }
                        }
                    }
                    z13 = false;
                    if (z13) {
                    }
                }
                androidx.lifecycle.w<ArrayList<hs.f<String, t.a>>> wVar = Q().f29786j0;
                ArrayList<hs.f<String, t.a>> d11 = wVar.d();
                if (d11 != null) {
                    i10 = 0;
                    for (hs.f<String, t.a> fVar2 : d11) {
                        if (kotlin.jvm.internal.i.b(fVar2.f19464u, str8)) {
                            break;
                        }
                        i10++;
                    }
                }
                i10 = -1;
                if (i10 == -1) {
                    P(str6, str8);
                }
                wVar.e(getViewLifecycleOwner(), new hl.p(20, new pl.u(this, str8, str6)));
                Y();
                _$_findCachedViewById(R.id.viewN14CScreenClicker).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14CScreenFragment f28633v;

                    {
                        this.f28633v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CountDownTimer countDownTimer;
                        String str19;
                        String str20;
                        String string4;
                        com.google.android.exoplayer2.w wVar2;
                        String string5;
                        com.google.android.exoplayer2.w player;
                        int i12 = r2;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        com.google.android.exoplayer2.w wVar22 = null;
                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                        com.google.android.exoplayer2.w wVar3 = null;
                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                        boolean z16 = true;
                        N14CScreenFragment this$0 = this.f28633v;
                        switch (i12) {
                            case 0:
                                int i13 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                    z16 = false;
                                }
                                if (z16) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                return;
                            case 1:
                                int i14 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                N14CScreenFragment.a aVar8 = this$0.B;
                                if (aVar8 != null) {
                                    str19 = aVar8.f10981d;
                                } else {
                                    str19 = null;
                                }
                                if (text.equals(str19)) {
                                    if (this$0.C) {
                                        Bundle bundle2 = new Bundle();
                                        this$0.U(bundle2);
                                        bundle2.putString("action_source", "screen");
                                        gk.a.b(bundle2, "activity_play_click");
                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                        if (robertoButton4 != null) {
                                            N14CScreenFragment.a aVar9 = this$0.B;
                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                string4 = this$0.getString(R.string.skip);
                                            }
                                            robertoButton4.setText(string4);
                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                            robertoButton4.setBackground(null);
                                        }
                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                        sbN14CScreenSeek.setVisibility(0);
                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                        if (playerView != null) {
                                            wVar3 = playerView.getPlayer();
                                        }
                                        if (wVar3 != null) {
                                            wVar3.z(true);
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar10 = this$0.B;
                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                        if (ConnectionStatusReceiver.isConnected()) {
                                            if (this$0.D) {
                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                if (aVar11 != null) {
                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                    return;
                                                }
                                                return;
                                            }
                                            N14CScreenFragment.a aVar12 = this$0.B;
                                            if (aVar12 != null) {
                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                return;
                                            }
                                            return;
                                        }
                                        N14CScreenFragment.a aVar13 = this$0.B;
                                        if (aVar13 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar14 = this$0.B;
                                    if (aVar14 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                this$0.U(bundle3);
                                gk.a.b(bundle3, "activity_skip_click");
                                this$0.S();
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity4 != null) {
                                    int i15 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity4.L0(false);
                                    return;
                                }
                                return;
                            case 2:
                                int i16 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str22 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                this$0.U(bundle4);
                                gk.a.b(bundle4, "activity_done_click");
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity3 != null) {
                                    int i17 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity3.L0(false);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle5 = new Bundle();
                                this$0.U(bundle5);
                                bundle5.putString("action_source", "screen");
                                gk.a.b(bundle5, "activity_redo_click");
                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                    player.f(0, 0L);
                                }
                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView3 != null) {
                                    wVar2 = playerView3.getPlayer();
                                } else {
                                    wVar2 = null;
                                }
                                if (wVar2 != null) {
                                    wVar2.z(false);
                                }
                                this$0.I = 0L;
                                this$0.J = 0L;
                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                grpN14CScreenButtons.setVisibility(8);
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton5 != null) {
                                    N14CScreenFragment.a aVar15 = this$0.B;
                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                        string5 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton5.setText(string5);
                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton5.setBackground(null);
                                }
                                this$0.M = false;
                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView4 != null) {
                                    wVar22 = playerView4.getPlayer();
                                }
                                if (wVar22 != null) {
                                    wVar22.z(true);
                                    return;
                                }
                                return;
                            default:
                                int i19 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14CScreenFragment f28633v;

                    {
                        this.f28633v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CountDownTimer countDownTimer;
                        String str19;
                        String str20;
                        String string4;
                        com.google.android.exoplayer2.w wVar2;
                        String string5;
                        com.google.android.exoplayer2.w player;
                        int i12 = r2;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        com.google.android.exoplayer2.w wVar22 = null;
                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                        com.google.android.exoplayer2.w wVar3 = null;
                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                        boolean z16 = true;
                        N14CScreenFragment this$0 = this.f28633v;
                        switch (i12) {
                            case 0:
                                int i13 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                    z16 = false;
                                }
                                if (z16) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                return;
                            case 1:
                                int i14 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                N14CScreenFragment.a aVar8 = this$0.B;
                                if (aVar8 != null) {
                                    str19 = aVar8.f10981d;
                                } else {
                                    str19 = null;
                                }
                                if (text.equals(str19)) {
                                    if (this$0.C) {
                                        Bundle bundle2 = new Bundle();
                                        this$0.U(bundle2);
                                        bundle2.putString("action_source", "screen");
                                        gk.a.b(bundle2, "activity_play_click");
                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                        if (robertoButton4 != null) {
                                            N14CScreenFragment.a aVar9 = this$0.B;
                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                string4 = this$0.getString(R.string.skip);
                                            }
                                            robertoButton4.setText(string4);
                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                            robertoButton4.setBackground(null);
                                        }
                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                        sbN14CScreenSeek.setVisibility(0);
                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                        if (playerView != null) {
                                            wVar3 = playerView.getPlayer();
                                        }
                                        if (wVar3 != null) {
                                            wVar3.z(true);
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar10 = this$0.B;
                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                        if (ConnectionStatusReceiver.isConnected()) {
                                            if (this$0.D) {
                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                if (aVar11 != null) {
                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                    return;
                                                }
                                                return;
                                            }
                                            N14CScreenFragment.a aVar12 = this$0.B;
                                            if (aVar12 != null) {
                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                return;
                                            }
                                            return;
                                        }
                                        N14CScreenFragment.a aVar13 = this$0.B;
                                        if (aVar13 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar14 = this$0.B;
                                    if (aVar14 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                this$0.U(bundle3);
                                gk.a.b(bundle3, "activity_skip_click");
                                this$0.S();
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity4 != null) {
                                    int i15 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity4.L0(false);
                                    return;
                                }
                                return;
                            case 2:
                                int i16 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str22 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                this$0.U(bundle4);
                                gk.a.b(bundle4, "activity_done_click");
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity3 != null) {
                                    int i17 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity3.L0(false);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle5 = new Bundle();
                                this$0.U(bundle5);
                                bundle5.putString("action_source", "screen");
                                gk.a.b(bundle5, "activity_redo_click");
                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                    player.f(0, 0L);
                                }
                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView3 != null) {
                                    wVar2 = playerView3.getPlayer();
                                } else {
                                    wVar2 = null;
                                }
                                if (wVar2 != null) {
                                    wVar2.z(false);
                                }
                                this$0.I = 0L;
                                this$0.J = 0L;
                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                grpN14CScreenButtons.setVisibility(8);
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton5 != null) {
                                    N14CScreenFragment.a aVar15 = this$0.B;
                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                        string5 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton5.setText(string5);
                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton5.setBackground(null);
                                }
                                this$0.M = false;
                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView4 != null) {
                                    wVar22 = playerView4.getPlayer();
                                }
                                if (wVar22 != null) {
                                    wVar22.z(true);
                                    return;
                                }
                                return;
                            default:
                                int i19 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton2)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14CScreenFragment f28633v;

                    {
                        this.f28633v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CountDownTimer countDownTimer;
                        String str19;
                        String str20;
                        String string4;
                        com.google.android.exoplayer2.w wVar2;
                        String string5;
                        com.google.android.exoplayer2.w player;
                        int i12 = r2;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        com.google.android.exoplayer2.w wVar22 = null;
                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                        com.google.android.exoplayer2.w wVar3 = null;
                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                        boolean z16 = true;
                        N14CScreenFragment this$0 = this.f28633v;
                        switch (i12) {
                            case 0:
                                int i13 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                    z16 = false;
                                }
                                if (z16) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                return;
                            case 1:
                                int i14 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                N14CScreenFragment.a aVar8 = this$0.B;
                                if (aVar8 != null) {
                                    str19 = aVar8.f10981d;
                                } else {
                                    str19 = null;
                                }
                                if (text.equals(str19)) {
                                    if (this$0.C) {
                                        Bundle bundle2 = new Bundle();
                                        this$0.U(bundle2);
                                        bundle2.putString("action_source", "screen");
                                        gk.a.b(bundle2, "activity_play_click");
                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                        if (robertoButton4 != null) {
                                            N14CScreenFragment.a aVar9 = this$0.B;
                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                string4 = this$0.getString(R.string.skip);
                                            }
                                            robertoButton4.setText(string4);
                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                            robertoButton4.setBackground(null);
                                        }
                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                        sbN14CScreenSeek.setVisibility(0);
                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                        if (playerView != null) {
                                            wVar3 = playerView.getPlayer();
                                        }
                                        if (wVar3 != null) {
                                            wVar3.z(true);
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar10 = this$0.B;
                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                        if (ConnectionStatusReceiver.isConnected()) {
                                            if (this$0.D) {
                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                if (aVar11 != null) {
                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                    return;
                                                }
                                                return;
                                            }
                                            N14CScreenFragment.a aVar12 = this$0.B;
                                            if (aVar12 != null) {
                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                return;
                                            }
                                            return;
                                        }
                                        N14CScreenFragment.a aVar13 = this$0.B;
                                        if (aVar13 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar14 = this$0.B;
                                    if (aVar14 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                this$0.U(bundle3);
                                gk.a.b(bundle3, "activity_skip_click");
                                this$0.S();
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity4 != null) {
                                    int i15 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity4.L0(false);
                                    return;
                                }
                                return;
                            case 2:
                                int i16 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str22 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                this$0.U(bundle4);
                                gk.a.b(bundle4, "activity_done_click");
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity3 != null) {
                                    int i17 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity3.L0(false);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle5 = new Bundle();
                                this$0.U(bundle5);
                                bundle5.putString("action_source", "screen");
                                gk.a.b(bundle5, "activity_redo_click");
                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                    player.f(0, 0L);
                                }
                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView3 != null) {
                                    wVar2 = playerView3.getPlayer();
                                } else {
                                    wVar2 = null;
                                }
                                if (wVar2 != null) {
                                    wVar2.z(false);
                                }
                                this$0.I = 0L;
                                this$0.J = 0L;
                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                grpN14CScreenButtons.setVisibility(8);
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton5 != null) {
                                    N14CScreenFragment.a aVar15 = this$0.B;
                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                        string5 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton5.setText(string5);
                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton5.setBackground(null);
                                }
                                this$0.M = false;
                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView4 != null) {
                                    wVar22 = playerView4.getPlayer();
                                }
                                if (wVar22 != null) {
                                    wVar22.z(true);
                                    return;
                                }
                                return;
                            default:
                                int i19 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton1)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14CScreenFragment f28633v;

                    {
                        this.f28633v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CountDownTimer countDownTimer;
                        String str19;
                        String str20;
                        String string4;
                        com.google.android.exoplayer2.w wVar2;
                        String string5;
                        com.google.android.exoplayer2.w player;
                        int i12 = r2;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        com.google.android.exoplayer2.w wVar22 = null;
                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                        com.google.android.exoplayer2.w wVar3 = null;
                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                        boolean z16 = true;
                        N14CScreenFragment this$0 = this.f28633v;
                        switch (i12) {
                            case 0:
                                int i13 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                    z16 = false;
                                }
                                if (z16) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                return;
                            case 1:
                                int i14 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                N14CScreenFragment.a aVar8 = this$0.B;
                                if (aVar8 != null) {
                                    str19 = aVar8.f10981d;
                                } else {
                                    str19 = null;
                                }
                                if (text.equals(str19)) {
                                    if (this$0.C) {
                                        Bundle bundle2 = new Bundle();
                                        this$0.U(bundle2);
                                        bundle2.putString("action_source", "screen");
                                        gk.a.b(bundle2, "activity_play_click");
                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                        if (robertoButton4 != null) {
                                            N14CScreenFragment.a aVar9 = this$0.B;
                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                string4 = this$0.getString(R.string.skip);
                                            }
                                            robertoButton4.setText(string4);
                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                            robertoButton4.setBackground(null);
                                        }
                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                        sbN14CScreenSeek.setVisibility(0);
                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                        if (playerView != null) {
                                            wVar3 = playerView.getPlayer();
                                        }
                                        if (wVar3 != null) {
                                            wVar3.z(true);
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar10 = this$0.B;
                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                        if (ConnectionStatusReceiver.isConnected()) {
                                            if (this$0.D) {
                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                if (aVar11 != null) {
                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                    return;
                                                }
                                                return;
                                            }
                                            N14CScreenFragment.a aVar12 = this$0.B;
                                            if (aVar12 != null) {
                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                return;
                                            }
                                            return;
                                        }
                                        N14CScreenFragment.a aVar13 = this$0.B;
                                        if (aVar13 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar14 = this$0.B;
                                    if (aVar14 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                this$0.U(bundle3);
                                gk.a.b(bundle3, "activity_skip_click");
                                this$0.S();
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity4 != null) {
                                    int i15 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity4.L0(false);
                                    return;
                                }
                                return;
                            case 2:
                                int i16 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str22 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                this$0.U(bundle4);
                                gk.a.b(bundle4, "activity_done_click");
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity3 != null) {
                                    int i17 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity3.L0(false);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle5 = new Bundle();
                                this$0.U(bundle5);
                                bundle5.putString("action_source", "screen");
                                gk.a.b(bundle5, "activity_redo_click");
                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                    player.f(0, 0L);
                                }
                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView3 != null) {
                                    wVar2 = playerView3.getPlayer();
                                } else {
                                    wVar2 = null;
                                }
                                if (wVar2 != null) {
                                    wVar2.z(false);
                                }
                                this$0.I = 0L;
                                this$0.J = 0L;
                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                grpN14CScreenButtons.setVisibility(8);
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton5 != null) {
                                    N14CScreenFragment.a aVar15 = this$0.B;
                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                        string5 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton5.setText(string5);
                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton5.setBackground(null);
                                }
                                this$0.M = false;
                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView4 != null) {
                                    wVar22 = playerView4.getPlayer();
                                }
                                if (wVar22 != null) {
                                    wVar22.z(true);
                                    return;
                                }
                                return;
                            default:
                                int i19 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ N14CScreenFragment f28633v;

                    {
                        this.f28633v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CountDownTimer countDownTimer;
                        String str19;
                        String str20;
                        String string4;
                        com.google.android.exoplayer2.w wVar2;
                        String string5;
                        com.google.android.exoplayer2.w player;
                        int i12 = r2;
                        NewDynamicParentActivity newDynamicParentActivity2 = null;
                        com.google.android.exoplayer2.w wVar22 = null;
                        NewDynamicParentActivity newDynamicParentActivity3 = null;
                        com.google.android.exoplayer2.w wVar3 = null;
                        NewDynamicParentActivity newDynamicParentActivity4 = null;
                        boolean z16 = true;
                        N14CScreenFragment this$0 = this.f28633v;
                        switch (i12) {
                            case 0:
                                int i13 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                                    z16 = false;
                                }
                                if (z16) {
                                    ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                                    if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                        countDownTimer.start();
                                        return;
                                    }
                                    return;
                                }
                                ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                                return;
                            case 1:
                                int i14 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                                N14CScreenFragment.a aVar8 = this$0.B;
                                if (aVar8 != null) {
                                    str19 = aVar8.f10981d;
                                } else {
                                    str19 = null;
                                }
                                if (text.equals(str19)) {
                                    if (this$0.C) {
                                        Bundle bundle2 = new Bundle();
                                        this$0.U(bundle2);
                                        bundle2.putString("action_source", "screen");
                                        gk.a.b(bundle2, "activity_play_click");
                                        RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                        if (robertoButton4 != null) {
                                            N14CScreenFragment.a aVar9 = this$0.B;
                                            if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                                string4 = this$0.getString(R.string.skip);
                                            }
                                            robertoButton4.setText(string4);
                                            robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                            robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                            robertoButton4.setBackground(null);
                                        }
                                        AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                        kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                        sbN14CScreenSeek.setVisibility(0);
                                        PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                        if (playerView != null) {
                                            wVar3 = playerView.getPlayer();
                                        }
                                        if (wVar3 != null) {
                                            wVar3.z(true);
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar10 = this$0.B;
                                    if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                        if (ConnectionStatusReceiver.isConnected()) {
                                            if (this$0.D) {
                                                N14CScreenFragment.a aVar11 = this$0.B;
                                                if (aVar11 != null) {
                                                    Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                                    return;
                                                }
                                                return;
                                            }
                                            N14CScreenFragment.a aVar12 = this$0.B;
                                            if (aVar12 != null) {
                                                Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                                return;
                                            }
                                            return;
                                        }
                                        N14CScreenFragment.a aVar13 = this$0.B;
                                        if (aVar13 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar14 = this$0.B;
                                    if (aVar14 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                String str21 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                this$0.U(bundle3);
                                gk.a.b(bundle3, "activity_skip_click");
                                this$0.S();
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                                }
                                if (newDynamicParentActivity4 != null) {
                                    int i15 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity4.L0(false);
                                    return;
                                }
                                return;
                            case 2:
                                int i16 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str22 = gk.a.f16573a;
                                Bundle bundle4 = new Bundle();
                                this$0.U(bundle4);
                                gk.a.b(bundle4, "activity_done_click");
                                this$0.N = true;
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                                }
                                if (newDynamicParentActivity3 != null) {
                                    int i17 = NewDynamicParentActivity.F;
                                    newDynamicParentActivity3.L0(false);
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Bundle bundle5 = new Bundle();
                                this$0.U(bundle5);
                                bundle5.putString("action_source", "screen");
                                gk.a.b(bundle5, "activity_redo_click");
                                PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                                    player.f(0, 0L);
                                }
                                PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView3 != null) {
                                    wVar2 = playerView3.getPlayer();
                                } else {
                                    wVar2 = null;
                                }
                                if (wVar2 != null) {
                                    wVar2.z(false);
                                }
                                this$0.I = 0L;
                                this$0.J = 0L;
                                ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                                RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                                rbN14CScreenBottomButtonHeader.setVisibility(0);
                                Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                                kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                                grpN14CScreenButtons.setVisibility(8);
                                RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton5 != null) {
                                    N14CScreenFragment.a aVar15 = this$0.B;
                                    if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                        string5 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton5.setText(string5);
                                    robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton5.setBackground(null);
                                }
                                this$0.M = false;
                                PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView4 != null) {
                                    wVar22 = playerView4.getPlayer();
                                }
                                if (wVar22 != null) {
                                    wVar22.z(true);
                                    return;
                                }
                                return;
                            default:
                                int i19 = N14CScreenFragment.S;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof NewDynamicParentActivity) {
                                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                                }
                                if (newDynamicParentActivity2 != null) {
                                    newDynamicParentActivity2.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        Y();
        _$_findCachedViewById(R.id.viewN14CScreenClicker).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14CScreenFragment f28633v;

            {
                this.f28633v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountDownTimer countDownTimer;
                String str19;
                String str20;
                String string4;
                com.google.android.exoplayer2.w wVar2;
                String string5;
                com.google.android.exoplayer2.w player;
                int i12 = r2;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                com.google.android.exoplayer2.w wVar22 = null;
                NewDynamicParentActivity newDynamicParentActivity3 = null;
                com.google.android.exoplayer2.w wVar3 = null;
                NewDynamicParentActivity newDynamicParentActivity4 = null;
                boolean z16 = true;
                N14CScreenFragment this$0 = this.f28633v;
                switch (i12) {
                    case 0:
                        int i13 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                            z16 = false;
                        }
                        if (z16) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                            if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                        return;
                    case 1:
                        int i14 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                        N14CScreenFragment.a aVar8 = this$0.B;
                        if (aVar8 != null) {
                            str19 = aVar8.f10981d;
                        } else {
                            str19 = null;
                        }
                        if (text.equals(str19)) {
                            if (this$0.C) {
                                Bundle bundle2 = new Bundle();
                                this$0.U(bundle2);
                                bundle2.putString("action_source", "screen");
                                gk.a.b(bundle2, "activity_play_click");
                                RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton4 != null) {
                                    N14CScreenFragment.a aVar9 = this$0.B;
                                    if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                        string4 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton4.setText(string4);
                                    robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton4.setBackground(null);
                                }
                                AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                sbN14CScreenSeek.setVisibility(0);
                                PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView != null) {
                                    wVar3 = playerView.getPlayer();
                                }
                                if (wVar3 != null) {
                                    wVar3.z(true);
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar10 = this$0.B;
                            if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                if (ConnectionStatusReceiver.isConnected()) {
                                    if (this$0.D) {
                                        N14CScreenFragment.a aVar11 = this$0.B;
                                        if (aVar11 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar12 = this$0.B;
                                    if (aVar12 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                N14CScreenFragment.a aVar13 = this$0.B;
                                if (aVar13 != null) {
                                    Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar14 = this$0.B;
                            if (aVar14 != null) {
                                Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                return;
                            }
                            return;
                        }
                        String str21 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        this$0.U(bundle3);
                        gk.a.b(bundle3, "activity_skip_click");
                        this$0.S();
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity4 != null) {
                            int i15 = NewDynamicParentActivity.F;
                            newDynamicParentActivity4.L0(false);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str22 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        this$0.U(bundle4);
                        gk.a.b(bundle4, "activity_done_click");
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity3 != null) {
                            int i17 = NewDynamicParentActivity.F;
                            newDynamicParentActivity3.L0(false);
                            return;
                        }
                        return;
                    case 3:
                        int i18 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle5 = new Bundle();
                        this$0.U(bundle5);
                        bundle5.putString("action_source", "screen");
                        gk.a.b(bundle5, "activity_redo_click");
                        PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                            player.f(0, 0L);
                        }
                        PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView3 != null) {
                            wVar2 = playerView3.getPlayer();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.z(false);
                        }
                        this$0.I = 0L;
                        this$0.J = 0L;
                        ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                        rbN14CScreenBottomButtonHeader.setVisibility(0);
                        Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                        grpN14CScreenButtons.setVisibility(8);
                        RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        if (robertoButton5 != null) {
                            N14CScreenFragment.a aVar15 = this$0.B;
                            if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                string5 = this$0.getString(R.string.skip);
                            }
                            robertoButton5.setText(string5);
                            robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                            robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                            robertoButton5.setBackground(null);
                        }
                        this$0.M = false;
                        PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView4 != null) {
                            wVar22 = playerView4.getPlayer();
                        }
                        if (wVar22 != null) {
                            wVar22.z(true);
                            return;
                        }
                        return;
                    default:
                        int i19 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                        if (requireActivity4 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14CScreenFragment f28633v;

            {
                this.f28633v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountDownTimer countDownTimer;
                String str19;
                String str20;
                String string4;
                com.google.android.exoplayer2.w wVar2;
                String string5;
                com.google.android.exoplayer2.w player;
                int i12 = r2;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                com.google.android.exoplayer2.w wVar22 = null;
                NewDynamicParentActivity newDynamicParentActivity3 = null;
                com.google.android.exoplayer2.w wVar3 = null;
                NewDynamicParentActivity newDynamicParentActivity4 = null;
                boolean z16 = true;
                N14CScreenFragment this$0 = this.f28633v;
                switch (i12) {
                    case 0:
                        int i13 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                            z16 = false;
                        }
                        if (z16) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                            if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                        return;
                    case 1:
                        int i14 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                        N14CScreenFragment.a aVar8 = this$0.B;
                        if (aVar8 != null) {
                            str19 = aVar8.f10981d;
                        } else {
                            str19 = null;
                        }
                        if (text.equals(str19)) {
                            if (this$0.C) {
                                Bundle bundle2 = new Bundle();
                                this$0.U(bundle2);
                                bundle2.putString("action_source", "screen");
                                gk.a.b(bundle2, "activity_play_click");
                                RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton4 != null) {
                                    N14CScreenFragment.a aVar9 = this$0.B;
                                    if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                        string4 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton4.setText(string4);
                                    robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton4.setBackground(null);
                                }
                                AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                sbN14CScreenSeek.setVisibility(0);
                                PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView != null) {
                                    wVar3 = playerView.getPlayer();
                                }
                                if (wVar3 != null) {
                                    wVar3.z(true);
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar10 = this$0.B;
                            if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                if (ConnectionStatusReceiver.isConnected()) {
                                    if (this$0.D) {
                                        N14CScreenFragment.a aVar11 = this$0.B;
                                        if (aVar11 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar12 = this$0.B;
                                    if (aVar12 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                N14CScreenFragment.a aVar13 = this$0.B;
                                if (aVar13 != null) {
                                    Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar14 = this$0.B;
                            if (aVar14 != null) {
                                Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                return;
                            }
                            return;
                        }
                        String str21 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        this$0.U(bundle3);
                        gk.a.b(bundle3, "activity_skip_click");
                        this$0.S();
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity4 != null) {
                            int i15 = NewDynamicParentActivity.F;
                            newDynamicParentActivity4.L0(false);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str22 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        this$0.U(bundle4);
                        gk.a.b(bundle4, "activity_done_click");
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity3 != null) {
                            int i17 = NewDynamicParentActivity.F;
                            newDynamicParentActivity3.L0(false);
                            return;
                        }
                        return;
                    case 3:
                        int i18 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle5 = new Bundle();
                        this$0.U(bundle5);
                        bundle5.putString("action_source", "screen");
                        gk.a.b(bundle5, "activity_redo_click");
                        PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                            player.f(0, 0L);
                        }
                        PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView3 != null) {
                            wVar2 = playerView3.getPlayer();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.z(false);
                        }
                        this$0.I = 0L;
                        this$0.J = 0L;
                        ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                        rbN14CScreenBottomButtonHeader.setVisibility(0);
                        Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                        grpN14CScreenButtons.setVisibility(8);
                        RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        if (robertoButton5 != null) {
                            N14CScreenFragment.a aVar15 = this$0.B;
                            if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                string5 = this$0.getString(R.string.skip);
                            }
                            robertoButton5.setText(string5);
                            robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                            robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                            robertoButton5.setBackground(null);
                        }
                        this$0.M = false;
                        PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView4 != null) {
                            wVar22 = playerView4.getPlayer();
                        }
                        if (wVar22 != null) {
                            wVar22.z(true);
                            return;
                        }
                        return;
                    default:
                        int i19 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                        if (requireActivity4 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton2)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14CScreenFragment f28633v;

            {
                this.f28633v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountDownTimer countDownTimer;
                String str19;
                String str20;
                String string4;
                com.google.android.exoplayer2.w wVar2;
                String string5;
                com.google.android.exoplayer2.w player;
                int i12 = r2;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                com.google.android.exoplayer2.w wVar22 = null;
                NewDynamicParentActivity newDynamicParentActivity3 = null;
                com.google.android.exoplayer2.w wVar3 = null;
                NewDynamicParentActivity newDynamicParentActivity4 = null;
                boolean z16 = true;
                N14CScreenFragment this$0 = this.f28633v;
                switch (i12) {
                    case 0:
                        int i13 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                            z16 = false;
                        }
                        if (z16) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                            if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                        return;
                    case 1:
                        int i14 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                        N14CScreenFragment.a aVar8 = this$0.B;
                        if (aVar8 != null) {
                            str19 = aVar8.f10981d;
                        } else {
                            str19 = null;
                        }
                        if (text.equals(str19)) {
                            if (this$0.C) {
                                Bundle bundle2 = new Bundle();
                                this$0.U(bundle2);
                                bundle2.putString("action_source", "screen");
                                gk.a.b(bundle2, "activity_play_click");
                                RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton4 != null) {
                                    N14CScreenFragment.a aVar9 = this$0.B;
                                    if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                        string4 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton4.setText(string4);
                                    robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton4.setBackground(null);
                                }
                                AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                sbN14CScreenSeek.setVisibility(0);
                                PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView != null) {
                                    wVar3 = playerView.getPlayer();
                                }
                                if (wVar3 != null) {
                                    wVar3.z(true);
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar10 = this$0.B;
                            if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                if (ConnectionStatusReceiver.isConnected()) {
                                    if (this$0.D) {
                                        N14CScreenFragment.a aVar11 = this$0.B;
                                        if (aVar11 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar12 = this$0.B;
                                    if (aVar12 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                N14CScreenFragment.a aVar13 = this$0.B;
                                if (aVar13 != null) {
                                    Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar14 = this$0.B;
                            if (aVar14 != null) {
                                Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                return;
                            }
                            return;
                        }
                        String str21 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        this$0.U(bundle3);
                        gk.a.b(bundle3, "activity_skip_click");
                        this$0.S();
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity4 != null) {
                            int i15 = NewDynamicParentActivity.F;
                            newDynamicParentActivity4.L0(false);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str22 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        this$0.U(bundle4);
                        gk.a.b(bundle4, "activity_done_click");
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity3 != null) {
                            int i17 = NewDynamicParentActivity.F;
                            newDynamicParentActivity3.L0(false);
                            return;
                        }
                        return;
                    case 3:
                        int i18 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle5 = new Bundle();
                        this$0.U(bundle5);
                        bundle5.putString("action_source", "screen");
                        gk.a.b(bundle5, "activity_redo_click");
                        PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                            player.f(0, 0L);
                        }
                        PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView3 != null) {
                            wVar2 = playerView3.getPlayer();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.z(false);
                        }
                        this$0.I = 0L;
                        this$0.J = 0L;
                        ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                        rbN14CScreenBottomButtonHeader.setVisibility(0);
                        Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                        grpN14CScreenButtons.setVisibility(8);
                        RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        if (robertoButton5 != null) {
                            N14CScreenFragment.a aVar15 = this$0.B;
                            if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                string5 = this$0.getString(R.string.skip);
                            }
                            robertoButton5.setText(string5);
                            robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                            robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                            robertoButton5.setBackground(null);
                        }
                        this$0.M = false;
                        PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView4 != null) {
                            wVar22 = playerView4.getPlayer();
                        }
                        if (wVar22 != null) {
                            wVar22.z(true);
                            return;
                        }
                        return;
                    default:
                        int i19 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                        if (requireActivity4 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.rbN14CScreenButton1)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14CScreenFragment f28633v;

            {
                this.f28633v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountDownTimer countDownTimer;
                String str19;
                String str20;
                String string4;
                com.google.android.exoplayer2.w wVar2;
                String string5;
                com.google.android.exoplayer2.w player;
                int i12 = r2;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                com.google.android.exoplayer2.w wVar22 = null;
                NewDynamicParentActivity newDynamicParentActivity3 = null;
                com.google.android.exoplayer2.w wVar3 = null;
                NewDynamicParentActivity newDynamicParentActivity4 = null;
                boolean z16 = true;
                N14CScreenFragment this$0 = this.f28633v;
                switch (i12) {
                    case 0:
                        int i13 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                            z16 = false;
                        }
                        if (z16) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                            if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                        return;
                    case 1:
                        int i14 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                        N14CScreenFragment.a aVar8 = this$0.B;
                        if (aVar8 != null) {
                            str19 = aVar8.f10981d;
                        } else {
                            str19 = null;
                        }
                        if (text.equals(str19)) {
                            if (this$0.C) {
                                Bundle bundle2 = new Bundle();
                                this$0.U(bundle2);
                                bundle2.putString("action_source", "screen");
                                gk.a.b(bundle2, "activity_play_click");
                                RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton4 != null) {
                                    N14CScreenFragment.a aVar9 = this$0.B;
                                    if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                        string4 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton4.setText(string4);
                                    robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton4.setBackground(null);
                                }
                                AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                sbN14CScreenSeek.setVisibility(0);
                                PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView != null) {
                                    wVar3 = playerView.getPlayer();
                                }
                                if (wVar3 != null) {
                                    wVar3.z(true);
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar10 = this$0.B;
                            if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                if (ConnectionStatusReceiver.isConnected()) {
                                    if (this$0.D) {
                                        N14CScreenFragment.a aVar11 = this$0.B;
                                        if (aVar11 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar12 = this$0.B;
                                    if (aVar12 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                N14CScreenFragment.a aVar13 = this$0.B;
                                if (aVar13 != null) {
                                    Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar14 = this$0.B;
                            if (aVar14 != null) {
                                Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                return;
                            }
                            return;
                        }
                        String str21 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        this$0.U(bundle3);
                        gk.a.b(bundle3, "activity_skip_click");
                        this$0.S();
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity4 != null) {
                            int i15 = NewDynamicParentActivity.F;
                            newDynamicParentActivity4.L0(false);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str22 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        this$0.U(bundle4);
                        gk.a.b(bundle4, "activity_done_click");
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity3 != null) {
                            int i17 = NewDynamicParentActivity.F;
                            newDynamicParentActivity3.L0(false);
                            return;
                        }
                        return;
                    case 3:
                        int i18 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle5 = new Bundle();
                        this$0.U(bundle5);
                        bundle5.putString("action_source", "screen");
                        gk.a.b(bundle5, "activity_redo_click");
                        PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                            player.f(0, 0L);
                        }
                        PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView3 != null) {
                            wVar2 = playerView3.getPlayer();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.z(false);
                        }
                        this$0.I = 0L;
                        this$0.J = 0L;
                        ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                        rbN14CScreenBottomButtonHeader.setVisibility(0);
                        Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                        grpN14CScreenButtons.setVisibility(8);
                        RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        if (robertoButton5 != null) {
                            N14CScreenFragment.a aVar15 = this$0.B;
                            if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                string5 = this$0.getString(R.string.skip);
                            }
                            robertoButton5.setText(string5);
                            robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                            robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                            robertoButton5.setBackground(null);
                        }
                        this$0.M = false;
                        PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView4 != null) {
                            wVar22 = playerView4.getPlayer();
                        }
                        if (wVar22 != null) {
                            wVar22.z(true);
                            return;
                        }
                        return;
                    default:
                        int i19 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                        if (requireActivity4 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivN14CScreenBackButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.t

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ N14CScreenFragment f28633v;

            {
                this.f28633v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CountDownTimer countDownTimer;
                String str19;
                String str20;
                String string4;
                com.google.android.exoplayer2.w wVar2;
                String string5;
                com.google.android.exoplayer2.w player;
                int i12 = r2;
                NewDynamicParentActivity newDynamicParentActivity2 = null;
                com.google.android.exoplayer2.w wVar22 = null;
                NewDynamicParentActivity newDynamicParentActivity3 = null;
                com.google.android.exoplayer2.w wVar3 = null;
                NewDynamicParentActivity newDynamicParentActivity4 = null;
                boolean z16 = true;
                N14CScreenFragment this$0 = this.f28633v;
                switch (i12) {
                    case 0:
                        int i13 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).getProgress() != 1.0f) {
                            z16 = false;
                        }
                        if (z16) {
                            ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).m(0.0f);
                            if (this$0.E && (countDownTimer = this$0.f10977z) != null) {
                                countDownTimer.start();
                                return;
                            }
                            return;
                        }
                        ((MotionLayout) this$0._$_findCachedViewById(R.id.mlN14CParentContainer)).A();
                        return;
                    case 1:
                        int i14 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        CharSequence text = ((RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader)).getText();
                        N14CScreenFragment.a aVar8 = this$0.B;
                        if (aVar8 != null) {
                            str19 = aVar8.f10981d;
                        } else {
                            str19 = null;
                        }
                        if (text.equals(str19)) {
                            if (this$0.C) {
                                Bundle bundle2 = new Bundle();
                                this$0.U(bundle2);
                                bundle2.putString("action_source", "screen");
                                gk.a.b(bundle2, "activity_play_click");
                                RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                                if (robertoButton4 != null) {
                                    N14CScreenFragment.a aVar9 = this$0.B;
                                    if (aVar9 == null || (string4 = aVar9.f10982e) == null) {
                                        string4 = this$0.getString(R.string.skip);
                                    }
                                    robertoButton4.setText(string4);
                                    robertoButton4.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                                    robertoButton4.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                                    robertoButton4.setBackground(null);
                                }
                                AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek);
                                kotlin.jvm.internal.i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
                                sbN14CScreenSeek.setVisibility(0);
                                PlayerView playerView = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                                if (playerView != null) {
                                    wVar3 = playerView.getPlayer();
                                }
                                if (wVar3 != null) {
                                    wVar3.z(true);
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar10 = this$0.B;
                            if ((aVar10 == null || (str20 = aVar10.f10979b) == null || !(gv.n.B0(str20) ^ true)) ? false : false) {
                                if (ConnectionStatusReceiver.isConnected()) {
                                    if (this$0.D) {
                                        N14CScreenFragment.a aVar11 = this$0.B;
                                        if (aVar11 != null) {
                                            Toast.makeText(this$0.requireContext(), aVar11.f10988l, 0).show();
                                            return;
                                        }
                                        return;
                                    }
                                    N14CScreenFragment.a aVar12 = this$0.B;
                                    if (aVar12 != null) {
                                        Toast.makeText(this$0.requireContext(), aVar12.f10987k, 0).show();
                                        return;
                                    }
                                    return;
                                }
                                N14CScreenFragment.a aVar13 = this$0.B;
                                if (aVar13 != null) {
                                    Toast.makeText(this$0.requireContext(), aVar13.f10985i, 0).show();
                                    return;
                                }
                                return;
                            }
                            N14CScreenFragment.a aVar14 = this$0.B;
                            if (aVar14 != null) {
                                Toast.makeText(this$0.requireContext(), aVar14.f10986j, 0).show();
                                return;
                            }
                            return;
                        }
                        String str21 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        this$0.U(bundle3);
                        gk.a.b(bundle3, "activity_skip_click");
                        this$0.S();
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        if (requireActivity2 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity4 = (NewDynamicParentActivity) requireActivity2;
                        }
                        if (newDynamicParentActivity4 != null) {
                            int i15 = NewDynamicParentActivity.F;
                            newDynamicParentActivity4.L0(false);
                            return;
                        }
                        return;
                    case 2:
                        int i16 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        String str22 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        this$0.U(bundle4);
                        gk.a.b(bundle4, "activity_done_click");
                        this$0.N = true;
                        androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                        if (requireActivity3 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity3;
                        }
                        if (newDynamicParentActivity3 != null) {
                            int i17 = NewDynamicParentActivity.F;
                            newDynamicParentActivity3.L0(false);
                            return;
                        }
                        return;
                    case 3:
                        int i18 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle5 = new Bundle();
                        this$0.U(bundle5);
                        bundle5.putString("action_source", "screen");
                        gk.a.b(bundle5, "activity_redo_click");
                        PlayerView playerView2 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                            player.f(0, 0L);
                        }
                        PlayerView playerView3 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView3 != null) {
                            wVar2 = playerView3.getPlayer();
                        } else {
                            wVar2 = null;
                        }
                        if (wVar2 != null) {
                            wVar2.z(false);
                        }
                        this$0.I = 0L;
                        this$0.J = 0L;
                        ((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$0.I);
                        RobertoButton rbN14CScreenBottomButtonHeader = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        kotlin.jvm.internal.i.f(rbN14CScreenBottomButtonHeader, "rbN14CScreenBottomButtonHeader");
                        rbN14CScreenBottomButtonHeader.setVisibility(0);
                        Group grpN14CScreenButtons = (Group) this$0._$_findCachedViewById(R.id.grpN14CScreenButtons);
                        kotlin.jvm.internal.i.f(grpN14CScreenButtons, "grpN14CScreenButtons");
                        grpN14CScreenButtons.setVisibility(8);
                        RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.rbN14CScreenBottomButtonHeader);
                        if (robertoButton5 != null) {
                            N14CScreenFragment.a aVar15 = this$0.B;
                            if (aVar15 == null || (string5 = aVar15.f10982e) == null) {
                                string5 = this$0.getString(R.string.skip);
                            }
                            robertoButton5.setText(string5);
                            robertoButton5.setTextColor(g0.a.b(this$0.requireContext(), R.color.amahaTerracota));
                            robertoButton5.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.amahaTerracota)));
                            robertoButton5.setBackground(null);
                        }
                        this$0.M = false;
                        PlayerView playerView4 = (PlayerView) this$0._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                        if (playerView4 != null) {
                            wVar22 = playerView4.getPlayer();
                        }
                        if (wVar22 != null) {
                            wVar22.z(true);
                            return;
                        }
                        return;
                    default:
                        int i19 = N14CScreenFragment.S;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity4 = this$0.requireActivity();
                        if (requireActivity4 instanceof NewDynamicParentActivity) {
                            newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity4;
                        }
                        if (newDynamicParentActivity2 != null) {
                            newDynamicParentActivity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // rr.d
    public final void K() {
    }

    @Override // rr.d
    public final void M() {
    }
}
