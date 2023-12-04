package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserProfileDeleteViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/DeleteProfileState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "botName", "", "(Ljava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeleteProfileState extends BaseState {
    public static final int $stable = 0;
    private final String botName;

    public DeleteProfileState() {
        this(null, 1, null);
    }

    public static /* synthetic */ DeleteProfileState copy$default(DeleteProfileState deleteProfileState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteProfileState.botName;
        }
        return deleteProfileState.copy(str);
    }

    public final String component1() {
        return this.botName;
    }

    public final DeleteProfileState copy(String botName) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        return new DeleteProfileState(botName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteProfileState) && Intrinsics.areEqual(this.botName, ((DeleteProfileState) obj).botName);
    }

    public int hashCode() {
        return this.botName.hashCode();
    }

    public String toString() {
        String str = this.botName;
        return "DeleteProfileState(botName=" + str + ")";
    }

    public /* synthetic */ DeleteProfileState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getBotName() {
        return this.botName;
    }

    public DeleteProfileState(String botName) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        this.botName = botName;
    }
}
