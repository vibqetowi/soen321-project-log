package st;

import gt.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;
import ss.l;
import tt.z;
import wt.x;
import wt.y;
/* compiled from: resolvers.kt */
/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final q.f f31966a;

    /* renamed from: b  reason: collision with root package name */
    public final gt.j f31967b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31968c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f31969d;

    /* renamed from: e  reason: collision with root package name */
    public final vu.h<x, z> f31970e;

    /* compiled from: resolvers.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<x, z> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final z invoke(x xVar) {
            x typeParameter = xVar;
            kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
            g gVar = g.this;
            Integer num = (Integer) gVar.f31969d.get(typeParameter);
            if (num != null) {
                int intValue = num.intValue();
                q.f fVar = gVar.f31966a;
                kotlin.jvm.internal.i.g(fVar, "<this>");
                q.f fVar2 = new q.f((c) fVar.f29104v, gVar, (hs.d) fVar.f29106x);
                gt.j jVar = gVar.f31967b;
                return new z(b.b(fVar2, jVar.getAnnotations()), typeParameter, gVar.f31968c + intValue, jVar);
            }
            return null;
        }
    }

    public g(q.f c10, gt.j containingDeclaration, y typeParameterOwner, int i6) {
        kotlin.jvm.internal.i.g(c10, "c");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(typeParameterOwner, "typeParameterOwner");
        this.f31966a = c10;
        this.f31967b = containingDeclaration;
        this.f31968c = i6;
        ArrayList<Object> typeParameters = typeParameterOwner.getTypeParameters();
        kotlin.jvm.internal.i.g(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object obj : typeParameters) {
            linkedHashMap.put(obj, Integer.valueOf(i10));
            i10++;
        }
        this.f31969d = linkedHashMap;
        this.f31970e = this.f31966a.b().b(new a());
    }

    @Override // st.j
    public final v0 a(x javaTypeParameter) {
        kotlin.jvm.internal.i.g(javaTypeParameter, "javaTypeParameter");
        z invoke = this.f31970e.invoke(javaTypeParameter);
        if (invoke == null) {
            return ((j) this.f31966a.f29105w).a(javaTypeParameter);
        }
        return invoke;
    }
}
