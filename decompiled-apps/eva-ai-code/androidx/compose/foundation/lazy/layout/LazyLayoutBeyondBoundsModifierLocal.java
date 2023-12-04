package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ,2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001c\u001a\u0004\u0018\u0001H\u001d\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0019\u0010\u001e\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\u001f¢\u0006\u0002\b!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\b*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\b*\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "reverseLayout", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "addNextInterval", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", TtmlNode.TAG_LAYOUT, ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "hasMoreContent", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", "isForward", "isForward-4vf7U8o", "(I)Z", "isOppositeToOrientation", "isOppositeToOrientation-4vf7U8o", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return Modifier.Element.CC.$default$any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z, LayoutDirection layoutDirection, Orientation orientation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion;", "", "()V", "emptyBeyondBoundsScope", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8  reason: not valid java name */
    public <T> T mo902layouto7g1Pn8(final int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int firstPlacedIndex;
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return block.invoke(emptyBeyondBoundsScope);
        }
        if (m900isForward4vf7U8o(i)) {
            firstPlacedIndex = this.state.getLastPlacedIndex();
        } else {
            firstPlacedIndex = this.state.getFirstPlacedIndex();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
        T t = null;
        while (t == null && m899hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i)) {
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = (T) m898addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i);
            this.state.remeasure();
            t = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    boolean m899hasMoreContentFR3nfPY;
                    m899hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m899hasMoreContentFR3nfPY(objectRef.element, i);
                    return m899hasMoreContentFR3nfPY;
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        this.state.remeasure();
        return t;
    }

    /* renamed from: isForward-4vf7U8o  reason: not valid java name */
    private final boolean m900isForward4vf7U8o(int i) {
        if (BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4531getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4530getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4529getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4532getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4533getLefthoxUOeE())) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i2 == 1) {
                    return this.reverseLayout;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            } else if (!BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4534getRighthoxUOeE())) {
                LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                throw new KotlinNothingValueException();
            } else {
                int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.reverseLayout;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: addNextInterval-FR3nfPY  reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m898addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m900isForward4vf7U8o(i)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY  reason: not valid java name */
    public final boolean m899hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (m901isOppositeToOrientation4vf7U8o(i)) {
            return false;
        }
        if (m900isForward4vf7U8o(i)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o  reason: not valid java name */
    private final boolean m901isOppositeToOrientation4vf7U8o(int i) {
        if (!(BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4529getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4532getBelowhoxUOeE()))) {
            if (!(BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4533getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4534getRighthoxUOeE()))) {
                if (!(BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4531getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4525equalsimpl0(i, BeyondBoundsLayout.LayoutDirection.Companion.m4530getAfterhoxUOeE()))) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == Orientation.Vertical) {
                return true;
            }
        } else if (this.orientation == Orientation.Horizontal) {
            return true;
        }
        return false;
    }
}
