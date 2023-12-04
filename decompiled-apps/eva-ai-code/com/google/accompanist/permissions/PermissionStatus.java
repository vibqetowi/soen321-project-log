package com.google.accompanist.permissions;

import kotlin.Metadata;
/* compiled from: PermissionsUtil.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus;", "", "Denied", "Granted", "Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PermissionStatus {

    /* compiled from: PermissionsUtil.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "Lcom/google/accompanist/permissions/PermissionStatus;", "()V", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Granted implements PermissionStatus {
        public static final int $stable = 0;
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }
    }

    /* compiled from: PermissionsUtil.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus;", "shouldShowRationale", "", "(Z)V", "getShouldShowRationale", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Denied implements PermissionStatus {
        public static final int $stable = 0;
        private final boolean shouldShowRationale;

        public static /* synthetic */ Denied copy$default(Denied denied, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = denied.shouldShowRationale;
            }
            return denied.copy(z);
        }

        public final boolean component1() {
            return this.shouldShowRationale;
        }

        public final Denied copy(boolean z) {
            return new Denied(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Denied) && this.shouldShowRationale == ((Denied) obj).shouldShowRationale;
        }

        public int hashCode() {
            boolean z = this.shouldShowRationale;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Denied(shouldShowRationale=" + this.shouldShowRationale + ')';
        }

        public Denied(boolean z) {
            this.shouldShowRationale = z;
        }

        public final boolean getShouldShowRationale() {
            return this.shouldShowRationale;
        }
    }
}
