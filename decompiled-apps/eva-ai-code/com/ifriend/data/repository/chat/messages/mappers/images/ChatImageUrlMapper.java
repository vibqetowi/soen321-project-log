package com.ifriend.data.repository.chat.messages.mappers.images;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReference;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceKt;
import com.ifriend.data.repository.chat.messages.contenttypes.ContentReferenceType;
import com.ifriend.data.storages.config.AppConfigStorage;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ChatImageUrlMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/mappers/images/ChatImageUrlMapper;", "", "appConfigStorage", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "authProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/data/storages/config/AppConfigStorage;Lcom/ifriend/domain/data/AuthDataProvider;)V", "map", "", "reference", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatImageUrlMapper {
    private final AppConfigStorage appConfigStorage;
    private final AuthDataProvider authProvider;

    @Inject
    public ChatImageUrlMapper(AppConfigStorage appConfigStorage, AuthDataProvider authProvider) {
        Intrinsics.checkNotNullParameter(appConfigStorage, "appConfigStorage");
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        this.appConfigStorage = appConfigStorage;
        this.authProvider = authProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object map(String str, Continuation<? super String> continuation) {
        ChatImageUrlMapper$map$1 chatImageUrlMapper$map$1;
        int i;
        ContentReference contentReference;
        String str2;
        ContentReferenceType contentReferenceType;
        String str3;
        ChatImageUrlMapper chatImageUrlMapper;
        AuthData authData;
        if (continuation instanceof ChatImageUrlMapper$map$1) {
            chatImageUrlMapper$map$1 = (ChatImageUrlMapper$map$1) continuation;
            if ((chatImageUrlMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                chatImageUrlMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = chatImageUrlMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatImageUrlMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    contentReference = ContentReferenceKt.getContentReference(str);
                    if (contentReference == null) {
                        return "";
                    }
                    ContentReferenceType from = ContentReferenceType.Companion.from(contentReference.getType());
                    String content = contentReference.getContent();
                    AuthDataProvider authDataProvider = this.authProvider;
                    chatImageUrlMapper$map$1.L$0 = this;
                    chatImageUrlMapper$map$1.L$1 = str;
                    chatImageUrlMapper$map$1.L$2 = contentReference;
                    chatImageUrlMapper$map$1.L$3 = from;
                    chatImageUrlMapper$map$1.L$4 = content;
                    chatImageUrlMapper$map$1.label = 1;
                    Object lastAuthData = authDataProvider.lastAuthData(chatImageUrlMapper$map$1);
                    if (lastAuthData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    contentReferenceType = from;
                    obj = lastAuthData;
                    str3 = content;
                    chatImageUrlMapper = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str3 = (String) chatImageUrlMapper$map$1.L$4;
                    contentReferenceType = (ContentReferenceType) chatImageUrlMapper$map$1.L$3;
                    contentReference = (ContentReference) chatImageUrlMapper$map$1.L$2;
                    str2 = (String) chatImageUrlMapper$map$1.L$1;
                    chatImageUrlMapper = (ChatImageUrlMapper) chatImageUrlMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return "";
                }
                String apiUrl = chatImageUrlMapper.appConfigStorage.getApiUrl();
                if (contentReferenceType == ContentReferenceType.PHOTO) {
                    return apiUrl + "/dialogs/usermedia/" + authData.getClientId().getValue() + RemoteSettings.FORWARD_SLASH_STRING + authData.getUserId().getValue() + RemoteSettings.FORWARD_SLASH_STRING + str3;
                } else if (contentReferenceType != ContentReferenceType.PHOTO_AI) {
                    return StringsKt.contains$default((CharSequence) str3, (CharSequence) ContentReferenceType.GIFT.getType(), false, 2, (Object) null) ? str2 : "";
                } else {
                    return apiUrl + contentReference.getContent();
                }
            }
        }
        chatImageUrlMapper$map$1 = new ChatImageUrlMapper$map$1(this, continuation);
        Object obj2 = chatImageUrlMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatImageUrlMapper$map$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj2;
        if (authData != null) {
        }
    }
}
