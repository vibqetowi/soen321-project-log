package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ MutableState<Boolean> $remeasureRequesterState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(MutableState<Boolean> mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$remeasureRequesterState = mutableState;
        this.$constraintSet = constraintSetForInlineDsl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$remeasureRequesterState;
        mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
        this.$constraintSet.setKnownDirty(true);
    }
}
