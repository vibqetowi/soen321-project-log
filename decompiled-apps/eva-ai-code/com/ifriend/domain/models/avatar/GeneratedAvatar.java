package com.ifriend.domain.models.avatar;

import com.ifriend.domain.models.avatar.VideoAvatar;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GeneratedAvatar.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0017J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "", "id", "", "imageAvatarUri", "videoAvatar", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "status", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Status;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/models/avatar/VideoAvatar;Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Status;)V", "getId", "()Ljava/lang/String;", "getImageAvatarUri", "getStatus", "()Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Status;", "getVideoAvatar", "()Lcom/ifriend/domain/models/avatar/VideoAvatar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isEmpty", "toString", "Companion", "Status", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratedAvatar {
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String imageAvatarUri;
    private final Status status;
    private final VideoAvatar videoAvatar;

    public static /* synthetic */ GeneratedAvatar copy$default(GeneratedAvatar generatedAvatar, String str, String str2, VideoAvatar videoAvatar, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generatedAvatar.id;
        }
        if ((i & 2) != 0) {
            str2 = generatedAvatar.imageAvatarUri;
        }
        if ((i & 4) != 0) {
            videoAvatar = generatedAvatar.videoAvatar;
        }
        if ((i & 8) != 0) {
            status = generatedAvatar.status;
        }
        return generatedAvatar.copy(str, str2, videoAvatar, status);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.imageAvatarUri;
    }

    public final VideoAvatar component3() {
        return this.videoAvatar;
    }

    public final Status component4() {
        return this.status;
    }

    public final GeneratedAvatar copy(String id, String str, VideoAvatar videoAvatar, Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(videoAvatar, "videoAvatar");
        Intrinsics.checkNotNullParameter(status, "status");
        return new GeneratedAvatar(id, str, videoAvatar, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneratedAvatar) {
            GeneratedAvatar generatedAvatar = (GeneratedAvatar) obj;
            return Intrinsics.areEqual(this.id, generatedAvatar.id) && Intrinsics.areEqual(this.imageAvatarUri, generatedAvatar.imageAvatarUri) && Intrinsics.areEqual(this.videoAvatar, generatedAvatar.videoAvatar) && this.status == generatedAvatar.status;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.imageAvatarUri;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.videoAvatar.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageAvatarUri;
        VideoAvatar videoAvatar = this.videoAvatar;
        Status status = this.status;
        return "GeneratedAvatar(id=" + str + ", imageAvatarUri=" + str2 + ", videoAvatar=" + videoAvatar + ", status=" + status + ")";
    }

    public GeneratedAvatar(String id, String str, VideoAvatar videoAvatar, Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(videoAvatar, "videoAvatar");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.imageAvatarUri = str;
        this.videoAvatar = videoAvatar;
        this.status = status;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageAvatarUri() {
        return this.imageAvatarUri;
    }

    public /* synthetic */ GeneratedAvatar(String str, String str2, VideoAvatar.Empty empty, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? VideoAvatar.Empty.INSTANCE : empty, (i & 8) != 0 ? Status.LOADED : status);
    }

    public final VideoAvatar getVideoAvatar() {
        return this.videoAvatar;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Companion;", "", "()V", "empty", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "status", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Status;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ GeneratedAvatar empty$default(Companion companion, Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                status = Status.LOADED;
            }
            return companion.empty(status);
        }

        public final GeneratedAvatar empty(Status status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new GeneratedAvatar("", null, null, status, 4, null);
        }
    }

    public final boolean isEmpty() {
        return Intrinsics.areEqual(this.id, "") && this.imageAvatarUri == null && Intrinsics.areEqual(this.videoAvatar, VideoAvatar.Empty.INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/models/avatar/GeneratedAvatar$Status;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADED", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status NOT_LOADED = new Status("NOT_LOADED", 0);
        public static final Status LOADED = new Status("LOADED", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NOT_LOADED, LOADED};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        private Status(String str, int i) {
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
