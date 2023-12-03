package gn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ReworkSignupFragment.kt */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16659u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ReworkSignupFragment reworkSignupFragment) {
        super(1);
        this.f16659u = reworkSignupFragment;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        RobertoTextView robertoTextView;
        String str2 = str;
        if (str2 != null) {
            ReworkSignupFragment reworkSignupFragment = this.f16659u;
            try {
                int i6 = ReworkSignupFragment.C;
                if (reworkSignupFragment.I().isShowing()) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogTimer);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(str2);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "00:00") && (robertoTextView = (RobertoTextView) reworkSignupFragment.I().findViewById(R.id.tvOTPDialogResend)) != null) {
                        robertoTextView.setAlpha(1.0f);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(reworkSignupFragment.f11342u, e10);
            }
        }
        return hs.k.f19476a;
    }
}
