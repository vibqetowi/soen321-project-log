package vf;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
/* compiled from: JsonTreeWriter.java */
/* loaded from: classes.dex */
public final class g extends yf.b {
    public static final a J = new a();
    public static final sf.p K = new sf.p("closed");
    public final ArrayList G;
    public String H;
    public sf.m I;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i6, int i10) {
            throw new AssertionError();
        }
    }

    public g() {
        super(J);
        this.G = new ArrayList();
        this.I = sf.n.f31510u;
    }

    @Override // yf.b
    public final yf.b G() {
        l0(sf.n.f31510u);
        return this;
    }

    @Override // yf.b
    public final void O(long j10) {
        l0(new sf.p(Long.valueOf(j10)));
    }

    @Override // yf.b
    public final void R(Boolean bool) {
        if (bool == null) {
            l0(sf.n.f31510u);
        } else {
            l0(new sf.p(bool));
        }
    }

    @Override // yf.b
    public final void c0(Number number) {
        if (number == null) {
            l0(sf.n.f31510u);
            return;
        }
        if (!this.f38546z) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        l0(new sf.p(number));
    }

    @Override // yf.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.G;
        if (arrayList.isEmpty()) {
            arrayList.add(K);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // yf.b
    public final void e() {
        sf.k kVar = new sf.k();
        l0(kVar);
        this.G.add(kVar);
    }

    @Override // yf.b
    public final void e0(String str) {
        if (str == null) {
            l0(sf.n.f31510u);
        } else {
            l0(new sf.p(str));
        }
    }

    @Override // yf.b
    public final void f0(boolean z10) {
        l0(new sf.p(Boolean.valueOf(z10)));
    }

    @Override // yf.b
    public final void g() {
        sf.o oVar = new sf.o();
        l0(oVar);
        this.G.add(oVar);
    }

    @Override // yf.b
    public final void j() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && this.H == null) {
            if (k0() instanceof sf.k) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final sf.m k0() {
        ArrayList arrayList = this.G;
        return (sf.m) arrayList.get(arrayList.size() - 1);
    }

    public final void l0(sf.m mVar) {
        if (this.H != null) {
            mVar.getClass();
            if (!(mVar instanceof sf.n) || this.C) {
                ((sf.o) k0()).f31511u.put(this.H, mVar);
            }
            this.H = null;
        } else if (this.G.isEmpty()) {
            this.I = mVar;
        } else {
            sf.m k02 = k0();
            if (k02 instanceof sf.k) {
                sf.k kVar = (sf.k) k02;
                if (mVar == null) {
                    kVar.getClass();
                    mVar = sf.n.f31510u;
                }
                kVar.f31509u.add(mVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // yf.b
    public final void m() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty() && this.H == null) {
            if (k0() instanceof sf.o) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yf.b
    public final void o(String str) {
        if (str != null) {
            if (!this.G.isEmpty() && this.H == null) {
                if (k0() instanceof sf.o) {
                    this.H = str;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // yf.b, java.io.Flushable
    public final void flush() {
    }
}
