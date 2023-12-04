package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animation;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt$createTransitionInfo$values$2 extends Lambda implements Function0<Map<Long, T>> {
    final /* synthetic */ long $endTimeMs;
    final /* synthetic */ Lazy<Long> $startTimeMs$delegate;
    final /* synthetic */ long $stepMs;
    final /* synthetic */ Animation<T, V> $this_createTransitionInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$createTransitionInfo$values$2(Animation<T, V> animation, long j, long j2, Lazy<Long> lazy) {
        super(0);
        this.$this_createTransitionInfo = animation;
        this.$endTimeMs = j;
        this.$stepMs = j2;
        this.$startTimeMs$delegate = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Long, T> invoke() {
        long createTransitionInfo$lambda$1;
        long createTransitionInfo$lambda$12;
        long createTransitionInfo$lambda$13;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        createTransitionInfo$lambda$1 = UtilsKt.createTransitionInfo$lambda$1(this.$startTimeMs$delegate);
        Long valueOf = Long.valueOf(createTransitionInfo$lambda$1);
        Animation<T, V> animation = this.$this_createTransitionInfo;
        createTransitionInfo$lambda$12 = UtilsKt.createTransitionInfo$lambda$1(this.$startTimeMs$delegate);
        linkedHashMap.put(valueOf, animation.getValueFromNanos(UtilsKt.millisToNanos(createTransitionInfo$lambda$12)));
        linkedHashMap.put(Long.valueOf(this.$endTimeMs), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(this.$endTimeMs)));
        createTransitionInfo$lambda$13 = UtilsKt.createTransitionInfo$lambda$1(this.$startTimeMs$delegate);
        while (createTransitionInfo$lambda$13 <= this.$endTimeMs) {
            linkedHashMap.put(Long.valueOf(createTransitionInfo$lambda$13), this.$this_createTransitionInfo.getValueFromNanos(UtilsKt.millisToNanos(createTransitionInfo$lambda$13)));
            createTransitionInfo$lambda$13 += this.$stepMs;
        }
        return linkedHashMap;
    }
}
