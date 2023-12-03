package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2299a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final y f2300b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y.k f2301a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2302b;

        public a(y.k kVar, boolean z10) {
            this.f2301a = kVar;
            this.f2302b = z10;
        }
    }

    public w(y yVar) {
        this.f2300b = yVar;
    }

    public final void a(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.a(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        y yVar = this.f2300b;
        Context context = yVar.f2324v.f2292v;
        Fragment fragment = yVar.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.b(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.c(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void d(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.d(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void e(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.e(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void f(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2300b.f2326x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f2317n.f(fragment, true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.a(fragment);
            }
        }
    }

    public final void g(boolean z10) {
        y yVar = this.f2300b;
        Context context = yVar.f2324v.f2292v;
        Fragment fragment = yVar.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.g(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.h(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void i(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2300b.f2326x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f2317n.i(fragment, true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.b(fragment);
            }
        }
    }

    public final void j(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.j(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.k(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.l(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        y yVar = this.f2300b;
        Fragment fragment2 = yVar.f2326x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f2317n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.c(yVar, fragment, view);
            }
        }
    }

    public final void n(boolean z10) {
        Fragment fragment = this.f2300b.f2326x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f2317n.n(true);
        }
        Iterator<a> it = this.f2299a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2302b) {
                next.f2301a.getClass();
            }
        }
    }
}
