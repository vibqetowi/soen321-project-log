package com.ifriend.analytics.usecase.purchase;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PurchaseSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "", "(Ljava/lang/String;I)V", "CHAT", "MENU", "SEXTING", "WATCH_AI_PHOTO", "GENERATE_AVATAR", "GET_FREE_NEURONS", "CHANGE_VOICE", "RESTORE", "DIARY", "GIFT_STORE", "CHATLIST", "CHATLIST_DIGITAL_COPY_SUBSCRIPTION", "DEEPLINK", "CALL", "AUTO_AFTER_N_DAYS", "UNKNOWN", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PurchaseSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseSource[] $VALUES;
    public static final PurchaseSource CHAT = new PurchaseSource("CHAT", 0);
    public static final PurchaseSource MENU = new PurchaseSource("MENU", 1);
    public static final PurchaseSource SEXTING = new PurchaseSource("SEXTING", 2);
    public static final PurchaseSource WATCH_AI_PHOTO = new PurchaseSource("WATCH_AI_PHOTO", 3);
    public static final PurchaseSource GENERATE_AVATAR = new PurchaseSource("GENERATE_AVATAR", 4);
    public static final PurchaseSource GET_FREE_NEURONS = new PurchaseSource("GET_FREE_NEURONS", 5);
    public static final PurchaseSource CHANGE_VOICE = new PurchaseSource("CHANGE_VOICE", 6);
    public static final PurchaseSource RESTORE = new PurchaseSource("RESTORE", 7);
    public static final PurchaseSource DIARY = new PurchaseSource("DIARY", 8);
    public static final PurchaseSource GIFT_STORE = new PurchaseSource("GIFT_STORE", 9);
    public static final PurchaseSource CHATLIST = new PurchaseSource("CHATLIST", 10);
    public static final PurchaseSource CHATLIST_DIGITAL_COPY_SUBSCRIPTION = new PurchaseSource("CHATLIST_DIGITAL_COPY_SUBSCRIPTION", 11);
    public static final PurchaseSource DEEPLINK = new PurchaseSource("DEEPLINK", 12);
    public static final PurchaseSource CALL = new PurchaseSource("CALL", 13);
    public static final PurchaseSource AUTO_AFTER_N_DAYS = new PurchaseSource("AUTO_AFTER_N_DAYS", 14);
    public static final PurchaseSource UNKNOWN = new PurchaseSource("UNKNOWN", 15);

    private static final /* synthetic */ PurchaseSource[] $values() {
        return new PurchaseSource[]{CHAT, MENU, SEXTING, WATCH_AI_PHOTO, GENERATE_AVATAR, GET_FREE_NEURONS, CHANGE_VOICE, RESTORE, DIARY, GIFT_STORE, CHATLIST, CHATLIST_DIGITAL_COPY_SUBSCRIPTION, DEEPLINK, CALL, AUTO_AFTER_N_DAYS, UNKNOWN};
    }

    public static EnumEntries<PurchaseSource> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseSource valueOf(String str) {
        return (PurchaseSource) Enum.valueOf(PurchaseSource.class, str);
    }

    public static PurchaseSource[] values() {
        return (PurchaseSource[]) $VALUES.clone();
    }

    private PurchaseSource(String str, int i) {
    }

    static {
        PurchaseSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
