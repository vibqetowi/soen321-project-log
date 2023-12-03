package fm;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class n0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f15462a;

    public n0(ls.h hVar) {
        this.f15462a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f15462a.resumeWith(Boolean.valueOf(it.isSuccessful()));
    }
}
