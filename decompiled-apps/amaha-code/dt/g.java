package dt;

import dt.j;
import java.util.EnumMap;
import java.util.HashMap;
import wu.i0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes2.dex */
public final class g implements ss.a<j.a> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f13356u;

    public g(j jVar) {
        this.f13356u = jVar;
    }

    @Override // ss.a
    public final j.a invoke() {
        k[] values;
        EnumMap enumMap = new EnumMap(k.class);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (k kVar : k.values()) {
            String f = kVar.f13370u.f();
            j jVar = this.f13356u;
            i0 b10 = j.b(jVar, f);
            i0 b11 = j.b(jVar, kVar.f13371v.f());
            enumMap.put((EnumMap) kVar, (k) b11);
            hashMap.put(b10, b11);
            hashMap2.put(b11, b10);
        }
        return new j.a(enumMap, hashMap, hashMap2);
    }
}
