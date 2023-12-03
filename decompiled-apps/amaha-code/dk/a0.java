package dk;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.activity.SurveyActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements l.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12904u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f12905v;

    public /* synthetic */ a0(androidx.appcompat.app.c cVar, int i6) {
        this.f12904u = i6;
        this.f12905v = cVar;
    }

    @Override // e4.l.a
    public final void onErrorResponse(VolleyError error) {
        int i6 = this.f12904u;
        androidx.appcompat.app.c cVar = this.f12905v;
        switch (i6) {
            case 0:
                SurveyActivity this$0 = (SurveyActivity) cVar;
                int i10 = SurveyActivity.f10504y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Toast.makeText(this$0, "Error in sending feedback", 1).show();
                    ProgressDialog progressDialog = this$0.f10506w;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10505v, "exception in on error response", e10);
                    return;
                }
            case 1:
                V2GoalsActivity this$02 = (V2GoalsActivity) cVar;
                int i11 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                String str = this$02.f11173v;
                try {
                    Toast.makeText(this$02, "Error in sending feedback", 0).show();
                    LogHelper logHelper = LogHelper.INSTANCE;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper.e(str, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", error);
                    ProgressDialog progressDialog2 = this$02.H;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e11);
                    return;
                }
            default:
                V3GoalsActivity this$03 = (V3GoalsActivity) cVar;
                int i12 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                String str2 = this$03.f11187v;
                try {
                    Toast.makeText(this$03, "Error in sending feedback", 0).show();
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    kotlin.jvm.internal.i.f(error, "error");
                    logHelper2.e(str2, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", error);
                    ProgressDialog progressDialog3 = this$03.D;
                    if (progressDialog3 != null) {
                        progressDialog3.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(str2, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e12);
                    return;
                }
        }
    }
}
