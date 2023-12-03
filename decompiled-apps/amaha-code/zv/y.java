package zv;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
/* compiled from: JvmOkio.kt */
/* loaded from: classes2.dex */
public final class y extends a {

    /* renamed from: k  reason: collision with root package name */
    public final Socket f39929k;

    public y(Socket socket) {
        this.f39929k = socket;
    }

    @Override // zv.a
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // zv.a
    public final void k() {
        Socket socket = this.f39929k;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (ta.v.C(e10)) {
                p.f39906a.log(Level.WARNING, kotlin.jvm.internal.i.n(socket, "Failed to close timed out socket "), (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            p.f39906a.log(Level.WARNING, kotlin.jvm.internal.i.n(socket, "Failed to close timed out socket "), (Throwable) e11);
        }
    }
}
