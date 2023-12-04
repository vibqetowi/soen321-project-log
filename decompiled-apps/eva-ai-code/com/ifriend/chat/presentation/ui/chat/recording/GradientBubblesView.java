package com.ifriend.chat.presentation.ui.chat.recording;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.C;
import com.ifriend.chat.presentation.databinding.GradientBubblesViewBinding;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GradientBubblesView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J,\u0010\u0013\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/recording/GradientBubblesView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/ifriend/chat/presentation/databinding/GradientBubblesViewBinding;", "isAnimating", "", "updateDB", "", UserDataStore.DATE_OF_BIRTH, "", "startAnimation", "Landroid/view/View;", "x", "y", "radius", "duration", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradientBubblesView extends FrameLayout {
    private static final float BASE_SCALE = 0.8f;
    private final GradientBubblesViewBinding binding;
    private boolean isAnimating;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientBubblesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientBubblesViewBinding inflate = GradientBubblesViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setClipChildren(false);
        setClipToPadding(false);
        ImageView bubble1 = inflate.bubble1;
        Intrinsics.checkNotNullExpressionValue(bubble1, "bubble1");
        startAnimation(bubble1, 0.0f, 1.0f, 5.0f, 2000L);
        ImageView bubble2 = inflate.bubble2;
        Intrinsics.checkNotNullExpressionValue(bubble2, "bubble2");
        startAnimation(bubble2, 2.0f, 2.0f, 7.0f, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        ImageView bubble3 = inflate.bubble3;
        Intrinsics.checkNotNullExpressionValue(bubble3, "bubble3");
        startAnimation(bubble3, 1.0f, 3.0f, 3.0f, 4000L);
        inflate.getRoot().setScaleX(BASE_SCALE);
        inflate.getRoot().setScaleY(BASE_SCALE);
    }

    /* compiled from: GradientBubblesView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/recording/GradientBubblesView$Companion;", "", "()V", "BASE_SCALE", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientBubblesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientBubblesView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void startAnimation(View view, float f, float f2, float f3, long j) {
        Path path = new Path();
        path.addCircle(UIUtils.INSTANCE.getToPx(Float.valueOf(f)), UIUtils.INSTANCE.getToPx(Float.valueOf(f2)), UIUtils.INSTANCE.getToPx(Float.valueOf(f3)), Path.Direction.CCW);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.X, View.Y, path);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    public final void updateDB(float f) {
        if (this.isAnimating) {
            return;
        }
        if (f == 0.0f) {
            return;
        }
        float f2 = (f * 0.15f) + BASE_SCALE;
        final FrameLayout root = this.binding.getRoot();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BASE_SCALE, f2, 0.7f, f2, BASE_SCALE);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(800L);
        root.setPivotX(root.getWidth() / 2.0f);
        root.setPivotY(root.getHeight() / 2.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ifriend.chat.presentation.ui.chat.recording.GradientBubblesView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GradientBubblesView.updateDB$lambda$4$lambda$2(root, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(ofFloat);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.chat.presentation.ui.chat.recording.GradientBubblesView$updateDB$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                GradientBubblesView.this.isAnimating = false;
            }
        });
        this.isAnimating = true;
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDB$lambda$4$lambda$2(FrameLayout this_run, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this_run.setScaleX(floatValue);
        this_run.setScaleY(floatValue);
    }
}
