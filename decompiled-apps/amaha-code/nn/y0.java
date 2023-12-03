package nn;

import android.view.View;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26664u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z0 f26665v;

    public /* synthetic */ y0(z0 z0Var, int i6) {
        this.f26664u = i6;
        this.f26665v = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f26664u;
        z0 this$0 = this.f26665v;
        switch (i6) {
            case 0:
                int i10 = z0.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        gk.a.b(null, "dynamic_campaign_card_click");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                        this$0.startActivity(tr.r.s(requireActivity, false).putExtra("source", "dynamic_campaign_card"));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f26673y, e10);
                    return;
                }
            case 1:
                int i11 = z0.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.F(true);
                return;
            case 2:
                int i12 = z0.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.F(false);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        gk.a.b(null, "dynamic_campaign_card_click");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        this$0.startActivity(tr.r.s(requireActivity2, false).putExtra("source", "dynamic_campaign_card"));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f26673y, e11);
                    return;
                }
        }
    }
}
