package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void TextFieldSelectionHandle(boolean z, ResolvedTextDirection direction, TextFieldSelectionManager manager, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandle)P(1)808@30733L90,813@30889L327:TextFieldSelectionManager.kt#eksfi3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(manager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = manager.handleDragObserver$foundation_release(z);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        int i2 = i << 3;
        AndroidSelectionHandles_androidKt.m1146SelectionHandle8fL75g(manager.m1223getHandlePositiontuRUvjQ$foundation_release(z), z, direction, TextRange.m5081getReversedimpl(manager.getValue$foundation_release().m5325getSelectiond9O1mEE()), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(textDragObserver, null)), null, startRestartGroup, (i2 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i2 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z, direction, manager, i));
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m1203containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1223getHandlePositiontuRUvjQ$foundation_release(z));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m1224calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager manager, long j) {
        int m5082getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m5082getStartimpl = TextRange.m5082getStartimpl(manager.getValue$foundation_release().m5325getSelectiond9O1mEE());
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            m5082getStartimpl = TextRange.m5077getEndimpl(manager.getValue$foundation_release().m5325getSelectiond9O1mEE());
        }
        int originalToTransformed = manager.getOffsetMapping$foundation_release().originalToTransformed(m5082getStartimpl);
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release2 = manager.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        int coerceIn = RangesKt.coerceIn(originalToTransformed, (ClosedRange<Integer>) StringsKt.getIndices(text));
        long m3048getCenterF1C5BW0 = value.getBoundingBox(coerceIn).m3048getCenterF1C5BW0();
        TextFieldState state$foundation_release3 = manager.getState$foundation_release();
        if (state$foundation_release3 == null || (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release4 = manager.getState$foundation_release();
        if (state$foundation_release4 == null || (layoutResult2 = state$foundation_release4.getLayoutResult()) == null || (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        Offset m1221getCurrentDragPosition_m7T9E = manager.m1221getCurrentDragPosition_m7T9E();
        if (m1221getCurrentDragPosition_m7T9E == null) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        float m3018getXimpl = Offset.m3018getXimpl(innerTextFieldCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates, m1221getCurrentDragPosition_m7T9E.m3028unboximpl()));
        int lineForOffset = value.getLineForOffset(coerceIn);
        int lineStart = value.getLineStart(lineForOffset);
        int lineEnd = value.getLineEnd(lineForOffset, true);
        boolean z = TextRange.m5082getStartimpl(manager.getValue$foundation_release().m5325getSelectiond9O1mEE()) > TextRange.m5077getEndimpl(manager.getValue$foundation_release().m5325getSelectiond9O1mEE());
        float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z);
        float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z);
        float coerceIn2 = RangesKt.coerceIn(m3018getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
        if (Math.abs(m3018getXimpl - coerceIn2) > IntSize.m5767getWidthimpl(j) / 2) {
            return Offset.Companion.m3033getUnspecifiedF1C5BW0();
        }
        return layoutCoordinates.mo4553localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(coerceIn2, Offset.m3019getYimpl(m3048getCenterF1C5BW0)));
    }
}
