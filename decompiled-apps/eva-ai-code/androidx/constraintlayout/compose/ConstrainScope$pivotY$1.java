package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstrainScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ConstrainScope$pivotY$1 extends Lambda implements Function1<ConstraintReference, Unit> {
    final /* synthetic */ float $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainScope$pivotY$1(float f) {
        super(1);
        this.$value = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
        invoke2(constraintReference);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConstraintReference addTransform) {
        Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
        addTransform.pivotY(this.$value);
    }
}
