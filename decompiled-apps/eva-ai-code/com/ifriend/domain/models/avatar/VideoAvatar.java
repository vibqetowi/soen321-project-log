package com.ifriend.domain.models.avatar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GeneratedAvatar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/models/avatar/VideoAvatar;", "", "()V", "Empty", "Generated", "Generating", "NotGenerated", "Lcom/ifriend/domain/models/avatar/VideoAvatar$Empty;", "Lcom/ifriend/domain/models/avatar/VideoAvatar$Generated;", "Lcom/ifriend/domain/models/avatar/VideoAvatar$Generating;", "Lcom/ifriend/domain/models/avatar/VideoAvatar$NotGenerated;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class VideoAvatar {
    public /* synthetic */ VideoAvatar(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VideoAvatar() {
    }

    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/avatar/VideoAvatar$Empty;", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Empty extends VideoAvatar {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/models/avatar/VideoAvatar$Generated;", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "videoUri", "", "(Ljava/lang/String;)V", "getVideoUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Generated extends VideoAvatar {
        private final String videoUri;

        public static /* synthetic */ Generated copy$default(Generated generated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = generated.videoUri;
            }
            return generated.copy(str);
        }

        public final String component1() {
            return this.videoUri;
        }

        public final Generated copy(String videoUri) {
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            return new Generated(videoUri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Generated) && Intrinsics.areEqual(this.videoUri, ((Generated) obj).videoUri);
        }

        public int hashCode() {
            return this.videoUri.hashCode();
        }

        public String toString() {
            String str = this.videoUri;
            return "Generated(videoUri=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generated(String videoUri) {
            super(null);
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            this.videoUri = videoUri;
        }

        public final String getVideoUri() {
            return this.videoUri;
        }
    }

    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/avatar/VideoAvatar$Generating;", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Generating extends VideoAvatar {
        public static final Generating INSTANCE = new Generating();

        private Generating() {
            super(null);
        }
    }

    /* compiled from: GeneratedAvatar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/models/avatar/VideoAvatar$NotGenerated;", "Lcom/ifriend/domain/models/avatar/VideoAvatar;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NotGenerated extends VideoAvatar {
        public static final NotGenerated INSTANCE = new NotGenerated();

        private NotGenerated() {
            super(null);
        }
    }
}
