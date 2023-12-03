package oa;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: y  reason: collision with root package name */
    public static final b f27315y = new b(0, new Object[0]);

    /* renamed from: w  reason: collision with root package name */
    public final transient Object[] f27316w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f27317x;

    public b(int i6, Object[] objArr) {
        this.f27316w = objArr;
        this.f27317x = i6;
    }

    @Override // oa.q, oa.n
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f27316w;
        int i6 = this.f27317x;
        System.arraycopy(objArr2, 0, objArr, 0, i6);
        return i6;
    }

    @Override // oa.n
    public final int g() {
        return this.f27317x;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        sc.b.n0(i6, this.f27317x);
        Object obj = this.f27316w[i6];
        obj.getClass();
        return obj;
    }

    @Override // oa.n
    public final int m() {
        return 0;
    }

    @Override // oa.n
    public final boolean r() {
        return false;
    }

    @Override // oa.n
    public final Object[] s() {
        return this.f27316w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27317x;
    }
}
