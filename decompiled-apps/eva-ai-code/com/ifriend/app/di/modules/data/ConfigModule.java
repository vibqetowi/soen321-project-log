package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.config.LocalConfigExtractor;
import com.ifriend.data.config.parser.ConditionsChecker;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParser;
import com.ifriend.data.config.parser.FirebaseRemoteConfigParserImpl;
import com.ifriend.data.config.parser.TagsFirebaseConfigValueParser;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.platform.tools.api.AppInfoProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttp;
/* compiled from: ConfigModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ifriend/app/di/modules/data/ConfigModule;", "", "()V", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {SharedTogglesModule.class})
/* loaded from: classes6.dex */
public abstract class ConfigModule {
    public static final Companion Companion = new Companion(null);

    /* compiled from: ConfigModule.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/ifriend/app/di/modules/data/ConfigModule$Companion;", "", "()V", "provideConditionsChecker", "Lcom/ifriend/data/config/parser/ConditionsChecker;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideFirebaseRemoteConfigParser", "Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParser;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "conditionsChecker", "provideLocalConfigExtractor", "Lcom/ifriend/data/config/LocalConfigExtractor;", "context", "Landroid/content/Context;", "appInfoProvider", "Lcom/ifriend/platform/tools/api/AppInfoProvider;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final LocalConfigExtractor provideLocalConfigExtractor(Context context, AppInfoProvider appInfoProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appInfoProvider, "appInfoProvider");
            return new LocalConfigExtractor(context, appInfoProvider, "id", OkHttp.VERSION);
        }

        @Provides
        @Singleton
        public final FirebaseRemoteConfigParser provideFirebaseRemoteConfigParser(TagsProvider tagsProvider, ConditionsChecker conditionsChecker) {
            Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
            Intrinsics.checkNotNullParameter(conditionsChecker, "conditionsChecker");
            return new FirebaseRemoteConfigParserImpl(CollectionsKt.listOf(new TagsFirebaseConfigValueParser(tagsProvider, conditionsChecker)));
        }

        @Provides
        @Singleton
        public final ConditionsChecker provideConditionsChecker(BotRepository botRepository, Logger logger) {
            Intrinsics.checkNotNullParameter(botRepository, "botRepository");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new ConditionsChecker(botRepository, logger);
        }
    }
}
