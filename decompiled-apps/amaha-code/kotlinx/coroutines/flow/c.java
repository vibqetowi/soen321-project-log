package kotlinx.coroutines.flow;
/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
public class c<T> extends jv.e<T> {

    /* renamed from: x  reason: collision with root package name */
    public final ss.p<iv.q<? super T>, ls.d<? super hs.k>, Object> f23512x;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ss.p<? super iv.q<? super T>, ? super ls.d<? super hs.k>, ? extends Object> pVar, ls.f fVar, int i6, iv.e eVar) {
        super(fVar, i6, eVar);
        this.f23512x = pVar;
    }

    @Override // jv.e
    public final String toString() {
        return "block[" + this.f23512x + "] -> " + super.toString();
    }
}
