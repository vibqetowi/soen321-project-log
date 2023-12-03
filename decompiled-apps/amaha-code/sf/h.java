package sf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class h extends v<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f31494a;

    public h(v vVar) {
        this.f31494a = vVar;
    }

    @Override // sf.v
    public final AtomicLongArray a(yf.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.J()) {
            arrayList.add(Long.valueOf(((Number) this.f31494a.a(aVar)).longValue()));
        }
        aVar.j();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            atomicLongArray.set(i6, ((Long) arrayList.get(i6)).longValue());
        }
        return atomicLongArray;
    }

    @Override // sf.v
    public final void b(yf.b bVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.e();
        int length = atomicLongArray2.length();
        for (int i6 = 0; i6 < length; i6++) {
            this.f31494a.b(bVar, Long.valueOf(atomicLongArray2.get(i6)));
        }
        bVar.j();
    }
}
