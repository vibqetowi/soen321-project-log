package a2;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import n.b;
/* compiled from: SavedStateRegistry.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f169b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f170c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f171d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f172e;

    /* renamed from: a  reason: collision with root package name */
    public final n.b<String, b> f168a = new n.b<>();
    public boolean f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: a2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0005a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        boolean z10;
        if (this.f171d) {
            Bundle bundle = this.f170c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f170c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f170c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f170c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry components;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f168a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                components = (Map.Entry) eVar.next();
                i.f(components, "components");
                bVar = (b) components.getValue();
            } else {
                return null;
            }
        } while (!i.b((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String key, b provider) {
        boolean z10;
        i.g(key, "key");
        i.g(provider, "provider");
        if (this.f168a.g(key, provider) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void d() {
        if (this.f) {
            Recreator.a aVar = this.f172e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f172e = aVar;
            try {
                i.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f172e;
                if (aVar2 != null) {
                    aVar2.f3074a.add(i.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + i.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
