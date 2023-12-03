package hv;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.b0;
/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: classes2.dex */
public final class b extends ls.a implements b0 {
    private volatile Object _preHandler;

    public b() {
        super(b0.a.f23486u);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (java.lang.reflect.Modifier.isStatic(r6.getModifiers()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void R(ls.f fVar, Throwable th2) {
        boolean z10;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Method method;
        Object obj;
        int i6 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (26 <= i6 && i6 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object obj2 = this._preHandler;
            uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                    z11 = false;
                } catch (Throwable unused) {
                }
            }
            if (method == null) {
                obj = method.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = obj;
            }
            if (uncaughtExceptionHandler == null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
                return;
            }
            return;
        }
        return;
        method = null;
        this._preHandler = method;
        if (method == null) {
        }
        if (obj instanceof Thread.UncaughtExceptionHandler) {
        }
        if (uncaughtExceptionHandler == null) {
        }
    }
}
