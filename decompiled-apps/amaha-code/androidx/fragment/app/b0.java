package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.o0;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class b0 extends androidx.lifecycle.l0 {
    public static final a D = new a();
    public final boolean A;

    /* renamed from: x  reason: collision with root package name */
    public final HashMap<String, Fragment> f2145x = new HashMap<>();

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, b0> f2146y = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.q0> f2147z = new HashMap<>();
    public boolean B = false;
    public boolean C = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements o0.b {
        @Override // androidx.lifecycle.o0.b
        public final <T extends androidx.lifecycle.l0> T a(Class<T> cls) {
            return new b0(true);
        }

        @Override // androidx.lifecycle.o0.b
        public final androidx.lifecycle.l0 b(Class cls, k1.d dVar) {
            return a(cls);
        }
    }

    public b0(boolean z10) {
        this.A = z10;
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        if (y.P(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.B = true;
    }

    public final void e(Fragment fragment) {
        if (this.C) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> hashMap = this.f2145x;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (y.P(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f2145x.equals(b0Var.f2145x) && this.f2146y.equals(b0Var.f2146y) && this.f2147z.equals(b0Var.f2147z)) {
            return true;
        }
        return false;
    }

    public final void f(Fragment fragment) {
        if (y.P(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        g(fragment.mWho);
    }

    public final void g(String str) {
        HashMap<String, b0> hashMap = this.f2146y;
        b0 b0Var = hashMap.get(str);
        if (b0Var != null) {
            b0Var.c();
            hashMap.remove(str);
        }
        HashMap<String, androidx.lifecycle.q0> hashMap2 = this.f2147z;
        androidx.lifecycle.q0 q0Var = hashMap2.get(str);
        if (q0Var != null) {
            q0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void h(Fragment fragment) {
        boolean z10;
        if (this.C) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f2145x.remove(fragment.mWho) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && y.P(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        int hashCode = this.f2146y.hashCode();
        return this.f2147z.hashCode() + ((hashCode + (this.f2145x.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2145x.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2146y.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2147z.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
