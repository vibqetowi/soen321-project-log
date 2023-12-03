package y;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class o {
    public static int f;

    /* renamed from: b  reason: collision with root package name */
    public final int f38172b;

    /* renamed from: c  reason: collision with root package name */
    public int f38173c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x.e> f38171a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f38174d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f38175e = -1;

    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(x.e eVar, v.d dVar) {
            new WeakReference(eVar);
            x.d dVar2 = eVar.K;
            dVar.getClass();
            v.d.n(dVar2);
            v.d.n(eVar.L);
            v.d.n(eVar.M);
            v.d.n(eVar.N);
            v.d.n(eVar.O);
        }
    }

    public o(int i6) {
        this.f38172b = -1;
        int i10 = f;
        f = i10 + 1;
        this.f38172b = i10;
        this.f38173c = i6;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f38171a.size();
        if (this.f38175e != -1 && size > 0) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                o oVar = arrayList.get(i6);
                if (this.f38175e == oVar.f38172b) {
                    c(this.f38173c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(v.d dVar, int i6) {
        int n10;
        int n11;
        ArrayList<x.e> arrayList = this.f38171a;
        if (arrayList.size() == 0) {
            return 0;
        }
        x.f fVar = (x.f) arrayList.get(0).W;
        dVar.t();
        fVar.e(dVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).e(dVar, false);
        }
        if (i6 == 0 && fVar.F0 > 0) {
            x.b.a(fVar, dVar, arrayList, 0);
        }
        if (i6 == 1 && fVar.G0 > 0) {
            x.b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f38174d = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f38174d.add(new a(arrayList.get(i11), dVar));
        }
        if (i6 == 0) {
            n10 = v.d.n(fVar.K);
            n11 = v.d.n(fVar.M);
            dVar.t();
        } else {
            n10 = v.d.n(fVar.L);
            n11 = v.d.n(fVar.N);
            dVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i6, o oVar) {
        Iterator<x.e> it = this.f38171a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i10 = oVar.f38172b;
            if (hasNext) {
                x.e next = it.next();
                ArrayList<x.e> arrayList = oVar.f38171a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i6 == 0) {
                    next.f37397u0 = i10;
                } else {
                    next.f37399v0 = i10;
                }
            } else {
                this.f38175e = i10;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i6 = this.f38173c;
        if (i6 == 0) {
            str = "Horizontal";
        } else if (i6 == 1) {
            str = "Vertical";
        } else if (i6 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String g5 = pl.a.g(sb2, this.f38172b, "] <");
        Iterator<x.e> it = this.f38171a.iterator();
        while (it.hasNext()) {
            StringBuilder d10 = v.g.d(g5, " ");
            d10.append(it.next().f37380l0);
            g5 = d10.toString();
        }
        return pl.a.f(g5, " >");
    }
}
