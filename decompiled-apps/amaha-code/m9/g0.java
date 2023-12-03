package m9;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class g0 extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f24992u;

    public g0(d dVar) {
        this.f24992u = dVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        d dVar = this.f24992u;
        if (!dVar.f24958h.isEmpty() && dVar.f24961k == null && dVar.f24953b != 0) {
            ArrayDeque arrayDeque = dVar.f24958h;
            int[] f = p9.a.f(arrayDeque);
            g gVar = dVar.f24954c;
            gVar.getClass();
            v9.o.d("Must be called from the main thread.");
            if (!gVar.n()) {
                basePendingResult = g.m();
            } else {
                l lVar = new l(gVar, f);
                g.o(lVar);
                basePendingResult = lVar;
            }
            dVar.f24961k = basePendingResult;
            basePendingResult.i(new f0(dVar, 1));
            arrayDeque.clear();
        }
    }
}
