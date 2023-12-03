package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class g4 {
    public static o a(j3 j3Var) {
        if (j3Var == null) {
            return o.f8520d;
        }
        int D = j3Var.D() - 1;
        if (D != 1) {
            if (D != 2) {
                if (D != 3) {
                    if (D == 4) {
                        b6<j3> y10 = j3Var.y();
                        ArrayList arrayList = new ArrayList();
                        for (j3 j3Var2 : y10) {
                            arrayList.add(a(j3Var2));
                        }
                        return new p(j3Var.w(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (j3Var.A()) {
                    return new f(Boolean.valueOf(j3Var.z()));
                } else {
                    return new f(null);
                }
            } else if (j3Var.B()) {
                return new h(Double.valueOf(j3Var.u()));
            } else {
                return new h(null);
            }
        } else if (j3Var.C()) {
            return new r(j3Var.x());
        } else {
            return o.f8526k;
        }
    }

    public static o b(Object obj) {
        if (obj == null) {
            return o.f8521e;
        }
        if (obj instanceof String) {
            return new r((String) obj);
        }
        if (obj instanceof Double) {
            return new h((Double) obj);
        }
        if (obj instanceof Long) {
            return new h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new f((Boolean) obj);
        }
        if (obj instanceof Map) {
            l lVar = new l();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                o b10 = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    lVar.q((String) obj2, b10);
                }
            }
            return lVar;
        } else if (obj instanceof List) {
            e eVar = new e();
            for (Object obj3 : (List) obj) {
                eVar.K(eVar.t(), b(obj3));
            }
            return eVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
