package pf;

import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ComponentMonitor.java */
/* loaded from: classes.dex */
public final class a implements f {
    @Override // hd.f
    public final List<b<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (b<?> bVar : componentRegistrar.getComponents()) {
            String str = bVar.f17397a;
            if (str != null) {
                bVar = new b<>(str, bVar.f17398b, bVar.f17399c, bVar.f17400d, bVar.f17401e, new dd.a(str, 2, bVar), bVar.f17402g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
