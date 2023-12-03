package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class q5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f8570a = Logger.getLogger(e5.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f8571b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static i5 b() {
        String format;
        ClassLoader classLoader = q5.class.getClassLoader();
        if (i5.class.equals(i5.class)) {
            format = f8571b;
        } else if (i5.class.getPackage().equals(q5.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", i5.class.getPackage().getName(), i5.class.getSimpleName());
        } else {
            throw new IllegalArgumentException(i5.class.getName());
        }
        try {
            try {
                try {
                    try {
                        return (i5) i5.class.cast(((q5) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (IllegalAccessException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(q5.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((i5) i5.class.cast(((q5) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    f8570a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(i5.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (i5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (i5) i5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract i5 a();
}
