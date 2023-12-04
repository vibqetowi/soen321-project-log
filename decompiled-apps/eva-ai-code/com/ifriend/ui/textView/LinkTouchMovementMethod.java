package com.ifriend.ui.textView;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LinkTouchMovementMethod.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/ui/textView/LinkTouchMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "mPressedSpan", "Lcom/ifriend/ui/textView/TouchableSpan;", "getPressedSpan", "textView", "Landroid/widget/TextView;", "spannable", "Landroid/text/Spannable;", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "onTouchEvent", "", "positionWithinTag", "position", "", ViewHierarchyConstants.TAG_KEY, "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkTouchMovementMethod extends LinkMovementMethod {
    public static final int $stable = 8;
    private TouchableSpan mPressedSpan;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent event) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            TouchableSpan pressedSpan = getPressedSpan(textView, spannable, event);
            this.mPressedSpan = pressedSpan;
            if (pressedSpan != null) {
                Intrinsics.checkNotNull(pressedSpan);
                pressedSpan.setPressed(true);
                Selection.setSelection(spannable, spannable.getSpanStart(this.mPressedSpan), spannable.getSpanEnd(this.mPressedSpan));
            }
        } else if (event.getAction() == 2) {
            TouchableSpan pressedSpan2 = getPressedSpan(textView, spannable, event);
            TouchableSpan touchableSpan = this.mPressedSpan;
            if (touchableSpan != null && pressedSpan2 != touchableSpan) {
                Intrinsics.checkNotNull(touchableSpan);
                touchableSpan.setPressed(false);
                this.mPressedSpan = null;
                Selection.removeSelection(spannable);
            }
        } else {
            TouchableSpan touchableSpan2 = this.mPressedSpan;
            if (touchableSpan2 != null) {
                Intrinsics.checkNotNull(touchableSpan2);
                touchableSpan2.setPressed(false);
                super.onTouchEvent(textView, spannable, event);
            }
            this.mPressedSpan = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }

    private final TouchableSpan getPressedSpan(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), x);
        Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TouchableSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        Object[] objArr = (TouchableSpan[]) spans;
        if ((!(objArr.length == 0)) && positionWithinTag(offsetForHorizontal, spannable, objArr[0])) {
            return objArr[0];
        }
        return null;
    }

    private final boolean positionWithinTag(int i, Spannable spannable, Object obj) {
        return i >= spannable.getSpanStart(obj) && i <= spannable.getSpanEnd(obj);
    }
}
