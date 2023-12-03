package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;
/* loaded from: classes.dex */
public class JsonStream extends JsonWriter {
    private final ObjectJsonStreamer objectJsonStreamer;
    private final Writer out;

    /* loaded from: classes.dex */
    public interface Streamable {
        void toStream(JsonStream jsonStream);
    }

    public JsonStream(Writer writer) {
        super(writer);
        setSerializeNulls(false);
        this.out = writer;
        this.objectJsonStreamer = new ObjectJsonStreamer();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter beginArray() {
        return super.beginArray();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter beginObject() {
        return super.beginObject();
    }

    @Override // com.bugsnag.android.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter endArray() {
        return super.endArray();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter endObject() {
        return super.endObject();
    }

    @Override // com.bugsnag.android.JsonWriter, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() {
        super.flush();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ boolean isLenient() {
        return super.isLenient();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter jsonValue(String str) {
        return super.jsonValue(str);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter nullValue() {
        return super.nullValue();
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(double d10) {
        return super.value(d10);
    }

    @Override // com.bugsnag.android.JsonWriter
    public JsonStream name(String str) {
        super.name(str);
        return this;
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(long j10) {
        return super.value(j10);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(Boolean bool) {
        return super.value(bool);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(Number number) {
        return super.value(number);
    }

    public JsonStream(JsonStream jsonStream, ObjectJsonStreamer objectJsonStreamer) {
        super(jsonStream.out);
        setSerializeNulls(jsonStream.getSerializeNulls());
        this.out = jsonStream.out;
        this.objectJsonStreamer = objectJsonStreamer;
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(String str) {
        return super.value(str);
    }

    @Override // com.bugsnag.android.JsonWriter
    public /* bridge */ /* synthetic */ JsonWriter value(boolean z10) {
        return super.value(z10);
    }

    public void value(Object obj, boolean z10) {
        if (obj instanceof Streamable) {
            ((Streamable) obj).toStream(this);
        } else {
            this.objectJsonStreamer.objectToStream(obj, this, z10);
        }
    }

    public void value(Object obj) {
        value(obj, false);
    }

    public void value(File file) {
        Throwable th2;
        BufferedReader bufferedReader;
        if (file == null || file.length() <= 0) {
            return;
        }
        super.flush();
        beforeValue();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                IOUtils.copy(bufferedReader, this.out);
                IOUtils.closeQuietly(bufferedReader);
                this.out.flush();
            } catch (Throwable th3) {
                th2 = th3;
                IOUtils.closeQuietly(bufferedReader);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bufferedReader = null;
        }
    }
}
