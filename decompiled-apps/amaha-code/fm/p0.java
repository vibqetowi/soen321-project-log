package fm;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class p0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<fe.q> f15488a;

    public p0(ls.h hVar) {
        this.f15488a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        kotlin.jvm.internal.i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        fe.q qVar = null;
        ls.d<fe.q> dVar = this.f15488a;
        if (isSuccessful) {
            fe.r result = it.getResult();
            if (result != null) {
                qVar = (fe.q) is.u.h2(result);
            }
            dVar.resumeWith(qVar);
            return;
        }
        dVar.resumeWith(null);
    }
}
