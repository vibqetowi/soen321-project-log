package y6;

import y6.d.a;
/* compiled from: ObjectPool.java */
/* loaded from: classes.dex */
public final class d<T extends a> {

    /* renamed from: g  reason: collision with root package name */
    public static int f38278g;

    /* renamed from: a  reason: collision with root package name */
    public int f38279a;

    /* renamed from: b  reason: collision with root package name */
    public int f38280b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f38281c;

    /* renamed from: d  reason: collision with root package name */
    public int f38282d;

    /* renamed from: e  reason: collision with root package name */
    public final T f38283e;
    public float f;

    /* compiled from: ObjectPool.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public int f38284a = -1;

        public abstract a a();
    }

    public d(int i6, T t3) {
        if (i6 > 0) {
            this.f38280b = i6;
            this.f38281c = new Object[i6];
            this.f38282d = 0;
            this.f38283e = t3;
            this.f = 1.0f;
            d();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized d a(int i6, a aVar) {
        d dVar;
        synchronized (d.class) {
            dVar = new d(i6, aVar);
            int i10 = f38278g;
            dVar.f38279a = i10;
            f38278g = i10 + 1;
        }
        return dVar;
    }

    public final synchronized T b() {
        T t3;
        if (this.f38282d == -1 && this.f > 0.0f) {
            d();
        }
        Object[] objArr = this.f38281c;
        int i6 = this.f38282d;
        t3 = (T) objArr[i6];
        t3.f38284a = -1;
        this.f38282d = i6 - 1;
        return t3;
    }

    public final synchronized void c(T t3) {
        int i6 = t3.f38284a;
        if (i6 != -1) {
            if (i6 == this.f38279a) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t3.f38284a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int i10 = this.f38282d + 1;
        this.f38282d = i10;
        if (i10 >= this.f38281c.length) {
            int i11 = this.f38280b;
            int i12 = i11 * 2;
            this.f38280b = i12;
            Object[] objArr = new Object[i12];
            for (int i13 = 0; i13 < i11; i13++) {
                objArr[i13] = this.f38281c[i13];
            }
            this.f38281c = objArr;
        }
        t3.f38284a = this.f38279a;
        this.f38281c[this.f38282d] = t3;
    }

    public final void d() {
        float f = this.f;
        int i6 = this.f38280b;
        int i10 = (int) (i6 * f);
        if (i10 < 1) {
            i6 = 1;
        } else if (i10 <= i6) {
            i6 = i10;
        }
        for (int i11 = 0; i11 < i6; i11++) {
            this.f38281c[i11] = this.f38283e.a();
        }
        this.f38282d = i6 - 1;
    }
}
