package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.os.CountDownTimer;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import d9.q;
import java.util.List;
import je.o;
import kotlin.jvm.internal.i;
import o8.p;
import q7.d;
import z8.h;
/* compiled from: N14CScreenFragment.kt */
/* loaded from: classes2.dex */
public final class c implements w.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14CScreenFragment f11108u;

    public c(N14CScreenFragment n14CScreenFragment) {
        this.f11108u = n14CScreenFragment;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        N14CScreenFragment n14CScreenFragment = this.f11108u;
        if (z10) {
            n14CScreenFragment.E = true;
            n14CScreenFragment.P.postDelayed(new o(26, n14CScreenFragment), n14CScreenFragment.f10975x);
            if (n14CScreenFragment.f10977z == null) {
                n14CScreenFragment.f10977z = new a(n14CScreenFragment);
            }
            CountDownTimer countDownTimer = n14CScreenFragment.f10977z;
            if (countDownTimer != null) {
                countDownTimer.start();
                return;
            }
            return;
        }
        n14CScreenFragment.E = false;
        CountDownTimer countDownTimer2 = n14CScreenFragment.f10977z;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        N14CScreenFragment n14CScreenFragment = this.f11108u;
        i.g(error, "error");
        try {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            int intValue = applicationPersistence.getIntValue("daec_" + n14CScreenFragment.G);
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = n14CScreenFragment.f10974w;
            logHelper.e(str, "N14Video failure for file " + n14CScreenFragment.G + " where error count " + intValue);
            n14CScreenFragment.Y();
            n14CScreenFragment.Q().j(n14CScreenFragment.G);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n14CScreenFragment.f10974w, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void x(int i6) {
        long j10;
        w player;
        w player2;
        w player3;
        N14CScreenFragment n14CScreenFragment = this.f11108u;
        if (i6 != 3) {
            if (i6 == 4) {
                n14CScreenFragment.S();
                return;
            }
            return;
        }
        n14CScreenFragment.M = false;
        PlayerView playerView = (PlayerView) n14CScreenFragment._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
        if (playerView != null && (player3 = playerView.getPlayer()) != null) {
            j10 = player3.getDuration() * n14CScreenFragment.K;
        } else {
            j10 = 0;
        }
        n14CScreenFragment.H = j10;
        ((AppCompatSeekBar) n14CScreenFragment._$_findCachedViewById(R.id.sbN14CScreenSeek)).setMax((int) n14CScreenFragment.H);
        if (n14CScreenFragment.N) {
            n14CScreenFragment.N = false;
            AppCompatSeekBar sbN14CScreenSeek = (AppCompatSeekBar) n14CScreenFragment._$_findCachedViewById(R.id.sbN14CScreenSeek);
            i.f(sbN14CScreenSeek, "sbN14CScreenSeek");
            sbN14CScreenSeek.setVisibility(0);
            PlayerView playerView2 = (PlayerView) n14CScreenFragment._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
            if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                long duration = player.getDuration();
                PlayerView playerView3 = (PlayerView) n14CScreenFragment._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                if (playerView3 != null && (player2 = playerView3.getPlayer()) != null) {
                    player2.f(n14CScreenFragment.K - 1, duration);
                }
            }
            ((AppCompatSeekBar) n14CScreenFragment._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) n14CScreenFragment.H);
            n14CScreenFragment.S();
        }
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void z(int i6, w.e oldPosition, w.e newPosition) {
        i.g(oldPosition, "oldPosition");
        i.g(newPosition, "newPosition");
        if (!i.b(oldPosition, newPosition)) {
            N14CScreenFragment n14CScreenFragment = this.f11108u;
            n14CScreenFragment.J = n14CScreenFragment.I;
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

    /* compiled from: N14CScreenFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ N14CScreenFragment f11109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N14CScreenFragment n14CScreenFragment) {
            super(2000L, 1000L);
            this.f11109a = n14CScreenFragment;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Float f;
            MotionLayout motionLayout;
            N14CScreenFragment n14CScreenFragment = this.f11109a;
            try {
                MotionLayout motionLayout2 = (MotionLayout) n14CScreenFragment._$_findCachedViewById(R.id.mlN14CParentContainer);
                if (motionLayout2 != null) {
                    f = Float.valueOf(motionLayout2.getProgress());
                } else {
                    f = null;
                }
                if (!i.a(f, 1.0f) && (motionLayout = (MotionLayout) n14CScreenFragment._$_findCachedViewById(R.id.mlN14CParentContainer)) != null) {
                    motionLayout.A();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(n14CScreenFragment.f10974w, e10);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
        }
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
    public final /* synthetic */ void i0(d dVar) {
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
    public final /* synthetic */ void y(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(w wVar, w.c cVar) {
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
}
