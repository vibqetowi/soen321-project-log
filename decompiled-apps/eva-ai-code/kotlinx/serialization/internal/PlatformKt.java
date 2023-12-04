package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0007\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0002¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a$\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0000\u001aM\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00052\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0007\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0002\u0010\b\u001aM\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\f2\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0007\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0002\u0010\u0010\u001a$\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a$\u0010\u0012\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a&\u0010\u0013\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\u0015\u0010\u0013\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0080\b\u001a$\u0010\u0018\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\n*\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\fH\u0000\u001a\u001c\u0010\u001b\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\fH\u0000\u001a$\u0010\u001e\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a\u0010\u0010\u001f\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\u0005H\u0000\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010!*\u0004\u0018\u0001H\u0002*\u0012\u0012\u0004\u0012\u0002H!0\"j\b\u0012\u0004\u0012\u0002H!`#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0000¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"invokeSerializerOnCompanion", "Lkotlinx/serialization/KSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "", "jClass", "Ljava/lang/Class;", "args", "", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "isReferenceArray", "", "rootClass", "Lkotlin/reflect/KClass;", "companionOrNull", "compiledSerializerImpl", "constructSerializerForGivenTypeArgs", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "createEnumSerializer", "findObjectSerializer", "getChecked", FirebaseAnalytics.Param.INDEX, "", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "interfaceSerializer", "isInstanceOf", "kclass", "isNotAnnotated", "platformSpecificSerializerNotRegistered", "", "polymorphicSerializer", "serializerNotRegistered", "toNativeArrayImpl", ExifInterface.LONGITUDE_EAST, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlatformKt {
    public static final <T> T getChecked(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    public static final boolean getChecked(boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, new KSerializer[0]);
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, KClass<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance(JvmClassMappingKt.getJavaClass((KClass) eClass), arrayList.size());
        if (newInstance != null) {
            E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
            Intrinsics.checkNotNullExpressionValue(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
            return eArr;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        throw new SerializationException("Serializer for class '" + cls.getSimpleName() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> kClass, KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass((KClass) kClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r3 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> cls, KSerializer<Object>... args) {
        Field field;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        if (cls.isInterface()) {
            return interfaceSerializer(cls);
        }
        KSerializer<T> invokeSerializerOnCompanion = invokeSerializerOnCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (invokeSerializerOnCompanion != null) {
            return invokeSerializerOnCompanion;
        }
        KSerializer<T> findObjectSerializer = findObjectSerializer(cls);
        if (findObjectSerializer != null) {
            return findObjectSerializer;
        }
        KSerializer<T> kSerializer = null;
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
            Class<?>[] clsArr = declaredClasses;
            int length = clsArr.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = clsArr[i];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                kSerializer = (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return kSerializer != null ? kSerializer : polymorphicSerializer(cls);
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> KSerializer<T> polymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(Polymorphic.class) != null) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
        }
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        if (serializable == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return null;
        }
        return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
    }

    private static final <T> KSerializer<T> interfaceSerializer(Class<T> cls) {
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        if (serializable == null || Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        Object companionOrNull = companionOrNull(cls);
        if (companionOrNull == null) {
            return null;
        }
        try {
            if (!(kSerializerArr.length == 0)) {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            } else {
                clsArr = new Class[0];
            }
            Object invoke = companionOrNull.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(companionOrNull, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Object companionOrNull(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        if (enumConstants != null) {
            EnumSerializer enumSerializer = new EnumSerializer(canonicalName, (Enum[]) enumConstants);
            if (enumSerializer instanceof KSerializer) {
                return enumSerializer;
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> KSerializer<T> findObjectSerializer(Class<T> cls) {
        boolean z;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        Field[] fieldArr = declaredFields;
        int length = fieldArr.length;
        Field field = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i < length) {
                Field field2 = fieldArr[i];
                Field field3 = field2;
                if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    field = field2;
                }
                i++;
            }
        }
        field = null;
        Field field4 = field;
        if (field4 == null) {
            return null;
        }
        Object obj = field4.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        Method[] methodArr = methods;
        int length2 = methodArr.length;
        Method method = null;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 < length2) {
                Method method2 = methodArr[i2];
                Method method3 = method2;
                if (Intrinsics.areEqual(method3.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method3.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if ((parameterTypes.length == 0) && Intrinsics.areEqual(method3.getReturnType(), KSerializer.class)) {
                        z = true;
                        if (z) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            method = method2;
                        }
                        i2++;
                    }
                }
                z = false;
                if (z) {
                }
                i2++;
            }
        }
        method = null;
        Method method4 = method;
        if (method4 == null) {
            return null;
        }
        Object invoke = method4.invoke(obj, new Object[0]);
        if (invoke instanceof KSerializer) {
            return (KSerializer) invoke;
        }
        return null;
    }

    public static final boolean isInstanceOf(Object obj, KClass<?> kclass) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        return JvmClassMappingKt.getJavaObjectType(kclass).isInstance(obj);
    }

    public static final boolean isReferenceArray(KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass((KClass) rootClass).isArray();
    }
}
