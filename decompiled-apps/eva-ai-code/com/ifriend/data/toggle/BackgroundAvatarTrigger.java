package com.ifriend.data.toggle;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackgroundAvatarTrigger.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/toggle/BackgroundAvatarTrigger;", "", "videoName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVideoName", "()Ljava/lang/String;", "IDLE", "SEXTING", "DIARY", "ENTERING_PRODUCT", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackgroundAvatarTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackgroundAvatarTrigger[] $VALUES;
    private final String videoName;
    public static final BackgroundAvatarTrigger IDLE = new BackgroundAvatarTrigger("IDLE", 0, "idle");
    public static final BackgroundAvatarTrigger SEXTING = new BackgroundAvatarTrigger("SEXTING", 1, "idle_sexting");
    public static final BackgroundAvatarTrigger DIARY = new BackgroundAvatarTrigger("DIARY", 2, "idle_sexting");
    public static final BackgroundAvatarTrigger ENTERING_PRODUCT = new BackgroundAvatarTrigger("ENTERING_PRODUCT", 3, "idle_start");

    private static final /* synthetic */ BackgroundAvatarTrigger[] $values() {
        return new BackgroundAvatarTrigger[]{IDLE, SEXTING, DIARY, ENTERING_PRODUCT};
    }

    public static EnumEntries<BackgroundAvatarTrigger> getEntries() {
        return $ENTRIES;
    }

    public static BackgroundAvatarTrigger valueOf(String str) {
        return (BackgroundAvatarTrigger) Enum.valueOf(BackgroundAvatarTrigger.class, str);
    }

    public static BackgroundAvatarTrigger[] values() {
        return (BackgroundAvatarTrigger[]) $VALUES.clone();
    }

    private BackgroundAvatarTrigger(String str, int i, String str2) {
        this.videoName = str2;
    }

    public final String getVideoName() {
        return this.videoName;
    }

    static {
        BackgroundAvatarTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
