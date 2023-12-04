package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;
/* loaded from: classes4.dex */
final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";
    private final SentryOptions options;

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestDetails resolve() {
        URI sentryUri;
        String str;
        Dsn dsn = new Dsn(this.options.getDsn());
        String uri = dsn.getSentryUri().resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = dsn.getPublicKey();
        String secretKey = dsn.getSecretKey();
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(this.options.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(publicKey);
        if (secretKey == null || secretKey.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + secretKey;
        }
        sb.append(str);
        String sb2 = sb.toString();
        String sentryClientName = this.options.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put(SENTRY_AUTH, sb2);
        return new RequestDetails(uri, hashMap);
    }
}
