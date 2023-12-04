package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/LayoutNode;", "scope", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LookaheadScopeKt$LookaheadScope$2$2 extends Lambda implements Function2<LayoutNode, LookaheadScopeImpl, Unit> {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2();

    LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        invoke2(layoutNode, lookaheadScopeImpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LookaheadScope.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<LayoutCoordinates> {
        final /* synthetic */ LayoutNode $this_set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LayoutNode layoutNode) {
            super(0);
            this.$this_set = layoutNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui_release = this.$this_set.getParent$ui_release();
            Intrinsics.checkNotNull(parent$ui_release);
            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode set, LookaheadScopeImpl scope) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.setScopeCoordinates(new AnonymousClass1(set));
    }
}
