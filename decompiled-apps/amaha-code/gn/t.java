package gn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class t implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f16657u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ReworkSignupFragment f16658v;

    public t(ReworkSignupFragment reworkSignupFragment, kotlin.jvm.internal.u uVar) {
        this.f16657u = uVar;
        this.f16658v = reworkSignupFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i6 = ReworkSignupFragment.C;
        ReworkSignupFragment reworkSignupFragment = this.f16658v;
        this.f16657u.f23466u = ReworkSignupFragment.F(reworkSignupFragment, reworkSignupFragment.I());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
