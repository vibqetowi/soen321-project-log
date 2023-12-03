package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class ra extends i {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f8587w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f8588x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ r5 f8589y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(r5 r5Var, boolean z10, boolean z11) {
        super("log");
        this.f8589y = r5Var;
        this.f8587w = z10;
        this.f8588x = z11;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        int i6;
        l3.i(1, "log", list);
        int size = list.size();
        s sVar = o.f8520d;
        r5 r5Var = this.f8589y;
        if (size == 1) {
            ((g.x) r5Var.f8579x).A(3, cVar.i((o) list.get(0)).g(), Collections.emptyList(), this.f8587w, this.f8588x);
            return sVar;
        }
        int b10 = l3.b(cVar.i((o) list.get(0)).f().doubleValue());
        if (b10 != 2) {
            if (b10 != 3) {
                if (b10 != 5) {
                    if (b10 != 6) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 5;
                }
            } else {
                i6 = 1;
            }
        } else {
            i6 = 4;
        }
        String g5 = cVar.i((o) list.get(1)).g();
        if (list.size() == 2) {
            ((g.x) r5Var.f8579x).A(i6, g5, Collections.emptyList(), this.f8587w, this.f8588x);
            return sVar;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
            arrayList.add(cVar.i((o) list.get(i10)).g());
        }
        ((g.x) r5Var.f8579x).A(i6, g5, arrayList, this.f8587w, this.f8588x);
        return sVar;
    }
}
