package x4;

import java.lang.reflect.InvocationTargetException;
/* compiled from: ManifestParser.java */
@Deprecated
/* loaded from: classes.dex */
public final class e {
    public static c a(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e10) {
                b(cls4, e10);
                throw null;
            } catch (InstantiationException e11) {
                b(cls3, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                b(cls2, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                b(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(defpackage.b.l("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }
}
