package com.ifriend.data.repository.chat.messages.contenttypes;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentReferenceType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/contenttypes/ContentReferenceType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "isAudio", "", "()Z", "isImage", "isPremium", "getType", "()Ljava/lang/String;", "PHOTO", "PHOTO_AI", "AUDIO", "LULLABY_AUDIO", "GIFT", "UNKNOWN", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentReferenceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentReferenceType[] $VALUES;
    public static final Companion Companion;
    private final String type;
    public static final ContentReferenceType PHOTO = new ContentReferenceType("PHOTO", 0, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO);
    public static final ContentReferenceType PHOTO_AI = new ContentReferenceType("PHOTO_AI", 1, "photo-ai");
    public static final ContentReferenceType AUDIO = new ContentReferenceType("AUDIO", 2, "audio");
    public static final ContentReferenceType LULLABY_AUDIO = new ContentReferenceType("LULLABY_AUDIO", 3, "ai-lullaby-topic");
    public static final ContentReferenceType GIFT = new ContentReferenceType("GIFT", 4, "images/gifts");
    public static final ContentReferenceType UNKNOWN = new ContentReferenceType("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ ContentReferenceType[] $values() {
        return new ContentReferenceType[]{PHOTO, PHOTO_AI, AUDIO, LULLABY_AUDIO, GIFT, UNKNOWN};
    }

    public static EnumEntries<ContentReferenceType> getEntries() {
        return $ENTRIES;
    }

    public static ContentReferenceType valueOf(String str) {
        return (ContentReferenceType) Enum.valueOf(ContentReferenceType.class, str);
    }

    public static ContentReferenceType[] values() {
        return (ContentReferenceType[]) $VALUES.clone();
    }

    private ContentReferenceType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        ContentReferenceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    public final boolean isImage() {
        return this == PHOTO || this == PHOTO_AI;
    }

    public final boolean isAudio() {
        return this == AUDIO || this == LULLABY_AUDIO;
    }

    public final boolean isPremium() {
        return this == LULLABY_AUDIO;
    }

    /* compiled from: ContentReferenceType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/contenttypes/ContentReferenceType$Companion;", "", "()V", "from", "Lcom/ifriend/data/repository/chat/messages/contenttypes/ContentReferenceType;", "type", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentReferenceType from(String type) {
            ContentReferenceType contentReferenceType;
            Intrinsics.checkNotNullParameter(type, "type");
            ContentReferenceType[] values = ContentReferenceType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    contentReferenceType = null;
                    break;
                }
                contentReferenceType = values[i];
                if (Intrinsics.areEqual(contentReferenceType.getType(), type)) {
                    break;
                }
                i++;
            }
            return contentReferenceType == null ? ContentReferenceType.UNKNOWN : contentReferenceType;
        }
    }
}
