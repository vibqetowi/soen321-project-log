package com.google.firebase.database.core;

import com.google.firebase.database.annotations.Nullable;
import java.net.URI;
import r1.b0;
import v.g;
/* loaded from: classes.dex */
public final class RepoInfo {
    private static final String LAST_SESSION_ID_PARAM = "ls";
    private static final String VERSION_PARAM = "v";
    public String host;
    public String internalHost;
    public String namespace;
    public boolean secure;

    public void applyEmulatorSettings(@Nullable zd.a aVar) {
        if (aVar == null) {
            return;
        }
        String str = aVar.f39363a + ":" + aVar.f39364b;
        this.host = str;
        this.internalHost = str;
        this.secure = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RepoInfo.class != obj.getClass()) {
            return false;
        }
        RepoInfo repoInfo = (RepoInfo) obj;
        if (this.secure != repoInfo.secure || !this.host.equals(repoInfo.host)) {
            return false;
        }
        return this.namespace.equals(repoInfo.namespace);
    }

    public URI getConnectionURL(String str) {
        String str2;
        if (this.secure) {
            str2 = "wss";
        } else {
            str2 = "ws";
        }
        StringBuilder d10 = g.d(str2, "://");
        d10.append(this.internalHost);
        d10.append("/.ws?ns=");
        String b10 = b0.b(d10, this.namespace, "&v=5");
        if (str != null) {
            b10 = defpackage.d.f(b10, "&ls=", str);
        }
        return URI.create(b10);
    }

    public int hashCode() {
        return this.namespace.hashCode() + (((this.host.hashCode() * 31) + (this.secure ? 1 : 0)) * 31);
    }

    public boolean isCacheableHost() {
        return this.internalHost.startsWith("s-");
    }

    public boolean isCustomHost() {
        if (!this.host.contains(".firebaseio.com") && !this.host.contains(".firebaseio-demo.com")) {
            return true;
        }
        return false;
    }

    public boolean isDemoHost() {
        return this.host.contains(".firebaseio-demo.com");
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toDebugString() {
        StringBuilder sb2 = new StringBuilder("(host=");
        sb2.append(this.host);
        sb2.append(", secure=");
        sb2.append(this.secure);
        sb2.append(", ns=");
        sb2.append(this.namespace);
        sb2.append(" internal=");
        return b0.b(sb2, this.internalHost, ")");
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("http");
        if (this.secure) {
            str = "s";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("://");
        sb2.append(this.host);
        return sb2.toString();
    }
}
