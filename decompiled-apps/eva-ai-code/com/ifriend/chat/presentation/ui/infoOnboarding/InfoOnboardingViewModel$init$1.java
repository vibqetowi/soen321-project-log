package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfoOnboardingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingViewModel$init$1", f = "InfoOnboardingViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InfoOnboardingViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InfoOnboardingViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingViewModel$init$1(InfoOnboardingViewModel infoOnboardingViewModel, Continuation<? super InfoOnboardingViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = infoOnboardingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InfoOnboardingViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfoOnboardingViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InfoOnboardingSlideUseCase infoOnboardingSlideUseCase;
        InfoOnboardingViewModel infoOnboardingViewModel;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InfoOnboardingViewModel infoOnboardingViewModel2 = this.this$0;
            infoOnboardingSlideUseCase = infoOnboardingViewModel2.infoOnboardingSlideUseCase;
            this.L$0 = infoOnboardingViewModel2;
            this.label = 1;
            Object needToShowInfoOnboardingScreens = infoOnboardingSlideUseCase.getNeedToShowInfoOnboardingScreens(this);
            if (needToShowInfoOnboardingScreens == coroutine_suspended) {
                return coroutine_suspended;
            }
            infoOnboardingViewModel = infoOnboardingViewModel2;
            obj = needToShowInfoOnboardingScreens;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            infoOnboardingViewModel = (InfoOnboardingViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        infoOnboardingViewModel.screensToShow = (List) obj;
        list = this.this$0.screensToShow;
        InfoOnboardingSlide infoOnboardingSlide = (InfoOnboardingSlide) CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (infoOnboardingSlide == null) {
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        this.this$0.setSlide(infoOnboardingSlide);
        return Unit.INSTANCE;
    }
}
