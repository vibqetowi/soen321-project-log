package i5;

import is.u;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: PersistedEvents.kt */
/* loaded from: classes.dex */
public final class p implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final HashMap<i5.a, List<d>> f19879u;

    /* compiled from: PersistedEvents.kt */
    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final HashMap<i5.a, List<d>> f19880u;

        public a(HashMap<i5.a, List<d>> proxyEvents) {
            kotlin.jvm.internal.i.g(proxyEvents, "proxyEvents");
            this.f19880u = proxyEvents;
        }

        private final Object readResolve() {
            return new p(this.f19880u);
        }
    }

    public p() {
        this.f19879u = new HashMap<>();
    }

    private final Object writeReplace() {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            return new a(this.f19879u);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void a(i5.a aVar, List<d> appEvents) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.i.g(appEvents, "appEvents");
            HashMap<i5.a, List<d>> hashMap = this.f19879u;
            if (!hashMap.containsKey(aVar)) {
                hashMap.put(aVar, u.J2(appEvents));
                return;
            }
            List<d> list = hashMap.get(aVar);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public p(HashMap<i5.a, List<d>> appEventMap) {
        kotlin.jvm.internal.i.g(appEventMap, "appEventMap");
        HashMap<i5.a, List<d>> hashMap = new HashMap<>();
        this.f19879u = hashMap;
        hashMap.putAll(appEventMap);
    }
}
