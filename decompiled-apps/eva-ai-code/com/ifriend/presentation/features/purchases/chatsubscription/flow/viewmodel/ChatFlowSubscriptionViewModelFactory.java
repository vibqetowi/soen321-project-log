package com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatFlowSubscriptionViewModelFactory.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B8\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0015\u0010\u0006\u001a\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007j\u0002`\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007j\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "chatId", "", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFlowSubscriptionViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final String chatId;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;

    /* compiled from: ChatFlowSubscriptionViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModelFactory;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatFlowSubscriptionViewModelFactory create(String str);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatFlowSubscriptionViewModelFactory(@Assisted String chatId, ChatsInfoInteractor chatsInfoInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        this.chatId = chatId;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatFlowSubscriptionViewModel.class)) {
            return new ChatFlowSubscriptionViewModel(this.chatId, this.chatsInfoInteractor, this.exceptionsEmitter, this.chatsConfigurationInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
