package io;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
import ls.d;
import ls.h;
import org.json.JSONObject;
/* compiled from: ProAssessmentViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class b extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f20415u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d<JSONObject> f20416v;

    public b(c cVar, h hVar) {
        this.f20415u = cVar;
        this.f20416v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError volleyError) {
        super.onErrorResponse(volleyError);
        LogHelper.INSTANCE.e(this.f20415u.f20417u, (volleyError == null || (r3 = volleyError.getMessage()) == null) ? "error in requestAssessmentData" : "error in requestAssessmentData");
        this.f20416v.resumeWith(null);
    }
}
