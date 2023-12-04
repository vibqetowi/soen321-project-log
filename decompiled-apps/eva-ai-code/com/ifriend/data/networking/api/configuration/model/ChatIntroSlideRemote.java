package com.ifriend.data.networking.api.configuration.model;

import com.facebook.internal.NativeProtocol;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroSlidesRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatIntroSlideRemote;", "", "title", "", "description", NativeProtocol.WEB_DIALOG_ACTION, "isVisibleCancelButton", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getDescription", "()Z", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroSlideRemote {
    @SerializedName("nextButton")
    private final String action;
    @SerializedName("info")
    private final String description;
    @SerializedName("showCancelButton")
    private final boolean isVisibleCancelButton;
    @SerializedName("title")
    private final String title;

    public static /* synthetic */ ChatIntroSlideRemote copy$default(ChatIntroSlideRemote chatIntroSlideRemote, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatIntroSlideRemote.title;
        }
        if ((i & 2) != 0) {
            str2 = chatIntroSlideRemote.description;
        }
        if ((i & 4) != 0) {
            str3 = chatIntroSlideRemote.action;
        }
        if ((i & 8) != 0) {
            z = chatIntroSlideRemote.isVisibleCancelButton;
        }
        return chatIntroSlideRemote.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.action;
    }

    public final boolean component4() {
        return this.isVisibleCancelButton;
    }

    public final ChatIntroSlideRemote copy(String title, String description, String action, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ChatIntroSlideRemote(title, description, action, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatIntroSlideRemote) {
            ChatIntroSlideRemote chatIntroSlideRemote = (ChatIntroSlideRemote) obj;
            return Intrinsics.areEqual(this.title, chatIntroSlideRemote.title) && Intrinsics.areEqual(this.description, chatIntroSlideRemote.description) && Intrinsics.areEqual(this.action, chatIntroSlideRemote.action) && this.isVisibleCancelButton == chatIntroSlideRemote.isVisibleCancelButton;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.action.hashCode()) * 31;
        boolean z = this.isVisibleCancelButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.action;
        boolean z = this.isVisibleCancelButton;
        return "ChatIntroSlideRemote(title=" + str + ", description=" + str2 + ", action=" + str3 + ", isVisibleCancelButton=" + z + ")";
    }

    public ChatIntroSlideRemote(String title, String description, String action, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.description = description;
        this.action = action;
        this.isVisibleCancelButton = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean isVisibleCancelButton() {
        return this.isVisibleCancelButton;
    }
}
