package cn;

import com.theinnerhour.b2b.model.LearningHubModel;
/* compiled from: LibraryViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class n1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, LearningHubModel>> f5658a;

    public n1(ls.h hVar) {
        this.f5658a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> task) {
        String str;
        LearningHubModel learningHubModel;
        kotlin.jvm.internal.i.g(task, "task");
        boolean isSuccessful = task.isSuccessful();
        ls.d<hs.f<String, LearningHubModel>> dVar = this.f5658a;
        hs.f fVar = null;
        if (isSuccessful && !task.getResult().f15006v.f17520b.f23278u.isEmpty()) {
            fe.g gVar = (fe.g) is.u.i2(task.getResult().e());
            if (gVar != null) {
                str = gVar.b();
            } else {
                str = null;
            }
            fe.g gVar2 = (fe.g) is.u.i2(task.getResult().e());
            if (gVar2 != null && (learningHubModel = (LearningHubModel) gVar2.d(LearningHubModel.class)) != null) {
                learningHubModel.setId(str);
            } else {
                learningHubModel = null;
            }
            if (learningHubModel != null && str != null) {
                fVar = new hs.f(str, learningHubModel);
            }
            dVar.resumeWith(fVar);
            return;
        }
        dVar.resumeWith(null);
    }
}
