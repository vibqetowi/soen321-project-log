package os;

import gv.r;
import kotlin.jvm.internal.i;
/* compiled from: PlatformImplementations.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27779a;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(11:3|4|(2:6|7)(5:64|(1:66)|67|68|69)|8|9|(6:41|42|43|44|16|17)|12|(6:19|20|21|22|16|17)|15|16|17)|71|9|(0)|41|42|43|44|16|17|(2:(1:34)|(1:56))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        r2 = java.lang.Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
        kotlin.jvm.internal.i.f(r2, "forName(\"kotlin.internal…entations\").newInstance()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r2 = (os.a) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        r2 = r2.getClass().getClassLoader();
        r8 = os.a.class.getClassLoader();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (kotlin.jvm.internal.i.b(r2, r8) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
        throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + r2 + ", base type classloader: " + r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        throw r7;
     */
    static {
        int i6;
        a aVar;
        Object newInstance;
        String property = System.getProperty("java.specification.version");
        try {
            if (property != null) {
                int N0 = r.N0(property, '.', 0, false, 6);
                try {
                    if (N0 < 0) {
                        i6 = Integer.parseInt(property) * 65536;
                    } else {
                        int i10 = N0 + 1;
                        int N02 = r.N0(property, '.', i10, false, 4);
                        if (N02 < 0) {
                            N02 = property.length();
                        }
                        String substring = property.substring(0, N0);
                        i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String substring2 = property.substring(i10, N02);
                        i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        i6 = Integer.parseInt(substring2) + (Integer.parseInt(substring) * 65536);
                    }
                } catch (NumberFormatException unused) {
                }
                if (i6 < 65544 || i6 < 65536) {
                    newInstance = qs.a.class.newInstance();
                    i.f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    aVar = (a) newInstance;
                    f27779a = aVar;
                    return;
                }
                if (i6 >= 65543 || i6 < 65536) {
                    try {
                        Object newInstance2 = ps.a.class.newInstance();
                        i.f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                        try {
                            try {
                                aVar = (a) newInstance2;
                            } catch (ClassCastException e10) {
                                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                                ClassLoader classLoader2 = a.class.getClassLoader();
                                if (!i.b(classLoader, classLoader2)) {
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                                }
                                throw e10;
                            }
                        } catch (ClassNotFoundException unused2) {
                        }
                    } catch (ClassNotFoundException unused3) {
                        Object newInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        i.f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                        try {
                            aVar = (a) newInstance3;
                        } catch (ClassCastException e11) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = a.class.getClassLoader();
                            if (!i.b(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                            }
                            throw e11;
                        }
                    }
                    f27779a = aVar;
                    return;
                }
                aVar = new a();
                f27779a = aVar;
                return;
            }
            aVar = (a) newInstance;
            f27779a = aVar;
            return;
        } catch (ClassCastException e12) {
            ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
            ClassLoader classLoader6 = a.class.getClassLoader();
            if (!i.b(classLoader5, classLoader6)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
            }
            throw e12;
        }
        i6 = 65542;
        if (i6 < 65544) {
        }
        newInstance = qs.a.class.newInstance();
        i.f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
    }
}
