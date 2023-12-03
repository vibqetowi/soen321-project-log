package j$.time.chrono;

import j$.time.temporal.Temporal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t implements o {
    public static final t AH;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ t[] f20845a;

    static {
        t tVar = new t();
        AH = tVar;
        f20845a = new t[]{tVar};
    }

    private t() {
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f20845a.clone();
    }

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
        return 1;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return AbstractC0693b.h(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.ERA ? j$.time.temporal.u.j(1L, 1L) : j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal r(Temporal temporal) {
        return AbstractC0693b.c(this, temporal);
    }
}
