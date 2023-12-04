package com.ifriend.presentation.navigation;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: AppFlowCoordinator.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J,\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&J$\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0011H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001f\u001a\u00020\u0003H&J\u0014\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H&J\u001a\u0010-\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006."}, d2 = {"Lcom/ifriend/presentation/navigation/AppFlowCoordinator;", "", "back", "", "backHome", "backTo", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "exit", "goToBotProfile", "goToBuyChatSubscription", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "goToBuySubscription", "requestId", "Ljava/util/UUID;", "goToNeurons", "", "type", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "goToChangeEmail", "goToChat", "chatId", "", "showKeyboardOnStart", "isReplace", "goToChatCall", "goToChatSettings", "goToChatStore", "goToConfirmEmail", "goToDiary", "nodeId", "goToGenerateAvatar", "goToHome", "goToInfoOnboarding", "goToOnboarding", "goToSelectGeneratedAvatar", "goToUserProfile", "showInternalNotification", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "startAppFlow", "context", "Landroid/content/Context;", "startChatFeature", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppFlowCoordinator {
    void back();

    void backHome();

    void backTo(Screen screen);

    void exit();

    void goToBotProfile();

    void goToBuyChatSubscription(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams);

    void goToBuySubscription(UUID uuid, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason);

    void goToChangeEmail();

    void goToChat(String str, boolean z, boolean z2);

    void goToChatCall(String str);

    void goToChatSettings(String str);

    void goToChatStore(String str);

    void goToConfirmEmail();

    void goToDiary(String str);

    void goToGenerateAvatar();

    void goToHome();

    void goToInfoOnboarding();

    void goToOnboarding();

    void goToSelectGeneratedAvatar();

    void goToUserProfile();

    void showInternalNotification(InternalNotification internalNotification);

    void startAppFlow(Context context);

    void startChatFeature(boolean z, String str);

    /* compiled from: AppFlowCoordinator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void goToChat$default(AppFlowCoordinator appFlowCoordinator, String str, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToChat");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            appFlowCoordinator.goToChat(str, z, z2);
        }

        public static /* synthetic */ void startChatFeature$default(AppFlowCoordinator appFlowCoordinator, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChatFeature");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            appFlowCoordinator.startChatFeature(z, str);
        }

        public static /* synthetic */ void goToBuySubscription$default(AppFlowCoordinator appFlowCoordinator, UUID uuid, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySubscription");
            }
            if ((i & 8) != 0) {
                purchaseReason = null;
            }
            appFlowCoordinator.goToBuySubscription(uuid, z, upgradeType, purchaseReason);
        }

        public static /* synthetic */ void goToDiary$default(AppFlowCoordinator appFlowCoordinator, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDiary");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            appFlowCoordinator.goToDiary(str);
        }
    }
}
