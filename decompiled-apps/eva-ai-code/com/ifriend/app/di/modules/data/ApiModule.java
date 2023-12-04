package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.app.di.modules.data.core.InterceptorsModule;
import com.ifriend.app.di.modules.data.datadog.DataDogModule;
import com.ifriend.app.di.modules.data.qualifier.AppHttpClientQualifier;
import com.ifriend.app.di.modules.data.qualifier.AppRetrofitClientQualifier;
import com.ifriend.base.di.ApiUrlQualifier;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.remote.interceptors.AuthorizationInterceptor;
import com.ifriend.core.remote.interceptors.TimeoutInterceptor;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.remote.services.AppBillingApiService;
import com.ifriend.core.remote.services.CallsApiService;
import com.ifriend.core.remote.services.UserApiService;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProvider;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import com.ifriend.data.networking.api.BotApi;
import com.ifriend.data.networking.api.FirebaseApi;
import com.ifriend.data.networking.api.FirebaseApiRepositoryImpl;
import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import com.ifriend.data.networking.api.NeuronsApi;
import com.ifriend.data.networking.api.RateUsApi;
import com.ifriend.data.networking.api.ResetPasswordApi;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.data.networking.api.UserApi;
import com.ifriend.data.networking.api.ValidationApi;
import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import com.ifriend.data.networking.api.diary.DiaryApi;
import com.ifriend.data.networking.api.levels.LevelsApi;
import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.storage.token.UserTokenProvider;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: ApiModule.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001c\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010/\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u00100\u001a\u0002012\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u00102\u001a\u0002032\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u00104\u001a\u0002052\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u00106\u001a\u0002072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u00108\u001a\u0002092\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010:\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010;\u001a\u00020<2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010=\u001a\u00020>2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010?\u001a\u00020@2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010A\u001a\u00020B2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\"\u0010C\u001a\u00020D2\b\b\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0007¨\u0006F"}, d2 = {"Lcom/ifriend/app/di/modules/data/ApiModule;", "", "()V", "apiUrl", "", "context", "Landroid/content/Context;", "provideAnnalsApiService", "Lcom/ifriend/core/remote/services/AnnalsApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppBillingApiService", "Lcom/ifriend/core/remote/services/AppBillingApiService;", "provideAppHttpClient", "Lokhttp3/OkHttpClient;", "authorizationInterceptor", "Lcom/ifriend/core/remote/interceptors/AuthorizationInterceptor;", "timeoutInterceptor", "Lcom/ifriend/core/remote/interceptors/TimeoutInterceptor;", "provideAppRetrofit", "httpClient", "url", "provideBotApi", "Lcom/ifriend/data/networking/api/BotApi;", "provideCallApiService", "Lcom/ifriend/core/remote/services/CallsApiService;", "provideChatConfigurationApi", "Lcom/ifriend/data/networking/api/configuration/ChatConfigurationsApi;", "provideChatsApi", "Lcom/ifriend/data/networking/api/chat/ChatsApi;", "provideChatsInfoApi", "Lcom/ifriend/data/networking/api/chat/ChatsInfoApi;", "provideDiaryApi", "Lcom/ifriend/data/networking/api/diary/DiaryApi;", "provideFirebaseApi", "Lcom/ifriend/data/networking/api/FirebaseApi;", "provideFirebaseProcess", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "firebaseApi", "userTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideGenerateBotAvatarApi", "Lcom/ifriend/data/networking/api/GenerateBotAvatarApi;", "provideHttpClient", "provideLevelsApi", "Lcom/ifriend/data/networking/api/levels/LevelsApi;", "provideNeuronsApi", "Lcom/ifriend/data/networking/api/NeuronsApi;", "provideOnboardingApi", "Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;", "provideRateUsApi", "Lcom/ifriend/data/networking/api/RateUsApi;", "provideResetPasswordApi", "Lcom/ifriend/data/networking/api/ResetPasswordApi;", "provideRetrofit", "provideShardsApi", "Lcom/ifriend/data/networking/api/SocketShardsApi;", "provideTagsApi", "Lcom/ifriend/data/networking/api/TagsApi;", "provideUserApi", "Lcom/ifriend/data/networking/api/UserApi;", "provideUserApiService", "Lcom/ifriend/core/remote/services/UserApiService;", "provideValidationApi", "Lcom/ifriend/data/networking/api/ValidationApi;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {InterceptorsModule.class, DataDogModule.class})
/* loaded from: classes6.dex */
public final class ApiModule {
    public static final Companion Companion = new Companion(null);
    public static final long TIME_OUT = 30;

    /* compiled from: ApiModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/app/di/modules/data/ApiModule$Companion;", "", "()V", "TIME_OUT", "", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Provides
    @Singleton
    @AppHttpClientQualifier
    public final OkHttpClient provideAppHttpClient(AuthorizationInterceptor authorizationInterceptor, TimeoutInterceptor timeoutInterceptor) {
        Intrinsics.checkNotNullParameter(authorizationInterceptor, "authorizationInterceptor");
        Intrinsics.checkNotNullParameter(timeoutInterceptor, "timeoutInterceptor");
        return new OkHttpClient.Builder().writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).addInterceptor(authorizationInterceptor).addInterceptor(timeoutInterceptor).retryOnConnectionFailure(true).build();
    }

    @Provides
    @Singleton
    public final OkHttpClient provideHttpClient(Context context, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return OkHttpClientProvider.INSTANCE.provide(context, 30L, logger);
    }

    @Provides
    @Singleton
    public final Retrofit provideRetrofit(@ApiUrlQualifier String url, Context context, Logger logger) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Retrofit build = new Retrofit.Builder().baseUrl(url).client(OkHttpClientProvider.INSTANCE.provide(context, 30L, logger)).addConverterFactory(GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Provides
    @Singleton
    @AppRetrofitClientQualifier
    public final Retrofit provideAppRetrofit(@AppHttpClientQualifier OkHttpClient httpClient, @ApiUrlQualifier String url) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Retrofit build = new Retrofit.Builder().baseUrl(url).client(httpClient).addConverterFactory(GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Provides
    @Singleton
    public final FirebaseApiRepository provideFirebaseProcess(FirebaseApi firebaseApi, UserTokenProvider userTokenProvider, CoroutineScope coroutineScope, Logger logger) {
        Intrinsics.checkNotNullParameter(firebaseApi, "firebaseApi");
        Intrinsics.checkNotNullParameter(userTokenProvider, "userTokenProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new FirebaseApiRepositoryImpl(firebaseApi, userTokenProvider, coroutineScope, logger);
    }

    @Provides
    @Singleton
    public final FirebaseApi provideFirebaseApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(FirebaseApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (FirebaseApi) create;
    }

    @Provides
    @Singleton
    public final BotApi provideBotApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(BotApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (BotApi) create;
    }

    @Provides
    @Singleton
    public final TagsApi provideTagsApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(TagsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (TagsApi) create;
    }

    @Provides
    @Singleton
    public final UserApi provideUserApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(UserApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (UserApi) create;
    }

    @Provides
    @Singleton
    public final ChatsInfoApi provideChatsInfoApi(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ChatsInfoApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ChatsInfoApi) create;
    }

    @ApiUrlQualifier
    @Provides
    @Singleton
    public final String apiUrl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL));
    }

    @Provides
    @Singleton
    public final SocketShardsApi provideShardsApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(SocketShardsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (SocketShardsApi) create;
    }

    @Provides
    @Singleton
    public final NeuronsApi provideNeuronsApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(NeuronsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (NeuronsApi) create;
    }

    @Provides
    @Singleton
    public final ValidationApi provideValidationApi(@ApiUrlQualifier String url, Context context, Logger logger) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Object create = new Retrofit.Builder().baseUrl(url).client(OkHttpClientProvider.INSTANCE.provide(context, 3L, logger)).addConverterFactory(GsonConverterFactory.create()).build().create(ValidationApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ValidationApi) create;
    }

    @Provides
    @Singleton
    public final GenerateBotAvatarApi provideGenerateBotAvatarApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(GenerateBotAvatarApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (GenerateBotAvatarApi) create;
    }

    @Provides
    @Singleton
    public final DiaryApi provideDiaryApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(DiaryApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (DiaryApi) create;
    }

    @Provides
    @Singleton
    public final OnboardingApi provideOnboardingApi(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(OnboardingApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (OnboardingApi) create;
    }

    @Provides
    @Singleton
    public final ResetPasswordApi provideResetPasswordApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ResetPasswordApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ResetPasswordApi) create;
    }

    @Provides
    @Singleton
    public final RateUsApi provideRateUsApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(RateUsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (RateUsApi) create;
    }

    @Provides
    @Singleton
    public final LevelsApi provideLevelsApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(LevelsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (LevelsApi) create;
    }

    @Provides
    @Singleton
    public final ChatsApi provideChatsApi(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ChatsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ChatsApi) create;
    }

    @Provides
    @Singleton
    public final ChatConfigurationsApi provideChatConfigurationApi(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ChatConfigurationsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ChatConfigurationsApi) create;
    }

    @Provides
    @Singleton
    public final UserApiService provideUserApiService(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(UserApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (UserApiService) create;
    }

    @Provides
    @Singleton
    public final AnnalsApiService provideAnnalsApiService(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(AnnalsApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (AnnalsApiService) create;
    }

    @Provides
    @Singleton
    public final CallsApiService provideCallApiService(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(CallsApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (CallsApiService) create;
    }

    @Provides
    @Singleton
    public final AppBillingApiService provideAppBillingApiService(@AppRetrofitClientQualifier Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(AppBillingApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (AppBillingApiService) create;
    }
}
