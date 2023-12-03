package jl;

import com.theinnerhour.b2b.model.LearningHubModel;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class l0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<LearningHubModel> f22263a;

    public l0(ls.h hVar) {
        this.f22263a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        LearningHubModel learningHubModel;
        ls.d<LearningHubModel> dVar = this.f22263a;
        kotlin.jvm.internal.i.g(it, "it");
        try {
            if (it.isSuccessful()) {
                fe.r result = it.getResult();
                kotlin.jvm.internal.i.f(result, "it.result");
                fe.q qVar = (fe.q) is.u.h2(result);
                if (qVar != null && (learningHubModel = (LearningHubModel) qVar.d(LearningHubModel.class)) != null) {
                    learningHubModel.setId(qVar.b());
                } else {
                    learningHubModel = null;
                }
                dVar.resumeWith(learningHubModel);
                return;
            }
            dVar.resumeWith(null);
        } catch (Exception unused) {
            dVar.resumeWith(null);
        }
    }
}
