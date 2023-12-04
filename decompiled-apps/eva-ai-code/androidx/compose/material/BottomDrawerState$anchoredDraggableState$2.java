package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {
    final /* synthetic */ BottomDrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawerState$anchoredDraggableState$2(BottomDrawerState bottomDrawerState) {
        super(0);
        this.this$0 = bottomDrawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Density requireDensity;
        float f;
        requireDensity = this.this$0.requireDensity();
        f = DrawerKt.DrawerVelocityThreshold;
        return Float.valueOf(requireDensity.mo588toPx0680j_4(f));
    }
}
