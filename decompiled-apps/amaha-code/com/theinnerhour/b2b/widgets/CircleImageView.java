package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.utils.LogHelper;
import hc.d;
/* loaded from: classes2.dex */
public class CircleImageView extends AppCompatImageView {
    public static final ImageView.ScaleType R = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config S = Bitmap.Config.ARGB_8888;
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public int D;
    public int E;
    public int F;
    public Bitmap G;
    public BitmapShader H;
    public int I;
    public int J;
    public float K;
    public float L;
    public ColorFilter M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f11823x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f11824y;

    /* renamed from: z  reason: collision with root package name */
    public final Matrix f11825z;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11823x = new RectF();
        this.f11824y = new RectF();
        this.f11825z = new Matrix();
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = -16777216;
        this.E = 0;
        this.F = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.E, 0, 0);
        this.E = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.D = obtainStyledAttributes.getColor(0, -16777216);
        this.P = obtainStyledAttributes.getBoolean(1, false);
        this.F = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        super.setScaleType(R);
        this.N = true;
        if (this.O) {
            d();
            this.O = false;
        }
    }

    public final void c() {
        Bitmap createBitmap;
        Bitmap bitmap = null;
        if (this.Q) {
            this.G = null;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        boolean z10 = drawable instanceof ColorDrawable;
                        Bitmap.Config config = S;
                        if (z10) {
                            createBitmap = Bitmap.createBitmap(2, 2, config);
                        } else {
                            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                        }
                        Canvas canvas = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap = createBitmap;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(e10);
                    }
                }
            }
            this.G = bitmap;
        }
        d();
    }

    public final void d() {
        int width;
        int height;
        float width2;
        float height2;
        int i6;
        if (!this.N) {
            this.O = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            if (this.G == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.G;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.H = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = this.A;
            paint.setAntiAlias(true);
            paint.setShader(this.H);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.B;
            paint2.setStyle(style);
            paint2.setAntiAlias(true);
            paint2.setColor(this.D);
            paint2.setStrokeWidth(this.E);
            Paint.Style style2 = Paint.Style.FILL;
            Paint paint3 = this.C;
            paint3.setStyle(style2);
            paint3.setAntiAlias(true);
            paint3.setColor(this.F);
            this.J = this.G.getHeight();
            this.I = this.G.getWidth();
            int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            float paddingLeft = ((width - min) / 2.0f) + getPaddingLeft();
            float paddingTop = ((height - min) / 2.0f) + getPaddingTop();
            float f = min;
            RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
            RectF rectF2 = this.f11824y;
            rectF2.set(rectF);
            this.L = Math.min((rectF2.height() - this.E) / 2.0f, (rectF2.width() - this.E) / 2.0f);
            RectF rectF3 = this.f11823x;
            rectF3.set(rectF2);
            if (!this.P && (i6 = this.E) > 0) {
                float f2 = i6 - 1.0f;
                rectF3.inset(f2, f2);
            }
            this.K = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
            if (paint != null) {
                paint.setColorFilter(this.M);
            }
            Matrix matrix = this.f11825z;
            matrix.set(null);
            float f10 = 0.0f;
            if (rectF3.height() * this.I > rectF3.width() * this.J) {
                width2 = rectF3.height() / this.J;
                f10 = (rectF3.width() - (this.I * width2)) * 0.5f;
                height2 = 0.0f;
            } else {
                width2 = rectF3.width() / this.I;
                height2 = (rectF3.height() - (this.J * width2)) * 0.5f;
            }
            matrix.setScale(width2, width2);
            matrix.postTranslate(((int) (f10 + 0.5f)) + rectF3.left, ((int) (height2 + 0.5f)) + rectF3.top);
            this.H.setLocalMatrix(matrix);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.D;
    }

    public int getBorderWidth() {
        return this.E;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.M;
    }

    @Deprecated
    public int getFillColor() {
        return this.F;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return R;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.Q) {
            super.onDraw(canvas);
        } else if (this.G == null) {
        } else {
            int i6 = this.F;
            RectF rectF = this.f11823x;
            if (i6 != 0) {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.K, this.C);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.K, this.A);
            if (this.E > 0) {
                RectF rectF2 = this.f11824y;
                canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), this.L, this.B);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        d();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (!z10) {
            return;
        }
        throw new IllegalArgumentException("adjustViewBounds not supported.");
    }

    public void setBorderColor(int i6) {
        if (i6 == this.D) {
            return;
        }
        this.D = i6;
        this.B.setColor(i6);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(int i6) {
        setBorderColor(getContext().getResources().getColor(i6));
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 == this.P) {
            return;
        }
        this.P = z10;
        d();
    }

    public void setBorderWidth(int i6) {
        if (i6 == this.E) {
            return;
        }
        this.E = i6;
        d();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.M) {
            return;
        }
        this.M = colorFilter;
        Paint paint = this.A;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidate();
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        c();
    }

    @Deprecated
    public void setFillColor(int i6) {
        if (i6 == this.F) {
            return;
        }
        this.F = i6;
        this.C.setColor(i6);
        invalidate();
    }

    @Deprecated
    public void setFillColorResource(int i6) {
        setFillColor(getContext().getResources().getColor(i6));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i6) {
        super.setImageResource(i6);
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c();
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        super.setPadding(i6, i10, i11, i12);
        d();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
        super.setPaddingRelative(i6, i10, i11, i12);
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == R) {
            return;
        }
        throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
    }
}
