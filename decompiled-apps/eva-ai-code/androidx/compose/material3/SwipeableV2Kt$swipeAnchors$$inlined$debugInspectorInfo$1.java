package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ AnchorChangeHandler $anchorChangeHandler$inlined;
    final /* synthetic */ Function2 $calculateAnchor$inlined;
    final /* synthetic */ Set $possibleValues$inlined;
    final /* synthetic */ SwipeableV2State $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, Function2 function2) {
        super(1);
        this.$state$inlined = swipeableV2State;
        this.$possibleValues$inlined = set;
        this.$anchorChangeHandler$inlined = anchorChangeHandler;
        this.$calculateAnchor$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("swipeAnchors");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("possibleValues", this.$possibleValues$inlined);
        inspectorInfo.getProperties().set("anchorChangeHandler", this.$anchorChangeHandler$inlined);
        inspectorInfo.getProperties().set("calculateAnchor", this.$calculateAnchor$inlined);
    }
}
