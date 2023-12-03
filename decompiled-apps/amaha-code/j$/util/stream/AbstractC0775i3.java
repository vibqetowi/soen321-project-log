package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.Comparator;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0775i3 implements j$.util.S {

    /* renamed from: a  reason: collision with root package name */
    final boolean f21488a;

    /* renamed from: b  reason: collision with root package name */
    final AbstractC0850z0 f21489b;

    /* renamed from: c  reason: collision with root package name */
    private Supplier f21490c;

    /* renamed from: d  reason: collision with root package name */
    j$.util.S f21491d;

    /* renamed from: e  reason: collision with root package name */
    InterfaceC0818r2 f21492e;
    C0731a f;

    /* renamed from: g  reason: collision with root package name */
    long f21493g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC0751e f21494h;

    /* renamed from: i  reason: collision with root package name */
    boolean f21495i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0775i3(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        this.f21489b = abstractC0850z0;
        this.f21490c = null;
        this.f21491d = s10;
        this.f21488a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0775i3(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        this.f21489b = abstractC0850z0;
        this.f21490c = c0731a;
        this.f21491d = null;
        this.f21488a = z10;
    }

    private boolean b() {
        while (this.f21494h.count() == 0) {
            if (this.f21492e.e() || !this.f.b()) {
                if (this.f21495i) {
                    return false;
                }
                this.f21492e.end();
                this.f21495i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC0751e abstractC0751e = this.f21494h;
        if (abstractC0751e == null) {
            if (this.f21495i) {
                return false;
            }
            c();
            d();
            this.f21493g = 0L;
            this.f21492e.c(this.f21491d.getExactSizeIfKnown());
            return b();
        }
        long j10 = this.f21493g + 1;
        this.f21493g = j10;
        boolean z10 = j10 < abstractC0751e.count();
        if (z10) {
            return z10;
        }
        this.f21493g = 0L;
        this.f21494h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f21491d == null) {
            this.f21491d = (j$.util.S) this.f21490c.get();
            this.f21490c = null;
        }
    }

    @Override // j$.util.S
    public final int characteristics() {
        c();
        int T = EnumC0765g3.T(this.f21489b.s0()) & EnumC0765g3.f;
        return (T & 64) != 0 ? (T & (-16449)) | (this.f21491d.characteristics() & 16448) : T;
    }

    abstract void d();

    abstract AbstractC0775i3 e(j$.util.S s10);

    @Override // j$.util.S
    public final long estimateSize() {
        c();
        return this.f21491d.estimateSize();
    }

    @Override // j$.util.S
    public final Comparator getComparator() {
        if (AbstractC0714b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC0765g3.SIZED.r(this.f21489b.s0())) {
            return this.f21491d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f21491d);
    }

    @Override // j$.util.S
    public j$.util.S trySplit() {
        if (this.f21488a && this.f21494h == null && !this.f21495i) {
            c();
            j$.util.S trySplit = this.f21491d.trySplit();
            if (trySplit == null) {
                return null;
            }
            return e(trySplit);
        }
        return null;
    }
}
