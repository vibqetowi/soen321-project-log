package y6;

import y6.d;
/* compiled from: FSize.java */
/* loaded from: classes.dex */
public final class a extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<a> f38269d;

    /* renamed from: b  reason: collision with root package name */
    public float f38270b;

    /* renamed from: c  reason: collision with root package name */
    public float f38271c;

    static {
        d<a> a10 = d.a(256, new a(0));
        f38269d = a10;
        a10.f = 0.5f;
    }

    public a() {
    }

    public static a b(float f, float f2) {
        a b10 = f38269d.b();
        b10.f38270b = f;
        b10.f38271c = f2;
        return b10;
    }

    @Override // y6.d.a
    public final d.a a() {
        return new a(0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f38270b != aVar.f38270b || this.f38271c != aVar.f38271c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f38270b) ^ Float.floatToIntBits(this.f38271c);
    }

    public final String toString() {
        return this.f38270b + "x" + this.f38271c;
    }

    public a(int i6) {
        this.f38270b = 0.0f;
        this.f38271c = 0.0f;
    }
}
