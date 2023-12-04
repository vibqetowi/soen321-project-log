package com.ifriend.domain.data;

import com.ifriend.domain.models.profile.user.AuthData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AuthDataStorage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/data/AuthDataStorage;", "Lcom/ifriend/domain/data/AuthDataProvider;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "authData", "Lcom/ifriend/domain/models/profile/user/AuthData;", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthDataStorage extends AuthDataProvider {
    Object clear(Continuation<? super Unit> continuation);

    Object set(AuthData authData, Continuation<? super Unit> continuation);
}
