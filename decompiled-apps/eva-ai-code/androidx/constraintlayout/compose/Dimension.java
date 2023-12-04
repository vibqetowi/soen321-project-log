package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \u00032\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "Coercible", "Companion", "MaxCoercible", "MinCoercible", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Coercible extends Dimension {
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface MaxCoercible extends Dimension {
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public interface MinCoercible extends Dimension {
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001b\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "()V", "fillToConstraints", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getFillToConstraints", "()Landroidx/constraintlayout/compose/Dimension$Coercible;", "matchParent", "Landroidx/constraintlayout/compose/Dimension;", "getMatchParent", "()Landroidx/constraintlayout/compose/Dimension;", "preferredWrapContent", "getPreferredWrapContent", "wrapContent", "getWrapContent", "percent", "", "preferredValue", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "dp", "Landroidx/compose/ui/unit/Dp;", "preferredValue-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "ratio", "", "value", "value-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: preferredValue-0680j_4  reason: not valid java name */
        public final MinCoercible m5904preferredValue0680j_4(float f) {
            return new DimensionDescription(new Dimension$Companion$preferredValue$1(f));
        }

        /* renamed from: value-0680j_4  reason: not valid java name */
        public final Dimension m5905value0680j_4(float f) {
            return new DimensionDescription(new Dimension$Companion$value$1(f));
        }

        public final Dimension ratio(String ratio) {
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            return new DimensionDescription(new Dimension$Companion$ratio$1(ratio));
        }

        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription(Dimension$Companion$preferredWrapContent$1.INSTANCE);
        }

        public final Dimension getWrapContent() {
            return new DimensionDescription(Dimension$Companion$wrapContent$1.INSTANCE);
        }

        public final Dimension getMatchParent() {
            return new DimensionDescription(Dimension$Companion$matchParent$1.INSTANCE);
        }

        public final Coercible getFillToConstraints() {
            return new DimensionDescription(Dimension$Companion$fillToConstraints$1.INSTANCE);
        }

        public final Dimension percent(float f) {
            return new DimensionDescription(new Dimension$Companion$percent$1(f));
        }
    }
}
