package vr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
/* compiled from: JsonParser.java */
/* loaded from: classes2.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f35761a = Logger.getLogger(l1.class.getName());

    public static Object a(yf.a aVar) {
        sc.b.B("unexpected end of JSON", aVar.J());
        int d10 = v.h.d(aVar.y0());
        boolean z10 = true;
        if (d10 != 0) {
            if (d10 != 2) {
                if (d10 != 5) {
                    if (d10 != 6) {
                        if (d10 != 7) {
                            if (d10 == 8) {
                                aVar.p0();
                                return null;
                            }
                            throw new IllegalStateException("Bad token: " + aVar.G(false));
                        }
                        return Boolean.valueOf(aVar.c0());
                    }
                    return Double.valueOf(aVar.e0());
                }
                return aVar.v0();
            }
            aVar.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.J()) {
                linkedHashMap.put(aVar.k0(), a(aVar));
            }
            if (aVar.y0() != 4) {
                z10 = false;
            }
            sc.b.B("Bad token: " + aVar.G(false), z10);
            aVar.m();
            return Collections.unmodifiableMap(linkedHashMap);
        }
        aVar.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.J()) {
            arrayList.add(a(aVar));
        }
        if (aVar.y0() != 2) {
            z10 = false;
        }
        sc.b.B("Bad token: " + aVar.G(false), z10);
        aVar.j();
        return Collections.unmodifiableList(arrayList);
    }
}
