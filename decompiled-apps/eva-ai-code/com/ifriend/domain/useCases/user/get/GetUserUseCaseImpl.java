package com.ifriend.domain.useCases.user.get;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetUserUseCaseImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/useCases/user/get/GetUserUseCaseImpl;", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "repository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/UserRepository;)V", "current", "Lcom/ifriend/domain/models/profile/user/User;", "flow", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAuthorized", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetUserUseCaseImpl implements GetUserUseCase {
    private final UserRepository repository;

    public GetUserUseCaseImpl(UserRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    @Override // com.ifriend.domain.useCases.user.get.GetUserUseCase
    public Object flow(Continuation<? super Flow<User>> continuation) {
        return this.repository.getUser();
    }

    @Override // com.ifriend.domain.useCases.user.get.GetUserUseCase
    public User current() {
        return this.repository.getCurrentUser();
    }

    @Override // com.ifriend.domain.useCases.user.get.GetUserUseCase
    public boolean isAuthorized() {
        return this.repository.isAuthorized();
    }
}
