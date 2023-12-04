package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
/* compiled from: ConstraintScopeCommon.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalAnchorable;", "", "linkTo", "", "anchor", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface HorizontalAnchorable {
    /* renamed from: linkTo-VpY3zN4 */
    void mo5854linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2);

    /* compiled from: ConstraintScopeCommon.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        /* renamed from: linkTo-VpY3zN4$default  reason: not valid java name */
        public static /* synthetic */ void m5910linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i & 2) != 0) {
                f = Dp.m5607constructorimpl(0);
            }
            if ((i & 4) != 0) {
                f2 = Dp.m5607constructorimpl(0);
            }
            horizontalAnchorable.mo5854linkToVpY3zN4(horizontalAnchor, f, f2);
        }
    }
}
