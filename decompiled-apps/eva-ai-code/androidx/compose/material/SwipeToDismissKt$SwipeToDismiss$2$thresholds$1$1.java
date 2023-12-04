package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material/ThresholdConfig;", "from", "Landroidx/compose/material/DismissValue;", "to", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements Function2<DismissValue, DismissValue, ThresholdConfig> {
    final /* synthetic */ Function1<DismissDirection, ThresholdConfig> $dismissThresholds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(Function1<? super DismissDirection, ? extends ThresholdConfig> function1) {
        super(2);
        this.$dismissThresholds = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ThresholdConfig invoke(DismissValue from, DismissValue to) {
        DismissDirection dismissDirection;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Function1<DismissDirection, ThresholdConfig> function1 = this.$dismissThresholds;
        dismissDirection = SwipeToDismissKt.getDismissDirection(from, to);
        Intrinsics.checkNotNull(dismissDirection);
        return function1.invoke(dismissDirection);
    }
}
