package bu;

import is.i;
import is.u;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import xs.e;
import xs.f;
/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes2.dex */
public final class a extends cu.a {
    public static final a f = new a(1, 0, 7);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: bu.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0098a {
        public static a a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            f fVar = new f(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(i.H1(fVar, 10));
            e it = fVar.iterator();
            while (it.f38001w) {
                it.nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] H2 = u.H2(arrayList);
            return new a(Arrays.copyOf(H2, H2.length));
        }
    }

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        kotlin.jvm.internal.i.g(numbers, "numbers");
    }
}
