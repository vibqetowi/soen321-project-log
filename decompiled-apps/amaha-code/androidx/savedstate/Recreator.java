package androidx.savedstate;

import a2.a;
import a2.c;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: Recreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/n;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Recreator implements n {

    /* renamed from: u  reason: collision with root package name */
    public final c f3073u;

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f3074a;

        public a(a2.a registry) {
            i.g(registry, "registry");
            this.f3074a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // a2.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3074a));
            return bundle;
        }
    }

    public Recreator(c owner) {
        i.g(owner, "owner");
        this.f3073u = owner;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        if (bVar == j.b.ON_CREATE) {
            pVar.getLifecycle().c(this);
            c cVar = this.f3073u;
            Bundle a10 = cVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0005a.class);
                        i.f(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                i.f(newInstance, "{\n                constr…wInstance()\n            }");
                                ((a.InterfaceC0005a) newInstance).a(cVar);
                            } catch (Exception e10) {
                                throw new RuntimeException(c.r("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(b.m("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
