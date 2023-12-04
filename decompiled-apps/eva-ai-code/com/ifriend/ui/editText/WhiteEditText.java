package com.ifriend.ui.editText;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIHelper;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WhiteEditText.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0013R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ifriend/ui/editText/WhiteEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText$delegate", "Lkotlin/Lazy;", "hintTypeface", "Landroid/text/style/TypefaceSpan;", "getHintTypeface", "()Landroid/text/style/TypefaceSpan;", "hintTypeface$delegate", "hideKeyboard", "", "onTextChanged", "watcher", "Landroid/text/TextWatcher;", "setHint", "text", "", "setMaxLength", SessionDescription.ATTR_LENGTH, "", "setText", "showKeyboard", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WhiteEditText extends ConstraintLayout {
    public static final int $stable = 8;
    private final Lazy editText$delegate;
    private final Lazy hintTypeface$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WhiteEditText(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WhiteEditText(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.editText$delegate = LazyKt.lazy(new WhiteEditText$editText$2(this));
        this.hintTypeface$delegate = LazyKt.lazy(new WhiteEditText$hintTypeface$2(context));
        int[] WhiteEditText = R.styleable.WhiteEditText;
        Intrinsics.checkNotNullExpressionValue(WhiteEditText, "WhiteEditText");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WhiteEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        if (obtainStyledAttributes.getBoolean(R.styleable.WhiteEditText_isPassword, false)) {
            ConstraintLayout.inflate(context, R.layout.edit_text_dark_password, this);
        } else {
            ConstraintLayout.inflate(context, R.layout.edit_text_white, this);
            if (obtainStyledAttributes.getBoolean(R.styleable.WhiteEditText_isEmail, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(33);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.WhiteEditText_isNumber, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(2);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.WhiteEditText_startFromCapital, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(8192);
            }
        }
        EditText editText = getEditText();
        editText.setText(obtainStyledAttributes.getString(R.styleable.WhiteEditText_text));
        int integer = obtainStyledAttributes.getInteger(R.styleable.WhiteEditText_maxLength, -1);
        if (integer > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        }
        String string = obtainStyledAttributes.getString(R.styleable.WhiteEditText_hint);
        setHint(string == null ? "" : string);
        obtainStyledAttributes.recycle();
    }

    private final EditText getEditText() {
        Object value = this.editText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    private final TypefaceSpan getHintTypeface() {
        return (TypefaceSpan) this.hintTypeface$delegate.getValue();
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((EditText) findViewById(R.id.edit)).setText(text);
    }

    public final void onTextChanged(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        ((EditText) findViewById(R.id.edit)).addTextChangedListener(watcher);
    }

    public final void hideKeyboard() {
        UIHelper uIHelper = UIHelper.INSTANCE;
        View findViewById = findViewById(R.id.edit);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        uIHelper.hideKeyboard(findViewById);
    }

    public final void showKeyboard() {
        EditText editText = (EditText) findViewById(R.id.edit);
        editText.requestFocus();
        UIHelper uIHelper = UIHelper.INSTANCE;
        Intrinsics.checkNotNull(editText);
        uIHelper.showKeyboard(editText);
    }

    public final void setHint(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(getHintTypeface(), 0, spannableString.length(), 17);
        getEditText().setHint(spannableString);
    }

    public final void setMaxLength(int i) {
        UIUtils.INSTANCE.setMaxLength(getEditText(), i);
    }
}
