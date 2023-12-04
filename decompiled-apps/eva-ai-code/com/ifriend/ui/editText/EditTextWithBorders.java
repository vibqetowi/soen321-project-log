package com.ifriend.ui.editText;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EditTextWithBorders.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0017R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/ifriend/ui/editText/EditTextWithBorders;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText$delegate", "Lkotlin/Lazy;", "hintTypeface", "Landroid/text/style/TypefaceSpan;", "getHintTypeface", "()Landroid/text/style/TypefaceSpan;", "hintTypeface$delegate", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "addTextChangedListener", "", "watcher", "Landroid/text/TextWatcher;", "hideKeyboard", "removeTextChangedListener", "setHint", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditTextWithBorders extends ConstraintLayout {
    public static final int $stable = 8;
    private final Lazy editText$delegate;
    private final Lazy hintTypeface$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithBorders(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.editText$delegate = LazyKt.lazy(new EditTextWithBorders$editText$2(this));
        this.hintTypeface$delegate = LazyKt.lazy(new EditTextWithBorders$hintTypeface$2(context));
        int[] DarkEditTextWithBorders = R.styleable.DarkEditTextWithBorders;
        Intrinsics.checkNotNullExpressionValue(DarkEditTextWithBorders, "DarkEditTextWithBorders");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DarkEditTextWithBorders, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        ConstraintLayout.inflate(context, R.layout.edit_text_dark_with_borders, this);
        EditText editText = getEditText();
        editText.setText(obtainStyledAttributes.getString(R.styleable.DarkEditText_text));
        int integer = obtainStyledAttributes.getInteger(R.styleable.DarkEditText_maxLength, -1);
        if (integer > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        }
        String string = obtainStyledAttributes.getString(R.styleable.DarkEditText_hint);
        setHint(string == null ? "" : string);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditTextWithBorders(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditTextWithBorders(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String getText() {
        return getEditText().getText().toString();
    }

    public final void setText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getEditText().setText(value);
    }

    private final EditText getEditText() {
        Object value = this.editText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    private final TypefaceSpan getHintTypeface() {
        return (TypefaceSpan) this.hintTypeface$delegate.getValue();
    }

    public final void addTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        getEditText().addTextChangedListener(watcher);
    }

    public final void removeTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        getEditText().removeTextChangedListener(watcher);
    }

    public final void hideKeyboard() {
        UIHelper.INSTANCE.hideKeyboard(getEditText());
    }

    public final void setHint(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(getHintTypeface(), 0, spannableString.length(), 17);
        getEditText().setHint(spannableString);
    }
}
