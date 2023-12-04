package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.bot.get.GetBotUseCaseImpl;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCaseImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UseCasesModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/UseCasesModule;", "", "()V", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {ChangeUserModule.class, ChangeBotModule.class})
/* loaded from: classes6.dex */
public abstract class UseCasesModule {
    public static final Companion Companion = new Companion(null);

    /* compiled from: UseCasesModule.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/UseCasesModule$Companion;", "", "()V", "provideGetBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "repository", "Lcom/ifriend/domain/data/BotRepository;", "provideGetUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "Lcom/ifriend/domain/data/UserRepository;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final GetUserUseCase provideGetUserUseCase(UserRepository repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            return new GetUserUseCaseImpl(repository);
        }

        @Provides
        @Singleton
        public final GetBotUseCase provideGetBotUseCase(BotRepository repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            return new GetBotUseCaseImpl(repository);
        }
    }
}
