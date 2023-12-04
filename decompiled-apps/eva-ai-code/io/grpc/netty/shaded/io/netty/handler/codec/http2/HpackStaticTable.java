package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.internal.GrpcUtil;
import io.grpc.netty.shaded.io.netty.handler.codec.UnsupportedValueConverter;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.http2.Header;
import org.apache.http.HttpHost;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes4.dex */
final class HpackStaticTable {
    private static final CharSequenceMap<Integer> STATIC_INDEX_BY_NAME;
    private static final List<HpackHeaderField> STATIC_TABLE;
    static final int length;

    static {
        List<HpackHeaderField> asList = Arrays.asList(newEmptyHeaderField(Header.TARGET_AUTHORITY_UTF8), newHeaderField(Header.TARGET_METHOD_UTF8, "GET"), newHeaderField(Header.TARGET_METHOD_UTF8, "POST"), newHeaderField(Header.TARGET_PATH_UTF8, RemoteSettings.FORWARD_SLASH_STRING), newHeaderField(Header.TARGET_PATH_UTF8, "/index.html"), newHeaderField(Header.TARGET_SCHEME_UTF8, HttpHost.DEFAULT_SCHEME_NAME), newHeaderField(Header.TARGET_SCHEME_UTF8, "https"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "200"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "204"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "206"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "304"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "400"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "404"), newHeaderField(Header.RESPONSE_STATUS_UTF8, "500"), newEmptyHeaderField("accept-charset"), newHeaderField(GrpcUtil.CONTENT_ACCEPT_ENCODING, "gzip, deflate"), newEmptyHeaderField("accept-language"), newEmptyHeaderField("accept-ranges"), newEmptyHeaderField("accept"), newEmptyHeaderField("access-control-allow-origin"), newEmptyHeaderField("age"), newEmptyHeaderField("allow"), newEmptyHeaderField("authorization"), newEmptyHeaderField("cache-control"), newEmptyHeaderField("content-disposition"), newEmptyHeaderField(GrpcUtil.CONTENT_ENCODING), newEmptyHeaderField("content-language"), newEmptyHeaderField("content-length"), newEmptyHeaderField("content-location"), newEmptyHeaderField("content-range"), newEmptyHeaderField("content-type"), newEmptyHeaderField("cookie"), newEmptyHeaderField("date"), newEmptyHeaderField("etag"), newEmptyHeaderField("expect"), newEmptyHeaderField(ClientCookie.EXPIRES_ATTR), newEmptyHeaderField("from"), newEmptyHeaderField("host"), newEmptyHeaderField("if-match"), newEmptyHeaderField("if-modified-since"), newEmptyHeaderField("if-none-match"), newEmptyHeaderField("if-range"), newEmptyHeaderField("if-unmodified-since"), newEmptyHeaderField("last-modified"), newEmptyHeaderField("link"), newEmptyHeaderField(FirebaseAnalytics.Param.LOCATION), newEmptyHeaderField("max-forwards"), newEmptyHeaderField("proxy-authenticate"), newEmptyHeaderField("proxy-authorization"), newEmptyHeaderField(SessionDescription.ATTR_RANGE), newEmptyHeaderField("referer"), newEmptyHeaderField("refresh"), newEmptyHeaderField("retry-after"), newEmptyHeaderField("server"), newEmptyHeaderField("set-cookie"), newEmptyHeaderField("strict-transport-security"), newEmptyHeaderField("transfer-encoding"), newEmptyHeaderField("user-agent"), newEmptyHeaderField("vary"), newEmptyHeaderField("via"), newEmptyHeaderField("www-authenticate"));
        STATIC_TABLE = asList;
        STATIC_INDEX_BY_NAME = createMap();
        length = asList.size();
    }

    private static HpackHeaderField newEmptyHeaderField(String str) {
        return new HpackHeaderField(AsciiString.cached(str), AsciiString.EMPTY_STRING);
    }

    private static HpackHeaderField newHeaderField(String str, String str2) {
        return new HpackHeaderField(AsciiString.cached(str), AsciiString.cached(str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HpackHeaderField getEntry(int i) {
        return STATIC_TABLE.get(i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getIndex(CharSequence charSequence) {
        Integer num = STATIC_INDEX_BY_NAME.get(charSequence);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getIndexInsensitive(CharSequence charSequence, CharSequence charSequence2) {
        int index = getIndex(charSequence);
        if (index == -1) {
            return -1;
        }
        while (index <= length) {
            HpackHeaderField entry = getEntry(index);
            if (HpackUtil.equalsVariableTime(charSequence, entry.name) && HpackUtil.equalsVariableTime(charSequence2, entry.value)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private static CharSequenceMap<Integer> createMap() {
        int size = STATIC_TABLE.size();
        CharSequenceMap<Integer> charSequenceMap = new CharSequenceMap<>(true, UnsupportedValueConverter.instance(), size);
        while (size > 0) {
            charSequenceMap.set((CharSequenceMap<Integer>) getEntry(size).name, (CharSequence) Integer.valueOf(size));
            size--;
        }
        return charSequenceMap;
    }

    private HpackStaticTable() {
    }
}
