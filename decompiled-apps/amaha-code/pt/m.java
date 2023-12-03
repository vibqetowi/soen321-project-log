package pt;
/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes2.dex */
public final class m {
    public static /* synthetic */ void a(int i6) {
        Object[] objArr = new Object[3];
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                objArr[0] = "propertyDescriptor";
            } else {
                objArr[0] = "memberDescriptor";
            }
        } else {
            objArr[0] = "companionObject";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                } else {
                    objArr[2] = "hasJvmFieldAnnotation";
                }
            } else {
                objArr[2] = "isMappedIntrinsicCompanionObject";
            }
        } else {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
