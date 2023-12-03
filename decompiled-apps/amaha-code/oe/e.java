package oe;

import android.net.Uri;
import fe.p;
import fe.s;
import fe.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: CustomClassMapper.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f27403a = new ConcurrentHashMap();

    /* compiled from: CustomClassMapper.java */
    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f27404a;

        /* renamed from: b  reason: collision with root package name */
        public final Constructor<T> f27405b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f27406c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27407d;

        /* renamed from: e  reason: collision with root package name */
        public final HashMap f27408e = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        public final HashMap f27409g = new HashMap();
        public final HashMap f = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        public final HashMap f27410h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        public final HashSet<String> f27411i = new HashSet<>();

        /* renamed from: j  reason: collision with root package name */
        public final HashSet<String> f27412j = new HashSet<>();

        /* JADX WARN: Code restructure failed: missing block: B:148:0x03b1, code lost:
            if (r19.f27408e.isEmpty() != false) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x03b3, code lost:
            r2 = r19.f27412j.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x03bd, code lost:
            if (r2.hasNext() == false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:152:0x03bf, code lost:
            r3 = r2.next();
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x03cb, code lost:
            if (r19.f27409g.containsKey(r3) != false) goto L164;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x03d3, code lost:
            if (r19.f27410h.containsKey(r3) == false) goto L159;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x03d6, code lost:
            r3 = defpackage.d.g("@DocumentId is annotated on property ", r3, " of class ");
            r3.append(r20.getName());
            r3.append(" but no field or public setter was found");
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x03f3, code lost:
            throw new java.lang.RuntimeException(r3.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x03f4, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x0404, code lost:
            throw new java.lang.RuntimeException("No properties to serialize found on class ".concat(r20.getName()));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Class<T> cls) {
            Constructor<T> constructor;
            Field[] fields;
            Field[] declaredFields;
            boolean z10;
            Method[] methodArr;
            int i6;
            String str;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            this.f27404a = cls;
            this.f27406c = cls.isAnnotationPresent(v.class);
            int i10 = 1;
            this.f27407d = !cls.isAnnotationPresent(fe.n.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.f27405b = constructor;
            Method[] methods = cls.getMethods();
            int length = methods.length;
            int i11 = 0;
            while (true) {
                String str2 = "Method ";
                if (i11 < length) {
                    Method method = methods[i11];
                    if ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(fe.i.class)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z15) {
                        String f = f(method);
                        a(f);
                        method.setAccessible(true);
                        if (!this.f.containsKey(f)) {
                            this.f.put(f, method);
                            if (method.isAnnotationPresent(s.class)) {
                                Class<?> returnType = method.getReturnType();
                                if (returnType != Date.class && returnType != sc.h.class) {
                                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                                }
                                this.f27411i.add(f(method));
                            }
                            if (method.isAnnotationPresent(fe.d.class)) {
                                d("Method", "returns", method.getReturnType());
                                this.f27412j.add(f(method));
                            }
                        } else {
                            throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                        }
                    }
                    i11++;
                } else {
                    for (Field field : cls.getFields()) {
                        if (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(fe.i.class)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (z14) {
                            a(e(field));
                            b(field);
                        }
                    }
                    Class<? super T> cls2 = cls;
                    while (true) {
                        Method[] declaredMethods = cls2.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            Method method2 = declaredMethods[i12];
                            if (!method2.getName().startsWith("set") || method2.getDeclaringClass().equals(Object.class) || Modifier.isStatic(method2.getModifiers()) || !method2.getReturnType().equals(Void.TYPE) || method2.getParameterTypes().length != i10 || method2.isAnnotationPresent(fe.i.class)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                String f2 = f(method2);
                                String str3 = (String) this.f27408e.get(f2.toLowerCase(Locale.US));
                                if (str3 != null) {
                                    if (str3.equals(f2)) {
                                        Method method3 = (Method) this.f27409g.get(f2);
                                        if (method3 == null) {
                                            method2.setAccessible(true);
                                            this.f27409g.put(f2, method2);
                                            if (!method2.isAnnotationPresent(s.class)) {
                                                if (method2.isAnnotationPresent(fe.d.class)) {
                                                    d("Method", "accepts", method2.getParameterTypes()[0]);
                                                    this.f27412j.add(f(method2));
                                                }
                                            } else {
                                                throw new IllegalArgumentException(str2 + method2.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
                                            }
                                        } else {
                                            e.f(method2.getDeclaringClass().isAssignableFrom(method3.getDeclaringClass()), "Expected override from a base class");
                                            e.f(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
                                            methodArr = declaredMethods;
                                            e.f(method3.getReturnType().equals(Void.TYPE), "Expected void return type");
                                            Class<?>[] parameterTypes = method2.getParameterTypes();
                                            Class<?>[] parameterTypes2 = method3.getParameterTypes();
                                            i6 = length2;
                                            if (parameterTypes.length == 1) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            e.f(z11, "Expected exactly one parameter");
                                            str = str2;
                                            if (parameterTypes2.length == 1) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            e.f(z12, "Expected exactly one parameter");
                                            if (method2.getName().equals(method3.getName()) && parameterTypes[0].equals(parameterTypes2[0])) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (!z13) {
                                                if (cls2 == cls) {
                                                    throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                                }
                                                throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                                            }
                                            i12++;
                                            i10 = 1;
                                            declaredMethods = methodArr;
                                            length2 = i6;
                                            str2 = str;
                                        }
                                    } else {
                                        throw new RuntimeException("Found setter on " + cls2.getName() + " with invalid case-sensitive name: " + method2.getName());
                                    }
                                }
                            }
                            methodArr = declaredMethods;
                            i6 = length2;
                            str = str2;
                            i12++;
                            i10 = 1;
                            declaredMethods = methodArr;
                            length2 = i6;
                            str2 = str;
                        }
                        String str4 = str2;
                        for (Field field2 : cls2.getDeclaredFields()) {
                            String e10 = e(field2);
                            if (this.f27408e.containsKey(e10.toLowerCase(Locale.US)) && !this.f27410h.containsKey(e10)) {
                                field2.setAccessible(true);
                                this.f27410h.put(e10, field2);
                                b(field2);
                            }
                        }
                        cls2 = cls2.getSuperclass();
                        if (cls2 == null || cls2.equals(Object.class)) {
                            break;
                        }
                        i10 = 1;
                        str2 = str4;
                    }
                }
            }
        }

        public static void d(String str, String str2, Class cls) {
            if (cls != String.class && cls != com.google.firebase.firestore.a.class) {
                throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + cls + " instead of String or DocumentReference.");
            }
        }

        public static String e(Field field) {
            String str;
            if (field.isAnnotationPresent(p.class)) {
                str = ((p) field.getAnnotation(p.class)).value();
            } else {
                str = null;
            }
            if (str == null) {
                return field.getName();
            }
            return str;
        }

        public static String f(Method method) {
            String str;
            String str2 = null;
            if (method.isAnnotationPresent(p.class)) {
                str = ((p) method.getAnnotation(p.class)).value();
            } else {
                str = null;
            }
            if (str == null) {
                String name = method.getName();
                String[] strArr = {"get", "set", "is"};
                for (int i6 = 0; i6 < 3; i6++) {
                    String str3 = strArr[i6];
                    if (name.startsWith(str3)) {
                        str2 = str3;
                    }
                }
                if (str2 != null) {
                    char[] charArray = name.substring(str2.length()).toCharArray();
                    for (int i10 = 0; i10 < charArray.length && Character.isUpperCase(charArray[i10]); i10++) {
                        charArray[i10] = Character.toLowerCase(charArray[i10]);
                    }
                    return new String(charArray);
                }
                throw new IllegalArgumentException(defpackage.c.r("Unknown Bean prefix for method: ", name));
            }
            return str;
        }

        public static Type g(Type type, Map map) {
            if (type instanceof TypeVariable) {
                Type type2 = (Type) map.get(type);
                if (type2 != null) {
                    return type2;
                }
                throw new IllegalStateException("Could not resolve type " + type);
            }
            return type;
        }

        public final void a(String str) {
            Locale locale = Locale.US;
            String str2 = (String) this.f27408e.put(str.toLowerCase(locale), str);
            if (str2 != null && !str.equals(str2)) {
                throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
            }
        }

        public final void b(Field field) {
            if (field.isAnnotationPresent(s.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != sc.h.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.f27411i.add(e(field));
            }
            if (field.isAnnotationPresent(fe.d.class)) {
                d("Field", "is", field.getType());
                this.f27412j.add(e(field));
            }
        }

        public final T c(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2, b bVar) {
            b bVar2 = bVar;
            c cVar = bVar2.f27413a;
            Class<T> cls = this.f27404a;
            Constructor<T> constructor = this.f27405b;
            if (constructor != null) {
                try {
                    T newInstance = constructor.newInstance(new Object[0]);
                    HashSet hashSet = new HashSet();
                    Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        HashMap hashMap = this.f27410h;
                        HashMap hashMap2 = this.f27409g;
                        com.google.firebase.firestore.a aVar = bVar2.f27414b;
                        if (hasNext) {
                            Map.Entry<String, Object> next = it.next();
                            String key = next.getKey();
                            c a10 = cVar.a(key);
                            if (hashMap2.containsKey(key)) {
                                Method method = (Method) hashMap2.get(key);
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                if (genericParameterTypes.length == 1) {
                                    kotlin.jvm.internal.h.D(newInstance, method, e.d(next.getValue(), g(genericParameterTypes[0], map2), new b(a10, aVar)));
                                    hashSet.add(key);
                                } else {
                                    throw e.b(a10, "Setter does not have exactly one parameter");
                                }
                            } else if (hashMap.containsKey(key)) {
                                Field field = (Field) hashMap.get(key);
                                try {
                                    field.set(newInstance, e.d(next.getValue(), g(field.getGenericType(), map2), new b(a10, aVar)));
                                    hashSet.add(key);
                                } catch (IllegalAccessException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } else {
                                StringBuilder g5 = defpackage.d.g("No setter/field for ", key, " found on class ");
                                g5.append(cls.getName());
                                String sb2 = g5.toString();
                                if (this.f27408e.containsKey(key.toLowerCase(Locale.US))) {
                                    sb2 = pl.a.f(sb2, " (fields/setters are case sensitive!)");
                                }
                                if (!this.f27406c) {
                                    if (this.f27407d) {
                                        kc.f.A(2, e.class.getSimpleName(), "%s", sb2);
                                    }
                                } else {
                                    throw new RuntimeException(sb2);
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            Iterator<String> it2 = this.f27412j.iterator();
                            while (it2.hasNext()) {
                                String next2 = it2.next();
                                if (!hashSet.contains(next2)) {
                                    c a11 = cVar.a(next2);
                                    if (hashMap2.containsKey(next2)) {
                                        Method method2 = (Method) hashMap2.get(next2);
                                        Type[] genericParameterTypes2 = method2.getGenericParameterTypes();
                                        if (genericParameterTypes2.length == 1) {
                                            if (g(genericParameterTypes2[0], map2) == String.class) {
                                                kotlin.jvm.internal.h.D(newInstance, method2, aVar.f9625a.f23275u.k());
                                            } else {
                                                kotlin.jvm.internal.h.D(newInstance, method2, aVar);
                                            }
                                        } else {
                                            throw e.b(a11, "Setter does not have exactly one parameter");
                                        }
                                    } else {
                                        Field field2 = (Field) hashMap.get(next2);
                                        try {
                                            if (field2.getType() == String.class) {
                                                field2.set(newInstance, aVar.f9625a.f23275u.k());
                                            } else {
                                                field2.set(newInstance, aVar);
                                            }
                                        } catch (IllegalAccessException e11) {
                                            throw new RuntimeException(e11);
                                        }
                                    }
                                } else {
                                    StringBuilder g10 = defpackage.d.g("'", next2, "' was found from document ");
                                    g10.append(aVar.f9625a.f23275u.h());
                                    g10.append(", cannot apply @DocumentId on this property for class ");
                                    g10.append(cls.getName());
                                    throw new RuntimeException(g10.toString());
                                }
                            }
                            return newInstance;
                        }
                    }
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                } catch (InstantiationException e13) {
                    throw new RuntimeException(e13);
                } catch (InvocationTargetException e14) {
                    throw new RuntimeException(e14);
                }
            } else {
                throw e.b(cVar, "Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
            }
        }
    }

    /* compiled from: CustomClassMapper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f27413a;

        /* renamed from: b  reason: collision with root package name */
        public final com.google.firebase.firestore.a f27414b;

        public b(c cVar, com.google.firebase.firestore.a aVar) {
            this.f27413a = cVar;
            this.f27414b = aVar;
        }
    }

    /* compiled from: CustomClassMapper.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f27415d = new c(null, null, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f27416a;

        /* renamed from: b  reason: collision with root package name */
        public final c f27417b;

        /* renamed from: c  reason: collision with root package name */
        public final String f27418c;

        public c(c cVar, String str, int i6) {
            this.f27417b = cVar;
            this.f27418c = str;
            this.f27416a = i6;
        }

        public final c a(String str) {
            return new c(this, str, this.f27416a + 1);
        }

        public final String toString() {
            int i6 = this.f27416a;
            if (i6 == 0) {
                return "";
            }
            String str = this.f27418c;
            if (i6 == 1) {
                return str;
            }
            return this.f27417b.toString() + "." + str;
        }
    }

    public static Double a(Object obj, b bVar) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        boolean z10 = obj instanceof Long;
        c cVar = bVar.f27413a;
        if (z10) {
            Long l2 = (Long) obj;
            Double valueOf = Double.valueOf(l2.doubleValue());
            if (valueOf.longValue() == l2.longValue()) {
                return valueOf;
            }
            throw b(cVar, "Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            throw b(cVar, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
    }

    public static RuntimeException b(c cVar, String str) {
        String r = defpackage.c.r("Could not deserialize object. ", str);
        if (cVar.f27416a > 0) {
            StringBuilder d10 = v.g.d(r, " (found in field '");
            d10.append(cVar.toString());
            d10.append("')");
            r = d10.toString();
        }
        return new RuntimeException(r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T c(Object obj, Class<T> cls, b bVar) {
        Field[] fields;
        sc.h hVar;
        if (obj == 0) {
            return null;
        }
        boolean isPrimitive = cls.isPrimitive();
        c cVar = bVar.f27413a;
        if (!isPrimitive && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (T) ((String) obj);
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to String");
            } else if (Date.class.isAssignableFrom(cls)) {
                if (obj instanceof Date) {
                    return (T) ((Date) obj);
                }
                if (obj instanceof sc.h) {
                    return (T) new Date((((sc.h) obj).f31450u * 1000) + (hVar.f31451v / 1000000));
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
            } else if (sc.h.class.isAssignableFrom(cls)) {
                if (obj instanceof sc.h) {
                    return (T) ((sc.h) obj);
                }
                if (obj instanceof Date) {
                    return (T) new sc.h((Date) obj);
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
            } else if (fe.a.class.isAssignableFrom(cls)) {
                if (obj instanceof fe.a) {
                    return (T) ((fe.a) obj);
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
            } else if (fe.m.class.isAssignableFrom(cls)) {
                if (obj instanceof fe.m) {
                    return (T) ((fe.m) obj);
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
            } else if (com.google.firebase.firestore.a.class.isAssignableFrom(cls)) {
                if (obj instanceof com.google.firebase.firestore.a) {
                    return (T) ((com.google.firebase.firestore.a) obj);
                }
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
            } else if (!cls.isArray()) {
                if (cls.getTypeParameters().length <= 0) {
                    if (cls.equals(Object.class)) {
                        return obj;
                    }
                    if (cls.isEnum()) {
                        if (obj instanceof String) {
                            String str = (String) obj;
                            for (Field field : cls.getFields()) {
                                if (field.isEnumConstant() && str.equals(a.e(field))) {
                                    str = field.getName();
                                    break;
                                }
                            }
                            try {
                                return (T) Enum.valueOf(cls, str);
                            } catch (IllegalArgumentException unused) {
                                throw b(cVar, "Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
                            }
                        }
                        throw b(cVar, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
                    }
                    a g5 = g(cls);
                    if (obj instanceof Map) {
                        return (T) g5.c(e(obj, bVar), Collections.emptyMap(), bVar);
                    }
                    throw b(cVar, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
                }
                throw b(cVar, "Class " + cls.getName() + " has generic type parameters");
            } else {
                throw b(cVar, "Converting to Arrays is not supported, please use Lists instead");
            }
        } else if (!Integer.class.isAssignableFrom(cls) && !Integer.TYPE.isAssignableFrom(cls)) {
            if (!Boolean.class.isAssignableFrom(cls) && !Boolean.TYPE.isAssignableFrom(cls)) {
                if (!Double.class.isAssignableFrom(cls) && !Double.TYPE.isAssignableFrom(cls)) {
                    if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
                        if (!Float.class.isAssignableFrom(cls) && !Float.TYPE.isAssignableFrom(cls)) {
                            throw b(cVar, String.format("Deserializing values to %s is not supported", cls.getSimpleName()));
                        }
                        return (T) Float.valueOf(a(obj, bVar).floatValue());
                    } else if (obj instanceof Integer) {
                        return (T) Long.valueOf(((Integer) obj).longValue());
                    } else {
                        if (obj instanceof Long) {
                            return (T) ((Long) obj);
                        }
                        if (obj instanceof Double) {
                            Double d10 = (Double) obj;
                            if (d10.doubleValue() >= -9.223372036854776E18d && d10.doubleValue() <= 9.223372036854776E18d) {
                                return (T) Long.valueOf(d10.longValue());
                            }
                            throw b(cVar, "Numeric value out of 64-bit long range: " + d10 + ". Did you mean to use a double instead of a long?");
                        }
                        throw b(cVar, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
                    }
                }
                return (T) a(obj, bVar);
            } else if (obj instanceof Boolean) {
                return (T) ((Boolean) obj);
            } else {
                throw b(cVar, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
            }
        } else if (obj instanceof Integer) {
            return (T) ((Integer) obj);
        } else {
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw b(cVar, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double doubleValue = number.doubleValue();
            if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                return (T) Integer.valueOf(number.intValue());
            }
            throw b(cVar, "Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.util.ArrayList] */
    public static <T> T d(Object obj, Type type, b bVar) {
        if (obj == null) {
            return null;
        }
        boolean z10 = type instanceof ParameterizedType;
        int i6 = 0;
        boolean z11 = true;
        c cVar = bVar.f27413a;
        if (z10) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            boolean isAssignableFrom = List.class.isAssignableFrom(cls);
            com.google.firebase.firestore.a aVar = bVar.f27414b;
            if (isAssignableFrom) {
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                if (obj instanceof List) {
                    List list = (List) obj;
                    ?? r82 = (T) new ArrayList(list.size());
                    while (i6 < list.size()) {
                        Object obj2 = list.get(i6);
                        r82.add(d(obj2, type2, new b(cVar.a("[" + i6 + "]"), aVar)));
                        i6++;
                    }
                    return r82;
                }
                throw b(cVar, "Expected a List, but got a " + obj.getClass());
            } else if (Map.class.isAssignableFrom(cls)) {
                Type type3 = parameterizedType.getActualTypeArguments()[0];
                Type type4 = parameterizedType.getActualTypeArguments()[1];
                if (type3.equals(String.class)) {
                    Map<String, Object> e10 = e(obj, bVar);
                    ?? r83 = (T) new HashMap();
                    for (Map.Entry<String, Object> entry : e10.entrySet()) {
                        r83.put(entry.getKey(), d(entry.getValue(), type4, new b(cVar.a(entry.getKey()), aVar)));
                    }
                    return r83;
                }
                throw b(cVar, "Only Maps with string keys are supported, but found Map with key type " + type3);
            } else if (!Collection.class.isAssignableFrom(cls)) {
                Map<String, Object> e11 = e(obj, bVar);
                a g5 = g(cls);
                HashMap hashMap = new HashMap();
                TypeVariable<Class<T>>[] typeParameters = g5.f27404a.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == typeParameters.length) {
                    while (i6 < typeParameters.length) {
                        hashMap.put(typeParameters[i6], actualTypeArguments[i6]);
                        i6++;
                    }
                    return (T) g5.c(e11, hashMap, bVar);
                }
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            } else {
                throw b(cVar, "Collections are not supported, please use Lists instead");
            }
        } else if (type instanceof Class) {
            return (T) c(obj, (Class) type, bVar);
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length <= 0) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (upperBounds.length <= 0) {
                        z11 = false;
                    }
                    f(z11, "Unexpected type bounds on wildcard " + type);
                    return (T) d(obj, upperBounds[0], bVar);
                }
                throw b(cVar, "Generic lower-bounded wildcard types are not supported");
            } else if (type instanceof TypeVariable) {
                Type[] bounds = ((TypeVariable) type).getBounds();
                if (bounds.length <= 0) {
                    z11 = false;
                }
                f(z11, "Unexpected type bounds on type variable " + type);
                return (T) d(obj, bounds[0], bVar);
            } else if (type instanceof GenericArrayType) {
                throw b(cVar, "Generic Arrays are not supported, please use Lists instead");
            } else {
                throw b(cVar, "Unknown type encountered: " + type);
            }
        }
    }

    public static Map<String, Object> e(Object obj, b bVar) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw b(bVar.f27413a, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    public static void f(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new RuntimeException(defpackage.c.r("Hard assert failed: ", str));
    }

    public static <T> a<T> g(Class<T> cls) {
        ConcurrentHashMap concurrentHashMap = f27403a;
        a<T> aVar = (a) concurrentHashMap.get(cls);
        if (aVar == null) {
            a<T> aVar2 = new a<>(cls);
            concurrentHashMap.put(cls, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static <T> Object h(T t3, c cVar) {
        Object obj;
        Object h10;
        if (cVar.f27416a <= 500) {
            if (t3 == null) {
                return null;
            }
            if (t3 instanceof Number) {
                if (!(t3 instanceof Long) && !(t3 instanceof Integer) && !(t3 instanceof Double) && !(t3 instanceof Float)) {
                    throw i(cVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", t3.getClass().getSimpleName()));
                }
                return t3;
            } else if (t3 instanceof String) {
                return t3;
            } else {
                if (t3 instanceof Boolean) {
                    return t3;
                }
                if (!(t3 instanceof Character)) {
                    if (t3 instanceof Map) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) t3).entrySet()) {
                            Object key = entry.getKey();
                            if (key instanceof String) {
                                String str = (String) key;
                                hashMap.put(str, h(entry.getValue(), cVar.a(str)));
                            } else {
                                throw i(cVar, "Maps with non-string keys are not supported");
                            }
                        }
                        return hashMap;
                    } else if (t3 instanceof Collection) {
                        if (t3 instanceof List) {
                            List list = (List) t3;
                            ArrayList arrayList = new ArrayList(list.size());
                            for (int i6 = 0; i6 < list.size(); i6++) {
                                Object obj2 = list.get(i6);
                                arrayList.add(h(obj2, cVar.a("[" + i6 + "]")));
                            }
                            return arrayList;
                        }
                        throw i(cVar, "Serializing Collections is not supported, please use Lists instead");
                    } else if (!t3.getClass().isArray()) {
                        if (t3 instanceof Enum) {
                            String name = ((Enum) t3).name();
                            try {
                                return a.e(t3.getClass().getField(name));
                            } catch (NoSuchFieldException unused) {
                                return name;
                            }
                        } else if (!(t3 instanceof Date) && !(t3 instanceof sc.h) && !(t3 instanceof fe.m) && !(t3 instanceof fe.a) && !(t3 instanceof com.google.firebase.firestore.a) && !(t3 instanceof fe.k)) {
                            if (!(t3 instanceof Uri) && !(t3 instanceof URI) && !(t3 instanceof URL)) {
                                a g5 = g(t3.getClass());
                                Class<?> cls = t3.getClass();
                                Class<T> cls2 = g5.f27404a;
                                if (cls2.isAssignableFrom(cls)) {
                                    HashMap hashMap2 = new HashMap();
                                    for (String str2 : g5.f27408e.values()) {
                                        if (!g5.f27412j.contains(str2)) {
                                            HashMap hashMap3 = g5.f;
                                            if (hashMap3.containsKey(str2)) {
                                                obj = kotlin.jvm.internal.h.D(t3, (Method) hashMap3.get(str2), new Object[0]);
                                            } else {
                                                Field field = (Field) g5.f27410h.get(str2);
                                                if (field != null) {
                                                    try {
                                                        obj = field.get(t3);
                                                    } catch (IllegalAccessException e10) {
                                                        throw new RuntimeException(e10);
                                                    }
                                                } else {
                                                    throw new IllegalStateException(defpackage.c.r("Bean property without field or getter: ", str2));
                                                }
                                            }
                                            if (g5.f27411i.contains(str2) && obj == null) {
                                                h10 = fe.k.f14997a;
                                            } else {
                                                h10 = h(obj, cVar.a(str2));
                                            }
                                            hashMap2.put(str2, h10);
                                        }
                                    }
                                    return hashMap2;
                                }
                                throw new IllegalArgumentException("Can't serialize object of class " + t3.getClass() + " with BeanMapper for class " + cls2);
                            }
                            return t3.toString();
                        } else {
                            return t3;
                        }
                    } else {
                        throw i(cVar, "Serializing Arrays is not supported, please use Lists instead");
                    }
                }
                throw i(cVar, "Characters are not supported, please use Strings");
            }
        }
        throw i(cVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
    }

    public static IllegalArgumentException i(c cVar, String str) {
        String r = defpackage.c.r("Could not serialize object. ", str);
        if (cVar.f27416a > 0) {
            StringBuilder d10 = v.g.d(r, " (found in field '");
            d10.append(cVar.toString());
            d10.append("')");
            r = d10.toString();
        }
        return new IllegalArgumentException(r);
    }
}
