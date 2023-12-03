package com.android.volley.toolbox;

import android.util.Log;
import e4.a;
import e4.o;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
/* compiled from: HttpHeaderParser.java */
/* loaded from: classes.dex */
public final class e {
    public static a.C0214a a(e4.i iVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = iVar.f13770c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j10 = c(str);
        } else {
            j10 = 0;
        }
        String str2 = map.get("Cache-Control");
        int i6 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i6 < split.length) {
                String trim = split[i6].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i6++;
            }
            i6 = 1;
        } else {
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j13 = c(str3);
        } else {
            j13 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j14 = c(str4);
        } else {
            j14 = 0;
        }
        String str5 = map.get("ETag");
        if (i6 != 0) {
            j16 = currentTimeMillis + (j11 * 1000);
            if (z10) {
                j17 = j16;
            } else {
                Long.signum(j12);
                j17 = (j12 * 1000) + j16;
            }
            j15 = j17;
        } else {
            j15 = 0;
            if (j10 > 0 && j13 >= j10) {
                j16 = currentTimeMillis + (j13 - j10);
                j15 = j16;
            } else {
                j16 = 0;
            }
        }
        a.C0214a c0214a = new a.C0214a();
        c0214a.f13738a = iVar.f13769b;
        c0214a.f13739b = str5;
        c0214a.f = j16;
        c0214a.f13742e = j15;
        c0214a.f13740c = j10;
        c0214a.f13741d = j14;
        c0214a.f13743g = map;
        c0214a.f13744h = iVar.f13771d;
        return c0214a;
    }

    public static String b(String str, Map map) {
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i6 = 1; i6 < split.length; i6++) {
                String[] split2 = split[i6].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long c(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Log.e("Volley", o.a("Unable to parse dateStr: %s, falling back to 0", str), e10);
                return 0L;
            }
            o.d("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }
}
