package so;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class u implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31844u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f31845v;

    public u(ExperimentEditProfileActivity experimentEditProfileActivity, kotlin.jvm.internal.u uVar) {
        this.f31844u = experimentEditProfileActivity;
        this.f31845v = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean b10 = kotlin.jvm.internal.i.b(String.valueOf(editable), "");
        ExperimentEditProfileActivity experimentEditProfileActivity = this.f31844u;
        if (!b10) {
            int i6 = ExperimentEditProfileActivity.P;
            RobertoEditText robertoEditText = (RobertoEditText) experimentEditProfileActivity.r0().findViewById(R.id.etOTPDialog3);
            if (robertoEditText != null) {
                robertoEditText.requestFocus();
            }
        }
        int i10 = ExperimentEditProfileActivity.P;
        this.f31845v.f23466u = ExperimentEditProfileActivity.p0(experimentEditProfileActivity, experimentEditProfileActivity.r0());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
