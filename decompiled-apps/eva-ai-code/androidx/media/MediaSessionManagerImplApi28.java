package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.media.MediaSessionManager;
import androidx.media.MediaSessionManagerImplBase;
import androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0;
/* loaded from: classes3.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl userInfo) {
        return super.isTrustedForMediaControl(userInfo);
    }

    /* loaded from: classes3.dex */
    static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        final MediaSessionManager.RemoteUserInfo mObject;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(String packageName, int pid, int uid) {
            super(packageName, pid, uid);
            this.mObject = Trace$$ExternalSyntheticApiModelOutline0.m(packageName, pid, uid);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(r0, r1, r2);
            String packageName;
            int pid;
            int uid;
            packageName = remoteUserInfo.getPackageName();
            pid = remoteUserInfo.getPid();
            uid = remoteUserInfo.getUid();
            this.mObject = remoteUserInfo;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String getPackageName(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName;
            packageName = remoteUserInfo.getPackageName();
            return packageName;
        }
    }
}
