package uf;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class b implements l<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Type f34051u;

    public b(Type type) {
        this.f34051u = type;
    }

    @Override // uf.l
    public final Object i() {
        Type type = this.f34051u;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }
}
