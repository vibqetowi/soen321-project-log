package com.ifriend.domain.storage.token;

import com.ifriend.domain.models.profile.user.UserToken;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserTokenStorage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/storage/token/UserTokenStorage;", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "token", "Lcom/ifriend/domain/models/profile/user/UserToken;", "(Lcom/ifriend/domain/models/profile/user/UserToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserTokenStorage extends UserTokenProvider {
    Object clear(Continuation<? super Unit> continuation);

    Object set(UserToken userToken, Continuation<? super Unit> continuation);
}
