package com.ifriend.data.networking.responses;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarInfoResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/networking/responses/AvatarInfoStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "NO_FACE_DETECTED", "PROCESSING", "FAILED", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarInfoStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarInfoStatus[] $VALUES;
    @SerializedName("success")
    public static final AvatarInfoStatus SUCCESS = new AvatarInfoStatus("SUCCESS", 0);
    @SerializedName("no_face_detected")
    public static final AvatarInfoStatus NO_FACE_DETECTED = new AvatarInfoStatus("NO_FACE_DETECTED", 1);
    @SerializedName("processing")
    public static final AvatarInfoStatus PROCESSING = new AvatarInfoStatus("PROCESSING", 2);
    @SerializedName("failed")
    public static final AvatarInfoStatus FAILED = new AvatarInfoStatus("FAILED", 3);

    private static final /* synthetic */ AvatarInfoStatus[] $values() {
        return new AvatarInfoStatus[]{SUCCESS, NO_FACE_DETECTED, PROCESSING, FAILED};
    }

    public static EnumEntries<AvatarInfoStatus> getEntries() {
        return $ENTRIES;
    }

    public static AvatarInfoStatus valueOf(String str) {
        return (AvatarInfoStatus) Enum.valueOf(AvatarInfoStatus.class, str);
    }

    public static AvatarInfoStatus[] values() {
        return (AvatarInfoStatus[]) $VALUES.clone();
    }

    private AvatarInfoStatus(String str, int i) {
    }

    static {
        AvatarInfoStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
