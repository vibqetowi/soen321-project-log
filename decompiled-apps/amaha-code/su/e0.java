package su;

import gt.q0;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class e0 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final cu.c f31999a;

    /* renamed from: b  reason: collision with root package name */
    public final cu.a f32000b;

    /* renamed from: c  reason: collision with root package name */
    public final ss.l<fu.b, q0> f32001c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f32002d;

    public e0(au.l lVar, cu.d dVar, cu.a aVar, r rVar) {
        this.f31999a = dVar;
        this.f32000b = aVar;
        this.f32001c = rVar;
        List<au.b> list = lVar.A;
        kotlin.jvm.internal.i.f(list, "proto.class_List");
        int P = sp.b.P(is.i.H1(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(P < 16 ? 16 : P);
        for (Object obj : list) {
            linkedHashMap.put(ta.v.w(this.f31999a, ((au.b) obj).f3668y), obj);
        }
        this.f32002d = linkedHashMap;
    }

    @Override // su.i
    public final h a(fu.b classId) {
        kotlin.jvm.internal.i.g(classId, "classId");
        au.b bVar = (au.b) this.f32002d.get(classId);
        if (bVar == null) {
            return null;
        }
        return new h(this.f31999a, bVar, this.f32000b, this.f32001c.invoke(classId));
    }
}
