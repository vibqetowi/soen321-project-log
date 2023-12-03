package gn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ReworkSignupFragment.kt */
/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16660u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ReworkSignupFragment reworkSignupFragment) {
        super(1);
        this.f16660u = reworkSignupFragment;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            ReworkSignupFragment reworkSignupFragment = this.f16660u;
            try {
                if (!gv.n.B0(contentIfNotHandled)) {
                    int i6 = ReworkSignupFragment.C;
                    RobertoTextView robertoTextView = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setText(contentIfNotHandled);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(reworkSignupFragment.f11342u, e10);
            }
        }
        return hs.k.f19476a;
    }
}
