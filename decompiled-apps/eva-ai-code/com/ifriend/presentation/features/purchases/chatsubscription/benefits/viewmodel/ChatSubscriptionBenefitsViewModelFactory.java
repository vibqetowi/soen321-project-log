package com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionBenefitsViewModelFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cBP\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0015\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J-\u0010\u0014\u001a\u0002H\u0015\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "subscriptionBenefitsMapper", "Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;", "chatSubscriptionInteractor", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/presentation/features/purchases/chatsubscription/common/mappers/SubscriptionBenefitsMapper;Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitsViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final ChatSubscriptionInteractor chatSubscriptionInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final BuyChatSubscriptionBillingUiParams params;
    private final ResourceProvider resourceProvider;
    private final SubscriptionBenefitsMapper subscriptionBenefitsMapper;

    /* compiled from: ChatSubscriptionBenefitsViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/chatsubscription/benefits/viewmodel/ChatSubscriptionBenefitsViewModelFactory;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatSubscriptionBenefitsViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatSubscriptionBenefitsViewModelFactory(@Assisted BuyChatSubscriptionBillingUiParams params, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, SubscriptionBenefitsMapper subscriptionBenefitsMapper, ChatSubscriptionInteractor chatSubscriptionInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(subscriptionBenefitsMapper, "subscriptionBenefitsMapper");
        Intrinsics.checkNotNullParameter(chatSubscriptionInteractor, "chatSubscriptionInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        this.params = params;
        this.resourceProvider = resourceProvider;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.subscriptionBenefitsMapper = subscriptionBenefitsMapper;
        this.chatSubscriptionInteractor = chatSubscriptionInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatSubscriptionBenefitsViewModel.class)) {
            return new ChatSubscriptionBenefitsViewModel(this.params.getChatId(), this.resourceProvider, this.chatsConfigurationInteractor, this.subscriptionBenefitsMapper, this.chatSubscriptionInteractor, this.exceptionsEmitter, this.chatsInfoInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
