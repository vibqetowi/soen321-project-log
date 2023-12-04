package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ long $position;
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        Placeable.PlacementScope.Companion companion2 = companion;
        LookaheadDelegate lookaheadDelegate = layoutNodeLayoutDelegate.getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        Placeable.PlacementScope.m4604place70tqf50$default(companion2, lookaheadDelegate, j, 0.0f, 2, null);
    }
}
