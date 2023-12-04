package com.ifriend.chat.domain.navigation;

import com.ifriend.base.navigation.api.cicerone.Screen;
import kotlin.Metadata;
/* compiled from: GenerateBotAvatarScreenFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "", "getGenerateBotAvatarErrorScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "getGenerateBotAvatarScreen", "presetDescription", "", "getGeneratingBotAvatarPlaceholderScreen", "getSelectGeneratedAvatarScreen", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GenerateBotAvatarScreenFactory {
    Screen getGenerateBotAvatarErrorScreen();

    Screen getGenerateBotAvatarScreen(String str);

    Screen getGeneratingBotAvatarPlaceholderScreen();

    Screen getSelectGeneratedAvatarScreen();

    /* compiled from: GenerateBotAvatarScreenFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Screen getGenerateBotAvatarScreen$default(GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return generateBotAvatarScreenFactory.getGenerateBotAvatarScreen(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGenerateBotAvatarScreen");
        }
    }
}
