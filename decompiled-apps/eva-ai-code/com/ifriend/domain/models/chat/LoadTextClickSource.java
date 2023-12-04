package com.ifriend.domain.models.chat;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatAudioViewEventListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/chat/LoadTextClickSource;", "", "(Ljava/lang/String;I)V", "VIEW", "OUTSIDE", "NONE", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadTextClickSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoadTextClickSource[] $VALUES;
    public static final LoadTextClickSource VIEW = new LoadTextClickSource("VIEW", 0);
    public static final LoadTextClickSource OUTSIDE = new LoadTextClickSource("OUTSIDE", 1);
    public static final LoadTextClickSource NONE = new LoadTextClickSource("NONE", 2);

    private static final /* synthetic */ LoadTextClickSource[] $values() {
        return new LoadTextClickSource[]{VIEW, OUTSIDE, NONE};
    }

    public static EnumEntries<LoadTextClickSource> getEntries() {
        return $ENTRIES;
    }

    public static LoadTextClickSource valueOf(String str) {
        return (LoadTextClickSource) Enum.valueOf(LoadTextClickSource.class, str);
    }

    public static LoadTextClickSource[] values() {
        return (LoadTextClickSource[]) $VALUES.clone();
    }

    private LoadTextClickSource(String str, int i) {
    }

    static {
        LoadTextClickSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
