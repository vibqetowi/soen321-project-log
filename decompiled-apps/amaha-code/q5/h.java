package q5;

import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.x;
/* compiled from: HashUtils.kt */
/* loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f29162a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x<String> f29163b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f29164c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Condition f29165d;

    public h(Object obj, x<String> xVar, ReentrantLock reentrantLock, Condition condition) {
        this.f29162a = obj;
        this.f29163b = xVar;
        this.f29164c = reentrantLock;
        this.f29165d = condition;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [T, java.lang.String] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        ReentrantLock reentrantLock = this.f29164c;
        kotlin.jvm.internal.i.g(method, "method");
        kotlin.jvm.internal.i.g(objects, "objects");
        try {
            if (kotlin.jvm.internal.i.b(method.getName(), "onChecksumsReady") && objects.length == 1) {
                Object obj2 = objects[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                            kotlin.jvm.internal.i.f(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                            kotlin.jvm.internal.i.f(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, new Object[0]) == null && kotlin.jvm.internal.i.b(method3.invoke(obj3, new Object[0]), this.f29162a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                kotlin.jvm.internal.i.f(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(obj3, new Object[0]);
                                if (invoke != null) {
                                    this.f29163b.f23469u = new BigInteger(1, (byte[]) invoke).toString(16);
                                    reentrantLock.lock();
                                    this.f29165d.signalAll();
                                    reentrantLock.unlock();
                                    return null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Log.d(i.f29167b, "Can't fetch checksum.", th2);
        }
        return null;
    }
}
