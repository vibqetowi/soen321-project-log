package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000f\u001aE\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0010\u001a\u0089\u0001\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001aw\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016\u001a¡\u0001\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b!\u001aC\u0010\"\u001a\u00020\u000e*\u00020#2\u0006\u0010$\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"clickable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "clickable-O2vRcR0", "clickable-XHw0xAI", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "indicationScope", "Lkotlinx/coroutines/CoroutineScope;", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "keyClickOffset", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/geometry/Offset;", "genericClickableWithoutGesture-Kqv-Bsg", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pressPoint", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt {
    /* renamed from: clickable-XHw0xAI$default */
    public static /* synthetic */ Modifier m454clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m453clickableXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: clickable-O2vRcR0$default */
    public static /* synthetic */ Modifier m452clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m451clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, function0);
    }

    /* renamed from: handlePressInteraction-EPk0efs */
    public static final Object m461handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new ClickableKt$handlePressInteraction$2(pressGestureScope, j, mutableInteractionSource, interactionData, function0, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    private static final Modifier genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(Modifier modifier, boolean z, Map<Key, PressInteraction.Press> map, State<Offset> state, CoroutineScope coroutineScope, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(z, map, state, coroutineScope, function0, mutableInteractionSource));
    }

    /* renamed from: genericClickableWithoutGesture-Kqv-Bsg */
    public static final Modifier m459genericClickableWithoutGestureKqvBsg(Modifier genericClickableWithoutGesture, MutableInteractionSource interactionSource, Indication indication, CoroutineScope indicationScope, Map<Key, PressInteraction.Press> currentKeyPressInteractions, State<Offset> keyClickOffset, boolean z, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(indicationScope, "indicationScope");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(keyClickOffset, "keyClickOffset");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return genericClickableWithoutGesture.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_Kqv_Bsg$detectPressAndClickFromKey(new ClickableSemanticsElement(z, role, str2, function0, str, onClick, null), z, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, indication), interactionSource, z), z, interactionSource));
    }

    /* renamed from: clickable-XHw0xAI */
    public static final Modifier m453clickableXHw0xAI(Modifier clickable, boolean z, String str, Role role, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, role, onClick) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$clickable$2(z, str, role, onClick));
    }

    /* renamed from: clickable-O2vRcR0 */
    public static final Modifier m451clickableO2vRcR0(Modifier clickable, MutableInteractionSource interactionSource, Indication indication, boolean z, String str, Role role, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1 clickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(interactionSource, indication, z, str, role, onClick) : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.Companion;
        return InspectableValueKt.inspectableWrapper(clickable, clickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, interactionSource, indication), interactionSource, z), z, interactionSource).then(new ClickableElement(interactionSource, z, str, role, onClick, null)));
    }

    /* renamed from: combinedClickable-cJG_KMw */
    public static final Modifier m457combinedClickablecJG_KMw(Modifier combinedClickable, boolean z, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z, str, role, onClick, function02, function0, str2) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$combinedClickable$2(z, str, role, str2, function0, function02, onClick));
    }

    /* renamed from: combinedClickable-XVZzFYc */
    public static final Modifier m455combinedClickableXVZzFYc(Modifier combinedClickable, MutableInteractionSource interactionSource, Indication indication, boolean z, String str, Role role, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        ClickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1 clickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1(indication, interactionSource, z, str, role, onClick, function02, function0, str2) : InspectableValueKt.getNoInspectorInfo();
        Modifier.Companion companion = Modifier.Companion;
        return InspectableValueKt.inspectableWrapper(combinedClickable, clickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1, FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.Companion, interactionSource, indication), interactionSource, z), z, interactionSource).then(new CombinedClickableElement(interactionSource, z, str, role, onClick, str2, function0, function02, null)));
    }
}
