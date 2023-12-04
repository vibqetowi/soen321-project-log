package com.ifriend.presentation.features.purchases.common.model;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.commons.codec.language.bm.Rule;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpgradeType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "", "analyticsSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "(Ljava/lang/String;ILcom/ifriend/analytics/usecase/purchase/PurchaseSource;)V", "getAnalyticsSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", Rule.ALL, ShareConstants.PHOTOS, "ADULT_TEXTING", "GENERATE_AVATAR", "FREE_NEURONS", "CHANGE_VOICE", "DIARY", "DEEPLINK", "CALL", "AUTO_AFTER_N_DAYS", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpgradeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpgradeType[] $VALUES;
    private final PurchaseSource analyticsSource;
    public static final UpgradeType ALL = new UpgradeType(Rule.ALL, 0, PurchaseSource.MENU);
    public static final UpgradeType PHOTOS = new UpgradeType(ShareConstants.PHOTOS, 1, PurchaseSource.WATCH_AI_PHOTO);
    public static final UpgradeType ADULT_TEXTING = new UpgradeType("ADULT_TEXTING", 2, PurchaseSource.SEXTING);
    public static final UpgradeType GENERATE_AVATAR = new UpgradeType("GENERATE_AVATAR", 3, PurchaseSource.GENERATE_AVATAR);
    public static final UpgradeType FREE_NEURONS = new UpgradeType("FREE_NEURONS", 4, PurchaseSource.GET_FREE_NEURONS);
    public static final UpgradeType CHANGE_VOICE = new UpgradeType("CHANGE_VOICE", 5, PurchaseSource.CHANGE_VOICE);
    public static final UpgradeType DIARY = new UpgradeType("DIARY", 6, PurchaseSource.DIARY);
    public static final UpgradeType DEEPLINK = new UpgradeType("DEEPLINK", 7, PurchaseSource.DEEPLINK);
    public static final UpgradeType CALL = new UpgradeType("CALL", 8, PurchaseSource.CALL);
    public static final UpgradeType AUTO_AFTER_N_DAYS = new UpgradeType("AUTO_AFTER_N_DAYS", 9, PurchaseSource.AUTO_AFTER_N_DAYS);

    private static final /* synthetic */ UpgradeType[] $values() {
        return new UpgradeType[]{ALL, PHOTOS, ADULT_TEXTING, GENERATE_AVATAR, FREE_NEURONS, CHANGE_VOICE, DIARY, DEEPLINK, CALL, AUTO_AFTER_N_DAYS};
    }

    public static EnumEntries<UpgradeType> getEntries() {
        return $ENTRIES;
    }

    public static UpgradeType valueOf(String str) {
        return (UpgradeType) Enum.valueOf(UpgradeType.class, str);
    }

    public static UpgradeType[] values() {
        return (UpgradeType[]) $VALUES.clone();
    }

    private UpgradeType(String str, int i, PurchaseSource purchaseSource) {
        this.analyticsSource = purchaseSource;
    }

    public final PurchaseSource getAnalyticsSource() {
        return this.analyticsSource;
    }

    static {
        UpgradeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
