package com.ifriend.domain.logic.chat.models;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatIntroSlide.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatIntroSlide;", "", "title", "", "description", NativeProtocol.WEB_DIALOG_ACTION, "isVisibleCancelButton", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getDescription", "()Z", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroSlide {
    private final String action;
    private final String description;
    private final boolean isVisibleCancelButton;
    private final String title;

    public static /* synthetic */ ChatIntroSlide copy$default(ChatIntroSlide chatIntroSlide, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatIntroSlide.title;
        }
        if ((i & 2) != 0) {
            str2 = chatIntroSlide.description;
        }
        if ((i & 4) != 0) {
            str3 = chatIntroSlide.action;
        }
        if ((i & 8) != 0) {
            z = chatIntroSlide.isVisibleCancelButton;
        }
        return chatIntroSlide.copy(str, str2, str3, z);
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

    public final ChatIntroSlide copy(String title, String description, String action, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ChatIntroSlide(title, description, action, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatIntroSlide) {
            ChatIntroSlide chatIntroSlide = (ChatIntroSlide) obj;
            return Intrinsics.areEqual(this.title, chatIntroSlide.title) && Intrinsics.areEqual(this.description, chatIntroSlide.description) && Intrinsics.areEqual(this.action, chatIntroSlide.action) && this.isVisibleCancelButton == chatIntroSlide.isVisibleCancelButton;
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
        return "ChatIntroSlide(title=" + str + ", description=" + str2 + ", action=" + str3 + ", isVisibleCancelButton=" + z + ")";
    }

    public ChatIntroSlide(String title, String description, String action, boolean z) {
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
