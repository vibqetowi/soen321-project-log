package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyStaggeredGridMeasureKt$measure$1$29 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<LazyStaggeredGridMeasuredItem> $positionedItems;
    final /* synthetic */ LazyStaggeredGridMeasureContext $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureKt$measure$1$29(List<LazyStaggeredGridMeasuredItem> list, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        super(1);
        this.$positionedItems = list;
        this.$this_measure = lazyStaggeredGridMeasureContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<LazyStaggeredGridMeasuredItem> list = this.$positionedItems;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.$this_measure;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).place(layout, lazyStaggeredGridMeasureContext);
        }
    }
}
