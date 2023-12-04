package com.ifriend.chat.presentation.ui.diary.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.ifriend.chat.presentation.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GlowingDot.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0014R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/GlowingDot;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bodyColor", "centerBlurDotY", "", "centerDotX", "centerShadowLayerDotY", "circleRadiusPx", "glowingRadiusPx", "shadowLayerPaint", "Landroid/graphics/Paint;", "drawShadowLayerCircle", "", "canvas", "Landroid/graphics/Canvas;", "init", "initShadowLayerPainting", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GlowingDot extends View {
    private static final int BODY_COLOR = -4260087;
    private static final float DOT_SIZE = 10.0f;
    private static final float GLOWING_RADIUS = 2.0f;
    private int bodyColor;
    private float centerBlurDotY;
    private float centerDotX;
    private float centerShadowLayerDotY;
    private float circleRadiusPx;
    private float glowingRadiusPx;
    private Paint shadowLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public GlowingDot(Context context) {
        super(context);
        this.bodyColor = BODY_COLOR;
        init$default(this, null, 1, null);
    }

    public GlowingDot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bodyColor = BODY_COLOR;
        init(attributeSet);
    }

    public GlowingDot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bodyColor = BODY_COLOR;
        init(attributeSet);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.centerDotX = i / 2.0f;
        float f = i2 / 2.0f;
        this.centerBlurDotY = (f - this.circleRadiusPx) / 2;
        this.centerShadowLayerDotY = f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawShadowLayerCircle(canvas);
    }

    private final void drawShadowLayerCircle(Canvas canvas) {
        float f = this.centerDotX;
        float f2 = this.centerShadowLayerDotY;
        float f3 = this.circleRadiusPx;
        Paint paint = this.shadowLayerPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawCircle(f, f2, f3, paint);
    }

    static /* synthetic */ void init$default(GlowingDot glowingDot, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        glowingDot.init(attributeSet);
    }

    private final void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.GlowingDot);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int i = R.styleable.GlowingDot_dotSize;
            Companion companion = Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.circleRadiusPx = obtainStyledAttributes.getDimension(i, companion.convertDpToPixel(10.0f, context)) / 2;
            int i2 = R.styleable.GlowingDot_glowingRadius;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.glowingRadiusPx = obtainStyledAttributes.getDimension(i2, companion.convertDpToPixel(2.0f, context2));
            this.bodyColor = obtainStyledAttributes.getColor(R.styleable.GlowingDot_dotColor, BODY_COLOR);
            obtainStyledAttributes.recycle();
        } else {
            Companion companion2 = Companion;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.circleRadiusPx = companion2.convertDpToPixel(10.0f, context3);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.glowingRadiusPx = companion2.convertDpToPixel(2.0f, context4);
        }
        initShadowLayerPainting();
    }

    private final void initShadowLayerPainting() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(255);
        paint.setColor(this.bodyColor);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(this.glowingRadiusPx * 2, 0.0f, 0.0f, this.bodyColor);
        this.shadowLayerPaint = paint;
    }

    /* compiled from: GlowingDot.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/GlowingDot$Companion;", "", "()V", "BODY_COLOR", "", "DOT_SIZE", "", "GLOWING_RADIUS", "convertDpToPixel", "valueDp", "context", "Landroid/content/Context;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float convertDpToPixel(float f, Context context) {
            return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        }
    }
}
