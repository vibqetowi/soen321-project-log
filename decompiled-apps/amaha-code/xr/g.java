package xr;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLParameters;
/* compiled from: Platform.java */
/* loaded from: classes2.dex */
public final class g implements PrivilegedExceptionAction<Method> {
    @Override // java.security.PrivilegedExceptionAction
    public final Method run() {
        return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
    }
}
