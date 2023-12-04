package com.ifriend.presentation.features.onboarding.steps.viewmodel.factory;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import com.ifriend.domain.logic.onboarding.GetOnboardingConfigurationChatsUseCase;
import com.ifriend.domain.onboarding.OnboardingAnalytics;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi;
import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingAskEveryDayViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingAwesomeViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotAgeViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotCharacterViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotGenderViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotNameViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPagerViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotPersonalityViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingBotVoiceViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingFavoriteTopicsViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingJokesViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingLastStepViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingLetKnowMoreViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserBirthDateViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserGenderViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserInterestsViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingUserNameViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingWelcomeViewModel;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: OnboardingStepViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00010B©\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(¢\u0006\u0002\u0010)J%\u0010*\u001a\u0002H+\"\b\b\u0000\u0010+*\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H+0.H\u0016¢\u0006\u0002\u0010/R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "changeBotAgeUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;", "changeBotGenderUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;", "changeBotNameUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;", "changeUserAgeUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;", "changeUserGenderUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "changeUserNameUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;", "onboardingAnalytics", "Lcom/ifriend/domain/onboarding/OnboardingAnalytics;", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "mapper", "Lcom/ifriend/presentation/common/mappers/ChatInterestsTypeMapperUi;", "getOnboardingConfigurationChatsUseCase", "Lcom/ifriend/domain/logic/onboarding/GetOnboardingConfigurationChatsUseCase;", "isMultiChatEnabledUseCase", "Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/MutableSharedFlow;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;Lcom/ifriend/domain/onboarding/OnboardingAnalytics;Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/presentation/common/mappers/ChatInterestsTypeMapperUi;Lcom/ifriend/domain/logic/onboarding/GetOnboardingConfigurationChatsUseCase;Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingStepViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final BotRepository botRepository;
    private final ChangeBotAgeUseCase changeBotAgeUseCase;
    private final ChangeBotGenderUseCase changeBotGenderUseCase;
    private final ChangeBotNameUseCase changeBotNameUseCase;
    private final ChangeUserAgeUseCase changeUserAgeUseCase;
    private final ChangeUserGenderUseCase changeUserGenderUseCase;
    private final ChangeUserNameUseCase changeUserNameUseCase;
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final DispatcherProvider dispatcherProvider;
    private final GetBotUseCase getBotUseCase;
    private final GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase;
    private final IsMultiChatEnabledUseCase isMultiChatEnabledUseCase;
    private final ChatInterestsTypeMapperUi mapper;
    private final OnboardingAnalytics onboardingAnalytics;
    private final OnboardingAnswersRepository onboardingAnswersRepository;
    private final MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow;
    private final CoroutineScope onboardingScope;
    private final ResourceProvider resourceProvider;
    private final UserRepository userRepository;

    /* compiled from: OnboardingStepViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/onboarding/steps/viewmodel/factory/OnboardingStepViewModelFactory;", "onboardingScope", "Lkotlinx/coroutines/CoroutineScope;", "onboardingEventsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        OnboardingStepViewModelFactory create(CoroutineScope coroutineScope, MutableSharedFlow<OnboardingStepEvent> mutableSharedFlow);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
    }

    @AssistedInject
    public OnboardingStepViewModelFactory(@Assisted CoroutineScope onboardingScope, @Assisted MutableSharedFlow<OnboardingStepEvent> onboardingEventsFlow, ResourceProvider resourceProvider, DispatcherProvider dispatcherProvider, GetBotUseCase getBotUseCase, ChangeBotAgeUseCase changeBotAgeUseCase, ChangeBotGenderUseCase changeBotGenderUseCase, ChangeBotNameUseCase changeBotNameUseCase, ChangeUserAgeUseCase changeUserAgeUseCase, ChangeUserGenderUseCase changeUserGenderUseCase, ChangeUserNameUseCase changeUserNameUseCase, OnboardingAnalytics onboardingAnalytics, OnboardingAnswersRepository onboardingAnswersRepository, BotRepository botRepository, UserRepository userRepository, ChatInterestsTypeMapperUi mapper, GetOnboardingConfigurationChatsUseCase getOnboardingConfigurationChatsUseCase, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource) {
        Intrinsics.checkNotNullParameter(onboardingScope, "onboardingScope");
        Intrinsics.checkNotNullParameter(onboardingEventsFlow, "onboardingEventsFlow");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(changeBotAgeUseCase, "changeBotAgeUseCase");
        Intrinsics.checkNotNullParameter(changeBotGenderUseCase, "changeBotGenderUseCase");
        Intrinsics.checkNotNullParameter(changeBotNameUseCase, "changeBotNameUseCase");
        Intrinsics.checkNotNullParameter(changeUserAgeUseCase, "changeUserAgeUseCase");
        Intrinsics.checkNotNullParameter(changeUserGenderUseCase, "changeUserGenderUseCase");
        Intrinsics.checkNotNullParameter(changeUserNameUseCase, "changeUserNameUseCase");
        Intrinsics.checkNotNullParameter(onboardingAnalytics, "onboardingAnalytics");
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(getOnboardingConfigurationChatsUseCase, "getOnboardingConfigurationChatsUseCase");
        Intrinsics.checkNotNullParameter(isMultiChatEnabledUseCase, "isMultiChatEnabledUseCase");
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        this.onboardingScope = onboardingScope;
        this.onboardingEventsFlow = onboardingEventsFlow;
        this.resourceProvider = resourceProvider;
        this.dispatcherProvider = dispatcherProvider;
        this.getBotUseCase = getBotUseCase;
        this.changeBotAgeUseCase = changeBotAgeUseCase;
        this.changeBotGenderUseCase = changeBotGenderUseCase;
        this.changeBotNameUseCase = changeBotNameUseCase;
        this.changeUserAgeUseCase = changeUserAgeUseCase;
        this.changeUserGenderUseCase = changeUserGenderUseCase;
        this.changeUserNameUseCase = changeUserNameUseCase;
        this.onboardingAnalytics = onboardingAnalytics;
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.botRepository = botRepository;
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.getOnboardingConfigurationChatsUseCase = getOnboardingConfigurationChatsUseCase;
        this.isMultiChatEnabledUseCase = isMultiChatEnabledUseCase;
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        T onboardingWelcomeViewModel;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.areEqual(modelClass, OnboardingAwesomeViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingAwesomeViewModel(this.resourceProvider, this.getBotUseCase, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotAgeViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotAgeViewModel(this.changeBotAgeUseCase, this.getBotUseCase, this.onboardingAnalytics, this.onboardingScope, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotCharacterViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotCharacterViewModel(this.onboardingScope, this.onboardingAnalytics, this.onboardingAnswersRepository, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotGenderViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotGenderViewModel(this.onboardingScope, this.changeBotGenderUseCase, this.getBotUseCase, this.onboardingAnalytics, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotNameViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotNameViewModel(this.resourceProvider, this.dispatcherProvider, this.onboardingAnalytics, this.changeBotNameUseCase, this.getBotUseCase, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotPersonalityViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotPersonalityViewModel(this.onboardingScope, this.onboardingAnalytics, this.botRepository, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotVoiceViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotVoiceViewModel(this.onboardingAnalytics, this.onboardingAnswersRepository, this.onboardingScope, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingFavoriteTopicsViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingFavoriteTopicsViewModel(this.onboardingAnswersRepository, this.onboardingAnalytics, this.onboardingScope, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingUserInterestsViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingUserInterestsViewModel(this.onboardingAnswersRepository, this.onboardingAnalytics, this.resourceProvider, this.dispatcherProvider, this.mapper, this.onboardingScope, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingJokesViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingJokesViewModel(this.onboardingScope, this.onboardingAnalytics, this.resourceProvider, this.onboardingAnswersRepository, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingLastStepViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingLastStepViewModel(this.onboardingAnalytics, this.resourceProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingLetKnowMoreViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingLetKnowMoreViewModel(this.onboardingAnalytics, this.resourceProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingAskEveryDayViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingAskEveryDayViewModel(this.onboardingScope, this.onboardingAnalytics, this.resourceProvider, this.onboardingAnswersRepository, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingBotPagerViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingBotPagerViewModel(this.onboardingAnalytics, this.getOnboardingConfigurationChatsUseCase, this.onboardingAnswersRepository, this.onboardingScope, this.getBotUseCase, this.isMultiChatEnabledUseCase, this.chatConfigsMemoryCachedSource, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingUserBirthDateViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingUserBirthDateViewModel(this.changeUserAgeUseCase, this.onboardingAnalytics, this.onboardingScope, this.resourceProvider, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingUserGenderViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingUserGenderViewModel(this.onboardingScope, this.changeUserGenderUseCase, this.onboardingAnalytics, this.resourceProvider, this.userRepository, this.dispatcherProvider, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingUserNameViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingUserNameViewModel(this.resourceProvider, this.dispatcherProvider, this.userRepository, this.onboardingAnalytics, this.changeUserNameUseCase, this.onboardingEventsFlow);
        } else if (Intrinsics.areEqual(modelClass, OnboardingWelcomeViewModel.class)) {
            onboardingWelcomeViewModel = new OnboardingWelcomeViewModel(this.userRepository, this.onboardingAnalytics, this.resourceProvider, this.onboardingEventsFlow);
        } else {
            String simpleName = getClass().getSimpleName();
            throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
        }
        return onboardingWelcomeViewModel;
    }
}
