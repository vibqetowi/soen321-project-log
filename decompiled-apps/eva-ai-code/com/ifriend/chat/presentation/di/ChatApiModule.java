package com.ifriend.chat.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.data.ChatProcessImpl;
import com.ifriend.chat.data.ResetAiApiDelegateImpl;
import com.ifriend.chat.data.UserApi;
import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.domain.storage.token.UserTokenProvider;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
/* compiled from: ChatApiModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/presentation/di/ChatApiModule;", "", "()V", "provideChatProcess", "Lcom/ifriend/chat/domain/data/ChatProcess;", "userApi", "Lcom/ifriend/chat/data/UserApi;", "userTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "provideResetAiApiDelegate", "Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;", "provideUserApi", "retrofit", "Lretrofit2/Retrofit;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ChatApiModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final UserApi provideUserApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(UserApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (UserApi) create;
    }

    @Provides
    @Feature
    public final ChatProcess provideChatProcess(UserApi userApi, UserTokenProvider userTokenProvider) {
        Intrinsics.checkNotNullParameter(userApi, "userApi");
        Intrinsics.checkNotNullParameter(userTokenProvider, "userTokenProvider");
        return new ChatProcessImpl(userApi, userTokenProvider);
    }

    @Provides
    @Feature
    public final ResetAiApiDelegate provideResetAiApiDelegate(UserApi userApi) {
        Intrinsics.checkNotNullParameter(userApi, "userApi");
        return new ResetAiApiDelegateImpl(userApi);
    }
}
