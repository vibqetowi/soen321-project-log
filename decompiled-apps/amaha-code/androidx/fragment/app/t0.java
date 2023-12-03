package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f2279a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2280b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2281c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f2282d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2283e = false;

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final e0 f2284h;

        public a(int i6, int i10, e0 e0Var, o0.d dVar) {
            super(i6, i10, e0Var.f2166c, dVar);
            this.f2284h = e0Var;
        }

        @Override // androidx.fragment.app.t0.b
        public final void b() {
            super.b();
            this.f2284h.j();
        }

        @Override // androidx.fragment.app.t0.b
        public final void d() {
            int i6 = this.f2286b;
            e0 e0Var = this.f2284h;
            if (i6 == 2) {
                Fragment fragment = e0Var.f2166c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (y.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.f2287c.requireView();
                if (requireView.getParent() == null) {
                    e0Var.a();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            } else if (i6 == 3) {
                Fragment fragment2 = e0Var.f2166c;
                View requireView2 = fragment2.requireView();
                if (y.P(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                }
                requireView2.clearFocus();
            }
        }
    }

    public t0(ViewGroup viewGroup) {
        this.f2279a = viewGroup;
    }

    public static t0 f(ViewGroup viewGroup, y yVar) {
        return g(viewGroup, yVar.M());
    }

    public static t0 g(ViewGroup viewGroup, v0 v0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof t0) {
            return (t0) tag;
        }
        ((y.e) v0Var).getClass();
        m mVar = new m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public final void a(int i6, int i10, e0 e0Var) {
        synchronized (this.f2280b) {
            o0.d dVar = new o0.d();
            b d10 = d(e0Var.f2166c);
            if (d10 != null) {
                d10.c(i6, i10);
                return;
            }
            a aVar = new a(i6, i10, e0Var, dVar);
            this.f2280b.add(aVar);
            aVar.f2288d.add(new r0(this, aVar));
            aVar.f2288d.add(new s0(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f2283e) {
            return;
        }
        ViewGroup viewGroup = this.f2279a;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        if (!d0.g.b(viewGroup)) {
            e();
            this.f2282d = false;
            return;
        }
        synchronized (this.f2280b) {
            if (!this.f2280b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2281c);
                this.f2281c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.a();
                    if (!bVar.f2290g) {
                        this.f2281c.add(bVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f2280b);
                this.f2280b.clear();
                this.f2281c.addAll(arrayList2);
                if (y.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).d();
                }
                b(arrayList2, this.f2282d);
                this.f2282d = false;
                if (y.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final b d(Fragment fragment) {
        Iterator<b> it = this.f2280b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2287c.equals(fragment) && !next.f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (y.P(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f2279a;
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        boolean b10 = d0.g.b(viewGroup);
        synchronized (this.f2280b) {
            i();
            Iterator<b> it = this.f2280b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f2281c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (y.P(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2279a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(bVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f2280b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (y.P(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f2279a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(bVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void h() {
        synchronized (this.f2280b) {
            i();
            this.f2283e = false;
            int size = this.f2280b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f2280b.get(size);
                int c10 = defpackage.c.c(bVar.f2287c.mView);
                if (bVar.f2285a == 2 && c10 != 2) {
                    this.f2283e = bVar.f2287c.isPostponed();
                    break;
                }
            }
        }
    }

    public final void i() {
        Iterator<b> it = this.f2280b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f2286b == 2) {
                next.c(defpackage.c.b(next.f2287c.requireView().getVisibility()), 1);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2285a;

        /* renamed from: b  reason: collision with root package name */
        public int f2286b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f2287c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f2288d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<o0.d> f2289e = new HashSet<>();
        public boolean f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2290g = false;

        public b(int i6, int i10, Fragment fragment, o0.d dVar) {
            this.f2285a = i6;
            this.f2286b = i10;
            this.f2287c = fragment;
            dVar.b(new u0(this));
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            HashSet<o0.d> hashSet = this.f2289e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((o0.d) it.next()).a();
            }
        }

        public void b() {
            if (this.f2290g) {
                return;
            }
            if (y.P(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2290g = true;
            Iterator it = this.f2288d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(int i6, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                Fragment fragment = this.f2287c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            if (y.P(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + defpackage.c.D(this.f2285a) + " -> REMOVED. mLifecycleImpact  = " + defpackage.b.z(this.f2286b) + " to REMOVING.");
                            }
                            this.f2285a = 1;
                            this.f2286b = 3;
                            return;
                        }
                        return;
                    } else if (this.f2285a == 1) {
                        if (y.P(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + defpackage.b.z(this.f2286b) + " to ADDING.");
                        }
                        this.f2285a = 2;
                        this.f2286b = 2;
                        return;
                    } else {
                        return;
                    }
                } else if (this.f2285a != 1) {
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + defpackage.c.D(this.f2285a) + " -> " + defpackage.c.D(i6) + ". ");
                    }
                    this.f2285a = i6;
                    return;
                } else {
                    return;
                }
            }
            throw null;
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + defpackage.c.D(this.f2285a) + "} {mLifecycleImpact = " + defpackage.b.z(this.f2286b) + "} {mFragment = " + this.f2287c + "}";
        }

        public void d() {
        }
    }
}
