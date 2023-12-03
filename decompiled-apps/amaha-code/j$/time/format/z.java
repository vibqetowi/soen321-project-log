package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0694c;
/* loaded from: classes3.dex */
final class z implements j$.time.temporal.l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC0694c f20953a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.l f20954b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.n f20955c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f20956d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(InterfaceC0694c interfaceC0694c, j$.time.temporal.l lVar, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.f20953a = interfaceC0694c;
        this.f20954b = lVar;
        this.f20955c = nVar;
        this.f20956d = zoneId;
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        InterfaceC0694c interfaceC0694c = this.f20953a;
        return (interfaceC0694c == null || !pVar.isDateBased()) ? this.f20954b.G(pVar) : interfaceC0694c.G(pVar);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.e() ? this.f20955c : rVar == j$.time.temporal.o.l() ? this.f20956d : rVar == j$.time.temporal.o.j() ? this.f20954b.J(rVar) : rVar.i(this);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        InterfaceC0694c interfaceC0694c = this.f20953a;
        return (interfaceC0694c == null || !pVar.isDateBased()) ? this.f20954b.e(pVar) : interfaceC0694c.e(pVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        InterfaceC0694c interfaceC0694c = this.f20953a;
        return (interfaceC0694c == null || !pVar.isDateBased()) ? this.f20954b.n(pVar) : interfaceC0694c.n(pVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.n nVar = this.f20955c;
        if (nVar != null) {
            str = " with chronology " + nVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f20956d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f20954b + str + str2;
    }
}
