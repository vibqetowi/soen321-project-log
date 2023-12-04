package com.ifriend.data.networking.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarGenerationResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/networking/api/AvatarGenerationStatusResponse;", "", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "ERROR", "NO_NEURONS", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationStatusResponse {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarGenerationStatusResponse[] $VALUES;
    @SerializedName("processing")
    public static final AvatarGenerationStatusResponse PROCESSING = new AvatarGenerationStatusResponse("PROCESSING", 0);
    @SerializedName("success")
    public static final AvatarGenerationStatusResponse SUCCESS = new AvatarGenerationStatusResponse("SUCCESS", 1);
    @SerializedName("error")
    public static final AvatarGenerationStatusResponse ERROR = new AvatarGenerationStatusResponse("ERROR", 2);
    @SerializedName("nocredits")
    public static final AvatarGenerationStatusResponse NO_NEURONS = new AvatarGenerationStatusResponse("NO_NEURONS", 3);

    private static final /* synthetic */ AvatarGenerationStatusResponse[] $values() {
        return new AvatarGenerationStatusResponse[]{PROCESSING, SUCCESS, ERROR, NO_NEURONS};
    }

    public static EnumEntries<AvatarGenerationStatusResponse> getEntries() {
        return $ENTRIES;
    }

    public static AvatarGenerationStatusResponse valueOf(String str) {
        return (AvatarGenerationStatusResponse) Enum.valueOf(AvatarGenerationStatusResponse.class, str);
    }

    public static AvatarGenerationStatusResponse[] values() {
        return (AvatarGenerationStatusResponse[]) $VALUES.clone();
    }

    private AvatarGenerationStatusResponse(String str, int i) {
    }

    static {
        AvatarGenerationStatusResponse[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
