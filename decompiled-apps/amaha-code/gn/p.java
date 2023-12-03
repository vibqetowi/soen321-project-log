package gn;

import android.content.DialogInterface;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16649u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16650v;

    public /* synthetic */ p(ReworkSignupFragment reworkSignupFragment, int i6) {
        this.f16649u = i6;
        this.f16650v = reworkSignupFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i6 = this.f16649u;
        ReworkSignupFragment this$0 = this.f16650v;
        switch (i6) {
            case 0:
                int i10 = ReworkSignupFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().U.k(this$0.getViewLifecycleOwner());
                this$0.J().P.k(this$0.getViewLifecycleOwner());
                this$0.J().V.k(this$0.getViewLifecycleOwner());
                return;
            default:
                int i11 = ReworkSignupFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().F.l(LoginLoading.HIDE_LOADING);
                return;
        }
    }
}
