package bt;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes2.dex */
public final class c extends k implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: u  reason: collision with root package name */
    public static final c f4687u = new c();

    public c() {
        super(1);
    }

    @Override // ss.l
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        String obj;
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        kotlin.jvm.internal.i.g(entry2, "entry");
        String key = entry2.getKey();
        Object value = entry2.getValue();
        if (value instanceof boolean[]) {
            obj = Arrays.toString((boolean[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof char[]) {
            obj = Arrays.toString((char[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof byte[]) {
            obj = Arrays.toString((byte[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof short[]) {
            obj = Arrays.toString((short[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof int[]) {
            obj = Arrays.toString((int[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof float[]) {
            obj = Arrays.toString((float[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof long[]) {
            obj = Arrays.toString((long[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof double[]) {
            obj = Arrays.toString((double[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else if (value instanceof Object[]) {
            obj = Arrays.toString((Object[]) value);
            kotlin.jvm.internal.i.f(obj, "toString(this)");
        } else {
            obj = value.toString();
        }
        return key + '=' + obj;
    }
}
