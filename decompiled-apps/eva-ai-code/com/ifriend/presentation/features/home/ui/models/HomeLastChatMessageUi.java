package com.ifriend.presentation.features.home.ui.models;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeChatUi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "", "Media", "Text", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Media;", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Text;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HomeLastChatMessageUi {

    /* compiled from: HomeChatUi.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Media;", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "title", "", "isActiveMessage", "", ShareConstants.WEB_DIALOG_PARAM_MEDIA, "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;ZLandroidx/compose/ui/graphics/vector/ImageVector;)V", "()Z", "getMedia", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Media implements HomeLastChatMessageUi {
        public static final int $stable = 0;
        private final boolean isActiveMessage;
        private final ImageVector media;
        private final String title;

        public static /* synthetic */ Media copy$default(Media media, String str, boolean z, ImageVector imageVector, int i, Object obj) {
            if ((i & 1) != 0) {
                str = media.title;
            }
            if ((i & 2) != 0) {
                z = media.isActiveMessage;
            }
            if ((i & 4) != 0) {
                imageVector = media.media;
            }
            return media.copy(str, z, imageVector);
        }

        public final String component1() {
            return this.title;
        }

        public final boolean component2() {
            return this.isActiveMessage;
        }

        public final ImageVector component3() {
            return this.media;
        }

        public final Media copy(String title, boolean z, ImageVector media) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(media, "media");
            return new Media(title, z, media);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Media) {
                Media media = (Media) obj;
                return Intrinsics.areEqual(this.title, media.title) && this.isActiveMessage == media.isActiveMessage && Intrinsics.areEqual(this.media, media.media);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            boolean z = this.isActiveMessage;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.media.hashCode();
        }

        public String toString() {
            String str = this.title;
            boolean z = this.isActiveMessage;
            ImageVector imageVector = this.media;
            return "Media(title=" + str + ", isActiveMessage=" + z + ", media=" + imageVector + ")";
        }

        public Media(String title, boolean z, ImageVector media) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(media, "media");
            this.title = title;
            this.isActiveMessage = z;
            this.media = media;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean isActiveMessage() {
            return this.isActiveMessage;
        }

        public final ImageVector getMedia() {
            return this.media;
        }
    }

    /* compiled from: HomeChatUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi$Text;", "Lcom/ifriend/presentation/features/home/ui/models/HomeLastChatMessageUi;", "text", "", "isActiveMessage", "", "isAvailable", "(Ljava/lang/String;ZZ)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Text implements HomeLastChatMessageUi {
        public static final int $stable = 0;
        private final boolean isActiveMessage;
        private final boolean isAvailable;
        private final String text;

        public static /* synthetic */ Text copy$default(Text text, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                z = text.isActiveMessage;
            }
            if ((i & 4) != 0) {
                z2 = text.isAvailable;
            }
            return text.copy(str, z, z2);
        }

        public final String component1() {
            return this.text;
        }

        public final boolean component2() {
            return this.isActiveMessage;
        }

        public final boolean component3() {
            return this.isAvailable;
        }

        public final Text copy(String text, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Text(text, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Text) {
                Text text = (Text) obj;
                return Intrinsics.areEqual(this.text, text.text) && this.isActiveMessage == text.isActiveMessage && this.isAvailable == text.isAvailable;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            boolean z = this.isActiveMessage;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.isAvailable;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            String str = this.text;
            boolean z = this.isActiveMessage;
            boolean z2 = this.isAvailable;
            return "Text(text=" + str + ", isActiveMessage=" + z + ", isAvailable=" + z2 + ")";
        }

        public Text(String text, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isActiveMessage = z;
            this.isAvailable = z2;
        }

        public final String getText() {
            return this.text;
        }

        public final boolean isActiveMessage() {
            return this.isActiveMessage;
        }

        public final boolean isAvailable() {
            return this.isAvailable;
        }
    }
}
