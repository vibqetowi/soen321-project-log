package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "", "anchors", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeableState$animateTo$2 implements FlowCollector<Map<Float, ? extends T>> {
    final /* synthetic */ AnimationSpec<Float> $anim;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SwipeableState$animateTo$2(T t, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
        this.$anim = animationSpec;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((Map) obj, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map<java.lang.Float, ? extends T>, java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        SwipeableState$animateTo$2 swipeableState$animateTo$2;
        Float offset;
        Object animateInternalToOffset;
        MutableFloatState mutableFloatState;
        Object firstOrNull;
        Map map2;
        MutableFloatState mutableFloatState2;
        Object firstOrNull2;
        if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
            if ((swipeableState$animateTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = swipeableState$animateTo$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$animateTo$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        offset = SwipeableKt.getOffset(map, this.$targetValue);
                        if (offset == null) {
                            throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                        SwipeableState swipeableState = this.this$0;
                        float floatValue = offset.floatValue();
                        AnimationSpec<Float> animationSpec = this.$anim;
                        swipeableState$animateTo$2$emit$1.L$0 = this;
                        swipeableState$animateTo$2$emit$1.L$1 = map;
                        swipeableState$animateTo$2$emit$1.label = 1;
                        animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                        if (animateInternalToOffset == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState$animateTo$2 = this;
                        map2 = map;
                    } catch (Throwable th) {
                        th = th;
                        swipeableState$animateTo$2 = this;
                        mutableFloatState = swipeableState$animateTo$2.this$0.absoluteOffset;
                        float floatValue2 = mutableFloatState.getFloatValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (Math.abs(((Number) entry.getKey()).floatValue() - floatValue2) < 0.5f) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        firstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                        if (firstOrNull == null) {
                            firstOrNull = swipeableState$animateTo$2.this$0.getCurrentValue();
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    map = (Map) swipeableState$animateTo$2$emit$1.L$1;
                    swipeableState$animateTo$2 = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        map2 = map;
                    } catch (Throwable th2) {
                        th = th2;
                        mutableFloatState = swipeableState$animateTo$2.this$0.absoluteOffset;
                        float floatValue22 = mutableFloatState.getFloatValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        while (r9.hasNext()) {
                        }
                        firstOrNull = CollectionsKt.firstOrNull(linkedHashMap2.values());
                        if (firstOrNull == null) {
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                }
                mutableFloatState2 = swipeableState$animateTo$2.this$0.absoluteOffset;
                float floatValue3 = mutableFloatState2.getFloatValue();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (Math.abs(((Number) entry2.getKey()).floatValue() - floatValue3) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap3.values());
                if (firstOrNull2 == null) {
                    firstOrNull2 = swipeableState$animateTo$2.this$0.getCurrentValue();
                }
                swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
                return Unit.INSTANCE;
            }
        }
        swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
        Object obj2 = swipeableState$animateTo$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$animateTo$2$emit$1.label;
        if (i != 0) {
        }
        mutableFloatState2 = swipeableState$animateTo$2.this$0.absoluteOffset;
        float floatValue32 = mutableFloatState2.getFloatValue();
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        while (r9.hasNext()) {
        }
        firstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap32.values());
        if (firstOrNull2 == null) {
        }
        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
        return Unit.INSTANCE;
    }
}
