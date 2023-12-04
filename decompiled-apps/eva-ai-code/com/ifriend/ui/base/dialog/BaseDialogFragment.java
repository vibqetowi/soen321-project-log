package com.ifriend.ui.base.dialog;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.ifriend.ui.R;
import kotlin.Metadata;
/* compiled from: BaseDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/ui/base/dialog/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDialogFragment extends DialogFragment {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.AppDialogTheme);
    }
}
