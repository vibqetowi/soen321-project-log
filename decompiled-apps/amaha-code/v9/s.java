package v9;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class s implements a.c {

    /* renamed from: v  reason: collision with root package name */
    public static final s f34943v = new s();

    /* renamed from: u  reason: collision with root package name */
    public final String f34944u = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return m.a(this.f34944u, ((s) obj).f34944u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34944u});
    }
}
