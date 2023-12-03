package o2;

import androidx.work.q;
import v2.s;
/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f26985u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f26986v;

    public a(b bVar, s sVar) {
        this.f26986v = bVar;
        this.f26985u = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q d10 = q.d();
        String str = b.f26987d;
        StringBuilder sb2 = new StringBuilder("Scheduling work ");
        s sVar = this.f26985u;
        sb2.append(sVar.f34734a);
        d10.a(str, sb2.toString());
        this.f26986v.f26988a.b(sVar);
    }
}
