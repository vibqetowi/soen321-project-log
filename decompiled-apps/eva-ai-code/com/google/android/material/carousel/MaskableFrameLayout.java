package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
/* loaded from: classes2.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    private final RectF maskRect;
    private float maskXPercentage;
    private final MaskableDelegate maskableDelegate;
    private OnMaskChangedListener onMaskChangedListener;
    private Boolean savedForceCompatClippingEnabled;
    private ShapeAppearanceModel shapeAppearanceModel;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maskXPercentage = 0.0f;
        this.maskRect = new RectF();
        this.maskableDelegate = createMaskableDelegate();
        this.savedForceCompatClippingEnabled = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }

    private MaskableDelegate createMaskableDelegate() {
        if (Build.VERSION.SDK_INT >= 33) {
            return new MaskableDelegateV33(this);
        }
        return new MaskableDelegateV22(this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onMaskChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.maskableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.maskableDelegate.isForceCompatClippingEnabled());
        this.maskableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.carousel.MaskableFrameLayout$$ExternalSyntheticLambda1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
            }
        });
        this.shapeAppearanceModel = withTransformedCornerSizes;
        this.maskableDelegate.onShapeAppearanceChanged(this, withTransformedCornerSizes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskXPercentage(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (this.maskXPercentage != clamp) {
            this.maskXPercentage = clamp;
            onMaskChanged();
        }
    }

    @Override // com.google.android.material.carousel.Maskable
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.carousel.Maskable
    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    private void onMaskChanged() {
        if (getWidth() == 0) {
            return;
        }
        float lerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
        this.maskRect.set(lerp, 0.0f, getWidth() - lerp, getHeight());
        this.maskableDelegate.onMaskChanged(this, this.maskRect);
        OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    public void setForceCompatClipping(boolean z) {
        this.maskableDelegate.setForceCompatClippingEnabled(this, z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.maskableDelegate.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.carousel.MaskableFrameLayout$$ExternalSyntheticLambda0
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                MaskableFrameLayout.this.m6640x418c47c0(canvas2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$dispatchDraw$1$com-google-android-material-carousel-MaskableFrameLayout  reason: not valid java name */
    public /* synthetic */ void m6640x418c47c0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class MaskableDelegate {
        boolean forceCompatClippingEnabled;
        RectF maskBounds;
        ShapeAppearanceModel shapeAppearanceModel;
        final Path shapePath;

        abstract void invalidateClippingMethod(View view);

        abstract boolean shouldUseCompatClipping();

        private MaskableDelegate() {
            this.forceCompatClippingEnabled = false;
            this.maskBounds = new RectF();
            this.shapePath = new Path();
        }

        boolean isForceCompatClippingEnabled() {
            return this.forceCompatClippingEnabled;
        }

        void setForceCompatClippingEnabled(View view, boolean z) {
            if (z != this.forceCompatClippingEnabled) {
                this.forceCompatClippingEnabled = z;
                invalidateClippingMethod(view);
            }
        }

        void onShapeAppearanceChanged(View view, ShapeAppearanceModel shapeAppearanceModel) {
            this.shapeAppearanceModel = shapeAppearanceModel;
            updateShapePath();
            invalidateClippingMethod(view);
        }

        void onMaskChanged(View view, RectF rectF) {
            this.maskBounds = rectF;
            updateShapePath();
            invalidateClippingMethod(view);
        }

        private void updateShapePath() {
            if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
                return;
            }
            ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
        }

        void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
            if (shouldUseCompatClipping() && !this.shapePath.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.shapePath);
                canvasOperation.run(canvas);
                canvas.restore();
                return;
            }
            canvasOperation.run(canvas);
        }
    }

    /* loaded from: classes2.dex */
    private static class MaskableDelegateV14 extends MaskableDelegate {
        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        boolean shouldUseCompatClipping() {
            return true;
        }

        private MaskableDelegateV14() {
            super();
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        void invalidateClippingMethod(View view) {
            if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
                return;
            }
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class MaskableDelegateV22 extends MaskableDelegate {
        private boolean isShapeRoundRect;

        MaskableDelegateV22(View view) {
            super();
            this.isShapeRoundRect = false;
            initMaskOutlineProvider(view);
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public boolean shouldUseCompatClipping() {
            return !this.isShapeRoundRect || this.forceCompatClippingEnabled;
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        void invalidateClippingMethod(View view) {
            updateIsShapeRoundRect();
            view.setClipToOutline(!shouldUseCompatClipping());
            if (shouldUseCompatClipping()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        private void updateIsShapeRoundRect() {
            if (this.maskBounds.isEmpty() || this.shapeAppearanceModel == null) {
                return;
            }
            this.isShapeRoundRect = this.shapeAppearanceModel.isRoundRect(this.maskBounds);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getCornerRadiusFromShapeAppearance(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            return shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF);
        }

        private void initMaskOutlineProvider(View view) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV22.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (MaskableDelegateV22.this.shapeAppearanceModel == null || MaskableDelegateV22.this.maskBounds.isEmpty()) {
                        return;
                    }
                    int i = (int) MaskableDelegateV22.this.maskBounds.left;
                    int i2 = (int) MaskableDelegateV22.this.maskBounds.top;
                    int i3 = (int) MaskableDelegateV22.this.maskBounds.right;
                    int i4 = (int) MaskableDelegateV22.this.maskBounds.bottom;
                    MaskableDelegateV22 maskableDelegateV22 = MaskableDelegateV22.this;
                    outline.setRoundRect(i, i2, i3, i4, maskableDelegateV22.getCornerRadiusFromShapeAppearance(maskableDelegateV22.shapeAppearanceModel, MaskableDelegateV22.this.maskBounds));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class MaskableDelegateV33 extends MaskableDelegate {
        MaskableDelegateV33(View view) {
            super();
            initMaskOutlineProvider(view);
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        public boolean shouldUseCompatClipping() {
            return this.forceCompatClippingEnabled;
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
        void invalidateClippingMethod(View view) {
            view.setClipToOutline(!shouldUseCompatClipping());
            if (shouldUseCompatClipping()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        private void initMaskOutlineProvider(View view) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegateV33.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (MaskableDelegateV33.this.shapePath.isEmpty()) {
                        return;
                    }
                    outline.setPath(MaskableDelegateV33.this.shapePath);
                }
            });
        }
    }
}
