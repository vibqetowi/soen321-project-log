package androidx.compose.material;

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
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i2, Function0<Unit> function0, List<Float> list, SliderColors sliderColors) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$value = closedFloatingPointRange2;
        this.$$dirty = i;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$steps = i2;
        this.$onValueChangeFinished = function0;
        this.$tickFractions = list;
        this.$colors = sliderColors;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r32v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        Modifier rangeSliderPressDragModifier;
        float calcFraction;
        float calcFraction2;
        Modifier sliderSemantics;
        Modifier sliderSemantics2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        ComposerKt.sourceInformation(composer, "C315@14165L7,*320@14326L7,331@14754L60,332@14842L67,334@14919L164,341@15092L169,349@15283L24,350@15339L964,374@16373L857,374@16326L904,416@18249L63,424@18539L65,430@18732L340:Slider.kt#jmzs0o");
        if ((((i & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i : i) & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652589923, i, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:314)");
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
            floatRef.element = m5551getMaxWidthimpl - density.mo588toPx0680j_4(SliderKt.getThumbRadius());
            floatRef2.element = density.mo588toPx0680j_4(SliderKt.getThumbRadius());
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue()));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
            ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue()));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
            SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableFloatState, this.$value.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE);
            SliderKt.CorrectValueSideEffect(new AnonymousClass3(this.$valueRange, floatRef2, floatRef), this.$valueRange, RangesKt.rangeTo(floatRef2.element, floatRef.element), mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE);
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            composer.endReplaceableGroup();
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$gestureEndAction$1(mutableFloatState, mutableFloatState2, this.$tickFractions, floatRef2, floatRef, this.$onValueChangeFinished, coroutineScope, this.$onValueChangeState, this.$valueRange), composer, 0);
            ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$value;
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
            Object[] objArr = {mutableFloatState, mutableFloatState2, this.$valueRange, Float.valueOf(floatRef2.element), Float.valueOf(floatRef.element), closedFloatingPointRange5, state};
            ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
            composer.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i2 = 0; i2 < 7; i2++) {
                z2 |= composer.changed(objArr[i2]);
            }
            SliderKt$RangeSlider$2$onDrag$1$1 rememberedValue4 = composer.rememberedValue();
            if (z2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new SliderKt$RangeSlider$2$onDrag$1$1(mutableFloatState, mutableFloatState2, closedFloatingPointRange5, floatRef2, floatRef, state, closedFloatingPointRange6);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(Modifier.Companion, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z, m5551getMaxWidthimpl, this.$valueRange, rememberUpdatedState, SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0));
            float coerceIn = RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
            float coerceIn2 = RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
            calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
            int floor = (int) Math.floor(this.$steps * calcFraction2);
            int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
            Modifier.Companion companion = Modifier.Companion;
            boolean z3 = this.$enabled;
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
            Float valueOf = Float.valueOf(coerceIn2);
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(state2) | composer.changed(valueOf);
            SliderKt$RangeSlider$2$startThumbSemantics$1$1 rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new SliderKt$RangeSlider$2$startThumbSemantics$1$1(state3, coerceIn2);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            sliderSemantics = SliderKt.sliderSemantics(companion, coerceIn, z3, rememberedValue5, this.$onValueChangeFinished, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), coerceIn2), floor);
            Modifier.Companion companion2 = Modifier.Companion;
            boolean z4 = this.$enabled;
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state4 = this.$onValueChangeState;
            Float valueOf2 = Float.valueOf(coerceIn);
            State<Function1<ClosedFloatingPointRange<Float>, Unit>> state5 = this.$onValueChangeState;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(state4) | composer.changed(valueOf2);
            SliderKt$RangeSlider$2$endThumbSemantics$1$1 rememberedValue6 = composer.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new SliderKt$RangeSlider$2$endThumbSemantics$1$1(state5, coerceIn);
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            sliderSemantics2 = SliderKt.sliderSemantics(companion2, coerceIn2, z4, rememberedValue6, this.$onValueChangeFinished, RangesKt.rangeTo(coerceIn, this.$valueRange.getEndInclusive().floatValue()), floor2);
            boolean z5 = this.$enabled;
            List<Float> list = this.$tickFractions;
            SliderColors sliderColors = this.$colors;
            float f = floatRef.element - floatRef2.element;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
            int i3 = this.$$dirty;
            SliderKt.RangeSliderImpl(z5, calcFraction, calcFraction2, list, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, rangeSliderPressDragModifier, sliderSemantics, sliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        ClosedFloatingPointRange<Float> scale;
        scale = SliderKt.scale(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
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
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2  reason: invalid class name */
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
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }
}
