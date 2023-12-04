package com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferBadgesUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.ui.theme.AppColors;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
/* compiled from: ChatBuySubscriptionOfferUiMapper.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u000bH\u0097\u0001J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0013\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096\u0001J4\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0096\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000bH\u0096\u0001J,\u0010#\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0096\u0001¢\u0006\u0002\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u000bH\u0096\u0001J7\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010/R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/mappers/ChatBuySubscriptionOfferUiMapper;", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "resourceProvider", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getPackageName", "()Ljava/lang/String;", "getBoolean", "", "resId", "", "getColor", "Landroidx/compose/ui/graphics/Color;", "style", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;", "getColor-vNxB06k", "(Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadgeStyle;)J", "getColorStateList", "Landroid/content/res/ColorStateList;", "colorResId", "getDimensionPixelSize", "dimenRes", "getFont", "Landroid/graphics/Typeface;", "getInteger", "getIntegerArray", "", "getQuantityString", "res", FirebaseAnalytics.Param.QUANTITY, "args", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "map", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "product", "Lcom/ifriend/billing/api/models/BillingProduct;", "isSelected", "shadowColor", "badge", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadges;", "map-9LQNqLg", "(Lcom/ifriend/billing/api/models/BillingProduct;ZJLcom/ifriend/domain/logic/chat/configuration/ChatConfig$SubscriptionBadges;)Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionOfferUiMapper implements ResourceProvider {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    /* compiled from: ChatBuySubscriptionOfferUiMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatConfig.SubscriptionBadgeStyle.values().length];
            try {
                iArr[ChatConfig.SubscriptionBadgeStyle.PURPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatConfig.SubscriptionBadgeStyle.ORANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatConfig.SubscriptionBadgeStyle.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public boolean getBoolean(int i) {
        return this.resourceProvider.getBoolean(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public ColorStateList getColorStateList(int i) {
        return this.resourceProvider.getColorStateList(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getDimensionPixelSize(int i) {
        return this.resourceProvider.getDimensionPixelSize(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public Typeface getFont(int i) {
        return this.resourceProvider.getFont(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public int getInteger(int i) {
        return this.resourceProvider.getInteger(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<Integer> getIntegerArray(int i) {
        return this.resourceProvider.getIntegerArray(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getPackageName() {
        return this.resourceProvider.getPackageName();
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2) {
        return this.resourceProvider.getQuantityString(i, i2);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getQuantityString(int i, int i2, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getQuantityString(i, i2, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i) {
        return this.resourceProvider.getString(i);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public String getString(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.resourceProvider.getString(i, args);
    }

    @Override // com.ifriend.platform.tools.api.ResourceProvider
    public List<String> getStringArray(int i) {
        return this.resourceProvider.getStringArray(i);
    }

    @Inject
    public ChatBuySubscriptionOfferUiMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    /* renamed from: map-9LQNqLg$default  reason: not valid java name */
    public static /* synthetic */ ChatSubscriptionOfferUi m6968map9LQNqLg$default(ChatBuySubscriptionOfferUiMapper chatBuySubscriptionOfferUiMapper, BillingProduct billingProduct, boolean z, long j, ChatConfig.SubscriptionBadges subscriptionBadges, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return chatBuySubscriptionOfferUiMapper.m6969map9LQNqLg(billingProduct, z, j, subscriptionBadges);
    }

    /* renamed from: map-9LQNqLg  reason: not valid java name */
    public final ChatSubscriptionOfferUi m6969map9LQNqLg(BillingProduct product, boolean z, long j, ChatConfig.SubscriptionBadges subscriptionBadges) {
        Intrinsics.checkNotNullParameter(product, "product");
        double priceForOneMonth = product.getPriceForOneMonth();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(priceForOneMonth)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        Currency currency = product.getPrice().getCurrency();
        String quantityString = getQuantityString(R.plurals.month, product.getSubscriptionMonths());
        ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi = subscriptionBadges != null ? new ChatSubscriptionOfferBadgesUi(subscriptionBadges.getTitle(), m6967getColorvNxB06k(subscriptionBadges.getType()), j, null) : null;
        String productId = product.getProductId();
        String valueOf = String.valueOf(product.getSubscriptionMonths());
        String upperCase = quantityString.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        int i = R.string.buy_premium__per_month;
        String symbol = currency.getSymbol();
        return new ChatSubscriptionOfferUi(productId, valueOf, upperCase, getString(i, symbol + format), product.getPriceLabel(), z, chatSubscriptionOfferBadgesUi);
    }

    /* renamed from: getColor-vNxB06k  reason: not valid java name */
    private final long m6967getColorvNxB06k(ChatConfig.SubscriptionBadgeStyle subscriptionBadgeStyle) {
        int i = WhenMappings.$EnumSwitchMapping$0[subscriptionBadgeStyle.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return AppColors.Companion.m7134getGreenBadgeColor0d7_KjU();
                }
                throw new NoWhenBranchMatchedException();
            }
            return AppColors.Companion.m7137getOrangeBadgeColor0d7_KjU();
        }
        return AppColors.Companion.m7138getPinkBadgeColor0d7_KjU();
    }
}
