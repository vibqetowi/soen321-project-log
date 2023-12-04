package com.ifriend.presentation.features.chatcall.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/chatcall/viewmodel/FinishCallReason;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "END_CLICK", "TIMEOUT_ACTIONS", "API_ERROR", "INTERNAL_ERROR", "APP_IN_BACKGROUND", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FinishCallReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FinishCallReason[] $VALUES;
    private final String key;
    public static final FinishCallReason END_CLICK = new FinishCallReason("END_CLICK", 0, "userTap");
    public static final FinishCallReason TIMEOUT_ACTIONS = new FinishCallReason("TIMEOUT_ACTIONS", 1, "timeoutSilence");
    public static final FinishCallReason API_ERROR = new FinishCallReason("API_ERROR", 2, "apiError");
    public static final FinishCallReason INTERNAL_ERROR = new FinishCallReason("INTERNAL_ERROR", 3, "internalError");
    public static final FinishCallReason APP_IN_BACKGROUND = new FinishCallReason("APP_IN_BACKGROUND", 4, "appBackground");

    private static final /* synthetic */ FinishCallReason[] $values() {
        return new FinishCallReason[]{END_CLICK, TIMEOUT_ACTIONS, API_ERROR, INTERNAL_ERROR, APP_IN_BACKGROUND};
    }

    public static EnumEntries<FinishCallReason> getEntries() {
        return $ENTRIES;
    }

    public static FinishCallReason valueOf(String str) {
        return (FinishCallReason) Enum.valueOf(FinishCallReason.class, str);
    }

    public static FinishCallReason[] values() {
        return (FinishCallReason[]) $VALUES.clone();
    }

    private FinishCallReason(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        FinishCallReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
