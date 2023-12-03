package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.chrono.AbstractC0693b;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v extends u {

    /* renamed from: i  reason: collision with root package name */
    private static final ConcurrentHashMap f20935i = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final H f20936e;
    private final boolean f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f20937g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f20938h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(H h10, boolean z10) {
        super(r0, "ZoneText(" + h10 + ")");
        j$.time.temporal.r k10 = j$.time.temporal.o.k();
        this.f20937g = new HashMap();
        this.f20938h = new HashMap();
        this.f20936e = (H) Objects.requireNonNull(h10, "textStyle");
        this.f = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.time.format.u
    public final o a(x xVar) {
        o f;
        H h10 = H.NARROW;
        H h11 = this.f20936e;
        if (h11 == h10) {
            return super.a(xVar);
        }
        Locale i6 = xVar.i();
        boolean k10 = xVar.k();
        Set a10 = j$.time.zone.i.a();
        int size = a10.size();
        HashMap hashMap = k10 ? this.f20937g : this.f20938h;
        Map.Entry entry = (Map.Entry) hashMap.get(i6);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (f = (o) ((SoftReference) entry.getValue()).get()) == null) {
            f = o.f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i6).getZoneStrings();
            int length = zoneStrings.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i10];
                String str = strArr[0];
                if (a10.contains(str)) {
                    f.a(str, str);
                    String a11 = I.a(str, i6);
                    for (int i11 = h11 == H.FULL ? 1 : 2; i11 < strArr.length; i11 += 2) {
                        f.a(strArr[i11], a11);
                    }
                }
                i10++;
            }
            hashMap.put(i6, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(f)));
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // j$.time.format.u, j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(A a10, StringBuilder sb2) {
        ?? r02;
        H h10;
        String str;
        H h11;
        String[] strArr;
        ZoneId zoneId = (ZoneId) a10.f(j$.time.temporal.o.l());
        if (zoneId == null) {
            return false;
        }
        String k10 = zoneId.k();
        if (!(zoneId instanceof ZoneOffset)) {
            j$.time.temporal.l d10 = a10.d();
            if (!this.f) {
                if (d10.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                    r02 = zoneId.getRules().g(Instant.U(d10));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (d10.e(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (d10.e(aVar2)) {
                            LocalDateTime c0 = LocalDateTime.c0(j$.time.j.j0(d10.G(aVar)), j$.time.n.c0(d10.G(aVar2)));
                            if (zoneId.getRules().e(c0) == null) {
                                ZoneRules rules = zoneId.getRules();
                                ZonedDateTime D = c0.D(zoneId);
                                D.getClass();
                                r02 = rules.g(Instant.Y(AbstractC0693b.q(D), D.b().Y()));
                            }
                        }
                    }
                }
                Locale c10 = a10.c();
                h10 = H.NARROW;
                str = null;
                Map map = null;
                h11 = this.f20936e;
                if (h11 != h10) {
                    ConcurrentHashMap concurrentHashMap = f20935i;
                    SoftReference softReference = (SoftReference) concurrentHashMap.get(k10);
                    if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(c10)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(k10);
                        String[] strArr2 = {k10, timeZone.getDisplayName(false, 1, c10), timeZone.getDisplayName(false, 0, c10), timeZone.getDisplayName(true, 1, c10), timeZone.getDisplayName(true, 0, c10), k10, k10};
                        if (map == null) {
                            map = new ConcurrentHashMap();
                        }
                        map.put(c10, strArr2);
                        concurrentHashMap.put(k10, new SoftReference(map));
                        strArr = strArr2;
                    }
                    int l2 = h11.l();
                    str = r02 != 0 ? r02 != 1 ? strArr[l2 + 5] : strArr[l2 + 3] : strArr[l2 + 1];
                }
                if (str != null) {
                    k10 = str;
                }
            }
            r02 = 2;
            Locale c102 = a10.c();
            h10 = H.NARROW;
            str = null;
            Map map2 = null;
            h11 = this.f20936e;
            if (h11 != h10) {
            }
            if (str != null) {
            }
        }
        sb2.append(k10);
        return true;
    }
}
