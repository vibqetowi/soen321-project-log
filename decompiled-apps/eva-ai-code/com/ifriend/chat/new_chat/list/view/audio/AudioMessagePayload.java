package com.ifriend.chat.new_chat.list.view.audio;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioMessagePlayerDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/new_chat/list/view/audio/AudioMessagePayload;", "", "(Ljava/lang/String;I)V", "PLAYBACK", "DECODING", "UPLOAD", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessagePayload {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioMessagePayload[] $VALUES;
    public static final AudioMessagePayload PLAYBACK = new AudioMessagePayload("PLAYBACK", 0);
    public static final AudioMessagePayload DECODING = new AudioMessagePayload("DECODING", 1);
    public static final AudioMessagePayload UPLOAD = new AudioMessagePayload("UPLOAD", 2);

    private static final /* synthetic */ AudioMessagePayload[] $values() {
        return new AudioMessagePayload[]{PLAYBACK, DECODING, UPLOAD};
    }

    public static EnumEntries<AudioMessagePayload> getEntries() {
        return $ENTRIES;
    }

    public static AudioMessagePayload valueOf(String str) {
        return (AudioMessagePayload) Enum.valueOf(AudioMessagePayload.class, str);
    }

    public static AudioMessagePayload[] values() {
        return (AudioMessagePayload[]) $VALUES.clone();
    }

    private AudioMessagePayload(String str, int i) {
    }

    static {
        AudioMessagePayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
