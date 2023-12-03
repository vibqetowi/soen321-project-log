package vr;

import java.util.concurrent.atomic.AtomicReference;
import vr.q1;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class b2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q1.n f35404u;

    public b2(q1.n nVar) {
        this.f35404u = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1.n nVar = this.f35404u;
        if (q1.this.B == null) {
            AtomicReference<io.grpc.g> atomicReference = nVar.f35907b;
            if (atomicReference.get() == q1.f35851k0) {
                atomicReference.set(null);
            }
            q1.this.F.a(q1.f35848h0);
        }
    }
}
