package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B4\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\nJ5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "copy", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1778copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i & 4) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1780copyrOJDEFc(j, density, function2);
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m1779component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final Function2<IntRect, IntRect, Unit> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m1780copyrOJDEFc(long j, Density density, Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j, density, onPositionCalculated, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            return DpOffset.m5667equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
        }
        return false;
    }

    public int hashCode() {
        return (((DpOffset.m5672hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m5675toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j, Density density, Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        this.contentOffset = j;
        this.density = density;
        this.onPositionCalculated = onPositionCalculated;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m1781getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DropdownMenuPositionProvider$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends Lambda implements Function2<IntRect, IntRect, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(IntRect intRect, IntRect intRect2) {
            Intrinsics.checkNotNullParameter(intRect, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(intRect2, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
            invoke2(intRect, intRect2);
            return Unit.INSTANCE;
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i & 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1, null);
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1150calculatePositionllwVHH4(IntRect anchorBounds, long j, LayoutDirection layoutDirection, long j2) {
        Sequence sequenceOf;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo582roundToPx0680j_4 = this.density.mo582roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo582roundToPx0680j_42 = this.density.mo582roundToPx0680j_4(DpOffset.m5668getXD9Ej5fM(this.contentOffset));
        int mo582roundToPx0680j_43 = this.density.mo582roundToPx0680j_4(DpOffset.m5670getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + mo582roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo582roundToPx0680j_42) - IntSize.m5767getWidthimpl(j2);
        int m5767getWidthimpl = IntSize.m5767getWidthimpl(j) - IntSize.m5767getWidthimpl(j2);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m5767getWidthimpl = 0;
            }
            numArr[2] = Integer.valueOf(m5767getWidthimpl);
            sequenceOf = SequencesKt.sequenceOf(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m5767getWidthimpl(j)) {
                m5767getWidthimpl = 0;
            }
            numArr2[2] = Integer.valueOf(m5767getWidthimpl);
            sequenceOf = SequencesKt.sequenceOf(numArr2);
        }
        Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue < 0 || intValue + IntSize.m5767getWidthimpl(j2) > IntSize.m5767getWidthimpl(j)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom() + mo582roundToPx0680j_43, mo582roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo582roundToPx0680j_43) - IntSize.m5766getHeightimpl(j2);
        Iterator it2 = SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m5766getHeightimpl(j2) / 2)), Integer.valueOf((IntSize.m5766getHeightimpl(j) - IntSize.m5766getHeightimpl(j2)) - mo582roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 < mo582roundToPx0680j_4 || intValue2 + IntSize.m5766getHeightimpl(j2) > IntSize.m5766getHeightimpl(j) - mo582roundToPx0680j_4) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m5767getWidthimpl(j2) + right, IntSize.m5766getHeightimpl(j2) + top));
        return IntOffsetKt.IntOffset(right, top);
    }
}
