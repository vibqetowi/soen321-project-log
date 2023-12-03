package n2;

import java.util.List;
import v2.s;
/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class z implements o.a<List<s.b>, androidx.work.u> {
    @Override // o.a
    public final androidx.work.u apply(List<s.b> list) {
        List<s.b> list2 = list;
        if (list2 != null && list2.size() > 0) {
            return list2.get(0).a();
        }
        return null;
    }
}
