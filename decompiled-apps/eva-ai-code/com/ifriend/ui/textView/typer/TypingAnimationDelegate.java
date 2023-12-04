package com.ifriend.ui.textView.typer;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: TypingAnimationDelegate.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\u0006\u0010!\u001a\u00020\u000fJ\u001e\u0010\"\u001a\u00020\u0011*\u00020\u00112\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u001dH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingAnimationDelegate;", "", "textView", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "animation", "Landroid/view/ViewPropertyAnimator;", "handler", "Landroid/os/Handler;", "isAnimating", "", "iteration", "", "onAnimationEnd", "Lkotlin/Function0;", "", "targetText", "", "getTargetText", "()Ljava/lang/CharSequence;", "getTextView", "()Landroid/widget/TextView;", "typedText", "animate", "settings", "Lcom/ifriend/ui/textView/typer/TypingSettings;", "animateAlpha", "delay", "typingSubstringRange", "Lkotlin/ranges/IntRange;", "iterate", "launchNewTypingAnimation", TtmlNode.START, "stop", "withAlpha", "alpha", "substringRangeToApplyAlpha", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypingAnimationDelegate {
    @Deprecated
    public static final int INVALIDATE_MESSAGE = 7827747;
    private ViewPropertyAnimator animation;
    private Handler handler;
    private boolean isAnimating;
    private int iteration;
    private Function0<Unit> onAnimationEnd;
    private final TextView textView;
    private CharSequence typedText;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public TypingAnimationDelegate(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
        this.typedText = "";
    }

    public final TextView getTextView() {
        return this.textView;
    }

    /* compiled from: TypingAnimationDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingAnimationDelegate$Companion;", "", "()V", "INVALIDATE_MESSAGE", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final CharSequence getTargetText() {
        CharSequence text = this.textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animate$default(TypingAnimationDelegate typingAnimationDelegate, CharSequence charSequence, TypingSettings typingSettings, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        typingAnimationDelegate.animate(charSequence, typingSettings, function0);
    }

    public final void animate(final CharSequence targetText, final TypingSettings settings, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(settings, "settings");
        stop();
        this.textView.setText(withAlpha$default(this, targetText, 0, null, 2, null));
        this.typedText = "";
        this.handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.ifriend.ui.textView.typer.TypingAnimationDelegate$$ExternalSyntheticLambda1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean animate$lambda$0;
                animate$lambda$0 = TypingAnimationDelegate.animate$lambda$0(TypingAnimationDelegate.this, targetText, settings, message);
                return animate$lambda$0;
            }
        });
        this.onAnimationEnd = function0;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animate$lambda$0(TypingAnimationDelegate this$0, CharSequence targetText, TypingSettings settings, Message it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(targetText, "$targetText");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.iterate(targetText, settings);
        return false;
    }

    public final void stop() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeMessages(INVALIDATE_MESSAGE);
        }
        this.iteration = 0;
        this.isAnimating = false;
        ViewPropertyAnimator viewPropertyAnimator = this.animation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.animation = null;
        Function0<Unit> function0 = this.onAnimationEnd;
        if (function0 != null) {
            function0.invoke();
        }
        this.textView.setText(withAlpha$default(this, getTargetText(), 255, null, 2, null));
    }

    private final void start() {
        Message obtain = Message.obtain();
        obtain.what = INVALIDATE_MESSAGE;
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        this.isAnimating = true;
        this.iteration = 0;
    }

    private final void iterate(CharSequence charSequence, TypingSettings typingSettings) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.textView);
        boolean z = (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.RESUMED)) ? false : true;
        int length = this.typedText.length();
        if (!z || length >= charSequence.length()) {
            stop();
            return;
        }
        IntRange until = RangesKt.until(length, typingSettings.getGrowth().calculateGrowth(charSequence, length) + length);
        CharSequence subSequence = StringsKt.subSequence(charSequence, until);
        if (subSequence.length() == 0) {
            return;
        }
        int calculateDelay = typingSettings.getSpeed().calculateDelay(charSequence, length, subSequence, this.iteration);
        StringBuilder sb = new StringBuilder(this.typedText);
        sb.append(withAlpha$default(this, subSequence, 0, null, 2, null));
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        this.typedText = sb;
        animateAlpha(calculateDelay, until);
    }

    private final void animateAlpha(final int i, final IntRange intRange) {
        ViewPropertyAnimator updateListener = this.textView.animate().setDuration(i).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ifriend.ui.textView.typer.TypingAnimationDelegate$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TypingAnimationDelegate.animateAlpha$lambda$1(TypingAnimationDelegate.this, intRange, i, valueAnimator);
            }
        });
        this.animation = updateListener;
        if (updateListener != null) {
            updateListener.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateAlpha$lambda$1(TypingAnimationDelegate this$0, IntRange typingSubstringRange, int i, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(typingSubstringRange, "$typingSubstringRange");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        TextView textView = this$0.textView;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setText(this$0.withAlpha(text, (int) (((Float) animatedValue).floatValue() * 255), typingSubstringRange));
        if (Intrinsics.areEqual(it.getAnimatedValue(), Float.valueOf(1.0f))) {
            this$0.launchNewTypingAnimation(i);
        }
    }

    private final void launchNewTypingAnimation(int i) {
        Message obtain = Message.obtain();
        obtain.what = INVALIDATE_MESSAGE;
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessageDelayed(obtain, i);
        }
        this.iteration++;
    }

    static /* synthetic */ CharSequence withAlpha$default(TypingAnimationDelegate typingAnimationDelegate, CharSequence charSequence, int i, IntRange intRange, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            intRange = StringsKt.getIndices(charSequence);
        }
        return typingAnimationDelegate.withAlpha(charSequence, i, intRange);
    }

    private final CharSequence withAlpha(CharSequence charSequence, int i, IntRange intRange) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.argb(i, 255, 255, 255)), intRange.getFirst(), intRange.getLast() + 1, 33);
            int last = intRange.getLast() + 1;
            if (last <= spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.argb(0, 255, 255, 255)), last, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception unused) {
            return charSequence;
        }
    }
}
