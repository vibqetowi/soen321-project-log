package wo;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class l extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f36948u;

    public l(n nVar) {
        this.f36948u = nVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        kotlin.jvm.internal.i.g(error, "error");
        this.f36948u.f36961c.l(ApiNetworkStatus.ERROR);
    }
}
