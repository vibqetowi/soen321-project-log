package com.ifriend.chat.domain.firebase;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ClearBadgesUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/domain/firebase/ClearBadgesUseCase;", "", "firebaseApiRepository", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/networking/FirebaseApiRepository;Lcom/ifriend/domain/data/UserRepository;)V", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClearBadgesUseCase {
    private final FirebaseApiRepository firebaseApiRepository;
    private final UserRepository userRepository;

    public ClearBadgesUseCase(FirebaseApiRepository firebaseApiRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(firebaseApiRepository, "firebaseApiRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.firebaseApiRepository = firebaseApiRepository;
        this.userRepository = userRepository;
    }

    public final Object clear(Continuation<? super Unit> continuation) {
        String userIdValue;
        User currentUser = this.userRepository.getCurrentUser();
        if (currentUser == null || (userIdValue = currentUser.getUserIdValue()) == null) {
            return Unit.INSTANCE;
        }
        Object clearBadges = this.firebaseApiRepository.clearBadges(userIdValue, continuation);
        return clearBadges == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearBadges : Unit.INSTANCE;
    }
}
