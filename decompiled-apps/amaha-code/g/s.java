package g;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class s extends androidx.fragment.app.n {
    public s() {
    }

    @Override // androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        return new r(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.n
    public void setupDialog(Dialog dialog, int i6) {
        if (dialog instanceof r) {
            r rVar = (r) dialog;
            if (i6 != 1 && i6 != 2) {
                if (i6 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            rVar.c().t(1);
            return;
        }
        super.setupDialog(dialog, i6);
    }

    public s(int i6) {
        super(i6);
    }
}
