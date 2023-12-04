package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipKt$RichTooltipBox$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $action;
    final /* synthetic */ RichTooltipState $tooltipState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$RichTooltipBox$2$1(RichTooltipState richTooltipState, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(0);
        this.$tooltipState = richTooltipState;
        this.$action = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$tooltipState.setPersistent$material3_release(this.$action != null);
    }
}
