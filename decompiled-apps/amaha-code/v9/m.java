package v9;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f34923a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f34924b;

        public /* synthetic */ a(Object obj) {
            o.h(obj);
            this.f34924b = obj;
            this.f34923a = new ArrayList();
        }

        public final void a(Object obj, String str) {
            ArrayList arrayList = this.f34923a;
            String valueOf = String.valueOf(obj);
            arrayList.add(str + "=" + valueOf);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f34924b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f34923a;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb2.append((String) arrayList.get(i6));
                if (i6 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
