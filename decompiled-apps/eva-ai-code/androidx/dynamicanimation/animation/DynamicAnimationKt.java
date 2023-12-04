package androidx.dynamicanimation.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DynamicAnimation.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a(\u0010\b\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u001a2\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\f\u001a\u00020\u0004\u001a&\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0010H\u0086\b¨\u0006\u0011"}, d2 = {"createFloatValueHolder", "Landroidx/dynamicanimation/animation/FloatValueHolder;", "setter", "Lkotlin/Function1;", "", "", "getter", "Lkotlin/Function0;", "flingAnimationOf", "Landroidx/dynamicanimation/animation/FlingAnimation;", "springAnimationOf", "Landroidx/dynamicanimation/animation/SpringAnimation;", "finalPosition", "withSpringForceProperties", "func", "Landroidx/dynamicanimation/animation/SpringForce;", "Lkotlin/ExtensionFunctionType;", "dynamicanimation-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class DynamicAnimationKt {
    public static final FlingAnimation flingAnimationOf(Function1<? super Float, Unit> setter, Function0<Float> getter) {
        Intrinsics.checkParameterIsNotNull(setter, "setter");
        Intrinsics.checkParameterIsNotNull(getter, "getter");
        return new FlingAnimation(createFloatValueHolder(setter, getter));
    }

    public static /* synthetic */ SpringAnimation springAnimationOf$default(Function1 function1, Function0 function0, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = FloatCompanionObject.INSTANCE.getNaN();
        }
        return springAnimationOf(function1, function0, f);
    }

    public static final SpringAnimation springAnimationOf(Function1<? super Float, Unit> setter, Function0<Float> getter, float f) {
        Intrinsics.checkParameterIsNotNull(setter, "setter");
        Intrinsics.checkParameterIsNotNull(getter, "getter");
        FloatValueHolder createFloatValueHolder = createFloatValueHolder(setter, getter);
        if (Float.isNaN(f)) {
            return new SpringAnimation(createFloatValueHolder);
        }
        return new SpringAnimation(createFloatValueHolder, f);
    }

    public static final SpringAnimation withSpringForceProperties(SpringAnimation withSpringForceProperties, Function1<? super SpringForce, Unit> func) {
        Intrinsics.checkParameterIsNotNull(withSpringForceProperties, "$this$withSpringForceProperties");
        Intrinsics.checkParameterIsNotNull(func, "func");
        if (withSpringForceProperties.getSpring() == null) {
            withSpringForceProperties.setSpring(new SpringForce());
        }
        SpringForce spring = withSpringForceProperties.getSpring();
        Intrinsics.checkExpressionValueIsNotNull(spring, "spring");
        func.invoke(spring);
        return withSpringForceProperties;
    }

    private static final FloatValueHolder createFloatValueHolder(final Function1<? super Float, Unit> function1, final Function0<Float> function0) {
        return new FloatValueHolder() { // from class: androidx.dynamicanimation.animation.DynamicAnimationKt$createFloatValueHolder$1
            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public float getValue() {
                return ((Number) Function0.this.invoke()).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public void setValue(float f) {
                function1.invoke(Float.valueOf(f));
            }
        };
    }
}
