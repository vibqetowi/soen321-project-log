package nt;

import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<Method, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f26825u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.f26825u = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r5 != false) goto L16;
     */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Method method) {
        boolean equals;
        Method method2 = method;
        boolean z10 = false;
        if (!method2.isSynthetic()) {
            if (this.f26825u.D()) {
                String name = method2.getName();
                if (kotlin.jvm.internal.i.b(name, "values")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    kotlin.jvm.internal.i.f(parameterTypes, "method.parameterTypes");
                    if (parameterTypes.length == 0) {
                        equals = true;
                    }
                    equals = false;
                } else {
                    if (kotlin.jvm.internal.i.b(name, "valueOf")) {
                        equals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                    }
                    equals = false;
                }
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
