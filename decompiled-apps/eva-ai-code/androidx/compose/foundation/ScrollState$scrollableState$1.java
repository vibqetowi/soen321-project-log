package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }

    public final Float invoke(float f) {
        float f2;
        f2 = this.this$0.accumulator;
        float value = this.this$0.getValue() + f + f2;
        float coerceIn = RangesKt.coerceIn(value, 0.0f, this.this$0.getMaxValue());
        boolean z = !(value == coerceIn);
        float value2 = coerceIn - this.this$0.getValue();
        int roundToInt = MathKt.roundToInt(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + roundToInt);
        this.this$0.accumulator = value2 - roundToInt;
        if (z) {
            f = value2;
        }
        return Float.valueOf(f);
    }
}
