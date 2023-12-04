package com.ifriend.ui.textView;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TouchableSpan.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/ui/textView/TouchableSpan;", "Landroid/text/style/ClickableSpan;", "mNormalTextColor", "", "mPressedTextColor", "(II)V", "mIsPressed", "", "setPressed", "", "isSelected", "updateDrawState", "ds", "Landroid/text/TextPaint;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TouchableSpan extends ClickableSpan {
    public static final int $stable = 8;
    private boolean mIsPressed;
    private final int mNormalTextColor;
    private final int mPressedTextColor;

    public TouchableSpan(int i, int i2) {
        this.mNormalTextColor = i;
        this.mPressedTextColor = i2;
    }

    public final void setPressed(boolean z) {
        this.mIsPressed = z;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.mIsPressed ? this.mPressedTextColor : this.mNormalTextColor);
        ds.setUnderlineText(false);
    }
}
