package wo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class d extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36876u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36877v;

    public d(g gVar, ls.h hVar) {
        this.f36876u = gVar;
        this.f36877v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        kotlin.jvm.internal.i.g(error, "error");
        LogHelper.INSTANCE.e(this.f36876u.f36891a, error);
        super.onErrorResponse(error);
        this.f36877v.resumeWith(ApiNetworkStatus.ERROR);
    }
}
