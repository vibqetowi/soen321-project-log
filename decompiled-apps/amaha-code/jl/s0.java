package jl;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class s0 extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u0 f22344u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<ProCoachModel> f22345v;

    public s0(u0 u0Var, kotlinx.coroutines.k kVar) {
        this.f22344u = u0Var;
        this.f22345v = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError volleyError) {
        String str;
        super.onErrorResponse(volleyError);
        LogHelper logHelper = LogHelper.INSTANCE;
        String str2 = this.f22344u.f22359a;
        if (volleyError != null) {
            str = volleyError.getLocalizedMessage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "error in requestCoachData()";
        }
        logHelper.e(str2, str);
        kotlinx.coroutines.j<ProCoachModel> jVar = this.f22345v;
        if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }
}
