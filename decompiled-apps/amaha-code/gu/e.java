package gu;

import gu.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16848b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, g.e<?, ?>> f16849a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16850a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16851b;

        public a(int i6, n nVar) {
            this.f16850a = nVar;
            this.f16851b = i6;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16850a != aVar.f16850a || this.f16851b != aVar.f16851b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16850a) * 65535) + this.f16851b;
        }
    }

    static {
        new e(0);
    }

    public e() {
        this.f16849a = new HashMap();
    }

    public final void a(g.e<?, ?> eVar) {
        this.f16849a.put(new a(eVar.f16870d.f16863u, eVar.f16867a), eVar);
    }

    public e(int i6) {
        this.f16849a = Collections.emptyMap();
    }
}
