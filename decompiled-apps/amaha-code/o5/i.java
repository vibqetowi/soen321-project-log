package o5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static i f27165g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicBoolean f27166h = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f27167a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f27168b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f27169c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f27170d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f27171e;
    public final Method f;

    public i(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f27167a = cls;
        this.f27168b = cls2;
        this.f27169c = method;
        this.f27170d = method2;
        this.f27171e = method3;
        this.f = method4;
    }

    public final Object a(ArrayList arrayList) {
        Object d10;
        Object d11;
        Class<?> cls = this.f27168b;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            int i6 = j.f27172a;
            Object d12 = j.d(this.f27167a, null, this.f27169c, new Object[0]);
            if (d12 != null && (d10 = j.d(cls, d12, this.f27170d, "inapp")) != null && (d11 = j.d(cls, d10, this.f27171e, arrayList)) != null) {
                return j.d(cls, d11, this.f, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
