package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ShareStoryContent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118F¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/facebook/share/model/ShareStoryContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/ShareStoryContent$Builder;", "builder", "(Lcom/facebook/share/model/ShareStoryContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "attributionLink", "", "getAttributionLink", "()Ljava/lang/String;", "backgroundAsset", "Lcom/facebook/share/model/ShareMedia;", "getBackgroundAsset", "()Lcom/facebook/share/model/ShareMedia;", "backgroundColorList", "", "getBackgroundColorList", "()Ljava/util/List;", "stickerAsset", "Lcom/facebook/share/model/SharePhoto;", "getStickerAsset", "()Lcom/facebook/share/model/SharePhoto;", "describeContents", "", "readUnmodifiableStringList", "writeToParcel", "", "out", "flags", "Builder", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    private final String attributionLink;
    private final ShareMedia<?, ?> backgroundAsset;
    private final List<String> backgroundColorList;
    private final SharePhoto stickerAsset;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator<ShareStoryContent>() { // from class: com.facebook.share.model.ShareStoryContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareStoryContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    };

    public /* synthetic */ ShareStoryContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ShareMedia<?, ?> getBackgroundAsset() {
        return this.backgroundAsset;
    }

    public final SharePhoto getStickerAsset() {
        return this.stickerAsset;
    }

    public final List<String> getBackgroundColorList() {
        List<String> list = this.backgroundColorList;
        if (list == null) {
            return null;
        }
        return CollectionsKt.toList(list);
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    private ShareStoryContent(Builder builder) {
        super(builder);
        this.backgroundAsset = builder.getBackgroundAsset$facebook_common_release();
        this.stickerAsset = builder.getStickerAsset$facebook_common_release();
        this.backgroundColorList = builder.getBackgroundColorList$facebook_common_release();
        this.attributionLink = builder.getAttributionLink$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.backgroundColorList = readUnmodifiableStringList(parcel);
        this.attributionLink = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.backgroundAsset, 0);
        out.writeParcelable(this.stickerAsset, 0);
        out.writeStringList(getBackgroundColorList());
        out.writeString(this.attributionLink);
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.toList(arrayList);
    }

    /* compiled from: ShareStoryContent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0018\u0010 \u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bJ\u0016\u0010!\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/facebook/share/model/ShareStoryContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareStoryContent;", "()V", "attributionLink", "", "getAttributionLink$facebook_common_release", "()Ljava/lang/String;", "setAttributionLink$facebook_common_release", "(Ljava/lang/String;)V", "backgroundAsset", "Lcom/facebook/share/model/ShareMedia;", "getBackgroundAsset$facebook_common_release", "()Lcom/facebook/share/model/ShareMedia;", "setBackgroundAsset$facebook_common_release", "(Lcom/facebook/share/model/ShareMedia;)V", "backgroundColorList", "", "getBackgroundColorList$facebook_common_release", "()Ljava/util/List;", "setBackgroundColorList$facebook_common_release", "(Ljava/util/List;)V", "stickerAsset", "Lcom/facebook/share/model/SharePhoto;", "getStickerAsset$facebook_common_release", "()Lcom/facebook/share/model/SharePhoto;", "setStickerAsset$facebook_common_release", "(Lcom/facebook/share/model/SharePhoto;)V", "build", "readFrom", DeviceRequestsHelper.DEVICE_INFO_MODEL, "setAttributionLink", "setBackgroundAsset", "setBackgroundColorList", "setStickerAsset", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
        private String attributionLink;
        private ShareMedia<?, ?> backgroundAsset;
        private List<String> backgroundColorList;
        private SharePhoto stickerAsset;

        public final ShareMedia<?, ?> getBackgroundAsset$facebook_common_release() {
            return this.backgroundAsset;
        }

        public final void setBackgroundAsset$facebook_common_release(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
        }

        public final SharePhoto getStickerAsset$facebook_common_release() {
            return this.stickerAsset;
        }

        public final void setStickerAsset$facebook_common_release(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
        }

        public final List<String> getBackgroundColorList$facebook_common_release() {
            return this.backgroundColorList;
        }

        public final void setBackgroundColorList$facebook_common_release(List<String> list) {
            this.backgroundColorList = list;
        }

        public final String getAttributionLink$facebook_common_release() {
            return this.attributionLink;
        }

        public final void setAttributionLink$facebook_common_release(String str) {
            this.attributionLink = str;
        }

        public final Builder setBackgroundAsset(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
            return this;
        }

        public final Builder setStickerAsset(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
            return this;
        }

        public final Builder setBackgroundColorList(List<String> list) {
            this.backgroundColorList = list == null ? null : CollectionsKt.toList(list);
            return this;
        }

        public final Builder setAttributionLink(String str) {
            this.attributionLink = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareStoryContent build() {
            return new ShareStoryContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareStoryContent shareStoryContent) {
            return shareStoryContent == null ? this : ((Builder) super.readFrom((Builder) shareStoryContent)).setBackgroundAsset(shareStoryContent.getBackgroundAsset()).setStickerAsset(shareStoryContent.getStickerAsset()).setBackgroundColorList(shareStoryContent.getBackgroundColorList()).setAttributionLink(shareStoryContent.getAttributionLink());
        }
    }

    /* compiled from: ShareStoryContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/ShareStoryContent$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/ShareStoryContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
