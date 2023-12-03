package gn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ReworkLoginFragment.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReworkLoginFragment reworkLoginFragment) {
        super(1);
        this.f16638u = reworkLoginFragment;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        RobertoTextView robertoTextView;
        String str2 = str;
        if (str2 != null) {
            ReworkLoginFragment reworkLoginFragment = this.f16638u;
            try {
                int i6 = ReworkLoginFragment.C;
                if (reworkLoginFragment.I().isShowing()) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogTimer);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(str2);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "00:00") && (robertoTextView = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogResend)) != null) {
                        robertoTextView.setAlpha(1.0f);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(reworkLoginFragment.f11325u, e10);
            }
        }
        return hs.k.f19476a;
    }
}
