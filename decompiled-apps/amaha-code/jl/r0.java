package jl;

import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import org.json.JSONObject;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class r0<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<ProCoachModel> f22337u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u0 f22338v;

    public r0(u0 u0Var, kotlinx.coroutines.k kVar) {
        this.f22337u = kVar;
        this.f22338v = u0Var;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        kotlinx.coroutines.j<ProCoachModel> jVar = this.f22337u;
        try {
            if (jVar.a()) {
                jVar.resumeWith(new sf.i().b(ProCoachModel.class, jSONObject.toString()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22338v.f22359a, "exception in my therapist response", e10);
            if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }
    }
}
