package nu;

import com.theinnerhour.b2b.utils.SessionManager;
import dt.k;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: JvmPrimitiveType.java */
/* loaded from: classes2.dex */
public enum c {
    BOOLEAN(k.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(k.CHAR, "char", "C", "java.lang.Character"),
    BYTE(k.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(k.SHORT, "short", "S", "java.lang.Short"),
    INT(k.INT, "int", "I", "java.lang.Integer"),
    FLOAT(k.FLOAT, "float", "F", "java.lang.Float"),
    LONG(k.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(k.DOUBLE, "double", "D", "java.lang.Double");
    
    public static final HashSet G = new HashSet();
    public static final HashMap H = new HashMap();
    public static final EnumMap I = new EnumMap(k.class);
    public static final HashMap J = new HashMap();

    /* renamed from: u */
    public final k f26839u;

    /* renamed from: v */
    public final String f26840v;

    /* renamed from: w */
    public final String f26841w;

    /* renamed from: x */
    public final fu.c f26842x;

    static {
        c[] values;
        for (c cVar : values()) {
            G.add(cVar.j());
            HashMap hashMap = H;
            String str = cVar.f26840v;
            if (str != null) {
                hashMap.put(str, cVar);
                I.put((EnumMap) cVar.i(), (k) cVar);
                J.put(cVar.h(), cVar);
            } else {
                d(11);
                throw null;
            }
        }
    }

    c(k kVar, String str, String str2, String str3) {
        if (kVar != null) {
            this.f26839u = kVar;
            this.f26840v = str;
            this.f26841w = str2;
            this.f26842x = new fu.c(str3);
            return;
        }
        d(6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void d(int i6) {
        String str;
        int i10;
        Object[] objArr;
        if (i6 != 2 && i6 != 4) {
            switch (i6) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i6 != 2 && i6 != 4) {
                switch (i6) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i10 = 3;
                        break;
                }
                objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 7:
                        objArr[0] = SessionManager.KEY_NAME;
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 3:
                        objArr[0] = "type";
                        break;
                    case 5:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case 6:
                        objArr[0] = "primitiveType";
                        break;
                    case 9:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i6 == 2 && i6 != 4) {
                    switch (i6) {
                        case 10:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i6) {
                    case 1:
                    case 3:
                        objArr[2] = "get";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case 5:
                        objArr[2] = "getByDesc";
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 2 && i6 != 4) {
                    switch (i6) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            objArr = new Object[i10];
            switch (i6) {
            }
            if (i6 == 2) {
            }
            objArr[1] = "get";
            switch (i6) {
            }
            String format2 = String.format(str, objArr);
            if (i6 != 2) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 2) {
            switch (i6) {
            }
            objArr = new Object[i10];
            switch (i6) {
            }
            if (i6 == 2) {
            }
            objArr[1] = "get";
            switch (i6) {
            }
            String format22 = String.format(str, objArr);
            if (i6 != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        objArr = new Object[i10];
        switch (i6) {
        }
        if (i6 == 2) {
        }
        objArr[1] = "get";
        switch (i6) {
        }
        String format222 = String.format(str, objArr);
        if (i6 != 2) {
        }
        throw new IllegalStateException(format222);
    }

    public static c f(String str) {
        c cVar = (c) H.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String h() {
        String str = this.f26841w;
        if (str != null) {
            return str;
        }
        d(12);
        throw null;
    }

    public final k i() {
        k kVar = this.f26839u;
        if (kVar != null) {
            return kVar;
        }
        d(10);
        throw null;
    }

    public final fu.c j() {
        fu.c cVar = this.f26842x;
        if (cVar != null) {
            return cVar;
        }
        d(13);
        throw null;
    }
}
