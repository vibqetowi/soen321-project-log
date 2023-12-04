package com.ifriend.app.di.modules;

import com.ifriend.data.authorization.validation.RemoteEmailValidator;
import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ValidationModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/app/di/modules/ValidationModule;", "", "()V", "provideEmailValidator", "Lcom/ifriend/domain/validation/EmailValidator;", "validationApi", "Lcom/ifriend/data/networking/api/ValidationApi;", "provideValidateAgeUseCase", "Lcom/ifriend/domain/validation/ValidateAgeUseCase;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "provideValidateCredentialsUseCase", "Lcom/ifriend/domain/validation/ValidateCredentialsUseCase;", "provideValidateNameUseCase", "Lcom/ifriend/domain/validation/ValidateNameUseCase;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ValidationModule {
    @Provides
    @Singleton
    public final ValidateCredentialsUseCase provideValidateCredentialsUseCase() {
        return new ValidateCredentialsUseCase();
    }

    @Provides
    @Singleton
    public final EmailValidator provideEmailValidator(ValidationApi validationApi) {
        Intrinsics.checkNotNullParameter(validationApi, "validationApi");
        return new RemoteEmailValidator(validationApi);
    }

    @Provides
    @Singleton
    public final ValidateAgeUseCase provideValidateAgeUseCase(AppConfigUseCase appConfigUseCase) {
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        return new ValidateAgeUseCase(appConfigUseCase);
    }

    @Provides
    @Singleton
    public final ValidateNameUseCase provideValidateNameUseCase() {
        return new ValidateNameUseCase();
    }
}
