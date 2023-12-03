package h2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o0;
import h2.k;
import java.util.ArrayList;
/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public class f extends o0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class b extends k.c {
    }

    @Override // androidx.fragment.app.o0
    public final void a(View view, Object obj) {
        ((k) obj).b(view);
    }

    @Override // androidx.fragment.app.o0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z10;
        k kVar;
        k kVar2 = (k) obj;
        if (kVar2 == null) {
            return;
        }
        int i6 = 0;
        if (kVar2 instanceof p) {
            p pVar = (p) kVar2;
            int size = pVar.R.size();
            while (i6 < size) {
                if (i6 >= 0 && i6 < pVar.R.size()) {
                    kVar = pVar.R.get(i6);
                } else {
                    kVar = null;
                }
                b(kVar, arrayList);
                i6++;
            }
            return;
        }
        if (o0.h(kVar2.f17046y) && o0.h(null) && o0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && o0.h(kVar2.f17047z)) {
            int size2 = arrayList.size();
            while (i6 < size2) {
                kVar2.b(arrayList.get(i6));
                i6++;
            }
        }
    }

    @Override // androidx.fragment.app.o0
    public final void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.o0
    public final boolean e(Object obj) {
        return obj instanceof k;
    }

    @Override // androidx.fragment.app.o0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o0
    public final Object i(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        k kVar3 = (k) obj3;
        if (kVar != null && kVar2 != null) {
            p pVar = new p();
            pVar.L(kVar);
            pVar.L(kVar2);
            pVar.P(1);
            kVar = pVar;
        } else if (kVar == null) {
            if (kVar2 != null) {
                kVar = kVar2;
            } else {
                kVar = null;
            }
        }
        if (kVar3 != null) {
            p pVar2 = new p();
            if (kVar != null) {
                pVar2.L(kVar);
            }
            pVar2.L(kVar3);
            return pVar2;
        }
        return kVar;
    }

    @Override // androidx.fragment.app.o0
    public final Object j(Object obj, Object obj2) {
        p pVar = new p();
        if (obj != null) {
            pVar.L((k) obj);
        }
        pVar.L((k) obj2);
        return pVar;
    }

    @Override // androidx.fragment.app.o0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((k) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.o0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((k) obj).a(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o0
    public final void m(View view, Object obj) {
        if (view != null) {
            o0.g(view, new Rect());
            ((k) obj).D(new e());
        }
    }

    @Override // androidx.fragment.app.o0
    public final void n(Object obj, Rect rect) {
        ((k) obj).D(new b());
    }

    @Override // androidx.fragment.app.o0
    public final void o(Object obj, o0.d dVar, androidx.fragment.app.l lVar) {
        k kVar = (k) obj;
        dVar.b(new h(kVar));
        kVar.a(new i(lVar));
    }

    @Override // androidx.fragment.app.o0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.f17047z;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            o0.d(arrayList.get(i6), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.o0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            ArrayList<View> arrayList3 = pVar.f17047z;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.o0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.L((k) obj);
        return pVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z10;
        int size;
        k kVar;
        k kVar2 = (k) obj;
        int i6 = 0;
        if (kVar2 instanceof p) {
            p pVar = (p) kVar2;
            int size2 = pVar.R.size();
            while (i6 < size2) {
                if (i6 >= 0 && i6 < pVar.R.size()) {
                    kVar = pVar.R.get(i6);
                } else {
                    kVar = null;
                }
                s(kVar, arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (o0.h(kVar2.f17046y) && o0.h(null) && o0.h(null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList<View> arrayList3 = kVar2.f17047z;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i6 < size) {
                    kVar2.b(arrayList2.get(i6));
                    i6++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        kVar2.z(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17032a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f17033b;

        public a(View view, ArrayList arrayList) {
            this.f17032a = view;
            this.f17033b = arrayList;
        }

        @Override // h2.k.d
        public final void a(k kVar) {
            kVar.y(this);
            kVar.a(this);
        }

        @Override // h2.k.d
        public final void c(k kVar) {
            kVar.y(this);
            this.f17032a.setVisibility(8);
            ArrayList arrayList = this.f17033b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((View) arrayList.get(i6)).setVisibility(0);
            }
        }

        @Override // h2.k.d
        public final void b() {
        }

        @Override // h2.k.d
        public final void d() {
        }

        @Override // h2.k.d
        public final void e() {
        }
    }
}
