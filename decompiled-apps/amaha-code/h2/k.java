package h2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class k implements Cloneable {
    public static final int[] O = {2, 1, 3, 4};
    public static final a P = new a();
    public static final ThreadLocal<t.b<Animator, b>> Q = new ThreadLocal<>();
    public ArrayList<r> E;
    public ArrayList<r> F;
    public c M;

    /* renamed from: u  reason: collision with root package name */
    public final String f17042u = getClass().getName();

    /* renamed from: v  reason: collision with root package name */
    public long f17043v = -1;

    /* renamed from: w  reason: collision with root package name */
    public long f17044w = -1;

    /* renamed from: x  reason: collision with root package name */
    public TimeInterpolator f17045x = null;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Integer> f17046y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<View> f17047z = new ArrayList<>();
    public v.c A = new v.c(2);
    public v.c B = new v.c(2);
    public p C = null;
    public final int[] D = O;
    public final ArrayList<Animator> G = new ArrayList<>();
    public int H = 0;
    public boolean I = false;
    public boolean J = false;
    public ArrayList<d> K = null;
    public ArrayList<Animator> L = new ArrayList<>();
    public com.android.volley.toolbox.a N = P;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class a extends com.android.volley.toolbox.a {
        @Override // com.android.volley.toolbox.a
        public final Path h(float f, float f2, float f10, float f11) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f17048a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17049b;

        /* renamed from: c  reason: collision with root package name */
        public final r f17050c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f17051d;

        /* renamed from: e  reason: collision with root package name */
        public final k f17052e;

        public b(View view, String str, k kVar, b0 b0Var, r rVar) {
            this.f17048a = view;
            this.f17049b = str;
            this.f17050c = rVar;
            this.f17051d = b0Var;
            this.f17052e = kVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(k kVar);

        void b();

        void c(k kVar);

        void d();

        void e();
    }

    public static void c(v.c cVar, View view, r rVar) {
        ((t.b) cVar.f34631v).put(view, rVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) cVar.f34632w).indexOfKey(id2) >= 0) {
                ((SparseArray) cVar.f34632w).put(id2, null);
            } else {
                ((SparseArray) cVar.f34632w).put(id2, view);
            }
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        String k10 = d0.i.k(view);
        if (k10 != null) {
            if (((t.b) cVar.f34634y).containsKey(k10)) {
                ((t.b) cVar.f34634y).put(k10, null);
            } else {
                ((t.b) cVar.f34634y).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                t.e eVar = (t.e) cVar.f34633x;
                if (eVar.f32231u) {
                    eVar.d();
                }
                if (tr.r.k(eVar.f32232v, eVar.f32234x, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((t.e) cVar.f34633x).e(itemIdAtPosition, null);
                    if (view2 != null) {
                        d0.d.r(view2, false);
                        ((t.e) cVar.f34633x).h(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                d0.d.r(view, true);
                ((t.e) cVar.f34633x).h(itemIdAtPosition, view);
            }
        }
    }

    public static t.b<Animator, b> q() {
        ThreadLocal<t.b<Animator, b>> threadLocal = Q;
        t.b<Animator, b> bVar = threadLocal.get();
        if (bVar == null) {
            t.b<Animator, b> bVar2 = new t.b<>();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean w(r rVar, r rVar2, String str) {
        Object obj = rVar.f17068a.get(str);
        Object obj2 = rVar2.f17068a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public void A(ViewGroup viewGroup) {
        if (this.I) {
            if (!this.J) {
                ArrayList<Animator> arrayList = this.G;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size).resume();
                }
                ArrayList<d> arrayList2 = this.K;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.K.clone();
                    int size2 = arrayList3.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((d) arrayList3.get(i6)).e();
                    }
                }
            }
            this.I = false;
        }
    }

    public void B() {
        J();
        t.b<Animator, b> q10 = q();
        Iterator<Animator> it = this.L.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q10.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new l(this, q10));
                    long j10 = this.f17044w;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f17043v;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f17045x;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new m(this));
                    next.start();
                }
            }
        }
        this.L.clear();
        n();
    }

    public void C(long j10) {
        this.f17044w = j10;
    }

    public void D(c cVar) {
        this.M = cVar;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.f17045x = timeInterpolator;
    }

    public void F(com.android.volley.toolbox.a aVar) {
        if (aVar == null) {
            this.N = P;
        } else {
            this.N = aVar;
        }
    }

    public void H(long j10) {
        this.f17043v = j10;
    }

    public final void J() {
        if (this.H == 0) {
            ArrayList<d> arrayList = this.K;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.K.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((d) arrayList2.get(i6)).a(this);
                }
            }
            this.J = false;
        }
        this.H++;
    }

    public String K(String str) {
        StringBuilder c10 = v.h.c(str);
        c10.append(getClass().getSimpleName());
        c10.append("@");
        c10.append(Integer.toHexString(hashCode()));
        c10.append(": ");
        String sb2 = c10.toString();
        if (this.f17044w != -1) {
            StringBuilder d10 = v.g.d(sb2, "dur(");
            d10.append(this.f17044w);
            d10.append(") ");
            sb2 = d10.toString();
        }
        if (this.f17043v != -1) {
            StringBuilder d11 = v.g.d(sb2, "dly(");
            d11.append(this.f17043v);
            d11.append(") ");
            sb2 = d11.toString();
        }
        if (this.f17045x != null) {
            StringBuilder d12 = v.g.d(sb2, "interp(");
            d12.append(this.f17045x);
            d12.append(") ");
            sb2 = d12.toString();
        }
        ArrayList<Integer> arrayList = this.f17046y;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17047z;
        if (size > 0 || arrayList2.size() > 0) {
            String f = pl.a.f(sb2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (i6 > 0) {
                        f = pl.a.f(f, ", ");
                    }
                    StringBuilder c11 = v.h.c(f);
                    c11.append(arrayList.get(i6));
                    f = c11.toString();
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        f = pl.a.f(f, ", ");
                    }
                    StringBuilder c12 = v.h.c(f);
                    c12.append(arrayList2.get(i10));
                    f = c12.toString();
                }
            }
            return pl.a.f(f, ")");
        }
        return sb2;
    }

    public void a(d dVar) {
        if (this.K == null) {
            this.K = new ArrayList<>();
        }
        this.K.add(dVar);
    }

    public void b(View view) {
        this.f17047z.add(view);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.G;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<d> arrayList2 = this.K;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.K.clone();
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((d) arrayList3.get(i6)).d();
            }
        }
    }

    public abstract void d(r rVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            r rVar = new r(view);
            if (z10) {
                h(rVar);
            } else {
                d(rVar);
            }
            rVar.f17070c.add(this);
            f(rVar);
            if (z10) {
                c(this.A, view, rVar);
            } else {
                c(this.B, view, rVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                e(viewGroup.getChildAt(i6), z10);
            }
        }
    }

    public abstract void h(r rVar);

    public final void i(ViewGroup viewGroup, boolean z10) {
        j(z10);
        ArrayList<Integer> arrayList = this.f17046y;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17047z;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i6).intValue());
            if (findViewById != null) {
                r rVar = new r(findViewById);
                if (z10) {
                    h(rVar);
                } else {
                    d(rVar);
                }
                rVar.f17070c.add(this);
                f(rVar);
                if (z10) {
                    c(this.A, findViewById, rVar);
                } else {
                    c(this.B, findViewById, rVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = arrayList2.get(i10);
            r rVar2 = new r(view);
            if (z10) {
                h(rVar2);
            } else {
                d(rVar2);
            }
            rVar2.f17070c.add(this);
            f(rVar2);
            if (z10) {
                c(this.A, view, rVar2);
            } else {
                c(this.B, view, rVar2);
            }
        }
    }

    public final void j(boolean z10) {
        if (z10) {
            ((t.b) this.A.f34631v).clear();
            ((SparseArray) this.A.f34632w).clear();
            ((t.e) this.A.f34633x).b();
            return;
        }
        ((t.b) this.B.f34631v).clear();
        ((SparseArray) this.B.f34632w).clear();
        ((t.e) this.B.f34633x).b();
    }

    @Override // 
    /* renamed from: k */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.L = new ArrayList<>();
            kVar.A = new v.c(2);
            kVar.B = new v.c(2);
            kVar.E = null;
            kVar.F = null;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, v.c cVar, v.c cVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        boolean z10;
        Animator l2;
        View view;
        Animator animator;
        r rVar;
        Animator animator2;
        r rVar2;
        ViewGroup viewGroup2 = viewGroup;
        t.b<Animator, b> q10 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            r rVar3 = arrayList.get(i6);
            r rVar4 = arrayList2.get(i6);
            if (rVar3 != null && !rVar3.f17070c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f17070c.contains(this)) {
                rVar4 = null;
            }
            if (rVar3 != null || rVar4 != null) {
                if (rVar3 != null && rVar4 != null && !u(rVar3, rVar4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && (l2 = l(viewGroup2, rVar3, rVar4)) != null) {
                    if (rVar4 != null) {
                        String[] r = r();
                        view = rVar4.f17069b;
                        if (r != null && r.length > 0) {
                            rVar2 = new r(view);
                            r rVar5 = (r) ((t.b) cVar2.f34631v).getOrDefault(view, null);
                            if (rVar5 != null) {
                                int i10 = 0;
                                while (i10 < r.length) {
                                    HashMap hashMap = rVar2.f17068a;
                                    Animator animator3 = l2;
                                    String str = r[i10];
                                    hashMap.put(str, rVar5.f17068a.get(str));
                                    i10++;
                                    l2 = animator3;
                                    r = r;
                                }
                            }
                            Animator animator4 = l2;
                            int i11 = q10.f32260w;
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    b orDefault = q10.getOrDefault(q10.i(i12), null);
                                    if (orDefault.f17050c != null && orDefault.f17048a == view && orDefault.f17049b.equals(this.f17042u) && orDefault.f17050c.equals(rVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i12++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = l2;
                            rVar2 = null;
                        }
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        view = rVar3.f17069b;
                        animator = l2;
                        rVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f17042u;
                        v vVar = t.f17072a;
                        q10.put(animator, new b(view, str2, this, new b0(viewGroup2), rVar));
                        this.L.add(animator);
                    }
                    i6++;
                    viewGroup2 = viewGroup;
                }
            }
            i6++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator5 = this.L.get(sparseIntArray.keyAt(i13));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i13) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i6 = this.H - 1;
        this.H = i6;
        if (i6 == 0) {
            ArrayList<d> arrayList = this.K;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.K.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).c(this);
                }
            }
            for (int i11 = 0; i11 < ((t.e) this.A.f34633x).j(); i11++) {
                View view = (View) ((t.e) this.A.f34633x).k(i11);
                if (view != null) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.r(view, false);
                }
            }
            for (int i12 = 0; i12 < ((t.e) this.B.f34633x).j(); i12++) {
                View view2 = (View) ((t.e) this.B.f34633x).k(i12);
                if (view2 != null) {
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    d0.d.r(view2, false);
                }
            }
            this.J = true;
        }
    }

    public final r p(View view, boolean z10) {
        ArrayList<r> arrayList;
        ArrayList<r> arrayList2;
        p pVar = this.C;
        if (pVar != null) {
            return pVar.p(view, z10);
        }
        if (z10) {
            arrayList = this.E;
        } else {
            arrayList = this.F;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                r rVar = arrayList.get(i6);
                if (rVar == null) {
                    return null;
                }
                if (rVar.f17069b == view) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.F;
        } else {
            arrayList2 = this.E;
        }
        return arrayList2.get(i6);
    }

    public String[] r() {
        return null;
    }

    public final r t(View view, boolean z10) {
        v.c cVar;
        p pVar = this.C;
        if (pVar != null) {
            return pVar.t(view, z10);
        }
        if (z10) {
            cVar = this.A;
        } else {
            cVar = this.B;
        }
        return (r) ((t.b) cVar.f34631v).getOrDefault(view, null);
    }

    public final String toString() {
        return K("");
    }

    public boolean u(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] r = r();
        if (r != null) {
            for (String str : r) {
                if (!w(rVar, rVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : rVar.f17068a.keySet()) {
            if (w(rVar, rVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final boolean v(View view) {
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f17046y;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f17047z;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public void x(View view) {
        if (!this.J) {
            ArrayList<Animator> arrayList = this.G;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).pause();
            }
            ArrayList<d> arrayList2 = this.K;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.K.clone();
                int size2 = arrayList3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((d) arrayList3.get(i6)).b();
                }
            }
            this.I = true;
        }
    }

    public void y(d dVar) {
        ArrayList<d> arrayList = this.K;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.K.size() == 0) {
            this.K = null;
        }
    }

    public void z(View view) {
        this.f17047z.remove(view);
    }

    public void G() {
    }

    public void f(r rVar) {
    }
}
