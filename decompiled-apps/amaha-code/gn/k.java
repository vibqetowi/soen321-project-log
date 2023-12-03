package gn;

import android.os.Bundle;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ReworkLoginFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16640u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReworkLoginFragment reworkLoginFragment) {
        super(1);
        this.f16640u = reworkLoginFragment;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            boolean booleanValue = contentIfNotHandled.booleanValue();
            ReworkLoginFragment reworkLoginFragment = this.f16640u;
            try {
                if (booleanValue) {
                    int i6 = ReworkLoginFragment.C;
                    reworkLoginFragment.I().dismiss();
                    String str = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "auth_screen");
                    bundle.putString("status", "success");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "auth_verify_otp_confirm");
                } else {
                    int i10 = ReworkLoginFragment.C;
                    RobertoTextView robertoTextView = (RobertoTextView) reworkLoginFragment.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(0);
                    }
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "auth_screen");
                    bundle2.putString("status", "fail");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "auth_verify_otp_confirm");
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(reworkLoginFragment.f11325u, e10);
            }
        }
        return hs.k.f19476a;
    }
}
