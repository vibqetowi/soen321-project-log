package oa;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f27324w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f27325x;

    /* renamed from: y  reason: collision with root package name */
    public final transient int f27326y;

    public f(int i6, int i10, Object[] objArr) {
        this.f27324w = objArr;
        this.f27325x = i6;
        this.f27326y = i10;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sc.b.n0(i6, this.f27326y);
        Object obj = this.f27324w[i6 + i6 + this.f27325x];
        obj.getClass();
        return obj;
    }

    @Override // oa.n
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27326y;
    }
}
