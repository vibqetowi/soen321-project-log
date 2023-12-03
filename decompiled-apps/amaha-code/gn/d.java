package gn;

import android.content.DialogInterface;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16628u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16629v;

    public /* synthetic */ d(ReworkLoginFragment reworkLoginFragment, int i6) {
        this.f16628u = i6;
        this.f16629v = reworkLoginFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i6 = this.f16628u;
        ReworkLoginFragment this$0 = this.f16629v;
        switch (i6) {
            case 0:
                int i10 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().U.k(this$0.getViewLifecycleOwner());
                this$0.J().P.k(this$0.getViewLifecycleOwner());
                this$0.J().V.k(this$0.getViewLifecycleOwner());
                return;
            default:
                int i11 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().F.l(LoginLoading.HIDE_LOADING);
                return;
        }
    }
}
