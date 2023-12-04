package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkOut$1 extends Lambda implements Function1<IntSize, IntSize> {
    public static final EnterExitTransitionKt$shrinkOut$1 INSTANCE = new EnterExitTransitionKt$shrinkOut$1();

    EnterExitTransitionKt$shrinkOut$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
        return IntSize.m5759boximpl(m313invokemzRDjE0(intSize.m5771unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m313invokemzRDjE0(long j) {
        return IntSizeKt.IntSize(0, 0);
    }
}
