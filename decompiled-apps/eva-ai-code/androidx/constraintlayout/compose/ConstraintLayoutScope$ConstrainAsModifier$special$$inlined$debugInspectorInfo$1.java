package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function1 $constrainBlock$inlined;
    final /* synthetic */ ConstrainedLayoutReference $ref$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        super(1);
        this.$ref$inlined = constrainedLayoutReference;
        this.$constrainBlock$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("constrainAs");
        inspectorInfo.getProperties().set("ref", this.$ref$inlined);
        inspectorInfo.getProperties().set("constrainBlock", this.$constrainBlock$inlined);
    }
}
