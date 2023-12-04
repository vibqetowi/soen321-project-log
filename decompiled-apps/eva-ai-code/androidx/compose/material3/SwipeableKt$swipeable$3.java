package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ResistanceConfig resistanceConfig, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z2;
        this.$resistance = resistanceConfig;
        this.$thresholds = function2;
        this.$velocityThreshold = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier draggable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1169892884);
        ComposerKt.sourceInformation(composer, "C588@24733L7,590@24775L502,611@25538L55:Swipeable.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1169892884, i, -1, "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)");
        }
        if (!(!this.$anchors.isEmpty())) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (!(CollectionsKt.distinct(this.$anchors.values()).size() == this.$anchors.size())) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        this.$state.ensureInit$material3_release(this.$anchors);
        EffectsKt.LaunchedEffect(this.$anchors, this.$state, new AnonymousClass3(this.$state, this.$anchors, this.$resistance, (Density) consume, this.$thresholds, this.$velocityThreshold, null), composer, 520);
        Modifier.Companion companion = Modifier.Companion;
        boolean isAnimationRunning = this.$state.isAnimationRunning();
        DraggableState draggableState$material3_release = this.$state.getDraggableState$material3_release();
        Modifier.Companion companion2 = companion;
        Orientation orientation = this.$orientation;
        boolean z = this.$enabled;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        SwipeableState<T> swipeableState = this.$state;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(swipeableState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (Function3) new SwipeableKt$swipeable$3$4$1(swipeableState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        draggable = DraggableKt.draggable(companion2, draggableState$material3_release, orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isAnimationRunning, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : (Function3) rememberedValue, (r20 & 128) != 0 ? false : this.$reverseDirection);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {TypedValues.MotionType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<Float, T> $anchors;
        final /* synthetic */ Density $density;
        final /* synthetic */ ResistanceConfig $resistance;
        final /* synthetic */ SwipeableState<T> $state;
        final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
        final /* synthetic */ float $velocityThreshold;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$state = swipeableState;
            this.$anchors = map;
            this.$resistance = resistanceConfig;
            this.$density = density;
            this.$thresholds = function2;
            this.$velocityThreshold = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Swipeable.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Float> {
            final /* synthetic */ Map<Float, T> $anchors;
            final /* synthetic */ Density $density;
            final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Map<Float, ? extends T> map, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, Density density) {
                super(2);
                this.$anchors = map;
                this.$thresholds = function2;
                this.$density = density;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2) {
                return invoke(f.floatValue(), f2.floatValue());
            }

            public final Float invoke(float f, float f2) {
                return Float.valueOf(this.$thresholds.invoke(MapsKt.getValue(this.$anchors, Float.valueOf(f)), MapsKt.getValue(this.$anchors, Float.valueOf(f2))).computeThreshold(this.$density, f, f2));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Map anchors$material3_release = this.$state.getAnchors$material3_release();
                this.$state.setAnchors$material3_release(this.$anchors);
                this.$state.setResistance$material3_release(this.$resistance);
                this.$state.setThresholds$material3_release(new AnonymousClass1(this.$anchors, this.$thresholds, this.$density));
                this.$state.setVelocityThreshold$material3_release(this.$density.mo588toPx0680j_4(this.$velocityThreshold));
                this.label = 1;
                if (this.$state.processNewAnchors$material3_release(anchors$material3_release, this.$anchors, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
