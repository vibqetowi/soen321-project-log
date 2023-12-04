package com.ifriend.chat.presentation.navigation;

import android.content.Context;
import android.content.Intent;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.facebook.internal.NativeProtocol;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.base.navigation.impl.cicerone.CloseActivityScreen;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.BotProfileScreen;
import com.ifriend.chat.presentation.ui.ChatSettingsScreen;
import com.ifriend.chat.presentation.ui.ChatStoreScreen;
import com.ifriend.chat.presentation.ui.UserProfileScreen;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingScreen;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ChangeEmailScreen;
import com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailScreen;
import com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment;
import com.ifriend.chat.presentation.ui.purchase.premium.old.BuyPremiumScreen;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.extensions.SerializeobjectKt;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.presentation.navigation.navflow.NavHostFlowFragment;
import com.ifriend.presentation.navigation.navflow.NavHostNavigationType;
import com.ifriend.registration.presentation.ui.RegistrationActivity;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
/* compiled from: AppFlowCoordinatorImpl.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J \u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020\u000eH\u0016J\u0012\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010.\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u000eH\u0016J\b\u00101\u001a\u00020\u000eH\u0016J\b\u00102\u001a\u00020\u000eH\u0016J\u0010\u00103\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ifriend/chat/presentation/navigation/AppFlowCoordinatorImpl;", "Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "chatScreenFactory", "Lcom/ifriend/chat/api/ChatScreenFactory;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "diaryScreenFactory", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenFactory;", "(Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/chat/api/ChatScreenFactory;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenFactory;)V", "back", "", "backHome", "backTo", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "exit", "goToBotProfile", "goToBuyChatSubscription", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "goToBuySubscription", "requestId", "Ljava/util/UUID;", "goToNeurons", "", "type", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "goToChangeEmail", "goToChat", "chatId", "", "showKeyboardOnStart", "isReplace", "goToChatCall", "goToChatSettings", "goToChatStore", "goToConfirmEmail", "goToDiary", "nodeId", "goToGenerateAvatar", "goToHome", "goToInfoOnboarding", "goToOnboarding", "goToSelectGeneratedAvatar", "goToUserProfile", "showInternalNotification", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "startAppFlow", "context", "Landroid/content/Context;", "startChatFeature", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppFlowCoordinatorImpl implements AppFlowCoordinator {
    public static final int $stable = 8;
    private final ChatScreenFactory chatScreenFactory;
    private final DiaryScreenFactory diaryScreenFactory;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final InternalNotificationHandler internalNotificationHandler;
    private final RouterProvider router;

    @Inject
    public AppFlowCoordinatorImpl(RouterProvider router, ChatScreenFactory chatScreenFactory, InternalNotificationHandler internalNotificationHandler, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, DiaryScreenFactory diaryScreenFactory) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(chatScreenFactory, "chatScreenFactory");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(diaryScreenFactory, "diaryScreenFactory");
        this.router = router;
        this.chatScreenFactory = chatScreenFactory;
        this.internalNotificationHandler = internalNotificationHandler;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
        this.diaryScreenFactory = diaryScreenFactory;
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToChat(String chatId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Screen chatScreen = this.chatScreenFactory.chatScreen(z, chatId);
        if (z2) {
            this.router.getAppRouter().replaceScreen(chatScreen);
        } else {
            this.router.getAppRouter().navigateTo(chatScreen);
        }
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void startChatFeature(boolean z, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.router.getAppRouter().newRootScreen(this.chatScreenFactory.chatScreen(z, chatId));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToHome() {
        this.router.getAppRouter().newRootScreen(this.chatScreenFactory.multiChatScreen());
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToOnboarding() {
        this.router.getAppRouter().newRootScreen(new FragmentScreen() { // from class: com.ifriend.chat.presentation.navigation.AppFlowCoordinatorImpl$goToOnboarding$1
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
                return new OnboardingFragment();
            }
        });
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToBuySubscription(UUID requestId, boolean z, UpgradeType type, PurchaseReason purchaseReason) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.router.getAppRouter().navigateTo(new BuyPremiumScreen(requestId, type, purchaseReason, z));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void showInternalNotification(InternalNotification params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.internalNotificationHandler.handle(params);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToGenerateAvatar() {
        this.router.getAppRouter().navigateTo(GenerateBotAvatarScreenFactory.DefaultImpls.getGenerateBotAvatarScreen$default(this.generateBotAvatarScreenFactory, null, 1, null));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToSelectGeneratedAvatar() {
        this.router.getAppRouter().navigateTo(this.generateBotAvatarScreenFactory.getSelectGeneratedAvatarScreen());
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToDiary(String str) {
        this.router.getAppRouter().navigateTo(this.diaryScreenFactory.diaryScreen(str));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToConfirmEmail() {
        this.router.getAppRouter().navigateTo(ConfirmEmailScreen.INSTANCE);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToChangeEmail() {
        this.router.getAppRouter().navigateTo(ChangeEmailScreen.INSTANCE);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToBotProfile() {
        this.router.getAppRouter().navigateTo(BotProfileScreen.INSTANCE);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToUserProfile() {
        this.router.getAppRouter().navigateTo(UserProfileScreen.INSTANCE);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToInfoOnboarding() {
        this.router.getAppRouter().navigateTo(new InfoOnboardingScreen());
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void backHome() {
        this.router.getAppRouter().backTo(this.chatScreenFactory.multiChatScreen());
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void back() {
        this.router.getRoute().exit();
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void startAppFlow(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, RegistrationActivity.class);
        intent.addFlags(335544320);
        context.startActivity(intent);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToChatStore(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.router.getAppRouter().navigateTo(new ChatStoreScreen(chatId));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToChatSettings(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.router.getAppRouter().navigateTo(new ChatSettingsScreen(chatId));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void exit() {
        this.router.getAppRouter().backTo(new CloseActivityScreen() { // from class: com.ifriend.chat.presentation.navigation.AppFlowCoordinatorImpl$exit$1
            @Override // com.ifriend.base.navigation.api.cicerone.Screen
            public String getScreenKey() {
                return CloseActivityScreen.DefaultImpls.getScreenKey(this);
            }
        });
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void backTo(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.router.getAppRouter().backTo(screen);
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToChatCall(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.router.getAppRouter().navigateTo(new NavHostFlow(NavHostNavigationType.CHAT_CALL, BundleKt.bundleOf(TuplesKt.to(NavHostFlowFragment.CHAT_CALL_ARG_KEY, chatId))));
    }

    @Override // com.ifriend.presentation.navigation.AppFlowCoordinator
    public void goToBuyChatSubscription(BuyChatSubscriptionBillingUiParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Json provideJson = SerializeobjectKt.getProvideJson();
        this.router.getAppRouter().navigateTo(new NavHostFlow(NavHostNavigationType.CHAT_SUBSCRIPTION, BundleKt.bundleOf(TuplesKt.to(NavHostFlowFragment.CHAT_SUBSCRIPTION_ARG_KEY, provideJson.encodeToString(SerializersKt.serializer(provideJson.getSerializersModule(), Reflection.typeOf(BuyChatSubscriptionBillingUiParams.class)), params)))));
    }
}
