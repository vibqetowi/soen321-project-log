package vr;

import io.grpc.b;
import io.grpc.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import vr.q1;
import vr.v2;
/* compiled from: ManagedChannelImpl.java */
/* loaded from: classes2.dex */
public final class z1<ReqT> extends v2<ReqT> {
    public final /* synthetic */ tr.d0 E;
    public final /* synthetic */ io.grpc.b F;
    public final /* synthetic */ tr.l G;
    public final /* synthetic */ q1.e H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z1(q1.e eVar, tr.d0 d0Var, tr.c0 c0Var, io.grpc.b bVar, x2 x2Var, w0 w0Var, v2.a0 a0Var, tr.l lVar) {
        super(d0Var, c0Var, r3, r4, r6, r1 == null ? r0.f35862i : r1, r0.f35860g.u0(), x2Var, w0Var, a0Var);
        this.H = eVar;
        this.E = d0Var;
        this.F = bVar;
        this.G = lVar;
        q1 q1Var = q1.this;
        v2.s sVar = q1Var.V;
        long j10 = q1Var.W;
        long j11 = q1Var.X;
        Executor executor = bVar.f20433b;
    }

    @Override // vr.v2
    public final r w(tr.c0 c0Var, v2.n nVar, int i6, boolean z10) {
        io.grpc.b bVar = this.F;
        bVar.getClass();
        List<c.a> list = bVar.f20437g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(nVar);
        b.a b10 = io.grpc.b.b(bVar);
        b10.f20446g = Collections.unmodifiableList(arrayList);
        io.grpc.b bVar2 = new io.grpc.b(b10);
        io.grpc.c[] c10 = u0.c(bVar2, c0Var, i6, z10);
        tr.d0<?, ?> d0Var = this.E;
        t a10 = this.H.a(new p2(d0Var, c0Var, bVar2));
        tr.l lVar = this.G;
        tr.l a11 = lVar.a();
        try {
            return a10.f(d0Var, c0Var, bVar2, c10);
        } finally {
            lVar.c(a11);
        }
    }

    @Override // vr.v2
    public final void x() {
        tr.i0 i0Var;
        q1.q qVar = q1.this.F;
        synchronized (qVar.f35935a) {
            try {
                qVar.f35936b.remove(this);
                if (qVar.f35936b.isEmpty()) {
                    i0Var = qVar.f35937c;
                    qVar.f35936b = new HashSet();
                } else {
                    i0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i0Var != null) {
            q1.this.E.h(i0Var);
        }
    }

    @Override // vr.v2
    public final tr.i0 y() {
        q1.q qVar = q1.this.F;
        synchronized (qVar.f35935a) {
            tr.i0 i0Var = qVar.f35937c;
            if (i0Var == null) {
                qVar.f35936b.add(this);
                return null;
            }
            return i0Var;
        }
    }
}
