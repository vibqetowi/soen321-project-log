package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/BottomDrawerState;", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerState$Companion$Saver$2 extends Lambda implements Function1<BottomDrawerValue, BottomDrawerState> {
    final /* synthetic */ Function1<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomDrawerState$Companion$Saver$2(Density density, Function1<? super BottomDrawerValue, Boolean> function1) {
        super(1);
        this.$density = density;
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BottomDrawerState invoke(BottomDrawerValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DrawerKt.BottomDrawerState(it, this.$density, this.$confirmStateChange);
    }
}
