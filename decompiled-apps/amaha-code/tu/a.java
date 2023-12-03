package tu;

import au.a;
import au.f;
import au.h;
import au.k;
import au.m;
import au.p;
import au.r;
import au.t;
import gu.e;
import gu.g;
import gv.n;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: BuiltInSerializerProtocol.kt */
/* loaded from: classes2.dex */
public final class a extends ru.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f33700m = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        super(r1, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
        e eVar = new e();
        bu.b.a(eVar);
        g.e<k, Integer> packageFqName = bu.b.f4708a;
        i.f(packageFqName, "packageFqName");
        g.e<au.c, List<au.a>> constructorAnnotation = bu.b.f4710c;
        i.f(constructorAnnotation, "constructorAnnotation");
        g.e<au.b, List<au.a>> classAnnotation = bu.b.f4709b;
        i.f(classAnnotation, "classAnnotation");
        g.e<h, List<au.a>> functionAnnotation = bu.b.f4711d;
        i.f(functionAnnotation, "functionAnnotation");
        g.e<m, List<au.a>> propertyAnnotation = bu.b.f4712e;
        i.f(propertyAnnotation, "propertyAnnotation");
        g.e<m, List<au.a>> propertyGetterAnnotation = bu.b.f;
        i.f(propertyGetterAnnotation, "propertyGetterAnnotation");
        g.e<m, List<au.a>> propertySetterAnnotation = bu.b.f4713g;
        i.f(propertySetterAnnotation, "propertySetterAnnotation");
        g.e<f, List<au.a>> enumEntryAnnotation = bu.b.f4715i;
        i.f(enumEntryAnnotation, "enumEntryAnnotation");
        g.e<m, a.b.c> compileTimeValue = bu.b.f4714h;
        i.f(compileTimeValue, "compileTimeValue");
        g.e<t, List<au.a>> parameterAnnotation = bu.b.f4716j;
        i.f(parameterAnnotation, "parameterAnnotation");
        g.e<p, List<au.a>> typeAnnotation = bu.b.f4717k;
        i.f(typeAnnotation, "typeAnnotation");
        g.e<r, List<au.a>> typeParameterAnnotation = bu.b.f4718l;
        i.f(typeParameterAnnotation, "typeParameterAnnotation");
    }

    public static String a(fu.c fqName) {
        String f;
        i.g(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.E0(fqName.b(), '.', '/'));
        sb2.append('/');
        if (fqName.d()) {
            f = "default-package";
        } else {
            f = fqName.f().f();
            i.f(f, "fqName.shortName().asString()");
        }
        sb2.append(f.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
