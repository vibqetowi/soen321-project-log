package com.ifriend.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: IconDarkButton.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/button/IconDarkButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "applyCenteredText", "", TtmlNode.RUBY_CONTAINER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconDarkButton extends FrameLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconDarkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.inflate(context, R.layout.button_icon_dark, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        int[] IconDarkButton = R.styleable.IconDarkButton;
        Intrinsics.checkNotNullExpressionValue(IconDarkButton, "IconDarkButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconDarkButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ((ImageView) findViewById(R.id.icon)).setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.IconDarkButton_icon));
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(obtainStyledAttributes.getString(R.styleable.IconDarkButton_text));
        textView.setTextSize(0, obtainStyledAttributes.getDimension(R.styleable.IconDarkButton_textSize, UIUtils.INSTANCE.getToPx((Number) 18)));
        if (obtainStyledAttributes.getBoolean(R.styleable.IconDarkButton_isCentered, false)) {
            applyCenteredText(constraintLayout);
        }
        obtainStyledAttributes.recycle();
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.button.IconDarkButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IconDarkButton._init_$lambda$1(IconDarkButton.this, view);
            }
        });
        Modification modification = Modification.INSTANCE;
        Intrinsics.checkNotNull(constraintLayout);
        modification.onTouchOpacity(constraintLayout);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconDarkButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconDarkButton(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(IconDarkButton this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callOnClick();
    }

    private final void applyCenteredText(ConstraintLayout constraintLayout) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(R.id.text, 7, R.id.container, 7, 0);
        constraintSet.connect(R.id.text, 6, R.id.container, 6, 0);
        constraintSet.connect(R.id.icon, 7, R.id.text, 6, 0);
        constraintSet.applyTo(constraintLayout);
    }
}
