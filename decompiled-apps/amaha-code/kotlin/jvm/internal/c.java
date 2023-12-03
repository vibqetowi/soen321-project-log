package kotlin.jvm.internal;

import is.e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassReference.kt */
/* loaded from: classes2.dex */
public final class c implements ys.d<Object>, b {

    /* renamed from: v  reason: collision with root package name */
    public static final Map<Class<? extends hs.a<?>>, Integer> f23455v;

    /* renamed from: w  reason: collision with root package name */
    public static final HashMap<String, String> f23456w;

    /* renamed from: x  reason: collision with root package name */
    public static final LinkedHashMap f23457x;

    /* renamed from: u  reason: collision with root package name */
    public final Class<?> f23458u;

    static {
        int i6 = 0;
        List P0 = ca.a.P0(ss.a.class, ss.l.class, ss.p.class, ss.q.class, ss.r.class, ss.s.class, ss.t.class, ss.u.class, ss.v.class, ss.w.class, ss.b.class, ss.c.class, ss.d.class, ss.e.class, ss.f.class, ss.g.class, ss.h.class, ss.i.class, ss.j.class, ss.k.class, ss.m.class, ss.n.class, ss.o.class);
        ArrayList arrayList = new ArrayList(is.i.H1(P0, 10));
        for (Object obj : P0) {
            int i10 = i6 + 1;
            if (i6 >= 0) {
                arrayList.add(new hs.f((Class) obj, Integer.valueOf(i6)));
                i6 = i10;
            } else {
                ca.a.t1();
                throw null;
            }
        }
        f23455v = e0.w0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.f(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            i.f(kotlinName, "kotlinName");
            sb2.append(gv.r.e1(kotlinName, '.'));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), kotlinName.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends hs.a<?>>, Integer> entry : f23455v.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f23456w = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sp.b.P(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), gv.r.e1((String) entry2.getValue(), '.'));
        }
        f23457x = linkedHashMap;
    }

    public c(Class<?> jClass) {
        i.g(jClass, "jClass");
        this.f23458u = jClass;
    }

    @Override // ys.d
    public final String c() {
        String str;
        Class<?> jClass = this.f23458u;
        i.g(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        HashMap<String, String> hashMap = f23456w;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = hashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getCanonicalName();
        }
        return str3;
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> e() {
        return this.f23458u;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && i.b(sp.b.D(this), sp.b.D((ys.d) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return sp.b.D(this).hashCode();
    }

    @Override // ys.d
    public final String i() {
        String str;
        Class<?> jClass = this.f23458u;
        i.g(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return gv.r.c1(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return gv.r.c1(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return gv.r.d1(simpleName, '$');
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f23457x;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final String toString() {
        return this.f23458u.toString() + " (Kotlin reflection is not available)";
    }
}
