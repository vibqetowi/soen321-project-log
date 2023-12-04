package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbk {
    public static zzbi zza(Object obj, String str, Class cls) {
        return new zzbi(obj, zzh(obj, str), cls);
    }

    public static zzbj zzb(Object obj, String str, Class cls) {
        return new zzbj(obj, zzh(obj, str), cls);
    }

    public static Object zzc(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to invoke default constructor on class %s", cls.getName()), e);
        }
    }

    public static Object zzd(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static Object zze(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(zzi(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static Object zzf(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(zzi(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
        }
    }

    public static Object zzg(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(zzi(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e);
        }
    }

    private static Field zzh(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    private static Method zzi(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
