package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f20948a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20949b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20950c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f20951d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f20952e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f20951d = arrayList;
        this.f20952e = null;
        this.f20948a = dateTimeFormatter;
        arrayList.add(new E());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private E e() {
        ArrayList arrayList = this.f20951d;
        return (E) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p pVar) {
        if (this.f20952e == null) {
            this.f20952e = new ArrayList();
        }
        this.f20952e.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(char c10, char c11) {
        return this.f20949b ? c10 == c11 : c(c10, c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x d() {
        x xVar = new x(this.f20948a);
        xVar.f20949b = this.f20949b;
        xVar.f20950c = this.f20950c;
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z10) {
        ArrayList arrayList = this.f20951d;
        arrayList.remove(z10 ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D g() {
        return this.f20948a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.n h() {
        j$.time.chrono.n nVar = e().f20876c;
        if (nVar == null) {
            j$.time.chrono.n b10 = this.f20948a.b();
            return b10 == null ? j$.time.chrono.u.f20846d : b10;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale i() {
        return this.f20948a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long j(j$.time.temporal.a aVar) {
        return (Long) e().f20874a.get(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f20949b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.f20950c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z10) {
        this.f20949b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().f20875b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(j$.time.temporal.p pVar, long j10, int i6, int i10) {
        Objects.requireNonNull(pVar, "field");
        Long l2 = (Long) e().f20874a.put(pVar, Long.valueOf(j10));
        return (l2 == null || l2.longValue() == j10) ? i10 : ~i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        e().getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.f20950c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        ArrayList arrayList = this.f20951d;
        E e10 = e();
        e10.getClass();
        E e11 = new E();
        e11.f20874a.putAll(e10.f20874a);
        e11.f20875b = e10.f20875b;
        e11.f20876c = e10.f20876c;
        arrayList.add(e11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(CharSequence charSequence, int i6, CharSequence charSequence2, int i10, int i11) {
        if (i6 + i11 > charSequence.length() || i10 + i11 > charSequence2.length()) {
            return false;
        }
        if (this.f20949b) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (charSequence.charAt(i6 + i12) != charSequence2.charAt(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            char charAt = charSequence.charAt(i6 + i13);
            char charAt2 = charSequence2.charAt(i10 + i13);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.l t(F f, Set set) {
        E e10 = e();
        e10.f20876c = h();
        ZoneId zoneId = e10.f20875b;
        if (zoneId == null) {
            zoneId = this.f20948a.e();
        }
        e10.f20875b = zoneId;
        e10.k(f, set);
        return e10;
    }

    public final String toString() {
        return e().toString();
    }
}
