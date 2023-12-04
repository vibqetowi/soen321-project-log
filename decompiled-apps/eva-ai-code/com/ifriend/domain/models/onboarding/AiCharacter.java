package com.ifriend.domain.models.onboarding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AiCharacter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/onboarding/AiCharacter;", "", "(Ljava/lang/String;I)V", "hot", "shy", "smart", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AiCharacter {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AiCharacter[] $VALUES;
    public static final AiCharacter hot = new AiCharacter("hot", 0);
    public static final AiCharacter shy = new AiCharacter("shy", 1);
    public static final AiCharacter smart = new AiCharacter("smart", 2);

    private static final /* synthetic */ AiCharacter[] $values() {
        return new AiCharacter[]{hot, shy, smart};
    }

    public static EnumEntries<AiCharacter> getEntries() {
        return $ENTRIES;
    }

    public static AiCharacter valueOf(String str) {
        return (AiCharacter) Enum.valueOf(AiCharacter.class, str);
    }

    public static AiCharacter[] values() {
        return (AiCharacter[]) $VALUES.clone();
    }

    private AiCharacter(String str, int i) {
    }

    static {
        AiCharacter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
