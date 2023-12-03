package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
/* renamed from: j$.time.chrono.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0694c extends Temporal, j$.time.temporal.m, Comparable {
    InterfaceC0694c A(j$.time.v vVar);

    InterfaceC0694c C(j$.time.temporal.m mVar);

    long H();

    InterfaceC0697f I(j$.time.n nVar);

    o L();

    int P();

    int Q(InterfaceC0694c interfaceC0694c);

    n a();

    @Override // j$.time.temporal.Temporal
    InterfaceC0694c c(long j10, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0694c d(long j10, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.l
    boolean e(j$.time.temporal.p pVar);

    boolean equals(Object obj);

    @Override // j$.time.temporal.Temporal
    InterfaceC0694c g(long j10, ChronoUnit chronoUnit);

    @Override // j$.time.temporal.Temporal
    long h(Temporal temporal, j$.time.temporal.s sVar);

    int hashCode();

    boolean t();

    String toString();
}
