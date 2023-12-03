package a9;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes.dex */
public final class k extends WebView {
    public k(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
