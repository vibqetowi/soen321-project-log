package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f2415a = ca.a.P0(Application.class, d0.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f2416b = ca.a.O0(d0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> signature) {
        kotlin.jvm.internal.i.g(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.i.f(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            kotlin.jvm.internal.i.f(parameterTypes, "constructor.parameterTypes");
            List i22 = is.k.i2(parameterTypes);
            if (kotlin.jvm.internal.i.b(signature, i22)) {
                return constructor2;
            }
            if (signature.size() == i22.size() && i22.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends l0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(defpackage.b.l("Failed to access ", cls), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(defpackage.b.l("An exception happened in constructor of ", cls), e12.getCause());
        }
    }
}
