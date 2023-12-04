package androidx.compose.material;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$Switch$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$1(AnchoredDraggableState<Boolean> anchoredDraggableState, float f, float f2) {
        super(0);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$minBound = f;
        this.$maxBound = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnchoredDraggableState.updateAnchors$material_release$default(this.$anchoredDraggableState, MapsKt.mapOf(TuplesKt.to(false, Float.valueOf(this.$minBound)), TuplesKt.to(true, Float.valueOf(this.$maxBound))), null, 2, null);
    }
}
