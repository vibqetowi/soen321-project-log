package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/ModalBottomSheetState;", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetState$Companion$Saver$4 extends Lambda implements Function1<ModalBottomSheetValue, ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<ModalBottomSheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetState$Companion$Saver$4(AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
        this.$skipHalfExpanded = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ModalBottomSheetState invoke(ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ModalBottomSheetKt.ModalBottomSheetState(it, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
