package org.apache.http.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.netty.shaded.io.netty.handler.codec.http.cookie.CookieHeaderNames;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;
/* loaded from: classes5.dex */
public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public CookieOrigin(String str, int i, String str2, boolean z) {
        Args.notBlank(str, "Host");
        Args.notNegative(i, "Port");
        Args.notNull(str2, CookieHeaderNames.PATH);
        this.host = str.toLowerCase(Locale.ROOT);
        this.port = i;
        if (!TextUtils.isBlank(str2)) {
            this.path = str2;
        } else {
            this.path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        this.secure = z;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.secure) {
            sb.append("(secure)");
        }
        sb.append(this.host);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(Integer.toString(this.port));
        sb.append(this.path);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
