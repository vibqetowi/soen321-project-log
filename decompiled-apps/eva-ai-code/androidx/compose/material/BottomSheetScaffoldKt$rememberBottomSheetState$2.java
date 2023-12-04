package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/BottomSheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$rememberBottomSheetState$2 extends Lambda implements Function0<BottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomSheetValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$rememberBottomSheetState$2(BottomSheetValue bottomSheetValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        super(0);
        this.$initialValue = bottomSheetValue;
        this.$density = density;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BottomSheetState invoke() {
        return BottomSheetScaffoldKt.BottomSheetState(this.$initialValue, this.$density, this.$animationSpec, this.$confirmStateChange);
    }
}
