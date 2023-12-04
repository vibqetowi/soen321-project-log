package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyLayoutKeyIndexMap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap$1$1 extends Lambda implements Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit> {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ HashMap<Object, Integer> $map;
    final /* synthetic */ NearestRangeKeyIndexMap this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestRangeKeyIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
        this.this$0 = nearestRangeKeyIndexMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
        invoke2(interval);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r3 == null) goto L12;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> it) {
        Object defaultLazyLayoutKey;
        Object[] objArr;
        int i;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<Integer, Object> key = it.getValue().getKey();
        int max = Math.max(this.$first, it.getStartIndex());
        int min = Math.min(this.$last, (it.getStartIndex() + it.getSize()) - 1);
        if (max > min) {
            return;
        }
        while (true) {
            if (key != null) {
                defaultLazyLayoutKey = key.invoke(Integer.valueOf(max - it.getStartIndex()));
            }
            defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(max);
            this.$map.put(defaultLazyLayoutKey, Integer.valueOf(max));
            objArr = this.this$0.keys;
            i = this.this$0.keysStartIndex;
            objArr[max - i] = defaultLazyLayoutKey;
            if (max == min) {
                return;
            }
            max++;
        }
    }
}
