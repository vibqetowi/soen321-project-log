package nd;

import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class k implements ya.g<ud.b, Void> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Executor f26074u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f26075v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l f26076w;

    public k(l lVar, Executor executor, String str) {
        this.f26076w = lVar;
        this.f26074u = executor;
        this.f26075v = str;
    }

    @Override // ya.g
    public final ya.h<Void> h(ud.b bVar) {
        String str = null;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return ya.k.e(null);
        }
        ya.h[] hVarArr = new ya.h[2];
        l lVar = this.f26076w;
        hVarArr[0] = t.b(lVar.f26082z);
        l0 l0Var = lVar.f26082z.f26122l;
        if (lVar.f26081y) {
            str = this.f26075v;
        }
        hVarArr[1] = l0Var.e(str, this.f26074u);
        return ya.k.g(hVarArr);
    }
}
