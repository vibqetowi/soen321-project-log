package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ FlingBehavior $flingBehavior$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ OverscrollEffect $overscrollEffect$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ ScrollableState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$$inlined$debugInspectorInfo$1(Orientation orientation, ScrollableState scrollableState, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$orientation$inlined = orientation;
        this.$state$inlined = scrollableState;
        this.$overscrollEffect$inlined = overscrollEffect;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$flingBehavior$inlined = flingBehavior;
        this.$interactionSource$inlined = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.$orientation$inlined);
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("overscrollEffect", this.$overscrollEffect$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        inspectorInfo.getProperties().set("flingBehavior", this.$flingBehavior$inlined);
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
    }
}
