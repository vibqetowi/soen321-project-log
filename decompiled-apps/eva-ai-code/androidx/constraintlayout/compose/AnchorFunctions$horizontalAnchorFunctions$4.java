package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintScopeCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class AnchorFunctions$horizontalAnchorFunctions$4 extends Lambda implements Function2<ConstraintReference, Object, ConstraintReference> {
    public static final AnchorFunctions$horizontalAnchorFunctions$4 INSTANCE = new AnchorFunctions$horizontalAnchorFunctions$4();

    AnchorFunctions$horizontalAnchorFunctions$4() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ConstraintReference invoke(ConstraintReference arrayOf, Object other) {
        Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
        Intrinsics.checkNotNullParameter(other, "other");
        arrayOf.bottomToTop(null);
        arrayOf.baselineToBaseline(null);
        ConstraintReference bottomToBottom = arrayOf.bottomToBottom(other);
        Intrinsics.checkNotNullExpressionValue(bottomToBottom, "bottomToBottom(other)");
        return bottomToBottom;
    }
}
