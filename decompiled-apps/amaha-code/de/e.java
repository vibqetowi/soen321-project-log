package de;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes.dex */
public final class e implements ae.d {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final ae.b f12819g = new ae.b("key", defpackage.d.i(defpackage.c.x(d.class, new a(1))));

    /* renamed from: h  reason: collision with root package name */
    public static final ae.b f12820h = new ae.b("value", defpackage.d.i(defpackage.c.x(d.class, new a(2))));

    /* renamed from: i  reason: collision with root package name */
    public static final ce.a f12821i = new ce.a(1);

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f12822a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ae.c<?>> f12823b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, ae.e<?>> f12824c;

    /* renamed from: d  reason: collision with root package name */
    public final ae.c<Object> f12825d;

    /* renamed from: e  reason: collision with root package name */
    public final g f12826e = new g(this);

    public e(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, ae.c cVar) {
        this.f12822a = byteArrayOutputStream;
        this.f12823b = map;
        this.f12824c = map2;
        this.f12825d = cVar;
    }

    public static int h(ae.b bVar) {
        d dVar = (d) ((Annotation) bVar.f528b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f12815a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // ae.d
    public final ae.d a(ae.b bVar, boolean z10) {
        d(bVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // ae.d
    public final ae.d b(ae.b bVar, Object obj) {
        c(bVar, obj, true);
        return this;
    }

    public final e c(ae.b bVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            i((h(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.f12822a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                c(bVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                g(f12821i, bVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                i((h(bVar) << 3) | 1);
                this.f12822a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                i((h(bVar) << 3) | 5);
                this.f12822a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z10 || longValue != 0) {
                d dVar = (d) ((Annotation) bVar.f528b.get(d.class));
                if (dVar != null) {
                    i(((a) dVar).f12815a << 3);
                    j(longValue);
                } else {
                    throw new EncodingException("Field has no @Protobuf config");
                }
            }
            return this;
        } else if (obj instanceof Boolean) {
            d(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            i((h(bVar) << 3) | 2);
            i(bArr.length);
            this.f12822a.write(bArr);
            return this;
        } else {
            ae.c<?> cVar = this.f12823b.get(obj.getClass());
            if (cVar != null) {
                g(cVar, bVar, obj, z10);
                return this;
            }
            ae.e<?> eVar = this.f12824c.get(obj.getClass());
            if (eVar != null) {
                g gVar = this.f12826e;
                gVar.f12831a = false;
                gVar.f12833c = bVar;
                gVar.f12832b = z10;
                eVar.a(obj, gVar);
                return this;
            } else if (obj instanceof c) {
                d(bVar, ((c) obj).e(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                g(this.f12825d, bVar, obj, z10);
                return this;
            }
        }
    }

    public final void d(ae.b bVar, int i6, boolean z10) {
        if (z10 && i6 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) bVar.f528b.get(d.class));
        if (dVar != null) {
            i(((a) dVar).f12815a << 3);
            i(i6);
            return;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // ae.d
    public final ae.d e(ae.b bVar, int i6) {
        d(bVar, i6, true);
        return this;
    }

    @Override // ae.d
    public final ae.d f(ae.b bVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) ((Annotation) bVar.f528b.get(d.class));
            if (dVar != null) {
                i(((a) dVar).f12815a << 3);
                j(j10);
            } else {
                throw new EncodingException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final void g(ae.c cVar, ae.b bVar, Object obj, boolean z10) {
        b bVar2 = new b();
        try {
            OutputStream outputStream = this.f12822a;
            this.f12822a = bVar2;
            cVar.a(obj, this);
            this.f12822a = outputStream;
            long j10 = bVar2.f12816u;
            bVar2.close();
            if (z10 && j10 == 0) {
                return;
            }
            i((h(bVar) << 3) | 2);
            j(j10);
            cVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                bVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i6) {
        while ((i6 & (-128)) != 0) {
            this.f12822a.write((i6 & 127) | 128);
            i6 >>>= 7;
        }
        this.f12822a.write(i6 & 127);
    }

    public final void j(long j10) {
        while (((-128) & j10) != 0) {
            this.f12822a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f12822a.write(((int) j10) & 127);
    }
}
