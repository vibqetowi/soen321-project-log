package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements Function1<NodeCoordinator, Unit> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
        invoke2(nodeCoordinator);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NodeCoordinator coordinator) {
        LayerPositionalProperties layerPositionalProperties;
        LayerPositionalProperties layerPositionalProperties2;
        LayerPositionalProperties layerPositionalProperties3;
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        if (coordinator.isValidOwnerScope()) {
            layerPositionalProperties = coordinator.layerPositionalProperties;
            if (layerPositionalProperties != null) {
                layerPositionalProperties2 = NodeCoordinator.tmpLayerPositionalProperties;
                layerPositionalProperties2.copyFrom(layerPositionalProperties);
                NodeCoordinator.updateLayerParameters$default(coordinator, false, 1, null);
                layerPositionalProperties3 = NodeCoordinator.tmpLayerPositionalProperties;
                if (layerPositionalProperties3.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = coordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner$ui_release = layoutNode.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.requestOnPositionedCallback(layoutNode);
                    return;
                }
                return;
            }
            NodeCoordinator.updateLayerParameters$default(coordinator, false, 1, null);
        }
    }
}
