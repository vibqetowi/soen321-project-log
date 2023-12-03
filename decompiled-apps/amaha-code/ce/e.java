package ce;

import ae.f;
import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes.dex */
public final class e implements ae.d, f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5254a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f5255b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, ae.c<?>> f5256c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, ae.e<?>> f5257d;

    /* renamed from: e  reason: collision with root package name */
    public final ae.c<Object> f5258e;
    public final boolean f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f5255b = new JsonWriter(writer);
        this.f5256c = hashMap;
        this.f5257d = hashMap2;
        this.f5258e = aVar;
        this.f = z10;
    }

    @Override // ae.d
    public final ae.d a(ae.b bVar, boolean z10) {
        String str = bVar.f527a;
        i();
        JsonWriter jsonWriter = this.f5255b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z10);
        return this;
    }

    @Override // ae.d
    public final ae.d b(ae.b bVar, Object obj) {
        return h(obj, bVar.f527a);
    }

    @Override // ae.f
    public final f c(String str) {
        i();
        this.f5255b.value(str);
        return this;
    }

    @Override // ae.f
    public final f d(boolean z10) {
        i();
        this.f5255b.value(z10);
        return this;
    }

    @Override // ae.d
    public final ae.d e(ae.b bVar, int i6) {
        String str = bVar.f527a;
        i();
        JsonWriter jsonWriter = this.f5255b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i6);
        return this;
    }

    @Override // ae.d
    public final ae.d f(ae.b bVar, long j10) {
        String str = bVar.f527a;
        i();
        JsonWriter jsonWriter = this.f5255b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j10);
        return this;
    }

    public final e g(Object obj) {
        JsonWriter jsonWriter = this.f5255b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else {
            int i6 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    i();
                    jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                jsonWriter.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i6 < length) {
                        jsonWriter.value(iArr[i6]);
                        i6++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i6 < length2) {
                        long j10 = jArr[i6];
                        i();
                        jsonWriter.value(j10);
                        i6++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i6 < length3) {
                        jsonWriter.value(dArr[i6]);
                        i6++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i6 < length4) {
                        jsonWriter.value(zArr[i6]);
                        i6++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i6 < length5) {
                        g(numberArr[i6]);
                        i6++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i6 < length6) {
                        g(objArr[i6]);
                        i6++;
                    }
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object obj2 : (Collection) obj) {
                    g(obj2);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                ae.c<?> cVar = this.f5256c.get(obj.getClass());
                if (cVar != null) {
                    jsonWriter.beginObject();
                    cVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                ae.e<?> eVar = this.f5257d.get(obj.getClass());
                if (eVar != null) {
                    eVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    i();
                    jsonWriter.value(name);
                    return this;
                } else {
                    jsonWriter.beginObject();
                    this.f5258e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
            }
        }
    }

    public final e h(Object obj, String str) {
        boolean z10 = this.f;
        JsonWriter jsonWriter = this.f5255b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            return g(obj);
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return g(obj);
    }

    public final void i() {
        if (this.f5254a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
