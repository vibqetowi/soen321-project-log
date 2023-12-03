package pi;

import java.util.ArrayList;
import java.util.List;
import nd.z;
/* compiled from: InAppWidget.java */
/* loaded from: classes.dex */
public final class k extends vd.a {

    /* renamed from: c  reason: collision with root package name */
    public final int f28486c;

    /* renamed from: d  reason: collision with root package name */
    public final z f28487d;

    /* renamed from: e  reason: collision with root package name */
    public final List<bj.a> f28488e;

    public k(int i6, int i10, z zVar, ArrayList arrayList) {
        super(i6, 3);
        this.f28486c = i10;
        this.f28487d = zVar;
        this.f28488e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f28486c != kVar.f28486c || !this.f28487d.equals(kVar.f28487d)) {
            return false;
        }
        List<bj.a> list = kVar.f28488e;
        List<bj.a> list2 = this.f28488e;
        if (list2 != null) {
            return list2.equals(list);
        }
        if (list == null) {
            return true;
        }
        return false;
    }

    @Override // vd.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InAppWidget{viewType=");
        sb2.append(pl.a.k(this.f28486c));
        sb2.append(", component=");
        sb2.append(this.f28487d);
        sb2.append(", actions=");
        sb2.append(this.f28488e);
        sb2.append(", id=");
        return defpackage.c.s(sb2, this.f34976b, '}');
    }
}
