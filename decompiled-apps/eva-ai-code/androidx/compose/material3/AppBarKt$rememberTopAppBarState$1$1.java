package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AppBarKt$rememberTopAppBarState$1$1 extends Lambda implements Function0<TopAppBarState> {
    final /* synthetic */ float $initialContentOffset;
    final /* synthetic */ float $initialHeightOffset;
    final /* synthetic */ float $initialHeightOffsetLimit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$rememberTopAppBarState$1$1(float f, float f2, float f3) {
        super(0);
        this.$initialHeightOffsetLimit = f;
        this.$initialHeightOffset = f2;
        this.$initialContentOffset = f3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TopAppBarState invoke() {
        return new TopAppBarState(this.$initialHeightOffsetLimit, this.$initialHeightOffset, this.$initialContentOffset);
    }
}
