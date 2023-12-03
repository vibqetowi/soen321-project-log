package gn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class s implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16655u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f16656v;

    public s(ReworkSignupFragment reworkSignupFragment, kotlin.jvm.internal.u uVar) {
        this.f16655u = reworkSignupFragment;
        this.f16656v = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean b10 = kotlin.jvm.internal.i.b(String.valueOf(editable), "");
        ReworkSignupFragment reworkSignupFragment = this.f16655u;
        if (!b10) {
            int i6 = ReworkSignupFragment.C;
            ((RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog4)).requestFocus();
        }
        int i10 = ReworkSignupFragment.C;
        this.f16656v.f23466u = ReworkSignupFragment.F(reworkSignupFragment, reworkSignupFragment.I());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
