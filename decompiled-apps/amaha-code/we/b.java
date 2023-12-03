package we;

import java.util.Arrays;
import v9.m;
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f36688a;

    public b(String str) {
        this.f36688a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return m.a(this.f36688a, ((b) obj).f36688a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36688a});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f36688a, "token");
        return aVar.toString();
    }
}
