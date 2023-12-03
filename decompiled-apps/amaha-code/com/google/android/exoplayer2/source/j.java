package com.google.android.exoplayer2.source;

import android.os.Handler;
import c9.w;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6896a;

        /* renamed from: b  reason: collision with root package name */
        public final i.a f6897b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0139a> f6898c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6899d;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: com.google.android.exoplayer2.source.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0139a {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f6900a;

            /* renamed from: b  reason: collision with root package name */
            public final j f6901b;

            public C0139a(Handler handler, j jVar) {
                this.f6900a = handler;
                this.f6901b = jVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final long a(long j10) {
            long E = w.E(j10);
            if (E == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6899d + E;
        }

        public final void b(o8.e eVar) {
            Iterator<C0139a> it = this.f6898c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                w.B(next.f6900a, new androidx.emoji2.text.g(8, this, next.f6901b, eVar));
            }
        }

        public final void c(o8.d dVar, long j10, long j11) {
            d(dVar, new o8.e(1, -1, null, 0, null, a(j10), a(j11)));
        }

        public final void d(o8.d dVar, o8.e eVar) {
            Iterator<C0139a> it = this.f6898c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                w.B(next.f6900a, new o8.g(this, next.f6901b, dVar, eVar, 2));
            }
        }

        public final void e(o8.d dVar, com.google.android.exoplayer2.n nVar, long j10, long j11) {
            f(dVar, new o8.e(1, -1, nVar, 0, null, a(j10), a(j11)));
        }

        public final void f(o8.d dVar, o8.e eVar) {
            Iterator<C0139a> it = this.f6898c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                w.B(next.f6900a, new o8.g(this, next.f6901b, dVar, eVar, 1));
            }
        }

        public final void g(o8.d dVar, int i6, com.google.android.exoplayer2.n nVar, long j10, long j11, IOException iOException, boolean z10) {
            h(dVar, new o8.e(i6, -1, nVar, 0, null, a(j10), a(j11)), iOException, z10);
        }

        public final void h(final o8.d dVar, final o8.e eVar, final IOException iOException, final boolean z10) {
            Iterator<C0139a> it = this.f6898c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final j jVar = next.f6901b;
                w.B(next.f6900a, new Runnable() { // from class: o8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.j jVar2 = jVar;
                        d dVar2 = dVar;
                        e eVar2 = eVar;
                        IOException iOException2 = iOException;
                        boolean z11 = z10;
                        j.a aVar = j.a.this;
                        jVar2.p(aVar.f6896a, aVar.f6897b, dVar2, eVar2, iOException2, z11);
                    }
                });
            }
        }

        public final void i(o8.d dVar, com.google.android.exoplayer2.n nVar, long j10, long j11) {
            j(dVar, new o8.e(1, -1, nVar, 0, null, a(j10), a(j11)));
        }

        public final void j(o8.d dVar, o8.e eVar) {
            Iterator<C0139a> it = this.f6898c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                w.B(next.f6900a, new o8.g(this, next.f6901b, dVar, eVar, 0));
            }
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i6, i.a aVar) {
            this.f6898c = copyOnWriteArrayList;
            this.f6896a = i6;
            this.f6897b = aVar;
            this.f6899d = 0L;
        }
    }

    void I(int i6, i.a aVar, o8.d dVar, o8.e eVar);

    void J(int i6, i.a aVar, o8.d dVar, o8.e eVar);

    void K(int i6, i.a aVar, o8.d dVar, o8.e eVar);

    void n(int i6, i.a aVar, o8.e eVar);

    void p(int i6, i.a aVar, o8.d dVar, o8.e eVar, IOException iOException, boolean z10);
}
