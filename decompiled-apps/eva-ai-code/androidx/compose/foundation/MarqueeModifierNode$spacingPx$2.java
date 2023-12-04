package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarqueeModifierNode$spacingPx$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ MarqueeSpacing $spacing;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$spacingPx$2(MarqueeSpacing marqueeSpacing, MarqueeModifierNode marqueeModifierNode) {
        super(0);
        this.$spacing = marqueeSpacing;
        this.this$0 = marqueeModifierNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int contentWidth;
        int containerWidth;
        MarqueeSpacing marqueeSpacing = this.$spacing;
        MarqueeModifierNode marqueeModifierNode = this.this$0;
        Density requireDensity = DelegatableNodeKt.requireDensity(marqueeModifierNode);
        contentWidth = marqueeModifierNode.getContentWidth();
        containerWidth = marqueeModifierNode.getContainerWidth();
        return Integer.valueOf(marqueeSpacing.calculateSpacing(requireDensity, contentWidth, containerWidth));
    }
}
