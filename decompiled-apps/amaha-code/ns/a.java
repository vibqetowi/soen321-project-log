package ns;

import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ns.f;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class a implements ls.d<Object>, d, Serializable {
    private final ls.d<Object> completion;

    public a(ls.d<Object> dVar) {
        this.completion = dVar;
    }

    public ls.d<k> create(ls.d<?> completion) {
        kotlin.jvm.internal.i.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ls.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final ls.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i6;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                i6 = i10 - 1;
            } catch (Exception unused) {
                i6 = -1;
            }
            if (i6 >= 0) {
                i11 = eVar.l()[i6];
            }
            f.a aVar = f.f26777b;
            f.a aVar2 = f.f26776a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(SessionManager.KEY_NAME, new Class[0]));
                    f.f26777b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f26777b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f26778a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f26779b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f26780c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ls.d
    public final void resumeWith(Object obj) {
        ls.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            ls.d dVar2 = aVar.completion;
            kotlin.jvm.internal.i.d(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == ms.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = sp.b.j(th2);
            }
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ls.d<k> create(Object obj, ls.d<?> completion) {
        kotlin.jvm.internal.i.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
