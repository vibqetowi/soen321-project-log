package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LevelsModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/usecases/LevelsModule;", "", "()V", "provideGetLevelsListUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "repository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class LevelsModule {
    @Provides
    @Singleton
    public final GetLevelInfoUseCase provideGetLevelsListUseCase(LevelsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new GetLevelInfoUseCase(repository);
    }
}
