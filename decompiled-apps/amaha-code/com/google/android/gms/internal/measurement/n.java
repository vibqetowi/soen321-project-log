package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f8479w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f8480x;

    /* renamed from: y  reason: collision with root package name */
    public final v.c f8481y;

    public n(n nVar) {
        super(nVar.f8419u);
        ArrayList arrayList = new ArrayList(nVar.f8479w.size());
        this.f8479w = arrayList;
        arrayList.addAll(nVar.f8479w);
        ArrayList arrayList2 = new ArrayList(nVar.f8480x.size());
        this.f8480x = arrayList2;
        arrayList2.addAll(nVar.f8480x);
        this.f8481y = nVar.f8481y;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o a(v.c cVar, List list) {
        s sVar;
        v.c h10 = this.f8481y.h();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f8479w;
            int size = arrayList.size();
            sVar = o.f8520d;
            if (i6 >= size) {
                break;
            }
            if (i6 < list.size()) {
                h10.o((String) arrayList.get(i6), cVar.i((o) list.get(i6)));
            } else {
                h10.o((String) arrayList.get(i6), sVar);
            }
            i6++;
        }
        Iterator it = this.f8480x.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            o i10 = h10.i(oVar);
            if (i10 instanceof p) {
                i10 = h10.i(oVar);
            }
            if (i10 instanceof g) {
                return ((g) i10).f8387u;
            }
        }
        return sVar;
    }

    @Override // com.google.android.gms.internal.measurement.i, com.google.android.gms.internal.measurement.o
    public final o e() {
        return new n(this);
    }

    public n(String str, ArrayList arrayList, List list, v.c cVar) {
        super(str);
        this.f8479w = new ArrayList();
        this.f8481y = cVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f8479w.add(((o) it.next()).g());
            }
        }
        this.f8480x = new ArrayList(list);
    }
}
