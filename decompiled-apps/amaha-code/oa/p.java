package oa;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: w  reason: collision with root package name */
    public final transient int f27337w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f27338x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q f27339y;

    public p(q qVar, int i6, int i10) {
        this.f27339y = qVar;
        this.f27337w = i6;
        this.f27338x = i10;
    }

    @Override // oa.n
    public final int g() {
        return this.f27339y.m() + this.f27337w + this.f27338x;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sc.b.n0(i6, this.f27338x);
        return this.f27339y.get(i6 + this.f27337w);
    }

    @Override // oa.n
    public final int m() {
        return this.f27339y.m() + this.f27337w;
    }

    @Override // oa.n
    public final boolean r() {
        return true;
    }

    @Override // oa.n
    public final Object[] s() {
        return this.f27339y.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27338x;
    }

    @Override // oa.q, java.util.List
    /* renamed from: t */
    public final q subList(int i6, int i10) {
        sc.b.s0(i6, i10, this.f27338x);
        int i11 = this.f27337w;
        return this.f27339y.subList(i6 + i11, i10 + i11);
    }
}
