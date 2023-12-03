package j$.time.chrono;

import j$.time.temporal.Temporal;
/* loaded from: classes3.dex */
public enum F implements o {
    BEFORE_ROC,
    ROC;

    @Override // j$.time.temporal.l
    public final /* synthetic */ long G(j$.time.temporal.p pVar) {
        return AbstractC0693b.i(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object J(j$.time.temporal.r rVar) {
        return AbstractC0693b.o(this, rVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return AbstractC0693b.k(this, pVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return AbstractC0693b.h(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal r(Temporal temporal) {
        return AbstractC0693b.c(this, temporal);
    }
}
