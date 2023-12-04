package com.ifriend.chat.presentation.ui.diary.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ifriend.chat.presentation.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GradientColorTextView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/GradientColorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "angle", "endGradientColor", "isInitialized", "", "partsOfEndColor", "partsOfStartColor", "startGradientColor", "setText", "", "text", "", "type", "Landroid/widget/TextView$BufferType;", "updateShader", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradientColorTextView extends AppCompatTextView {
    public static final int DEFAULT_ANGLE = 45;
    public static final int DEFAULT_END_COLOR = -7829368;
    public static final int DEFAULT_PARTS_OF_END_COLOR = 1;
    public static final int DEFAULT_PARTS_OF_START_COLOR = 1;
    public static final int DEFAULT_START_COLOR = -16777216;
    private int angle;
    private int endGradientColor;
    private boolean isInitialized;
    private int partsOfEndColor;
    private int partsOfStartColor;
    private int startGradientColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientColorTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GradientColorTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientColorTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startGradientColor = -16777216;
        this.endGradientColor = DEFAULT_END_COLOR;
        this.angle = 45;
        this.partsOfStartColor = 1;
        this.partsOfEndColor = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GradientColorTextView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.startGradientColor = obtainStyledAttributes.getColor(R.styleable.GradientColorTextView_startColor, -16777216);
            this.endGradientColor = obtainStyledAttributes.getColor(R.styleable.GradientColorTextView_endColor, DEFAULT_END_COLOR);
            this.angle = obtainStyledAttributes.getInt(R.styleable.GradientColorTextView_gradientAngle, 45);
            this.partsOfStartColor = obtainStyledAttributes.getInt(R.styleable.GradientColorTextView_partsOfStartColor, 1);
            this.partsOfEndColor = obtainStyledAttributes.getInt(R.styleable.GradientColorTextView_partsOfEndColor, 1);
            obtainStyledAttributes.recycle();
        }
        this.isInitialized = true;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.isInitialized) {
            updateShader(charSequence);
        }
    }

    private final void updateShader(CharSequence charSequence) {
        float measureText = getPaint().measureText(String.valueOf(charSequence));
        int i = this.partsOfStartColor;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = this.startGradientColor;
        }
        int i3 = this.partsOfEndColor;
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr2[i4] = this.endGradientColor;
        }
        int[] plus = ArraysKt.plus(iArr, iArr2);
        int i5 = this.partsOfStartColor;
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = 0.0f;
        }
        int i7 = this.partsOfEndColor;
        float[] fArr2 = new float[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            fArr2[i8] = 1.0f;
        }
        double d = 180;
        double d2 = measureText;
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, (float) (Math.sin((this.angle * 3.141592653589793d) / d) * d2), (float) (Math.cos((this.angle * 3.141592653589793d) / d) * d2), plus, ArraysKt.plus(fArr, fArr2), Shader.TileMode.CLAMP));
    }

    /* compiled from: GradientColorTextView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/views/GradientColorTextView$Companion;", "", "()V", "DEFAULT_ANGLE", "", "DEFAULT_END_COLOR", "DEFAULT_PARTS_OF_END_COLOR", "DEFAULT_PARTS_OF_START_COLOR", "DEFAULT_START_COLOR", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
