package le;
/* compiled from: FieldTransform.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ke.m f24213a;

    /* renamed from: b  reason: collision with root package name */
    public final o f24214b;

    public e(ke.m mVar, o oVar) {
        this.f24213a = mVar;
        this.f24214b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f24213a.equals(eVar.f24213a)) {
            return false;
        }
        return this.f24214b.equals(eVar.f24214b);
    }

    public final int hashCode() {
        return this.f24214b.hashCode() + (this.f24213a.hashCode() * 31);
    }
}
