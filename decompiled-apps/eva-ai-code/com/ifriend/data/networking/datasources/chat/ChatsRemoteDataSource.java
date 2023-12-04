package com.ifriend.data.networking.datasources.chat;

import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.models.ChatsRootRemote;
import com.ifriend.data.networking.api.chat.models.request.BuyChatRemoteParams;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/ChatsRemoteDataSource;", "", "chatsApi", "Lcom/ifriend/data/networking/api/chat/ChatsApi;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/data/networking/api/chat/ChatsApi;Lcom/ifriend/domain/data/AuthDataProvider;)V", "buyChat", "", "chatId", "", "paymentType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChats", "", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionBenefits", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserId", "setChatUserConfigure", ConfigKeys.FEATURE, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource {
    private final AuthDataProvider authDataProvider;
    private final ChatsApi chatsApi;

    @Inject
    public ChatsRemoteDataSource(ChatsApi chatsApi, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(chatsApi, "chatsApi");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.chatsApi = chatsApi;
        this.authDataProvider = authDataProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserId(Continuation<? super String> continuation) {
        ChatsRemoteDataSource$getUserId$1 chatsRemoteDataSource$getUserId$1;
        int i;
        UserId userId;
        if (continuation instanceof ChatsRemoteDataSource$getUserId$1) {
            chatsRemoteDataSource$getUserId$1 = (ChatsRemoteDataSource$getUserId$1) continuation;
            if ((chatsRemoteDataSource$getUserId$1.label & Integer.MIN_VALUE) != 0) {
                chatsRemoteDataSource$getUserId$1.label -= Integer.MIN_VALUE;
                Object obj = chatsRemoteDataSource$getUserId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsRemoteDataSource$getUserId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authDataProvider;
                    chatsRemoteDataSource$getUserId$1.label = 1;
                    obj = authDataProvider.lastAuthData(chatsRemoteDataSource$getUserId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                AuthData authData = (AuthData) obj;
                String value = (authData != null || (userId = authData.getUserId()) == null) ? null : userId.getValue();
                return value != null ? "" : value;
            }
        }
        chatsRemoteDataSource$getUserId$1 = new ChatsRemoteDataSource$getUserId$1(this, continuation);
        Object obj2 = chatsRemoteDataSource$getUserId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsRemoteDataSource$getUserId$1.label;
        if (i != 0) {
        }
        AuthData authData2 = (AuthData) obj2;
        if (authData2 != null) {
        }
        if (value != null) {
        }
    }

    public final Object getChats(Continuation<? super List<ChatsRootRemote.ChatRemote>> continuation) {
        return RetryKt.retryRemoteRequest$default(0, 0L, 0L, 0.0d, new ChatsRemoteDataSource$getChats$2(this, null), continuation, 15, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyChat(String str, String str2, Continuation<? super Unit> continuation) {
        ChatsRemoteDataSource$buyChat$1 chatsRemoteDataSource$buyChat$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str3;
        ChatsApi chatsApi;
        BuyChatRemoteParams buyChatRemoteParams;
        if (continuation instanceof ChatsRemoteDataSource$buyChat$1) {
            chatsRemoteDataSource$buyChat$1 = (ChatsRemoteDataSource$buyChat$1) continuation;
            if ((chatsRemoteDataSource$buyChat$1.label & Integer.MIN_VALUE) != 0) {
                chatsRemoteDataSource$buyChat$1.label -= Integer.MIN_VALUE;
                obj = chatsRemoteDataSource$buyChat$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsRemoteDataSource$buyChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsApi chatsApi2 = this.chatsApi;
                    chatsRemoteDataSource$buyChat$1.L$0 = str;
                    chatsRemoteDataSource$buyChat$1.L$1 = str2;
                    chatsRemoteDataSource$buyChat$1.L$2 = chatsApi2;
                    chatsRemoteDataSource$buyChat$1.label = 1;
                    Object userId = getUserId(chatsRemoteDataSource$buyChat$1);
                    if (userId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    chatsApi = chatsApi2;
                    obj = userId;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatsApi = (ChatsApi) chatsRemoteDataSource$buyChat$1.L$2;
                    str2 = (String) chatsRemoteDataSource$buyChat$1.L$1;
                    str3 = (String) chatsRemoteDataSource$buyChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                buyChatRemoteParams = new BuyChatRemoteParams(str2);
                chatsRemoteDataSource$buyChat$1.L$0 = null;
                chatsRemoteDataSource$buyChat$1.L$1 = null;
                chatsRemoteDataSource$buyChat$1.L$2 = null;
                chatsRemoteDataSource$buyChat$1.label = 2;
                if (chatsApi.buyChat((String) obj, str3, buyChatRemoteParams, chatsRemoteDataSource$buyChat$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatsRemoteDataSource$buyChat$1 = new ChatsRemoteDataSource$buyChat$1(this, continuation);
        obj = chatsRemoteDataSource$buyChat$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsRemoteDataSource$buyChat$1.label;
        if (i != 0) {
        }
        buyChatRemoteParams = new BuyChatRemoteParams(str2);
        chatsRemoteDataSource$buyChat$1.L$0 = null;
        chatsRemoteDataSource$buyChat$1.L$1 = null;
        chatsRemoteDataSource$buyChat$1.L$2 = null;
        chatsRemoteDataSource$buyChat$1.label = 2;
        if (chatsApi.buyChat((String) obj, str3, buyChatRemoteParams, chatsRemoteDataSource$buyChat$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final Object getSubscriptionBenefits(String str, Continuation<? super List<ChatSubscriptionBenefitRemote>> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new ChatsRemoteDataSource$getSubscriptionBenefits$2(this, str, null), continuation);
    }

    public final Object setChatUserConfigure(List<String> list, Continuation<? super Unit> continuation) {
        Object oneTimeRetryRemoteRequest = RetryKt.oneTimeRetryRemoteRequest(new ChatsRemoteDataSource$setChatUserConfigure$2(this, list, null), continuation);
        return oneTimeRetryRemoteRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? oneTimeRetryRemoteRequest : Unit.INSTANCE;
    }
}
