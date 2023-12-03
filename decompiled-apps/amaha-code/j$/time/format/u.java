package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class u implements InterfaceC0710g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f20931c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f20932d;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.r f20933a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20934b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(j$.time.temporal.r rVar, String str) {
        this.f20933a = rVar;
        this.f20934b = str;
    }

    private static int b(x xVar, CharSequence charSequence, int i6, int i10, l lVar) {
        String upperCase = charSequence.subSequence(i6, i10).toString().toUpperCase();
        if (i10 >= charSequence.length() || charSequence.charAt(i10) == '0' || xVar.b(charSequence.charAt(i10), 'Z')) {
            xVar.n(ZoneId.U(upperCase));
            return i10;
        }
        x d10 = xVar.d();
        int m10 = lVar.m(d10, charSequence, i10);
        try {
            if (m10 >= 0) {
                xVar.n(ZoneId.X(upperCase, ZoneOffset.f0((int) d10.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return m10;
            } else if (lVar == l.f20904e) {
                return ~i6;
            } else {
                xVar.n(ZoneId.U(upperCase));
                return i10;
            }
        } catch (j$.time.d unused) {
            return ~i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o a(x xVar) {
        Set a10 = j$.time.zone.i.a();
        int size = a10.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = xVar.k() ? f20931c : f20932d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = xVar.k() ? f20931c : f20932d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), o.g(a10, xVar));
                        if (xVar.k()) {
                            f20931c = simpleImmutableEntry;
                        } else {
                            f20932d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (o) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0710g
    public boolean l(A a10, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) a10.f(this.f20933a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.k());
        return true;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        int i10;
        int length = charSequence.length();
        if (i6 <= length) {
            if (i6 == length) {
                return ~i6;
            }
            char charAt = charSequence.charAt(i6);
            if (charAt == '+' || charAt == '-') {
                return b(xVar, charSequence, i6, i6, l.f20904e);
            }
            int i11 = i6 + 2;
            if (length >= i11) {
                char charAt2 = charSequence.charAt(i6 + 1);
                if (xVar.b(charAt, 'U') && xVar.b(charAt2, 'T')) {
                    int i12 = i6 + 3;
                    return (length < i12 || !xVar.b(charSequence.charAt(i11), 'C')) ? b(xVar, charSequence, i6, i11, l.f) : b(xVar, charSequence, i6, i12, l.f);
                } else if (xVar.b(charAt, 'G') && length >= (i10 = i6 + 3) && xVar.b(charAt2, 'M') && xVar.b(charSequence.charAt(i11), 'T')) {
                    int i13 = i6 + 4;
                    if (length < i13 || !xVar.b(charSequence.charAt(i10), '0')) {
                        return b(xVar, charSequence, i6, i10, l.f);
                    }
                    xVar.n(ZoneId.U("GMT0"));
                    return i13;
                }
            }
            o a10 = a(xVar);
            ParsePosition parsePosition = new ParsePosition(i6);
            String d10 = a10.d(charSequence, parsePosition);
            if (d10 != null) {
                xVar.n(ZoneId.U(d10));
                return parsePosition.getIndex();
            } else if (xVar.b(charAt, 'Z')) {
                xVar.n(ZoneOffset.UTC);
                return i6 + 1;
            } else {
                return ~i6;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return this.f20934b;
    }
}
