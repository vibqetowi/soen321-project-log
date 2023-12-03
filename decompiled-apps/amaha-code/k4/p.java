package k4;

import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public final class p implements h4.e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f22917b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22918c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22919d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f22920e;
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final h4.e f22921g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, h4.k<?>> f22922h;

    /* renamed from: i  reason: collision with root package name */
    public final h4.g f22923i;

    /* renamed from: j  reason: collision with root package name */
    public int f22924j;

    public p(Object obj, h4.e eVar, int i6, int i10, d5.b bVar, Class cls, Class cls2, h4.g gVar) {
        kc.f.p(obj);
        this.f22917b = obj;
        if (eVar != null) {
            this.f22921g = eVar;
            this.f22918c = i6;
            this.f22919d = i10;
            kc.f.p(bVar);
            this.f22922h = bVar;
            if (cls != null) {
                this.f22920e = cls;
                if (cls2 != null) {
                    this.f = cls2;
                    kc.f.p(gVar);
                    this.f22923i = gVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f22917b.equals(pVar.f22917b) || !this.f22921g.equals(pVar.f22921g) || this.f22919d != pVar.f22919d || this.f22918c != pVar.f22918c || !this.f22922h.equals(pVar.f22922h) || !this.f22920e.equals(pVar.f22920e) || !this.f.equals(pVar.f) || !this.f22923i.equals(pVar.f22923i)) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        if (this.f22924j == 0) {
            int hashCode = this.f22917b.hashCode();
            this.f22924j = hashCode;
            int hashCode2 = ((((this.f22921g.hashCode() + (hashCode * 31)) * 31) + this.f22918c) * 31) + this.f22919d;
            this.f22924j = hashCode2;
            int hashCode3 = this.f22922h.hashCode() + (hashCode2 * 31);
            this.f22924j = hashCode3;
            int hashCode4 = this.f22920e.hashCode() + (hashCode3 * 31);
            this.f22924j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.f22924j = hashCode5;
            this.f22924j = this.f22923i.hashCode() + (hashCode5 * 31);
        }
        return this.f22924j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f22917b + ", width=" + this.f22918c + ", height=" + this.f22919d + ", resourceClass=" + this.f22920e + ", transcodeClass=" + this.f + ", signature=" + this.f22921g + ", hashCode=" + this.f22924j + ", transformations=" + this.f22922h + ", options=" + this.f22923i + '}';
    }
}
