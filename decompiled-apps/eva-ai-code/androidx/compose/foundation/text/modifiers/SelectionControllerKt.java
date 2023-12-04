package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a+\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"makeSelectionModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectableId", "", "layoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isInTouchMode", "", "outOfBoundary", TtmlNode.START, "Landroidx/compose/ui/geometry/Offset;", TtmlNode.END, "outOfBoundary-2x9bVx0", "(Landroidx/compose/ui/text/TextLayoutResult;JJ)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final Function0<? extends LayoutCoordinates> function0, final Function0<TextLayoutResult> function02, boolean z) {
        if (z) {
            ?? r12 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
                private long lastPosition = Offset.Companion.m3034getZeroF1C5BW0();
                private long dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDown-k-4lQ0M */
                public void mo1077onDownk4lQ0M(long j2) {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                public final void setLastPosition(long j2) {
                    this.lastPosition = j2;
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final void setDragTotalDistance(long j2) {
                    this.dragTotalDistance = j2;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onStart-k-4lQ0M */
                public void mo1079onStartk4lQ0M(long j2) {
                    boolean m1137outOfBoundary2x9bVx0;
                    LayoutCoordinates invoke = function0.invoke();
                    if (invoke != null) {
                        Function0<TextLayoutResult> function03 = function02;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j3 = j;
                        if (!invoke.isAttached()) {
                            return;
                        }
                        m1137outOfBoundary2x9bVx0 = SelectionControllerKt.m1137outOfBoundary2x9bVx0(function03.invoke(), j2, j2);
                        if (m1137outOfBoundary2x9bVx0) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(j3);
                        } else {
                            selectionRegistrar2.mo1211notifySelectionUpdateStartd4ec7I(invoke, j2, SelectionAdjustment.Companion.getWord());
                        }
                        this.lastPosition = j2;
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDrag-k-4lQ0M */
                public void mo1078onDragk4lQ0M(long j2) {
                    boolean m1137outOfBoundary2x9bVx0;
                    LayoutCoordinates invoke = function0.invoke();
                    if (invoke != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j3 = j;
                        Function0<TextLayoutResult> function03 = function02;
                        if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                            long m3023plusMKHz9U = Offset.m3023plusMKHz9U(this.dragTotalDistance, j2);
                            this.dragTotalDistance = m3023plusMKHz9U;
                            long m3023plusMKHz9U2 = Offset.m3023plusMKHz9U(this.lastPosition, m3023plusMKHz9U);
                            m1137outOfBoundary2x9bVx0 = SelectionControllerKt.m1137outOfBoundary2x9bVx0(function03.invoke(), this.lastPosition, m3023plusMKHz9U2);
                            if (m1137outOfBoundary2x9bVx0 || !selectionRegistrar2.mo1210notifySelectionUpdate5iVPX68(invoke, m3023plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                                return;
                            }
                            this.lastPosition = m3023plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }
            };
            return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r12, new SelectionControllerKt$makeSelectionModifier$1(r12, null));
        }
        ?? r11 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m3034getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final void setLastPosition(long j2) {
                this.lastPosition = j2;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
            public boolean mo1139onExtendk4lQ0M(long j2) {
                LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached()) {
                        if (selectionRegistrar2.mo1210notifySelectionUpdate5iVPX68(invoke, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
                            this.lastPosition = j2;
                        }
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
                    }
                    return false;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
            public boolean mo1140onExtendDragk4lQ0M(long j2) {
                LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        if (selectionRegistrar2.mo1210notifySelectionUpdate5iVPX68(invoke, j2, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
                            this.lastPosition = j2;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k  reason: not valid java name */
            public boolean mo1141onStart3MmeM6k(long j2, SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached()) {
                        selectionRegistrar2.mo1211notifySelectionUpdateStartd4ec7I(invoke, j2, adjustment);
                        this.lastPosition = j2;
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3);
                    }
                    return false;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
            public boolean mo1138onDrag3MmeM6k(long j2, SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates invoke = function0.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j3)) {
                        if (selectionRegistrar2.mo1210notifySelectionUpdate5iVPX68(invoke, j2, this.lastPosition, false, adjustment)) {
                            this.lastPosition = j2;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
        };
        return PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r11, new SelectionControllerKt$makeSelectionModifier$2(r11, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundary-2x9bVx0  reason: not valid java name */
    public static final boolean m1137outOfBoundary2x9bVx0(TextLayoutResult textLayoutResult, long j, long j2) {
        if (textLayoutResult == null) {
            return false;
        }
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        int m5054getOffsetForPositionk4lQ0M = textLayoutResult.m5054getOffsetForPositionk4lQ0M(j);
        int m5054getOffsetForPositionk4lQ0M2 = textLayoutResult.m5054getOffsetForPositionk4lQ0M(j2);
        int i = length - 1;
        return (m5054getOffsetForPositionk4lQ0M >= i && m5054getOffsetForPositionk4lQ0M2 >= i) || (m5054getOffsetForPositionk4lQ0M < 0 && m5054getOffsetForPositionk4lQ0M2 < 0);
    }
}
