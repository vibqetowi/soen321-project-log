package fm;

import com.theinnerhour.b2b.model.GoalDateObj;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class t0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<GoalDateObj> f15559a;

    public t0(ls.h hVar) {
        this.f15559a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        fe.q qVar;
        kotlin.jvm.internal.i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        GoalDateObj goalDateObj = null;
        ls.d<GoalDateObj> dVar = this.f15559a;
        if (isSuccessful) {
            fe.r result = it.getResult();
            if (result != null && (qVar = (fe.q) is.u.h2(result)) != null) {
                goalDateObj = (GoalDateObj) qVar.d(GoalDateObj.class);
            }
            dVar.resumeWith(goalDateObj);
            return;
        }
        dVar.resumeWith(null);
    }
}
