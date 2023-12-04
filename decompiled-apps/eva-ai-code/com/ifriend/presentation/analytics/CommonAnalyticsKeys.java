package com.ifriend.presentation.analytics;

import com.appsflyer.AFInAppEventType;
import com.ifriend.common_utils.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonAnalyticsKeys.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/analytics/CommonAnalyticsKeys;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BOT_USER_ID", "BOT_NAME", "ECOMMERCE_PURCHASE", "ECOMMERCE_PURCHASE_FIRST", "FIRST_PURCHASE", "MALE_FIRST_PURCHASE", "AF_MALE_PURCHASE", "AF_PURCHASE", "PREMIUM_PURCHASE", "NEURONS_PURCHASE", "CARD_PURCHASE", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAnalyticsKeys {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommonAnalyticsKeys[] $VALUES;
    private final String value;
    public static final CommonAnalyticsKeys BOT_USER_ID = new CommonAnalyticsKeys("BOT_USER_ID", 0, "bot_UserId");
    public static final CommonAnalyticsKeys BOT_NAME = new CommonAnalyticsKeys("BOT_NAME", 1, Constants.BOT_NAME);
    public static final CommonAnalyticsKeys ECOMMERCE_PURCHASE = new CommonAnalyticsKeys("ECOMMERCE_PURCHASE", 2, "ecommerce_purchase");
    public static final CommonAnalyticsKeys ECOMMERCE_PURCHASE_FIRST = new CommonAnalyticsKeys("ECOMMERCE_PURCHASE_FIRST", 3, "ecommerce_purchase_first");
    public static final CommonAnalyticsKeys FIRST_PURCHASE = new CommonAnalyticsKeys("FIRST_PURCHASE", 4, "First Purchase");
    public static final CommonAnalyticsKeys MALE_FIRST_PURCHASE = new CommonAnalyticsKeys("MALE_FIRST_PURCHASE", 5, "Male First Purchase");
    public static final CommonAnalyticsKeys AF_MALE_PURCHASE = new CommonAnalyticsKeys("AF_MALE_PURCHASE", 6, "male_af_purchase");
    public static final CommonAnalyticsKeys AF_PURCHASE = new CommonAnalyticsKeys("AF_PURCHASE", 7, AFInAppEventType.PURCHASE);
    public static final CommonAnalyticsKeys PREMIUM_PURCHASE = new CommonAnalyticsKeys("PREMIUM_PURCHASE", 8, "Premium_purchase");
    public static final CommonAnalyticsKeys NEURONS_PURCHASE = new CommonAnalyticsKeys("NEURONS_PURCHASE", 9, "Neurons_purchase");
    public static final CommonAnalyticsKeys CARD_PURCHASE = new CommonAnalyticsKeys("CARD_PURCHASE", 10, "carp_purchase");

    private static final /* synthetic */ CommonAnalyticsKeys[] $values() {
        return new CommonAnalyticsKeys[]{BOT_USER_ID, BOT_NAME, ECOMMERCE_PURCHASE, ECOMMERCE_PURCHASE_FIRST, FIRST_PURCHASE, MALE_FIRST_PURCHASE, AF_MALE_PURCHASE, AF_PURCHASE, PREMIUM_PURCHASE, NEURONS_PURCHASE, CARD_PURCHASE};
    }

    public static EnumEntries<CommonAnalyticsKeys> getEntries() {
        return $ENTRIES;
    }

    public static CommonAnalyticsKeys valueOf(String str) {
        return (CommonAnalyticsKeys) Enum.valueOf(CommonAnalyticsKeys.class, str);
    }

    public static CommonAnalyticsKeys[] values() {
        return (CommonAnalyticsKeys[]) $VALUES.clone();
    }

    private CommonAnalyticsKeys(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CommonAnalyticsKeys[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
