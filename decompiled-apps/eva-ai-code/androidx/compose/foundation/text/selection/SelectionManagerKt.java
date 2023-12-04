package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0000\u001a!\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0018H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getCurrentSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "merge", "lhs", "rhs", "containsInclusive", "", "Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "visibleBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionManagerKt {

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    private static final long calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo, boolean z) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null) {
            int offset = anchorInfo.getOffset();
            if (!z) {
                offset--;
            }
            if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
                return Offset.Companion.m3033getUnspecifiedF1C5BW0();
            }
            Offset m1191getCurrentDragPosition_m7T9E = selectionManager.m1191getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(m1191getCurrentDragPosition_m7T9E);
            float m3018getXimpl = Offset.m3018getXimpl(layoutCoordinates.mo4553localPositionOfR5De75A(containerLayoutCoordinates, m1191getCurrentDragPosition_m7T9E.m3028unboximpl()));
            long mo1152getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1152getRangeOfLineContainingjx7JFs(offset);
            Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m5080getMinimpl(mo1152getRangeOfLineContainingjx7JFs));
            Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(RangesKt.coerceAtLeast(TextRange.m5079getMaximpl(mo1152getRangeOfLineContainingjx7JFs) - 1, TextRange.m5080getMinimpl(mo1152getRangeOfLineContainingjx7JFs)));
            float coerceIn = RangesKt.coerceIn(m3018getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
            if (Math.abs(m3018getXimpl - coerceIn) > IntSize.m5767getWidthimpl(j) / 2) {
                return Offset.Companion.m3033getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(coerceIn, Offset.m3019getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m3048getCenterF1C5BW0())));
        }
        return Offset.Companion.m3033getUnspecifiedF1C5BW0();
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m1202calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager manager, long j) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Selection selection = manager.getSelection();
        if (selection == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(manager, j, selection.getEnd(), false);
            }
            return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(manager, j, selection.getStart(), true);
        }
        return Offset.Companion.m3033getUnspecifiedF1C5BW0();
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selection, "selection");
        AnnotatedString text = selectable.getText();
        if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    return text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                }
                return text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
            } else if (selectable.getSelectableId() == selection.getStart().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    return text.subSequence(0, selection.getStart().getOffset());
                }
                return text.subSequence(selection.getStart().getOffset(), text.length());
            } else if (selection.getHandlesCrossed()) {
                return text.subSequence(selection.getEnd().getOffset(), text.length());
            } else {
                return text.subSequence(0, selection.getEnd().getOffset());
            }
        }
        return text;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m3056Rect0a9Yr6o(layoutCoordinates.mo4557windowToLocalMKHz9U(boundsInWindow.m3053getTopLeftF1C5BW0()), layoutCoordinates.mo4557windowToLocalMKHz9U(boundsInWindow.m3047getBottomRightF1C5BW0()));
    }

    /* renamed from: containsInclusive-Uv8p0NA  reason: not valid java name */
    public static final boolean m1203containsInclusiveUv8p0NA(Rect containsInclusive, long j) {
        Intrinsics.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float m3018getXimpl = Offset.m3018getXimpl(j);
        if (left <= m3018getXimpl && m3018getXimpl <= right) {
            float top = containsInclusive.getTop();
            float bottom = containsInclusive.getBottom();
            float m3019getYimpl = Offset.m3019getYimpl(j);
            if (top <= m3019getYimpl && m3019getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
