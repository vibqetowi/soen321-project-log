package androidx.fragment.app;

import androidx.fragment.app.t0;
import java.util.ArrayList;
/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t0.a f2275u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t0 f2276v;

    public s0(t0 t0Var, t0.a aVar) {
        this.f2276v = t0Var;
        this.f2275u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0 t0Var = this.f2276v;
        ArrayList<t0.b> arrayList = t0Var.f2280b;
        t0.a aVar = this.f2275u;
        arrayList.remove(aVar);
        t0Var.f2281c.remove(aVar);
    }
}
