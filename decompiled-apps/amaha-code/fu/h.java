package fu;

import is.h0;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: StandardClassIds.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15939a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f15940b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f15941c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f15942d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f15943e;
    public static final c f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f15944g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f15945h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f15946i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f15947j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f15948k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f15949l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f15950m;

    /* renamed from: n  reason: collision with root package name */
    public static final Set<b> f15951n;

    /* renamed from: o  reason: collision with root package name */
    public static final Set<b> f15952o;

    /* renamed from: p  reason: collision with root package name */
    public static final b f15953p;

    /* renamed from: q  reason: collision with root package name */
    public static final b f15954q;
    public static final b r;

    static {
        c cVar = new c("kotlin");
        f15939a = cVar;
        c c10 = cVar.c(e.j("reflect"));
        f15940b = c10;
        c c11 = cVar.c(e.j("collections"));
        f15941c = c11;
        c c12 = cVar.c(e.j("ranges"));
        f15942d = c12;
        cVar.c(e.j("jvm")).c(e.j("internal"));
        c c13 = cVar.c(e.j("annotation"));
        f15943e = c13;
        c c14 = cVar.c(e.j("internal"));
        c14.c(e.j("ir"));
        c c15 = cVar.c(e.j("coroutines"));
        f = c15;
        ca.a.m1(cVar, c11, c12, c13, c10, c14, c15);
        i.a("Nothing");
        i.a("Unit");
        i.a("Any");
        i.a("Enum");
        i.a("Annotation");
        f15944g = i.a("Array");
        b a10 = i.a("Boolean");
        b a11 = i.a("Char");
        b a12 = i.a("Byte");
        b a13 = i.a("Short");
        b a14 = i.a("Int");
        b a15 = i.a("Long");
        b a16 = i.a("Float");
        b a17 = i.a("Double");
        f15945h = i.g(a12);
        f15946i = i.g(a13);
        f15947j = i.g(a14);
        f15948k = i.g(a15);
        f15949l = i.a("String");
        i.a("Throwable");
        i.a("Cloneable");
        i.f("KProperty");
        i.f("KMutableProperty");
        i.f("KProperty0");
        i.f("KMutableProperty0");
        i.f("KProperty1");
        i.f("KMutableProperty1");
        i.f("KProperty2");
        i.f("KMutableProperty2");
        f15950m = i.f("KFunction");
        i.f("KClass");
        i.f("KCallable");
        i.a("Comparable");
        i.a("Number");
        i.a("Function");
        Set<b> m12 = ca.a.m1(a10, a11, a12, a13, a14, a15, a16, a17);
        f15951n = m12;
        int P = sp.b.P(is.i.H1(m12, 10));
        int i6 = 16;
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        for (Object obj : m12) {
            e j10 = ((b) obj).j();
            kotlin.jvm.internal.i.f(j10, "id.shortClassName");
            linkedHashMap.put(obj, i.d(j10));
        }
        i.c(linkedHashMap);
        Set<b> m13 = ca.a.m1(f15945h, f15946i, f15947j, f15948k);
        f15952o = m13;
        int P2 = sp.b.P(is.i.H1(m13, 10));
        if (P2 >= 16) {
            i6 = P2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
        for (Object obj2 : m13) {
            e j11 = ((b) obj2).j();
            kotlin.jvm.internal.i.f(j11, "id.shortClassName");
            linkedHashMap2.put(obj2, i.d(j11));
        }
        i.c(linkedHashMap2);
        h0.H1(h0.I1(f15951n, f15952o), f15949l);
        c cVar2 = f;
        e j12 = e.j("Continuation");
        if (cVar2 != null) {
            c.j(j12);
            i.b("Iterator");
            i.b("Iterable");
            i.b("Collection");
            i.b("List");
            i.b("ListIterator");
            i.b("Set");
            b b10 = i.b("Map");
            i.b("MutableIterator");
            i.b("MutableIterable");
            i.b("MutableCollection");
            f15953p = i.b("MutableList");
            i.b("MutableListIterator");
            f15954q = i.b("MutableSet");
            b b11 = i.b("MutableMap");
            r = b11;
            b10.d(e.j("Entry"));
            b11.d(e.j("MutableEntry"));
            i.a("Result");
            i.e("IntRange");
            i.e("LongRange");
            i.e("CharRange");
            c cVar3 = f15943e;
            e j13 = e.j("AnnotationRetention");
            if (cVar3 != null) {
                c.j(j13);
                c.j(e.j("AnnotationTarget"));
                return;
            }
            b.a(3);
            throw null;
        }
        b.a(3);
        throw null;
    }
}
