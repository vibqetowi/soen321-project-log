package kotlinx.coroutines.flow;
/* compiled from: SharedFlow.kt */
/* loaded from: classes2.dex */
public final class v extends jv.b<t<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f23560a = -1;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.coroutines.k f23561b;

    @Override // jv.b
    public final boolean a(jv.a aVar) {
        t tVar = (t) aVar;
        if (this.f23560a >= 0) {
            return false;
        }
        long j10 = tVar.B;
        if (j10 < tVar.C) {
            tVar.C = j10;
        }
        this.f23560a = j10;
        return true;
    }

    @Override // jv.b
    public final ls.d[] b(jv.a aVar) {
        long j10 = this.f23560a;
        this.f23560a = -1L;
        this.f23561b = null;
        return ((t) aVar).t(j10);
    }
}
