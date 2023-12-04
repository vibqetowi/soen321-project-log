package io.sentry;

import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URI;
/* loaded from: classes4.dex */
final class Dsn {
    private final String path;
    private final String projectId;
    private final String publicKey;
    private final String secretKey;
    private final URI sentryUri;

    public String getProjectId() {
        return this.projectId;
    }

    public String getPath() {
        return this.path;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public URI getSentryUri() {
        return this.sentryUri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Dsn(String str) throws IllegalArgumentException {
        try {
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] split = userInfo.split(CertificateUtil.DELIMITER, -1);
            String str2 = split[0];
            this.publicKey = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.secretKey = split.length > 1 ? split[1] : null;
            String path = normalize.getPath();
            path = path.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? path.substring(0, path.length() - 1) : path;
            int lastIndexOf = path.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1;
            String substring = path.substring(0, lastIndexOf);
            if (!substring.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                substring = substring + RemoteSettings.FORWARD_SLASH_STRING;
            }
            this.path = substring;
            String substring2 = path.substring(lastIndexOf);
            this.projectId = substring2;
            if (substring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.sentryUri = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }
}
