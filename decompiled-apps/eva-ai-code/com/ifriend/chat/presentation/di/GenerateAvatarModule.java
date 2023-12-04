package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.avatarGeneration.OpenGenerateBotAvatarUseCase;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.navigation.dialog.avatarGeneration.GenerateBotAvatarScreenFactoryImpl;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenerateAvatarModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/presentation/di/GenerateAvatarModule;", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface GenerateAvatarModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: GenerateAvatarModule.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/presentation/di/GenerateAvatarModule$Companion;", "", "()V", "provideGenerateBotAvatarRouteFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "provideOpenGenerateBotAvatarUseCase", "Lcom/ifriend/chat/domain/avatarGeneration/OpenGenerateBotAvatarUseCase;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "generateBotAvatarScreenFactory", "logger", "Lcom/ifriend/common_utils/Logger;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final OpenGenerateBotAvatarUseCase provideOpenGenerateBotAvatarUseCase(GenerateBotAvatarRepository generateBotAvatarRepository, RouterProvider router, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, Logger logger) {
            Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
            Intrinsics.checkNotNullParameter(router, "router");
            Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new OpenGenerateBotAvatarUseCase(generateBotAvatarRepository, router, generateBotAvatarScreenFactory, logger);
        }

        @Provides
        @Feature
        public final GenerateBotAvatarScreenFactory provideGenerateBotAvatarRouteFactory() {
            return new GenerateBotAvatarScreenFactoryImpl();
        }
    }
}
