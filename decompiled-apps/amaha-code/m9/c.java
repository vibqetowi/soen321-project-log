package m9;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c {
    public c() {
        new b0(this);
    }

    @RecentlyNullable
    @Deprecated
    public static u9.a a(@RecentlyNonNull k9.i iVar) {
        boolean z10;
        if (iVar != null) {
            List<u9.a> list = iVar.f23145u;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return list.get(0);
            }
            return null;
        }
        return null;
    }
}
