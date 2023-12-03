package t7;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import t7.a;
/* compiled from: TimelineQueueNavigator.java */
/* loaded from: classes.dex */
public abstract class b implements a.f {

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionCompat f32443a;

    /* renamed from: c  reason: collision with root package name */
    public final int f32445c = 10;

    /* renamed from: d  reason: collision with root package name */
    public long f32446d = -1;

    /* renamed from: b  reason: collision with root package name */
    public final e0.c f32444b = new e0.c();

    public b(MediaSessionCompat mediaSessionCompat) {
        this.f32443a = mediaSessionCompat;
    }

    @Override // t7.a.f
    public final void c(w wVar) {
        wVar.U();
    }

    @Override // t7.a.f
    public final long d(w wVar) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        e0 Q = wVar.Q();
        boolean z13 = false;
        if (!Q.q() && !wVar.b()) {
            int K = wVar.K();
            e0.c cVar = this.f32444b;
            Q.n(K, cVar);
            if (Q.p() > 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!wVar.L(5) && cVar.b() && !wVar.L(6)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if ((cVar.b() && cVar.C) || wVar.L(8)) {
                z13 = true;
            }
            z10 = z13;
            z13 = z12;
        } else {
            z10 = false;
            z11 = false;
        }
        if (z13) {
            j10 = 4096;
        } else {
            j10 = 0;
        }
        if (z11) {
            j10 |= 16;
        }
        if (z10) {
            return j10 | 32;
        }
        return j10;
    }

    @Override // t7.a.f
    public final void e(w wVar) {
        wVar.y();
    }

    @Override // t7.a.f
    public final void f(w wVar) {
        if (this.f32446d != -1 && wVar.Q().p() <= this.f32445c) {
            if (!wVar.Q().q()) {
                this.f32446d = wVar.K();
                return;
            }
            return;
        }
        o(wVar);
    }

    @Override // t7.a.f
    public final void g(w wVar, long j10) {
        int i6;
        e0 Q = wVar.Q();
        if (!Q.q() && !wVar.b() && (i6 = (int) j10) >= 0 && i6 < Q.p()) {
            wVar.A(i6);
        }
    }

    @Override // t7.a.f
    public final long k() {
        return this.f32446d;
    }

    @Override // t7.a.f
    public final void l(w wVar) {
        o(wVar);
    }

    public abstract MediaDescriptionCompat n(w wVar, int i6);

    public final void o(w wVar) {
        e0 Q = wVar.Q();
        boolean q10 = Q.q();
        MediaSessionCompat mediaSessionCompat = this.f32443a;
        if (q10) {
            mediaSessionCompat.i(Collections.emptyList());
            this.f32446d = -1L;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(this.f32445c, Q.p());
        int K = wVar.K();
        long j10 = K;
        arrayDeque.add(new MediaSessionCompat.QueueItem(null, n(wVar, K), j10));
        boolean S = wVar.S();
        int i6 = K;
        while (true) {
            int i10 = -1;
            if ((K != -1 || i6 != -1) && arrayDeque.size() < min) {
                if (i6 != -1) {
                    i6 = Q.f(i6, 0, S);
                    if (i6 != -1) {
                        arrayDeque.add(new MediaSessionCompat.QueueItem(null, n(wVar, i6), i6));
                    }
                    i10 = -1;
                }
                if (K != i10 && arrayDeque.size() < min && (K = Q.l(K, 0, S)) != i10) {
                    arrayDeque.addFirst(new MediaSessionCompat.QueueItem(null, n(wVar, K), K));
                }
            }
        }
        mediaSessionCompat.i(new ArrayList(arrayDeque));
        this.f32446d = j10;
    }

    @Override // t7.a.InterfaceC0546a
    public final void a(w wVar, String str) {
    }
}
