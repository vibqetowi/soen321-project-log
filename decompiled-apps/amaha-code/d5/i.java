package d5;
/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f12198a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f12199b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f12200c;

    public i() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f12198a.equals(iVar.f12198a) && this.f12199b.equals(iVar.f12199b) && j.a(this.f12200c, iVar.f12200c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = (this.f12199b.hashCode() + (this.f12198a.hashCode() * 31)) * 31;
        Class<?> cls = this.f12200c;
        if (cls != null) {
            i6 = cls.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f12198a + ", second=" + this.f12199b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f12198a = cls;
        this.f12199b = cls2;
        this.f12200c = cls3;
    }
}
