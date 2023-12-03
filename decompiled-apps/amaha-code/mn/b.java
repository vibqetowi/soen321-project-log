package mn;

import android.content.DialogInterface;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import kc.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import qn.p;
import ta.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25641u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniMonetizationActivity f25642v;

    public /* synthetic */ b(MiniMonetizationActivity miniMonetizationActivity, int i6) {
        this.f25641u = i6;
        this.f25642v = miniMonetizationActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f25641u;
        MiniMonetizationActivity this$0 = this.f25642v;
        switch (i10) {
            case 0:
                int i11 = MiniMonetizationActivity.f11396b0;
                i.g(this$0, "this$0");
                this$0.o0(this$0.J, this$0.N, this$0.L, this$0.M);
                return;
            default:
                i.g(this$0, "this$0");
                dialogInterface.dismiss();
                MonetizationViewModel q02 = this$0.q0();
                String purchaseToken = this$0.O;
                i.g(purchaseToken, "purchaseToken");
                v.H(f.H(q02), o0.f23642c, 0, new p(q02, purchaseToken, null), 2);
                return;
        }
    }
}
