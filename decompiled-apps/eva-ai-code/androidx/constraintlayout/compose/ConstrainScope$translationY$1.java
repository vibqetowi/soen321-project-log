package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstrainScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "floatValue", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class ConstrainScope$translationY$1 extends Lambda implements Function2<ConstraintReference, Float, Unit> {
    public static final ConstrainScope$translationY$1 INSTANCE = new ConstrainScope$translationY$1();

    ConstrainScope$translationY$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference, Float f) {
        invoke(constraintReference, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ConstraintReference addFloatTransformFromDp, float f) {
        Intrinsics.checkNotNullParameter(addFloatTransformFromDp, "$this$addFloatTransformFromDp");
        addFloatTransformFromDp.translationY(f);
    }
}
