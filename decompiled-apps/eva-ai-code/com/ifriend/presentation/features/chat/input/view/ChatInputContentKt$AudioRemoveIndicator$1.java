package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
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
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$AudioRemoveIndicator$1", f = "ChatInputContent.kt", i = {}, l = {494, 503}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatInputContentKt$AudioRemoveIndicator$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatedProgress;
    final /* synthetic */ boolean $cancelled;
    final /* synthetic */ Function0<Unit> $onAnimationEnd;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$AudioRemoveIndicator$1(boolean z, Animatable<Float, AnimationVector1D> animatable, Function0<Unit> function0, Continuation<? super ChatInputContentKt$AudioRemoveIndicator$1> continuation) {
        super(2, continuation);
        this.$cancelled = z;
        this.$animatedProgress = animatable;
        this.$onAnimationEnd = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputContentKt$AudioRemoveIndicator$1(this.$cancelled, this.$animatedProgress, this.$onAnimationEnd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputContentKt$AudioRemoveIndicator$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$cancelled) {
                this.label = 1;
                if (Animatable.animateTo$default(this.$animatedProgress, Boxing.boxFloat(1.0f), AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null), null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$onAnimationEnd.invoke();
            } else {
                this.label = 2;
                if (this.$animatedProgress.snapTo(Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.$onAnimationEnd.invoke();
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
