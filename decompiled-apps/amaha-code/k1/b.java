package k1;

import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import kotlin.jvm.internal.i;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b implements o0.b {

    /* renamed from: a  reason: collision with root package name */
    public final e<?>[] f22767a;

    public b(e<?>... initializers) {
        i.g(initializers, "initializers");
        this.f22767a = initializers;
    }

    @Override // androidx.lifecycle.o0.b
    public final l0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.o0.b
    public final l0 b(Class cls, d dVar) {
        e<?>[] eVarArr;
        l0 l0Var = null;
        for (e<?> eVar : this.f22767a) {
            if (i.b(eVar.f22769a, cls)) {
                Object invoke = eVar.f22770b.invoke(dVar);
                if (invoke instanceof l0) {
                    l0Var = (l0) invoke;
                } else {
                    l0Var = null;
                }
            }
        }
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
