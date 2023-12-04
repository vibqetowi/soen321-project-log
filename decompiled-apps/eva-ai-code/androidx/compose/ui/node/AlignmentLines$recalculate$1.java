package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayoutNodeAlignmentLines.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "childOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlignmentLines$recalculate$1 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
        invoke2(alignmentLinesOwner);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AlignmentLinesOwner childOwner) {
        Map map;
        Intrinsics.checkNotNullParameter(childOwner, "childOwner");
        if (childOwner.isPlaced()) {
            if (childOwner.getAlignmentLines().getDirty$ui_release()) {
                childOwner.layoutChildren();
            }
            map = childOwner.getAlignmentLines().alignmentLineMap;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui_release = childOwner.getInnerCoordinator().getWrappedBy$ui_release();
            Intrinsics.checkNotNull(wrappedBy$ui_release);
            while (!Intrinsics.areEqual(wrappedBy$ui_release, this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
                AlignmentLines alignmentLines2 = this.this$0;
                for (AlignmentLine alignmentLine : this.this$0.getAlignmentLinesMap(wrappedBy$ui_release).keySet()) {
                    alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                }
                wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                Intrinsics.checkNotNull(wrappedBy$ui_release);
            }
        }
    }
}
