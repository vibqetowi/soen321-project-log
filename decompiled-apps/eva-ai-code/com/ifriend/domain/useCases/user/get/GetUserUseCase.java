package com.ifriend.domain.useCases.user.get;

import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetUserUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "", "current", "Lcom/ifriend/domain/models/profile/user/User;", "flow", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAuthorized", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GetUserUseCase {
    User current();

    Object flow(Continuation<? super Flow<User>> continuation);

    boolean isAuthorized();
}
