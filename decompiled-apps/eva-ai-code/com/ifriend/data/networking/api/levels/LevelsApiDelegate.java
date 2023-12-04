package com.ifriend.data.networking.api.levels;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
/* compiled from: LevelsApiDelegate.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/networking/api/levels/LevelsApiDelegate;", "", "api", "Lcom/ifriend/data/networking/api/levels/LevelsApi;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/data/networking/api/levels/LevelsApi;Lcom/ifriend/domain/data/UserRepository;)V", "getLevelInfo", "Lcom/ifriend/data/networking/api/levels/LevelsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelsApiDelegate {
    private final LevelsApi api;
    private final UserRepository userRepository;

    @Inject
    public LevelsApiDelegate(LevelsApi api, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.api = api;
        this.userRepository = userRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLevelInfo(Continuation<? super LevelsResponse> continuation) {
        LevelsApiDelegate$getLevelInfo$1 levelsApiDelegate$getLevelInfo$1;
        int i;
        Response response;
        if (continuation instanceof LevelsApiDelegate$getLevelInfo$1) {
            levelsApiDelegate$getLevelInfo$1 = (LevelsApiDelegate$getLevelInfo$1) continuation;
            if ((levelsApiDelegate$getLevelInfo$1.label & Integer.MIN_VALUE) != 0) {
                levelsApiDelegate$getLevelInfo$1.label -= Integer.MIN_VALUE;
                Object obj = levelsApiDelegate$getLevelInfo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = levelsApiDelegate$getLevelInfo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        throw new IllegalStateException("User is not logged in");
                    }
                    String formatted = currentUser.getAuth().getToken().formatted();
                    LevelsApi levelsApi = this.api;
                    String userIdValue = currentUser.getUserIdValue();
                    levelsApiDelegate$getLevelInfo$1.label = 1;
                    obj = levelsApi.getLevelsInfo(formatted, userIdValue, levelsApiDelegate$getLevelInfo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    throw new IllegalStateException("Failed to get levels");
                }
                Object body = response.body();
                Intrinsics.checkNotNull(body);
                return body;
            }
        }
        levelsApiDelegate$getLevelInfo$1 = new LevelsApiDelegate$getLevelInfo$1(this, continuation);
        Object obj2 = levelsApiDelegate$getLevelInfo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = levelsApiDelegate$getLevelInfo$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }
}
