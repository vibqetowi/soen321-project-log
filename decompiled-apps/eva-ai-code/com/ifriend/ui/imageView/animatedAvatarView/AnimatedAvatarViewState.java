package com.ifriend.ui.imageView.animatedAvatarView;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedAvatarViewState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \r2\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "", "cornersSize", "", "getCornersSize", "()I", "image", "getImage", "()Ljava/lang/Object;", "signature", "", "getSignature", "()Ljava/lang/String;", "Companion", "GeneratingVideoAvatar", "PauseVideoAvatar", "Placeholder", "PlayingVideoAvatar", "StaticAvatar", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$GeneratingVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$PauseVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$PlayingVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$StaticAvatar;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AnimatedAvatarViewState {
    public static final Companion Companion = Companion.$$INSTANCE;

    int getCornersSize();

    Object getImage();

    String getSignature();

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Companion;", "", "()V", "empty", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AnimatedAvatarViewState empty() {
            return new StaticAvatar("", "", 0);
        }
    }

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$StaticAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "image", "", "signature", "", "cornersSize", "", "(Ljava/lang/Object;Ljava/lang/String;I)V", "getCornersSize", "()I", "getImage", "()Ljava/lang/Object;", "getSignature", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StaticAvatar implements AnimatedAvatarViewState {
        public static final int $stable = 8;
        private final int cornersSize;
        private final Object image;
        private final String signature;

        public static /* synthetic */ StaticAvatar copy$default(StaticAvatar staticAvatar, Object obj, String str, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = staticAvatar.image;
            }
            if ((i2 & 2) != 0) {
                str = staticAvatar.signature;
            }
            if ((i2 & 4) != 0) {
                i = staticAvatar.cornersSize;
            }
            return staticAvatar.copy(obj, str, i);
        }

        public final Object component1() {
            return this.image;
        }

        public final String component2() {
            return this.signature;
        }

        public final int component3() {
            return this.cornersSize;
        }

        public final StaticAvatar copy(Object obj, String signature, int i) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new StaticAvatar(obj, signature, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StaticAvatar) {
                StaticAvatar staticAvatar = (StaticAvatar) obj;
                return Intrinsics.areEqual(this.image, staticAvatar.image) && Intrinsics.areEqual(this.signature, staticAvatar.signature) && this.cornersSize == staticAvatar.cornersSize;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.image;
            return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.cornersSize;
        }

        public String toString() {
            Object obj = this.image;
            String str = this.signature;
            int i = this.cornersSize;
            return "StaticAvatar(image=" + obj + ", signature=" + str + ", cornersSize=" + i + ")";
        }

        public StaticAvatar(Object obj, String signature, int i) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.image = obj;
            this.signature = signature;
            this.cornersSize = i;
        }

        public /* synthetic */ StaticAvatar(Object obj, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, (i2 & 4) != 0 ? 0 : i);
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public Object getImage() {
            return this.image;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getSignature() {
            return this.signature;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public int getCornersSize() {
            return this.cornersSize;
        }
    }

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$GeneratingVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "image", "", "signature", "cornersSize", "", "showControls", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getCornersSize", "()I", "getImage", "()Ljava/lang/String;", "getShowControls", "()Z", "getSignature", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GeneratingVideoAvatar implements AnimatedAvatarViewState {
        public static final int $stable = 0;
        private final int cornersSize;
        private final String image;
        private final boolean showControls;
        private final String signature;

        public static /* synthetic */ GeneratingVideoAvatar copy$default(GeneratingVideoAvatar generatingVideoAvatar, String str, String str2, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = generatingVideoAvatar.image;
            }
            if ((i2 & 2) != 0) {
                str2 = generatingVideoAvatar.signature;
            }
            if ((i2 & 4) != 0) {
                i = generatingVideoAvatar.cornersSize;
            }
            if ((i2 & 8) != 0) {
                z = generatingVideoAvatar.showControls;
            }
            return generatingVideoAvatar.copy(str, str2, i, z);
        }

        public final String component1() {
            return this.image;
        }

        public final String component2() {
            return this.signature;
        }

        public final int component3() {
            return this.cornersSize;
        }

        public final boolean component4() {
            return this.showControls;
        }

        public final GeneratingVideoAvatar copy(String str, String signature, int i, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new GeneratingVideoAvatar(str, signature, i, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GeneratingVideoAvatar) {
                GeneratingVideoAvatar generatingVideoAvatar = (GeneratingVideoAvatar) obj;
                return Intrinsics.areEqual(this.image, generatingVideoAvatar.image) && Intrinsics.areEqual(this.signature, generatingVideoAvatar.signature) && this.cornersSize == generatingVideoAvatar.cornersSize && this.showControls == generatingVideoAvatar.showControls;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.image;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.cornersSize) * 31;
            boolean z = this.showControls;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.image;
            String str2 = this.signature;
            int i = this.cornersSize;
            boolean z = this.showControls;
            return "GeneratingVideoAvatar(image=" + str + ", signature=" + str2 + ", cornersSize=" + i + ", showControls=" + z + ")";
        }

        public GeneratingVideoAvatar(String str, String signature, int i, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.image = str;
            this.signature = signature;
            this.cornersSize = i;
            this.showControls = z;
        }

        public /* synthetic */ GeneratingVideoAvatar(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i, z);
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getImage() {
            return this.image;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getSignature() {
            return this.signature;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public int getCornersSize() {
            return this.cornersSize;
        }

        public final boolean getShowControls() {
            return this.showControls;
        }
    }

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$PlayingVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "image", "", "signature", "cornersSize", "", "video", "showControls", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getCornersSize", "()I", "getImage", "()Ljava/lang/String;", "getShowControls", "()Z", "getSignature", "getVideo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PlayingVideoAvatar implements AnimatedAvatarViewState {
        public static final int $stable = 0;
        private final int cornersSize;
        private final String image;
        private final boolean showControls;
        private final String signature;
        private final String video;

        public static /* synthetic */ PlayingVideoAvatar copy$default(PlayingVideoAvatar playingVideoAvatar, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = playingVideoAvatar.image;
            }
            if ((i2 & 2) != 0) {
                str2 = playingVideoAvatar.signature;
            }
            String str4 = str2;
            if ((i2 & 4) != 0) {
                i = playingVideoAvatar.cornersSize;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str3 = playingVideoAvatar.video;
            }
            String str5 = str3;
            if ((i2 & 16) != 0) {
                z = playingVideoAvatar.showControls;
            }
            return playingVideoAvatar.copy(str, str4, i3, str5, z);
        }

        public final String component1() {
            return this.image;
        }

        public final String component2() {
            return this.signature;
        }

        public final int component3() {
            return this.cornersSize;
        }

        public final String component4() {
            return this.video;
        }

        public final boolean component5() {
            return this.showControls;
        }

        public final PlayingVideoAvatar copy(String str, String signature, int i, String video, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(video, "video");
            return new PlayingVideoAvatar(str, signature, i, video, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlayingVideoAvatar) {
                PlayingVideoAvatar playingVideoAvatar = (PlayingVideoAvatar) obj;
                return Intrinsics.areEqual(this.image, playingVideoAvatar.image) && Intrinsics.areEqual(this.signature, playingVideoAvatar.signature) && this.cornersSize == playingVideoAvatar.cornersSize && Intrinsics.areEqual(this.video, playingVideoAvatar.video) && this.showControls == playingVideoAvatar.showControls;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.image;
            int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.cornersSize) * 31) + this.video.hashCode()) * 31;
            boolean z = this.showControls;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.image;
            String str2 = this.signature;
            int i = this.cornersSize;
            String str3 = this.video;
            boolean z = this.showControls;
            return "PlayingVideoAvatar(image=" + str + ", signature=" + str2 + ", cornersSize=" + i + ", video=" + str3 + ", showControls=" + z + ")";
        }

        public PlayingVideoAvatar(String str, String signature, int i, String video, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(video, "video");
            this.image = str;
            this.signature = signature;
            this.cornersSize = i;
            this.video = video;
            this.showControls = z;
        }

        public /* synthetic */ PlayingVideoAvatar(String str, String str2, int i, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i, str3, z);
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getImage() {
            return this.image;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getSignature() {
            return this.signature;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public int getCornersSize() {
            return this.cornersSize;
        }

        public final String getVideo() {
            return this.video;
        }

        public final boolean getShowControls() {
            return this.showControls;
        }
    }

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$PauseVideoAvatar;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "image", "", "signature", "cornersSize", "", "video", "showControls", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getCornersSize", "()I", "getImage", "()Ljava/lang/String;", "getShowControls", "()Z", "getSignature", "getVideo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PauseVideoAvatar implements AnimatedAvatarViewState {
        public static final int $stable = 0;
        private final int cornersSize;
        private final String image;
        private final boolean showControls;
        private final String signature;
        private final String video;

        public static /* synthetic */ PauseVideoAvatar copy$default(PauseVideoAvatar pauseVideoAvatar, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = pauseVideoAvatar.image;
            }
            if ((i2 & 2) != 0) {
                str2 = pauseVideoAvatar.signature;
            }
            String str4 = str2;
            if ((i2 & 4) != 0) {
                i = pauseVideoAvatar.cornersSize;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str3 = pauseVideoAvatar.video;
            }
            String str5 = str3;
            if ((i2 & 16) != 0) {
                z = pauseVideoAvatar.showControls;
            }
            return pauseVideoAvatar.copy(str, str4, i3, str5, z);
        }

        public final String component1() {
            return this.image;
        }

        public final String component2() {
            return this.signature;
        }

        public final int component3() {
            return this.cornersSize;
        }

        public final String component4() {
            return this.video;
        }

        public final boolean component5() {
            return this.showControls;
        }

        public final PauseVideoAvatar copy(String str, String signature, int i, String video, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(video, "video");
            return new PauseVideoAvatar(str, signature, i, video, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PauseVideoAvatar) {
                PauseVideoAvatar pauseVideoAvatar = (PauseVideoAvatar) obj;
                return Intrinsics.areEqual(this.image, pauseVideoAvatar.image) && Intrinsics.areEqual(this.signature, pauseVideoAvatar.signature) && this.cornersSize == pauseVideoAvatar.cornersSize && Intrinsics.areEqual(this.video, pauseVideoAvatar.video) && this.showControls == pauseVideoAvatar.showControls;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.image;
            int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.cornersSize) * 31) + this.video.hashCode()) * 31;
            boolean z = this.showControls;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.image;
            String str2 = this.signature;
            int i = this.cornersSize;
            String str3 = this.video;
            boolean z = this.showControls;
            return "PauseVideoAvatar(image=" + str + ", signature=" + str2 + ", cornersSize=" + i + ", video=" + str3 + ", showControls=" + z + ")";
        }

        public PauseVideoAvatar(String str, String signature, int i, String video, boolean z) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(video, "video");
            this.image = str;
            this.signature = signature;
            this.cornersSize = i;
            this.video = video;
            this.showControls = z;
        }

        public /* synthetic */ PauseVideoAvatar(String str, String str2, int i, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i, str3, z);
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getImage() {
            return this.image;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getSignature() {
            return this.signature;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public int getCornersSize() {
            return this.cornersSize;
        }

        public final String getVideo() {
            return this.video;
        }

        public final boolean getShowControls() {
            return this.showControls;
        }
    }

    /* compiled from: AnimatedAvatarViewState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "cornersSize", "", "presentation", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;", "(ILcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;)V", "getCornersSize", "()I", "image", "", "getImage", "()Ljava/lang/Void;", "getPresentation", "()Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;", "signature", "", "getSignature", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Presentation", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Placeholder implements AnimatedAvatarViewState {
        public static final int $stable = 8;
        private final int cornersSize;
        private final Void image;
        private final Presentation presentation;
        private final String signature;

        public static /* synthetic */ Placeholder copy$default(Placeholder placeholder, int i, Presentation presentation, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = placeholder.cornersSize;
            }
            if ((i2 & 2) != 0) {
                presentation = placeholder.presentation;
            }
            return placeholder.copy(i, presentation);
        }

        public final int component1() {
            return this.cornersSize;
        }

        public final Presentation component2() {
            return this.presentation;
        }

        public final Placeholder copy(int i, Presentation presentation) {
            Intrinsics.checkNotNullParameter(presentation, "presentation");
            return new Placeholder(i, presentation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) obj;
                return this.cornersSize == placeholder.cornersSize && Intrinsics.areEqual(this.presentation, placeholder.presentation);
            }
            return false;
        }

        public int hashCode() {
            return (this.cornersSize * 31) + this.presentation.hashCode();
        }

        public String toString() {
            int i = this.cornersSize;
            Presentation presentation = this.presentation;
            return "Placeholder(cornersSize=" + i + ", presentation=" + presentation + ")";
        }

        public Placeholder(int i, Presentation presentation) {
            Intrinsics.checkNotNullParameter(presentation, "presentation");
            this.cornersSize = i;
            this.presentation = presentation;
            this.signature = "";
        }

        public /* synthetic */ Placeholder(int i, Presentation presentation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, presentation);
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public int getCornersSize() {
            return this.cornersSize;
        }

        public final Presentation getPresentation() {
            return this.presentation;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public Void getImage() {
            return this.image;
        }

        @Override // com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState
        public String getSignature() {
            return this.signature;
        }

        /* compiled from: AnimatedAvatarViewState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;", "", "Big", "Small", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation$Big;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation$Small;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public interface Presentation {

            /* compiled from: AnimatedAvatarViewState.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation$Small;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Small implements Presentation {
                public static final int $stable = 0;
                public static final Small INSTANCE = new Small();

                private Small() {
                }
            }

            /* compiled from: AnimatedAvatarViewState.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation$Big;", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState$Placeholder$Presentation;", "botName", "", "(Ljava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Big implements Presentation {
                public static final int $stable = 0;
                private final String botName;

                public static /* synthetic */ Big copy$default(Big big, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = big.botName;
                    }
                    return big.copy(str);
                }

                public final String component1() {
                    return this.botName;
                }

                public final Big copy(String botName) {
                    Intrinsics.checkNotNullParameter(botName, "botName");
                    return new Big(botName);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Big) && Intrinsics.areEqual(this.botName, ((Big) obj).botName);
                }

                public int hashCode() {
                    return this.botName.hashCode();
                }

                public String toString() {
                    String str = this.botName;
                    return "Big(botName=" + str + ")";
                }

                public Big(String botName) {
                    Intrinsics.checkNotNullParameter(botName, "botName");
                    this.botName = botName;
                }

                public final String getBotName() {
                    return this.botName;
                }
            }
        }
    }
}
