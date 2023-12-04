package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: SextingRequestApi.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestApi;", "", "sendRequest", "", "auth", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SextingRequestApi {
    @POST("/ai/users/{user_id}/request-sexting")
    Object sendRequest(@Header("Authorization") String str, @Path("user_id") String str2, Continuation<? super Unit> continuation);
}
