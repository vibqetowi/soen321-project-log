package com.ifriend.popup.impl;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DialogSizeExtensions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"setFullScreen", "", "Landroidx/fragment/app/DialogFragment;", "setHorizontalMargin", "marginInDp", "", "setWidthPercent", "percentage", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DialogSizeExtensionsKt {
    public static final void setHorizontalMargin(DialogFragment dialogFragment, int i) {
        Window window;
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float width = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels).width() - UIUtils.INSTANCE.getToPx(Integer.valueOf(i));
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout((int) width, -2);
    }

    public static final void setWidthPercent(DialogFragment dialogFragment, int i) {
        Window window;
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float width = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels).width() * (i / 100);
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout((int) width, -2);
    }

    public static final void setFullScreen(DialogFragment dialogFragment) {
        Window window;
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Dialog dialog = dialogFragment.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }
}
