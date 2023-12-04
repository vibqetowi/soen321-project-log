package com.ifriend.domain.logic.chat.avatart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GeneratedChatAvatar.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "", "Empty", "ImageAvatar", "VideoAvatar", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$Empty;", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$ImageAvatar;", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GeneratedChatAvatar {

    /* compiled from: GeneratedChatAvatar.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar;", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "avatarId", "", "imageAvatarUri", "videoUri", "generatingState", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar$GeneratingState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar$GeneratingState;)V", "getAvatarId", "()Ljava/lang/String;", "getGeneratingState", "()Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar$GeneratingState;", "getImageAvatarUri", "getVideoUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "GeneratingState", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class VideoAvatar implements GeneratedChatAvatar {
        private final String avatarId;
        private final GeneratingState generatingState;
        private final String imageAvatarUri;
        private final String videoUri;

        public static /* synthetic */ VideoAvatar copy$default(VideoAvatar videoAvatar, String str, String str2, String str3, GeneratingState generatingState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoAvatar.avatarId;
            }
            if ((i & 2) != 0) {
                str2 = videoAvatar.imageAvatarUri;
            }
            if ((i & 4) != 0) {
                str3 = videoAvatar.videoUri;
            }
            if ((i & 8) != 0) {
                generatingState = videoAvatar.generatingState;
            }
            return videoAvatar.copy(str, str2, str3, generatingState);
        }

        public final String component1() {
            return this.avatarId;
        }

        public final String component2() {
            return this.imageAvatarUri;
        }

        public final String component3() {
            return this.videoUri;
        }

        public final GeneratingState component4() {
            return this.generatingState;
        }

        public final VideoAvatar copy(String avatarId, String imageAvatarUri, String videoUri, GeneratingState generatingState) {
            Intrinsics.checkNotNullParameter(avatarId, "avatarId");
            Intrinsics.checkNotNullParameter(imageAvatarUri, "imageAvatarUri");
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            Intrinsics.checkNotNullParameter(generatingState, "generatingState");
            return new VideoAvatar(avatarId, imageAvatarUri, videoUri, generatingState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VideoAvatar) {
                VideoAvatar videoAvatar = (VideoAvatar) obj;
                return Intrinsics.areEqual(this.avatarId, videoAvatar.avatarId) && Intrinsics.areEqual(this.imageAvatarUri, videoAvatar.imageAvatarUri) && Intrinsics.areEqual(this.videoUri, videoAvatar.videoUri) && this.generatingState == videoAvatar.generatingState;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.avatarId.hashCode() * 31) + this.imageAvatarUri.hashCode()) * 31) + this.videoUri.hashCode()) * 31) + this.generatingState.hashCode();
        }

        public String toString() {
            String str = this.avatarId;
            String str2 = this.imageAvatarUri;
            String str3 = this.videoUri;
            GeneratingState generatingState = this.generatingState;
            return "VideoAvatar(avatarId=" + str + ", imageAvatarUri=" + str2 + ", videoUri=" + str3 + ", generatingState=" + generatingState + ")";
        }

        public VideoAvatar(String avatarId, String imageAvatarUri, String videoUri, GeneratingState generatingState) {
            Intrinsics.checkNotNullParameter(avatarId, "avatarId");
            Intrinsics.checkNotNullParameter(imageAvatarUri, "imageAvatarUri");
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            Intrinsics.checkNotNullParameter(generatingState, "generatingState");
            this.avatarId = avatarId;
            this.imageAvatarUri = imageAvatarUri;
            this.videoUri = videoUri;
            this.generatingState = generatingState;
        }

        public final String getAvatarId() {
            return this.avatarId;
        }

        public final String getImageAvatarUri() {
            return this.imageAvatarUri;
        }

        public final String getVideoUri() {
            return this.videoUri;
        }

        public final GeneratingState getGeneratingState() {
            return this.generatingState;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GeneratedChatAvatar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$VideoAvatar$GeneratingState;", "", "(Ljava/lang/String;I)V", "GENERATING", "READY", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GeneratingState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ GeneratingState[] $VALUES;
            public static final GeneratingState GENERATING = new GeneratingState("GENERATING", 0);
            public static final GeneratingState READY = new GeneratingState("READY", 1);

            private static final /* synthetic */ GeneratingState[] $values() {
                return new GeneratingState[]{GENERATING, READY};
            }

            public static EnumEntries<GeneratingState> getEntries() {
                return $ENTRIES;
            }

            public static GeneratingState valueOf(String str) {
                return (GeneratingState) Enum.valueOf(GeneratingState.class, str);
            }

            public static GeneratingState[] values() {
                return (GeneratingState[]) $VALUES.clone();
            }

            private GeneratingState(String str, int i) {
            }

            static {
                GeneratingState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }
        }
    }

    /* compiled from: GeneratedChatAvatar.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$ImageAvatar;", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "avatarId", "", "imageAvatarUri", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatarId", "()Ljava/lang/String;", "getImageAvatarUri", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ImageAvatar implements GeneratedChatAvatar {
        private final String avatarId;
        private final String imageAvatarUri;

        public static /* synthetic */ ImageAvatar copy$default(ImageAvatar imageAvatar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imageAvatar.avatarId;
            }
            if ((i & 2) != 0) {
                str2 = imageAvatar.imageAvatarUri;
            }
            return imageAvatar.copy(str, str2);
        }

        public final String component1() {
            return this.avatarId;
        }

        public final String component2() {
            return this.imageAvatarUri;
        }

        public final ImageAvatar copy(String avatarId, String imageAvatarUri) {
            Intrinsics.checkNotNullParameter(avatarId, "avatarId");
            Intrinsics.checkNotNullParameter(imageAvatarUri, "imageAvatarUri");
            return new ImageAvatar(avatarId, imageAvatarUri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ImageAvatar) {
                ImageAvatar imageAvatar = (ImageAvatar) obj;
                return Intrinsics.areEqual(this.avatarId, imageAvatar.avatarId) && Intrinsics.areEqual(this.imageAvatarUri, imageAvatar.imageAvatarUri);
            }
            return false;
        }

        public int hashCode() {
            return (this.avatarId.hashCode() * 31) + this.imageAvatarUri.hashCode();
        }

        public String toString() {
            String str = this.avatarId;
            String str2 = this.imageAvatarUri;
            return "ImageAvatar(avatarId=" + str + ", imageAvatarUri=" + str2 + ")";
        }

        public ImageAvatar(String avatarId, String imageAvatarUri) {
            Intrinsics.checkNotNullParameter(avatarId, "avatarId");
            Intrinsics.checkNotNullParameter(imageAvatarUri, "imageAvatarUri");
            this.avatarId = avatarId;
            this.imageAvatarUri = imageAvatarUri;
        }

        public final String getAvatarId() {
            return this.avatarId;
        }

        public final String getImageAvatarUri() {
            return this.imageAvatarUri;
        }
    }

    /* compiled from: GeneratedChatAvatar.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar$Empty;", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Empty implements GeneratedChatAvatar {
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Empty) {
                Empty empty = (Empty) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1309051580;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }
}
