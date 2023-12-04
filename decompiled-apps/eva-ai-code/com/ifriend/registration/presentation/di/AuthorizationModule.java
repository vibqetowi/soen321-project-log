package com.ifriend.registration.presentation.di;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.base.di.Feature;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.registration.domain.useCase.email.SignUpEmailUseCase;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import com.ifriend.registration.domain.useCase.password.TimestampPasswordGenerator;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridgeImpl;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationResponseParser;
import com.ifriend.registration.presentation.ui.internalNotifications.NotificationToSnackbarMapper;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.internalNotifications.SnackbarDescription;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthorizationModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/ifriend/registration/presentation/di/AuthorizationModule;", "", "bindNotificationToSnackbarMapper", "Lcom/ifriend/domain/data/Mapper;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "mapper", "Lcom/ifriend/registration/presentation/ui/internalNotifications/NotificationToSnackbarMapper;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface AuthorizationModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Feature
    @Binds
    Mapper<InternalNotification, SnackbarDescription> bindNotificationToSnackbarMapper(NotificationToSnackbarMapper notificationToSnackbarMapper);

    /* compiled from: AuthorizationModule.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0010H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J8\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0007J0\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006%"}, d2 = {"Lcom/ifriend/registration/presentation/di/AuthorizationModule$Companion;", "", "()V", "provideAppCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "baseActivity", "Lcom/ifriend/ui/base/BaseActivity;", "provideAuthWithGoogleUseCase", "Lcom/ifriend/registration/domain/useCase/google/AuthWithGoogleUseCase;", "authorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "passwordGenerator", "Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;", "logger", "Lcom/ifriend/common_utils/Logger;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "provideFacebookAuthorizationBridge", "Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridge;", "providePasswordGenerator", "provideResources", "Landroid/content/res/Resources;", "activity", "provideSignUpEmailUseCase", "Lcom/ifriend/registration/domain/useCase/email/SignUpEmailUseCase;", "userAuthorizedAnalyticsSender", "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;", "analyticsSetUserIdUseCase", "Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;", "emailValidator", "Lcom/ifriend/domain/validation/EmailValidator;", "provideSignUpFacebookUseCase", "Lcom/ifriend/registration/domain/useCase/facebook/AuthWithFacebookUseCase;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final AuthWithFacebookUseCase provideSignUpFacebookUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, UpdateOnboardingUseCase updateOnboardingUseCase) {
            Intrinsics.checkNotNullParameter(authorizer, "authorizer");
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
            Intrinsics.checkNotNullParameter(passwordGenerator, "passwordGenerator");
            Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
            return new AuthWithFacebookUseCase(authorizer, userRepository, initialDataLoader, passwordGenerator, updateOnboardingUseCase);
        }

        @Provides
        @Feature
        public final AuthWithGoogleUseCase provideAuthWithGoogleUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, Logger logger, UpdateOnboardingUseCase updateOnboardingUseCase) {
            Intrinsics.checkNotNullParameter(authorizer, "authorizer");
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
            Intrinsics.checkNotNullParameter(passwordGenerator, "passwordGenerator");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
            return new AuthWithGoogleUseCase(authorizer, userRepository, initialDataLoader, passwordGenerator, logger, updateOnboardingUseCase);
        }

        @Provides
        @Feature
        public final FacebookAuthorizationBridge provideFacebookAuthorizationBridge() {
            return new FacebookAuthorizationBridgeImpl(new FacebookAuthorizationResponseParser());
        }

        @Provides
        @Feature
        public final SignUpEmailUseCase provideSignUpEmailUseCase(Authorizer authorizer, UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, UpdateOnboardingUseCase updateOnboardingUseCase, InitialDataLoader initialDataLoader, EmailValidator emailValidator) {
            Intrinsics.checkNotNullParameter(authorizer, "authorizer");
            Intrinsics.checkNotNullParameter(userAuthorizedAnalyticsSender, "userAuthorizedAnalyticsSender");
            Intrinsics.checkNotNullParameter(analyticsSetUserIdUseCase, "analyticsSetUserIdUseCase");
            Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
            Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
            Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
            return new SignUpEmailUseCase(authorizer, userAuthorizedAnalyticsSender, analyticsSetUserIdUseCase, initialDataLoader, emailValidator, updateOnboardingUseCase);
        }

        @Provides
        @Feature
        public final PasswordGenerator providePasswordGenerator() {
            return new TimestampPasswordGenerator();
        }

        @Provides
        @Feature
        public final AppCompatActivity provideAppCompatActivity(BaseActivity baseActivity) {
            Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
            return baseActivity;
        }

        @Provides
        @Feature
        public final Resources provideResources(AppCompatActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Resources resources = activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return resources;
        }
    }
}
