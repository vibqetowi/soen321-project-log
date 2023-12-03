package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class sa extends i {

    /* renamed from: w  reason: collision with root package name */
    public final y4 f8602w;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap f8603x;

    public sa(y4 y4Var) {
        super("require");
        this.f8603x = new HashMap();
        this.f8602w = y4Var;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        o oVar;
        l3.h(1, "require", list);
        String g5 = cVar.i((o) list.get(0)).g();
        HashMap hashMap = this.f8603x;
        if (hashMap.containsKey(g5)) {
            return (o) hashMap.get(g5);
        }
        y4 y4Var = this.f8602w;
        if (y4Var.f8701a.containsKey(g5)) {
            try {
                oVar = (o) ((Callable) y4Var.f8701a.get(g5)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g5)));
            }
        } else {
            oVar = o.f8520d;
        }
        if (oVar instanceof i) {
            hashMap.put(g5, (i) oVar);
        }
        return oVar;
    }
}
