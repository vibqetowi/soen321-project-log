package fm;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class u0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Integer> f15572a;

    public u0(ls.h hVar) {
        this.f15572a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        int i6;
        kotlin.jvm.internal.i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        ls.d<Integer> dVar = this.f15572a;
        if (isSuccessful) {
            fe.r result = it.getResult();
            if (result != null) {
                i6 = result.f15006v.f17520b.size();
            } else {
                i6 = 0;
            }
            dVar.resumeWith(Integer.valueOf(i6));
            return;
        }
        dVar.resumeWith(null);
    }
}
