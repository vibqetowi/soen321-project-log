package com.ifriend.chat.presentation.ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackgroundDelegateManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.BackgroundDelegateManager$hideBlurWithDelay$1", f = "BackgroundDelegateManager.kt", i = {0}, l = {68}, m = "invokeSuspend", n = {"blurView"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BackgroundDelegateManager$hideBlurWithDelay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BackgroundDelegateManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundDelegateManager$hideBlurWithDelay$1(BackgroundDelegateManager backgroundDelegateManager, Continuation<? super BackgroundDelegateManager$hideBlurWithDelay$1> continuation) {
        super(2, continuation);
        this.this$0 = backgroundDelegateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackgroundDelegateManager$hideBlurWithDelay$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackgroundDelegateManager$hideBlurWithDelay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        View view;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            function0 = this.this$0.provideBackgroundView;
            View view2 = (View) function0.invoke();
            view2.setClickable(false);
            this.L$0 = view2;
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            view = view2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            view = (View) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        view.setBackgroundColor(view.getContext().getColor(17170445));
        return Unit.INSTANCE;
    }
}
