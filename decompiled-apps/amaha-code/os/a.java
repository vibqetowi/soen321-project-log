package os;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import vs.c;
/* compiled from: PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: os.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0462a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f27778a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            if (kotlin.jvm.internal.i.b(r5, java.lang.Throwable.class) != false) goto L11;
         */
        static {
            Method method;
            boolean z10;
            Method[] throwableMethods = Throwable.class.getMethods();
            i.f(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i6 = 0;
            while (true) {
                method = null;
                if (i6 >= length) {
                    break;
                }
                Method method2 = throwableMethods[i6];
                if (i.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    i.f(parameterTypes, "it.parameterTypes");
                    z10 = true;
                    if (parameterTypes.length == 1) {
                        method = parameterTypes[0];
                    }
                }
                z10 = false;
                if (z10) {
                    method = method2;
                    break;
                }
                i6++;
            }
            f27778a = method;
            int length2 = throwableMethods.length;
            for (int i10 = 0; i10 < length2 && !i.b(throwableMethods[i10].getName(), "getSuppressed"); i10++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        i.g(cause, "cause");
        i.g(exception, "exception");
        Method method = C0462a.f27778a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public c b() {
        return new vs.b();
    }
}
