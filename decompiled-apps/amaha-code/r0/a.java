package r0;

import android.text.SpannableStringBuilder;
import r0.f;
/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f30161d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f30162e;
    public static final a f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f30163g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30164a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30165b;

    /* renamed from: c  reason: collision with root package name */
    public final e f30166c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: r0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0511a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f30167e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f30168a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30169b;

        /* renamed from: c  reason: collision with root package name */
        public int f30170c;

        /* renamed from: d  reason: collision with root package name */
        public char f30171d;

        static {
            for (int i6 = 0; i6 < 1792; i6++) {
                f30167e[i6] = Character.getDirectionality(i6);
            }
        }

        public C0511a(CharSequence charSequence) {
            this.f30168a = charSequence;
            this.f30169b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f30168a;
            char charAt = charSequence.charAt(this.f30170c - 1);
            this.f30171d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f30170c);
                this.f30170c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f30170c--;
            char c10 = this.f30171d;
            if (c10 < 1792) {
                return f30167e[c10];
            }
            return Character.getDirectionality(c10);
        }
    }

    static {
        f.d dVar = f.f30179c;
        f30161d = Character.toString((char) 8206);
        f30162e = Character.toString((char) 8207);
        f = new a(false, 2, dVar);
        f30163g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i6, f.d dVar) {
        this.f30164a = z10;
        this.f30165b = i6;
        this.f30166c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.f30170c <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        C0511a c0511a = new C0511a(charSequence);
        c0511a.f30170c = 0;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = c0511a.f30170c;
            if (i12 < c0511a.f30169b && i6 == 0) {
                CharSequence charSequence2 = c0511a.f30168a;
                char charAt = charSequence2.charAt(i12);
                c0511a.f30171d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, c0511a.f30170c);
                    c0511a.f30170c = Character.charCount(codePointAt) + c0511a.f30170c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c0511a.f30170c++;
                    char c10 = c0511a.f30171d;
                    if (c10 < 1792) {
                        directionality = C0511a.f30167e[c10];
                    } else {
                        directionality = Character.getDirectionality(c10);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i11++;
                                    i10 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i11++;
                                    i10 = 1;
                                    break;
                                case 18:
                                    i11--;
                                    i10 = 0;
                                    break;
                            }
                        }
                    } else if (i11 == 0) {
                    }
                } else if (i11 == 0) {
                }
                i6 = i11;
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence) {
        C0511a c0511a = new C0511a(charSequence);
        c0511a.f30170c = c0511a.f30169b;
        int i6 = 0;
        int i10 = 0;
        while (c0511a.f30170c > 0) {
            byte a10 = c0511a.a();
            if (a10 != 0) {
                if (a10 != 1 && a10 != 2) {
                    if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case 15:
                                if (i10 == i6) {
                                    return -1;
                                }
                                i6--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i6) {
                                    return 1;
                                }
                                i6--;
                                break;
                            case 18:
                                i6++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    i10 = i6;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i6 == 0) {
                    return 1;
                } else {
                    if (i10 == 0) {
                        i10 = i6;
                    }
                }
            } else if (i6 == 0) {
                return -1;
            } else {
                if (i10 == 0) {
                    i10 = i6;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, e eVar) {
        boolean z10;
        f.d dVar;
        char c10;
        f.d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((f.c) eVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f30165b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = f30162e;
        String str3 = f30161d;
        boolean z11 = this.f30164a;
        if (z10) {
            if (b10) {
                dVar2 = f.f30178b;
            } else {
                dVar2 = f.f30177a;
            }
            boolean b11 = dVar2.b(charSequence, charSequence.length());
            if (!z11 && (b11 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z11 || (b11 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b10 != z11) {
            if (b10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar = f.f30178b;
        } else {
            dVar = f.f30177a;
        }
        boolean b12 = dVar.b(charSequence, charSequence.length());
        if (!z11 && (b12 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z11 || (b12 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
