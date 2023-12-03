package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.ui.e;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import d9.q;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o7.m;
import o8.p;
import z8.h;
/* compiled from: PlayerControlView.java */
/* loaded from: classes.dex */
public final class c extends FrameLayout {
    public final View A;
    public final View B;
    public final ImageView C;
    public final ImageView D;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final e H;
    public final StringBuilder I;
    public final Formatter J;
    public final e0.b K;
    public final e0.c L;
    public final a9.d M;
    public final a9.d N;
    public final Drawable O;
    public final Drawable P;
    public final Drawable Q;
    public final String R;
    public final String S;
    public final String T;
    public final Drawable U;
    public final Drawable V;
    public final float W;

    /* renamed from: a0  reason: collision with root package name */
    public final float f7098a0;

    /* renamed from: b0  reason: collision with root package name */
    public final String f7099b0;
    public final String c0;

    /* renamed from: d0  reason: collision with root package name */
    public w f7100d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7101f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7102g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7103h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7104i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7105j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f7106k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7107l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7108m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f7109n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7110o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f7111p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f7112q0;

    /* renamed from: r0  reason: collision with root package name */
    public long[] f7113r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean[] f7114s0;

    /* renamed from: t0  reason: collision with root package name */
    public final long[] f7115t0;

    /* renamed from: u  reason: collision with root package name */
    public final b f7116u;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean[] f7117u0;

    /* renamed from: v  reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f7118v;

    /* renamed from: v0  reason: collision with root package name */
    public long f7119v0;

    /* renamed from: w  reason: collision with root package name */
    public final View f7120w;

    /* renamed from: w0  reason: collision with root package name */
    public long f7121w0;

    /* renamed from: x  reason: collision with root package name */
    public final View f7122x;

    /* renamed from: y  reason: collision with root package name */
    public final View f7123y;

    /* renamed from: z  reason: collision with root package name */
    public final View f7124z;

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: com.google.android.exoplayer2.ui.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0140c {
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public interface d {
        void d();
    }

    static {
        m.a("goog.exo.ui");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [a9.d] */
    /* JADX WARN: Type inference failed for: r7v2, types: [a9.d] */
    public c(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f7104i0 = 5000;
        this.f7106k0 = 0;
        this.f7105j0 = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f7112q0 = -9223372036854775807L;
        this.f7107l0 = true;
        this.f7108m0 = true;
        this.f7109n0 = true;
        this.f7110o0 = true;
        this.f7111p0 = false;
        int i6 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hc.d.f17373y, 0, 0);
            try {
                this.f7104i0 = obtainStyledAttributes.getInt(19, this.f7104i0);
                i6 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f7106k0 = obtainStyledAttributes.getInt(8, this.f7106k0);
                this.f7107l0 = obtainStyledAttributes.getBoolean(17, this.f7107l0);
                this.f7108m0 = obtainStyledAttributes.getBoolean(14, this.f7108m0);
                this.f7109n0 = obtainStyledAttributes.getBoolean(16, this.f7109n0);
                this.f7110o0 = obtainStyledAttributes.getBoolean(15, this.f7110o0);
                this.f7111p0 = obtainStyledAttributes.getBoolean(18, this.f7111p0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.f7105j0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f7118v = new CopyOnWriteArrayList<>();
        this.K = new e0.b();
        this.L = new e0.c();
        StringBuilder sb2 = new StringBuilder();
        this.I = sb2;
        this.J = new Formatter(sb2, Locale.getDefault());
        this.f7113r0 = new long[0];
        this.f7114s0 = new boolean[0];
        this.f7115t0 = new long[0];
        this.f7117u0 = new boolean[0];
        b bVar = new b();
        this.f7116u = bVar;
        this.M = new Runnable(this) { // from class: a9.d

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ com.google.android.exoplayer2.ui.c f386v;

            {
                this.f386v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = r2;
                com.google.android.exoplayer2.ui.c cVar = this.f386v;
                switch (i10) {
                    case 0:
                        cVar.j();
                        return;
                    default:
                        cVar.c();
                        return;
                }
            }
        };
        this.N = new Runnable(this) { // from class: a9.d

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ com.google.android.exoplayer2.ui.c f386v;

            {
                this.f386v = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = r2;
                com.google.android.exoplayer2.ui.c cVar = this.f386v;
                switch (i10) {
                    case 0:
                        cVar.j();
                        return;
                    default:
                        cVar.c();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i6, this);
        setDescendantFocusability(262144);
        e eVar = (e) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (eVar != null) {
            this.H = eVar;
        } else if (findViewById != null) {
            com.google.android.exoplayer2.ui.b bVar2 = new com.google.android.exoplayer2.ui.b(context, attributeSet);
            bVar2.setId(R.id.exo_progress);
            bVar2.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bVar2, indexOfChild);
            this.H = bVar2;
        } else {
            this.H = null;
        }
        this.F = (TextView) findViewById(R.id.exo_duration);
        this.G = (TextView) findViewById(R.id.exo_position);
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.b(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f7123y = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f7124z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f7120w = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f7122x = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.B = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.A = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.C = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.D = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.E = findViewById8;
        setShowVrButton(false);
        g(findViewById8, false, false);
        Resources resources = context.getResources();
        this.W = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f7098a0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.O = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.P = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.Q = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.U = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.V = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.R = resources.getString(R.string.exo_controls_repeat_off_description);
        this.S = resources.getString(R.string.exo_controls_repeat_one_description);
        this.T = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f7099b0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.c0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f7121w0 = -9223372036854775807L;
    }

    public static void b(w wVar) {
        int p10 = wVar.p();
        if (p10 == 1) {
            wVar.l();
        } else if (p10 == 4) {
            wVar.f(wVar.K(), -9223372036854775807L);
        }
        wVar.q();
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z10;
        int keyCode = keyEvent.getKeyCode();
        w wVar = this.f7100d0;
        if (wVar != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (wVar.p() != 4) {
                            wVar.V();
                        }
                    } else if (keyCode == 89) {
                        wVar.X();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            wVar.pause();
                                        }
                                    } else {
                                        b(wVar);
                                    }
                                } else {
                                    wVar.y();
                                }
                            } else {
                                wVar.U();
                            }
                        } else {
                            int p10 = wVar.p();
                            if (p10 != 1 && p10 != 4 && wVar.h()) {
                                wVar.pause();
                            } else {
                                b(wVar);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (e()) {
            setVisibility(8);
            Iterator<d> it = this.f7118v.iterator();
            while (it.hasNext()) {
                getVisibility();
                it.next().d();
            }
            removeCallbacks(this.M);
            removeCallbacks(this.N);
            this.f7112q0 = -9223372036854775807L;
        }
    }

    public final void d() {
        a9.d dVar = this.N;
        removeCallbacks(dVar);
        if (this.f7104i0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = this.f7104i0;
            this.f7112q0 = uptimeMillis + j10;
            if (this.e0) {
                postDelayed(dVar, j10);
                return;
            }
            return;
        }
        this.f7112q0 = -9223372036854775807L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.N);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        w wVar = this.f7100d0;
        if (wVar != null && wVar.p() != 4 && this.f7100d0.p() != 1 && this.f7100d0.h()) {
            return true;
        }
        return false;
    }

    public final void g(View view, boolean z10, boolean z11) {
        float f;
        int i6;
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        if (z11) {
            f = this.W;
        } else {
            f = this.f7098a0;
        }
        view.setAlpha(f);
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        view.setVisibility(i6);
    }

    public w getPlayer() {
        return this.f7100d0;
    }

    public int getRepeatToggleModes() {
        return this.f7106k0;
    }

    public boolean getShowShuffleButton() {
        return this.f7111p0;
    }

    public int getShowTimeoutMs() {
        return this.f7104i0;
    }

    public boolean getShowVrButton() {
        View view = this.E;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (e() && this.e0) {
            w wVar = this.f7100d0;
            if (wVar != null) {
                z10 = wVar.L(5);
                z12 = wVar.L(7);
                z13 = wVar.L(11);
                z14 = wVar.L(12);
                z11 = wVar.L(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            g(this.f7120w, this.f7109n0, z12);
            g(this.B, this.f7107l0, z13);
            g(this.A, this.f7108m0, z14);
            g(this.f7122x, this.f7110o0, z11);
            e eVar = this.H;
            if (eVar != null) {
                eVar.setEnabled(z10);
            }
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        if (e() && this.e0) {
            boolean f = f();
            View view = this.f7123y;
            boolean z15 = true;
            int i10 = 0;
            if (view != null) {
                if (f && view.isFocused()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z10 = z13 | false;
                if (c9.w.f5205a < 21) {
                    z14 = z10;
                } else if (f && a.a(view)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z11 = z14 | false;
                if (f) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                view.setVisibility(i6);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f7124z;
            if (view2 != null) {
                if (!f && view2.isFocused()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 |= z12;
                if (c9.w.f5205a < 21) {
                    z15 = z10;
                } else if (f || !a.a(view2)) {
                    z15 = false;
                }
                z11 |= z15;
                if (!f) {
                    i10 = 8;
                }
                view2.setVisibility(i10);
            }
            if (z10) {
                boolean f2 = f();
                if (!f2 && view != null) {
                    view.requestFocus();
                } else if (f2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z11) {
                boolean f10 = f();
                if (!f10 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else if (f10 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void j() {
        long j10;
        long j11;
        boolean z10;
        int p10;
        long j12;
        if (e() && this.e0) {
            w wVar = this.f7100d0;
            if (wVar != null) {
                j10 = wVar.D() + this.f7119v0;
                j11 = wVar.T() + this.f7119v0;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j10 != this.f7121w0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7121w0 = j10;
            TextView textView = this.G;
            if (textView != null && !this.f7103h0 && z10) {
                textView.setText(c9.w.s(this.I, this.J, j10));
            }
            e eVar = this.H;
            if (eVar != null) {
                eVar.setPosition(j10);
                eVar.setBufferedPosition(j11);
            }
            a9.d dVar = this.M;
            removeCallbacks(dVar);
            if (wVar == null) {
                p10 = 1;
            } else {
                p10 = wVar.p();
            }
            long j13 = 1000;
            if (wVar != null && wVar.isPlaying()) {
                if (eVar != null) {
                    j12 = eVar.getPreferredUpdateDelay();
                } else {
                    j12 = 1000;
                }
                long min = Math.min(j12, 1000 - (j10 % 1000));
                float f = wVar.c().f7195u;
                if (f > 0.0f) {
                    j13 = ((float) min) / f;
                }
                postDelayed(dVar, c9.w.i(j13, this.f7105j0, 1000L));
            } else if (p10 != 4 && p10 != 1) {
                postDelayed(dVar, 1000L);
            }
        }
    }

    public final void k() {
        ImageView imageView;
        if (e() && this.e0 && (imageView = this.C) != null) {
            if (this.f7106k0 == 0) {
                g(imageView, false, false);
                return;
            }
            w wVar = this.f7100d0;
            String str = this.R;
            Drawable drawable = this.O;
            if (wVar == null) {
                g(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(imageView, true, true);
            int r = wVar.r();
            if (r != 0) {
                if (r != 1) {
                    if (r == 2) {
                        imageView.setImageDrawable(this.Q);
                        imageView.setContentDescription(this.T);
                    }
                } else {
                    imageView.setImageDrawable(this.P);
                    imageView.setContentDescription(this.S);
                }
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
            imageView.setVisibility(0);
        }
    }

    public final void l() {
        ImageView imageView;
        if (e() && this.e0 && (imageView = this.D) != null) {
            w wVar = this.f7100d0;
            if (!this.f7111p0) {
                g(imageView, false, false);
                return;
            }
            String str = this.c0;
            Drawable drawable = this.V;
            if (wVar == null) {
                g(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(imageView, true, true);
            if (wVar.S()) {
                drawable = this.U;
            }
            imageView.setImageDrawable(drawable);
            if (wVar.S()) {
                str = this.f7099b0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        boolean z10;
        e0 Q;
        long j10;
        int i6;
        TextView textView;
        e eVar;
        int i10;
        int i11;
        long j11;
        int i12;
        e0 e0Var;
        boolean z11;
        int length;
        boolean z12;
        w wVar = this.f7100d0;
        if (wVar == null) {
            return;
        }
        boolean z13 = this.f7101f0;
        long j12 = -9223372036854775807L;
        boolean z14 = false;
        boolean z15 = true;
        e0.c cVar = this.L;
        if (z13) {
            e0 Q2 = wVar.Q();
            if (Q2.p() <= 100) {
                int p10 = Q2.p();
                for (int i13 = 0; i13 < p10; i13++) {
                    if (Q2.n(i13, cVar).H != -9223372036854775807L) {
                    }
                }
                z12 = true;
                if (z12) {
                    z10 = true;
                    this.f7102g0 = z10;
                    this.f7119v0 = 0L;
                    Q = wVar.Q();
                    if (Q.q()) {
                        int K = wVar.K();
                        boolean z16 = this.f7102g0;
                        if (z16) {
                            i10 = 0;
                        } else {
                            i10 = K;
                        }
                        if (z16) {
                            i11 = Q.p() - 1;
                        } else {
                            i11 = K;
                        }
                        long j13 = 0;
                        i6 = 0;
                        while (true) {
                            if (i10 > i11) {
                                break;
                            }
                            if (i10 == K) {
                                this.f7119v0 = c9.w.E(j13);
                            }
                            Q.n(i10, cVar);
                            if (cVar.H == j12) {
                                sc.b.C(this.f7102g0 ^ z15);
                                break;
                            }
                            int i14 = cVar.I;
                            while (i14 <= cVar.J) {
                                e0.b bVar = this.K;
                                Q.g(i14, bVar, z14);
                                com.google.android.exoplayer2.source.ads.a aVar = bVar.A;
                                int i15 = aVar.f6828y;
                                while (i15 < aVar.f6825v) {
                                    long j14 = bVar.A.b(i15).f6830u;
                                    if (j14 == Long.MIN_VALUE) {
                                        j14 = bVar.f6468x;
                                        j11 = -9223372036854775807L;
                                        i12 = K;
                                        if (j14 == -9223372036854775807L) {
                                            e0Var = Q;
                                            i15++;
                                            Q = e0Var;
                                            j12 = j11;
                                            K = i12;
                                        }
                                    } else {
                                        j11 = -9223372036854775807L;
                                        i12 = K;
                                    }
                                    e0Var = Q;
                                    long j15 = j14 + bVar.f6469y;
                                    if (j15 >= 0) {
                                        long[] jArr = this.f7113r0;
                                        if (i6 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.f7113r0 = Arrays.copyOf(jArr, length);
                                            this.f7114s0 = Arrays.copyOf(this.f7114s0, length);
                                        }
                                        this.f7113r0[i6] = c9.w.E(j15 + j13);
                                        boolean[] zArr = this.f7114s0;
                                        a.C0138a b10 = bVar.A.b(i15);
                                        int i16 = b10.f6831v;
                                        if (i16 != -1) {
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                int i18 = i16;
                                                int i19 = b10.f6833x[i17];
                                                if (i19 != 0) {
                                                    a.C0138a c0138a = b10;
                                                    if (i19 == 1) {
                                                        z11 = true;
                                                        break;
                                                    }
                                                    i17++;
                                                    i16 = i18;
                                                    b10 = c0138a;
                                                }
                                            }
                                            z11 = false;
                                            zArr[i6] = !z11;
                                            i6++;
                                            i15++;
                                            Q = e0Var;
                                            j12 = j11;
                                            K = i12;
                                        }
                                        z11 = true;
                                        zArr[i6] = !z11;
                                        i6++;
                                        i15++;
                                        Q = e0Var;
                                        j12 = j11;
                                        K = i12;
                                    }
                                    i15++;
                                    Q = e0Var;
                                    j12 = j11;
                                    K = i12;
                                }
                                i14++;
                                Q = Q;
                                z14 = false;
                            }
                            j13 += cVar.H;
                            i10++;
                            Q = Q;
                            j12 = j12;
                            z14 = false;
                            z15 = true;
                        }
                        j10 = j13;
                    } else {
                        j10 = 0;
                        i6 = 0;
                    }
                    long E = c9.w.E(j10);
                    textView = this.F;
                    if (textView != null) {
                        textView.setText(c9.w.s(this.I, this.J, E));
                    }
                    eVar = this.H;
                    if (eVar != null) {
                        eVar.setDuration(E);
                        long[] jArr2 = this.f7115t0;
                        int length2 = jArr2.length;
                        int i20 = i6 + length2;
                        long[] jArr3 = this.f7113r0;
                        if (i20 > jArr3.length) {
                            this.f7113r0 = Arrays.copyOf(jArr3, i20);
                            this.f7114s0 = Arrays.copyOf(this.f7114s0, i20);
                        }
                        System.arraycopy(jArr2, 0, this.f7113r0, i6, length2);
                        System.arraycopy(this.f7117u0, 0, this.f7114s0, i6, length2);
                        eVar.a(this.f7113r0, this.f7114s0, i20);
                    }
                    j();
                }
            }
            z12 = false;
            if (z12) {
            }
        }
        z10 = false;
        this.f7102g0 = z10;
        this.f7119v0 = 0L;
        Q = wVar.Q();
        if (Q.q()) {
        }
        long E2 = c9.w.E(j10);
        textView = this.F;
        if (textView != null) {
        }
        eVar = this.H;
        if (eVar != null) {
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e0 = true;
        long j10 = this.f7112q0;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.N, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        i();
        h();
        k();
        l();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e0 = false;
        removeCallbacks(this.M);
        removeCallbacks(this.N);
    }

    public void setPlayer(w wVar) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        sc.b.q((wVar == null || wVar.R() == Looper.getMainLooper()) ? true : true);
        w wVar2 = this.f7100d0;
        if (wVar2 == wVar) {
            return;
        }
        b bVar = this.f7116u;
        if (wVar2 != null) {
            wVar2.v(bVar);
        }
        this.f7100d0 = wVar;
        if (wVar != null) {
            wVar.E(bVar);
        }
        i();
        h();
        k();
        l();
        m();
    }

    public void setRepeatToggleModes(int i6) {
        this.f7106k0 = i6;
        w wVar = this.f7100d0;
        if (wVar != null) {
            int r = wVar.r();
            if (i6 == 0 && r != 0) {
                this.f7100d0.B(0);
            } else if (i6 == 1 && r == 2) {
                this.f7100d0.B(1);
            } else if (i6 == 2 && r == 1) {
                this.f7100d0.B(2);
            }
        }
        k();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f7108m0 = z10;
        h();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f7101f0 = z10;
        m();
    }

    public void setShowNextButton(boolean z10) {
        this.f7110o0 = z10;
        h();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f7109n0 = z10;
        h();
    }

    public void setShowRewindButton(boolean z10) {
        this.f7107l0 = z10;
        h();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f7111p0 = z10;
        l();
    }

    public void setShowTimeoutMs(int i6) {
        this.f7104i0 = i6;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        int i6;
        View view = this.E;
        if (view != null) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            view.setVisibility(i6);
        }
    }

    public void setTimeBarMinUpdateInterval(int i6) {
        this.f7105j0 = c9.w.h(i6, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        View view = this.E;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g(view, showVrButton, z10);
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes.dex */
    public final class b implements w.d, e.a, View.OnClickListener {
        public b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void D(w wVar, w.c cVar) {
            boolean b10 = cVar.b(4, 5);
            c cVar2 = c.this;
            if (b10) {
                cVar2.i();
            }
            if (cVar.b(4, 5, 7)) {
                cVar2.j();
            }
            if (cVar.a(8)) {
                cVar2.k();
            }
            if (cVar.a(9)) {
                cVar2.l();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                cVar2.h();
            }
            if (cVar.b(11, 0)) {
                cVar2.m();
            }
        }

        @Override // com.google.android.exoplayer2.ui.e.a
        public final void d(long j10) {
            c cVar = c.this;
            TextView textView = cVar.G;
            if (textView != null) {
                textView.setText(c9.w.s(cVar.I, cVar.J, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.e.a
        public final void j(long j10) {
            c cVar = c.this;
            cVar.f7103h0 = true;
            TextView textView = cVar.G;
            if (textView != null) {
                textView.setText(c9.w.s(cVar.I, cVar.J, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.e.a
        public final void k(long j10, boolean z10) {
            w wVar;
            c cVar = c.this;
            int i6 = 0;
            cVar.f7103h0 = false;
            if (!z10 && (wVar = cVar.f7100d0) != null) {
                e0 Q = wVar.Q();
                if (cVar.f7102g0 && !Q.q()) {
                    int p10 = Q.p();
                    while (true) {
                        long E = c9.w.E(Q.n(i6, cVar.L).H);
                        if (j10 < E) {
                            break;
                        } else if (i6 == p10 - 1) {
                            j10 = E;
                            break;
                        } else {
                            j10 -= E;
                            i6++;
                        }
                    }
                } else {
                    i6 = wVar.K();
                }
                wVar.f(i6, j10);
                cVar.j();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x006b A[LOOP:0: B:28:0x004c->B:45:0x006b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0069 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            boolean z10;
            c cVar = c.this;
            w wVar = cVar.f7100d0;
            if (wVar == null) {
                return;
            }
            if (cVar.f7122x == view) {
                wVar.U();
            } else if (cVar.f7120w == view) {
                wVar.y();
            } else if (cVar.A == view) {
                if (wVar.p() != 4) {
                    wVar.V();
                }
            } else if (cVar.B == view) {
                wVar.X();
            } else if (cVar.f7123y == view) {
                c.b(wVar);
            } else if (cVar.f7124z == view) {
                wVar.pause();
            } else if (cVar.C == view) {
                int r = wVar.r();
                int i6 = cVar.f7106k0;
                int i10 = 1;
                while (true) {
                    if (i10 > 2) {
                        break;
                    }
                    int i11 = (r + i10) % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            z10 = false;
                        }
                        if (!z10) {
                            r = i11;
                            break;
                        }
                        i10++;
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
                wVar.B(r);
            } else if (cVar.D == view) {
                wVar.k(!wVar.S());
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

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
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
        public final /* synthetic */ void c(q qVar) {
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
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
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
        public final /* synthetic */ void G(p pVar, h hVar) {
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

    public void setProgressUpdateListener(InterfaceC0140c interfaceC0140c) {
    }
}
