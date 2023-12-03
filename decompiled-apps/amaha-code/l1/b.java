package l1;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import j9.f;
import j9.s;
import java.io.PrintWriter;
import k1.d;
import l1.a;
import m1.a;
import m1.b;
import t.i;
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public final class b extends l1.a {

    /* renamed from: a  reason: collision with root package name */
    public final p f23991a;

    /* renamed from: b  reason: collision with root package name */
    public final c f23992b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends w<D> implements b.a<D> {

        /* renamed from: n  reason: collision with root package name */
        public final m1.b<D> f23995n;

        /* renamed from: o  reason: collision with root package name */
        public p f23996o;

        /* renamed from: p  reason: collision with root package name */
        public C0374b<D> f23997p;

        /* renamed from: l  reason: collision with root package name */
        public final int f23993l = 0;

        /* renamed from: m  reason: collision with root package name */
        public final Bundle f23994m = null;

        /* renamed from: q  reason: collision with root package name */
        public m1.b<D> f23998q = null;

        public a(f fVar) {
            this.f23995n = fVar;
            if (fVar.f24772b == null) {
                fVar.f24772b = this;
                fVar.f24771a = 0;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        @Override // androidx.lifecycle.LiveData
        public final void g() {
            m1.b<D> bVar = this.f23995n;
            bVar.f24773c = true;
            bVar.f24775e = false;
            bVar.f24774d = false;
            f fVar = (f) bVar;
            fVar.f21760j.drainPermits();
            fVar.a();
            fVar.f24769h = new a.RunnableC0398a();
            fVar.b();
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            this.f23995n.f24773c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void j(x<? super D> xVar) {
            super.j(xVar);
            this.f23996o = null;
            this.f23997p = null;
        }

        @Override // androidx.lifecycle.w, androidx.lifecycle.LiveData
        public final void l(D d10) {
            super.l(d10);
            m1.b<D> bVar = this.f23998q;
            if (bVar != null) {
                bVar.f24775e = true;
                bVar.f24773c = false;
                bVar.f24774d = false;
                bVar.f = false;
                this.f23998q = null;
            }
        }

        public final void m() {
            p pVar = this.f23996o;
            C0374b<D> c0374b = this.f23997p;
            if (pVar != null && c0374b != null) {
                super.j(c0374b);
                e(pVar, c0374b);
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f23993l);
            sb2.append(" : ");
            ca.a.r(this.f23995n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: l1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0374b<D> implements x<D> {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0373a<D> f23999a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24000b = false;

        public C0374b(m1.b bVar, s sVar) {
            this.f23999a = sVar;
        }

        @Override // androidx.lifecycle.x
        public final void a(D d10) {
            s sVar = (s) this.f23999a;
            sVar.getClass();
            Void r32 = (Void) d10;
            SignInHubActivity signInHubActivity = sVar.f21768a;
            signInHubActivity.setResult(signInHubActivity.f7245x, signInHubActivity.f7246y);
            signInHubActivity.finish();
            this.f24000b = true;
        }

        public final String toString() {
            return this.f23999a.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends l0 {

        /* renamed from: z  reason: collision with root package name */
        public static final a f24001z = new a();

        /* renamed from: x  reason: collision with root package name */
        public final i<a> f24002x = new i<>();

        /* renamed from: y  reason: collision with root package name */
        public boolean f24003y = false;

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        public static class a implements o0.b {
            @Override // androidx.lifecycle.o0.b
            public final <T extends l0> T a(Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.o0.b
            public final l0 b(Class cls, d dVar) {
                return a(cls);
            }
        }

        @Override // androidx.lifecycle.l0
        public final void c() {
            i<a> iVar = this.f24002x;
            int f = iVar.f();
            for (int i6 = 0; i6 < f; i6++) {
                a h10 = iVar.h(i6);
                m1.b<D> bVar = h10.f23995n;
                bVar.a();
                bVar.f24774d = true;
                C0374b<D> c0374b = h10.f23997p;
                if (c0374b != 0) {
                    h10.j(c0374b);
                    if (c0374b.f24000b) {
                        c0374b.f23999a.getClass();
                    }
                }
                Object obj = bVar.f24772b;
                if (obj != null) {
                    if (obj == h10) {
                        bVar.f24772b = null;
                        bVar.f24775e = true;
                        bVar.f24773c = false;
                        bVar.f24774d = false;
                        bVar.f = false;
                    } else {
                        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                    }
                } else {
                    throw new IllegalStateException("No listener register");
                }
            }
            int i10 = iVar.f32265x;
            Object[] objArr = iVar.f32264w;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = null;
            }
            iVar.f32265x = 0;
            iVar.f32262u = false;
        }
    }

    public b(p pVar, q0 q0Var) {
        this.f23991a = pVar;
        this.f23992b = (c) new o0(q0Var, c.f24001z).a(c.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        boolean z10;
        c cVar = this.f23992b;
        if (cVar.f24002x.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i6 = 0; i6 < cVar.f24002x.f(); i6++) {
                a h10 = cVar.f24002x.h(i6);
                printWriter.print(str);
                printWriter.print("  #");
                i<a> iVar = cVar.f24002x;
                if (iVar.f32262u) {
                    iVar.c();
                }
                printWriter.print(iVar.f32263v[i6]);
                printWriter.print(": ");
                printWriter.println(h10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(h10.f23993l);
                printWriter.print(" mArgs=");
                printWriter.println(h10.f23994m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(h10.f23995n);
                Object obj = h10.f23995n;
                String f = pl.a.f(str2, "  ");
                m1.a aVar = (m1.a) obj;
                aVar.getClass();
                printWriter.print(f);
                printWriter.print("mId=");
                printWriter.print(aVar.f24771a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.f24772b);
                if (aVar.f24773c || aVar.f) {
                    printWriter.print(f);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.f24773c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.f24774d || aVar.f24775e) {
                    printWriter.print(f);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.f24774d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.f24775e);
                }
                if (aVar.f24769h != null) {
                    printWriter.print(f);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.f24769h);
                    printWriter.print(" waiting=");
                    aVar.f24769h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f24770i != null) {
                    printWriter.print(f);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.f24770i);
                    printWriter.print(" waiting=");
                    aVar.f24770i.getClass();
                    printWriter.println(false);
                }
                if (h10.f23997p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(h10.f23997p);
                    C0374b<D> c0374b = h10.f23997p;
                    c0374b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0374b.f24000b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj2 = h10.f23995n;
                D d10 = h10.d();
                obj2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                ca.a.r(d10, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (h10.f2358c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                printWriter.println(z10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ca.a.r(this.f23991a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
