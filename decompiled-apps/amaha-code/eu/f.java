package eu;

import du.a;
import is.u;
import is.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: JvmNameResolver.kt */
/* loaded from: classes2.dex */
public final class f extends g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(a.d dVar, String[] strArr) {
        super(strArr, r0, r1);
        Set M2;
        List<Integer> list = dVar.f13480w;
        if (list.isEmpty()) {
            M2 = y.f20678u;
        } else {
            M2 = u.M2(list);
        }
        List<a.d.c> list2 = dVar.f13479v;
        i.f(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (a.d.c cVar : list2) {
            int i6 = cVar.f13489w;
            for (int i10 = 0; i10 < i6; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
    }
}
