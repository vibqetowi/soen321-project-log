package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics;
import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import java.util.Iterator;
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
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InfoOnboardingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingViewModel$clickButton$1", f = "InfoOnboardingViewModel.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class InfoOnboardingViewModel$clickButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InfoOnboardingAction $action;
    final /* synthetic */ InfoOnboardingSlide $slide;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InfoOnboardingViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingViewModel$clickButton$1(InfoOnboardingViewModel infoOnboardingViewModel, InfoOnboardingSlide infoOnboardingSlide, InfoOnboardingAction infoOnboardingAction, Continuation<? super InfoOnboardingViewModel$clickButton$1> continuation) {
        super(2, continuation);
        this.this$0 = infoOnboardingViewModel;
        this.$slide = infoOnboardingSlide;
        this.$action = infoOnboardingAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfoOnboardingViewModel$clickButton$1 infoOnboardingViewModel$clickButton$1 = new InfoOnboardingViewModel$clickButton$1(this.this$0, this.$slide, this.$action, continuation);
        infoOnboardingViewModel$clickButton$1.L$0 = obj;
        return infoOnboardingViewModel$clickButton$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfoOnboardingViewModel$clickButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InfoOnboardingAnalytics infoOnboardingAnalytics;
        InfoOnboardingSlideUseCase infoOnboardingSlideUseCase;
        List list;
        List list2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            infoOnboardingAnalytics = this.this$0.analytics;
            infoOnboardingAnalytics.userSelectedSlide(this.$slide, this.$action);
            infoOnboardingSlideUseCase = this.this$0.infoOnboardingSlideUseCase;
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (infoOnboardingSlideUseCase.saveScreenAsShown(Reflection.getOrCreateKotlinClass(this.$slide.getClass()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        list = this.this$0.screensToShow;
        InfoOnboardingSlide infoOnboardingSlide = this.$slide;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((InfoOnboardingSlide) it.next()).getClass() == infoOnboardingSlide.getClass()) {
                break;
            }
            i2++;
        }
        list2 = this.this$0.screensToShow;
        InfoOnboardingSlide infoOnboardingSlide2 = (InfoOnboardingSlide) CollectionsKt.getOrNull(list2, i2 + 1);
        if (infoOnboardingSlide2 == null) {
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        this.this$0.setSlide(infoOnboardingSlide2);
        return Unit.INSTANCE;
    }
}
