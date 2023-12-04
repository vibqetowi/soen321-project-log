package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatScreen.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatWithTopicsScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "showKeyboardOnStart", "", "chatId", "", "(ZLjava/lang/String;)V", "screenKey", "getScreenKey", "()Ljava/lang/String;", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatWithTopicsScreen implements FragmentScreen {
    private final String chatId;
    private final boolean showKeyboardOnStart;

    public ChatWithTopicsScreen(boolean z, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.showKeyboardOnStart = z;
        this.chatId = chatId;
    }

    public /* synthetic */ ChatWithTopicsScreen(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public Fragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return ChatFragment.Companion.newInstance(this.showKeyboardOnStart, this.chatId);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return AnalyticsScreenName.CHAT.getValue();
    }
}
