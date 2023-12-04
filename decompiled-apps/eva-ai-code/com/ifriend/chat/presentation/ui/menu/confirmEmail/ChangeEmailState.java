package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChangeEmailState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "email", "", "isValid", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getEmail", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "equals", "other", "", "hashCode", "", "toString", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeEmailState extends BaseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;
    private final Boolean isValid;

    public static /* synthetic */ ChangeEmailState copy$default(ChangeEmailState changeEmailState, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeEmailState.email;
        }
        if ((i & 2) != 0) {
            bool = changeEmailState.isValid;
        }
        return changeEmailState.copy(str, bool);
    }

    public final String component1() {
        return this.email;
    }

    public final Boolean component2() {
        return this.isValid;
    }

    public final ChangeEmailState copy(String email, Boolean bool) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new ChangeEmailState(email, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeEmailState) {
            ChangeEmailState changeEmailState = (ChangeEmailState) obj;
            return Intrinsics.areEqual(this.email, changeEmailState.email) && Intrinsics.areEqual(this.isValid, changeEmailState.isValid);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.email.hashCode() * 31;
        Boolean bool = this.isValid;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.email;
        Boolean bool = this.isValid;
        return "ChangeEmailState(email=" + str + ", isValid=" + bool + ")";
    }

    /* compiled from: ChangeEmailState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState$Companion;", "", "()V", "getEmpty", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChangeEmailState getEmpty() {
            return new ChangeEmailState("", null);
        }
    }

    public ChangeEmailState(String email, Boolean bool) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.isValid = bool;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean isValid() {
        return this.isValid;
    }
}
