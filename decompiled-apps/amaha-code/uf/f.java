package uf;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class f implements l<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Constructor f34060u;

    public f(Constructor constructor) {
        this.f34060u = constructor;
    }

    @Override // uf.l
    public final Object i() {
        Constructor constructor = this.f34060u;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e12.getTargetException());
        }
    }
}
