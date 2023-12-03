package so;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31852u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31852u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            boolean booleanValue = contentIfNotHandled.booleanValue();
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31852u;
            try {
                if (booleanValue) {
                    experimentEditProfileActivity.L = true;
                    RobertoTextView robertoTextView = (RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) experimentEditProfileActivity.o0(R.id.ivEditProfileVerify);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                    }
                    experimentEditProfileActivity.r0().dismiss();
                    String str = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "profile_section");
                    bundle.putString("status", "success");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "auth_verify_otp_confirm");
                } else {
                    int i6 = ExperimentEditProfileActivity.P;
                    RobertoTextView robertoTextView2 = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(0);
                    }
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "profile_section");
                    bundle2.putString("status", "fail");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "auth_verify_otp_confirm");
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(experimentEditProfileActivity.f11566v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
