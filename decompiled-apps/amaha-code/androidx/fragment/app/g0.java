package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f2183a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, e0> f2184b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, d0> f2185c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public b0 f2186d;

    public final void a(Fragment fragment) {
        if (!this.f2183a.contains(fragment)) {
            synchronized (this.f2183a) {
                this.f2183a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        e0 e0Var = this.f2184b.get(str);
        if (e0Var != null) {
            return e0Var.f2166c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (e0 e0Var : this.f2184b.values()) {
            if (e0Var != null && (findFragmentByWho = e0Var.f2166c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : this.f2184b.values()) {
            if (e0Var != null) {
                arrayList.add(e0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : this.f2184b.values()) {
            if (e0Var != null) {
                arrayList.add(e0Var.f2166c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f2183a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2183a) {
            arrayList = new ArrayList(this.f2183a);
        }
        return arrayList;
    }

    public final void g(e0 e0Var) {
        boolean z10;
        Fragment fragment = e0Var.f2166c;
        String str = fragment.mWho;
        HashMap<String, e0> hashMap = this.f2184b;
        if (hashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        hashMap.put(fragment.mWho, e0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f2186d.e(fragment);
            } else {
                this.f2186d.h(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(e0 e0Var) {
        Fragment fragment = e0Var.f2166c;
        if (fragment.mRetainInstance) {
            this.f2186d.h(fragment);
        }
        if (this.f2184b.put(fragment.mWho, null) != null && y.P(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final d0 i(String str, d0 d0Var) {
        HashMap<String, d0> hashMap = this.f2185c;
        if (d0Var != null) {
            return hashMap.put(str, d0Var);
        }
        return hashMap.remove(str);
    }
}
