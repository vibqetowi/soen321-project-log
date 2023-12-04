package com.ifriend.domain.models.profile;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Gender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/profile/Gender;", "", "(Ljava/lang/String;I)V", "MALE", "FEMALE", "NON_BINARY", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Gender {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;
    public static final Gender MALE = new Gender("MALE", 0);
    public static final Gender FEMALE = new Gender("FEMALE", 1);
    public static final Gender NON_BINARY = new Gender("NON_BINARY", 2);

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{MALE, FEMALE, NON_BINARY};
    }

    public static EnumEntries<Gender> getEntries() {
        return $ENTRIES;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }

    private Gender(String str, int i) {
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
