package androidx.databinding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
/* loaded from: classes3.dex */
public @interface InverseBindingAdapter {
    String attribute();

    String event() default "";
}
