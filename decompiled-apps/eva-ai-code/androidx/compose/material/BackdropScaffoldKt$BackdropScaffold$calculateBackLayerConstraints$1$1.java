package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "it", "invoke-ZezNO4M", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends Lambda implements Function1<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m5539boximpl(m1251invokeZezNO4M(constraints.m5557unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M  reason: not valid java name */
    public final long m1251invokeZezNO4M(long j) {
        return ConstraintsKt.m5568offsetNN6EwU$default(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(this.$headerHeightPx), 1, null);
    }
}
