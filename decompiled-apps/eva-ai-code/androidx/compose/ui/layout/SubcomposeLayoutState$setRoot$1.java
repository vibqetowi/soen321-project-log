package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/LayoutNode;", "it", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubcomposeLayoutState$setRoot$1 extends Lambda implements Function2<LayoutNode, SubcomposeLayoutState, Unit> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        invoke2(layoutNode, subcomposeLayoutState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, SubcomposeLayoutState it) {
        LayoutNodeSubcompositionsState state;
        LayoutNodeSubcompositionsState state2;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
        Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
        Intrinsics.checkNotNullParameter(it, "it");
        SubcomposeLayoutState subcomposeLayoutState = this.this$0;
        LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
        if (subcompositionsState$ui_release == null) {
            subcomposeSlotReusePolicy2 = this.this$0.slotReusePolicy;
            subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
            layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
        }
        subcomposeLayoutState._state = subcompositionsState$ui_release;
        state = this.this$0.getState();
        state.makeSureStateIsConsistent();
        state2 = this.this$0.getState();
        subcomposeSlotReusePolicy = this.this$0.slotReusePolicy;
        state2.setSlotReusePolicy(subcomposeSlotReusePolicy);
    }
}
