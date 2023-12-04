package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChooseGradientButton.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/button/ChooseGradientButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setChosen", "", "isChosen", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChooseGradientButton extends ConstraintLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseGradientButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.inflate(context, R.layout.button_gradient, this);
        int[] ChooseGradientButton = R.styleable.ChooseGradientButton;
        Intrinsics.checkNotNullExpressionValue(ChooseGradientButton, "ChooseGradientButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ChooseGradientButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ((TextView) findViewById(R.id.text)).setText(obtainStyledAttributes.getString(R.styleable.ChooseGradientButton_text));
        setChosen(obtainStyledAttributes.getBoolean(R.styleable.ChooseGradientButton_isChosen, false));
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(R.id.container);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.ChooseGradientButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseGradientButton._init_$lambda$1(ChooseGradientButton.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(findViewById);
        modification.onTouchOpacity(findViewById);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChooseGradientButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChooseGradientButton(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ChooseGradientButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setChosen(boolean z) {
        if (z) {
            findViewById(R.id.container).setBackgroundResource(R.drawable.background_button_gradient);
            ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.button_text_active));
            return;
        }
        findViewById(R.id.container).setBackgroundResource(R.drawable.background_button_gray);
        ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
    }
}
