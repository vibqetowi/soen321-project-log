package nd;

import java.util.concurrent.Callable;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class p implements Callable<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f26100u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26101v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f26102w;

    public p(t tVar, long j10, String str) {
        this.f26102w = tVar;
        this.f26100u = j10;
        this.f26101v = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        boolean z10;
        t tVar = this.f26102w;
        c0 c0Var = tVar.f26123m;
        if (c0Var != null && c0Var.f26036e.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            tVar.f26119i.f27354b.c(this.f26100u, this.f26101v);
            return null;
        }
        return null;
    }
}
