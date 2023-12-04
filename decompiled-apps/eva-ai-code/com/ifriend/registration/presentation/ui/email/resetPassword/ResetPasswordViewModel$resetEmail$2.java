package com.ifriend.registration.presentation.ui.email.resetPassword;

import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.socket.notifications.ResetPasswordLinkSentNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetPasswordViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordViewModel$resetEmail$2", f = "ResetPasswordViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ResetPasswordViewModel$resetEmail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ResetPasswordViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel$resetEmail$2(ResetPasswordViewModel resetPasswordViewModel, Continuation<? super ResetPasswordViewModel$resetEmail$2> continuation) {
        super(2, continuation);
        this.this$0 = resetPasswordViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetPasswordViewModel$resetEmail$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetPasswordViewModel$resetEmail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResetPasswordRepository resetPasswordRepository;
        InternalNotificationHandler internalNotificationHandler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            resetPasswordRepository = this.this$0.resetPasswordRepository;
            this.label = 1;
            obj = resetPasswordRepository.resetPassword(this.this$0.currentState().getEmail(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            internalNotificationHandler = this.this$0.internalNotificationHandler;
            internalNotificationHandler.handle(ResetPasswordLinkSentNotification.INSTANCE);
            this.this$0.postEvent(PasswordResetEvent.INSTANCE);
        } else {
            this.this$0.changeState(AnonymousClass1.INSTANCE);
            this.this$0.postEvent(EmailNotFoundEvent.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResetPasswordViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.email.resetPassword.ResetPasswordViewModel$resetEmail$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ResetPasswordState, ResetPasswordState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ResetPasswordState invoke(ResetPasswordState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ResetPasswordState.copy$default(it, null, false, false, 3, null);
        }
    }
}
