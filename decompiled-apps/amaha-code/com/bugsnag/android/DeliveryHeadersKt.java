package com.bugsnag.android;

import ca.a;
import com.bugsnag.android.internal.DateUtils;
import com.davemorrissey.labs.subscaleview.BuildConfig;
import hs.f;
import hs.g;
import hs.k;
import is.e0;
import java.io.BufferedOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: DeliveryHeaders.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\t\u001a\u00020\rH\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000\u001a\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"HEADER_API_KEY", "", "HEADER_API_PAYLOAD_VERSION", "HEADER_BUGSNAG_INTEGRITY", "HEADER_BUGSNAG_SENT_AT", "HEADER_BUGSNAG_STACKTRACE_TYPES", "HEADER_CONTENT_TYPE", "HEADER_INTERNAL_ERROR", "computeSha1Digest", "payload", "", "errorApiHeaders", "", "Lcom/bugsnag/android/EventPayload;", "serializeErrorTypeHeader", "errorTypes", "", "Lcom/bugsnag/android/ErrorType;", "sessionApiHeaders", "apiKey", "bugsnag-android-core_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DeliveryHeadersKt {
    public static final String HEADER_API_KEY = "Bugsnag-Api-Key";
    private static final String HEADER_API_PAYLOAD_VERSION = "Bugsnag-Payload-Version";
    public static final String HEADER_BUGSNAG_INTEGRITY = "Bugsnag-Integrity";
    private static final String HEADER_BUGSNAG_SENT_AT = "Bugsnag-Sent-At";
    private static final String HEADER_BUGSNAG_STACKTRACE_TYPES = "Bugsnag-Stacktrace-Types";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_INTERNAL_ERROR = "Bugsnag-Internal-Error";

    public static final String computeSha1Digest(byte[] payload) {
        BufferedOutputStream bufferedOutputStream;
        i.h(payload, "payload");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            StringBuilder sb2 = new StringBuilder("sha1 ");
            DigestOutputStream digestOutputStream = new DigestOutputStream(new NullOutputStream(), messageDigest);
            if (digestOutputStream instanceof BufferedOutputStream) {
                bufferedOutputStream = (BufferedOutputStream) digestOutputStream;
            } else {
                bufferedOutputStream = new BufferedOutputStream(digestOutputStream, 8192);
            }
            bufferedOutputStream.write(payload);
            k kVar = k.f19476a;
            a.z(bufferedOutputStream, null);
            byte[] digest = messageDigest.digest();
            i.c(digest, "shaDigest.digest()");
            int length = digest.length;
            for (int i6 = 0; i6 < length; i6++) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i6])}, 1));
                i.f(format, "java.lang.String.format(format, *args)");
                sb2.append(format);
            }
            k kVar2 = k.f19476a;
            a.z(digestOutputStream, null);
            return sb2.toString();
        } catch (Throwable th2) {
            g.a(b.j(th2)).getClass();
            return null;
        }
    }

    public static final Map<String, String> errorApiHeaders(EventPayload payload) {
        i.h(payload, "payload");
        f[] fVarArr = new f[4];
        fVarArr[0] = new f(HEADER_API_PAYLOAD_VERSION, "4.0");
        String apiKey = payload.getApiKey();
        if (apiKey == null) {
            apiKey = "";
        }
        fVarArr[1] = new f(HEADER_API_KEY, apiKey);
        fVarArr[2] = new f(HEADER_BUGSNAG_SENT_AT, DateUtils.toIso8601(new Date()));
        fVarArr[3] = new f(HEADER_CONTENT_TYPE, "application/json");
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.P(4));
        e0.v0(linkedHashMap, fVarArr);
        Set<ErrorType> errorTypes$bugsnag_android_core_release = payload.getErrorTypes$bugsnag_android_core_release();
        if (!errorTypes$bugsnag_android_core_release.isEmpty()) {
            linkedHashMap.put(HEADER_BUGSNAG_STACKTRACE_TYPES, serializeErrorTypeHeader(errorTypes$bugsnag_android_core_release));
        }
        return e0.x0(linkedHashMap);
    }

    public static final String serializeErrorTypeHeader(Set<? extends ErrorType> errorTypes) {
        i.h(errorTypes, "errorTypes");
        if (errorTypes.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(is.i.H1(errorTypes, 10));
        for (ErrorType errorType : errorTypes) {
            arrayList.add(errorType.getDesc$bugsnag_android_core_release());
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            String str = it.next();
            while (it.hasNext()) {
                str = ((String) str) + ',' + ((String) it.next());
            }
            return (String) str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final Map<String, String> sessionApiHeaders(String apiKey) {
        i.h(apiKey, "apiKey");
        return e0.u0(new f(HEADER_API_PAYLOAD_VERSION, BuildConfig.VERSION_NAME), new f(HEADER_API_KEY, apiKey), new f(HEADER_CONTENT_TYPE, "application/json"), new f(HEADER_BUGSNAG_SENT_AT, DateUtils.toIso8601(new Date())));
    }
}
