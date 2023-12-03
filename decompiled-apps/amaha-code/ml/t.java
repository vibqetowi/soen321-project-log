package ml;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: DashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class t extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ u f25584u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25585v;

    public t(u uVar, ls.h hVar) {
        this.f25584u = uVar;
        this.f25585v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        ls.d<Boolean> dVar = this.f25585v;
        u uVar = this.f25584u;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            LogHelper.INSTANCE.e(uVar.f25590a, "https://api.theinnerhour.com/v1/new_topical", error);
            dVar.resumeWith(Boolean.FALSE);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(uVar.f25590a, "https://api.theinnerhour.com/v1/new_topical", e10);
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
