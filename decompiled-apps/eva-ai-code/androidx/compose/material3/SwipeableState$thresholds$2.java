package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableState$thresholds$2 extends Lambda implements Function2<Float, Float, Float> {
    public static final SwipeableState$thresholds$2 INSTANCE = new SwipeableState$thresholds$2();

    SwipeableState$thresholds$2() {
        super(2);
    }

    public final Float invoke(float f, float f2) {
        return Float.valueOf(0.0f);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2) {
        return invoke(f.floatValue(), f2.floatValue());
    }
}
