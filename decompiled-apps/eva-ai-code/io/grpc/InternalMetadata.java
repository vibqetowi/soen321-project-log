package io.grpc;

import com.google.common.io.BaseEncoding;
import io.grpc.Metadata;
import java.nio.charset.Charset;
/* loaded from: classes4.dex */
public final class InternalMetadata {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final BaseEncoding BASE64_ENCODING_OMIT_PADDING = Metadata.BASE64_ENCODING_OMIT_PADDING;

    /* loaded from: classes4.dex */
    public interface TrustedAsciiMarshaller<T> extends Metadata.TrustedAsciiMarshaller<T> {
    }

    public static <T> Metadata.Key<T> keyOf(String str, TrustedAsciiMarshaller<T> trustedAsciiMarshaller) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return Metadata.Key.of(str, z, trustedAsciiMarshaller);
    }

    public static <T> Metadata.Key<T> keyOf(String str, Metadata.AsciiMarshaller<T> asciiMarshaller) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return Metadata.Key.of(str, z, asciiMarshaller);
    }

    public static Metadata newMetadata(byte[]... bArr) {
        return new Metadata(bArr);
    }

    public static Metadata newMetadata(int i, byte[]... bArr) {
        return new Metadata(i, bArr);
    }

    public static byte[][] serialize(Metadata metadata) {
        return metadata.serialize();
    }

    public static int headerCount(Metadata metadata) {
        return metadata.headerCount();
    }

    public static Object[] serializePartial(Metadata metadata) {
        return metadata.serializePartial();
    }

    public static <T> Object parsedValue(Metadata.BinaryStreamMarshaller<T> binaryStreamMarshaller, T t) {
        return new Metadata.LazyValue(binaryStreamMarshaller, t);
    }

    public static Metadata newMetadataWithParsedValues(int i, Object[] objArr) {
        return new Metadata(i, objArr);
    }
}
