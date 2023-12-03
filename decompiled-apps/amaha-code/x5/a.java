package x5;

import kotlin.jvm.internal.i;
/* compiled from: GateKeeper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f37608a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37609b;

    public a(String name, boolean z10) {
        i.g(name, "name");
        this.f37608a = name;
        this.f37609b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.b(this.f37608a, aVar.f37608a) && this.f37609b == aVar.f37609b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f37608a.hashCode() * 31;
        boolean z10 = this.f37609b;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return hashCode + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f37608a);
        sb2.append(", value=");
        return c.t(sb2, this.f37609b, ')');
    }
}
