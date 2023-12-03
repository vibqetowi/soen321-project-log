package j$.time.format;

import com.theinnerhour.b2b.utils.Constants;
import j$.time.AbstractC0689a;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0693b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0712i implements InterfaceC0710g {
    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        Long e10 = a10.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l d10 = a10.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d10.e(aVar) ? Long.valueOf(a10.d().G(aVar)) : null;
        int i6 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int T = aVar.T(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j10 = (longValue - 315569520000L) + 62167219200L;
            long n10 = AbstractC0689a.n(j10, 315569520000L) + 1;
            LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(AbstractC0689a.m(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (n10 > 0) {
                sb2.append('+');
                sb2.append(n10);
            }
            sb2.append(ofEpochSecond);
            if (ofEpochSecond.W() == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime ofEpochSecond2 = LocalDateTime.ofEpochSecond(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(ofEpochSecond2);
            if (ofEpochSecond2.W() == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (ofEpochSecond2.X() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (T > 0) {
            sb2.append('.');
            int i10 = 100000000;
            while (true) {
                if (T <= 0 && i6 % 3 == 0 && i6 >= -2) {
                    break;
                }
                int i11 = T / i10;
                sb2.append((char) (i11 + 48));
                T -= i11 * i10;
                i10 /= 10;
                i6++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        int i10;
        int i11;
        w wVar = new w();
        wVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        wVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        wVar.m(aVar, 2);
        wVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        wVar.m(aVar2, 2);
        wVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        wVar.m(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i12 = 0;
        wVar.b(aVar4, 0, 9, true);
        wVar.e('Z');
        C0709f h10 = wVar.u().h();
        x d10 = xVar.d();
        int m10 = h10.m(d10, charSequence, i6);
        if (m10 < 0) {
            return m10;
        }
        long longValue = d10.j(j$.time.temporal.a.YEAR).longValue();
        int intValue = d10.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = d10.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = d10.j(aVar).intValue();
        int intValue4 = d10.j(aVar2).intValue();
        Long j10 = d10.j(aVar3);
        Long j11 = d10.j(aVar4);
        int intValue5 = j10 != null ? j10.intValue() : 0;
        int intValue6 = j11 != null ? j11.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i11 = intValue5;
            i12 = 1;
            i10 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            xVar.p();
            i10 = intValue3;
            i11 = 59;
        } else {
            i10 = intValue3;
            i11 = intValue5;
        }
        try {
            return xVar.o(aVar4, intValue6, i6, xVar.o(j$.time.temporal.a.INSTANT_SECONDS, AbstractC0689a.o(longValue / 10000, 315569520000L) + AbstractC0693b.p(LocalDateTime.b0(((int) longValue) % Constants.TIMEOUT_MS, intValue, intValue2, i10, intValue4, i11).e0(i12), ZoneOffset.UTC), i6, m10));
        } catch (RuntimeException unused) {
            return ~i6;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
