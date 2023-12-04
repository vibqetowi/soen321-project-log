package com.ifriend.presentation.features.home.mappers;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatInfoTag;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeUnavailableChatMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/home/mappers/HomeUnavailableChatMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "newBadgeLabel", "", "getNewBadgeLabel", "()Ljava/lang/String;", "newBadgeLabel$delegate", "Lkotlin/Lazy;", "map", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "chat", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeUnavailableChatMapper {
    public static final int $stable = 8;
    private final Lazy newBadgeLabel$delegate;
    private final ResourceProvider resourceProvider;

    @Inject
    public HomeUnavailableChatMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        this.newBadgeLabel$delegate = LazyKt.lazy(new HomeUnavailableChatMapper$newBadgeLabel$2(this));
    }

    private final String getNewBadgeLabel() {
        return (String) this.newBadgeLabel$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeUnavailableChatUi map(ChatInfo chat) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(chat, "chat");
        int unlockLevel = ChatoptionsKt.getUnlockLevel(chat);
        int neuronsPrice = ChatoptionsKt.getNeuronsPrice(chat);
        if (unlockLevel > 0) {
            string = this.resourceProvider.getString(R.string.home__chat_unlock_message, Integer.valueOf(unlockLevel));
        } else if (neuronsPrice > 0) {
            string = this.resourceProvider.getString(R.string.home__chat_unlock_neurons);
        } else {
            str = "";
            return new HomeUnavailableChatUi(chat.getChatId(), chat.getName(), chat.getRoundAvatarUrl(), false, chat.getTags().contains(ChatInfoTag.NEW) ? getNewBadgeLabel() : "", str, unlockLevel, neuronsPrice, new HomeChatUi.Sorting(chat.isPromote(), chat.isPromote() ? chat.getPromote().getPriority() : 0, 0L, unlockLevel), null, null, 1536, null);
        }
        str = string;
        return new HomeUnavailableChatUi(chat.getChatId(), chat.getName(), chat.getRoundAvatarUrl(), false, chat.getTags().contains(ChatInfoTag.NEW) ? getNewBadgeLabel() : "", str, unlockLevel, neuronsPrice, new HomeChatUi.Sorting(chat.isPromote(), chat.isPromote() ? chat.getPromote().getPriority() : 0, 0L, unlockLevel), null, null, 1536, null);
    }
}
