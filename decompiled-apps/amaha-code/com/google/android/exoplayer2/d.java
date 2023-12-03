package com.google.android.exoplayer2;

import com.google.android.exoplayer2.e0;
import java.util.Collections;
/* compiled from: BasePlayer.java */
/* loaded from: classes.dex */
public abstract class d implements w {

    /* renamed from: a  reason: collision with root package name */
    public final e0.c f6355a = new e0.c();

    @Override // com.google.android.exoplayer2.w
    public final void A(int i6) {
        f(i6, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean L(int i6) {
        return J().f7198u.f5138a.get(i6);
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean N() {
        e0 Q = Q();
        if (!Q.q() && Q.n(K(), this.f6355a).C) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.w
    public final void U() {
        boolean z10;
        if (!Q().q() && !b()) {
            if (b0() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int b02 = b0();
                if (b02 != -1) {
                    A(b02);
                }
            } else if (d0() && N()) {
                A(K());
            }
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void V() {
        g0(C());
    }

    @Override // com.google.android.exoplayer2.w
    public final void X() {
        g0(-a0());
    }

    public final int b0() {
        e0 Q = Q();
        if (Q.q()) {
            return -1;
        }
        int K = K();
        int r = r();
        if (r == 1) {
            r = 0;
        }
        return Q.f(K, r, S());
    }

    public final int c0() {
        e0 Q = Q();
        if (Q.q()) {
            return -1;
        }
        int K = K();
        int r = r();
        if (r == 1) {
            r = 0;
        }
        return Q.l(K, r, S());
    }

    public final boolean d0() {
        e0 Q = Q();
        if (!Q.q() && Q.n(K(), this.f6355a).b()) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        e0 Q = Q();
        if (!Q.q() && Q.n(K(), this.f6355a).B) {
            return true;
        }
        return false;
    }

    public final void f0(long j10) {
        f(K(), j10);
    }

    public final void g0(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f0(Math.max(currentPosition, 0L));
    }

    public final void h0(q qVar) {
        Z(Collections.singletonList(qVar));
    }

    @Override // com.google.android.exoplayer2.w
    public final void i() {
        o();
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean isPlaying() {
        if (p() == 3 && h() && O() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.w
    public final q j() {
        e0 Q = Q();
        if (Q.q()) {
            return null;
        }
        return Q.n(K(), this.f6355a).f6473w;
    }

    @Override // com.google.android.exoplayer2.w
    public final void pause() {
        z(false);
    }

    @Override // com.google.android.exoplayer2.w
    public final void q() {
        z(true);
    }

    @Override // com.google.android.exoplayer2.w
    public final void y() {
        boolean z10;
        int c0;
        if (!Q().q() && !b()) {
            if (c0() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d0() && !e0()) {
                if (z10 && (c0 = c0()) != -1) {
                    A(c0);
                    return;
                }
                return;
            }
            if (z10) {
                long currentPosition = getCurrentPosition();
                n();
                if (currentPosition <= 3000) {
                    int c02 = c0();
                    if (c02 != -1) {
                        A(c02);
                        return;
                    }
                    return;
                }
            }
            f0(0L);
        }
    }
}
