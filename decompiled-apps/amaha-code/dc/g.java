package dc;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
/* compiled from: CutoutDrawable.java */
/* loaded from: classes.dex */
public class g extends yb.f {
    public static final /* synthetic */ int S = 0;
    public final RectF R;

    /* compiled from: CutoutDrawable.java */
    /* loaded from: classes.dex */
    public static class a extends g {
        public a(yb.i iVar) {
            super(iVar);
        }

        @Override // yb.f
        public final void g(Canvas canvas) {
            RectF rectF = this.R;
            if (rectF.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(rectF);
            } else {
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public g(yb.i iVar) {
        super(iVar == null ? new yb.i() : iVar);
        this.R = new RectF();
    }

    public final void o(float f, float f2, float f10, float f11) {
        RectF rectF = this.R;
        if (f != rectF.left || f2 != rectF.top || f10 != rectF.right || f11 != rectF.bottom) {
            rectF.set(f, f2, f10, f11);
            invalidateSelf();
        }
    }
}
