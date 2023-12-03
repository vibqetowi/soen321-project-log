package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class c extends b0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f2885s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2886h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2887i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<e> f2888j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<d> f2889k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.c0>> f2890l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f2891m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f2892n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2893o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2894p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.c0> f2895q = new ArrayList<>();
    public final ArrayList<RecyclerView.c0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2896u;

        public a(ArrayList arrayList) {
            this.f2896u = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f2896u;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c cVar = c.this;
                if (hasNext) {
                    e eVar = (e) it.next();
                    RecyclerView.c0 c0Var = eVar.f2907a;
                    cVar.getClass();
                    View view = c0Var.f2751a;
                    int i6 = eVar.f2910d - eVar.f2908b;
                    int i10 = eVar.f2911e - eVar.f2909c;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i10 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    cVar.f2894p.add(c0Var);
                    animate.setDuration(cVar.f2776e).setListener(new f(cVar, c0Var, i6, view, i10, animate)).start();
                } else {
                    arrayList.clear();
                    cVar.f2891m.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2898u;

        public b(ArrayList arrayList) {
            this.f2898u = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            ArrayList arrayList = this.f2898u;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c cVar = c.this;
                if (hasNext) {
                    d dVar = (d) it.next();
                    cVar.getClass();
                    RecyclerView.c0 c0Var = dVar.f2902a;
                    View view2 = null;
                    if (c0Var == null) {
                        view = null;
                    } else {
                        view = c0Var.f2751a;
                    }
                    RecyclerView.c0 c0Var2 = dVar.f2903b;
                    if (c0Var2 != null) {
                        view2 = c0Var2.f2751a;
                    }
                    ArrayList<RecyclerView.c0> arrayList2 = cVar.r;
                    long j10 = cVar.f;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j10);
                        arrayList2.add(dVar.f2902a);
                        duration.translationX(dVar.f2906e - dVar.f2904c);
                        duration.translationY(dVar.f - dVar.f2905d);
                        duration.alpha(0.0f).setListener(new g(cVar, dVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(dVar.f2903b);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(j10).alpha(1.0f).setListener(new h(cVar, dVar, animate, view2)).start();
                    }
                } else {
                    arrayList.clear();
                    cVar.f2892n.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0039c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2900u;

        public RunnableC0039c(ArrayList arrayList) {
            this.f2900u = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f2900u;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c cVar = c.this;
                if (hasNext) {
                    RecyclerView.c0 c0Var = (RecyclerView.c0) it.next();
                    cVar.getClass();
                    View view = c0Var.f2751a;
                    ViewPropertyAnimator animate = view.animate();
                    cVar.f2893o.add(c0Var);
                    animate.alpha(1.0f).setDuration(cVar.f2774c).setListener(new androidx.recyclerview.widget.e(view, animate, cVar, c0Var)).start();
                } else {
                    arrayList.clear();
                    cVar.f2890l.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.c0 f2902a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.c0 f2903b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2904c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2905d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2906e;
        public final int f;

        public d(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i6, int i10, int i11, int i12) {
            this.f2902a = c0Var;
            this.f2903b = c0Var2;
            this.f2904c = i6;
            this.f2905d = i10;
            this.f2906e = i11;
            this.f = i12;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f2902a);
            sb2.append(", newHolder=");
            sb2.append(this.f2903b);
            sb2.append(", fromX=");
            sb2.append(this.f2904c);
            sb2.append(", fromY=");
            sb2.append(this.f2905d);
            sb2.append(", toX=");
            sb2.append(this.f2906e);
            sb2.append(", toY=");
            return defpackage.c.s(sb2, this.f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.c0 f2907a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2908b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2909c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2910d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2911e;

        public e(RecyclerView.c0 c0Var, int i6, int i10, int i11, int i12) {
            this.f2907a = c0Var;
            this.f2908b = i6;
            this.f2909c = i10;
            this.f2910d = i11;
            this.f2911e = i12;
        }
    }

    public static void n(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.c0) arrayList.get(size)).f2751a.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f(RecyclerView.c0 c0Var, List<Object> list) {
        if (list.isEmpty() && !m(c0Var)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void h(RecyclerView.c0 c0Var) {
        View view = c0Var.f2751a;
        view.animate().cancel();
        ArrayList<e> arrayList = this.f2888j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f2907a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                g(c0Var);
                arrayList.remove(size);
            }
        }
        p(c0Var, this.f2889k);
        if (this.f2886h.remove(c0Var)) {
            view.setAlpha(1.0f);
            g(c0Var);
        }
        if (this.f2887i.remove(c0Var)) {
            view.setAlpha(1.0f);
            g(c0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f2892n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            p(c0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f2891m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).f2907a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    g(c0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.c0>> arrayList6 = this.f2890l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.c0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(c0Var)) {
                    view.setAlpha(1.0f);
                    g(c0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f2895q.remove(c0Var);
                this.f2893o.remove(c0Var);
                this.r.remove(c0Var);
                this.f2894p.remove(c0Var);
                o();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void i() {
        ArrayList<e> arrayList = this.f2888j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f2907a.f2751a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            g(eVar.f2907a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.c0> arrayList2 = this.f2886h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            g(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.c0> arrayList3 = this.f2887i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = arrayList3.get(size3);
            c0Var.f2751a.setAlpha(1.0f);
            g(c0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f2889k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.c0 c0Var2 = dVar.f2902a;
            if (c0Var2 != null) {
                q(dVar, c0Var2);
            }
            RecyclerView.c0 c0Var3 = dVar.f2903b;
            if (c0Var3 != null) {
                q(dVar, c0Var3);
            }
        }
        arrayList4.clear();
        if (!j()) {
            return;
        }
        ArrayList<ArrayList<e>> arrayList5 = this.f2891m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.f2907a.f2751a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    g(eVar2.f2907a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.c0>> arrayList7 = this.f2890l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.c0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.c0 c0Var4 = arrayList8.get(size8);
                    c0Var4.f2751a.setAlpha(1.0f);
                    g(c0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<d>> arrayList9 = this.f2892n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList<d> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.c0 c0Var5 = dVar2.f2902a;
                    if (c0Var5 != null) {
                        q(dVar2, c0Var5);
                    }
                    RecyclerView.c0 c0Var6 = dVar2.f2903b;
                    if (c0Var6 != null) {
                        q(dVar2, c0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        n(this.f2895q);
        n(this.f2894p);
        n(this.f2893o);
        n(this.r);
        ArrayList<RecyclerView.j.a> arrayList11 = this.f2773b;
        int size11 = arrayList11.size();
        for (int i6 = 0; i6 < size11; i6++) {
            arrayList11.get(i6).a();
        }
        arrayList11.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean j() {
        if (this.f2887i.isEmpty() && this.f2889k.isEmpty() && this.f2888j.isEmpty() && this.f2886h.isEmpty() && this.f2894p.isEmpty() && this.f2895q.isEmpty() && this.f2893o.isEmpty() && this.r.isEmpty() && this.f2891m.isEmpty() && this.f2890l.isEmpty() && this.f2892n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void k() {
        long j10;
        long j11;
        ArrayList<RecyclerView.c0> arrayList = this.f2886h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f2888j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f2889k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.c0> arrayList4 = this.f2887i;
        boolean z13 = !arrayList4.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<RecyclerView.c0> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j10 = this.f2775d;
            if (!hasNext) {
                break;
            }
            RecyclerView.c0 next = it.next();
            View view = next.f2751a;
            ViewPropertyAnimator animate = view.animate();
            this.f2895q.add(next);
            animate.setDuration(j10).alpha(0.0f).setListener(new androidx.recyclerview.widget.d(view, animate, this, next)).start();
        }
        arrayList.clear();
        if (z11) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f2891m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (z10) {
                View view2 = arrayList5.get(0).f2907a.f2751a;
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                d0.d.n(view2, aVar, j10);
            } else {
                aVar.run();
            }
        }
        if (z12) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f2892n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (z10) {
                View view3 = arrayList6.get(0).f2902a.f2751a;
                WeakHashMap<View, o0> weakHashMap2 = t0.d0.f32288a;
                d0.d.n(view3, bVar, j10);
            } else {
                bVar.run();
            }
        }
        if (z13) {
            ArrayList<RecyclerView.c0> arrayList7 = new ArrayList<>();
            arrayList7.addAll(arrayList4);
            this.f2890l.add(arrayList7);
            arrayList4.clear();
            RunnableC0039c runnableC0039c = new RunnableC0039c(arrayList7);
            if (!z10 && !z11 && !z12) {
                runnableC0039c.run();
                return;
            }
            long j12 = 0;
            if (!z10) {
                j10 = 0;
            }
            if (z11) {
                j11 = this.f2776e;
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = this.f;
            }
            View view4 = arrayList7.get(0).f2751a;
            WeakHashMap<View, o0> weakHashMap3 = t0.d0.f32288a;
            d0.d.n(view4, runnableC0039c, Math.max(j11, j12) + j10);
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public final boolean l(RecyclerView.c0 c0Var, int i6, int i10, int i11, int i12) {
        View view = c0Var.f2751a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) c0Var.f2751a.getTranslationY());
        r(c0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            g(c0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f2888j.add(new e(c0Var, translationX, translationY, i11, i12));
        return true;
    }

    public final void o() {
        if (!j()) {
            ArrayList<RecyclerView.j.a> arrayList = this.f2773b;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).a();
            }
            arrayList.clear();
        }
    }

    public final void p(RecyclerView.c0 c0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                d dVar = (d) arrayList.get(size);
                if (q(dVar, c0Var) && dVar.f2902a == null && dVar.f2903b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean q(d dVar, RecyclerView.c0 c0Var) {
        if (dVar.f2903b == c0Var) {
            dVar.f2903b = null;
        } else if (dVar.f2902a == c0Var) {
            dVar.f2902a = null;
        } else {
            return false;
        }
        c0Var.f2751a.setAlpha(1.0f);
        View view = c0Var.f2751a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        g(c0Var);
        return true;
    }

    public final void r(RecyclerView.c0 c0Var) {
        if (f2885s == null) {
            f2885s = new ValueAnimator().getInterpolator();
        }
        c0Var.f2751a.animate().setInterpolator(f2885s);
        h(c0Var);
    }
}
