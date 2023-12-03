package ds;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PhoneNumberUtil.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f13277h = Logger.getLogger(c.class.getName());

    /* renamed from: i  reason: collision with root package name */
    public static final Map<Integer, String> f13278i;

    /* renamed from: j  reason: collision with root package name */
    public static final Map<Character, Character> f13279j;

    /* renamed from: k  reason: collision with root package name */
    public static final Map<Character, Character> f13280k;

    /* renamed from: l  reason: collision with root package name */
    public static final Map<Character, Character> f13281l;

    /* renamed from: m  reason: collision with root package name */
    public static final Map<Character, Character> f13282m;

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f13283n;

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f13284o;

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f13285p;

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f13286q;
    public static final Pattern r;

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f13287s;

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f13288t;

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f13289u;

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f13290v;

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f13291w;

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f13292x;

    /* renamed from: a  reason: collision with root package name */
    public final yp.d f13293a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, List<String>> f13294b;

    /* renamed from: c  reason: collision with root package name */
    public final gd.d f13295c = new gd.d(13);

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f13296d = new HashSet(35);

    /* renamed from: e  reason: collision with root package name */
    public final es.a f13297e = new es.a(100);
    public final HashSet f = new HashSet(320);

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f13298g = new HashSet();

    /* compiled from: PhoneNumberUtil.java */
    /* loaded from: classes2.dex */
    public enum a {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        f13278i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f13280k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f13281l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f13279j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch2 : unmodifiableMap.keySet()) {
            char charValue = ch2.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        f13282m = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map = f13280k;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        f13283n = Pattern.compile("[+＋]+");
        f13284o = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f13285p = Pattern.compile("(\\p{Nd})");
        f13286q = Pattern.compile("[+＋\\p{Nd}]");
        r = Pattern.compile("[\\\\/] *x");
        f13287s = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f13288t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String m10 = defpackage.b.m("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb3, "\\p{Nd}]*");
        f13289u = Pattern.compile("(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);
        f13290v = Pattern.compile(m10 + "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        Pattern.compile("(\\D+)");
        f13291w = Pattern.compile("(\\$\\d)");
        f13292x = Pattern.compile("\\(?\\$1\\)?");
    }

    public c(yp.d dVar, HashMap hashMap) {
        this.f13293a = dVar;
        this.f13294b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f13298g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            f13277h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f13296d.addAll((Collection) hashMap.get(1));
    }

    public static c a(Context context) {
        if (context != null) {
            return new c(new yp.d(new gd.d(12, context.getAssets())), sp.b.u());
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    public static String h(g gVar) {
        int i6;
        StringBuilder sb2 = new StringBuilder();
        if (gVar.f13349z && (i6 = gVar.B) > 0) {
            char[] cArr = new char[i6];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(gVar.f13345v);
        return sb2.toString();
    }

    public static f i(e eVar, a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 2:
                return eVar.f13335x;
            case 1:
                return eVar.f13337z;
            case 3:
                return eVar.B;
            case 4:
                return eVar.D;
            case 5:
                return eVar.F;
            case 6:
                return eVar.J;
            case 7:
                return eVar.H;
            case 8:
                return eVar.L;
            case 9:
                return eVar.N;
            case 10:
                return eVar.R;
            default:
                return eVar.f13331v;
        }
    }

    public static void q(StringBuilder sb2) {
        if (f13288t.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), s(sb2, f13281l));
        } else {
            sb2.replace(0, sb2.length(), r(sb2));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            int digit = Character.digit(charSequence.charAt(i6), 10);
            if (digit != -1) {
                sb2.append(digit);
            }
        }
        return sb2.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            Character ch2 = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i6))));
            if (ch2 != null) {
                sb2.append(ch2);
            }
        }
        return sb2.toString();
    }

    public static void u(int i6, int i10, StringBuilder sb2) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 3) {
                        return;
                    }
                    sb2.insert(0, "-").insert(0, i6).insert(0, '+').insert(0, "tel:");
                    return;
                }
                sb2.insert(0, " ").insert(0, i6).insert(0, '+');
                return;
            }
            sb2.insert(0, i6).insert(0, '+');
            return;
        }
        throw null;
    }

    public static int v(StringBuilder sb2, e eVar, a aVar) {
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        f i6 = i(eVar, aVar);
        if (i6.f13340w.isEmpty()) {
            arrayList = eVar.f13331v.f13340w;
        } else {
            arrayList = i6.f13340w;
        }
        ArrayList arrayList2 = i6.f13341x;
        if (aVar == a.FIXED_LINE_OR_MOBILE) {
            f i10 = i(eVar, a.FIXED_LINE);
            if (i10.f13340w.size() == 1 && ((Integer) i10.f13340w.get(0)).intValue() == -1) {
                z10 = false;
            } else {
                z10 = true;
            }
            a aVar2 = a.MOBILE;
            if (!z10) {
                return v(sb2, eVar, aVar2);
            }
            f i11 = i(eVar, aVar2);
            if (i11.f13340w.size() == 1 && ((Integer) i11.f13340w.get(0)).intValue() == -1) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = i11.f13340w;
                if (arrayList4.size() == 0) {
                    arrayList4 = eVar.f13331v.f13340w;
                }
                arrayList3.addAll(arrayList4);
                Collections.sort(arrayList3);
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList5 = i11.f13341x;
                if (isEmpty) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    arrayList6.addAll(arrayList5);
                    Collections.sort(arrayList6);
                    arrayList2 = arrayList6;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        if (arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
            return 1;
        }
        return 5;
    }

    public final int b(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i6 = 1; i6 <= 3 && i6 <= length; i6++) {
                int parseInt = Integer.parseInt(sb2.substring(0, i6));
                if (this.f13294b.containsKey(Integer.valueOf(parseInt))) {
                    sb3.append(sb2.substring(i6));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final String c(g gVar, int i6) {
        ArrayList arrayList;
        es.a aVar;
        d dVar;
        int i10 = (gVar.f13345v > 0L ? 1 : (gVar.f13345v == 0L ? 0 : -1));
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        int i11 = gVar.f13344u;
        String h10 = h(gVar);
        if (i6 == 1) {
            sb2.append(h10);
            u(i11, 1, sb2);
        } else if (!this.f13294b.containsKey(Integer.valueOf(i11))) {
            sb2.append(h10);
        } else {
            e g5 = g(i11, k(i11));
            if (g5.f13326r0.size() != 0 && i6 != 3) {
                arrayList = g5.f13326r0;
            } else {
                arrayList = g5.f13325q0;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar = this.f13297e;
                if (hasNext) {
                    dVar = (d) it.next();
                    int size = dVar.f13307w.size();
                    if (size != 0) {
                        if (!aVar.a((String) dVar.f13307w.get(size - 1)).matcher(h10).lookingAt()) {
                            continue;
                        }
                    }
                    if (aVar.a(dVar.f13305u).matcher(h10).matches()) {
                        break;
                    }
                } else {
                    dVar = null;
                    break;
                }
            }
            if (dVar != null) {
                String str = dVar.f13306v;
                Matcher matcher = aVar.a(dVar.f13305u).matcher(h10);
                String str2 = dVar.f13309y;
                if (i6 == 3 && str2 != null && str2.length() > 0) {
                    h10 = matcher.replaceAll(f13291w.matcher(str).replaceFirst(str2));
                } else {
                    h10 = matcher.replaceAll(str);
                }
                if (i6 == 4) {
                    Matcher matcher2 = f13284o.matcher(h10);
                    if (matcher2.lookingAt()) {
                        h10 = matcher2.replaceFirst("");
                    }
                    h10 = matcher2.reset(h10).replaceAll("-");
                }
            }
            sb2.append(h10);
            if (gVar.f13346w && gVar.f13347x.length() > 0) {
                if (i6 == 4) {
                    sb2.append(";ext=");
                    sb2.append(gVar.f13347x);
                } else if (g5.f13318j0) {
                    sb2.append(g5.f13319k0);
                    sb2.append(gVar.f13347x);
                } else {
                    sb2.append(" ext. ");
                    sb2.append(gVar.f13347x);
                }
            }
            u(i11, i6, sb2);
        }
        return sb2.toString();
    }

    public final int d(String str) {
        e f = f(str);
        if (f != null) {
            return f.f13313d0;
        }
        throw new IllegalArgumentException(defpackage.c.r("Invalid region code: ", str));
    }

    public final e e(int i6) {
        if (!this.f13294b.containsKey(Integer.valueOf(i6))) {
            return null;
        }
        yp.d dVar = this.f13293a;
        dVar.getClass();
        List list = (List) sp.b.u().get(Integer.valueOf(i6));
        boolean z10 = true;
        if (!((list.size() == 1 && "001".equals(list.get(0))) ? false : false)) {
            return null;
        }
        return ((b) dVar.f38760e).a(Integer.valueOf(i6), (ConcurrentHashMap) dVar.f38756a, (String) dVar.f38759d);
    }

    public final e f(String str) {
        if (!n(str)) {
            return null;
        }
        yp.d dVar = this.f13293a;
        return ((b) dVar.f38760e).a(str, (ConcurrentHashMap) dVar.f, (String) dVar.f38759d);
    }

    public final e g(int i6, String str) {
        if ("001".equals(str)) {
            return e(i6);
        }
        return f(str);
    }

    public final a j(String str, e eVar) {
        boolean l2 = l(str, eVar.f13331v);
        a aVar = a.UNKNOWN;
        if (!l2) {
            return aVar;
        }
        if (l(str, eVar.D)) {
            return a.PREMIUM_RATE;
        }
        if (l(str, eVar.B)) {
            return a.TOLL_FREE;
        }
        if (l(str, eVar.F)) {
            return a.SHARED_COST;
        }
        if (l(str, eVar.J)) {
            return a.VOIP;
        }
        if (l(str, eVar.H)) {
            return a.PERSONAL_NUMBER;
        }
        if (l(str, eVar.L)) {
            return a.PAGER;
        }
        if (l(str, eVar.N)) {
            return a.UAN;
        }
        if (l(str, eVar.R)) {
            return a.VOICEMAIL;
        }
        if (l(str, eVar.f13335x)) {
            boolean z10 = eVar.f13324p0;
            a aVar2 = a.FIXED_LINE_OR_MOBILE;
            if (z10) {
                return aVar2;
            }
            if (l(str, eVar.f13337z)) {
                return aVar2;
            }
            return a.FIXED_LINE;
        } else if (!eVar.f13324p0 && l(str, eVar.f13337z)) {
            return a.MOBILE;
        } else {
            return aVar;
        }
    }

    public final String k(int i6) {
        List<String> list = this.f13294b.get(Integer.valueOf(i6));
        if (list == null) {
            return "ZZ";
        }
        return list.get(0);
    }

    public final boolean l(String str, f fVar) {
        int length = str.length();
        ArrayList arrayList = fVar.f13340w;
        if (arrayList.size() > 0 && !arrayList.contains(Integer.valueOf(length))) {
            return false;
        }
        return this.f13295c.f(str, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(g gVar) {
        String str;
        e g5;
        int i6 = gVar.f13344u;
        List<String> list = this.f13294b.get(Integer.valueOf(i6));
        a aVar = a.UNKNOWN;
        if (list == null) {
            f13277h.log(Level.INFO, defpackage.c.q("Missing/invalid country_code (", i6, ")"));
        } else {
            if (list.size() == 1) {
                str = list.get(0);
            } else {
                String h10 = h(gVar);
                for (String str2 : list) {
                    e f = f(str2);
                    if (f.f13328t0) {
                        if (this.f13297e.a(f.f13330u0).matcher(h10).lookingAt()) {
                            str = str2;
                            break;
                        }
                    } else if (j(h10, f) != aVar) {
                        str = str2;
                        break;
                    }
                }
            }
            int i10 = gVar.f13344u;
            g5 = g(i10, str);
            if (g5 != null) {
                return false;
            }
            if ((!"001".equals(str) && i10 != d(str)) || j(h(gVar), g5) == aVar) {
                return false;
            }
            return true;
        }
        str = null;
        int i102 = gVar.f13344u;
        g5 = g(i102, str);
        if (g5 != null) {
        }
    }

    public final boolean n(String str) {
        if (str != null && this.f.contains(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(CharSequence charSequence, e eVar, StringBuilder sb2, g gVar) {
        String str;
        char c10;
        boolean z10;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb3 = new StringBuilder(charSequence);
        if (eVar != null) {
            str = eVar.e0;
        } else {
            str = "NonMatch";
        }
        if (sb3.length() != 0) {
            Matcher matcher = f13283n.matcher(sb3);
            if (matcher.lookingAt()) {
                sb3.delete(0, matcher.end());
                q(sb3);
                c10 = 1;
            } else {
                Pattern a10 = this.f13297e.a(str);
                q(sb3);
                Matcher matcher2 = a10.matcher(sb3);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = f13285p.matcher(sb3.substring(end));
                    if (!matcher3.find() || !r(matcher3.group(1)).equals("0")) {
                        sb3.delete(0, end);
                        z10 = true;
                        if (z10) {
                            c10 = 2;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            if (c10 == 4) {
                if (sb3.length() > 2) {
                    int b10 = b(sb3, sb2);
                    if (b10 != 0) {
                        gVar.f13344u = b10;
                        return b10;
                    }
                    throw new NumberParseException(1, "Country calling code supplied was not recognised.");
                }
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (eVar != null) {
                int i6 = eVar.f13313d0;
                String valueOf = String.valueOf(i6);
                String sb4 = sb3.toString();
                if (sb4.startsWith(valueOf)) {
                    StringBuilder sb5 = new StringBuilder(sb4.substring(valueOf.length()));
                    f fVar = eVar.f13331v;
                    p(sb5, eVar, null);
                    gd.d dVar = this.f13295c;
                    if ((!dVar.f(sb3, fVar) && dVar.f(sb5, fVar)) || v(sb3, eVar, a.UNKNOWN) == 6) {
                        sb2.append((CharSequence) sb5);
                        gVar.f13344u = i6;
                        return i6;
                    }
                }
            }
            gVar.f13344u = 0;
            return 0;
        }
        c10 = 4;
        if (c10 == 4) {
        }
    }

    public final void p(StringBuilder sb2, e eVar, StringBuilder sb3) {
        int length = sb2.length();
        String str = eVar.f13321m0;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.f13297e.a(str).matcher(sb2);
            if (matcher.lookingAt()) {
                f fVar = eVar.f13331v;
                gd.d dVar = this.f13295c;
                boolean f = dVar.f(sb2, fVar);
                int groupCount = matcher.groupCount();
                String str2 = eVar.f13323o0;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb4 = new StringBuilder(sb2);
                    sb4.replace(0, length, matcher.replaceFirst(str2));
                    if (f && !dVar.f(sb4.toString(), fVar)) {
                        return;
                    }
                    if (sb3 != null && groupCount > 1) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.replace(0, sb2.length(), sb4.toString());
                } else if (f && !dVar.f(sb2.substring(matcher.end()), fVar)) {
                } else {
                    if (sb3 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                }
            }
        }
    }

    public final g t(String str, String str2) {
        CharSequence charSequence;
        boolean matches;
        boolean z10;
        int o10;
        boolean matches2;
        int i6;
        g gVar = new g();
        if (str != null) {
            if (str.length() <= 250) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = str.toString();
                int indexOf = str3.indexOf(";phone-context=");
                String str4 = "";
                if (indexOf >= 0) {
                    int i10 = indexOf + 15;
                    if (i10 < str3.length() - 1 && str3.charAt(i10) == '+') {
                        int indexOf2 = str3.indexOf(59, i10);
                        if (indexOf2 > 0) {
                            sb2.append(str3.substring(i10, indexOf2));
                        } else {
                            sb2.append(str3.substring(i10));
                        }
                    }
                    int indexOf3 = str3.indexOf("tel:");
                    if (indexOf3 >= 0) {
                        i6 = indexOf3 + 4;
                    } else {
                        i6 = 0;
                    }
                    sb2.append(str3.substring(i6, indexOf));
                } else {
                    Matcher matcher = f13286q.matcher(str3);
                    if (!matcher.find()) {
                        charSequence = "";
                    } else {
                        charSequence = str3.subSequence(matcher.start(), str3.length());
                        Matcher matcher2 = f13287s.matcher(charSequence);
                        if (matcher2.find()) {
                            charSequence = charSequence.subSequence(0, matcher2.start());
                        }
                        Matcher matcher3 = r.matcher(charSequence);
                        if (matcher3.find()) {
                            charSequence = charSequence.subSequence(0, matcher3.start());
                        }
                    }
                    sb2.append(charSequence);
                }
                int indexOf4 = sb2.indexOf(";isub=");
                if (indexOf4 > 0) {
                    sb2.delete(indexOf4, sb2.length());
                }
                int length = sb2.length();
                Pattern pattern = f13290v;
                if (length < 2) {
                    matches = false;
                } else {
                    matches = pattern.matcher(sb2).matches();
                }
                if (matches) {
                    boolean n10 = n(str2);
                    Pattern pattern2 = f13283n;
                    if (!n10 && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        Matcher matcher4 = f13289u.matcher(sb2);
                        if (matcher4.find()) {
                            String substring = sb2.substring(0, matcher4.start());
                            if (substring.length() < 2) {
                                matches2 = false;
                            } else {
                                matches2 = pattern.matcher(substring).matches();
                            }
                            if (matches2) {
                                int groupCount = matcher4.groupCount();
                                int i11 = 1;
                                while (true) {
                                    if (i11 > groupCount) {
                                        break;
                                    } else if (matcher4.group(i11) != null) {
                                        str4 = matcher4.group(i11);
                                        sb2.delete(matcher4.start(), sb2.length());
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (str4.length() > 0) {
                            gVar.f13346w = true;
                            gVar.f13347x = str4;
                        }
                        e f = f(str2);
                        StringBuilder sb3 = new StringBuilder();
                        try {
                            o10 = o(sb2, f, sb3, gVar);
                        } catch (NumberParseException e10) {
                            Matcher matcher5 = pattern2.matcher(sb2);
                            int i12 = e10.f20503u;
                            if (i12 == 1 && matcher5.lookingAt()) {
                                o10 = o(sb2.substring(matcher5.end()), f, sb3, gVar);
                                if (o10 == 0) {
                                    throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
                                }
                            } else {
                                throw new NumberParseException(i12, e10.getMessage());
                            }
                        }
                        if (o10 != 0) {
                            String k10 = k(o10);
                            if (!k10.equals(str2)) {
                                f = g(o10, k10);
                            }
                        } else {
                            q(sb2);
                            sb3.append((CharSequence) sb2);
                            if (str2 != null) {
                                gVar.f13344u = f.f13313d0;
                            }
                        }
                        if (sb3.length() >= 2) {
                            if (f != null) {
                                StringBuilder sb4 = new StringBuilder();
                                StringBuilder sb5 = new StringBuilder(sb3);
                                p(sb5, f, sb4);
                                int v10 = v(sb5, f, a.UNKNOWN);
                                if (v10 != 4 && v10 != 2 && v10 != 5) {
                                    sb3 = sb5;
                                }
                            }
                            int length2 = sb3.length();
                            if (length2 >= 2) {
                                if (length2 <= 17) {
                                    if (sb3.length() > 1 && sb3.charAt(0) == '0') {
                                        gVar.f13348y = true;
                                        gVar.f13349z = true;
                                        int i13 = 1;
                                        while (i13 < sb3.length() - 1 && sb3.charAt(i13) == '0') {
                                            i13++;
                                        }
                                        if (i13 != 1) {
                                            gVar.A = true;
                                            gVar.B = i13;
                                        }
                                    }
                                    gVar.f13345v = Long.parseLong(sb3.toString());
                                    return gVar;
                                }
                                throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
                            }
                            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
                        }
                        throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
                    }
                    throw new NumberParseException(1, "Missing or invalid default region.");
                }
                throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
            }
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        throw new NumberParseException(2, "The phone number supplied was null.");
    }
}
