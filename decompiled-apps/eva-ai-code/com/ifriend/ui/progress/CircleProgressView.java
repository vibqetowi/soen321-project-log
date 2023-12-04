package com.ifriend.ui.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CircleProgressView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ifriend/ui/progress/CircleProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "arcProportion", "", "mainPaint", "Landroid/graphics/Paint;", "margin", "rectangle", "Landroid/graphics/RectF;", "va", "Landroid/animation/ValueAnimator;", "onAttachedToWindow", "", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CircleProgressView extends View {
    public static final int $stable = 8;
    private float arcProportion;
    private final Paint mainPaint;
    private float margin;
    private RectF rectangle;
    private final ValueAnimator va;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.mainPaint = paint;
        this.arcProportion = 1.0f;
        paint.setAntiAlias(true);
        paint.setColor(ContextCompat.getColor(context, R.color.white));
        post(new Runnable() { // from class: com.ifriend.ui.progress.CircleProgressView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CircleProgressView._init_$lambda$0(CircleProgressView.this);
            }
        });
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(UIUtils.INSTANCE.getToPx((Number) 2));
        this.margin = paint.getStrokeWidth() / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ifriend.ui.progress.CircleProgressView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircleProgressView.va$lambda$2$lambda$1(CircleProgressView.this, valueAnimator);
            }
        });
        ofFloat.setRepeatCount(-1);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        this.va = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CircleProgressView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        double radians = Math.toRadians(45.0d);
        this$0.mainPaint.setShader(new LinearGradient(0.0f, 0.0f, ((float) Math.cos(radians)) * this$0.getWidth(), ((float) Math.sin(radians)) * this$0.getWidth(), new int[]{Color.parseColor("#FFE2CD"), Color.parseColor("#FEC2E7"), Color.parseColor("#C9E7FF"), Color.parseColor("#86FEF4")}, (float[]) null, Shader.TileMode.REPEAT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void va$lambda$2$lambda$1(CircleProgressView this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.arcProportion = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.va.start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.va.cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.rectangle == null) {
            float f = this.margin;
            this.rectangle = new RectF(f + 0.0f, f + 0.0f, getWidth() - this.margin, getHeight() - this.margin);
        }
        RectF rectF = this.rectangle;
        Intrinsics.checkNotNull(rectF);
        canvas.drawArc(rectF, -90.0f, this.arcProportion * 360, false, this.mainPaint);
    }
}
