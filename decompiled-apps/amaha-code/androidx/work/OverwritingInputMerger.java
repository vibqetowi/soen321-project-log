package androidx.work;

import androidx.work.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // androidx.work.i
    public final d a(ArrayList arrayList) {
        d.a aVar = new d.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((d) it.next()).f3236a));
        }
        aVar.a(hashMap);
        d dVar = new d(aVar.f3237a);
        d.b(dVar);
        return dVar;
    }
}
