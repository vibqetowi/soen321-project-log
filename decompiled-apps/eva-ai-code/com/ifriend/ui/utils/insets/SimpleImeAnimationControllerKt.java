package com.ifriend.ui.utils.insets;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SimpleImeAnimationController.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0003\u001a\u0012\u0010\r\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\t*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"SCROLL_THRESHOLD", "", "linearInterpolator", "Landroid/view/animation/LinearInterpolator;", "tmpIntArr", "", "tryHiddenSuppressLayout", "", "hiddenSuppressLayout", "", "group", "Landroid/view/ViewGroup;", "suppress", "copyBoundsInWindow", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "suppressLayoutCompat", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimpleImeAnimationControllerKt {
    private static final float SCROLL_THRESHOLD = 0.15f;
    private static final LinearInterpolator linearInterpolator = new LinearInterpolator();
    private static final int[] tmpIntArr = new int[2];
    private static boolean tryHiddenSuppressLayout = true;

    public static final void copyBoundsInWindow(View view, Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (view.isLaidOut() && view.isAttachedToWindow()) {
            rect.set(0, 0, view.getWidth(), view.getHeight());
            int[] iArr = tmpIntArr;
            view.getLocationInWindow(iArr);
            rect.offset(iArr[0], iArr[1]);
            return;
        }
        throw new IllegalArgumentException("Can not copy bounds as view is not laid out or attached to window");
    }

    public static final void suppressLayoutCompat(ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            hiddenSuppressLayout(viewGroup, z);
        }
    }

    private static final void hiddenSuppressLayout(ViewGroup viewGroup, boolean z) {
        if (tryHiddenSuppressLayout) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                tryHiddenSuppressLayout = false;
            }
        }
    }
}
