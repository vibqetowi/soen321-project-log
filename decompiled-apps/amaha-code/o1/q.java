package o1;

import android.media.session.MediaSessionManager;
/* compiled from: MediaSessionManagerImplApi28.java */
/* loaded from: classes.dex */
public final class q extends r {
    public q(String str, int i6, int i10) {
        super(str, i6, i10);
        new MediaSessionManager.RemoteUserInfo(str, i6, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(r0, r1, r3);
        String packageName;
        int pid;
        int uid;
        packageName = remoteUserInfo.getPackageName();
        pid = remoteUserInfo.getPid();
        uid = remoteUserInfo.getUid();
    }
}
