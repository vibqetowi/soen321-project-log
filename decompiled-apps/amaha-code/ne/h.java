package ne;

import java.util.BitSet;
import tr.c0;
/* compiled from: FirebaseClientGrpcMetadataProvider.java */
/* loaded from: classes.dex */
public final class h implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final c0.b f26225d;

    /* renamed from: e  reason: collision with root package name */
    public static final c0.b f26226e;
    public static final c0.b f;

    /* renamed from: a  reason: collision with root package name */
    public final re.b<pe.g> f26227a;

    /* renamed from: b  reason: collision with root package name */
    public final re.b<mf.f> f26228b;

    /* renamed from: c  reason: collision with root package name */
    public final sc.f f26229c;

    static {
        c0.a aVar = tr.c0.f33440d;
        BitSet bitSet = c0.d.f33445d;
        f26225d = new c0.b("x-firebase-client-log-type", aVar);
        f26226e = new c0.b("x-firebase-client", aVar);
        f = new c0.b("x-firebase-gmpid", aVar);
    }

    public h(re.b<mf.f> bVar, re.b<pe.g> bVar2, sc.f fVar) {
        this.f26228b = bVar;
        this.f26227a = bVar2;
        this.f26229c = fVar;
    }
}
