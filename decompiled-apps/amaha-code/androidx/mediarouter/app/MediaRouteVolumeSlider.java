package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;
/* loaded from: classes.dex */
class MediaRouteVolumeSlider extends AppCompatSeekBar {

    /* renamed from: v  reason: collision with root package name */
    public final float f2498v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2499w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f2500x;

    /* renamed from: y  reason: collision with root package name */
    public int f2501y;

    /* renamed from: z  reason: collision with root package name */
    public int f2502z;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2498v = u.d(context);
    }

    public final void a(int i6, int i10) {
        if (this.f2501y != i6) {
            if (Color.alpha(i6) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i6));
            }
            this.f2501y = i6;
        }
        if (this.f2502z != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f2502z = i10;
        }
    }

    public final void b(boolean z10) {
        Drawable drawable;
        if (this.f2499w == z10) {
            return;
        }
        this.f2499w = z10;
        if (z10) {
            drawable = null;
        } else {
            drawable = this.f2500x;
        }
        super.setThumb(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        int i6;
        super.drawableStateChanged();
        if (isEnabled()) {
            i6 = 255;
        } else {
            i6 = (int) (this.f2498v * 255.0f);
        }
        this.f2500x.setColorFilter(this.f2501y, PorterDuff.Mode.SRC_IN);
        this.f2500x.setAlpha(i6);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.f2502z, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f2501y, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i6);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.f2500x = drawable;
        if (this.f2499w) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
