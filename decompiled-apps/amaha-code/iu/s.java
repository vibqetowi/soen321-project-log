package iu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: overridingUtils.kt */
/* loaded from: classes2.dex */
public final class s {

    /* compiled from: overridingUtils.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<H, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ dv.e<H> f20715u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dv.e<H> eVar) {
            super(1);
            this.f20715u = eVar;
        }

        @Override // ss.l
        public final hs.k invoke(Object it) {
            kotlin.jvm.internal.i.f(it, "it");
            this.f20715u.add(it);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, ss.l<? super H, ? extends gt.a> descriptorByHandle) {
        kotlin.jvm.internal.i.g(collection, "<this>");
        kotlin.jvm.internal.i.g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        dv.e eVar = new dv.e();
        while (!linkedList.isEmpty()) {
            Object g22 = is.u.g2(linkedList);
            dv.e eVar2 = new dv.e();
            ArrayList g5 = l.g(g22, linkedList, descriptorByHandle, new a(eVar2));
            if (g5.size() == 1 && eVar2.isEmpty()) {
                Object x22 = is.u.x2(g5);
                kotlin.jvm.internal.i.f(x22, "overridableGroup.single()");
                eVar.add(x22);
            } else {
                Object obj = (Object) l.s(g5, descriptorByHandle);
                gt.a invoke = descriptorByHandle.invoke(obj);
                Iterator it = g5.iterator();
                while (it.hasNext()) {
                    Object it2 = (Object) it.next();
                    kotlin.jvm.internal.i.f(it2, "it");
                    if (!l.k(invoke, descriptorByHandle.invoke(it2))) {
                        eVar2.add(it2);
                    }
                }
                if (!eVar2.isEmpty()) {
                    eVar.addAll(eVar2);
                }
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
