package wo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class f extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36884u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36885v;

    public f(g gVar, ls.h hVar) {
        this.f36884u = gVar;
        this.f36885v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        kotlin.jvm.internal.i.g(error, "error");
        g gVar = this.f36884u;
        gVar.f36893c.i("Error in saving family member details");
        LogHelper.INSTANCE.e(gVar.f36891a, error);
        super.onErrorResponse(error);
        this.f36885v.resumeWith(ApiNetworkStatus.ERROR);
    }
}
