package s9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: u  reason: collision with root package name */
    public Dialog f31330u;

    /* renamed from: v  reason: collision with root package name */
    public DialogInterface.OnCancelListener f31331v;

    /* renamed from: w  reason: collision with root package name */
    public AlertDialog f31332w;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31331v;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f31330u;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f31332w == null) {
                Activity activity = getActivity();
                v9.o.h(activity);
                this.f31332w = new AlertDialog.Builder(activity).create();
            }
            return this.f31332w;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
