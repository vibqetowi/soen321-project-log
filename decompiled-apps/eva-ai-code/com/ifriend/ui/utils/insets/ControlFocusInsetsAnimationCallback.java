package com.ifriend.ui.utils.insets;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.ui.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ControlFocusInsetsAnimationCallback.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/utils/insets/ControlFocusInsetsAnimationCallback;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "dispatchMode", "", "(Landroid/view/View;I)V", "checkFocus", "", "onEnd", "animation", "Landroidx/core/view/WindowInsetsAnimationCompat;", "onProgress", "Landroidx/core/view/WindowInsetsCompat;", "insets", "runningAnimations", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ControlFocusInsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {
    public static final int $stable = 8;
    private final View view;

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        return insets;
    }

    public /* synthetic */ ControlFocusInsetsAnimationCallback(View view, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlFocusInsetsAnimationCallback(View view, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if ((animation.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
            this.view.post(new Runnable() { // from class: com.ifriend.ui.utils.insets.ControlFocusInsetsAnimationCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ControlFocusInsetsAnimationCallback.onEnd$lambda$0(ControlFocusInsetsAnimationCallback.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEnd$lambda$0(ControlFocusInsetsAnimationCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkFocus();
    }

    private final void checkFocus() {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.view);
        boolean z = false;
        if (rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
            z = true;
        }
        if (z && this.view.getRootView().findFocus() == null) {
            UIHelper.INSTANCE.showKeyboard(this.view);
        } else if (z || !this.view.isFocused()) {
        } else {
            UIHelper.INSTANCE.hideKeyboard(this.view);
        }
    }
}
