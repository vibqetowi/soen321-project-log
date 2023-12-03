package e5;

import e5.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class b implements a.b<List<Object>> {
    @Override // e5.a.b
    public final List<Object> a() {
        return new ArrayList();
    }
}
