package com.ifriend.registration.presentation.ui.email;

import com.ifriend.registration.presentation.databinding.FragmentEmailRegistrationBinding;
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
/* compiled from: EmailRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.email.EmailRegistrationFragment$setOnClickListeners$1$2$1", f = "EmailRegistrationFragment.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class EmailRegistrationFragment$setOnClickListeners$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentEmailRegistrationBinding $this_with;
    int label;
    final /* synthetic */ EmailRegistrationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRegistrationFragment$setOnClickListeners$1$2$1(EmailRegistrationFragment emailRegistrationFragment, FragmentEmailRegistrationBinding fragmentEmailRegistrationBinding, Continuation<? super EmailRegistrationFragment$setOnClickListeners$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = emailRegistrationFragment;
        this.$this_with = fragmentEmailRegistrationBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailRegistrationFragment$setOnClickListeners$1$2$1(this.this$0, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailRegistrationFragment$setOnClickListeners$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmailRegistrationViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            this.label = 1;
            obj = viewModel.signUp(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.navigateNext();
        } else {
            this.this$0.showError();
            this.$this_with.next.setLoading(false);
        }
        return Unit.INSTANCE;
    }
}
