package androidx.compose.animation;

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
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$3(Function1<? super Integer, Integer> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        long m293getCurrentSizeYbymL2g;
        long m293getCurrentSizeYbymL2g2;
        long m292calculateOffsetemnUabE;
        Function1<Integer, Integer> function1 = this.$initialOffset;
        m293getCurrentSizeYbymL2g = this.this$0.m293getCurrentSizeYbymL2g();
        int m5766getHeightimpl = IntSize.m5766getHeightimpl(m293getCurrentSizeYbymL2g);
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        long IntSize = IntSizeKt.IntSize(i, i);
        m293getCurrentSizeYbymL2g2 = this.this$0.m293getCurrentSizeYbymL2g();
        m292calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m292calculateOffsetemnUabE(IntSize, m293getCurrentSizeYbymL2g2);
        return function1.invoke(Integer.valueOf(m5766getHeightimpl - IntOffset.m5726getYimpl(m292calculateOffsetemnUabE)));
    }
}
