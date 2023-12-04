package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UtilsKt$createTransitionInfo$values$4 extends Lambda implements Function0<Map<Long, T>> {
    final /* synthetic */ long $endTimeMs;
    final /* synthetic */ long $startTimeMs;
    final /* synthetic */ long $stepMs;
    final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $this_createTransitionInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$createTransitionInfo$values$4(long j, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, long j2, long j3) {
        super(0);
        this.$startTimeMs = j;
        this.$this_createTransitionInfo = transitionAnimationState;
        this.$endTimeMs = j2;
        this.$stepMs = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Long, T> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(this.$startTimeMs), this.$this_createTransitionInfo.getAnimation().getValueFromNanos(UtilsKt.millisToNanos(this.$startTimeMs)));
        linkedHashMap.put(Long.valueOf(this.$endTimeMs), this.$this_createTransitionInfo.getAnimation().getValueFromNanos(UtilsKt.millisToNanos(this.$endTimeMs)));
        long j = this.$startTimeMs;
        while (j <= this.$endTimeMs) {
            linkedHashMap.put(Long.valueOf(j), this.$this_createTransitionInfo.getAnimation().getValueFromNanos(UtilsKt.millisToNanos(j)));
            j += this.$stepMs;
        }
        return linkedHashMap;
    }
}
