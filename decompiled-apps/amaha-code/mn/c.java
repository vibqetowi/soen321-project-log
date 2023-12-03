package mn;

import android.content.DialogInterface;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import kc.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import qn.p;
import ta.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25643u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationActivity f25644v;

    public /* synthetic */ c(MonetizationActivity monetizationActivity, int i6) {
        this.f25643u = i6;
        this.f25644v = monetizationActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f25643u;
        MonetizationActivity this$0 = this.f25644v;
        switch (i10) {
            case 0:
                int i11 = MonetizationActivity.c0;
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
