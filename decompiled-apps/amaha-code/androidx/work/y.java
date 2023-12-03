package androidx.work;

import android.content.Context;
/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3357a = q.f("WorkerFactory");

    public final p a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        String str2 = f3357a;
        p pVar = null;
        try {
            cls = Class.forName(str).asSubclass(p.class);
        } catch (Throwable th2) {
            q d10 = q.d();
            d10.c(str2, "Invalid class: " + str, th2);
            cls = null;
        }
        if (cls != null) {
            try {
                pVar = (p) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                q d11 = q.d();
                d11.c(str2, "Could not instantiate " + str, th3);
            }
        }
        if (pVar != null && pVar.isUsed()) {
            String name = getClass().getName();
            throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return pVar;
    }
}
