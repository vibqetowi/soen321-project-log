package j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;
/* loaded from: classes3.dex */
public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f21081a;

    /* renamed from: b  reason: collision with root package name */
    private static final Field f21082b;

    /* renamed from: c  reason: collision with root package name */
    private static final Field f21083c;

    /* renamed from: d  reason: collision with root package name */
    private static final Constructor f21084d;

    /* renamed from: e  reason: collision with root package name */
    private static final Constructor f21085e;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f21081a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f21082b = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f21083c = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f21085e = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f21084d = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f21082b;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f21083c.get(collection);
                return collection2 instanceof InterfaceC0715c ? ((InterfaceC0715c) collection2).removeIf(predicate) : AbstractC0714b.f(collection2, predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        }
        try {
            synchronized (field.get(collection)) {
                Collection collection3 = (Collection) f21083c.get(collection);
                removeIf = collection3 instanceof InterfaceC0715c ? ((InterfaceC0715c) collection3).removeIf(predicate) : AbstractC0714b.f(collection3, predicate);
            }
            return removeIf;
        } catch (IllegalAccessException e11) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0720h(map);
    }
}
