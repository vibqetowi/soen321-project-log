package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureAndLayoutDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1 extends Lambda implements Function1<LayoutNode, Boolean> {
    final /* synthetic */ boolean $affectsLookahead;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1(boolean z) {
        super(1);
        this.$affectsLookahead = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode it) {
        boolean measurePending$ui_release;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$affectsLookahead) {
            measurePending$ui_release = it.getLookaheadMeasurePending$ui_release();
        } else {
            measurePending$ui_release = it.getMeasurePending$ui_release();
        }
        return Boolean.valueOf(measurePending$ui_release);
    }
}
