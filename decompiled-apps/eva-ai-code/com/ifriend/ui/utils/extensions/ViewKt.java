package com.ifriend.ui.utils.extensions;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: view.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"expandClickableArea", "", "Landroid/view/View;", "sizeInDp", "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewKt {
    public static /* synthetic */ void expandClickableArea$default(View view, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 24;
        }
        expandClickableArea(view, i);
    }

    public static final void expandClickableArea(final View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final int roundToInt = MathKt.roundToInt(UIUtils.INSTANCE.getToPx(Integer.valueOf(i)));
        view.post(new Runnable() { // from class: com.ifriend.ui.utils.extensions.ViewKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewKt.expandClickableArea$lambda$0(view, roundToInt);
            }
        });
    }

    public static final void expandClickableArea$lambda$0(View this_expandClickableArea, int i) {
        Intrinsics.checkNotNullParameter(this_expandClickableArea, "$this_expandClickableArea");
        Rect rect = new Rect();
        this_expandClickableArea.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i;
        rect.left -= i;
        rect.right += i;
        TouchDelegate touchDelegate = new TouchDelegate(rect, this_expandClickableArea);
        ViewParent parent = this_expandClickableArea.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return;
        }
        view.setTouchDelegate(touchDelegate);
    }
}
