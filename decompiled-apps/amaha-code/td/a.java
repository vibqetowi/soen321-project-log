package td;

import d9.p;
/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final qd.a f32991b = new qd.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f32992c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    public static final String f32993d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final p f32994e = new p(19);

    /* renamed from: a  reason: collision with root package name */
    public final b f32995a;

    public a(b bVar) {
        this.f32995a = bVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i6 = 0; i6 < str.length(); i6++) {
                sb2.append(str.charAt(i6));
                if (str2.length() > i6) {
                    sb2.append(str2.charAt(i6));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
