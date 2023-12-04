package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideOutVertically$2 extends Lambda implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$slideOutVertically$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetOffsetY = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
        return IntOffset.m5716boximpl(m318invokemHKZG7I(intSize.m5771unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m318invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(0, this.$targetOffsetY.invoke(Integer.valueOf(IntSize.m5766getHeightimpl(j))).intValue());
    }
}
