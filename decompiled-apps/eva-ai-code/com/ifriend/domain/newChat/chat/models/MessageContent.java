package com.ifriend.domain.newChat.chat.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "", "Audio", "EndCall", "Gift", "Image", "Text", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$EndCall;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Gift;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Text;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageContent {

    /* compiled from: MessageContent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "image", "", "lockedImageUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getLockedImageUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Image implements MessageContent {
        private final String image;
        private final String lockedImageUrl;

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.image;
            }
            if ((i & 2) != 0) {
                str2 = image.lockedImageUrl;
            }
            return image.copy(str, str2);
        }

        public final String component1() {
            return this.image;
        }

        public final String component2() {
            return this.lockedImageUrl;
        }

        public final Image copy(String image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Image(image, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Image) {
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.image, image.image) && Intrinsics.areEqual(this.lockedImageUrl, image.lockedImageUrl);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.lockedImageUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.image;
            String str2 = this.lockedImageUrl;
            return "Image(image=" + str + ", lockedImageUrl=" + str2 + ")";
        }

        public Image(String image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.lockedImageUrl = str;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getLockedImageUrl() {
            return this.lockedImageUrl;
        }
    }

    /* compiled from: MessageContent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "text", "", "audioUri", "isPremium", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAudioUri", "()Ljava/lang/String;", "()Z", "getText", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Audio implements MessageContent {
        private final String audioUri;
        private final boolean isPremium;
        private final String text;

        public static /* synthetic */ Audio copy$default(Audio audio, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = audio.text;
            }
            if ((i & 2) != 0) {
                str2 = audio.audioUri;
            }
            if ((i & 4) != 0) {
                z = audio.isPremium;
            }
            return audio.copy(str, str2, z);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.audioUri;
        }

        public final boolean component3() {
            return this.isPremium;
        }

        public final Audio copy(String text, String audioUri, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(audioUri, "audioUri");
            return new Audio(text, audioUri, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Audio) {
                Audio audio = (Audio) obj;
                return Intrinsics.areEqual(this.text, audio.text) && Intrinsics.areEqual(this.audioUri, audio.audioUri) && this.isPremium == audio.isPremium;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.text.hashCode() * 31) + this.audioUri.hashCode()) * 31;
            boolean z = this.isPremium;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.text;
            String str2 = this.audioUri;
            boolean z = this.isPremium;
            return "Audio(text=" + str + ", audioUri=" + str2 + ", isPremium=" + z + ")";
        }

        public Audio(String text, String audioUri, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(audioUri, "audioUri");
            this.text = text;
            this.audioUri = audioUri;
            this.isPremium = z;
        }

        public /* synthetic */ Audio(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final String getText() {
            return this.text;
        }

        public final String getAudioUri() {
            return this.audioUri;
        }

        public final boolean isPremium() {
            return this.isPremium;
        }
    }

    /* compiled from: MessageContent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent$Text;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Text implements MessageContent {
        private final String text;

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        public final String component1() {
            return this.text;
        }

        public final Text copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Text(text);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.text, ((Text) obj).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            String str = this.text;
            return "Text(text=" + str + ")";
        }

        public Text(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: MessageContent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent$Gift;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "imageUrl", "", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Gift implements MessageContent {
        private final String imageUrl;

        public static /* synthetic */ Gift copy$default(Gift gift, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gift.imageUrl;
            }
            return gift.copy(str);
        }

        public final String component1() {
            return this.imageUrl;
        }

        public final Gift copy(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new Gift(imageUrl);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gift) && Intrinsics.areEqual(this.imageUrl, ((Gift) obj).imageUrl);
        }

        public int hashCode() {
            return this.imageUrl.hashCode();
        }

        public String toString() {
            String str = this.imageUrl;
            return "Gift(imageUrl=" + str + ")";
        }

        public Gift(String imageUrl) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }
    }

    /* compiled from: MessageContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageContent$EndCall;", "Lcom/ifriend/domain/newChat/chat/models/MessageContent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class EndCall implements MessageContent {
        public static final EndCall INSTANCE = new EndCall();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EndCall) {
                EndCall endCall = (EndCall) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 99935799;
        }

        public String toString() {
            return "EndCall";
        }

        private EndCall() {
        }
    }
}
