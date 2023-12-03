package fm;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class i0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f15363a;

    public i0(ls.h hVar) {
        this.f15363a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f15363a.resumeWith(Boolean.valueOf(it.isSuccessful()));
    }
}
