package com.ifriend.domain.useCases.user.change;

import androidx.autofill.HintConstants;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChangeUserGenderUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/UserRepository;)V", "change", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "(Lcom/ifriend/domain/models/profile/Gender;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeUserGenderUseCase {
    private final UserRepository userRepository;

    public ChangeUserGenderUseCase(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    public final Object change(Gender gender, Continuation<? super Unit> continuation) {
        Object gender2 = this.userRepository.setGender(gender, continuation);
        return gender2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? gender2 : Unit.INSTANCE;
    }
}
