package com.bugsnag.android.internal;

import com.bugsnag.android.repackaged.dslplatform.json.DslJson;
import gv.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: FallbackWriter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J6\u0010\u0011\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J.\u0010\u0011\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0016R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/internal/FallbackWriter;", "Lcom/bugsnag/android/repackaged/dslplatform/json/DslJson$Fallback;", "", "", "", "instance", "Ljava/io/OutputStream;", "stream", "Lhs/k;", "serialize", "context", "Ljava/lang/reflect/Type;", "manifest", "", "body", "", "size", "deserialize", "Ljava/io/InputStream;", "placeholder", "[B", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class FallbackWriter implements DslJson.Fallback<Map<String, Object>> {
    private final byte[] placeholder;

    public FallbackWriter() {
        byte[] bytes = "\"[OBJECT]\"".getBytes(a.f16927b);
        i.f(bytes, "(this as java.lang.String).getBytes(charset)");
        this.placeholder = bytes;
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    public void serialize(Object obj, OutputStream stream) {
        i.h(stream, "stream");
        stream.write(this.placeholder);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    public Object deserialize(Map<String, Object> map, Type manifest, byte[] body, int i6) {
        i.h(manifest, "manifest");
        i.h(body, "body");
        throw new UnsupportedOperationException();
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.DslJson.Fallback
    public Object deserialize(Map<String, Object> map, Type manifest, InputStream stream) {
        i.h(manifest, "manifest");
        i.h(stream, "stream");
        throw new UnsupportedOperationException();
    }
}
