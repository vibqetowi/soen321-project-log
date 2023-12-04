package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import kotlin.Metadata;
/* compiled from: BotVoiceScreen.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/ChangeVoiceScreenFactoryImpl;", "Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;", "()V", "changeVoiceScreen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeVoiceScreenFactoryImpl implements ChangeVoiceScreenFactory {
    public static final int $stable = 0;

    @Override // com.ifriend.presentation.temp.ChangeVoiceScreenFactory
    public Screen changeVoiceScreen() {
        return BotVoiceScreen.INSTANCE;
    }
}
