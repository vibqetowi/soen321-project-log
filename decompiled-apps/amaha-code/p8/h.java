package p8;

import com.google.android.exoplayer2.n;
import java.util.List;
/* compiled from: SubtitleDecoderFactory.java */
/* loaded from: classes.dex */
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28014a = new a();

    /* compiled from: SubtitleDecoderFactory.java */
    /* loaded from: classes.dex */
    public class a implements h {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final g a(n nVar) {
            String str;
            char c10;
            String str2 = nVar.F;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1351681404:
                        if (str2.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1248334819:
                        if (str2.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1026075066:
                        if (str2.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1004728940:
                        if (str2.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 691401887:
                        if (str2.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 822864842:
                        if (str2.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 930165504:
                        if (str2.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1201784583:
                        if (str2.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1566015601:
                        if (str2.equals("application/cea-608")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1566016562:
                        if (str2.equals("application/cea-708")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1668750253:
                        if (str2.equals("application/x-subrip")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1693976202:
                        if (str2.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                int i6 = nVar.X;
                List<byte[]> list = nVar.H;
                switch (c10) {
                    case 0:
                        return new r8.a(list);
                    case 1:
                        return new s8.a();
                    case 2:
                        return new y8.a();
                    case 3:
                        return new y8.f();
                    case 4:
                        return new x8.a(list);
                    case 5:
                        return new u8.a(list);
                    case 6:
                    case '\b':
                        return new q8.a(str2, i6);
                    case 7:
                        return new c();
                    case '\t':
                        return new q8.b(i6, list);
                    case '\n':
                        return new v8.a();
                    case 11:
                        return new w8.c();
                }
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Attempted to create decoder for unsupported MIME type: ".concat(valueOf);
            } else {
                str = new String("Attempted to create decoder for unsupported MIME type: ");
            }
            throw new IllegalArgumentException(str);
        }

        public final boolean b(n nVar) {
            String str = nVar.F;
            if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
                return false;
            }
            return true;
        }
    }
}
