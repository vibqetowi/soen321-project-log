package dn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: LockScreenActivity.kt */
/* loaded from: classes2.dex */
public final class g implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LockScreenActivity f13169u;

    public g(LockScreenActivity lockScreenActivity) {
        this.f13169u = lockScreenActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        LockScreenActivity lockScreenActivity = this.f13169u;
        lockScreenActivity.getClass();
        if (!kotlin.jvm.internal.i.b(String.valueOf(editable), "")) {
            ((RobertoEditText) lockScreenActivity.n0(R.id.editLock3)).requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
