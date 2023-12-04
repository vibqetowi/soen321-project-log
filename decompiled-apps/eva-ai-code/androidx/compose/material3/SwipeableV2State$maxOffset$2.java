package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2State$maxOffset$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$maxOffset$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float maxOrNull;
        maxOrNull = SwipeableV2Kt.maxOrNull(this.this$0.getAnchors$material3_release());
        return Float.valueOf(maxOrNull != null ? maxOrNull.floatValue() : Float.POSITIVE_INFINITY);
    }
}
