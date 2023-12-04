package com.ifriend.domain.models.update;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpdatePromtType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/models/update/UpdatePromptType;", "", "(Ljava/lang/String;I)V", "Flexible", "Immediate", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdatePromptType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpdatePromptType[] $VALUES;
    public static final UpdatePromptType Flexible = new UpdatePromptType("Flexible", 0);
    public static final UpdatePromptType Immediate = new UpdatePromptType("Immediate", 1);

    private static final /* synthetic */ UpdatePromptType[] $values() {
        return new UpdatePromptType[]{Flexible, Immediate};
    }

    public static EnumEntries<UpdatePromptType> getEntries() {
        return $ENTRIES;
    }

    public static UpdatePromptType valueOf(String str) {
        return (UpdatePromptType) Enum.valueOf(UpdatePromptType.class, str);
    }

    public static UpdatePromptType[] values() {
        return (UpdatePromptType[]) $VALUES.clone();
    }

    private UpdatePromptType(String str, int i) {
    }

    static {
        UpdatePromptType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
