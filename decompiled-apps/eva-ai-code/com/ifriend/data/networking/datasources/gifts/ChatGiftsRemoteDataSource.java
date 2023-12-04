package com.ifriend.data.networking.datasources.gifts;

import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/datasources/gifts/ChatGiftsRemoteDataSource;", "", "chatGiftsApi", "Lcom/ifriend/data/networking/api/chatgifts/ChatGiftsApi;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/data/networking/api/chatgifts/ChatGiftsApi;Lcom/ifriend/domain/data/UserRepository;)V", "getGifts", "", "Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "userId", "", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToken", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsRemoteDataSource {
    private final ChatGiftsApi chatGiftsApi;
    private final UserRepository userRepository;

    @Inject
    public ChatGiftsRemoteDataSource(ChatGiftsApi chatGiftsApi, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(chatGiftsApi, "chatGiftsApi");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.chatGiftsApi = chatGiftsApi;
        this.userRepository = userRepository;
    }

    private final String getToken() {
        User currentUser = this.userRepository.getCurrentUser();
        if (currentUser == null) {
            throw new IllegalStateException("User is not logged in");
        }
        return currentUser.getAuth().getToken().formatted();
    }

    public final Object getGifts(String str, String str2, Continuation<? super List<ChatGiftsRemote>> continuation) {
        return this.chatGiftsApi.getGifts(getToken(), str, str2, continuation);
    }
}
