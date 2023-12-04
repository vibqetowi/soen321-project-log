package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableState$draggableState$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        mutableState = ((SwipeableState) this.this$0).absoluteOffset;
        float floatValue = ((Number) mutableState.getValue()).floatValue() + f;
        float coerceIn = RangesKt.coerceIn(floatValue, this.this$0.getMinBound$material3_release(), this.this$0.getMaxBound$material3_release());
        float f2 = floatValue - coerceIn;
        ResistanceConfig resistance$material3_release = this.this$0.getResistance$material3_release();
        float computeResistance = resistance$material3_release != null ? resistance$material3_release.computeResistance(f2) : 0.0f;
        mutableState2 = ((SwipeableState) this.this$0).offsetState;
        mutableState2.setValue(Float.valueOf(coerceIn + computeResistance));
        mutableState3 = ((SwipeableState) this.this$0).overflowState;
        mutableState3.setValue(Float.valueOf(f2));
        mutableState4 = ((SwipeableState) this.this$0).absoluteOffset;
        mutableState4.setValue(Float.valueOf(floatValue));
    }
}
