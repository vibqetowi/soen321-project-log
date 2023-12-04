package com.ifriend.domain.data.generateAvatar;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GenerateBotAvatarRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/data/generateAvatar/AvatarGenerationStatus;", "", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "ERROR", "NO_GENERATION", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarGenerationStatus[] $VALUES;
    public static final AvatarGenerationStatus PROCESSING = new AvatarGenerationStatus("PROCESSING", 0);
    public static final AvatarGenerationStatus SUCCESS = new AvatarGenerationStatus("SUCCESS", 1);
    public static final AvatarGenerationStatus ERROR = new AvatarGenerationStatus("ERROR", 2);
    public static final AvatarGenerationStatus NO_GENERATION = new AvatarGenerationStatus("NO_GENERATION", 3);

    private static final /* synthetic */ AvatarGenerationStatus[] $values() {
        return new AvatarGenerationStatus[]{PROCESSING, SUCCESS, ERROR, NO_GENERATION};
    }

    public static EnumEntries<AvatarGenerationStatus> getEntries() {
        return $ENTRIES;
    }

    public static AvatarGenerationStatus valueOf(String str) {
        return (AvatarGenerationStatus) Enum.valueOf(AvatarGenerationStatus.class, str);
    }

    public static AvatarGenerationStatus[] values() {
        return (AvatarGenerationStatus[]) $VALUES.clone();
    }

    private AvatarGenerationStatus(String str, int i) {
    }

    static {
        AvatarGenerationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
