package com.ifriend.domain.data;

import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AuthDataProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/data/AuthDataProvider;", "", "lastAuthData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionAuthData", "Lkotlinx/coroutines/flow/StateFlow;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthDataProvider {
    Object lastAuthData(Continuation<? super AuthData> continuation);

    StateFlow<AuthData> sessionAuthData();
}
