package so;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class w implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f31848u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31849v;

    public w(ExperimentEditProfileActivity experimentEditProfileActivity, kotlin.jvm.internal.u uVar) {
        this.f31848u = uVar;
        this.f31849v = experimentEditProfileActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i6 = ExperimentEditProfileActivity.P;
        ExperimentEditProfileActivity experimentEditProfileActivity = this.f31849v;
        this.f31848u.f23466u = ExperimentEditProfileActivity.p0(experimentEditProfileActivity, experimentEditProfileActivity.r0());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
