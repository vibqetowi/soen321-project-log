package com.ifriend.domain.models.profile.bot;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Ethnicity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "", "(Ljava/lang/String;I)V", "ASIAN", "WHITE", "LATINO", "BLACK", "OTHER", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Ethnicity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Ethnicity[] $VALUES;
    public static final Ethnicity ASIAN = new Ethnicity("ASIAN", 0);
    public static final Ethnicity WHITE = new Ethnicity("WHITE", 1);
    public static final Ethnicity LATINO = new Ethnicity("LATINO", 2);
    public static final Ethnicity BLACK = new Ethnicity("BLACK", 3);
    public static final Ethnicity OTHER = new Ethnicity("OTHER", 4);

    private static final /* synthetic */ Ethnicity[] $values() {
        return new Ethnicity[]{ASIAN, WHITE, LATINO, BLACK, OTHER};
    }

    public static EnumEntries<Ethnicity> getEntries() {
        return $ENTRIES;
    }

    public static Ethnicity valueOf(String str) {
        return (Ethnicity) Enum.valueOf(Ethnicity.class, str);
    }

    public static Ethnicity[] values() {
        return (Ethnicity[]) $VALUES.clone();
    }

    private Ethnicity(String str, int i) {
    }

    static {
        Ethnicity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
