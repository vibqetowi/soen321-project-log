package da;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: da.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0186a extends ja.a implements a {
        public AbstractBinderC0186a() {
            super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        }

        public static a X1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new c(iBinder);
        }
    }
}
