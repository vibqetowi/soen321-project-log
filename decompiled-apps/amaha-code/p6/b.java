package p6;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import i5.n;
import java.util.ArrayList;
import java.util.Iterator;
import q6.e;
import r6.h;
import r6.j;
import y6.f;
import y6.g;
/* compiled from: Chart.java */
/* loaded from: classes.dex */
public abstract class b<T extends h<? extends v6.d<? extends j>>> extends ViewGroup implements u6.c {
    public Paint A;
    public Paint B;
    public q6.h C;
    public boolean D;
    public q6.c E;
    public e F;
    public w6.b G;
    public String H;
    public x6.e I;
    public x6.d J;
    public t6.d K;
    public g L;
    public n6.a M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public boolean R;
    public t6.c[] S;
    public float T;
    public final ArrayList<Runnable> U;
    public boolean V;

    /* renamed from: u  reason: collision with root package name */
    public boolean f27930u;

    /* renamed from: v  reason: collision with root package name */
    public T f27931v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f27932w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27933x;

    /* renamed from: y  reason: collision with root package name */
    public float f27934y;

    /* renamed from: z  reason: collision with root package name */
    public final n f27935z;

    /* compiled from: Chart.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.postInvalidate();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27930u = false;
        this.f27931v = null;
        this.f27932w = true;
        this.f27933x = true;
        this.f27934y = 0.9f;
        this.f27935z = new n(0, 1);
        this.D = true;
        this.H = "No chart data available.";
        this.L = new g();
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.T = 0.0f;
        this.U = new ArrayList<>();
        this.V = false;
        j();
    }

    public static void l(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            int i6 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i6 < viewGroup.getChildCount()) {
                    l(viewGroup.getChildAt(i6));
                    i6++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    public final void e() {
        n6.a aVar = this.M;
        aVar.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "phaseY", 0.0f, 1.0f);
        ofFloat.setInterpolator(n6.b.a());
        long j10 = 1000;
        ofFloat.setDuration(j10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "phaseX", 0.0f, 1.0f);
        ofFloat2.setInterpolator(n6.b.a());
        ofFloat2.setDuration(j10);
        ofFloat.addUpdateListener(aVar.f25891a);
        ofFloat2.start();
        ofFloat.start();
    }

    public abstract void f();

    public final void g(Canvas canvas) {
        q6.c cVar = this.E;
        if (cVar != null && cVar.f29198a) {
            Paint paint = this.A;
            cVar.getClass();
            paint.setTypeface(null);
            this.A.setTextSize(this.E.f29201d);
            this.A.setColor(this.E.f29202e);
            this.A.setTextAlign(this.E.f29203g);
            g gVar = this.L;
            float width = (getWidth() - (gVar.f38301c - gVar.f38300b.right)) - this.E.f29199b;
            float height = getHeight() - this.L.i();
            q6.c cVar2 = this.E;
            canvas.drawText(cVar2.f, width, height - cVar2.f29200c, this.A);
        }
    }

    public n6.a getAnimator() {
        return this.M;
    }

    public y6.c getCenter() {
        return y6.c.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public y6.c getCenterOfView() {
        return getCenter();
    }

    public y6.c getCenterOffsets() {
        RectF rectF = this.L.f38300b;
        return y6.c.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.L.f38300b;
    }

    public T getData() {
        return this.f27931v;
    }

    public s6.c getDefaultValueFormatter() {
        return this.f27935z;
    }

    public q6.c getDescription() {
        return this.E;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f27934y;
    }

    public float getExtraBottomOffset() {
        return this.P;
    }

    public float getExtraLeftOffset() {
        return this.Q;
    }

    public float getExtraRightOffset() {
        return this.O;
    }

    public float getExtraTopOffset() {
        return this.N;
    }

    public t6.c[] getHighlighted() {
        return this.S;
    }

    public t6.d getHighlighter() {
        return this.K;
    }

    public ArrayList<Runnable> getJobs() {
        return this.U;
    }

    public e getLegend() {
        return this.F;
    }

    public x6.e getLegendRenderer() {
        return this.I;
    }

    public q6.d getMarker() {
        return null;
    }

    @Deprecated
    public q6.d getMarkerView() {
        getMarker();
        return null;
    }

    @Override // u6.c
    public float getMaxHighlightDistance() {
        return this.T;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public w6.c getOnChartGestureListener() {
        return null;
    }

    public w6.b getOnTouchListener() {
        return this.G;
    }

    public x6.d getRenderer() {
        return this.J;
    }

    public g getViewPortHandler() {
        return this.L;
    }

    public q6.h getXAxis() {
        return this.C;
    }

    public float getXChartMax() {
        return this.C.f29197z;
    }

    public float getXChartMin() {
        return this.C.A;
    }

    public float getXRange() {
        return this.C.B;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f27931v.f30505a;
    }

    public float getYMin() {
        return this.f27931v.f30506b;
    }

    public t6.c h(float f, float f2) {
        if (this.f27931v == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        return getHighlighter().a(f, f2);
    }

    public final void i(t6.c cVar) {
        if (cVar == null) {
            this.S = null;
        } else {
            if (this.f27930u) {
                Log.i("MPAndroidChart", "Highlighted: " + cVar.toString());
            }
            if (this.f27931v.e(cVar) == null) {
                this.S = null;
            } else {
                this.S = new t6.c[]{cVar};
            }
        }
        setLastHighlighted(this.S);
        invalidate();
    }

    public void j() {
        setWillNotDraw(false);
        this.M = new n6.a(new a());
        Context context = getContext();
        DisplayMetrics displayMetrics = f.f38290a;
        if (context == null) {
            f.f38291b = ViewConfiguration.getMinimumFlingVelocity();
            f.f38292c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            f.f38291b = viewConfiguration.getScaledMinimumFlingVelocity();
            f.f38292c = viewConfiguration.getScaledMaximumFlingVelocity();
            f.f38290a = context.getResources().getDisplayMetrics();
        }
        this.T = f.c(500.0f);
        this.E = new q6.c();
        e eVar = new e();
        this.F = eVar;
        this.I = new x6.e(this.L, eVar);
        this.C = new q6.h();
        this.A = new Paint(1);
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.B.setTextAlign(Paint.Align.CENTER);
        this.B.setTextSize(f.c(12.0f));
        if (this.f27930u) {
            Log.i("", "Chart.init()");
        }
    }

    public abstract void k();

    public final boolean m() {
        t6.c[] cVarArr = this.S;
        if (cVarArr == null || cVarArr.length <= 0 || cVarArr[0] == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            l(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f27931v == null) {
            if (!TextUtils.isEmpty(this.H)) {
                y6.c center = getCenter();
                canvas.drawText(this.H, center.f38276b, center.f38277c, this.B);
            }
        } else if (!this.R) {
            f();
            this.R = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).layout(i6, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int c10 = (int) f.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c10, i6)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c10, i10)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i6, int i10, int i11, int i12) {
        if (this.f27930u) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i6 > 0 && i10 > 0 && i6 < 10000 && i10 < 10000) {
            g gVar = this.L;
            float f = i6;
            float f2 = i10;
            RectF rectF = gVar.f38300b;
            float f10 = rectF.left;
            float f11 = rectF.top;
            float f12 = gVar.f38301c - rectF.right;
            float i13 = gVar.i();
            gVar.f38302d = f2;
            gVar.f38301c = f;
            gVar.f38300b.set(f10, f11, f - f12, f2 - i13);
            if (this.f27930u) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i6 + ", height: " + i10);
            }
            ArrayList<Runnable> arrayList = this.U;
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                post(it.next());
            }
            arrayList.clear();
        }
        k();
        super.onSizeChanged(i6, i10, i11, i12);
    }

    public void setData(T t3) {
        float max;
        this.f27931v = t3;
        int i6 = 0;
        this.R = false;
        if (t3 == null) {
            return;
        }
        float f = t3.f30506b;
        float f2 = t3.f30505a;
        if (t3 != null && t3.d() >= 2) {
            max = Math.abs(f2 - f);
        } else {
            max = Math.max(Math.abs(f), Math.abs(f2));
        }
        float g5 = f.g(max);
        if (!Float.isInfinite(g5)) {
            i6 = ((int) Math.ceil(-Math.log10(g5))) + 2;
        }
        n nVar = this.f27935z;
        nVar.d(i6);
        for (T t10 : this.f27931v.f30512i) {
            if (t10.G() || t10.u() == nVar) {
                t10.n(nVar);
            }
        }
        k();
        if (this.f27930u) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(q6.c cVar) {
        this.E = cVar;
    }

    public void setDragDecelerationEnabled(boolean z10) {
        this.f27933x = z10;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.f27934y = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z10) {
        setDrawMarkers(z10);
    }

    public void setExtraBottomOffset(float f) {
        this.P = f.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.Q = f.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.O = f.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.N = f.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z10) {
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z10) {
        this.f27932w = z10;
    }

    public void setHighlighter(t6.b bVar) {
        this.K = bVar;
    }

    public void setLastHighlighted(t6.c[] cVarArr) {
        t6.c cVar;
        if (cVarArr != null && cVarArr.length > 0 && (cVar = cVarArr[0]) != null) {
            this.G.f36567v = cVar;
        } else {
            this.G.f36567v = null;
        }
    }

    public void setLogEnabled(boolean z10) {
        this.f27930u = z10;
    }

    @Deprecated
    public void setMarkerView(q6.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f) {
        this.T = f.c(f);
    }

    public void setNoDataText(String str) {
        this.H = str;
    }

    public void setNoDataTextColor(int i6) {
        this.B.setColor(i6);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.B.setTypeface(typeface);
    }

    public void setOnTouchListener(w6.b bVar) {
        this.G = bVar;
    }

    public void setRenderer(x6.d dVar) {
        if (dVar != null) {
            this.J = dVar;
        }
    }

    public void setTouchEnabled(boolean z10) {
        this.D = z10;
    }

    public void setUnbindEnabled(boolean z10) {
        this.V = z10;
    }

    public void setDrawMarkers(boolean z10) {
    }

    public void setMarker(q6.d dVar) {
    }

    public void setOnChartGestureListener(w6.c cVar) {
    }

    public void setOnChartValueSelectedListener(w6.d dVar) {
    }
}
