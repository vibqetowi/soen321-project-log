package com.ifriend.chat.presentation.ui.purchase.premium.old;

import androidx.fragment.app.FragmentFactory;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.presentation.ui.purchase.premium.BuyPremiumFragment;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/purchase/premium/old/BuyPremiumScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "requestId", "Ljava/util/UUID;", "type", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "isNeedToGoToNeuronsAfterDismiss", "", "(Ljava/util/UUID;Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Z)V", "createFragment", "Lcom/ifriend/chat/presentation/ui/purchase/premium/BuyPremiumFragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreen implements FragmentScreen {
    public static final int $stable = 8;
    private final boolean isNeedToGoToNeuronsAfterDismiss;
    private final PurchaseReason purchaseReason;
    private final UUID requestId;
    private final UpgradeType type;

    public BuyPremiumScreen(UUID requestId, UpgradeType type, PurchaseReason purchaseReason, boolean z) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.requestId = requestId;
        this.type = type;
        this.purchaseReason = purchaseReason;
        this.isNeedToGoToNeuronsAfterDismiss = z;
    }

    public /* synthetic */ BuyPremiumScreen(UUID uuid, UpgradeType upgradeType, PurchaseReason purchaseReason, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, upgradeType, purchaseReason, (i & 8) != 0 ? false : z);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return FragmentScreen.DefaultImpls.getScreenKey(this);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public BuyPremiumFragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return BuyPremiumFragment.Companion.newInstance(this.requestId, this.type.getAnalyticsSource(), this.purchaseReason, this.isNeedToGoToNeuronsAfterDismiss);
    }
}
