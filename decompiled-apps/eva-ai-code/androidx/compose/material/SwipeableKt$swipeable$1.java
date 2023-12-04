package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/material/FixedThreshold;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/material/FixedThreshold;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$1 extends Lambda implements Function2<T, T, FixedThreshold> {
    public static final SwipeableKt$swipeable$1 INSTANCE = new SwipeableKt$swipeable$1();

    SwipeableKt$swipeable$1() {
        super(2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function2
    public final FixedThreshold invoke(T t, T t2) {
        return new FixedThreshold(Dp.m5607constructorimpl(56), null);
    }
}
