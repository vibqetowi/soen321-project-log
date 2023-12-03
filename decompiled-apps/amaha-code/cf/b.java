package cf;

import a7.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import nf.f;
import sc.e;
import se.d;
/* compiled from: FirebasePerformanceModule_ProvidesConfigResolverFactory.java */
/* loaded from: classes.dex */
public final class b implements gs.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5263u;

    /* renamed from: v  reason: collision with root package name */
    public final a f5264v;

    public /* synthetic */ b(a aVar, int i6) {
        this.f5263u = i6;
        this.f5264v = aVar;
    }

    @Override // gs.a
    public final Object get() {
        int i6 = this.f5263u;
        a aVar = this.f5264v;
        switch (i6) {
            case 0:
                aVar.getClass();
                bf.a e10 = bf.a.e();
                ca.a.v(e10);
                return e10;
            case 1:
                e eVar = aVar.f5259a;
                ca.a.v(eVar);
                return eVar;
            case 2:
                d dVar = aVar.f5260b;
                ca.a.v(dVar);
                return dVar;
            case 3:
                switch (i6) {
                    case 3:
                        re.b<f> bVar = aVar.f5261c;
                        ca.a.v(bVar);
                        return bVar;
                    default:
                        re.b<g> bVar2 = aVar.f5262d;
                        ca.a.v(bVar2);
                        return bVar2;
                }
            case 4:
                aVar.getClass();
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                ca.a.v(remoteConfigManager);
                return remoteConfigManager;
            case 5:
                aVar.getClass();
                SessionManager sessionManager = SessionManager.getInstance();
                ca.a.v(sessionManager);
                return sessionManager;
            default:
                switch (i6) {
                    case 3:
                        re.b<f> bVar3 = aVar.f5261c;
                        ca.a.v(bVar3);
                        return bVar3;
                    default:
                        re.b<g> bVar4 = aVar.f5262d;
                        ca.a.v(bVar4);
                        return bVar4;
                }
        }
    }
}
