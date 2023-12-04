package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkExpand$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ State<ChangeSize> $expand;
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<ChangeSize> $shrink;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = state;
        this.$shrink = state2;
        this.$labelPrefix = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0207, code lost:
        if (((r2 == null || r2.getClip()) ? false : true) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Alignment alignment;
        State rememberUpdatedState;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        ChangeSize value;
        Modifier composed = modifier;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-140634085);
        ComposerKt.sourceInformation(composer, "C1034@44322L46,1044@44676L396,1057@45186L41,1055@45112L125,1066@45547L218:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-140634085, i, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1030)");
        }
        Transition<EnterExitState> transition = this.$transition;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(transition);
        Object rememberedValue4 = composer.rememberedValue();
        boolean z = false;
        if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue4;
        if (this.$transition.getCurrentState() == this.$transition.getTargetState() && !this.$transition.isSeeking()) {
            invoke$lambda$2(mutableState, false);
        } else if (this.$expand.getValue() != null || this.$shrink.getValue() != null) {
            invoke$lambda$2(mutableState, true);
        }
        if (invoke$lambda$1(mutableState)) {
            boolean isTransitioningTo = this.$transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible);
            State<ChangeSize> state = this.$expand;
            State<ChangeSize> state2 = this.$shrink;
            if (isTransitioningTo) {
                ChangeSize value2 = state.getValue();
                if (value2 == null || (alignment = value2.getAlignment()) == null) {
                    ChangeSize value3 = state2.getValue();
                    if (value3 != null) {
                        alignment = value3.getAlignment();
                    }
                    alignment = null;
                }
                rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                Transition<EnterExitState> transition2 = this.$transition;
                TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
                String str = this.$labelPrefix;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = str + " shrink/expand";
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition2, vectorConverter, (String) rememberedValue, composer, 448, 0);
                composer.startMovableGroup(-1553213689, Boolean.valueOf(this.$transition.getCurrentState() != this.$transition.getTargetState()));
                ComposerKt.sourceInformation(composer, "1062@45432L54,1060@45348L152");
                Transition<EnterExitState> transition3 = this.$transition;
                TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
                String str2 = this.$labelPrefix;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = str2 + " InterruptionHandlingOffset";
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition3, vectorConverter2, (String) rememberedValue2, composer, 448, 0);
                composer.endMovableGroup();
                Transition<EnterExitState> transition4 = this.$transition;
                State<ChangeSize> state3 = this.$expand;
                State<ChangeSize> state4 = this.$shrink;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = composer.changed(transition4);
                rememberedValue3 = composer.rememberedValue();
                if (!changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ExpandShrinkModifier(createDeferredAnimation, createDeferredAnimation2, state3, state4, rememberUpdatedState);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) rememberedValue3;
                if (this.$transition.getCurrentState() != this.$transition.getTargetState()) {
                    expandShrinkModifier.setCurrentAlignment(null);
                } else if (expandShrinkModifier.getCurrentAlignment() == null) {
                    Alignment alignment2 = (Alignment) rememberUpdatedState.getValue();
                    if (alignment2 == null) {
                        alignment2 = Alignment.Companion.getTopStart();
                    }
                    expandShrinkModifier.setCurrentAlignment(alignment2);
                }
                value = this.$expand.getValue();
                if (!(value == null && !value.getClip())) {
                    ChangeSize value4 = this.$shrink.getValue();
                }
                z = true;
                Modifier.Companion companion = Modifier.Companion;
                if (!z) {
                    companion = ClipKt.clipToBounds(companion);
                }
                composed = composed.then(companion).then(expandShrinkModifier);
            } else {
                ChangeSize value5 = state2.getValue();
                if (value5 == null || (alignment = value5.getAlignment()) == null) {
                    ChangeSize value6 = state.getValue();
                    if (value6 != null) {
                        alignment = value6.getAlignment();
                    }
                    alignment = null;
                }
                rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(alignment, composer, 0);
                Transition<EnterExitState> transition22 = this.$transition;
                TwoWayConverter<IntSize, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
                String str3 = this.$labelPrefix;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                }
                composer.endReplaceableGroup();
                Transition.DeferredAnimation createDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition22, vectorConverter3, (String) rememberedValue, composer, 448, 0);
                composer.startMovableGroup(-1553213689, Boolean.valueOf(this.$transition.getCurrentState() != this.$transition.getTargetState()));
                ComposerKt.sourceInformation(composer, "1062@45432L54,1060@45348L152");
                Transition<EnterExitState> transition32 = this.$transition;
                TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter22 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
                String str22 = this.$labelPrefix;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                }
                composer.endReplaceableGroup();
                Transition.DeferredAnimation createDeferredAnimation22 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition32, vectorConverter22, (String) rememberedValue2, composer, 448, 0);
                composer.endMovableGroup();
                Transition<EnterExitState> transition42 = this.$transition;
                State<ChangeSize> state32 = this.$expand;
                State<ChangeSize> state42 = this.$shrink;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = composer.changed(transition42);
                rememberedValue3 = composer.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new ExpandShrinkModifier(createDeferredAnimation3, createDeferredAnimation22, state32, state42, rememberUpdatedState);
                composer.updateRememberedValue(rememberedValue3);
                composer.endReplaceableGroup();
                ExpandShrinkModifier expandShrinkModifier2 = (ExpandShrinkModifier) rememberedValue3;
                if (this.$transition.getCurrentState() != this.$transition.getTargetState()) {
                }
                value = this.$expand.getValue();
                if (!(value == null && !value.getClip())) {
                }
                z = true;
                Modifier.Companion companion2 = Modifier.Companion;
                if (!z) {
                }
                composed = composed.then(companion2).then(expandShrinkModifier2);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composed;
    }
}
