package so;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class l implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31831u;

    public l(ExperimentEditProfileActivity experimentEditProfileActivity) {
        this.f31831u = experimentEditProfileActivity;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10 = !gv.n.B0(String.valueOf(charSequence));
        ExperimentEditProfileActivity experimentEditProfileActivity = this.f31831u;
        if (z10 && !kotlin.jvm.internal.i.b(String.valueOf(charSequence), experimentEditProfileActivity.J)) {
            experimentEditProfileActivity.L = false;
            if (String.valueOf(charSequence).length() != 10) {
                ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setTextColor(g0.a.b(experimentEditProfileActivity, R.color.templateHintGrey));
            } else {
                ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setTextColor(g0.a.b(experimentEditProfileActivity, R.color.campaignLightBlue));
            }
            ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setVisibility(0);
            return;
        }
        experimentEditProfileActivity.L = true;
        ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
