package androidx.fragment.app;

import androidx.fragment.app.t0;
import java.util.ArrayList;
/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t0.a f2272u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t0 f2273v;

    public r0(t0 t0Var, t0.a aVar) {
        this.f2273v = t0Var;
        this.f2272u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<t0.b> arrayList = this.f2273v.f2280b;
        t0.a aVar = this.f2272u;
        if (arrayList.contains(aVar)) {
            defpackage.c.a(aVar.f2285a, aVar.f2287c.mView);
        }
    }
}
