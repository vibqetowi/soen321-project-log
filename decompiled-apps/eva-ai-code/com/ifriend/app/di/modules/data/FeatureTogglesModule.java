package com.ifriend.app.di.modules.data;

import com.ifriend.data.toggle.ChatVideoBackgroundFeatureToggleImpl;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: FeatureTogglesModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/ifriend/app/di/modules/data/FeatureTogglesModule;", "", "bindsChatVideoBackgroundFeatureToggle", "Lcom/ifriend/domain/featuretoggles/ChatVideoBackgroundFeatureToggle;", "impl", "Lcom/ifriend/data/toggle/ChatVideoBackgroundFeatureToggleImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface FeatureTogglesModule {
    @Singleton
    @Binds
    ChatVideoBackgroundFeatureToggle bindsChatVideoBackgroundFeatureToggle(ChatVideoBackgroundFeatureToggleImpl chatVideoBackgroundFeatureToggleImpl);
}
