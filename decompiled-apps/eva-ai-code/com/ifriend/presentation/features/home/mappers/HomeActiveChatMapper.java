package com.ifriend.presentation.features.home.mappers;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_utils.encoder.SextingEncoder;
import com.ifriend.common_utils.extensions.TimestampKt;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatInfoTag;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.extensions.DateformatKt;
import com.ifriend.presentation.features.home.ui.models.HomeActiveChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeLastChatMessageUi;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppIcons;
import com.ifriend.ui.theme.icons.calls.IconCallKt;
import com.ifriend.ui.theme.icons.message.IconImageMessageKt;
import com.ifriend.ui.theme.icons.message.IconVoiceMessageKt;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeActiveChatMapper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ifriend/presentation/features/home/mappers/HomeActiveChatMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatMessageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", "newBadgeLabel", "", "getNewBadgeLabel", "()Ljava/lang/String;", "newBadgeLabel$delegate", "Lkotlin/Lazy;", "map", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "state", "Lcom/ifriend/common_entities_engine/EntitiesState;", "chat", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "avatarState", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "mapMessage", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeActiveChatMapper {
    public static final int $stable = 8;
    private final ChatMessageAccessInteractor chatMessageAccessInteractor;
    private final Lazy newBadgeLabel$delegate;
    private final ResourceProvider resourceProvider;

    /* compiled from: HomeActiveChatMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeneratedChatAvatar.VideoAvatar.GeneratingState.values().length];
            try {
                iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.GENERATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeneratedChatAvatar.VideoAvatar.GeneratingState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public HomeActiveChatMapper(ResourceProvider resourceProvider, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatMessageAccessInteractor, "chatMessageAccessInteractor");
        this.resourceProvider = resourceProvider;
        this.chatMessageAccessInteractor = chatMessageAccessInteractor;
        this.newBadgeLabel$delegate = LazyKt.lazy(new HomeActiveChatMapper$newBadgeLabel$2(this));
    }

    private final String getNewBadgeLabel() {
        return (String) this.newBadgeLabel$delegate.getValue();
    }

    public final HomeChatUi map(EntitiesState state, ChatInfo chat, GeneratedChatAvatar avatarState) {
        MessageInfo info;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(avatarState, "avatarState");
        int countOfUnreadMessages = ChatClientKt.countOfUnreadMessages(state);
        String str = "";
        String valueOf = countOfUnreadMessages > 0 ? String.valueOf(countOfUnreadMessages) : "";
        ChatMessage lastMessage = ChatClientKt.lastMessage(state);
        Long valueOf2 = (lastMessage == null || (info = lastMessage.getInfo()) == null) ? null : Long.valueOf(TimestampKt.normalizeTimestamp(info.getTimestamp()));
        String hoursMinutesWithTimeOfDayDateFormat = valueOf2 != null ? DateformatKt.getHoursMinutesWithTimeOfDayDateFormat(new Date(valueOf2.longValue())) : "";
        boolean isPromote = chat.isPromote();
        int priority = chat.isPromote() ? chat.getPromote().getPriority() : 0;
        boolean isVerified = chat.isVerified();
        String newBadgeLabel = chat.getTags().contains(ChatInfoTag.NEW) ? getNewBadgeLabel() : "";
        long orZero = ommonKt.orZero(valueOf2);
        HomeLastChatMessageUi mapMessage = lastMessage != null ? mapMessage(lastMessage, chat) : null;
        HomeChatUi.Sorting sorting = new HomeChatUi.Sorting(isPromote, priority, orZero, 0);
        if (avatarState instanceof GeneratedChatAvatar.ImageAvatar) {
            str = ((GeneratedChatAvatar.ImageAvatar) avatarState).getImageAvatarUri();
        } else if (!(avatarState instanceof GeneratedChatAvatar.Empty)) {
            if (avatarState instanceof GeneratedChatAvatar.VideoAvatar) {
                GeneratedChatAvatar.VideoAvatar videoAvatar = (GeneratedChatAvatar.VideoAvatar) avatarState;
                int i = WhenMappings.$EnumSwitchMapping$0[videoAvatar.getGeneratingState().ordinal()];
                if (i != 1 && i == 2) {
                    str = videoAvatar.getImageAvatarUri();
                }
            } else {
                str = chat.getRoundAvatarUrl();
            }
        }
        return new HomeActiveChatUi(chat.getChatId(), chat.getName(), str, newBadgeLabel, sorting, valueOf, hoursMinutesWithTimeOfDayDateFormat, isVerified, ChatoptionsKt.isCanChatting(chat), mapMessage, chat.getChatType() == ChatType.INFLUENCER);
    }

    private final HomeLastChatMessageUi mapMessage(ChatMessage chatMessage, ChatInfo chatInfo) {
        String encode;
        MessageContent content = chatMessage.getContent();
        if (content instanceof MessageContent.Image) {
            return new HomeLastChatMessageUi.Media(this.resourceProvider.getString(R.string.common__photo), ChatMessageKt.isFromUser(chatMessage), IconImageMessageKt.getIconImageMessage(AppIcons.INSTANCE));
        }
        if (content instanceof MessageContent.Gift) {
            return new HomeLastChatMessageUi.Media(this.resourceProvider.getString(R.string.common__photo), ChatMessageKt.isFromUser(chatMessage), IconImageMessageKt.getIconImageMessage(AppIcons.INSTANCE));
        }
        if (content instanceof MessageContent.Audio) {
            return new HomeLastChatMessageUi.Media(this.resourceProvider.getString(R.string.common__voice), ChatMessageKt.isFromUser(chatMessage), IconVoiceMessageKt.getIconVoiceMessage(AppIcons.INSTANCE));
        }
        if (content instanceof MessageContent.EndCall) {
            return new HomeLastChatMessageUi.Media(this.resourceProvider.getString(R.string.common__end_call), ChatMessageKt.isFromUser(chatMessage), IconCallKt.getIconCall(AppIcons.INSTANCE));
        }
        if (content instanceof MessageContent.Text) {
            boolean isAvailable = this.chatMessageAccessInteractor.getMessageAvailableState(chatMessage.getInfo(), chatInfo).isAvailable();
            if (isAvailable) {
                encode = ((MessageContent.Text) content).getText();
            } else {
                encode = SextingEncoder.INSTANCE.encode(((MessageContent.Text) content).getText());
            }
            return new HomeLastChatMessageUi.Text(encode, ChatMessageKt.isFromUser(chatMessage), !isAvailable);
        }
        throw new NoWhenBranchMatchedException();
    }
}
