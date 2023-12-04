package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState create(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new zza(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static SplitInstallSessionState zzd(Bundle bundle) {
        return new zza(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int status = status();
        return status == 0 || status == 5 || status == 6 || status == 7;
    }

    public List<String> languages() {
        return zza() != null ? new ArrayList(zza()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return zzb() != null ? new ArrayList(zzb()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List zzc();
}
