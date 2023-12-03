package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class r5 extends i {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f8578w = 3;

    /* renamed from: x  reason: collision with root package name */
    public final Object f8579x;

    public r5(ta taVar) {
        super("internal.registerCallback");
        this.f8579x = taVar;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        int i6;
        TreeMap treeMap;
        HashMap hashMap;
        s sVar = o.f8520d;
        int i10 = this.f8578w;
        String str = this.f8419u;
        Object obj = this.f8579x;
        switch (i10) {
            case 0:
                l3.h(3, str, list);
                String g5 = cVar.i((o) list.get(0)).g();
                long a10 = (long) l3.a(cVar.i((o) list.get(1)).f().doubleValue());
                o i11 = cVar.i((o) list.get(2));
                if (i11 instanceof l) {
                    hashMap = l3.g((l) i11);
                } else {
                    hashMap = new HashMap();
                }
                ((List) ((s1.s) obj).f31226x).add(new b(g5, a10, hashMap));
                return sVar;
            case 1:
                return sVar;
            case 2:
                try {
                    return g4.b(((Callable) obj).call());
                } catch (Exception unused) {
                    return sVar;
                }
            default:
                l3.h(3, str, list);
                cVar.i((o) list.get(0)).g();
                o i12 = cVar.i((o) list.get(1));
                if (i12 instanceof n) {
                    o i13 = cVar.i((o) list.get(2));
                    if (i13 instanceof l) {
                        l lVar = (l) i13;
                        if (lVar.m("type")) {
                            String g10 = lVar.r("type").g();
                            if (lVar.m("priority")) {
                                i6 = l3.b(lVar.r("priority").f().doubleValue());
                            } else {
                                i6 = 1000;
                            }
                            ta taVar = (ta) obj;
                            n nVar = (n) i12;
                            taVar.getClass();
                            if ("create".equals(g10)) {
                                treeMap = taVar.f8617b;
                            } else if ("edit".equals(g10)) {
                                treeMap = taVar.f8616a;
                            } else {
                                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(g10)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i6))) {
                                i6 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i6), nVar);
                            return sVar;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
        }
    }

    public r5(g.x xVar) {
        super("internal.logger");
        this.f8579x = xVar;
        HashMap hashMap = this.f8420v;
        hashMap.put("log", new ra(this, false, true));
        hashMap.put("silent", new y9(0));
        ((i) hashMap.get("silent")).q("log", new ra(this, true, true));
        hashMap.put("unmonitored", new y9(1));
        ((i) hashMap.get("unmonitored")).q("log", new ra(this, false, false));
    }

    public r5(s1.s sVar) {
        super("internal.eventLogger");
        this.f8579x = sVar;
    }

    public r5(ta.p3 p3Var) {
        super("internal.appMetadata");
        this.f8579x = p3Var;
    }
}
