package so;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31851u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31851u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31851u;
            try {
                if (!gv.n.B0(contentIfNotHandled)) {
                    int i6 = ExperimentEditProfileActivity.P;
                    RobertoTextView robertoTextView = (RobertoTextView) experimentEditProfileActivity.r0().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView != null) {
                        robertoTextView.setText(contentIfNotHandled);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(experimentEditProfileActivity.f11566v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
