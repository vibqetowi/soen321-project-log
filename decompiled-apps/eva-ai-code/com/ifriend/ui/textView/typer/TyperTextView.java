package com.ifriend.ui.textView.typer;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TyperTextView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0014J(\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/ui/textView/typer/TyperTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "delegate", "Lcom/ifriend/ui/textView/typer/TypingAnimationDelegate;", "onDetachedFromWindow", "", "showTextWithAnimation", "text", "", "settings", "Lcom/ifriend/ui/textView/typer/TypingSettings;", "onAnimationEnd", "Lkotlin/Function0;", "showTextWithoutAnimation", "stopAnimation", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TyperTextView extends AppCompatTextView {
    public static final int $stable = 8;
    private final TypingAnimationDelegate delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TyperTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TyperTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TyperTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TyperTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.delegate = new TypingAnimationDelegate(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showTextWithAnimation$default(TyperTextView typerTextView, CharSequence charSequence, TypingSettings typingSettings, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        typerTextView.showTextWithAnimation(charSequence, typingSettings, function0);
    }

    public final void showTextWithAnimation(CharSequence text, TypingSettings settings, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.delegate.isAnimating()) {
            if (Intrinsics.areEqual(this.delegate.getTargetText(), text)) {
                return;
            }
            this.delegate.stop();
            this.delegate.animate(text, settings, function0);
            return;
        }
        this.delegate.animate(text, settings, function0);
    }

    public final void showTextWithoutAnimation(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.delegate.isAnimating()) {
            if (Intrinsics.areEqual(this.delegate.getTargetText(), text)) {
                return;
            }
            this.delegate.stop();
            setText(text);
            return;
        }
        setText(text);
    }

    public final void stopAnimation() {
        this.delegate.stop();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.delegate.stop();
    }
}
