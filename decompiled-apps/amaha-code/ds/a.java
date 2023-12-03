package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r1.b0;
/* compiled from: AsYouTypeFormatter.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: t  reason: collision with root package name */
    public static final e f13254t;

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f13255u;

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f13256v;

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f13257w;

    /* renamed from: i  reason: collision with root package name */
    public final c f13265i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13266j;

    /* renamed from: k  reason: collision with root package name */
    public final e f13267k;

    /* renamed from: l  reason: collision with root package name */
    public e f13268l;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f13258a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public String f13259b = "";

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f13260c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public final StringBuilder f13261d = new StringBuilder();

    /* renamed from: e  reason: collision with root package name */
    public boolean f13262e = true;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13263g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13264h = false;

    /* renamed from: m  reason: collision with root package name */
    public int f13269m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final StringBuilder f13270n = new StringBuilder();

    /* renamed from: o  reason: collision with root package name */
    public boolean f13271o = false;

    /* renamed from: p  reason: collision with root package name */
    public String f13272p = "";

    /* renamed from: q  reason: collision with root package name */
    public final StringBuilder f13273q = new StringBuilder();
    public final ArrayList r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final es.a f13274s = new es.a(64);

    static {
        e eVar = new e();
        eVar.e0 = "NA";
        f13254t = eVar;
        f13255u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");
        f13256v = Pattern.compile("[- ]");
        f13257w = Pattern.compile("\u2008");
    }

    public a(c cVar, String str) {
        this.f13265i = cVar;
        this.f13266j = str;
        e h10 = h(str);
        this.f13268l = h10;
        this.f13267k = h10;
    }

    public final String a(String str) {
        StringBuilder sb2 = this.f13270n;
        int length = sb2.length();
        if (this.f13271o && length > 0 && sb2.charAt(length - 1) != ' ') {
            return new String(sb2) + ' ' + str;
        }
        return ((Object) sb2) + str;
    }

    public final String b() {
        boolean z10;
        ArrayList<d> arrayList;
        boolean z11;
        boolean z12;
        StringBuilder sb2 = this.f13273q;
        if (sb2.length() >= 3) {
            String sb3 = sb2.toString();
            if (this.f13263g && this.f13272p.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f13268l.f13326r0.size() > 0) {
                arrayList = this.f13268l.f13326r0;
            } else {
                arrayList = this.f13268l.f13325q0;
            }
            for (d dVar : arrayList) {
                if (this.f13272p.length() > 0) {
                    String str = dVar.f13309y;
                    if (str.length() != 0 && !c.f13292x.matcher(str).matches()) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 && !dVar.f13310z && !dVar.A) {
                    }
                }
                if (this.f13272p.length() == 0 && !this.f13263g) {
                    String str2 = dVar.f13309y;
                    if (str2.length() != 0 && !c.f13292x.matcher(str2).matches()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11 && !dVar.f13310z) {
                    }
                }
                if (f13255u.matcher(dVar.f13306v).matches()) {
                    this.r.add(dVar);
                }
            }
            m(sb3);
            String f = f();
            if (f.length() > 0) {
                return f;
            }
            if (l()) {
                return i();
            }
            return this.f13260c.toString();
        }
        return a(sb2.toString());
    }

    public final String c() {
        this.f13262e = true;
        this.f13264h = false;
        this.r.clear();
        this.f13269m = 0;
        this.f13258a.setLength(0);
        this.f13259b = "";
        return b();
    }

    public final boolean d() {
        StringBuilder sb2;
        c cVar;
        int b10;
        StringBuilder sb3 = this.f13273q;
        if (sb3.length() == 0 || (b10 = (cVar = this.f13265i).b(sb3, (sb2 = new StringBuilder()))) == 0) {
            return false;
        }
        sb3.setLength(0);
        sb3.append((CharSequence) sb2);
        String k10 = cVar.k(b10);
        if ("001".equals(k10)) {
            this.f13268l = cVar.e(b10);
        } else if (!k10.equals(this.f13266j)) {
            this.f13268l = h(k10);
        }
        String num = Integer.toString(b10);
        StringBuilder sb4 = this.f13270n;
        sb4.append(num);
        sb4.append(' ');
        this.f13272p = "";
        return true;
    }

    public final boolean e() {
        Pattern a10 = this.f13274s.a("\\+|" + this.f13268l.e0);
        StringBuilder sb2 = this.f13261d;
        Matcher matcher = a10.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f13263g = true;
        int end = matcher.end();
        StringBuilder sb3 = this.f13273q;
        sb3.setLength(0);
        sb3.append(sb2.substring(end));
        StringBuilder sb4 = this.f13270n;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, end));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    public final String f() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Matcher matcher = this.f13274s.a(dVar.f13305u).matcher(this.f13273q);
            if (matcher.matches()) {
                this.f13271o = f13256v.matcher(dVar.f13309y).find();
                String a10 = a(matcher.replaceAll(dVar.f13306v));
                if (c.s(a10, c.f13279j).contentEquals(this.f13261d)) {
                    return a10;
                }
            }
        }
        return "";
    }

    public final void g() {
        this.f13260c.setLength(0);
        this.f13261d.setLength(0);
        this.f13258a.setLength(0);
        this.f13269m = 0;
        this.f13259b = "";
        this.f13270n.setLength(0);
        this.f13272p = "";
        this.f13273q.setLength(0);
        this.f13262e = true;
        this.f = false;
        this.f13263g = false;
        this.f13264h = false;
        this.r.clear();
        this.f13271o = false;
        if (!this.f13268l.equals(this.f13267k)) {
            this.f13268l = h(this.f13266j);
        }
    }

    public final e h(String str) {
        int d10;
        c cVar = this.f13265i;
        if (!cVar.n(str)) {
            Level level = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            c.f13277h.log(level, b0.b(sb2, str, ") provided."));
            d10 = 0;
        } else {
            d10 = cVar.d(str);
        }
        e f = cVar.f(cVar.k(d10));
        if (f != null) {
            return f;
        }
        return f13254t;
    }

    public final String i() {
        StringBuilder sb2 = this.f13273q;
        int length = sb2.length();
        if (length > 0) {
            String str = "";
            for (int i6 = 0; i6 < length; i6++) {
                str = k(sb2.charAt(i6));
            }
            if (this.f13262e) {
                return a(str);
            }
            return this.f13260c.toString();
        }
        return this.f13270n.toString();
    }

    public final String j(char c10) {
        boolean z10;
        StringBuilder sb2 = this.f13260c;
        sb2.append(c10);
        if (!Character.isDigit(c10) && (sb2.length() != 1 || !c.f13283n.matcher(Character.toString(c10)).matches())) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb3 = this.f13261d;
        StringBuilder sb4 = this.f13273q;
        if (!z10) {
            this.f13262e = false;
            this.f = true;
        } else if (c10 == '+') {
            sb3.append(c10);
        } else {
            c10 = Character.forDigit(Character.digit(c10, 10), 10);
            sb3.append(c10);
            sb4.append(c10);
        }
        boolean z11 = this.f13262e;
        StringBuilder sb5 = this.f13270n;
        if (!z11) {
            if (this.f) {
                return sb2.toString();
            }
            if (e()) {
                if (d()) {
                    return c();
                }
            } else {
                if (this.f13272p.length() > 0) {
                    sb4.insert(0, this.f13272p);
                    sb5.setLength(sb5.lastIndexOf(this.f13272p));
                }
                if (!this.f13272p.equals(n())) {
                    sb5.append(' ');
                    return c();
                }
            }
            return sb2.toString();
        }
        int length = sb3.length();
        if (length != 0 && length != 1 && length != 2) {
            if (length == 3) {
                if (e()) {
                    this.f13264h = true;
                } else {
                    this.f13272p = n();
                    return b();
                }
            }
            if (this.f13264h) {
                if (d()) {
                    this.f13264h = false;
                }
                return ((Object) sb5) + sb4.toString();
            } else if (this.r.size() > 0) {
                String k10 = k(c10);
                String f = f();
                if (f.length() > 0) {
                    return f;
                }
                m(sb4.toString());
                if (l()) {
                    return i();
                }
                if (this.f13262e) {
                    return a(k10);
                }
                return sb2.toString();
            } else {
                return b();
            }
        }
        return sb2.toString();
    }

    public final String k(char c10) {
        Pattern pattern = f13257w;
        StringBuilder sb2 = this.f13258a;
        Matcher matcher = pattern.matcher(sb2);
        if (matcher.find(this.f13269m)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c10));
            sb2.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.f13269m = start;
            return sb2.substring(0, start + 1);
        }
        if (this.r.size() == 1) {
            this.f13262e = false;
        }
        this.f13259b = "";
        return this.f13260c.toString();
    }

    public final boolean l() {
        String replaceAll;
        boolean z10;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            String str = dVar.f13305u;
            if (this.f13259b.equals(str)) {
                return false;
            }
            String str2 = dVar.f13305u;
            StringBuilder sb2 = this.f13258a;
            sb2.setLength(0);
            String str3 = dVar.f13306v;
            Matcher matcher = this.f13274s.a(str2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            if (group.length() < this.f13273q.length()) {
                replaceAll = "";
            } else {
                replaceAll = group.replaceAll(str2, str3).replaceAll("9", "\u2008");
            }
            if (replaceAll.length() > 0) {
                sb2.append(replaceAll);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f13259b = str;
                this.f13271o = f13256v.matcher(dVar.f13309y).find();
                this.f13269m = 0;
                return true;
            }
            it.remove();
        }
        this.f13262e = false;
        return false;
    }

    public final void m(String str) {
        ArrayList arrayList;
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f13307w.size() != 0) {
                if (!this.f13274s.a((String) dVar.f13307w.get(Math.min(length, arrayList.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String n() {
        boolean z10;
        int i6 = this.f13268l.f13313d0;
        StringBuilder sb2 = this.f13273q;
        int i10 = 1;
        if (i6 == 1 && sb2.charAt(0) == '1' && sb2.charAt(1) != '0' && sb2.charAt(1) != '1') {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb3 = this.f13270n;
        if (z10) {
            sb3.append('1');
            sb3.append(' ');
            this.f13263g = true;
        } else {
            e eVar = this.f13268l;
            if (eVar.f13320l0) {
                Matcher matcher = this.f13274s.a(eVar.f13321m0).matcher(sb2);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f13263g = true;
                    i10 = matcher.end();
                    sb3.append(sb2.substring(0, i10));
                }
            }
            i10 = 0;
        }
        String substring = sb2.substring(0, i10);
        sb2.delete(0, i10);
        return substring;
    }
}
