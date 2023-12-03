package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
/* compiled from: LockableBottomSheetBehavior.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b+\u00101J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\tR\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00062"}, d2 = {"Lcom/theinnerhour/b2b/utils/LockableBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "coordinatorLayout", "directTargetChild", "target", "", "axes", "type", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "Lhs/k;", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "enable", "toggleScrolling", "swipeEnabled", "Z", "getSwipeEnabled", "()Z", "setSwipeEnabled", "(Z)V", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LockableBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    private boolean swipeEnabled;

    public LockableBottomSheetBehavior() {
        this.swipeEnabled = true;
    }

    public final boolean getSwipeEnabled() {
        return this.swipeEnabled;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        kotlin.jvm.internal.i.g(parent, "parent");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(event, "event");
        if (this.swipeEnabled) {
            return super.onInterceptTouchEvent(parent, child, event);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float f, float f2) {
        kotlin.jvm.internal.i.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(target, "target");
        if (this.swipeEnabled) {
            return super.onNestedPreFling(coordinatorLayout, child, target, f, f2);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int i6, int i10, int[] consumed, int i11) {
        kotlin.jvm.internal.i.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(target, "target");
        kotlin.jvm.internal.i.g(consumed, "consumed");
        if (this.swipeEnabled) {
            super.onNestedPreScroll(coordinatorLayout, child, target, i6, i10, consumed, i11);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int i6, int i10) {
        kotlin.jvm.internal.i.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(directTargetChild, "directTargetChild");
        kotlin.jvm.internal.i.g(target, "target");
        if (this.swipeEnabled) {
            return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, i6, i10);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int i6) {
        kotlin.jvm.internal.i.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(target, "target");
        if (this.swipeEnabled) {
            super.onStopNestedScroll(coordinatorLayout, child, target, i6);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        kotlin.jvm.internal.i.g(parent, "parent");
        kotlin.jvm.internal.i.g(child, "child");
        kotlin.jvm.internal.i.g(event, "event");
        if (this.swipeEnabled) {
            return super.onTouchEvent(parent, child, event);
        }
        return false;
    }

    public final void setSwipeEnabled(boolean z10) {
        this.swipeEnabled = z10;
    }

    public final void toggleScrolling(boolean z10) {
        this.swipeEnabled = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableBottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(attrs, "attrs");
        this.swipeEnabled = true;
    }
}
