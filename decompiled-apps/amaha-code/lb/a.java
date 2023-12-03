package lb;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public final Dialog f24198u;

    /* renamed from: v  reason: collision with root package name */
    public final int f24199v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24200w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24201x;

    public a(Dialog dialog, Rect rect) {
        this.f24198u = dialog;
        this.f24199v = rect.left;
        this.f24200w = rect.top;
        this.f24201x = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f24199v;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f24200w;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i6 = this.f24201x;
            obtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f24198u.onTouchEvent(obtain);
    }
}
