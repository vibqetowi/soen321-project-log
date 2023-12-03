package jd;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import nd.n0;
import nd.o0;
import nd.v;
import nd.x;
import ya.i;
/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes.dex */
public final class d implements Callable<Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f21788u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f21789v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ud.d f21790w;

    public d(boolean z10, x xVar, ud.d dVar) {
        this.f21788u = z10;
        this.f21789v = xVar;
        this.f21790w = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        if (this.f21788u) {
            x xVar = this.f21789v;
            xVar.getClass();
            v vVar = new v(xVar, this.f21790w);
            ExecutorService executorService = o0.f26099a;
            xVar.f26142l.execute(new n0(new i(), vVar));
            return null;
        }
        return null;
    }
}
