package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotEthnicityUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChangeBotModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/ChangeBotModule;", "", "()V", "provideChangeBotAgeUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotAgeUseCase;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "provideChangeBotEthnicityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotEthnicityUseCase;", "provideChangeBotGenderUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotGenderUseCase;", "provideChangeBotPersonalityUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotPersonalityUseCase;", "provideChangeBotVoiceUseCase", "Lcom/ifriend/domain/useCases/bot/ChangeBotVoiceUseCase;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ChangeBotModule {
    @Provides
    @Singleton
    public final ChangeBotGenderUseCase provideChangeBotGenderUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new ChangeBotGenderUseCase(botRepository);
    }

    @Provides
    @Singleton
    public final ChangeBotAgeUseCase provideChangeBotAgeUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new ChangeBotAgeUseCase(botRepository);
    }

    @Provides
    @Singleton
    public final ChangeBotEthnicityUseCase provideChangeBotEthnicityUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new ChangeBotEthnicityUseCase(botRepository);
    }

    @Provides
    @Singleton
    public final ChangeBotPersonalityUseCase provideChangeBotPersonalityUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new ChangeBotPersonalityUseCase(botRepository);
    }

    @Provides
    @Singleton
    public final ChangeBotVoiceUseCase provideChangeBotVoiceUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        return new ChangeBotVoiceUseCase(botRepository);
    }
}
