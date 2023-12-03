package da;

import android.os.IBinder;
import da.a;
import java.lang.reflect.Field;
import v9.o;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0186a {

    /* renamed from: b  reason: collision with root package name */
    public final Object f12717b;

    public b(Object obj) {
        this.f12717b = obj;
    }

    public static <T> T Y1(a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).f12717b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i6 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 == 1) {
            o.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
                } catch (NullPointerException e11) {
                    throw new IllegalArgumentException("Binder object is null.", e11);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(defpackage.c.p("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }
}
