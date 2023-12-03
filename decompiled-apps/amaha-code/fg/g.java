package fg;

import com.appsflyer.R;
/* compiled from: TextEncoder.java */
/* loaded from: classes.dex */
public final class g extends df.b {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i6) {
        super(19);
        this.B = i6;
    }

    @Override // df.b, fg.b
    public final void c(c cVar) {
        switch (this.B) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (cVar.c()) {
                        char b10 = cVar.b();
                        cVar.f++;
                        j(b10, sb2);
                        if (sb2.length() % 3 == 0) {
                            df.b.D(cVar, sb2);
                            if (ca.a.U0(cVar.f15031a, cVar.f, o()) != o()) {
                                cVar.f15036g = 0;
                            }
                        }
                    }
                }
                s(cVar, sb2);
                return;
            default:
                super.c(cVar);
                return;
        }
    }

    @Override // df.b
    public final int j(char c10, StringBuilder sb2) {
        switch (this.B) {
            case 0:
                if (c10 == ' ') {
                    sb2.append((char) 3);
                } else if (c10 >= '0' && c10 <= '9') {
                    sb2.append((char) ((c10 - '0') + 4));
                } else if (c10 >= 'a' && c10 <= 'z') {
                    sb2.append((char) ((c10 - 'a') + 14));
                } else if (c10 < ' ') {
                    sb2.append((char) 0);
                    sb2.append(c10);
                    return 2;
                } else if (c10 >= '!' && c10 <= '/') {
                    sb2.append((char) 1);
                    sb2.append((char) (c10 - '!'));
                    return 2;
                } else if (c10 >= ':' && c10 <= '@') {
                    sb2.append((char) 1);
                    sb2.append((char) ((c10 - ':') + 15));
                    return 2;
                } else if (c10 >= '[' && c10 <= '_') {
                    sb2.append((char) 1);
                    sb2.append((char) ((c10 - '[') + 22));
                    return 2;
                } else if (c10 == '`') {
                    sb2.append((char) 2);
                    sb2.append((char) (c10 - '`'));
                    return 2;
                } else if (c10 >= 'A' && c10 <= 'Z') {
                    sb2.append((char) 2);
                    sb2.append((char) ((c10 - 'A') + 1));
                    return 2;
                } else if (c10 >= '{' && c10 <= 127) {
                    sb2.append((char) 2);
                    sb2.append((char) ((c10 - R.styleable.AppCompatTheme_windowFixedWidthMinor) + 27));
                    return 2;
                } else {
                    sb2.append("\u0001\u001e");
                    return 2 + j((char) (c10 - 128), sb2);
                }
                return 1;
            default:
                if (c10 != '\r') {
                    if (c10 != ' ') {
                        if (c10 != '*') {
                            if (c10 != '>') {
                                if (c10 >= '0' && c10 <= '9') {
                                    sb2.append((char) ((c10 - '0') + 4));
                                } else if (c10 >= 'A' && c10 <= 'Z') {
                                    sb2.append((char) ((c10 - 'A') + 14));
                                } else {
                                    ca.a.x0(c10);
                                    throw null;
                                }
                            } else {
                                sb2.append((char) 2);
                            }
                        } else {
                            sb2.append((char) 1);
                        }
                    } else {
                        sb2.append((char) 3);
                    }
                } else {
                    sb2.append((char) 0);
                }
                return 1;
        }
    }

    @Override // df.b
    public final int o() {
        switch (this.B) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // df.b
    public final void s(c cVar, StringBuilder sb2) {
        switch (this.B) {
            case 1:
                cVar.d(cVar.a());
                int a10 = cVar.f15037h.f15045b - cVar.a();
                cVar.f -= sb2.length();
                String str = cVar.f15031a;
                if ((str.length() - cVar.f15038i) - cVar.f > 1 || a10 > 1 || (str.length() - cVar.f15038i) - cVar.f != a10) {
                    cVar.e((char) 254);
                }
                if (cVar.f15036g < 0) {
                    cVar.f15036g = 0;
                    return;
                }
                return;
            default:
                super.s(cVar, sb2);
                return;
        }
    }
}
