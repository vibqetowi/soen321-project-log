package org.conscrypt;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;
/* loaded from: classes5.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        if (requestedServerName == null) {
            return null;
        }
        return Collections.singletonList(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(requestedServerName));
    }
}
