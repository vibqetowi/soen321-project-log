package gn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ReworkLoginFragment.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16639u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ReworkLoginFragment reworkLoginFragment) {
        super(1);
        this.f16639u = reworkLoginFragment;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            ReworkLoginFragment reworkLoginFragment = this.f16639u;
            try {
                if (!gv.n.B0(contentIfNotHandled)) {
                    int i6 = ReworkLoginFragment.C;
                    RobertoTextView robertoTextView = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setText(contentIfNotHandled);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(reworkLoginFragment.f11325u, e10);
            }
        }
        return hs.k.f19476a;
    }
}
