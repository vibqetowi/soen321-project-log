package com.ifriend.chat.presentation.ui.infoOnboarding;

import androidx.activity.compose.ManagedActivityResultLauncher;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InfoOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1", f = "InfoOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $launcher;
    final /* synthetic */ InfoOnboardingSlide $screen;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1(ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, InfoOnboardingSlide infoOnboardingSlide, Continuation<? super InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.$launcher = managedActivityResultLauncher;
        this.$screen = infoOnboardingSlide;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1(this.$launcher, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$launcher.launch(((InfoOnboardingSlide.PermissionRequest) this.$screen).getPermission());
        return Unit.INSTANCE;
    }
}
