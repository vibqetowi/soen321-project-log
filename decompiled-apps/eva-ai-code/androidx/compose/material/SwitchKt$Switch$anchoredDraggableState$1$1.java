package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "distance", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$Switch$anchoredDraggableState$1$1 extends Lambda implements Function1<Float, Float> {
    public static final SwitchKt$Switch$anchoredDraggableState$1$1 INSTANCE = new SwitchKt$Switch$anchoredDraggableState$1$1();

    SwitchKt$Switch$anchoredDraggableState$1$1() {
        super(1);
    }

    public final Float invoke(float f) {
        return Float.valueOf(f * 0.7f);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
