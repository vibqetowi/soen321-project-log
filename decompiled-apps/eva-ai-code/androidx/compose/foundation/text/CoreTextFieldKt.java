package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010#\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010-\u001a \u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00101\u001a\u000202H\u0002\u001a0\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00101\u001a\u000202H\u0002\u001a\u0010\u00106\u001a\u00020\u00012\u0006\u0010/\u001a\u000200H\u0002\u001a \u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0013H\u0002\u001a5\u0010;\u001a\u00020\u0001*\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\r2\u0006\u00101\u001a\u000202H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010@\u001a\u001c\u0010A\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", FirebaseAnalytics.Param.CONTENT, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyFocusedRect", "state", "Landroidx/compose/foundation/text/TextFieldState;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "notifyTextInputServiceOnFocusChange", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "onBlur", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    public static final /* synthetic */ void access$onBlur(TextFieldState textFieldState) {
        onBlur(textFieldState);
    }

    /* JADX WARN: Removed duplicated region for block: B:352:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x073d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:631:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(TextFieldValue value, Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function1, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        SolidColor solidColor;
        ImeOptions imeOptions2;
        boolean z4;
        Modifier modifier3;
        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function32;
        boolean z5;
        int i20;
        Brush brush2;
        KeyboardActions keyboardActions2;
        boolean z6;
        TextStyle textStyle2;
        VisualTransformation visualTransformation2;
        Function1<? super TextLayoutResult, Unit> function12;
        MutableInteractionSource mutableInteractionSource2;
        int i21;
        int i22;
        Object rememberedValue;
        Orientation orientation;
        boolean changed;
        CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 rememberedValue2;
        boolean changed2;
        TransformedText rememberedValue3;
        TransformedText filterWithValidation;
        TextRange m5324getCompositionMzsxiRA;
        MutableInteractionSource mutableInteractionSource3;
        Object rememberedValue4;
        TextFieldState textFieldState;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        Object rememberedValue8;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        FocusManager focusManager;
        boolean z7;
        Modifier pointerHoverIcon$default;
        boolean z8;
        Modifier.Companion companion;
        Composer composer2;
        TextStyle textStyle3;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function13;
        Brush brush3;
        boolean z9;
        int i23;
        KeyboardActions keyboardActions3;
        ImeOptions imeOptions3;
        MutableInteractionSource mutableInteractionSource5;
        boolean z10;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier5;
        boolean z11;
        int i24;
        ScopeUpdateScope endRestartGroup;
        int i25;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-958708118);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)202@11283L29,206@11481L7,207@11520L7,208@11581L7,209@11649L7,210@11714L7,218@12023L42,215@11930L135,221@12106L268,233@12679L21,234@12717L324,262@13440L26,265@13526L51,271@13829L7,272@13880L7,273@13937L7,277@14048L24,278@14106L37,545@24922L86,549@25014L515,597@26765L4554:CoreTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i26 = i5 & 4;
        if (i26 != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 57344) == 0) {
                    i6 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & 458752) == 0) {
                    i6 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i6 |= startRestartGroup.changed(brush) ? 8388608 : 4194304;
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i6 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                    i6 |= C.ENCODING_PCM_32BIT;
                } else if ((i3 & 1879048192) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                    i15 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                } else {
                    i15 = i4;
                }
                if ((i4 & 112) == 0) {
                    if ((i5 & 2048) == 0 && startRestartGroup.changed(imeOptions)) {
                        i25 = 32;
                        i15 |= i25;
                    }
                    i25 = 16;
                    i15 |= i25;
                }
                int i27 = i15;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i27 |= 384;
                } else if ((i4 & 896) == 0) {
                    i27 |= startRestartGroup.changed(keyboardActions) ? 256 : 128;
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i27 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i4 & 7168) == 0) {
                        i27 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                            i27 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i27 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                            i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i27 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i27) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion2 = i26 != 0 ? Modifier.Companion : modifier;
                                TextStyle textStyle4 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                                VisualTransformation none = i8 != 0 ? VisualTransformation.Companion.getNone() : visualTransformation;
                                CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = i9 != 0 ? CoreTextFieldKt$CoreTextField$1.INSTANCE : function1;
                                MutableInteractionSource mutableInteractionSource6 = i10 != 0 ? null : mutableInteractionSource;
                                if (i11 != 0) {
                                    modifier2 = companion2;
                                    solidColor = new SolidColor(Color.Companion.m3327getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = companion2;
                                    solidColor = brush;
                                }
                                boolean z12 = i12 != 0 ? true : z;
                                int i28 = i13 != 0 ? Integer.MAX_VALUE : i;
                                int i29 = i14 != 0 ? 1 : i2;
                                if ((i5 & 2048) != 0) {
                                    imeOptions2 = ImeOptions.Companion.getDefault();
                                    i27 &= -113;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                KeyboardActions keyboardActions4 = i16 != 0 ? KeyboardActions.Companion.getDefault() : keyboardActions;
                                z4 = i17 != 0 ? true : z2;
                                boolean z13 = i18 != 0 ? false : z3;
                                if (i19 != 0) {
                                    modifier3 = modifier2;
                                    z5 = z12;
                                    i20 = i29;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z13;
                                    textStyle2 = textStyle4;
                                    function32 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m1030getLambda1$foundation_release();
                                } else {
                                    modifier3 = modifier2;
                                    function32 = function3;
                                    z5 = z12;
                                    i20 = i29;
                                    brush2 = solidColor;
                                    keyboardActions2 = keyboardActions4;
                                    z6 = z13;
                                    textStyle2 = textStyle4;
                                }
                                visualTransformation2 = none;
                                function12 = coreTextFieldKt$CoreTextField$1;
                                mutableInteractionSource2 = mutableInteractionSource6;
                                i21 = i28;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 2048) != 0) {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    z5 = z;
                                    i21 = i;
                                    i20 = i2;
                                    imeOptions2 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z4 = z2;
                                    z6 = z3;
                                    function32 = function3;
                                    i22 = i27 & (-113);
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-958708118, i6, i22, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:183)");
                                    }
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    FocusRequester focusRequester = (FocusRequester) rememberedValue;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextInputService textInputService = (TextInputService) consume;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density = (Density) consume2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FontFamily.Resolver resolver = (FontFamily.Resolver) consume3;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume4 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m1228getBackgroundColor0d7_KjU = ((TextSelectionColors) consume4).m1228getBackgroundColor0d7_KjU();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FocusManager focusManager2 = (FocusManager) consume5;
                                    orientation = !(i21 != 1 && !z5 && imeOptions2.getSingleLine()) ? Orientation.Horizontal : Orientation.Vertical;
                                    Modifier modifier6 = modifier3;
                                    Object[] objArr = {orientation};
                                    Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.Companion.getSaver();
                                    int i30 = i21;
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(orientation);
                                    int i31 = i22;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
                                    startRestartGroup.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                        filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                                        m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        if (m5324getCompositionMzsxiRA != null || (rememberedValue3 = TextFieldDelegate.Companion.m1083applyCompositionDecoration72CqOWE(m5324getCompositionMzsxiRA.m5086unboximpl(), filterWithValidation)) == null) {
                                            rememberedValue3 = filterWithValidation;
                                        }
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TransformedText transformedText = (TransformedText) rememberedValue3;
                                    AnnotatedString text = transformedText.getText();
                                    OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                                    RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                        rememberedValue4 = new TextFieldState(new TextDelegate(text, textStyle2, 0, 0, z5, 0, density, resolver, null, 300, null), currentRecomposeScope);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    textFieldState = (TextFieldState) rememberedValue4;
                                    textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text, textStyle2, z5, density, resolver, onValueChange, keyboardActions2, focusManager2, m1228getBackgroundColor0d7_KjU);
                                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                                        rememberedValue5 = new UndoManager(0, 1, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    UndoManager undoManager = (UndoManager) rememberedValue5;
                                    UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.Companion.getEmpty()) {
                                        rememberedValue6 = new TextFieldSelectionManager(undoManager);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) rememberedValue6;
                                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                                    textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                                    textFieldSelectionManager.setState$foundation_release(textFieldState);
                                    textFieldSelectionManager.setValue$foundation_release(value);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) consume6);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setTextToolbar((TextToolbar) consume7);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) consume8);
                                    textFieldSelectionManager.setFocusRequester(focusRequester);
                                    textFieldSelectionManager.setEditable(!z6);
                                    startRestartGroup.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.Companion.getEmpty()) {
                                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue7 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == Composer.Companion.getEmpty()) {
                                        rememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue8;
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester, mutableInteractionSource7, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService, value, imeOptions2, offsetMapping, textFieldSelectionManager, coroutineScope, bringIntoViewRequester));
                                    startRestartGroup.startReplaceableGroup(-55008291);
                                    ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
                                    if (z4 && !z6) {
                                        EffectsKt.DisposableEffect(textFieldState, new CoreTextFieldKt$CoreTextField$2(textFieldState), startRestartGroup, 8);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    if (!TouchMode_androidKt.isInTouchMode()) {
                                        focusManager = focusManager2;
                                        modifier4 = textFieldFocusModifier;
                                        mutableInteractionSource4 = mutableInteractionSource7;
                                        z7 = false;
                                        pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(Modifier.Companion, mutableInteractionSource7, z4, new CoreTextFieldKt$CoreTextField$pointerModifier$1(textFieldState, focusRequester, z6, textFieldSelectionManager, offsetMapping)).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(Modifier.Companion, textFieldSelectionManager.getTouchSelectionObserver$foundation_release(), z4)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                    } else {
                                        modifier4 = textFieldFocusModifier;
                                        mutableInteractionSource4 = mutableInteractionSource7;
                                        focusManager = focusManager2;
                                        z7 = false;
                                        pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(Modifier.Companion, textFieldSelectionManager.getMouseSelectionObserver$foundation_release(), z4), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                    }
                                    Modifier drawBehind = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping));
                                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager, value, offsetMapping));
                                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping, textFieldSelectionManager, focusRequester));
                                    Modifier cursor = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping, brush2, (z4 || z6) ? z7 : true);
                                    EffectsKt.DisposableEffect(textFieldSelectionManager, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager), startRestartGroup, 8);
                                    EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService, textFieldState, value, imeOptions2), startRestartGroup, (i31 >> 3) & 14);
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource4;
                                    Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier6.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager, value, textFieldState.getOnValueChange(), !z6, i30 != 1 ? true : z7, offsetMapping, undoManager, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition, mutableInteractionSource8, z4).then(pointerHoverIcon$default).then(semantics), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
                                    z8 = (!z4 && textFieldState.getHasFocus() && TouchMode_androidKt.isInTouchMode()) ? true : z7;
                                    if (!z8) {
                                        companion = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.Companion, textFieldSelectionManager);
                                    } else {
                                        companion = Modifier.Companion;
                                    }
                                    boolean z14 = z4;
                                    ImeOptions imeOptions4 = imeOptions2;
                                    VisualTransformation visualTransformation4 = visualTransformation2;
                                    composer2 = startRestartGroup;
                                    CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i31, textFieldState, textStyle2, i20, i30, textFieldScrollerPosition, value, visualTransformation2, cursor, drawBehind, onGloballyPositioned, companion, bringIntoViewRequester, textFieldSelectionManager, z8, z6, function12, offsetMapping, density)), composer2, 448);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textStyle3 = textStyle2;
                                    visualTransformation3 = visualTransformation4;
                                    function13 = function12;
                                    brush3 = brush2;
                                    z9 = z5;
                                    i23 = i20;
                                    keyboardActions3 = keyboardActions2;
                                    imeOptions3 = imeOptions4;
                                    mutableInteractionSource5 = mutableInteractionSource8;
                                    z10 = z6;
                                    function33 = function32;
                                    modifier5 = modifier6;
                                    z11 = z14;
                                    i24 = i30;
                                } else {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    z5 = z;
                                    i21 = i;
                                    i20 = i2;
                                    imeOptions2 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z4 = z2;
                                    z6 = z3;
                                    function32 = function3;
                                }
                            }
                            i22 = i27;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TextInputService textInputService2 = (TextInputService) consume9;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density2 = (Density) consume22;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume32;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume42 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long m1228getBackgroundColor0d7_KjU2 = ((TextSelectionColors) consume42).m1228getBackgroundColor0d7_KjU();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FocusManager focusManager22 = (FocusManager) consume52;
                            if (!(i21 != 1 && !z5 && imeOptions2.getSingleLine())) {
                            }
                            Modifier modifier62 = modifier3;
                            Object[] objArr2 = {orientation};
                            Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.Companion.getSaver();
                            int i302 = i21;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(orientation);
                            int i312 = i22;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr2, saver2, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                            m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
                            mutableInteractionSource3 = mutableInteractionSource2;
                            if (m5324getCompositionMzsxiRA != null) {
                            }
                            rememberedValue3 = filterWithValidation;
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceableGroup();
                            TransformedText transformedText2 = (TransformedText) rememberedValue3;
                            AnnotatedString text2 = transformedText2.getText();
                            OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                            RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            textFieldState = (TextFieldState) rememberedValue4;
                            textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text2, textStyle2, z5, density2, resolver2, onValueChange, keyboardActions2, focusManager22, m1228getBackgroundColor0d7_KjU2);
                            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            UndoManager undoManager2 = (UndoManager) rememberedValue5;
                            UndoManager.snapshotIfNeeded$default(undoManager2, value, 0L, 2, null);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue6;
                            textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                            textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager2.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager2.setState$foundation_release(textFieldState);
                            textFieldSelectionManager2.setValue$foundation_release(value);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume62 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) consume62);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume72 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setTextToolbar((TextToolbar) consume72);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume82 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) consume82);
                            textFieldSelectionManager2.setFocusRequester(focusRequester2);
                            textFieldSelectionManager2.setEditable(!z6);
                            startRestartGroup.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.Companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue8;
                            MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                            Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester2, mutableInteractionSource72, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService2, value, imeOptions2, offsetMapping2, textFieldSelectionManager2, coroutineScope2, bringIntoViewRequester2));
                            startRestartGroup.startReplaceableGroup(-55008291);
                            ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
                            if (z4) {
                                EffectsKt.DisposableEffect(textFieldState, new CoreTextFieldKt$CoreTextField$2(textFieldState), startRestartGroup, 8);
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (!TouchMode_androidKt.isInTouchMode()) {
                            }
                            Modifier drawBehind2 = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping2));
                            Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager2, value, offsetMapping2));
                            Modifier semantics2 = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText2, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping2, textFieldSelectionManager2, focusRequester2));
                            Modifier cursor2 = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping2, brush2, (z4 || z6) ? z7 : true);
                            EffectsKt.DisposableEffect(textFieldSelectionManager2, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager2), startRestartGroup, 8);
                            EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService2, textFieldState, value, imeOptions2), startRestartGroup, (i312 >> 3) & 14);
                            MutableInteractionSource mutableInteractionSource82 = mutableInteractionSource4;
                            Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier62.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager2).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager2, value, textFieldState.getOnValueChange(), !z6, i302 != 1 ? true : z7, offsetMapping2, undoManager2, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition2, mutableInteractionSource82, z4).then(pointerHoverIcon$default).then(semantics2), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
                            if (!z4) {
                            }
                            if (!z8) {
                            }
                            boolean z142 = z4;
                            ImeOptions imeOptions42 = imeOptions2;
                            VisualTransformation visualTransformation42 = visualTransformation2;
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager2, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i312, textFieldState, textStyle2, i20, i302, textFieldScrollerPosition2, value, visualTransformation2, cursor2, drawBehind2, onGloballyPositioned3, companion, bringIntoViewRequester2, textFieldSelectionManager2, z8, z6, function12, offsetMapping2, density2)), composer2, 448);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textStyle3 = textStyle2;
                            visualTransformation3 = visualTransformation42;
                            function13 = function12;
                            brush3 = brush2;
                            z9 = z5;
                            i23 = i20;
                            keyboardActions3 = keyboardActions2;
                            imeOptions3 = imeOptions42;
                            mutableInteractionSource5 = mutableInteractionSource82;
                            z10 = z6;
                            function33 = function32;
                            modifier5 = modifier62;
                            z11 = z142;
                            i24 = i302;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier5 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function13 = function1;
                            mutableInteractionSource5 = mutableInteractionSource;
                            brush3 = brush;
                            z9 = z;
                            i23 = i2;
                            imeOptions3 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z11 = z2;
                            z10 = z3;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i24 = i;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextField$6(value, onValueChange, modifier5, textStyle3, visualTransformation3, function13, mutableInteractionSource5, brush3, z9, i24, i23, imeOptions3, keyboardActions3, z11, z10, function33, i3, i4, i5));
                        return;
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    visualTransformation2 = none;
                    function12 = coreTextFieldKt$CoreTextField$1;
                    mutableInteractionSource2 = mutableInteractionSource6;
                    i21 = i28;
                    i22 = i27;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    FocusRequester focusRequester22 = (FocusRequester) rememberedValue;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume92 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TextInputService textInputService22 = (TextInputService) consume92;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density22 = (Density) consume222;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FontFamily.Resolver resolver22 = (FontFamily.Resolver) consume322;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume422 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long m1228getBackgroundColor0d7_KjU22 = ((TextSelectionColors) consume422).m1228getBackgroundColor0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume522 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager222 = (FocusManager) consume522;
                    if (!(i21 != 1 && !z5 && imeOptions2.getSingleLine())) {
                    }
                    Modifier modifier622 = modifier3;
                    Object[] objArr22 = {orientation};
                    Saver<TextFieldScrollerPosition, Object> saver22 = TextFieldScrollerPosition.Companion.getSaver();
                    int i3022 = i21;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(orientation);
                    int i3122 = i22;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    TextFieldScrollerPosition textFieldScrollerPosition22 = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr22, saver22, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                    m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
                    mutableInteractionSource3 = mutableInteractionSource2;
                    if (m5324getCompositionMzsxiRA != null) {
                    }
                    rememberedValue3 = filterWithValidation;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    TransformedText transformedText22 = (TransformedText) rememberedValue3;
                    AnnotatedString text22 = transformedText22.getText();
                    OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                    RecomposeScope currentRecomposeScope22 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    textFieldState = (TextFieldState) rememberedValue4;
                    textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text22, textStyle2, z5, density22, resolver22, onValueChange, keyboardActions2, focusManager222, m1228getBackgroundColor0d7_KjU22);
                    textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    UndoManager undoManager22 = (UndoManager) rememberedValue5;
                    UndoManager.snapshotIfNeeded$default(undoManager22, value, 0L, 2, null);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) rememberedValue6;
                    textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                    textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager22.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                    textFieldSelectionManager22.setState$foundation_release(textFieldState);
                    textFieldSelectionManager22.setValue$foundation_release(value);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume622 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) consume622);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume722 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager22.setTextToolbar((TextToolbar) consume722);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume822 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) consume822);
                    textFieldSelectionManager22.setFocusRequester(focusRequester22);
                    textFieldSelectionManager22.setEditable(!z6);
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue8;
                    MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource3;
                    Modifier textFieldFocusModifier22 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester22, mutableInteractionSource722, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService22, value, imeOptions2, offsetMapping22, textFieldSelectionManager22, coroutineScope22, bringIntoViewRequester22));
                    startRestartGroup.startReplaceableGroup(-55008291);
                    ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
                    if (z4) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!TouchMode_androidKt.isInTouchMode()) {
                    }
                    Modifier drawBehind22 = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping22));
                    Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager22, value, offsetMapping22));
                    Modifier semantics22 = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText22, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping22, textFieldSelectionManager22, focusRequester22));
                    Modifier cursor22 = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping22, brush2, (z4 || z6) ? z7 : true);
                    EffectsKt.DisposableEffect(textFieldSelectionManager22, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager22), startRestartGroup, 8);
                    EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService22, textFieldState, value, imeOptions2), startRestartGroup, (i3122 >> 3) & 14);
                    MutableInteractionSource mutableInteractionSource822 = mutableInteractionSource4;
                    Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier622.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager22).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager22, value, textFieldState.getOnValueChange(), !z6, i3022 != 1 ? true : z7, offsetMapping22, undoManager22, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition22, mutableInteractionSource822, z4).then(pointerHoverIcon$default).then(semantics22), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
                    if (!z4) {
                    }
                    if (!z8) {
                    }
                    boolean z1422 = z4;
                    ImeOptions imeOptions422 = imeOptions2;
                    VisualTransformation visualTransformation422 = visualTransformation2;
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager22, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i3122, textFieldState, textStyle2, i20, i3022, textFieldScrollerPosition22, value, visualTransformation2, cursor22, drawBehind22, onGloballyPositioned32, companion, bringIntoViewRequester22, textFieldSelectionManager22, z8, z6, function12, offsetMapping22, density22)), composer2, 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    visualTransformation3 = visualTransformation422;
                    function13 = function12;
                    brush3 = brush2;
                    z9 = z5;
                    i23 = i20;
                    keyboardActions3 = keyboardActions2;
                    imeOptions3 = imeOptions422;
                    mutableInteractionSource5 = mutableInteractionSource822;
                    z10 = z6;
                    function33 = function32;
                    modifier5 = modifier622;
                    z11 = z1422;
                    i24 = i3022;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                visualTransformation2 = none;
                function12 = coreTextFieldKt$CoreTextField$1;
                mutableInteractionSource2 = mutableInteractionSource6;
                i21 = i28;
                i22 = i27;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                FocusRequester focusRequester222 = (FocusRequester) rememberedValue;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume922 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextInputService textInputService222 = (TextInputService) consume922;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density222 = (Density) consume2222;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume3222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FontFamily.Resolver resolver222 = (FontFamily.Resolver) consume3222;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4222 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long m1228getBackgroundColor0d7_KjU222 = ((TextSelectionColors) consume4222).m1228getBackgroundColor0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume5222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FocusManager focusManager2222 = (FocusManager) consume5222;
                if (!(i21 != 1 && !z5 && imeOptions2.getSingleLine())) {
                }
                Modifier modifier6222 = modifier3;
                Object[] objArr222 = {orientation};
                Saver<TextFieldScrollerPosition, Object> saver222 = TextFieldScrollerPosition.Companion.getSaver();
                int i30222 = i21;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(orientation);
                int i31222 = i22;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                TextFieldScrollerPosition textFieldScrollerPosition222 = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr222, saver222, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
                m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
                mutableInteractionSource3 = mutableInteractionSource2;
                if (m5324getCompositionMzsxiRA != null) {
                }
                rememberedValue3 = filterWithValidation;
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                TransformedText transformedText222 = (TransformedText) rememberedValue3;
                AnnotatedString text222 = transformedText222.getText();
                OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
                RecomposeScope currentRecomposeScope222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                textFieldState = (TextFieldState) rememberedValue4;
                textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text222, textStyle2, z5, density222, resolver222, onValueChange, keyboardActions2, focusManager2222, m1228getBackgroundColor0d7_KjU222);
                textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                UndoManager undoManager222 = (UndoManager) rememberedValue5;
                UndoManager.snapshotIfNeeded$default(undoManager222, value, 0L, 2, null);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) rememberedValue6;
                textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
                textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager222.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                textFieldSelectionManager222.setState$foundation_release(textFieldState);
                textFieldSelectionManager222.setValue$foundation_release(value);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume6222 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) consume6222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume7222 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager222.setTextToolbar((TextToolbar) consume7222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume8222 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) consume8222);
                textFieldSelectionManager222.setFocusRequester(focusRequester222);
                textFieldSelectionManager222.setEditable(!z6);
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.Companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue8;
                MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource3;
                Modifier textFieldFocusModifier222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester222, mutableInteractionSource7222, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService222, value, imeOptions2, offsetMapping222, textFieldSelectionManager222, coroutineScope222, bringIntoViewRequester222));
                startRestartGroup.startReplaceableGroup(-55008291);
                ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
                if (z4) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!TouchMode_androidKt.isInTouchMode()) {
                }
                Modifier drawBehind222 = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping222));
                Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager222, value, offsetMapping222));
                Modifier semantics222 = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText222, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping222, textFieldSelectionManager222, focusRequester222));
                Modifier cursor222 = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping222, brush2, (z4 || z6) ? z7 : true);
                EffectsKt.DisposableEffect(textFieldSelectionManager222, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager222), startRestartGroup, 8);
                EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService222, textFieldState, value, imeOptions2), startRestartGroup, (i31222 >> 3) & 14);
                MutableInteractionSource mutableInteractionSource8222 = mutableInteractionSource4;
                Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier6222.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager222).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager222, value, textFieldState.getOnValueChange(), !z6, i30222 != 1 ? true : z7, offsetMapping222, undoManager222, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition222, mutableInteractionSource8222, z4).then(pointerHoverIcon$default).then(semantics222), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
                if (!z4) {
                }
                if (!z8) {
                }
                boolean z14222 = z4;
                ImeOptions imeOptions4222 = imeOptions2;
                VisualTransformation visualTransformation4222 = visualTransformation2;
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager222, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i31222, textFieldState, textStyle2, i20, i30222, textFieldScrollerPosition222, value, visualTransformation2, cursor222, drawBehind222, onGloballyPositioned322, companion, bringIntoViewRequester222, textFieldSelectionManager222, z8, z6, function12, offsetMapping222, density222)), composer2, 448);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation4222;
                function13 = function12;
                brush3 = brush2;
                z9 = z5;
                i23 = i20;
                keyboardActions3 = keyboardActions2;
                imeOptions3 = imeOptions4222;
                mutableInteractionSource5 = mutableInteractionSource8222;
                z10 = z6;
                function33 = function32;
                modifier5 = modifier6222;
                z11 = z14222;
                i24 = i30222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 112) == 0) {
            }
            int i272 = i15;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            visualTransformation2 = none;
            function12 = coreTextFieldKt$CoreTextField$1;
            mutableInteractionSource2 = mutableInteractionSource6;
            i21 = i28;
            i22 = i272;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            FocusRequester focusRequester2222 = (FocusRequester) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume9222 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextInputService textInputService2222 = (TextInputService) consume9222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2222 = (Density) consume22222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume32222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FontFamily.Resolver resolver2222 = (FontFamily.Resolver) consume32222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42222 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long m1228getBackgroundColor0d7_KjU2222 = ((TextSelectionColors) consume42222).m1228getBackgroundColor0d7_KjU();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume52222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager22222 = (FocusManager) consume52222;
            if (!(i21 != 1 && !z5 && imeOptions2.getSingleLine())) {
            }
            Modifier modifier62222 = modifier3;
            Object[] objArr2222 = {orientation};
            Saver<TextFieldScrollerPosition, Object> saver2222 = TextFieldScrollerPosition.Companion.getSaver();
            int i302222 = i21;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(orientation);
            int i312222 = i22;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            TextFieldScrollerPosition textFieldScrollerPosition2222 = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr2222, saver2222, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
            m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
            mutableInteractionSource3 = mutableInteractionSource2;
            if (m5324getCompositionMzsxiRA != null) {
            }
            rememberedValue3 = filterWithValidation;
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            TransformedText transformedText2222 = (TransformedText) rememberedValue3;
            AnnotatedString text2222 = transformedText2222.getText();
            OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
            RecomposeScope currentRecomposeScope2222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            textFieldState = (TextFieldState) rememberedValue4;
            textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text2222, textStyle2, z5, density2222, resolver2222, onValueChange, keyboardActions2, focusManager22222, m1228getBackgroundColor0d7_KjU2222);
            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            UndoManager undoManager2222 = (UndoManager) rememberedValue5;
            UndoManager.snapshotIfNeeded$default(undoManager2222, value, 0L, 2, null);
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldSelectionManager textFieldSelectionManager2222 = (TextFieldSelectionManager) rememberedValue6;
            textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
            textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager2222.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
            textFieldSelectionManager2222.setState$foundation_release(textFieldState);
            textFieldSelectionManager2222.setValue$foundation_release(value);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume62222 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager2222.setClipboardManager$foundation_release((ClipboardManager) consume62222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume72222 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager2222.setTextToolbar((TextToolbar) consume72222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume82222 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager2222.setHapticFeedBack((HapticFeedback) consume82222);
            textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
            textFieldSelectionManager2222.setEditable(!z6);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue8;
            MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource3;
            Modifier textFieldFocusModifier2222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester2222, mutableInteractionSource72222, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService2222, value, imeOptions2, offsetMapping2222, textFieldSelectionManager2222, coroutineScope2222, bringIntoViewRequester2222));
            startRestartGroup.startReplaceableGroup(-55008291);
            ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
            if (z4) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!TouchMode_androidKt.isInTouchMode()) {
            }
            Modifier drawBehind2222 = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping2222));
            Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager2222, value, offsetMapping2222));
            Modifier semantics2222 = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText2222, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping2222, textFieldSelectionManager2222, focusRequester2222));
            Modifier cursor2222 = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping2222, brush2, (z4 || z6) ? z7 : true);
            EffectsKt.DisposableEffect(textFieldSelectionManager2222, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager2222), startRestartGroup, 8);
            EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService2222, textFieldState, value, imeOptions2), startRestartGroup, (i312222 >> 3) & 14);
            MutableInteractionSource mutableInteractionSource82222 = mutableInteractionSource4;
            Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier62222.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager2222).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager2222, value, textFieldState.getOnValueChange(), !z6, i302222 != 1 ? true : z7, offsetMapping2222, undoManager2222, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition2222, mutableInteractionSource82222, z4).then(pointerHoverIcon$default).then(semantics2222), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
            if (!z4) {
            }
            if (!z8) {
            }
            boolean z142222 = z4;
            ImeOptions imeOptions42222 = imeOptions2;
            VisualTransformation visualTransformation42222 = visualTransformation2;
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2222, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i312222, textFieldState, textStyle2, i20, i302222, textFieldScrollerPosition2222, value, visualTransformation2, cursor2222, drawBehind2222, onGloballyPositioned3222, companion, bringIntoViewRequester2222, textFieldSelectionManager2222, z8, z6, function12, offsetMapping2222, density2222)), composer2, 448);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation42222;
            function13 = function12;
            brush3 = brush2;
            z9 = z5;
            i23 = i20;
            keyboardActions3 = keyboardActions2;
            imeOptions3 = imeOptions42222;
            mutableInteractionSource5 = mutableInteractionSource82222;
            z10 = z6;
            function33 = function32;
            modifier5 = modifier62222;
            z11 = z142222;
            i24 = i302222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 112) == 0) {
        }
        int i2722 = i15;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        visualTransformation2 = none;
        function12 = coreTextFieldKt$CoreTextField$1;
        mutableInteractionSource2 = mutableInteractionSource6;
        i21 = i28;
        i22 = i2722;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester22222 = (FocusRequester) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume92222 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextInputService textInputService22222 = (TextInputService) consume92222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22222 = (Density) consume222222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume322222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FontFamily.Resolver resolver22222 = (FontFamily.Resolver) consume322222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422222 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long m1228getBackgroundColor0d7_KjU22222 = ((TextSelectionColors) consume422222).m1228getBackgroundColor0d7_KjU();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume522222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager222222 = (FocusManager) consume522222;
        if (!(i21 != 1 && !z5 && imeOptions2.getSingleLine())) {
        }
        Modifier modifier622222 = modifier3;
        Object[] objArr22222 = {orientation};
        Saver<TextFieldScrollerPosition, Object> saver22222 = TextFieldScrollerPosition.Companion.getSaver();
        int i3022222 = i21;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(orientation);
        int i3122222 = i22;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        TextFieldScrollerPosition textFieldScrollerPosition22222 = (TextFieldScrollerPosition) RememberSaveableKt.m2907rememberSaveable(objArr22222, saver22222, (String) null, (Function0<? extends Object>) rememberedValue2, startRestartGroup, 72, 4);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, value.getAnnotatedString());
        m5324getCompositionMzsxiRA = value.m5324getCompositionMzsxiRA();
        mutableInteractionSource3 = mutableInteractionSource2;
        if (m5324getCompositionMzsxiRA != null) {
        }
        rememberedValue3 = filterWithValidation;
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        TransformedText transformedText22222 = (TransformedText) rememberedValue3;
        AnnotatedString text22222 = transformedText22222.getText();
        OffsetMapping offsetMapping22222 = transformedText22222.getOffsetMapping();
        RecomposeScope currentRecomposeScope22222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        textFieldState = (TextFieldState) rememberedValue4;
        textFieldState.m1105updatefnh65Uc(value.getAnnotatedString(), text22222, textStyle2, z5, density22222, resolver22222, onValueChange, keyboardActions2, focusManager222222, m1228getBackgroundColor0d7_KjU22222);
        textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        UndoManager undoManager22222 = (UndoManager) rememberedValue5;
        UndoManager.snapshotIfNeeded$default(undoManager22222, value, 0L, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextFieldSelectionManager textFieldSelectionManager22222 = (TextFieldSelectionManager) rememberedValue6;
        textFieldSelectionManager22222.setOffsetMapping$foundation_release(offsetMapping22222);
        textFieldSelectionManager22222.setVisualTransformation$foundation_release(visualTransformation2);
        textFieldSelectionManager22222.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
        textFieldSelectionManager22222.setState$foundation_release(textFieldState);
        textFieldSelectionManager22222.setValue$foundation_release(value);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume622222 = startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager22222.setClipboardManager$foundation_release((ClipboardManager) consume622222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume722222 = startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager22222.setTextToolbar((TextToolbar) consume722222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume822222 = startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager22222.setHapticFeedBack((HapticFeedback) consume822222);
        textFieldSelectionManager22222.setFocusRequester(focusRequester22222);
        textFieldSelectionManager22222.setEditable(!z6);
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue7).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        BringIntoViewRequester bringIntoViewRequester22222 = (BringIntoViewRequester) rememberedValue8;
        MutableInteractionSource mutableInteractionSource722222 = mutableInteractionSource3;
        Modifier textFieldFocusModifier22222 = TextFieldGestureModifiersKt.textFieldFocusModifier(Modifier.Companion, z4, focusRequester22222, mutableInteractionSource722222, new CoreTextFieldKt$CoreTextField$focusModifier$1(textFieldState, textInputService22222, value, imeOptions2, offsetMapping22222, textFieldSelectionManager22222, coroutineScope22222, bringIntoViewRequester22222));
        startRestartGroup.startReplaceableGroup(-55008291);
        ComposerKt.sourceInformation(startRestartGroup, "327@16148L163");
        if (z4) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!TouchMode_androidKt.isInTouchMode()) {
        }
        Modifier drawBehind22222 = DrawModifierKt.drawBehind(Modifier.Companion, new CoreTextFieldKt$CoreTextField$drawModifier$1(textFieldState, value, offsetMapping22222));
        Modifier onGloballyPositioned32222 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(textFieldState, z4, textFieldSelectionManager22222, value, offsetMapping22222));
        Modifier semantics22222 = SemanticsModifierKt.semantics(Modifier.Companion, true, new CoreTextFieldKt$CoreTextField$semanticsModifier$1(imeOptions2, transformedText22222, value, z4, visualTransformation2 instanceof PasswordVisualTransformation, z6, textFieldState, offsetMapping22222, textFieldSelectionManager22222, focusRequester22222));
        Modifier cursor22222 = TextFieldCursorKt.cursor(Modifier.Companion, textFieldState, value, offsetMapping22222, brush2, (z4 || z6) ? z7 : true);
        EffectsKt.DisposableEffect(textFieldSelectionManager22222, new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager22222), startRestartGroup, 8);
        EffectsKt.DisposableEffect(imeOptions2, new CoreTextFieldKt$CoreTextField$4(textInputService22222, textFieldState, value, imeOptions2), startRestartGroup, (i3122222 >> 3) & 14);
        MutableInteractionSource mutableInteractionSource822222 = mutableInteractionSource4;
        Modifier onGloballyPositioned222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(modifier622222.then(modifier4), textFieldState, focusManager), textFieldState, textFieldSelectionManager22222).then(TextFieldKeyInputKt.m1091textFieldKeyInput2WJ9YEU(Modifier.Companion, textFieldState, textFieldSelectionManager22222, value, textFieldState.getOnValueChange(), !z6, i3022222 != 1 ? true : z7, offsetMapping22222, undoManager22222, imeOptions2.m5276getImeActioneUduSuo())), textFieldScrollerPosition22222, mutableInteractionSource822222, z4).then(pointerHoverIcon$default).then(semantics22222), new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(textFieldState));
        if (!z4) {
        }
        if (!z8) {
        }
        boolean z1422222 = z4;
        ImeOptions imeOptions422222 = imeOptions2;
        VisualTransformation visualTransformation422222 = visualTransformation2;
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned222222, textFieldSelectionManager22222, ComposableLambdaKt.composableLambda(composer2, -374338080, true, new CoreTextFieldKt$CoreTextField$5(function32, i3122222, textFieldState, textStyle2, i20, i3022222, textFieldScrollerPosition22222, value, visualTransformation2, cursor22222, drawBehind22222, onGloballyPositioned32222, companion, bringIntoViewRequester22222, textFieldSelectionManager22222, z8, z6, function12, offsetMapping22222, density22222)), composer2, 448);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        visualTransformation3 = visualTransformation422222;
        function13 = function12;
        brush3 = brush2;
        z9 = z5;
        i23 = i20;
        keyboardActions3 = keyboardActions2;
        imeOptions3 = imeOptions422222;
        mutableInteractionSource5 = mutableInteractionSource822222;
        z10 = z6;
        function33 = function32;
        modifier5 = modifier622222;
        z11 = z1422222;
        i24 = i3022222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)702@31477L95:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:697)");
        }
        int i2 = (i & 14) | 384;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i3 = i2 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, (i3 & 112) | (i3 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i4 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087270836, "C703@31533L33:CoreTextField.kt#423gt5");
        startRestartGroup.startReplaceableGroup(-1985516685);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ContextMenuArea)P(1)29@1062L9:ContextMenu.android.kt#423gt5");
        function2.invoke(startRestartGroup, Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, function2, i));
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (!z || (inputSession = textFieldState.getInputSession()) == null) {
        } else {
            inputSession.showSoftwareKeyboard();
        }
    }

    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        if (textFieldState.getHasFocus()) {
            textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
            notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
            return;
        }
        onBlur(textFieldState);
    }

    public static final void onBlur(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5079getMaximpl(textFieldValue.m5325getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m5766getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    public static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z, Composer composer, int i) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextFieldState state$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles)1044@45268L202:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1025)");
        }
        if (z) {
            TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
            TextLayoutResult textLayoutResult = null;
            boolean z2 = true;
            if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                if (!(textFieldSelectionManager.getState$foundation_release() != null ? state$foundation_release.isLayoutResultStale() : true)) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m5076getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m5325getSelectiond9O1mEE())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5082getStartimpl(textFieldSelectionManager.getValue$foundation_release().m5325getSelectiond9O1mEE()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m5077getEndimpl(textFieldSelectionManager.getValue$foundation_release().m5325getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498389736);
                    ComposerKt.sourceInformation(startRestartGroup, "1037@44945L203");
                    TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release3 != null && state$foundation_release3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release4 == null || !state$foundation_release4.getShowSelectionHandleEnd()) {
                        z2 = false;
                    }
                    if (z2) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state$foundation_release5.setShowFloatingToolbar(false);
                    }
                    if (state$foundation_release5.getHasFocus()) {
                        if (state$foundation_release5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z, i));
    }

    public static final void TextFieldCursorHandle(TextFieldSelectionManager manager, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)1070@46313L50,1071@46426L7,1078@46683L205,1072@46443L483:CoreTextField.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1068)");
        }
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        if (state$foundation_release != null && state$foundation_release.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(manager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = manager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long m1222getCursorPositiontuRUvjQ$foundation_release = manager.m1222getCursorPositiontuRUvjQ$foundation_release((Density) consume);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, null));
            Offset m3007boximpl = Offset.m3007boximpl(m1222getCursorPositiontuRUvjQ$foundation_release);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m3007boximpl);
            CoreTextFieldKt$TextFieldCursorHandle$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(m1222getCursorPositiontuRUvjQ$foundation_release);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m1012CursorHandleULxng0E(m1222getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CoreTextFieldKt$TextFieldCursorHandle$3(manager, i));
    }

    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }
}
