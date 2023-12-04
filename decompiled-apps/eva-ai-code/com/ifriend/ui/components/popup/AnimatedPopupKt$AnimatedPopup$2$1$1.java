package com.ifriend.ui.components.popup;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.popup.AnimatedPopupKt$AnimatedPopup$2$1$1", f = "AnimatedPopup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AnimatedPopupKt$AnimatedPopup$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $internalVisible$delegate;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ MutableTransitionState<Boolean> $transition;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedPopupKt$AnimatedPopup$2$1$1(MutableTransitionState<Boolean> mutableTransitionState, boolean z, MutableState<Boolean> mutableState, Continuation<? super AnimatedPopupKt$AnimatedPopup$2$1$1> continuation) {
        super(2, continuation);
        this.$transition = mutableTransitionState;
        this.$isVisible = z;
        this.$internalVisible$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnimatedPopupKt$AnimatedPopup$2$1$1(this.$transition, this.$isVisible, this.$internalVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnimatedPopupKt$AnimatedPopup$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$transition.isIdle() && !this.$transition.getCurrentState().booleanValue() && !this.$isVisible) {
            AnimatedPopupKt.AnimatedPopup$lambda$2(this.$internalVisible$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
