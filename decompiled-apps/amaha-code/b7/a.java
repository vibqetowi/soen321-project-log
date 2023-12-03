package b7;

import d7.l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import kc.f;
/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f3948c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<a7.b> f3949d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f3950e;
    public static final a f;

    /* renamed from: a  reason: collision with root package name */
    public final String f3951a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3952b;

    static {
        String O = f.O("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f3948c = O;
        String O2 = f.O("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String O3 = f.O("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3949d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new a7.b("proto"), new a7.b("json"))));
        f3950e = new a(O, null);
        f = new a(O2, O3);
    }

    public a(String str, String str2) {
        this.f3951a = str;
        this.f3952b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f3951a;
        String str2 = this.f3952b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
