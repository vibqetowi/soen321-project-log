package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PullRefreshStateKt$rememberPullRefreshState$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ Ref.FloatRef $refreshingOffsetPx;
    final /* synthetic */ PullRefreshState $state;
    final /* synthetic */ Ref.FloatRef $thresholdPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3(PullRefreshState pullRefreshState, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(0);
        this.$state = pullRefreshState;
        this.$refreshing = z;
        this.$thresholdPx = floatRef;
        this.$refreshingOffsetPx = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.setRefreshing$material_release(this.$refreshing);
        this.$state.setThreshold$material_release(this.$thresholdPx.element);
        this.$state.setRefreshingOffset$material_release(this.$refreshingOffsetPx.element);
    }
}
