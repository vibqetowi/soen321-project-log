package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5;

import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResult;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
public class DefaultSocks5PasswordAuthRequest extends AbstractSocks5Message implements Socks5PasswordAuthRequest {
    private final String password;
    private final String username;

    public DefaultSocks5PasswordAuthRequest(String str, String str2) {
        ObjectUtil.checkNotNull(str, "username");
        ObjectUtil.checkNotNull(str2, "password");
        if (str.length() > 255) {
            throw new IllegalArgumentException("username: **** (expected: less than 256 chars)");
        }
        if (str2.length() > 255) {
            throw new IllegalArgumentException("password: **** (expected: less than 256 chars)");
        }
        this.username = str;
        this.password = str2;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest
    public String username() {
        return this.username;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5.Socks5PasswordAuthRequest
    public String password() {
        return this.password;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringUtil.simpleClassName(this));
        DecoderResult decoderResult = decoderResult();
        if (!decoderResult.isSuccess()) {
            sb.append("(decoderResult: ");
            sb.append(decoderResult);
            sb.append(", username: ");
        } else {
            sb.append("(username: ");
        }
        sb.append(username());
        sb.append(", password: ****)");
        return sb.toString();
    }
}
