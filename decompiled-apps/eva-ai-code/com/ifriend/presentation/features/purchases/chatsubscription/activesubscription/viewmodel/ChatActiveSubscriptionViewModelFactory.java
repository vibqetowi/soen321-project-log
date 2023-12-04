package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatActiveSubscriptionViewModelFactory.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\"Bh\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0015\u0010\u0010\u001a\u0011\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011j\u0002`\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J-\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0011\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011j\u0002`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "subscriptionBenefitsMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/platform/tools/api/AppInfoProvider;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatActiveSubscriptionViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final AppInfoProvider appInfoProvider;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetUserUseCase getUserUseCase;
    private final BuyChatSubscriptionBillingUiParams params;
    private final ResourceProvider resourceProvider;
    private final SubscriptionBenefitsMapper subscriptionBenefitsMapper;

    /* compiled from: ChatActiveSubscriptionViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModelFactory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatActiveSubscriptionViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatActiveSubscriptionViewModelFactory(@Assisted BuyChatSubscriptionBillingUiParams params, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, SubscriptionBenefitsMapper subscriptionBenefitsMapper, AppEventsEmitter appEventsEmitter, GetUserUseCase getUserUseCase, AppInfoProvider appInfoProvider, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsInfoInteractor chatsInfoInteractor, ChatSubscriptionInteractor chatSubscriptionInteractor) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(subscriptionBenefitsMapper, "subscriptionBenefitsMapper");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        this.params = params;
        this.resourceProvider = resourceProvider;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.subscriptionBenefitsMapper = subscriptionBenefitsMapper;
        this.appEventsEmitter = appEventsEmitter;
        this.getUserUseCase = getUserUseCase;
        this.appInfoProvider = appInfoProvider;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatActiveSubscriptionViewModel.class)) {
            return new ChatActiveSubscriptionViewModel(this.params.getChatId(), this.resourceProvider, this.chatsConfigurationInteractor, this.appEventsEmitter, this.subscriptionBenefitsMapper, this.getUserUseCase, this.appInfoProvider, this.exceptionsEmitter, this.chatsInfoInteractor, this.chatSubscriptionInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
