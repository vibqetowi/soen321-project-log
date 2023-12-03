package a4;

import java.util.LinkedHashMap;
/* compiled from: IdentityContainer.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f294b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f295c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final h f296a;

    /* compiled from: IdentityContainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static e a(d dVar) {
            e eVar;
            synchronized (e.f294b) {
                LinkedHashMap linkedHashMap = e.f295c;
                String str = dVar.f289a;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new e(dVar);
                    linkedHashMap.put(str, obj);
                }
                eVar = (e) obj;
            }
            return eVar;
        }
    }

    public e(d dVar) {
        this.f296a = new h(dVar.f292d.b(dVar));
    }
}
