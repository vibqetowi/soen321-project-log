package y7;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import y7.b;
/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f38333a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f38334b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f38335c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r9 == (-1)) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(String str) {
        boolean z10;
        long j10;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (sc.b.R(newPullParser, "x:xmpmeta")) {
            s.b bVar = s.f9446v;
            l0 l0Var = l0.f9412y;
            long j11 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (sc.b.R(newPullParser, "rdf:Description")) {
                    String[] strArr = f38333a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= 4) {
                            break;
                        }
                        String J = sc.b.J(newPullParser, strArr[i6]);
                        if (J != null) {
                            if (Integer.parseInt(J) == 1) {
                                z10 = true;
                            }
                        } else {
                            i6++;
                        }
                    }
                    z10 = false;
                    if (!z10) {
                        return null;
                    }
                    String[] strArr2 = f38334b;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String J2 = sc.b.J(newPullParser, strArr2[i10]);
                        if (J2 != null) {
                            j10 = Long.parseLong(J2);
                        } else {
                            i10++;
                        }
                    }
                    j10 = -9223372036854775807L;
                    String[] strArr3 = f38335c;
                    int i11 = 0;
                    while (true) {
                        if (i11 < 2) {
                            String J3 = sc.b.J(newPullParser, strArr3[i11]);
                            if (J3 != null) {
                                l0Var = s.v(new b.a(0L, "image/jpeg", 0L), new b.a(Long.parseLong(J3), "video/mp4", 0L));
                                break;
                            }
                            i11++;
                        } else {
                            s.b bVar2 = s.f9446v;
                            l0Var = l0.f9412y;
                            break;
                        }
                    }
                    j11 = j10;
                } else if (sc.b.R(newPullParser, "Container:Directory")) {
                    l0Var = b(newPullParser, "Container", "Item");
                } else if (sc.b.R(newPullParser, "GContainer:Directory")) {
                    l0Var = b(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!sc.b.P(newPullParser, "x:xmpmeta"));
            if (l0Var.isEmpty()) {
                return null;
            }
            return new b(j11, l0Var);
        }
        throw ParserException.a("Couldn't find xmp metadata", null);
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        s.b bVar = s.f9446v;
        s.a aVar = new s.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (sc.b.R(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String J = sc.b.J(xmlPullParser, concat3);
                String J2 = sc.b.J(xmlPullParser, concat4);
                String J3 = sc.b.J(xmlPullParser, concat5);
                String J4 = sc.b.J(xmlPullParser, concat6);
                if (J != null && J2 != null) {
                    if (J3 != null) {
                        j10 = Long.parseLong(J3);
                    } else {
                        j10 = 0;
                    }
                    if (J4 != null) {
                        j11 = Long.parseLong(J4);
                    } else {
                        j11 = 0;
                    }
                    aVar.b(new b.a(j10, J, j11));
                } else {
                    return l0.f9412y;
                }
            }
        } while (!sc.b.P(xmlPullParser, concat2));
        return aVar.c();
    }
}
