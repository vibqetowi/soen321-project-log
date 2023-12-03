package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.WeakHashMap;
import t.g;
import t0.d0;
import t0.o0;
import tr.r;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.e<f> implements g {
    public final t.e<Fragment.l> A;
    public final t.e<Integer> B;
    public b C;
    public boolean D;
    public boolean E;

    /* renamed from: x  reason: collision with root package name */
    public final j f3128x;

    /* renamed from: y  reason: collision with root package name */
    public final y f3129y;

    /* renamed from: z  reason: collision with root package name */
    public final t.e<Fragment> f3130z;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.g {
        public a(int i6) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i6, int i10, Bundle bundle) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i6, int i10) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i6, int i10) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i6, int i10) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f3136a;

        /* renamed from: b  reason: collision with root package name */
        public e f3137b;

        /* renamed from: c  reason: collision with root package name */
        public n f3138c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f3139d;

        /* renamed from: e  reason: collision with root package name */
        public long f3140e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f3129y.T() || this.f3139d.getScrollState() != 0) {
                return;
            }
            t.e<Fragment> eVar = fragmentStateAdapter.f3130z;
            if (eVar.j() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || fragmentStateAdapter.f() == 0 || (currentItem = this.f3139d.getCurrentItem()) >= fragmentStateAdapter.f()) {
                return;
            }
            long j10 = currentItem;
            if (j10 == this.f3140e && !z10) {
                return;
            }
            Fragment fragment = null;
            Fragment fragment2 = (Fragment) eVar.e(j10, null);
            if (fragment2 != null && fragment2.isAdded()) {
                this.f3140e = j10;
                y yVar = fragmentStateAdapter.f3129y;
                androidx.fragment.app.a l2 = defpackage.e.l(yVar, yVar);
                for (int i6 = 0; i6 < eVar.j(); i6++) {
                    long f = eVar.f(i6);
                    Fragment k10 = eVar.k(i6);
                    if (k10.isAdded()) {
                        if (f != this.f3140e) {
                            l2.p(k10, j.c.STARTED);
                        } else {
                            fragment = k10;
                        }
                        if (f == this.f3140e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k10.setMenuVisibility(z12);
                    }
                }
                if (fragment != null) {
                    l2.p(fragment, j.c.RESUMED);
                }
                if (!l2.f2191a.isEmpty()) {
                    l2.m();
                }
            }
        }
    }

    public FragmentStateAdapter(p pVar) {
        this(pVar.getSupportFragmentManager(), pVar.getLifecycle());
    }

    public static void v(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void A(final f fVar) {
        Fragment fragment = (Fragment) this.f3130z.e(fVar.f2755e, null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f2751a;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = fragment.isAdded();
            y yVar = this.f3129y;
            if (isAdded && view == null) {
                yVar.f2317n.f2299a.add(new w.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout), false));
                return;
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    v(view, frameLayout);
                    return;
                }
                return;
            } else if (fragment.isAdded()) {
                v(view, frameLayout);
                return;
            } else if (!yVar.T()) {
                yVar.f2317n.f2299a.add(new w.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout), false));
                yVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.e(0, fragment, "f" + fVar.f2755e, 1);
                aVar.p(fragment, j.c.STARTED);
                aVar.m();
                this.C.b(false);
                return;
            } else if (yVar.I) {
                return;
            } else {
                this.f3128x.a(new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.n
                    public final void c(androidx.lifecycle.p pVar, j.b bVar) {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        if (fragmentStateAdapter.f3129y.T()) {
                            return;
                        }
                        pVar.getLifecycle().c(this);
                        f fVar2 = fVar;
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        if (d0.g.b((FrameLayout) fVar2.f2751a)) {
                            fragmentStateAdapter.A(fVar2);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void B(long j10) {
        ViewParent parent;
        t.e<Fragment> eVar = this.f3130z;
        Fragment fragment = (Fragment) eVar.e(j10, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean w10 = w(j10);
        t.e<Fragment.l> eVar2 = this.A;
        if (!w10) {
            eVar2.i(j10);
        }
        if (!fragment.isAdded()) {
            eVar.i(j10);
            return;
        }
        y yVar = this.f3129y;
        if (yVar.T()) {
            this.E = true;
            return;
        }
        if (fragment.isAdded() && w(j10)) {
            eVar2.h(j10, yVar.g0(fragment));
        }
        yVar.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
        aVar.o(fragment);
        aVar.m();
        eVar.i(j10);
    }

    @Override // androidx.viewpager2.adapter.g
    public final Bundle a() {
        t.e<Fragment> eVar = this.f3130z;
        int j10 = eVar.j();
        t.e<Fragment.l> eVar2 = this.A;
        Bundle bundle = new Bundle(eVar2.j() + j10);
        for (int i6 = 0; i6 < eVar.j(); i6++) {
            long f = eVar.f(i6);
            Fragment fragment = (Fragment) eVar.e(f, null);
            if (fragment != null && fragment.isAdded()) {
                this.f3129y.b0(bundle, "f#" + f, fragment);
            }
        }
        for (int i10 = 0; i10 < eVar2.j(); i10++) {
            long f2 = eVar2.f(i10);
            if (w(f2)) {
                bundle.putParcelable("s#" + f2, (Parcelable) eVar2.e(f2, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        t.e<Fragment.l> eVar = this.A;
        boolean z14 = false;
        if (eVar.j() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            t.e<Fragment> eVar2 = this.f3130z;
            if (eVar2.j() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        eVar2.h(Long.parseLong(str.substring(2)), this.f3129y.I(bundle, str));
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong = Long.parseLong(str.substring(2));
                            Fragment.l lVar = (Fragment.l) bundle.getParcelable(str);
                            if (w(parseLong)) {
                                eVar.h(parseLong, lVar);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (eVar2.j() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.E = true;
                    this.D = true;
                    y();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f3128x.a(new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.n
                        public final void c(androidx.lifecycle.p pVar, j.b bVar) {
                            if (bVar == j.b.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                pVar.getLifecycle().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long g(int i6) {
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(RecyclerView recyclerView) {
        boolean z10;
        if (this.C == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            final b bVar = new b();
            this.C = bVar;
            bVar.f3139d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f3136a = dVar;
            bVar.f3139d.f3153w.f3171a.add(dVar);
            e eVar = new e(bVar);
            bVar.f3137b = eVar;
            u(eVar);
            n nVar = new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.n
                public final void c(androidx.lifecycle.p pVar, j.b bVar2) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.f3138c = nVar;
            this.f3128x.a(nVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(f fVar, int i6) {
        boolean z10;
        f fVar2 = fVar;
        long j10 = fVar2.f2755e;
        FrameLayout frameLayout = (FrameLayout) fVar2.f2751a;
        int id2 = frameLayout.getId();
        Long z11 = z(id2);
        t.e<Integer> eVar = this.B;
        if (z11 != null && z11.longValue() != j10) {
            B(z11.longValue());
            eVar.i(z11.longValue());
        }
        eVar.h(j10, Integer.valueOf(id2));
        long j11 = i6;
        t.e<Fragment> eVar2 = this.f3130z;
        if (eVar2.f32231u) {
            eVar2.d();
        }
        if (r.k(eVar2.f32232v, eVar2.f32234x, j11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Fragment x10 = x(i6);
            x10.setInitialSavedState((Fragment.l) this.A.e(j11, null));
            eVar2.h(j11, x10);
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        int i10 = f.f3150u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        frameLayout.setId(d0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void q(RecyclerView recyclerView) {
        b bVar = this.C;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.f3153w.f3171a.remove(bVar.f3136a);
        e eVar = bVar.f3137b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f2769u.unregisterObserver(eVar);
        fragmentStateAdapter.f3128x.c(bVar.f3138c);
        bVar.f3139d = null;
        this.C = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final /* bridge */ /* synthetic */ boolean r(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void s(f fVar) {
        A(fVar);
        y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void t(f fVar) {
        Long z10 = z(((FrameLayout) fVar.f2751a).getId());
        if (z10 != null) {
            B(z10.longValue());
            this.B.i(z10.longValue());
        }
    }

    public final boolean w(long j10) {
        if (j10 >= 0 && j10 < f()) {
            return true;
        }
        return false;
    }

    public abstract Fragment x(int i6);

    public final void y() {
        t.e<Fragment> eVar;
        t.e<Integer> eVar2;
        boolean z10;
        Fragment fragment;
        View view;
        if (this.E && !this.f3129y.T()) {
            t.d dVar = new t.d();
            int i6 = 0;
            while (true) {
                eVar = this.f3130z;
                int j10 = eVar.j();
                eVar2 = this.B;
                if (i6 >= j10) {
                    break;
                }
                long f = eVar.f(i6);
                if (!w(f)) {
                    dVar.add(Long.valueOf(f));
                    eVar2.i(f);
                }
                i6++;
            }
            if (!this.D) {
                this.E = false;
                for (int i10 = 0; i10 < eVar.j(); i10++) {
                    long f2 = eVar.f(i10);
                    if (eVar2.f32231u) {
                        eVar2.d();
                    }
                    boolean z11 = true;
                    if (r.k(eVar2.f32232v, eVar2.f32234x, f2) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((fragment = (Fragment) eVar.e(f2, null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(f2));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    B(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long z(int i6) {
        Long l2 = null;
        int i10 = 0;
        while (true) {
            t.e<Integer> eVar = this.B;
            if (i10 < eVar.j()) {
                if (eVar.k(i10).intValue() == i6) {
                    if (l2 == null) {
                        l2 = Long.valueOf(eVar.f(i10));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i10++;
            } else {
                return l2;
            }
        }
    }

    public FragmentStateAdapter(y yVar, j jVar) {
        this.f3130z = new t.e<>();
        this.A = new t.e<>();
        this.B = new t.e<>();
        this.D = false;
        this.E = false;
        this.f3129y = yVar;
        this.f3128x = jVar;
        if (!this.f2769u.a()) {
            this.f2770v = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
}
