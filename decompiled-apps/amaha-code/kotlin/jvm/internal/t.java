package kotlin.jvm.internal;
/* compiled from: PropertyReference.java */
/* loaded from: classes2.dex */
public abstract class t extends a implements ys.m {
    public t() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (getOwner().equals(tVar.getOwner()) && getName().equals(tVar.getName()) && getSignature().equals(tVar.getSignature()) && i.b(getBoundReceiver(), tVar.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof ys.m)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.a
    /* renamed from: m */
    public final ys.m getReflected() {
        return (ys.m) super.getReflected();
    }

    public final String toString() {
        ys.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public t(Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
    }
}
