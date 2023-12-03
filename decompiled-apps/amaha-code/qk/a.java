package qk;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.TherapistDataCacheUtil;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import kp.i;
import org.json.JSONObject;
import ss.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29630u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f29631v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f29632w;

    public /* synthetic */ a(Object obj, int i6, Object obj2) {
        this.f29630u = i6;
        this.f29631v = obj;
        this.f29632w = obj2;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        int i6 = this.f29630u;
        Object obj2 = this.f29632w;
        Object obj3 = this.f29631v;
        switch (i6) {
            case 0:
                c.a((c) obj3, (String) obj2, (JSONObject) obj);
                return;
            case 1:
                p pVar = (p) obj3;
                hn.b bVar = (hn.b) obj2;
                try {
                    pVar.invoke(Boolean.TRUE, (JSONObject) obj);
                    return;
                } catch (Exception e10) {
                    pVar.invoke(Boolean.FALSE, null);
                    LogHelper.INSTANCE.e(bVar.f17789a, "error in parsing response checkForDeepLink", e10);
                    return;
                }
            case 2:
                p pVar2 = (p) obj3;
                kp.c cVar = (kp.c) obj2;
                try {
                    pVar2.invoke(Boolean.TRUE, (JSONObject) obj);
                    return;
                } catch (Exception unused) {
                    pVar2.invoke(Boolean.FALSE, null);
                    LogHelper.INSTANCE.e(cVar.f23726u, "exception in success sendfeedback");
                    return;
                }
            case 3:
                p pVar3 = (p) obj3;
                i iVar = (i) obj2;
                try {
                    pVar3.invoke(Boolean.TRUE, (JSONObject) obj);
                    return;
                } catch (Exception unused2) {
                    pVar3.invoke(Boolean.FALSE, null);
                    LogHelper.INSTANCE.e(iVar.f23751u, "exception in success sendfeedback");
                    return;
                }
            case 4:
                com.theinnerhour.b2b.fragment.coping.a this$0 = (com.theinnerhour.b2b.fragment.coping.a) obj3;
                ProgressDialog progressDialog = (ProgressDialog) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                int i10 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(progressDialog, "$progressDialog");
                try {
                    Toast.makeText(this$0.requireActivity(), this$0.requireActivity().getString(R.string.feedback_submit_toast), 0).show();
                    progressDialog.dismiss();
                    this$0.requireActivity().finish();
                    return;
                } catch (Exception unused3) {
                    LogHelper.INSTANCE.e("dashboardactivity", "exception in success sendfeedback");
                    return;
                }
            case 5:
                TherapistDataCacheUtil.a((TherapistDataCacheUtil) obj3, (ss.l) obj2, (JSONObject) obj);
                return;
            default:
                Utils.logout$lambda$3((Context) obj3, (Bundle) obj2, (String) obj);
                return;
        }
    }
}
