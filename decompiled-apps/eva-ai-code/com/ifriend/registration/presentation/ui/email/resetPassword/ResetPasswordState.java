package com.ifriend.registration.presentation.ui.email.resetPassword;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResetPasswordState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "email", "", "isEmailValid", "", "isLoading", "(Ljava/lang/String;ZZ)V", "getEmail", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetPasswordState extends BaseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String email;
    private final boolean isEmailValid;
    private final boolean isLoading;

    public static /* synthetic */ ResetPasswordState copy$default(ResetPasswordState resetPasswordState, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetPasswordState.email;
        }
        if ((i & 2) != 0) {
            z = resetPasswordState.isEmailValid;
        }
        if ((i & 4) != 0) {
            z2 = resetPasswordState.isLoading;
        }
        return resetPasswordState.copy(str, z, z2);
    }

    public final String component1() {
        return this.email;
    }

    public final boolean component2() {
        return this.isEmailValid;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final ResetPasswordState copy(String email, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new ResetPasswordState(email, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResetPasswordState) {
            ResetPasswordState resetPasswordState = (ResetPasswordState) obj;
            return Intrinsics.areEqual(this.email, resetPasswordState.email) && this.isEmailValid == resetPasswordState.isEmailValid && this.isLoading == resetPasswordState.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.email.hashCode() * 31;
        boolean z = this.isEmailValid;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isLoading;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.email;
        boolean z = this.isEmailValid;
        boolean z2 = this.isLoading;
        return "ResetPasswordState(email=" + str + ", isEmailValid=" + z + ", isLoading=" + z2 + ")";
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean isEmailValid() {
        return this.isEmailValid;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* compiled from: ResetPasswordState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState$Companion;", "", "()V", "empty", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResetPasswordState empty() {
            return new ResetPasswordState("", false, false);
        }
    }

    public ResetPasswordState(String email, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.isEmailValid = z;
        this.isLoading = z2;
    }
}
