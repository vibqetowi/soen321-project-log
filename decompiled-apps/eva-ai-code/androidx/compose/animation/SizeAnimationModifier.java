package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AnimationModifier.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001-B\u001e\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020%*\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RO\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014X\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "animSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/CoroutineScope;)V", "<set-?>", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "animData", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifier$AnimData;)V", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimSpec", "()Landroidx/compose/animation/core/AnimationSpec;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startSize", "endSize", "", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "animateTo", "targetSize", "animateTo-mzRDjE0", "(J)J", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "AnimData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final MutableState animData$delegate;
    private final AnimationSpec<IntSize> animSpec;
    private Function2<? super IntSize, ? super IntSize, Unit> listener;
    private final CoroutineScope scope;

    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public SizeAnimationModifier(AnimationSpec<IntSize> animSpec, CoroutineScope scope) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.animSpec = animSpec;
        this.scope = scope;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animData$delegate = mutableStateOf$default;
    }

    public final Function2<IntSize, IntSize, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.listener = function2;
    }

    /* compiled from: AnimationModifier.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B$\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003ø\u0001\u0000J\u0019\u0010\u0010\u001a\u00020\u0004HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ6\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "startSize", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "J", "component1", "component2", "component2-YbymL2g", "copy", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "equals", "", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
        public static /* synthetic */ AnimData m331copyO0kMr_c$default(AnimData animData, Animatable animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i & 2) != 0) {
                j = animData.startSize;
            }
            return animData.m333copyO0kMr_c(animatable, j);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g  reason: not valid java name */
        public final long m332component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c  reason: not valid java name */
        public final AnimData m333copyO0kMr_c(Animatable<IntSize, AnimationVector2D> anim, long j) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            return new AnimData(anim, j, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimData) {
                AnimData animData = (AnimData) obj;
                return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m5765equalsimpl0(this.startSize, animData.startSize);
            }
            return false;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m5768hashCodeimpl(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m5770toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> anim, long j) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            this.anim = anim;
            this.startSize = j;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g  reason: not valid java name */
        public final long m334getStartSizeYbymL2g() {
            return this.startSize;
        }

        /* renamed from: setStartSize-ozmzZPI  reason: not valid java name */
        public final void m335setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }
    }

    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo298measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
        long m330animateTomzRDjE0 = m330animateTomzRDjE0(IntSizeKt.IntSize(mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight()));
        return MeasureScope.CC.layout$default(measure, IntSize.m5767getWidthimpl(m330animateTomzRDjE0), IntSize.m5766getHeightimpl(m330animateTomzRDjE0), null, new SizeAnimationModifier$measure$1(mo4545measureBRTryo0), 4, null);
    }

    /* renamed from: animateTo-mzRDjE0  reason: not valid java name */
    public final long m330animateTomzRDjE0(long j) {
        AnimData animData = getAnimData();
        if (animData != null) {
            if (!IntSize.m5765equalsimpl0(j, animData.getAnim().getTargetValue().m5771unboximpl())) {
                animData.m335setStartSizeozmzZPI(animData.getAnim().getValue().m5771unboximpl());
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SizeAnimationModifier$animateTo$data$1$1(animData, j, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m5759boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m5759boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m5771unboximpl();
    }
}
