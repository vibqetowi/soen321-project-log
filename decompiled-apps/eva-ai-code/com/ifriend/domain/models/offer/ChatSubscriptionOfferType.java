package com.ifriend.domain.models.offer;

import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatSubscriptionOfferType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/offer/ChatSubscriptionOfferType;", "", "(Ljava/lang/String;I)V", "AfterOnboarding", "Auto", KeychainModule.AccessControl.NONE, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatSubscriptionOfferType[] $VALUES;
    public static final ChatSubscriptionOfferType AfterOnboarding = new ChatSubscriptionOfferType("AfterOnboarding", 0);
    public static final ChatSubscriptionOfferType Auto = new ChatSubscriptionOfferType("Auto", 1);
    public static final ChatSubscriptionOfferType None = new ChatSubscriptionOfferType(KeychainModule.AccessControl.NONE, 2);

    private static final /* synthetic */ ChatSubscriptionOfferType[] $values() {
        return new ChatSubscriptionOfferType[]{AfterOnboarding, Auto, None};
    }

    public static EnumEntries<ChatSubscriptionOfferType> getEntries() {
        return $ENTRIES;
    }

    public static ChatSubscriptionOfferType valueOf(String str) {
        return (ChatSubscriptionOfferType) Enum.valueOf(ChatSubscriptionOfferType.class, str);
    }

    public static ChatSubscriptionOfferType[] values() {
        return (ChatSubscriptionOfferType[]) $VALUES.clone();
    }

    private ChatSubscriptionOfferType(String str, int i) {
    }

    static {
        ChatSubscriptionOfferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
