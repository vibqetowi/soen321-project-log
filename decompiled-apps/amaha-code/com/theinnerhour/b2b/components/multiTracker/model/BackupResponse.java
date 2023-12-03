package com.theinnerhour.b2b.components.multiTracker.model;

import com.appsflyer.R;
import kotlin.Metadata;
import tf.b;
/* compiled from: BackupResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/model/BackupResponse;", "", "isDataBackup", "", "(Z)V", "()Z", "setDataBackup", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class BackupResponse {
    @b("is_data_backup")
    private boolean isDataBackup;

    public BackupResponse(boolean z10) {
        this.isDataBackup = z10;
    }

    public static /* synthetic */ BackupResponse copy$default(BackupResponse backupResponse, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = backupResponse.isDataBackup;
        }
        return backupResponse.copy(z10);
    }

    public final boolean component1() {
        return this.isDataBackup;
    }

    public final BackupResponse copy(boolean z10) {
        return new BackupResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BackupResponse) && this.isDataBackup == ((BackupResponse) obj).isDataBackup) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z10 = this.isDataBackup;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final boolean isDataBackup() {
        return this.isDataBackup;
    }

    public final void setDataBackup(boolean z10) {
        this.isDataBackup = z10;
    }

    public String toString() {
        return c.t(new StringBuilder("BackupResponse(isDataBackup="), this.isDataBackup, ')');
    }
}
