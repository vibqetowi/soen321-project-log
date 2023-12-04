package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$firstVisibleItemScrollOffset$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemScrollOffset$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int[] offsets = this.this$0.getScrollPosition$foundation_release().getOffsets();
        LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
        int firstVisibleItemIndex = lazyStaggeredGridState.getFirstVisibleItemIndex();
        int[] indices = lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices();
        int length = offsets.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (indices[i2] == firstVisibleItemIndex) {
                i = Math.min(i, offsets[i2]);
            }
        }
        return Integer.valueOf(i != Integer.MAX_VALUE ? i : 0);
    }
}
