package com.ifriend.ui.view.rate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.view.rate.RateAppView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RateAppView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u000b\u001a\u00020\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rH\u0002J\u001a\u0010\u000f\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0017\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/ui/view/rate/RateAppView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onStarChangedListener", "Lkotlin/Function1;", "", "", "forEachStar", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function2;", "Lcom/ifriend/ui/view/rate/RateStarView;", "setOnStarsChangedListener", "onChanged", "setStars", "starsAmount", "setState", "(Ljava/lang/Integer;)V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RateAppView extends ConstraintLayout {
    public static final int $stable = 8;
    private Function1<? super Integer, Unit> onStarChangedListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RateAppView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RateAppView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.inflate(context, R.layout.view_rate_app, this);
        forEachStar(new AnonymousClass1());
    }

    /* compiled from: RateAppView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "starView", "Lcom/ifriend/ui/view/rate/RateStarView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.view.rate.RateAppView$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends Lambda implements Function2<Integer, RateStarView, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, RateStarView rateStarView) {
            invoke(num.intValue(), rateStarView);
            return Unit.INSTANCE;
        }

        public final void invoke(final int i, RateStarView starView) {
            Intrinsics.checkNotNullParameter(starView, "starView");
            final RateAppView rateAppView = RateAppView.this;
            starView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.view.rate.RateAppView$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RateAppView.AnonymousClass1.invoke$lambda$0(RateAppView.this, i, view);
                }
            });
            Modification.INSTANCE.onTouchOpacity(starView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(RateAppView this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.onStarChangedListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i + 1));
            }
        }
    }

    public static /* synthetic */ void setState$default(RateAppView rateAppView, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        rateAppView.setState(num);
    }

    public final void setState(Integer num) {
        setStars(num != null ? num.intValue() : 0);
    }

    public final void setOnStarsChangedListener(Function1<? super Integer, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        this.onStarChangedListener = onChanged;
    }

    private final void setStars(int i) {
        forEachStar(new RateAppView$setStars$1(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void forEachStar(Function2<? super Integer, ? super RateStarView, Unit> function2) {
        View findViewById = findViewById(R.id.star_1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        int i = 0;
        View findViewById2 = findViewById(R.id.star_2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(R.id.star_3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(R.id.star_4);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(R.id.star_5);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        for (Object obj : CollectionsKt.listOf((Object[]) new RateStarView[]{findViewById, findViewById2, findViewById3, findViewById4, findViewById5})) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            function2.invoke(Integer.valueOf(i), obj);
            i = i2;
        }
    }
}
