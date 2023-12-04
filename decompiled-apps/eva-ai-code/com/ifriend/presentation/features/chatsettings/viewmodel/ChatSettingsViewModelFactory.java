package com.ifriend.presentation.features.chatsettings.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsConfigurationDelegateImpl;
import com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegateImpl;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSettingsViewModelFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "chatId", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatSettingsLevelsDelegate", "Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegateImpl;", "chatSettingsConfigurationDelegate", "Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsConfigurationDelegateImpl;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Ljava/lang/String;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegateImpl;Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsConfigurationDelegateImpl;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final String chatId;
    private final ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegate;
    private final ChatSettingsLevelsDelegateImpl chatSettingsLevelsDelegate;
    private final ResourceProvider resourceProvider;

    /* compiled from: ChatSettingsViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModelFactory;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatSettingsViewModelFactory create(String str);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatSettingsViewModelFactory(@Assisted String chatId, ResourceProvider resourceProvider, ChatSettingsLevelsDelegateImpl chatSettingsLevelsDelegate, ChatSettingsConfigurationDelegateImpl chatSettingsConfigurationDelegate, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatSettingsLevelsDelegate, "chatSettingsLevelsDelegate");
        Intrinsics.checkNotNullParameter(chatSettingsConfigurationDelegate, "chatSettingsConfigurationDelegate");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.chatId = chatId;
        this.resourceProvider = resourceProvider;
        this.chatSettingsLevelsDelegate = chatSettingsLevelsDelegate;
        this.chatSettingsConfigurationDelegate = chatSettingsConfigurationDelegate;
        this.appEventsEmitter = appEventsEmitter;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatSettingsViewModel.class)) {
            String str = this.chatId;
            ChatSettingsLevelsDelegateImpl chatSettingsLevelsDelegateImpl = this.chatSettingsLevelsDelegate;
            ResourceProvider resourceProvider = this.resourceProvider;
            return new ChatSettingsViewModel(str, chatSettingsLevelsDelegateImpl, this.chatSettingsConfigurationDelegate, resourceProvider, this.appEventsEmitter);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
