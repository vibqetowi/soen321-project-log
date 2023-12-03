package dl;

import android.app.ProgressDialog;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13118u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13118u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            boolean booleanValue = bool2.booleanValue();
            V3DashboardActivity v3DashboardActivity = this.f13118u;
            if (booleanValue) {
                ProgressDialog progressDialog = v3DashboardActivity.f10750w;
                if (progressDialog != null) {
                    progressDialog.show();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            } else {
                ProgressDialog progressDialog2 = v3DashboardActivity.f10750w;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        }
        return hs.k.f19476a;
    }
}
