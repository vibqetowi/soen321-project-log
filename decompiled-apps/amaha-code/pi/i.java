package pi;

import java.util.ArrayList;
/* compiled from: InAppContainer.java */
/* loaded from: classes.dex */
public final class i extends vd.a {

    /* renamed from: c  reason: collision with root package name */
    public final ui.e f28480c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28481d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28482e;
    public final ArrayList<q> f;

    /* JADX WARN: Incorrect types in method signature: (ILui/e;Ljava/lang/Object;ZLjava/util/ArrayList<Lpi/q;>;)V */
    public i(int i6, ui.e eVar, int i10, boolean z10, ArrayList arrayList) {
        super(i6, 3);
        this.f28480c = eVar;
        this.f28481d = i10;
        this.f28482e = z10;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f28482e != iVar.f28482e || !this.f28480c.equals(iVar.f28480c) || this.f28481d != iVar.f28481d) {
            return false;
        }
        return this.f.equals(iVar.f);
    }

    @Override // vd.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{\"InAppContainer\":{\"style\":");
        sb2.append(this.f28480c);
        sb2.append(", \"orientation\":\"");
        sb2.append(defpackage.d.y(this.f28481d));
        sb2.append("\", \"isPrimaryContainer\":");
        sb2.append(this.f28482e);
        sb2.append(", \"widgets\":");
        sb2.append(this.f);
        sb2.append(", \"id\":");
        return pl.a.g(sb2, this.f34976b, "}}");
    }
}
