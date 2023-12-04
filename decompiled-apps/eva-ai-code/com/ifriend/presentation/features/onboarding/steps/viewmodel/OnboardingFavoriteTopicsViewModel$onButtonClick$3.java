package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.models.onboarding.FavoriteTopic;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
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
/* compiled from: OnboardingFavoriteTopicsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingFavoriteTopicsViewModel$onButtonClick$3", f = "OnboardingFavoriteTopicsViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class OnboardingFavoriteTopicsViewModel$onButtonClick$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectButtonWithImageUiParams $buttonUiParams;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ OnboardingFavoriteTopicsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFavoriteTopicsViewModel$onButtonClick$3(SelectButtonWithImageUiParams selectButtonWithImageUiParams, String str, OnboardingFavoriteTopicsViewModel onboardingFavoriteTopicsViewModel, Continuation<? super OnboardingFavoriteTopicsViewModel$onButtonClick$3> continuation) {
        super(2, continuation);
        this.$buttonUiParams = selectButtonWithImageUiParams;
        this.$id = str;
        this.this$0 = onboardingFavoriteTopicsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingFavoriteTopicsViewModel$onButtonClick$3(this.$buttonUiParams, this.$id, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingFavoriteTopicsViewModel$onButtonClick$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FavoriteTopic favoriteTopic;
        OnboardingAnalytics onboardingAnalytics;
        OnboardingAnswersRepository onboardingAnswersRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String id = this.$buttonUiParams.getId();
            switch (id.hashCode()) {
                case -1323665200:
                    if (id.equals("dreams")) {
                        favoriteTopic = FavoriteTopic.dreams;
                        onboardingAnalytics = this.this$0.onboardingAnalytics;
                        onboardingAnalytics.favoriteTopic(favoriteTopic);
                        onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                        this.label = 1;
                        if (onboardingAnswersRepository.updateFavoriteTopic(favoriteTopic, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    String str = this.$id;
                    throw new IllegalArgumentException("Cannot find a button with id=" + str + "!");
                case 3377875:
                    if (id.equals("news")) {
                        favoriteTopic = FavoriteTopic.gossips;
                        onboardingAnalytics = this.this$0.onboardingAnalytics;
                        onboardingAnalytics.favoriteTopic(favoriteTopic);
                        onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                        this.label = 1;
                        if (onboardingAnswersRepository.updateFavoriteTopic(favoriteTopic, this) == coroutine_suspended) {
                        }
                    }
                    String str2 = this.$id;
                    throw new IllegalArgumentException("Cannot find a button with id=" + str2 + "!");
                case 121454934:
                    if (id.equals("hot_topics")) {
                        favoriteTopic = FavoriteTopic.hot;
                        onboardingAnalytics = this.this$0.onboardingAnalytics;
                        onboardingAnalytics.favoriteTopic(favoriteTopic);
                        onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                        this.label = 1;
                        if (onboardingAnswersRepository.updateFavoriteTopic(favoriteTopic, this) == coroutine_suspended) {
                        }
                    }
                    String str22 = this.$id;
                    throw new IllegalArgumentException("Cannot find a button with id=" + str22 + "!");
                case 1385652420:
                    if (id.equals("routine")) {
                        favoriteTopic = FavoriteTopic.routine;
                        onboardingAnalytics = this.this$0.onboardingAnalytics;
                        onboardingAnalytics.favoriteTopic(favoriteTopic);
                        onboardingAnswersRepository = this.this$0.onboardingAnswersRepository;
                        this.label = 1;
                        if (onboardingAnswersRepository.updateFavoriteTopic(favoriteTopic, this) == coroutine_suspended) {
                        }
                    }
                    String str222 = this.$id;
                    throw new IllegalArgumentException("Cannot find a button with id=" + str222 + "!");
                default:
                    String str2222 = this.$id;
                    throw new IllegalArgumentException("Cannot find a button with id=" + str2222 + "!");
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
