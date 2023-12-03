package androidx.lifecycle;

import a2.a;
import androidx.lifecycle.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: LegacySavedStateHandleController.java */
/* loaded from: classes.dex */
public final class i {

    /* compiled from: LegacySavedStateHandleController.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0005a {
        @Override // a2.a.InterfaceC0005a
        public final void a(a2.c cVar) {
            HashMap<String, l0> hashMap;
            if (cVar instanceof r0) {
                q0 viewModelStore = ((r0) cVar).getViewModelStore();
                a2.a savedStateRegistry = cVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.f2462a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashMap = viewModelStore.f2462a;
                    if (!hasNext) {
                        break;
                    }
                    i.a(hashMap.get((String) it.next()), savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(hashMap.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(l0 l0Var, a2.a aVar, j jVar) {
        Object obj;
        boolean z10;
        HashMap hashMap = l0Var.f2436u;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = l0Var.f2436u.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !(z10 = savedStateHandleController.f2376v)) {
            if (!z10) {
                savedStateHandleController.f2376v = true;
                jVar.a(savedStateHandleController);
                aVar.c(savedStateHandleController.f2375u, savedStateHandleController.f2377w.f2399e);
                b(jVar, aVar);
                return;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
    }

    public static void b(final j jVar, final a2.a aVar) {
        j.c b10 = jVar.b();
        if (b10 != j.c.INITIALIZED && !b10.d(j.c.STARTED)) {
            jVar.a(new n() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // androidx.lifecycle.n
                public final void c(p pVar, j.b bVar) {
                    if (bVar == j.b.ON_START) {
                        j.this.c(this);
                        aVar.d();
                    }
                }
            });
        } else {
            aVar.d();
        }
    }
}
