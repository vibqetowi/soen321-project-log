package k4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class x implements h4.e {

    /* renamed from: j  reason: collision with root package name */
    public static final d5.g<Class<?>, byte[]> f22947j = new d5.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final l4.b f22948b;

    /* renamed from: c  reason: collision with root package name */
    public final h4.e f22949c;

    /* renamed from: d  reason: collision with root package name */
    public final h4.e f22950d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22951e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f22952g;

    /* renamed from: h  reason: collision with root package name */
    public final h4.g f22953h;

    /* renamed from: i  reason: collision with root package name */
    public final h4.k<?> f22954i;

    public x(l4.b bVar, h4.e eVar, h4.e eVar2, int i6, int i10, h4.k<?> kVar, Class<?> cls, h4.g gVar) {
        this.f22948b = bVar;
        this.f22949c = eVar;
        this.f22950d = eVar2;
        this.f22951e = i6;
        this.f = i10;
        this.f22954i = kVar;
        this.f22952g = cls;
        this.f22953h = gVar;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        l4.b bVar = this.f22948b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f22951e).putInt(this.f).array();
        this.f22950d.a(messageDigest);
        this.f22949c.a(messageDigest);
        messageDigest.update(bArr);
        h4.k<?> kVar = this.f22954i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f22953h.a(messageDigest);
        d5.g<Class<?>, byte[]> gVar = f22947j;
        Class<?> cls = this.f22952g;
        byte[] a10 = gVar.a(cls);
        if (a10 == null) {
            a10 = cls.getName().getBytes(h4.e.f17166a);
            gVar.d(cls, a10);
        }
        messageDigest.update(a10);
        bVar.put(bArr);
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f != xVar.f || this.f22951e != xVar.f22951e || !d5.j.a(this.f22954i, xVar.f22954i) || !this.f22952g.equals(xVar.f22952g) || !this.f22949c.equals(xVar.f22949c) || !this.f22950d.equals(xVar.f22950d) || !this.f22953h.equals(xVar.f22953h)) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        int hashCode = ((((this.f22950d.hashCode() + (this.f22949c.hashCode() * 31)) * 31) + this.f22951e) * 31) + this.f;
        h4.k<?> kVar = this.f22954i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        int hashCode2 = this.f22952g.hashCode();
        return this.f22953h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f22949c + ", signature=" + this.f22950d + ", width=" + this.f22951e + ", height=" + this.f + ", decodedResourceClass=" + this.f22952g + ", transformation='" + this.f22954i + "', options=" + this.f22953h + '}';
    }
}
