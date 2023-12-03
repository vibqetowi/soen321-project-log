package jl;

import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class m0 implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u0 f22266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<LearningHubModel> f22267b;

    public m0(u0 u0Var, ls.h hVar) {
        this.f22266a = u0Var;
        this.f22267b = hVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        kotlin.jvm.internal.i.g(it, "it");
        LogHelper.INSTANCE.e(this.f22266a.f22359a, it);
        this.f22267b.resumeWith(null);
    }
}
