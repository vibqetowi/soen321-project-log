package io.grpc.alts;

import io.grpc.ServerCall;
import io.grpc.Status;
import io.grpc.alts.internal.AltsAuthContext;
import io.grpc.alts.internal.AltsProtocolNegotiator;
import java.util.Collection;
/* loaded from: classes4.dex */
public final class AuthorizationUtil {
    private AuthorizationUtil() {
    }

    public static Status clientAuthorizationCheck(ServerCall<?, ?> serverCall, Collection<String> collection) {
        AltsAuthContext altsAuthContext = (AltsAuthContext) serverCall.getAttributes().get(AltsProtocolNegotiator.AUTH_CONTEXT_KEY);
        if (altsAuthContext == null) {
            return Status.PERMISSION_DENIED.withDescription("Peer ALTS AuthContext not found");
        }
        if (collection.contains(altsAuthContext.getPeerServiceAccount())) {
            return Status.OK;
        }
        Status status = Status.PERMISSION_DENIED;
        return status.withDescription("Client " + altsAuthContext.getPeerServiceAccount() + " is not authorized");
    }
}
