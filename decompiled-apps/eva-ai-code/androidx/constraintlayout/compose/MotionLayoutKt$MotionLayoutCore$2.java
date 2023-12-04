package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelResult;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2", f = "MotionLayout.kt", i = {}, l = {237, 247}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class MotionLayoutKt$MotionLayoutCore$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$2(Channel<ConstraintSet> channel, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super MotionLayoutKt$MotionLayoutCore$2> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = function0;
        this.$animateToEnd$delegate = mutableState;
        this.$start$delegate = mutableState2;
        this.$end$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MotionLayoutKt$MotionLayoutCore$2(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MotionLayoutKt$MotionLayoutCore$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:11:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b6 -> B:37:0x00b9). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChannelIterator<ConstraintSet> it;
        MotionLayoutKt$MotionLayoutCore$2 motionLayoutKt$MotionLayoutCore$2;
        Object obj2;
        boolean m5917MotionLayoutCore$lambda16;
        boolean m5917MotionLayoutCore$lambda162;
        boolean m5917MotionLayoutCore$lambda163;
        boolean m5917MotionLayoutCore$lambda164;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$channel.iterator();
            motionLayoutKt$MotionLayoutCore$2 = this;
            motionLayoutKt$MotionLayoutCore$2.L$0 = it;
            motionLayoutKt$MotionLayoutCore$2.label = 1;
            obj2 = it.hasNext(motionLayoutKt$MotionLayoutCore$2);
            if (obj2 == coroutine_suspended) {
            }
            if (!((Boolean) obj2).booleanValue()) {
            }
        } else if (i == 1) {
            it = (ChannelIterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            motionLayoutKt$MotionLayoutCore$2 = this;
            if (!((Boolean) obj2).booleanValue()) {
            }
        } else if (i == 2) {
            it = (ChannelIterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            motionLayoutKt$MotionLayoutCore$2 = this;
            MutableState<Boolean> mutableState = motionLayoutKt$MotionLayoutCore$2.$animateToEnd$delegate;
            m5917MotionLayoutCore$lambda164 = MotionLayoutKt.m5917MotionLayoutCore$lambda16(mutableState);
            MotionLayoutKt.m5918MotionLayoutCore$lambda17(mutableState, !m5917MotionLayoutCore$lambda164);
            Function0<Unit> function0 = motionLayoutKt$MotionLayoutCore$2.$finishedAnimationListener;
            if (function0 != null) {
                function0.invoke();
            }
            motionLayoutKt$MotionLayoutCore$2.L$0 = it;
            motionLayoutKt$MotionLayoutCore$2.label = 1;
            obj2 = it.hasNext(motionLayoutKt$MotionLayoutCore$2);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj2).booleanValue()) {
                ConstraintSet next = it.next();
                ConstraintSet constraintSet = (ConstraintSet) ChannelResult.m8832getOrNullimpl(motionLayoutKt$MotionLayoutCore$2.$channel.mo8822tryReceivePtdJZtk());
                if (constraintSet != null) {
                    next = constraintSet;
                }
                m5917MotionLayoutCore$lambda16 = MotionLayoutKt.m5917MotionLayoutCore$lambda16(motionLayoutKt$MotionLayoutCore$2.$animateToEnd$delegate);
                float f = m5917MotionLayoutCore$lambda16 ? 1.0f : 0.0f;
                m5917MotionLayoutCore$lambda162 = MotionLayoutKt.m5917MotionLayoutCore$lambda16(motionLayoutKt$MotionLayoutCore$2.$animateToEnd$delegate);
                if (!Intrinsics.areEqual(next, m5917MotionLayoutCore$lambda162 ? MotionLayoutKt.m5921MotionLayoutCore$lambda8(motionLayoutKt$MotionLayoutCore$2.$start$delegate) : MotionLayoutKt.m5915MotionLayoutCore$lambda11(motionLayoutKt$MotionLayoutCore$2.$end$delegate))) {
                    m5917MotionLayoutCore$lambda163 = MotionLayoutKt.m5917MotionLayoutCore$lambda16(motionLayoutKt$MotionLayoutCore$2.$animateToEnd$delegate);
                    if (!m5917MotionLayoutCore$lambda163) {
                        motionLayoutKt$MotionLayoutCore$2.$start$delegate.setValue(next);
                    } else {
                        motionLayoutKt$MotionLayoutCore$2.$end$delegate.setValue(next);
                    }
                    motionLayoutKt$MotionLayoutCore$2.L$0 = it;
                    motionLayoutKt$MotionLayoutCore$2.label = 2;
                    if (Animatable.animateTo$default(motionLayoutKt$MotionLayoutCore$2.$progress, Boxing.boxFloat(f), motionLayoutKt$MotionLayoutCore$2.$animationSpec, null, null, motionLayoutKt$MotionLayoutCore$2, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MutableState<Boolean> mutableState2 = motionLayoutKt$MotionLayoutCore$2.$animateToEnd$delegate;
                    m5917MotionLayoutCore$lambda164 = MotionLayoutKt.m5917MotionLayoutCore$lambda16(mutableState2);
                    MotionLayoutKt.m5918MotionLayoutCore$lambda17(mutableState2, !m5917MotionLayoutCore$lambda164);
                    Function0<Unit> function02 = motionLayoutKt$MotionLayoutCore$2.$finishedAnimationListener;
                    if (function02 != null) {
                    }
                }
                motionLayoutKt$MotionLayoutCore$2.L$0 = it;
                motionLayoutKt$MotionLayoutCore$2.label = 1;
                obj2 = it.hasNext(motionLayoutKt$MotionLayoutCore$2);
                if (obj2 == coroutine_suspended) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return Unit.INSTANCE;
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
