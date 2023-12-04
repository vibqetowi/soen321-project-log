package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridAnimateScrollScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<LazyGridItemInfo> $visibleItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(boolean z, List<? extends LazyGridItemInfo> list) {
        super(1);
        this.$isVertical = z;
        this.$visibleItems = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i).getRow() : this.$visibleItems.get(i).getColumn());
    }
}
