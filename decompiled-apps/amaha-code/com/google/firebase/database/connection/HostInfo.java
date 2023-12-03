package com.google.firebase.database.connection;

import java.net.URI;
/* loaded from: classes.dex */
public class HostInfo {
    private static final String LAST_SESSION_ID_PARAM = "ls";
    private static final String VERSION_PARAM = "v";
    private final String host;
    private final String namespace;
    private final boolean secure;

    public HostInfo(String str, String str2, boolean z10) {
        this.host = str;
        this.namespace = str2;
        this.secure = z10;
    }

    public static URI getConnectionUrl(String str, boolean z10, String str2, String str3) {
        String str4;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        String str5 = str4 + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str5 = defpackage.d.f(str5, "&ls=", str3);
        }
        return URI.create(str5);
    }

    public String getHost() {
        return this.host;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public boolean isSecure() {
        return this.secure;
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
