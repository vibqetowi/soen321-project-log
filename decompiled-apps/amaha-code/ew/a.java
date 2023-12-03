package ew;

import com.google.gson.reflect.TypeToken;
import dw.a0;
import dw.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lv.e0;
import nd.z;
import sf.i;
/* compiled from: GsonConverterFactory.java */
/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final i f14586a;

    public a(i iVar) {
        this.f14586a = iVar;
    }

    @Override // dw.f.a
    public final f a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        i iVar = this.f14586a;
        return new b(iVar, iVar.d(typeToken));
    }

    @Override // dw.f.a
    public final f<e0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        i iVar = this.f14586a;
        return new z(iVar, 21, iVar.d(typeToken));
    }
}
