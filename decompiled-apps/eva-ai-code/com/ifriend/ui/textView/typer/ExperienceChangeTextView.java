package com.ifriend.ui.textView.typer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.ifriend.ui.R;
import com.ifriend.ui.databinding.ExpTextViewBinding;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExperienceChangeTextView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/textView/typer/ExperienceChangeTextView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/ifriend/ui/databinding/ExpTextViewBinding;", "parseAttrs", "", "setExp", AuthenticationTokenClaims.JSON_KEY_EXP, "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExperienceChangeTextView extends FrameLayout {
    public static final int $stable = 8;
    private final ExpTextViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExperienceChangeTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExperienceChangeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExperienceChangeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperienceChangeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ExpTextViewBinding inflate = ExpTextViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        parseAttrs(context, attributeSet);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void parseAttrs(Context context, AttributeSet attributeSet) {
        int[] ExperienceChangeTextView = R.styleable.ExperienceChangeTextView;
        Intrinsics.checkNotNullExpressionValue(ExperienceChangeTextView, "ExperienceChangeTextView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ExperienceChangeTextView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setExp(obtainStyledAttributes.getInt(R.styleable.ExperienceChangeTextView_expChange, 0));
        this.binding.extTextView.setTextSize(UIUtils.INSTANCE.getToDp(Float.valueOf(obtainStyledAttributes.getDimension(R.styleable.ExperienceChangeTextView_expTextSize, UIUtils.INSTANCE.getToPx((Number) 16)))));
        this.binding.extBackground.setScaleX(obtainStyledAttributes.getFloat(R.styleable.ExperienceChangeTextView_xBackgroundScale, 1.0f));
        this.binding.extBackground.setScaleY(obtainStyledAttributes.getFloat(R.styleable.ExperienceChangeTextView_yBackgroundScale, 1.0f));
        obtainStyledAttributes.recycle();
    }

    public final void setExp(int i) {
        TextView textView = this.binding.extTextView;
        textView.setText("+" + i);
    }
}
