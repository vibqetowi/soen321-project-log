package com.ifriend.common_utils.encoder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.codec.binary.Base64;
/* compiled from: Base64Encoder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ifriend/common_utils/encoder/Base64Encoder;", "Lcom/ifriend/common_utils/encoder/Encoder;", "", "()V", "encode", "input", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Base64Encoder implements Encoder<String, String> {
    public static final Base64Encoder INSTANCE = new Base64Encoder();

    private Base64Encoder() {
    }

    @Override // com.ifriend.common_utils.encoder.Encoder
    public String encode(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] encodeBase64 = Base64.encodeBase64(bytes);
        Intrinsics.checkNotNullExpressionValue(encodeBase64, "encodeBase64(...)");
        return new String(encodeBase64, Charsets.UTF_8);
    }
}
