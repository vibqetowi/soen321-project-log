package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: GameRequestContent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0004*+,-B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020%H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0013\u0010\"\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b#\u0010\u000f¨\u0006."}, d2 = {"Lcom/facebook/share/model/GameRequestContent;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/share/model/GameRequestContent$Builder;", "(Lcom/facebook/share/model/GameRequestContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "actionType", "Lcom/facebook/share/model/GameRequestContent$ActionType;", "getActionType", "()Lcom/facebook/share/model/GameRequestContent$ActionType;", "cta", "", "getCta", "()Ljava/lang/String;", "data", "getData", ShareConstants.WEB_DIALOG_PARAM_FILTERS, "Lcom/facebook/share/model/GameRequestContent$Filters;", "getFilters", "()Lcom/facebook/share/model/GameRequestContent$Filters;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "objectId", "getObjectId", "recipients", "", "getRecipients", "()Ljava/util/List;", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "getSuggestions", "title", "getTitle", "to", "getTo", "describeContents", "", "writeToParcel", "", "out", "flags", "ActionType", "Builder", "Companion", "Filters", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GameRequestContent implements ShareModel {
    private final ActionType actionType;
    private final String cta;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final List<String> recipients;
    private final List<String> suggestions;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator<GameRequestContent>() { // from class: com.facebook.share.model.GameRequestContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameRequestContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    };

    public /* synthetic */ GameRequestContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$ActionType;", "", "(Ljava/lang/String;I)V", "SEND", "ASKFOR", "TURN", "INVITE", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Filters;", "", "(Ljava/lang/String;I)V", "APP_USERS", "APP_NON_USERS", "EVERYBODY", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Filters[] valuesCustom() {
            Filters[] valuesCustom = values();
            return (Filters[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getCta() {
        return this.cta;
    }

    public final List<String> getRecipients() {
        return this.recipients;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getData() {
        return this.data;
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final Filters getFilters() {
        return this.filters;
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    private GameRequestContent(Builder builder) {
        this.message = builder.getMessage$facebook_common_release();
        this.cta = builder.getCta$facebook_common_release();
        this.recipients = builder.getRecipients$facebook_common_release();
        this.title = builder.getTitle$facebook_common_release();
        this.data = builder.getData$facebook_common_release();
        this.actionType = builder.getActionType$facebook_common_release();
        this.objectId = builder.getObjectId$facebook_common_release();
        this.filters = builder.getFilters$facebook_common_release();
        this.suggestions = builder.getSuggestions$facebook_common_release();
    }

    public GameRequestContent(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }

    @Deprecated(message = "Replaced by [getRecipients()]", replaceWith = @ReplaceWith(expression = "getRecipients", imports = {}))
    public final String getTo() {
        List<String> list = this.recipients;
        if (list != null) {
            return TextUtils.join(",", list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.message);
        out.writeString(this.cta);
        out.writeStringList(this.recipients);
        out.writeString(this.title);
        out.writeString(this.data);
        out.writeSerializable(this.actionType);
        out.writeString(this.objectId);
        out.writeSerializable(this.filters);
        out.writeStringList(this.suggestions);
    }

    /* compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020\u0002H\u0016J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u0012\u0010,\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u00101\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u00103\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u00105\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0010\u00106\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u0016\u00107\u001a\u00020\u00002\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0016\u00108\u001a\u00020\u00002\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0010\u00109\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010:\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\u000bH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000f¨\u0006<"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/share/model/GameRequestContent;", "()V", "actionType", "Lcom/facebook/share/model/GameRequestContent$ActionType;", "getActionType$facebook_common_release", "()Lcom/facebook/share/model/GameRequestContent$ActionType;", "setActionType$facebook_common_release", "(Lcom/facebook/share/model/GameRequestContent$ActionType;)V", "cta", "", "getCta$facebook_common_release", "()Ljava/lang/String;", "setCta$facebook_common_release", "(Ljava/lang/String;)V", "data", "getData$facebook_common_release", "setData$facebook_common_release", ShareConstants.WEB_DIALOG_PARAM_FILTERS, "Lcom/facebook/share/model/GameRequestContent$Filters;", "getFilters$facebook_common_release", "()Lcom/facebook/share/model/GameRequestContent$Filters;", "setFilters$facebook_common_release", "(Lcom/facebook/share/model/GameRequestContent$Filters;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage$facebook_common_release", "setMessage$facebook_common_release", "objectId", "getObjectId$facebook_common_release", "setObjectId$facebook_common_release", "recipients", "", "getRecipients$facebook_common_release", "()Ljava/util/List;", "setRecipients$facebook_common_release", "(Ljava/util/List;)V", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "getSuggestions$facebook_common_release", "setSuggestions$facebook_common_release", "title", "getTitle$facebook_common_release", "setTitle$facebook_common_release", "build", "readFrom", "parcel", "Landroid/os/Parcel;", "readFrom$facebook_common_release", FirebaseAnalytics.Param.CONTENT, "setActionType", "setCta", "setData", "setFilters", "setMessage", "setObjectId", "setRecipients", "setSuggestions", "setTitle", "setTo", "to", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder implements ShareModelBuilder<GameRequestContent, Builder> {
        private ActionType actionType;
        private String cta;
        private String data;
        private Filters filters;
        private String message;
        private String objectId;
        private List<String> recipients;
        private List<String> suggestions;
        private String title;

        public final String getMessage$facebook_common_release() {
            return this.message;
        }

        public final void setMessage$facebook_common_release(String str) {
            this.message = str;
        }

        public final String getCta$facebook_common_release() {
            return this.cta;
        }

        public final void setCta$facebook_common_release(String str) {
            this.cta = str;
        }

        public final List<String> getRecipients$facebook_common_release() {
            return this.recipients;
        }

        public final void setRecipients$facebook_common_release(List<String> list) {
            this.recipients = list;
        }

        public final String getData$facebook_common_release() {
            return this.data;
        }

        public final void setData$facebook_common_release(String str) {
            this.data = str;
        }

        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        public final void setTitle$facebook_common_release(String str) {
            this.title = str;
        }

        public final ActionType getActionType$facebook_common_release() {
            return this.actionType;
        }

        public final void setActionType$facebook_common_release(ActionType actionType) {
            this.actionType = actionType;
        }

        public final String getObjectId$facebook_common_release() {
            return this.objectId;
        }

        public final void setObjectId$facebook_common_release(String str) {
            this.objectId = str;
        }

        public final Filters getFilters$facebook_common_release() {
            return this.filters;
        }

        public final void setFilters$facebook_common_release(Filters filters) {
            this.filters = filters;
        }

        public final List<String> getSuggestions$facebook_common_release() {
            return this.suggestions;
        }

        public final void setSuggestions$facebook_common_release(List<String> list) {
            this.suggestions = list;
        }

        public final Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public final Builder setCta(String str) {
            this.cta = str;
            return this;
        }

        @Deprecated(message = "Replaced by {@link #setRecipients(List)}")
        public final Builder setTo(String str) {
            if (str != null) {
                this.recipients = CollectionsKt.toList(StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null));
            }
            return this;
        }

        public final Builder setRecipients(List<String> list) {
            this.recipients = list;
            return this;
        }

        public final Builder setData(String str) {
            this.data = str;
            return this;
        }

        public final Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public final Builder setActionType(ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        public final Builder setObjectId(String str) {
            this.objectId = str;
            return this;
        }

        public final Builder setFilters(Filters filters) {
            this.filters = filters;
            return this;
        }

        public final Builder setSuggestions(List<String> list) {
            this.suggestions = list;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public GameRequestContent build() {
            return new GameRequestContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(GameRequestContent gameRequestContent) {
            return gameRequestContent == null ? this : setMessage(gameRequestContent.getMessage()).setCta(gameRequestContent.getCta()).setRecipients(gameRequestContent.getRecipients()).setTitle(gameRequestContent.getTitle()).setData(gameRequestContent.getData()).setActionType(gameRequestContent.getActionType()).setObjectId(gameRequestContent.getObjectId()).setFilters(gameRequestContent.getFilters()).setSuggestions(gameRequestContent.getSuggestions());
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((GameRequestContent) parcel.readParcelable(GameRequestContent.class.getClassLoader()));
        }
    }

    /* compiled from: GameRequestContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/share/model/GameRequestContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
