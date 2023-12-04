package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyStaggeredGridState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridState$firstVisibleItemIndex$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$firstVisibleItemIndex$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num;
        int[] indices = this.this$0.getScrollPosition$foundation_release().getIndices();
        if (indices.length == 0) {
            num = null;
        } else {
            int i = indices[0];
            if (i == -1) {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            ?? it = new IntRange(1, ArraysKt.getLastIndex(indices)).iterator();
            while (it.hasNext()) {
                int i2 = indices[it.nextInt()];
                if (i2 == -1) {
                    i2 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        }
        Integer num2 = num;
        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
    }
}
