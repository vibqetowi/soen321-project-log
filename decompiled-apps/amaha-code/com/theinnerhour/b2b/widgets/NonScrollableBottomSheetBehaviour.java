package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: NonScrollableBottomSheetBehaviour.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/widgets/NonScrollableBottomSheetBehaviour;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NonScrollableBottomSheetBehaviour<V extends View> extends BottomSheetBehavior<V> {
    public NonScrollableBottomSheetBehaviour() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        i.g(parent, "parent");
        i.g(child, "child");
        i.g(event, "event");
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float f, float f2) {
        i.g(coordinatorLayout, "coordinatorLayout");
        i.g(child, "child");
        i.g(target, "target");
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int i6, int i10, int[] consumed, int i11) {
        i.g(coordinatorLayout, "coordinatorLayout");
        i.g(child, "child");
        i.g(target, "target");
        i.g(consumed, "consumed");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int i6, int i10) {
        i.g(coordinatorLayout, "coordinatorLayout");
        i.g(child, "child");
        i.g(directTargetChild, "directTargetChild");
        i.g(target, "target");
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int i6) {
        i.g(coordinatorLayout, "coordinatorLayout");
        i.g(child, "child");
        i.g(target, "target");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        i.g(parent, "parent");
        i.g(child, "child");
        i.g(event, "event");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonScrollableBottomSheetBehaviour(Context context, AttributeSet attrs) {
        super(context, attrs);
        i.g(context, "context");
        i.g(attrs, "attrs");
    }
}
