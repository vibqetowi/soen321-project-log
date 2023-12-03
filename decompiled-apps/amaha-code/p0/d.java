package p0;

import android.content.pm.ResolveInfo;
import b9.s;
import com.google.android.exoplayer2.ui.d;
import java.io.File;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import je.m0;
import ke.l;
import pd.b0;
import q8.b;
import y8.e;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27828u;

    public /* synthetic */ d(int i6) {
        this.f27828u = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27828u) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b10 = bArr[i6];
                    byte b11 = bArr2[i6];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                ResolveInfo resolveInfo = (ResolveInfo) obj2;
                String str = ((ResolveInfo) obj).activityInfo.packageName;
                if (str.contains("photo") || str.contains("gallery") || str.contains("album") || str.contains("media")) {
                    return -1;
                }
                return 0;
            case 2:
                y5.a aVar = (y5.a) obj;
                y5.a o22 = (y5.a) obj2;
                AtomicBoolean atomicBoolean = z5.c.f39196a;
                if (b6.a.b(z5.c.class)) {
                    return 0;
                }
                try {
                    kotlin.jvm.internal.i.f(o22, "o2");
                    return aVar.a(o22);
                } catch (Throwable th2) {
                    b6.a.a(z5.c.class, th2);
                    return 0;
                }
            case 3:
                y5.a o23 = (y5.a) obj2;
                kotlin.jvm.internal.i.f(o23, "o2");
                return ((y5.a) obj).a(o23);
            case 4:
                c6.a aVar2 = (c6.a) obj;
                c6.a o24 = (c6.a) obj2;
                kotlin.jvm.internal.i.f(o24, "o2");
                aVar2.getClass();
                Long l2 = aVar2.f4991c;
                if (l2 == null) {
                    return -1;
                }
                long longValue = l2.longValue();
                Long l10 = o24.f4991c;
                if (l10 == null) {
                    return 1;
                }
                return kotlin.jvm.internal.i.j(l10.longValue(), longValue);
            case 5:
            case 26:
            default:
                SecureRandom secureRandom = oe.n.f27432a;
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 6:
                return Integer.compare(((b.a) obj2).f29366b, ((b.a) obj).f29366b);
            case 7:
                return Integer.compare(((e.a) obj).f38365a.f38368b, ((e.a) obj2).f38365a.f38368b);
            case 8:
                return Long.compare(((y8.d) obj).f38358b, ((y8.d) obj2).f38358b);
            case 9:
                return ((com.google.android.exoplayer2.n) obj2).B - ((com.google.android.exoplayer2.n) obj).B;
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = z8.c.f39273d;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 11:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                int[] iArr2 = z8.c.f39273d;
                return 0;
            case 12:
                d.b bVar = (d.b) obj;
                d.b bVar2 = (d.b) obj2;
                int compare = Integer.compare(bVar2.f7131b, bVar.f7131b);
                if (compare == 0) {
                    int compareTo = bVar.f7132c.compareTo(bVar2.f7132c);
                    if (compareTo == 0) {
                        return bVar.f7133d.compareTo(bVar2.f7133d);
                    }
                    return compareTo;
                }
                return compare;
            case 13:
                d.b bVar3 = (d.b) obj;
                d.b bVar4 = (d.b) obj2;
                int compare2 = Integer.compare(bVar4.f7130a, bVar3.f7130a);
                if (compare2 == 0) {
                    int compareTo2 = bVar4.f7132c.compareTo(bVar3.f7132c);
                    if (compareTo2 == 0) {
                        return bVar4.f7133d.compareTo(bVar3.f7133d);
                    }
                    return compareTo2;
                }
                return compare2;
            case 14:
                return ((s.a) obj).f4209a - ((s.a) obj2).f4209a;
            case 15:
                return Float.compare(((s.a) obj).f4211c, ((s.a) obj2).f4211c);
            case 16:
                return ((b0.c) obj).a().compareTo(((b0.c) obj2).a());
            case 17:
                Charset charset = sd.a.f31452d;
                String name = ((File) obj).getName();
                int i10 = sd.a.f31453e;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 18:
                Charset charset2 = sd.a.f31452d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 19:
                je.c cVar = (je.c) obj;
                je.c cVar2 = (je.c) obj2;
                int compareTo3 = cVar.f21804a.compareTo(cVar2.f21804a);
                if (compareTo3 == 0) {
                    return oe.n.d(cVar.f21805b, cVar2.f21805b);
                }
                return compareTo3;
            case 20:
                je.c cVar3 = (je.c) obj;
                je.c cVar4 = (je.c) obj2;
                int d10 = oe.n.d(cVar3.f21805b, cVar4.f21805b);
                if (d10 == 0) {
                    return cVar3.f21804a.compareTo(cVar4.f21804a);
                }
                return d10;
            case 21:
                return ((Long) obj2).compareTo((Long) obj);
            case 22:
                ke.l lVar = (ke.l) obj;
                ke.l lVar2 = (ke.l) obj2;
                byte[] bArr3 = m0.f21870k;
                int compare3 = Long.compare(lVar.e().b(), lVar2.e().b());
                if (compare3 == 0) {
                    return lVar.b().compareTo(lVar2.b());
                }
                return compare3;
            case 23:
                return oe.n.d(((le.g) obj).f24218a, ((le.g) obj2).f24218a);
            case 24:
                return ((ke.g) obj).getKey().compareTo(((ke.g) obj2).getKey());
            case 25:
                return ((ke.i) obj).compareTo((ke.i) obj2);
            case 27:
                return l.a.f((ke.n) obj).d(l.a.f((ke.n) obj2));
            case 28:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
