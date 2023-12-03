package pe;

import android.content.Context;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import hd.o;
import hd.p;
import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements hd.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28394u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f28395v;

    public /* synthetic */ c(o oVar, int i6) {
        this.f28394u = i6;
        this.f28395v = oVar;
    }

    @Override // hd.e
    public final Object e(p pVar) {
        ze.b lambda$getComponents$0;
        int i6 = this.f28394u;
        o oVar = this.f28395v;
        switch (i6) {
            case 0:
                return new d((Context) pVar.a(Context.class), ((sc.e) pVar.a(sc.e.class)).g(), pVar.h(e.class), pVar.b(mf.f.class), (Executor) pVar.e(oVar));
            case 1:
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(oVar, pVar);
                return lambda$getComponents$0;
            default:
                return RemoteConfigRegistrar.a(oVar, pVar);
        }
    }
}
