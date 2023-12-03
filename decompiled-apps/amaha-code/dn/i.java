package dn;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: LockScreenActivity.kt */
/* loaded from: classes2.dex */
public final class i implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LockScreenActivity f13171u;

    public i(LockScreenActivity lockScreenActivity) {
        this.f13171u = lockScreenActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        boolean z12;
        LockScreenActivity lockScreenActivity = this.f13171u;
        lockScreenActivity.getClass();
        Editable text = ((RobertoEditText) lockScreenActivity.n0(R.id.editLock1)).getText();
        boolean z13 = false;
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            Editable text2 = ((RobertoEditText) lockScreenActivity.n0(R.id.editLock2)).getText();
            if (text2 != null && text2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                Editable text3 = ((RobertoEditText) lockScreenActivity.n0(R.id.editLock3)).getText();
                if (text3 != null && text3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    Editable text4 = ((RobertoEditText) lockScreenActivity.n0(R.id.editLock4)).getText();
                    if (!((text4 == null || text4.length() == 0) ? true : true)) {
                        lockScreenActivity.s0();
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
