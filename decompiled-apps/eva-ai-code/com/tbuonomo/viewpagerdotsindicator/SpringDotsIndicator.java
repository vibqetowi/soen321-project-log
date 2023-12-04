package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SpringDotsIndicator.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0007J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0010H\u0002J\b\u0010,\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/SpringDotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dampingRatio", "", "dotIndicatorColor", "dotIndicatorSize", "dotIndicatorSpring", "Landroidx/dynamicanimation/animation/SpringAnimation;", "dotIndicatorView", "Landroid/view/View;", "dotsStrokeColor", "dotsStrokeWidth", "stiffness", "strokeDotsLinearLayout", "Landroid/widget/LinearLayout;", "type", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "addDot", "", FirebaseAnalytics.Param.INDEX, "buildDot", "Landroid/view/ViewGroup;", "stroke", "", "buildOnPageChangedListener", "Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "refreshDotColor", "removeDot", "setDotIndicatorColor", "color", "setDotsStrokeWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "setStrokeDotsIndicatorColor", "setUpDotBackground", "dotView", "setUpDotIndicator", "Companion", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpringDotsIndicator extends BaseDotsIndicator {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_DAMPING_RATIO = 0.5f;
    private static final int DEFAULT_STIFFNESS = 300;
    private float dampingRatio;
    private int dotIndicatorColor;
    private final float dotIndicatorSize;
    private SpringAnimation dotIndicatorSpring;
    private View dotIndicatorView;
    private int dotsStrokeColor;
    private float dotsStrokeWidth;
    private float stiffness;
    private final LinearLayout strokeDotsLinearLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpringDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.strokeDotsLinearLayout = linearLayout;
        float dpToPxF = dpToPxF(24.0f);
        setClipToPadding(false);
        int i2 = (int) dpToPxF;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        this.dotsStrokeWidth = dpToPxF(2.0f);
        int themePrimaryColor = ExtensionsKt.getThemePrimaryColor(context);
        this.dotIndicatorColor = themePrimaryColor;
        this.dotsStrokeColor = themePrimaryColor;
        this.stiffness = 300.0f;
        this.dampingRatio = 0.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpringDotsIndicator);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext().obtainStyle…able.SpringDotsIndicator)");
            this.dotIndicatorColor = obtainStyledAttributes.getColor(R.styleable.SpringDotsIndicator_dotsColor, this.dotIndicatorColor);
            this.dotsStrokeColor = obtainStyledAttributes.getColor(R.styleable.SpringDotsIndicator_dotsStrokeColor, this.dotIndicatorColor);
            this.stiffness = obtainStyledAttributes.getFloat(R.styleable.SpringDotsIndicator_stiffness, this.stiffness);
            this.dampingRatio = obtainStyledAttributes.getFloat(R.styleable.SpringDotsIndicator_dampingRatio, this.dampingRatio);
            this.dotsStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.SpringDotsIndicator_dotsStrokeWidth, this.dotsStrokeWidth);
            obtainStyledAttributes.recycle();
        }
        this.dotIndicatorSize = getDotsSize();
        if (isInEditMode()) {
            addDots(5);
            addView(buildDot(false));
        }
        setUpDotIndicator();
    }

    /* compiled from: SpringDotsIndicator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/SpringDotsIndicator$Companion;", "", "()V", "DEFAULT_DAMPING_RATIO", "", "DEFAULT_STIFFNESS", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0.isEmpty() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setUpDotIndicator() {
        boolean z;
        BaseDotsIndicator.Pager pager = getPager();
        if (pager != null) {
            z = true;
        }
        z = false;
        if (z) {
            return;
        }
        View view = this.dotIndicatorView;
        if (view != null && indexOfChild(view) != -1) {
            removeView(this.dotIndicatorView);
        }
        ViewGroup buildDot = buildDot(false);
        this.dotIndicatorView = buildDot;
        addView(buildDot);
        this.dotIndicatorSpring = new SpringAnimation(this.dotIndicatorView, SpringAnimation.TRANSLATION_X);
        SpringForce springForce = new SpringForce(0.0f);
        springForce.setDampingRatio(this.dampingRatio);
        springForce.setStiffness(this.stiffness);
        SpringAnimation springAnimation = this.dotIndicatorSpring;
        Intrinsics.checkNotNull(springAnimation);
        springAnimation.setSpring(springForce);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void addDot(final int i) {
        ViewGroup buildDot = buildDot(true);
        buildDot.setOnClickListener(new View.OnClickListener() { // from class: com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpringDotsIndicator.m7202addDot$lambda0(SpringDotsIndicator.this, i, view);
            }
        });
        ArrayList<ImageView> arrayList = this.dots;
        View findViewById = buildDot.findViewById(R.id.spring_dot);
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        arrayList.add((ImageView) findViewById);
        this.strokeDotsLinearLayout.addView(buildDot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addDot$lambda-0  reason: not valid java name */
    public static final void m7202addDot$lambda0(SpringDotsIndicator this$0, int i, View view) {
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

    private final ViewGroup buildDot(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.spring_dot_layout, (ViewGroup) this, false);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) inflate;
        viewGroup.setLayoutDirection(0);
        ImageView dotView = (ImageView) viewGroup.findViewById(R.id.spring_dot);
        dotView.setBackgroundResource(z ? R.drawable.spring_dot_stroke_background : R.drawable.spring_dot_background);
        ViewGroup.LayoutParams layoutParams = dotView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = (int) (z ? getDotsSize() : this.dotIndicatorSize);
        layoutParams2.width = layoutParams2.height;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        Intrinsics.checkNotNullExpressionValue(dotView, "dotView");
        setUpDotBackground(z, dotView);
        return viewGroup;
    }

    private final void setUpDotBackground(boolean z, View view) {
        Drawable background = view.findViewById(R.id.spring_dot).getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.dotsStrokeWidth, this.dotsStrokeColor);
        } else {
            gradientDrawable.setColor(this.dotIndicatorColor);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void removeDot() {
        LinearLayout linearLayout = this.strokeDotsLinearLayout;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        this.dots.remove(this.dots.size() - 1);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public void refreshDotColor(int i) {
        ImageView imageView = this.dots.get(i);
        Intrinsics.checkNotNullExpressionValue(imageView, "dots[index]");
        setUpDotBackground(true, imageView);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public OnPageChangeListenerHelper buildOnPageChangedListener() {
        return new OnPageChangeListenerHelper() { // from class: com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator$buildOnPageChangedListener$1
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public void resetPosition$viewpagerdotsindicator_release(int i) {
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public int getPageCount$viewpagerdotsindicator_release() {
                return SpringDotsIndicator.this.dots.size();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public void onPageScrolled$viewpagerdotsindicator_release(int i, int i2, float f) {
                SpringAnimation springAnimation;
                float dotsSize = SpringDotsIndicator.this.getDotsSize() + (SpringDotsIndicator.this.getDotsSpacing() * 2);
                ViewParent parent = SpringDotsIndicator.this.dots.get(i).getParent();
                if (parent != null) {
                    float left = ((ViewGroup) parent).getLeft() + (dotsSize * f);
                    springAnimation = SpringDotsIndicator.this.dotIndicatorSpring;
                    if (springAnimation != null) {
                        springAnimation.animateToFinalPosition(left);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        };
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.SPRING;
    }

    public final void setDotIndicatorColor(int i) {
        View view = this.dotIndicatorView;
        if (view != null) {
            this.dotIndicatorColor = i;
            Intrinsics.checkNotNull(view);
            setUpDotBackground(false, view);
        }
    }

    public final void setStrokeDotsIndicatorColor(int i) {
        this.dotsStrokeColor = i;
        Iterator<ImageView> it = this.dots.iterator();
        while (it.hasNext()) {
            ImageView v = it.next();
            Intrinsics.checkNotNullExpressionValue(v, "v");
            setUpDotBackground(true, v);
        }
    }

    public final void setDotsStrokeWidth(float f) {
        this.dotsStrokeWidth = f;
        Iterator<ImageView> it = this.dots.iterator();
        while (it.hasNext()) {
            ImageView v = it.next();
            Intrinsics.checkNotNullExpressionValue(v, "v");
            setUpDotBackground(true, v);
        }
    }
}
