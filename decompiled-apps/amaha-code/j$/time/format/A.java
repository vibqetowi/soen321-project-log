package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0694c;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private j$.time.temporal.l f20857a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f20858b;

    /* renamed from: c  reason: collision with root package name */
    private int f20859c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.temporal.a[] values;
        ZoneOffset zoneOffset;
        ZoneRules rules;
        j$.time.chrono.n b10 = dateTimeFormatter.b();
        ZoneId e10 = dateTimeFormatter.e();
        if (b10 != null || e10 != null) {
            j$.time.chrono.n nVar = (j$.time.chrono.n) lVar.J(j$.time.temporal.o.e());
            ZoneId zoneId = (ZoneId) lVar.J(j$.time.temporal.o.l());
            InterfaceC0694c interfaceC0694c = null;
            b10 = Objects.equals(b10, nVar) ? null : b10;
            e10 = Objects.equals(e10, zoneId) ? null : e10;
            if (b10 != null || e10 != null) {
                j$.time.chrono.n nVar2 = b10 != null ? b10 : nVar;
                if (e10 != null) {
                    if (lVar.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                        lVar = ((j$.time.chrono.n) (nVar2 == null ? Objects.requireNonNull(j$.time.chrono.u.f20846d, "defaultObj") : nVar2)).O(Instant.U(lVar), e10);
                    } else {
                        try {
                            rules = e10.getRules();
                        } catch (j$.time.zone.f unused) {
                        }
                        if (rules.h()) {
                            zoneOffset = rules.getOffset(Instant.f20774c);
                            if (zoneOffset instanceof ZoneOffset) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                if (lVar.e(aVar) && lVar.l(aVar) != e10.getRules().getOffset(Instant.f20774c).c0()) {
                                    throw new j$.time.d("Unable to apply override zone '" + e10 + "' because the temporal object being formatted has a different offset but does not represent an instant: " + lVar);
                                }
                            }
                        }
                        zoneOffset = e10;
                        if (zoneOffset instanceof ZoneOffset) {
                        }
                    }
                }
                zoneId = e10 != null ? e10 : zoneId;
                if (b10 != null) {
                    if (lVar.e(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0694c = nVar2.E(lVar);
                    } else if (b10 != j$.time.chrono.u.f20846d || nVar != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && lVar.e(aVar2)) {
                                throw new j$.time.d("Unable to apply override chronology '" + b10 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new z(interfaceC0694c, lVar, nVar2, zoneId);
            }
        }
        this.f20857a = lVar;
        this.f20858b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f20859c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D b() {
        return this.f20858b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f20858b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.l d() {
        return this.f20857a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.p pVar) {
        if (this.f20859c <= 0 || this.f20857a.e(pVar)) {
            return Long.valueOf(this.f20857a.G(pVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(j$.time.temporal.r rVar) {
        Object J = this.f20857a.J(rVar);
        if (J == null && this.f20859c == 0) {
            j$.time.temporal.l lVar = this.f20857a;
            throw new j$.time.d("Unable to extract " + rVar + " from temporal " + lVar);
        }
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f20859c++;
    }

    public final String toString() {
        return this.f20857a.toString();
    }
}
