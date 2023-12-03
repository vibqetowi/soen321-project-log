package hd;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements re.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17410b;

    public /* synthetic */ d(int i6, Object obj) {
        this.f17409a = i6;
        this.f17410b = obj;
    }

    @Override // re.b
    public final Object get() {
        int i6 = this.f17409a;
        Object obj = this.f17410b;
        switch (i6) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e10);
                } catch (InstantiationException e11) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e11);
                } catch (NoSuchMethodException e12) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e13);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = se.c.f31470m;
                return new ue.b((sc.e) obj);
        }
    }
}
