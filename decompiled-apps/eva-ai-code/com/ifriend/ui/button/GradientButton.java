package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GradientButton.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/ifriend/ui/button/GradientButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setActive", "", "isActive", "", "setText", "text", "Landroid/text/Spanned;", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GradientButton extends ConstraintLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.inflate(context, R.layout.button_gradient, this);
        int[] GradientButton = R.styleable.GradientButton;
        Intrinsics.checkNotNullExpressionValue(GradientButton, "GradientButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GradientButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ((TextView) findViewById(R.id.text)).setText(obtainStyledAttributes.getString(R.styleable.GradientButton_text));
        setActive(obtainStyledAttributes.getBoolean(R.styleable.GradientButton_isActive, false));
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(R.id.container);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.GradientButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradientButton._init_$lambda$1(GradientButton.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(findViewById);
        modification.onTouchOpacity(findViewById);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientButton(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(GradientButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((TextView) findViewById(R.id.text)).setText(text);
    }

    public final void setText(Spanned text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((TextView) findViewById(R.id.text)).setText(text);
    }

    public final void setActive(boolean z) {
        if (z) {
            findViewById(R.id.container).setBackgroundResource(R.drawable.background_button_gradient);
            ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.button_text_active));
            findViewById(R.id.container).setClickable(true);
            return;
        }
        findViewById(R.id.container).setBackgroundResource(R.drawable.background_button_gray);
        ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.button_text_inactive));
        findViewById(R.id.container).setClickable(false);
    }
}
