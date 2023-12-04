package com.ifriend.platform.tools.api.speech;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextToSpeechStream.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechInitState;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "UNKNOWN", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToSpeechInitState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextToSpeechInitState[] $VALUES;
    public static final TextToSpeechInitState SUCCESS = new TextToSpeechInitState("SUCCESS", 0);
    public static final TextToSpeechInitState ERROR = new TextToSpeechInitState("ERROR", 1);
    public static final TextToSpeechInitState UNKNOWN = new TextToSpeechInitState("UNKNOWN", 2);

    private static final /* synthetic */ TextToSpeechInitState[] $values() {
        return new TextToSpeechInitState[]{SUCCESS, ERROR, UNKNOWN};
    }

    public static EnumEntries<TextToSpeechInitState> getEntries() {
        return $ENTRIES;
    }

    public static TextToSpeechInitState valueOf(String str) {
        return (TextToSpeechInitState) Enum.valueOf(TextToSpeechInitState.class, str);
    }

    public static TextToSpeechInitState[] values() {
        return (TextToSpeechInitState[]) $VALUES.clone();
    }

    private TextToSpeechInitState(String str, int i) {
    }

    static {
        TextToSpeechInitState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
