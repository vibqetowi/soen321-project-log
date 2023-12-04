package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OffsetKt$offset$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$1(float f, float f2) {
        super(1);
        this.$x = f;
        this.$y = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        $receiver.getProperties().set("x", Dp.m5605boximpl(this.$x));
        $receiver.getProperties().set("y", Dp.m5605boximpl(this.$y));
    }
}
