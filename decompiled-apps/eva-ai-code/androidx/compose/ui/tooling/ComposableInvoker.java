package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.PreviewLogger;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: ComposableInvoker.kt */
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J1\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fH\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J=\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\f\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u0002H\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0082\b¢\u0006\u0002\u0010\u001dJ5\u0010\u001e\u001a\u00020\u001f*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010 J9\u0010!\u001a\u00020\u001f*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0015\u001a\u00020\u00142\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\f\"\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\rH\u0002J=\u0010$\u001a\u0004\u0018\u00010\u0001*\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "()V", "BITS_PER_INT", "", "SLOTS_PER_INT", "changedParamCount", "realValueParams", "thisParams", "compatibleTypes", "", "methodTypes", "", "Ljava/lang/Class;", "actualTypes", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "defaultParamCount", "invokeComposable", "", "className", "", "methodName", "composer", "Landroidx/compose/runtime/Composer;", "args", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "dup", ExifInterface.GPS_DIRECTION_TRUE, "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "findComposableMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "getDeclaredCompatibleMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getDefaultValue", "invokeComposableMethod", "instance", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();
    private static final int SLOTS_PER_INT = 10;

    private ComposableInvoker() {
    }

    private final boolean compatibleTypes(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z;
        if (clsArr.length == clsArr2.length) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList.add(Boolean.valueOf(clsArr[i].isAssignableFrom(clsArr2[i2])));
                i++;
                i2++;
            }
            ArrayList<Boolean> arrayList2 = arrayList;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                for (Boolean bool : arrayList2) {
                    if (!bool.booleanValue()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            return z;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (kotlin.text.StringsKt.startsWith$default(r6, r11 + org.apache.commons.codec.language.Soundex.SILENT_MARKER, false, 2, (java.lang.Object) null) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[LOOP:0: B:3:0x0015->B:15:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Method getDeclaredCompatibleMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        boolean z;
        Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
        Method[] methodArr = declaredMethods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methodArr[i];
            Method method3 = method2;
            if (!Intrinsics.areEqual(str, method3.getName())) {
                String name = method3.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
            }
            ComposableInvoker composableInvoker = INSTANCE;
            Class<?>[] parameterTypes = method3.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
            if (composableInvoker.compatibleTypes(parameterTypes, clsArr2)) {
                z = true;
                if (!z) {
                    method = method2;
                    break;
                }
                i++;
            }
            z = false;
            if (!z) {
            }
        }
        Method method4 = method;
        if (method4 != null) {
            return method4;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final /* synthetic */ <T> T[] dup(T t, int i) {
        IntRange until = RangesKt.until(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(t);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[Catch: ReflectiveOperationException -> 0x00d0, LOOP:2: B:19:0x0090->B:29:0x00c9, LOOP_END, TryCatch #1 {ReflectiveOperationException -> 0x00d0, blocks: (B:18:0x0083, B:20:0x0092, B:22:0x00a1, B:31:0x00cd, B:29:0x00c9), top: B:39:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) {
        Method method;
        Method method2;
        boolean z;
        Method method3 = null;
        try {
            try {
                int changedParamCount = changedParamCount(objArr.length, 0);
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                ArrayList arrayList = new ArrayList();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    Class<?> cls2 = obj != null ? obj.getClass() : null;
                    if (cls2 != null) {
                        arrayList.add(cls2);
                    }
                }
                spreadBuilder.addSpread(arrayList.toArray(new Class[0]));
                spreadBuilder.add(Composer.class);
                Class cls3 = Integer.TYPE;
                IntRange until = RangesKt.until(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList2.add(cls3);
                }
                spreadBuilder.addSpread(arrayList2.toArray(new Class[0]));
                method = getDeclaredCompatibleMethod(cls, str, (Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
            } catch (ReflectiveOperationException unused) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
                Method[] methodArr = declaredMethods;
                int length2 = methodArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = methodArr[i2];
                    Method method4 = method2;
                    if (!Intrinsics.areEqual(method4.getName(), str)) {
                        String name = method4.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "it.name");
                        if (!StringsKt.startsWith$default(name, str + Soundex.SILENT_MARKER, false, 2, (Object) null)) {
                            z = false;
                            if (!z) {
                                break;
                            }
                            i2++;
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                method3 = method2;
                method = method3;
                if (method != null) {
                }
            }
        } catch (ReflectiveOperationException unused2) {
            method = method3;
            if (method != null) {
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(cls.getName() + ClassUtils.PACKAGE_SEPARATOR_CHAR + str);
    }

    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.valueOf(0.0d);
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return 0;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return (byte) 0;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return (char) 0;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return 0L;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return false;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.valueOf(0.0f);
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return (short) 0;
                    }
                    break;
            }
        }
        return null;
    }

    private final Object invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
        Class<?>[] clsArr = parameterTypes;
        int i = -1;
        int length = clsArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.areEqual(clsArr[length], Composer.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int changedParamCount = changedParamCount(i, obj != null ? 1 : 0) + i3;
        int length2 = method.getParameterTypes().length;
        if (!((length2 != changedParamCount ? defaultParamCount(i) : 0) + changedParamCount == length2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArr2 = new Object[length2];
        int i4 = 0;
        while (i4 < length2) {
            if (i4 >= 0 && i4 < i) {
                if (i4 < 0 || i4 > ArraysKt.getLastIndex(objArr)) {
                    ComposableInvoker composableInvoker = INSTANCE;
                    Class<?> cls = method.getParameterTypes()[i4];
                    Intrinsics.checkNotNullExpressionValue(cls, "parameterTypes[idx]");
                    obj2 = composableInvoker.getDefaultValue(cls);
                } else {
                    obj2 = objArr[i4];
                }
            } else if (i4 == i) {
                obj2 = composer;
            } else {
                if (i3 <= i4 && i4 < changedParamCount) {
                    obj2 = 0;
                } else {
                    if (changedParamCount <= i4 && i4 < length2) {
                        obj2 = 2097151;
                    } else {
                        throw new IllegalStateException("Unexpected index".toString());
                    }
                }
            }
            objArr2[i4] = obj2;
            i4++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    private final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private final int defaultParamCount(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    public final void invokeComposable(String className, String methodName, Composer composer, Object... args) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Class<?> composableClass = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(composableClass, "composableClass");
            Method findComposableMethod = findComposableMethod(composableClass, methodName, Arrays.copyOf(args, args.length));
            findComposableMethod.setAccessible(true);
            if (Modifier.isStatic(findComposableMethod.getModifiers())) {
                invokeComposableMethod(findComposableMethod, null, composer, Arrays.copyOf(args, args.length));
            } else {
                invokeComposableMethod(findComposableMethod, composableClass.getConstructor(new Class[0]).newInstance(new Object[0]), composer, Arrays.copyOf(args, args.length));
            }
        } catch (ReflectiveOperationException e) {
            PreviewLogger.Companion companion = PreviewLogger.Companion;
            PreviewLogger.Companion.logWarning$ui_tooling_release$default(companion, "Failed to invoke Composable Method '" + className + ClassUtils.PACKAGE_SEPARATOR_CHAR + methodName + '\'', null, 2, null);
            throw e;
        }
    }
}
