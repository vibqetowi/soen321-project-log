package com.ifriend.domain.storage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventDelayStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/domain/storage/DelayedEventType;", "", "(Ljava/lang/String;I)V", "RE_SEND_EMAIL_CONFIRMATION", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelayedEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DelayedEventType[] $VALUES;
    public static final DelayedEventType RE_SEND_EMAIL_CONFIRMATION = new DelayedEventType("RE_SEND_EMAIL_CONFIRMATION", 0);

    private static final /* synthetic */ DelayedEventType[] $values() {
        return new DelayedEventType[]{RE_SEND_EMAIL_CONFIRMATION};
    }

    public static EnumEntries<DelayedEventType> getEntries() {
        return $ENTRIES;
    }

    public static DelayedEventType valueOf(String str) {
        return (DelayedEventType) Enum.valueOf(DelayedEventType.class, str);
    }

    public static DelayedEventType[] values() {
        return (DelayedEventType[]) $VALUES.clone();
    }

    private DelayedEventType(String str, int i) {
    }

    static {
        DelayedEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
