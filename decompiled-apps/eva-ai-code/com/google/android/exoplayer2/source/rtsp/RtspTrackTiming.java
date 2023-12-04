package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
/* loaded from: classes2.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #0 {Exception -> 0x008e, blocks: (B:7:0x0027, B:28:0x0070, B:29:0x0075, B:30:0x007a, B:31:0x007b, B:33:0x0082, B:14:0x0049, B:17:0x0053, B:20:0x005e), top: B:51:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ImmutableList<RtspTrackTiming> parseTrackTiming(String str, Uri uri) throws ParserException {
        char c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String[] split = Util.split(str, ",");
        int length = split.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            String str2 = split[i2];
            String[] split2 = Util.split(str2, ";");
            int length2 = split2.length;
            int i3 = i;
            Uri uri2 = null;
            int i4 = -1;
            long j = C.TIME_UNSET;
            while (i3 < length2) {
                String str3 = split2[i3];
                try {
                    String[] splitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = splitAtFirst[i];
                    String str5 = splitAtFirst[1];
                    int hashCode = str4.hashCode();
                    String[] strArr = split;
                    if (hashCode == 113759) {
                        if (str4.equals(RtspHeaders.Values.SEQ)) {
                            c = 1;
                            if (c != 0) {
                            }
                            i3++;
                            split = strArr;
                            i = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        i = 0;
                    } else if (hashCode != 116079) {
                        if (hashCode == 1524180539 && str4.equals(RtspHeaders.Values.RTPTIME)) {
                            c = 2;
                            if (c != 0) {
                                uri2 = resolveUri(str5, uri);
                            } else if (c == 1) {
                                i4 = Integer.parseInt(str5);
                            } else if (c == 2) {
                                j = Long.parseLong(str5);
                            } else {
                                throw ParserException.createForMalformedManifest(str4, null);
                            }
                            i3++;
                            split = strArr;
                            i = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        i = 0;
                    } else {
                        if (str4.equals("url")) {
                            c = 0;
                            if (c != 0) {
                            }
                            i3++;
                            split = strArr;
                            i = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        i3++;
                        split = strArr;
                        i = 0;
                    }
                } catch (Exception e) {
                    throw ParserException.createForMalformedManifest(str3, e);
                }
                throw ParserException.createForMalformedManifest(str3, e);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                long j2 = j;
                if (i4 != -1 || j2 != C.TIME_UNSET) {
                    builder.add((ImmutableList.Builder) new RtspTrackTiming(j2, i4, uri2));
                    i2++;
                    split = strArr2;
                    i = 0;
                }
            }
            throw ParserException.createForMalformedManifest(str2, null);
        }
        return builder.build();
    }

    static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) Assertions.checkNotNull(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return UriUtil.resolveToUri(uri2, str);
        }
        return UriUtil.resolveToUri(uri2 + RemoteSettings.FORWARD_SLASH_STRING, str);
    }

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }
}
