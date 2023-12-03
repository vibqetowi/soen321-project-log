package y;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public final p f38156d;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f38158g;

    /* renamed from: a  reason: collision with root package name */
    public p f38153a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38154b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38155c = false;

    /* renamed from: e  reason: collision with root package name */
    public int f38157e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f38159h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f38160i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f38161j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f38162k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f38163l = new ArrayList();

    public f(p pVar) {
        this.f38156d = pVar;
    }

    @Override // y.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f38163l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f38161j) {
                return;
            }
        }
        this.f38155c = true;
        p pVar = this.f38153a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f38154b) {
            this.f38156d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i6 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f38161j) {
            g gVar = this.f38160i;
            if (gVar != null) {
                if (gVar.f38161j) {
                    this.f = this.f38159h * gVar.f38158g;
                } else {
                    return;
                }
            }
            d(fVar.f38158g + this.f);
        }
        p pVar2 = this.f38153a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f38162k.add(dVar);
        if (this.f38161j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f38163l.clear();
        this.f38162k.clear();
        this.f38161j = false;
        this.f38158g = 0;
        this.f38155c = false;
        this.f38154b = false;
    }

    public void d(int i6) {
        if (this.f38161j) {
            return;
        }
        this.f38161j = true;
        this.f38158g = i6;
        Iterator it = this.f38162k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38156d.f38177b.f37380l0);
        sb2.append(":");
        sb2.append(ri.e.l(this.f38157e));
        sb2.append("(");
        if (this.f38161j) {
            obj = Integer.valueOf(this.f38158g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f38163l.size());
        sb2.append(":d=");
        sb2.append(this.f38162k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
