package com.bugsnag.android.ndk;

import ca.a;
import com.bugsnag.android.JsonStream;
import hs.k;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: OpaqueValue.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "Companion", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class OpaqueValue {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_NDK_STRING_LENGTH = 64;
    private static final int US_ASCII_MAX_CODEPOINT = 127;
    private final String json;

    /* compiled from: OpaqueValue.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue$Companion;", "", "()V", "MAX_NDK_STRING_LENGTH", "", "US_ASCII_MAX_CODEPOINT", "encode", "", "value", "isStringNDKSupported", "", "makeSafe", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        private final String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                new JsonStream(stringWriter).value(obj, true);
                k kVar = k.f19476a;
                a.z(stringWriter, null);
                String stringWriter2 = stringWriter.toString();
                i.c(stringWriter2, "writer.toString()");
                return stringWriter2;
            } finally {
            }
        }

        private final boolean isStringNDKSupported(String str) {
            boolean z10;
            boolean z11;
            if (str.length() >= 64) {
                return false;
            }
            int i6 = 0;
            while (true) {
                if (i6 < str.length()) {
                    if (str.charAt(i6) <= OpaqueValue.US_ASCII_MAX_CODEPOINT) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z10 = false;
                        break;
                    }
                    i6++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return true;
            }
            byte[] bytes = str.getBytes(gv.a.f16927b);
            i.f(bytes, "(this as java.lang.String).getBytes(charset)");
            if (bytes.length >= 64) {
                return false;
            }
            return true;
        }

        public final Object makeSafe(Object obj) {
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                boolean z10 = obj instanceof String;
                if (!z10 || !isStringNDKSupported((String) obj)) {
                    if (!z10 && !(obj instanceof Map) && !(obj instanceof Collection)) {
                        return null;
                    }
                    return new OpaqueValue(encode(obj));
                }
                return obj;
            }
            return obj;
        }
    }

    public OpaqueValue(String json) {
        i.h(json, "json");
        this.json = json;
    }

    public final String getJson() {
        return this.json;
    }
}
