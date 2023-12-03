package com.google.android.exoplayer2.source;

import android.os.Handler;
import b9.u;
import com.google.android.exoplayer2.e0;
/* compiled from: MediaSource.java */
/* loaded from: classes.dex */
public interface i {

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends o8.f {
        public a(Object obj) {
            super(-1L, obj);
        }

        public final a b(Object obj) {
            o8.f fVar;
            if (this.f27272a.equals(obj)) {
                fVar = this;
            } else {
                fVar = new o8.f(obj, this.f27273b, this.f27274c, this.f27275d, this.f27276e);
            }
            return new a(fVar);
        }

        public a(int i6, long j10, Object obj) {
            super(obj, -1, -1, j10, i6);
        }

        public a(o8.f fVar) {
            super(fVar);
        }

        public a(Object obj, int i6, int i10, long j10) {
            super(obj, i6, i10, j10, -1);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(i iVar, e0 e0Var);
    }

    h a(a aVar, b9.i iVar, long j10);

    void b(b bVar);

    void c(b bVar, u uVar);

    void d(Handler handler, j jVar);

    void e(j jVar);

    void f(b bVar);

    com.google.android.exoplayer2.q g();

    void h(Handler handler, com.google.android.exoplayer2.drm.c cVar);

    void i(com.google.android.exoplayer2.drm.c cVar);

    void j();

    void k();

    void l(h hVar);

    void m();

    void n(b bVar);
}
