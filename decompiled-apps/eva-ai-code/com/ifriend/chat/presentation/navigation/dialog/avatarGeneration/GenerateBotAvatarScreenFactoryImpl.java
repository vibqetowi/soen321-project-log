package com.ifriend.chat.presentation.navigation.dialog.avatarGeneration;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.GeneratingBotAvatarPlaceholderFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarFragment;
import com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenerateBotAvatarScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/presentation/navigation/dialog/avatarGeneration/GenerateBotAvatarScreenFactoryImpl;", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "()V", "getGenerateBotAvatarErrorScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "getGenerateBotAvatarScreen", "presetDescription", "", "getGeneratingBotAvatarPlaceholderScreen", "getSelectGeneratedAvatarScreen", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarScreenFactoryImpl implements GenerateBotAvatarScreenFactory {
    public static final int $stable = 0;

    @Override // com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory
    public Screen getGenerateBotAvatarScreen(final String str) {
        return new FragmentScreen() { // from class: com.ifriend.chat.presentation.navigation.dialog.avatarGeneration.GenerateBotAvatarScreenFactoryImpl$getGenerateBotAvatarScreen$1
            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public boolean getClearContainer() {
                return FragmentScreen.DefaultImpls.getClearContainer(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public Fragment createFragment(FragmentFactory factory) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return GenerateBotAvatarFragment.Companion.newInstance(str);
            }

            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return AnalyticsScreenName.CHANGE_BOT_GENERATE_AVATAR.getValue();
            }
        };
    }

    @Override // com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory
    public Screen getGeneratingBotAvatarPlaceholderScreen() {
        return new FragmentScreen() { // from class: com.ifriend.chat.presentation.navigation.dialog.avatarGeneration.GenerateBotAvatarScreenFactoryImpl$getGeneratingBotAvatarPlaceholderScreen$1
            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public boolean getClearContainer() {
                return FragmentScreen.DefaultImpls.getClearContainer(this);
            }

            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return FragmentScreen.DefaultImpls.getScreenKey(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public Fragment createFragment(FragmentFactory factory) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return GeneratingBotAvatarPlaceholderFragment.Companion.newInstance();
            }
        };
    }

    @Override // com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory
    public Screen getSelectGeneratedAvatarScreen() {
        return new FragmentScreen() { // from class: com.ifriend.chat.presentation.navigation.dialog.avatarGeneration.GenerateBotAvatarScreenFactoryImpl$getSelectGeneratedAvatarScreen$1
            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public boolean getClearContainer() {
                return FragmentScreen.DefaultImpls.getClearContainer(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public Fragment createFragment(FragmentFactory factory) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return SelectGeneratedAvatarFragment.Companion.newInstance();
            }

            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return AnalyticsScreenName.CHOOSE_AVATAR_IMAGE.getValue();
            }
        };
    }

    @Override // com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory
    public Screen getGenerateBotAvatarErrorScreen() {
        return new FragmentScreen() { // from class: com.ifriend.chat.presentation.navigation.dialog.avatarGeneration.GenerateBotAvatarScreenFactoryImpl$getGenerateBotAvatarErrorScreen$1
            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public boolean getClearContainer() {
                return FragmentScreen.DefaultImpls.getClearContainer(this);
            }

            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return FragmentScreen.DefaultImpls.getScreenKey(this);
            }

            @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
            public Fragment createFragment(FragmentFactory factory) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                return GenerateBotAvatarErrorFragment.Companion.newInstance();
            }
        };
    }
}
