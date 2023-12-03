package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.theinnerhour.b2b.R;
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: u  reason: collision with root package name */
    public final x f1196u;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1196u;
        Drawable drawable = xVar.f1577e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = xVar.f1576d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1196u.f1577e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1196u.d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.seekBarStyle);
        g1.a(getContext(), this);
        x xVar = new x(this);
        this.f1196u = xVar;
        xVar.a(attributeSet, R.attr.seekBarStyle);
    }
}
