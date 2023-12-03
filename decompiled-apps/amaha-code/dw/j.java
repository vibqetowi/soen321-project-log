package dw;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: Invocation.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Method f13575a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f13576b;

    public j(Method method, ArrayList arrayList) {
        this.f13575a = method;
        this.f13576b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f13575a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f13576b);
    }
}
