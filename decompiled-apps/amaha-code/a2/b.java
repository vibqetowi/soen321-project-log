package a2;

import a2.a;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.i;
import n.b;
import s1.h;
/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f173a;

    /* renamed from: b  reason: collision with root package name */
    public final a f174b = new a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f175c;

    public b(c cVar) {
        this.f173a = cVar;
    }

    public final void a() {
        boolean z10;
        c cVar = this.f173a;
        j lifecycle = cVar.getLifecycle();
        i.f(lifecycle, "owner.lifecycle");
        if (lifecycle.b() == j.c.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycle.a(new Recreator(cVar));
            a aVar = this.f174b;
            aVar.getClass();
            if (!aVar.f169b) {
                lifecycle.a(new h(2, aVar));
                aVar.f169b = true;
                this.f175c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f175c) {
            a();
        }
        j lifecycle = this.f173a.getLifecycle();
        i.f(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().d(j.c.STARTED)) {
            a aVar = this.f174b;
            if (aVar.f169b) {
                if (!aVar.f171d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    aVar.f170c = bundle2;
                    aVar.f171d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void c(Bundle outBundle) {
        i.g(outBundle, "outBundle");
        a aVar = this.f174b;
        aVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = aVar.f170c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        n.b<String, a.b> bVar = aVar.f168a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f25764w.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
