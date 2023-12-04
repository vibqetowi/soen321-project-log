package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
/* loaded from: classes7.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public void enablePrettyPrint() throws IOException {
    }

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public abstract JsonFactory getFactory();

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public abstract void writeNumber(double d) throws IOException;

    public abstract void writeNumber(float f) throws IOException;

    public abstract void writeNumber(int i) throws IOException;

    public abstract void writeNumber(long j) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public abstract void writeStartObject() throws IOException;

    public abstract void writeString(String str) throws IOException;

    public final void serialize(Object obj) throws IOException {
        serialize(false, obj);
    }

    private void serialize(boolean z, Object obj) throws IOException {
        boolean z2;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (Data.isNull(obj)) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            boolean z3 = true;
            if (obj instanceof Number) {
                if (z) {
                    writeString(obj.toString());
                } else if (obj instanceof BigDecimal) {
                    writeNumber((BigDecimal) obj);
                } else if (obj instanceof BigInteger) {
                    writeNumber((BigInteger) obj);
                } else if (obj instanceof Long) {
                    writeNumber(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    float floatValue = ((Number) obj).floatValue();
                    Preconditions.checkArgument((Float.isInfinite(floatValue) || Float.isNaN(floatValue)) ? false : false);
                    writeNumber(floatValue);
                } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    writeNumber(((Number) obj).intValue());
                } else {
                    double doubleValue = ((Number) obj).doubleValue();
                    Preconditions.checkArgument((Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) ? false : false);
                    writeNumber(doubleValue);
                }
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof DateTime) {
                writeString(((DateTime) obj).toStringRfc3339());
            } else if (((obj instanceof Iterable) || cls.isArray()) && !(obj instanceof Map) && !(obj instanceof GenericData)) {
                writeStartArray();
                for (Object obj2 : Types.iterableOf(obj)) {
                    serialize(z, obj2);
                }
                writeEndArray();
            } else if (cls.isEnum()) {
                String name = FieldInfo.of((Enum) obj).getName();
                if (name == null) {
                    writeNull();
                } else {
                    writeString(name);
                }
            } else {
                writeStartObject();
                boolean z4 = (obj instanceof Map) && !(obj instanceof GenericData);
                ClassInfo of = z4 ? null : ClassInfo.of(cls);
                for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String key = entry.getKey();
                        if (z4) {
                            z2 = z;
                        } else {
                            Field field = of.getField(key);
                            z2 = (field == null || field.getAnnotation(JsonString.class) == null) ? false : true;
                        }
                        writeFieldName(key);
                        serialize(z2, value);
                    }
                }
                writeEndObject();
            }
        }
    }
}
