package vf;

import com.google.gson.reflect.TypeToken;
import sf.v;
import sf.w;
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class e implements w {

    /* renamed from: u  reason: collision with root package name */
    public final uf.e f35003u;

    public e(uf.e eVar) {
        this.f35003u = eVar;
    }

    public static v b(uf.e eVar, sf.i iVar, TypeToken typeToken, tf.a aVar) {
        sf.q qVar;
        v oVar;
        Object i6 = eVar.a(TypeToken.get((Class) aVar.value())).i();
        if (i6 instanceof v) {
            oVar = (v) i6;
        } else if (i6 instanceof w) {
            oVar = ((w) i6).a(iVar, typeToken);
        } else {
            boolean z10 = i6 instanceof sf.q;
            if (!z10 && !(i6 instanceof sf.l)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + i6.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            sf.l lVar = null;
            if (z10) {
                qVar = (sf.q) i6;
            } else {
                qVar = null;
            }
            if (i6 instanceof sf.l) {
                lVar = (sf.l) i6;
            }
            oVar = new o(qVar, lVar, iVar, typeToken);
        }
        if (oVar != null && aVar.nullSafe()) {
            return new sf.u(oVar);
        }
        return oVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        tf.a aVar = (tf.a) typeToken.getRawType().getAnnotation(tf.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f35003u, iVar, typeToken, aVar);
    }
}
