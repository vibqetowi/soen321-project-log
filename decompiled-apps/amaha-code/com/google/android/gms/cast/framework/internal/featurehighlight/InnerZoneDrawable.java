package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f7273a;

    /* renamed from: b  reason: collision with root package name */
    public float f7274b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f7274b <= 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, this.f7273a * 0.0f, null);
            return;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f7274b = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f7273a = f;
        invalidateSelf();
    }
}
