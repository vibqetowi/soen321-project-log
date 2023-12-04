package io.grpc.netty.shaded.io.netty.channel.epoll;

import io.grpc.netty.shaded.io.netty.channel.unix.FileDescriptor;
import io.grpc.netty.shaded.io.netty.util.internal.SystemPropertyUtil;
/* loaded from: classes4.dex */
public final class Epoll {
    private static final Throwable UNAVAILABILITY_CAUSE;

    static {
        UnsupportedOperationException th;
        FileDescriptor fileDescriptor;
        FileDescriptor newEventFd;
        if (SystemPropertyUtil.getBoolean("io.grpc.netty.shaded.io.netty.transport.noNative", false)) {
            th = new UnsupportedOperationException("Native transport was explicit disabled with -Dio.netty.transport.noNative=true");
        } else {
            th = null;
            try {
                try {
                    fileDescriptor = Native.newEpollCreate();
                } catch (Exception unused) {
                }
                try {
                    newEventFd = Native.newEventFd();
                    if (fileDescriptor != null) {
                        try {
                            fileDescriptor.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileDescriptor != null) {
                        fileDescriptor.close();
                    }
                    UNAVAILABILITY_CAUSE = th;
                }
            } catch (Throwable th3) {
                fileDescriptor = null;
                th = th3;
            }
            if (newEventFd != null) {
                newEventFd.close();
            }
        }
        UNAVAILABILITY_CAUSE = th;
    }

    public static boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }

    public static void ensureAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    public static Throwable unavailabilityCause() {
        return UNAVAILABILITY_CAUSE;
    }

    private Epoll() {
    }
}
