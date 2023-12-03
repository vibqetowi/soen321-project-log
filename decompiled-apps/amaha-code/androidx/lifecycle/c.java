package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f2385c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2386a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2387b = new HashMap();

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f2388a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, j.b> f2389b;

        public a(HashMap hashMap) {
            this.f2389b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                j.b bVar = (j.b) entry.getValue();
                List list = (List) this.f2388a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2388a.put(bVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, p pVar, j.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i6 = bVar2.f2390a;
                        Method method = bVar2.f2391b;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    method.invoke(obj, pVar, bVar);
                                }
                            } else {
                                method.invoke(obj, pVar);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2390a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2391b;

        public b(int i6, Method method) {
            this.f2390a = i6;
            this.f2391b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2390a == bVar.f2390a && this.f2391b.getName().equals(bVar.f2391b.getName())) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f2391b.getName().hashCode() + (this.f2390a * 31);
        }
    }

    public static void c(HashMap hashMap, b bVar, j.b bVar2, Class cls) {
        j.b bVar3 = (j.b) hashMap.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2391b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            hashMap.put(bVar, bVar2);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i6;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f2389b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, j.b> entry : b(cls2).f2389b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(p.class)) {
                        i6 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i6 = 0;
                }
                j.b value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(j.b.class)) {
                        if (value == j.b.ON_ANY) {
                            i6 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i6, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2386a.put(cls, aVar);
        this.f2387b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f2386a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }
}
