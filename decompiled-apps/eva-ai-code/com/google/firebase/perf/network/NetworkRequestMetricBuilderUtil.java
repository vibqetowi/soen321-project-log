package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
/* loaded from: classes7.dex */
public final class NetworkRequestMetricBuilderUtil {
    private static final Pattern FLG_USER_AGENT_PATTERN = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    private NetworkRequestMetricBuilderUtil() {
    }

    public static Long getApacheHttpMessageContentLength(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            AndroidLogger.getInstance().debug("The content-length value is not a valid number");
            return null;
        }
    }

    public static String getApacheHttpResponseContentType(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void logError(NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        if (!networkRequestMetricBuilder.hasHttpResponseCode()) {
            networkRequestMetricBuilder.setNetworkClientErrorReason();
        }
        networkRequestMetricBuilder.build();
    }

    public static boolean isAllowedUserAgent(String str) {
        return str == null || !FLG_USER_AGENT_PATTERN.matcher(str).matches();
    }
}
