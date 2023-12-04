package com.ifriend.chat.presentation.ui.chat.presentation.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeFragmentScreen.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/home/HomeFragmentScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "()V", "screenKey", "", "getScreenKey", "()Ljava/lang/String;", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeFragmentScreen implements FragmentScreen {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String NAME = AnalyticsScreenName.CHATS_LIST.getValue();
    private final String screenKey = NAME;

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    /* compiled from: HomeFragmentScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/home/HomeFragmentScreen$Companion;", "", "()V", "NAME", "", "getNAME", "()Ljava/lang/String;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getNAME() {
            return HomeFragmentScreen.NAME;
        }
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return this.screenKey;
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public Fragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new HomeFragment();
    }
}
