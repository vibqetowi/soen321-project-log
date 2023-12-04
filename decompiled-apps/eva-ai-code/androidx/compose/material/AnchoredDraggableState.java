package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 u*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002tuBs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0002\u0010\u0011Jm\u0010S\u001a\u00020T2\u0006\u0010N\u001a\u00028\u00002\b\b\u0002\u0010U\u001a\u00020V2H\u0010W\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0Y\u0012\u0006\u0012\u0004\u0018\u00010\u00020X¢\u0006\u0002\bZH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010[Je\u0010S\u001a\u00020T2\b\b\u0002\u0010U\u001a\u00020V2H\u0010W\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0Y\u0012\u0006\u0012\u0004\u0018\u00010\u00020X¢\u0006\u0002\bZH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\\J%\u0010]\u001a\u00028\u00002\u0006\u0010D\u001a\u00020\u00062\u0006\u0010+\u001a\u00028\u00002\u0006\u0010^\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010_J\u001d\u0010`\u001a\u00028\u00002\u0006\u0010D\u001a\u00020\u00062\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010aJ\u000e\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006Jm\u0010d\u001a\u00020T2\b\u0010N\u001a\u0004\u0018\u00018\u00002\u0006\u0010U\u001a\u00020V2H\u0010W\u001aD\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0Y\u0012\u0006\u0012\u0004\u0018\u00010\u00020X¢\u0006\u0002\bZH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010[J\u0013\u0010e\u001a\u00020\u00102\u0006\u0010f\u001a\u00028\u0000¢\u0006\u0002\u0010gJ\u0015\u0010h\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0000¢\u0006\u0002\biJ\u0006\u0010j\u001a\u00020\u0006J\u0019\u0010k\u001a\u00020T2\u0006\u0010^\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010lJ\u0017\u0010m\u001a\u00020\u00102\u0006\u0010N\u001a\u00028\u0000H\u0000¢\u0006\u0004\bn\u0010gJ3\u0010o\u001a\u00020T2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00152\u0010\b\u0002\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010rH\u0000¢\u0006\u0002\bsR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR/\u0010\u001f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0014\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010!R/\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R+\u0010+\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b5\u00106R+\u00107\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001b\u0010>\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\b?\u00109R\u001b\u0010A\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\bB\u00109R1\u0010D\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0004\bI\u0010\u001c\u0012\u0004\bE\u0010F\u001a\u0004\bG\u00109\"\u0004\bH\u0010;R/\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u001b\u0010K\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010(\u001a\u0004\bL\u00109R\u001b\u0010N\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bO\u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006v"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "initialValue", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchoredDragScope", "Landroidx/compose/material/AnchoredDragScope;", "<set-?>", "", "anchors", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "getAnimationTarget", "()Ljava/lang/Object;", "setAnimationTarget", "(Ljava/lang/Object;)V", "animationTarget$delegate", "closestValue", "getClosestValue$material_release", "closestValue$delegate", "Landroidx/compose/runtime/State;", "getConfirmValueChange$material_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "currentValue$delegate", "dragMutex", "Landroidx/compose/material/InternalMutatorMutex;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "Landroidx/compose/runtime/MutableFloatState;", "maxOffset", "getMaxOffset", "maxOffset$delegate", "minOffset", "getMinOffset", "minOffset$delegate", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset$annotations", "()V", "getOffset", "setOffset", "offset$delegate", "getPositionalThreshold$material_release", "progress", "getProgress", "progress$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "anchoredDrag", "", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "velocity", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "doAnchoredDrag", "hasAnchorForValue", "value", "(Ljava/lang/Object;)Z", "newOffsetForDelta", "newOffsetForDelta$material_release", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "trySnapTo$material_release", "updateAnchors", "newAnchors", "onAnchorsChanged", "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "updateAnchors$material_release", "AnchorChangedCallback", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState animationTarget$delegate;
    private final State closestValue$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final State maxOffset$delegate;
    private final State minOffset$delegate;
    private final MutableState offset$delegate;
    private final Function1<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final Function0<Float> velocityThreshold;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "onAnchorsChanged", "", "previousTargetValue", "previousAnchors", "", "", "newAnchors", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface AnchorChangedCallback<T> {
        void onAnchorsChanged(T t, Map<T, Float> map, Map<T, Float> map2);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmValueChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = velocityThreshold;
        this.animationSpec = animationSpec;
        this.confirmValueChange = confirmValueChange;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$closestValue$2(this));
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(Float.NaN), null, 2, null);
        this.offset$delegate = mutableStateOf$default2;
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new AnchoredDraggableState$progress$2(this));
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minOffset$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$minOffset$2(this));
        this.maxOffset$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$maxOffset$2(this));
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default4;
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float f, float f2) {
                this.this$0.setOffset(f);
                this.this$0.setLastVelocity(f2);
            }
        };
    }

    public final Function1<Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$material_release() {
        return this.velocityThreshold;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableState$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<T, Boolean> {
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

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, SpringSpec<Float> springSpec, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, (i & 8) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 16) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final T getClosestValue$material_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset$delegate.setValue(Float.valueOf(f));
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue()).floatValue();
    }

    public final float requireOffset() {
        if (!(!Float.isNaN(getOffset()))) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getAnimationTarget() != null;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset$delegate.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationTarget(T t) {
        this.animationTarget$delegate.setValue(t);
    }

    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final void setAnchors$material_release(Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$material_release$default(AnchoredDraggableState anchoredDraggableState, Map map, AnchorChangedCallback anchorChangedCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            anchorChangedCallback = null;
        }
        anchoredDraggableState.updateAnchors$material_release(map, anchorChangedCallback);
    }

    public final void updateAnchors$material_release(Map<T, Float> newAnchors, AnchorChangedCallback<T> anchorChangedCallback) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (Intrinsics.areEqual(getAnchors$material_release(), newAnchors)) {
            return;
        }
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        T targetValue = getTargetValue();
        boolean isEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(newAnchors);
        boolean z = getAnchors$material_release().get(getCurrentValue()) != null;
        if (isEmpty && z) {
            trySnapTo$material_release(getCurrentValue());
        } else if (anchorChangedCallback != null) {
            anchorChangedCallback.onAnchorsChanged(targetValue, anchors$material_release, newAnchors);
        }
    }

    public final boolean hasAnchorForValue(T t) {
        return getAnchors$material_release().containsKey(t);
    }

    public final Object settle(float f, Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f, continuation);
            return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return animateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float f, T t, float f2) {
        Object access$closestAnchor;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f3 = anchors$material_release.get(t);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (Intrinsics.areEqual(f3, f) || f3 == null) {
            return t;
        }
        if (f3.floatValue() < f) {
            if (f2 >= floatValue) {
                return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, true);
            }
            access$closestAnchor = AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, true);
            if (f < Math.abs(f3.floatValue() + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(((Number) MapsKt.getValue(anchors$material_release, access$closestAnchor)).floatValue() - f3.floatValue()))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-floatValue)) {
            return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, false);
        } else {
            access$closestAnchor = AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, false);
            float abs = Math.abs(f3.floatValue() - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(f3.floatValue() - ((Number) MapsKt.getValue(anchors$material_release, access$closestAnchor)).floatValue()))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return t;
                }
            } else if (f > abs) {
                return t;
            }
        }
        return (T) access$closestAnchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float f, T t) {
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f2 = anchors$material_release.get(t);
        if (Intrinsics.areEqual(f2, f) || f2 == null) {
            return t;
        }
        if (f2.floatValue() < f) {
            return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, true);
        }
        return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f, false);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object doAnchoredDrag = doAnchoredDrag(null, mutatePriority, function3, continuation);
        return doAnchoredDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doAnchoredDrag : Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function3, continuation);
    }

    public final Object anchoredDrag(T t, MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object doAnchoredDrag = doAnchoredDrag(t, mutatePriority, function3, continuation);
        return doAnchoredDrag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? doAnchoredDrag : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doAnchoredDrag(T t, MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new AnchoredDraggableState$doAnchoredDrag$2(t, this, mutatePriority, function3, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final float newOffsetForDelta$material_release(float f) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f, getMinOffset(), getMaxOffset());
    }

    public final float dispatchRawDelta(float f) {
        float newOffsetForDelta$material_release = newOffsetForDelta$material_release(f);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material_release);
        return newOffsetForDelta$material_release - offset;
    }

    public final boolean trySnapTo$material_release(T t) {
        return this.dragMutex.tryMutate(new AnchoredDraggableState$trySnapTo$1(this, t));
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jw\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/AnchoredDraggableState;", ExifInterface.GPS_DIRECTION_TRUE, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmValueChange, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$1.INSTANCE, new AnchoredDraggableState$Companion$Saver$2(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange));
        }
    }
}
