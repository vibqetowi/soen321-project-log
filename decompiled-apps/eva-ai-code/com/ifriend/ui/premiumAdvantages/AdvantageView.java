package com.ifriend.ui.premiumAdvantages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AdvantageView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ifriend/ui/premiumAdvantages/AdvantageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "isRainbowCheck", "()Z", "setRainbowCheck", "(Z)V", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView$delegate", "Lkotlin/Lazy;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdvantageView extends FrameLayout {
    public static final int $stable = 8;
    private boolean isRainbowCheck;
    private final Lazy textView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvantageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textView$delegate = LazyKt.lazy(new AdvantageView$textView$2(this));
        FrameLayout.inflate(context, R.layout.advantage_view, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvantageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvantageView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTextView() {
        Object value = this.textView$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final String getText() {
        return getTextView().getText().toString();
    }

    public final void setText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getTextView().setText(value);
    }

    public final boolean isRainbowCheck() {
        return this.isRainbowCheck;
    }

    public final void setRainbowCheck(boolean z) {
        int i;
        float toPx;
        this.isRainbowCheck = z;
        ImageView imageView = (ImageView) findViewById(R.id.check);
        if (this.isRainbowCheck) {
            i = R.drawable.check_rainbow;
        } else {
            i = R.drawable.check_white;
        }
        imageView.setImageResource(i);
        View findViewById = findViewById(R.id.advantage_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (this.isRainbowCheck) {
            toPx = UIUtils.INSTANCE.getToPx((Number) 11);
        } else {
            toPx = UIUtils.INSTANCE.getToPx((Number) 7);
        }
        marginLayoutParams2.setMarginStart((int) toPx);
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
