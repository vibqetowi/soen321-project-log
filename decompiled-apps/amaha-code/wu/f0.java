package wu;

import vu.c;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes2.dex */
public final class f0 extends o1 {

    /* renamed from: v  reason: collision with root package name */
    public final vu.l f37237v;

    /* renamed from: w  reason: collision with root package name */
    public final ss.a<b0> f37238w;

    /* renamed from: x  reason: collision with root package name */
    public final vu.i<b0> f37239x;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(vu.l storageManager, ss.a<? extends b0> aVar) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f37237v = storageManager;
        this.f37238w = aVar;
        this.f37239x = storageManager.e(aVar);
    }

    @Override // wu.b0
    public final b0 Q0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f0(this.f37237v, new e0(kotlinTypeRefiner, this));
    }

    @Override // wu.o1
    public final b0 S0() {
        return this.f37239x.invoke();
    }

    @Override // wu.o1
    public final boolean T0() {
        c.f fVar = (c.f) this.f37239x;
        if (fVar.f36149w != c.l.NOT_COMPUTED && fVar.f36149w != c.l.COMPUTING) {
            return true;
        }
        return false;
    }
}
