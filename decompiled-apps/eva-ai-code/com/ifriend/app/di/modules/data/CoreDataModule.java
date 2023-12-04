package com.ifriend.app.di.modules.data;

import com.ifiend.billing.impl.data.BillingRepositoryImpl;
import com.ifiend.billing.impl.logic.repository.BillingRepository;
import com.ifriend.app.di.modules.data.core.LocalDataSourceModule;
import com.ifriend.app.di.modules.data.memorycached.MemoryCachedModule;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.repository.chat.ChatsRepositoryImpl;
import com.ifriend.data.repository.chat.buy.BuyChatMessagesRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatsInfoConfigurationRepositoryImpl;
import com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl;
import com.ifriend.data.repository.chat.intro.ChatIntroRepositoryImpl;
import com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl;
import com.ifriend.data.repository.config.AppConfigRepositoryImpl;
import com.ifriend.data.repository.deeplinks.DeepLinksRepositoryImpl;
import com.ifriend.data.repository.experiments.FeatureTogglePayloadsRepositoryImpl;
import com.ifriend.data.repository.experiments.FeatureToggleRepositoryImpl;
import com.ifriend.data.repository.guide.UserGuideRepositoryImpl;
import com.ifriend.data.repository.offer.UserOffersRepositoryImpl;
import com.ifriend.data.repository.purchases.BillingPurchasesHistoryImpl;
import com.ifriend.data.repository.update.InAppUpdateRepositoryImpl;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.config.AppConfigLocalDataSourceImpl;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import com.ifriend.data.storages.tags.TagsLocalDataSourceImpl;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.data.chat.ChatIntroRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.data.experiments.FeatureTogglePayloadsRepository;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.guide.UserGuideRepository;
import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CoreDataModule.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 62\u00020\u0001:\u00016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H'J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020#H'J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020&H'J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020)H'J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020,H'J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020/H'J\u0010\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u000202H'J\u0010\u00103\u001a\u0002042\u0006\u0010\u0004\u001a\u000205H'¨\u00067"}, d2 = {"Lcom/ifriend/app/di/modules/data/CoreDataModule;", "", "bindChatIntroRepository", "Lcom/ifriend/domain/data/chat/ChatIntroRepository;", "impl", "Lcom/ifriend/data/repository/chat/intro/ChatIntroRepositoryImpl;", "bindExplanationRepository", "Lcom/ifriend/domain/data/guide/UserGuideRepository;", "Lcom/ifriend/data/repository/guide/UserGuideRepositoryImpl;", "bindInAppUpdateRepository", "Lcom/ifriend/domain/data/update/InAppUpdateRepository;", "Lcom/ifriend/data/repository/update/InAppUpdateRepositoryImpl;", "bindUserOffersRepository", "Lcom/ifriend/domain/data/offers/UserOffersRepository;", "Lcom/ifriend/data/repository/offer/UserOffersRepositoryImpl;", "bindsAppConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSourceImpl;", "bindsAppConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "Lcom/ifriend/data/repository/config/AppConfigRepositoryImpl;", "bindsBillingRepository", "Lcom/ifiend/billing/impl/logic/repository/BillingRepository;", "Lcom/ifiend/billing/impl/data/BillingRepositoryImpl;", "bindsBuyChatMessagesRepository", "Lcom/ifriend/domain/data/chat/BuyChatMessagesRepository;", "Lcom/ifriend/data/repository/chat/buy/BuyChatMessagesRepositoryImpl;", "bindsChatBackgroundRepository", "Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;", "Lcom/ifriend/data/repository/chat/info/ChatBackgroundRepositoryImpl;", "bindsChatSubscriptionRepository", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "Lcom/ifriend/data/repository/chat/subscription/ChatSubscriptionRepositoryImpl;", "bindsChatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "Lcom/ifriend/data/repository/chat/info/ChatsInfoConfigurationRepositoryImpl;", "bindsChatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "Lcom/ifriend/data/repository/chat/info/ChatsInfoRepositoryImpl;", "bindsChatsRepository", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "Lcom/ifriend/data/repository/chat/ChatsRepositoryImpl;", "bindsDeepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "Lcom/ifriend/data/repository/deeplinks/DeepLinksRepositoryImpl;", "bindsFeatureTogglePayloadsRepository", "Lcom/ifriend/domain/data/experiments/FeatureTogglePayloadsRepository;", "Lcom/ifriend/data/repository/experiments/FeatureTogglePayloadsRepositoryImpl;", "bindsFeatureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "Lcom/ifriend/data/repository/experiments/FeatureToggleRepositoryImpl;", "bindsTagsLocalDataSource", "Lcom/ifriend/data/storages/tags/TagsLocalDataSource;", "Lcom/ifriend/data/storages/tags/TagsLocalDataSourceImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {LocalDataModule.class, LocalDataSourceModule.class, MemoryCachedModule.class})
/* loaded from: classes6.dex */
public interface CoreDataModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Reusable
    @Binds
    ChatIntroRepository bindChatIntroRepository(ChatIntroRepositoryImpl chatIntroRepositoryImpl);

    @Reusable
    @Binds
    UserGuideRepository bindExplanationRepository(UserGuideRepositoryImpl userGuideRepositoryImpl);

    @Reusable
    @Binds
    InAppUpdateRepository bindInAppUpdateRepository(InAppUpdateRepositoryImpl inAppUpdateRepositoryImpl);

    @Reusable
    @Binds
    UserOffersRepository bindUserOffersRepository(UserOffersRepositoryImpl userOffersRepositoryImpl);

    @Singleton
    @Binds
    AppConfigLocalDataSource bindsAppConfigLocalDataSource(AppConfigLocalDataSourceImpl appConfigLocalDataSourceImpl);

    @Singleton
    @Binds
    AppConfigRepository bindsAppConfigRepository(AppConfigRepositoryImpl appConfigRepositoryImpl);

    @Reusable
    @Binds
    BillingRepository bindsBillingRepository(BillingRepositoryImpl billingRepositoryImpl);

    @Reusable
    @Binds
    BuyChatMessagesRepository bindsBuyChatMessagesRepository(BuyChatMessagesRepositoryImpl buyChatMessagesRepositoryImpl);

    @Singleton
    @Binds
    ChatBackgroundRepository bindsChatBackgroundRepository(ChatBackgroundRepositoryImpl chatBackgroundRepositoryImpl);

    @Singleton
    @Binds
    ChatSubscriptionRepository bindsChatSubscriptionRepository(ChatSubscriptionRepositoryImpl chatSubscriptionRepositoryImpl);

    @Singleton
    @Binds
    ChatsInfoConfigurationRepository bindsChatsInfoConfigurationRepository(ChatsInfoConfigurationRepositoryImpl chatsInfoConfigurationRepositoryImpl);

    @Singleton
    @Binds
    ChatsInfoRepository bindsChatsInfoRepository(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl);

    @Reusable
    @Binds
    ChatsRepository bindsChatsRepository(ChatsRepositoryImpl chatsRepositoryImpl);

    @Singleton
    @Binds
    DeepLinksRepository bindsDeepLinksRepository(DeepLinksRepositoryImpl deepLinksRepositoryImpl);

    @Reusable
    @Binds
    FeatureTogglePayloadsRepository bindsFeatureTogglePayloadsRepository(FeatureTogglePayloadsRepositoryImpl featureTogglePayloadsRepositoryImpl);

    @Reusable
    @Binds
    FeatureToggleRepository bindsFeatureToggleRepository(FeatureToggleRepositoryImpl featureToggleRepositoryImpl);

    @Singleton
    @Binds
    TagsLocalDataSource bindsTagsLocalDataSource(TagsLocalDataSourceImpl tagsLocalDataSourceImpl);

    /* compiled from: CoreDataModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/app/di/modules/data/CoreDataModule$Companion;", "", "()V", "provideUserProfileRepository", "Lcom/ifriend/domain/data/purchases/BillingPurchasesHistory;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "coreExecuteCatching", "Lcom/ifriend/data/common/CoreExecuteCatching;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Reusable
        public final BillingPurchasesHistory provideUserProfileRepository(@UserSessionSharedPreferences Preferences preferences, CoreExecuteCatching coreExecuteCatching) {
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
            return new BillingPurchasesHistoryImpl(preferences, coreExecuteCatching);
        }
    }
}
