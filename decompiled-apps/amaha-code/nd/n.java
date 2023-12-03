package nd;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class n implements Callable<ya.h<Void>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Boolean f26092u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f26093v;

    public n(o oVar, Boolean bool) {
        this.f26093v = oVar;
        this.f26092u = bool;
    }

    @Override // java.util.concurrent.Callable
    public final ya.h<Void> call() {
        Boolean bool = this.f26092u;
        boolean booleanValue = bool.booleanValue();
        o oVar = this.f26093v;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            t tVar = oVar.f26098v;
            for (File file : sd.b.e(tVar.f26117g.f31460b.listFiles(t.f26111q))) {
                file.delete();
            }
            t tVar2 = oVar.f26098v;
            sd.b bVar = tVar2.f26122l.f26084b.f31457b;
            sd.a.a(sd.b.e(bVar.f31462d.listFiles()));
            sd.a.a(sd.b.e(bVar.f31463e.listFiles()));
            sd.a.a(sd.b.e(bVar.f.listFiles()));
            tVar2.f26126p.d(null);
            return ya.k.e(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean booleanValue2 = bool.booleanValue();
        d0 d0Var = oVar.f26098v.f26113b;
        if (booleanValue2) {
            d0Var.f.d(null);
            Executor executor = oVar.f26098v.f26116e.f26059a;
            return oVar.f26097u.onSuccessTask(executor, new m(this, executor));
        }
        d0Var.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
