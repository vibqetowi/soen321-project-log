package f0;

import f0.g;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g.a f14616u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14617v;

    public d(g.a aVar, Object obj) {
        this.f14616u = aVar;
        this.f14617v = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14616u.f14630u = this.f14617v;
    }
}
