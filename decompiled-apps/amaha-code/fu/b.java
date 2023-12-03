package fu;

import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: ClassId.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f15918a;

    /* renamed from: b  reason: collision with root package name */
    public final c f15919b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15920c;

    public b(c cVar, c cVar2, boolean z10) {
        if (cVar != null) {
            this.f15918a = cVar;
            this.f15919b = cVar2;
            this.f15920c = z10;
            return;
        }
        a(1);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
            switch (i6) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
                switch (i6) {
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        i10 = 3;
                        break;
                }
                Object[] objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 3:
                        objArr[0] = "packageFqName";
                        break;
                    case 2:
                        objArr[0] = "relativeClassName";
                        break;
                    case 4:
                        objArr[0] = "topLevelName";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = SessionManager.KEY_NAME;
                        break;
                    case 10:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = "string";
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i6 == 5) {
                    if (i6 != 6) {
                        if (i6 != 7) {
                            if (i6 != 9) {
                                switch (i6) {
                                    case 13:
                                    case 14:
                                        objArr[1] = "asString";
                                        break;
                                    case 15:
                                    case 16:
                                        objArr[1] = "asFqNameString";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                                        break;
                                }
                            } else {
                                objArr[1] = "asSingleFqName";
                            }
                        } else {
                            objArr[1] = "getShortClassName";
                        }
                    } else {
                        objArr[1] = "getRelativeClassName";
                    }
                } else {
                    objArr[1] = "getPackageFqName";
                }
                switch (i6) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[2] = "<init>";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case 10:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
                    switch (i6) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            Object[] objArr2 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 5) {
            }
            switch (i6) {
            }
            String format2 = String.format(str, objArr2);
            if (i6 != 5) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 5) {
            switch (i6) {
            }
            Object[] objArr22 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 5) {
            }
            switch (i6) {
            }
            String format22 = String.format(str, objArr22);
            if (i6 != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        Object[] objArr222 = new Object[i10];
        switch (i6) {
        }
        if (i6 == 5) {
        }
        switch (i6) {
        }
        String format222 = String.format(str, objArr222);
        if (i6 != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static b e(String str) {
        return f(str, false);
    }

    public static b f(String str, boolean z10) {
        String str2;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                str2 = "";
            } else {
                String replace = str.substring(0, lastIndexOf).replace('/', '.');
                str = str.substring(lastIndexOf + 1);
                str2 = replace;
            }
            return new b(new c(str2), new c(str), z10);
        }
        a(12);
        throw null;
    }

    public static b l(c cVar) {
        if (cVar != null) {
            return new b(cVar.e(), cVar.f());
        }
        a(0);
        throw null;
    }

    public final c b() {
        c cVar = this.f15918a;
        boolean d10 = cVar.d();
        c cVar2 = this.f15919b;
        if (d10) {
            if (cVar2 != null) {
                return cVar2;
            }
            a(9);
            throw null;
        }
        return new c(cVar.b() + "." + cVar2.b());
    }

    public final String c() {
        c cVar;
        boolean d10 = this.f15918a.d();
        c cVar2 = this.f15919b;
        if (d10) {
            String b10 = cVar2.b();
            if (b10 != null) {
                return b10;
            }
            a(13);
            throw null;
        }
        String str = cVar.b().replace('.', '/') + "/" + cVar2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final b d(e eVar) {
        if (eVar != null) {
            return new b(h(), this.f15919b.c(eVar), this.f15920c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15918a.equals(bVar.f15918a) && this.f15919b.equals(bVar.f15919b) && this.f15920c == bVar.f15920c) {
            return true;
        }
        return false;
    }

    public final b g() {
        c e10 = this.f15919b.e();
        if (e10.d()) {
            return null;
        }
        return new b(h(), e10, this.f15920c);
    }

    public final c h() {
        c cVar = this.f15918a;
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.f15919b.hashCode();
        return Boolean.valueOf(this.f15920c).hashCode() + ((hashCode + (this.f15918a.hashCode() * 31)) * 31);
    }

    public final c i() {
        c cVar = this.f15919b;
        if (cVar != null) {
            return cVar;
        }
        a(6);
        throw null;
    }

    public final e j() {
        e f = this.f15919b.f();
        if (f != null) {
            return f;
        }
        a(7);
        throw null;
    }

    public final boolean k() {
        return !this.f15919b.e().d();
    }

    public final String toString() {
        if (this.f15918a.d()) {
            return "/" + c();
        }
        return c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar) {
        this(cVar, c.j(eVar), false);
        if (cVar == null) {
            a(3);
            throw null;
        } else if (eVar != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
