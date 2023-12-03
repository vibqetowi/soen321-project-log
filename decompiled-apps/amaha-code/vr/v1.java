package vr;

import vr.q1;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class v1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q1 f36018u;

    public v1(q1 q1Var) {
        this.f36018u = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36018u.L();
        if (this.f36018u.f35877y != null) {
            this.f36018u.f35877y.getClass();
        }
        q1.l lVar = this.f36018u.f35876x;
        if (lVar != null) {
            lVar.f35894a.f35717b.e();
        }
    }
}
