package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Slider$3 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r7v10 */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Modifier sliderTapModifier;
        Modifier draggable;
        float calcFraction;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C176@8217L7,*181@8378L7,192@8792L24,193@8841L54,194@8922L36,196@8989L392,205@9391L83,207@9507L623,236@10624L55,243@10965L209:Slider.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085116814, i, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:175)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            boolean z = consume == LayoutDirection.Rtl;
            float m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk());
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume2;
            floatRef.element = Math.max(m5551getMaxWidthimpl - density.mo588toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            floatRef2.element = Math.min(density.mo588toPx0680j_4(SliderKt.getThumbRadius()), floatRef.element);
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            float f = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange, floatRef2, floatRef, f));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
            Float valueOf = Float.valueOf(floatRef2.element);
            Float valueOf2 = Float.valueOf(floatRef.element);
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            State<Function1<Float, Unit>> state = this.$onValueChangeState;
            composer.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(closedFloatingPointRange2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new SliderDraggableState(new SliderKt$Slider$3$draggableState$1$1(mutableFloatState, mutableFloatState2, floatRef2, floatRef, state, closedFloatingPointRange2));
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            SliderDraggableState sliderDraggableState = rememberedValue4;
            float f2 = this.$value;
            int i3 = this.$$dirty;
            SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableFloatState, f2, composer, ((i3 >> 9) & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 << 12) & 57344));
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$Slider$3$gestureEndAction$1(mutableFloatState, this.$tickFractions, floatRef2, floatRef, coroutineScope, sliderDraggableState, this.$onValueChangeFinished), composer, 0);
            SliderDraggableState sliderDraggableState2 = sliderDraggableState;
            sliderTapModifier = SliderKt.sliderTapModifier(Modifier.Companion, sliderDraggableState2, this.$interactionSource, m5551getMaxWidthimpl, z, mutableFloatState, rememberUpdatedState, mutableFloatState2, this.$enabled);
            Modifier.Companion companion = Modifier.Companion;
            Orientation orientation = Orientation.Horizontal;
            boolean isDragging = sliderDraggableState.isDragging();
            Modifier.Companion companion2 = companion;
            boolean z2 = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(rememberUpdatedState);
            SliderKt$Slider$3$drag$1$1 rememberedValue5 = composer.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            draggable = DraggableKt.draggable(companion2, sliderDraggableState2, orientation, (r20 & 4) != 0 ? true : z2, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : rememberedValue5, (r20 & 128) != 0 ? false : z);
            calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue()));
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            Modifier then = sliderTapModifier.then(draggable);
            int i4 = this.$$dirty;
            SliderKt.SliderImpl(this.$enabled, calcFraction, this.$tickFractions, this.$colors, floatRef.element - floatRef2.element, mutableInteractionSource2, then, composer, ((i4 >> 9) & 14) | 512 | ((i4 >> 15) & 7168) | ((i4 >> 6) & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f) {
        float scale;
        scale = SliderKt.scale(floatRef.element, floatRef2.element, f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }
}
