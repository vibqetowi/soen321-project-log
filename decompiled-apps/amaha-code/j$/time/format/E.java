package j$.time.format;

import j$.time.AbstractC0689a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0692a;
import j$.time.chrono.InterfaceC0694c;
import j$.time.chrono.InterfaceC0697f;
import j$.time.chrono.InterfaceC0702k;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E implements j$.time.temporal.l {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f20875b;

    /* renamed from: c  reason: collision with root package name */
    j$.time.chrono.n f20876c;

    /* renamed from: d  reason: collision with root package name */
    private F f20877d;

    /* renamed from: e  reason: collision with root package name */
    private InterfaceC0694c f20878e;
    private j$.time.n f;

    /* renamed from: a  reason: collision with root package name */
    final HashMap f20874a = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    j$.time.v f20879g = j$.time.v.f21036d;

    private void j(j$.time.temporal.l lVar) {
        Iterator it = this.f20874a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
            if (lVar.e(pVar)) {
                try {
                    long G = lVar.G(pVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (G != longValue) {
                        throw new j$.time.d("Conflict found: Field " + pVar + " " + G + " differs from " + pVar + " " + longValue + " derived from " + lVar);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void o() {
        HashMap hashMap = this.f20874a;
        if (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f20875b;
            if (zoneId != null) {
                p(zoneId);
                return;
            }
            Long l2 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                p(ZoneOffset.f0(l2.intValue()));
            }
        }
    }

    private void p(ZoneId zoneId) {
        HashMap hashMap = this.f20874a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        InterfaceC0702k O = this.f20876c.O(Instant.X(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        w(O.f());
        x(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(O.b().l0()));
    }

    private void q(long j10, long j11, long j12, long j13) {
        j$.time.n b02;
        j$.time.v vVar;
        if (this.f20877d == F.LENIENT) {
            long j14 = AbstractC0689a.j(AbstractC0689a.j(AbstractC0689a.j(AbstractC0689a.o(j10, 3600000000000L), AbstractC0689a.o(j11, 60000000000L)), AbstractC0689a.o(j12, 1000000000L)), j13);
            b02 = j$.time.n.c0(AbstractC0689a.m(j14, 86400000000000L));
            vVar = j$.time.v.c((int) AbstractC0689a.n(j14, 86400000000000L));
        } else {
            int T = j$.time.temporal.a.MINUTE_OF_HOUR.T(j11);
            int T2 = j$.time.temporal.a.NANO_OF_SECOND.T(j13);
            if (this.f20877d == F.SMART && j10 == 24 && T == 0 && j12 == 0 && T2 == 0) {
                b02 = j$.time.n.f20973g;
                vVar = j$.time.v.c(1);
            } else {
                b02 = j$.time.n.b0(j$.time.temporal.a.HOUR_OF_DAY.T(j10), T, j$.time.temporal.a.SECOND_OF_MINUTE.T(j12), T2);
                vVar = j$.time.v.f21036d;
            }
        }
        u(b02, vVar);
    }

    private void r() {
        j$.time.temporal.a aVar;
        long j10;
        HashMap hashMap = this.f20874a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (hashMap.containsKey(aVar2)) {
            long longValue = ((Long) hashMap.remove(aVar2)).longValue();
            F f = this.f20877d;
            if (f == F.STRICT || (f == F.SMART && longValue != 0)) {
                aVar2.U(longValue);
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            x(aVar2, aVar3, Long.valueOf(longValue));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar4)) {
            long longValue2 = ((Long) hashMap.remove(aVar4)).longValue();
            F f2 = this.f20877d;
            if (f2 == F.STRICT || (f2 == F.SMART && longValue2 != 0)) {
                aVar4.U(longValue2);
            }
            x(aVar4, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        j$.time.temporal.a aVar5 = j$.time.temporal.a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar5)) {
            j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar6)) {
                long longValue3 = ((Long) hashMap.remove(aVar5)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar6)).longValue();
                if (this.f20877d == F.LENIENT) {
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j10 = AbstractC0689a.j(AbstractC0689a.o(longValue3, 12), longValue4);
                } else {
                    aVar5.U(longValue3);
                    aVar6.U(longValue3);
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    j10 = (longValue3 * 12) + longValue4;
                }
                x(aVar5, aVar, Long.valueOf(j10));
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar7)) {
            long longValue5 = ((Long) hashMap.remove(aVar7)).longValue();
            if (this.f20877d != F.LENIENT) {
                aVar7.U(longValue5);
            }
            x(aVar7, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            x(aVar7, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            x(aVar7, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            x(aVar7, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue6 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f20877d != F.LENIENT) {
                aVar8.U(longValue6);
            }
            x(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            x(aVar8, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue7 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f20877d != F.LENIENT) {
                aVar9.U(longValue7);
            }
            x(aVar9, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            x(aVar9, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue8 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f20877d != F.LENIENT) {
                aVar10.U(longValue8);
            }
            x(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            x(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            x(aVar10, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar11)) {
            long longValue9 = ((Long) hashMap.remove(aVar11)).longValue();
            if (this.f20877d != F.LENIENT) {
                aVar11.U(longValue9);
            }
            x(aVar11, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            x(aVar11, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        j$.time.temporal.a aVar12 = j$.time.temporal.a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar12)) {
            long longValue10 = ((Long) hashMap.get(aVar12)).longValue();
            F f10 = this.f20877d;
            F f11 = F.LENIENT;
            if (f10 != f11) {
                aVar12.U(longValue10);
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar13)) {
                long longValue11 = ((Long) hashMap.remove(aVar13)).longValue();
                if (this.f20877d != f11) {
                    aVar13.U(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                x(aVar13, aVar12, Long.valueOf(longValue10));
            }
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar14)) {
                long longValue12 = ((Long) hashMap.remove(aVar14)).longValue();
                if (this.f20877d != f11) {
                    aVar14.U(longValue12);
                }
                x(aVar14, aVar12, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar15 = j$.time.temporal.a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar15)) {
            j$.time.temporal.a aVar16 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar16)) {
                j$.time.temporal.a aVar17 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar17) && hashMap.containsKey(aVar12)) {
                    q(((Long) hashMap.remove(aVar15)).longValue(), ((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar17)).longValue(), ((Long) hashMap.remove(aVar12)).longValue());
                }
            }
        }
    }

    private void u(j$.time.n nVar, j$.time.v vVar) {
        j$.time.n nVar2 = this.f;
        if (nVar2 == null) {
            this.f = nVar;
        } else if (!nVar2.equals(nVar)) {
            j$.time.n nVar3 = this.f;
            throw new j$.time.d("Conflict found: Fields resolved to different times: " + nVar3 + " " + nVar);
        } else {
            j$.time.v vVar2 = this.f20879g;
            vVar2.getClass();
            j$.time.v vVar3 = j$.time.v.f21036d;
            if (!(vVar2 == vVar3)) {
                if (!(vVar == vVar3) && !this.f20879g.equals(vVar)) {
                    j$.time.v vVar4 = this.f20879g;
                    throw new j$.time.d("Conflict found: Fields resolved to different excess periods: " + vVar4 + " " + vVar);
                }
            }
        }
        this.f20879g = vVar;
    }

    private void w(InterfaceC0694c interfaceC0694c) {
        InterfaceC0694c interfaceC0694c2 = this.f20878e;
        if (interfaceC0694c2 != null) {
            if (interfaceC0694c == null || interfaceC0694c2.equals(interfaceC0694c)) {
                return;
            }
            InterfaceC0694c interfaceC0694c3 = this.f20878e;
            throw new j$.time.d("Conflict found: Fields resolved to two different dates: " + interfaceC0694c3 + " " + interfaceC0694c);
        } else if (interfaceC0694c != null) {
            if (((AbstractC0692a) this.f20876c).equals(interfaceC0694c.a())) {
                this.f20878e = interfaceC0694c;
                return;
            }
            j$.time.chrono.n nVar = this.f20876c;
            throw new j$.time.d("ChronoLocalDate must use the effective parsed chronology: " + nVar);
        }
    }

    private void x(j$.time.temporal.a aVar, j$.time.temporal.a aVar2, Long l2) {
        Long l10 = (Long) this.f20874a.put(aVar2, l2);
        if (l10 == null || l10.longValue() == l2.longValue()) {
            return;
        }
        throw new j$.time.d("Conflict found: " + aVar2 + " " + l10 + " differs from " + aVar2 + " " + l2 + " while resolving  " + aVar);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l2 = (Long) this.f20874a.get(pVar);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC0694c interfaceC0694c = this.f20878e;
        if (interfaceC0694c == null || !interfaceC0694c.e(pVar)) {
            j$.time.n nVar = this.f;
            if (nVar == null || !nVar.e(pVar)) {
                if (pVar instanceof j$.time.temporal.a) {
                    throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
                }
                return pVar.G(this);
            }
            return this.f.G(pVar);
        }
        return this.f20878e.G(pVar);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.l()) {
            return this.f20875b;
        }
        if (rVar == j$.time.temporal.o.e()) {
            return this.f20876c;
        }
        if (rVar == j$.time.temporal.o.f()) {
            InterfaceC0694c interfaceC0694c = this.f20878e;
            if (interfaceC0694c != null) {
                return j$.time.j.V(interfaceC0694c);
            }
            return null;
        } else if (rVar == j$.time.temporal.o.g()) {
            return this.f;
        } else {
            if (rVar != j$.time.temporal.o.i()) {
                if (rVar != j$.time.temporal.o.k() && rVar == j$.time.temporal.o.j()) {
                    return null;
                }
                return rVar.i(this);
            }
            Long l2 = (Long) this.f20874a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                return ZoneOffset.f0(l2.intValue());
            }
            ZoneId zoneId = this.f20875b;
            return zoneId instanceof ZoneOffset ? zoneId : rVar.i(this);
        }
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        InterfaceC0694c interfaceC0694c;
        j$.time.n nVar;
        return this.f20874a.containsKey(pVar) || ((interfaceC0694c = this.f20878e) != null && interfaceC0694c.e(pVar)) || (((nVar = this.f) != null && nVar.e(pVar)) || !(pVar == null || (pVar instanceof j$.time.temporal.a) || !pVar.l(this)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(F f, Set set) {
        InterfaceC0694c interfaceC0694c;
        j$.time.n nVar;
        InterfaceC0702k D;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        j$.time.v vVar;
        j$.time.v vVar2;
        j$.time.temporal.a aVar3;
        Long valueOf;
        HashMap hashMap = this.f20874a;
        if (set != null) {
            hashMap.keySet().retainAll(set);
        }
        this.f20877d = f;
        o();
        w(this.f20876c.y(hashMap, this.f20877d));
        r();
        if (hashMap.size() > 0) {
            int i6 = 0;
            loop0: while (i6 < 50) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
                    j$.time.temporal.l r = pVar.r(hashMap, this, this.f20877d);
                    if (r != null) {
                        if (r instanceof InterfaceC0702k) {
                            InterfaceC0702k interfaceC0702k = (InterfaceC0702k) r;
                            ZoneId zoneId = this.f20875b;
                            if (zoneId == null) {
                                this.f20875b = interfaceC0702k.F();
                            } else if (!zoneId.equals(interfaceC0702k.F())) {
                                ZoneId zoneId2 = this.f20875b;
                                throw new j$.time.d("ChronoZonedDateTime must use the effective parsed zone: " + zoneId2);
                            }
                            r = interfaceC0702k.s();
                        }
                        if (r instanceof InterfaceC0697f) {
                            InterfaceC0697f interfaceC0697f = (InterfaceC0697f) r;
                            u(interfaceC0697f.b(), j$.time.v.f21036d);
                            w(interfaceC0697f.f());
                        } else if (r instanceof InterfaceC0694c) {
                            w((InterfaceC0694c) r);
                        } else if (!(r instanceof j$.time.n)) {
                            throw new j$.time.d("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        } else {
                            u((j$.time.n) r, j$.time.v.f21036d);
                        }
                    } else if (!hashMap.containsKey(pVar)) {
                        break;
                    }
                    i6++;
                }
            }
            if (i6 == 50) {
                throw new j$.time.d("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i6 > 0) {
                o();
                w(this.f20876c.y(hashMap, this.f20877d));
                r();
            }
        }
        long j10 = 0;
        if (this.f == null) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar4)) {
                long longValue = ((Long) hashMap.remove(aVar4)).longValue();
                j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(aVar5)) {
                    long longValue2 = (((Long) hashMap.get(aVar5)).longValue() % 1000) + (longValue * 1000);
                    x(aVar4, aVar5, Long.valueOf(longValue2));
                    hashMap.remove(aVar5);
                    aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue2 * 1000);
                } else {
                    aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
                    valueOf = Long.valueOf(longValue * 1000000);
                }
                hashMap.put(aVar3, valueOf);
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (hashMap.containsKey(obj)) {
                    hashMap.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) hashMap.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l2 = (Long) hashMap.get(obj2);
            if (l2 != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l10 = (Long) hashMap.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l11 = (Long) hashMap.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l12 = (Long) hashMap.get(obj5);
                if ((l10 != null || (l11 == null && l12 == null)) && (l10 == null || l11 != null || l12 == null)) {
                    q(l2.longValue(), l10 != null ? l10.longValue() : 0L, l11 != null ? l11.longValue() : 0L, l12 != null ? l12.longValue() : 0L);
                    hashMap.remove(obj2);
                    hashMap.remove(obj3);
                    hashMap.remove(obj4);
                    hashMap.remove(obj5);
                }
                interfaceC0694c = this.f20878e;
                if (interfaceC0694c != null) {
                    j(interfaceC0694c);
                }
                nVar = this.f;
                if (nVar != null) {
                    j(nVar);
                    if (this.f20878e != null && hashMap.size() > 0) {
                        j(this.f20878e.I(this.f));
                    }
                }
                if (this.f20878e != null && this.f != null) {
                    vVar = this.f20879g;
                    vVar.getClass();
                    vVar2 = j$.time.v.f21036d;
                    if (!(vVar != vVar2)) {
                        this.f20878e = this.f20878e.A(this.f20879g);
                        this.f20879g = vVar2;
                    }
                }
                if (this.f == null && (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || hashMap.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    if (hashMap.containsKey(aVar)) {
                        hashMap.put(aVar, 0L);
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                        aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
                    } else {
                        long longValue3 = ((Long) hashMap.get(aVar)).longValue();
                        hashMap.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / 1000));
                        aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
                        j10 = longValue3 / 1000000;
                    }
                    hashMap.put(aVar2, Long.valueOf(j10));
                }
                if (this.f20878e != null || this.f == null) {
                }
                Long l13 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l13 != null) {
                    D = this.f20878e.I(this.f).D(ZoneOffset.f0(l13.intValue()));
                } else if (this.f20875b == null) {
                    return;
                } else {
                    D = this.f20878e.I(this.f).D(this.f20875b);
                }
                hashMap.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(D.S()));
                return;
            }
        }
        if (this.f20877d != F.LENIENT && hashMap.size() > 0) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                j$.time.temporal.p pVar2 = (j$.time.temporal.p) entry2.getKey();
                if ((pVar2 instanceof j$.time.temporal.a) && pVar2.isTimeBased()) {
                    ((j$.time.temporal.a) pVar2).U(((Long) entry2.getValue()).longValue());
                }
            }
        }
        interfaceC0694c = this.f20878e;
        if (interfaceC0694c != null) {
        }
        nVar = this.f;
        if (nVar != null) {
        }
        if (this.f20878e != null) {
            vVar = this.f20879g;
            vVar.getClass();
            vVar2 = j$.time.v.f21036d;
            if (!(vVar != vVar2)) {
            }
        }
        if (this.f == null) {
            aVar = j$.time.temporal.a.NANO_OF_SECOND;
            if (hashMap.containsKey(aVar)) {
            }
            hashMap.put(aVar2, Long.valueOf(j10));
        }
        if (this.f20878e != null) {
        }
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f20874a);
        sb2.append(',');
        sb2.append(this.f20876c);
        if (this.f20875b != null) {
            sb2.append(',');
            sb2.append(this.f20875b);
        }
        if (this.f20878e != null || this.f != null) {
            sb2.append(" resolved to ");
            InterfaceC0694c interfaceC0694c = this.f20878e;
            if (interfaceC0694c != null) {
                sb2.append(interfaceC0694c);
                if (this.f != null) {
                    sb2.append('T');
                }
            }
            sb2.append(this.f);
        }
        return sb2.toString();
    }
}
