package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import com.ifriend.data.networking.api.chat.models.UserChatEventRemote;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserChatRemoteDataSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/UserChatRemoteDataSource;", "", "userChatApi", "Lcom/ifriend/data/networking/api/chat/ChatsInfoApi;", "(Lcom/ifriend/data/networking/api/chat/ChatsInfoApi;)V", "getUserChatEvents", "", "Lcom/ifriend/data/networking/api/chat/models/UserChatEventRemote;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserChatRemoteDataSource {
    private final ChatsInfoApi userChatApi;

    @Inject
    public UserChatRemoteDataSource(ChatsInfoApi userChatApi) {
        Intrinsics.checkNotNullParameter(userChatApi, "userChatApi");
        this.userChatApi = userChatApi;
    }

    public final Object getUserChatEvents(String str, Continuation<? super List<UserChatEventRemote>> continuation) {
        return this.userChatApi.getChatEvents(str, continuation);
    }
}
