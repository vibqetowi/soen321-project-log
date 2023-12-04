package com.ifriend.ui.utils.insets;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InsetsAnimationFrameLayout.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J(\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0012H\u0016J0\u0010'\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\bH\u0016J8\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J@\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001bH\u0016J \u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\bH\u0016J(\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J(\u00103\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J\u0010\u00104\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0018\u00104\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020\u001dH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ifriend/ui/utils/insets/InsetsAnimationFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/core/view/NestedScrollingParent3;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentNestedScrollingChild", "Landroid/view/View;", "dropNextY", "imeAnimController", "Lcom/ifriend/ui/utils/insets/SimpleImeAnimationController;", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "scrollImeOffScreenWhenVisible", "", "getScrollImeOffScreenWhenVisible", "()Z", "setScrollImeOffScreenWhenVisible", "(Z)V", "scrollImeOnScreenWhenNotVisible", "getScrollImeOnScreenWhenNotVisible", "setScrollImeOnScreenWhenNotVisible", "startViewLocation", "", "dispatchWindowInsetsAnimationPrepare", "", "animation", "Landroid/view/WindowInsetsAnimation;", "onControllerReady", "onNestedFling", TypedValues.AttributesType.S_TARGET, "velocityX", "", "velocityY", "consumed", "onNestedPreScroll", "dx", "dy", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "onStopNestedScroll", "reset", "startControlRequest", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetsAnimationFrameLayout extends FrameLayout implements NestedScrollingParent3 {
    public static final int $stable = 8;
    private View currentNestedScrollingChild;
    private int dropNextY;
    private final SimpleImeAnimationController imeAnimController;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private boolean scrollImeOffScreenWhenVisible;
    private boolean scrollImeOnScreenWhenNotVisible;
    private final int[] startViewLocation;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsetsAnimationFrameLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsetsAnimationFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return (i & 2) != 0 && i2 == 0;
    }

    public /* synthetic */ InsetsAnimationFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsAnimationFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        this.imeAnimController = new SimpleImeAnimationController();
        this.startViewLocation = new int[2];
        this.scrollImeOffScreenWhenVisible = true;
        this.scrollImeOffScreenWhenVisible = Build.VERSION.SDK_INT >= 30;
    }

    public final boolean getScrollImeOffScreenWhenVisible() {
        return this.scrollImeOffScreenWhenVisible;
    }

    public final void setScrollImeOffScreenWhenVisible(boolean z) {
        this.scrollImeOffScreenWhenVisible = z;
    }

    public final boolean getScrollImeOnScreenWhenNotVisible() {
        return this.scrollImeOnScreenWhenNotVisible;
    }

    public final void setScrollImeOnScreenWhenNotVisible(boolean z) {
        this.scrollImeOnScreenWhenNotVisible = z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, i, i2);
        this.currentNestedScrollingChild = child;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View target, int i, int i2, int[] consumed, int i3) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        boolean z = false;
        if (this.imeAnimController.isInsetAnimationRequestPending()) {
            consumed[0] = i;
            consumed[1] = i2;
            return;
        }
        int i4 = this.dropNextY;
        if (i4 != 0) {
            consumed[1] = i4;
            i2 -= i4;
            this.dropNextY = 0;
        }
        if (i2 < 0) {
            if (this.imeAnimController.isInsetAnimationInProgress()) {
                consumed[1] = consumed[1] - this.imeAnimController.insetBy(-i2);
            } else if (!this.scrollImeOffScreenWhenVisible || this.imeAnimController.isInsetAnimationRequestPending()) {
            } else {
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
                if (rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
                    z = true;
                }
                if (z) {
                    startControlRequest();
                    consumed[1] = i2;
                }
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (i4 > 0) {
            if (this.imeAnimController.isInsetAnimationInProgress()) {
                consumed[1] = -this.imeAnimController.insetBy(-i4);
            } else if (!this.scrollImeOnScreenWhenNotVisible || this.imeAnimController.isInsetAnimationRequestPending()) {
            } else {
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
                boolean z = false;
                if (rootWindowInsets != null && !rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
                    z = true;
                }
                if (z) {
                    startControlRequest();
                    consumed[1] = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View target, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.imeAnimController.isInsetAnimationInProgress()) {
            this.imeAnimController.animateToFinish(Float.valueOf(f2));
            return true;
        }
        InsetsAnimationFrameLayout insetsAnimationFrameLayout = this;
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(insetsAnimationFrameLayout);
        boolean z2 = rootWindowInsets != null && rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime());
        if (f2 > 0.0f && this.scrollImeOnScreenWhenNotVisible && !z2) {
            this.imeAnimController.startAndFling(insetsAnimationFrameLayout, f2);
            return true;
        } else if (f2 < 0.0f && this.scrollImeOffScreenWhenVisible && z2) {
            this.imeAnimController.startAndFling(insetsAnimationFrameLayout, f2);
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.nestedScrollingParentHelper.onStopNestedScroll(target, i);
        if (this.imeAnimController.isInsetAnimationInProgress() && !this.imeAnimController.isInsetAnimationFinishing()) {
            SimpleImeAnimationController.animateToFinish$default(this.imeAnimController, null, 1, null);
        }
        reset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowInsetsAnimationPrepare(WindowInsetsAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.dispatchWindowInsetsAnimationPrepare(animation);
        SimpleImeAnimationControllerKt.suppressLayoutCompat(this, false);
    }

    private final void startControlRequest() {
        SimpleImeAnimationControllerKt.suppressLayoutCompat(this, true);
        View view = this.currentNestedScrollingChild;
        if (view != null) {
            view.getLocationInWindow(this.startViewLocation);
        }
        this.imeAnimController.startControlRequest(this, new InsetsAnimationFrameLayout$startControlRequest$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onControllerReady() {
        int[] iArr;
        View view = this.currentNestedScrollingChild;
        if (view != null) {
            this.imeAnimController.insetBy(0);
            iArr = InsetsAnimationFrameLayoutKt.tempIntArray2;
            view.getLocationInWindow(iArr);
            this.dropNextY = iArr[1] - this.startViewLocation[1];
        }
    }

    private final void reset() {
        this.dropNextY = 0;
        ArraysKt.fill$default(this.startViewLocation, 0, 0, 0, 6, (Object) null);
        SimpleImeAnimationControllerKt.suppressLayoutCompat(this, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View child, View target, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        onNestedScrollAccepted(child, target, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(target, "target");
        iArr = InsetsAnimationFrameLayoutKt.tempIntArray2;
        onNestedScroll(target, i, i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        onStopNestedScroll(target, 0);
    }
}
