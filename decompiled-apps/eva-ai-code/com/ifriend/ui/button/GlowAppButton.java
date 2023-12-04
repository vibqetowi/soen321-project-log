package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.ui.R;
import com.ifriend.ui.databinding.GlowAppButtonBinding;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GlowAppButton.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010+\u001a\u00020\u0012J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\u0006\u0010/\u001a\u00020\u001eJ\b\u00100\u001a\u00020-H\u0014J\u0018\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u001a\u00106\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020\u0012H\u0016J\u000e\u00109\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001eJ\b\u0010:\u001a\u00020-H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R$\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R$\u0010(\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016¨\u0006<"}, d2 = {"Lcom/ifriend/ui/button/GlowAppButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/ifriend/ui/databinding/GlowAppButtonBinding;", "text", "", "buttonText", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "cornerRadius", "", "getCornerRadius", "()I", "setCornerRadius", "(I)V", "glowColor", "getGlowColor", "setGlowColor", "mButtonColor", "mCornerRadius", "mGlowColor", "mIsNeedToShowGlow", "", "mPressedGlowSize", "mUnpressedGlowSize", "pressedGlowSize", "getPressedGlowSize", "setPressedGlowSize", "color", "textColor", "getTextColor", "setTextColor", "unpressedGlowSize", "getUnpressedGlowSize", "setUnpressedGlowSize", "getBackgroundColor", "initButtonIcon", "", "initDefaultValues", "isShowGlow", "onFinishInflate", "onTouch", "v", "Landroid/view/View;", "motionEvent", "Landroid/view/MotionEvent;", "parseAttrs", "setBackgroundColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "showGlow", "updateButtonGlow", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowAppButton extends ConstraintLayout implements View.OnTouchListener {
    private final GlowAppButtonBinding binding;
    private int mButtonColor;
    private int mCornerRadius;
    private int mGlowColor;
    private boolean mIsNeedToShowGlow;
    private int mPressedGlowSize;
    private int mUnpressedGlowSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GlowAppButton(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GlowAppButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowAppButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlowAppButtonBinding inflate = GlowAppButtonBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setStateListAnimator(null);
        setOnTouchListener(this);
        initDefaultValues();
        parseAttrs(context, attributeSet);
        initButtonIcon();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            setAlpha(0.8f);
        } else if (action == 1 || action == 3) {
            setAlpha(1.0f);
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            setBackground(Companion.getBackgroundWithGlow(this, this.mButtonColor, this.mGlowColor, this.mCornerRadius, this.mUnpressedGlowSize, this.mPressedGlowSize, this.mIsNeedToShowGlow));
            return false;
        } else if (action2 != 1) {
            return false;
        } else {
            int i = this.mButtonColor;
            int i2 = this.mGlowColor;
            int i3 = this.mCornerRadius;
            int i4 = this.mUnpressedGlowSize;
            setBackground(Companion.getBackgroundWithGlow(this, i, i2, i3, i4, i4, this.mIsNeedToShowGlow));
            return false;
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateButtonGlow();
    }

    private final void parseAttrs(Context context, AttributeSet attributeSet) {
        int[] GlowAppButton = R.styleable.GlowAppButton;
        Intrinsics.checkNotNullExpressionValue(GlowAppButton, "GlowAppButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GlowAppButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.mButtonColor = obtainStyledAttributes.getColor(R.styleable.GlowAppButton_buttonColor, ContextCompat.getColor(context, R.color.default_background_color));
        this.mGlowColor = obtainStyledAttributes.getColor(R.styleable.GlowAppButton_glowColor, ContextCompat.getColor(context, R.color.default_glow_color));
        this.mIsNeedToShowGlow = obtainStyledAttributes.getBoolean(R.styleable.GlowAppButton_isShowGlow, false);
        this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.GlowAppButton_cornerRadius, (int) obtainStyledAttributes.getResources().getDimension(R.dimen.default_corner_radius));
        this.mUnpressedGlowSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.GlowAppButton_unpressedGlowSize, (int) obtainStyledAttributes.getResources().getDimension(R.dimen.default_unpressed_glow_size));
        String string = obtainStyledAttributes.getString(R.styleable.GlowAppButton_buttonText);
        if (string == null) {
            string = "";
        }
        setButtonText(string);
        this.mPressedGlowSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.GlowAppButton_pressedGlowSize, (int) obtainStyledAttributes.getResources().getDimension(R.dimen.default_pressed_glow_size));
        obtainStyledAttributes.recycle();
    }

    private final void updateButtonGlow() {
        int i = this.mButtonColor;
        int i2 = this.mGlowColor;
        int i3 = this.mCornerRadius;
        int i4 = this.mUnpressedGlowSize;
        setBackground(Companion.getBackgroundWithGlow(this, i, i2, i3, i4, i4, this.mIsNeedToShowGlow));
    }

    private final void initDefaultValues() {
        Resources resources = getResources();
        if (resources == null) {
            return;
        }
        this.mButtonColor = ContextCompat.getColor(getContext(), R.color.default_background_color);
        this.mGlowColor = ContextCompat.getColor(getContext(), R.color.default_glow_color);
        this.mCornerRadius = resources.getDimensionPixelSize(R.dimen.default_corner_radius);
        this.mUnpressedGlowSize = resources.getDimensionPixelSize(R.dimen.default_unpressed_glow_size);
        this.mPressedGlowSize = resources.getDimensionPixelSize(R.dimen.default_pressed_glow_size);
    }

    private final void initButtonIcon() {
        try {
            this.binding.icon.setImageResource(R.drawable.ic_google_icon);
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.mButtonColor == i) {
            return;
        }
        this.mButtonColor = i;
        updateButtonGlow();
    }

    public final boolean isShowGlow() {
        return this.mIsNeedToShowGlow;
    }

    public final void showGlow(boolean z) {
        if (z == this.mIsNeedToShowGlow) {
            return;
        }
        this.mIsNeedToShowGlow = z;
        updateButtonGlow();
    }

    public final int getBackgroundColor() {
        return this.mButtonColor;
    }

    public final String getButtonText() {
        return this.binding.text.getText().toString();
    }

    public final void setButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.text.setText(text);
    }

    public final int getTextColor() {
        return this.binding.text.getCurrentTextColor();
    }

    public final void setTextColor(int i) {
        this.binding.text.setTextColor(i);
    }

    public final int getGlowColor() {
        return this.mGlowColor;
    }

    public final void setGlowColor(int i) {
        this.mGlowColor = i;
        updateButtonGlow();
    }

    public final int getUnpressedGlowSize() {
        return this.mUnpressedGlowSize;
    }

    public final void setUnpressedGlowSize(int i) {
        this.mUnpressedGlowSize = i;
        updateButtonGlow();
    }

    public final int getPressedGlowSize() {
        return this.mPressedGlowSize;
    }

    public final void setPressedGlowSize(int i) {
        this.mPressedGlowSize = i;
        updateButtonGlow();
    }

    public final int getCornerRadius() {
        return this.mCornerRadius;
    }

    public final void setCornerRadius(int i) {
        this.mCornerRadius = i;
        updateButtonGlow();
    }

    /* compiled from: GlowAppButton.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/button/GlowAppButton$Companion;", "", "()V", "getBackgroundWithGlow", "Landroid/graphics/drawable/Drawable;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "glowColor", "cornerRadius", "unPressedGlowSize", "pressedGlowSize", "isShowGlow", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Drawable getBackgroundWithGlow(View view, int i, int i2, int i3, int i4, int i5, boolean z) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i6 = z ? i4 : 0;
            if (!z) {
                i5 = 0;
            }
            float[] fArr = new float[8];
            Arrays.fill(fArr, i3);
            Rect rect = new Rect();
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setPadding(rect);
            shapeDrawable.getPaint().setColor(i);
            if (z) {
                shapeDrawable.getPaint().setShadowLayer(i5, 0.0f, 0.0f, i2);
                view.setLayerType(1, shapeDrawable.getPaint());
            } else {
                view.setLayerType(0, shapeDrawable.getPaint());
            }
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
            if (z) {
                layerDrawable.setLayerInset(0, i6, i6, i6, i6);
            }
            return layerDrawable;
        }
    }
}
