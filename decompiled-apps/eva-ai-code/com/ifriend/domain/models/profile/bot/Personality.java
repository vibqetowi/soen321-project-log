package com.ifriend.domain.models.profile.bot;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Personality.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Personality;", "", "(Ljava/lang/String;I)V", "FLIRTY", "FRIENDLY", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Personality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Personality[] $VALUES;
    public static final Personality FLIRTY = new Personality("FLIRTY", 0);
    public static final Personality FRIENDLY = new Personality("FRIENDLY", 1);

    private static final /* synthetic */ Personality[] $values() {
        return new Personality[]{FLIRTY, FRIENDLY};
    }

    public static EnumEntries<Personality> getEntries() {
        return $ENTRIES;
    }

    public static Personality valueOf(String str) {
        return (Personality) Enum.valueOf(Personality.class, str);
    }

    public static Personality[] values() {
        return (Personality[]) $VALUES.clone();
    }

    private Personality(String str, int i) {
    }

    static {
        Personality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
