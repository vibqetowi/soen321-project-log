package com.ifriend.domain.models.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavoriteTopic.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/onboarding/FavoriteTopic;", "", "(Ljava/lang/String;I)V", "hot", "dreams", "gossips", "routine", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteTopic {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FavoriteTopic[] $VALUES;
    public static final FavoriteTopic hot = new FavoriteTopic("hot", 0);
    public static final FavoriteTopic dreams = new FavoriteTopic("dreams", 1);
    public static final FavoriteTopic gossips = new FavoriteTopic("gossips", 2);
    public static final FavoriteTopic routine = new FavoriteTopic("routine", 3);

    private static final /* synthetic */ FavoriteTopic[] $values() {
        return new FavoriteTopic[]{hot, dreams, gossips, routine};
    }

    public static EnumEntries<FavoriteTopic> getEntries() {
        return $ENTRIES;
    }

    public static FavoriteTopic valueOf(String str) {
        return (FavoriteTopic) Enum.valueOf(FavoriteTopic.class, str);
    }

    public static FavoriteTopic[] values() {
        return (FavoriteTopic[]) $VALUES.clone();
    }

    private FavoriteTopic(String str, int i) {
    }

    static {
        FavoriteTopic[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
