package gn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class h implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f16636u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16637v;

    public h(ReworkLoginFragment reworkLoginFragment, kotlin.jvm.internal.u uVar) {
        this.f16636u = uVar;
        this.f16637v = reworkLoginFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i6 = ReworkLoginFragment.C;
        ReworkLoginFragment reworkLoginFragment = this.f16637v;
        this.f16636u.f23466u = ReworkLoginFragment.F(reworkLoginFragment, reworkLoginFragment.I());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
