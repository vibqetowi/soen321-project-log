package pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes2.dex */
public final class e extends b<ht.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        kotlin.jvm.internal.i.g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    public static List l(ku.g gVar) {
        if (gVar instanceof ku.b) {
            ArrayList arrayList = new ArrayList();
            for (ku.g gVar2 : (Iterable) ((ku.b) gVar).f23941a) {
                is.q.R1(l(gVar2), arrayList);
            }
            return arrayList;
        } else if (gVar instanceof ku.j) {
            return ca.a.O0(((ku.j) gVar).f23945c.h());
        } else {
            return is.w.f20676u;
        }
    }

    @Override // pt.b
    public final ArrayList a(Object obj, boolean z10) {
        Iterable l2;
        ht.c cVar = (ht.c) obj;
        kotlin.jvm.internal.i.g(cVar, "<this>");
        Map<fu.e, ku.g<?>> b10 = cVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<fu.e, ku.g<?>> entry : b10.entrySet()) {
            fu.e key = entry.getKey();
            ku.g<?> value = entry.getValue();
            if (z10 && !kotlin.jvm.internal.i.b(key, d0.f28871b)) {
                l2 = is.w.f20676u;
            } else {
                l2 = l(value);
            }
            is.q.R1(l2, arrayList);
        }
        return arrayList;
    }

    @Override // pt.b
    public final fu.c e(ht.c cVar) {
        ht.c cVar2 = cVar;
        kotlin.jvm.internal.i.g(cVar2, "<this>");
        return cVar2.e();
    }

    @Override // pt.b
    public final gt.e f(Object obj) {
        ht.c cVar = (ht.c) obj;
        kotlin.jvm.internal.i.g(cVar, "<this>");
        gt.e d10 = mu.a.d(cVar);
        kotlin.jvm.internal.i.d(d10);
        return d10;
    }

    @Override // pt.b
    public final Iterable<ht.c> g(ht.c cVar) {
        ht.h annotations;
        ht.c cVar2 = cVar;
        kotlin.jvm.internal.i.g(cVar2, "<this>");
        gt.e d10 = mu.a.d(cVar2);
        if (d10 == null || (annotations = d10.getAnnotations()) == null) {
            return is.w.f20676u;
        }
        return annotations;
    }
}
