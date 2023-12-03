package nd;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class l implements Callable<ya.h<Void>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f26077u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Throwable f26078v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Thread f26079w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ud.f f26080x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f26081y = false;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ t f26082z;

    public l(t tVar, long j10, Throwable th2, Thread thread, ud.f fVar) {
        this.f26082z = tVar;
        this.f26077u = j10;
        this.f26078v = th2;
        this.f26079w = thread;
        this.f26080x = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final ya.h<Void> call() {
        sd.b bVar;
        String str;
        long j10 = this.f26077u;
        long j11 = j10 / 1000;
        t tVar = this.f26082z;
        String e10 = tVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return ya.k.e(null);
        }
        tVar.f26114c.e();
        Throwable th2 = this.f26078v;
        Thread thread = this.f26079w;
        l0 l0Var = tVar.f26122l;
        l0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        l0Var.d(th2, thread, e10, "crash", j11, true);
        try {
            bVar = tVar.f26117g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
        if (!new File(bVar.f31460b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ud.f fVar = this.f26080x;
        tVar.c(false, fVar);
        new e(tVar.f);
        t.a(tVar, e.f26046b);
        if (!tVar.f26113b.a()) {
            return ya.k.e(null);
        }
        Executor executor = tVar.f26116e.f26059a;
        return ((ud.d) fVar).f34017i.get().f38392a.onSuccessTask(executor, new k(this, executor, e10));
    }
}
