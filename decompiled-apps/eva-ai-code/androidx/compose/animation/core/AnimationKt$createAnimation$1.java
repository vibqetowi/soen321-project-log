package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Animation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "it", "invoke", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimationKt$createAnimation$1 extends Lambda implements Function1<V, V> {
    public static final AnimationKt$createAnimation$1 INSTANCE = new AnimationKt$createAnimation$1();

    AnimationKt$createAnimation$1() {
        super(1);
    }

    /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
    @Override // kotlin.jvm.functions.Function1
    public final AnimationVector invoke(AnimationVector it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
