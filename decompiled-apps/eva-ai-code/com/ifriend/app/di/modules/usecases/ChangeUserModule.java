package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChangeUserModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/ChangeUserModule;", "", "()V", "provideSetUserAgeUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserAgeUseCase;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "provideSetUserGenderUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserGenderUseCase;", "provideSetUserNameUseCase", "Lcom/ifriend/domain/useCases/user/change/ChangeUserNameUseCase;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ChangeUserModule {
    @Provides
    @Singleton
    public final ChangeUserAgeUseCase provideSetUserAgeUseCase(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new ChangeUserAgeUseCase(userRepository);
    }

    @Provides
    @Singleton
    public final ChangeUserGenderUseCase provideSetUserGenderUseCase(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new ChangeUserGenderUseCase(userRepository);
    }

    @Provides
    @Singleton
    public final ChangeUserNameUseCase provideSetUserNameUseCase(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new ChangeUserNameUseCase(userRepository);
    }
}
