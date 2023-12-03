package vr;

import vr.t;
/* compiled from: Http2Ping.java */
/* loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t.a f36124u;

    public y0(t.a aVar, long j10) {
        this.f36124u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36124u.onSuccess();
    }
}
