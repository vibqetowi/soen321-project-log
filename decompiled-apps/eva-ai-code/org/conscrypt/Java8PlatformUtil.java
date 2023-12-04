package org.conscrypt;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import java.security.AlgorithmConstraints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Java8PlatformUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        setSSLParameters(sSLParameters, sSLParametersImpl);
        String sniHostName = getSniHostName(sSLParameters);
        if (sniHostName != null) {
            abstractConscryptSocket.setHostname(sniHostName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        setSSLParameters(sSLParameters, sSLParametersImpl);
        String sniHostName = getSniHostName(sSLParameters);
        if (sniHostName != null) {
            conscryptEngine.setHostname(sniHostName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        getSSLParameters(sSLParameters, sSLParametersImpl);
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(abstractConscryptSocket.getHostname())) {
            Platform$$ExternalSyntheticApiModelOutline0.m9091m$1();
            sSLParameters.setServerNames(Collections.singletonList(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(abstractConscryptSocket.getHostname())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        getSSLParameters(sSLParameters, sSLParametersImpl);
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(conscryptEngine.getHostname())) {
            Platform$$ExternalSyntheticApiModelOutline0.m9091m$1();
            sSLParameters.setServerNames(Collections.singletonList(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(conscryptEngine.getHostname())));
        }
    }

    private static String getSniHostName(SSLParameters sSLParameters) {
        List<Object> serverNames;
        int type;
        String asciiName;
        serverNames = sSLParameters.getServerNames();
        if (serverNames != null) {
            for (Object obj : serverNames) {
                SNIServerName m7230m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7230m(obj);
                type = m7230m.getType();
                if (type == 0) {
                    asciiName = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7228m((Object) m7230m).getAsciiName();
                    return asciiName;
                }
            }
            return null;
        }
        return null;
    }

    private static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        String endpointIdentificationAlgorithm;
        boolean useCipherSuitesOrder;
        Collection<SNIMatcher> sNIMatchers;
        AlgorithmConstraints algorithmConstraints;
        endpointIdentificationAlgorithm = sSLParameters.getEndpointIdentificationAlgorithm();
        sSLParametersImpl.setEndpointIdentificationAlgorithm(endpointIdentificationAlgorithm);
        useCipherSuitesOrder = sSLParameters.getUseCipherSuitesOrder();
        sSLParametersImpl.setUseCipherSuitesOrder(useCipherSuitesOrder);
        sNIMatchers = sSLParameters.getSNIMatchers();
        sSLParametersImpl.setSNIMatchers(sNIMatchers);
        algorithmConstraints = sSLParameters.getAlgorithmConstraints();
        sSLParametersImpl.setAlgorithmConstraints(algorithmConstraints);
    }

    private static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParameters.setEndpointIdentificationAlgorithm(sSLParametersImpl.getEndpointIdentificationAlgorithm());
        sSLParameters.setUseCipherSuitesOrder(sSLParametersImpl.getUseCipherSuitesOrder());
        sSLParameters.setSNIMatchers(sSLParametersImpl.getSNIMatchers());
        sSLParameters.setAlgorithmConstraints(sSLParametersImpl.getAlgorithmConstraints());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean serverNamePermitted(SSLParametersImpl sSLParametersImpl, String str) {
        boolean matches;
        Collection<SNIMatcher> sNIMatchers = sSLParametersImpl.getSNIMatchers();
        if (sNIMatchers == null || sNIMatchers.isEmpty()) {
            return true;
        }
        for (SNIMatcher sNIMatcher : sNIMatchers) {
            matches = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7229m((Object) sNIMatcher).matches(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(str));
            if (matches) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
        return new Java8EngineWrapper(conscryptEngine);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
        return Java8EngineWrapper.getDelegate(sSLEngine);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
        return new Java8ExtendedSSLSession(externalSession);
    }

    private Java8PlatformUtil() {
    }
}
