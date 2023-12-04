package io.grpc.netty.shaded.io.netty.handler.codec.string;

import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import org.json.HTTP;
/* loaded from: classes4.dex */
public final class LineSeparator {
    public static final LineSeparator DEFAULT = new LineSeparator(StringUtil.NEWLINE);
    public static final LineSeparator UNIX = new LineSeparator("\n");
    public static final LineSeparator WINDOWS = new LineSeparator(HTTP.CRLF);
    private final String value;

    public LineSeparator(String str) {
        this.value = (String) ObjectUtil.checkNotNull(str, "lineSeparator");
    }

    public String value() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LineSeparator) {
            String str = this.value;
            String str2 = ((LineSeparator) obj).value;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return ByteBufUtil.hexDump(this.value.getBytes(CharsetUtil.UTF_8));
    }
}
