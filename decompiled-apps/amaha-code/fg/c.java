package fg;

import java.nio.charset.StandardCharsets;
/* compiled from: EncoderContext.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f15031a;

    /* renamed from: b  reason: collision with root package name */
    public f f15032b;

    /* renamed from: c  reason: collision with root package name */
    public bg.b f15033c;

    /* renamed from: d  reason: collision with root package name */
    public bg.b f15034d;

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f15035e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f15036g;

    /* renamed from: h  reason: collision with root package name */
    public e f15037h;

    /* renamed from: i  reason: collision with root package name */
    public int f15038i;

    public c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i6 = 0; i6 < length; i6++) {
            char c10 = (char) (bytes[i6] & 255);
            if (c10 == '?' && str.charAt(i6) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f15031a = sb2.toString();
        this.f15032b = f.FORCE_NONE;
        this.f15035e = new StringBuilder(str.length());
        this.f15036g = -1;
    }

    public final int a() {
        return this.f15035e.length();
    }

    public final char b() {
        return this.f15031a.charAt(this.f);
    }

    public final boolean c() {
        if (this.f < this.f15031a.length() - this.f15038i) {
            return true;
        }
        return false;
    }

    public final void d(int i6) {
        e eVar = this.f15037h;
        if (eVar == null || i6 > eVar.f15045b) {
            this.f15037h = e.f(i6, this.f15032b, this.f15033c, this.f15034d);
        }
    }

    public final void e(char c10) {
        this.f15035e.append(c10);
    }
}
