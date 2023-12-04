package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$pinnedHeightPx = floatRef;
        this.$maxHeightPx = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TopAppBarState state;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        if (Intrinsics.areEqual((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), this.$pinnedHeightPx.element - this.$maxHeightPx.element)) {
            return;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = this.$scrollBehavior;
        TopAppBarState state2 = topAppBarScrollBehavior2 != null ? topAppBarScrollBehavior2.getState() : null;
        if (state2 == null) {
            return;
        }
        state2.setHeightOffsetLimit(this.$pinnedHeightPx.element - this.$maxHeightPx.element);
    }
}
