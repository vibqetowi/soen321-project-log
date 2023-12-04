package com.ifriend.chat.domain.profile.user;

import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.Response;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DeleteUserUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/domain/profile/user/DeleteUserUseCase;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatProcess", "Lcom/ifriend/chat/domain/data/ChatProcess;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/chat/domain/data/ChatProcess;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeleteUserUseCase {
    private final ChatProcess chatProcess;
    private final UserRepository userRepository;

    public DeleteUserUseCase(UserRepository userRepository, ChatProcess chatProcess) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatProcess, "chatProcess");
        this.userRepository = userRepository;
        this.chatProcess = chatProcess;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Continuation<? super Boolean> continuation) {
        DeleteUserUseCase$invoke$1 deleteUserUseCase$invoke$1;
        int i;
        String userIdValue;
        if (continuation instanceof DeleteUserUseCase$invoke$1) {
            deleteUserUseCase$invoke$1 = (DeleteUserUseCase$invoke$1) continuation;
            if ((deleteUserUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                deleteUserUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = deleteUserUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deleteUserUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null || (userIdValue = currentUser.getUserIdValue()) == null) {
                        return Boxing.boxBoolean(false);
                    }
                    ChatProcess chatProcess = this.chatProcess;
                    deleteUserUseCase$invoke$1.label = 1;
                    obj = chatProcess.deleteUser(userIdValue, deleteUserUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Response) obj) instanceof Response.Success);
            }
        }
        deleteUserUseCase$invoke$1 = new DeleteUserUseCase$invoke$1(this, continuation);
        Object obj2 = deleteUserUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deleteUserUseCase$invoke$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Response) obj2) instanceof Response.Success);
    }
}
