package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppGroupCreationContent.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/share/model/AppGroupCreationContent$Builder;", "(Lcom/facebook/share/model/AppGroupCreationContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "appGroupPrivacy", "Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "getAppGroupPrivacy", "()Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "description", "", "getDescription", "()Ljava/lang/String;", "name", "getName", "describeContents", "", "writeToParcel", "", "out", "flags", "AppGroupPrivacy", "Builder", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppGroupCreationContent implements ShareModel {
    private final AppGroupPrivacy appGroupPrivacy;
    private final String description;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };

    public /* synthetic */ AppGroupCreationContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    private AppGroupCreationContent(Builder builder) {
        this.name = builder.getName$facebook_common_release();
        this.description = builder.getDescription$facebook_common_release();
        this.appGroupPrivacy = builder.getAppGroupPrivacy$facebook_common_release();
    }

    public AppGroupCreationContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (AppGroupPrivacy) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeSerializable(this.appGroupPrivacy);
    }

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "", "(Ljava/lang/String;I)V", "Open", "Closed", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public enum AppGroupPrivacy {
        Open,
        Closed;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AppGroupPrivacy[] valuesCustom() {
            AppGroupPrivacy[] valuesCustom = values();
            return (AppGroupPrivacy[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/share/model/AppGroupCreationContent;", "()V", "appGroupPrivacy", "Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "getAppGroupPrivacy$facebook_common_release", "()Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "setAppGroupPrivacy$facebook_common_release", "(Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;)V", "description", "", "getDescription$facebook_common_release", "()Ljava/lang/String;", "setDescription$facebook_common_release", "(Ljava/lang/String;)V", "name", "getName$facebook_common_release", "setName$facebook_common_release", "build", "readFrom", FirebaseAnalytics.Param.CONTENT, "setAppGroupPrivacy", "setDescription", "setName", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
        private AppGroupPrivacy appGroupPrivacy;
        private String description;
        private String name;

        public final String getName$facebook_common_release() {
            return this.name;
        }

        public final void setName$facebook_common_release(String str) {
            this.name = str;
        }

        public final String getDescription$facebook_common_release() {
            return this.description;
        }

        public final void setDescription$facebook_common_release(String str) {
            this.description = str;
        }

        public final AppGroupPrivacy getAppGroupPrivacy$facebook_common_release() {
            return this.appGroupPrivacy;
        }

        public final void setAppGroupPrivacy$facebook_common_release(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
        }

        public final Builder setName(String str) {
            this.name = str;
            return this;
        }

        public final Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public final Builder setAppGroupPrivacy(AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(AppGroupCreationContent appGroupCreationContent) {
            return appGroupCreationContent == null ? this : setName(appGroupCreationContent.getName()).setDescription(appGroupCreationContent.getDescription()).setAppGroupPrivacy(appGroupCreationContent.getAppGroupPrivacy());
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/AppGroupCreationContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
