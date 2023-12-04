package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$SingleRowTopAppBar$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ float $heightOffsetLimit;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior, float f) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$heightOffsetLimit = f;
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
        if (Intrinsics.areEqual((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), this.$heightOffsetLimit)) {
            return;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = this.$scrollBehavior;
        TopAppBarState state2 = topAppBarScrollBehavior2 != null ? topAppBarScrollBehavior2.getState() : null;
        if (state2 == null) {
            return;
        }
        state2.setHeightOffsetLimit(this.$heightOffsetLimit);
    }
}
