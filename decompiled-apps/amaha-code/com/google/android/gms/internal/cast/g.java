package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f7518a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final g f7519b = new g();

    /* renamed from: c  reason: collision with root package name */
    public static final g f7520c = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final g f7521d = new g();

    /* renamed from: e  reason: collision with root package name */
    public static final g f7522e = new g();
    public static final g f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final g f7523g = new g();

    /* renamed from: h  reason: collision with root package name */
    public static final g f7524h = new g();

    /* renamed from: i  reason: collision with root package name */
    public static final g f7525i = new g();

    /* renamed from: j  reason: collision with root package name */
    public static final g f7526j = new g();

    /* renamed from: k  reason: collision with root package name */
    public static final g f7527k = new g();

    /* renamed from: l  reason: collision with root package name */
    public static final g f7528l = new g();

    public static String a(n2 n2Var) {
        StringBuilder sb2 = new StringBuilder(n2Var.m());
        for (int i6 = 0; i6 < n2Var.m(); i6++) {
            byte e10 = n2Var.e(i6);
            if (e10 != 34) {
                if (e10 != 39) {
                    if (e10 != 92) {
                        switch (e10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (e10 >= 32 && e10 <= 126) {
                                    sb2.append((char) e10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((e10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((e10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((e10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static String b(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String sb2;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb4);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 9 + name2.length());
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb6 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i6 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i11, indexOf);
            sb6.append(objArr[i6]);
            i11 = indexOf + 2;
            i6++;
        }
        sb6.append((CharSequence) str, i11, str.length());
        if (i6 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb6.append(", ");
                sb6.append(objArr[i12]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static void c(int i6, int i10) {
        String b10;
        if (i6 >= 0 && i6 < i10) {
            return;
        }
        if (i6 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(defpackage.b.h(26, "negative size: ", i10));
            }
            b10 = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i10));
        } else {
            b10 = b("%s (%s) must not be negative", "index", Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(b10);
    }

    public static void d(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException(f(i6, i10, "index"));
    }

    public static void e(int i6, int i10, int i11) {
        String f2;
        if (i6 >= 0 && i10 >= i6 && i10 <= i11) {
            return;
        }
        if (i6 >= 0 && i6 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                f2 = b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i6));
            } else {
                f2 = f(i10, i11, "end index");
            }
        } else {
            f2 = f(i6, i11, "start index");
        }
        throw new IndexOutOfBoundsException(f2);
    }

    public static String f(int i6, int i10, @NullableDecl String str) {
        if (i6 < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(defpackage.b.h(26, "negative size: ", i10));
    }
}
