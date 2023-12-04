package androidx.core.text.method;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.os.BuildCompat;
/* loaded from: classes3.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (!BuildCompat.isAtLeastV()) {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 1 || action == 0) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                    int lineForVertical = layout.getLineForVertical(scrollY);
                    float f = scrollX;
                    if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                        z = false;
                    }
                }
                if (z) {
                    Selection.removeSelection(spannable);
                    return Touch.onTouchEvent(textView, spannable, motionEvent);
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }
}
