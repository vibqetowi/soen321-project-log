package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$4 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ Function1<Integer, Integer> $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        long m292calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        long m5771unboximpl = state != null ? ((IntSize) state.getValue()).m5771unboximpl() : IntSize.Companion.m5772getZeroYbymL2g();
        Function1<Integer, Integer> function1 = this.$targetOffset;
        m292calculateOffsetemnUabE = this.this$0.m292calculateOffsetemnUabE(IntSizeKt.IntSize(i, i), m5771unboximpl);
        return function1.invoke(Integer.valueOf((-IntOffset.m5726getYimpl(m292calculateOffsetemnUabE)) + IntSize.m5766getHeightimpl(m5771unboximpl)));
    }
}
