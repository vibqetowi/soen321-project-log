package com.google.firebase.database.tubesock;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import pl.a;
import r1.b0;
import v.g;
import v.h;
/* loaded from: classes.dex */
class WebSocketHandshake {
    private static final String WEBSOCKET_VERSION = "13";
    private Map<String, String> extraHeaders;
    private String nonce;
    private String protocol;
    private URI url;

    public WebSocketHandshake(URI uri, String str, Map<String, String> map) {
        this.nonce = null;
        this.url = uri;
        this.protocol = str;
        this.extraHeaders = map;
        this.nonce = createNonce();
    }

    private String createNonce() {
        byte[] bArr = new byte[16];
        for (int i6 = 0; i6 < 16; i6++) {
            bArr[i6] = (byte) rand(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    private String generateHeader(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(": ");
            str = b0.b(sb2, linkedHashMap.get(str2), "\r\n");
        }
        return str;
    }

    private int rand(int i6, int i10) {
        return (int) ((Math.random() * i10) + i6);
    }

    public byte[] getHandshake() {
        String concat;
        String path = this.url.getPath();
        String query = this.url.getQuery();
        StringBuilder c10 = h.c(path);
        if (query == null) {
            concat = "";
        } else {
            concat = "?".concat(query);
        }
        c10.append(concat);
        String sb2 = c10.toString();
        String host = this.url.getHost();
        if (this.url.getPort() != -1) {
            StringBuilder d10 = g.d(host, ":");
            d10.append(this.url.getPort());
            host = d10.toString();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", WEBSOCKET_VERSION);
        linkedHashMap.put("Sec-WebSocket-Key", this.nonce);
        String str = this.protocol;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.extraHeaders;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.extraHeaders.get(str2));
                }
            }
        }
        StringBuilder c11 = h.c(b.m("GET ", sb2, " HTTP/1.1\r\n"));
        c11.append(generateHeader(linkedHashMap));
        byte[] bytes = a.f(c11.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public void verifyServerHandshakeHeaders(HashMap<String, String> hashMap) {
        if ("websocket".equals(hashMap.get("upgrade"))) {
            if ("upgrade".equals(hashMap.get("connection"))) {
                return;
            }
            throw new WebSocketException("connection failed: missing header field in server handshake: Connection");
        }
        throw new WebSocketException("connection failed: missing header field in server handshake: Upgrade");
    }

    public void verifyServerStatusLine(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt != 407) {
            if (parseInt != 404) {
                if (parseInt == 101) {
                    return;
                }
                throw new WebSocketException(c.p("connection failed: unknown status code ", parseInt));
            }
            throw new WebSocketException("connection failed: 404 not found");
        }
        throw new WebSocketException("connection failed: proxy authentication not supported");
    }
}
