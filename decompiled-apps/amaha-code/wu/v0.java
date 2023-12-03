package wu;

import cv.u;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
/* compiled from: TypeAttributes.kt */
/* loaded from: classes2.dex */
public final class v0 extends cv.d<t0<?>, t0<?>> {

    /* renamed from: v  reason: collision with root package name */
    public static final a f37300v = new a(0);

    /* renamed from: w  reason: collision with root package name */
    public static final v0 f37301w = new v0(is.w.f20676u);

    /* compiled from: TypeAttributes.kt */
    /* loaded from: classes2.dex */
    public static final class a extends cv.u<t0<?>, t0<?>> {
        public a(int i6) {
        }

        public static v0 c(List list) {
            if (list.isEmpty()) {
                return v0.f37301w;
            }
            return new v0(list);
        }

        @Override // cv.u
        public final int a(ConcurrentHashMap concurrentHashMap, ys.d kClass, u.a aVar) {
            int intValue;
            kotlin.jvm.internal.i.g(concurrentHashMap, "<this>");
            kotlin.jvm.internal.i.g(kClass, "kClass");
            Integer num = (Integer) concurrentHashMap.get(kClass);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = (Integer) concurrentHashMap.get(kClass);
                    if (num2 == null) {
                        Object invoke = aVar.invoke(kClass);
                        concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(((Number) invoke).intValue()));
                        num2 = (Integer) invoke;
                    }
                    kotlin.jvm.internal.i.f(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }
    }

    public v0() {
        throw null;
    }

    public v0(List<? extends t0<?>> list) {
        for (t0<?> t0Var : list) {
            ys.d<? extends Object> tClass = t0Var.b();
            kotlin.jvm.internal.i.g(tClass, "tClass");
            int b10 = f37300v.b(tClass);
            int g5 = this.f12057u.g();
            if (g5 != 0) {
                if (g5 == 1) {
                    ts.a aVar = this.f12057u;
                    kotlin.jvm.internal.i.e(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    cv.q qVar = (cv.q) aVar;
                    if (qVar.f12077v == b10) {
                        this.f12057u = new cv.q(b10, t0Var);
                    } else {
                        cv.c cVar = new cv.c();
                        this.f12057u = cVar;
                        cVar.m(qVar.f12077v, qVar.f12076u);
                    }
                }
                this.f12057u.m(b10, t0Var);
            } else {
                this.f12057u = new cv.q(b10, t0Var);
            }
        }
    }
}
