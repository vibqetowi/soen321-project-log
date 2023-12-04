package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010\"J'\u0010i\u001a\u0004\u0018\u00010\u00162\u0006\u0010j\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u0016H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u00020LH\u0000¢\u0006\u0002\boJ\u0017\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010r\u001a\u00020sH\u0000¢\u0006\u0002\btJ\b\u0010u\u001a\u00020vH\u0002J\u000f\u0010w\u001a\u0004\u0018\u00010xH\u0000¢\u0006\u0002\byJ\u000e\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020?J\r\u0010}\u001a\u00020LH\u0000¢\u0006\u0002\b~J\u0006\u0010\u007f\u001a\u00020LJ\u000f\u0010\u0080\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0003\b\u0081\u0001JA\u0010\u0082\u0001\u001a\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\u00070\u0084\u00010\u0083\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0003\b\u0088\u0001J\u000f\u0010\u0089\u0001\u001a\u00020LH\u0000¢\u0006\u0003\b\u008a\u0001J2\u0010\u008b\u0001\u001a\u00020L2\u0006\u0010g\u001a\u00020\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\t\u0010\u0090\u0001\u001a\u00020LH\u0002JE\u0010\u0091\u0001\u001a\u00020?2\u0006\u0010Y\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00162\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J<\u0010\u0091\u0001\u001a\u00020?2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010Q\u001a\u0004\u0018\u00010\u00162\u0006\u0010|\u001a\u00020?2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020LH\u0002J0\u0010\u0098\u0001\u001a\u00020L*\u00030\u0099\u00012\u0013\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020L0KH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J\u001d\u0010\u009c\u0001\u001a\u00020G*\u00020G2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020L0\u009e\u0001H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R8\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R4\u0010$\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0015\u001a\u0004\u0018\u00010(8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R8\u0010/\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010@\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020?8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001d\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR(\u0010J\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020L0KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0019\u0010Q\u001a\u0004\u0018\u00010\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R(\u0010R\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010BR8\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010\u001d\u001a\u0004\bZ\u0010\u0019\"\u0004\b[\u0010\u001bR\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010B\"\u0004\be\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_selection", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/selection/Selection;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "onSelectionChange", "Lkotlin/Function1;", "", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "previousPosition", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "shouldShowMagnifier", "getShouldShowMagnifier", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchMode", "getTouchMode", "setTouchMode", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "convertToContainerCoordinates", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, "convertToContainerCoordinates-Q7Q5hAU", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)Landroidx/compose/ui/geometry/Offset;", "copy", "copy$foundation_release", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isStartHandle", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "Lkotlin/Pair;", "", "", "selectableId", "previousSelection", "selectAll$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "startSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "updateHandleOffsets", "updateSelection", "previousHandlePosition", "updateSelection-3R_-tFg$foundation_release", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-RHHTvR4$foundation_release", "updateSelectionToolbarPosition", "detectNonConsumingTap", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionManager {
    private final MutableState<Selection> _selection;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MutableState hasFocus$delegate;
    private Function1<? super Selection, Unit> onSelectionChange;
    private Offset previousPosition;
    private final SelectionRegistrarImpl selectionRegistrar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;
    private boolean touchMode;

    public SelectionManager(SelectionRegistrarImpl selectionRegistrar) {
        MutableState<Selection> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        this.selectionRegistrar = selectionRegistrar;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selection = mutableStateOf$default;
        this.touchMode = true;
        this.onSelectionChange = SelectionManager$onSelectionChange$1.INSTANCE;
        this.focusRequester = new FocusRequester();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()), null, 2, null);
        this.dragBeginPosition$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.startHandlePosition$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default8;
        selectionRegistrar.setOnPositionChangeCallback$foundation_release(new AnonymousClass1());
        selectionRegistrar.setOnSelectionUpdateStartCallback$foundation_release(new AnonymousClass2());
        selectionRegistrar.setOnSelectionUpdateSelectAll$foundation_release(new AnonymousClass3());
        selectionRegistrar.setOnSelectionUpdateCallback$foundation_release(new AnonymousClass4());
        selectionRegistrar.setOnSelectionUpdateEndCallback$foundation_release(new AnonymousClass5());
        selectionRegistrar.setOnSelectableChangeCallback$foundation_release(new AnonymousClass6());
        selectionRegistrar.setAfterSelectableUnsubscribe$foundation_release(new AnonymousClass7());
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final boolean getTouchMode() {
        return this.touchMode;
    }

    public final void setTouchMode(boolean z) {
        this.touchMode = z;
    }

    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(Function1<? super Selection, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectionChange = function1;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.focusRequester = focusRequester;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final Modifier getModifier() {
        return KeyInputModifierKt.onKeyEvent(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.Companion, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.focusRequester), new SelectionManager$modifier$3(this)), false, null, 3, null), new SelectionManager$modifier$4(this)).then(getShouldShowMagnifier() ? SelectionManager_androidKt.selectionMagnifier(Modifier.Companion, this) : Modifier.Companion);
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m3007boximpl = layoutCoordinates != null ? Offset.m3007boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, m3007boximpl)) {
            return;
        }
        this.previousPosition = m3007boximpl;
        updateHandleOffsets();
        updateSelectionToolbarPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M  reason: not valid java name */
    public final void m1185setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition$delegate.setValue(Offset.m3007boximpl(j));
    }

    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m1192getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M  reason: not valid java name */
    public final void m1186setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance$delegate.setValue(Offset.m3007boximpl(j));
    }

    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release  reason: not valid java name */
    public final long m1193getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m1188setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* renamed from: getStartHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m1195getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E  reason: not valid java name */
    public final void m1187setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* renamed from: getEndHandlePosition-_m7T9-E  reason: not valid java name */
    public final Offset m1194getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E  reason: not valid java name */
    public final void m1184setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m1191getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return getDraggingHandle() != null;
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection = SelectionManager.this.getSelection();
            boolean z = true;
            if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            SelectionManager.this.updateHandleOffsets();
            SelectionManager.this.updateSelectionToolbarPosition();
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "position", "Landroidx/compose/ui/geometry/Offset;", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends Lambda implements Function3<LayoutCoordinates, Offset, SelectionAdjustment, Unit> {
        AnonymousClass2() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
            m1198invoked4ec7I(layoutCoordinates, offset.m3028unboximpl(), selectionAdjustment);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final void m1198invoked4ec7I(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionMode) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            Offset m1183convertToContainerCoordinatesQ7Q5hAU = SelectionManager.this.m1183convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j);
            if (m1183convertToContainerCoordinatesQ7Q5hAU != null) {
                SelectionManager.this.m1189startSelection9KIMszo(m1183convertToContainerCoordinatesQ7Q5hAU.m3028unboximpl(), false, selectionMode);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.hideSelectionToolbar$foundation_release();
            }
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableId", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            SelectionManager selectionManager = SelectionManager.this;
            Pair<Selection, Map<Long, Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j, selectionManager.getSelection());
            Selection component1 = selectAll$foundation_release.component1();
            Map<Long, Selection> component2 = selectAll$foundation_release.component2();
            if (!Intrinsics.areEqual(component1, SelectionManager.this.getSelection())) {
                SelectionManager.this.selectionRegistrar.setSubselections(component2);
                SelectionManager.this.getOnSelectionChange().invoke(component1);
            }
            SelectionManager.this.getFocusRequester().requestFocus();
            SelectionManager.this.hideSelectionToolbar$foundation_release();
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newPosition", "Landroidx/compose/ui/geometry/Offset;", "previousPosition", "isStartHandle", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends Lambda implements Function5<LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        AnonymousClass4() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Boolean invoke(LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool, SelectionAdjustment selectionAdjustment) {
            return m1199invoke5iVPX68(layoutCoordinates, offset.m3028unboximpl(), offset2.m3028unboximpl(), bool.booleanValue(), selectionAdjustment);
        }

        /* renamed from: invoke-5iVPX68  reason: not valid java name */
        public final Boolean m1199invoke5iVPX68(LayoutCoordinates layoutCoordinates, long j, long j2, boolean z, SelectionAdjustment selectionMode) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            return Boolean.valueOf(SelectionManager.this.m1197updateSelectionRHHTvR4$foundation_release(SelectionManager.this.m1183convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j), SelectionManager.this.m1183convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, j2), z, selectionMode));
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SelectionManager.this.showSelectionToolbar$foundation_release();
            SelectionManager.this.setDraggingHandle(null);
            SelectionManager.this.m1184setCurrentDragPosition_kEHs6E(null);
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableKey", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j))) {
                SelectionManager.this.onRelease();
                SelectionManager.this.setSelection(null);
            }
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectableKey", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends Lambda implements Function1<Long, Unit> {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection = SelectionManager.this.getSelection();
            boolean z = true;
            if (!((selection == null || (start = selection.getStart()) == null || j != start.getSelectableId()) ? false : true)) {
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 == null || (end = selection2.getEnd()) == null || j != end.getSelectableId()) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            SelectionManager.this.m1188setStartHandlePosition_kEHs6E(null);
            SelectionManager.this.m1187setEndHandlePosition_kEHs6E(null);
        }
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchor.getSelectableId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHandleOffsets() {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Selectable anchorSelectable$foundation_release = (selection == null || (start = selection.getStart()) == null) ? null : getAnchorSelectable$foundation_release(start);
        Selectable anchorSelectable$foundation_release2 = (selection == null || (end = selection.getEnd()) == null) ? null : getAnchorSelectable$foundation_release(end);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation_release != null ? anchorSelectable$foundation_release.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation_release2 != null ? anchorSelectable$foundation_release2.getLayoutCoordinates() : null;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || layoutCoordinates2 == null || layoutCoordinates3 == null) {
            m1188setStartHandlePosition_kEHs6E(null);
            m1187setEndHandlePosition_kEHs6E(null);
            return;
        }
        boolean z = true;
        long mo4553localPositionOfR5De75A = layoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release.mo1151getHandlePositiondBAh8RU(selection, true));
        long mo4553localPositionOfR5De75A2 = layoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates3, anchorSelectable$foundation_release2.mo1151getHandlePositiondBAh8RU(selection, false));
        Rect visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates);
        Offset m3007boximpl = Offset.m3007boximpl(mo4553localPositionOfR5De75A);
        m3007boximpl.m3028unboximpl();
        if (!(SelectionManagerKt.m1203containsInclusiveUv8p0NA(visibleBounds, mo4553localPositionOfR5De75A) || getDraggingHandle() == Handle.SelectionStart)) {
            m3007boximpl = null;
        }
        m1188setStartHandlePosition_kEHs6E(m3007boximpl);
        Offset m3007boximpl2 = Offset.m3007boximpl(mo4553localPositionOfR5De75A2);
        m3007boximpl2.m3028unboximpl();
        if (!SelectionManagerKt.m1203containsInclusiveUv8p0NA(visibleBounds, mo4553localPositionOfR5De75A2) && getDraggingHandle() != Handle.SelectionEnd) {
            z = false;
        }
        m1187setEndHandlePosition_kEHs6E(z ? m3007boximpl2 : null);
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (!(layoutCoordinates != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final Pair<Selection, Map<Long, Selection>> selectAll$foundation_release(long j, Selection selection) {
        HapticFeedback hapticFeedback;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == j ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectAllSelection);
            }
            selection2 = SelectionManagerKt.merge(selection2, selectAllSelection);
        }
        if (!Intrinsics.areEqual(selection2, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection2, linkedHashMap);
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString plus;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        Selection selection = getSelection();
        AnnotatedString annotatedString = null;
        if (selection != null) {
            int size = sort.size();
            for (int i = 0; i < size; i++) {
                Selectable selectable = sort.get(i);
                if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId() || annotatedString != null) {
                    AnnotatedString currentSelectedText = SelectionManagerKt.getCurrentSelectedText(selectable, selection);
                    if (annotatedString != null && (plus = annotatedString.plus(currentSelectedText)) != null) {
                        currentSelectedText = plus;
                    }
                    if ((selectable.getSelectableId() == selection.getEnd().getSelectableId() && !selection.getHandlesCrossed()) || (selectable.getSelectableId() == selection.getStart().getSelectableId() && selection.getHandlesCrossed())) {
                        return currentSelectedText;
                    }
                    annotatedString = currentSelectedText;
                }
            }
            return annotatedString;
        }
        return null;
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
            return;
        }
        clipboardManager.setText(selectedText$foundation_release);
    }

    public final void showSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (!getHasFocus() || getSelection() == null || (textToolbar = this.textToolbar) == null) {
            return;
        }
        TextToolbar.CC.showMenu$default(textToolbar, getContentRect(), new SelectionManager$showSelectionToolbar$1$1(this), null, null, null, 28, null);
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        if (getHasFocus()) {
            TextToolbar textToolbar2 = this.textToolbar;
            if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
                return;
            }
            textToolbar.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbarPosition() {
        if (getHasFocus()) {
            TextToolbar textToolbar = this.textToolbar;
            if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Shown) {
                showSelectionToolbar$foundation_release();
            }
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Selection selection = getSelection();
        if (selection == null) {
            return Rect.Companion.getZero();
        }
        Selectable anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart());
        Selectable anchorSelectable$foundation_release2 = getAnchorSelectable$foundation_release(selection.getEnd());
        if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
            return Rect.Companion.getZero();
        }
        if (anchorSelectable$foundation_release2 == null || (layoutCoordinates2 = anchorSelectable$foundation_release2.getLayoutCoordinates()) == null) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinates3 = this.containerLayoutCoordinates;
        if (layoutCoordinates3 != null && layoutCoordinates3.isAttached()) {
            long mo4553localPositionOfR5De75A = layoutCoordinates3.mo4553localPositionOfR5De75A(layoutCoordinates, anchorSelectable$foundation_release.mo1151getHandlePositiondBAh8RU(selection, true));
            long mo4553localPositionOfR5De75A2 = layoutCoordinates3.mo4553localPositionOfR5De75A(layoutCoordinates2, anchorSelectable$foundation_release2.mo1151getHandlePositiondBAh8RU(selection, false));
            long mo4554localToRootMKHz9U = layoutCoordinates3.mo4554localToRootMKHz9U(mo4553localPositionOfR5De75A);
            long mo4554localToRootMKHz9U2 = layoutCoordinates3.mo4554localToRootMKHz9U(mo4553localPositionOfR5De75A2);
            return new Rect(Math.min(Offset.m3018getXimpl(mo4554localToRootMKHz9U), Offset.m3018getXimpl(mo4554localToRootMKHz9U2)), Math.min(Offset.m3019getYimpl(layoutCoordinates3.mo4554localToRootMKHz9U(layoutCoordinates3.mo4553localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release.getBoundingBox(selection.getStart().getOffset()).getTop())))), Offset.m3019getYimpl(layoutCoordinates3.mo4554localToRootMKHz9U(layoutCoordinates3.mo4553localPositionOfR5De75A(layoutCoordinates2, OffsetKt.Offset(0.0f, anchorSelectable$foundation_release2.getBoundingBox(selection.getEnd().getOffset()).getTop()))))), Math.max(Offset.m3018getXimpl(mo4554localToRootMKHz9U), Offset.m3018getXimpl(mo4554localToRootMKHz9U2)), Math.max(Offset.m3019getYimpl(mo4554localToRootMKHz9U), Offset.m3019getYimpl(mo4554localToRootMKHz9U2)) + ((float) (SelectionHandlesKt.getHandleHeight() * 4.0d)));
        }
        return Rect.Companion.getZero();
    }

    public final void onRelease() {
        this.selectionRegistrar.setSubselections(MapsKt.emptyMap());
        hideSelectionToolbar$foundation_release();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
            }
        }
    }

    public final TextDragObserver handleDragObserver(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1077onDownk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates;
                Selection selection = SelectionManager.this.getSelection();
                if (selection == null) {
                    return;
                }
                Selectable anchorSelectable$foundation_release = SelectionManager.this.getAnchorSelectable$foundation_release(z ? selection.getStart() : selection.getEnd());
                if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                    return;
                }
                long m1170getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(anchorSelectable$foundation_release.mo1151getHandlePositiondBAh8RU(selection, z));
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1184setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo4553localPositionOfR5De75A(layoutCoordinates, m1170getAdjustedCoordinatesk4lQ0M)));
                SelectionManager.this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1184setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1079onStartk4lQ0M(long j) {
                LayoutCoordinates layoutCoordinates;
                long mo1151getHandlePositiondBAh8RU;
                SelectionManager.this.hideSelectionToolbar$foundation_release();
                Selection selection = SelectionManager.this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getStart().getSelectableId()));
                Selectable selectable2 = SelectionManager.this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selection.getEnd().getSelectableId()));
                if (z) {
                    layoutCoordinates = selectable != null ? selectable.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                } else {
                    layoutCoordinates = selectable2 != null ? selectable2.getLayoutCoordinates() : null;
                    Intrinsics.checkNotNull(layoutCoordinates);
                }
                if (z) {
                    Intrinsics.checkNotNull(selectable);
                    mo1151getHandlePositiondBAh8RU = selectable.mo1151getHandlePositiondBAh8RU(selection, true);
                } else {
                    Intrinsics.checkNotNull(selectable2);
                    mo1151getHandlePositiondBAh8RU = selectable2.mo1151getHandlePositiondBAh8RU(selection, false);
                }
                long m1170getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(mo1151getHandlePositiondBAh8RU);
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1185setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo4553localPositionOfR5De75A(layoutCoordinates, m1170getAdjustedCoordinatesk4lQ0M));
                SelectionManager.this.m1186setDragTotalDistancek4lQ0M(Offset.Companion.m3034getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1078onDragk4lQ0M(long j) {
                SelectionManager selectionManager = SelectionManager.this;
                selectionManager.m1186setDragTotalDistancek4lQ0M(Offset.m3023plusMKHz9U(selectionManager.m1193getDragTotalDistanceF1C5BW0$foundation_release(), j));
                long m3023plusMKHz9U = Offset.m3023plusMKHz9U(SelectionManager.this.m1192getDragBeginPositionF1C5BW0$foundation_release(), SelectionManager.this.m1193getDragTotalDistanceF1C5BW0$foundation_release());
                if (SelectionManager.this.m1197updateSelectionRHHTvR4$foundation_release(Offset.m3007boximpl(m3023plusMKHz9U), Offset.m3007boximpl(SelectionManager.this.m1192getDragBeginPositionF1C5BW0$foundation_release()), z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    SelectionManager.this.m1185setDragBeginPositionk4lQ0M(m3023plusMKHz9U);
                    SelectionManager.this.m1186setDragTotalDistancek4lQ0M(Offset.Companion.m3034getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1184setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                SelectionManager.this.showSelectionToolbar$foundation_release();
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1184setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SelectionManager$onClearSelectionRequested$1(this, function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-Q7Q5hAU  reason: not valid java name */
    public final Offset m1183convertToContainerCoordinatesQ7Q5hAU(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return null;
        }
        return Offset.m3007boximpl(requireContainerCoordinates$foundation_release().mo4553localPositionOfR5De75A(layoutCoordinates, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo  reason: not valid java name */
    public final void m1189startSelection9KIMszo(long j, boolean z, SelectionAdjustment selectionAdjustment) {
        m1196updateSelection3R_tFg$foundation_release(j, j, null, z, selectionAdjustment);
    }

    /* renamed from: updateSelection-RHHTvR4$foundation_release  reason: not valid java name */
    public final boolean m1197updateSelectionRHHTvR4$foundation_release(Offset offset, Offset offset2, boolean z, SelectionAdjustment adjustment) {
        Selection selection;
        long selectableId;
        Offset m1183convertToContainerCoordinatesQ7Q5hAU;
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (offset == null || (selection = getSelection()) == null) {
            return false;
        }
        if (z) {
            selectableId = selection.getEnd().getSelectableId();
        } else {
            selectableId = selection.getStart().getSelectableId();
        }
        Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(selectableId));
        if (selectable == null) {
            m1183convertToContainerCoordinatesQ7Q5hAU = null;
        } else {
            LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates);
            m1183convertToContainerCoordinatesQ7Q5hAU = m1183convertToContainerCoordinatesQ7Q5hAU(layoutCoordinates, SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(selectable.mo1151getHandlePositiondBAh8RU(selection, !z)));
        }
        if (m1183convertToContainerCoordinatesQ7Q5hAU != null) {
            long m3028unboximpl = m1183convertToContainerCoordinatesQ7Q5hAU.m3028unboximpl();
            long m3028unboximpl2 = z ? offset.m3028unboximpl() : m3028unboximpl;
            if (!z) {
                m3028unboximpl = offset.m3028unboximpl();
            }
            return m1196updateSelection3R_tFg$foundation_release(m3028unboximpl2, m3028unboximpl, offset2, z, adjustment);
        }
        return false;
    }

    /* renamed from: updateSelection-3R_-tFg$foundation_release  reason: not valid java name */
    public final boolean m1196updateSelection3R_tFg$foundation_release(long j, long j2, Offset offset, boolean z, SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
        m1184setCurrentDragPosition_kEHs6E(z ? Offset.m3007boximpl(j) : Offset.m3007boximpl(j2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Selectable selectable = sort.get(i);
            int i2 = i;
            Selection selection2 = selection;
            Pair<Selection, Boolean> mo1153updateSelectionqCDeeow = selectable.mo1153updateSelectionqCDeeow(j, j2, offset, z, requireContainerCoordinates$foundation_release(), adjustment, this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId())));
            Selection component1 = mo1153updateSelectionqCDeeow.component1();
            z2 = z2 || mo1153updateSelectionqCDeeow.component2().booleanValue();
            if (component1 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), component1);
            }
            selection = SelectionManagerKt.merge(selection2, component1);
            i = i2 + 1;
        }
        Selection selection3 = selection;
        if (!Intrinsics.areEqual(selection3, getSelection())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
            }
            this.selectionRegistrar.setSubselections(linkedHashMap);
            this.onSelectionChange.invoke(selection3);
        }
        return z2;
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m1190contextMenuOpenAdjustmentk4lQ0M(long j) {
        Selection selection = getSelection();
        if (selection != null ? TextRange.m5076getCollapsedimpl(selection.m1160toTextRanged9O1mEE()) : true) {
            m1189startSelection9KIMszo(j, true, SelectionAdjustment.Companion.getWord());
        }
    }
}
