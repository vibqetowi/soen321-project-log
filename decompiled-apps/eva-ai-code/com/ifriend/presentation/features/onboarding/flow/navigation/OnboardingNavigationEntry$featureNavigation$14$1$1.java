package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.runtime.State;
import com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$featureNavigation$14$1$1", f = "OnboardingNavigationEntry.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$featureNavigation$14$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onBotAvatarChange;
    final /* synthetic */ State<OnboardingBotPagerState> $state$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingNavigationEntry$featureNavigation$14$1$1(Function1<? super String, Unit> function1, State<OnboardingBotPagerState> state, Continuation<? super OnboardingNavigationEntry$featureNavigation$14$1$1> continuation) {
        super(2, continuation);
        this.$onBotAvatarChange = function1;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingNavigationEntry$featureNavigation$14$1$1(this.$onBotAvatarChange, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingNavigationEntry$featureNavigation$14$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnboardingBotPagerState invoke$lambda$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<String, Unit> function1 = this.$onBotAvatarChange;
        invoke$lambda$0 = OnboardingNavigationEntry$featureNavigation$14.invoke$lambda$0(this.$state$delegate);
        OnboardingBotPagerState.Bot currentBot = invoke$lambda$0.getCurrentBot();
        String imageBgUrl = currentBot != null ? currentBot.getImageBgUrl() : null;
        if (imageBgUrl == null) {
            imageBgUrl = "";
        }
        function1.invoke(imageBgUrl);
        return Unit.INSTANCE;
    }
}
