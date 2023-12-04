package com.ifriend.chat.domain.chat.reset;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.commons.codec.language.bm.Rule;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResetAiPeriod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;", "", "(Ljava/lang/String;I)V", Rule.ALL, "DAY", "HOUR", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetAiPeriod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResetAiPeriod[] $VALUES;
    public static final ResetAiPeriod ALL = new ResetAiPeriod(Rule.ALL, 0);
    public static final ResetAiPeriod DAY = new ResetAiPeriod("DAY", 1);
    public static final ResetAiPeriod HOUR = new ResetAiPeriod("HOUR", 2);

    private static final /* synthetic */ ResetAiPeriod[] $values() {
        return new ResetAiPeriod[]{ALL, DAY, HOUR};
    }

    public static EnumEntries<ResetAiPeriod> getEntries() {
        return $ENTRIES;
    }

    public static ResetAiPeriod valueOf(String str) {
        return (ResetAiPeriod) Enum.valueOf(ResetAiPeriod.class, str);
    }

    public static ResetAiPeriod[] values() {
        return (ResetAiPeriod[]) $VALUES.clone();
    }

    private ResetAiPeriod(String str, int i) {
    }

    static {
        ResetAiPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
