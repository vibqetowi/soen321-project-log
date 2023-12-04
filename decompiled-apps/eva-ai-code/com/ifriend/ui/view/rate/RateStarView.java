package com.ifriend.ui.view.rate;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RateStarView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/ui/view/rate/RateStarView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationHandler", "Landroid/os/Handler;", "isActive", "", "bounceAnimation", "", "to", "", "duration", "", "onUpperPoint", "Lkotlin/Function0;", "onDetachedFromWindow", "setState", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RateStarView extends AppCompatImageView {
    public static final int $stable = 8;
    private final Handler animationHandler;
    private boolean isActive;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RateStarView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RateStarView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateStarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationHandler = new Handler(Looper.getMainLooper());
        setImageResource(R.drawable.star_empty);
    }

    public final void setState(boolean z) {
        if (this.isActive == z) {
            return;
        }
        if (z) {
            bounceAnimation$default(this, 1.2f, 0L, new RateStarView$setState$1(this), 2, null);
        } else {
            setImageResource(R.drawable.star_empty);
        }
        this.isActive = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void bounceAnimation$default(RateStarView rateStarView, float f, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 100;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        rateStarView.bounceAnimation(f, j, function0);
    }

    private final void bounceAnimation(final float f, final long j, final Function0<Unit> function0) {
        this.animationHandler.post(new Runnable() { // from class: com.ifriend.ui.view.rate.RateStarView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RateStarView.bounceAnimation$lambda$2(RateStarView.this, f, j, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bounceAnimation$lambda$2(final RateStarView this$0, float f, final long j, final Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.animate().scaleX(f).scaleY(f).setDuration(j).withEndAction(new Runnable() { // from class: com.ifriend.ui.view.rate.RateStarView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RateStarView.bounceAnimation$lambda$2$lambda$1(RateStarView.this, function0, j);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bounceAnimation$lambda$2$lambda$1(final RateStarView this$0, final Function0 function0, final long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.animationHandler.post(new Runnable() { // from class: com.ifriend.ui.view.rate.RateStarView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RateStarView.bounceAnimation$lambda$2$lambda$1$lambda$0(Function0.this, this$0, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bounceAnimation$lambda$2$lambda$1$lambda$0(Function0 function0, RateStarView this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function0 != null) {
            function0.invoke();
        }
        this$0.animate().scaleX(1.0f).scaleY(1.0f).setDuration(j).start();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animationHandler.removeCallbacksAndMessages(null);
    }
}
