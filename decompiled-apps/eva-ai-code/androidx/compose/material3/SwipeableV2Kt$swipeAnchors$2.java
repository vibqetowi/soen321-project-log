package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2Kt$swipeAnchors$2 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AnchorChangeHandler<T> $anchorChangeHandler;
    final /* synthetic */ Function2<T, IntSize, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleValues;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2Kt$swipeAnchors$2(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, Function2<? super T, ? super IntSize, Float> function2) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleValues = set;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$calculateAnchor = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m2084invokeozmzZPI(intSize.m5771unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m2084invokeozmzZPI(long j) {
        AnchorChangeHandler<T> anchorChangeHandler;
        Map anchors$material3_release = this.$state.getAnchors$material3_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Function2<T, IntSize, Float> function2 = this.$calculateAnchor;
        for (Object obj : this.$possibleValues) {
            Float invoke = function2.invoke(obj, IntSize.m5759boximpl(j));
            if (invoke != null) {
                linkedHashMap.put(obj, invoke);
            }
        }
        if (Intrinsics.areEqual(anchors$material3_release, linkedHashMap)) {
            return;
        }
        Object targetValue = this.$state.getTargetValue();
        if (!this.$state.updateAnchors$material3_release(linkedHashMap) || (anchorChangeHandler = this.$anchorChangeHandler) == 0) {
            return;
        }
        anchorChangeHandler.onAnchorsChanged(targetValue, anchors$material3_release, linkedHashMap);
    }
}
