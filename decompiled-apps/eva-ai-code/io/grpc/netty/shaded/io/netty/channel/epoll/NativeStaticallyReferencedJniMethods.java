package io.grpc.netty.shaded.io.netty.channel.epoll;
/* loaded from: classes4.dex */
final class NativeStaticallyReferencedJniMethods {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int epollerr();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int epollet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int epollin();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int epollout();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int epollrdhup();

    static native int iovMax();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean isSupportingRecvmmsg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean isSupportingSendmmsg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean isSupportingTcpFastopen();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native String kernelVersion();

    static native long ssizeMax();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int tcpMd5SigMaxKeyLen();

    static native int uioMaxIov();

    private NativeStaticallyReferencedJniMethods() {
    }
}
