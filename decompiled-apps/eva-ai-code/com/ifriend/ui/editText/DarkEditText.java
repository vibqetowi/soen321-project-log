package com.ifriend.ui.editText;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DarkEditText.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tJ)\u0010\u0019\u001a\u00020\u00172!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00170\u001bJ\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001cR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/ifriend/ui/editText/DarkEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText$delegate", "Lkotlin/Lazy;", "hintTypeface", "Landroid/text/style/TypefaceSpan;", "getHintTypeface", "()Landroid/text/style/TypefaceSpan;", "hintTypeface$delegate", "addPaddingEnd", "", "valueInPx", "doAfterTextChanged", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "hideKeyboard", "onTextChanged", "watcher", "Landroid/text/TextWatcher;", "setHint", "setMaxLength", SessionDescription.ATTR_LENGTH, "setText", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DarkEditText extends ConstraintLayout {
    public static final int $stable = 8;
    private final Lazy editText$delegate;
    private final Lazy hintTypeface$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.editText$delegate = LazyKt.lazy(new DarkEditText$editText$2(this));
        this.hintTypeface$delegate = LazyKt.lazy(new DarkEditText$hintTypeface$2(context));
        int[] DarkEditText = R.styleable.DarkEditText;
        Intrinsics.checkNotNullExpressionValue(DarkEditText, "DarkEditText");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DarkEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        if (obtainStyledAttributes.getBoolean(R.styleable.DarkEditText_isPassword, false)) {
            ConstraintLayout.inflate(context, R.layout.edit_text_dark_password, this);
        } else {
            ConstraintLayout.inflate(context, R.layout.edit_text_dark, this);
            if (obtainStyledAttributes.getBoolean(R.styleable.DarkEditText_isEmail, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(33);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.DarkEditText_isNumber, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(2);
            } else if (obtainStyledAttributes.getBoolean(R.styleable.DarkEditText_startFromCapital, false)) {
                ((EditText) findViewById(R.id.edit)).setInputType(8192);
            }
        }
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
    public DarkEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DarkEditText(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
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

    public final void setHint(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(getHintTypeface(), 0, spannableString.length(), 17);
        getEditText().setHint(spannableString);
    }

    public final void addPaddingEnd(int i) {
        EditText editText = getEditText();
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), i, editText.getPaddingBottom());
    }

    public final void setMaxLength(int i) {
        UIUtils.INSTANCE.setMaxLength(getEditText(), i);
    }

    public final void doAfterTextChanged(final Function1<? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getEditText().addTextChangedListener(new TextWatcher() { // from class: com.ifriend.ui.editText.DarkEditText$doAfterTextChanged$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Function1.this.invoke(String.valueOf(editable));
            }
        });
    }
}
