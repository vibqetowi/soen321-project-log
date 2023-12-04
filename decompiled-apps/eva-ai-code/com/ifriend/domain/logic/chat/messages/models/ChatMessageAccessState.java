package com.ifriend.domain.logic.chat.messages.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessageAccessState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "", "AccessGranted", "PhotoAccessGranted", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState$AccessGranted;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState$PhotoAccessGranted;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageAccessState {

    /* compiled from: ChatMessageAccessState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState$AccessGranted;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AccessGranted implements ChatMessageAccessState {
        public static final AccessGranted INSTANCE = new AccessGranted();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessGranted) {
                AccessGranted accessGranted = (AccessGranted) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -290945191;
        }

        public String toString() {
            return "AccessGranted";
        }

        private AccessGranted() {
        }
    }

    /* compiled from: ChatMessageAccessState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState$PhotoAccessGranted;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "imageUrl", "", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PhotoAccessGranted implements ChatMessageAccessState {
        private final String imageUrl;

        public static /* synthetic */ PhotoAccessGranted copy$default(PhotoAccessGranted photoAccessGranted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = photoAccessGranted.imageUrl;
            }
            return photoAccessGranted.copy(str);
        }

        public final String component1() {
            return this.imageUrl;
        }

        public final PhotoAccessGranted copy(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new PhotoAccessGranted(imageUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhotoAccessGranted) && Intrinsics.areEqual(this.imageUrl, ((PhotoAccessGranted) obj).imageUrl);
        }

        public int hashCode() {
            return this.imageUrl.hashCode();
        }

        public String toString() {
            String str = this.imageUrl;
            return "PhotoAccessGranted(imageUrl=" + str + ")";
        }

        public PhotoAccessGranted(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }
    }
}
