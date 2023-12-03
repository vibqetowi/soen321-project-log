package uf;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class g implements l<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Type f34061u;

    public g(Type type) {
        this.f34061u = type;
    }

    @Override // uf.l
    public final Object i() {
        Type type = this.f34061u;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }
}
