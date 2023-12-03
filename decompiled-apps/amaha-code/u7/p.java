package u7;

import g8.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f33897c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f33898a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f33899b = -1;

    public final boolean a(String str) {
        Matcher matcher = f33897c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i6 = c9.w.f5205a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f33898a = parseInt;
                    this.f33899b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(g8.a aVar) {
        int i6 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f16378u;
            if (i6 < bVarArr.length) {
                a.b bVar = bVarArr[i6];
                if (bVar instanceof l8.e) {
                    l8.e eVar = (l8.e) bVar;
                    if ("iTunSMPB".equals(eVar.f24119w) && a(eVar.f24120x)) {
                        return;
                    }
                } else if (bVar instanceof l8.i) {
                    l8.i iVar = (l8.i) bVar;
                    if ("com.apple.iTunes".equals(iVar.f24131v) && "iTunSMPB".equals(iVar.f24132w) && a(iVar.f24133x)) {
                        return;
                    }
                } else {
                    continue;
                }
                i6++;
            } else {
                return;
            }
        }
    }
}
