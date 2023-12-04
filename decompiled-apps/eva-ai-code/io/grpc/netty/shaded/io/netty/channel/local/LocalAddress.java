package io.grpc.netty.shaded.io.netty.channel.local;

import io.grpc.netty.shaded.io.netty.channel.Channel;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.net.SocketAddress;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes4.dex */
public final class LocalAddress extends SocketAddress implements Comparable<LocalAddress> {
    public static final LocalAddress ANY = new LocalAddress("ANY");
    private static final long serialVersionUID = 4644331421130916435L;
    private final String id;
    private final String strVal;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalAddress(Channel channel) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("local:E");
        sb.append(Long.toHexString((channel.hashCode() & 4294967295L) | 4294967296L));
        sb.setCharAt(7, AbstractJsonLexerKt.COLON);
        this.id = sb.substring(6);
        this.strVal = sb.toString();
    }

    public LocalAddress(String str) {
        ObjectUtil.checkNotNull(str, "id");
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            throw new IllegalArgumentException("empty id");
        }
        this.id = lowerCase;
        this.strVal = "local:" + lowerCase;
    }

    public String id() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocalAddress) {
            return this.id.equals(((LocalAddress) obj).id);
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalAddress localAddress) {
        return this.id.compareTo(localAddress.id);
    }

    public String toString() {
        return this.strVal;
    }
}
