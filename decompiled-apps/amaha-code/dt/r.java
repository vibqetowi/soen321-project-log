package dt;

import gt.d0;
import is.e0;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import wu.b0;
import wu.k1;
/* compiled from: UnsignedType.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<fu.e> f13432a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<fu.b, fu.b> f13433b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<fu.b, fu.b> f13434c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f13435d;

    static {
        q[] values;
        q[] values2 = q.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (q qVar : values2) {
            arrayList.add(qVar.f13430v);
        }
        f13432a = u.M2(arrayList);
        p[] values3 = p.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (p pVar : values3) {
            arrayList2.add(pVar.f13427u);
        }
        u.M2(arrayList2);
        f13433b = new HashMap<>();
        f13434c = new HashMap<>();
        e0.s0(new hs.f(p.UBYTEARRAY, fu.e.j("ubyteArrayOf")), new hs.f(p.USHORTARRAY, fu.e.j("ushortArrayOf")), new hs.f(p.UINTARRAY, fu.e.j("uintArrayOf")), new hs.f(p.ULONGARRAY, fu.e.j("ulongArrayOf")));
        q[] values4 = q.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar2 : values4) {
            linkedHashSet.add(qVar2.f13431w.j());
        }
        f13435d = linkedHashSet;
        for (q qVar3 : q.values()) {
            HashMap<fu.b, fu.b> hashMap = f13433b;
            fu.b bVar = qVar3.f13431w;
            fu.b bVar2 = qVar3.f13429u;
            hashMap.put(bVar, bVar2);
            f13434c.put(bVar2, qVar3.f13431w);
        }
    }

    public static final boolean a(b0 b0Var) {
        gt.g a10;
        if (k1.q(b0Var) || (a10 = b0Var.O0().a()) == null) {
            return false;
        }
        gt.j c10 = a10.c();
        if (!(c10 instanceof d0) || !kotlin.jvm.internal.i.b(((d0) c10).e(), n.f13390j) || !f13432a.contains(a10.getName())) {
            return false;
        }
        return true;
    }
}
