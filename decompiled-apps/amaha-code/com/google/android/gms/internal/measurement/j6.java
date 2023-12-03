package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class j6 extends l {

    /* renamed from: v  reason: collision with root package name */
    public final s1.s f8444v;

    public j6(s1.s sVar) {
        this.f8444v = sVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.l, com.google.android.gms.internal.measurement.o
    public final o s(String str, v.c cVar, ArrayList arrayList) {
        char c10;
        Object obj;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        s1.s sVar = this.f8444v;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return super.s(str, cVar, arrayList);
                            }
                            l3.h(2, "setParamValue", arrayList);
                            String g5 = cVar.i((o) arrayList.get(0)).g();
                            o i6 = cVar.i((o) arrayList.get(1));
                            Object f = l3.f(i6);
                            HashMap hashMap = ((b) sVar.f31225w).f8307c;
                            if (f == null) {
                                hashMap.remove(g5);
                            } else {
                                hashMap.put(g5, f);
                            }
                            return i6;
                        }
                        l3.h(1, "setEventName", arrayList);
                        o i10 = cVar.i((o) arrayList.get(0));
                        if (!o.f8520d.equals(i10) && !o.f8521e.equals(i10)) {
                            ((b) sVar.f31225w).f8305a = i10.g();
                            return new r(i10.g());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    l3.h(0, "getTimestamp", arrayList);
                    return new h(Double.valueOf(((b) sVar.f31225w).f8306b));
                }
                l3.h(0, "getParams", arrayList);
                HashMap hashMap2 = ((b) sVar.f31225w).f8307c;
                l lVar = new l();
                for (String str2 : hashMap2.keySet()) {
                    lVar.q(str2, g4.b(hashMap2.get(str2)));
                }
                return lVar;
            }
            l3.h(1, "getParamValue", arrayList);
            String g10 = cVar.i((o) arrayList.get(0)).g();
            HashMap hashMap3 = ((b) sVar.f31225w).f8307c;
            if (hashMap3.containsKey(g10)) {
                obj = hashMap3.get(g10);
            } else {
                obj = null;
            }
            return g4.b(obj);
        }
        l3.h(0, "getEventName", arrayList);
        return new r(((b) sVar.f31225w).f8305a);
    }
}
