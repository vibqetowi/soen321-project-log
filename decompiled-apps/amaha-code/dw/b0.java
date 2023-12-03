package dw;

import dw.e0;
import dw.i;
import dw.v;
import dw.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import lv.e;
import lv.s;
import lv.v;
import lv.w;
/* compiled from: ServiceMethod.java */
/* loaded from: classes2.dex */
public abstract class b0<T> {
    /* JADX WARN: Removed duplicated region for block: B:389:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x08e9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i b(a0 a0Var, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z10;
        Type[] genericParameterTypes;
        boolean z11;
        y.a aVar;
        Annotation[][] annotationArr;
        int i6;
        int i10;
        String str;
        v<?>[] vVarArr;
        boolean z12;
        v<?> vVar;
        y.a aVar2;
        String str2;
        v<?>[] vVarArr2;
        boolean z13;
        int i11;
        y.a aVar3;
        v.m mVar;
        v<?> oVar;
        v<?> uVar;
        v<?> uVar2;
        v<?> uVar3;
        v<?> lVar;
        String str3;
        y.a aVar4 = new y.a(a0Var, method);
        Annotation[] annotationArr2 = aVar4.f13676c;
        int length = annotationArr2.length;
        int i12 = 0;
        loop0: while (true) {
            String str4 = "HEAD";
            method2 = aVar4.f13675b;
            if (i12 < length) {
                Annotation annotation = annotationArr2[i12];
                if (annotation instanceof fw.b) {
                    aVar4.b("DELETE", ((fw.b) annotation).value(), false);
                } else if (annotation instanceof fw.f) {
                    aVar4.b("GET", ((fw.f) annotation).value(), false);
                } else if (annotation instanceof fw.g) {
                    aVar4.b("HEAD", ((fw.g) annotation).value(), false);
                } else if (annotation instanceof fw.n) {
                    aVar4.b("PATCH", ((fw.n) annotation).value(), true);
                } else if (annotation instanceof fw.o) {
                    aVar4.b("POST", ((fw.o) annotation).value(), true);
                } else if (annotation instanceof fw.p) {
                    aVar4.b("PUT", ((fw.p) annotation).value(), true);
                } else if (annotation instanceof fw.m) {
                    aVar4.b("OPTIONS", ((fw.m) annotation).value(), false);
                } else if (annotation instanceof fw.h) {
                    fw.h hVar = (fw.h) annotation;
                    aVar4.b(hVar.method(), hVar.path(), hVar.hasBody());
                } else if (annotation instanceof fw.k) {
                    String[] value = ((fw.k) annotation).value();
                    if (value.length != 0) {
                        s.a aVar5 = new s.a();
                        int length2 = value.length;
                        for (int i13 = 0; i13 < length2; i13++) {
                            str3 = value[i13];
                            int indexOf = str3.indexOf(58);
                            if (indexOf == -1 || indexOf == 0 || indexOf == str3.length() - 1) {
                                break loop0;
                            }
                            String substring = str3.substring(0, indexOf);
                            String trim = str3.substring(indexOf + 1).trim();
                            if ("Content-Type".equalsIgnoreCase(substring)) {
                                try {
                                    Pattern pattern = lv.v.f24702d;
                                    aVar4.f13691t = v.a.a(trim);
                                } catch (IllegalArgumentException e10) {
                                    throw e0.i(method2, e10, "Malformed content type: %s", trim);
                                }
                            } else {
                                aVar5.a(substring, trim);
                            }
                        }
                        aVar4.f13690s = aVar5.d();
                    } else {
                        throw e0.i(method2, null, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof fw.l) {
                    if (!aVar4.f13688p) {
                        aVar4.f13689q = true;
                    } else {
                        throw e0.i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (!(annotation instanceof fw.e)) {
                    continue;
                } else if (!aVar4.f13689q) {
                    aVar4.f13688p = true;
                } else {
                    throw e0.i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                i12++;
            } else if (aVar4.f13686n != null) {
                if (!aVar4.f13687o) {
                    if (!aVar4.f13689q) {
                        if (aVar4.f13688p) {
                            throw e0.i(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw e0.i(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = aVar4.f13677d;
                int length3 = annotationArr3.length;
                aVar4.f13693v = new v[length3];
                int i14 = length3 - 1;
                int i15 = 0;
                y.a aVar6 = aVar4;
                while (i15 < length3) {
                    v<?>[] vVarArr3 = aVar6.f13693v;
                    Type type = aVar6.f13678e[i15];
                    Annotation[] annotationArr4 = annotationArr3[i15];
                    if (i15 == i14) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (annotationArr4 != null) {
                        int length4 = annotationArr4.length;
                        y.a aVar7 = aVar6;
                        vVar = null;
                        annotationArr = annotationArr3;
                        int i16 = 0;
                        while (i16 < length4) {
                            int i17 = length3;
                            Annotation annotation2 = annotationArr4[i16];
                            int i18 = i14;
                            int i19 = length4;
                            if (annotation2 instanceof fw.y) {
                                aVar6.c(i15, type);
                                if (!aVar7.f13685m) {
                                    if (!aVar7.f13681i) {
                                        if (!aVar7.f13682j) {
                                            if (!aVar7.f13683k) {
                                                if (!aVar7.f13684l) {
                                                    if (aVar7.r == null) {
                                                        aVar7.f13685m = true;
                                                        if (type != lv.t.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                                            throw e0.j(method2, i15, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                                        }
                                                        mVar = new v.n(i15, method2);
                                                        str2 = str4;
                                                    } else {
                                                        throw e0.j(method2, i15, "@Url cannot be used with @%s URL", aVar7.f13686n);
                                                    }
                                                } else {
                                                    throw e0.j(method2, i15, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                                }
                                            } else {
                                                throw e0.j(method2, i15, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                            }
                                        } else {
                                            throw e0.j(method2, i15, "A @Url parameter must not come after a @Query.", new Object[0]);
                                        }
                                    } else {
                                        throw e0.j(method2, i15, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                } else {
                                    throw e0.j(method2, i15, "Multiple @Url method annotations found.", new Object[0]);
                                }
                            } else {
                                boolean z14 = annotation2 instanceof fw.s;
                                str2 = str4;
                                a0 a0Var2 = aVar7.f13674a;
                                if (z14) {
                                    aVar6.c(i15, type);
                                    if (!aVar7.f13682j) {
                                        if (!aVar7.f13683k) {
                                            if (!aVar7.f13684l) {
                                                if (!aVar7.f13685m) {
                                                    if (aVar7.r != null) {
                                                        aVar7.f13681i = true;
                                                        fw.s sVar = (fw.s) annotation2;
                                                        String value2 = sVar.value();
                                                        if (y.a.f13673y.matcher(value2).matches()) {
                                                            if (aVar7.f13692u.contains(value2)) {
                                                                a0Var2.f(type, annotationArr4);
                                                                mVar = new v.i(aVar7.f13675b, i15, value2, sVar.encoded());
                                                            } else {
                                                                throw e0.j(method2, i15, "URL \"%s\" does not contain \"{%s}\".", aVar7.r, value2);
                                                            }
                                                        } else {
                                                            throw e0.j(method2, i15, "@Path parameter name must match %s. Found: %s", y.a.f13672x.pattern(), value2);
                                                        }
                                                    } else {
                                                        throw e0.j(method2, i15, "@Path can only be used with relative url on @%s", aVar7.f13686n);
                                                    }
                                                } else {
                                                    throw e0.j(method2, i15, "@Path parameters may not be used with @Url.", new Object[0]);
                                                }
                                            } else {
                                                throw e0.j(method2, i15, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                            }
                                        } else {
                                            throw e0.j(method2, i15, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                        }
                                    } else {
                                        throw e0.j(method2, i15, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                } else {
                                    vVarArr2 = vVarArr3;
                                    if (annotation2 instanceof fw.t) {
                                        aVar6.c(i15, type);
                                        fw.t tVar = (fw.t) annotation2;
                                        String value3 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        Class<?> e11 = e0.e(type);
                                        z13 = z11;
                                        aVar7.f13682j = true;
                                        if (Iterable.class.isAssignableFrom(e11)) {
                                            if (type instanceof ParameterizedType) {
                                                a0Var2.f(e0.d(0, (ParameterizedType) type), annotationArr4);
                                                mVar = new t(new v.j(value3, encoded));
                                            } else {
                                                throw e0.j(method2, i15, e11.getSimpleName() + " must include generic type (e.g., " + e11.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                        } else if (e11.isArray()) {
                                            a0Var2.f(y.a.a(e11.getComponentType()), annotationArr4);
                                            mVar = new u(new v.j(value3, encoded));
                                        } else {
                                            a0Var2.f(type, annotationArr4);
                                            lVar = new v.j<>(value3, encoded);
                                            mVar = lVar;
                                        }
                                        aVar3 = aVar4;
                                        i11 = i16;
                                        if (mVar != null) {
                                            if (vVar == null) {
                                                vVar = mVar;
                                            } else {
                                                throw e0.j(method2, i15, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                            }
                                        }
                                        i16 = i11 + 1;
                                        aVar4 = aVar3;
                                        length3 = i17;
                                        i14 = i18;
                                        length4 = i19;
                                        str4 = str2;
                                        vVarArr3 = vVarArr2;
                                        z11 = z13;
                                    } else {
                                        z13 = z11;
                                        if (annotation2 instanceof fw.v) {
                                            aVar6.c(i15, type);
                                            boolean encoded2 = ((fw.v) annotation2).encoded();
                                            Class<?> e12 = e0.e(type);
                                            aVar7.f13683k = true;
                                            if (Iterable.class.isAssignableFrom(e12)) {
                                                if (type instanceof ParameterizedType) {
                                                    a0Var2.f(e0.d(0, (ParameterizedType) type), annotationArr4);
                                                    mVar = new t(new v.l(encoded2));
                                                } else {
                                                    throw e0.j(method2, i15, e12.getSimpleName() + " must include generic type (e.g., " + e12.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                            } else if (e12.isArray()) {
                                                a0Var2.f(y.a.a(e12.getComponentType()), annotationArr4);
                                                mVar = new u(new v.l(encoded2));
                                            } else {
                                                a0Var2.f(type, annotationArr4);
                                                lVar = new v.l<>(encoded2);
                                                mVar = lVar;
                                            }
                                            aVar3 = aVar4;
                                            i11 = i16;
                                            if (mVar != null) {
                                            }
                                            i16 = i11 + 1;
                                            aVar4 = aVar3;
                                            length3 = i17;
                                            i14 = i18;
                                            length4 = i19;
                                            str4 = str2;
                                            vVarArr3 = vVarArr2;
                                            z11 = z13;
                                        } else {
                                            i11 = i16;
                                            if (annotation2 instanceof fw.u) {
                                                aVar6.c(i15, type);
                                                Class<?> e13 = e0.e(type);
                                                aVar7.f13684l = true;
                                                if (Map.class.isAssignableFrom(e13)) {
                                                    Type f = e0.f(type, e13);
                                                    if (f instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType = (ParameterizedType) f;
                                                        Type d10 = e0.d(0, parameterizedType);
                                                        if (String.class == d10) {
                                                            a0Var2.f(e0.d(1, parameterizedType), annotationArr4);
                                                            uVar2 = new v.k<>(method2, i15, ((fw.u) annotation2).encoded());
                                                        } else {
                                                            throw e0.j(method2, i15, "@QueryMap keys must be of type String: " + d10, new Object[0]);
                                                        }
                                                    } else {
                                                        throw e0.j(method2, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw e0.j(method2, i15, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else {
                                                if (annotation2 instanceof fw.i) {
                                                    aVar6.c(i15, type);
                                                    String value4 = ((fw.i) annotation2).value();
                                                    Class<?> e14 = e0.e(type);
                                                    if (Iterable.class.isAssignableFrom(e14)) {
                                                        if (type instanceof ParameterizedType) {
                                                            a0Var2.f(e0.d(0, (ParameterizedType) type), annotationArr4);
                                                            uVar3 = new t(new v.d(value4));
                                                        } else {
                                                            throw e0.j(method2, i15, e14.getSimpleName() + " must include generic type (e.g., " + e14.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                    } else if (e14.isArray()) {
                                                        a0Var2.f(y.a.a(e14.getComponentType()), annotationArr4);
                                                        uVar3 = new u(new v.d(value4));
                                                    } else {
                                                        a0Var2.f(type, annotationArr4);
                                                        uVar2 = new v.d<>(value4);
                                                    }
                                                    uVar2 = uVar3;
                                                } else if (annotation2 instanceof fw.j) {
                                                    if (type == lv.s.class) {
                                                        uVar2 = new v.f(i15, method2);
                                                    } else {
                                                        aVar6.c(i15, type);
                                                        Class<?> e15 = e0.e(type);
                                                        if (Map.class.isAssignableFrom(e15)) {
                                                            Type f2 = e0.f(type, e15);
                                                            if (f2 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType2 = (ParameterizedType) f2;
                                                                Type d11 = e0.d(0, parameterizedType2);
                                                                if (String.class == d11) {
                                                                    a0Var2.f(e0.d(1, parameterizedType2), annotationArr4);
                                                                    uVar2 = new v.e<>(method2, i15);
                                                                } else {
                                                                    throw e0.j(method2, i15, "@HeaderMap keys must be of type String: " + d11, new Object[0]);
                                                                }
                                                            } else {
                                                                throw e0.j(method2, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw e0.j(method2, i15, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                        }
                                                    }
                                                } else if (annotation2 instanceof fw.c) {
                                                    aVar6.c(i15, type);
                                                    if (aVar7.f13688p) {
                                                        fw.c cVar = (fw.c) annotation2;
                                                        String value5 = cVar.value();
                                                        boolean encoded3 = cVar.encoded();
                                                        aVar7.f = true;
                                                        Class<?> e16 = e0.e(type);
                                                        if (Iterable.class.isAssignableFrom(e16)) {
                                                            if (type instanceof ParameterizedType) {
                                                                a0Var2.f(e0.d(0, (ParameterizedType) type), annotationArr4);
                                                                uVar3 = new t(new v.b(value5, encoded3));
                                                            } else {
                                                                throw e0.j(method2, i15, e16.getSimpleName() + " must include generic type (e.g., " + e16.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                        } else if (e16.isArray()) {
                                                            a0Var2.f(y.a.a(e16.getComponentType()), annotationArr4);
                                                            uVar3 = new u(new v.b(value5, encoded3));
                                                        } else {
                                                            a0Var2.f(type, annotationArr4);
                                                            uVar2 = new v.b<>(value5, encoded3);
                                                        }
                                                        uVar2 = uVar3;
                                                    } else {
                                                        throw e0.j(method2, i15, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof fw.d) {
                                                    aVar6.c(i15, type);
                                                    if (aVar7.f13688p) {
                                                        Class<?> e17 = e0.e(type);
                                                        if (Map.class.isAssignableFrom(e17)) {
                                                            Type f10 = e0.f(type, e17);
                                                            if (f10 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType3 = (ParameterizedType) f10;
                                                                Type d12 = e0.d(0, parameterizedType3);
                                                                if (String.class == d12) {
                                                                    a0Var2.f(e0.d(1, parameterizedType3), annotationArr4);
                                                                    aVar7.f = true;
                                                                    uVar2 = new v.c<>(method2, i15, ((fw.d) annotation2).encoded());
                                                                } else {
                                                                    throw e0.j(method2, i15, "@FieldMap keys must be of type String: " + d12, new Object[0]);
                                                                }
                                                            } else {
                                                                throw e0.j(method2, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw e0.j(method2, i15, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                    } else {
                                                        throw e0.j(method2, i15, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else {
                                                    boolean z15 = annotation2 instanceof fw.q;
                                                    Annotation[] annotationArr5 = aVar7.f13676c;
                                                    if (z15) {
                                                        aVar6.c(i15, type);
                                                        if (aVar7.f13689q) {
                                                            fw.q qVar = (fw.q) annotation2;
                                                            aVar7.f13679g = true;
                                                            String value6 = qVar.value();
                                                            Class<?> e18 = e0.e(type);
                                                            if (value6.isEmpty()) {
                                                                boolean isAssignableFrom = Iterable.class.isAssignableFrom(e18);
                                                                v.m mVar2 = v.m.f13640a;
                                                                if (isAssignableFrom) {
                                                                    if (type instanceof ParameterizedType) {
                                                                        if (w.b.class.isAssignableFrom(e0.e(e0.d(0, (ParameterizedType) type)))) {
                                                                            uVar2 = new t(mVar2);
                                                                        } else {
                                                                            throw e0.j(method2, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw e0.j(method2, i15, e18.getSimpleName() + " must include generic type (e.g., " + e18.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                } else if (e18.isArray()) {
                                                                    if (w.b.class.isAssignableFrom(e18.getComponentType())) {
                                                                        uVar2 = new u(mVar2);
                                                                    } else {
                                                                        throw e0.j(method2, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                } else if (w.b.class.isAssignableFrom(e18)) {
                                                                    mVar = mVar2;
                                                                    aVar3 = aVar4;
                                                                } else {
                                                                    throw e0.j(method2, i15, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                            } else {
                                                                y.a aVar8 = aVar4;
                                                                lv.s c10 = s.b.c("Content-Disposition", defpackage.b.m("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                                if (Iterable.class.isAssignableFrom(e18)) {
                                                                    if (type instanceof ParameterizedType) {
                                                                        Type d13 = e0.d(0, (ParameterizedType) type);
                                                                        if (!w.b.class.isAssignableFrom(e0.e(d13))) {
                                                                            uVar = new t(new v.g(method2, i15, c10, a0Var2.d(d13, annotationArr4, annotationArr5)));
                                                                        } else {
                                                                            throw e0.j(method2, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw e0.j(method2, i15, e18.getSimpleName() + " must include generic type (e.g., " + e18.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                } else if (e18.isArray()) {
                                                                    Class<?> a10 = y.a.a(e18.getComponentType());
                                                                    if (!w.b.class.isAssignableFrom(a10)) {
                                                                        uVar = new u(new v.g(method2, i15, c10, a0Var2.d(a10, annotationArr4, annotationArr5)));
                                                                    } else {
                                                                        throw e0.j(method2, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                } else if (!w.b.class.isAssignableFrom(e18)) {
                                                                    mVar = new v.g(method2, i15, c10, a0Var2.d(type, annotationArr4, annotationArr5));
                                                                    aVar3 = aVar8;
                                                                } else {
                                                                    throw e0.j(method2, i15, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                mVar = uVar;
                                                                aVar3 = aVar8;
                                                            }
                                                        } else {
                                                            throw e0.j(method2, i15, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                    } else {
                                                        y.a aVar9 = aVar4;
                                                        if (annotation2 instanceof fw.r) {
                                                            aVar3 = aVar9;
                                                            aVar3.c(i15, type);
                                                            if (aVar3.f13689q) {
                                                                aVar3.f13679g = true;
                                                                Class<?> e19 = e0.e(type);
                                                                if (Map.class.isAssignableFrom(e19)) {
                                                                    Type f11 = e0.f(type, e19);
                                                                    if (f11 instanceof ParameterizedType) {
                                                                        ParameterizedType parameterizedType4 = (ParameterizedType) f11;
                                                                        Type d14 = e0.d(0, parameterizedType4);
                                                                        if (String.class == d14) {
                                                                            Type d15 = e0.d(1, parameterizedType4);
                                                                            if (!w.b.class.isAssignableFrom(e0.e(d15))) {
                                                                                oVar = new v.h<>(method2, i15, a0Var2.d(d15, annotationArr4, annotationArr5), ((fw.r) annotation2).encoding());
                                                                            } else {
                                                                                throw e0.j(method2, i15, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                            }
                                                                        } else {
                                                                            throw e0.j(method2, i15, "@PartMap keys must be of type String: " + d14, new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw e0.j(method2, i15, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw e0.j(method2, i15, "@PartMap parameter type must be Map.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw e0.j(method2, i15, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                            }
                                                        } else {
                                                            aVar3 = aVar9;
                                                            if (annotation2 instanceof fw.a) {
                                                                aVar3.c(i15, type);
                                                                if (!aVar3.f13688p && !aVar3.f13689q) {
                                                                    if (!aVar3.f13680h) {
                                                                        try {
                                                                            f<T, lv.c0> d16 = a0Var2.d(type, annotationArr4, annotationArr5);
                                                                            aVar3.f13680h = true;
                                                                            oVar = new v.a<>(method2, i15, d16);
                                                                        } catch (RuntimeException e20) {
                                                                            throw e0.k(method2, e20, i15, "Unable to create @Body converter for %s", type);
                                                                        }
                                                                    } else {
                                                                        throw e0.j(method2, i15, "Multiple @Body method annotations found.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw e0.j(method2, i15, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                                }
                                                            } else if (annotation2 instanceof fw.x) {
                                                                aVar3.c(i15, type);
                                                                Class<?> e21 = e0.e(type);
                                                                for (int i20 = i15 - 1; i20 >= 0; i20--) {
                                                                    v<?> vVar2 = aVar3.f13693v[i20];
                                                                    if ((vVar2 instanceof v.o) && ((v.o) vVar2).f13643a.equals(e21)) {
                                                                        throw e0.j(method2, i15, "@Tag type " + e21.getName() + " is duplicate of parameter #" + (i20 + 1) + " and would always overwrite its value.", new Object[0]);
                                                                    }
                                                                }
                                                                oVar = new v.o<>(e21);
                                                            } else {
                                                                mVar = null;
                                                            }
                                                        }
                                                        mVar = oVar;
                                                    }
                                                    aVar6 = aVar3;
                                                    aVar7 = aVar6;
                                                }
                                                if (mVar != null) {
                                                }
                                                i16 = i11 + 1;
                                                aVar4 = aVar3;
                                                length3 = i17;
                                                i14 = i18;
                                                length4 = i19;
                                                str4 = str2;
                                                vVarArr3 = vVarArr2;
                                                z11 = z13;
                                            }
                                            mVar = uVar2;
                                            aVar3 = aVar4;
                                            if (mVar != null) {
                                            }
                                            i16 = i11 + 1;
                                            aVar4 = aVar3;
                                            length3 = i17;
                                            i14 = i18;
                                            length4 = i19;
                                            str4 = str2;
                                            vVarArr3 = vVarArr2;
                                            z11 = z13;
                                        }
                                    }
                                }
                            }
                            vVarArr2 = vVarArr3;
                            z13 = z11;
                            aVar3 = aVar4;
                            i11 = i16;
                            if (mVar != null) {
                            }
                            i16 = i11 + 1;
                            aVar4 = aVar3;
                            length3 = i17;
                            i14 = i18;
                            length4 = i19;
                            str4 = str2;
                            vVarArr3 = vVarArr2;
                            z11 = z13;
                        }
                        aVar = aVar4;
                        i6 = length3;
                        i10 = i14;
                        str = str4;
                        vVarArr = vVarArr3;
                        z12 = z11;
                        aVar2 = aVar6;
                        aVar6 = aVar7;
                    } else {
                        aVar = aVar4;
                        annotationArr = annotationArr3;
                        i6 = length3;
                        i10 = i14;
                        str = str4;
                        vVarArr = vVarArr3;
                        z12 = z11;
                        vVar = null;
                        aVar2 = aVar6;
                    }
                    if (vVar == null) {
                        if (z12) {
                            try {
                                if (e0.e(type) == ls.d.class) {
                                    aVar6.f13694w = true;
                                    vVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw e0.j(method2, i15, "No Retrofit annotation found.", new Object[0]);
                    }
                    vVarArr[i15] = vVar;
                    i15++;
                    aVar4 = aVar;
                    aVar6 = aVar2;
                    annotationArr3 = annotationArr;
                    length3 = i6;
                    i14 = i10;
                    str4 = str;
                }
                String str5 = str4;
                if (aVar6.r == null && !aVar6.f13685m) {
                    throw e0.i(method2, null, "Missing either @%s URL or @Url parameter.", aVar6.f13686n);
                }
                boolean z16 = aVar6.f13688p;
                if (!z16 && !aVar6.f13689q && !aVar6.f13687o && aVar6.f13680h) {
                    throw e0.i(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z16 && !aVar6.f) {
                    throw e0.i(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar6.f13689q && !aVar6.f13679g) {
                    throw e0.i(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                y yVar = new y(aVar6);
                Type genericReturnType2 = method.getGenericReturnType();
                if (!e0.g(genericReturnType2)) {
                    if (genericReturnType2 != Void.TYPE) {
                        Annotation[] annotations = method.getAnnotations();
                        boolean z17 = yVar.f13671k;
                        if (z17) {
                            Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                            if (type2 instanceof WildcardType) {
                                type2 = ((WildcardType) type2).getLowerBounds()[0];
                            }
                            if (e0.e(type2) == z.class && (type2 instanceof ParameterizedType)) {
                                type2 = e0.d(0, (ParameterizedType) type2);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            genericReturnType = new e0.b(null, b.class, type2);
                            if (!e0.h(annotations, c0.class)) {
                                Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                                annotationArr6[0] = d0.f13547a;
                                System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                                annotations = annotationArr6;
                            }
                        } else {
                            genericReturnType = method.getGenericReturnType();
                            z10 = false;
                        }
                        try {
                            c<?, ?> a11 = a0Var.a(genericReturnType, annotations);
                            Type b10 = a11.b();
                            if (b10 != lv.d0.class) {
                                if (b10 != z.class) {
                                    if (yVar.f13664c.equals(str5) && !Void.class.equals(b10)) {
                                        throw e0.i(method, null, "HEAD method must use Void as response type.", new Object[0]);
                                    }
                                    try {
                                        f<lv.e0, T> e22 = a0Var.e(b10, method.getAnnotations());
                                        e.a aVar10 = a0Var.f13534b;
                                        if (!z17) {
                                            return new i.a(yVar, aVar10, e22, a11);
                                        }
                                        if (z10) {
                                            return new i.c(yVar, aVar10, e22, a11);
                                        }
                                        return new i.b(yVar, aVar10, e22, a11);
                                    } catch (RuntimeException e23) {
                                        throw e0.i(method, e23, "Unable to create converter for %s", b10);
                                    }
                                }
                                throw e0.i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                            }
                            throw e0.i(method, null, "'" + e0.e(b10).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                        } catch (RuntimeException e24) {
                            throw e0.i(method, e24, "Unable to create call adapter for %s", genericReturnType);
                        }
                    }
                    throw e0.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                throw e0.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
            } else {
                throw e0.i(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw e0.i(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str3);
    }

    public abstract T a(Object[] objArr);
}
