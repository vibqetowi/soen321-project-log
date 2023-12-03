package d7;

import java.util.Set;
/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class t implements a7.g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a7.b> f12259a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12260b;

    /* renamed from: c  reason: collision with root package name */
    public final v f12261c;

    public t(Set set, j jVar, v vVar) {
        this.f12259a = set;
        this.f12260b = jVar;
        this.f12261c = vVar;
    }

    @Override // a7.g
    public final u a(String str, a7.b bVar, a7.e eVar) {
        Set<a7.b> set = this.f12259a;
        if (set.contains(bVar)) {
            return new u(this.f12260b, str, bVar, eVar, this.f12261c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
