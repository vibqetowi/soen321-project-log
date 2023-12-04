package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintScopeCommon.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class AnchorFunctions$verticalAnchorFunctions$1 extends Lambda implements Function3<ConstraintReference, Object, LayoutDirection, ConstraintReference> {
    public static final AnchorFunctions$verticalAnchorFunctions$1 INSTANCE = new AnchorFunctions$verticalAnchorFunctions$1();

    AnchorFunctions$verticalAnchorFunctions$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final ConstraintReference invoke(ConstraintReference arrayOf, Object other, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(arrayOf, "$this$arrayOf");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        AnchorFunctions.INSTANCE.clearLeft(arrayOf, layoutDirection);
        ConstraintReference leftToLeft = arrayOf.leftToLeft(other);
        Intrinsics.checkNotNullExpressionValue(leftToLeft, "leftToLeft(other)");
        return leftToLeft;
    }
}
