package com.ifriend.core.remote.services;

import com.ifriend.core.remote.datasources.user.UserNeuronesBalanceRemote;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
/* compiled from: UserApiService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/core/remote/services/UserApiService;", "", "getNeuronesBalance", "Lcom/ifriend/core/remote/datasources/user/UserNeuronesBalanceRemote;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserApiService {
    @GET("/credits/accounts/{user_id}/balance")
    Object getNeuronesBalance(@Path("user_id") String str, Continuation<? super UserNeuronesBalanceRemote> continuation);
}
