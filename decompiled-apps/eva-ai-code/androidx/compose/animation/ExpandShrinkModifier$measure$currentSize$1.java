package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-YEO4UFw", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$currentSize$1 extends Lambda implements Function1<EnterExitState, IntSize> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
        return IntSize.m5759boximpl(m321invokeYEO4UFw(enterExitState));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m321invokeYEO4UFw(EnterExitState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.m319sizeByStateUzc_VyU(it, this.$measuredSize);
    }
}
