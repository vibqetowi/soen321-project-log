package j$.time.format;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s implements InterfaceC0710g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.p f20925a;

    /* renamed from: b  reason: collision with root package name */
    private final H f20926b;

    /* renamed from: c  reason: collision with root package name */
    private final C f20927c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k f20928d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(j$.time.temporal.p pVar, H h10, C c10) {
        this.f20925a = pVar;
        this.f20926b = h10;
        this.f20927c = c10;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        Long e10 = a10.e(this.f20925a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) a10.d().J(j$.time.temporal.o.e());
        String f = (nVar == null || nVar == j$.time.chrono.u.f20846d) ? this.f20927c.f(this.f20925a, e10.longValue(), this.f20926b, a10.c()) : this.f20927c.e(nVar, this.f20925a, e10.longValue(), this.f20926b, a10.c());
        if (f != null) {
            sb2.append(f);
            return true;
        }
        if (this.f20928d == null) {
            this.f20928d = new k(this.f20925a, 1, 19, G.NORMAL);
        }
        return this.f20928d.l(a10, sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        return r14.o(r2, r3, r16, r1 + r16);
     */
    @Override // j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(x xVar, CharSequence charSequence, int i6) {
        j$.time.temporal.p pVar;
        long value;
        int length;
        int length2 = charSequence.length();
        if (i6 < 0 || i6 > length2) {
            throw new IndexOutOfBoundsException();
        }
        H h10 = xVar.l() ? this.f20926b : null;
        j$.time.chrono.n h11 = xVar.h();
        C c10 = this.f20927c;
        j$.time.temporal.p pVar2 = this.f20925a;
        Iterator h12 = (h11 == null || h11 == j$.time.chrono.u.f20846d) ? c10.h(pVar2, h10, xVar.i()) : c10.g(h11, pVar2, h10, xVar.i());
        if (h12 != null) {
            while (true) {
                if (h12.hasNext()) {
                    Map.Entry entry = (Map.Entry) h12.next();
                    String str = (String) entry.getKey();
                    if (xVar.s(str, 0, charSequence, i6, str.length())) {
                        pVar = this.f20925a;
                        value = ((Long) entry.getValue()).longValue();
                        length = str.length();
                        break;
                    }
                } else {
                    if (pVar2 == j$.time.temporal.a.ERA && !xVar.l()) {
                        for (j$.time.chrono.o oVar : h11.w()) {
                            String obj = oVar.toString();
                            if (xVar.s(obj, 0, charSequence, i6, obj.length())) {
                                pVar = this.f20925a;
                                value = oVar.getValue();
                                length = obj.length();
                            }
                        }
                    }
                    if (xVar.l()) {
                        return ~i6;
                    }
                }
            }
        }
        if (this.f20928d == null) {
            this.f20928d = new k(this.f20925a, 1, 19, G.NORMAL);
        }
        return this.f20928d.m(xVar, charSequence, i6);
    }

    public final String toString() {
        H h10 = H.FULL;
        j$.time.temporal.p pVar = this.f20925a;
        H h11 = this.f20926b;
        if (h11 == h10) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + h11 + ")";
    }
}
