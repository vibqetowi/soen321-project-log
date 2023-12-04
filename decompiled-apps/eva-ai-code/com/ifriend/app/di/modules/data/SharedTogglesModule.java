package com.ifriend.app.di.modules.data;

import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AnimatedAvatarFeatureToggle;
import com.ifriend.data.toggle.AnimatedAvatarOnChatToggle;
import com.ifriend.data.toggle.AnimatedBackgroundFeatureToggle;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.data.toggle.NeuronsToggle;
import com.ifriend.data.toggle.NeuronsToggleQualifier;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.toggle.FeatureToggle;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SharedTogglesModule.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u001d"}, d2 = {"Lcom/ifriend/app/di/modules/data/SharedTogglesModule;", "", "()V", "provideAnimatedAvatarFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarFeatureToggle;", "appConfigLocalDataSource", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideAnimatedAvatarOnChatToggle", "Lcom/ifriend/data/toggle/AnimatedAvatarOnChatToggle;", "provideAnimatedBackgroundFeatureToggle", "Lcom/ifriend/data/toggle/AnimatedBackgroundFeatureToggle;", "provideAvatarGenerationFreeToggle", "Lcom/ifriend/data/toggle/AvatarGenerationFreeToggle;", "provideAvatarInPushToggle", "Lcom/ifriend/data/toggle/AvatarInPushToggle;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "provideAvatarInRetentionPushToggle", "Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "provideConfirmEmailFeatureToggle", "Lcom/ifriend/data/toggle/ConfirmEmailFeatureToggle;", "provideNeuronsFeatureToggle", "Lcom/ifriend/domain/toggle/FeatureToggle;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "provideRateAndReviewUsToggle", "Lcom/ifriend/data/toggle/RateAndReviewUsToggle;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {FeatureTogglesModule.class})
/* loaded from: classes6.dex */
public final class SharedTogglesModule {
    @Provides
    @Singleton
    @NeuronsToggleQualifier
    public final FeatureToggle provideNeuronsFeatureToggle(TagsProvider tagsProvider, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new NeuronsToggle(tagsProvider, coroutineScope);
    }

    @Provides
    @Singleton
    public final ConfirmEmailFeatureToggle provideConfirmEmailFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new ConfirmEmailFeatureToggle(appConfigLocalDataSource, coroutineScope);
    }

    @Provides
    @Singleton
    public final AnimatedBackgroundFeatureToggle provideAnimatedBackgroundFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new AnimatedBackgroundFeatureToggle(appConfigLocalDataSource, coroutineScope);
    }

    @Provides
    @Singleton
    public final AnimatedAvatarOnChatToggle provideAnimatedAvatarOnChatToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new AnimatedAvatarOnChatToggle(appConfigLocalDataSource, coroutineScope);
    }

    @Provides
    @Singleton
    public final AnimatedAvatarFeatureToggle provideAnimatedAvatarFeatureToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new AnimatedAvatarFeatureToggle(appConfigLocalDataSource, coroutineScope);
    }

    @Provides
    @Singleton
    public final AvatarInPushToggle provideAvatarInPushToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, @UserSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new AvatarInPushToggle(appConfigLocalDataSource, coroutineScope, preferences);
    }

    @Provides
    @Singleton
    public final AvatarInRetentionPushToggle provideAvatarInRetentionPushToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope, @UserSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new AvatarInRetentionPushToggle(appConfigLocalDataSource, coroutineScope, preferences);
    }

    @Provides
    @Singleton
    public final AvatarGenerationFreeToggle provideAvatarGenerationFreeToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new AvatarGenerationFreeToggle(appConfigLocalDataSource, coroutineScope);
    }

    @Provides
    @Singleton
    public final RateAndReviewUsToggle provideRateAndReviewUsToggle(AppConfigLocalDataSource appConfigLocalDataSource, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appConfigLocalDataSource, "appConfigLocalDataSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new RateAndReviewUsToggle(appConfigLocalDataSource, coroutineScope);
    }
}
