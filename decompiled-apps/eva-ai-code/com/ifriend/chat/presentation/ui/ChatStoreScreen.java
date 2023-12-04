package com.ifriend.chat.presentation.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppScreens.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/ChatStoreScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "screenKey", "getScreenKey", "component1", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatStoreScreen implements FragmentScreen {
    public static final int $stable = 0;
    private final String chatId;

    public static /* synthetic */ ChatStoreScreen copy$default(ChatStoreScreen chatStoreScreen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatStoreScreen.chatId;
        }
        return chatStoreScreen.copy(str);
    }

    public final String component1() {
        return this.chatId;
    }

    public final ChatStoreScreen copy(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ChatStoreScreen(chatId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatStoreScreen) && Intrinsics.areEqual(this.chatId, ((ChatStoreScreen) obj).chatId);
    }

    public int hashCode() {
        return this.chatId.hashCode();
    }

    public String toString() {
        String str = this.chatId;
        return "ChatStoreScreen(chatId=" + str + ")";
    }

    public ChatStoreScreen(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatId = chatId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public Fragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return ChatsStoreFragment.Companion.newInstance(this.chatId);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return AnalyticsScreenName.MY_PROFILE.getValue();
    }
}
