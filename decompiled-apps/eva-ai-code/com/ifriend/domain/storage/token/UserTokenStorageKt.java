package com.ifriend.domain.storage.token;

import com.ifriend.domain.models.profile.user.UserToken;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserTokenStorage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"current", "Lcom/ifriend/domain/models/profile/user/UserToken;", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "(Lcom/ifriend/domain/storage/token/UserTokenProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserTokenStorageKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object current(UserTokenProvider userTokenProvider, Continuation<? super UserToken> continuation) {
        UserTokenStorageKt$current$1 userTokenStorageKt$current$1;
        int i;
        if (continuation instanceof UserTokenStorageKt$current$1) {
            userTokenStorageKt$current$1 = (UserTokenStorageKt$current$1) continuation;
            if ((userTokenStorageKt$current$1.label & Integer.MIN_VALUE) != 0) {
                userTokenStorageKt$current$1.label -= Integer.MIN_VALUE;
                Object obj = userTokenStorageKt$current$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userTokenStorageKt$current$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    userTokenStorageKt$current$1.label = 1;
                    obj = userTokenProvider.tokenStateFlow(userTokenStorageKt$current$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return ((StateFlow) obj).getValue();
            }
        }
        userTokenStorageKt$current$1 = new UserTokenStorageKt$current$1(continuation);
        Object obj2 = userTokenStorageKt$current$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userTokenStorageKt$current$1.label;
        if (i != 0) {
        }
        return ((StateFlow) obj2).getValue();
    }
}
