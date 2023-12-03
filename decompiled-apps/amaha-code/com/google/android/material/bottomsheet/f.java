package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.s;
/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes.dex */
public class f extends s {
    private boolean waitingForDismissAllowingStateLoss;

    public f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.waitingForDismissAllowingStateLoss = z10;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof e) {
            e eVar = (e) getDialog();
            eVar.f8860y.removeBottomSheetCallback(eVar.H);
        }
        bottomSheetBehavior.addBottomSheetCallback(new a());
        bottomSheetBehavior.setState(5);
    }

    private boolean tryDismissWithAnimation(boolean z10) {
        Dialog dialog = getDialog();
        if (dialog instanceof e) {
            e eVar = (e) dialog;
            if (eVar.f8860y == null) {
                eVar.e();
            }
            eVar.f8860y.isHideable();
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.n
    public void dismiss() {
        if (!tryDismissWithAnimation(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.n
    public void dismissAllowingStateLoss() {
        if (!tryDismissWithAnimation(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // g.s, androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getContext(), getTheme());
    }

    public f(int i6) {
        super(i6);
    }

    /* compiled from: BottomSheetDialogFragment.java */
    /* loaded from: classes.dex */
    public class a extends BottomSheetBehavior.f {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void c(int i6, View view) {
            if (i6 == 5) {
                f.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public final void b(View view) {
        }
    }
}
