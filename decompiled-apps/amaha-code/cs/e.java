package cs;

import io.grpc.h;
import tr.j;
/* compiled from: GracefulSwitchLoadBalancer.java */
/* loaded from: classes2.dex */
public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public io.grpc.h f11950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f11951b;

    public e(d dVar) {
        this.f11951b = dVar;
    }

    @Override // io.grpc.h.c
    public final void f(j jVar, h.AbstractC0310h abstractC0310h) {
        boolean z10;
        io.grpc.h hVar = this.f11950a;
        d dVar = this.f11951b;
        io.grpc.h hVar2 = dVar.f11944h;
        j jVar2 = j.READY;
        if (hVar == hVar2) {
            sc.b.B("there's pending lb while current lb has been out of READY", dVar.f11947k);
            dVar.f11945i = jVar;
            dVar.f11946j = abstractC0310h;
            if (jVar == jVar2) {
                dVar.g();
            }
        } else if (hVar == dVar.f) {
            if (jVar == jVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f11947k = z10;
            if (!z10 && hVar2 != dVar.f11940c) {
                dVar.g();
            } else {
                dVar.f11941d.f(jVar, abstractC0310h);
            }
        }
    }

    @Override // cs.b
    public final h.c g() {
        return this.f11951b.f11941d;
    }
}
