package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020B2\b\b\u0002\u0010j\u001a\u00020!H\u0000¢\u0006\u0002\bkJ%\u0010l\u001a\u00020?2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020TH\u0000¢\u0006\u0002\btJ\r\u0010u\u001a\u00020BH\u0000¢\u0006\u0002\bvJ\u001f\u0010w\u001a\u00020B2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\bxJ\r\u0010y\u001a\u00020BH\u0000¢\u0006\u0002\bzJ\r\u0010{\u001a\u00020BH\u0000¢\u0006\u0002\b|J\b\u0010}\u001a\u00020~H\u0002J$\u0010\u007f\u001a\u00020\f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J$\u0010\u0084\u0001\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020!H\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020T2\u0007\u0010\u0085\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0089\u0001J\u000f\u0010\u008a\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u008b\u0001J\u000f\u0010\u008c\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u008d\u0001J\u000f\u0010\u008e\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0091\u0001J\u0013\u0010\u0092\u0001\u001a\u00020B2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0002J\u000f\u0010\u0095\u0001\u001a\u00020BH\u0000¢\u0006\u0003\b\u0096\u0001J6\u0010\u0097\u0001\u001a\u00020B2\u0006\u0010Y\u001a\u00020?2\u0007\u0010\u0098\u0001\u001a\u00020\u00152\u0007\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020!2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR8\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0019\u0010\u0017\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R\u0019\u0010\u0019\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020B0AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR+\u0010Y\u001a\u00020?2\u0006\u0010\u000b\u001a\u00020?8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010\u0013\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020`X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateSelection", "transformedStartOffset", "transformedEndOffset", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.Companion.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.editable$delegate = mutableStateOf$default2;
        this.dragBeginPosition = Offset.Companion.m3034getZeroF1C5BW0();
        this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default4;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1077onDownk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1079onStartk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult2;
                TextFieldValue m1216createTextFieldValueFDrldGo;
                TextLayoutResultProxy layoutResult3;
                if (TextFieldSelectionManager.this.getDraggingHandle() != null) {
                    return;
                }
                TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (!((state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m1112isPositionOnTextk4lQ0M(j)) ? false : true) && (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) != null && (layoutResult2 = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult2, layoutResult2.getLineForVerticalPosition(Offset.m3019getYimpl(j)), false, 2, null));
                    HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
                    }
                    m1216createTextFieldValueFDrldGo = textFieldSelectionManager.m1216createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                    textFieldSelectionManager.enterSelectionMode$foundation_release();
                    textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1216createTextFieldValueFDrldGo);
                    return;
                }
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                TextFieldState state$foundation_release3 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release3 != null && (layoutResult = state$foundation_release3.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    int m1109getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), m1109getOffsetForPosition3MmeM6k$default, m1109getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
                    textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(m1109getOffsetForPosition3MmeM6k$default);
                }
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager3.dragBeginPosition;
                textFieldSelectionManager3.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(j2));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1078onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                Integer num;
                long j5;
                int m1111getOffsetForPosition3MmeM6k;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3023plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager2.dragBeginPosition;
                    j4 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(Offset.m3023plusMKHz9U(j3, j4)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num != null) {
                        m1111getOffsetForPosition3MmeM6k = num.intValue();
                    } else {
                        j5 = textFieldSelectionManager2.dragBeginPosition;
                        m1111getOffsetForPosition3MmeM6k = layoutResult.m1111getOffsetForPosition3MmeM6k(j5, false);
                    }
                    int i = m1111getOffsetForPosition3MmeM6k;
                    Offset m1221getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1221getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m1221getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i, layoutResult.m1111getOffsetForPosition3MmeM6k(m1221getCurrentDragPosition_m7T9E.m3028unboximpl(), false), false, SelectionAdjustment.Companion.getWord());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null) {
                    return;
                }
                state$foundation_release2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1218setCurrentDragPosition_kEHs6E(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1139onExtendk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5082getStartimpl(textFieldSelectionManager.getValue$foundation_release().m5325getSelectiond9O1mEE())), TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1140onExtendDragk4lQ0M(long j) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                if ((TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5082getStartimpl(textFieldSelectionManager.getValue$foundation_release().m5325getSelectiond9O1mEE())), layoutResult.m1111getOffsetForPosition3MmeM6k(j, false), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo1141onStart3MmeM6k(long j, SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                long j2;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null));
                j2 = textFieldSelectionManager.dragBeginPosition;
                int m1109getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null);
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), m1109getOffsetForPosition3MmeM6k$default, m1109getOffsetForPosition3MmeM6k$default, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1138onDrag3MmeM6k(long j, SelectionAdjustment adjustment) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                Integer num;
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                if ((TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int m1111getOffsetForPosition3MmeM6k = layoutResult.m1111getOffsetForPosition3MmeM6k(j, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                num = textFieldSelectionManager.dragBeginOffsetInText;
                Intrinsics.checkNotNull(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), m1111getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
        this.value$delegate.setValue(textFieldValue);
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        Intrinsics.checkNotNullParameter(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
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
    public final void m1218setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m1221getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1077onDownk4lQ0M(long j) {
                TextFieldSelectionManager.this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1223getHandlePositiontuRUvjQ$foundation_release(z))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1218setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1079onStartk4lQ0M(long j) {
                long j2;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1223getHandlePositiontuRUvjQ$foundation_release(z));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(j2));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null) {
                    return;
                }
                state$foundation_release.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1078onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j3;
                long j4;
                int originalToTransformed;
                int m5054getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3023plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    boolean z2 = z;
                    j3 = textFieldSelectionManager2.dragBeginPosition;
                    j4 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(Offset.m3023plusMKHz9U(j3, j4)));
                    if (z2) {
                        Offset m1221getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1221getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m1221getCurrentDragPosition_m7T9E);
                        originalToTransformed = value.m5054getOffsetForPositionk4lQ0M(m1221getCurrentDragPosition_m7T9E.m3028unboximpl());
                    } else {
                        originalToTransformed = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5082getStartimpl(textFieldSelectionManager2.getValue$foundation_release().m5325getSelectiond9O1mEE()));
                    }
                    int i = originalToTransformed;
                    if (z2) {
                        m5054getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5077getEndimpl(textFieldSelectionManager2.getValue$foundation_release().m5325getSelectiond9O1mEE()));
                    } else {
                        Offset m1221getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1221getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m1221getCurrentDragPosition_m7T9E2);
                        m5054getOffsetForPositionk4lQ0M = value.m5054getOffsetForPositionk4lQ0M(m1221getCurrentDragPosition_m7T9E2.m3028unboximpl());
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i, m5054getOffsetForPositionk4lQ0M, z2, SelectionAdjustment.Companion.getCharacter());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 == null) {
                    return;
                }
                state$foundation_release2.setShowFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1218setCurrentDragPosition_kEHs6E(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if ((textToolbar != null ? textToolbar.getStatus() : null) == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1077onDownk4lQ0M(long j) {
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1223getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1218setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1079onStartk4lQ0M(long j) {
                long j2;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1170getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1223getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(j2));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3034getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1078onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j3;
                long j4;
                TextFieldValue m1216createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3023plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager2.dragBeginPosition;
                j4 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m1218setCurrentDragPosition_kEHs6E(Offset.m3007boximpl(Offset.m3023plusMKHz9U(j3, j4)));
                OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                Offset m1221getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1221getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(m1221getCurrentDragPosition_m7T9E);
                int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(value.m5054getOffsetForPositionk4lQ0M(m1221getCurrentDragPosition_m7T9E.m3028unboximpl()));
                long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (TextRange.m5075equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m5325getSelectiond9O1mEE())) {
                    return;
                }
                HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                if (hapticFeedBack != null) {
                    hapticFeedBack.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
                }
                Function1<TextFieldValue, Unit> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                m1216createTextFieldValueFDrldGo = textFieldSelectionManager2.m1216createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                onValueChange$foundation_release.invoke(m1216createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1218setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z = true;
        }
        if (z && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m1217deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1220deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m1220deselect_kEHs6E$foundation_release(Offset offset) {
        HandleState handleState;
        int m5079getMaximpl;
        if (!TextRange.m5076getCollapsedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
            if (offset != null && layoutResult != null) {
                m5079getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, offset.m3028unboximpl(), false, 2, null));
            } else {
                m5079getMaximpl = TextRange.m5079getMaximpl(getValue$foundation_release().m5325getSelectiond9O1mEE());
            }
            this.onValueChange.invoke(TextFieldValue.m5320copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m5079getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (offset != null) {
            if (getValue$foundation_release().getText().length() > 0) {
                handleState = HandleState.Cursor;
                setHandleState(handleState);
                hideSelectionToolbar$foundation_release();
            }
        }
        handleState = HandleState.None;
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean z) {
        if (TextRange.m5076getCollapsedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (z) {
            int m5079getMaximpl = TextRange.m5079getMaximpl(getValue$foundation_release().m5325getSelectiond9O1mEE());
            this.onValueChange.invoke(m1216createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m5079getMaximpl, m5079getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m5080getMinimpl = TextRange.m5080getMinimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()) + text.length();
        this.onValueChange.invoke(m1216createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m5080getMinimpl, m5080getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m5076getCollapsedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m5080getMinimpl = TextRange.m5080getMinimpl(getValue$foundation_release().m5325getSelectiond9O1mEE());
        this.onValueChange.invoke(m1216createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m5080getMinimpl, m5080getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m1216createTextFieldValueFDrldGo = m1216createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1216createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m5320copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1216createTextFieldValueFDrldGo.m5325getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState == null) {
            return;
        }
        textFieldState.setShowFloatingToolbar(true);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m1223getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        long m5325getSelectiond9O1mEE = getValue$foundation_release().m5325getSelectiond9O1mEE();
        int m5082getStartimpl = z ? TextRange.m5082getStartimpl(m5325getSelectiond9O1mEE) : TextRange.m5077getEndimpl(m5325getSelectiond9O1mEE);
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult.getValue(), this.offsetMapping.originalToTransformed(m5082getStartimpl), z, TextRange.m5081getReversedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()));
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m1222getCursorPositiontuRUvjQ$foundation_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5082getStartimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo588toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showSelectionToolbar$foundation_release() {
        TextFieldSelectionManager$showSelectionToolbar$paste$1 textFieldSelectionManager$showSelectionToolbar$paste$1;
        TextToolbar textToolbar;
        boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
        TextFieldSelectionManager$showSelectionToolbar$copy$1 textFieldSelectionManager$showSelectionToolbar$copy$1 = (TextRange.m5076getCollapsedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()) || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$1 = (TextRange.m5076getCollapsedimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()) || !getEditable() || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        if (getEditable()) {
            ClipboardManager clipboardManager = this.clipboardManager;
            boolean z2 = false;
            if (clipboardManager != null && clipboardManager.hasText()) {
                z2 = true;
            }
            if (z2) {
                textFieldSelectionManager$showSelectionToolbar$paste$1 = new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
                TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$1 = TextRange.m5078getLengthimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()) != getValue$foundation_release().getText().length() ? new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this) : null;
                textToolbar = this.textToolbar;
                if (textToolbar == null) {
                    textToolbar.showMenu(getContentRect(), textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$1);
                    return;
                }
                return;
            }
        }
        textFieldSelectionManager$showSelectionToolbar$paste$1 = null;
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$12 = TextRange.m5078getLengthimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()) != getValue$foundation_release().getText().length() ? new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this) : null;
        textToolbar = this.textToolbar;
        if (textToolbar == null) {
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m1219contextMenuOpenAdjustmentk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            return;
        }
        int m1109getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m1109getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null);
        if (TextRange.m5073containsimpl(getValue$foundation_release().m5325getSelectiond9O1mEE(), m1109getOffsetForPosition3MmeM6k$default)) {
            return;
        }
        updateSelection(getValue$foundation_release(), m1109getOffsetForPosition3MmeM6k$default, m1109getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float f;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5082getStartimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m5077getEndimpl(getValue$foundation_release().m5325getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.state;
                long m3034getZeroF1C5BW0 = (textFieldState2 == null || (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m3034getZeroF1C5BW0() : layoutCoordinates4.mo4554localToRootMKHz9U(m1223getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState textFieldState3 = this.state;
                long m3034getZeroF1C5BW02 = (textFieldState3 == null || (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m3034getZeroF1C5BW0() : layoutCoordinates3.mo4554localToRootMKHz9U(m1223getHandlePositiontuRUvjQ$foundation_release(false));
                TextFieldState textFieldState4 = this.state;
                float f2 = 0.0f;
                if (textFieldState4 == null || (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) == null) {
                    f = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    f = Offset.m3019getYimpl(layoutCoordinates2.mo4554localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    f2 = Offset.m3019getYimpl(layoutCoordinates.mo4554localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m3018getXimpl(m3034getZeroF1C5BW0), Offset.m3018getXimpl(m3034getZeroF1C5BW02)), Math.min(f, f2), Math.max(Offset.m3018getXimpl(m3034getZeroF1C5BW0), Offset.m3018getXimpl(m3034getZeroF1C5BW02)), Math.max(Offset.m3019getYimpl(m3034getZeroF1C5BW0), Offset.m3019getYimpl(m3034getZeroF1C5BW02)) + (Dp.m5607constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue textFieldValue, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m5082getStartimpl(textFieldValue.m5325getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m5077getEndimpl(textFieldValue.m5325getSelectiond9O1mEE())));
        TextFieldState textFieldState = this.state;
        long m1213getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m1213getTextFieldSelectionbb3KNj8((textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) ? null : layoutResult.getValue(), i, i2, TextRange.m5076getCollapsedimpl(TextRange) ? null : TextRange.m5070boximpl(TextRange), z, selectionAdjustment);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m5082getStartimpl(m1213getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m5077getEndimpl(m1213getTextFieldSelectionbb3KNj8)));
        if (TextRange.m5075equalsimpl0(TextRange2, textFieldValue.m5325getSelectiond9O1mEE())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo3951performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3960getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1216createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo  reason: not valid java name */
    public final TextFieldValue m1216createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
