package com.ifriend.domain.logic.chat.chats;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetUnavailableChatsUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/chat/chats/GetUnavailableChatsUseCase;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "isMultiChatEnabledUseCase", "Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/logic/chat/info/IsMultiChatEnabledUseCase;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetUnavailableChatsUseCase {
    private final ChatsInfoRepository chatsInfoRepository;
    private final IsMultiChatEnabledUseCase isMultiChatEnabledUseCase;

    @Inject
    public GetUnavailableChatsUseCase(ChatsInfoRepository chatsInfoRepository, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(isMultiChatEnabledUseCase, "isMultiChatEnabledUseCase");
        this.chatsInfoRepository = chatsInfoRepository;
        this.isMultiChatEnabledUseCase = isMultiChatEnabledUseCase;
    }

    public final Object execute(Continuation<? super Flow<? extends List<ChatInfo>>> continuation) {
        return FlowKt.combine(this.chatsInfoRepository.getChatFlow(), this.isMultiChatEnabledUseCase.execute(), new GetUnavailableChatsUseCase$execute$2(null));
    }
}
