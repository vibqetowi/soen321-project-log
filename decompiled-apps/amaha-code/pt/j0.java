package pt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: SpecialGenericSignatures.kt */
/* loaded from: classes2.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28922a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f28923b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f28924c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<a.C0488a, b> f28925d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashMap f28926e;
    public static final Set<fu.e> f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f28927g;

    /* renamed from: h  reason: collision with root package name */
    public static final a.C0488a f28928h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map<a.C0488a, fu.e> f28929i;

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashMap f28930j;

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayList f28931k;

    /* renamed from: l  reason: collision with root package name */
    public static final LinkedHashMap f28932l;

    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: pt.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0488a {

            /* renamed from: a  reason: collision with root package name */
            public final fu.e f28933a;

            /* renamed from: b  reason: collision with root package name */
            public final String f28934b;

            public C0488a(fu.e eVar, String signature) {
                kotlin.jvm.internal.i.g(signature, "signature");
                this.f28933a = eVar;
                this.f28934b = signature;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0488a)) {
                    return false;
                }
                C0488a c0488a = (C0488a) obj;
                if (kotlin.jvm.internal.i.b(this.f28933a, c0488a.f28933a) && kotlin.jvm.internal.i.b(this.f28934b, c0488a.f28934b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f28934b.hashCode() + (this.f28933a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(name=");
                sb2.append(this.f28933a);
                sb2.append(", signature=");
                return v.g.c(sb2, this.f28934b, ')');
            }
        }

        public static final C0488a a(a aVar, String internalName, String str, String str2, String str3) {
            aVar.getClass();
            fu.e j10 = fu.e.j(str);
            String jvmDescriptor = str + '(' + str2 + ')' + str3;
            kotlin.jvm.internal.i.g(internalName, "internalName");
            kotlin.jvm.internal.i.g(jvmDescriptor, "jvmDescriptor");
            return new C0488a(j10, internalName + '.' + jvmDescriptor);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: v  reason: collision with root package name */
        public static final b f28935v;

        /* renamed from: w  reason: collision with root package name */
        public static final b f28936w;

        /* renamed from: x  reason: collision with root package name */
        public static final b f28937x;

        /* renamed from: y  reason: collision with root package name */
        public static final a f28938y;

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ b[] f28939z;

        /* renamed from: u  reason: collision with root package name */
        public final Object f28940u;

        /* compiled from: SpecialGenericSignatures.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public a() {
                super(3, null, "MAP_GET_OR_DEFAULT");
            }
        }

        static {
            b bVar = new b(0, null, "NULL");
            f28935v = bVar;
            b bVar2 = new b(1, -1, "INDEX");
            f28936w = bVar2;
            b bVar3 = new b(2, Boolean.FALSE, "FALSE");
            f28937x = bVar3;
            a aVar = new a();
            f28938y = aVar;
            f28939z = new b[]{bVar, bVar2, bVar3, aVar};
        }

        public b(int i6, Object obj, String str) {
            this.f28940u = obj;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28939z.clone();
        }
    }

    static {
        Set<String> m12 = ca.a.m1("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(is.i.H1(m12, 10));
        for (String str : m12) {
            a aVar = f28922a;
            String h10 = nu.c.BOOLEAN.h();
            kotlin.jvm.internal.i.f(h10, "BOOLEAN.desc");
            arrayList.add(a.a(aVar, "java/util/Collection", str, "Ljava/util/Collection;", h10));
        }
        f28923b = arrayList;
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0488a) it.next()).f28934b);
        }
        f28924c = arrayList2;
        ArrayList arrayList3 = f28923b;
        ArrayList arrayList4 = new ArrayList(is.i.H1(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0488a) it2.next()).f28933a.f());
        }
        a aVar2 = f28922a;
        String concat = "java/util/".concat("Collection");
        nu.c cVar = nu.c.BOOLEAN;
        String h11 = cVar.h();
        kotlin.jvm.internal.i.f(h11, "BOOLEAN.desc");
        a.C0488a a10 = a.a(aVar2, concat, "contains", "Ljava/lang/Object;", h11);
        b bVar = b.f28937x;
        String concat2 = "java/util/".concat("Collection");
        String h12 = cVar.h();
        kotlin.jvm.internal.i.f(h12, "BOOLEAN.desc");
        String concat3 = "java/util/".concat("Map");
        String h13 = cVar.h();
        kotlin.jvm.internal.i.f(h13, "BOOLEAN.desc");
        String concat4 = "java/util/".concat("Map");
        String h14 = cVar.h();
        kotlin.jvm.internal.i.f(h14, "BOOLEAN.desc");
        String concat5 = "java/util/".concat("Map");
        String h15 = cVar.h();
        kotlin.jvm.internal.i.f(h15, "BOOLEAN.desc");
        a.C0488a a11 = a.a(aVar2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        b bVar2 = b.f28935v;
        String concat6 = "java/util/".concat("List");
        nu.c cVar2 = nu.c.INT;
        String h16 = cVar2.h();
        kotlin.jvm.internal.i.f(h16, "INT.desc");
        a.C0488a a12 = a.a(aVar2, concat6, "indexOf", "Ljava/lang/Object;", h16);
        b bVar3 = b.f28936w;
        String concat7 = "java/util/".concat("List");
        String h17 = cVar2.h();
        kotlin.jvm.internal.i.f(h17, "INT.desc");
        Map<a.C0488a, b> u02 = is.e0.u0(new hs.f(a10, bVar), new hs.f(a.a(aVar2, concat2, "remove", "Ljava/lang/Object;", h12), bVar), new hs.f(a.a(aVar2, concat3, "containsKey", "Ljava/lang/Object;", h13), bVar), new hs.f(a.a(aVar2, concat4, "containsValue", "Ljava/lang/Object;", h14), bVar), new hs.f(a.a(aVar2, concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", h15), bVar), new hs.f(a.a(aVar2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), b.f28938y), new hs.f(a11, bVar2), new hs.f(a.a(aVar2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), bVar2), new hs.f(a12, bVar3), new hs.f(a.a(aVar2, concat7, "lastIndexOf", "Ljava/lang/Object;", h17), bVar3));
        f28925d = u02;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sp.b.P(u02.size()));
        Iterator<T> it3 = u02.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0488a) entry.getKey()).f28934b, entry.getValue());
        }
        f28926e = linkedHashMap;
        LinkedHashSet<a.C0488a> I1 = is.h0.I1(f28925d.keySet(), f28923b);
        ArrayList arrayList5 = new ArrayList(is.i.H1(I1, 10));
        for (a.C0488a c0488a : I1) {
            arrayList5.add(c0488a.f28933a);
        }
        f = is.u.M2(arrayList5);
        ArrayList arrayList6 = new ArrayList(is.i.H1(I1, 10));
        for (a.C0488a c0488a2 : I1) {
            arrayList6.add(c0488a2.f28934b);
        }
        f28927g = is.u.M2(arrayList6);
        a aVar3 = f28922a;
        nu.c cVar3 = nu.c.INT;
        String h18 = cVar3.h();
        kotlin.jvm.internal.i.f(h18, "INT.desc");
        a.C0488a a13 = a.a(aVar3, "java/util/List", "removeAt", h18, "Ljava/lang/Object;");
        f28928h = a13;
        String concat8 = "java/lang/".concat("Number");
        String h19 = nu.c.BYTE.h();
        kotlin.jvm.internal.i.f(h19, "BYTE.desc");
        String concat9 = "java/lang/".concat("Number");
        String h20 = nu.c.SHORT.h();
        kotlin.jvm.internal.i.f(h20, "SHORT.desc");
        String concat10 = "java/lang/".concat("Number");
        String h21 = cVar3.h();
        kotlin.jvm.internal.i.f(h21, "INT.desc");
        String concat11 = "java/lang/".concat("Number");
        String h22 = nu.c.LONG.h();
        kotlin.jvm.internal.i.f(h22, "LONG.desc");
        String concat12 = "java/lang/".concat("Number");
        String h23 = nu.c.FLOAT.h();
        kotlin.jvm.internal.i.f(h23, "FLOAT.desc");
        String concat13 = "java/lang/".concat("Number");
        String h24 = nu.c.DOUBLE.h();
        kotlin.jvm.internal.i.f(h24, "DOUBLE.desc");
        String concat14 = "java/lang/".concat("CharSequence");
        String h25 = cVar3.h();
        kotlin.jvm.internal.i.f(h25, "INT.desc");
        String h26 = nu.c.CHAR.h();
        kotlin.jvm.internal.i.f(h26, "CHAR.desc");
        Map<a.C0488a, fu.e> u03 = is.e0.u0(new hs.f(a.a(aVar3, concat8, "toByte", "", h19), fu.e.j("byteValue")), new hs.f(a.a(aVar3, concat9, "toShort", "", h20), fu.e.j("shortValue")), new hs.f(a.a(aVar3, concat10, "toInt", "", h21), fu.e.j("intValue")), new hs.f(a.a(aVar3, concat11, "toLong", "", h22), fu.e.j("longValue")), new hs.f(a.a(aVar3, concat12, "toFloat", "", h23), fu.e.j("floatValue")), new hs.f(a.a(aVar3, concat13, "toDouble", "", h24), fu.e.j("doubleValue")), new hs.f(a13, fu.e.j("remove")), new hs.f(a.a(aVar3, concat14, "get", h25, h26), fu.e.j("charAt")));
        f28929i = u03;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sp.b.P(u03.size()));
        Iterator<T> it4 = u03.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            linkedHashMap2.put(((a.C0488a) entry2.getKey()).f28934b, entry2.getValue());
        }
        f28930j = linkedHashMap2;
        Set<a.C0488a> keySet = f28929i.keySet();
        ArrayList arrayList7 = new ArrayList(is.i.H1(keySet, 10));
        for (a.C0488a c0488a3 : keySet) {
            arrayList7.add(c0488a3.f28933a);
        }
        f28931k = arrayList7;
        Set<Map.Entry<a.C0488a, fu.e>> entrySet = f28929i.entrySet();
        ArrayList arrayList8 = new ArrayList(is.i.H1(entrySet, 10));
        Iterator<T> it5 = entrySet.iterator();
        while (it5.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it5.next();
            arrayList8.add(new hs.f(((a.C0488a) entry3.getKey()).f28933a, entry3.getValue()));
        }
        int P = sp.b.P(is.i.H1(arrayList8, 10));
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(P);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            hs.f fVar = (hs.f) it6.next();
            linkedHashMap3.put((fu.e) fVar.f19465v, (fu.e) fVar.f19464u);
        }
        f28932l = linkedHashMap3;
    }
}
