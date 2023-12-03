package pt;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import vu.c;
/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes2.dex */
public final class g0<T> implements f0<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Map<fu.c, T> f28904b;

    /* renamed from: c  reason: collision with root package name */
    public final c.j f28905c = new vu.c("Java nullability annotation states").b(new a(this));

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<fu.c, T> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g0<T> f28906u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<T> g0Var) {
            super(1);
            this.f28906u = g0Var;
        }

        @Override // ss.l
        public final Object invoke(fu.c cVar) {
            T next;
            fu.c it = cVar;
            kotlin.jvm.internal.i.f(it, "it");
            Map<fu.c, T> values = this.f28906u.f28904b;
            kotlin.jvm.internal.i.g(values, "values");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<fu.c, T>> it2 = values.entrySet().iterator();
            while (true) {
                boolean z10 = true;
                fu.c cVar2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<fu.c, T> next2 = it2.next();
                fu.c packageName = next2.getKey();
                if (!kotlin.jvm.internal.i.b(it, packageName)) {
                    kotlin.jvm.internal.i.g(packageName, "packageName");
                    if (!it.d()) {
                        cVar2 = it.e();
                    }
                    if (!kotlin.jvm.internal.i.b(cVar2, packageName)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    linkedHashMap.put(next2.getKey(), next2.getValue());
                }
            }
            if (!(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                return null;
            }
            Iterator<T> it3 = linkedHashMap.entrySet().iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                if (it3.hasNext()) {
                    int length = sp.b.c0((fu.c) ((Map.Entry) next).getKey(), it).b().length();
                    do {
                        T next3 = it3.next();
                        int length2 = sp.b.c0((fu.c) ((Map.Entry) next3).getKey(), it).b().length();
                        if (length > length2) {
                            next = next3;
                            length = length2;
                        }
                    } while (it3.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(Map<fu.c, ? extends T> map) {
        this.f28904b = map;
    }
}
