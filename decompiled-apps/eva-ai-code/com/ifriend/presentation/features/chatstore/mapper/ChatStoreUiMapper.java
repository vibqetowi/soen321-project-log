package com.ifriend.presentation.features.chatstore.mapper;

import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatStoreUiMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/mapper/ChatStoreUiMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "actionMessage", "", "getActionMessage", "()Ljava/lang/String;", "actionMessage$delegate", "Lkotlin/Lazy;", "map", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "config", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStoreUiMapper {
    public static final int $stable = 8;
    private final Lazy actionMessage$delegate;
    private final ResourceProvider resourceProvider;

    @Inject
    public ChatStoreUiMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        this.actionMessage$delegate = LazyKt.lazy(new ChatStoreUiMapper$actionMessage$2(this));
    }

    private final String getActionMessage() {
        return (String) this.actionMessage$delegate.getValue();
    }

    public final ChatStoreUi map(ChatsConfiguration config) {
        ChatConfig.Images images;
        Intrinsics.checkNotNullParameter(config, "config");
        ChatInfo component1 = config.component1();
        ChatConfig component2 = config.component2();
        int unlockLevel = ChatoptionsKt.getUnlockLevel(component1);
        int neuronsPrice = ChatoptionsKt.getNeuronsPrice(component1);
        ChatConfig.Descriptions descriptions = component2 != null ? component2.getDescriptions() : null;
        boolean z = unlockLevel > 0;
        String chatId = component1.getChatId();
        String name = component1.getName();
        String profileAvatarUrl = (component2 == null || (images = component2.getImages()) == null) ? null : images.getProfileAvatarUrl();
        if (profileAvatarUrl == null) {
            profileAvatarUrl = "";
        }
        String precondition = descriptions != null ? descriptions.getPrecondition() : null;
        if (precondition == null) {
            precondition = "";
        }
        String str = precondition;
        if (str.length() == 0) {
            String profileDescription = descriptions != null ? descriptions.getProfileDescription() : null;
            str = profileDescription == null ? "" : profileDescription;
        }
        return new ChatStoreUi(chatId, name, profileAvatarUrl, str, getActionMessage(), String.valueOf(neuronsPrice), neuronsPrice, neuronsPrice > 0, z, z ? this.resourceProvider.getString(R.string.chats_store__unlock_level, Integer.valueOf(unlockLevel)) : "");
    }
}
