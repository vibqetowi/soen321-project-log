package o1;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
/* compiled from: MediaSessionManager.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f26974a;

    public p(String str, int i6, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f26974a = new q(str, i6, i10);
                    return;
                } else {
                    this.f26974a = new r(str, i6, i10);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f26974a.equals(((p) obj).f26974a);
    }

    public final int hashCode() {
        return this.f26974a.hashCode();
    }

    public p(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName;
        packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.f26974a = new q(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
