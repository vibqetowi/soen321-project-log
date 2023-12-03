package q6;

import android.graphics.Paint;
import android.util.DisplayMetrics;
/* compiled from: YAxis.java */
/* loaded from: classes.dex */
public final class i extends q6.a {
    public final a H;
    public final boolean C = true;
    public final boolean D = true;
    public final float E = 10.0f;
    public final float F = 10.0f;
    public final int G = 1;
    public final float I = Float.POSITIVE_INFINITY;

    /* compiled from: YAxis.java */
    /* loaded from: classes.dex */
    public enum a {
        LEFT,
        RIGHT
    }

    public i(a aVar) {
        this.H = aVar;
        this.f29200c = 0.0f;
    }

    @Override // q6.a
    public final void a(float f, float f2) {
        if (this.f29195x) {
            f = this.A;
        }
        if (this.f29196y) {
            f2 = this.f29197z;
        }
        float abs = Math.abs(f2 - f);
        if (abs == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        if (!this.f29195x) {
            this.A = f - ((abs / 100.0f) * this.F);
        }
        if (!this.f29196y) {
            this.f29197z = ((abs / 100.0f) * this.E) + f2;
        }
        this.B = Math.abs(this.f29197z - this.A);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.f29201d);
        String c10 = c();
        DisplayMetrics displayMetrics = y6.f.f38290a;
        float measureText = (this.f29199b * 2.0f) + ((int) paint.measureText(c10));
        float f = this.I;
        if (f > 0.0f && f != Float.POSITIVE_INFINITY) {
            f = y6.f.c(f);
        }
        if (f <= 0.0d) {
            f = measureText;
        }
        return Math.max(0.0f, Math.min(measureText, f));
    }
}
