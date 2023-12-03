package he;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: CompositeFilter.java */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f17499a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17500b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f17501c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lhe/l;>;Ljava/lang/Object;)V */
    public g(List list, int i6) {
        this.f17499a = new ArrayList(list);
        this.f17500b = i6;
    }

    @Override // he.l
    public final String a() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f17499a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z11 = true;
            if (it.hasNext()) {
                if (((l) it.next()) instanceof g) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if ((z10 && f()) ? false : false) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb2.append(((l) it2.next()).a());
            }
            return sb2.toString();
        }
        sb2.append(defpackage.e.d(this.f17500b).concat("("));
        sb2.append(TextUtils.join(",", arrayList));
        sb2.append(")");
        return sb2.toString();
    }

    @Override // he.l
    public final List<l> b() {
        return Collections.unmodifiableList(this.f17499a);
    }

    @Override // he.l
    public final ke.m c() {
        k kVar;
        d9.p pVar = new d9.p(22);
        Iterator<k> it = d().iterator();
        while (true) {
            if (it.hasNext()) {
                kVar = it.next();
                if (((Boolean) pVar.apply(kVar)).booleanValue()) {
                    break;
                }
            } else {
                kVar = null;
                break;
            }
        }
        if (kVar == null) {
            return null;
        }
        return kVar.f17539c;
    }

    @Override // he.l
    public final List<k> d() {
        ArrayList arrayList = this.f17501c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.f17501c = new ArrayList();
        Iterator it = this.f17499a.iterator();
        while (it.hasNext()) {
            this.f17501c.addAll(((l) it.next()).d());
        }
        return Collections.unmodifiableList(this.f17501c);
    }

    @Override // he.l
    public final boolean e(ke.g gVar) {
        boolean f = f();
        ArrayList arrayList = this.f17499a;
        if (f) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((l) it.next()).e(gVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((l) it2.next()).e(gVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f17500b == gVar.f17500b && this.f17499a.equals(gVar.f17499a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f17500b == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17499a.hashCode() + ((v.h.d(this.f17500b) + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
