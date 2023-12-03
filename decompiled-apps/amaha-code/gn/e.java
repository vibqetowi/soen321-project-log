package gn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class e implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16630u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f16631v;

    public e(ReworkLoginFragment reworkLoginFragment, kotlin.jvm.internal.u uVar) {
        this.f16630u = reworkLoginFragment;
        this.f16631v = uVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean b10 = kotlin.jvm.internal.i.b(String.valueOf(editable), "");
        ReworkLoginFragment reworkLoginFragment = this.f16630u;
        if (!b10) {
            int i6 = ReworkLoginFragment.C;
            RobertoEditText robertoEditText = (RobertoEditText) reworkLoginFragment.I().findViewById(R.id.etOTPDialog2);
            if (robertoEditText != null) {
                robertoEditText.requestFocus();
            }
        }
        int i10 = ReworkLoginFragment.C;
        this.f16631v.f23466u = ReworkLoginFragment.F(reworkLoginFragment, reworkLoginFragment.I());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
