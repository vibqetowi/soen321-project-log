package j$.time;

import j$.time.temporal.Temporal;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements j$.time.temporal.r, j$.time.temporal.m {
    @Override // j$.time.temporal.r
    public Object i(j$.time.temporal.l lVar) {
        return LocalDateTime.U(lVar);
    }

    @Override // j$.time.temporal.m
    public Temporal r(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.c(temporal.n(aVar).d(), aVar);
    }
}
