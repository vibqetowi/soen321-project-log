package nd;

import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class m implements ya.g<ud.b, Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Executor f26088u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f26089v;

    public m(n nVar, Executor executor) {
        this.f26089v = nVar;
        this.f26088u = executor;
    }

    @Override // ya.g
    public final ya.h<Void> h(ud.b bVar) {
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return ya.k.e(null);
        }
        n nVar = this.f26089v;
        t.b(nVar.f26093v.f26098v);
        o oVar = nVar.f26093v;
        oVar.f26098v.f26122l.e(null, this.f26088u);
        oVar.f26098v.f26126p.d(null);
        return ya.k.e(null);
    }
}
