package com.ifriend.presentation.features.app.di;

import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.chatsettings.ui.ChatSettingsFragment;
import com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment;
import com.ifriend.presentation.navigation.navflow.NavHostFlowFragment;
import kotlin.Metadata;
/* compiled from: AppPresentationProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ifriend/presentation/features/app/di/AppPresentationProvider;", "", "inject", "", "impl", "Lcom/ifriend/presentation/features/chatsettings/ui/ChatSettingsFragment;", "Lcom/ifriend/presentation/features/chatstore/ui/ChatsStoreFragment;", "Lcom/ifriend/presentation/navigation/navflow/NavHostFlowFragment;", "provideAppLaunchBillingFlow", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppPresentationProvider {
    void inject(ChatSettingsFragment chatSettingsFragment);

    void inject(ChatsStoreFragment chatsStoreFragment);

    void inject(NavHostFlowFragment navHostFlowFragment);

    AppLaunchBillingFlow provideAppLaunchBillingFlow();
}
