package com.ifriend.app.ui.splash;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.models.ConfirmEmailData;
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
/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.app.ui.splash.SplashViewModel$init$1", f = "SplashViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SplashViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmEmailData $confirmEmailData;
    int label;
    final /* synthetic */ SplashViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$init$1(ConfirmEmailData confirmEmailData, SplashViewModel splashViewModel, Continuation<? super SplashViewModel$init$1> continuation) {
        super(2, continuation);
        this.$confirmEmailData = confirmEmailData;
        this.this$0 = splashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashViewModel$init$1(this.$confirmEmailData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConfirmEmailRepository confirmEmailRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConfirmEmailData confirmEmailData = this.$confirmEmailData;
            if (confirmEmailData != null) {
                confirmEmailRepository = this.this$0.confirmEmailRepository;
                this.label = 1;
                if (confirmEmailRepository.confirm(confirmEmailData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
