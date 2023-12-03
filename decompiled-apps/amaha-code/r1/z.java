package r1;

import android.util.SparseArray;
import r1.a0;
import r1.l;
/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a0.a f30374u;

    public z(a0.a aVar) {
        this.f30374u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray<l.c> sparseArray = this.f30374u.f30193h;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.valueAt(i6).a(null, null);
        }
        sparseArray.clear();
    }
}
