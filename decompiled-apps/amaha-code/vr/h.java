package vr;

import java.io.InputStream;
import java.util.ArrayDeque;
import vr.h2;
import vr.i3;
/* compiled from: ApplicationThreadDeframerListener.java */
/* loaded from: classes2.dex */
public final class h implements h2.a {

    /* renamed from: a  reason: collision with root package name */
    public final d f35637a;

    /* renamed from: b  reason: collision with root package name */
    public final h2.a f35638b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f35639c = new ArrayDeque();

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35640u;

        public a(int i6) {
            this.f35640u = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f35638b.d(this.f35640u);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f35642u;

        public b(boolean z10) {
            this.f35642u = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f35638b.c(this.f35642u);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Throwable f35644u;

        public c(Throwable th2) {
            this.f35644u = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f35638b.e(this.f35644u);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener.java */
    /* loaded from: classes2.dex */
    public interface d {
        void f(Runnable runnable);
    }

    public h(f3 f3Var, x0 x0Var) {
        this.f35638b = f3Var;
        this.f35637a = x0Var;
    }

    @Override // vr.h2.a
    public final void a(i3.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                this.f35639c.add(next);
            } else {
                return;
            }
        }
    }

    @Override // vr.h2.a
    public final void c(boolean z10) {
        this.f35637a.f(new b(z10));
    }

    @Override // vr.h2.a
    public final void d(int i6) {
        this.f35637a.f(new a(i6));
    }

    @Override // vr.h2.a
    public final void e(Throwable th2) {
        this.f35637a.f(new c(th2));
    }
}
