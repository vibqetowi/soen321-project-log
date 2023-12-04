package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0011\u0018\u0000 x*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001xBB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rJ'\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010aJ+\u0010b\u001a\u00020^2\u0006\u0010O\u001a\u00028\u00002\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0081@ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ!\u0010f\u001a\u00020^2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0002\bhJ\u0015\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0006H\u0000¢\u0006\u0002\bkJ\u001b\u0010l\u001a\u00020^2\u0006\u0010m\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ;\u0010p\u001a\u00020^2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u0019\u0010t\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010oJ\u001b\u0010u\u001a\u00020^2\u0006\u0010O\u001a\u00028\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\bv\u0010wR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R+\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001103X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u00107R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060<8F¢\u0006\u0006\u001a\u0004\bA\u0010>R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000D8@X\u0081\u0004¢\u0006\f\u0012\u0004\bE\u0010&\u001a\u0004\bF\u0010GR/\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0010\u001a\u0004\u0018\u00010H8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010\u0018\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010O\u001a\u00028\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\bP\u0010&\u001a\u0004\bQ\u0010 RO\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060R2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060R8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u0018\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010Y\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010\u0018\u001a\u0004\bZ\u0010(\"\u0004\b[\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006y"}, d2 = {"Landroidx/compose/material3/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "absoluteOffset", "Landroidx/compose/runtime/MutableState;", "<set-?>", "", "anchors", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "getConfirmStateChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "direction", "getDirection$material3_release$annotations", "()V", "getDirection$material3_release", "()F", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "maxBound", "getMaxBound$material3_release", "setMaxBound$material3_release", "(F)V", "minBound", "getMinBound$material3_release", "setMinBound$material3_release", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offsetState", "overflow", "getOverflow", "overflowState", "progress", "Landroidx/compose/material3/SwipeProgress;", "getProgress$material3_release$annotations", "getProgress$material3_release", "()Landroidx/compose/material3/SwipeProgress;", "Landroidx/compose/material3/ResistanceConfig;", "resistance", "getResistance$material3_release", "()Landroidx/compose/material3/ResistanceConfig;", "setResistance$material3_release", "(Landroidx/compose/material3/ResistanceConfig;)V", "resistance$delegate", "targetValue", "getTargetValue$material3_release$annotations", "getTargetValue$material3_release", "Lkotlin/Function2;", "thresholds", "getThresholds$material3_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material3_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "velocityThreshold", "getVelocityThreshold$material3_release", "setVelocityThreshold$material3_release", "velocityThreshold$delegate", "animateInternalToOffset", "", TypedValues.AttributesType.S_TARGET, "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "animateTo$material3_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureInit", "newAnchors", "ensureInit$material3_release", "performDrag", "delta", "performDrag$material3_release", "performFling", "velocity", "performFling$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "oldAnchors", "processNewAnchors$material3_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapInternalToOffset", "snapTo", "snapTo$material3_release", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final Companion Companion = new Companion(null);
    private final MutableState<Float> absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableState<Float> offsetState;
    private final MutableState<Float> overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableState velocityThreshold$delegate;

    public static /* synthetic */ void getDirection$material3_release$annotations() {
    }

    public static /* synthetic */ void getProgress$material3_release$annotations() {
    }

    public static /* synthetic */ void getTargetValue$material3_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        MutableState<Float> mutableStateOf$default4;
        MutableState<Float> mutableStateOf$default5;
        MutableState<Float> mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        MutableState mutableStateOf$default10;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        Float valueOf = Float.valueOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.offsetState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.overflowState = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.absoluteOffset = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default7;
        final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material3.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!((Map) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.thresholds$delegate = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.velocityThreshold$delegate = mutableStateOf$default9;
        mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance$delegate = mutableStateOf$default10;
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SwipeableState$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<T, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }
    }

    public /* synthetic */ SwipeableState(Object obj, SpringSpec<Float> springSpec, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release() : springSpec, (i & 4) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$material3_release() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final Map<Float, T> getAnchors$material3_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final void setAnchors$material3_release(Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final float getMinBound$material3_release() {
        return this.minBound;
    }

    public final void setMinBound$material3_release(float f) {
        this.minBound = f;
    }

    public final float getMaxBound$material3_release() {
        return this.maxBound;
    }

    public final void setMaxBound$material3_release(float f) {
        this.maxBound = f;
    }

    public final void ensureInit$material3_release(Map<Float, ? extends T> newAnchors) {
        Float offset;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material3_release().isEmpty()) {
            offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(offset);
            this.absoluteOffset.setValue(offset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewAnchors$material3_release(Map<Float, ? extends T> map, Map<Float, ? extends T> map2, Continuation<? super Unit> continuation) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        ?? r2;
        SwipeableState<T> swipeableState;
        Float offset;
        SwipeableState<T> swipeableState2;
        SwipeableState<T> swipeableState3;
        Float offset2;
        Float offset3;
        SwipeableState<T> swipeableState4;
        float f;
        float f2;
        try {
            if (continuation instanceof SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuation;
                if ((swipeableState$processNewAnchors$1.label & Integer.MIN_VALUE) != 0) {
                    swipeableState$processNewAnchors$1.label -= Integer.MIN_VALUE;
                    Object obj = swipeableState$processNewAnchors$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = swipeableState$processNewAnchors$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (map.isEmpty()) {
                            Float minOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull);
                            this.minBound = minOrNull.floatValue();
                            Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull);
                            this.maxBound = maxOrNull.floatValue();
                            offset3 = SwipeableKt.getOffset(map2, getCurrentValue());
                            if (offset3 == null) {
                                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                            }
                            float floatValue = offset3.floatValue();
                            swipeableState$processNewAnchors$1.label = 1;
                            if (snapInternalToOffset(floatValue, swipeableState$processNewAnchors$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        } else if (!Intrinsics.areEqual(map2, map)) {
                            this.minBound = Float.NEGATIVE_INFINITY;
                            this.maxBound = Float.POSITIVE_INFINITY;
                            Float value = this.animationTarget.getValue();
                            T t = null;
                            if (value != null) {
                                offset2 = SwipeableKt.getOffset(map2, map.get(value));
                                if (offset2 != null) {
                                    map = (Map<Float, ? extends T>) offset2.floatValue();
                                } else {
                                    Iterator<T> it = map2.keySet().iterator();
                                    if (it.hasNext()) {
                                        t = it.next();
                                        if (it.hasNext()) {
                                            float abs = Math.abs(((Number) t).floatValue() - value.floatValue());
                                            do {
                                                T next = it.next();
                                                float abs2 = Math.abs(((Number) next).floatValue() - value.floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    t = next;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(t);
                                    map = (Map<Float, ? extends T>) ((Number) t).floatValue();
                                }
                            } else {
                                T t2 = map.get(getOffset().getValue());
                                if (Intrinsics.areEqual(t2, getCurrentValue())) {
                                    t2 = getCurrentValue();
                                }
                                offset = SwipeableKt.getOffset(map2, t2);
                                if (offset != null) {
                                    map = offset.floatValue();
                                } else {
                                    Iterator<T> it2 = map2.keySet().iterator();
                                    if (it2.hasNext()) {
                                        t = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = Math.abs(((Number) t).floatValue() - getOffset().getValue().floatValue());
                                            do {
                                                T next2 = it2.next();
                                                float abs4 = Math.abs(((Number) next2).floatValue() - getOffset().getValue().floatValue());
                                                if (Float.compare(abs3, abs4) > 0) {
                                                    t = next2;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    }
                                    Intrinsics.checkNotNull(t);
                                    map = ((Number) t).floatValue();
                                }
                            }
                            try {
                                AnimationSpec<Float> animationSpec = this.animationSpec;
                                swipeableState$processNewAnchors$1.L$0 = this;
                                swipeableState$processNewAnchors$1.L$1 = map2;
                                swipeableState$processNewAnchors$1.F$0 = (float) map;
                                swipeableState$processNewAnchors$1.label = 2;
                                if (animateInternalToOffset((float) map, animationSpec, swipeableState$processNewAnchors$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                swipeableState3 = this;
                                f = map;
                                swipeableState3.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f)));
                                Float minOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull2);
                                swipeableState3.minBound = minOrNull2.floatValue();
                                Float maxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull2);
                                swipeableState3.maxBound = maxOrNull2.floatValue();
                            } catch (CancellationException unused) {
                                swipeableState2 = this;
                                swipeableState$processNewAnchors$1.L$0 = swipeableState2;
                                swipeableState$processNewAnchors$1.L$1 = map2;
                                swipeableState$processNewAnchors$1.F$0 = map;
                                swipeableState$processNewAnchors$1.label = 3;
                                if (swipeableState2.snapInternalToOffset(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                swipeableState = this;
                                swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                                Float minOrNull3 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                                Intrinsics.checkNotNull(minOrNull3);
                                swipeableState.minBound = minOrNull3.floatValue();
                                Float maxOrNull3 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                                Intrinsics.checkNotNull(maxOrNull3);
                                swipeableState.maxBound = maxOrNull3.floatValue();
                                throw th;
                            }
                        }
                    } else if (r2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } else if (r2 == 2) {
                        map = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                        map2 = (Map) swipeableState$processNewAnchors$1.L$1;
                        swipeableState2 = (SwipeableState) swipeableState$processNewAnchors$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            swipeableState3 = swipeableState2;
                            f = map;
                            swipeableState3.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f)));
                            Float minOrNull22 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull22);
                            swipeableState3.minBound = minOrNull22.floatValue();
                            Float maxOrNull22 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull22);
                            swipeableState3.maxBound = maxOrNull22.floatValue();
                        } catch (CancellationException unused2) {
                            swipeableState$processNewAnchors$1.L$0 = swipeableState2;
                            swipeableState$processNewAnchors$1.L$1 = map2;
                            swipeableState$processNewAnchors$1.F$0 = map;
                            swipeableState$processNewAnchors$1.label = 3;
                            if (swipeableState2.snapInternalToOffset(map, swipeableState$processNewAnchors$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            swipeableState4 = swipeableState2;
                            f2 = map;
                            swipeableState4.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f2)));
                            Float minOrNull4 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull4);
                            swipeableState4.minBound = minOrNull4.floatValue();
                            Float maxOrNull4 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull4);
                            swipeableState4.maxBound = maxOrNull4.floatValue();
                            return Unit.INSTANCE;
                        }
                    } else if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        map = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                        map2 = (Map) swipeableState$processNewAnchors$1.L$1;
                        swipeableState = (SwipeableState) swipeableState$processNewAnchors$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            swipeableState4 = swipeableState;
                            f2 = map;
                            swipeableState4.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(f2)));
                            Float minOrNull42 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull42);
                            swipeableState4.minBound = minOrNull42.floatValue();
                            Float maxOrNull42 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull42);
                            swipeableState4.maxBound = maxOrNull42.floatValue();
                        } catch (Throwable th2) {
                            th = th2;
                            swipeableState.setCurrentValue(MapsKt.getValue(map2, Boxing.boxFloat(map)));
                            Float minOrNull32 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(minOrNull32);
                            swipeableState.minBound = minOrNull32.floatValue();
                            Float maxOrNull32 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                            Intrinsics.checkNotNull(maxOrNull32);
                            swipeableState.maxBound = maxOrNull32.floatValue();
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            swipeableState = r2;
        }
        swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuation);
        Object obj2 = swipeableState$processNewAnchors$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = swipeableState$processNewAnchors$1.label;
    }

    public final Function2<Float, Float, Float> getThresholds$material3_release() {
        return (Function2) this.thresholds$delegate.getValue();
    }

    public final void setThresholds$material3_release(Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds$delegate.setValue(function2);
    }

    public final float getVelocityThreshold$material3_release() {
        return ((Number) this.velocityThreshold$delegate.getValue()).floatValue();
    }

    public final void setVelocityThreshold$material3_release(float f) {
        this.velocityThreshold$delegate.setValue(Float.valueOf(f));
    }

    public final ResistanceConfig getResistance$material3_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final void setResistance$material3_release(ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.CC.drag$default(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object drag$default = DraggableState.CC.drag$default(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    public final T getTargetValue$material3_release() {
        Float offset;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue = getOffset().getValue().floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
            computeTarget = SwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material3_release().keySet(), getThresholds$material3_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material3_release().get(Float.valueOf(computeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final SwipeProgress<T> getProgress$material3_release() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f;
        Pair pair;
        findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material3_release().keySet());
        int size = findBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f = 1.0f;
        } else if (size == 1) {
            Object value = MapsKt.getValue(getAnchors$material3_release(), findBounds.get(0));
            currentValue = MapsKt.getValue(getAnchors$material3_release(), findBounds.get(0));
            f = 1.0f;
            obj = value;
        } else {
            if (getDirection$material3_release() > 0.0f) {
                pair = TuplesKt.to(findBounds.get(0), findBounds.get(1));
            } else {
                pair = TuplesKt.to(findBounds.get(1), findBounds.get(0));
            }
            float floatValue = ((Number) pair.component1()).floatValue();
            float floatValue2 = ((Number) pair.component2()).floatValue();
            obj = MapsKt.getValue(getAnchors$material3_release(), Float.valueOf(floatValue));
            currentValue = MapsKt.getValue(getAnchors$material3_release(), Float.valueOf(floatValue2));
            f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        }
        return new SwipeProgress<>(obj, currentValue, f);
    }

    public final float getDirection$material3_release() {
        Float offset;
        offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
        if (offset != null) {
            return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
        }
        return 0.0f;
    }

    public final Object snapTo$material3_release(T t, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t, this), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$material3_release$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                animationSpec = swipeableState.animationSpec;
            }
            return swipeableState.animateTo$material3_release(obj, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    public final Object animateTo$material3_release(T t, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final Object performFling$material3_release(final float f, Continuation<? super Unit> continuation) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material3.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Map) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material3_release(), f, this.this$0.getVelocityThreshold$material3_release());
                Object obj = map.get(Boxing.boxFloat(computeTarget));
                if (obj != null && ((Boolean) this.this$0.getConfirmStateChange$material3_release().invoke(obj)).booleanValue()) {
                    Object animateTo$material3_release$default = SwipeableState.animateTo$material3_release$default(this.this$0, obj, null, continuation2, 2, null);
                    return animateTo$material3_release$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$material3_release$default : Unit.INSTANCE;
                }
                SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material3_release(), continuation2);
                return animateInternalToOffset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateInternalToOffset : Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final float performDrag$material3_release(float f) {
        float coerceIn = RangesKt.coerceIn(this.absoluteOffset.getValue().floatValue() + f, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material3/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, confirmStateChange));
        }
    }
}
