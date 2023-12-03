package fm;
/* compiled from: GoalMigrationViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class e1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f15318a;

    public e1(ls.h hVar) {
        this.f15318a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        this.f15318a.resumeWith(Boolean.valueOf(it.isSuccessful()));
    }
}
