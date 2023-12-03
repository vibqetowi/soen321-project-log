package wo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class b extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36870u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36871v;

    public b(g gVar, ls.h hVar) {
        this.f36870u = gVar;
        this.f36871v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        kotlin.jvm.internal.i.g(error, "error");
        LogHelper.INSTANCE.e(this.f36870u.f36891a, error);
        super.onErrorResponse(error);
        this.f36871v.resumeWith(ApiNetworkStatus.ERROR);
    }
}
