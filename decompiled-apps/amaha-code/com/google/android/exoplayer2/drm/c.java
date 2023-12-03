package com.google.android.exoplayer2.drm;

import android.os.Handler;
import c9.w;
import com.google.android.exoplayer2.source.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: DrmSessionEventListener.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6438a;

        /* renamed from: b  reason: collision with root package name */
        public final i.a f6439b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0135a> f6440c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: com.google.android.exoplayer2.drm.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0135a {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f6441a;

            /* renamed from: b  reason: collision with root package name */
            public final c f6442b;

            public C0135a(Handler handler, c cVar) {
                this.f6441a = handler;
                this.f6442b = cVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a() {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new s7.a(this, next.f6442b, 2));
            }
        }

        public final void b() {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new s7.a(this, next.f6442b, 1));
            }
        }

        public final void c() {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new s7.a(this, next.f6442b, 3));
            }
        }

        public final void d(int i6) {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new s7.b(this, next.f6442b, i6, 0));
            }
        }

        public final void e(Exception exc) {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new androidx.emoji2.text.g(7, this, next.f6442b, exc));
            }
        }

        public final void f() {
            Iterator<C0135a> it = this.f6440c.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                w.B(next.f6441a, new s7.a(this, next.f6442b, 0));
            }
        }

        public a(CopyOnWriteArrayList<C0135a> copyOnWriteArrayList, int i6, i.a aVar) {
            this.f6440c = copyOnWriteArrayList;
            this.f6438a = i6;
            this.f6439b = aVar;
        }
    }

    void O(int i6, i.a aVar);

    void X(int i6, i.a aVar);

    void g0(int i6, i.a aVar, int i10);

    void h0(int i6, i.a aVar);

    @Deprecated
    void k();

    void k0(int i6, i.a aVar);

    void u(int i6, i.a aVar, Exception exc);
}
