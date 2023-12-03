package ev;

import java.io.Serializable;
/* compiled from: MapEntry.java */
/* loaded from: classes2.dex */
public final class e<K, V> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final K f14584u;

    /* renamed from: v  reason: collision with root package name */
    public final V f14585v;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, Object obj) {
        this.f14584u = str;
        this.f14585v = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        K k10 = this.f14584u;
        if (k10 == null) {
            if (eVar.f14584u != null) {
                return false;
            }
        } else if (!k10.equals(eVar.f14584u)) {
            return false;
        }
        V v10 = this.f14585v;
        V v11 = eVar.f14585v;
        if (v10 == null) {
            if (v11 != null) {
                return false;
            }
        } else if (!v10.equals(v11)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        K k10 = this.f14584u;
        if (k10 == null) {
            hashCode = 0;
        } else {
            hashCode = k10.hashCode();
        }
        V v10 = this.f14585v;
        if (v10 != null) {
            i6 = v10.hashCode();
        }
        return i6 ^ hashCode;
    }

    public final String toString() {
        return this.f14584u + "=" + this.f14585v;
    }
}
