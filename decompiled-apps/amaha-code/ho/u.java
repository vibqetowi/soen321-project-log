package ho;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
/* compiled from: ProB2CResultFragment.kt */
/* loaded from: classes2.dex */
public final class u extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ v f18060u;

    public u(v vVar) {
        this.f18060u = vVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        kotlin.jvm.internal.i.g(error, "error");
        ProTakeAssessmentActivity proTakeAssessmentActivity = this.f18060u.f18063v;
        if (proTakeAssessmentActivity != null) {
            proTakeAssessmentActivity.finish();
        } else {
            kotlin.jvm.internal.i.q("act");
            throw null;
        }
    }
}
