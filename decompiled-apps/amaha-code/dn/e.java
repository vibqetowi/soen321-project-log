package dn;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: LockScreenActivity.kt */
/* loaded from: classes2.dex */
public final class e implements View.OnKeyListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LockScreenActivity f13167u;

    public e(LockScreenActivity lockScreenActivity) {
        this.f13167u = lockScreenActivity;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        boolean z10;
        LockScreenActivity lockScreenActivity = this.f13167u;
        lockScreenActivity.getClass();
        if (i6 == 67) {
            kotlin.jvm.internal.i.d(keyEvent);
            if (keyEvent.getAction() == 0) {
                Editable text = ((RobertoEditText) lockScreenActivity.n0(R.id.editLock4)).getText();
                if (text != null && text.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    ((RobertoEditText) lockScreenActivity.n0(R.id.editLock3)).setText("");
                    ((RobertoEditText) lockScreenActivity.n0(R.id.editLock3)).requestFocus();
                }
            }
        }
        return false;
    }
}
