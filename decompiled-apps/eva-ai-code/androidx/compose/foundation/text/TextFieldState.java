package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jo\u0010c\u001a\u0002092\u0006\u0010]\u001a\u00020^2\u0006\u0010d\u001a\u00020^2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u000209072\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020qø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sR+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0.X\u0082\u0004¢\u0006\u0002\n\u0000R4\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020/8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020907ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020907¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020907X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR+\u0010J\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u000f\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010\u0015R\u001a\u0010N\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0013\"\u0004\bP\u0010\u0015R+\u0010Q\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010\u000f\u001a\u0004\bR\u0010\u0013\"\u0004\bS\u0010\u0015R+\u0010U\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u000f\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;)V", "<set-?>", "Landroidx/compose/foundation/text/HandleState;", "handleState", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState$delegate", "Landroidx/compose/runtime/MutableState;", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "isLayoutResultStale", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "value", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResult", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResultState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField$delegate", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "getOnImeActionPerformed", "()Lkotlin/jvm/functions/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/TextFieldValue;", "getOnValueChange", "onValueChangeOriginal", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "showFloatingToolbar", "getShowFloatingToolbar", "setShowFloatingToolbar", "showSelectionHandleEnd", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd$delegate", "showSelectionHandleStart", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart$delegate", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "untransformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "update", "visualText", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "selectionBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldState {
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private TextInputSession inputSession;
    private boolean isLayoutResultStale;
    private final KeyboardActionRunner keyboardActionRunner;
    private LayoutCoordinates layoutCoordinates;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final Function1<ImeAction, Unit> onImeActionPerformed;
    private final Function1<TextFieldValue, Unit> onValueChange;
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal;
    private final EditProcessor processor;
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;
    private final MutableState showCursorHandle$delegate;
    private boolean showFloatingToolbar;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<TextLayoutResultProxy> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5605boximpl(Dp.m5607constructorimpl(0)), null, 2, null);
        this.minHeightForSingleLineField$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layoutResultState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.handleState$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showSelectionHandleStart$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showSelectionHandleEnd$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default7;
        this.isLayoutResultStale = true;
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new TextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new TextFieldState$onImeActionPerformed$1(this);
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM  reason: not valid java name */
    public final float m1103getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m5621unboximpl();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4  reason: not valid java name */
    public final void m1104setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m5605boximpl(f));
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final void setHandleState(HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.handleState$delegate.setValue(handleState);
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar = z;
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* renamed from: update-fnh65Uc  reason: not valid java name */
    public final void m1105updatefnh65Uc(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver fontFamilyResolver, Function1<? super TextFieldValue, Unit> onValueChange, KeyboardActions keyboardActions, FocusManager focusManager, long j) {
        TextDelegate m1075updateTextDelegaterm0N8CA;
        Intrinsics.checkNotNullParameter(untransformedText, "untransformedText");
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo3139setColor8_81llA(j);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        keyboardActionRunner.setInputSession(this.inputSession);
        this.untransformedText = untransformedText;
        m1075updateTextDelegaterm0N8CA = TextDelegateKt.m1075updateTextDelegaterm0N8CA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (r23 & 32) != 0 ? true : z, (r23 & 64) != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : 0, (r23 & 128) != 0 ? Integer.MAX_VALUE : 0, (r23 & 256) != 0 ? 1 : 0, CollectionsKt.emptyList());
        if (this.textDelegate != m1075updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m1075updateTextDelegaterm0N8CA;
    }
}
