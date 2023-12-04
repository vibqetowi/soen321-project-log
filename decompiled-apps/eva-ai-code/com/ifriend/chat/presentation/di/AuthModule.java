package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.domain.AuthInteractor;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/di/AuthModule;", "", "()V", "provideAuthInteractor", "Lcom/ifriend/chat/domain/AuthInteractor;", "signInWithTokenUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AuthModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final AuthInteractor provideAuthInteractor(SignInWithTokenUseCase signInWithTokenUseCase, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(signInWithTokenUseCase, "signInWithTokenUseCase");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        return new AuthInteractor(signInWithTokenUseCase, authDataProvider);
    }
}
