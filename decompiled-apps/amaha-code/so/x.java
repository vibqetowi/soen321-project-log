package so;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31850u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31850u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        RobertoTextView robertoTextView;
        String str2 = str;
        if (str2 != null) {
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31850u;
            try {
                int i6 = ExperimentEditProfileActivity.P;
                if (experimentEditProfileActivity.r0().isShowing()) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogTimer);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(str2);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "00:00") && (robertoTextView = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogResend)) != null) {
                        robertoTextView.setAlpha(1.0f);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(experimentEditProfileActivity.f11566v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
