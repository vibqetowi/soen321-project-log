package uf;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class d implements l<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final androidx.work.k f34054u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Class f34055v;

    public d(Class cls) {
        androidx.work.k pVar;
        this.f34055v = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            pVar = new m(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    pVar = new n(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    pVar = new p();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                pVar = new o(declaredMethod3);
            }
        }
        this.f34054u = pVar;
    }

    @Override // uf.l
    public final Object i() {
        Class cls = this.f34055v;
        try {
            return this.f34054u.x(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }
}
