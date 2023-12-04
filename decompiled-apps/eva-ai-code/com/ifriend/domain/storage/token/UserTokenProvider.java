package com.ifriend.domain.storage.token;

import com.ifriend.domain.models.profile.user.UserToken;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserTokenProvider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/storage/token/UserTokenProvider;", "", "tokenStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/domain/models/profile/user/UserToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserTokenProvider {
    Object tokenStateFlow(Continuation<? super StateFlow<UserToken>> continuation);
}
