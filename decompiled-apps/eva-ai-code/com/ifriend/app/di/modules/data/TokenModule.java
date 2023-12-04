package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.data.storages.token.KeychainUserTokenStorage;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorage;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TokenModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/ifriend/app/di/modules/data/TokenModule;", "", "()V", "bindTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "keychainUserTokenStorage", "Lcom/ifriend/data/storages/token/KeychainUserTokenStorage;", "bindTokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class TokenModule {
    public static final Companion Companion = new Companion(null);

    @Singleton
    @Binds
    public abstract UserTokenProvider bindTokenProvider(KeychainUserTokenStorage keychainUserTokenStorage);

    @Singleton
    @Binds
    public abstract UserTokenStorage bindTokenStorage(KeychainUserTokenStorage keychainUserTokenStorage);

    /* compiled from: TokenModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/data/TokenModule$Companion;", "", "()V", "provideKeychainUserTokenStorage", "Lcom/ifriend/data/storages/token/KeychainUserTokenStorage;", "context", "Landroid/content/Context;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final KeychainUserTokenStorage provideKeychainUserTokenStorage(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new KeychainUserTokenStorage(context);
        }
    }
}
