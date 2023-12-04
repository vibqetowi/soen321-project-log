package com.redmadrobot.extensions.viewbinding;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
/* compiled from: ViewBinding.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0004*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002\u001a\u001e\u0010\r\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003*\u00020\nH\u0086\b¢\u0006\u0002\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0002\u001a;\u0010\u0010\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a4\u0010\u0018\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003*\u00020\u00192\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u001a\u001a4\u0010\u0018\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003*\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u001b\u001a2\u0010\u0018\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003*\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u001d\"\"\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"bindMethodsCache", "", "Ljava/lang/Class;", "Landroidx/viewbinding/ViewBinding;", "Ljava/lang/reflect/Method;", "inflateMethodsCache", "bind", "VB", "Lkotlin/reflect/KClass;", "rootView", "Landroid/view/View;", "(Lkotlin/reflect/KClass;Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "getBindMethod", "getBinding", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "getInflateMethod", "inflate", "inflater", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "attachToRoot", "", "(Lkotlin/reflect/KClass;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "inflateViewBinding", "Landroid/content/Context;", "(Landroid/content/Context;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "context", "(Landroid/view/ViewGroup;Landroid/content/Context;Z)Landroidx/viewbinding/ViewBinding;", "redmadrobot.viewbinding-ktx"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewBindingKt {
    private static final Map<Class<? extends ViewBinding>, Method> inflateMethodsCache = new LinkedHashMap();
    private static final Map<Class<? extends ViewBinding>, Method> bindMethodsCache = new LinkedHashMap();

    public static /* synthetic */ ViewBinding inflateViewBinding$default(ViewGroup viewGroup, Context context, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "fun <reified VB : ViewBinding> ViewGroup.inflateViewBinding(\n    context: Context = this.context,\n    attachToRoot: Boolean = true,\n): VB {\n    return VB::class.inflate(LayoutInflater.from(context), this, attachToRoot)\n}");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.reifiedOperationMarker(4, "VB");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewBinding.class);
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return inflate(orCreateKotlinClass, from, viewGroup, z);
    }

    public static final /* synthetic */ <VB extends ViewBinding> VB inflateViewBinding(ViewGroup viewGroup, Context context, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.reifiedOperationMarker(4, "VB");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewBinding.class);
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        return (VB) inflate(orCreateKotlinClass, from, viewGroup, z);
    }

    public static /* synthetic */ ViewBinding inflateViewBinding$default(Context context, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup = null;
        }
        if ((i & 2) != 0) {
            z = viewGroup != null;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewBinding.class);
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(this)");
        return inflate(orCreateKotlinClass, from, viewGroup, z);
    }

    public static final /* synthetic */ <VB extends ViewBinding> VB inflateViewBinding(Context context, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewBinding.class);
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(this)");
        return (VB) inflate(orCreateKotlinClass, from, viewGroup, z);
    }

    public static /* synthetic */ ViewBinding inflateViewBinding$default(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup = null;
        }
        if ((i & 2) != 0) {
            z = viewGroup != null;
        }
        Intrinsics.checkNotNullParameter(layoutInflater, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        return inflate(Reflection.getOrCreateKotlinClass(ViewBinding.class), layoutInflater, viewGroup, z);
    }

    public static final /* synthetic */ <VB extends ViewBinding> VB inflateViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        return (VB) inflate(Reflection.getOrCreateKotlinClass(ViewBinding.class), layoutInflater, viewGroup, z);
    }

    public static final <VB extends ViewBinding> VB inflate(KClass<VB> kClass, LayoutInflater inflater, ViewGroup viewGroup, boolean z) {
        Object invoke;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Method inflateMethod = getInflateMethod(JvmClassMappingKt.getJavaClass((KClass) kClass));
        if (inflateMethod.getParameterTypes().length > 2) {
            invoke = inflateMethod.invoke(null, inflater, viewGroup, Boolean.valueOf(z));
        } else {
            if (!z) {
                Log.d("ViewBinding", "attachToRoot is always true for " + ((Object) JvmClassMappingKt.getJavaClass((KClass) kClass).getSimpleName()) + ".inflate");
            }
            invoke = inflateMethod.invoke(null, inflater, viewGroup);
        }
        if (invoke != null) {
            return (VB) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type VB of com.redmadrobot.extensions.viewbinding.ViewBindingKt.inflate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7[2], java.lang.Boolean.TYPE) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:5:0x0016->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[EDGE_INSN: B:30:0x0060->B:22:0x0060 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Method getInflateMethod(Class<? extends ViewBinding> cls) {
        Method method;
        boolean z;
        Map<Class<? extends ViewBinding>, Method> map = inflateMethodsCache;
        Method method2 = map.get(cls);
        if (method2 == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
            Method[] methodArr = declaredMethods;
            int length = methodArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methodArr[i];
                Method method3 = method;
                Class<?>[] parameterTypes = method3.getParameterTypes();
                if (Intrinsics.areEqual(method3.getName(), "inflate") && Intrinsics.areEqual(parameterTypes[0], LayoutInflater.class)) {
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
                    z = true;
                    if (Intrinsics.areEqual(ArraysKt.getOrNull(parameterTypes, 1), ViewGroup.class)) {
                        if (parameterTypes.length != 2) {
                        }
                        if (!z) {
                            break;
                        }
                        i++;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            method2 = method;
            if (method2 == null) {
                throw new IllegalStateException(("Method " + ((Object) cls.getSimpleName()) + ".inflate(LayoutInflater, ViewGroup[, boolean]) not found.").toString());
            }
            map.put(cls, method2);
        }
        return method2;
    }

    public static final /* synthetic */ <VB extends ViewBinding> VB getBinding(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VB");
        return (VB) bind(Reflection.getOrCreateKotlinClass(ViewBinding.class), view);
    }

    public static final <VB extends ViewBinding> VB bind(KClass<VB> kClass, View rootView) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Object invoke = getBindMethod(JvmClassMappingKt.getJavaClass((KClass) kClass)).invoke(null, rootView);
        if (invoke != null) {
            return (VB) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type VB of com.redmadrobot.extensions.viewbinding.ViewBindingKt.bind");
    }

    private static final Method getBindMethod(Class<? extends ViewBinding> cls) {
        Map<Class<? extends ViewBinding>, Method> map = bindMethodsCache;
        Method method = map.get(cls);
        if (method == null) {
            method = cls.getDeclaredMethod("bind", View.class);
            Intrinsics.checkNotNullExpressionValue(method, "getDeclaredMethod(\"bind\", View::class.java)");
            map.put(cls, method);
        }
        return method;
    }
}
