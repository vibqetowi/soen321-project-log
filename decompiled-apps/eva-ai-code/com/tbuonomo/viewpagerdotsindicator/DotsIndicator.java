package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DotsIndicator.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0007H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "dotsElevation", "", "dotsWidthFactor", "linearLayout", "Landroid/widget/LinearLayout;", "progressMode", "", "value", "selectedDotColor", "getSelectedDotColor", "()I", "setSelectedDotColor", "(I)V", "type", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "addDot", "", FirebaseAnalytics.Param.INDEX, "buildOnPageChangedListener", "Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "init", "refreshDotColor", "removeDot", "setSelectedPointColor", "color", "Companion", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsIndicator extends BaseDotsIndicator {
    public static final Companion Companion = new Companion(null);
    public static final float DEFAULT_WIDTH_FACTOR = 2.5f;
    private final ArgbEvaluator argbEvaluator;
    private float dotsElevation;
    private float dotsWidthFactor;
    private LinearLayout linearLayout;
    private boolean progressMode;
    private int selectedDotColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.argbEvaluator = new ArgbEvaluator();
        init(attributeSet);
    }

    /* compiled from: DotsIndicator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator$Companion;", "", "()V", "DEFAULT_WIDTH_FACTOR", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        refreshDotsColors();
    }

    private final void init(AttributeSet attributeSet) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayout");
            linearLayout2 = null;
        }
        addView(linearLayout2, -2, -2);
        this.dotsWidthFactor = 2.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DotsIndicator);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.DotsIndicator)");
            setSelectedDotColor(obtainStyledAttributes.getColor(R.styleable.DotsIndicator_selectedDotColor, BaseDotsIndicator.DEFAULT_POINT_COLOR));
            float f = obtainStyledAttributes.getFloat(R.styleable.DotsIndicator_dotsWidthFactor, 2.5f);
            this.dotsWidthFactor = f;
            if (f < 1.0f) {
                Log.w("DotsIndicator", "The dotsWidthFactor can't be set under 1.0f, please set an higher value");
                this.dotsWidthFactor = 1.0f;
            }
            this.progressMode = obtainStyledAttributes.getBoolean(R.styleable.DotsIndicator_progressMode, false);
            this.dotsElevation = obtainStyledAttributes.getDimension(R.styleable.DotsIndicator_dotsElevation, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            addDots(5);
            refreshDots();
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void addDot(final int i) {
        View dot = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) dot.findViewById(R.id.dot);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        dot.setLayoutDirection(0);
        layoutParams2.height = (int) getDotsSize();
        layoutParams2.width = layoutParams2.height;
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        DotsGradientDrawable dotsGradientDrawable = new DotsGradientDrawable();
        dotsGradientDrawable.setCornerRadius(getDotsCornerRadius());
        if (isInEditMode()) {
            dotsGradientDrawable.setColor(i == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            BaseDotsIndicator.Pager pager = getPager();
            Intrinsics.checkNotNull(pager);
            dotsGradientDrawable.setColor(pager.getCurrentItem() == i ? this.selectedDotColor : getDotsColor());
        }
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ExtensionsKt.setBackgroundCompat(imageView, dotsGradientDrawable);
        dot.setOnClickListener(new View.OnClickListener() { // from class: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DotsIndicator.m7201addDot$lambda0(DotsIndicator.this, i, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dot, "dot");
        ExtensionsKt.setPaddingHorizontal(dot, (int) (this.dotsElevation * 0.8f));
        ExtensionsKt.setPaddingVertical(dot, (int) (this.dotsElevation * 2));
        imageView.setElevation(this.dotsElevation);
        this.dots.add(imageView);
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayout");
            linearLayout = null;
        }
        linearLayout.addView(dot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addDot$lambda-0  reason: not valid java name */
    public static final void m7201addDot$lambda0(DotsIndicator this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getDotsClickable()) {
            BaseDotsIndicator.Pager pager = this$0.getPager();
            if (i < (pager != null ? pager.getCount() : 0)) {
                BaseDotsIndicator.Pager pager2 = this$0.getPager();
                Intrinsics.checkNotNull(pager2);
                pager2.setCurrentItem(i, true);
            }
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void removeDot() {
        LinearLayout linearLayout = this.linearLayout;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayout");
            linearLayout = null;
        }
        LinearLayout linearLayout3 = this.linearLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayout");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout.removeViewAt(linearLayout2.getChildCount() - 1);
        this.dots.remove(this.dots.size() - 1);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public OnPageChangeListenerHelper buildOnPageChangedListener() {
        return new OnPageChangeListenerHelper() { // from class: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$buildOnPageChangedListener$1
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public void onPageScrolled$viewpagerdotsindicator_release(int i, int i2, float f) {
                float f2;
                float f3;
                ArgbEvaluator argbEvaluator;
                ArgbEvaluator argbEvaluator2;
                boolean z;
                ImageView imageView = DotsIndicator.this.dots.get(i);
                Intrinsics.checkNotNullExpressionValue(imageView, "dots[selectedPosition]");
                ImageView imageView2 = imageView;
                float dotsSize = DotsIndicator.this.getDotsSize();
                float dotsSize2 = DotsIndicator.this.getDotsSize();
                f2 = DotsIndicator.this.dotsWidthFactor;
                float f4 = 1;
                ExtensionsKt.setWidth(imageView2, (int) (dotsSize + (dotsSize2 * (f2 - f4) * (f4 - f))));
                if (ExtensionsKt.isInBounds(DotsIndicator.this.dots, i2)) {
                    ImageView imageView3 = DotsIndicator.this.dots.get(i2);
                    Intrinsics.checkNotNullExpressionValue(imageView3, "dots[nextPosition]");
                    ImageView imageView4 = imageView3;
                    float dotsSize3 = DotsIndicator.this.getDotsSize();
                    float dotsSize4 = DotsIndicator.this.getDotsSize();
                    f3 = DotsIndicator.this.dotsWidthFactor;
                    ExtensionsKt.setWidth(imageView4, (int) (dotsSize3 + (dotsSize4 * (f3 - f4) * f)));
                    Drawable background = imageView2.getBackground();
                    if (background == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                    }
                    DotsGradientDrawable dotsGradientDrawable = (DotsGradientDrawable) background;
                    Drawable background2 = imageView4.getBackground();
                    if (background2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
                    }
                    DotsGradientDrawable dotsGradientDrawable2 = (DotsGradientDrawable) background2;
                    if (DotsIndicator.this.getSelectedDotColor() != DotsIndicator.this.getDotsColor()) {
                        argbEvaluator = DotsIndicator.this.argbEvaluator;
                        Object evaluate = argbEvaluator.evaluate(f, Integer.valueOf(DotsIndicator.this.getSelectedDotColor()), Integer.valueOf(DotsIndicator.this.getDotsColor()));
                        if (evaluate != null) {
                            int intValue = ((Integer) evaluate).intValue();
                            argbEvaluator2 = DotsIndicator.this.argbEvaluator;
                            Object evaluate2 = argbEvaluator2.evaluate(f, Integer.valueOf(DotsIndicator.this.getDotsColor()), Integer.valueOf(DotsIndicator.this.getSelectedDotColor()));
                            if (evaluate2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                            dotsGradientDrawable2.setColor(((Integer) evaluate2).intValue());
                            z = DotsIndicator.this.progressMode;
                            if (z) {
                                BaseDotsIndicator.Pager pager = DotsIndicator.this.getPager();
                                Intrinsics.checkNotNull(pager);
                                if (i <= pager.getCurrentItem()) {
                                    dotsGradientDrawable.setColor(DotsIndicator.this.getSelectedDotColor());
                                }
                            }
                            dotsGradientDrawable.setColor(intValue);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                }
                DotsIndicator.this.invalidate();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public void resetPosition$viewpagerdotsindicator_release(int i) {
                ImageView imageView = DotsIndicator.this.dots.get(i);
                Intrinsics.checkNotNullExpressionValue(imageView, "dots[position]");
                ExtensionsKt.setWidth(imageView, (int) DotsIndicator.this.getDotsSize());
                DotsIndicator.this.refreshDotColor(i);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public int getPageCount$viewpagerdotsindicator_release() {
                return DotsIndicator.this.dots.size();
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r4 < r2.getCurrentItem()) goto L12;
     */
    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void refreshDotColor(int i) {
        ImageView imageView = this.dots.get(i);
        Intrinsics.checkNotNullExpressionValue(imageView, "dots[index]");
        ImageView imageView2 = imageView;
        Drawable background = imageView2.getBackground();
        DotsGradientDrawable dotsGradientDrawable = background instanceof DotsGradientDrawable ? (DotsGradientDrawable) background : null;
        if (dotsGradientDrawable != null) {
            BaseDotsIndicator.Pager pager = getPager();
            Intrinsics.checkNotNull(pager);
            if (i != pager.getCurrentItem()) {
                if (this.progressMode) {
                    BaseDotsIndicator.Pager pager2 = getPager();
                    Intrinsics.checkNotNull(pager2);
                }
                dotsGradientDrawable.setColor(getDotsColor());
            }
            dotsGradientDrawable.setColor(this.selectedDotColor);
        }
        ExtensionsKt.setBackgroundCompat(imageView2, dotsGradientDrawable);
        imageView2.invalidate();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.DEFAULT;
    }

    @Deprecated(message = "Use setSelectedDotColor() instead", replaceWith = @ReplaceWith(expression = "setSelectedDotColor()", imports = {}))
    public final void setSelectedPointColor(int i) {
        setSelectedDotColor(i);
    }
}
