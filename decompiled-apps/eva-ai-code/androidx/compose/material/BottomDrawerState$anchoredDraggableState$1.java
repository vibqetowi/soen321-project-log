package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$1(BottomDrawerState bottomDrawerState) {
        super(1);
        this.this$0 = bottomDrawerState;
    }

    public final Float invoke(float f) {
        Density requireDensity;
        float f2;
        requireDensity = this.this$0.requireDensity();
        f2 = DrawerKt.DrawerPositionalThreshold;
        return Float.valueOf(requireDensity.mo588toPx0680j_4(f2));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
