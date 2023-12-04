package com.ifriend.presentation.features.app.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.domain.logic.chat.models.ChatsState;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import com.ifriend.domain.models.onboarding.OnboardingAnswers;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StartChatFlowDelegate.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0002R\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000eH\u0082@R\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u00020\u000f¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000eH\u0082@R\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/StartChatFlowDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/StartChatFlowDelegate;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "infoOnboardingSlideUseCase", "Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlideUseCase;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "onboardingAnswersRepository", "Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "(Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/infoonboarding/InfoOnboardingSlideUseCase;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/domain/data/onboarding/OnboardingAnswersRepository;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;)V", "checkNeedToShowInfoOnboarding", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;)V", "startAppChatFlow", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChatFlow", "navigationMode", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;)V", "startFinishOnboardingChatFlow", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl implements StartChatFlowDelegate {
    public static final int $stable = 8;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final InfoOnboardingSlideUseCase infoOnboardingSlideUseCase;
    private final OnboardingAnswersRepository onboardingAnswersRepository;

    @Inject
    public StartChatFlowDelegateImpl(ChatsInfoInteractor chatsInfoInteractor, InfoOnboardingSlideUseCase infoOnboardingSlideUseCase, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, OnboardingAnswersRepository onboardingAnswersRepository, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(infoOnboardingSlideUseCase, "infoOnboardingSlideUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(onboardingAnswersRepository, "onboardingAnswersRepository");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.infoOnboardingSlideUseCase = infoOnboardingSlideUseCase;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.onboardingAnswersRepository = onboardingAnswersRepository;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
    }

    @Override // com.ifriend.presentation.features.app.delegates.StartChatFlowDelegate
    public void startChatFlow(AppViewModel context_receiver_0, AppEvents.StartChatFlow.NavigationMode navigationMode) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new StartChatFlowDelegateImpl$startChatFlow$1(context_receiver_0, null), null, new StartChatFlowDelegateImpl$startChatFlow$2(navigationMode, this, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startFinishOnboardingChatFlow(AppViewModel appViewModel, Continuation<? super Unit> continuation) {
        StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1 startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        StartChatFlowDelegateImpl startChatFlowDelegateImpl;
        String selectedBot;
        ChatsConfiguration chatsConfiguration;
        ChatInfo chatInfo;
        if (continuation instanceof StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1) {
            startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1 = (StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1) continuation;
            if ((startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label & Integer.MIN_VALUE) != 0) {
                startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label -= Integer.MIN_VALUE;
                obj = startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OnboardingAnswersRepository onboardingAnswersRepository = this.onboardingAnswersRepository;
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0 = this;
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1 = appViewModel;
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label = 1;
                    obj = onboardingAnswersRepository.getOnboardingAnswers(startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    startChatFlowDelegateImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    appViewModel = (AppViewModel) startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1;
                    startChatFlowDelegateImpl = (StartChatFlowDelegateImpl) startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    chatsConfiguration = (ChatsConfiguration) obj;
                    if (((chatsConfiguration != null || (chatInfo = chatsConfiguration.getChatInfo()) == null) ? null : chatInfo.getChatType()) == ChatType.INFLUENCER) {
                        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0 = null;
                        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1 = null;
                        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label = 3;
                        if (appViewModel.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel, (AppViewModel.Event) AppViewModel.Event.StartHomeFeature.INSTANCE, (Continuation<? super Unit>) startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0 = null;
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1 = null;
                    startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label = 4;
                    if (startChatFlowDelegateImpl.startAppChatFlow(appViewModel, startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    appViewModel = (AppViewModel) startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1;
                    startChatFlowDelegateImpl = (StartChatFlowDelegateImpl) startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                OnboardingAnswers onboardingAnswers = (OnboardingAnswers) obj;
                selectedBot = onboardingAnswers == null ? onboardingAnswers.getSelectedBot() : null;
                if (selectedBot == null) {
                    selectedBot = "";
                }
                ChatsConfigurationInteractor chatsConfigurationInteractor = startChatFlowDelegateImpl.chatsConfigurationInteractor;
                startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0 = startChatFlowDelegateImpl;
                startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1 = appViewModel;
                startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label = 2;
                obj = chatsConfigurationInteractor.getChatConfigurationByUid(selectedBot, startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatsConfiguration = (ChatsConfiguration) obj;
                if (((chatsConfiguration != null || (chatInfo = chatsConfiguration.getChatInfo()) == null) ? null : chatInfo.getChatType()) == ChatType.INFLUENCER) {
                }
            }
        }
        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1 = new StartChatFlowDelegateImpl$startFinishOnboardingChatFlow$1(this, continuation);
        obj = startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label;
        if (i != 0) {
        }
        OnboardingAnswers onboardingAnswers2 = (OnboardingAnswers) obj;
        if (onboardingAnswers2 == null) {
        }
        if (selectedBot == null) {
        }
        ChatsConfigurationInteractor chatsConfigurationInteractor2 = startChatFlowDelegateImpl.chatsConfigurationInteractor;
        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$0 = startChatFlowDelegateImpl;
        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.L$1 = appViewModel;
        startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1.label = 2;
        obj = chatsConfigurationInteractor2.getChatConfigurationByUid(selectedBot, startChatFlowDelegateImpl$startFinishOnboardingChatFlow$1);
        if (obj == coroutine_suspended) {
        }
        chatsConfiguration = (ChatsConfiguration) obj;
        if (((chatsConfiguration != null || (chatInfo = chatsConfiguration.getChatInfo()) == null) ? null : chatInfo.getChatType()) == ChatType.INFLUENCER) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startAppChatFlow(AppViewModel appViewModel, Continuation<? super Unit> continuation) {
        StartChatFlowDelegateImpl$startAppChatFlow$1 startChatFlowDelegateImpl$startAppChatFlow$1;
        StartChatFlowDelegateImpl startChatFlowDelegateImpl;
        StartChatFlowDelegateImpl startChatFlowDelegateImpl2;
        Object chatsState;
        AppViewModel appViewModel2;
        ChatInfo chatInfo;
        AppViewModel appViewModel3;
        if (continuation instanceof StartChatFlowDelegateImpl$startAppChatFlow$1) {
            startChatFlowDelegateImpl$startAppChatFlow$1 = (StartChatFlowDelegateImpl$startAppChatFlow$1) continuation;
            if ((startChatFlowDelegateImpl$startAppChatFlow$1.label & Integer.MIN_VALUE) != 0) {
                startChatFlowDelegateImpl$startAppChatFlow$1.label -= Integer.MIN_VALUE;
                Object obj = startChatFlowDelegateImpl$startAppChatFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (startChatFlowDelegateImpl$startAppChatFlow$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        ChatsInfoConfigurationRepository chatsInfoConfigurationRepository = this.chatsInfoConfigurationRepository;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = this;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 1;
                        obj = chatsInfoConfigurationRepository.getLastActiveChatId(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        startChatFlowDelegateImpl = this;
                        ChatsInfoInteractor chatsInfoInteractor = startChatFlowDelegateImpl.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = startChatFlowDelegateImpl;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 2;
                        obj = chatsInfoInteractor.getChatInfo((String) obj, startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        startChatFlowDelegateImpl2 = startChatFlowDelegateImpl;
                        ChatInfo chatInfo2 = (ChatInfo) obj;
                        ChatsInfoInteractor chatsInfoInteractor2 = startChatFlowDelegateImpl2.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = startChatFlowDelegateImpl2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = chatInfo2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 3;
                        chatsState = chatsInfoInteractor2.getChatsState(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (chatsState == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appViewModel2 = appViewModel;
                        chatInfo = chatInfo2;
                        obj = chatsState;
                        if (!(obj instanceof ChatsState.ChatListChats) && chatInfo != null && ChatoptionsKt.isCanChatting(chatInfo)) {
                            startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = null;
                            startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = null;
                            startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = null;
                            startChatFlowDelegateImpl$startAppChatFlow$1.label = 4;
                            if (appViewModel2.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel2, (AppViewModel.Event) new AppViewModel.Event.StartChatFeature(chatInfo.getChatId()), (Continuation<? super Unit>) startChatFlowDelegateImpl$startAppChatFlow$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        ChatsInfoInteractor chatsInfoInteractor3 = startChatFlowDelegateImpl2.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = appViewModel2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 5;
                        obj = chatsInfoInteractor3.getSafeDefaultChatInfo(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appViewModel3 = appViewModel2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 6;
                        if (appViewModel3.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel3, (AppViewModel.Event) new AppViewModel.Event.StartChatFeature(((ChatInfo) obj).getChatId()), (Continuation<? super Unit>) startChatFlowDelegateImpl$startAppChatFlow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        appViewModel = (AppViewModel) startChatFlowDelegateImpl$startAppChatFlow$1.L$1;
                        startChatFlowDelegateImpl = (StartChatFlowDelegateImpl) startChatFlowDelegateImpl$startAppChatFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ChatsInfoInteractor chatsInfoInteractor4 = startChatFlowDelegateImpl.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = startChatFlowDelegateImpl;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 2;
                        obj = chatsInfoInteractor4.getChatInfo((String) obj, startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (obj == coroutine_suspended) {
                        }
                        startChatFlowDelegateImpl2 = startChatFlowDelegateImpl;
                        ChatInfo chatInfo22 = (ChatInfo) obj;
                        ChatsInfoInteractor chatsInfoInteractor22 = startChatFlowDelegateImpl2.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = startChatFlowDelegateImpl2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = chatInfo22;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 3;
                        chatsState = chatsInfoInteractor22.getChatsState(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (chatsState == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        appViewModel = (AppViewModel) startChatFlowDelegateImpl$startAppChatFlow$1.L$1;
                        startChatFlowDelegateImpl = (StartChatFlowDelegateImpl) startChatFlowDelegateImpl$startAppChatFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        startChatFlowDelegateImpl2 = startChatFlowDelegateImpl;
                        ChatInfo chatInfo222 = (ChatInfo) obj;
                        ChatsInfoInteractor chatsInfoInteractor222 = startChatFlowDelegateImpl2.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = startChatFlowDelegateImpl2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = appViewModel;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = chatInfo222;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 3;
                        chatsState = chatsInfoInteractor222.getChatsState(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (chatsState == coroutine_suspended) {
                        }
                        break;
                    case 3:
                        chatInfo = (ChatInfo) startChatFlowDelegateImpl$startAppChatFlow$1.L$2;
                        appViewModel2 = (AppViewModel) startChatFlowDelegateImpl$startAppChatFlow$1.L$1;
                        startChatFlowDelegateImpl2 = (StartChatFlowDelegateImpl) startChatFlowDelegateImpl$startAppChatFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!(obj instanceof ChatsState.ChatListChats)) {
                        }
                        ChatsInfoInteractor chatsInfoInteractor32 = startChatFlowDelegateImpl2.chatsInfoInteractor;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = appViewModel2;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$1 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$2 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 5;
                        obj = chatsInfoInteractor32.getSafeDefaultChatInfo(startChatFlowDelegateImpl$startAppChatFlow$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        appViewModel3 = (AppViewModel) startChatFlowDelegateImpl$startAppChatFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        startChatFlowDelegateImpl$startAppChatFlow$1.L$0 = null;
                        startChatFlowDelegateImpl$startAppChatFlow$1.label = 6;
                        if (appViewModel3.sendEvent2((UiStateDelegate<AppViewModel.UiState, AppViewModel.Event>) appViewModel3, (AppViewModel.Event) new AppViewModel.Event.StartChatFeature(((ChatInfo) obj).getChatId()), (Continuation<? super Unit>) startChatFlowDelegateImpl$startAppChatFlow$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        startChatFlowDelegateImpl$startAppChatFlow$1 = new StartChatFlowDelegateImpl$startAppChatFlow$1(this, continuation);
        Object obj2 = startChatFlowDelegateImpl$startAppChatFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (startChatFlowDelegateImpl$startAppChatFlow$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkNeedToShowInfoOnboarding(AppViewModel appViewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(appViewModel), null, null, new StartChatFlowDelegateImpl$checkNeedToShowInfoOnboarding$1(this, appViewModel, null), 3, null);
    }
}
