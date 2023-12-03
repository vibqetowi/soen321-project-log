package nt;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class i extends f implements wt.e {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f26809b;

    public i(fu.e eVar, Object[] objArr) {
        super(eVar);
        this.f26809b = objArr;
    }

    @Override // wt.e
    public final ArrayList getElements() {
        wt.b zVar;
        Object[] objArr = this.f26809b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.i.d(obj);
            Class<?> cls = obj.getClass();
            List<ys.d<? extends Object>> list = d.f26795a;
            if (Enum.class.isAssignableFrom(cls)) {
                zVar = new x(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                zVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                zVar = new i(null, (Object[]) obj);
            } else if (obj instanceof Class) {
                zVar = new t(null, (Class) obj);
            } else {
                zVar = new z(obj, null);
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }
}
