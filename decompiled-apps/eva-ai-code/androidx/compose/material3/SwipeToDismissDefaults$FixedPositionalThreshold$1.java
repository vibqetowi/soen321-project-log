package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/unit/Density;", "<anonymous parameter 0>", "invoke", "(Landroidx/compose/ui/unit/Density;F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissDefaults$FixedPositionalThreshold$1 extends Lambda implements Function2<Density, Float, Float> {
    public static final SwipeToDismissDefaults$FixedPositionalThreshold$1 INSTANCE = new SwipeToDismissDefaults$FixedPositionalThreshold$1();

    SwipeToDismissDefaults$FixedPositionalThreshold$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
        return invoke(density, f.floatValue());
    }

    public final Float invoke(Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Float.valueOf(density.mo588toPx0680j_4(Dp.m5607constructorimpl(56)));
    }
}
