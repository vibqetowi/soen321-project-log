package h2;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.theinnerhour.b2b.R;
import h2.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final h2.a f17056a = new h2.a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<t.b<ViewGroup, ArrayList<k>>>> f17057b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<ViewGroup> f17058c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, k kVar) {
        ArrayList<ViewGroup> arrayList = f17058c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (kVar == null) {
                    kVar = f17056a;
                }
                k clone = kVar.clone();
                ArrayList<k> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<k> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().x(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.i(viewGroup, true);
                }
                if (((j) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static t.b<ViewGroup, ArrayList<k>> b() {
        t.b<ViewGroup, ArrayList<k>> bVar;
        ThreadLocal<WeakReference<t.b<ViewGroup, ArrayList<k>>>> threadLocal = f17057b;
        WeakReference<t.b<ViewGroup, ArrayList<k>>> weakReference = threadLocal.get();
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            return bVar;
        }
        t.b<ViewGroup, ArrayList<k>> bVar2 = new t.b<>();
        threadLocal.set(new WeakReference<>(bVar2));
        return bVar2;
    }

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final k f17059u;

        /* renamed from: v  reason: collision with root package name */
        public final ViewGroup f17060v;

        /* compiled from: TransitionManager.java */
        /* renamed from: h2.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0270a extends n {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t.b f17061a;

            public C0270a(t.b bVar) {
                this.f17061a = bVar;
            }

            @Override // h2.k.d
            public final void c(k kVar) {
                ((ArrayList) this.f17061a.getOrDefault(a.this.f17060v, null)).remove(kVar);
                kVar.y(this);
            }
        }

        public a(ViewGroup viewGroup, k kVar) {
            this.f17059u = kVar;
            this.f17060v = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01e3 A[EDGE_INSN: B:142:0x01e3->B:89:0x01e3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x020b  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            k kVar;
            t.b bVar;
            t.b bVar2;
            int i6;
            int[] iArr;
            int i10;
            int i11;
            int i12;
            k.b orDefault;
            View view;
            boolean z10;
            boolean z11;
            ViewGroup viewGroup;
            r rVar;
            View view2;
            View view3;
            ViewGroup viewGroup2;
            ViewGroup viewGroup3 = this.f17060v;
            viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup3.removeOnAttachStateChangeListener(this);
            int i13 = 1;
            if (!o.f17058c.remove(viewGroup3)) {
                return true;
            }
            t.b<ViewGroup, ArrayList<k>> b10 = o.b();
            Long l2 = null;
            ArrayList<k> orDefault2 = b10.getOrDefault(viewGroup3, null);
            if (orDefault2 == null) {
                orDefault2 = new ArrayList<>();
                b10.put(viewGroup3, orDefault2);
            } else if (orDefault2.size() > 0) {
                arrayList = new ArrayList(orDefault2);
                kVar = this.f17059u;
                orDefault2.add(kVar);
                kVar.a(new C0270a(b10));
                kVar.i(viewGroup3, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).A(viewGroup3);
                    }
                }
                kVar.E = new ArrayList<>();
                kVar.F = new ArrayList<>();
                v.c cVar = kVar.A;
                v.c cVar2 = kVar.B;
                bVar = new t.b((t.b) cVar.f34631v);
                bVar2 = new t.b((t.b) cVar2.f34631v);
                i6 = 0;
                while (true) {
                    iArr = kVar.D;
                    if (i6 < iArr.length) {
                        break;
                    }
                    int i14 = iArr[i6];
                    if (i14 != i13) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 4) {
                                    t.e eVar = (t.e) cVar.f34633x;
                                    t.e eVar2 = (t.e) cVar2.f34633x;
                                    int j10 = eVar.j();
                                    int i15 = 0;
                                    while (i15 < j10) {
                                        View view4 = (View) eVar.k(i15);
                                        if (view4 != null && kVar.v(view4)) {
                                            viewGroup2 = viewGroup3;
                                            View view5 = (View) eVar2.e(eVar.f(i15), l2);
                                            if (view5 != null && kVar.v(view5)) {
                                                r rVar2 = (r) bVar.getOrDefault(view4, l2);
                                                r rVar3 = (r) bVar2.getOrDefault(view5, l2);
                                                if (rVar2 != null && rVar3 != null) {
                                                    kVar.E.add(rVar2);
                                                    kVar.F.add(rVar3);
                                                    bVar.remove(view4);
                                                    bVar2.remove(view5);
                                                }
                                            }
                                        } else {
                                            viewGroup2 = viewGroup3;
                                        }
                                        i15++;
                                        viewGroup3 = viewGroup2;
                                        l2 = null;
                                    }
                                }
                                viewGroup = viewGroup3;
                            } else {
                                viewGroup = viewGroup3;
                                SparseArray sparseArray = (SparseArray) cVar.f34632w;
                                SparseArray sparseArray2 = (SparseArray) cVar2.f34632w;
                                int size = sparseArray.size();
                                for (int i16 = 0; i16 < size; i16++) {
                                    View view6 = (View) sparseArray.valueAt(i16);
                                    if (view6 != null && kVar.v(view6) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i16))) != null && kVar.v(view3)) {
                                        r rVar4 = (r) bVar.getOrDefault(view6, null);
                                        r rVar5 = (r) bVar2.getOrDefault(view3, null);
                                        if (rVar4 != null && rVar5 != null) {
                                            kVar.E.add(rVar4);
                                            kVar.F.add(rVar5);
                                            bVar.remove(view6);
                                            bVar2.remove(view3);
                                        }
                                    }
                                }
                            }
                        } else {
                            viewGroup = viewGroup3;
                            t.b bVar3 = (t.b) cVar.f34634y;
                            t.b bVar4 = (t.b) cVar2.f34634y;
                            int i17 = bVar3.f32260w;
                            for (int i18 = 0; i18 < i17; i18++) {
                                View view7 = (View) bVar3.m(i18);
                                if (view7 != null && kVar.v(view7) && (view2 = (View) bVar4.getOrDefault(bVar3.i(i18), null)) != null && kVar.v(view2)) {
                                    r rVar6 = (r) bVar.getOrDefault(view7, null);
                                    r rVar7 = (r) bVar2.getOrDefault(view2, null);
                                    if (rVar6 != null && rVar7 != null) {
                                        kVar.E.add(rVar6);
                                        kVar.F.add(rVar7);
                                        bVar.remove(view7);
                                        bVar2.remove(view2);
                                    }
                                }
                            }
                        }
                    } else {
                        viewGroup = viewGroup3;
                        int i19 = bVar.f32260w;
                        while (true) {
                            i19--;
                            if (i19 >= 0) {
                                View view8 = (View) bVar.i(i19);
                                if (view8 != null && kVar.v(view8) && (rVar = (r) bVar2.remove(view8)) != null && kVar.v(rVar.f17069b)) {
                                    kVar.E.add((r) bVar.k(i19));
                                    kVar.F.add(rVar);
                                }
                            }
                        }
                    }
                    i6++;
                    viewGroup3 = viewGroup;
                    l2 = null;
                    i13 = 1;
                }
                ViewGroup viewGroup4 = viewGroup3;
                for (i10 = 0; i10 < bVar.f32260w; i10++) {
                    r rVar8 = (r) bVar.m(i10);
                    if (kVar.v(rVar8.f17069b)) {
                        kVar.E.add(rVar8);
                        kVar.F.add(null);
                    }
                }
                for (i11 = 0; i11 < bVar2.f32260w; i11++) {
                    r rVar9 = (r) bVar2.m(i11);
                    if (kVar.v(rVar9.f17069b)) {
                        kVar.F.add(rVar9);
                        kVar.E.add(null);
                    }
                }
                t.b<Animator, k.b> q10 = k.q();
                int i20 = q10.f32260w;
                v vVar = t.f17072a;
                WindowId windowId = viewGroup4.getWindowId();
                for (i12 = i20 - 1; i12 >= 0; i12--) {
                    Animator i21 = q10.i(i12);
                    if (i21 != null && (orDefault = q10.getOrDefault(i21, null)) != null && (view = orDefault.f17048a) != null) {
                        c0 c0Var = orDefault.f17051d;
                        if ((c0Var instanceof b0) && ((b0) c0Var).f17028a.equals(windowId)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            r t3 = kVar.t(view, true);
                            r p10 = kVar.p(view, true);
                            if (t3 == null && p10 == null) {
                                p10 = (r) ((t.b) kVar.B.f34631v).getOrDefault(view, null);
                            }
                            if ((t3 != null || p10 != null) && orDefault.f17052e.u(orDefault.f17050c, p10)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (!i21.isRunning() && !i21.isStarted()) {
                                    q10.remove(i21);
                                } else {
                                    i21.cancel();
                                }
                            }
                        }
                    }
                }
                kVar.m(viewGroup4, kVar.A, kVar.B, kVar.E, kVar.F);
                kVar.B();
                return true;
            }
            arrayList = null;
            kVar = this.f17059u;
            orDefault2.add(kVar);
            kVar.a(new C0270a(b10));
            kVar.i(viewGroup3, false);
            if (arrayList != null) {
            }
            kVar.E = new ArrayList<>();
            kVar.F = new ArrayList<>();
            v.c cVar3 = kVar.A;
            v.c cVar22 = kVar.B;
            bVar = new t.b((t.b) cVar3.f34631v);
            bVar2 = new t.b((t.b) cVar22.f34631v);
            i6 = 0;
            while (true) {
                iArr = kVar.D;
                if (i6 < iArr.length) {
                }
                i6++;
                viewGroup3 = viewGroup;
                l2 = null;
                i13 = 1;
            }
            ViewGroup viewGroup42 = viewGroup3;
            while (i10 < bVar.f32260w) {
            }
            while (i11 < bVar2.f32260w) {
            }
            t.b<Animator, k.b> q102 = k.q();
            int i202 = q102.f32260w;
            v vVar2 = t.f17072a;
            WindowId windowId2 = viewGroup42.getWindowId();
            while (i12 >= 0) {
            }
            kVar.m(viewGroup42, kVar.A, kVar.B, kVar.E, kVar.F);
            kVar.B();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f17060v;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            o.f17058c.remove(viewGroup);
            ArrayList<k> orDefault = o.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<k> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().A(viewGroup);
                }
            }
            this.f17059u.j(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
