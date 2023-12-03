package w3;
/* compiled from: EventPipeline.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f36390a;

    /* renamed from: b  reason: collision with root package name */
    public final v3.a f36391b;

    public k(int i6, v3.a aVar) {
        defpackage.d.j(i6, "type");
        this.f36390a = i6;
        this.f36391b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f36390a == kVar.f36390a && kotlin.jvm.internal.i.b(this.f36391b, kVar.f36391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.h.d(this.f36390a) * 31;
        v3.a aVar = this.f36391b;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + ri.e.j(this.f36390a) + ", event=" + this.f36391b + ')';
    }
}
