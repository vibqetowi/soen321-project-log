package ih;

import java.util.Set;
/* compiled from: SdkInstance.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final c9.d f20102a;

    /* renamed from: b  reason: collision with root package name */
    public final dh.a f20103b;

    /* renamed from: c  reason: collision with root package name */
    public th.a f20104c;

    /* renamed from: d  reason: collision with root package name */
    public final hh.g f20105d;

    /* renamed from: e  reason: collision with root package name */
    public final ah.f f20106e;

    public p(c9.d dVar, dh.a initConfig, th.a aVar) {
        kotlin.jvm.internal.i.g(initConfig, "initConfig");
        this.f20102a = dVar;
        this.f20103b = initConfig;
        this.f20104c = aVar;
        hh.a aVar2 = hh.g.f17610d;
        String subTag = (String) dVar.f5133c;
        Set l12 = ca.a.l1(new hh.f(initConfig.f12859e));
        kotlin.jvm.internal.i.g(subTag, "subTag");
        hh.g gVar = new hh.g(subTag, l12);
        this.f20105d = gVar;
        this.f20106e = new ah.f(gVar);
    }
}
