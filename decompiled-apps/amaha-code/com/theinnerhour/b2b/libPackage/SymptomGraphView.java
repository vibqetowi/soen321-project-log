package com.theinnerhour.b2b.libPackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.UiUtils;
import g0.a;
import hc.d;
import hs.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SymptomGraphView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R*\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR*\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R*\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R*\u0010(\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R*\u0010,\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R*\u00100\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R*\u00108\u001a\u0002012\u0006\u0010\b\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010A\u001a\b\u0012\u0004\u0012\u00020:098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/theinnerhour/b2b/libPackage/SymptomGraphView;", "Landroid/view/View;", "", "Lhs/f;", "", "getLabelsCoordinates", "()[Lhs/f;", "", "value", "E", "I", "getLinesCount", "()I", "setLinesCount", "(I)V", "linesCount", "F", "getLinesWidth", "()F", "setLinesWidth", "(F)V", "linesWidth", "G", "getLinesSpace", "setLinesSpace", "linesSpace", "H", "getSectionsCount", "setSectionsCount", "sectionsCount", "getSectionsSpace", "setSectionsSpace", "sectionsSpace", "J", "getMidStartExtraOffset", "setMidStartExtraOffset", "midStartExtraOffset", "K", "getStartDegreeOffset", "setStartDegreeOffset", "startDegreeOffset", "L", "getLabelRadiusOffset", "setLabelRadiusOffset", "labelRadiusOffset", "M", "getLabelOffset", "setLabelOffset", "labelOffset", "", "N", "Z", "getShowComparison", "()Z", "setShowComparison", "(Z)V", "showComparison", "", "", "P", "Ljava/util/List;", "getSectionLabels", "()Ljava/util/List;", "setSectionLabels", "(Ljava/util/List;)V", "sectionLabels", "Q", "[Ljava/lang/Integer;", "setSectionsValue", "([Ljava/lang/Integer;)V", "sectionsValue", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SymptomGraphView extends View {
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public int E;
    public float F;
    public float G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public float O;
    public List<String> P;
    public Integer[] Q;
    public final ArrayList R;

    /* renamed from: u  reason: collision with root package name */
    public Bitmap f11720u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11721v;

    /* renamed from: w  reason: collision with root package name */
    public Canvas f11722w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f11723x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f11724y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f11725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymptomGraphView(Context mContext, AttributeSet attributeSet) {
        super(mContext, attributeSet, 0);
        i.g(mContext, "mContext");
        new LinkedHashMap();
        this.f11723x = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.P = new ArrayList();
        this.Q = new Integer[0];
        this.R = new ArrayList();
        setLinesCount(5);
        UiUtils.Companion companion = UiUtils.Companion;
        setLinesSpace(companion.dpToPx(mContext, 0));
        setLinesWidth(companion.dpToPx(mContext, 16));
        setSectionsCount(0);
        setSectionsSpace(companion.dpToPx(mContext, 0));
        setMidStartExtraOffset(companion.dpToPx(mContext, 28));
        setLabelRadiusOffset(companion.dpToPx(mContext, 20));
        setLabelOffset(companion.dpToPx(mContext, 20));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = mContext.obtainStyledAttributes(attributeSet, d.L);
            i.f(obtainStyledAttributes, "mContext.obtainStyledAtt…yleable.SymptomGraphView)");
            setLinesCount(obtainStyledAttributes.getInt(0, this.E));
            setLinesSpace(obtainStyledAttributes.getDimension(1, this.G));
            setLinesWidth(obtainStyledAttributes.getDimension(2, this.F));
            setSectionsCount(obtainStyledAttributes.getInt(4, this.H));
            setSectionsSpace(obtainStyledAttributes.getDimension(5, this.I));
            setMidStartExtraOffset(obtainStyledAttributes.getDimension(3, this.J));
            setStartDegreeOffset(obtainStyledAttributes.getFloat(6, this.K));
            obtainStyledAttributes.recycle();
        }
        c();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f11724y = paint;
        paint.setStrokeWidth(this.F);
        Paint paint2 = new Paint();
        paint2.setColor(0);
        this.f11725z = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(a.b(getContext(), R.color.title_high_contrast));
        paint3.setStrokeWidth(2.0f);
        paint3.setAntiAlias(true);
        this.A = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(a.b(getContext(), R.color.title_high_contrast));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(0.2f);
        paint4.setAntiAlias(true);
        this.B = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(a.b(getContext(), R.color.white));
        this.C = paint5;
        Paint paint6 = new Paint(1);
        paint6.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Lato-Medium.ttf"));
        Context context = getContext();
        i.f(context, "context");
        paint6.setTextSize(companion.dpToPx(context, 10));
        paint6.setColor(a.b(getContext(), R.color.title_high_contrast));
        this.D = paint6;
        paint2.setStrokeWidth(this.I);
    }

    private final f<Float, Float>[] getLabelsCoordinates() {
        int i6;
        float f;
        if (this.N) {
            i6 = this.H / 2;
        } else {
            i6 = this.H;
        }
        f<Float, Float>[] fVarArr = new f[i6];
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float f2 = this.G;
        float f10 = this.F;
        float f11 = 2;
        float f12 = (this.J / f11) + ((f2 + f10) * this.E) + f10 + this.L;
        for (int i10 = 0; i10 < i6; i10++) {
            float f13 = this.K;
            float f14 = i10;
            boolean z10 = this.N;
            float f15 = this.O;
            if (z10) {
                f15 *= f11;
            }
            double d10 = (f14 * f15) + f13;
            if (z10) {
                f = this.O;
            } else {
                f = this.O / f11;
            }
            double d11 = d10 + f;
            fVarArr[i10] = new f<>(Float.valueOf((((float) Math.cos(Math.toRadians(d11))) * f12) + width), Float.valueOf((((float) Math.sin(Math.toRadians(d11))) * f12) + height));
        }
        return fVarArr;
    }

    private final void setSectionsValue(Integer[] numArr) {
        this.Q = numArr;
        invalidate();
    }

    public final int a() {
        float f = this.F;
        float f2 = 2;
        return (int) ((f * f2) + ((this.G + f) * this.E * f2) + this.J + getPaddingBottom() + getPaddingTop());
    }

    public final int b() {
        float f = this.F;
        float f2 = 2;
        return (int) ((f * f2) + ((this.G + f) * this.E * f2) + this.J + getPaddingRight() + getPaddingLeft());
    }

    public final void c() {
        if (this.H < 1) {
            setSectionsCount(1);
        }
        int i6 = this.H;
        this.O = 360 / i6;
        Integer[] numArr = new Integer[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            numArr[i10] = Integer.valueOf((i10 % this.E) + 1);
        }
        setSectionsValue(numArr);
        this.R.clear();
    }

    public final void d(int i6, int i10, int i11) {
        if (i6 >= 0 && i6 <= this.H - 1 && i10 >= 0 && i10 <= this.E) {
            this.Q[i6] = Integer.valueOf(i10);
            this.R.add(i6, Integer.valueOf(a.b(getContext(), i11)));
            invalidate();
        }
    }

    public final float getLabelOffset() {
        return this.M;
    }

    public final float getLabelRadiusOffset() {
        return this.L;
    }

    public final int getLinesCount() {
        return this.E;
    }

    public final float getLinesSpace() {
        return this.G;
    }

    public final float getLinesWidth() {
        return this.F;
    }

    public final float getMidStartExtraOffset() {
        return this.J;
    }

    public final List<String> getSectionLabels() {
        return this.P;
    }

    public final int getSectionsCount() {
        return this.H;
    }

    public final float getSectionsSpace() {
        return this.I;
    }

    public final boolean getShowComparison() {
        return this.N;
    }

    public final float getStartDegreeOffset() {
        return this.K;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f11720u == null || this.f11721v) {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f11720u = createBitmap;
            if (createBitmap != null) {
                createBitmap.eraseColor(0);
            }
            this.f11721v = false;
            if (this.f11720u != null) {
                Bitmap bitmap = this.f11720u;
                i.d(bitmap);
                this.f11722w = new Canvas(bitmap);
            }
        }
        Canvas canvas3 = this.f11722w;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int i6 = 2;
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        int i10 = this.E;
        int i11 = 1;
        if (1 <= i10) {
            int i12 = 1;
            while (true) {
                Canvas canvas4 = this.f11722w;
                if (canvas4 != null) {
                    float f = this.F;
                    canvas4.drawCircle(width, height, (this.J / 2) + ((this.G + f) * (i12 - 1)) + f, this.B);
                }
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
        }
        int i13 = this.E;
        if (1 <= i13) {
            while (true) {
                float f2 = this.F;
                float f10 = i6;
                float f11 = (this.J / f10) + (f2 / f10) + ((this.G + f2) * (i11 - 1));
                float f12 = width - f11;
                float f13 = height - f11;
                float f14 = f11 + width;
                float f15 = f11 + height;
                int i14 = this.H;
                for (int i15 = 0; i15 < i14; i15++) {
                    if (this.Q[i15].intValue() >= i11) {
                        Paint paint = this.f11724y;
                        paint.setColor(((Number) this.R.get(i15)).intValue());
                        float f16 = this.K;
                        float f17 = this.O;
                        float f18 = (i15 * f17) + f16;
                        RectF rectF = this.f11723x;
                        rectF.set(f12, f13, f14, f15);
                        Canvas canvas5 = this.f11722w;
                        if (canvas5 != null) {
                            canvas5.drawArc(rectF, f18, f17, false, paint);
                        }
                    }
                }
                if (i11 == i13) {
                    break;
                }
                i11++;
                i6 = 2;
            }
        }
        float sqrt = ((float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getWidth(), 2.0d))) / 4;
        int i16 = this.H;
        for (int i17 = 0; i17 < i16; i17++) {
            double d10 = (i17 * this.O) + this.K;
            float cos = (float) Math.cos(Math.toRadians(d10));
            float sin = (float) Math.sin(Math.toRadians(d10));
            boolean z10 = this.N;
            Paint paint2 = this.A;
            if (z10) {
                Canvas canvas6 = this.f11722w;
                if (canvas6 != null) {
                    float f19 = (cos * sqrt) + width;
                    float f20 = (sin * sqrt) + height;
                    if (i17 % 2 != 0) {
                        paint2 = this.f11725z;
                    }
                    canvas6.drawLine(width, height, f19, f20, paint2);
                }
            } else {
                Canvas canvas7 = this.f11722w;
                if (canvas7 != null) {
                    canvas7.drawLine(width, height, (cos * sqrt) + width, (sin * sqrt) + height, paint2);
                }
            }
        }
        f<Float, Float>[] labelsCoordinates = getLabelsCoordinates();
        int length = labelsCoordinates.length;
        for (int i18 = 0; i18 < length; i18++) {
            f<Float, Float> fVar = labelsCoordinates[i18];
            if (fVar != null && (canvas2 = this.f11722w) != null) {
                Extensions.drawTextMultiLine$default(Extensions.INSTANCE, canvas2, this.P.get(i18), fVar.f19464u.floatValue() - this.M, fVar.f19465v.floatValue() - this.M, this.D, null, 16, null);
            }
        }
        if (canvas != null) {
            Bitmap bitmap2 = this.f11720u;
            i.d(bitmap2);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        if (canvas != null) {
            canvas.drawCircle(width, height, this.J / 2, this.C);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    size = b();
                }
            } else {
                size = b();
            }
        } else {
            int b10 = b();
            if (size > b10) {
                size = b10;
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    size2 = a();
                }
            } else {
                size2 = a();
            }
        } else {
            int a10 = a();
            if (size2 > a10) {
                size2 = a10;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void requestLayout() {
        this.f11721v = true;
        super.requestLayout();
    }

    public final void setLabelOffset(float f) {
        this.M = f;
        invalidate();
    }

    public final void setLabelRadiusOffset(float f) {
        this.L = f;
        invalidate();
    }

    public final void setLinesCount(int i6) {
        this.E = i6;
        c();
        requestLayout();
    }

    public final void setLinesSpace(float f) {
        this.G = f;
        requestLayout();
    }

    public final void setLinesWidth(float f) {
        this.F = f;
        Paint paint = this.f11724y;
        if (paint != null) {
            paint.setStrokeWidth(f);
        }
        requestLayout();
    }

    public final void setMidStartExtraOffset(float f) {
        this.J = f;
        requestLayout();
    }

    public final void setSectionLabels(List<String> list) {
        i.g(list, "<set-?>");
        this.P = list;
    }

    public final void setSectionsCount(int i6) {
        this.H = i6;
        c();
        invalidate();
    }

    public final void setSectionsSpace(float f) {
        this.I = f;
        Paint paint = this.f11725z;
        if (paint != null) {
            paint.setStrokeWidth(f);
        }
        invalidate();
    }

    public final void setShowComparison(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public final void setStartDegreeOffset(float f) {
        this.K = f;
        invalidate();
    }
}
