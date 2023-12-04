package com.ifriend.ui.components.scrollable;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollableState;
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
/* compiled from: AutoScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.scrollable.AutoScrollKt$InfiniteAutoScrollEffect$1", f = "AutoScroll.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AutoScrollKt$InfiniteAutoScrollEffect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $scrollDxPx;
    final /* synthetic */ ScrollableState $this_InfiniteAutoScrollEffect;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollKt$InfiniteAutoScrollEffect$1(boolean z, ScrollableState scrollableState, float f, AnimationSpec<Float> animationSpec, Continuation<? super AutoScrollKt$InfiniteAutoScrollEffect$1> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$this_InfiniteAutoScrollEffect = scrollableState;
        this.$scrollDxPx = f;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoScrollKt$InfiniteAutoScrollEffect$1(this.$enabled, this.$this_InfiniteAutoScrollEffect, this.$scrollDxPx, this.$animationSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoScrollKt$InfiniteAutoScrollEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object autoScroll;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0 || i == 1) {
            ResultKt.throwOnFailure(obj);
            while (this.$enabled) {
                this.label = 1;
                autoScroll = AutoScrollKt.autoScroll(this.$this_InfiniteAutoScrollEffect, this.$scrollDxPx, this.$animationSpec, this);
                if (autoScroll == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
