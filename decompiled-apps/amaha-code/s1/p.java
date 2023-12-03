package s1;

import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: NavControllerViewModel.kt */
/* loaded from: classes.dex */
public final class p extends l0 implements d0 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f31199y = new a();

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f31200x = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    /* loaded from: classes.dex */
    public static final class a implements o0.b {
        @Override // androidx.lifecycle.o0.b
        public final <T extends l0> T a(Class<T> cls) {
            return new p();
        }

        @Override // androidx.lifecycle.o0.b
        public final l0 b(Class cls, k1.d dVar) {
            return a(cls);
        }
    }

    @Override // s1.d0
    public final q0 a(String backStackEntryId) {
        kotlin.jvm.internal.i.g(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f31200x;
        q0 q0Var = (q0) linkedHashMap.get(backStackEntryId);
        if (q0Var == null) {
            q0 q0Var2 = new q0();
            linkedHashMap.put(backStackEntryId, q0Var2);
            return q0Var2;
        }
        return q0Var;
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        LinkedHashMap linkedHashMap = this.f31200x;
        for (q0 q0Var : linkedHashMap.values()) {
            q0Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f31200x.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "sb.toString()");
        return sb3;
    }
}
