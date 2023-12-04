package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$4", f = "ConstraintLayout.kt", i = {}, l = {231, PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ MutableState<Integer> $direction;
    final /* synthetic */ MutableState<ConstraintSet> $endConstraint$delegate;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $startConstraint$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$4(Channel<ConstraintSet> channel, MutableState<Integer> mutableState, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, Continuation<? super ConstraintLayoutKt$ConstraintLayout$4> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$direction = mutableState;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = function0;
        this.$startConstraint$delegate = mutableState2;
        this.$endConstraint$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintLayoutKt$ConstraintLayout$4(this.$channel, this.$direction, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$startConstraint$delegate, this.$endConstraint$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConstraintLayoutKt$ConstraintLayout$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0082 -> B:11:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c2 -> B:33:0x00c5). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChannelIterator<ConstraintSet> it;
        ConstraintLayoutKt$ConstraintLayout$4 constraintLayoutKt$ConstraintLayout$4;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$channel.iterator();
            constraintLayoutKt$ConstraintLayout$4 = this;
            constraintLayoutKt$ConstraintLayout$4.L$0 = it;
            constraintLayoutKt$ConstraintLayout$4.label = 1;
            obj2 = it.hasNext(constraintLayoutKt$ConstraintLayout$4);
            if (obj2 == coroutine_suspended) {
            }
            if (!((Boolean) obj2).booleanValue()) {
            }
        } else if (i == 1) {
            it = (ChannelIterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            constraintLayoutKt$ConstraintLayout$4 = this;
            if (!((Boolean) obj2).booleanValue()) {
            }
        } else if (i == 2) {
            it = (ChannelIterator) this.L$0;
            ResultKt.throwOnFailure(obj);
            constraintLayoutKt$ConstraintLayout$4 = this;
            MutableState<Integer> mutableState = constraintLayoutKt$ConstraintLayout$4.$direction;
            mutableState.setValue(Boxing.boxInt(mutableState.getValue().intValue() != 1 ? 0 : 1));
            Function0<Unit> function0 = constraintLayoutKt$ConstraintLayout$4.$finishedAnimationListener;
            if (function0 != null) {
                function0.invoke();
            }
            constraintLayoutKt$ConstraintLayout$4.L$0 = it;
            constraintLayoutKt$ConstraintLayout$4.label = 1;
            obj2 = it.hasNext(constraintLayoutKt$ConstraintLayout$4);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj2).booleanValue()) {
                ConstraintSet next = it.next();
                ConstraintSet constraintSet = (ConstraintSet) ChannelResult.m8832getOrNullimpl(constraintLayoutKt$ConstraintLayout$4.$channel.mo8822tryReceivePtdJZtk());
                if (constraintSet != null) {
                    next = constraintSet;
                }
                if (!Intrinsics.areEqual(next, constraintLayoutKt$ConstraintLayout$4.$direction.getValue().intValue() == 1 ? ConstraintLayoutKt.m5891ConstraintLayout$lambda6(constraintLayoutKt$ConstraintLayout$4.$startConstraint$delegate) : ConstraintLayoutKt.m5893ConstraintLayout$lambda9(constraintLayoutKt$ConstraintLayout$4.$endConstraint$delegate))) {
                    if (constraintLayoutKt$ConstraintLayout$4.$direction.getValue().intValue() != 1) {
                        constraintLayoutKt$ConstraintLayout$4.$startConstraint$delegate.setValue(next);
                    } else {
                        constraintLayoutKt$ConstraintLayout$4.$endConstraint$delegate.setValue(next);
                    }
                    constraintLayoutKt$ConstraintLayout$4.L$0 = it;
                    constraintLayoutKt$ConstraintLayout$4.label = 2;
                    if (Animatable.animateTo$default(constraintLayoutKt$ConstraintLayout$4.$progress, Boxing.boxFloat(constraintLayoutKt$ConstraintLayout$4.$direction.getValue().intValue()), constraintLayoutKt$ConstraintLayout$4.$animationSpec, null, null, constraintLayoutKt$ConstraintLayout$4, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MutableState<Integer> mutableState2 = constraintLayoutKt$ConstraintLayout$4.$direction;
                    mutableState2.setValue(Boxing.boxInt(mutableState2.getValue().intValue() != 1 ? 0 : 1));
                    Function0<Unit> function02 = constraintLayoutKt$ConstraintLayout$4.$finishedAnimationListener;
                    if (function02 != null) {
                    }
                }
                constraintLayoutKt$ConstraintLayout$4.L$0 = it;
                constraintLayoutKt$ConstraintLayout$4.label = 1;
                obj2 = it.hasNext(constraintLayoutKt$ConstraintLayout$4);
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
