package qu;

import kotlin.jvm.internal.i;
import wu.b0;
/* compiled from: ContextReceiver.kt */
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f30137c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f30138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gt.a declarationDescriptor, b0 receiverType, d dVar, int i6) {
        super(receiverType, dVar);
        this.f30137c = i6;
        if (i6 != 1) {
            i.g(declarationDescriptor, "declarationDescriptor");
            i.g(receiverType, "receiverType");
            this.f30138d = declarationDescriptor;
        } else if (declarationDescriptor == null) {
            c(0);
            throw null;
        } else if (receiverType != null) {
            super(receiverType, dVar);
            this.f30138d = declarationDescriptor;
        } else {
            c(1);
            throw null;
        }
    }

    public static /* synthetic */ void c(int i6) {
        String str;
        int i10;
        if (i6 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 2) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    objArr[0] = "callableDescriptor";
                } else {
                    objArr[0] = "newType";
                }
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
            }
        } else {
            objArr[0] = "receiverType";
        }
        if (i6 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i6 != 2) {
            if (i6 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i6 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final String toString() {
        Object obj = this.f30138d;
        switch (this.f30137c) {
            case 0:
                return "Cxt { " + ((gt.a) obj) + " }";
            case 1:
                return a() + ": Ext {" + ((gt.a) obj) + "}";
            default:
                return a() + ": Ctx { " + ((gt.e) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gt.e classDescriptor, b0 receiverType) {
        super(receiverType, null);
        this.f30137c = 2;
        i.g(classDescriptor, "classDescriptor");
        i.g(receiverType, "receiverType");
        this.f30138d = classDescriptor;
    }
}
