package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class l3 {
    public static double a(double d10) {
        int i6;
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d10) && d10 != 0.0d && i6 != 0) {
            if (i6 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return Math.floor(Math.abs(d10)) * i10;
        }
        return d10;
    }

    public static int b(double d10) {
        int i6;
        int i10;
        if (!Double.isNaN(d10) && !Double.isInfinite(d10) && d10 != 0.0d) {
            if (i6 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return (int) ((Math.floor(Math.abs(d10)) * i10) % 4.294967296E9d);
        }
        return 0;
    }

    public static void c(v.c cVar) {
        int b10 = b(cVar.m("runtime.counter").f().doubleValue() + 1.0d);
        if (b10 <= 1000000) {
            cVar.r("runtime.counter", new h(Double.valueOf(b10)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d10) {
        return b(d10) & 4294967295L;
    }

    public static x e(String str) {
        x xVar;
        if (str != null && !str.isEmpty()) {
            xVar = (x) x.F0.get(Integer.valueOf(Integer.parseInt(str)));
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(o oVar) {
        boolean z10;
        if (o.f8521e.equals(oVar)) {
            return null;
        }
        if (o.f8520d.equals(oVar)) {
            return "";
        }
        if (oVar instanceof l) {
            return g((l) oVar);
        }
        if (oVar instanceof e) {
            ArrayList arrayList = new ArrayList();
            e eVar = (e) oVar;
            eVar.getClass();
            int i6 = 0;
            while (true) {
                if (i6 < eVar.t()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i6 < eVar.t()) {
                        int i10 = i6 + 1;
                        Object f = f(eVar.v(i6));
                        if (f != null) {
                            arrayList.add(f);
                        }
                        i6 = i10;
                    } else {
                        throw new NoSuchElementException(defpackage.c.p("Out of bounds index: ", i6));
                    }
                } else {
                    return arrayList;
                }
            }
        } else if (!oVar.f().isNaN()) {
            return oVar.f();
        } else {
            return oVar.g();
        }
    }

    public static HashMap g(l lVar) {
        HashMap hashMap = new HashMap();
        lVar.getClass();
        Iterator it = new ArrayList(lVar.f8452u.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object f = f(lVar.r(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    public static void h(int i6, String str, List list) {
        if (list.size() == i6) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i6), Integer.valueOf(list.size())));
    }

    public static void i(int i6, String str, List list) {
        if (list.size() >= i6) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i6), Integer.valueOf(list.size())));
    }

    public static void j(int i6, String str, ArrayList arrayList) {
        if (arrayList.size() <= i6) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i6), Integer.valueOf(arrayList.size())));
    }

    public static boolean k(o oVar) {
        if (oVar == null) {
            return false;
        }
        Double f = oVar.f();
        if (f.isNaN() || f.doubleValue() < 0.0d || !f.equals(Double.valueOf(Math.floor(f.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean l(o oVar, o oVar2) {
        if (!oVar.getClass().equals(oVar2.getClass())) {
            return false;
        }
        if ((oVar instanceof s) || (oVar instanceof m)) {
            return true;
        }
        if (oVar instanceof h) {
            if (Double.isNaN(oVar.f().doubleValue()) || Double.isNaN(oVar2.f().doubleValue())) {
                return false;
            }
            return oVar.f().equals(oVar2.f());
        } else if (oVar instanceof r) {
            return oVar.g().equals(oVar2.g());
        } else {
            if (oVar instanceof f) {
                return oVar.i().equals(oVar2.i());
            }
            if (oVar != oVar2) {
                return false;
            }
            return true;
        }
    }
}
