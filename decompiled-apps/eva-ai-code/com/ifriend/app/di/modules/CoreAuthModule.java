package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.authorization.AuthorizerImpl;
import com.ifriend.data.authorization.RegistrationApiDelegate;
import com.ifriend.data.authorization.confirmEmail.ConfirmEmailApi;
import com.ifriend.data.authorization.confirmEmail.ConfirmEmailRepositoryImpl;
import com.ifriend.data.networking.api.RegistrationApi;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.data.install.AppInstallStorage;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
/* compiled from: CoreAuthModule.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006#"}, d2 = {"Lcom/ifriend/app/di/modules/CoreAuthModule;", "", "()V", "provideAuthorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "registrationProcess", "Lcom/ifriend/data/authorization/RegistrationApiDelegate;", "authDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideConfirmEmailApi", "Lcom/ifriend/data/authorization/confirmEmail/ConfirmEmailApi;", "retrofit", "Lretrofit2/Retrofit;", "provideConfirmEmailRepository", "Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "confirmEmailApi", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "provideRegistrationApi", "Lcom/ifriend/data/networking/api/RegistrationApi;", "provideRegistrationProcess", "api", "provideSignInUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "userTokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "authorizer", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class CoreAuthModule {
    @Provides
    @Singleton
    public final Authorizer provideAuthorizer(RegistrationApiDelegate registrationProcess, AuthDataStorage authDataStorage, AppInstallStorage appInstallStorage, Logger logger) {
        Intrinsics.checkNotNullParameter(registrationProcess, "registrationProcess");
        Intrinsics.checkNotNullParameter(authDataStorage, "authDataStorage");
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new AuthorizerImpl(registrationProcess, authDataStorage, appInstallStorage, logger);
    }

    @Provides
    @Singleton
    public final SignInWithTokenUseCase provideSignInUseCase(UserTokenStorage userTokenStorage, Authorizer authorizer, InitialDataLoader initialDataLoader, UpdateOnboardingUseCase updateOnboardingUseCase) {
        Intrinsics.checkNotNullParameter(userTokenStorage, "userTokenStorage");
        Intrinsics.checkNotNullParameter(authorizer, "authorizer");
        Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
        Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
        return new SignInWithTokenUseCase(userTokenStorage, authorizer, initialDataLoader, updateOnboardingUseCase);
    }

    @Provides
    @Singleton
    public final RegistrationApiDelegate provideRegistrationProcess(RegistrationApi api, Logger logger) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new RegistrationApiDelegate(api, logger);
    }

    @Provides
    @Singleton
    public final RegistrationApi provideRegistrationApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(RegistrationApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (RegistrationApi) create;
    }

    @Provides
    @Singleton
    public final ConfirmEmailApi provideConfirmEmailApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ConfirmEmailApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ConfirmEmailApi) create;
    }

    @Provides
    @Singleton
    public final ConfirmEmailRepository provideConfirmEmailRepository(ConfirmEmailApi confirmEmailApi, AuthDataStorage authDataStorage, InternalNotificationHandler internalNotificationHandler) {
        Intrinsics.checkNotNullParameter(confirmEmailApi, "confirmEmailApi");
        Intrinsics.checkNotNullParameter(authDataStorage, "authDataStorage");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        return new ConfirmEmailRepositoryImpl(confirmEmailApi, authDataStorage, internalNotificationHandler);
    }
}
