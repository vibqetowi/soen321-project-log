package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j;
import java.util.ArrayList;
/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class f0 extends k2.a {

    /* renamed from: c  reason: collision with root package name */
    public final y f2172c;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2177i;

    /* renamed from: e  reason: collision with root package name */
    public a f2174e = null;
    public final ArrayList<Fragment.l> f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Fragment> f2175g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public Fragment f2176h = null;

    /* renamed from: d  reason: collision with root package name */
    public final int f2173d = 0;

    @Deprecated
    public f0(y yVar) {
        this.f2172c = yVar;
    }

    @Override // k2.a
    public final void e(ViewGroup viewGroup, int i6, Object obj) {
        ArrayList<Fragment.l> arrayList;
        Fragment.l lVar;
        Fragment fragment = (Fragment) obj;
        a aVar = this.f2174e;
        y yVar = this.f2172c;
        if (aVar == null) {
            this.f2174e = defpackage.e.l(yVar, yVar);
        }
        while (true) {
            arrayList = this.f;
            if (arrayList.size() > i6) {
                break;
            }
            arrayList.add(null);
        }
        if (fragment.isAdded()) {
            lVar = yVar.g0(fragment);
        } else {
            lVar = null;
        }
        arrayList.set(i6, lVar);
        this.f2175g.set(i6, null);
        this.f2174e.o(fragment);
        if (fragment.equals(this.f2176h)) {
            this.f2176h = null;
        }
    }

    @Override // k2.a
    public final void f() {
        a aVar = this.f2174e;
        if (aVar != null) {
            if (!this.f2177i) {
                try {
                    this.f2177i = true;
                    if (!aVar.f2196g) {
                        aVar.f2197h = false;
                        aVar.f2130q.z(aVar, true);
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } finally {
                    this.f2177i = false;
                }
            }
            this.f2174e = null;
        }
    }

    @Override // k2.a
    public final Object i(int i6, ViewGroup viewGroup) {
        Fragment.l lVar;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.f2175g;
        if (arrayList.size() > i6 && (fragment = arrayList.get(i6)) != null) {
            return fragment;
        }
        if (this.f2174e == null) {
            y yVar = this.f2172c;
            this.f2174e = defpackage.e.l(yVar, yVar);
        }
        Fragment q10 = q(i6);
        ArrayList<Fragment.l> arrayList2 = this.f;
        if (arrayList2.size() > i6 && (lVar = arrayList2.get(i6)) != null) {
            q10.setInitialSavedState(lVar);
        }
        while (arrayList.size() <= i6) {
            arrayList.add(null);
        }
        q10.setMenuVisibility(false);
        int i10 = this.f2173d;
        if (i10 == 0) {
            q10.setUserVisibleHint(false);
        }
        arrayList.set(i6, q10);
        this.f2174e.e(viewGroup.getId(), q10, null, 1);
        if (i10 == 1) {
            this.f2174e.p(q10, j.c.STARTED);
        }
        return q10;
    }

    @Override // k2.a
    public final boolean j(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // k2.a
    public final void l(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<Fragment.l> arrayList = this.f;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.f2175g;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.l) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment I = this.f2172c.I(bundle, str);
                    if (I != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        I.setMenuVisibility(false);
                        arrayList2.set(parseInt, I);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // k2.a
    public final Parcelable m() {
        Bundle bundle;
        ArrayList<Fragment.l> arrayList = this.f;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.l[] lVarArr = new Fragment.l[arrayList.size()];
            arrayList.toArray(lVarArr);
            bundle.putParcelableArray("states", lVarArr);
        } else {
            bundle = null;
        }
        int i6 = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.f2175g;
            if (i6 < arrayList2.size()) {
                Fragment fragment = arrayList2.get(i6);
                if (fragment != null && fragment.isAdded()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    this.f2172c.b0(bundle, defpackage.c.p("f", i6), fragment);
                }
                i6++;
            } else {
                return bundle;
            }
        }
    }

    @Override // k2.a
    public final void n(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2176h;
        if (fragment != fragment2) {
            y yVar = this.f2172c;
            int i6 = this.f2173d;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i6 == 1) {
                    if (this.f2174e == null) {
                        this.f2174e = defpackage.e.l(yVar, yVar);
                    }
                    this.f2174e.p(this.f2176h, j.c.STARTED);
                } else {
                    this.f2176h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i6 == 1) {
                if (this.f2174e == null) {
                    this.f2174e = defpackage.e.l(yVar, yVar);
                }
                this.f2174e.p(fragment, j.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f2176h = fragment;
        }
    }

    @Override // k2.a
    public final void p(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment q(int i6);
}
