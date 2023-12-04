package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.handler.codec.Headers;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.http2.Header;
/* loaded from: classes4.dex */
public interface Http2Headers extends Headers<CharSequence, CharSequence, Http2Headers> {
    Http2Headers authority(CharSequence charSequence);

    CharSequence authority();

    boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z);

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.Headers, java.lang.Iterable
    Iterator<Map.Entry<CharSequence, CharSequence>> iterator();

    Http2Headers method(CharSequence charSequence);

    CharSequence method();

    Http2Headers path(CharSequence charSequence);

    CharSequence path();

    Http2Headers scheme(CharSequence charSequence);

    CharSequence scheme();

    Http2Headers status(CharSequence charSequence);

    CharSequence status();

    Iterator<CharSequence> valueIterator(CharSequence charSequence);

    /* loaded from: classes4.dex */
    public enum PseudoHeaderName {
        METHOD(Header.TARGET_METHOD_UTF8, true),
        SCHEME(Header.TARGET_SCHEME_UTF8, true),
        AUTHORITY(Header.TARGET_AUTHORITY_UTF8, true),
        PATH(Header.TARGET_PATH_UTF8, true),
        STATUS(Header.RESPONSE_STATUS_UTF8, false);
        
        private static final CharSequenceMap<PseudoHeaderName> PSEUDO_HEADERS = new CharSequenceMap<>();
        private static final char PSEUDO_HEADER_PREFIX = ':';
        private static final byte PSEUDO_HEADER_PREFIX_BYTE = 58;
        private final boolean requestOnly;
        private final AsciiString value;

        static {
            PseudoHeaderName[] values;
            for (PseudoHeaderName pseudoHeaderName : values()) {
                PSEUDO_HEADERS.add((CharSequenceMap<PseudoHeaderName>) pseudoHeaderName.value(), (AsciiString) pseudoHeaderName);
            }
        }

        PseudoHeaderName(String str, boolean z) {
            this.value = AsciiString.cached(str);
            this.requestOnly = z;
        }

        public AsciiString value() {
            return this.value;
        }

        public static boolean hasPseudoHeaderFormat(CharSequence charSequence) {
            if (!(charSequence instanceof AsciiString)) {
                return charSequence.length() > 0 && charSequence.charAt(0) == ':';
            }
            AsciiString asciiString = (AsciiString) charSequence;
            return asciiString.length() > 0 && asciiString.byteAt(0) == 58;
        }

        public static boolean isPseudoHeader(CharSequence charSequence) {
            return PSEUDO_HEADERS.contains(charSequence);
        }

        public static PseudoHeaderName getPseudoHeader(CharSequence charSequence) {
            return PSEUDO_HEADERS.get(charSequence);
        }

        public boolean isRequestOnly() {
            return this.requestOnly;
        }
    }
}
