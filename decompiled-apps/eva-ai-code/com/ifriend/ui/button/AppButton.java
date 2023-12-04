package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppButton.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/ui/button/AppButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "background", "Landroid/widget/FrameLayout;", "isActive", "", "textView", "Landroid/widget/TextView;", "displayActiveState", "", "displayInactiveState", "setActive", "setLoading", "isLoading", "setText", "text", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppButton extends ConstraintLayout {
    public static final int $stable = 8;
    private final FrameLayout background;
    private boolean isActive;
    private final TextView textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppButton(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AppButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isActive = true;
        ConstraintLayout.inflate(context, R.layout.button_app, this);
        View findViewById = findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.textView = textView;
        View findViewById2 = findViewById(R.id.container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.background = frameLayout;
        int[] AppButton = R.styleable.AppButton;
        Intrinsics.checkNotNullExpressionValue(AppButton, "AppButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AppButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        textView.setText(obtainStyledAttributes.getString(R.styleable.AppButton_text));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppButton_textSize, 0);
        if (dimensionPixelSize != 0) {
            textView.setTextSize(0, dimensionPixelSize);
        }
        textView.setTextColor(obtainStyledAttributes.getColor(R.styleable.AppButton_textColor, -16777216));
        obtainStyledAttributes.recycle();
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.AppButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppButton._init_$lambda$1(AppButton.this, view);
            }
        });
        Modification.INSTANCE.onTouchOpacity(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AppButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    public final void setActive(boolean z) {
        if (z) {
            displayActiveState();
        } else {
            displayInactiveState();
        }
        this.isActive = z;
    }

    public final void setText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((TextView) findViewById(R.id.text)).setText(text);
    }

    public final void setLoading(boolean z) {
        if (z) {
            setActive(false);
            View findViewById = findViewById(R.id.progress);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            findViewById.setVisibility(0);
            this.textView.setVisibility(8);
            return;
        }
        setActive(true);
        this.textView.setVisibility(0);
    }

    private final void displayInactiveState() {
        this.background.setEnabled(false);
        this.textView.setEnabled(false);
    }

    private final void displayActiveState() {
        this.textView.setVisibility(0);
        this.background.setEnabled(true);
        this.textView.setEnabled(true);
        View findViewById = findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        findViewById.setVisibility(8);
    }
}
