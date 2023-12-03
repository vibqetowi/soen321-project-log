package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
/* compiled from: ServiceProviders.java */
/* loaded from: classes2.dex */
public final class p {

    /* compiled from: ServiceProviders.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        boolean a(T t3);

        int b(T t3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    public static List a(Class cls, List list, ClassLoader classLoader, a aVar) {
        boolean z10;
        ?? load;
        Object obj;
        try {
            Class.forName("android.app.Application", false, classLoader);
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        if (z10) {
            load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    obj = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused2) {
                    obj = null;
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } else {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            if (aVar.a(obj2)) {
                arrayList.add(obj2);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new o(aVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
