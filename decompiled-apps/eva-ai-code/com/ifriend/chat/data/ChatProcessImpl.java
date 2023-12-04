package com.ifriend.chat.data;

import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.domain.models.Response;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatProcessImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/data/ChatProcessImpl;", "Lcom/ifriend/chat/domain/data/ChatProcess;", "userApi", "Lcom/ifriend/chat/data/UserApi;", "userTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "(Lcom/ifriend/chat/data/UserApi;Lcom/ifriend/domain/storage/token/UserTokenProvider;)V", "deleteUser", "Lcom/ifriend/domain/models/Response;", "", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatProcessImpl implements ChatProcess {
    private final UserApi userApi;
    private final UserTokenProvider userTokenProvider;

    public ChatProcessImpl(UserApi userApi, UserTokenProvider userTokenProvider) {
        Intrinsics.checkNotNullParameter(userApi, "userApi");
        Intrinsics.checkNotNullParameter(userTokenProvider, "userTokenProvider");
        this.userApi = userApi;
        this.userTokenProvider = userTokenProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: Exception -> 0x0088, SocketTimeoutException -> 0x0092, TryCatch #2 {SocketTimeoutException -> 0x0092, Exception -> 0x0088, blocks: (B:12:0x0029, B:25:0x006a, B:27:0x0074, B:28:0x007e, B:22:0x005a), top: B:33:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: Exception -> 0x0088, SocketTimeoutException -> 0x0092, TRY_LEAVE, TryCatch #2 {SocketTimeoutException -> 0x0092, Exception -> 0x0088, blocks: (B:12:0x0029, B:25:0x006a, B:27:0x0074, B:28:0x007e, B:22:0x005a), top: B:33:0x0023 }] */
    @Override // com.ifriend.chat.domain.data.ChatProcess
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteUser(String str, Continuation<? super Response<Unit>> continuation) {
        ChatProcessImpl$deleteUser$1 chatProcessImpl$deleteUser$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        ChatProcessImpl chatProcessImpl;
        try {
            if (continuation instanceof ChatProcessImpl$deleteUser$1) {
                chatProcessImpl$deleteUser$1 = (ChatProcessImpl$deleteUser$1) continuation;
                if ((chatProcessImpl$deleteUser$1.label & Integer.MIN_VALUE) != 0) {
                    chatProcessImpl$deleteUser$1.label -= Integer.MIN_VALUE;
                    obj = chatProcessImpl$deleteUser$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = chatProcessImpl$deleteUser$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        UserTokenProvider userTokenProvider = this.userTokenProvider;
                        chatProcessImpl$deleteUser$1.L$0 = this;
                        chatProcessImpl$deleteUser$1.L$1 = str;
                        chatProcessImpl$deleteUser$1.label = 1;
                        obj = UserTokenStorageKt.current(userTokenProvider, chatProcessImpl$deleteUser$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatProcessImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            if (((retrofit2.Response) obj).code() == 204) {
                                return new Response.Success(Unit.INSTANCE);
                            }
                            return new Response.Failure("Error while user delete");
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        str = (String) chatProcessImpl$deleteUser$1.L$1;
                        chatProcessImpl = (ChatProcessImpl) chatProcessImpl$deleteUser$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    String formatted = ((UserToken) obj).formatted();
                    UserApi userApi = chatProcessImpl.userApi;
                    chatProcessImpl$deleteUser$1.L$0 = null;
                    chatProcessImpl$deleteUser$1.L$1 = null;
                    chatProcessImpl$deleteUser$1.label = 2;
                    obj = userApi.deleteUser(formatted, str, chatProcessImpl$deleteUser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((retrofit2.Response) obj).code() == 204) {
                    }
                }
            }
            if (i != 0) {
            }
            String formatted2 = ((UserToken) obj).formatted();
            UserApi userApi2 = chatProcessImpl.userApi;
            chatProcessImpl$deleteUser$1.L$0 = null;
            chatProcessImpl$deleteUser$1.L$1 = null;
            chatProcessImpl$deleteUser$1.label = 2;
            obj = userApi2.deleteUser(formatted2, str, chatProcessImpl$deleteUser$1);
            if (obj == coroutine_suspended) {
            }
            if (((retrofit2.Response) obj).code() == 204) {
            }
        } catch (SocketTimeoutException unused) {
            return new Response.Failure("Timeout Exception");
        } catch (Exception unused2) {
            return new Response.Failure("Exception");
        }
        chatProcessImpl$deleteUser$1 = new ChatProcessImpl$deleteUser$1(this, continuation);
        obj = chatProcessImpl$deleteUser$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatProcessImpl$deleteUser$1.label;
    }
}
