package g8;

import androidx.work.k;
import com.google.android.exoplayer2.n;
import l8.g;
/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16379a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    /* loaded from: classes.dex */
    public class a implements c {
        @Override // g8.c
        public final boolean a(n nVar) {
            String str = nVar.F;
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                return false;
            }
            return true;
        }

        @Override // g8.c
        public final k b(n nVar) {
            String str;
            String str2 = nVar.F;
            if (str2 != null) {
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1354451219:
                        if (str2.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str2.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str2.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str2.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str2.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new h8.b();
                    case 1:
                        return new k8.a();
                    case 2:
                        return new g(null);
                    case 3:
                        return new i8.b();
                    case 4:
                        return new n8.c();
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
    }

    boolean a(n nVar);

    k b(n nVar);
}
