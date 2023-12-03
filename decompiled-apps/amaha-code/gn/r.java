package gn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class r implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16653u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f16654v;

    public r(ReworkSignupFragment reworkSignupFragment, kotlin.jvm.internal.u uVar) {
        this.f16653u = reworkSignupFragment;
        this.f16654v = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean b10 = kotlin.jvm.internal.i.b(String.valueOf(editable), "");
        ReworkSignupFragment reworkSignupFragment = this.f16653u;
        if (!b10) {
            int i6 = ReworkSignupFragment.C;
            ((RobertoEditText) reworkSignupFragment.I().findViewById(R.id.etOTPDialog3)).requestFocus();
        }
        int i10 = ReworkSignupFragment.C;
        this.f16654v.f23466u = ReworkSignupFragment.F(reworkSignupFragment, reworkSignupFragment.I());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
