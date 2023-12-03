package mo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: ProDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class e extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f25661u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j<ProCoachModel> f25662v;

    public e(a aVar, k kVar) {
        this.f25661u = aVar;
        this.f25662v = kVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError volleyError) {
        String str;
        super.onErrorResponse(volleyError);
        LogHelper logHelper = LogHelper.INSTANCE;
        String str2 = this.f25661u.f25647a;
        if (volleyError != null) {
            str = volleyError.getLocalizedMessage();
        } else {
            str = null;
        }
        if (str == null) {
            str = "error in requestCoachData()";
        }
        logHelper.e(str2, str);
        j<ProCoachModel> jVar = this.f25662v;
        if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }
}
