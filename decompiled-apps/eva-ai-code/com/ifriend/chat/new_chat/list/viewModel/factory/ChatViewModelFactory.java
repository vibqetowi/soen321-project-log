package com.ifriend.chat.new_chat.list.viewModel.factory;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.chat.new_chat.list.delegate.OnAudioMessageClickDelegate;
import com.ifriend.chat.new_chat.list.delegate.PresentationChatSystemsDelegate;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToUiModelMapper;
import com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel;
import com.ifriend.chat.new_chat.list.viewModel.analytics.ChatListAnalytics;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatViewModelFactory.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bv\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0015\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ-\u0010\u001e\u001a\u0002H\u001f\"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ifriend/chat/new_chat/list/viewModel/factory/ChatViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "audioMessagesDelegate", "Lcom/ifriend/chat/new_chat/list/delegate/OnAudioMessageClickDelegate;", "chatSystemsDelegate", "Lcom/ifriend/chat/new_chat/list/delegate/PresentationChatSystemsDelegate;", "mapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "chatEventsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "messageRegenerationDelegate", "Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegateImpl;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "chatListAnalytics", "Lcom/ifriend/chat/new_chat/list/viewModel/analytics/ChatListAnalytics;", "(Lcom/ifriend/chat/new_chat/list/delegate/OnAudioMessageClickDelegate;Lcom/ifriend/chat/new_chat/list/delegate/PresentationChatSystemsDelegate;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegateImpl;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/chat/new_chat/list/viewModel/analytics/ChatListAnalytics;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final OnAudioMessageClickDelegate audioMessagesDelegate;
    private final ChatClientInteractor chatClientInteractor;
    private final FlowObserverEmitter<ChatEvents> chatEventsEmitter;
    private final ChatListAnalytics chatListAnalytics;
    private final PresentationChatSystemsDelegate chatSystemsDelegate;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FeatureToggleRepository featureToggleRepository;
    private final GetBotUseCase getBotUseCase;
    private final GetUserUseCase getUserUseCase;
    private final ChatEntityToUiModelMapper mapper;
    private final MessageRegenerationDelegateImpl messageRegenerationDelegate;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @Inject
    public ChatViewModelFactory(OnAudioMessageClickDelegate audioMessagesDelegate, PresentationChatSystemsDelegate chatSystemsDelegate, ChatEntityToUiModelMapper mapper, ChatClientInteractor chatClientInteractor, GetBotUseCase getBotUseCase, FlowObserverEmitter<ChatEvents> chatEventsEmitter, ChatsInfoInteractor chatsInfoInteractor, FeatureToggleRepository featureToggleRepository, MessageRegenerationDelegateImpl messageRegenerationDelegate, DispatcherProvider dispatcherProvider, GetUserUseCase getUserUseCase, ChatListAnalytics chatListAnalytics) {
        Intrinsics.checkNotNullParameter(audioMessagesDelegate, "audioMessagesDelegate");
        Intrinsics.checkNotNullParameter(chatSystemsDelegate, "chatSystemsDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(chatEventsEmitter, "chatEventsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(messageRegenerationDelegate, "messageRegenerationDelegate");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(chatListAnalytics, "chatListAnalytics");
        this.audioMessagesDelegate = audioMessagesDelegate;
        this.chatSystemsDelegate = chatSystemsDelegate;
        this.mapper = mapper;
        this.chatClientInteractor = chatClientInteractor;
        this.getBotUseCase = getBotUseCase;
        this.chatEventsEmitter = chatEventsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.featureToggleRepository = featureToggleRepository;
        this.messageRegenerationDelegate = messageRegenerationDelegate;
        this.dispatcherProvider = dispatcherProvider;
        this.getUserUseCase = getUserUseCase;
        this.chatListAnalytics = chatListAnalytics;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (!Intrinsics.areEqual(modelClass, ChatListViewModel.class)) {
            throw new IllegalStateException("This factory cannot create " + modelClass);
        }
        String str = (String) SavedStateHandleSupport.createSavedStateHandle(extras).get("chat_id");
        if (str == null) {
            str = "";
        }
        return new ChatListViewModel(str, this.audioMessagesDelegate, this.chatSystemsDelegate, this.mapper, this.chatClientInteractor, this.getBotUseCase, this.chatEventsEmitter, this.chatsInfoInteractor, this.featureToggleRepository, this.messageRegenerationDelegate, this.dispatcherProvider, this.getUserUseCase, this.chatListAnalytics);
    }
}
