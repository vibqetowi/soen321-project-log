package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BlackButton.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/button/BlackButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isActive", "", "setActive", "", "setLoading", "isLoading", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BlackButton extends ConstraintLayout {
    public static final int $stable = 8;
    private boolean isActive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isActive = true;
        ConstraintLayout.inflate(context, R.layout.button_black, this);
        int[] AppButton = R.styleable.AppButton;
        Intrinsics.checkNotNullExpressionValue(AppButton, "AppButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AppButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(obtainStyledAttributes.getString(R.styleable.AppButton_text));
        textView.setTextSize(0, obtainStyledAttributes.getDimension(R.styleable.AppButton_textSize, UIUtils.INSTANCE.getToPx((Number) 18)));
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(R.id.container);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.BlackButton$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlackButton._init_$lambda$1(BlackButton.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(findViewById);
        modification.onTouchOpacity(findViewById);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlackButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlackButton(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BlackButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setActive(boolean z) {
        View findViewById = findViewById(R.id.container);
        if (z) {
            TextView textView = (TextView) findViewById(R.id.text);
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            textView.setTextColor(textView.getResources().getColor(R.color.black));
            textView.setAlpha(1.0f);
            View findViewById2 = findViewById(R.id.progress);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            findViewById2.setVisibility(8);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.BlackButton$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BlackButton.setActive$lambda$3(BlackButton.this, view);
                }
            });
            Modification modification = Modification.INSTANCE;
            Intrinsics.checkNotNull(findViewById);
            modification.onTouchOpacity(findViewById);
        } else {
            TextView textView2 = (TextView) findViewById(R.id.text);
            textView2.setTextColor(textView2.getResources().getColor(R.color.white));
            textView2.setAlpha(0.2f);
            findViewById.setOnClickListener(null);
            findViewById.setOnTouchListener(null);
        }
        this.isActive = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setActive$lambda$3(BlackButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setLoading(boolean z) {
        if (z) {
            setActive(false);
            View findViewById = findViewById(R.id.progress);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            findViewById.setVisibility(0);
            View findViewById2 = findViewById(R.id.text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            findViewById2.setVisibility(8);
            return;
        }
        setActive(true);
    }
}
