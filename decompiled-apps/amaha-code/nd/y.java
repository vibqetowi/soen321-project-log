package nd;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public final class y implements Callable<Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f26146u;

    public y(x xVar) {
        this.f26146u = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        boolean z10;
        t tVar = this.f26146u.f26137g;
        z zVar = tVar.f26114c;
        sd.b bVar = (sd.b) zVar.f26149c;
        bVar.getClass();
        if (!new File(bVar.f31460b, (String) zVar.f26148b).exists()) {
            String e10 = tVar.e();
            if (e10 == null || !tVar.f26120j.d(e10)) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
        } else {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            sd.b bVar2 = (sd.b) zVar.f26149c;
            bVar2.getClass();
            new File(bVar2.f31460b, (String) zVar.f26148b).delete();
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
