package androidx.fragment.app;

import androidx.fragment.app.t0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List f2150u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t0.b f2151v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ m f2152w;

    public d(m mVar, ArrayList arrayList, t0.b bVar) {
        this.f2152w = mVar;
        this.f2150u = arrayList;
        this.f2151v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f2150u;
        t0.b bVar = this.f2151v;
        if (list.contains(bVar)) {
            list.remove(bVar);
            this.f2152w.getClass();
            defpackage.c.a(bVar.f2285a, bVar.f2287c.mView);
        }
    }
}
