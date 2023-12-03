package ta;

import android.text.TextUtils;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class w2 extends e4 {
    public final u2 A;
    public final u2 B;
    public final u2 C;
    public final u2 D;
    public final u2 E;
    public final u2 F;
    public final u2 G;
    public final u2 H;

    /* renamed from: w  reason: collision with root package name */
    public char f32922w;

    /* renamed from: x  reason: collision with root package name */
    public long f32923x;

    /* renamed from: y  reason: collision with root package name */
    public String f32924y;

    /* renamed from: z  reason: collision with root package name */
    public final u2 f32925z;

    public w2(y3 y3Var) {
        super(y3Var);
        this.f32922w = (char) 0;
        this.f32923x = -1L;
        this.f32925z = new u2(this, 6, false, false);
        this.A = new u2(this, 6, true, false);
        this.B = new u2(this, 6, false, true);
        this.C = new u2(this, 5, false, false);
        this.D = new u2(this, 5, true, false);
        this.E = new u2(this, 5, false, true);
        this.F = new u2(this, 4, false, false);
        this.G = new u2(this, 3, false, false);
        this.H = new u2(this, 2, false, false);
    }

    public static v2 q(String str) {
        if (str == null) {
            return null;
        }
        return new v2(str);
    }

    public static String r(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String s10 = s(obj, z10);
        String s11 = s(obj2, z10);
        String s12 = s(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(s10)) {
            sb2.append(str2);
            sb2.append(s10);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(s11)) {
            sb2.append(str2);
            sb2.append(s11);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(s12)) {
            sb2.append(str3);
            sb2.append(s12);
        }
        return sb2.toString();
    }

    public static String s(Object obj, boolean z10) {
        String th2;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th3 = (Throwable) obj;
                if (z10) {
                    th2 = th3.getClass().getName();
                } else {
                    th2 = th3.toString();
                }
                StringBuilder sb2 = new StringBuilder(th2);
                String canonicalName = y3.class.getCanonicalName();
                if (TextUtils.isEmpty(canonicalName)) {
                    canonicalName = "";
                } else {
                    int lastIndexOf = canonicalName.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        canonicalName = canonicalName.substring(0, lastIndexOf);
                    }
                }
                StackTraceElement[] stackTrace = th3.getStackTrace();
                int length = stackTrace.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i6];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                        if (TextUtils.isEmpty(className)) {
                            className = "";
                        } else {
                            int lastIndexOf2 = className.lastIndexOf(46);
                            if (lastIndexOf2 != -1) {
                                className = className.substring(0, lastIndexOf2);
                            }
                        }
                        if (className.equals(canonicalName)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i6++;
                }
                return sb2.toString();
            } else if (obj instanceof v2) {
                return ((v2) obj).f32905a;
            } else {
                if (z10) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    @Override // ta.e4
    public final boolean i() {
        return false;
    }

    public final u2 l() {
        return this.G;
    }

    public final u2 m() {
        return this.f32925z;
    }

    public final u2 n() {
        return this.H;
    }

    public final u2 o() {
        return this.C;
    }

    public final u2 p() {
        return this.E;
    }

    public final String t() {
        String str;
        synchronized (this) {
            try {
                if (this.f32924y == null) {
                    y3 y3Var = this.f32943u;
                    String str2 = y3Var.f32956x;
                    if (str2 != null) {
                        this.f32924y = str2;
                    } else {
                        y3Var.A.f32943u.getClass();
                        this.f32924y = "FA";
                    }
                }
                v9.o.h(this.f32924y);
                str = this.f32924y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void u(int i6, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        int i10;
        if (!z10 && Log.isLoggable(t(), i6)) {
            Log.println(i6, t(), r(false, str, obj, obj2, obj3));
        }
        if (!z11 && i6 >= 5) {
            v9.o.h(str);
            w3 w3Var = this.f32943u.D;
            if (w3Var == null) {
                Log.println(6, t(), "Scheduler not set. Not logging error/warn");
            } else if (!w3Var.f32544v) {
                Log.println(6, t(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i6 >= 9) {
                    i10 = 8;
                } else {
                    i10 = i6;
                }
                w3Var.p(new t2(this, i10, str, obj, obj2, obj3));
            }
        }
    }
}
