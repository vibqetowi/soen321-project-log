package x6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.appsflyer.R;
/* compiled from: DataRenderer.java */
/* loaded from: classes.dex */
public abstract class d extends g3.f {

    /* renamed from: c  reason: collision with root package name */
    public final n6.a f37621c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f37622d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f37623e;
    public final Paint f;

    public d(n6.a aVar, y6.g gVar) {
        super(1, gVar);
        this.f37621c = aVar;
        Paint paint = new Paint(1);
        this.f37622d = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(y6.f.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f37623e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f37623e.setStrokeWidth(2.0f);
        this.f37623e.setColor(Color.rgb(255, 187, (int) R.styleable.AppCompatTheme_tooltipFrameBackground));
    }

    public final void d(v6.d dVar) {
        Paint paint = this.f;
        dVar.E();
        paint.setTypeface(null);
        paint.setTextSize(dVar.t());
    }

    public abstract void e(Canvas canvas);

    public abstract void f(Canvas canvas);

    public abstract void g(Canvas canvas, t6.c[] cVarArr);

    public final void h(Canvas canvas, s6.c cVar, float f, r6.j jVar, int i6, float f2, float f10, int i10) {
        Paint paint = this.f;
        paint.setColor(i10);
        canvas.drawText(cVar.g(f), f2, f10, paint);
    }

    public abstract void i(Canvas canvas);

    public abstract void m();

    public boolean n(u6.a aVar) {
        if (aVar.getData().d() < aVar.getMaxVisibleCount() * ((y6.g) this.f16181b).f38306i) {
            return true;
        }
        return false;
    }
}
