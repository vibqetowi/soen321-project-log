package com.bugsnag.android.internal;

import ca.a;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.repackaged.dslplatform.json.DslJson;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import gv.n;
import hs.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.FileSystemException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i;
/* compiled from: JsonHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0010J\u001e\u0010\u000f\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00020\u00010\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015Rn\u0010\u0018\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001 \u0017*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\r \u0017**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001 \u0017*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\r\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR:\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001 \u0017*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r0\r0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/bugsnag/android/internal/JsonHelper;", "", "Lcom/bugsnag/android/JsonStream$Streamable;", "streamable", "", "serialize", "value", "Ljava/io/OutputStream;", "stream", "Lhs/k;", "Ljava/io/File;", "file", "bytes", "", "", "deserialize", "Ljava/io/InputStream;", "", "ulongToHex", "(Ljava/lang/Long;)Ljava/lang/String;", "jsonToLong", "(Ljava/lang/Object;)Ljava/lang/Long;", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson$Settings;", "kotlin.jvm.PlatformType", "settings", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson$Settings;", "getSettings$annotations", "()V", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson;", "dslJson", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson;", "<init>", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class JsonHelper {
    public static final JsonHelper INSTANCE = new JsonHelper();
    private static final DslJson<Map<String, Object>> dslJson;
    private static final DslJson.Settings<Map<String, Object>> settings;

    /* compiled from: JsonHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/bugsnag/android/repackaged/dslplatform/json/JsonWriter;", "writer", "Ljava/util/Date;", "value", "Lhs/k;", "write", "(Lcom/bugsnag/android/repackaged/dslplatform/json/JsonWriter;Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.internal.JsonHelper$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements JsonWriter.WriteObject<Date> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public final void write(JsonWriter writer, Date date) {
            i.h(writer, "writer");
            if (date != null) {
                writer.writeString(DateUtils.toIso8601(date));
            }
        }
    }

    static {
        DslJson.Settings<Map<String, Object>> fallbackTo = new DslJson.Settings().fallbackTo(new FallbackWriter());
        settings = fallbackTo;
        DslJson<Map<String, Object>> dslJson2 = new DslJson<>(fallbackTo);
        dslJson = dslJson2;
        dslJson2.registerWriter(Date.class, (JsonWriter.WriteObject) AnonymousClass1.INSTANCE);
    }

    private JsonHelper() {
    }

    public final Map<String, Object> deserialize(byte[] bytes) {
        i.h(bytes, "bytes");
        Map map = (Map) dslJson.deserialize((Class<Object>) Map.class, bytes, bytes.length);
        if (map != null) {
            return c0.c(map);
        }
        throw new IllegalArgumentException("JSON document is invalid".toString());
    }

    public final Long jsonToLong(Object obj) {
        long longValue;
        if (obj != null) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() != 0) {
                    try {
                        return Long.decode((String) obj);
                    } catch (NumberFormatException e10) {
                        if (n.H0(str, "0x")) {
                            if (str.length() == 18) {
                                int length = str.length() - 2;
                                String substring = str.substring(0, length);
                                i.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                String substring2 = str.substring(length, str.length());
                                i.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                a.x(16);
                                longValue = Long.parseLong(substring2, 16) | (Long.decode(substring).longValue() << 8);
                            } else {
                                throw e10;
                            }
                        } else if (str.length() >= 19) {
                            int length2 = str.length() - 3;
                            String substring3 = str.substring(0, length2);
                            i.f(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            long longValue2 = Long.decode(substring3).longValue() * 1000;
                            String substring4 = str.substring(length2, str.length());
                            i.f(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            Long decode = Long.decode(substring4);
                            i.c(decode, "java.lang.Long.decode(va…eadLength, value.length))");
                            longValue = decode.longValue() + longValue2;
                        } else {
                            throw e10;
                        }
                        return Long.valueOf(longValue);
                    }
                }
            } else {
                throw new IllegalArgumentException("Cannot convert " + obj + " to long");
            }
        }
        return null;
    }

    public final byte[] serialize(JsonStream.Streamable streamable) {
        i.h(streamable, "streamable");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            JsonStream jsonStream = new JsonStream(new PrintWriter(byteArrayOutputStream));
            streamable.toStream(jsonStream);
            k kVar = k.f19476a;
            a.z(jsonStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a.z(byteArrayOutputStream, null);
            i.c(byteArray, "ByteArrayOutputStream().…s.toByteArray()\n        }");
            return byteArray;
        } finally {
        }
    }

    public final String ulongToHex(Long l2) {
        if (l2 == null) {
            return null;
        }
        if (l2.longValue() >= 0) {
            return b.o(new Object[]{l2}, 1, "0x%x", "java.lang.String.format(this, *args)");
        }
        return b.o(new Object[]{Long.valueOf(l2.longValue() >>> 8), Long.valueOf(l2.longValue() & 255)}, 2, "0x%x%02x", "java.lang.String.format(this, *args)");
    }

    public final Map<? super String, ? extends Object> deserialize(InputStream stream) {
        i.h(stream, "stream");
        Map map = (Map) dslJson.deserialize((Class<Object>) Map.class, stream);
        if (map != null) {
            return c0.c(map);
        }
        throw new IllegalArgumentException("JSON document is invalid".toString());
    }

    public final byte[] serialize(Object value) {
        i.h(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            INSTANCE.serialize(value, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a.z(byteArrayOutputStream, null);
            i.c(byteArray, "ByteArrayOutputStream().…s.toByteArray()\n        }");
            return byteArray;
        } finally {
        }
    }

    public final Map<? super String, ? extends Object> deserialize(File file) {
        i.h(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Map<? super String, ? extends Object> deserialize = INSTANCE.deserialize(fileInputStream);
                a.z(fileInputStream, null);
                return deserialize;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IOException("Could not deserialize from " + file, e11);
        }
    }

    public final void serialize(Object value, OutputStream stream) {
        i.h(value, "value");
        i.h(stream, "stream");
        dslJson.serialize(value, stream);
    }

    public final void serialize(Object value, File file) {
        i.h(value, "value");
        i.h(file, "file");
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new FileSystemException(file);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            dslJson.serialize(value, fileOutputStream);
            k kVar = k.f19476a;
            a.z(fileOutputStream, null);
        } catch (IOException e10) {
            throw new IOException("Could not serialize JSON document to " + file, e10);
        }
    }

    private static /* synthetic */ void getSettings$annotations() {
    }
}
