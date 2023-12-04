package com.ifriend.domain.models.profile.user;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Subscription.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/profile/user/Subscription;", "", "(Ljava/lang/String;I)V", "isPremium", "", "NONE", "PREMIUM", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Subscription {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Subscription[] $VALUES;
    public static final Subscription NONE = new Subscription("NONE", 0);
    public static final Subscription PREMIUM = new Subscription("PREMIUM", 1);

    private static final /* synthetic */ Subscription[] $values() {
        return new Subscription[]{NONE, PREMIUM};
    }

    public static EnumEntries<Subscription> getEntries() {
        return $ENTRIES;
    }

    public static Subscription valueOf(String str) {
        return (Subscription) Enum.valueOf(Subscription.class, str);
    }

    public static Subscription[] values() {
        return (Subscription[]) $VALUES.clone();
    }

    private Subscription(String str, int i) {
    }

    static {
        Subscription[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final boolean isPremium() {
        return this == PREMIUM;
    }
}
