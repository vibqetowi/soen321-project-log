package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLParameters;
/* loaded from: classes4.dex */
final class Java8SslUtils {
    private Java8SslUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> getSniHostNames(SSLParameters sSLParameters) {
        List<Object> serverNames;
        String asciiName;
        serverNames = sSLParameters.getServerNames();
        if (serverNames == null || serverNames.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(serverNames.size());
        for (Object obj : serverNames) {
            SNIServerName m7230m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7230m(obj);
            if (CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m$1(m7230m)) {
                asciiName = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7228m((Object) m7230m).getAsciiName();
                arrayList.add(asciiName);
            } else {
                throw new IllegalArgumentException("Only " + CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7209m().getName() + " instances are supported, but found: " + m7230m);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSniHostNames(SSLParameters sSLParameters, List<String> list) {
        sSLParameters.setServerNames(getSniHostNames(list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getSniHostNames(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getSniHostName(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return Collections.emptyList();
        }
        return Collections.singletonList(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getUseCipherSuitesOrder(SSLParameters sSLParameters) {
        boolean useCipherSuitesOrder;
        useCipherSuitesOrder = sSLParameters.getUseCipherSuitesOrder();
        return useCipherSuitesOrder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setUseCipherSuitesOrder(SSLParameters sSLParameters, boolean z) {
        sSLParameters.setUseCipherSuitesOrder(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSNIMatchers(SSLParameters sSLParameters, Collection<?> collection) {
        sSLParameters.setSNIMatchers(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean checkSniHostnameMatch(Collection<?> collection, byte[] bArr) {
        int type;
        boolean matches;
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        SNIHostName m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m(bArr);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            SNIMatcher m7229m = CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7229m(it.next());
            type = m7229m.getType();
            if (type == 0) {
                matches = m7229m.matches(m);
                if (matches) {
                    return true;
                }
            }
        }
        return false;
    }
}
