package de;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProtobufEncoder.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ae.c<?>> f12827a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ae.e<?>> f12828b;

    /* renamed from: c  reason: collision with root package name */
    public final ae.c<Object> f12829c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes.dex */
    public static final class a implements be.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final ce.a f12830a = new ce.a(2);
    }

    public f(HashMap hashMap, HashMap hashMap2, ce.a aVar) {
        this.f12827a = hashMap;
        this.f12828b = hashMap2;
        this.f12829c = aVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, ae.c<?>> map = this.f12827a;
        e eVar = new e(byteArrayOutputStream, map, this.f12828b, this.f12829c);
        if (obj != null) {
            ae.c<?> cVar = map.get(obj.getClass());
            if (cVar != null) {
                cVar.a(obj, eVar);
                return;
            }
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
