package sf;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class g extends v<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f31493a;

    public g(v vVar) {
        this.f31493a = vVar;
    }

    @Override // sf.v
    public final AtomicLong a(yf.a aVar) {
        return new AtomicLong(((Number) this.f31493a.a(aVar)).longValue());
    }

    @Override // sf.v
    public final void b(yf.b bVar, AtomicLong atomicLong) {
        this.f31493a.b(bVar, Long.valueOf(atomicLong.get()));
    }
}
