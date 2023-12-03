package f0;

import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f14620u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14621v;

    public f(Object obj, Object obj2) {
        this.f14620u = obj;
        this.f14621v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = g.f14627d;
            Object obj = this.f14621v;
            Object obj2 = this.f14620u;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                g.f14628e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
        }
    }
}
